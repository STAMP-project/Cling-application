import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test00601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00601");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = jSTypeRegistry1.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable19 = node18.children();
        boolean boolean20 = node18.isQuotedString();
        com.google.javascript.rhino.Node node21 = node18.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry13.createFunctionType(jSType14, node21);
        boolean boolean23 = functionType22.isArrayType();
        boolean boolean24 = functionType22.isRegexpType();
        com.google.javascript.rhino.jstype.ObjectType objectType25 = functionType22.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable26 = functionType22.getAllImplementedInterfaces();
        boolean boolean28 = jSTypeRegistry1.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) functionType22, "NUMBER 0.0 36\n");
        com.google.javascript.rhino.jstype.ObjectType objectType29 = functionType22.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType jSType30 = objectType29.unboxesTo();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeIterable19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objectType29);
        org.junit.Assert.assertNull(jSType30);
    }

    @Test
    public void test00602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00602");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType3 = jSTypeRegistry1.getType("hi!");
        boolean boolean5 = jSTypeRegistry1.isForwardDeclaredType("JSDocInfo");
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable16 = node15.children();
        boolean boolean17 = node15.isQuotedString();
        com.google.javascript.rhino.Node node18 = node15.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType19 = jSTypeRegistry10.createFunctionType(jSType11, node18);
        boolean boolean20 = functionType19.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList21 = functionType19.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable29 = node28.children();
        boolean boolean30 = node28.isQuotedString();
        com.google.javascript.rhino.Node node31 = node28.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry23.createFunctionType(jSType24, node31);
        boolean boolean33 = functionType32.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray34 = new com.google.javascript.rhino.jstype.JSType[] { functionType19, functionType32 };
        com.google.javascript.rhino.jstype.JSType jSType35 = jSTypeRegistry8.createUnionType(jSTypeArray34);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope36 = null;
        com.google.javascript.rhino.jstype.JSType jSType41 = jSTypeRegistry8.getType(jSTypeStaticScope36, "[10, 0]", "", (int) (byte) 1, (int) (byte) 10);
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable49 = node48.children();
        boolean boolean50 = node48.isQuotedString();
        com.google.javascript.rhino.Node node51 = node48.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType52 = jSTypeRegistry43.createFunctionType(jSType44, node51);
        boolean boolean53 = functionType52.isArrayType();
        boolean boolean54 = jSType41.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType52);
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType55 = functionType52.toMaybeParameterizedType();
        boolean boolean57 = functionType52.isPropertyTypeInferred("Unknown class name");
        boolean boolean58 = jSTypeRegistry1.declareType("hi!", (com.google.javascript.rhino.jstype.JSType) functionType52);
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node((int) 'a', 29, 49);
        node63.setIsSyntheticBlock(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType66 = jSTypeRegistry1.createInterfaceType("function ({95400268}): {95400268}", node63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeIterable16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(functionType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(functionTypeList21);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(nodeIterable29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(jSTypeArray34);
        org.junit.Assert.assertNotNull(jSType35);
        org.junit.Assert.assertNotNull(jSType41);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(nodeIterable49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNotNull(functionType52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(parameterizedType55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test00603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00603");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean13 = functionType10.isPropertyTypeInferred("JSDocInfo");
        boolean boolean15 = functionType10.hasOwnProperty("");
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node22.children();
        boolean boolean24 = node22.isQuotedString();
        com.google.javascript.rhino.Node node25 = node22.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry17.createFunctionType(jSType18, node25);
        boolean boolean27 = functionType26.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType26.getPropertyType("InputId: hi!");
        boolean boolean30 = functionType10.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType26);
        boolean boolean31 = functionType10.isUnknownType();
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable39 = node38.children();
        boolean boolean40 = node38.isQuotedString();
        com.google.javascript.rhino.Node node41 = node38.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry33.createFunctionType(jSType34, node41);
        boolean boolean43 = functionType42.isArrayType();
        boolean boolean45 = functionType42.isPropertyTypeInferred("JSDocInfo");
        boolean boolean47 = functionType42.hasOwnProperty("");
        com.google.javascript.rhino.Node node48 = functionType42.getParametersNode();
        boolean boolean49 = functionType42.hasCachedValues();
        functionType10.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType42);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable51 = functionType10.getAllImplementedInterfaces();
        boolean boolean52 = functionType10.matchesNumberContext();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53);
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable60 = node59.children();
        boolean boolean61 = node59.isQuotedString();
        com.google.javascript.rhino.Node node62 = node59.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry54.createFunctionType(jSType55, node62);
        boolean boolean64 = functionType63.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType66 = functionType63.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType67 = functionType63.toMaybeFunctionType();
        boolean boolean69 = functionType67.removeProperty("hi!");
        boolean boolean70 = functionType67.matchesStringContext();
        functionType10.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType67);
        boolean boolean73 = functionType67.hasProperty("InputId: hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType74 = functionType67.dereference();
        boolean boolean75 = functionType67.canBeCalled();
        boolean boolean76 = functionType67.isObject();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeIterable23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(nodeIterable39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(nodeIterable60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(jSType66);
        org.junit.Assert.assertNotNull(functionType67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(objectType74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test00604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00604");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("", jSTypeNative1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int8 = node7.getSourceOffset();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable13 = node12.children();
        node7.addChildrenToBack(node12);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int19 = node18.getSourceOffset();
        com.google.javascript.rhino.Node node20 = node7.useSourceInfoIfMissingFrom(node18);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(10, node7, 49, (int) (short) 100);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean26 = node23.isEquivalentTo(node25);
        boolean boolean27 = node23.isSwitch();
        com.google.javascript.rhino.Node node28 = assertionFunctionSpec2.getAssertedParam(node23);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int33 = node32.getSourceOffset();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable38 = node37.children();
        node32.addChildrenToBack(node37);
        boolean boolean40 = node37.isGetElem();
        int int41 = node37.getType();
        com.google.javascript.rhino.jstype.JSType jSType42 = node37.getJSType();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable48 = node47.children();
        node47.setSourceFileForTesting("[10, 0]");
        node47.setVarArgs(true);
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable57 = node56.children();
        boolean boolean58 = node56.isQuotedString();
        node56.setLength(0);
        boolean boolean61 = node56.isVar();
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int66 = node65.getSourceOffset();
        boolean boolean67 = node65.isDo();
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int72 = node71.getSourceOffset();
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable77 = node76.children();
        node71.addChildrenToBack(node76);
        node71.detachChildren();
        node71.setLineno(16);
        boolean boolean82 = node71.isSwitch();
        com.google.javascript.rhino.Node node87 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node88 = new com.google.javascript.rhino.Node(39, node87);
        boolean boolean89 = node88.isIf();
        node88.detachChildren();
        boolean boolean91 = node71.hasChild(node88);
        boolean boolean92 = node71.isDebugger();
        com.google.javascript.rhino.Node node95 = new com.google.javascript.rhino.Node(52, node47, node56, node65, node71, (int) '#', (-1));
        com.google.javascript.rhino.Node node96 = node37.copyInformationFromForTree(node47);
        boolean boolean97 = node37.isAssignAdd();
        com.google.javascript.rhino.Node node98 = assertionFunctionSpec2.getAssertedParam(node37);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder99 = node37.new FileLevelJsDocBuilder();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeIterable13);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(nodeIterable38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 39 + "'", int41 == 39);
        org.junit.Assert.assertNull(jSType42);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(nodeIterable48);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(nodeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertNotNull(nodeIterable77);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(node96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNotNull(node98);
    }

    @Test
    public void test00605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00605");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("function (...[?]): ?", 1, (-1));
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean9 = node8.hasOneChild();
        boolean boolean10 = node8.isOnlyModifiesThisCall();
        boolean boolean11 = node8.isLabel();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable16 = node15.children();
        boolean boolean17 = node15.isQuotedString();
        node15.setLength(0);
        boolean boolean20 = node15.isNew();
        com.google.javascript.rhino.Node[] nodeArray21 = new com.google.javascript.rhino.Node[] { node4, node8, node15 };
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(2, nodeArray21);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int27 = node26.getSourceOffset();
        java.lang.String str28 = node26.getQualifiedName();
        boolean boolean29 = node26.isHook();
        int int30 = node26.getSourcePosition();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "Not declared as a type name");
        // The following exception was thrown during execution in test generation
        try {
            node22.addChildrenAfter(node26, node33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeIterable16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(nodeArray21);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 147456 + "'", int30 == 147456);
        org.junit.Assert.assertNotNull(node33);
    }

    @Test
    public void test00606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00606");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo1.getTypedefType();
        java.lang.String str6 = jSDocInfo1.getLicense();
        java.lang.String str7 = jSDocInfo1.getLicense();
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00607");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(39, node4);
        boolean boolean6 = node5.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newExpr(node5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = node5.getString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Number node not created with Node.newNumber");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test00608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00608");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean12 = functionType10.isRegexpType();
        boolean boolean14 = functionType10.isPropertyTypeDeclared("InputId: hi!");
        int int15 = functionType10.getPropertiesCount();
        boolean boolean16 = functionType10.isInterface();
        com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> jSTypePredicate17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = functionType10.setValidator(jSTypePredicate17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00609");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int6 = node5.getSourceOffset();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable11 = node10.children();
        node5.addChildrenToBack(node10);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int17 = node16.getSourceOffset();
        com.google.javascript.rhino.Node node18 = node5.useSourceInfoIfMissingFrom(node16);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(10, node5, 49, (int) (short) 100);
        boolean boolean22 = node5.isComma();
        boolean boolean23 = node5.isAssignAdd();
        boolean boolean24 = node5.isQualifiedName();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean29 = node28.hasOneChild();
        node28.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable32 = node28.getAncestors();
        int int33 = node28.getChildCount();
        java.lang.String str34 = node28.toString();
        com.google.javascript.rhino.Node node35 = node5.useSourceInfoIfMissingFromForTree(node28);
        com.google.javascript.rhino.Node node36 = node5.getNext();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable41 = node40.children();
        boolean boolean42 = node40.isQuotedString();
        node40.setLength(0);
        boolean boolean45 = node40.isVar();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean50 = node49.hasOneChild();
        node40.addChildToBack(node49);
        node49.detachChildren();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder53 = node49.new FileLevelJsDocBuilder();
        node49.setIsSyntheticBlock(true);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(100, 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node(45, node36, node49, node59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeIterable11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(ancestorIterable32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "NUMBER 0.0 36" + "'", str34, "NUMBER 0.0 36");
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(nodeIterable41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test00610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00610");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType10.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType14 = functionType10.toMaybeFunctionType();
        boolean boolean15 = functionType14.isNullable();
        java.util.Set<java.lang.String> strSet16 = functionType14.getOwnPropertyNames();
        java.util.Spliterator<java.lang.String> strSpliterator17 = strSet16.spliterator();
        com.google.common.collect.ImmutableList<java.lang.Object> objList20 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray21 = objList20.toArray();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable29 = node28.children();
        boolean boolean30 = node28.isQuotedString();
        com.google.javascript.rhino.Node node31 = node28.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry23.createFunctionType(jSType24, node31);
        boolean boolean33 = functionType32.isArrayType();
        boolean boolean34 = functionType32.isRegexpType();
        com.google.javascript.rhino.jstype.JSType jSType36 = functionType32.findPropertyType("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot38 = functionType32.getOwnSlot("hi!");
        boolean boolean39 = objList20.contains((java.lang.Object) "hi!");
        boolean boolean40 = strSet16.removeAll((java.util.Collection<java.lang.Object>) objList20);
        java.util.Spliterator<java.lang.String> strSpliterator41 = strSet16.spliterator();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertNotNull(objList20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10, 0]");
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(nodeIterable29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(jSType36);
        org.junit.Assert.assertNull(jSTypeStaticSlot38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strSpliterator41);
    }

    @Test
    public void test00611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00611");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getEnumParameterType();
        boolean boolean3 = jSDocInfo0.isExterns();
        boolean boolean4 = jSDocInfo0.isIdGenerator();
        boolean boolean5 = jSDocInfo0.isDeprecated();
        com.google.common.collect.ImmutableList<java.lang.String> strList6 = jSDocInfo0.getTemplateTypeNames();
        boolean boolean7 = jSDocInfo0.hasModifies();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jSTypeExpression2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00612");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getEnumParameterType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jSTypeExpression2);
    }

    @Test
    public void test00613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00613");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean4 = node3.hasOneChild();
        int int5 = node3.getCharno();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(39, node10);
        boolean boolean12 = node11.isIf();
        node11.detachChildren();
        com.google.javascript.rhino.Node node14 = null;
        node3.addChildrenAfter(node11, node14);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable16 = node3.siblings();
        java.util.Spliterator<com.google.javascript.rhino.Node> nodeSpliterator17 = nodeIterable16.spliterator();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(nodeIterable16);
        org.junit.Assert.assertNotNull(nodeSpliterator17);
    }

    @Test
    public void test00614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00614");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        boolean boolean10 = node8.isQuotedString();
        com.google.javascript.rhino.Node node11 = node8.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry3.createFunctionType(jSType4, node11);
        boolean boolean13 = functionType12.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList14 = functionType12.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.children();
        boolean boolean23 = node21.isQuotedString();
        com.google.javascript.rhino.Node node24 = node21.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry16.createFunctionType(jSType17, node24);
        boolean boolean26 = functionType25.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] { functionType12, functionType25 };
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry1.createUnionType(jSTypeArray27);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope29 = null;
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry1.getType(jSTypeStaticScope29, "[10, 0]", "", (int) (byte) 1, (int) (byte) 10);
        com.google.javascript.rhino.jstype.JSType jSType36 = jSTypeRegistry1.getType("");
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable45 = node44.children();
        boolean boolean46 = node44.isQuotedString();
        com.google.javascript.rhino.Node node47 = node44.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry39.createFunctionType(jSType40, node47);
        com.google.javascript.rhino.jstype.JSType jSType50 = jSTypeRegistry39.getType("");
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51);
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable58 = node57.children();
        boolean boolean59 = node57.isQuotedString();
        com.google.javascript.rhino.Node node60 = node57.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType61 = jSTypeRegistry52.createFunctionType(jSType53, node60);
        boolean boolean62 = functionType61.isArrayType();
        java.lang.String str63 = functionType61.toAnnotationString();
        boolean boolean64 = functionType61.isStringObjectType();
        com.google.javascript.rhino.jstype.JSType jSType66 = jSTypeRegistry39.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType) functionType61, "NUMBER 0.0 36");
        boolean boolean68 = functionType61.isPropertyInExterns("JSDocInfo");
        com.google.javascript.rhino.Node node69 = functionType61.getParametersNode();
        jSTypeRegistry1.unregisterPropertyOnType("function ({1702558995}): {1702558995}", (com.google.javascript.rhino.jstype.JSType) functionType61);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative71 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType72 = jSTypeRegistry1.getNativeObjectType(jSTypeNative71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(functionTypeList14);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertNull(jSType36);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(nodeIterable45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNotNull(functionType48);
        org.junit.Assert.assertNull(jSType50);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(nodeIterable58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertNotNull(functionType61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "function (...[?]): ?" + "'", str63, "function (...[?]): ?");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(jSType66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(node69);
    }

    @Test
    public void test00615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00615");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean13 = functionType10.isPropertyTypeInferred("JSDocInfo");
        boolean boolean15 = functionType10.hasOwnProperty("");
        com.google.javascript.rhino.Node node16 = functionType10.getParametersNode();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression18 = new com.google.javascript.rhino.JSTypeExpression(node16, "hi!");
        boolean boolean19 = jSTypeExpression18.isOptionalArg();
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable27 = node26.children();
        boolean boolean28 = node26.isQuotedString();
        com.google.javascript.rhino.Node node29 = node26.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry21.createFunctionType(jSType22, node29);
        com.google.javascript.rhino.jstype.JSType jSType32 = jSTypeRegistry21.getType("");
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable40 = node39.children();
        boolean boolean41 = node39.isQuotedString();
        com.google.javascript.rhino.Node node42 = node39.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType43 = jSTypeRegistry34.createFunctionType(jSType35, node42);
        boolean boolean44 = functionType43.isArrayType();
        java.lang.String str45 = functionType43.toAnnotationString();
        boolean boolean46 = functionType43.isStringObjectType();
        com.google.javascript.rhino.jstype.JSType jSType48 = jSTypeRegistry21.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType) functionType43, "NUMBER 0.0 36");
        jSTypeRegistry21.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50);
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable57 = node56.children();
        boolean boolean58 = node56.isQuotedString();
        com.google.javascript.rhino.Node node59 = node56.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry51.createFunctionType(jSType52, node59);
        com.google.javascript.rhino.jstype.FunctionType functionType61 = functionType60.toMaybeFunctionType();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection62 = jSTypeRegistry21.getDirectImplementors((com.google.javascript.rhino.jstype.ObjectType) functionType61);
        boolean boolean64 = functionType61.hasProperty("NUMBER 0.0 16");
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65);
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable72 = node71.children();
        boolean boolean73 = node71.isQuotedString();
        com.google.javascript.rhino.Node node74 = node71.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType75 = jSTypeRegistry66.createFunctionType(jSType67, node74);
        com.google.javascript.rhino.jstype.JSType jSType77 = jSTypeRegistry66.getType("");
        com.google.javascript.rhino.ErrorReporter errorReporter78 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry79 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter78);
        com.google.javascript.rhino.jstype.JSType jSType80 = null;
        com.google.javascript.rhino.Node node84 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable85 = node84.children();
        boolean boolean86 = node84.isQuotedString();
        com.google.javascript.rhino.Node node87 = node84.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType88 = jSTypeRegistry79.createFunctionType(jSType80, node87);
        boolean boolean89 = functionType88.isArrayType();
        java.lang.String str90 = functionType88.toAnnotationString();
        boolean boolean91 = functionType88.isStringObjectType();
        com.google.javascript.rhino.jstype.JSType jSType93 = jSTypeRegistry66.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType) functionType88, "NUMBER 0.0 36");
        jSTypeRegistry66.clearTemplateTypeNames();
        jSTypeRegistry66.incrementGeneration();
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable97 = jSTypeRegistry66.getTypesWithProperty("(function ({1399396790}): {1399396790})");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType98 = jSTypeExpression18.evaluate((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType61, jSTypeRegistry66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unexpected node in type expression: PARAM_LIST");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(nodeIterable27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(functionType30);
        org.junit.Assert.assertNull(jSType32);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(nodeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(functionType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "function (...[?]): ?" + "'", str45, "function (...[?]): ?");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(jSType48);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(nodeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertNotNull(functionType61);
        org.junit.Assert.assertNotNull(functionTypeCollection62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(nodeIterable72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(node74);
        org.junit.Assert.assertNotNull(functionType75);
        org.junit.Assert.assertNull(jSType77);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertNotNull(nodeIterable85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNull(node87);
        org.junit.Assert.assertNotNull(functionType88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "function (...[?]): ?" + "'", str90, "function (...[?]): ?");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(jSType93);
        org.junit.Assert.assertNotNull(jSTypeIterable97);
    }

    @Test
    public void test00616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00616");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        boolean boolean10 = node8.isQuotedString();
        com.google.javascript.rhino.Node node11 = node8.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry3.createFunctionType(jSType4, node11);
        boolean boolean13 = functionType12.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList14 = functionType12.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.children();
        boolean boolean23 = node21.isQuotedString();
        com.google.javascript.rhino.Node node24 = node21.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry16.createFunctionType(jSType17, node24);
        boolean boolean26 = functionType25.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] { functionType12, functionType25 };
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry1.createUnionType(jSTypeArray27);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope29 = null;
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry1.getType(jSTypeStaticScope29, "[10, 0]", "", (int) (byte) 1, (int) (byte) 10);
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable42 = node41.children();
        boolean boolean43 = node41.isQuotedString();
        com.google.javascript.rhino.Node node44 = node41.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSTypeRegistry36.createFunctionType(jSType37, node44);
        boolean boolean46 = functionType45.isArrayType();
        boolean boolean47 = jSType34.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType45);
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = functionType45.toMaybeParameterizedType();
        boolean boolean50 = functionType45.isPropertyTypeInferred("Unknown class name");
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51);
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable58 = node57.children();
        boolean boolean59 = node57.isQuotedString();
        com.google.javascript.rhino.Node node60 = node57.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType61 = jSTypeRegistry52.createFunctionType(jSType53, node60);
        boolean boolean63 = functionType61.isPropertyTypeDeclared("");
        boolean boolean65 = functionType61.isPropertyInExterns("JSDocInfo");
        boolean boolean66 = functionType61.isRecordType();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair67 = functionType45.getTypesUnderEquality((com.google.javascript.rhino.jstype.JSType) functionType61);
        boolean boolean69 = functionType61.isPropertyInExterns("{1936444324}");
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70);
        com.google.javascript.rhino.jstype.JSType jSType72 = null;
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable77 = node76.children();
        boolean boolean78 = node76.isQuotedString();
        com.google.javascript.rhino.Node node79 = node76.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType80 = jSTypeRegistry71.createFunctionType(jSType72, node79);
        boolean boolean81 = functionType80.hasDisplayName();
        boolean boolean82 = functionType80.hasDisplayName();
        boolean boolean83 = functionType80.matchesInt32Context();
        com.google.javascript.rhino.ErrorReporter errorReporter84 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry85 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter84);
        com.google.javascript.rhino.jstype.JSType jSType86 = null;
        com.google.javascript.rhino.Node node90 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable91 = node90.children();
        boolean boolean92 = node90.isQuotedString();
        com.google.javascript.rhino.Node node93 = node90.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType94 = jSTypeRegistry85.createFunctionType(jSType86, node93);
        boolean boolean95 = functionType94.hasDisplayName();
        boolean boolean96 = functionType80.hasEqualCallType(functionType94);
        boolean boolean97 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) functionType61, (com.google.javascript.rhino.jstype.JSType) functionType80);
        boolean boolean99 = functionType61.removeProperty("[10, 0]");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(functionTypeList14);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(nodeIterable42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNotNull(functionType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(parameterizedType48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(nodeIterable58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertNotNull(functionType61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(typePair67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertNotNull(nodeIterable77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(node79);
        org.junit.Assert.assertNotNull(functionType80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertNotNull(nodeIterable91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNull(node93);
        org.junit.Assert.assertNotNull(functionType94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test00617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00617");
        java.io.IOException iOException1 = new java.io.IOException("InputId: NUMBER 0.0 36\n");
    }

    @Test
    public void test00618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00618");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        boolean boolean5 = node3.isQuotedString();
        node3.setLength(0);
        boolean boolean8 = node3.isScript();
        boolean boolean9 = node3.hasChildren();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType10 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable15 = node14.children();
        boolean boolean16 = node14.isQuotedString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression18 = new com.google.javascript.rhino.JSTypeExpression(node14, "hi!");
        boolean boolean19 = node14.isCatch();
        java.lang.String str20 = node14.getQualifiedName();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("{1936444324}", (int) ' ', (int) (short) 1);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship25 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType10, node14, node24);
        int int26 = node3.getIndexOfChild(node14);
        node14.setSourceFileForTesting("function ({95400268}): {95400268}");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeIterable15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test00619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00619");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor4 = objList2.listIterator();
        boolean boolean6 = objList2.contains((java.lang.Object) (short) 10);
        java.lang.Object obj7 = null;
        boolean boolean8 = objList2.equals(obj7);
        java.lang.String str9 = objList2.toString();
        java.lang.Object[] objArray19 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList20 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList20, objArray19);
        java.lang.Object[] objArray22 = objList20.toArray();
        java.util.stream.Stream<java.lang.Object> objStream23 = objList20.parallelStream();
        int int24 = objList20.size();
        boolean boolean25 = objList2.containsAll((java.util.Collection<java.lang.Object>) objList20);
        java.util.ListIterator<java.lang.Object> objItor26 = objList2.listIterator();
        java.util.stream.Stream<java.lang.Object> objStream27 = objList2.stream();
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable35 = node34.children();
        boolean boolean36 = node34.isQuotedString();
        com.google.javascript.rhino.Node node37 = node34.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry29.createFunctionType(jSType30, node37);
        boolean boolean39 = functionType38.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType41 = functionType38.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType42 = functionType38.toMaybeFunctionType();
        boolean boolean44 = functionType42.removeProperty("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable45 = functionType42.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType46 = functionType42.getParameterType();
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47);
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable54 = node53.children();
        boolean boolean55 = node53.isQuotedString();
        com.google.javascript.rhino.Node node56 = node53.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType57 = jSTypeRegistry48.createFunctionType(jSType49, node56);
        boolean boolean58 = functionType42.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType57);
        boolean boolean59 = functionType42.isNullable();
        com.google.javascript.rhino.jstype.JSType jSType61 = functionType42.getPropertyType("");
        boolean boolean62 = functionType42.isOrdinaryFunction();
        com.google.javascript.rhino.jstype.JSType jSType64 = functionType42.getPropertyType("function ({1265812580}): {1265812580}");
        int int65 = objList2.indexOf((java.lang.Object) functionType42);
        java.lang.Object obj67 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList2.add(48, obj67);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[10, 0]" + "'", str9, "[10, 0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objItor26);
        org.junit.Assert.assertNotNull(objStream27);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(nodeIterable35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jSType41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable45);
        org.junit.Assert.assertNull(jSType46);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(nodeIterable54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNotNull(functionType57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(jSType61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(jSType64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
    }

    @Test
    public void test00620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00620");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int1 = namePosition0.getPositionOnStartLine();
        int int2 = namePosition0.getPositionOnEndLine();
        int int3 = namePosition0.getPositionOnEndLine();
        // The following exception was thrown during execution in test generation
        try {
            namePosition0.setPositionInformation((int) '#', 46, 2, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 35?end-line: 2");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00621");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = functionType10.getOwnerFunction();
        boolean boolean12 = functionType10.isTemplateType();
        boolean boolean13 = functionType10.isStringObjectType();
        boolean boolean15 = functionType10.isPropertyTypeDeclared("hi!");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNull(functionType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00622");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean4 = node3.hasOneChild();
        node3.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable7 = node3.getAncestors();
        int int8 = node3.getChildCount();
        java.lang.String str9 = node3.toString();
        boolean boolean10 = node3.isQualifiedName();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = node3.getExistingIntProp((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 10");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(ancestorIterable7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "NUMBER 0.0 36" + "'", str9, "NUMBER 0.0 36");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00623");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet12 = functionType10.getPossibleToBooleanOutcomes();
        boolean boolean13 = functionType10.matchesObjectContext();
        boolean boolean15 = functionType10.removeProperty("Node tree inequality:\nTree1:\nNUMBER 0.0 36 [var_args_name: 1] [source_file: [10, 0]]\n\n\nTree2:\nSTRING {1936444324} 32\n\n\nSubtree1: NUMBER 0.0 36 [var_args_name: 1] [source_file: [10, 0]]\n\n\nSubtree2: STRING {1936444324} 32\n");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet12 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet12.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00624");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        boolean boolean5 = node3.isQuotedString();
        node3.setLength(0);
        boolean boolean8 = node3.isVar();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean13 = node12.hasOneChild();
        node3.addChildToBack(node12);
        node12.detachChildren();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder16 = node12.new FileLevelJsDocBuilder();
        node12.setDouble((double) 47);
        boolean boolean19 = node12.isThrow();
        boolean boolean20 = node12.isContinue();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00625");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet12 = functionType10.getPossibleToBooleanOutcomes();
        boolean boolean14 = functionType10.hasProperty("java.io.IOException: ");
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType18 = jSTypeRegistry16.getType("hi!");
        jSTypeRegistry16.setLastGeneration(true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node22 = jSTypeRegistry16.createParameters(jSTypeArray21);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (byte) 0);
        node25.setCharno((int) (short) 1);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable35 = node34.children();
        boolean boolean36 = node34.isQuotedString();
        com.google.javascript.rhino.Node node37 = node34.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry29.createFunctionType(jSType30, node37);
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry29.getType("");
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable48 = node47.children();
        boolean boolean49 = node47.isQuotedString();
        com.google.javascript.rhino.Node node50 = node47.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType51 = jSTypeRegistry42.createFunctionType(jSType43, node50);
        boolean boolean52 = functionType51.isArrayType();
        java.lang.String str53 = functionType51.toAnnotationString();
        boolean boolean54 = functionType51.isStringObjectType();
        com.google.javascript.rhino.jstype.JSType jSType56 = jSTypeRegistry29.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType) functionType51, "NUMBER 0.0 36");
        com.google.javascript.rhino.jstype.ObjectType objectType57 = jSTypeRegistry16.createObjectType("function ({1839678788}): {1839678788}", node25, (com.google.javascript.rhino.jstype.ObjectType) functionType51);
        functionType10.matchConstraint(objectType57);
        boolean boolean59 = functionType10.hasDisplayName();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet12 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet12.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(nodeIterable35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertNull(jSType40);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(nodeIterable48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNotNull(functionType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "function (...[?]): ?" + "'", str53, "function (...[?]): ?");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(jSType56);
        org.junit.Assert.assertNotNull(objectType57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test00626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00626");
        com.google.common.collect.ImmutableList.Builder<java.lang.CharSequence> charSequenceBuilder0 = com.google.common.collect.ImmutableList.builder();
        com.google.common.collect.ImmutableList.Builder<java.lang.CharSequence> charSequenceBuilder2 = charSequenceBuilder0.add((java.lang.CharSequence) "java.io.IOException: ");
        com.google.common.collect.ImmutableList.Builder<java.lang.CharSequence> charSequenceBuilder3 = new com.google.common.collect.ImmutableList.Builder<java.lang.CharSequence>();
        com.google.javascript.rhino.JSDocInfo jSDocInfo4 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo7 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList8 = com.google.common.collect.ImmutableList.of(jSDocInfo4, jSDocInfo5, jSDocInfo6, jSDocInfo7);
        java.util.Set<java.lang.String> strSet9 = jSDocInfo7.getSuppressions();
        java.util.Iterator<java.lang.String> strItor10 = strSet9.iterator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo12 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo14 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList15 = com.google.common.collect.ImmutableList.of(jSDocInfo11, jSDocInfo12, jSDocInfo13, jSDocInfo14);
        java.util.Set<java.lang.String> strSet16 = jSDocInfo14.getSuppressions();
        java.util.Iterator<java.lang.String> strItor17 = strSet16.iterator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList22 = com.google.common.collect.ImmutableList.of(jSDocInfo18, jSDocInfo19, jSDocInfo20, jSDocInfo21);
        java.util.Set<java.lang.String> strSet23 = jSDocInfo21.getSuppressions();
        java.util.Iterator<java.lang.String> strItor24 = strSet23.iterator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo25 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo26 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList29 = com.google.common.collect.ImmutableList.of(jSDocInfo25, jSDocInfo26, jSDocInfo27, jSDocInfo28);
        java.util.Set<java.lang.String> strSet30 = jSDocInfo28.getSuppressions();
        java.util.Iterator<java.lang.String> strItor31 = strSet30.iterator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo32 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo34 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo35 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList36 = com.google.common.collect.ImmutableList.of(jSDocInfo32, jSDocInfo33, jSDocInfo34, jSDocInfo35);
        java.util.Set<java.lang.String> strSet37 = jSDocInfo35.getSuppressions();
        java.util.Iterator<java.lang.String> strItor38 = strSet37.iterator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo40 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo42 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList43 = com.google.common.collect.ImmutableList.of(jSDocInfo39, jSDocInfo40, jSDocInfo41, jSDocInfo42);
        java.util.Set<java.lang.String> strSet44 = jSDocInfo42.getSuppressions();
        java.util.Iterator<java.lang.String> strItor45 = strSet44.iterator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo46 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo47 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo48 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo49 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList50 = com.google.common.collect.ImmutableList.of(jSDocInfo46, jSDocInfo47, jSDocInfo48, jSDocInfo49);
        java.util.Set<java.lang.String> strSet51 = jSDocInfo49.getSuppressions();
        java.util.Iterator<java.lang.String> strItor52 = strSet51.iterator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo53 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo54 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo55 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo56 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList57 = com.google.common.collect.ImmutableList.of(jSDocInfo53, jSDocInfo54, jSDocInfo55, jSDocInfo56);
        java.util.Set<java.lang.String> strSet58 = jSDocInfo56.getSuppressions();
        java.util.Iterator<java.lang.String> strItor59 = strSet58.iterator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo60 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo61 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo62 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo63 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList64 = com.google.common.collect.ImmutableList.of(jSDocInfo60, jSDocInfo61, jSDocInfo62, jSDocInfo63);
        java.util.Set<java.lang.String> strSet65 = jSDocInfo63.getSuppressions();
        java.util.Iterator<java.lang.String> strItor66 = strSet65.iterator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo67 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo68 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo69 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo70 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList71 = com.google.common.collect.ImmutableList.of(jSDocInfo67, jSDocInfo68, jSDocInfo69, jSDocInfo70);
        java.util.Set<java.lang.String> strSet72 = jSDocInfo70.getSuppressions();
        java.util.Iterator<java.lang.String> strItor73 = strSet72.iterator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo74 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo75 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo76 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo77 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList78 = com.google.common.collect.ImmutableList.of(jSDocInfo74, jSDocInfo75, jSDocInfo76, jSDocInfo77);
        java.util.Set<java.lang.String> strSet79 = jSDocInfo77.getSuppressions();
        java.util.Iterator<java.lang.String> strItor80 = strSet79.iterator();
        com.google.common.collect.ImmutableList<java.util.Iterator<java.lang.String>> strItorList81 = com.google.common.collect.ImmutableList.of(strItor10, strItor17, strItor24, strItor31, strItor38, strItor45, strItor52, strItor59, strItor66, strItor73, strItor80);
        com.google.common.collect.ImmutableList.Builder<java.lang.CharSequence> charSequenceBuilder82 = charSequenceBuilder3.addAll(strItor17);
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList83 = charSequenceBuilder82.build();
        java.lang.CharSequence[] charSequenceArray86 = new java.lang.CharSequence[] { "function ({1591600607}): {1591600607}", "NUMBER 0.0 16" };
        com.google.common.collect.ImmutableList.Builder<java.lang.CharSequence> charSequenceBuilder87 = charSequenceBuilder82.add(charSequenceArray86);
        com.google.common.collect.ImmutableList.Builder<java.lang.CharSequence> charSequenceBuilder88 = charSequenceBuilder2.add(charSequenceArray86);
        com.google.javascript.rhino.JSDocInfo jSDocInfo89 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo90 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo91 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo92 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList93 = com.google.common.collect.ImmutableList.of(jSDocInfo89, jSDocInfo90, jSDocInfo91, jSDocInfo92);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression94 = jSDocInfo92.getReturnType();
        boolean boolean95 = jSDocInfo92.isImplicitCast();
        java.lang.String str96 = jSDocInfo92.getLicense();
        java.util.Set<java.lang.String> strSet97 = jSDocInfo92.getModifies();
        java.util.Iterator<java.lang.String> strItor98 = strSet97.iterator();
        com.google.common.collect.ImmutableList.Builder<java.lang.CharSequence> charSequenceBuilder99 = charSequenceBuilder2.addAll(strItor98);
        org.junit.Assert.assertNotNull(charSequenceBuilder0);
        org.junit.Assert.assertNotNull(charSequenceBuilder2);
        org.junit.Assert.assertNotNull(jSDocInfoList8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(jSDocInfoList15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(jSDocInfoList22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(strItor24);
        org.junit.Assert.assertNotNull(jSDocInfoList29);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(strItor31);
        org.junit.Assert.assertNotNull(jSDocInfoList36);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertNotNull(strItor38);
        org.junit.Assert.assertNotNull(jSDocInfoList43);
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertNotNull(strItor45);
        org.junit.Assert.assertNotNull(jSDocInfoList50);
        org.junit.Assert.assertNotNull(strSet51);
        org.junit.Assert.assertNotNull(strItor52);
        org.junit.Assert.assertNotNull(jSDocInfoList57);
        org.junit.Assert.assertNotNull(strSet58);
        org.junit.Assert.assertNotNull(strItor59);
        org.junit.Assert.assertNotNull(jSDocInfoList64);
        org.junit.Assert.assertNotNull(strSet65);
        org.junit.Assert.assertNotNull(strItor66);
        org.junit.Assert.assertNotNull(jSDocInfoList71);
        org.junit.Assert.assertNotNull(strSet72);
        org.junit.Assert.assertNotNull(strItor73);
        org.junit.Assert.assertNotNull(jSDocInfoList78);
        org.junit.Assert.assertNotNull(strSet79);
        org.junit.Assert.assertNotNull(strItor80);
        org.junit.Assert.assertNotNull(strItorList81);
        org.junit.Assert.assertNotNull(charSequenceBuilder82);
        org.junit.Assert.assertNotNull(charSequenceList83);
        org.junit.Assert.assertNotNull(charSequenceArray86);
        org.junit.Assert.assertNotNull(charSequenceBuilder87);
        org.junit.Assert.assertNotNull(charSequenceBuilder88);
        org.junit.Assert.assertNotNull(jSDocInfoList93);
        org.junit.Assert.assertNull(jSTypeExpression94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNull(str96);
        org.junit.Assert.assertNotNull(strSet97);
        org.junit.Assert.assertNotNull(strItor98);
        org.junit.Assert.assertNotNull(charSequenceBuilder99);
    }

    @Test
    public void test00627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00627");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("Unknown class name");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int6 = node5.getSourceOffset();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable11 = node10.children();
        node5.addChildrenToBack(node10);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int17 = node16.getSourceOffset();
        com.google.javascript.rhino.Node node18 = node5.useSourceInfoIfMissingFrom(node16);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean23 = node22.hasOneChild();
        node22.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable26 = node22.getAncestors();
        int int27 = node22.getLineno();
        boolean boolean28 = node22.isLocalResultCall();
        com.google.javascript.rhino.Node node29 = node18.useSourceInfoFromForTree(node22);
        com.google.javascript.rhino.Node node30 = assertionFunctionSpec1.getAssertedParam(node18);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int35 = node34.getSourceOffset();
        boolean boolean36 = node34.isDo();
        int int37 = node34.getChildCount();
        node34.setDouble((double) 45);
        com.google.javascript.rhino.Node node40 = node30.srcrefTree(node34);
        java.lang.String str41 = node30.toString();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeIterable11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(ancestorIterable26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 36 + "'", int27 == 36);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "NUMBER 0.0 36" + "'", str41, "NUMBER 0.0 36");
    }

    @Test
    public void test00628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00628");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable5 = node4.children();
        boolean boolean6 = node4.isQuotedString();
        node4.setLength(0);
        boolean boolean9 = node4.isVar();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean14 = node13.hasOneChild();
        node4.addChildToBack(node13);
        boolean boolean16 = node13.isInc();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int22 = node21.getSourceOffset();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable27 = node26.children();
        node21.addChildrenToBack(node26);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int33 = node32.getSourceOffset();
        com.google.javascript.rhino.Node node34 = node21.useSourceInfoIfMissingFrom(node32);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(10, node21, 49, (int) (short) 100);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean40 = node37.isEquivalentTo(node39);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((int) '4', node13, node39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: first new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(nodeIterable27);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test00629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00629");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int15 = node14.getSourceOffset();
        com.google.javascript.rhino.Node node16 = node3.useSourceInfoIfMissingFrom(node14);
        java.lang.String str17 = node16.toString();
        com.google.javascript.rhino.jstype.JSType jSType18 = node16.getJSType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = node16.detachFromParent();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "NUMBER 0.0 36" + "'", str17, "NUMBER 0.0 36");
        org.junit.Assert.assertNull(jSType18);
    }

    @Test
    public void test00630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00630");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        java.lang.String str2 = jSDocInfo0.toString();
        boolean boolean3 = jSDocInfo0.isExpose();
        int int4 = jSDocInfo0.getExtendedInterfacesCount();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection5 = jSDocInfo0.getTypeNodes();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getReturnType();
        boolean boolean7 = jSDocInfo0.isExterns();
        boolean boolean8 = jSDocInfo0.isExport();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getThisType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JSDocInfo" + "'", str2, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeCollection5);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
    }

    @Test
    public void test00631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00631");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.hasDisplayName();
        boolean boolean12 = functionType10.hasDisplayName();
        boolean boolean13 = functionType10.matchesInt32Context();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable21 = node20.children();
        boolean boolean22 = node20.isQuotedString();
        com.google.javascript.rhino.Node node23 = node20.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry15.createFunctionType(jSType16, node23);
        boolean boolean25 = functionType24.hasDisplayName();
        boolean boolean26 = functionType10.hasEqualCallType(functionType24);
        boolean boolean27 = functionType10.hasCachedValues();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test00632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00632");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean13 = functionType10.isPropertyTypeInferred("JSDocInfo");
        boolean boolean15 = functionType10.hasOwnProperty("");
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node22.children();
        boolean boolean24 = node22.isQuotedString();
        com.google.javascript.rhino.Node node25 = node22.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry17.createFunctionType(jSType18, node25);
        boolean boolean27 = functionType26.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType26.getPropertyType("InputId: hi!");
        boolean boolean30 = functionType10.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType26);
        boolean boolean31 = functionType10.isReturnTypeInferred();
        boolean boolean32 = functionType10.isVoidType();
        com.google.javascript.rhino.jstype.JSType jSType34 = functionType10.getPropertyType("{1108018228}");
        boolean boolean36 = functionType10.removeProperty("function ({441230370}): {441230370}");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeIterable23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test00633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00633");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(53, 51, (int) (byte) 1);
    }

    @Test
    public void test00634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00634");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean4 = node3.hasOneChild();
        boolean boolean5 = node3.isOnlyModifiesThisCall();
        boolean boolean6 = node3.isLabel();
        int int7 = node3.getType();
        java.lang.String str8 = node3.toString();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 39 + "'", int7 == 39);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "NUMBER 0.0 36" + "'", str8, "NUMBER 0.0 36");
    }

    @Test
    public void test00635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00635");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType3 = jSTypeRegistry1.getType("hi!");
        jSTypeRegistry1.setLastGeneration(true);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = jSTypeRegistry1.getErrorReporter();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection8 = jSTypeRegistry1.getDirectImplementors(objectType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(errorReporter6);
    }

    @Test
    public void test00636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00636");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean13 = functionType10.isPropertyTypeInferred("JSDocInfo");
        boolean boolean15 = functionType10.hasOwnProperty("");
        com.google.javascript.rhino.Node node16 = functionType10.getParametersNode();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable24 = node23.children();
        boolean boolean25 = node23.isQuotedString();
        com.google.javascript.rhino.Node node26 = node23.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry18.createFunctionType(jSType19, node26);
        boolean boolean28 = functionType27.isArrayType();
        boolean boolean29 = functionType27.isRegexpType();
        com.google.javascript.rhino.jstype.ObjectType objectType30 = functionType27.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable31 = functionType27.getAllImplementedInterfaces();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue32 = functionType10.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType27);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType33 = functionType10.getSuperClassConstructor();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeIterable24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectTypeIterable31);
        org.junit.Assert.assertNotNull(ternaryValue32);
    }

    @Test
    public void test00637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00637");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int5 = node4.getSourceOffset();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node9.children();
        node4.addChildrenToBack(node9);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int16 = node15.getSourceOffset();
        com.google.javascript.rhino.Node node17 = node4.useSourceInfoIfMissingFrom(node15);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(10, node4, 49, (int) (short) 100);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean23 = node20.isEquivalentTo(node22);
        boolean boolean24 = node20.isSwitch();
        com.google.javascript.rhino.jstype.JSType jSType25 = node20.getJSType();
        boolean boolean26 = node20.isDebugger();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(jSType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test00638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00638");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.hasDisplayName();
        boolean boolean13 = functionType10.removeProperty("InputId: hi!");
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = functionType10.getOwnPropertyJSDocInfo("(Not declared as a type name)");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(jSDocInfo15);
    }

    @Test
    public void test00639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00639");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        com.google.javascript.rhino.jstype.JSType jSType12 = jSTypeRegistry1.getType("");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node19.children();
        boolean boolean21 = node19.isQuotedString();
        com.google.javascript.rhino.Node node22 = node19.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry14.createFunctionType(jSType15, node22);
        boolean boolean24 = functionType23.isArrayType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet25 = functionType23.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable35 = node34.children();
        boolean boolean36 = node34.isQuotedString();
        com.google.javascript.rhino.Node node37 = node34.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry29.createFunctionType(jSType30, node37);
        boolean boolean39 = functionType38.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList40 = functionType38.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable48 = node47.children();
        boolean boolean49 = node47.isQuotedString();
        com.google.javascript.rhino.Node node50 = node47.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType51 = jSTypeRegistry42.createFunctionType(jSType43, node50);
        boolean boolean52 = functionType51.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray53 = new com.google.javascript.rhino.jstype.JSType[] { functionType38, functionType51 };
        com.google.javascript.rhino.jstype.JSType jSType54 = jSTypeRegistry27.createUnionType(jSTypeArray53);
        com.google.javascript.rhino.jstype.FunctionType functionType55 = jSTypeRegistry1.createFunctionTypeWithVarArgs((com.google.javascript.rhino.jstype.JSType) functionType23, jSTypeArray53);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable56 = functionType23.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType57 = functionType23.getImplicitPrototype();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet25 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet25.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(nodeIterable35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(functionTypeList40);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(nodeIterable48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNotNull(functionType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeArray53);
        org.junit.Assert.assertNotNull(jSType54);
        org.junit.Assert.assertNotNull(functionType55);
        org.junit.Assert.assertNotNull(objectTypeIterable56);
        org.junit.Assert.assertNotNull(objectType57);
    }

    @Test
    public void test00640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00640");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("function ({1702558995}): {1702558995}", jSTypeNative1);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int7 = node6.getSourceOffset();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable12 = node11.children();
        node6.addChildrenToBack(node11);
        node6.detachChildren();
        node6.setLineno(16);
        boolean boolean17 = node6.isSwitch();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(39, node22);
        boolean boolean24 = node23.isIf();
        node23.detachChildren();
        boolean boolean26 = node6.hasChild(node23);
        boolean boolean27 = node6.isDebugger();
        boolean boolean28 = node6.isFalse();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable33 = node32.children();
        boolean boolean34 = node32.isQuotedString();
        node32.setLength(0);
        boolean boolean37 = node32.isScript();
        boolean boolean38 = node32.hasChildren();
        boolean boolean39 = node32.isCatch();
        node6.addChildrenToBack(node32);
        com.google.javascript.rhino.Node node41 = assertionFunctionSpec2.getAssertedParam(node6);
        // The following exception was thrown during execution in test generation
        try {
            node41.setQuotedString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not a StringNode");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeIterable12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(nodeIterable33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node41);
    }

    @Test
    public void test00641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00641");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.String str3 = objList2.toString();
        java.lang.Object[] objArray4 = objList2.toArray();
        com.google.common.collect.ImmutableList<java.lang.Object> objList7 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray8 = objList7.toArray();
        com.google.common.collect.ImmutableList<java.lang.Object> objList11 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream12 = objList11.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList13 = objList11.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList14 = objList11.reverse();
        java.util.Spliterator<java.lang.Object> objSpliterator15 = objList11.spliterator();
        boolean boolean16 = objList7.containsAll((java.util.Collection<java.lang.Object>) objList11);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean21 = node20.hasOneChild();
        boolean boolean22 = node20.isOnlyModifiesThisCall();
        boolean boolean23 = node20.isLabel();
        int int24 = node20.getType();
        boolean boolean25 = objList11.contains((java.lang.Object) node20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = objList2.retainAll((java.util.Collection<java.lang.Object>) objList11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[10, 0]" + "'", str3, "[10, 0]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10, 0]");
        org.junit.Assert.assertNotNull(objList7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, 0]");
        org.junit.Assert.assertNotNull(objList11);
        org.junit.Assert.assertNotNull(objStream12);
        org.junit.Assert.assertNotNull(objList13);
        org.junit.Assert.assertNotNull(objList14);
        org.junit.Assert.assertNotNull(objSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 39 + "'", int24 == 39);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test00642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00642");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor4 = objList2.listIterator();
        boolean boolean6 = objList2.contains((java.lang.Object) (short) 10);
        java.lang.Object obj7 = null;
        boolean boolean8 = objList2.equals(obj7);
        java.lang.String str9 = objList2.toString();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int15 = node14.getSourceOffset();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node19.children();
        node14.addChildrenToBack(node19);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int26 = node25.getSourceOffset();
        com.google.javascript.rhino.Node node27 = node14.useSourceInfoIfMissingFrom(node25);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(10, node14, 49, (int) (short) 100);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean33 = node30.isEquivalentTo(node32);
        int int34 = objList2.lastIndexOf((java.lang.Object) node30);
        int int35 = node30.getSourceOffset();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable36 = node30.children();
        boolean boolean37 = node30.isDefaultCase();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node39 = node30.getChildAtIndex(50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[10, 0]" + "'", str9, "[10, 0]");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeIterable20);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(nodeIterable36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test00643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00643");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean4 = node3.hasOneChild();
        node3.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable7 = node3.getAncestors();
        int int8 = node3.getChildCount();
        java.lang.String str9 = node3.toString();
        boolean boolean10 = node3.isDebugger();
        com.google.javascript.rhino.Node node11 = node3.cloneTree();
        boolean boolean12 = node11.isNE();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(ancestorIterable7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "NUMBER 0.0 36" + "'", str9, "NUMBER 0.0 36");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00644");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream3 = objList2.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList4 = objList2.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList5 = objList2.reverse();
        java.lang.Object[] objArray6 = objList5.toArray();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int11 = node10.getSourceOffset();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable16 = node15.children();
        node10.addChildrenToBack(node15);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int22 = node21.getSourceOffset();
        com.google.javascript.rhino.Node node23 = node10.useSourceInfoIfMissingFrom(node21);
        boolean boolean24 = objList5.contains((java.lang.Object) node23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = objList5.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: index (-1) must not be negative");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objStream3);
        org.junit.Assert.assertNotNull(objList4);
        org.junit.Assert.assertNotNull(objList5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, 10]");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeIterable16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00645");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        com.google.javascript.rhino.jstype.JSType jSType12 = jSTypeRegistry1.getType("");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node19.children();
        boolean boolean21 = node19.isQuotedString();
        com.google.javascript.rhino.Node node22 = node19.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry14.createFunctionType(jSType15, node22);
        boolean boolean24 = functionType23.isArrayType();
        java.lang.String str25 = functionType23.toAnnotationString();
        boolean boolean26 = functionType23.isStringObjectType();
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry1.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType) functionType23, "NUMBER 0.0 36");
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable36 = node35.children();
        boolean boolean37 = node35.isQuotedString();
        com.google.javascript.rhino.Node node38 = node35.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry30.createFunctionType(jSType31, node38);
        boolean boolean40 = functionType39.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType42 = functionType39.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType43 = functionType39.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType44 = jSTypeRegistry1.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType39);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable50 = node49.children();
        boolean boolean51 = node49.isQuotedString();
        node49.setLength(0);
        boolean boolean54 = node49.isScript();
        boolean boolean55 = node49.hasChildren();
        boolean boolean56 = node49.isGetProp();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType57 = jSTypeRegistry1.createInterfaceType("function ({1160807699}): {1160807699}", node49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "function (...[?]): ?" + "'", str25, "function (...[?]): ?");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeIterable36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(functionType43);
        org.junit.Assert.assertNotNull(jSType44);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(nodeIterable50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test00646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00646");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList12 = functionType10.getSubTypes();
        com.google.javascript.rhino.Node node13 = functionType10.getRootNode();
        com.google.javascript.rhino.JSDocInfo jSDocInfo14 = functionType10.getJSDocInfo();
        com.google.javascript.rhino.jstype.TemplateType templateType15 = functionType10.toMaybeTemplateType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = templateType15.isUnionType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(functionTypeList12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(jSDocInfo14);
        org.junit.Assert.assertNull(templateType15);
    }

    @Test
    public void test00647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00647");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean13 = functionType10.isPropertyTypeInferred("JSDocInfo");
        boolean boolean15 = functionType10.hasOwnProperty("");
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node22.children();
        boolean boolean24 = node22.isQuotedString();
        com.google.javascript.rhino.Node node25 = node22.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry17.createFunctionType(jSType18, node25);
        boolean boolean27 = functionType26.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType26.getPropertyType("InputId: hi!");
        boolean boolean30 = functionType10.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType26);
        boolean boolean31 = functionType26.isStringObjectType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType33 = functionType26.getTopMostDefiningType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeIterable23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test00648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00648");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor4 = objList2.listIterator();
        int int5 = objList2.size();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int10 = node9.getSourceOffset();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable15 = node14.children();
        node9.addChildrenToBack(node14);
        boolean boolean17 = node14.isGetElem();
        int int18 = node14.getType();
        boolean boolean19 = objList2.equals((java.lang.Object) node14);
        java.lang.Object[] objArray20 = objList2.toArray();
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor22 = objList2.listIterator(35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: index (35) must not be greater than size (2)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeIterable15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 39 + "'", int18 == 39);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10, 0]");
    }

    @Test
    public void test00649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00649");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean13 = functionType10.isPropertyTypeInferred("JSDocInfo");
        boolean boolean15 = functionType10.hasOwnProperty("");
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node22.children();
        boolean boolean24 = node22.isQuotedString();
        com.google.javascript.rhino.Node node25 = node22.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry17.createFunctionType(jSType18, node25);
        boolean boolean27 = functionType26.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType26.getPropertyType("InputId: hi!");
        boolean boolean30 = functionType10.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType26);
        boolean boolean31 = functionType26.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType32 = functionType26.unboxesTo();
        boolean boolean33 = functionType26.isInterface();
        boolean boolean35 = functionType26.isPropertyInExterns("NUMBER 0.0 36\n");
        java.util.Set<java.lang.String> strSet36 = functionType26.getPropertyNames();
        com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> jSTypePredicate37 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = functionType26.setValidator(jSTypePredicate37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeIterable23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(jSType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strSet36);
    }

    @Test
    public void test00650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00650");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        boolean boolean5 = jSDocInfo3.isConstructor();
        java.lang.String str6 = jSDocInfo3.getReturnDescription();
        java.lang.String str7 = jSDocInfo3.getLicense();
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00651");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        boolean boolean10 = node8.isQuotedString();
        com.google.javascript.rhino.Node node11 = node8.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry3.createFunctionType(jSType4, node11);
        boolean boolean13 = functionType12.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList14 = functionType12.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.children();
        boolean boolean23 = node21.isQuotedString();
        com.google.javascript.rhino.Node node24 = node21.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry16.createFunctionType(jSType17, node24);
        boolean boolean26 = functionType25.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] { functionType12, functionType25 };
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry1.createUnionType(jSTypeArray27);
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30);
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable37 = node36.children();
        boolean boolean38 = node36.isQuotedString();
        com.google.javascript.rhino.Node node39 = node36.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType40 = jSTypeRegistry31.createFunctionType(jSType32, node39);
        com.google.javascript.rhino.jstype.FunctionType functionType41 = functionType40.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType42 = functionType41.toMaybeEnumElementType();
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43);
        com.google.javascript.rhino.jstype.JSType jSType45 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable50 = node49.children();
        boolean boolean51 = node49.isQuotedString();
        com.google.javascript.rhino.Node node52 = node49.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry44.createFunctionType(jSType45, node52);
        boolean boolean54 = functionType53.isArrayType();
        java.lang.String str55 = functionType53.toAnnotationString();
        boolean boolean56 = functionType53.isStringObjectType();
        functionType41.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType53);
        jSTypeRegistry1.registerPropertyOnType("()", (com.google.javascript.rhino.jstype.JSType) functionType53);
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59);
        com.google.javascript.rhino.jstype.JSType jSType62 = jSTypeRegistry60.getType("hi!");
        jSTypeRegistry60.setLastGeneration(true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray65 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node66 = jSTypeRegistry60.createParameters(jSTypeArray65);
        com.google.javascript.rhino.ErrorReporter errorReporter67 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry68 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter67);
        com.google.javascript.rhino.jstype.JSType jSType69 = null;
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable74 = node73.children();
        boolean boolean75 = node73.isQuotedString();
        com.google.javascript.rhino.Node node76 = node73.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType77 = jSTypeRegistry68.createFunctionType(jSType69, node76);
        boolean boolean78 = functionType77.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType80 = functionType77.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType81 = functionType77.toMaybeFunctionType();
        boolean boolean83 = functionType81.removeProperty("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable84 = functionType81.getExtendedInterfaces();
        boolean boolean85 = functionType81.isNumberObjectType();
        com.google.javascript.rhino.jstype.JSType jSType87 = functionType81.getPropertyType("NUMBER 0.0 36");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot89 = functionType81.getOwnSlot("[10, 0]");
        com.google.javascript.rhino.Node node93 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable94 = node93.children();
        com.google.javascript.rhino.jstype.FunctionType functionType95 = jSTypeRegistry60.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType81, node93);
        com.google.javascript.rhino.jstype.JSType jSType96 = jSTypeRegistry1.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType) functionType81);
        boolean boolean97 = jSType96.isFunctionPrototypeType();
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(functionTypeList14);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(nodeIterable37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNotNull(functionType40);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertNull(enumElementType42);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(nodeIterable50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "function (...[?]): ?" + "'", str55, "function (...[?]): ?");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(jSType62);
        org.junit.Assert.assertNotNull(jSTypeArray65);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(nodeIterable74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNull(node76);
        org.junit.Assert.assertNotNull(functionType77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(jSType80);
        org.junit.Assert.assertNotNull(functionType81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(jSType87);
        org.junit.Assert.assertNull(jSTypeStaticSlot89);
        org.junit.Assert.assertNotNull(node93);
        org.junit.Assert.assertNotNull(nodeIterable94);
        org.junit.Assert.assertNotNull(functionType95);
        org.junit.Assert.assertNotNull(jSType96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test00652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00652");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean13 = functionType10.isPropertyTypeInferred("JSDocInfo");
        boolean boolean15 = functionType10.hasOwnProperty("");
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node22.children();
        boolean boolean24 = node22.isQuotedString();
        com.google.javascript.rhino.Node node25 = node22.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry17.createFunctionType(jSType18, node25);
        boolean boolean27 = functionType26.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType26.getPropertyType("InputId: hi!");
        boolean boolean30 = functionType10.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType26);
        boolean boolean31 = functionType26.canBeCalled();
        boolean boolean32 = functionType26.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType33 = functionType26.unboxesTo();
        boolean boolean34 = functionType26.matchesStringContext();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeIterable23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(jSType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test00653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00653");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor4 = objList2.listIterator();
        int int5 = objList2.size();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int10 = node9.getSourceOffset();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable15 = node14.children();
        node9.addChildrenToBack(node14);
        boolean boolean17 = node14.isGetElem();
        int int18 = node14.getType();
        boolean boolean19 = objList2.equals((java.lang.Object) node14);
        java.util.Spliterator<java.lang.Object> objSpliterator20 = objList2.spliterator();
        java.lang.String[] strArray21 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String>[] strComparableArray22 = objList2.toArray((java.lang.Comparable<java.lang.String>[]) strArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeIterable15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 39 + "'", int18 == 39);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objSpliterator20);
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test00654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00654");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("Unknown class name");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int6 = node5.getSourceOffset();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable11 = node10.children();
        node5.addChildrenToBack(node10);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int17 = node16.getSourceOffset();
        com.google.javascript.rhino.Node node18 = node5.useSourceInfoIfMissingFrom(node16);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean23 = node22.hasOneChild();
        node22.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable26 = node22.getAncestors();
        int int27 = node22.getLineno();
        boolean boolean28 = node22.isLocalResultCall();
        com.google.javascript.rhino.Node node29 = node18.useSourceInfoFromForTree(node22);
        com.google.javascript.rhino.Node node30 = assertionFunctionSpec1.getAssertedParam(node18);
        boolean boolean31 = node30.isTypeOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile32 = node30.getStaticSourceFile();
        boolean boolean33 = node30.isName();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeIterable11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(ancestorIterable26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 36 + "'", int27 == 36);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(staticSourceFile32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test00655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00655");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        node3.detachChildren();
        boolean boolean12 = node3.isOr();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean17 = node16.hasOneChild();
        node16.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable20 = node16.getAncestors();
        int int21 = node16.getChildCount();
        node16.setSourceFileForTesting("");
        com.google.javascript.rhino.Node node24 = node3.copyInformationFrom(node16);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(ancestorIterable20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test00656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00656");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        com.google.javascript.rhino.jstype.JSType jSType12 = jSTypeRegistry1.getType("");
        boolean boolean13 = jSTypeRegistry1.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType15 = jSTypeRegistry1.getNativeObjectType(jSTypeNative14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00657");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        boolean boolean5 = node3.isQuotedString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = new com.google.javascript.rhino.JSTypeExpression(node3, "hi!");
        boolean boolean8 = jSTypeExpression7.isOptionalArg();
        boolean boolean9 = jSTypeExpression7.isOptionalArg();
        com.google.javascript.rhino.Node node10 = jSTypeExpression7.getRoot();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int15 = node14.getSourceOffset();
        com.google.javascript.rhino.Node node16 = node10.copyInformationFrom(node14);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = node16.getExistingIntProp(4095);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 4095");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test00658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00658");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile1 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node0);
        org.junit.Assert.assertNull(staticSourceFile1);
    }

    @Test
    public void test00659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00659");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean12 = functionType10.isRegexpType();
        com.google.javascript.rhino.jstype.ObjectType objectType13 = functionType10.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable14 = functionType10.getAllImplementedInterfaces();
        java.lang.String str15 = functionType10.getReferenceName();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet16 = functionType10.getPossibleToBooleanOutcomes();
        boolean boolean17 = functionType10.canBeCalled();
        boolean boolean18 = functionType10.isUnknownType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objectType13);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet16 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet16.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00660");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        boolean boolean5 = jSDocInfo3.isConstructor();
        java.lang.String str6 = jSDocInfo3.getReturnDescription();
        boolean boolean7 = jSDocInfo3.isHidden();
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00661");
        java.io.IOException iOException1 = new java.io.IOException("function ({561668705}): {561668705}");
    }

    @Test
    public void test00662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00662");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        com.google.javascript.rhino.jstype.JSType jSType12 = jSTypeRegistry1.getType("");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node19.children();
        boolean boolean21 = node19.isQuotedString();
        com.google.javascript.rhino.Node node22 = node19.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry14.createFunctionType(jSType15, node22);
        boolean boolean24 = functionType23.isArrayType();
        boolean boolean25 = functionType23.isRegexpType();
        boolean boolean27 = functionType23.isPropertyTypeDeclared("InputId: hi!");
        java.lang.String str28 = functionType23.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSTypeRegistry1.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType23);
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30);
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable37 = node36.children();
        boolean boolean38 = node36.isQuotedString();
        com.google.javascript.rhino.Node node39 = node36.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType40 = jSTypeRegistry31.createFunctionType(jSType32, node39);
        boolean boolean41 = functionType40.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType43 = functionType40.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType44 = functionType40.toMaybeFunctionType();
        boolean boolean45 = functionType40.isNominalType();
        boolean boolean46 = functionType40.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType47 = jSTypeRegistry1.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType40);
        boolean boolean48 = jSType47.isEnumElementType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "function ({323589415}): {323589415}" + "'", str28, "function ({323589415}): {323589415}");
        org.junit.Assert.assertNotNull(objectType29);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(nodeIterable37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNotNull(functionType40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(jSType43);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(jSType47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test00663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00663");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        com.google.javascript.rhino.jstype.JSType jSType12 = jSTypeRegistry1.getType("");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node19.children();
        boolean boolean21 = node19.isQuotedString();
        com.google.javascript.rhino.Node node22 = node19.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry14.createFunctionType(jSType15, node22);
        boolean boolean24 = functionType23.isArrayType();
        java.lang.String str25 = functionType23.toAnnotationString();
        boolean boolean26 = functionType23.isStringObjectType();
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry1.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType) functionType23, "NUMBER 0.0 36");
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable36 = node35.children();
        boolean boolean37 = node35.isQuotedString();
        com.google.javascript.rhino.Node node38 = node35.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry30.createFunctionType(jSType31, node38);
        boolean boolean40 = functionType39.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType42 = functionType39.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType43 = functionType39.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType44 = jSTypeRegistry1.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType39);
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45);
        com.google.javascript.rhino.jstype.JSType jSType47 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable52 = node51.children();
        boolean boolean53 = node51.isQuotedString();
        com.google.javascript.rhino.Node node54 = node51.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType55 = jSTypeRegistry46.createFunctionType(jSType47, node54);
        boolean boolean56 = functionType55.isArrayType();
        boolean boolean57 = functionType55.isRegexpType();
        com.google.javascript.rhino.jstype.ObjectType objectType58 = functionType55.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable59 = functionType55.getAllImplementedInterfaces();
        java.lang.String str60 = functionType55.getReferenceName();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet61 = functionType55.getPossibleToBooleanOutcomes();
        boolean boolean62 = functionType55.canBeCalled();
        java.util.Set<java.lang.String> strSet63 = functionType55.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.ObjectType objectType64 = functionType55.getImplicitPrototype();
        com.google.javascript.rhino.jstype.ObjectType objectType65 = jSTypeRegistry1.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType55);
        com.google.javascript.rhino.jstype.JSType jSType70 = jSTypeRegistry1.createNamedType("BITXOR", "{1936444324}", 52, (int) (short) 1);
        boolean boolean72 = jSTypeRegistry1.isForwardDeclaredType("function ({774120819}): {774120819}");
        com.google.javascript.rhino.ErrorReporter errorReporter73 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry74 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter73);
        com.google.javascript.rhino.jstype.JSType jSType75 = null;
        com.google.javascript.rhino.Node node79 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable80 = node79.children();
        boolean boolean81 = node79.isQuotedString();
        com.google.javascript.rhino.Node node82 = node79.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType83 = jSTypeRegistry74.createFunctionType(jSType75, node82);
        boolean boolean84 = functionType83.hasDisplayName();
        com.google.javascript.rhino.jstype.TemplateType templateType85 = functionType83.toMaybeTemplateType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType86 = jSTypeRegistry1.createOptionalType((com.google.javascript.rhino.jstype.JSType) templateType85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "function (...[?]): ?" + "'", str25, "function (...[?]): ?");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeIterable36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(functionType43);
        org.junit.Assert.assertNotNull(jSType44);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(nodeIterable52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNotNull(functionType55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(objectType58);
        org.junit.Assert.assertNotNull(objectTypeIterable59);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet61 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet61.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(strSet63);
        org.junit.Assert.assertNotNull(objectType64);
        org.junit.Assert.assertNotNull(objectType65);
        org.junit.Assert.assertNotNull(jSType70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNotNull(nodeIterable80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNull(node82);
        org.junit.Assert.assertNotNull(functionType83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNull(templateType85);
    }

    @Test
    public void test00664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00664");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        com.google.javascript.rhino.jstype.JSType jSType12 = jSTypeRegistry1.getType("");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node19.children();
        boolean boolean21 = node19.isQuotedString();
        com.google.javascript.rhino.Node node22 = node19.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry14.createFunctionType(jSType15, node22);
        boolean boolean24 = functionType23.isArrayType();
        java.lang.String str25 = functionType23.toAnnotationString();
        boolean boolean26 = functionType23.isStringObjectType();
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry1.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType) functionType23, "NUMBER 0.0 36");
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30);
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable37 = node36.children();
        boolean boolean38 = node36.isQuotedString();
        com.google.javascript.rhino.Node node39 = node36.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType40 = jSTypeRegistry31.createFunctionType(jSType32, node39);
        com.google.javascript.rhino.jstype.FunctionType functionType41 = functionType40.toMaybeFunctionType();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection42 = jSTypeRegistry1.getDirectImplementors((com.google.javascript.rhino.jstype.ObjectType) functionType41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43);
        com.google.javascript.rhino.jstype.JSType jSType45 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable50 = node49.children();
        boolean boolean51 = node49.isQuotedString();
        com.google.javascript.rhino.Node node52 = node49.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry44.createFunctionType(jSType45, node52);
        boolean boolean54 = functionType53.isArrayType();
        boolean boolean56 = functionType53.isPropertyTypeInferred("JSDocInfo");
        boolean boolean58 = functionType53.hasOwnProperty("");
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59);
        com.google.javascript.rhino.jstype.JSType jSType61 = null;
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable66 = node65.children();
        boolean boolean67 = node65.isQuotedString();
        com.google.javascript.rhino.Node node68 = node65.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType69 = jSTypeRegistry60.createFunctionType(jSType61, node68);
        boolean boolean70 = functionType69.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType72 = functionType69.getPropertyType("InputId: hi!");
        boolean boolean73 = functionType53.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType69);
        boolean boolean74 = functionType53.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType76 = jSTypeRegistry1.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType) functionType53, "");
        boolean boolean77 = jSType76.isString();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "function (...[?]): ?" + "'", str25, "function (...[?]): ?");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(nodeIterable37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNotNull(functionType40);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertNotNull(functionTypeCollection42);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(nodeIterable50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(nodeIterable66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertNotNull(functionType69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(jSType72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(jSType76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test00665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00665");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 11, 46, 0);
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test00666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00666");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        boolean boolean10 = node8.isQuotedString();
        com.google.javascript.rhino.Node node11 = node8.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry3.createFunctionType(jSType4, node11);
        boolean boolean13 = functionType12.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList14 = functionType12.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.children();
        boolean boolean23 = node21.isQuotedString();
        com.google.javascript.rhino.Node node24 = node21.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry16.createFunctionType(jSType17, node24);
        boolean boolean26 = functionType25.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] { functionType12, functionType25 };
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry1.createUnionType(jSTypeArray27);
        jSTypeRegistry1.forwardDeclareType("Not declared as a type name");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative31 = null;
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray32 = new com.google.javascript.rhino.jstype.JSTypeNative[] { jSTypeNative31 };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType33 = jSTypeRegistry1.createUnionType(jSTypeNativeArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(functionTypeList14);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNotNull(jSTypeNativeArray32);
    }

    @Test
    public void test00667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00667");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream3 = objList2.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList4 = objList2.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList5 = objList2.reverse();
        java.util.Spliterator<java.lang.Object> objSpliterator6 = objList2.spliterator();
        java.util.Spliterator<java.lang.Object> objSpliterator7 = objList2.spliterator();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet9 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet10 = booleanLiteralSet8.intersection(booleanLiteralSet9);
        int int11 = objList2.lastIndexOf((java.lang.Object) booleanLiteralSet10);
        java.lang.String str12 = objList2.toString();
        java.lang.String str13 = objList2.toString();
        com.google.common.collect.ImmutableList<java.util.RandomAccess> randomAccessList14 = com.google.common.collect.ImmutableList.of((java.util.RandomAccess) objList2);
        java.util.Iterator<java.lang.Object> objItor15 = objList2.iterator();
        java.util.stream.Stream<java.lang.Object> objStream16 = objList2.parallelStream();
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objStream3);
        org.junit.Assert.assertNotNull(objList4);
        org.junit.Assert.assertNotNull(objList5);
        org.junit.Assert.assertNotNull(objSpliterator6);
        org.junit.Assert.assertNotNull(objSpliterator7);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet8 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet8.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet9 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet9.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet10 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet10.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[10, 0]" + "'", str12, "[10, 0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[10, 0]" + "'", str13, "[10, 0]");
        org.junit.Assert.assertNotNull(randomAccessList14);
        org.junit.Assert.assertNotNull(objItor15);
        org.junit.Assert.assertNotNull(objStream16);
    }

    @Test
    public void test00668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00668");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream3 = objList2.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList4 = objList2.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList5 = objList2.reverse();
        java.util.Spliterator<java.lang.Object> objSpliterator6 = objList2.spliterator();
        java.lang.String str7 = objList2.toString();
        java.lang.Object[] objArray8 = objList2.toArray();
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<java.lang.Object> objList11 = objList2.subList(147456, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start index (147456) must not be greater than size (2)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objStream3);
        org.junit.Assert.assertNotNull(objList4);
        org.junit.Assert.assertNotNull(objList5);
        org.junit.Assert.assertNotNull(objSpliterator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[10, 0]" + "'", str7, "[10, 0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, 0]");
    }

    @Test
    public void test00669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00669");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        boolean boolean5 = node3.isQuotedString();
        node3.setLength(0);
        boolean boolean8 = node3.isVar();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean13 = node12.hasOneChild();
        node3.addChildToBack(node12);
        node3.setType(49);
        boolean boolean17 = node3.isDefaultCase();
        boolean boolean18 = node3.isNoSideEffectsCall();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00670");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.ErrorReporter errorReporter4 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable11 = node10.children();
        boolean boolean12 = node10.isQuotedString();
        com.google.javascript.rhino.Node node13 = node10.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry5.createFunctionType(jSType6, node13);
        boolean boolean15 = functionType14.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList16 = functionType14.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable24 = node23.children();
        boolean boolean25 = node23.isQuotedString();
        com.google.javascript.rhino.Node node26 = node23.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry18.createFunctionType(jSType19, node26);
        boolean boolean28 = functionType27.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] { functionType14, functionType27 };
        com.google.javascript.rhino.jstype.JSType jSType30 = jSTypeRegistry3.createUnionType(jSTypeArray29);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope31 = null;
        com.google.javascript.rhino.jstype.JSType jSType36 = jSTypeRegistry3.getType(jSTypeStaticScope31, "[10, 0]", "", (int) (byte) 1, (int) (byte) 10);
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable44 = node43.children();
        boolean boolean45 = node43.isQuotedString();
        com.google.javascript.rhino.Node node46 = node43.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType47 = jSTypeRegistry38.createFunctionType(jSType39, node46);
        boolean boolean48 = functionType47.isArrayType();
        boolean boolean49 = jSType36.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType47);
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType50 = functionType47.toMaybeParameterizedType();
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51);
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable58 = node57.children();
        boolean boolean59 = node57.isQuotedString();
        com.google.javascript.rhino.Node node60 = node57.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType61 = jSTypeRegistry52.createFunctionType(jSType53, node60);
        com.google.javascript.rhino.ErrorReporter errorReporter62 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter62);
        com.google.javascript.rhino.ErrorReporter errorReporter64 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter64);
        com.google.javascript.rhino.jstype.JSType jSType66 = null;
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable71 = node70.children();
        boolean boolean72 = node70.isQuotedString();
        com.google.javascript.rhino.Node node73 = node70.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType74 = jSTypeRegistry65.createFunctionType(jSType66, node73);
        boolean boolean75 = functionType74.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList76 = functionType74.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter77 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry78 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter77);
        com.google.javascript.rhino.jstype.JSType jSType79 = null;
        com.google.javascript.rhino.Node node83 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable84 = node83.children();
        boolean boolean85 = node83.isQuotedString();
        com.google.javascript.rhino.Node node86 = node83.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry78.createFunctionType(jSType79, node86);
        boolean boolean88 = functionType87.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray89 = new com.google.javascript.rhino.jstype.JSType[] { functionType74, functionType87 };
        com.google.javascript.rhino.jstype.JSType jSType90 = jSTypeRegistry63.createUnionType(jSTypeArray89);
        com.google.javascript.rhino.Node node91 = jSTypeRegistry52.createOptionalParameters(jSTypeArray89);
        com.google.javascript.rhino.jstype.FunctionType functionType92 = jSTypeRegistry1.createConstructorTypeWithVarArgs((com.google.javascript.rhino.jstype.JSType) parameterizedType50, jSTypeArray89);
        jSTypeRegistry1.incrementGeneration();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray94 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType95 = jSTypeRegistry1.createUnionType(jSTypeArray94);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeIterable11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(functionTypeList16);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeIterable24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(jSType30);
        org.junit.Assert.assertNotNull(jSType36);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(nodeIterable44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(functionType47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(parameterizedType50);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(nodeIterable58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertNotNull(functionType61);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(nodeIterable71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertNotNull(functionType74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNull(functionTypeList76);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertNotNull(nodeIterable84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNull(node86);
        org.junit.Assert.assertNotNull(functionType87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(jSTypeArray89);
        org.junit.Assert.assertNotNull(jSType90);
        org.junit.Assert.assertNotNull(node91);
        org.junit.Assert.assertNotNull(functionType92);
    }

    @Test
    public void test00671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00671");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream3 = objList2.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList4 = objList2.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList5 = objList2.reverse();
        java.lang.Object[] objArray6 = objList5.toArray();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int11 = node10.getSourceOffset();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable16 = node15.children();
        node10.addChildrenToBack(node15);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int22 = node21.getSourceOffset();
        com.google.javascript.rhino.Node node23 = node10.useSourceInfoIfMissingFrom(node21);
        boolean boolean24 = objList5.contains((java.lang.Object) node23);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int30 = node29.getSourceOffset();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable35 = node34.children();
        node29.addChildrenToBack(node34);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int41 = node40.getSourceOffset();
        com.google.javascript.rhino.Node node42 = node29.useSourceInfoIfMissingFrom(node40);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(10, node29, 49, (int) (short) 100);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean48 = node45.isEquivalentTo(node47);
        boolean boolean49 = node45.isSwitch();
        com.google.javascript.rhino.InputId inputId51 = new com.google.javascript.rhino.InputId("hi!");
        node45.setInputId(inputId51);
        java.lang.String str53 = inputId51.toString();
        node23.setInputId(inputId51);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((int) (byte) 0);
        node56.setCharno((int) (short) 1);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable59 = node56.siblings();
        boolean boolean60 = node56.hasMoreThanOneChild();
        boolean boolean61 = node56.isDefaultCase();
        com.google.javascript.rhino.Node node62 = node23.useSourceInfoIfMissingFrom(node56);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder63 = node56.getJsDocBuilderForNode();
        int int64 = node56.getChildCount();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node65 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(node56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objStream3);
        org.junit.Assert.assertNotNull(objList4);
        org.junit.Assert.assertNotNull(objList5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, 10]");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeIterable16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(nodeIterable35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "InputId: hi!" + "'", str53, "InputId: hi!");
        org.junit.Assert.assertNotNull(nodeIterable59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
    }

    @Test
    public void test00672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00672");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean2 = node1.isBlock();
        com.google.javascript.rhino.ErrorReporter errorReporter4 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable11 = node10.children();
        boolean boolean12 = node10.isQuotedString();
        com.google.javascript.rhino.Node node13 = node10.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry5.createFunctionType(jSType6, node13);
        boolean boolean15 = functionType14.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType17 = functionType14.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType18 = functionType14.toMaybeFunctionType();
        boolean boolean20 = functionType18.removeProperty("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable21 = functionType18.getExtendedInterfaces();
        boolean boolean22 = functionType18.isNumberObjectType();
        com.google.javascript.rhino.jstype.JSType jSType24 = functionType18.getPropertyType("NUMBER 0.0 36");
        node1.putProp((int) (short) -1, (java.lang.Object) "NUMBER 0.0 36");
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int30 = node29.getSourceOffset();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable35 = node34.children();
        node29.addChildrenToBack(node34);
        node29.detachChildren();
        node29.setLineno(16);
        boolean boolean40 = node29.isSwitch();
        boolean boolean41 = node29.isNull();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int46 = node45.getSourceOffset();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable51 = node50.children();
        node45.addChildrenToBack(node50);
        boolean boolean53 = node50.isGetElem();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int58 = node57.getSourceOffset();
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable63 = node62.children();
        node57.addChildrenToBack(node62);
        node57.detachChildren();
        node57.setLineno(16);
        node50.addChildrenToFront(node57);
        com.google.javascript.rhino.JSDocInfo jSDocInfo69 = node57.getJSDocInfo();
        boolean boolean70 = node57.isSetterDef();
        // The following exception was thrown during execution in test generation
        try {
            node1.addChildAfter(node29, node57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeIterable11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jSType17);
        org.junit.Assert.assertNotNull(functionType18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jSType24);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(nodeIterable35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(nodeIterable51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(nodeIterable63);
        org.junit.Assert.assertNull(jSDocInfo69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test00673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00673");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor4 = objList2.listIterator();
        int int5 = objList2.size();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int10 = node9.getSourceOffset();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable15 = node14.children();
        node9.addChildrenToBack(node14);
        boolean boolean17 = node14.isGetElem();
        int int18 = node14.getType();
        boolean boolean19 = objList2.equals((java.lang.Object) node14);
        java.util.Spliterator<java.lang.Object> objSpliterator20 = objList2.spliterator();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable29 = node28.children();
        boolean boolean30 = node28.isQuotedString();
        com.google.javascript.rhino.Node node31 = node28.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry23.createFunctionType(jSType24, node31);
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable41 = node40.children();
        boolean boolean42 = node40.isQuotedString();
        com.google.javascript.rhino.Node node43 = node40.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry35.createFunctionType(jSType36, node43);
        boolean boolean45 = functionType44.isArrayType();
        boolean boolean46 = functionType44.isRegexpType();
        jSTypeRegistry23.registerPropertyOnType("function (...[?]): ?", (com.google.javascript.rhino.jstype.JSType) functionType44);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode48 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry23.setResolveMode(resolveMode48);
        jSTypeRegistry23.clearTemplateTypeNames();
        // The following exception was thrown during execution in test generation
        try {
            objList2.add((int) (byte) 100, (java.lang.Object) jSTypeRegistry23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeIterable15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 39 + "'", int18 == 39);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objSpliterator20);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(nodeIterable29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(nodeIterable41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + resolveMode48 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode48.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
    }

    @Test
    public void test00674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00674");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = ternaryValue0.xor(ternaryValue2);
        com.google.javascript.rhino.ErrorReporter errorReporter4 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable11 = node10.children();
        boolean boolean12 = node10.isQuotedString();
        com.google.javascript.rhino.Node node13 = node10.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry5.createFunctionType(jSType6, node13);
        boolean boolean15 = functionType14.isArrayType();
        boolean boolean17 = functionType14.isPropertyTypeInferred("JSDocInfo");
        boolean boolean19 = functionType14.hasOwnProperty("");
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable27 = node26.children();
        boolean boolean28 = node26.isQuotedString();
        com.google.javascript.rhino.Node node29 = node26.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry21.createFunctionType(jSType22, node29);
        boolean boolean31 = functionType30.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType33 = functionType30.getPropertyType("InputId: hi!");
        boolean boolean34 = functionType14.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType30);
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35);
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable44 = node43.children();
        boolean boolean45 = node43.isQuotedString();
        com.google.javascript.rhino.Node node46 = node43.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType47 = jSTypeRegistry38.createFunctionType(jSType39, node46);
        boolean boolean48 = functionType47.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList49 = functionType47.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50);
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable57 = node56.children();
        boolean boolean58 = node56.isQuotedString();
        com.google.javascript.rhino.Node node59 = node56.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry51.createFunctionType(jSType52, node59);
        boolean boolean61 = functionType60.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray62 = new com.google.javascript.rhino.jstype.JSType[] { functionType47, functionType60 };
        com.google.javascript.rhino.jstype.JSType jSType63 = jSTypeRegistry36.createUnionType(jSTypeArray62);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope64 = null;
        com.google.javascript.rhino.jstype.JSType jSType69 = jSTypeRegistry36.getType(jSTypeStaticScope64, "[10, 0]", "", (int) (byte) 1, (int) (byte) 10);
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70);
        com.google.javascript.rhino.jstype.JSType jSType72 = null;
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable77 = node76.children();
        boolean boolean78 = node76.isQuotedString();
        com.google.javascript.rhino.Node node79 = node76.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType80 = jSTypeRegistry71.createFunctionType(jSType72, node79);
        boolean boolean81 = functionType80.isArrayType();
        boolean boolean82 = jSType69.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType80);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue83 = functionType30.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType80);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue84 = ternaryValue3.xor(ternaryValue83);
        java.lang.Class<?> wildcardClass85 = ternaryValue83.getClass();
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeIterable11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(nodeIterable27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(functionType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jSType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(nodeIterable44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(functionType47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(functionTypeList49);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(nodeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(jSTypeArray62);
        org.junit.Assert.assertNotNull(jSType63);
        org.junit.Assert.assertNotNull(jSType69);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertNotNull(nodeIterable77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(node79);
        org.junit.Assert.assertNotNull(functionType80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(ternaryValue83);
        org.junit.Assert.assertNotNull(ternaryValue84);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test00675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00675");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean13 = functionType10.isPropertyTypeInferred("JSDocInfo");
        boolean boolean15 = functionType10.hasOwnProperty("");
        com.google.javascript.rhino.Node node16 = functionType10.getParametersNode();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable24 = node23.children();
        boolean boolean25 = node23.isQuotedString();
        com.google.javascript.rhino.Node node26 = node23.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry18.createFunctionType(jSType19, node26);
        boolean boolean28 = functionType27.isArrayType();
        boolean boolean29 = functionType27.isRegexpType();
        com.google.javascript.rhino.jstype.ObjectType objectType30 = functionType27.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable31 = functionType27.getAllImplementedInterfaces();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue32 = functionType10.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType27);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable40 = node39.children();
        boolean boolean41 = node39.isQuotedString();
        com.google.javascript.rhino.Node node42 = node39.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType43 = jSTypeRegistry34.createFunctionType(jSType35, node42);
        boolean boolean44 = functionType43.isArrayType();
        boolean boolean45 = functionType43.isRegexpType();
        com.google.javascript.rhino.jstype.ObjectType objectType46 = functionType43.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable47 = functionType43.getAllImplementedInterfaces();
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48);
        com.google.javascript.rhino.jstype.JSType jSType50 = null;
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable55 = node54.children();
        boolean boolean56 = node54.isQuotedString();
        com.google.javascript.rhino.Node node57 = node54.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType58 = jSTypeRegistry49.createFunctionType(jSType50, node57);
        boolean boolean59 = functionType58.isArrayType();
        boolean boolean60 = functionType58.isRegexpType();
        boolean boolean62 = functionType58.isPropertyTypeDeclared("InputId: hi!");
        boolean boolean63 = functionType43.differsFrom((com.google.javascript.rhino.jstype.JSType) functionType58);
        boolean boolean64 = functionType58.hasImplementedInterfaces();
        boolean boolean65 = functionType58.isInterface();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue66 = functionType27.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType58);
        boolean boolean67 = functionType27.isString();
        com.google.javascript.rhino.jstype.JSType jSType68 = functionType27.getReturnType();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot70 = functionType27.getSlot("function ({1035943170}): {1035943170}");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeIterable24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectTypeIterable31);
        org.junit.Assert.assertNotNull(ternaryValue32);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(nodeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(functionType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objectType46);
        org.junit.Assert.assertNotNull(objectTypeIterable47);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(nodeIterable55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNotNull(functionType58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(ternaryValue66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(jSType68);
        org.junit.Assert.assertNull(staticSlot70);
    }

    @Test
    public void test00676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00676");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.ListIterator<java.lang.Object> objItor3 = objList2.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = objList2.remove(50);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objItor3);
    }

    @Test
    public void test00677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00677");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean13 = functionType10.isPropertyTypeInferred("JSDocInfo");
        boolean boolean15 = functionType10.hasOwnProperty("");
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node22.children();
        boolean boolean24 = node22.isQuotedString();
        com.google.javascript.rhino.Node node25 = node22.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry17.createFunctionType(jSType18, node25);
        boolean boolean27 = functionType26.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType26.getPropertyType("InputId: hi!");
        boolean boolean30 = functionType10.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType26);
        boolean boolean31 = functionType10.isUnknownType();
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable39 = node38.children();
        boolean boolean40 = node38.isQuotedString();
        com.google.javascript.rhino.Node node41 = node38.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry33.createFunctionType(jSType34, node41);
        boolean boolean43 = functionType42.isArrayType();
        boolean boolean45 = functionType42.isPropertyTypeInferred("JSDocInfo");
        boolean boolean47 = functionType42.hasOwnProperty("");
        com.google.javascript.rhino.Node node48 = functionType42.getParametersNode();
        boolean boolean49 = functionType42.hasCachedValues();
        functionType10.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType42);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable51 = functionType10.getAllImplementedInterfaces();
        boolean boolean52 = functionType10.hasInstanceType();
        com.google.javascript.rhino.jstype.FunctionType functionType53 = functionType10.getOwnerFunction();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType.Property property55 = functionType53.getSlot("function ({1976643146}): {1976643146}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeIterable23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(nodeIterable39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(functionType53);
    }

    @Test
    public void test00678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00678");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        node3.detachChildren();
        node3.setLineno(16);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node(39, node18);
        boolean boolean20 = node19.isIf();
        node19.detachChildren();
        boolean boolean22 = node19.isVoid();
        com.google.javascript.rhino.Node node23 = node3.useSourceInfoIfMissingFrom(node19);
        node23.putIntProp((int) (byte) 100, (int) (short) 1);
        boolean boolean27 = node23.isAdd();
        boolean boolean28 = node23.isQuotedString();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test00679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00679");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean12 = functionType10.isRegexpType();
        com.google.javascript.rhino.jstype.JSType jSType14 = functionType10.findPropertyType("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot16 = functionType10.getOwnSlot("hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable24 = node23.children();
        boolean boolean25 = node23.isQuotedString();
        com.google.javascript.rhino.Node node26 = node23.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry18.createFunctionType(jSType19, node26);
        boolean boolean28 = functionType27.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType27.restrictByNotNullOrUndefined();
        boolean boolean30 = jSType29.isNoResolvedType();
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable40 = node39.children();
        boolean boolean41 = node39.isQuotedString();
        com.google.javascript.rhino.Node node42 = node39.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType43 = jSTypeRegistry34.createFunctionType(jSType35, node42);
        boolean boolean44 = functionType43.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList45 = functionType43.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable53 = node52.children();
        boolean boolean54 = node52.isQuotedString();
        com.google.javascript.rhino.Node node55 = node52.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry47.createFunctionType(jSType48, node55);
        boolean boolean57 = functionType56.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] { functionType43, functionType56 };
        com.google.javascript.rhino.jstype.JSType jSType59 = jSTypeRegistry32.createUnionType(jSTypeArray58);
        boolean boolean60 = jSType59.matchesObjectContext();
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable68 = node67.children();
        boolean boolean69 = node67.isQuotedString();
        com.google.javascript.rhino.Node node70 = node67.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType71 = jSTypeRegistry62.createFunctionType(jSType63, node70);
        boolean boolean72 = functionType71.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType74 = functionType71.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType75 = functionType71.toMaybeFunctionType();
        boolean boolean76 = functionType71.isNominalType();
        com.google.javascript.rhino.jstype.JSType jSType77 = jSType59.getLeastSupertype((com.google.javascript.rhino.jstype.JSType) functionType71);
        boolean boolean78 = jSType29.canAssignTo(jSType77);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair79 = functionType10.getTypesUnderShallowInequality(jSType29);
        boolean boolean80 = functionType10.matchesObjectContext();
        int int81 = functionType10.getPropertiesCount();
        boolean boolean82 = functionType10.isOrdinaryFunction();
        java.lang.String str83 = functionType10.getDisplayName();
        com.google.javascript.rhino.JSDocInfo jSDocInfo84 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean85 = jSDocInfo84.isNoCompile();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression86 = jSDocInfo84.getEnumParameterType();
        boolean boolean87 = jSDocInfo84.isExterns();
        boolean boolean88 = jSDocInfo84.hasThisType();
        java.util.Set<java.lang.String> strSet89 = jSDocInfo84.getSuppressions();
        functionType10.setJSDocInfo(jSDocInfo84);
        boolean boolean92 = jSDocInfo84.hasDescriptionForParameter("Not declared as a type name");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSTypeStaticSlot16);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeIterable24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(nodeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(functionType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(functionTypeList45);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(nodeIterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertNotNull(jSType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(nodeIterable68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertNotNull(functionType71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(jSType74);
        org.junit.Assert.assertNotNull(functionType75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(jSType77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(typePair79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNull(jSTypeExpression86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(strSet89);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test00680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00680");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType12 = functionType10.restrictByNotNullOrUndefined();
        boolean boolean13 = functionType10.isReturnTypeInferred();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable21 = node20.children();
        boolean boolean22 = node20.isQuotedString();
        com.google.javascript.rhino.Node node23 = node20.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry15.createFunctionType(jSType16, node23);
        boolean boolean25 = functionType24.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList26 = functionType24.getSubTypes();
        com.google.javascript.rhino.Node node27 = functionType24.getRootNode();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable28 = functionType24.getAllImplementedInterfaces();
        boolean boolean29 = functionType24.isFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType30 = functionType10.getLeastSupertype((com.google.javascript.rhino.jstype.JSType) functionType24);
        boolean boolean31 = functionType10.hasAnyTemplate();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(functionTypeList26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(objectTypeIterable28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jSType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test00681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00681");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int5 = node4.getSourceOffset();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node9.children();
        node4.addChildrenToBack(node9);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int16 = node15.getSourceOffset();
        com.google.javascript.rhino.Node node17 = node4.useSourceInfoIfMissingFrom(node15);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(10, node4, 49, (int) (short) 100);
        boolean boolean21 = node4.isComma();
        boolean boolean22 = node4.isScript();
        com.google.javascript.rhino.Node node23 = node4.getParent();
        // The following exception was thrown during execution in test generation
        try {
            node4.setString("InputId: NUMBER 0.0 36\n");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: NUMBER 0.0 36 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test00682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00682");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int5 = node4.getSourceOffset();
        java.lang.String str6 = node4.getQualifiedName();
        com.google.javascript.rhino.JSDocInfo jSDocInfo7 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo8 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList11 = com.google.common.collect.ImmutableList.of(jSDocInfo7, jSDocInfo8, jSDocInfo9, jSDocInfo10);
        java.util.Set<java.lang.String> strSet12 = jSDocInfo10.getSuppressions();
        strSet12.clear();
        node4.setDirectives(strSet12);
        boolean boolean15 = node4.isQualifiedName();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, 0, 4095);
        node18.detachChildren();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(jSDocInfoList11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00683");
        com.google.javascript.rhino.Node node1 = null;
        com.google.common.collect.ImmutableList<java.lang.Object> objList4 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray5 = objList4.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor6 = objList4.listIterator();
        boolean boolean8 = objList4.contains((java.lang.Object) (short) 10);
        java.lang.Object obj9 = null;
        boolean boolean10 = objList4.equals(obj9);
        java.lang.String str11 = objList4.toString();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int17 = node16.getSourceOffset();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.children();
        node16.addChildrenToBack(node21);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int28 = node27.getSourceOffset();
        com.google.javascript.rhino.Node node29 = node16.useSourceInfoIfMissingFrom(node27);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(10, node16, 49, (int) (short) 100);
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean35 = node32.isEquivalentTo(node34);
        int int36 = objList4.lastIndexOf((java.lang.Object) node32);
        int int37 = node32.getSourceOffset();
        boolean boolean38 = node32.isBreak();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable43 = node42.children();
        boolean boolean44 = node42.isQuotedString();
        node42.setLength(0);
        boolean boolean47 = node42.isNew();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable52 = node51.children();
        boolean boolean53 = node51.isQuotedString();
        node51.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable56 = node51.getAncestors();
        com.google.javascript.rhino.Node node57 = node42.useSourceInfoIfMissingFrom(node51);
        boolean boolean58 = node57.isBlock();
        boolean boolean59 = node57.isAnd();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int64 = node63.getSourceOffset();
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable69 = node68.children();
        node63.addChildrenToBack(node68);
        node63.detachChildren();
        node63.setLineno(16);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node76 = new com.google.javascript.rhino.Node((int) (short) 10, node1, node32, node57, node63, 49, 44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[10, 0]" + "'", str11, "[10, 0]");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(nodeIterable43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(nodeIterable52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(ancestorIterable56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(nodeIterable69);
    }

    @Test
    public void test00684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00684");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = functionType10.toMaybeFunctionType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = functionType11.getOwnPropertyJSDocInfo("function ({50940487}): {50940487}");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertNull(jSDocInfo13);
    }

    @Test
    public void test00685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00685");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.ListIterator<java.lang.Object> objItor3 = objList2.listIterator();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable8 = node7.children();
        boolean boolean9 = node7.isQuotedString();
        node7.setLength(0);
        boolean boolean12 = node7.isScript();
        int int13 = node7.getChildCount();
        boolean boolean14 = objList2.contains((java.lang.Object) node7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Object> objList17 = objList2.subList(4, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start index (4) must not be greater than size (2)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeIterable8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00686");
        com.google.common.collect.ImmutableList.Builder<java.io.IOException> iOExceptionBuilder0 = com.google.common.collect.ImmutableList.builder();
        org.junit.Assert.assertNotNull(iOExceptionBuilder0);
    }

    @Test
    public void test00687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00687");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        boolean boolean11 = node8.hasChildren();
        java.lang.String str12 = node8.getQualifiedName();
        node8.setOptionalArg(false);
        boolean boolean15 = node8.isComma();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00688");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int5 = node4.getSourceOffset();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node9.children();
        node4.addChildrenToBack(node9);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int16 = node15.getSourceOffset();
        com.google.javascript.rhino.Node node17 = node4.useSourceInfoIfMissingFrom(node15);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(10, node4, 49, (int) (short) 100);
        java.util.Set<java.lang.String> strSet21 = node20.getDirectives();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable22 = node20.getAncestors();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean27 = node26.hasOneChild();
        node26.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable30 = node26.getAncestors();
        int int31 = node26.getChildCount();
        node20.addChildrenToFront(node26);
        int int33 = node26.getSideEffectFlags();
        int int34 = node26.getCharno();
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node26);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(strSet21);
        org.junit.Assert.assertNotNull(ancestorIterable22);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(ancestorIterable30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test00689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00689");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor4 = objList2.listIterator();
        boolean boolean6 = objList2.contains((java.lang.Object) (short) 10);
        java.lang.Object obj7 = null;
        boolean boolean8 = objList2.equals(obj7);
        java.lang.String str9 = objList2.toString();
        java.lang.Object[] objArray19 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList20 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList20, objArray19);
        java.lang.Object[] objArray22 = objList20.toArray();
        java.util.stream.Stream<java.lang.Object> objStream23 = objList20.parallelStream();
        int int24 = objList20.size();
        boolean boolean25 = objList2.containsAll((java.util.Collection<java.lang.Object>) objList20);
        java.util.ListIterator<java.lang.Object> objItor26 = objList2.listIterator();
        java.util.stream.Stream<java.lang.Object> objStream27 = objList2.stream();
        java.lang.Object[] objArray37 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList38 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList38, objArray37);
        java.lang.Object[] objArray40 = objList38.toArray();
        java.util.stream.Stream<java.lang.Object> objStream41 = objList38.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList44 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray45 = objList44.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor46 = objList44.listIterator();
        boolean boolean48 = objList44.contains((java.lang.Object) (short) 10);
        java.lang.Object obj49 = null;
        boolean boolean50 = objList44.equals(obj49);
        java.lang.String str51 = objList44.toString();
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable56 = node55.children();
        boolean boolean57 = node55.isQuotedString();
        node55.setLength(0);
        boolean boolean60 = node55.isScript();
        boolean boolean61 = node55.hasChildren();
        int int62 = objList44.lastIndexOf((java.lang.Object) node55);
        boolean boolean63 = objList38.addAll((java.util.Collection<java.lang.Object>) objList44);
        com.google.common.collect.ImmutableList<java.lang.Object> objList66 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray67 = objList66.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor68 = objList66.listIterator();
        boolean boolean70 = objList66.contains((java.lang.Object) (short) 10);
        java.lang.Object obj71 = null;
        boolean boolean72 = objList66.equals(obj71);
        java.lang.String str73 = objList66.toString();
        java.lang.Object[] objArray83 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList84 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList84, objArray83);
        java.lang.Object[] objArray86 = objList84.toArray();
        java.util.stream.Stream<java.lang.Object> objStream87 = objList84.parallelStream();
        int int88 = objList84.size();
        boolean boolean89 = objList66.containsAll((java.util.Collection<java.lang.Object>) objList84);
        java.util.ListIterator<java.lang.Object> objItor90 = objList66.listIterator();
        boolean boolean91 = objList38.removeAll((java.util.Collection<java.lang.Object>) objList66);
        boolean boolean92 = objList2.containsAll((java.util.Collection<java.lang.Object>) objList66);
        java.lang.String str93 = objList66.toString();
        com.google.common.collect.ImmutableList<java.lang.Object> objList94 = objList66.asList();
        // The following exception was thrown during execution in test generation
        try {
            objList94.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[10, 0]" + "'", str9, "[10, 0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objItor26);
        org.junit.Assert.assertNotNull(objStream27);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream41);
        org.junit.Assert.assertNotNull(objList44);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "[10, 0]" + "'", str51, "[10, 0]");
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(nodeIterable56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(objList66);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "[10, 0]" + "'", str73, "[10, 0]");
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray83), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray83), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray86), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray86), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 9 + "'", int88 == 9);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(objItor90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "[10, 0]" + "'", str93, "[10, 0]");
        org.junit.Assert.assertNotNull(objList94);
    }

    @Test
    public void test00690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00690");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        com.google.javascript.rhino.JSDocInfo.Visibility visibility5 = com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC;
        jSDocInfo1.setVisibility(visibility5);
        java.lang.Class<?> wildcardClass7 = visibility5.getClass();
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertTrue("'" + visibility5 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC + "'", visibility5.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00691");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType10.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType14 = functionType10.toMaybeFunctionType();
        com.google.javascript.rhino.Node node15 = functionType10.getRootNode();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node22.children();
        boolean boolean24 = node22.isQuotedString();
        com.google.javascript.rhino.Node node25 = node22.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry17.createFunctionType(jSType18, node25);
        boolean boolean27 = functionType26.isArrayType();
        boolean boolean29 = functionType26.isPropertyTypeInferred("JSDocInfo");
        boolean boolean31 = functionType26.hasOwnProperty("");
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable39 = node38.children();
        boolean boolean40 = node38.isQuotedString();
        com.google.javascript.rhino.Node node41 = node38.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry33.createFunctionType(jSType34, node41);
        boolean boolean43 = functionType42.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType45 = functionType42.getPropertyType("InputId: hi!");
        boolean boolean46 = functionType26.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType42);
        boolean boolean47 = functionType26.isUnknownType();
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48);
        com.google.javascript.rhino.jstype.JSType jSType50 = null;
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable55 = node54.children();
        boolean boolean56 = node54.isQuotedString();
        com.google.javascript.rhino.Node node57 = node54.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType58 = jSTypeRegistry49.createFunctionType(jSType50, node57);
        boolean boolean59 = functionType58.isArrayType();
        boolean boolean61 = functionType58.isPropertyTypeInferred("JSDocInfo");
        boolean boolean63 = functionType58.hasOwnProperty("");
        com.google.javascript.rhino.Node node64 = functionType58.getParametersNode();
        boolean boolean65 = functionType58.hasCachedValues();
        functionType26.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType58);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable67 = functionType26.getAllImplementedInterfaces();
        boolean boolean68 = functionType26.matchesNumberContext();
        com.google.javascript.rhino.ErrorReporter errorReporter69 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter69);
        com.google.javascript.rhino.jstype.JSType jSType71 = null;
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable76 = node75.children();
        boolean boolean77 = node75.isQuotedString();
        com.google.javascript.rhino.Node node78 = node75.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType79 = jSTypeRegistry70.createFunctionType(jSType71, node78);
        boolean boolean80 = functionType79.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType82 = functionType79.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType83 = functionType79.toMaybeFunctionType();
        boolean boolean85 = functionType83.removeProperty("hi!");
        boolean boolean86 = functionType83.matchesStringContext();
        functionType26.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType83);
        boolean boolean88 = functionType10.hasEqualCallType(functionType83);
        boolean boolean90 = functionType83.isPropertyInExterns("java.io.IOException: ");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeIterable23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(nodeIterable39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jSType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(nodeIterable55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNotNull(functionType58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertNotNull(nodeIterable76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(node78);
        org.junit.Assert.assertNotNull(functionType79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(jSType82);
        org.junit.Assert.assertNotNull(functionType83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test00692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00692");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean4 = node3.hasOneChild();
        int int5 = node3.getCharno();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(39, node10);
        boolean boolean12 = node11.isIf();
        node11.detachChildren();
        com.google.javascript.rhino.Node node14 = null;
        node3.addChildrenAfter(node11, node14);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile16 = node3.getStaticSourceFile();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(48, "false");
        boolean boolean20 = node19.isSwitch();
        com.google.javascript.rhino.InputId inputId22 = new com.google.javascript.rhino.InputId("hi!");
        node19.setInputId(inputId22);
        java.lang.String str24 = inputId22.getIdName();
        node3.setInputId(inputId22);
        com.google.javascript.rhino.JSDocInfo jSDocInfo26 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList30 = com.google.common.collect.ImmutableList.of(jSDocInfo26, jSDocInfo27, jSDocInfo28, jSDocInfo29);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression31 = jSDocInfo29.getReturnType();
        boolean boolean32 = jSDocInfo29.isConsistentIdGenerator();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression33 = jSDocInfo29.getEnumParameterType();
        boolean boolean34 = jSDocInfo29.hasType();
        boolean boolean35 = jSDocInfo29.isConstant();
        java.lang.String str36 = jSDocInfo29.getMeaning();
        boolean boolean37 = inputId22.equals((java.lang.Object) jSDocInfo29);
        java.lang.String str38 = inputId22.toString();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(staticSourceFile16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(jSDocInfoList30);
        org.junit.Assert.assertNull(jSTypeExpression31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(jSTypeExpression33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "InputId: hi!" + "'", str38, "InputId: hi!");
    }

    @Test
    public void test00693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00693");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo1.getTypedefType();
        boolean boolean6 = jSDocInfo1.hasType();
        boolean boolean7 = jSDocInfo1.hasThisType();
        boolean boolean8 = jSDocInfo1.isNoCompile();
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00694");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getStartLine();
        int int2 = stringPosition0.getEndLine();
        int int3 = stringPosition0.getPositionOnStartLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00695");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        boolean boolean5 = node3.isQuotedString();
        node3.setLength(0);
        boolean boolean8 = node3.isScript();
        boolean boolean9 = node3.hasChildren();
        node3.setDouble((double) 100);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int16 = node15.getSourceOffset();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable21 = node20.children();
        node15.addChildrenToBack(node20);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int27 = node26.getSourceOffset();
        com.google.javascript.rhino.Node node28 = node15.useSourceInfoIfMissingFrom(node26);
        boolean boolean29 = node15.isLabel();
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((int) 'a', 29, 49);
        boolean boolean34 = node33.isFalse();
        node33.setOptionalArg(true);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder37 = node33.new FileLevelJsDocBuilder();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList38 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node3, (java.lang.Cloneable) node15, (java.lang.Cloneable) node33);
        com.google.javascript.rhino.Node node39 = node3.getLastChild();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder40 = node39.getJsDocBuilderForNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeIterable21);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(cloneableList38);
        org.junit.Assert.assertNull(node39);
    }

    @Test
    public void test00696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00696");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        com.google.javascript.rhino.jstype.JSType jSType12 = jSTypeRegistry1.getType("");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node19.children();
        boolean boolean21 = node19.isQuotedString();
        com.google.javascript.rhino.Node node22 = node19.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry14.createFunctionType(jSType15, node22);
        boolean boolean24 = functionType23.isArrayType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet25 = functionType23.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable35 = node34.children();
        boolean boolean36 = node34.isQuotedString();
        com.google.javascript.rhino.Node node37 = node34.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry29.createFunctionType(jSType30, node37);
        boolean boolean39 = functionType38.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList40 = functionType38.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable48 = node47.children();
        boolean boolean49 = node47.isQuotedString();
        com.google.javascript.rhino.Node node50 = node47.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType51 = jSTypeRegistry42.createFunctionType(jSType43, node50);
        boolean boolean52 = functionType51.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray53 = new com.google.javascript.rhino.jstype.JSType[] { functionType38, functionType51 };
        com.google.javascript.rhino.jstype.JSType jSType54 = jSTypeRegistry27.createUnionType(jSTypeArray53);
        com.google.javascript.rhino.jstype.FunctionType functionType55 = jSTypeRegistry1.createFunctionTypeWithVarArgs((com.google.javascript.rhino.jstype.JSType) functionType23, jSTypeArray53);
        boolean boolean56 = functionType23.isUnknownType();
        boolean boolean57 = functionType23.isNullable();
        boolean boolean59 = functionType23.hasProperty("NUMBER 0.0 16");
        boolean boolean60 = functionType23.isFunctionPrototypeType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet25 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet25.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(nodeIterable35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(functionTypeList40);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(nodeIterable48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNotNull(functionType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeArray53);
        org.junit.Assert.assertNotNull(jSType54);
        org.junit.Assert.assertNotNull(functionType55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test00697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00697");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean12 = functionType10.isRegexpType();
        com.google.javascript.rhino.jstype.JSType jSType14 = functionType10.findPropertyType("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot16 = functionType10.getOwnSlot("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType17 = functionType10.cloneWithoutArrowType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSTypeStaticSlot16);
    }

    @Test
    public void test00698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00698");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor4 = objList2.listIterator();
        boolean boolean6 = objList2.contains((java.lang.Object) (short) 10);
        java.lang.Object obj7 = null;
        boolean boolean8 = objList2.equals(obj7);
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable16 = node15.children();
        boolean boolean17 = node15.isQuotedString();
        com.google.javascript.rhino.Node node18 = node15.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType19 = jSTypeRegistry10.createFunctionType(jSType11, node18);
        com.google.javascript.rhino.jstype.JSType jSType21 = jSTypeRegistry10.getType("");
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable29 = node28.children();
        boolean boolean30 = node28.isQuotedString();
        com.google.javascript.rhino.Node node31 = node28.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry23.createFunctionType(jSType24, node31);
        boolean boolean33 = functionType32.isArrayType();
        boolean boolean34 = functionType32.isRegexpType();
        boolean boolean36 = functionType32.isPropertyTypeDeclared("InputId: hi!");
        java.lang.String str37 = functionType32.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.ObjectType objectType38 = jSTypeRegistry10.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType32);
        boolean boolean39 = objList2.contains((java.lang.Object) objectType38);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj41 = objList2.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeIterable16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(functionType19);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(nodeIterable29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "function ({915288423}): {915288423}" + "'", str37, "function ({915288423}): {915288423}");
        org.junit.Assert.assertNotNull(objectType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test00699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00699");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("function (...[?]): ?", 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test00700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00700");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        com.google.javascript.rhino.jstype.JSType jSType12 = jSTypeRegistry1.getType("");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node19.children();
        boolean boolean21 = node19.isQuotedString();
        com.google.javascript.rhino.Node node22 = node19.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry14.createFunctionType(jSType15, node22);
        boolean boolean24 = functionType23.isArrayType();
        boolean boolean25 = functionType23.isRegexpType();
        boolean boolean27 = functionType23.isPropertyTypeDeclared("InputId: hi!");
        java.lang.String str28 = functionType23.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSTypeRegistry1.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType23);
        jSTypeRegistry1.identifyNonNullableName("function ({478768705}): {478768705}");
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable36 = node35.children();
        boolean boolean37 = node35.isQuotedString();
        node35.setLength(0);
        boolean boolean40 = node35.isScript();
        boolean boolean41 = node35.isTry();
        boolean boolean42 = node35.isWith();
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable51 = node50.children();
        boolean boolean52 = node50.isQuotedString();
        com.google.javascript.rhino.Node node53 = node50.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType54 = jSTypeRegistry45.createFunctionType(jSType46, node53);
        boolean boolean55 = functionType54.isArrayType();
        boolean boolean57 = functionType54.isPropertyTypeInferred("JSDocInfo");
        boolean boolean59 = functionType54.hasOwnProperty("");
        com.google.javascript.rhino.Node node60 = functionType54.getParametersNode();
        boolean boolean61 = functionType54.hasCachedValues();
        java.lang.String str62 = functionType54.getNormalizedReferenceName();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType63 = jSTypeRegistry1.createFromTypeNodes(node35, "function ({1985330600}): {1985330600}", (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unexpected node in type expression: NUMBER 0.0 36");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "function ({1643992522}): {1643992522}" + "'", str28, "function ({1643992522}): {1643992522}");
        org.junit.Assert.assertNotNull(objectType29);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeIterable36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(nodeIterable51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertNotNull(functionType54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(str62);
    }

    @Test
    public void test00701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00701");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        boolean boolean5 = node3.isQuotedString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = new com.google.javascript.rhino.JSTypeExpression(node3, "hi!");
        boolean boolean8 = jSTypeExpression7.isOptionalArg();
        boolean boolean9 = jSTypeExpression7.isOptionalArg();
        com.google.javascript.rhino.Node node10 = jSTypeExpression7.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(node10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test00702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00702");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int6 = node5.getSourceOffset();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable11 = node10.children();
        node5.addChildrenToBack(node10);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int17 = node16.getSourceOffset();
        com.google.javascript.rhino.Node node18 = node5.useSourceInfoIfMissingFrom(node16);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(10, node5, 49, (int) (short) 100);
        java.util.Set<java.lang.String> strSet22 = node21.getDirectives();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int27 = node26.getSourceOffset();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable32 = node31.children();
        node26.addChildrenToBack(node31);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int38 = node37.getSourceOffset();
        com.google.javascript.rhino.Node node39 = node26.useSourceInfoIfMissingFrom(node37);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((int) (byte) 0);
        int int42 = node26.getIndexOfChild(node41);
        com.google.javascript.rhino.Node node43 = node21.srcref(node26);
        namePosition0.setItem(node26);
        int int45 = namePosition0.getEndLine();
        com.google.javascript.rhino.Node node46 = namePosition0.getItem();
        com.google.javascript.rhino.Node node47 = namePosition0.getItem();
        com.google.javascript.rhino.Node node48 = null;
        // The following exception was thrown during execution in test generation
        try {
            node47.addChildrenToFront(node48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeIterable11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(strSet22);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(nodeIterable32);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node47);
    }

    @Test
    public void test00703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00703");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType10.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType14 = functionType10.toMaybeFunctionType();
        com.google.javascript.rhino.Node node15 = functionType10.getRootNode();
        boolean boolean16 = functionType10.matchesStringContext();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType17 = functionType10.toMaybeParameterizedType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = parameterizedType17.hasDisplayName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(parameterizedType17);
    }

    @Test
    public void test00704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00704");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet12 = functionType10.getPossibleToBooleanOutcomes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable13 = functionType10.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType14 = functionType10.getParameterType();
        com.google.javascript.rhino.jstype.JSType jSType16 = functionType10.getPropertyType("JSDocInfo");
        boolean boolean17 = functionType10.matchesStringContext();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet12 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet12.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(objectTypeIterable13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00705");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean12 = functionType10.isRegexpType();
        boolean boolean14 = functionType10.isPropertyTypeDeclared("InputId: hi!");
        com.google.javascript.rhino.Node node15 = functionType10.getRootNode();
        java.lang.String str16 = functionType10.getReferenceName();
        com.google.javascript.rhino.jstype.FunctionType functionType17 = functionType10.toMaybeFunctionType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType18 = functionType10.getInstanceType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(functionType17);
    }

    @Test
    public void test00706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00706");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        boolean boolean5 = jSDocInfo3.isConstructor();
        boolean boolean7 = jSDocInfo3.hasParameterType("[10, 0]");
        com.google.javascript.rhino.JSDocInfo.Visibility visibility8 = jSDocInfo3.getVisibility();
        boolean boolean9 = jSDocInfo3.isExport();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int14 = node13.getSourceOffset();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable19 = node18.children();
        node13.addChildrenToBack(node18);
        node13.detachChildren();
        node13.setLineno(16);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(39, node28);
        boolean boolean30 = node29.isIf();
        node29.detachChildren();
        boolean boolean32 = node29.isVoid();
        com.google.javascript.rhino.Node node33 = node13.useSourceInfoIfMissingFrom(node29);
        jSDocInfo3.setAssociatedNode(node13);
        java.util.Set<java.lang.String> strSet35 = jSDocInfo3.getParameterNames();
        com.google.common.collect.ImmutableList<java.lang.Object> objList39 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray59 = new java.lang.Object[] { "", 10L, (short) -1, (short) 100, 0, ' ', (-1), 1.0d, 100.0f, 39, ' ', 1.0d, (byte) 0, 0L, 10.0f, "hi!", ' ', 0, 10.0f, 43, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList60 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList60, objArray59);
        boolean boolean63 = objList60.add((java.lang.Object) 100.0d);
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable68 = node67.children();
        boolean boolean69 = objList60.contains((java.lang.Object) nodeIterable68);
        java.lang.Object[] objArray70 = objList60.toArray();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean71 = strSet35.retainAll((java.util.Collection<java.lang.Object>) objList60);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(visibility8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeIterable19);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(objList39);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(nodeIterable68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10, 100.0]");
    }

    @Test
    public void test00707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00707");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(2147483647, "Named type with empty name component");
        boolean boolean3 = node2.isAnd();
        boolean boolean4 = node2.isThis();
        com.google.javascript.rhino.Node node5 = node2.getFirstChild();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node6 = node5.cloneTree();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test00708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00708");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType10.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType14 = functionType10.toMaybeFunctionType();
        boolean boolean16 = functionType14.removeProperty("hi!");
        boolean boolean18 = functionType14.isPropertyInExterns("Not declared as a type name");
        boolean boolean19 = functionType14.isInstanceType();
        boolean boolean21 = functionType14.hasProperty("");
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType22 = functionType14.toMaybeParameterizedType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(parameterizedType22);
    }

    @Test
    public void test00709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00709");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int15 = node14.getSourceOffset();
        com.google.javascript.rhino.Node node16 = node3.useSourceInfoIfMissingFrom(node14);
        java.lang.String str17 = node16.toString();
        boolean boolean18 = node16.isThis();
        boolean boolean19 = node16.isComma();
        boolean boolean20 = node16.isDebugger();
        com.google.javascript.rhino.Node node21 = node16.getNext();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "NUMBER 0.0 36" + "'", str17, "NUMBER 0.0 36");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test00710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00710");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean4 = node3.hasOneChild();
        node3.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable7 = node3.getAncestors();
        int int8 = node3.getChildCount();
        java.lang.String str9 = node3.toString();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable17 = node16.children();
        boolean boolean18 = node16.isQuotedString();
        com.google.javascript.rhino.Node node19 = node16.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry11.createFunctionType(jSType12, node19);
        boolean boolean21 = functionType20.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType23 = functionType20.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType24 = functionType20.toMaybeFunctionType();
        boolean boolean26 = functionType24.removeProperty("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable27 = functionType24.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType28 = functionType24.getParameterType();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable36 = node35.children();
        boolean boolean37 = node35.isQuotedString();
        com.google.javascript.rhino.Node node38 = node35.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry30.createFunctionType(jSType31, node38);
        boolean boolean40 = functionType24.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType39);
        boolean boolean41 = functionType24.isNullable();
        com.google.javascript.rhino.jstype.JSType jSType43 = functionType24.getPropertyType("");
        boolean boolean44 = functionType24.isOrdinaryFunction();
        boolean boolean45 = functionType24.matchesNumberContext();
        node3.setJSType((com.google.javascript.rhino.jstype.JSType) functionType24);
        boolean boolean47 = functionType24.isFunctionPrototypeType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable48 = functionType24.getImplementedInterfaces();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(ancestorIterable7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "NUMBER 0.0 36" + "'", str9, "NUMBER 0.0 36");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeIterable17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSType23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable27);
        org.junit.Assert.assertNull(jSType28);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeIterable36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(jSType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable48);
    }

    @Test
    public void test00711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00711");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = functionType10.getOwnPropertyJSDocInfo("function ({1458513118}): {1458513118}");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jSDocInfo13);
    }

    @Test
    public void test00712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00712");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor4 = objList2.listIterator();
        boolean boolean6 = objList2.contains((java.lang.Object) (short) 10);
        java.lang.Object obj7 = null;
        boolean boolean8 = objList2.equals(obj7);
        java.lang.String str9 = objList2.toString();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int15 = node14.getSourceOffset();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node19.children();
        node14.addChildrenToBack(node19);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int26 = node25.getSourceOffset();
        com.google.javascript.rhino.Node node27 = node14.useSourceInfoIfMissingFrom(node25);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(10, node14, 49, (int) (short) 100);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean33 = node30.isEquivalentTo(node32);
        int int34 = objList2.lastIndexOf((java.lang.Object) node30);
        int int36 = objList2.lastIndexOf((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.JSDocInfo jSDocInfo37 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo38 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo40 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList41 = com.google.common.collect.ImmutableList.of(jSDocInfo37, jSDocInfo38, jSDocInfo39, jSDocInfo40);
        boolean boolean43 = jSDocInfo39.hasParameterType("hi!");
        java.lang.String str44 = jSDocInfo39.getBlockDescription();
        java.lang.String str45 = jSDocInfo39.getDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList46 = jSDocInfo39.getImplementedInterfaces();
        jSDocInfo39.setDeprecated(false);
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection49 = jSDocInfo39.getMarkers();
        boolean boolean50 = objList2.equals((java.lang.Object) jSDocInfo39);
        java.lang.String str51 = jSDocInfo39.getVersion();
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[10, 0]" + "'", str9, "[10, 0]");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeIterable20);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(jSDocInfoList41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(jSTypeExpressionList46);
        org.junit.Assert.assertNotNull(markerCollection49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(str51);
    }

    @Test
    public void test00713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00713");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType3 = jSTypeRegistry1.getType("hi!");
        jSTypeRegistry1.setLastGeneration(true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node7 = jSTypeRegistry1.createParameters(jSTypeArray6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable15 = node14.children();
        boolean boolean16 = node14.isQuotedString();
        com.google.javascript.rhino.Node node17 = node14.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType18 = jSTypeRegistry9.createFunctionType(jSType10, node17);
        boolean boolean19 = functionType18.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType21 = functionType18.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType22 = functionType18.toMaybeFunctionType();
        boolean boolean24 = functionType22.removeProperty("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable25 = functionType22.getExtendedInterfaces();
        boolean boolean26 = functionType22.isNumberObjectType();
        com.google.javascript.rhino.jstype.JSType jSType28 = functionType22.getPropertyType("NUMBER 0.0 36");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot30 = functionType22.getOwnSlot("[10, 0]");
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable35 = node34.children();
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType22, node34);
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable44 = node43.children();
        boolean boolean45 = node43.isQuotedString();
        com.google.javascript.rhino.Node node46 = node43.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType47 = jSTypeRegistry38.createFunctionType(jSType39, node46);
        boolean boolean48 = functionType47.isArrayType();
        boolean boolean50 = functionType47.isPropertyTypeInferred("JSDocInfo");
        boolean boolean51 = functionType47.isInstanceType();
        com.google.javascript.rhino.jstype.FunctionType functionType52 = functionType47.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.FunctionType functionType53 = functionType47.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType54 = jSTypeRegistry1.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) functionType47);
        boolean boolean55 = functionType47.isFunctionPrototypeType();
        java.util.Set<java.lang.String> strSet56 = functionType47.getOwnPropertyNames();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeIterable15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(functionType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jSType21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNull(jSTypeStaticSlot30);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(nodeIterable35);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(nodeIterable44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(functionType47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(functionType52);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertNotNull(jSType54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(strSet56);
    }

    @Test
    public void test00714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00714");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        java.util.Set<java.lang.String> strSet5 = jSDocInfo3.getSuppressions();
        boolean boolean6 = jSDocInfo3.containsDeclaration();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo3.getThrownTypes();
        boolean boolean8 = jSDocInfo3.isNoAlias();
        java.lang.String str9 = jSDocInfo3.getFileOverview();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList10 = jSDocInfo3.getThrownTypes();
        java.util.Set<java.lang.String> strSet11 = jSDocInfo3.getSuppressions();
        boolean boolean12 = jSDocInfo3.hasReturnType();
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(jSTypeExpressionList10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00715");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int6 = node5.getSourceOffset();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable11 = node10.children();
        node5.addChildrenToBack(node10);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int17 = node16.getSourceOffset();
        com.google.javascript.rhino.Node node18 = node5.useSourceInfoIfMissingFrom(node16);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(10, node5, 49, (int) (short) 100);
        boolean boolean22 = node5.isComma();
        boolean boolean23 = node5.isAssignAdd();
        boolean boolean24 = node5.isQualifiedName();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean29 = node28.hasOneChild();
        node28.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable32 = node28.getAncestors();
        int int33 = node28.getChildCount();
        java.lang.String str34 = node28.toString();
        com.google.javascript.rhino.Node node35 = node5.useSourceInfoIfMissingFromForTree(node28);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString(32, "JSDocInfo", (int) (byte) 100, 32);
        node28.addChildrenToBack(node40);
        com.google.javascript.rhino.Node node42 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(4, node40, node42, (int) ' ', 49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: first new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeIterable11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(ancestorIterable32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "NUMBER 0.0 36" + "'", str34, "NUMBER 0.0 36");
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node40);
    }

    @Test
    public void test00716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00716");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int5 = node4.getSourceOffset();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node9.children();
        node4.addChildrenToBack(node9);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int16 = node15.getSourceOffset();
        com.google.javascript.rhino.Node node17 = node4.useSourceInfoIfMissingFrom(node15);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) 0);
        int int20 = node4.getIndexOfChild(node19);
        boolean boolean21 = node19.isIf();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo23 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo25 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList26 = com.google.common.collect.ImmutableList.of(jSDocInfo22, jSDocInfo23, jSDocInfo24, jSDocInfo25);
        boolean boolean28 = jSDocInfo24.hasParameterType("hi!");
        boolean boolean29 = jSDocInfo24.hasReturnType();
        boolean boolean30 = jSDocInfo24.hasModifies();
        java.util.Set<java.lang.String> strSet31 = jSDocInfo24.getParameterNames();
        int int32 = strSet31.size();
        node19.setDirectives(strSet31);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile34 = null;
        node19.setStaticSourceFile(staticSourceFile34);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(50, node19, (int) (byte) 10, 31);
        // The following exception was thrown during execution in test generation
        try {
            node19.setQuotedString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not a StringNode");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test00717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00717");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream3 = objList2.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList4 = objList2.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList5 = objList2.reverse();
        java.util.Spliterator<java.lang.Object> objSpliterator6 = objList2.spliterator();
        java.lang.String str7 = objList2.toString();
        java.lang.Object[] objArray8 = objList2.toArray();
        java.lang.Object[] objArray19 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList20 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList20, objArray19);
        java.lang.Object[] objArray22 = objList20.toArray();
        java.util.stream.Stream<java.lang.Object> objStream23 = objList20.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList26 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray27 = objList26.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor28 = objList26.listIterator();
        boolean boolean30 = objList26.contains((java.lang.Object) (short) 10);
        java.lang.Object obj31 = null;
        boolean boolean32 = objList26.equals(obj31);
        java.lang.String str33 = objList26.toString();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable38 = node37.children();
        boolean boolean39 = node37.isQuotedString();
        node37.setLength(0);
        boolean boolean42 = node37.isScript();
        boolean boolean43 = node37.hasChildren();
        int int44 = objList26.lastIndexOf((java.lang.Object) node37);
        boolean boolean45 = objList20.addAll((java.util.Collection<java.lang.Object>) objList26);
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable53 = node52.children();
        boolean boolean54 = node52.isQuotedString();
        com.google.javascript.rhino.Node node55 = node52.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry47.createFunctionType(jSType48, node55);
        boolean boolean57 = functionType56.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType59 = functionType56.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType60 = functionType56.toMaybeFunctionType();
        boolean boolean61 = functionType56.isNominalType();
        com.google.javascript.rhino.ErrorReporter errorReporter62 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter62);
        com.google.javascript.rhino.jstype.JSType jSType64 = null;
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable69 = node68.children();
        boolean boolean70 = node68.isQuotedString();
        com.google.javascript.rhino.Node node71 = node68.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry63.createFunctionType(jSType64, node71);
        boolean boolean73 = functionType72.isArrayType();
        boolean boolean74 = functionType72.isRegexpType();
        com.google.javascript.rhino.jstype.ObjectType objectType75 = functionType72.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable76 = functionType72.getAllImplementedInterfaces();
        com.google.javascript.rhino.ErrorReporter errorReporter77 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry78 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter77);
        com.google.javascript.rhino.jstype.JSType jSType79 = null;
        com.google.javascript.rhino.Node node83 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable84 = node83.children();
        boolean boolean85 = node83.isQuotedString();
        com.google.javascript.rhino.Node node86 = node83.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry78.createFunctionType(jSType79, node86);
        boolean boolean88 = functionType87.isArrayType();
        boolean boolean89 = functionType87.isRegexpType();
        boolean boolean91 = functionType87.isPropertyTypeDeclared("InputId: hi!");
        boolean boolean92 = functionType72.differsFrom((com.google.javascript.rhino.jstype.JSType) functionType87);
        boolean boolean93 = functionType87.matchesStringContext();
        boolean boolean94 = functionType87.hasReferenceName();
        boolean boolean95 = functionType56.hasEqualCallType(functionType87);
        boolean boolean96 = objList20.contains((java.lang.Object) boolean95);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean97 = objList2.addAll(3, (java.util.Collection<java.lang.Object>) objList20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objStream3);
        org.junit.Assert.assertNotNull(objList4);
        org.junit.Assert.assertNotNull(objList5);
        org.junit.Assert.assertNotNull(objSpliterator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[10, 0]" + "'", str7, "[10, 0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, 0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream23);
        org.junit.Assert.assertNotNull(objList26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[10, 0]" + "'", str33, "[10, 0]");
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(nodeIterable38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(nodeIterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(jSType59);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(nodeIterable69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertNotNull(objectTypeIterable76);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertNotNull(nodeIterable84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNull(node86);
        org.junit.Assert.assertNotNull(functionType87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test00718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00718");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor4 = objList2.listIterator();
        int int5 = objList2.size();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int10 = node9.getSourceOffset();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable15 = node14.children();
        node9.addChildrenToBack(node14);
        boolean boolean17 = node14.isGetElem();
        int int18 = node14.getType();
        boolean boolean19 = objList2.equals((java.lang.Object) node14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = objList2.remove(51);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeIterable15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 39 + "'", int18 == 39);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00719");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType10.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType14 = functionType10.toMaybeFunctionType();
        boolean boolean16 = functionType14.removeProperty("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable17 = functionType14.getExtendedInterfaces();
        boolean boolean18 = functionType14.isNumberObjectType();
        com.google.javascript.rhino.jstype.JSType jSType20 = functionType14.getPropertyType("NUMBER 0.0 36");
        com.google.javascript.rhino.Node node21 = functionType14.getSource();
        boolean boolean22 = functionType14.matchesStringContext();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jSType20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00720");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor4 = objList2.listIterator();
        int int5 = objList2.size();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int10 = node9.getSourceOffset();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable15 = node14.children();
        node9.addChildrenToBack(node14);
        boolean boolean17 = node14.isGetElem();
        int int18 = node14.getType();
        boolean boolean19 = objList2.equals((java.lang.Object) node14);
        java.lang.Object[] objArray20 = objList2.toArray();
        // The following exception was thrown during execution in test generation
        try {
            objList2.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeIterable15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 39 + "'", int18 == 39);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10, 0]");
    }

    @Test
    public void test00721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00721");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        boolean boolean6 = jSDocInfo2.hasParameterType("hi!");
        boolean boolean7 = jSDocInfo2.isConstant();
        boolean boolean8 = jSDocInfo2.isDeprecated();
        java.util.Collection<java.lang.String> strCollection9 = jSDocInfo2.getReferences();
        java.lang.String str10 = jSDocInfo2.getBlockDescription();
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strCollection9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00722");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int5 = node4.getSourceOffset();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node9.children();
        node4.addChildrenToBack(node9);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int16 = node15.getSourceOffset();
        com.google.javascript.rhino.Node node17 = node4.useSourceInfoIfMissingFrom(node15);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(10, node4, 49, (int) (short) 100);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean23 = node20.isEquivalentTo(node22);
        node20.setLineno((-1));
        boolean boolean26 = node20.isSwitch();
        int int27 = node20.getType();
        boolean boolean28 = node20.isTry();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node29 = node20.detachFromParent();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test00723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00723");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        com.google.javascript.rhino.ErrorReporter errorReporter4 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable11 = node10.children();
        boolean boolean12 = node10.isQuotedString();
        com.google.javascript.rhino.Node node13 = node10.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry5.createFunctionType(jSType6, node13);
        boolean boolean15 = functionType14.isArrayType();
        boolean boolean16 = functionType14.isRegexpType();
        com.google.javascript.rhino.jstype.JSType jSType18 = functionType14.findPropertyType("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot20 = functionType14.getOwnSlot("hi!");
        boolean boolean21 = objList2.contains((java.lang.Object) "hi!");
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo23 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo25 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList26 = com.google.common.collect.ImmutableList.of(jSDocInfo22, jSDocInfo23, jSDocInfo24, jSDocInfo25);
        boolean boolean28 = jSDocInfo24.hasParameterType("hi!");
        boolean boolean29 = jSDocInfo24.hasReturnType();
        boolean boolean30 = jSDocInfo24.hasModifies();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection31 = jSDocInfo24.getTypeNodes();
        java.util.Spliterator<com.google.javascript.rhino.Node> nodeSpliterator32 = nodeCollection31.spliterator();
        boolean boolean33 = objList2.equals((java.lang.Object) nodeCollection31);
        java.util.stream.Stream<java.lang.Object> objStream34 = objList2.stream();
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10, 0]");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeIterable11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSTypeStaticSlot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(nodeCollection31);
        org.junit.Assert.assertNotNull(nodeSpliterator32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objStream34);
    }

    @Test
    public void test00724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00724");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean4 = node3.hasOneChild();
        node3.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable7 = node3.getAncestors();
        int int8 = node3.getChildCount();
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo12 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList13 = com.google.common.collect.ImmutableList.of(jSDocInfo9, jSDocInfo10, jSDocInfo11, jSDocInfo12);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression14 = jSDocInfo12.getReturnType();
        boolean boolean15 = jSDocInfo12.hasEnumParameterType();
        node3.setJSDocInfo(jSDocInfo12);
        // The following exception was thrown during execution in test generation
        try {
            node3.setString("NUMBER 0.0 36");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: NUMBER 0.0 36 [jsdoc_info: JSDocInfo] is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(ancestorIterable7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(jSDocInfoList13);
        org.junit.Assert.assertNull(jSTypeExpression14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00725");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType3 = jSTypeRegistry1.getType("hi!");
        jSTypeRegistry1.setLastGeneration(true);
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable14 = node13.children();
        boolean boolean15 = node13.isQuotedString();
        com.google.javascript.rhino.Node node16 = node13.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType17 = jSTypeRegistry8.createFunctionType(jSType9, node16);
        boolean boolean18 = functionType17.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList19 = functionType17.getSubTypes();
        com.google.javascript.rhino.Node node20 = functionType17.getRootNode();
        java.util.Set<java.lang.String> strSet21 = functionType17.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope23 = null;
        com.google.javascript.rhino.jstype.JSType jSType24 = functionType17.resolve(errorReporter22, jSTypeStaticScope23);
        // The following exception was thrown during execution in test generation
        try {
            jSTypeRegistry1.overwriteDeclaredType("function ({842248975}): {842248975}", jSType24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeIterable14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(functionType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(functionTypeList19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(jSType24);
    }

    @Test
    public void test00726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00726");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean4 = node3.hasOneChild();
        node3.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable7 = node3.getAncestors();
        int int8 = node3.getChildCount();
        java.lang.String str9 = node3.toString();
        int int10 = node3.getChildCount();
        boolean boolean11 = node3.isNot();
        boolean boolean12 = node3.isGetterDef();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = node3.getExistingIntProp(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 32");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(ancestorIterable7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "NUMBER 0.0 36" + "'", str9, "NUMBER 0.0 36");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00727");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean13 = functionType10.isPropertyTypeInferred("JSDocInfo");
        com.google.javascript.rhino.jstype.JSType jSType14 = functionType10.autobox();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSType14);
    }

    @Test
    public void test00728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00728");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean13 = functionType10.isPropertyTypeInferred("JSDocInfo");
        boolean boolean15 = functionType10.hasOwnProperty("");
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node22.children();
        boolean boolean24 = node22.isQuotedString();
        com.google.javascript.rhino.Node node25 = node22.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry17.createFunctionType(jSType18, node25);
        boolean boolean27 = functionType26.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType26.getPropertyType("InputId: hi!");
        boolean boolean30 = functionType10.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType26);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable40 = node39.children();
        boolean boolean41 = node39.isQuotedString();
        com.google.javascript.rhino.Node node42 = node39.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType43 = jSTypeRegistry34.createFunctionType(jSType35, node42);
        boolean boolean44 = functionType43.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList45 = functionType43.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable53 = node52.children();
        boolean boolean54 = node52.isQuotedString();
        com.google.javascript.rhino.Node node55 = node52.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry47.createFunctionType(jSType48, node55);
        boolean boolean57 = functionType56.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] { functionType43, functionType56 };
        com.google.javascript.rhino.jstype.JSType jSType59 = jSTypeRegistry32.createUnionType(jSTypeArray58);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope60 = null;
        com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry32.getType(jSTypeStaticScope60, "[10, 0]", "", (int) (byte) 1, (int) (byte) 10);
        com.google.javascript.rhino.ErrorReporter errorReporter66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter66);
        com.google.javascript.rhino.jstype.JSType jSType68 = null;
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable73 = node72.children();
        boolean boolean74 = node72.isQuotedString();
        com.google.javascript.rhino.Node node75 = node72.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType76 = jSTypeRegistry67.createFunctionType(jSType68, node75);
        boolean boolean77 = functionType76.isArrayType();
        boolean boolean78 = jSType65.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType76);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue79 = functionType26.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType76);
        com.google.javascript.rhino.JSDocInfo jSDocInfo80 = functionType26.getJSDocInfo();
        boolean boolean81 = functionType26.isNativeObjectType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeIterable23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(nodeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(functionType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(functionTypeList45);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(nodeIterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertNotNull(jSType59);
        org.junit.Assert.assertNotNull(jSType65);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(nodeIterable73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(node75);
        org.junit.Assert.assertNotNull(functionType76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(ternaryValue79);
        org.junit.Assert.assertNull(jSDocInfo80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test00729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00729");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.String str3 = objList2.toString();
        java.lang.Object[] objArray13 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList14 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList14, objArray13);
        java.lang.Object[] objArray16 = objList14.toArray();
        java.util.stream.Stream<java.lang.Object> objStream17 = objList14.parallelStream();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean20 = objList14.equals((java.lang.Object) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = objList2.retainAll((java.util.Collection<java.lang.Object>) objList14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[10, 0]" + "'", str3, "[10, 0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00730");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean13 = functionType10.isPropertyTypeInferred("JSDocInfo");
        boolean boolean15 = functionType10.hasOwnProperty("");
        com.google.javascript.rhino.Node node16 = functionType10.getParametersNode();
        boolean boolean17 = functionType10.hasCachedValues();
        com.google.javascript.rhino.jstype.ObjectType objectType18 = functionType10.getParentScope();
        boolean boolean19 = functionType10.matchesNumberContext();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objectType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00731");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        node3.detachChildren();
        node3.setLineno(16);
        boolean boolean14 = node3.isSwitch();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(39, node19);
        boolean boolean21 = node20.isIf();
        node20.detachChildren();
        boolean boolean23 = node3.hasChild(node20);
        boolean boolean24 = node3.isDebugger();
        boolean boolean25 = node3.isFalse();
        boolean boolean26 = node3.isAssign();
        com.google.javascript.rhino.Node node27 = node3.cloneNode();
        // The following exception was thrown during execution in test generation
        try {
            node3.setSideEffectFlags(47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got NUMBER");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test00732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00732");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream3 = objList2.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList4 = objList2.asList();
        boolean boolean5 = objList2.isEmpty();
        java.util.Iterator<java.lang.Object> objItor6 = objList2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Object> objList9 = objList2.subList(49, 41);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start index (49) must not be greater than size (2)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objStream3);
        org.junit.Assert.assertNotNull(objList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objItor6);
    }

    @Test
    public void test00733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00733");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean12 = functionType10.isRegexpType();
        com.google.javascript.rhino.jstype.ObjectType objectType13 = functionType10.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable14 = functionType10.getAllImplementedInterfaces();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.children();
        boolean boolean23 = node21.isQuotedString();
        com.google.javascript.rhino.Node node24 = node21.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry16.createFunctionType(jSType17, node24);
        boolean boolean26 = functionType25.isArrayType();
        boolean boolean27 = functionType25.isRegexpType();
        boolean boolean29 = functionType25.isPropertyTypeDeclared("InputId: hi!");
        boolean boolean30 = functionType10.differsFrom((com.google.javascript.rhino.jstype.JSType) functionType25);
        boolean boolean31 = functionType25.isNominalType();
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable40 = node39.children();
        boolean boolean41 = node39.isQuotedString();
        com.google.javascript.rhino.Node node42 = node39.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType43 = jSTypeRegistry34.createFunctionType(jSType35, node42);
        com.google.javascript.rhino.jstype.JSType jSType45 = jSTypeRegistry34.getType("");
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable53 = node52.children();
        boolean boolean54 = node52.isQuotedString();
        com.google.javascript.rhino.Node node55 = node52.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry47.createFunctionType(jSType48, node55);
        boolean boolean57 = functionType56.isArrayType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet58 = functionType56.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable68 = node67.children();
        boolean boolean69 = node67.isQuotedString();
        com.google.javascript.rhino.Node node70 = node67.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType71 = jSTypeRegistry62.createFunctionType(jSType63, node70);
        boolean boolean72 = functionType71.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList73 = functionType71.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter74 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry75 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter74);
        com.google.javascript.rhino.jstype.JSType jSType76 = null;
        com.google.javascript.rhino.Node node80 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable81 = node80.children();
        boolean boolean82 = node80.isQuotedString();
        com.google.javascript.rhino.Node node83 = node80.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType84 = jSTypeRegistry75.createFunctionType(jSType76, node83);
        boolean boolean85 = functionType84.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray86 = new com.google.javascript.rhino.jstype.JSType[] { functionType71, functionType84 };
        com.google.javascript.rhino.jstype.JSType jSType87 = jSTypeRegistry60.createUnionType(jSTypeArray86);
        com.google.javascript.rhino.jstype.FunctionType functionType88 = jSTypeRegistry34.createFunctionTypeWithVarArgs((com.google.javascript.rhino.jstype.JSType) functionType56, jSTypeArray86);
        com.google.javascript.rhino.jstype.JSType jSType89 = functionType25.resolve(errorReporter32, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType56);
        boolean boolean90 = functionType25.isParameterizedType();
        boolean boolean91 = functionType25.isOrdinaryFunction();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objectType13);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(nodeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(functionType43);
        org.junit.Assert.assertNull(jSType45);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(nodeIterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet58 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet58.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(nodeIterable68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertNotNull(functionType71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(functionTypeList73);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertNotNull(nodeIterable81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNull(node83);
        org.junit.Assert.assertNotNull(functionType84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(jSTypeArray86);
        org.junit.Assert.assertNotNull(jSType87);
        org.junit.Assert.assertNotNull(functionType88);
        org.junit.Assert.assertNotNull(jSType89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
    }

    @Test
    public void test00734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00734");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int5 = node4.getSourceOffset();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node9.children();
        node4.addChildrenToBack(node9);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int16 = node15.getSourceOffset();
        com.google.javascript.rhino.Node node17 = node4.useSourceInfoIfMissingFrom(node15);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(10, node4, 49, (int) (short) 100);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean23 = node20.isEquivalentTo(node22);
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec25 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("Unknown class name");
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int30 = node29.getSourceOffset();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable35 = node34.children();
        node29.addChildrenToBack(node34);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int41 = node40.getSourceOffset();
        com.google.javascript.rhino.Node node42 = node29.useSourceInfoIfMissingFrom(node40);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean47 = node46.hasOneChild();
        node46.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable50 = node46.getAncestors();
        int int51 = node46.getLineno();
        boolean boolean52 = node46.isLocalResultCall();
        com.google.javascript.rhino.Node node53 = node42.useSourceInfoFromForTree(node46);
        com.google.javascript.rhino.Node node54 = assertionFunctionSpec25.getAssertedParam(node42);
        int int55 = node20.getIndexOfChild(node54);
        node20.setOptionalArg(true);
        com.google.javascript.rhino.Node node58 = node20.cloneNode();
        int int59 = node58.getCharno();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(nodeIterable35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(ancestorIterable50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 36 + "'", int51 == 36);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 100 + "'", int59 == 100);
    }

    @Test
    public void test00735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00735");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int15 = node14.getSourceOffset();
        com.google.javascript.rhino.Node node16 = node3.useSourceInfoIfMissingFrom(node14);
        node16.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(39, node23);
        com.google.javascript.rhino.Node node25 = node16.srcref(node24);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int30 = node29.getSourceOffset();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable35 = node34.children();
        node29.addChildrenToBack(node34);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int41 = node40.getSourceOffset();
        com.google.javascript.rhino.Node node42 = node29.useSourceInfoIfMissingFrom(node40);
        com.google.javascript.rhino.Node node43 = node24.clonePropsFrom(node42);
        java.util.Set<java.lang.String> strSet44 = node24.getDirectives();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str45 = node24.getString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Number node not created with Node.newNumber");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(nodeIterable35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNull(strSet44);
    }

    @Test
    public void test00736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00736");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        com.google.common.collect.ImmutableList<java.lang.Object> objList6 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray26 = new java.lang.Object[] { "", 10L, (short) -1, (short) 100, 0, ' ', (-1), 1.0d, 100.0f, 39, ' ', 1.0d, (byte) 0, 0L, 10.0f, "hi!", ' ', 0, 10.0f, 43, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList27 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList27, objArray26);
        boolean boolean30 = objList27.add((java.lang.Object) 100.0d);
        boolean boolean31 = objList2.containsAll((java.util.Collection<java.lang.Object>) objList27);
        java.lang.Object obj32 = null;
        boolean boolean33 = objList27.remove(obj32);
        com.google.common.collect.ImmutableList<java.lang.Object> objList36 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray37 = objList36.toArray();
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable45 = node44.children();
        boolean boolean46 = node44.isQuotedString();
        com.google.javascript.rhino.Node node47 = node44.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry39.createFunctionType(jSType40, node47);
        boolean boolean49 = functionType48.isArrayType();
        boolean boolean50 = functionType48.isRegexpType();
        com.google.javascript.rhino.jstype.JSType jSType52 = functionType48.findPropertyType("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot54 = functionType48.getOwnSlot("hi!");
        boolean boolean55 = objList36.contains((java.lang.Object) "hi!");
        com.google.javascript.rhino.JSDocInfo jSDocInfo56 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo57 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo58 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo59 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList60 = com.google.common.collect.ImmutableList.of(jSDocInfo56, jSDocInfo57, jSDocInfo58, jSDocInfo59);
        boolean boolean62 = jSDocInfo58.hasParameterType("hi!");
        boolean boolean63 = jSDocInfo58.hasReturnType();
        boolean boolean64 = jSDocInfo58.hasModifies();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection65 = jSDocInfo58.getTypeNodes();
        java.util.Spliterator<com.google.javascript.rhino.Node> nodeSpliterator66 = nodeCollection65.spliterator();
        boolean boolean67 = objList36.equals((java.lang.Object) nodeCollection65);
        boolean boolean68 = objList27.retainAll((java.util.Collection<java.lang.Object>) objList36);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj70 = objList36.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objList6);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objList36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[10, 0]");
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(nodeIterable45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNotNull(functionType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(jSType52);
        org.junit.Assert.assertNull(jSTypeStaticSlot54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(nodeCollection65);
        org.junit.Assert.assertNotNull(nodeSpliterator66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test00737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00737");
        java.lang.Object[] objArray9 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList10 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList10, objArray9);
        java.lang.Object[] objArray12 = objList10.toArray();
        java.util.stream.Stream<java.lang.Object> objStream13 = objList10.parallelStream();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean16 = objList10.equals((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray17 = objList10.toArray();
        int int18 = objList10.size();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
    }

    @Test
    public void test00738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00738");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType10.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType14 = functionType10.toMaybeFunctionType();
        boolean boolean16 = functionType14.removeProperty("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable17 = functionType14.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType18 = functionType14.getParameterType();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable26 = node25.children();
        boolean boolean27 = node25.isQuotedString();
        com.google.javascript.rhino.Node node28 = node25.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry20.createFunctionType(jSType21, node28);
        boolean boolean30 = functionType14.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType29);
        boolean boolean31 = functionType14.isNullable();
        com.google.javascript.rhino.jstype.JSType jSType33 = functionType14.getPropertyType("");
        boolean boolean34 = functionType14.isOrdinaryFunction();
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable42 = node41.children();
        boolean boolean43 = node41.isQuotedString();
        com.google.javascript.rhino.Node node44 = node41.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSTypeRegistry36.createFunctionType(jSType37, node44);
        boolean boolean46 = functionType45.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType47 = functionType45.restrictByNotNullOrUndefined();
        java.util.Set<java.lang.String> strSet48 = functionType45.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType49 = functionType45.toMaybeParameterizedType();
        boolean boolean50 = functionType14.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType45);
        boolean boolean51 = functionType45.isNativeObjectType();
        com.google.javascript.rhino.jstype.FunctionType functionType52 = functionType45.getOwnerFunction();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53);
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable60 = node59.children();
        boolean boolean61 = node59.isQuotedString();
        com.google.javascript.rhino.Node node62 = node59.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry54.createFunctionType(jSType55, node62);
        boolean boolean64 = functionType63.isArrayType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet65 = functionType63.getPossibleToBooleanOutcomes();
        boolean boolean66 = functionType63.isStringValueType();
        boolean boolean67 = functionType45.hasEqualCallType(functionType63);
        boolean boolean68 = functionType63.hasInstanceType();
        boolean boolean70 = functionType63.isPropertyInExterns("function ({1040007472}): {1040007472}");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jSType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(nodeIterable42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNotNull(functionType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(jSType47);
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertNull(parameterizedType49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(functionType52);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(nodeIterable60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet65 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet65.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test00739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00739");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "function ({774120819}): {774120819}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00740");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = functionType10.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType12 = functionType11.toMaybeEnumElementType();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node19.children();
        boolean boolean21 = node19.isQuotedString();
        com.google.javascript.rhino.Node node22 = node19.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry14.createFunctionType(jSType15, node22);
        boolean boolean24 = functionType23.isArrayType();
        java.lang.String str25 = functionType23.toAnnotationString();
        boolean boolean26 = functionType23.isStringObjectType();
        functionType11.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType23);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot29 = functionType11.getSlot("function ({1110454636}): {1110454636}");
        boolean boolean30 = functionType11.canBeCalled();
        boolean boolean31 = functionType11.matchesUint32Context();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertNull(enumElementType12);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "function (...[?]): ?" + "'", str25, "function (...[?]): ?");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test00741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00741");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        boolean boolean10 = node8.isQuotedString();
        com.google.javascript.rhino.Node node11 = node8.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry3.createFunctionType(jSType4, node11);
        boolean boolean13 = functionType12.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList14 = functionType12.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.children();
        boolean boolean23 = node21.isQuotedString();
        com.google.javascript.rhino.Node node24 = node21.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry16.createFunctionType(jSType17, node24);
        boolean boolean26 = functionType25.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] { functionType12, functionType25 };
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry1.createUnionType(jSTypeArray27);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope29 = null;
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry1.getType(jSTypeStaticScope29, "[10, 0]", "", (int) (byte) 1, (int) (byte) 10);
        com.google.javascript.rhino.ErrorReporter errorReporter35 = jSTypeRegistry1.getErrorReporter();
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative36 = null;
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray37 = new com.google.javascript.rhino.jstype.JSTypeNative[] { jSTypeNative36 };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType38 = jSTypeRegistry1.createUnionType(jSTypeNativeArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(functionTypeList14);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertNull(errorReporter35);
        org.junit.Assert.assertNotNull(jSTypeNativeArray37);
    }

    @Test
    public void test00742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00742");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean12 = functionType10.isRegexpType();
        com.google.javascript.rhino.jstype.JSType jSType14 = functionType10.findPropertyType("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot16 = functionType10.getOwnSlot("hi!");
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList22 = com.google.common.collect.ImmutableList.of(jSDocInfo18, jSDocInfo19, jSDocInfo20, jSDocInfo21);
        java.util.Set<java.lang.String> strSet23 = jSDocInfo21.getSuppressions();
        functionType10.setPropertyJSDocInfo("", jSDocInfo21);
        boolean boolean25 = jSDocInfo21.isHidden();
        jSDocInfo21.addSuppression("function ({1873536480}): {1873536480}");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSTypeStaticSlot16);
        org.junit.Assert.assertNotNull(jSDocInfoList22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test00743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00743");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean12 = functionType10.isRegexpType();
        com.google.javascript.rhino.jstype.ObjectType objectType13 = functionType10.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable14 = objectType13.getCtorExtendedInterfaces();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList19 = com.google.common.collect.ImmutableList.of(jSDocInfo15, jSDocInfo16, jSDocInfo17, jSDocInfo18);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression20 = jSDocInfo18.getReturnType();
        boolean boolean21 = jSDocInfo18.isImplicitCast();
        objectType13.setJSDocInfo(jSDocInfo18);
        boolean boolean23 = jSDocInfo18.isNoSideEffects();
        boolean boolean24 = jSDocInfo18.isExpose();
        jSDocInfo18.setLicense("function ({2141952508}): {2141952508}");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objectType13);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertNotNull(jSDocInfoList19);
        org.junit.Assert.assertNull(jSTypeExpression20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00744");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.ErrorReporter errorReporter4 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable11 = node10.children();
        boolean boolean12 = node10.isQuotedString();
        com.google.javascript.rhino.Node node13 = node10.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry5.createFunctionType(jSType6, node13);
        boolean boolean15 = functionType14.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList16 = functionType14.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable24 = node23.children();
        boolean boolean25 = node23.isQuotedString();
        com.google.javascript.rhino.Node node26 = node23.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry18.createFunctionType(jSType19, node26);
        boolean boolean28 = functionType27.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] { functionType14, functionType27 };
        com.google.javascript.rhino.jstype.JSType jSType30 = jSTypeRegistry3.createUnionType(jSTypeArray29);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope31 = null;
        com.google.javascript.rhino.jstype.JSType jSType36 = jSTypeRegistry3.getType(jSTypeStaticScope31, "[10, 0]", "", (int) (byte) 1, (int) (byte) 10);
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable44 = node43.children();
        boolean boolean45 = node43.isQuotedString();
        com.google.javascript.rhino.Node node46 = node43.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType47 = jSTypeRegistry38.createFunctionType(jSType39, node46);
        boolean boolean48 = functionType47.isArrayType();
        boolean boolean49 = jSType36.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType47);
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType50 = functionType47.toMaybeParameterizedType();
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51);
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable58 = node57.children();
        boolean boolean59 = node57.isQuotedString();
        com.google.javascript.rhino.Node node60 = node57.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType61 = jSTypeRegistry52.createFunctionType(jSType53, node60);
        com.google.javascript.rhino.ErrorReporter errorReporter62 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter62);
        com.google.javascript.rhino.ErrorReporter errorReporter64 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter64);
        com.google.javascript.rhino.jstype.JSType jSType66 = null;
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable71 = node70.children();
        boolean boolean72 = node70.isQuotedString();
        com.google.javascript.rhino.Node node73 = node70.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType74 = jSTypeRegistry65.createFunctionType(jSType66, node73);
        boolean boolean75 = functionType74.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList76 = functionType74.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter77 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry78 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter77);
        com.google.javascript.rhino.jstype.JSType jSType79 = null;
        com.google.javascript.rhino.Node node83 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable84 = node83.children();
        boolean boolean85 = node83.isQuotedString();
        com.google.javascript.rhino.Node node86 = node83.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry78.createFunctionType(jSType79, node86);
        boolean boolean88 = functionType87.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray89 = new com.google.javascript.rhino.jstype.JSType[] { functionType74, functionType87 };
        com.google.javascript.rhino.jstype.JSType jSType90 = jSTypeRegistry63.createUnionType(jSTypeArray89);
        com.google.javascript.rhino.Node node91 = jSTypeRegistry52.createOptionalParameters(jSTypeArray89);
        com.google.javascript.rhino.jstype.FunctionType functionType92 = jSTypeRegistry1.createConstructorTypeWithVarArgs((com.google.javascript.rhino.jstype.JSType) parameterizedType50, jSTypeArray89);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope93 = null;
        jSTypeRegistry1.resolveTypesInScope(jSTypeStaticScope93);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeIterable11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(functionTypeList16);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeIterable24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(jSType30);
        org.junit.Assert.assertNotNull(jSType36);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(nodeIterable44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(functionType47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(parameterizedType50);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(nodeIterable58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertNotNull(functionType61);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(nodeIterable71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertNotNull(functionType74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNull(functionTypeList76);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertNotNull(nodeIterable84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNull(node86);
        org.junit.Assert.assertNotNull(functionType87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(jSTypeArray89);
        org.junit.Assert.assertNotNull(jSType90);
        org.junit.Assert.assertNotNull(node91);
        org.junit.Assert.assertNotNull(functionType92);
    }

    @Test
    public void test00745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00745");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        boolean boolean5 = node3.isQuotedString();
        node3.setLength(0);
        boolean boolean8 = node3.isScript();
        boolean boolean9 = node3.isName();
        boolean boolean10 = node3.isSyntheticBlock();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00746");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean12 = functionType10.isRegexpType();
        com.google.javascript.rhino.jstype.ObjectType objectType13 = functionType10.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable14 = objectType13.getCtorExtendedInterfaces();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList19 = com.google.common.collect.ImmutableList.of(jSDocInfo15, jSDocInfo16, jSDocInfo17, jSDocInfo18);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression20 = jSDocInfo18.getReturnType();
        boolean boolean21 = jSDocInfo18.isImplicitCast();
        objectType13.setJSDocInfo(jSDocInfo18);
        boolean boolean23 = jSDocInfo18.isHidden();
        java.util.Set<java.lang.String> strSet24 = jSDocInfo18.getSuppressions();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression25 = jSDocInfo18.getEnumParameterType();
        boolean boolean26 = jSDocInfo18.isExterns();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objectType13);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertNotNull(jSDocInfoList19);
        org.junit.Assert.assertNull(jSTypeExpression20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNull(jSTypeExpression25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test00747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00747");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType10.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType14 = functionType10.toMaybeFunctionType();
        boolean boolean16 = functionType14.removeProperty("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable17 = functionType14.getExtendedInterfaces();
        boolean boolean18 = functionType14.isNumberObjectType();
        com.google.javascript.rhino.jstype.JSType jSType20 = functionType14.getPropertyType("NUMBER 0.0 36");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot22 = functionType14.getOwnSlot("[10, 0]");
        java.util.Set<java.lang.String> strSet23 = functionType14.getOwnPropertyNames();
        boolean boolean24 = strSet23.isEmpty();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jSType20);
        org.junit.Assert.assertNull(jSTypeStaticSlot22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test00748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00748");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        boolean boolean5 = jSDocInfo2.isExport();
        boolean boolean6 = jSDocInfo2.containsDeclaration();
        boolean boolean7 = jSDocInfo2.isInterface();
        com.google.javascript.rhino.Node node8 = jSDocInfo2.getAssociatedNode();
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test00749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00749");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean4 = node3.hasOneChild();
        node3.setLength(0);
        boolean boolean7 = node3.isNumber();
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node9 = node3.srcrefTree(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00750");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags0 = new com.google.javascript.rhino.Node.SideEffectFlags();
        sideEffectFlags0.setMutatesThis();
        sideEffectFlags0.setMutatesThis();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags4 = new com.google.javascript.rhino.Node.SideEffectFlags(10);
        sideEffectFlags4.clearAllFlags();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags6 = new com.google.javascript.rhino.Node.SideEffectFlags();
        sideEffectFlags6.setMutatesThis();
        sideEffectFlags6.setAllFlags();
        boolean boolean9 = sideEffectFlags6.areAllFlagsSet();
        sideEffectFlags6.clearSideEffectFlags();
        com.google.javascript.rhino.Node.SideEffectFlags[] sideEffectFlagsArray11 = new com.google.javascript.rhino.Node.SideEffectFlags[] { sideEffectFlags0, sideEffectFlags4, sideEffectFlags6 };
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.Node.SideEffectFlags> sideEffectFlagsList12 = com.google.common.collect.ImmutableList.copyOf(sideEffectFlagsArray11);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(sideEffectFlagsArray11);
        org.junit.Assert.assertNotNull(sideEffectFlagsList12);
    }

    @Test
    public void test00751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00751");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = jSTypeRegistry1.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable17 = node16.children();
        boolean boolean18 = node16.isQuotedString();
        node16.setLength(0);
        boolean boolean21 = node16.isNew();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable29 = node28.children();
        boolean boolean30 = node28.isQuotedString();
        com.google.javascript.rhino.Node node31 = node28.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry23.createFunctionType(jSType24, node31);
        boolean boolean33 = functionType32.isArrayType();
        boolean boolean35 = functionType32.isPropertyTypeInferred("JSDocInfo");
        boolean boolean37 = functionType32.hasOwnProperty("");
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable45 = node44.children();
        boolean boolean46 = node44.isQuotedString();
        com.google.javascript.rhino.Node node47 = node44.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry39.createFunctionType(jSType40, node47);
        boolean boolean49 = functionType48.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType51 = functionType48.getPropertyType("InputId: hi!");
        boolean boolean52 = functionType32.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType48);
        boolean boolean53 = functionType48.canBeCalled();
        boolean boolean54 = functionType48.isInstanceType();
        com.google.javascript.rhino.jstype.ObjectType objectType55 = jSTypeRegistry1.createObjectType("hi!", node16, (com.google.javascript.rhino.jstype.ObjectType) functionType48);
        boolean boolean56 = node16.isGetProp();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeIterable17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(nodeIterable29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(nodeIterable45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNotNull(functionType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(jSType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(objectType55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test00752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00752");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet12 = functionType10.getPossibleToBooleanOutcomes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable13 = functionType10.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType14 = functionType10.getParameterType();
        com.google.javascript.rhino.jstype.FunctionType functionType15 = functionType10.getConstructor();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType16 = functionType15.autoboxesTo();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet12 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet12.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(objectTypeIterable13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(functionType15);
    }

    @Test
    public void test00753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00753");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType10.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType14 = functionType10.toMaybeFunctionType();
        boolean boolean16 = functionType14.removeProperty("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable17 = functionType14.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType18 = functionType14.getParameterType();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable26 = node25.children();
        boolean boolean27 = node25.isQuotedString();
        com.google.javascript.rhino.Node node28 = node25.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry20.createFunctionType(jSType21, node28);
        boolean boolean30 = functionType14.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType29);
        boolean boolean32 = functionType29.isPropertyTypeDeclared("[10, 0]");
        com.google.javascript.rhino.jstype.EnumElementType enumElementType33 = functionType29.toMaybeEnumElementType();
        com.google.javascript.rhino.jstype.ObjectType objectType35 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface((com.google.javascript.rhino.jstype.ObjectType) functionType29, "unknown");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(enumElementType33);
        org.junit.Assert.assertNull(objectType35);
    }

    @Test
    public void test00754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00754");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor4 = objList2.listIterator();
        boolean boolean6 = objList2.contains((java.lang.Object) (short) 10);
        java.lang.Object obj7 = null;
        boolean boolean8 = objList2.equals(obj7);
        java.lang.String str9 = objList2.toString();
        java.lang.Object[] objArray19 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList20 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList20, objArray19);
        java.lang.Object[] objArray22 = objList20.toArray();
        java.util.stream.Stream<java.lang.Object> objStream23 = objList20.parallelStream();
        int int24 = objList20.size();
        boolean boolean25 = objList2.containsAll((java.util.Collection<java.lang.Object>) objList20);
        java.util.ListIterator<java.lang.Object> objItor26 = objList2.listIterator();
        boolean boolean27 = objList2.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor29 = objList2.listIterator(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: index (4) must not be greater than size (2)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[10, 0]" + "'", str9, "[10, 0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objItor26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test00755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00755");
        java.lang.Object[] objArray9 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList10 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList10, objArray9);
        java.lang.Object[] objArray12 = objList10.toArray();
        java.util.stream.Stream<java.lang.Object> objStream13 = objList10.parallelStream();
        com.google.javascript.rhino.JSDocInfo jSDocInfo14 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean15 = jSDocInfo14.isNoCompile();
        java.lang.String str16 = jSDocInfo14.toString();
        boolean boolean17 = jSDocInfo14.isExpose();
        int int18 = jSDocInfo14.getExtendedInterfacesCount();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection19 = jSDocInfo14.getTypeNodes();
        boolean boolean20 = objList10.contains((java.lang.Object) jSDocInfo14);
        boolean boolean21 = jSDocInfo14.hasType();
        boolean boolean22 = jSDocInfo14.isNoSideEffects();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility23 = com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC;
        jSDocInfo14.setVisibility(visibility23);
        java.util.Set<java.lang.String> strSet25 = jSDocInfo14.getParameterNames();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable33 = node32.children();
        boolean boolean34 = node32.isQuotedString();
        com.google.javascript.rhino.Node node35 = node32.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry27.createFunctionType(jSType28, node35);
        boolean boolean37 = functionType36.isArrayType();
        boolean boolean38 = functionType36.isRegexpType();
        com.google.javascript.rhino.jstype.ObjectType objectType39 = functionType36.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable40 = objectType39.getCtorExtendedInterfaces();
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo42 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo43 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo44 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList45 = com.google.common.collect.ImmutableList.of(jSDocInfo41, jSDocInfo42, jSDocInfo43, jSDocInfo44);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression46 = jSDocInfo44.getReturnType();
        boolean boolean47 = jSDocInfo44.isImplicitCast();
        objectType39.setJSDocInfo(jSDocInfo44);
        boolean boolean49 = jSDocInfo44.isHidden();
        java.util.Set<java.lang.String> strSet50 = jSDocInfo44.getSuppressions();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression51 = jSDocInfo44.getEnumParameterType();
        boolean boolean52 = strSet25.contains((java.lang.Object) jSDocInfo44);
        java.lang.String str53 = jSDocInfo44.getVersion();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JSDocInfo" + "'", str16, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(nodeCollection19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + visibility23 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC + "'", visibility23.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC));
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(nodeIterable33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objectType39);
        org.junit.Assert.assertNotNull(objectTypeIterable40);
        org.junit.Assert.assertNotNull(jSDocInfoList45);
        org.junit.Assert.assertNull(jSTypeExpression46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strSet50);
        org.junit.Assert.assertNull(jSTypeExpression51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(str53);
    }

    @Test
    public void test00756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00756");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int9 = node8.getSourceOffset();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable14 = node13.children();
        node8.addChildrenToBack(node13);
        node8.detachChildren();
        boolean boolean17 = node8.isOr();
        com.google.javascript.rhino.Node node18 = node3.copyInformationFrom(node8);
        boolean boolean19 = node8.isNE();
        node8.setLength(0);
        boolean boolean22 = node8.isSyntheticBlock();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeIterable14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00757");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean12 = functionType10.isRegexpType();
        com.google.javascript.rhino.jstype.FunctionType functionType13 = functionType10.getConstructor();
        com.google.common.collect.ImmutableList<java.lang.String> strList14 = functionType10.getTemplateTypeNames();
        boolean boolean15 = functionType10.isArrayType();
        boolean boolean16 = functionType10.isObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType17 = functionType10.cloneWithoutArrowType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(functionType13);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test00758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00758");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int5 = node4.getSourceOffset();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node9.children();
        node4.addChildrenToBack(node9);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int16 = node15.getSourceOffset();
        com.google.javascript.rhino.Node node17 = node4.useSourceInfoIfMissingFrom(node15);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(10, node4, 49, (int) (short) 100);
        boolean boolean21 = node4.isComma();
        boolean boolean22 = node4.isScript();
        com.google.javascript.rhino.Node node23 = node4.getParent();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newExpr(node4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test00759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00759");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        com.google.common.collect.ImmutableList<java.lang.Object> objList6 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray26 = new java.lang.Object[] { "", 10L, (short) -1, (short) 100, 0, ' ', (-1), 1.0d, 100.0f, 39, ' ', 1.0d, (byte) 0, 0L, 10.0f, "hi!", ' ', 0, 10.0f, 43, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList27 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList27, objArray26);
        boolean boolean30 = objList27.add((java.lang.Object) 100.0d);
        boolean boolean31 = objList2.containsAll((java.util.Collection<java.lang.Object>) objList27);
        java.lang.Object obj32 = null;
        boolean boolean33 = objList27.remove(obj32);
        com.google.common.collect.ImmutableList<java.lang.Object> objList36 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray37 = objList36.toArray();
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable45 = node44.children();
        boolean boolean46 = node44.isQuotedString();
        com.google.javascript.rhino.Node node47 = node44.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry39.createFunctionType(jSType40, node47);
        boolean boolean49 = functionType48.isArrayType();
        boolean boolean50 = functionType48.isRegexpType();
        com.google.javascript.rhino.jstype.JSType jSType52 = functionType48.findPropertyType("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot54 = functionType48.getOwnSlot("hi!");
        boolean boolean55 = objList36.contains((java.lang.Object) "hi!");
        com.google.javascript.rhino.JSDocInfo jSDocInfo56 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo57 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo58 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo59 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList60 = com.google.common.collect.ImmutableList.of(jSDocInfo56, jSDocInfo57, jSDocInfo58, jSDocInfo59);
        boolean boolean62 = jSDocInfo58.hasParameterType("hi!");
        boolean boolean63 = jSDocInfo58.hasReturnType();
        boolean boolean64 = jSDocInfo58.hasModifies();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection65 = jSDocInfo58.getTypeNodes();
        java.util.Spliterator<com.google.javascript.rhino.Node> nodeSpliterator66 = nodeCollection65.spliterator();
        boolean boolean67 = objList36.equals((java.lang.Object) nodeCollection65);
        boolean boolean68 = objList27.retainAll((java.util.Collection<java.lang.Object>) objList36);
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor70 = objList36.listIterator(42);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: index (42) must not be greater than size (2)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objList6);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objList36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[10, 0]");
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(nodeIterable45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNotNull(functionType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(jSType52);
        org.junit.Assert.assertNull(jSTypeStaticSlot54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(nodeCollection65);
        org.junit.Assert.assertNotNull(nodeSpliterator66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test00760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00760");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        boolean boolean6 = jSDocInfo0.hasDescriptionForParameter("");
        java.lang.String str7 = jSDocInfo0.getDescription();
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00761");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        boolean boolean2 = jSTypeRegistry1.shouldTolerateUndefinedValues();
        jSTypeRegistry1.identifyNonNullableName("NUMBER 0.0 36");
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType6 = jSTypeRegistry1.createOptionalNullableType(jSType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00762");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean13 = functionType10.isPropertyTypeInferred("JSDocInfo");
        boolean boolean15 = functionType10.hasOwnProperty("");
        com.google.javascript.rhino.jstype.JSType jSType16 = functionType10.autoboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType17 = functionType10.getTypeOfThis();
        boolean boolean18 = jSType17.isNullType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNotNull(jSType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00763");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean13 = functionType10.isPropertyTypeInferred("JSDocInfo");
        boolean boolean15 = functionType10.hasOwnProperty("");
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node22.children();
        boolean boolean24 = node22.isQuotedString();
        com.google.javascript.rhino.Node node25 = node22.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry17.createFunctionType(jSType18, node25);
        boolean boolean27 = functionType26.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType26.getPropertyType("InputId: hi!");
        boolean boolean30 = functionType10.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType26);
        boolean boolean31 = functionType26.canBeCalled();
        boolean boolean32 = functionType26.isInstanceType();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable40 = node39.children();
        boolean boolean41 = node39.isQuotedString();
        com.google.javascript.rhino.Node node42 = node39.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType43 = jSTypeRegistry34.createFunctionType(jSType35, node42);
        boolean boolean44 = functionType43.isArrayType();
        boolean boolean45 = functionType43.isRegexpType();
        com.google.javascript.rhino.jstype.JSType jSType47 = functionType43.findPropertyType("");
        functionType43.clearCachedValues();
        boolean boolean49 = functionType26.differsFrom((com.google.javascript.rhino.jstype.JSType) functionType43);
        java.util.Set<java.lang.String> strSet50 = functionType43.getOwnPropertyNames();
        boolean boolean51 = functionType43.isNominalConstructor();
        java.lang.String str52 = functionType43.getNormalizedReferenceName();
        boolean boolean53 = functionType43.isNominalConstructor();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeIterable23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(nodeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(functionType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(jSType47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(strSet50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test00764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00764");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        boolean boolean10 = node8.isQuotedString();
        com.google.javascript.rhino.Node node11 = node8.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry3.createFunctionType(jSType4, node11);
        boolean boolean13 = functionType12.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList14 = functionType12.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.children();
        boolean boolean23 = node21.isQuotedString();
        com.google.javascript.rhino.Node node24 = node21.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry16.createFunctionType(jSType17, node24);
        boolean boolean26 = functionType25.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] { functionType12, functionType25 };
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry1.createUnionType(jSTypeArray27);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope29 = null;
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry1.getType(jSTypeStaticScope29, "[10, 0]", "", (int) (byte) 1, (int) (byte) 10);
        com.google.javascript.rhino.jstype.JSType jSType36 = jSTypeRegistry1.getType("");
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39);
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable46 = node45.children();
        boolean boolean47 = node45.isQuotedString();
        com.google.javascript.rhino.Node node48 = node45.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry40.createFunctionType(jSType41, node48);
        boolean boolean50 = functionType49.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList51 = functionType49.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52);
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable59 = node58.children();
        boolean boolean60 = node58.isQuotedString();
        com.google.javascript.rhino.Node node61 = node58.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType62 = jSTypeRegistry53.createFunctionType(jSType54, node61);
        boolean boolean63 = functionType62.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray64 = new com.google.javascript.rhino.jstype.JSType[] { functionType49, functionType62 };
        com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry38.createUnionType(jSTypeArray64);
        boolean boolean66 = jSType65.matchesObjectContext();
        com.google.javascript.rhino.ErrorReporter errorReporter67 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry68 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter67);
        com.google.javascript.rhino.jstype.JSType jSType69 = null;
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable74 = node73.children();
        boolean boolean75 = node73.isQuotedString();
        com.google.javascript.rhino.Node node76 = node73.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType77 = jSTypeRegistry68.createFunctionType(jSType69, node76);
        boolean boolean78 = functionType77.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType80 = functionType77.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType81 = functionType77.toMaybeFunctionType();
        boolean boolean82 = functionType77.isNominalType();
        com.google.javascript.rhino.jstype.JSType jSType83 = jSType65.getLeastSupertype((com.google.javascript.rhino.jstype.JSType) functionType77);
        com.google.javascript.rhino.jstype.JSType jSType84 = jSTypeRegistry1.createOptionalNullableType(jSType65);
        com.google.javascript.rhino.jstype.EnumType enumType85 = jSType84.toMaybeEnumType();
        boolean boolean86 = jSType84.canBeCalled();
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(functionTypeList14);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertNull(jSType36);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(nodeIterable46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(functionTypeList51);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(nodeIterable59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertNotNull(functionType62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(jSTypeArray64);
        org.junit.Assert.assertNotNull(jSType65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(nodeIterable74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNull(node76);
        org.junit.Assert.assertNotNull(functionType77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(jSType80);
        org.junit.Assert.assertNotNull(functionType81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(jSType83);
        org.junit.Assert.assertNotNull(jSType84);
        org.junit.Assert.assertNull(enumType85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test00765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00765");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("Named type with empty name component");
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int8 = node7.getSourceOffset();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable13 = node12.children();
        node7.addChildrenToBack(node12);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int19 = node18.getSourceOffset();
        com.google.javascript.rhino.Node node20 = node7.useSourceInfoIfMissingFrom(node18);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(10, node7, 49, (int) (short) 100);
        boolean boolean24 = node7.isComma();
        boolean boolean25 = node7.isAssignAdd();
        boolean boolean26 = node7.isQualifiedName();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean31 = node30.hasOneChild();
        node30.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable34 = node30.getAncestors();
        int int35 = node30.getChildCount();
        java.lang.String str36 = node30.toString();
        com.google.javascript.rhino.Node node37 = node7.useSourceInfoIfMissingFromForTree(node30);
        com.google.javascript.rhino.Node node38 = node7.cloneTree();
        java.lang.String str39 = node7.getSourceFileName();
        com.google.javascript.rhino.Node node40 = node2.useSourceInfoIfMissingFromForTree(node7);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int46 = node45.getSourceOffset();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable51 = node50.children();
        node45.addChildrenToBack(node50);
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int57 = node56.getSourceOffset();
        com.google.javascript.rhino.Node node58 = node45.useSourceInfoIfMissingFrom(node56);
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(10, node45, 49, (int) (short) 100);
        java.util.Set<java.lang.String> strSet62 = node61.getDirectives();
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int67 = node66.getSourceOffset();
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable72 = node71.children();
        node66.addChildrenToBack(node71);
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int78 = node77.getSourceOffset();
        com.google.javascript.rhino.Node node79 = node66.useSourceInfoIfMissingFrom(node77);
        com.google.javascript.rhino.Node node81 = new com.google.javascript.rhino.Node((int) (byte) 0);
        int int82 = node66.getIndexOfChild(node81);
        com.google.javascript.rhino.Node node83 = node61.srcref(node66);
        boolean boolean84 = node61.isDelProp();
        com.google.javascript.rhino.Node node87 = new com.google.javascript.rhino.Node(0, node2, node61, 43, 40);
        java.lang.String str88 = node87.getSourceFileName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str89 = node87.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeIterable13);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(ancestorIterable34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "NUMBER 0.0 36" + "'", str36, "NUMBER 0.0 36");
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(nodeIterable51);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNull(strSet62);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(nodeIterable72);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNull(str88);
    }

    @Test
    public void test00766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00766");
        com.google.common.collect.ImmutableList<java.io.IOException> iOExceptionList0 = com.google.common.collect.ImmutableList.of();
        org.junit.Assert.assertNotNull(iOExceptionList0);
    }

    @Test
    public void test00767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00767");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((int) 'a');
    }

    @Test
    public void test00768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00768");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean12 = functionType10.isRegexpType();
        com.google.javascript.rhino.jstype.ObjectType objectType13 = functionType10.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable14 = functionType10.getAllImplementedInterfaces();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.children();
        boolean boolean23 = node21.isQuotedString();
        com.google.javascript.rhino.Node node24 = node21.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry16.createFunctionType(jSType17, node24);
        boolean boolean26 = functionType25.isArrayType();
        boolean boolean27 = functionType25.isRegexpType();
        boolean boolean29 = functionType25.isPropertyTypeDeclared("InputId: hi!");
        boolean boolean30 = functionType10.differsFrom((com.google.javascript.rhino.jstype.JSType) functionType25);
        boolean boolean31 = functionType25.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType32 = functionType25.toMaybeFunctionType();
        boolean boolean33 = functionType25.hasInstanceType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType34 = functionType25.getInstanceType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objectType13);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test00769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00769");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList12 = functionType10.getSubTypes();
        com.google.javascript.rhino.Node node13 = functionType10.getRootNode();
        com.google.javascript.rhino.JSDocInfo jSDocInfo14 = functionType10.getJSDocInfo();
        boolean boolean15 = functionType10.matchesStringContext();
        boolean boolean16 = functionType10.isNullType();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18);
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable27 = node26.children();
        boolean boolean28 = node26.isQuotedString();
        com.google.javascript.rhino.Node node29 = node26.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry21.createFunctionType(jSType22, node29);
        boolean boolean31 = functionType30.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList32 = functionType30.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable40 = node39.children();
        boolean boolean41 = node39.isQuotedString();
        com.google.javascript.rhino.Node node42 = node39.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType43 = jSTypeRegistry34.createFunctionType(jSType35, node42);
        boolean boolean44 = functionType43.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray45 = new com.google.javascript.rhino.jstype.JSType[] { functionType30, functionType43 };
        com.google.javascript.rhino.jstype.JSType jSType46 = jSTypeRegistry19.createUnionType(jSTypeArray45);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope47 = null;
        com.google.javascript.rhino.jstype.JSType jSType52 = jSTypeRegistry19.getType(jSTypeStaticScope47, "[10, 0]", "", (int) (byte) 1, (int) (byte) 10);
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53);
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable60 = node59.children();
        boolean boolean61 = node59.isQuotedString();
        com.google.javascript.rhino.Node node62 = node59.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry54.createFunctionType(jSType55, node62);
        boolean boolean64 = functionType63.isArrayType();
        boolean boolean65 = jSType52.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType63);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable66 = functionType63.getExtendedInterfaces();
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        node70.setLineno(9);
        boolean boolean73 = functionType10.defineInferredProperty("Named type with empty name component", (com.google.javascript.rhino.jstype.JSType) functionType63, node70);
        boolean boolean75 = functionType63.hasProperty("function ({63005133}): {63005133}");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(functionTypeList12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(jSDocInfo14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(nodeIterable27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(functionType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(functionTypeList32);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(nodeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(functionType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(jSTypeArray45);
        org.junit.Assert.assertNotNull(jSType46);
        org.junit.Assert.assertNotNull(jSType52);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(nodeIterable60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable66);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test00770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00770");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean12 = functionType10.isRegexpType();
        com.google.javascript.rhino.jstype.JSType jSType14 = functionType10.getPropertyType("Unknown class name");
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.children();
        boolean boolean23 = node21.isQuotedString();
        com.google.javascript.rhino.Node node24 = node21.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry16.createFunctionType(jSType17, node24);
        boolean boolean26 = functionType25.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType28 = functionType25.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType29 = functionType25.toMaybeFunctionType();
        com.google.javascript.rhino.Node node30 = functionType25.getRootNode();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue31 = functionType10.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType25);
        com.google.javascript.rhino.jstype.ObjectType objectType32 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType10);
        com.google.javascript.rhino.jstype.ObjectType objectType33 = functionType10.dereference();
        com.google.javascript.rhino.JSDocInfo jSDocInfo34 = functionType10.getJSDocInfo();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSType14);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(ternaryValue31);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertNotNull(objectType33);
        org.junit.Assert.assertNull(jSDocInfo34);
    }

    @Test
    public void test00771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00771");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.JSType jSType5 = jSTypeRegistry3.getType("hi!");
        jSTypeRegistry3.setLastGeneration(true);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable15 = node14.children();
        boolean boolean16 = node14.isQuotedString();
        com.google.javascript.rhino.Node node17 = node14.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType18 = jSTypeRegistry9.createFunctionType(jSType10, node17);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable28 = node27.children();
        boolean boolean29 = node27.isQuotedString();
        com.google.javascript.rhino.Node node30 = node27.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType31 = jSTypeRegistry22.createFunctionType(jSType23, node30);
        boolean boolean32 = functionType31.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList33 = functionType31.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable41 = node40.children();
        boolean boolean42 = node40.isQuotedString();
        com.google.javascript.rhino.Node node43 = node40.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry35.createFunctionType(jSType36, node43);
        boolean boolean45 = functionType44.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray46 = new com.google.javascript.rhino.jstype.JSType[] { functionType31, functionType44 };
        com.google.javascript.rhino.jstype.JSType jSType47 = jSTypeRegistry20.createUnionType(jSTypeArray46);
        com.google.javascript.rhino.Node node48 = jSTypeRegistry9.createOptionalParameters(jSTypeArray46);
        com.google.javascript.rhino.Node node49 = jSTypeRegistry3.createOptionalParameters(jSTypeArray46);
        com.google.javascript.rhino.Node node50 = jSTypeRegistry1.createParametersWithVarArgs(jSTypeArray46);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative51 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType52 = jSTypeRegistry1.getNativeType(jSTypeNative51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeIterable15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(functionType18);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(nodeIterable28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(functionType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(functionTypeList33);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(nodeIterable41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(jSTypeArray46);
        org.junit.Assert.assertNotNull(jSType47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node50);
    }

    @Test
    public void test00772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00772");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 100L);
        org.junit.Assert.assertNotNull(node1);
    }

    @Test
    public void test00773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00773");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor4 = objList2.listIterator();
        int int5 = objList2.size();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor7 = objList2.listIterator((int) (byte) 1);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(39, node12);
        boolean boolean14 = node13.isIf();
        node13.detachChildren();
        boolean boolean16 = node13.isVoid();
        boolean boolean17 = node13.isNE();
        int int18 = objList2.indexOf((java.lang.Object) node13);
        boolean boolean19 = objList2.isEmpty();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility20 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        int int21 = objList2.indexOf((java.lang.Object) visibility20);
        com.google.common.collect.ImmutableList<java.lang.Object> objList25 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.String str26 = objList25.toString();
        java.lang.Object[] objArray27 = objList25.toArray();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = objList2.addAll(36, (java.util.Collection<java.lang.Object>) objList25);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + visibility20 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility20.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(objList25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[10, 0]" + "'", str26, "[10, 0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[10, 0]");
    }

    @Test
    public void test00774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00774");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        node3.setSourceFileForTesting("[10, 0]");
        node3.removeProp(36);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
        java.lang.String[] strArray25 = new java.lang.String[] { "NUMBER 0.0 36", "function ({1265812580}): {1265812580}", "function ({1265812580}): {1265812580}", "{1936444324}", "Not declared as a type name", "Not declared as a type name", "function ({1704073426}): {1704073426}", "[10, 0]", "", "function ({1265812580}): {1265812580}", "JSDocInfo", "{1936444324}", "", "java.io.IOException: ", "JSDocInfo" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        node3.setDirectives((java.util.Set<java.lang.String>) strSet26);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int34 = node33.getSourceOffset();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable39 = node38.children();
        node33.addChildrenToBack(node38);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int45 = node44.getSourceOffset();
        com.google.javascript.rhino.Node node46 = node33.useSourceInfoIfMissingFrom(node44);
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(10, node33, 49, (int) (short) 100);
        java.util.Set<java.lang.String> strSet50 = node49.getDirectives();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable51 = node49.getAncestors();
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean56 = node55.hasOneChild();
        node55.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable59 = node55.getAncestors();
        int int60 = node55.getChildCount();
        node49.addChildrenToFront(node55);
        com.google.javascript.rhino.Node node63 = node55.getChildAtIndex(0);
        boolean boolean64 = node55.isOnlyModifiesThisCall();
        boolean boolean65 = node55.isLabel();
        com.google.javascript.rhino.JSDocInfo jSDocInfo66 = node55.getJSDocInfo();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node67 = node3.removeChildAfter(node55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(nodeIterable39);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNull(strSet50);
        org.junit.Assert.assertNotNull(ancestorIterable51);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(ancestorIterable59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(jSDocInfo66);
    }

    @Test
    public void test00775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00775");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType12 = functionType10.restrictByNotNullOrUndefined();
        boolean boolean13 = functionType10.isReturnTypeInferred();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable21 = node20.children();
        boolean boolean22 = node20.isQuotedString();
        com.google.javascript.rhino.Node node23 = node20.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry15.createFunctionType(jSType16, node23);
        boolean boolean25 = functionType24.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList26 = functionType24.getSubTypes();
        com.google.javascript.rhino.Node node27 = functionType24.getRootNode();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable28 = functionType24.getAllImplementedInterfaces();
        boolean boolean29 = functionType24.isFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType30 = functionType10.getLeastSupertype((com.google.javascript.rhino.jstype.JSType) functionType24);
        boolean boolean31 = jSType30.isEnumElementType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(functionTypeList26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(objectTypeIterable28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jSType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test00776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00776");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean13 = functionType10.isPropertyTypeInferred("JSDocInfo");
        boolean boolean15 = functionType10.hasOwnProperty("");
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node22.children();
        boolean boolean24 = node22.isQuotedString();
        com.google.javascript.rhino.Node node25 = node22.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry17.createFunctionType(jSType18, node25);
        boolean boolean27 = functionType26.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType26.getPropertyType("InputId: hi!");
        boolean boolean30 = functionType10.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType26);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable40 = node39.children();
        boolean boolean41 = node39.isQuotedString();
        com.google.javascript.rhino.Node node42 = node39.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType43 = jSTypeRegistry34.createFunctionType(jSType35, node42);
        boolean boolean44 = functionType43.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList45 = functionType43.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable53 = node52.children();
        boolean boolean54 = node52.isQuotedString();
        com.google.javascript.rhino.Node node55 = node52.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry47.createFunctionType(jSType48, node55);
        boolean boolean57 = functionType56.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] { functionType43, functionType56 };
        com.google.javascript.rhino.jstype.JSType jSType59 = jSTypeRegistry32.createUnionType(jSTypeArray58);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope60 = null;
        com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry32.getType(jSTypeStaticScope60, "[10, 0]", "", (int) (byte) 1, (int) (byte) 10);
        com.google.javascript.rhino.ErrorReporter errorReporter66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter66);
        com.google.javascript.rhino.jstype.JSType jSType68 = null;
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable73 = node72.children();
        boolean boolean74 = node72.isQuotedString();
        com.google.javascript.rhino.Node node75 = node72.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType76 = jSTypeRegistry67.createFunctionType(jSType68, node75);
        boolean boolean77 = functionType76.isArrayType();
        boolean boolean78 = jSType65.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType76);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue79 = functionType26.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType76);
        com.google.javascript.rhino.jstype.ObjectType objectType80 = functionType76.getImplicitPrototype();
        boolean boolean81 = functionType76.hasCachedValues();
        boolean boolean82 = functionType76.hasInstanceType();
        boolean boolean83 = functionType76.isRegexpType();
        com.google.javascript.rhino.Node node84 = functionType76.getRootNode();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeIterable23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(nodeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(functionType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(functionTypeList45);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(nodeIterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertNotNull(jSType59);
        org.junit.Assert.assertNotNull(jSType65);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(nodeIterable73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(node75);
        org.junit.Assert.assertNotNull(functionType76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(ternaryValue79);
        org.junit.Assert.assertNotNull(objectType80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNull(node84);
    }

    @Test
    public void test00777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00777");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType10.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType14 = functionType10.toMaybeFunctionType();
        boolean boolean16 = functionType14.removeProperty("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable17 = functionType14.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType18 = functionType14.getParameterType();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable26 = node25.children();
        boolean boolean27 = node25.isQuotedString();
        com.google.javascript.rhino.Node node28 = node25.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry20.createFunctionType(jSType21, node28);
        boolean boolean30 = functionType14.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType29);
        java.lang.String str31 = functionType29.getDisplayName();
        com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> jSTypePredicate32 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = functionType29.setValidator(jSTypePredicate32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test00778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00778");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        node3.setSourceFileForTesting("[10, 0]");
        node3.removeProp(36);
        boolean boolean9 = node3.isComma();
        boolean boolean10 = node3.isNew();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo11 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00779");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        java.util.Set<java.lang.String> strSet5 = jSDocInfo3.getSuppressions();
        java.util.Iterator<java.lang.String> strItor6 = strSet5.iterator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo7 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo8 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList11 = com.google.common.collect.ImmutableList.of(jSDocInfo7, jSDocInfo8, jSDocInfo9, jSDocInfo10);
        java.util.Set<java.lang.String> strSet12 = jSDocInfo10.getSuppressions();
        java.util.Iterator<java.lang.String> strItor13 = strSet12.iterator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo14 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList18 = com.google.common.collect.ImmutableList.of(jSDocInfo14, jSDocInfo15, jSDocInfo16, jSDocInfo17);
        java.util.Set<java.lang.String> strSet19 = jSDocInfo17.getSuppressions();
        java.util.Iterator<java.lang.String> strItor20 = strSet19.iterator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo23 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList25 = com.google.common.collect.ImmutableList.of(jSDocInfo21, jSDocInfo22, jSDocInfo23, jSDocInfo24);
        java.util.Set<java.lang.String> strSet26 = jSDocInfo24.getSuppressions();
        java.util.Iterator<java.lang.String> strItor27 = strSet26.iterator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo30 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo31 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList32 = com.google.common.collect.ImmutableList.of(jSDocInfo28, jSDocInfo29, jSDocInfo30, jSDocInfo31);
        java.util.Set<java.lang.String> strSet33 = jSDocInfo31.getSuppressions();
        java.util.Iterator<java.lang.String> strItor34 = strSet33.iterator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo35 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo36 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo37 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo38 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList39 = com.google.common.collect.ImmutableList.of(jSDocInfo35, jSDocInfo36, jSDocInfo37, jSDocInfo38);
        java.util.Set<java.lang.String> strSet40 = jSDocInfo38.getSuppressions();
        java.util.Iterator<java.lang.String> strItor41 = strSet40.iterator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo42 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo43 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo44 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo45 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList46 = com.google.common.collect.ImmutableList.of(jSDocInfo42, jSDocInfo43, jSDocInfo44, jSDocInfo45);
        java.util.Set<java.lang.String> strSet47 = jSDocInfo45.getSuppressions();
        java.util.Iterator<java.lang.String> strItor48 = strSet47.iterator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo49 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo51 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo52 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList53 = com.google.common.collect.ImmutableList.of(jSDocInfo49, jSDocInfo50, jSDocInfo51, jSDocInfo52);
        java.util.Set<java.lang.String> strSet54 = jSDocInfo52.getSuppressions();
        java.util.Iterator<java.lang.String> strItor55 = strSet54.iterator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo56 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo57 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo58 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo59 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList60 = com.google.common.collect.ImmutableList.of(jSDocInfo56, jSDocInfo57, jSDocInfo58, jSDocInfo59);
        java.util.Set<java.lang.String> strSet61 = jSDocInfo59.getSuppressions();
        java.util.Iterator<java.lang.String> strItor62 = strSet61.iterator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo63 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo64 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo65 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo66 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList67 = com.google.common.collect.ImmutableList.of(jSDocInfo63, jSDocInfo64, jSDocInfo65, jSDocInfo66);
        java.util.Set<java.lang.String> strSet68 = jSDocInfo66.getSuppressions();
        java.util.Iterator<java.lang.String> strItor69 = strSet68.iterator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo70 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo71 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo72 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo73 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList74 = com.google.common.collect.ImmutableList.of(jSDocInfo70, jSDocInfo71, jSDocInfo72, jSDocInfo73);
        java.util.Set<java.lang.String> strSet75 = jSDocInfo73.getSuppressions();
        java.util.Iterator<java.lang.String> strItor76 = strSet75.iterator();
        com.google.common.collect.ImmutableList<java.util.Iterator<java.lang.String>> strItorList77 = com.google.common.collect.ImmutableList.of(strItor6, strItor13, strItor20, strItor27, strItor34, strItor41, strItor48, strItor55, strItor62, strItor69, strItor76);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str78 = strItor6.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertNotNull(jSDocInfoList11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertNotNull(jSDocInfoList18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertNotNull(jSDocInfoList25);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(strItor27);
        org.junit.Assert.assertNotNull(jSDocInfoList32);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNotNull(strItor34);
        org.junit.Assert.assertNotNull(jSDocInfoList39);
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNotNull(strItor41);
        org.junit.Assert.assertNotNull(jSDocInfoList46);
        org.junit.Assert.assertNotNull(strSet47);
        org.junit.Assert.assertNotNull(strItor48);
        org.junit.Assert.assertNotNull(jSDocInfoList53);
        org.junit.Assert.assertNotNull(strSet54);
        org.junit.Assert.assertNotNull(strItor55);
        org.junit.Assert.assertNotNull(jSDocInfoList60);
        org.junit.Assert.assertNotNull(strSet61);
        org.junit.Assert.assertNotNull(strItor62);
        org.junit.Assert.assertNotNull(jSDocInfoList67);
        org.junit.Assert.assertNotNull(strSet68);
        org.junit.Assert.assertNotNull(strItor69);
        org.junit.Assert.assertNotNull(jSDocInfoList74);
        org.junit.Assert.assertNotNull(strSet75);
        org.junit.Assert.assertNotNull(strItor76);
        org.junit.Assert.assertNotNull(strItorList77);
    }

    @Test
    public void test00780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00780");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        boolean boolean5 = node3.isDo();
        int int6 = node3.getChildCount();
        boolean boolean7 = node3.isTrue();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int13 = node12.getSourceOffset();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable18 = node17.children();
        node12.addChildrenToBack(node17);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int24 = node23.getSourceOffset();
        com.google.javascript.rhino.Node node25 = node12.useSourceInfoIfMissingFrom(node23);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(10, node12, 49, (int) (short) 100);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean31 = node28.isEquivalentTo(node30);
        boolean boolean32 = node28.isSwitch();
        com.google.javascript.rhino.InputId inputId34 = new com.google.javascript.rhino.InputId("hi!");
        node28.setInputId(inputId34);
        java.lang.String str36 = inputId34.toString();
        java.lang.String str37 = inputId34.getIdName();
        java.lang.String str38 = inputId34.toString();
        node3.setInputId(inputId34);
        com.google.javascript.rhino.JSDocInfo jSDocInfo40 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo42 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo43 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList44 = com.google.common.collect.ImmutableList.of(jSDocInfo40, jSDocInfo41, jSDocInfo42, jSDocInfo43);
        boolean boolean45 = jSDocInfo43.isConstructor();
        boolean boolean47 = jSDocInfo43.hasParameterType("[10, 0]");
        com.google.javascript.rhino.JSDocInfo.Visibility visibility48 = jSDocInfo43.getVisibility();
        boolean boolean49 = jSDocInfo43.isExport();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int54 = node53.getSourceOffset();
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable59 = node58.children();
        node53.addChildrenToBack(node58);
        node53.detachChildren();
        node53.setLineno(16);
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node(39, node68);
        boolean boolean70 = node69.isIf();
        node69.detachChildren();
        boolean boolean72 = node69.isVoid();
        com.google.javascript.rhino.Node node73 = node53.useSourceInfoIfMissingFrom(node69);
        jSDocInfo43.setAssociatedNode(node53);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node75 = node3.removeChildAfter(node53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeIterable18);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "InputId: hi!" + "'", str36, "InputId: hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "InputId: hi!" + "'", str38, "InputId: hi!");
        org.junit.Assert.assertNotNull(jSDocInfoList44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(visibility48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(nodeIterable59);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(node73);
    }

    @Test
    public void test00781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00781");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        node3.setSourceFileForTesting("[10, 0]");
        node3.setVarArgs(true);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder9 = node3.getJsDocBuilderForNode();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType10 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable15 = node14.children();
        boolean boolean16 = node14.isQuotedString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression18 = new com.google.javascript.rhino.JSTypeExpression(node14, "hi!");
        boolean boolean19 = node14.isCatch();
        java.lang.String str20 = node14.getQualifiedName();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("{1936444324}", (int) ' ', (int) (short) 1);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship25 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType10, node14, node24);
        java.lang.String str26 = node3.checkTreeEquals(node24);
        com.google.javascript.rhino.InputId inputId27 = node3.getInputId();
        boolean boolean28 = node3.isFor();
        boolean boolean29 = node3.isBlock();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeIterable15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Node tree inequality:\nTree1:\nNUMBER 0.0 36 [var_args_name: 1] [source_file: [10, 0]]\n\n\nTree2:\nSTRING {1936444324} 32\n\n\nSubtree1: NUMBER 0.0 36 [var_args_name: 1] [source_file: [10, 0]]\n\n\nSubtree2: STRING {1936444324} 32\n" + "'", str26, "Node tree inequality:\nTree1:\nNUMBER 0.0 36 [var_args_name: 1] [source_file: [10, 0]]\n\n\nTree2:\nSTRING {1936444324} 32\n\n\nSubtree1: NUMBER 0.0 36 [var_args_name: 1] [source_file: [10, 0]]\n\n\nSubtree2: STRING {1936444324} 32\n");
        org.junit.Assert.assertNull(inputId27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test00782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00782");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int15 = node14.getSourceOffset();
        com.google.javascript.rhino.Node node16 = node3.useSourceInfoIfMissingFrom(node14);
        node16.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(39, node23);
        com.google.javascript.rhino.Node node25 = node16.srcref(node24);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int31 = node30.getSourceOffset();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable36 = node35.children();
        node30.addChildrenToBack(node35);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int42 = node41.getSourceOffset();
        com.google.javascript.rhino.Node node43 = node30.useSourceInfoIfMissingFrom(node41);
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node(10, node30, 49, (int) (short) 100);
        java.util.Set<java.lang.String> strSet47 = node46.getDirectives();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int52 = node51.getSourceOffset();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable57 = node56.children();
        node51.addChildrenToBack(node56);
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int63 = node62.getSourceOffset();
        com.google.javascript.rhino.Node node64 = node51.useSourceInfoIfMissingFrom(node62);
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node((int) (byte) 0);
        int int67 = node51.getIndexOfChild(node66);
        com.google.javascript.rhino.Node node68 = node46.srcref(node51);
        node51.putIntProp((int) (byte) 100, (int) (short) -1);
        boolean boolean73 = node51.getBooleanProp(44);
        boolean boolean74 = node51.isLabel();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node75 = node16.removeChildAfter(node51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeIterable36);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNull(strSet47);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(nodeIterable57);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test00783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00783");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor4 = objList2.listIterator();
        int int5 = objList2.size();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int10 = node9.getSourceOffset();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable15 = node14.children();
        node9.addChildrenToBack(node14);
        boolean boolean17 = node14.isGetElem();
        int int18 = node14.getType();
        boolean boolean19 = objList2.equals((java.lang.Object) node14);
        com.google.common.collect.ImmutableList<java.lang.Object> objList23 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray43 = new java.lang.Object[] { "", 10L, (short) -1, (short) 100, 0, ' ', (-1), 1.0d, 100.0f, 39, ' ', 1.0d, (byte) 0, 0L, 10.0f, "hi!", ' ', 0, 10.0f, 43, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList44 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList44, objArray43);
        boolean boolean47 = objList44.add((java.lang.Object) 100.0d);
        com.google.common.collect.ImmutableList<java.lang.Object> objList50 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream51 = objList50.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList52 = objList50.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList53 = objList50.reverse();
        java.util.Spliterator<java.lang.Object> objSpliterator54 = objList50.spliterator();
        boolean boolean55 = objList44.containsAll((java.util.Collection<java.lang.Object>) objList50);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean56 = objList2.removeAll((java.util.Collection<java.lang.Object>) objList50);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeIterable15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 39 + "'", int18 == 39);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objList23);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(objList50);
        org.junit.Assert.assertNotNull(objStream51);
        org.junit.Assert.assertNotNull(objList52);
        org.junit.Assert.assertNotNull(objList53);
        org.junit.Assert.assertNotNull(objSpliterator54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test00784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00784");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        com.google.javascript.rhino.jstype.JSType jSType12 = jSTypeRegistry1.getType("");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node19.children();
        boolean boolean21 = node19.isQuotedString();
        com.google.javascript.rhino.Node node22 = node19.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry14.createFunctionType(jSType15, node22);
        boolean boolean24 = functionType23.isArrayType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet25 = functionType23.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable35 = node34.children();
        boolean boolean36 = node34.isQuotedString();
        com.google.javascript.rhino.Node node37 = node34.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry29.createFunctionType(jSType30, node37);
        boolean boolean39 = functionType38.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList40 = functionType38.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable48 = node47.children();
        boolean boolean49 = node47.isQuotedString();
        com.google.javascript.rhino.Node node50 = node47.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType51 = jSTypeRegistry42.createFunctionType(jSType43, node50);
        boolean boolean52 = functionType51.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray53 = new com.google.javascript.rhino.jstype.JSType[] { functionType38, functionType51 };
        com.google.javascript.rhino.jstype.JSType jSType54 = jSTypeRegistry27.createUnionType(jSTypeArray53);
        com.google.javascript.rhino.jstype.FunctionType functionType55 = jSTypeRegistry1.createFunctionTypeWithVarArgs((com.google.javascript.rhino.jstype.JSType) functionType23, jSTypeArray53);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable56 = functionType23.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType57 = functionType23.unboxesTo();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean58 = jSType57.isAllType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet25 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet25.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(nodeIterable35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(functionTypeList40);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(nodeIterable48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNotNull(functionType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeArray53);
        org.junit.Assert.assertNotNull(jSType54);
        org.junit.Assert.assertNotNull(functionType55);
        org.junit.Assert.assertNotNull(objectTypeIterable56);
        org.junit.Assert.assertNull(jSType57);
    }

    @Test
    public void test00785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00785");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int5 = node4.getSourceOffset();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node9.children();
        node4.addChildrenToBack(node9);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int16 = node15.getSourceOffset();
        com.google.javascript.rhino.Node node17 = node4.useSourceInfoIfMissingFrom(node15);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(10, node4, 49, (int) (short) 100);
        boolean boolean21 = node4.isComma();
        boolean boolean22 = node4.isAssignAdd();
        boolean boolean23 = node4.isQualifiedName();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean28 = node27.hasOneChild();
        node27.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable31 = node27.getAncestors();
        int int32 = node27.getChildCount();
        java.lang.String str33 = node27.toString();
        com.google.javascript.rhino.Node node34 = node4.useSourceInfoIfMissingFromForTree(node27);
        com.google.javascript.rhino.Node node35 = node4.cloneTree();
        boolean boolean36 = node35.isFromExterns();
        int int37 = node35.getSourceOffset();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(ancestorIterable31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "NUMBER 0.0 36" + "'", str33, "NUMBER 0.0 36");
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test00786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00786");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean12 = functionType10.isRegexpType();
        com.google.javascript.rhino.jstype.ObjectType objectType13 = functionType10.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable14 = functionType10.getAllImplementedInterfaces();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.children();
        boolean boolean23 = node21.isQuotedString();
        com.google.javascript.rhino.Node node24 = node21.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry16.createFunctionType(jSType17, node24);
        boolean boolean26 = functionType25.isArrayType();
        boolean boolean27 = functionType25.isRegexpType();
        boolean boolean29 = functionType25.isPropertyTypeDeclared("InputId: hi!");
        boolean boolean30 = functionType10.differsFrom((com.google.javascript.rhino.jstype.JSType) functionType25);
        boolean boolean31 = functionType25.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType32 = functionType25.toMaybeFunctionType();
        int int33 = functionType25.getPropertiesCount();
        boolean boolean34 = functionType25.isInstanceType();
        com.google.javascript.rhino.jstype.ObjectType objectType35 = null;
        // The following exception was thrown during execution in test generation
        try {
            functionType25.setPrototypeBasedOn(objectType35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objectType13);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test00787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00787");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        com.google.common.collect.ImmutableList<java.lang.Object> objList6 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray26 = new java.lang.Object[] { "", 10L, (short) -1, (short) 100, 0, ' ', (-1), 1.0d, 100.0f, 39, ' ', 1.0d, (byte) 0, 0L, 10.0f, "hi!", ' ', 0, 10.0f, 43, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList27 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList27, objArray26);
        boolean boolean30 = objList27.add((java.lang.Object) 100.0d);
        boolean boolean31 = objList2.containsAll((java.util.Collection<java.lang.Object>) objList27);
        java.lang.Object obj32 = null;
        boolean boolean33 = objList27.remove(obj32);
        com.google.common.collect.ImmutableList<java.lang.Object> objList36 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray37 = objList36.toArray();
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable45 = node44.children();
        boolean boolean46 = node44.isQuotedString();
        com.google.javascript.rhino.Node node47 = node44.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry39.createFunctionType(jSType40, node47);
        boolean boolean49 = functionType48.isArrayType();
        boolean boolean50 = functionType48.isRegexpType();
        com.google.javascript.rhino.jstype.JSType jSType52 = functionType48.findPropertyType("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot54 = functionType48.getOwnSlot("hi!");
        boolean boolean55 = objList36.contains((java.lang.Object) "hi!");
        com.google.javascript.rhino.JSDocInfo jSDocInfo56 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo57 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo58 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo59 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList60 = com.google.common.collect.ImmutableList.of(jSDocInfo56, jSDocInfo57, jSDocInfo58, jSDocInfo59);
        boolean boolean62 = jSDocInfo58.hasParameterType("hi!");
        boolean boolean63 = jSDocInfo58.hasReturnType();
        boolean boolean64 = jSDocInfo58.hasModifies();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection65 = jSDocInfo58.getTypeNodes();
        java.util.Spliterator<com.google.javascript.rhino.Node> nodeSpliterator66 = nodeCollection65.spliterator();
        boolean boolean67 = objList36.equals((java.lang.Object) nodeCollection65);
        boolean boolean68 = objList27.retainAll((java.util.Collection<java.lang.Object>) objList36);
        // The following exception was thrown during execution in test generation
        try {
            objList36.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objList6);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objList36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[10, 0]");
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(nodeIterable45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNotNull(functionType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(jSType52);
        org.junit.Assert.assertNull(jSTypeStaticSlot54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(nodeCollection65);
        org.junit.Assert.assertNotNull(nodeSpliterator66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test00788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00788");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor4 = objList2.listIterator();
        com.google.common.collect.ImmutableList<java.lang.Object> objList8 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray28 = new java.lang.Object[] { "", 10L, (short) -1, (short) 100, 0, ' ', (-1), 1.0d, 100.0f, 39, ' ', 1.0d, (byte) 0, 0L, 10.0f, "hi!", ' ', 0, 10.0f, 43, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList29 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList29, objArray28);
        boolean boolean32 = objList29.add((java.lang.Object) 100.0d);
        com.google.common.collect.ImmutableList<java.lang.Object> objList35 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream36 = objList35.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList37 = objList35.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList38 = objList35.reverse();
        java.util.Spliterator<java.lang.Object> objSpliterator39 = objList35.spliterator();
        boolean boolean40 = objList29.containsAll((java.util.Collection<java.lang.Object>) objList35);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable45 = node44.children();
        boolean boolean46 = node44.isQuotedString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression48 = new com.google.javascript.rhino.JSTypeExpression(node44, "hi!");
        boolean boolean49 = jSTypeExpression48.isOptionalArg();
        boolean boolean50 = jSTypeExpression48.isOptionalArg();
        com.google.javascript.rhino.Node node51 = jSTypeExpression48.getRoot();
        boolean boolean52 = jSTypeExpression48.isOptionalArg();
        int int53 = objList35.lastIndexOf((java.lang.Object) boolean52);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean54 = objList2.removeAll((java.util.Collection<java.lang.Object>) objList35);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertNotNull(objList8);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(objList35);
        org.junit.Assert.assertNotNull(objStream36);
        org.junit.Assert.assertNotNull(objList37);
        org.junit.Assert.assertNotNull(objList38);
        org.junit.Assert.assertNotNull(objSpliterator39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(nodeIterable45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
    }

    @Test
    public void test00789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00789");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType10.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType14 = functionType10.toMaybeFunctionType();
        boolean boolean15 = functionType14.isNullable();
        com.google.javascript.rhino.jstype.FunctionType functionType16 = functionType14.getConstructor();
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression18 = jSDocInfo17.getThisType();
        java.lang.String str19 = jSDocInfo17.getOriginalCommentString();
        boolean boolean20 = jSDocInfo17.isConstructor();
        // The following exception was thrown during execution in test generation
        try {
            functionType16.setJSDocInfo(jSDocInfo17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(functionType16);
        org.junit.Assert.assertNull(jSTypeExpression18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00790");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean12 = functionType10.isRegexpType();
        com.google.javascript.rhino.jstype.ObjectType objectType13 = functionType10.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable14 = objectType13.getCtorExtendedInterfaces();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList19 = com.google.common.collect.ImmutableList.of(jSDocInfo15, jSDocInfo16, jSDocInfo17, jSDocInfo18);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression20 = jSDocInfo18.getReturnType();
        boolean boolean21 = jSDocInfo18.isImplicitCast();
        objectType13.setJSDocInfo(jSDocInfo18);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable30 = node29.children();
        boolean boolean31 = node29.isQuotedString();
        com.google.javascript.rhino.Node node32 = node29.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry24.createFunctionType(jSType25, node32);
        boolean boolean34 = functionType33.isArrayType();
        boolean boolean36 = functionType33.isPropertyTypeInferred("JSDocInfo");
        boolean boolean38 = functionType33.hasOwnProperty("");
        com.google.javascript.rhino.Node node39 = functionType33.getParametersNode();
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable47 = node46.children();
        boolean boolean48 = node46.isQuotedString();
        com.google.javascript.rhino.Node node49 = node46.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry41.createFunctionType(jSType42, node49);
        boolean boolean51 = functionType50.isArrayType();
        boolean boolean52 = functionType50.isRegexpType();
        com.google.javascript.rhino.jstype.ObjectType objectType53 = functionType50.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable54 = functionType50.getAllImplementedInterfaces();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue55 = functionType33.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType50);
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable63 = node62.children();
        boolean boolean64 = node62.isQuotedString();
        com.google.javascript.rhino.Node node65 = node62.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType66 = jSTypeRegistry57.createFunctionType(jSType58, node65);
        boolean boolean67 = functionType66.isArrayType();
        boolean boolean68 = functionType66.isRegexpType();
        com.google.javascript.rhino.jstype.ObjectType objectType69 = functionType66.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable70 = functionType66.getAllImplementedInterfaces();
        com.google.javascript.rhino.ErrorReporter errorReporter71 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry72 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter71);
        com.google.javascript.rhino.jstype.JSType jSType73 = null;
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable78 = node77.children();
        boolean boolean79 = node77.isQuotedString();
        com.google.javascript.rhino.Node node80 = node77.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType81 = jSTypeRegistry72.createFunctionType(jSType73, node80);
        boolean boolean82 = functionType81.isArrayType();
        boolean boolean83 = functionType81.isRegexpType();
        boolean boolean85 = functionType81.isPropertyTypeDeclared("InputId: hi!");
        boolean boolean86 = functionType66.differsFrom((com.google.javascript.rhino.jstype.JSType) functionType81);
        boolean boolean87 = functionType81.hasImplementedInterfaces();
        boolean boolean88 = functionType81.isInterface();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue89 = functionType50.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType81);
        java.lang.String str90 = functionType50.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.JSType jSType91 = objectType13.getLeastSupertype((com.google.javascript.rhino.jstype.JSType) functionType50);
        boolean boolean92 = functionType50.canBeCalled();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objectType13);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertNotNull(jSDocInfoList19);
        org.junit.Assert.assertNull(jSTypeExpression20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(nodeIterable30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(nodeIterable47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(objectType53);
        org.junit.Assert.assertNotNull(objectTypeIterable54);
        org.junit.Assert.assertNotNull(ternaryValue55);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(nodeIterable63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertNotNull(functionType66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(objectType69);
        org.junit.Assert.assertNotNull(objectTypeIterable70);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNotNull(nodeIterable78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNull(node80);
        org.junit.Assert.assertNotNull(functionType81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(ternaryValue89);
// flaky:         org.junit.Assert.assertEquals("'" + str90 + "' != '" + "function ({60277808}): {60277808}" + "'", str90, "function ({60277808}): {60277808}");
        org.junit.Assert.assertNotNull(jSType91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
    }

    @Test
    public void test00791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00791");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 'a', (int) (short) -1, 12);
        // The following exception was thrown during execution in test generation
        try {
            node3.setSideEffectFlags(4095);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got NUMBER");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test00792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00792");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int5 = node4.getSourceOffset();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node9.children();
        node4.addChildrenToBack(node9);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int16 = node15.getSourceOffset();
        com.google.javascript.rhino.Node node17 = node4.useSourceInfoIfMissingFrom(node15);
        node17.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(39, node24);
        com.google.javascript.rhino.Node node26 = node17.srcref(node25);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int31 = node30.getSourceOffset();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable36 = node35.children();
        node30.addChildrenToBack(node35);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int42 = node41.getSourceOffset();
        com.google.javascript.rhino.Node node43 = node30.useSourceInfoIfMissingFrom(node41);
        com.google.javascript.rhino.Node node44 = node25.clonePropsFrom(node43);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable49 = node48.children();
        boolean boolean50 = node48.isQuotedString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression52 = new com.google.javascript.rhino.JSTypeExpression(node48, "hi!");
        boolean boolean54 = jSTypeExpression52.equals((java.lang.Object) (short) -1);
        com.google.javascript.rhino.Node node55 = jSTypeExpression52.getRoot();
        com.google.javascript.rhino.Node node56 = jSTypeExpression52.getRoot();
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int61 = node60.getSourceOffset();
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable66 = node65.children();
        node60.addChildrenToBack(node65);
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int72 = node71.getSourceOffset();
        com.google.javascript.rhino.Node node73 = node60.useSourceInfoIfMissingFrom(node71);
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node((int) (byte) 0);
        int int76 = node60.getIndexOfChild(node75);
        boolean boolean77 = node75.isIf();
        com.google.javascript.rhino.Node node80 = new com.google.javascript.rhino.Node(47, node44, node56, node75, (int) (byte) 1, 32);
        boolean boolean81 = node56.isBreak();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeIterable36);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(nodeIterable49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(nodeIterable66);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test00793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00793");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) 'a', 29, 49);
        boolean boolean4 = node3.isFalse();
        node3.setOptionalArg(true);
        node3.setSourceFileForTesting("function ({2131829351}): {2131829351}");
        // The following exception was thrown during execution in test generation
        try {
            node3.setQuotedString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not a StringNode");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00794");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        com.google.common.collect.ImmutableList<java.lang.Object> objList6 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray26 = new java.lang.Object[] { "", 10L, (short) -1, (short) 100, 0, ' ', (-1), 1.0d, 100.0f, 39, ' ', 1.0d, (byte) 0, 0L, 10.0f, "hi!", ' ', 0, 10.0f, 43, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList27 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList27, objArray26);
        boolean boolean30 = objList27.add((java.lang.Object) 100.0d);
        boolean boolean31 = objList2.containsAll((java.util.Collection<java.lang.Object>) objList27);
        java.lang.Object obj32 = null;
        boolean boolean33 = objList27.remove(obj32);
        com.google.common.collect.ImmutableList<java.lang.Object> objList36 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray37 = objList36.toArray();
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable45 = node44.children();
        boolean boolean46 = node44.isQuotedString();
        com.google.javascript.rhino.Node node47 = node44.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry39.createFunctionType(jSType40, node47);
        boolean boolean49 = functionType48.isArrayType();
        boolean boolean50 = functionType48.isRegexpType();
        com.google.javascript.rhino.jstype.JSType jSType52 = functionType48.findPropertyType("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot54 = functionType48.getOwnSlot("hi!");
        boolean boolean55 = objList36.contains((java.lang.Object) "hi!");
        com.google.javascript.rhino.JSDocInfo jSDocInfo56 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo57 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo58 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo59 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList60 = com.google.common.collect.ImmutableList.of(jSDocInfo56, jSDocInfo57, jSDocInfo58, jSDocInfo59);
        boolean boolean62 = jSDocInfo58.hasParameterType("hi!");
        boolean boolean63 = jSDocInfo58.hasReturnType();
        boolean boolean64 = jSDocInfo58.hasModifies();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection65 = jSDocInfo58.getTypeNodes();
        java.util.Spliterator<com.google.javascript.rhino.Node> nodeSpliterator66 = nodeCollection65.spliterator();
        boolean boolean67 = objList36.equals((java.lang.Object) nodeCollection65);
        boolean boolean68 = objList27.retainAll((java.util.Collection<java.lang.Object>) objList36);
        com.google.javascript.rhino.JSDocInfo jSDocInfo69 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo70 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo71 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo72 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList73 = com.google.common.collect.ImmutableList.of(jSDocInfo69, jSDocInfo70, jSDocInfo71, jSDocInfo72);
        java.util.Set<java.lang.String> strSet74 = jSDocInfo72.getSuppressions();
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int79 = node78.getSourceOffset();
        java.lang.String str80 = node78.getQualifiedName();
        boolean boolean81 = node78.isNE();
        boolean boolean82 = strSet74.equals((java.lang.Object) boolean81);
        strSet74.clear();
        java.util.Iterator<java.lang.String> strItor84 = strSet74.iterator();
        com.google.common.collect.ImmutableList<java.lang.Object> objList87 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray88 = objList87.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor89 = objList87.listIterator();
        boolean boolean91 = objList87.contains((java.lang.Object) (short) 10);
        java.lang.Object obj92 = null;
        boolean boolean93 = objList87.equals(obj92);
        java.lang.String str94 = objList87.toString();
        boolean boolean95 = strSet74.removeAll((java.util.Collection<java.lang.Object>) objList87);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean96 = objList36.removeAll((java.util.Collection<java.lang.Object>) objList87);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objList6);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objList36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[10, 0]");
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(nodeIterable45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNotNull(functionType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(jSType52);
        org.junit.Assert.assertNull(jSTypeStaticSlot54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(nodeCollection65);
        org.junit.Assert.assertNotNull(nodeSpliterator66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(jSDocInfoList73);
        org.junit.Assert.assertNotNull(strSet74);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(strItor84);
        org.junit.Assert.assertNotNull(objList87);
        org.junit.Assert.assertNotNull(objArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray88), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray88), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "[10, 0]" + "'", str94, "[10, 0]");
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test00795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00795");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        boolean boolean10 = node8.isQuotedString();
        com.google.javascript.rhino.Node node11 = node8.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry3.createFunctionType(jSType4, node11);
        boolean boolean13 = functionType12.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList14 = functionType12.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.children();
        boolean boolean23 = node21.isQuotedString();
        com.google.javascript.rhino.Node node24 = node21.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry16.createFunctionType(jSType17, node24);
        boolean boolean26 = functionType25.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] { functionType12, functionType25 };
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry1.createUnionType(jSTypeArray27);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope29 = null;
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry1.getType(jSTypeStaticScope29, "[10, 0]", "", (int) (byte) 1, (int) (byte) 10);
        jSTypeRegistry1.forwardDeclareType("");
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable44 = node43.children();
        boolean boolean45 = node43.isQuotedString();
        com.google.javascript.rhino.Node node46 = node43.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType47 = jSTypeRegistry38.createFunctionType(jSType39, node46);
        boolean boolean48 = functionType47.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType49 = functionType47.restrictByNotNullOrUndefined();
        boolean boolean50 = jSType49.isNoResolvedType();
        com.google.javascript.rhino.jstype.ObjectType objectType51 = jSType49.toObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53);
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable62 = node61.children();
        boolean boolean63 = node61.isQuotedString();
        com.google.javascript.rhino.Node node64 = node61.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType65 = jSTypeRegistry56.createFunctionType(jSType57, node64);
        boolean boolean66 = functionType65.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList67 = functionType65.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter68 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry69 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter68);
        com.google.javascript.rhino.jstype.JSType jSType70 = null;
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable75 = node74.children();
        boolean boolean76 = node74.isQuotedString();
        com.google.javascript.rhino.Node node77 = node74.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType78 = jSTypeRegistry69.createFunctionType(jSType70, node77);
        boolean boolean79 = functionType78.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray80 = new com.google.javascript.rhino.jstype.JSType[] { functionType65, functionType78 };
        com.google.javascript.rhino.jstype.JSType jSType81 = jSTypeRegistry54.createUnionType(jSTypeArray80);
        com.google.javascript.rhino.jstype.FunctionType functionType82 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType51, false, jSTypeArray80);
        jSTypeRegistry1.identifyNonNullableName("function ({1399396790}): {1399396790}");
        com.google.javascript.rhino.jstype.JSType jSType89 = jSTypeRegistry1.createNamedType("hi!", "function ({1399396790}): {1399396790}", 7, (int) (short) -1);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(functionTypeList14);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(nodeIterable44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(functionType47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jSType49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(objectType51);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(nodeIterable62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNotNull(functionType65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(functionTypeList67);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertNotNull(nodeIterable75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(node77);
        org.junit.Assert.assertNotNull(functionType78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(jSTypeArray80);
        org.junit.Assert.assertNotNull(jSType81);
        org.junit.Assert.assertNotNull(functionType82);
        org.junit.Assert.assertNotNull(jSType89);
    }

    @Test
    public void test00796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00796");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        node3.detachChildren();
        node3.setLineno(16);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node(39, node18);
        boolean boolean20 = node19.isIf();
        node19.detachChildren();
        boolean boolean22 = node19.isVoid();
        com.google.javascript.rhino.Node node23 = node3.useSourceInfoIfMissingFrom(node19);
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable31 = node30.children();
        boolean boolean32 = node30.isQuotedString();
        com.google.javascript.rhino.Node node33 = node30.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType34 = jSTypeRegistry25.createFunctionType(jSType26, node33);
        boolean boolean35 = functionType34.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType37 = functionType34.getPropertyType("InputId: hi!");
        boolean boolean38 = functionType34.hasCachedValues();
        node23.setJSType((com.google.javascript.rhino.jstype.JSType) functionType34);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int44 = node43.getSourceOffset();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable49 = node48.children();
        node43.addChildrenToBack(node48);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int55 = node54.getSourceOffset();
        com.google.javascript.rhino.Node node56 = node43.useSourceInfoIfMissingFrom(node54);
        node56.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node(39, node63);
        com.google.javascript.rhino.Node node65 = node56.srcref(node64);
        com.google.javascript.rhino.Node node66 = node23.srcrefTree(node65);
        boolean boolean67 = node65.isDo();
        boolean boolean68 = node65.isNE();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(nodeIterable31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(functionType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jSType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(nodeIterable49);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test00797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00797");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean12 = functionType10.isRegexpType();
        com.google.javascript.rhino.jstype.ObjectType objectType13 = functionType10.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable14 = functionType10.getAllImplementedInterfaces();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.children();
        boolean boolean23 = node21.isQuotedString();
        com.google.javascript.rhino.Node node24 = node21.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry16.createFunctionType(jSType17, node24);
        boolean boolean26 = functionType25.isArrayType();
        boolean boolean27 = functionType25.isRegexpType();
        boolean boolean29 = functionType25.isPropertyTypeDeclared("InputId: hi!");
        boolean boolean30 = functionType10.differsFrom((com.google.javascript.rhino.jstype.JSType) functionType25);
        boolean boolean31 = functionType25.matchesStringContext();
        boolean boolean32 = functionType25.hasReferenceName();
        com.google.javascript.rhino.jstype.JSType jSType33 = functionType25.getIndexType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = jSType33.matchesNumberContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objectType13);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(jSType33);
    }

    @Test
    public void test00798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00798");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType10.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType14 = functionType10.toMaybeFunctionType();
        boolean boolean16 = functionType14.removeProperty("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable17 = functionType14.getExtendedInterfaces();
        boolean boolean18 = functionType14.isNumberObjectType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType19 = functionType14.toMaybeEnumElementType();
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable27 = node26.children();
        boolean boolean28 = node26.isQuotedString();
        com.google.javascript.rhino.Node node29 = node26.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry21.createFunctionType(jSType22, node29);
        boolean boolean31 = functionType30.isArrayType();
        boolean boolean33 = functionType30.isPropertyTypeInferred("JSDocInfo");
        boolean boolean35 = functionType30.hasOwnProperty("");
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36);
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable43 = node42.children();
        boolean boolean44 = node42.isQuotedString();
        com.google.javascript.rhino.Node node45 = node42.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = jSTypeRegistry37.createFunctionType(jSType38, node45);
        boolean boolean47 = functionType46.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType49 = functionType46.getPropertyType("InputId: hi!");
        boolean boolean50 = functionType30.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean51 = functionType30.isArrayType();
        java.lang.String str52 = functionType30.toString();
        com.google.javascript.rhino.jstype.ObjectType objectType53 = functionType30.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair54 = functionType14.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType) functionType30);
        com.google.javascript.rhino.jstype.JSType jSType55 = typePair54.typeA;
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(enumElementType19);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(nodeIterable27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(functionType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(nodeIterable43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(jSType49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "function (...[?]): ?" + "'", str52, "function (...[?]): ?");
        org.junit.Assert.assertNotNull(objectType53);
        org.junit.Assert.assertNotNull(typePair54);
        org.junit.Assert.assertNotNull(jSType55);
    }

    @Test
    public void test00799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00799");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean12 = functionType10.isPropertyTypeDeclared("");
        boolean boolean14 = functionType10.isPropertyInExterns("JSDocInfo");
        boolean boolean15 = functionType10.isRecordType();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node22.children();
        boolean boolean24 = node22.isQuotedString();
        com.google.javascript.rhino.Node node25 = node22.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry17.createFunctionType(jSType18, node25);
        boolean boolean27 = functionType26.isArrayType();
        boolean boolean28 = functionType26.isRegexpType();
        boolean boolean30 = functionType26.isPropertyTypeDeclared("InputId: hi!");
        com.google.javascript.rhino.Node node31 = functionType26.getRootNode();
        boolean boolean32 = functionType26.isParameterizedType();
        functionType10.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType26);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = functionType26.getParentScope();
        java.lang.Object[] objArray45 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList46 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList46, objArray45);
        java.lang.Object[] objArray48 = objList46.toArray();
        java.util.stream.Stream<java.lang.Object> objStream49 = objList46.parallelStream();
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean51 = jSDocInfo50.isNoCompile();
        java.lang.String str52 = jSDocInfo50.toString();
        boolean boolean53 = jSDocInfo50.isExpose();
        int int54 = jSDocInfo50.getExtendedInterfacesCount();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection55 = jSDocInfo50.getTypeNodes();
        boolean boolean56 = objList46.contains((java.lang.Object) jSDocInfo50);
        functionType26.setPropertyJSDocInfo("function ({58203979}): {58203979}", jSDocInfo50);
        jSDocInfo50.setDeprecated(true);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeIterable23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "JSDocInfo" + "'", str52, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(nodeCollection55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test00800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test00800");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        boolean boolean5 = node3.isEmpty();
        node3.detachChildren();
        com.google.javascript.rhino.InputId inputId7 = node3.getInputId();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int13 = node12.getSourceOffset();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable18 = node17.children();
        node12.addChildrenToBack(node17);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int24 = node23.getSourceOffset();
        com.google.javascript.rhino.Node node25 = node12.useSourceInfoIfMissingFrom(node23);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(10, node12, 49, (int) (short) 100);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean31 = node28.isEquivalentTo(node30);
        boolean boolean32 = node28.isSwitch();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile33 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node28);
        java.lang.Object obj35 = node28.getProp(54);
        boolean boolean36 = node3.isEquivalentTo(node28);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression38 = new com.google.javascript.rhino.JSTypeExpression(node3, "NUMBER 0.0 16");
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39);
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable46 = node45.children();
        boolean boolean47 = node45.isQuotedString();
        com.google.javascript.rhino.Node node48 = node45.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry40.createFunctionType(jSType41, node48);
        boolean boolean51 = functionType49.isPropertyTypeDeclared("");
        boolean boolean53 = functionType49.isPropertyInExterns("JSDocInfo");
        boolean boolean54 = functionType49.isRecordType();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable62 = node61.children();
        boolean boolean63 = node61.isQuotedString();
        com.google.javascript.rhino.Node node64 = node61.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType65 = jSTypeRegistry56.createFunctionType(jSType57, node64);
        com.google.javascript.rhino.jstype.JSType jSType67 = jSTypeRegistry56.getType("");
        com.google.javascript.rhino.ErrorReporter errorReporter68 = jSTypeRegistry56.getErrorReporter();
        boolean boolean69 = jSTypeRegistry56.shouldTolerateUndefinedValues();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType70 = jSTypeExpression38.evaluate((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType49, jSTypeRegistry56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unexpected node in type expression: NUMBER 0.0 36");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(inputId7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeIterable18);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(staticSourceFile33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(nodeIterable46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(nodeIterable62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNotNull(functionType65);
        org.junit.Assert.assertNull(jSType67);
        org.junit.Assert.assertNull(errorReporter68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }
}

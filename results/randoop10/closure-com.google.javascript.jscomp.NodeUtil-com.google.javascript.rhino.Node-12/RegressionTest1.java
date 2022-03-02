import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00201");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.containsDeclaration();
        java.util.Collection<java.lang.String> strCollection3 = jSDocInfo0.getReferences();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getReturnType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(strCollection3);
        org.junit.Assert.assertNull(jSTypeExpression4);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00202");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        int int13 = node3.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node22.setString("");
        com.google.javascript.rhino.Node node25 = node18.useSourceInfoIfMissingFromForTree(node22);
        boolean boolean26 = node18.isGetElem();
        com.google.javascript.rhino.Node node27 = node18.cloneNode();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node35.setString("");
        com.google.javascript.rhino.Node node38 = node31.useSourceInfoIfMissingFromForTree(node35);
        boolean boolean39 = node31.isGetElem();
        int int41 = node31.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newExpr(node31);
        com.google.javascript.rhino.Node node43 = node18.clonePropsFrom(node31);
        boolean boolean44 = node18.isGetElem();
        com.google.javascript.rhino.Node node45 = node14.useSourceInfoFrom(node18);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node54.setString("");
        com.google.javascript.rhino.Node node57 = node50.useSourceInfoIfMissingFromForTree(node54);
        boolean boolean58 = node50.isGetElem();
        com.google.javascript.rhino.Node node59 = node50.cloneNode();
        boolean boolean60 = node59.isContinue();
        com.google.javascript.rhino.Node node61 = node59.cloneTree();
        node61.setSourceEncodedPosition((int) (short) 10);
        boolean boolean64 = node61.isSetterDef();
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65, false);
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node76.setString("");
        com.google.javascript.rhino.Node node79 = node72.useSourceInfoIfMissingFromForTree(node76);
        node76.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter82 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry84 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter82, false);
        com.google.javascript.rhino.jstype.JSType jSType85 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray86 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry84.createFunctionType(jSType85, jSTypeArray86);
        boolean boolean88 = functionType87.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType89 = jSTypeRegistry67.createObjectType("hi!", node76, (com.google.javascript.rhino.jstype.ObjectType) functionType87);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray90 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node91 = jSTypeRegistry67.createParametersWithVarArgs(jSTypeArray90);
        boolean boolean92 = node91.isIn();
        com.google.javascript.rhino.Node node95 = new com.google.javascript.rhino.Node(52, node61, node91, 42, (int) (byte) 0);
        boolean boolean96 = node18.hasChild(node95);
        boolean boolean97 = node95.isHook();
        node95.detachChildren();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection99 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node95);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNotNull(jSTypeArray86);
        org.junit.Assert.assertNotNull(functionType87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(objectType89);
        org.junit.Assert.assertNotNull(jSTypeArray90);
        org.junit.Assert.assertNotNull(node91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNotNull(nodeCollection99);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00203");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        com.google.javascript.rhino.Node node6 = functionType5.getRootNode();
        boolean boolean7 = functionType5.isConstructor();
        boolean boolean8 = functionType5.isResolved();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00204");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, false);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry5.createFunctionType(jSType6, jSTypeArray7);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = functionType8.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType11 = jSTypeRegistry2.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType8);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, false);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node23.setString("");
        com.google.javascript.rhino.Node node26 = node19.useSourceInfoIfMissingFromForTree(node23);
        node23.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, false);
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray33 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType34 = jSTypeRegistry31.createFunctionType(jSType32, jSTypeArray33);
        boolean boolean35 = functionType34.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType36 = jSTypeRegistry14.createObjectType("hi!", node23, (com.google.javascript.rhino.jstype.ObjectType) functionType34);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray37 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node38 = jSTypeRegistry14.createParametersWithVarArgs(jSTypeArray37);
        com.google.javascript.rhino.Node node39 = jSTypeRegistry2.createParametersWithVarArgs(jSTypeArray37);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative40 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType41 = jSTypeRegistry2.getNativeType(jSTypeNative40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertNotNull(functionType8);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNotNull(jSType11);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(jSTypeArray33);
        org.junit.Assert.assertNotNull(functionType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(objectType36);
        org.junit.Assert.assertNotNull(jSTypeArray37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00205");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        jSTypeRegistry2.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry7.createFunctionType(jSType8, jSTypeArray9);
        boolean boolean11 = functionType10.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable12 = functionType10.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType10.unboxesTo();
        com.google.javascript.rhino.jstype.ObjectType.Property property15 = functionType10.getSlot("unknown");
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry2.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) functionType10);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18);
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20, false);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry22.createFunctionType(jSType23, jSTypeArray24);
        boolean boolean26 = functionType25.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable27 = functionType25.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType28 = functionType25.unboxesTo();
        boolean boolean30 = functionType25.removeProperty("");
        int int31 = functionType25.getMaxArguments();
        java.lang.String str32 = functionType25.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, false);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray37 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry35.createFunctionType(jSType36, jSTypeArray37);
        boolean boolean39 = functionType38.isNominalType();
        functionType25.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType38);
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41, false);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray45 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType46 = jSTypeRegistry43.createFunctionType(jSType44, jSTypeArray45);
        boolean boolean47 = functionType46.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable48 = functionType46.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType49 = functionType46.unboxesTo();
        boolean boolean51 = functionType46.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType52 = functionType46.getImplicitPrototype();
        functionType25.setPrototypeBasedOn(objectType52);
        boolean boolean55 = jSTypeRegistry19.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) functionType25, "hi!");
        java.lang.Iterable iterable56 = functionType25.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node64.setString("");
        com.google.javascript.rhino.Node node67 = node60.useSourceInfoIfMissingFromForTree(node64);
        boolean boolean68 = node60.isGetElem();
        com.google.javascript.rhino.Node node69 = node60.cloneNode();
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node77.setString("");
        com.google.javascript.rhino.Node node80 = node73.useSourceInfoIfMissingFromForTree(node77);
        boolean boolean81 = node73.isGetElem();
        int int83 = node73.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node84 = com.google.javascript.jscomp.NodeUtil.newExpr(node73);
        com.google.javascript.rhino.Node node85 = node60.clonePropsFrom(node73);
        boolean boolean86 = functionType10.defineSynthesizedProperty("unknown", (com.google.javascript.rhino.jstype.JSType) functionType25, node60);
        int int88 = node60.getIntProp(36);
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags90 = new com.google.javascript.rhino.Node.SideEffectFlags((int) (short) 100);
        boolean boolean91 = sideEffectFlags90.areAllFlagsSet();
        // The following exception was thrown during execution in test generation
        try {
            node60.setSideEffectFlags(sideEffectFlags90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got STRING");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(property15);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable27);
        org.junit.Assert.assertNull(jSType28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(jSTypeArray37);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jSTypeArray45);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable48);
        org.junit.Assert.assertNull(jSType49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectType52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(iterable56);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00206");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        com.google.javascript.rhino.Node node12 = node3.cloneNode();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile13 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node3);
        boolean boolean14 = node3.isTypeOf();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node22.setString("");
        com.google.javascript.rhino.Node node25 = node18.useSourceInfoIfMissingFromForTree(node22);
        boolean boolean26 = node18.isGetElem();
        com.google.javascript.rhino.Node node27 = node18.cloneNode();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node18);
        boolean boolean29 = node18.isTypeOf();
        boolean boolean30 = node3.hasChild(node18);
        boolean boolean31 = node3.isInstanceOf();
        // The following exception was thrown during execution in test generation
        try {
            double double32 = node3.getDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: STRING hi! is not a number node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(staticSourceFile13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(staticSourceFile28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00207");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList4 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList9 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        boolean boolean10 = strComparableList4.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, false);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType16 = jSTypeRegistry13.createFunctionType(jSType14, jSTypeArray15);
        boolean boolean17 = functionType16.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, false);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray22 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry20.createFunctionType(jSType21, jSTypeArray22);
        boolean boolean24 = functionType23.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable25 = functionType23.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType26 = functionType23.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType27 = functionType23.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue28 = functionType16.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType23);
        com.google.javascript.rhino.Node node29 = functionType16.getSource();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, false);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray34 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType35 = jSTypeRegistry32.createFunctionType(jSType33, jSTypeArray34);
        boolean boolean36 = functionType35.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList41 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor42 = strComparableList41.iterator();
        boolean boolean43 = functionType35.equals((java.lang.Object) strComparableItor42);
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, false);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry47.createFunctionType(jSType48, jSTypeArray49);
        boolean boolean51 = functionType50.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = functionType50.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node53 = null;
        boolean boolean54 = functionType35.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType50, node53);
        boolean boolean56 = functionType50.removeProperty("Not declared as a type name");
        boolean boolean57 = functionType16.hasEqualCallType(functionType50);
        boolean boolean58 = strComparableList9.equals((java.lang.Object) functionType16);
        java.lang.Object[] objArray59 = strComparableList9.toArray();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList65 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor66 = strComparableList65.iterator();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList67 = strComparableList65.reverse();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean68 = strComparableList9.addAll(49, (java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList67);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableList4);
        org.junit.Assert.assertNotNull(strComparableList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jSTypeArray22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable25);
        org.junit.Assert.assertNull(jSType26);
        org.junit.Assert.assertNotNull(jSType27);
        org.junit.Assert.assertNotNull(ternaryValue28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(jSTypeArray34);
        org.junit.Assert.assertNotNull(functionType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strComparableList41);
        org.junit.Assert.assertNotNull(strComparableItor42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[, hi!, STRING hi!, STRING hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[, hi!, STRING hi!, STRING hi!]");
        org.junit.Assert.assertNotNull(strComparableList65);
        org.junit.Assert.assertNotNull(strComparableItor66);
        org.junit.Assert.assertNotNull(strComparableList67);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00208");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        int int7 = functionType5.getPropertiesCount();
        com.google.javascript.rhino.jstype.FunctionType functionType8 = functionType5.getOwnerFunction();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(functionType8);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00209");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2, false);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType7 = jSTypeRegistry4.createFunctionType(jSType5, jSTypeArray6);
        boolean boolean8 = functionType7.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable9 = functionType7.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType7.unboxesTo();
        boolean boolean12 = functionType7.removeProperty("");
        int int13 = functionType7.getMaxArguments();
        java.lang.String str14 = functionType7.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, false);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray19 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry17.createFunctionType(jSType18, jSTypeArray19);
        boolean boolean21 = functionType20.isNominalType();
        functionType7.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType20);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, false);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType28 = jSTypeRegistry25.createFunctionType(jSType26, jSTypeArray27);
        boolean boolean29 = functionType28.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable30 = functionType28.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType31 = functionType28.unboxesTo();
        boolean boolean33 = functionType28.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType34 = functionType28.getImplicitPrototype();
        functionType7.setPrototypeBasedOn(objectType34);
        boolean boolean37 = jSTypeRegistry1.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) functionType7, "hi!");
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, false);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node54.setString("");
        com.google.javascript.rhino.Node node57 = node50.useSourceInfoIfMissingFromForTree(node54);
        node54.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60, false);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray64 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType65 = jSTypeRegistry62.createFunctionType(jSType63, jSTypeArray64);
        boolean boolean66 = functionType65.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType67 = jSTypeRegistry45.createObjectType("hi!", node54, (com.google.javascript.rhino.jstype.ObjectType) functionType65);
        com.google.javascript.rhino.jstype.ObjectType objectType68 = jSTypeRegistry1.createObjectType("", node42, (com.google.javascript.rhino.jstype.ObjectType) functionType65);
        boolean boolean69 = functionType65.isNominalType();
        com.google.javascript.rhino.jstype.JSType jSType71 = functionType65.getPropertyType("PARAM_LIST");
        boolean boolean72 = functionType65.isNullType();
        int int73 = functionType65.getMinArguments();
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertNotNull(functionType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(jSTypeArray19);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(functionType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable30);
        org.junit.Assert.assertNull(jSType31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(jSTypeArray64);
        org.junit.Assert.assertNotNull(functionType65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(objectType67);
        org.junit.Assert.assertNotNull(objectType68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(jSType71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00210");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable7 = functionType5.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType8 = functionType5.unboxesTo();
        boolean boolean10 = functionType5.removeProperty("");
        int int11 = functionType5.getMaxArguments();
        java.lang.String str12 = functionType5.toDebugHashCodeString();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, false);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = jSTypeRegistry15.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, false);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray22 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry20.createFunctionType(jSType21, jSTypeArray22);
        boolean boolean24 = functionType23.isNominalType();
        boolean boolean25 = jSTypeRegistry15.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType23);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node34.setString("");
        com.google.javascript.rhino.Node node37 = node30.useSourceInfoIfMissingFromForTree(node34);
        boolean boolean38 = node30.isGetElem();
        com.google.javascript.rhino.Node node39 = node30.cloneNode();
        boolean boolean40 = node39.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile41 = node39.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, false);
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, false);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry47.createFunctionType(jSType48, jSTypeArray49);
        com.google.javascript.rhino.JSDocInfo jSDocInfo52 = functionType50.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType53 = jSTypeRegistry44.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType50);
        com.google.javascript.rhino.JSDocInfo jSDocInfo54 = functionType50.getJSDocInfo();
        boolean boolean56 = functionType50.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType57 = jSTypeRegistry15.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node39, (com.google.javascript.rhino.jstype.JSType) functionType50);
        com.google.javascript.rhino.jstype.EnumType enumType58 = enumType57.toMaybeEnumType();
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, false);
        com.google.javascript.rhino.jstype.JSType jSType62 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray63 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType64 = jSTypeRegistry61.createFunctionType(jSType62, jSTypeArray63);
        boolean boolean65 = functionType64.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable66 = functionType64.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType68 = functionType64.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.ErrorReporter errorReporter69 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry72 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70, false);
        com.google.javascript.rhino.jstype.JSType jSType73 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray74 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType75 = jSTypeRegistry72.createFunctionType(jSType73, jSTypeArray74);
        boolean boolean76 = functionType75.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable77 = functionType75.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType78 = functionType75.unboxesTo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo79 = new com.google.javascript.rhino.JSDocInfo();
        functionType75.setJSDocInfo(jSDocInfo79);
        com.google.javascript.rhino.jstype.JSType jSType81 = functionType64.resolve(errorReporter69, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType75);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue82 = enumType57.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType64);
        boolean boolean83 = functionType5.hasEqualCallType(functionType64);
        com.google.javascript.rhino.Node node84 = functionType5.getParametersNode();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node85 = com.google.javascript.jscomp.NodeUtil.newExpr(node84);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "function (): {1340568406}" + "'", str12, "function (): {1340568406}");
        org.junit.Assert.assertNotNull(objectType16);
        org.junit.Assert.assertNotNull(jSTypeArray22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(staticSourceFile41);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNull(jSDocInfo52);
        org.junit.Assert.assertNotNull(jSType53);
        org.junit.Assert.assertNull(jSDocInfo54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(enumType57);
        org.junit.Assert.assertNotNull(enumType58);
        org.junit.Assert.assertNotNull(jSTypeArray63);
        org.junit.Assert.assertNotNull(functionType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable66);
        org.junit.Assert.assertNotNull(jSType68);
        org.junit.Assert.assertNotNull(jSTypeArray74);
        org.junit.Assert.assertNotNull(functionType75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable77);
        org.junit.Assert.assertNull(jSType78);
        org.junit.Assert.assertNotNull(jSType81);
        org.junit.Assert.assertNotNull(ternaryValue82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(node84);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00211");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        boolean boolean4 = node3.isFor();
        com.google.javascript.rhino.Node node5 = node3.getNext();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node13.setString("");
        com.google.javascript.rhino.Node node16 = node9.useSourceInfoIfMissingFromForTree(node13);
        boolean boolean17 = node9.isGetElem();
        int int19 = node9.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newExpr(node9);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node28.setString("");
        com.google.javascript.rhino.Node node31 = node24.useSourceInfoIfMissingFromForTree(node28);
        boolean boolean32 = node24.isGetElem();
        com.google.javascript.rhino.Node node33 = node24.cloneNode();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node41.setString("");
        com.google.javascript.rhino.Node node44 = node37.useSourceInfoIfMissingFromForTree(node41);
        boolean boolean45 = node37.isGetElem();
        int int47 = node37.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node48 = com.google.javascript.jscomp.NodeUtil.newExpr(node37);
        com.google.javascript.rhino.Node node49 = node24.clonePropsFrom(node37);
        boolean boolean50 = node24.isGetElem();
        com.google.javascript.rhino.Node node51 = node20.useSourceInfoFrom(node24);
        com.google.javascript.rhino.Node node52 = node51.removeFirstChild();
        com.google.javascript.rhino.JSDocInfo jSDocInfo53 = node52.getJSDocInfo();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node54 = node5.getChildBefore(node52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNull(jSDocInfo53);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00212");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList4 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList5 = strComparableList4.reverse();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList10 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList15 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        boolean boolean16 = strComparableList10.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList15);
        boolean boolean17 = strComparableList10.isEmpty();
        boolean boolean18 = strComparableList4.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList10);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19, false);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry21.createFunctionType(jSType22, jSTypeArray23);
        boolean boolean25 = functionType24.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList30 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor31 = strComparableList30.iterator();
        boolean boolean32 = functionType24.equals((java.lang.Object) strComparableItor31);
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, false);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry36.createFunctionType(jSType37, jSTypeArray38);
        boolean boolean40 = functionType39.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable41 = functionType39.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node42 = null;
        boolean boolean43 = functionType24.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType39, node42);
        boolean boolean45 = functionType39.removeProperty("Not declared as a type name");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable46 = functionType39.getParameters();
        boolean boolean47 = strComparableList10.equals((java.lang.Object) functionType39);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator48 = strComparableList10.spliterator();
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator49 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList10.replaceAll(strComparableUnaryOperator49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableList4);
        org.junit.Assert.assertNotNull(strComparableList5);
        org.junit.Assert.assertNotNull(strComparableList10);
        org.junit.Assert.assertNotNull(strComparableList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strComparableList30);
        org.junit.Assert.assertNotNull(strComparableItor31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSTypeArray38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(nodeIterable46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator48);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00213");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        boolean boolean4 = node3.isFor();
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node3);
        node3.setLength(54);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00214");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        java.lang.String str1 = ternaryValue0.toString();
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "true" + "'", str1, "true");
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00215");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        com.google.javascript.rhino.Node node12 = node3.cloneNode();
        boolean boolean13 = node12.isDebugger();
        node12.setQuotedString();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable15 = node12.children();
        java.util.Spliterator<com.google.javascript.rhino.Node> nodeSpliterator16 = nodeIterable15.spliterator();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodeIterable15);
        org.junit.Assert.assertNotNull(nodeSpliterator16);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00216");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        boolean boolean7 = functionType5.isInterface();
        com.google.javascript.rhino.JSDocInfo jSDocInfo8 = functionType5.getJSDocInfo();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, false);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry11.createFunctionType(jSType12, jSTypeArray13);
        boolean boolean15 = functionType14.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable16 = functionType14.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType17 = functionType14.unboxesTo();
        boolean boolean19 = functionType14.removeProperty("");
        int int20 = functionType14.getMaxArguments();
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, false);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry23.createFunctionType(jSType24, jSTypeArray25);
        boolean boolean27 = functionType26.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable28 = functionType26.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType26.unboxesTo();
        boolean boolean31 = functionType26.removeProperty("");
        int int32 = functionType26.getMaxArguments();
        java.lang.String str33 = functionType26.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, false);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry36.createFunctionType(jSType37, jSTypeArray38);
        boolean boolean40 = functionType39.isNominalType();
        functionType26.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType39);
        boolean boolean42 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) functionType14, (com.google.javascript.rhino.jstype.JSType) functionType39);
        boolean boolean43 = functionType14.isNullType();
        boolean boolean44 = functionType5.differsFrom((com.google.javascript.rhino.jstype.JSType) functionType14);
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, false);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry47.createFunctionType(jSType48, jSTypeArray49);
        boolean boolean51 = functionType50.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = functionType50.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType53 = functionType50.unboxesTo();
        boolean boolean55 = functionType50.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType56 = functionType50.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType57 = functionType50.getIndexType();
        com.google.javascript.rhino.jstype.JSType jSType58 = functionType50.getIndexType();
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, false);
        com.google.javascript.rhino.jstype.JSType jSType62 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray63 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType64 = jSTypeRegistry61.createFunctionType(jSType62, jSTypeArray63);
        boolean boolean65 = functionType64.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable66 = functionType64.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType67 = functionType64.unboxesTo();
        boolean boolean69 = functionType64.removeProperty("");
        int int70 = functionType64.getMaxArguments();
        com.google.javascript.rhino.ErrorReporter errorReporter71 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter71, false);
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray75 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType76 = jSTypeRegistry73.createFunctionType(jSType74, jSTypeArray75);
        boolean boolean77 = functionType76.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable78 = functionType76.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType79 = functionType76.unboxesTo();
        boolean boolean81 = functionType76.removeProperty("");
        int int82 = functionType76.getMaxArguments();
        java.lang.String str83 = functionType76.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter84 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry86 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter84, false);
        com.google.javascript.rhino.jstype.JSType jSType87 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray88 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType89 = jSTypeRegistry86.createFunctionType(jSType87, jSTypeArray88);
        boolean boolean90 = functionType89.isNominalType();
        functionType76.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType89);
        boolean boolean92 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) functionType64, (com.google.javascript.rhino.jstype.JSType) functionType89);
        boolean boolean93 = functionType64.isNullType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSType> jSTypeList94 = com.google.common.collect.ImmutableList.of((com.google.javascript.rhino.jstype.JSType) functionType50, (com.google.javascript.rhino.jstype.JSType) functionType64);
        functionType5.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType50);
        com.google.javascript.rhino.jstype.JSType jSType96 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType.TypePair typePair97 = functionType50.getTypesUnderInequality(jSType96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSDocInfo8);
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable28);
        org.junit.Assert.assertNull(jSType29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(jSTypeArray38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertNull(jSType53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(objectType56);
        org.junit.Assert.assertNull(jSType57);
        org.junit.Assert.assertNull(jSType58);
        org.junit.Assert.assertNotNull(jSTypeArray63);
        org.junit.Assert.assertNotNull(functionType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable66);
        org.junit.Assert.assertNull(jSType67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(jSTypeArray75);
        org.junit.Assert.assertNotNull(functionType76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable78);
        org.junit.Assert.assertNull(jSType79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertNotNull(jSTypeArray88);
        org.junit.Assert.assertNotNull(functionType89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(jSTypeList94);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00217");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList8 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableList8.iterator();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList10 = strComparableList8.reverse();
        boolean boolean11 = strSet2.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList8);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList20 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor21 = strComparableList20.iterator();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList22 = strComparableList20.reverse();
        boolean boolean23 = strSet14.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList20);
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList32 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor33 = strComparableList32.iterator();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList34 = strComparableList32.reverse();
        boolean boolean35 = strSet26.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList32);
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList44 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor45 = strComparableList44.iterator();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList46 = strComparableList44.reverse();
        boolean boolean47 = strSet38.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList44);
        com.google.common.collect.ImmutableList<java.util.AbstractSet<java.lang.String>> strSetList48 = com.google.common.collect.ImmutableList.of((java.util.AbstractSet<java.lang.String>) strSet2, (java.util.AbstractSet<java.lang.String>) strSet14, (java.util.AbstractSet<java.lang.String>) strSet26, (java.util.AbstractSet<java.lang.String>) strSet38);
        int int49 = strSet38.size();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList54 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList59 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        boolean boolean60 = strComparableList54.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList59);
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags61 = new com.google.javascript.rhino.Node.SideEffectFlags();
        int int62 = strComparableList54.lastIndexOf((java.lang.Object) sideEffectFlags61);
        boolean boolean63 = strSet38.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList54);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable65 = strComparableList54.remove(49);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strComparableList8);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertNotNull(strComparableList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strComparableList20);
        org.junit.Assert.assertNotNull(strComparableItor21);
        org.junit.Assert.assertNotNull(strComparableList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strComparableList32);
        org.junit.Assert.assertNotNull(strComparableItor33);
        org.junit.Assert.assertNotNull(strComparableList34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strComparableList44);
        org.junit.Assert.assertNotNull(strComparableItor45);
        org.junit.Assert.assertNotNull(strComparableList46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strSetList48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(strComparableList54);
        org.junit.Assert.assertNotNull(strComparableList59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00218");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName("function (): {283828748}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00219");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry7.createFunctionType(jSType8, jSTypeArray9);
        boolean boolean11 = functionType10.isNominalType();
        boolean boolean12 = jSTypeRegistry2.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node21.setString("");
        com.google.javascript.rhino.Node node24 = node17.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean25 = node17.isGetElem();
        com.google.javascript.rhino.Node node26 = node17.cloneNode();
        boolean boolean27 = node26.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = node26.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, false);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = functionType37.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry31.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = functionType37.getJSDocInfo();
        boolean boolean43 = functionType37.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType44 = jSTypeRegistry2.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node26, (com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.jstype.EnumType enumType45 = enumType44.toMaybeEnumType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType46 = enumType45.getElementsType();
        com.google.javascript.rhino.jstype.ObjectType objectType47 = enumElementType46.getImplicitPrototype();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean48 = objectType47.isInstanceType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(staticSourceFile28);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertNull(jSDocInfo39);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertNull(jSDocInfo41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(enumType44);
        org.junit.Assert.assertNotNull(enumType45);
        org.junit.Assert.assertNotNull(enumElementType46);
        org.junit.Assert.assertNull(objectType47);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00220");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 10, "hi!");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node10.setString("");
        com.google.javascript.rhino.Node node13 = node6.useSourceInfoIfMissingFromForTree(node10);
        node10.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node16 = node10.cloneNode();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node24.setString("");
        com.google.javascript.rhino.Node node27 = node20.useSourceInfoIfMissingFromForTree(node24);
        boolean boolean28 = node20.isGetElem();
        com.google.javascript.rhino.Node node29 = node20.cloneNode();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node37.setString("");
        com.google.javascript.rhino.Node node40 = node33.useSourceInfoIfMissingFromForTree(node37);
        boolean boolean41 = node33.isGetElem();
        int int43 = node33.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newExpr(node33);
        com.google.javascript.rhino.Node node45 = node20.clonePropsFrom(node33);
        boolean boolean46 = node45.isDec();
        // The following exception was thrown during execution in test generation
        try {
            node2.addChildBefore(node10, node45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The existing child node of the parent should not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00221");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        int int4 = node3.getLineno();
        boolean boolean5 = node3.isEmpty();
        node3.setSourceEncodedPosition(54);
        com.google.javascript.rhino.Node node8 = node3.getLastChild();
        // The following exception was thrown during execution in test generation
        try {
            node3.setDouble((-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: STRING hi! 0 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00222");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, false);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry5.createFunctionType(jSType6, jSTypeArray7);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = functionType8.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType11 = jSTypeRegistry2.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType8);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, false);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType17 = jSTypeRegistry14.createFunctionType(jSType15, jSTypeArray16);
        boolean boolean18 = functionType17.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable19 = functionType17.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType20 = functionType17.unboxesTo();
        boolean boolean22 = functionType17.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType23 = functionType17.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType25 = jSTypeRegistry2.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType) objectType23, "unknown");
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, false);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray30 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType31 = jSTypeRegistry28.createFunctionType(jSType29, jSTypeArray30);
        boolean boolean32 = functionType31.isNominalType();
        boolean boolean33 = functionType31.isInterface();
        com.google.javascript.rhino.JSDocInfo jSDocInfo34 = functionType31.getJSDocInfo();
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, false);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType41 = jSTypeRegistry38.createFunctionType(jSType39, jSTypeArray40);
        boolean boolean42 = functionType41.isNominalType();
        boolean boolean43 = functionType41.isFunctionPrototypeType();
        com.google.javascript.rhino.jstype.JSType jSType44 = functionType31.forceResolve(errorReporter35, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType41);
        boolean boolean45 = functionType31.isRegexpType();
        com.google.javascript.rhino.jstype.JSType jSType46 = jSTypeRegistry2.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) functionType31);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable47 = functionType31.getAllExtendedInterfaces();
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertNotNull(functionType8);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNotNull(jSType11);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertNotNull(functionType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objectType23);
        org.junit.Assert.assertNotNull(jSType25);
        org.junit.Assert.assertNotNull(jSTypeArray30);
        org.junit.Assert.assertNotNull(functionType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(jSDocInfo34);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jSType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(jSType46);
        org.junit.Assert.assertNotNull(objectTypeIterable47);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00223");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        int int13 = node3.getIntProp((int) (byte) -1);
        boolean boolean14 = node3.isLabel();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression16 = new com.google.javascript.rhino.JSTypeExpression(node3, "STRING hi!");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType17 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, false);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node29.setString("");
        com.google.javascript.rhino.Node node32 = node25.useSourceInfoIfMissingFromForTree(node29);
        node29.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35, false);
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray39 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType40 = jSTypeRegistry37.createFunctionType(jSType38, jSTypeArray39);
        boolean boolean41 = functionType40.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType42 = jSTypeRegistry20.createObjectType("hi!", node29, (com.google.javascript.rhino.jstype.ObjectType) functionType40);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node50.setString("");
        com.google.javascript.rhino.Node node53 = node46.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean54 = node46.isGetElem();
        com.google.javascript.rhino.Node node55 = node46.cloneNode();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node63.setString("");
        com.google.javascript.rhino.Node node66 = node59.useSourceInfoIfMissingFromForTree(node63);
        boolean boolean67 = node59.isGetElem();
        int int69 = node59.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node70 = com.google.javascript.jscomp.NodeUtil.newExpr(node59);
        com.google.javascript.rhino.Node node71 = node46.clonePropsFrom(node59);
        boolean boolean72 = node71.isNot();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable73 = node71.siblings();
        boolean boolean74 = node71.isOr();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship75 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType17, node29, node71);
        node3.addChildrenToBack(node29);
        com.google.javascript.rhino.Node node77 = node29.removeChildren();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean78 = node77.isGetterDef();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + subclassType17 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType17.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(jSTypeArray39);
        org.junit.Assert.assertNotNull(functionType40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(objectType42);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(nodeIterable73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(node77);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00224");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        jSDocInfo0.setVisibility(visibility2);
        java.util.Set<java.lang.String> strSet4 = jSDocInfo0.getParameterNames();
        java.lang.String str5 = jSDocInfo0.toString();
        boolean boolean6 = jSDocInfo0.isNoCompile();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSDocInfo" + "'", str5, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00225");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable7 = functionType5.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType8 = functionType5.unboxesTo();
        boolean boolean10 = functionType5.removeProperty("");
        int int11 = functionType5.getMaxArguments();
        java.lang.String str12 = functionType5.toDebugHashCodeString();
        com.google.javascript.rhino.Node node14 = functionType5.getPropertyNode("JSDocInfo");
        com.google.common.collect.ImmutableList<java.lang.String> strList15 = functionType5.getTemplateTypeNames();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "function (): {704344377}" + "'", str12, "function (): {704344377}");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00226");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags((int) (short) 100);
        boolean boolean2 = sideEffectFlags1.areAllFlagsSet();
        sideEffectFlags1.setAllFlags();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00227");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node11.setString("");
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node11);
        node11.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry19.createFunctionType(jSType20, jSTypeArray21);
        boolean boolean23 = functionType22.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry2.createObjectType("hi!", node11, (com.google.javascript.rhino.jstype.ObjectType) functionType22);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node26 = jSTypeRegistry2.createParametersWithVarArgs(jSTypeArray25);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, false);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry30.createFunctionType(jSType31, jSTypeArray32);
        boolean boolean34 = functionType33.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable35 = functionType33.getCtorImplementedInterfaces();
        jSTypeRegistry2.registerPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) functionType33);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable37 = functionType33.getOwnImplementedInterfaces();
        boolean boolean38 = functionType33.isResolved();
        com.google.javascript.rhino.jstype.ObjectType objectType40 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface((com.google.javascript.rhino.jstype.ObjectType) functionType33, "hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable35);
        org.junit.Assert.assertNotNull(objectTypeIterable37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(objectType40);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00228");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        boolean boolean7 = functionType5.isInterface();
        com.google.javascript.rhino.jstype.ObjectType.Property property9 = functionType5.getSlot("unknown");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable10 = functionType5.getImplementedInterfaces();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType11 = functionType5.getInstanceType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(property9);
        org.junit.Assert.assertNotNull(objectTypeIterable10);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00229");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList4 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableList4.iterator();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList6 = strComparableList4.reverse();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableList6.parallelStream();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        java.lang.String str9 = ternaryValue8.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = ternaryValue10.and(ternaryValue11);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = ternaryValue8.and(ternaryValue12);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue14 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = ternaryValue14.and(ternaryValue15);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = ternaryValue13.and(ternaryValue15);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue18 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        java.lang.String str19 = ternaryValue18.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue20 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue21 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = ternaryValue20.and(ternaryValue21);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue23 = ternaryValue18.and(ternaryValue22);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue25 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue26 = ternaryValue22.or(ternaryValue25);
        boolean boolean28 = ternaryValue22.toBoolean(false);
        com.google.javascript.rhino.jstype.TernaryValue[] ternaryValueArray29 = new com.google.javascript.rhino.jstype.TernaryValue[] { ternaryValue17, ternaryValue22 };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.TernaryValue[] ternaryValueArray30 = strComparableList6.toArray(ternaryValueArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: java.lang.String");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableList4);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertNotNull(strComparableList6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "unknown" + "'", str9, "unknown");
        org.junit.Assert.assertNotNull(ternaryValue10);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertNotNull(ternaryValue12);
        org.junit.Assert.assertNotNull(ternaryValue13);
        org.junit.Assert.assertNotNull(ternaryValue14);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertNotNull(ternaryValue18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "unknown" + "'", str19, "unknown");
        org.junit.Assert.assertNotNull(ternaryValue20);
        org.junit.Assert.assertNotNull(ternaryValue21);
        org.junit.Assert.assertNotNull(ternaryValue22);
        org.junit.Assert.assertNotNull(ternaryValue23);
        org.junit.Assert.assertNotNull(ternaryValue25);
        org.junit.Assert.assertNotNull(ternaryValue26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(ternaryValueArray29);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00230");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, false);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry5.createFunctionType(jSType6, jSTypeArray7);
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10, false);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray14 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType15 = jSTypeRegistry12.createFunctionType(jSType13, jSTypeArray14);
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, false);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = jSTypeRegistry18.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20, false);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node31.setString("");
        com.google.javascript.rhino.Node node34 = node27.useSourceInfoIfMissingFromForTree(node31);
        node31.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37, false);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry39.createFunctionType(jSType40, jSTypeArray41);
        boolean boolean43 = functionType42.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType44 = jSTypeRegistry22.createObjectType("hi!", node31, (com.google.javascript.rhino.jstype.ObjectType) functionType42);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray45 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node46 = jSTypeRegistry22.createParametersWithVarArgs(jSTypeArray45);
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48, false);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray52 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry50.createFunctionType(jSType51, jSTypeArray52);
        boolean boolean54 = functionType53.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable55 = functionType53.getCtorImplementedInterfaces();
        jSTypeRegistry22.registerPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) functionType53);
        com.google.javascript.rhino.ErrorReporter errorReporter57 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter57, false);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray61 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType62 = jSTypeRegistry59.createFunctionType(jSType60, jSTypeArray61);
        boolean boolean63 = functionType62.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable64 = functionType62.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType65 = functionType62.unboxesTo();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection66 = jSTypeRegistry22.getDirectImplementors((com.google.javascript.rhino.jstype.ObjectType) functionType62);
        com.google.javascript.rhino.ErrorReporter errorReporter67 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry69 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter67, false);
        com.google.javascript.rhino.jstype.JSType jSType70 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray71 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry69.createFunctionType(jSType70, jSTypeArray71);
        com.google.javascript.rhino.Node node73 = jSTypeRegistry22.createParametersWithVarArgs(jSTypeArray71);
        com.google.javascript.rhino.jstype.JSType jSType74 = jSTypeRegistry18.createUnionType(jSTypeArray71);
        java.io.IOException iOException76 = new java.io.IOException("");
        java.io.IOException iOException78 = new java.io.IOException("");
        java.io.IOException iOException80 = new java.io.IOException("");
        java.io.IOException[] iOExceptionArray81 = new java.io.IOException[] { iOException76, iOException78, iOException80 };
        com.google.common.collect.ImmutableList<java.io.IOException> iOExceptionList82 = com.google.common.collect.ImmutableList.of(iOExceptionArray81);
        com.google.common.collect.ImmutableList<java.lang.Object[]> objArrayList83 = com.google.common.collect.ImmutableList.of((java.lang.Object[]) jSTypeArray14, (java.lang.Object[]) jSTypeArray71, (java.lang.Object[]) iOExceptionArray81);
        com.google.javascript.rhino.jstype.FunctionType functionType84 = jSTypeRegistry2.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType8, false, jSTypeArray71);
        jSTypeRegistry2.identifyNonNullableName("unknown");
        com.google.javascript.rhino.jstype.ObjectType objectType87 = jSTypeRegistry2.createAnonymousObjectType();
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertNotNull(functionType8);
        org.junit.Assert.assertNotNull(jSTypeArray14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertNotNull(objectType19);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objectType44);
        org.junit.Assert.assertNotNull(jSTypeArray45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(jSTypeArray52);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable55);
        org.junit.Assert.assertNotNull(jSTypeArray61);
        org.junit.Assert.assertNotNull(functionType62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable64);
        org.junit.Assert.assertNull(jSType65);
        org.junit.Assert.assertNotNull(functionTypeCollection66);
        org.junit.Assert.assertNotNull(jSTypeArray71);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(jSType74);
        org.junit.Assert.assertNotNull(iOExceptionArray81);
        org.junit.Assert.assertNotNull(iOExceptionList82);
        org.junit.Assert.assertNotNull(objArrayList83);
        org.junit.Assert.assertNotNull(functionType84);
        org.junit.Assert.assertNotNull(objectType87);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00231");
        int int0 = com.google.javascript.rhino.Node.JSDOC_INFO_PROP;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 29 + "'", int0 == 29);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00232");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node9.setString("");
        com.google.javascript.rhino.Node node12 = node5.useSourceInfoIfMissingFromForTree(node9);
        boolean boolean13 = node5.isGetElem();
        com.google.javascript.rhino.Node node14 = node5.cloneNode();
        boolean boolean15 = node14.isContinue();
        com.google.javascript.rhino.Node node16 = node14.cloneTree();
        node16.setSourceEncodedPosition((int) (short) 10);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile19 = node16.getStaticSourceFile();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node27.setString("");
        com.google.javascript.rhino.Node node30 = node23.useSourceInfoIfMissingFromForTree(node27);
        boolean boolean31 = node23.isGetElem();
        com.google.javascript.rhino.Node node32 = node23.cloneNode();
        boolean boolean33 = node32.isContinue();
        com.google.javascript.rhino.Node node34 = node32.cloneTree();
        node34.setSourceEncodedPosition((int) (short) 10);
        boolean boolean37 = node34.isSetterDef();
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(41, node16, node34);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(54, node34, 38, 30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(staticSourceFile19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00233");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable7 = functionType5.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType8 = functionType5.unboxesTo();
        boolean boolean10 = functionType5.removeProperty("");
        int int11 = functionType5.getMaxArguments();
        java.lang.String str12 = functionType5.toDebugHashCodeString();
        com.google.javascript.rhino.Node node14 = functionType5.getPropertyNode("JSDocInfo");
        java.lang.String str15 = functionType5.getReferenceName();
        int int16 = functionType5.getPropertiesCount();
        boolean boolean17 = functionType5.isEnumType();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "function (): {1479300960}" + "'", str12, "function (): {1479300960}");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00234");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, false);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry9.createFunctionType(jSType10, jSTypeArray11);
        boolean boolean13 = functionType12.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable14 = functionType12.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType15 = functionType12.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType16 = functionType12.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = functionType5.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType12);
        boolean boolean18 = functionType12.isObject();
        boolean boolean19 = functionType12.isNoObjectType();
        boolean boolean20 = functionType12.matchesNumberContext();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType21 = functionType12.cloneWithoutArrowType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00235");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags((int) (short) 10);
        sideEffectFlags1.setMutatesArguments();
        sideEffectFlags1.clearSideEffectFlags();
        sideEffectFlags1.setMutatesArguments();
        sideEffectFlags1.setMutatesThis();
        sideEffectFlags1.setMutatesArguments();
        sideEffectFlags1.setThrows();
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00236");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isExport();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility4 = jSDocInfo0.getVisibility();
        boolean boolean5 = jSDocInfo0.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getEnumParameterType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(visibility4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression6);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00237");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable7 = functionType5.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType8 = functionType5.unboxesTo();
        boolean boolean10 = functionType5.removeProperty("");
        int int11 = functionType5.getMaxArguments();
        java.lang.String str12 = functionType5.toDebugHashCodeString();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, false);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = jSTypeRegistry15.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, false);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray22 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry20.createFunctionType(jSType21, jSTypeArray22);
        boolean boolean24 = functionType23.isNominalType();
        boolean boolean25 = jSTypeRegistry15.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType23);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node34.setString("");
        com.google.javascript.rhino.Node node37 = node30.useSourceInfoIfMissingFromForTree(node34);
        boolean boolean38 = node30.isGetElem();
        com.google.javascript.rhino.Node node39 = node30.cloneNode();
        boolean boolean40 = node39.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile41 = node39.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, false);
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, false);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry47.createFunctionType(jSType48, jSTypeArray49);
        com.google.javascript.rhino.JSDocInfo jSDocInfo52 = functionType50.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType53 = jSTypeRegistry44.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType50);
        com.google.javascript.rhino.JSDocInfo jSDocInfo54 = functionType50.getJSDocInfo();
        boolean boolean56 = functionType50.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType57 = jSTypeRegistry15.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node39, (com.google.javascript.rhino.jstype.JSType) functionType50);
        com.google.javascript.rhino.jstype.EnumType enumType58 = enumType57.toMaybeEnumType();
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, false);
        com.google.javascript.rhino.jstype.JSType jSType62 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray63 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType64 = jSTypeRegistry61.createFunctionType(jSType62, jSTypeArray63);
        boolean boolean65 = functionType64.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable66 = functionType64.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType68 = functionType64.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.ErrorReporter errorReporter69 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry72 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70, false);
        com.google.javascript.rhino.jstype.JSType jSType73 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray74 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType75 = jSTypeRegistry72.createFunctionType(jSType73, jSTypeArray74);
        boolean boolean76 = functionType75.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable77 = functionType75.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType78 = functionType75.unboxesTo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo79 = new com.google.javascript.rhino.JSDocInfo();
        functionType75.setJSDocInfo(jSDocInfo79);
        com.google.javascript.rhino.jstype.JSType jSType81 = functionType64.resolve(errorReporter69, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType75);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue82 = enumType57.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType64);
        boolean boolean83 = functionType5.hasEqualCallType(functionType64);
        com.google.javascript.rhino.Node node84 = functionType5.getParametersNode();
        // The following exception was thrown during execution in test generation
        try {
            node84.setDouble(1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PARAM_LIST is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "function (): {2015778992}" + "'", str12, "function (): {2015778992}");
        org.junit.Assert.assertNotNull(objectType16);
        org.junit.Assert.assertNotNull(jSTypeArray22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(staticSourceFile41);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNull(jSDocInfo52);
        org.junit.Assert.assertNotNull(jSType53);
        org.junit.Assert.assertNull(jSDocInfo54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(enumType57);
        org.junit.Assert.assertNotNull(enumType58);
        org.junit.Assert.assertNotNull(jSTypeArray63);
        org.junit.Assert.assertNotNull(functionType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable66);
        org.junit.Assert.assertNotNull(jSType68);
        org.junit.Assert.assertNotNull(jSTypeArray74);
        org.junit.Assert.assertNotNull(functionType75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable77);
        org.junit.Assert.assertNull(jSType78);
        org.junit.Assert.assertNotNull(jSType81);
        org.junit.Assert.assertNotNull(ternaryValue82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(node84);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00238");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry7.createFunctionType(jSType8, jSTypeArray9);
        boolean boolean11 = functionType10.isNominalType();
        boolean boolean12 = jSTypeRegistry2.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node21.setString("");
        com.google.javascript.rhino.Node node24 = node17.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean25 = node17.isGetElem();
        com.google.javascript.rhino.Node node26 = node17.cloneNode();
        boolean boolean27 = node26.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = node26.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, false);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = functionType37.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry31.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = functionType37.getJSDocInfo();
        boolean boolean43 = functionType37.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType44 = jSTypeRegistry2.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node26, (com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.jstype.EnumType enumType45 = enumType44.toMaybeEnumType();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, false);
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray50 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType51 = jSTypeRegistry48.createFunctionType(jSType49, jSTypeArray50);
        boolean boolean52 = functionType51.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable53 = functionType51.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType55 = functionType51.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter57 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter57, false);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray61 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType62 = jSTypeRegistry59.createFunctionType(jSType60, jSTypeArray61);
        boolean boolean63 = functionType62.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable64 = functionType62.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType65 = functionType62.unboxesTo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo66 = new com.google.javascript.rhino.JSDocInfo();
        functionType62.setJSDocInfo(jSDocInfo66);
        com.google.javascript.rhino.jstype.JSType jSType68 = functionType51.resolve(errorReporter56, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType62);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue69 = enumType44.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType51);
        java.lang.String str70 = ternaryValue69.toString();
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(staticSourceFile28);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertNull(jSDocInfo39);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertNull(jSDocInfo41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(enumType44);
        org.junit.Assert.assertNotNull(enumType45);
        org.junit.Assert.assertNotNull(jSTypeArray50);
        org.junit.Assert.assertNotNull(functionType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable53);
        org.junit.Assert.assertNotNull(jSType55);
        org.junit.Assert.assertNotNull(jSTypeArray61);
        org.junit.Assert.assertNotNull(functionType62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable64);
        org.junit.Assert.assertNull(jSType65);
        org.junit.Assert.assertNotNull(jSType68);
        org.junit.Assert.assertNotNull(ternaryValue69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "unknown" + "'", str70, "unknown");
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00239");
        com.google.common.collect.ImmutableList<java.util.Set<java.lang.String>> strSetList0 = com.google.common.collect.ImmutableList.of();
        org.junit.Assert.assertNotNull(strSetList0);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00240");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        int int13 = node3.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node22.setString("");
        com.google.javascript.rhino.Node node25 = node18.useSourceInfoIfMissingFromForTree(node22);
        boolean boolean26 = node18.isGetElem();
        com.google.javascript.rhino.Node node27 = node18.cloneNode();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node35.setString("");
        com.google.javascript.rhino.Node node38 = node31.useSourceInfoIfMissingFromForTree(node35);
        boolean boolean39 = node31.isGetElem();
        int int41 = node31.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newExpr(node31);
        com.google.javascript.rhino.Node node43 = node18.clonePropsFrom(node31);
        boolean boolean44 = node18.isGetElem();
        com.google.javascript.rhino.Node node45 = node14.useSourceInfoFrom(node18);
        com.google.javascript.rhino.Node node46 = node45.removeFirstChild();
        boolean boolean47 = node45.isCase();
        boolean boolean48 = node45.isReturn();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00241");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        int int7 = functionType5.getPropertiesCount();
        com.google.javascript.rhino.jstype.TemplateType templateType8 = functionType5.toMaybeTemplateType();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(templateType8);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00242");
        int int0 = com.google.javascript.rhino.Node.EMPTY_BLOCK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 39 + "'", int0 == 39);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00243");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        boolean boolean12 = node3.isFromExterns();
        com.google.javascript.rhino.Node node13 = node3.getParent();
        boolean boolean14 = node3.isWith();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00244");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry7.createFunctionType(jSType8, jSTypeArray9);
        boolean boolean11 = functionType10.isNominalType();
        boolean boolean12 = jSTypeRegistry2.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node21.setString("");
        com.google.javascript.rhino.Node node24 = node17.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean25 = node17.isGetElem();
        com.google.javascript.rhino.Node node26 = node17.cloneNode();
        boolean boolean27 = node26.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = node26.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, false);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = functionType37.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry31.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = functionType37.getJSDocInfo();
        boolean boolean43 = functionType37.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType44 = jSTypeRegistry2.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node26, (com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode45 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode46 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode47 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode48 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode49 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode50 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode51 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode52 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode53 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode> resolveModeList54 = com.google.common.collect.ImmutableList.of(resolveMode45, resolveMode46, resolveMode47, resolveMode48, resolveMode49, resolveMode50, resolveMode51, resolveMode52, resolveMode53);
        jSTypeRegistry2.setResolveMode(resolveMode49);
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56, false);
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType61 = jSTypeRegistry58.createFunctionType(jSType59, jSTypeArray60);
        boolean boolean62 = functionType61.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63, false);
        com.google.javascript.rhino.jstype.JSType jSType66 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray67 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType68 = jSTypeRegistry65.createFunctionType(jSType66, jSTypeArray67);
        boolean boolean69 = functionType68.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable70 = functionType68.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType71 = functionType68.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType72 = functionType68.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue73 = functionType61.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType68);
        com.google.javascript.rhino.jstype.JSType jSType75 = jSTypeRegistry2.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType) functionType61, "");
        jSTypeRegistry2.identifyNonNullableName("function (): {283828748}");
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable79 = jSTypeRegistry2.getTypesWithProperty("function (): {1479300960}");
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(staticSourceFile28);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertNull(jSDocInfo39);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertNull(jSDocInfo41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(enumType44);
        org.junit.Assert.assertTrue("'" + resolveMode45 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode45.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode46 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode46.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode47 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode47.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode48 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode48.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode49 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode49.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode50 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode50.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode51 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode51.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode52 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode52.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode53 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode53.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertNotNull(resolveModeList54);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertNotNull(functionType61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(jSTypeArray67);
        org.junit.Assert.assertNotNull(functionType68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable70);
        org.junit.Assert.assertNull(jSType71);
        org.junit.Assert.assertNotNull(jSType72);
        org.junit.Assert.assertNotNull(ternaryValue73);
        org.junit.Assert.assertNotNull(jSType75);
        org.junit.Assert.assertNotNull(jSTypeIterable79);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00245");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable7 = functionType5.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType8 = functionType5.unboxesTo();
        boolean boolean10 = functionType5.removeProperty("");
        int int11 = functionType5.getMaxArguments();
        java.lang.String str12 = functionType5.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, false);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray17 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType18 = jSTypeRegistry15.createFunctionType(jSType16, jSTypeArray17);
        boolean boolean19 = functionType18.isNominalType();
        functionType5.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType18);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, false);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry23.createFunctionType(jSType24, jSTypeArray25);
        boolean boolean27 = functionType26.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable28 = functionType26.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType26.unboxesTo();
        boolean boolean31 = functionType26.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType32 = functionType26.getImplicitPrototype();
        functionType5.setPrototypeBasedOn(objectType32);
        boolean boolean35 = functionType5.hasOwnProperty("(function (): ?|null)");
        boolean boolean36 = functionType5.hasImplementedInterfaces();
        com.google.javascript.rhino.JSDocInfo jSDocInfo37 = null;
        functionType5.setJSDocInfo(jSDocInfo37);
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(jSTypeArray17);
        org.junit.Assert.assertNotNull(functionType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable28);
        org.junit.Assert.assertNull(jSType29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00246");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, false);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry9.createFunctionType(jSType10, jSTypeArray11);
        boolean boolean13 = functionType12.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable14 = functionType12.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType15 = functionType12.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType16 = functionType12.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = functionType5.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType12);
        boolean boolean18 = functionType12.isObject();
        com.google.javascript.rhino.jstype.JSType jSType20 = functionType12.getRestrictedTypeGivenToBooleanOutcome(false);
        boolean boolean21 = jSType20.isAllType();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(jSType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00247");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList11 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableList11.iterator();
        boolean boolean13 = functionType5.equals((java.lang.Object) strComparableItor12);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14, false);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray18 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType19 = jSTypeRegistry16.createFunctionType(jSType17, jSTypeArray18);
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = functionType19.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType.TypePair typePair22 = functionType5.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) functionType19);
        com.google.javascript.rhino.Node node24 = functionType5.getPropertyNode("");
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25, false);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry27.createFunctionType(jSType28, jSTypeArray29);
        boolean boolean31 = functionType30.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable32 = functionType30.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType33 = functionType30.unboxesTo();
        boolean boolean35 = functionType30.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType36 = functionType30.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType37 = functionType30.getIndexType();
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, false);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray43 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry41.createFunctionType(jSType42, jSTypeArray43);
        boolean boolean45 = functionType44.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList50 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor51 = strComparableList50.iterator();
        boolean boolean52 = functionType44.equals((java.lang.Object) strComparableItor51);
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, false);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType59 = jSTypeRegistry56.createFunctionType(jSType57, jSTypeArray58);
        boolean boolean60 = functionType59.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable61 = functionType59.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node62 = null;
        boolean boolean63 = functionType44.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType59, node62);
        boolean boolean65 = functionType59.removeProperty("Not declared as a type name");
        com.google.javascript.rhino.jstype.ObjectType objectType66 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType59);
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node74.setString("");
        com.google.javascript.rhino.Node node77 = node70.useSourceInfoIfMissingFromForTree(node74);
        boolean boolean78 = node70.isGetElem();
        com.google.javascript.rhino.Node node79 = node70.cloneNode();
        com.google.javascript.rhino.Node node83 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node87 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node87.setString("");
        com.google.javascript.rhino.Node node90 = node83.useSourceInfoIfMissingFromForTree(node87);
        boolean boolean91 = node83.isGetElem();
        int int93 = node83.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node94 = com.google.javascript.jscomp.NodeUtil.newExpr(node83);
        com.google.javascript.rhino.Node node95 = node70.clonePropsFrom(node83);
        boolean boolean96 = node95.isNot();
        boolean boolean97 = functionType30.defineDeclaredProperty("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) objectType66, node95);
        boolean boolean98 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) functionType5, (com.google.javascript.rhino.jstype.JSType) objectType66);
        boolean boolean99 = functionType5.isEnumElementType();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableList11);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSTypeArray18);
        org.junit.Assert.assertNotNull(functionType19);
        org.junit.Assert.assertNull(jSDocInfo21);
        org.junit.Assert.assertNotNull(typePair22);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(functionType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable32);
        org.junit.Assert.assertNull(jSType33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(objectType36);
        org.junit.Assert.assertNull(jSType37);
        org.junit.Assert.assertNotNull(jSTypeArray43);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strComparableList50);
        org.junit.Assert.assertNotNull(strComparableItor51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertNotNull(functionType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(objectType66);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertNotNull(node94);
        org.junit.Assert.assertNotNull(node95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00248");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        int int13 = node3.getIntProp((int) (byte) -1);
        boolean boolean14 = node3.isLabel();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression16 = new com.google.javascript.rhino.JSTypeExpression(node3, "STRING hi!");
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node24.setString("");
        com.google.javascript.rhino.Node node27 = node20.useSourceInfoIfMissingFromForTree(node24);
        boolean boolean28 = node20.isGetElem();
        com.google.javascript.rhino.Node node29 = node20.cloneNode();
        boolean boolean30 = node29.isDebugger();
        node3.addChildToFront(node29);
        boolean boolean32 = node3.isQualifiedName();
        java.lang.String str33 = node3.getQualifiedName();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00249");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList4 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableList4.iterator();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList6 = strComparableList4.reverse();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableList6.iterator();
        int int8 = strComparableList6.size();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, false);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType16 = jSTypeRegistry13.createFunctionType(jSType14, jSTypeArray15);
        boolean boolean17 = functionType16.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable18 = functionType16.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType19 = functionType16.unboxesTo();
        boolean boolean21 = functionType16.removeProperty("");
        int int22 = functionType16.getMaxArguments();
        java.lang.String str23 = functionType16.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24, false);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray28 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry26.createFunctionType(jSType27, jSTypeArray28);
        boolean boolean30 = functionType29.isNominalType();
        functionType16.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType29);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        boolean boolean38 = functionType37.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable39 = functionType37.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType40 = functionType37.unboxesTo();
        boolean boolean42 = functionType37.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType43 = functionType37.getImplicitPrototype();
        functionType16.setPrototypeBasedOn(objectType43);
        boolean boolean46 = jSTypeRegistry10.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) functionType16, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType47 = null;
        com.google.javascript.rhino.jstype.JSType jSType49 = jSTypeRegistry10.getGreatestSubtypeWithProperty(jSType47, "");
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50, false);
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray54 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType55 = jSTypeRegistry52.createFunctionType(jSType53, jSTypeArray54);
        boolean boolean56 = functionType55.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList61 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor62 = strComparableList61.iterator();
        boolean boolean63 = functionType55.equals((java.lang.Object) strComparableItor62);
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65, false);
        com.google.javascript.rhino.jstype.JSType jSType68 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray69 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType70 = jSTypeRegistry67.createFunctionType(jSType68, jSTypeArray69);
        boolean boolean71 = functionType70.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable72 = functionType70.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node73 = null;
        boolean boolean74 = functionType55.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType70, node73);
        boolean boolean76 = functionType70.removeProperty("Not declared as a type name");
        com.google.javascript.rhino.jstype.ObjectType objectType77 = jSTypeRegistry10.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType70);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean78 = strComparableList6.remove((java.lang.Object) objectType77);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableList4);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertNotNull(strComparableList6);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(jSTypeArray28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable39);
        org.junit.Assert.assertNull(jSType40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(objectType43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(jSType49);
        org.junit.Assert.assertNotNull(jSTypeArray54);
        org.junit.Assert.assertNotNull(functionType55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(strComparableList61);
        org.junit.Assert.assertNotNull(strComparableItor62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(jSTypeArray69);
        org.junit.Assert.assertNotNull(functionType70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(objectType77);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00250");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isUnionType();
        boolean boolean7 = functionType5.isDateType();
        boolean boolean8 = functionType5.isResolved();
        com.google.javascript.rhino.Node node10 = functionType5.getPropertyNode("[, hi!, STRING hi!, STRING hi!]");
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, false);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType16 = jSTypeRegistry13.createFunctionType(jSType14, jSTypeArray15);
        boolean boolean17 = functionType16.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList22 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor23 = strComparableList22.iterator();
        boolean boolean24 = functionType16.equals((java.lang.Object) strComparableItor23);
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25, false);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry27.createFunctionType(jSType28, jSTypeArray29);
        com.google.javascript.rhino.JSDocInfo jSDocInfo32 = functionType30.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType.TypePair typePair33 = functionType16.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) functionType30);
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, false);
        com.google.javascript.rhino.jstype.ObjectType objectType37 = jSTypeRegistry36.createAnonymousObjectType();
        jSTypeRegistry36.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, false);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray43 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry41.createFunctionType(jSType42, jSTypeArray43);
        boolean boolean45 = functionType44.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable46 = functionType44.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType47 = functionType44.unboxesTo();
        com.google.javascript.rhino.jstype.ObjectType.Property property49 = functionType44.getSlot("unknown");
        com.google.javascript.rhino.jstype.JSType jSType50 = jSTypeRegistry36.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) functionType44);
        boolean boolean51 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) functionType16, jSType50);
        boolean boolean52 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) functionType5, (com.google.javascript.rhino.jstype.JSType) functionType16);
        boolean boolean53 = functionType5.isInstanceType();
        boolean boolean54 = functionType5.isFunctionPrototypeType();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strComparableList22);
        org.junit.Assert.assertNotNull(strComparableItor23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(functionType30);
        org.junit.Assert.assertNull(jSDocInfo32);
        org.junit.Assert.assertNotNull(typePair33);
        org.junit.Assert.assertNotNull(objectType37);
        org.junit.Assert.assertNotNull(jSTypeArray43);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable46);
        org.junit.Assert.assertNull(jSType47);
        org.junit.Assert.assertNull(property49);
        org.junit.Assert.assertNotNull(jSType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00251");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node11.setString("");
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node11);
        node11.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry19.createFunctionType(jSType20, jSTypeArray21);
        boolean boolean23 = functionType22.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry2.createObjectType("hi!", node11, (com.google.javascript.rhino.jstype.ObjectType) functionType22);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node26 = jSTypeRegistry2.createParametersWithVarArgs(jSTypeArray25);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, false);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry30.createFunctionType(jSType31, jSTypeArray32);
        boolean boolean34 = functionType33.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable35 = functionType33.getCtorImplementedInterfaces();
        jSTypeRegistry2.registerPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) functionType33);
        com.google.javascript.rhino.jstype.JSType jSType38 = jSTypeRegistry2.getType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n");
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, false);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray43 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry41.createFunctionType(jSType42, jSTypeArray43);
        boolean boolean45 = functionType44.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList50 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor51 = strComparableList50.iterator();
        boolean boolean52 = functionType44.equals((java.lang.Object) strComparableItor51);
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, false);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType59 = jSTypeRegistry56.createFunctionType(jSType57, jSTypeArray58);
        boolean boolean60 = functionType59.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable61 = functionType59.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node62 = null;
        boolean boolean63 = functionType44.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType59, node62);
        java.util.Set<java.lang.String> strSet64 = functionType44.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.ObjectType objectType65 = functionType44.getParentScope();
        com.google.javascript.rhino.Node node67 = functionType44.getPropertyNode("");
        com.google.javascript.rhino.ErrorReporter errorReporter68 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter68, false);
        com.google.javascript.rhino.jstype.JSType jSType71 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray72 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType73 = jSTypeRegistry70.createFunctionType(jSType71, jSTypeArray72);
        boolean boolean74 = functionType73.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter75 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter75, false);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray79 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType80 = jSTypeRegistry77.createFunctionType(jSType78, jSTypeArray79);
        boolean boolean81 = functionType80.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable82 = functionType80.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType83 = functionType80.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType84 = functionType80.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue85 = functionType73.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType80);
        boolean boolean86 = functionType80.isNumberObjectType();
        boolean boolean87 = functionType80.isReturnTypeInferred();
        com.google.javascript.rhino.jstype.JSType jSType88 = functionType80.getParameterType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType89 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType44, jSType88);
        boolean boolean91 = parameterizedType89.isPropertyTypeDeclared("function (): {308555690}");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean92 = parameterizedType89.hasAnyTemplateInternal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable35);
        org.junit.Assert.assertNull(jSType38);
        org.junit.Assert.assertNotNull(jSTypeArray43);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strComparableList50);
        org.junit.Assert.assertNotNull(strComparableItor51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertNotNull(functionType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertNotNull(objectType65);
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertNotNull(jSTypeArray72);
        org.junit.Assert.assertNotNull(functionType73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(jSTypeArray79);
        org.junit.Assert.assertNotNull(functionType80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable82);
        org.junit.Assert.assertNull(jSType83);
        org.junit.Assert.assertNotNull(jSType84);
        org.junit.Assert.assertNotNull(ternaryValue85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNull(jSType88);
        org.junit.Assert.assertNotNull(parameterizedType89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00252");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node11.setString("");
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node11);
        node11.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry19.createFunctionType(jSType20, jSTypeArray21);
        boolean boolean23 = functionType22.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry2.createObjectType("hi!", node11, (com.google.javascript.rhino.jstype.ObjectType) functionType22);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node26 = jSTypeRegistry2.createParametersWithVarArgs(jSTypeArray25);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, false);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry30.createFunctionType(jSType31, jSTypeArray32);
        boolean boolean34 = functionType33.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable35 = functionType33.getCtorImplementedInterfaces();
        jSTypeRegistry2.registerPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) functionType33);
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37, false);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry39.createFunctionType(jSType40, jSTypeArray41);
        boolean boolean43 = functionType42.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable44 = functionType42.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType45 = functionType42.unboxesTo();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection46 = jSTypeRegistry2.getDirectImplementors((com.google.javascript.rhino.jstype.ObjectType) functionType42);
        boolean boolean48 = functionType42.removeProperty("([, hi!, STRING hi!, STRING hi!])");
        boolean boolean49 = functionType42.hasReferenceName();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType50 = functionType42.cloneWithoutArrowType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable35);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable44);
        org.junit.Assert.assertNull(jSType45);
        org.junit.Assert.assertNotNull(functionTypeCollection46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00253");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        int int13 = node3.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node21.setString("");
        com.google.javascript.rhino.Node node24 = node17.useSourceInfoIfMissingFromForTree(node21);
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25, false);
        com.google.javascript.rhino.jstype.ObjectType objectType28 = jSTypeRegistry27.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, false);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray34 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType35 = jSTypeRegistry32.createFunctionType(jSType33, jSTypeArray34);
        boolean boolean36 = functionType35.isNominalType();
        boolean boolean37 = jSTypeRegistry27.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType35);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node46.setString("");
        com.google.javascript.rhino.Node node49 = node42.useSourceInfoIfMissingFromForTree(node46);
        boolean boolean50 = node42.isGetElem();
        com.google.javascript.rhino.Node node51 = node42.cloneNode();
        boolean boolean52 = node51.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile53 = node51.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, false);
        com.google.javascript.rhino.ErrorReporter errorReporter57 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter57, false);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray61 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType62 = jSTypeRegistry59.createFunctionType(jSType60, jSTypeArray61);
        com.google.javascript.rhino.JSDocInfo jSDocInfo64 = functionType62.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry56.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType62);
        com.google.javascript.rhino.JSDocInfo jSDocInfo66 = functionType62.getJSDocInfo();
        boolean boolean68 = functionType62.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType69 = jSTypeRegistry27.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node51, (com.google.javascript.rhino.jstype.JSType) functionType62);
        boolean boolean70 = node51.isGetElem();
        node51.setWasEmptyNode(true);
        boolean boolean73 = node24.hasChild(node51);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node74 = node3.removeChildAfter(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(objectType28);
        org.junit.Assert.assertNotNull(jSTypeArray34);
        org.junit.Assert.assertNotNull(functionType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(staticSourceFile53);
        org.junit.Assert.assertNotNull(jSTypeArray61);
        org.junit.Assert.assertNotNull(functionType62);
        org.junit.Assert.assertNull(jSDocInfo64);
        org.junit.Assert.assertNotNull(jSType65);
        org.junit.Assert.assertNull(jSDocInfo66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(enumType69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00254");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node11.setString("");
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node11);
        node11.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry19.createFunctionType(jSType20, jSTypeArray21);
        boolean boolean23 = functionType22.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry2.createObjectType("hi!", node11, (com.google.javascript.rhino.jstype.ObjectType) functionType22);
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25, false);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry27.createFunctionType(jSType28, jSTypeArray29);
        boolean boolean31 = functionType30.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList36 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor37 = strComparableList36.iterator();
        boolean boolean38 = functionType30.equals((java.lang.Object) strComparableItor37);
        com.google.javascript.rhino.Node node39 = functionType30.getSource();
        com.google.javascript.rhino.jstype.JSType jSType41 = jSTypeRegistry2.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType) functionType30, "hi!");
        boolean boolean43 = jSTypeRegistry2.isForwardDeclaredType("Not declared as a type name");
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44, false);
        com.google.javascript.rhino.jstype.JSType jSType47 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray48 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry46.createFunctionType(jSType47, jSTypeArray48);
        boolean boolean50 = functionType49.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable51 = functionType49.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType52 = functionType49.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType53 = functionType49.getReturnType();
        boolean boolean55 = jSTypeRegistry2.canPropertyBeDefined(jSType53, "Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionType functionType56 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter57 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter57, false);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray61 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType62 = jSTypeRegistry59.createFunctionType(jSType60, jSTypeArray61);
        boolean boolean63 = functionType62.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList68 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor69 = strComparableList68.iterator();
        boolean boolean70 = functionType62.equals((java.lang.Object) strComparableItor69);
        com.google.javascript.rhino.Node node71 = functionType62.getSource();
        boolean boolean72 = functionType62.isNumberObjectType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType73 = jSTypeRegistry2.createFunctionTypeWithNewThisType(functionType56, (com.google.javascript.rhino.jstype.ObjectType) functionType62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(functionType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strComparableList36);
        org.junit.Assert.assertNotNull(strComparableItor37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNotNull(jSType41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jSTypeArray48);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable51);
        org.junit.Assert.assertNull(jSType52);
        org.junit.Assert.assertNotNull(jSType53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(jSTypeArray61);
        org.junit.Assert.assertNotNull(functionType62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strComparableList68);
        org.junit.Assert.assertNotNull(strComparableItor69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00255");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(40);
        boolean boolean2 = node1.isAdd();
        boolean boolean3 = node1.isDefaultCase();
        boolean boolean4 = node1.isExprResult();
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative6 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec7 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("", jSTypeNative6);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node15.setString("");
        com.google.javascript.rhino.Node node18 = node11.useSourceInfoIfMissingFromForTree(node15);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node26.setString("");
        com.google.javascript.rhino.Node node29 = node22.useSourceInfoIfMissingFromForTree(node26);
        node26.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node39.setString("");
        com.google.javascript.rhino.Node node42 = node35.useSourceInfoIfMissingFromForTree(node39);
        boolean boolean43 = node35.isGetElem();
        int int45 = node35.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newExpr(node35);
        com.google.javascript.rhino.Node node47 = node26.srcrefTree(node46);
        java.lang.String str48 = node18.checkTreeEquals(node46);
        boolean boolean49 = node46.hasMoreThanOneChild();
        boolean boolean50 = node46.isNE();
        com.google.javascript.rhino.Node node51 = assertionFunctionSpec7.getAssertedParam(node46);
        boolean boolean52 = node51.isWith();
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString((int) (short) 10, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            node1.addChildAfter(node51, node55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n" + "'", str48, "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node55);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00256");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags0 = new com.google.javascript.rhino.Node.SideEffectFlags();
        sideEffectFlags0.setThrows();
        sideEffectFlags0.clearAllFlags();
        sideEffectFlags0.setMutatesArguments();
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00257");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isExport();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility4 = jSDocInfo0.getVisibility();
        boolean boolean5 = jSDocInfo0.isJavaDispatch();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(visibility4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00258");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        java.lang.String str11 = node3.toString();
        com.google.javascript.rhino.JSDocInfo jSDocInfo12 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean13 = jSDocInfo12.hasReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility14 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        jSDocInfo12.setVisibility(visibility14);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression16 = jSDocInfo12.getEnumParameterType();
        node3.setJSDocInfo(jSDocInfo12);
        boolean boolean18 = jSDocInfo12.hasTypedefType();
        boolean boolean19 = jSDocInfo12.isNoCompile();
        com.google.common.collect.ImmutableList<java.lang.String> strList20 = jSDocInfo12.getTemplateTypeNames();
        boolean boolean21 = jSDocInfo12.isNoSideEffects();
        boolean boolean22 = jSDocInfo12.isExterns();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "STRING hi!" + "'", str11, "STRING hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + visibility14 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility14.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
        org.junit.Assert.assertNull(jSTypeExpression16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00259");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        boolean boolean2 = jSDocInfo0.isDefine();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(jSTypeExpression3);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00260");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry7.createFunctionType(jSType8, jSTypeArray9);
        boolean boolean11 = functionType10.isNominalType();
        boolean boolean12 = jSTypeRegistry2.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node21.setString("");
        com.google.javascript.rhino.Node node24 = node17.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean25 = node17.isGetElem();
        com.google.javascript.rhino.Node node26 = node17.cloneNode();
        boolean boolean27 = node26.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = node26.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, false);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = functionType37.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry31.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = functionType37.getJSDocInfo();
        boolean boolean43 = functionType37.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType44 = jSTypeRegistry2.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node26, (com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.jstype.EnumType enumType45 = enumType44.toMaybeEnumType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType46 = enumType45.getElementsType();
        com.google.javascript.rhino.jstype.JSType jSType48 = enumElementType46.getPropertyType("true");
        boolean boolean49 = enumElementType46.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType50 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.TernaryValue ternaryValue51 = enumElementType46.testForEquality(jSType50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(staticSourceFile28);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertNull(jSDocInfo39);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertNull(jSDocInfo41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(enumType44);
        org.junit.Assert.assertNotNull(enumType45);
        org.junit.Assert.assertNotNull(enumElementType46);
        org.junit.Assert.assertNotNull(jSType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00261");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable7 = functionType5.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType8 = functionType5.unboxesTo();
        boolean boolean10 = functionType5.removeProperty("");
        int int11 = functionType5.getMaxArguments();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, false);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType17 = jSTypeRegistry14.createFunctionType(jSType15, jSTypeArray16);
        boolean boolean18 = functionType17.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable19 = functionType17.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType20 = functionType17.unboxesTo();
        boolean boolean22 = functionType17.removeProperty("");
        int int23 = functionType17.getMaxArguments();
        java.lang.String str24 = functionType17.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25, false);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry27.createFunctionType(jSType28, jSTypeArray29);
        boolean boolean31 = functionType30.isNominalType();
        functionType17.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType30);
        boolean boolean33 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) functionType5, (com.google.javascript.rhino.jstype.JSType) functionType30);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = functionType30.getParentScope();
        com.google.javascript.rhino.jstype.JSType jSType35 = objectType34.autobox();
        com.google.javascript.rhino.jstype.JSType jSType37 = objectType34.findPropertyType("function (): {704344377}");
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertNotNull(functionType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(functionType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertNotNull(jSType35);
        org.junit.Assert.assertNull(jSType37);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00262");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node11.setString("");
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node11);
        node11.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry19.createFunctionType(jSType20, jSTypeArray21);
        boolean boolean23 = functionType22.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry2.createObjectType("hi!", node11, (com.google.javascript.rhino.jstype.ObjectType) functionType22);
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25, false);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry27.createFunctionType(jSType28, jSTypeArray29);
        boolean boolean31 = functionType30.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList36 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor37 = strComparableList36.iterator();
        boolean boolean38 = functionType30.equals((java.lang.Object) strComparableItor37);
        com.google.javascript.rhino.Node node39 = functionType30.getSource();
        com.google.javascript.rhino.jstype.JSType jSType41 = jSTypeRegistry2.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType) functionType30, "hi!");
        boolean boolean43 = jSTypeRegistry2.isForwardDeclaredType("Not declared as a type name");
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44, false);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node55.setString("");
        com.google.javascript.rhino.Node node58 = node51.useSourceInfoIfMissingFromForTree(node55);
        node55.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61, false);
        com.google.javascript.rhino.jstype.JSType jSType64 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray65 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType66 = jSTypeRegistry63.createFunctionType(jSType64, jSTypeArray65);
        boolean boolean67 = functionType66.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType68 = jSTypeRegistry46.createObjectType("hi!", node55, (com.google.javascript.rhino.jstype.ObjectType) functionType66);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray69 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node70 = jSTypeRegistry46.createParametersWithVarArgs(jSTypeArray69);
        com.google.javascript.rhino.ErrorReporter errorReporter72 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry74 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter72, false);
        com.google.javascript.rhino.jstype.JSType jSType75 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray76 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType77 = jSTypeRegistry74.createFunctionType(jSType75, jSTypeArray76);
        boolean boolean78 = functionType77.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable79 = functionType77.getCtorImplementedInterfaces();
        jSTypeRegistry46.registerPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) functionType77);
        com.google.javascript.rhino.ErrorReporter errorReporter81 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry83 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter81, false);
        com.google.javascript.rhino.jstype.JSType jSType84 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray85 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType86 = jSTypeRegistry83.createFunctionType(jSType84, jSTypeArray85);
        boolean boolean87 = functionType86.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable88 = functionType86.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType89 = functionType86.unboxesTo();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection90 = jSTypeRegistry46.getDirectImplementors((com.google.javascript.rhino.jstype.ObjectType) functionType86);
        com.google.javascript.rhino.ErrorReporter errorReporter91 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry93 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter91, false);
        com.google.javascript.rhino.jstype.JSType jSType94 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray95 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType96 = jSTypeRegistry93.createFunctionType(jSType94, jSTypeArray95);
        com.google.javascript.rhino.Node node97 = jSTypeRegistry46.createParametersWithVarArgs(jSTypeArray95);
        com.google.javascript.rhino.jstype.JSType jSType98 = jSTypeRegistry2.createUnionType(jSTypeArray95);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(functionType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strComparableList36);
        org.junit.Assert.assertNotNull(strComparableItor37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNotNull(jSType41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(jSTypeArray65);
        org.junit.Assert.assertNotNull(functionType66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(objectType68);
        org.junit.Assert.assertNotNull(jSTypeArray69);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(jSTypeArray76);
        org.junit.Assert.assertNotNull(functionType77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable79);
        org.junit.Assert.assertNotNull(jSTypeArray85);
        org.junit.Assert.assertNotNull(functionType86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable88);
        org.junit.Assert.assertNull(jSType89);
        org.junit.Assert.assertNotNull(functionTypeCollection90);
        org.junit.Assert.assertNotNull(jSTypeArray95);
        org.junit.Assert.assertNotNull(functionType96);
        org.junit.Assert.assertNotNull(node97);
        org.junit.Assert.assertNotNull(jSType98);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00263");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry7.createFunctionType(jSType8, jSTypeArray9);
        boolean boolean11 = functionType10.isNominalType();
        boolean boolean12 = jSTypeRegistry2.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node21.setString("");
        com.google.javascript.rhino.Node node24 = node17.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean25 = node17.isGetElem();
        com.google.javascript.rhino.Node node26 = node17.cloneNode();
        boolean boolean27 = node26.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = node26.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, false);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = functionType37.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry31.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = functionType37.getJSDocInfo();
        boolean boolean43 = functionType37.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType44 = jSTypeRegistry2.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node26, (com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.jstype.EnumType enumType45 = enumType44.toMaybeEnumType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType46 = enumType45.getElementsType();
        com.google.javascript.rhino.jstype.ObjectType objectType47 = enumElementType46.getImplicitPrototype();
        com.google.javascript.rhino.jstype.FunctionType functionType48 = enumElementType46.getConstructor();
        boolean boolean49 = enumElementType46.matchesNumberContext();
        com.google.javascript.rhino.jstype.TemplateType templateType50 = enumElementType46.toMaybeTemplateType();
        com.google.javascript.rhino.jstype.ObjectType objectType51 = enumElementType46.getImplicitPrototype();
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(staticSourceFile28);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertNull(jSDocInfo39);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertNull(jSDocInfo41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(enumType44);
        org.junit.Assert.assertNotNull(enumType45);
        org.junit.Assert.assertNotNull(enumElementType46);
        org.junit.Assert.assertNull(objectType47);
        org.junit.Assert.assertNull(functionType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(templateType50);
        org.junit.Assert.assertNull(objectType51);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00264");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node9.setString("");
        com.google.javascript.rhino.Node node12 = node5.useSourceInfoIfMissingFromForTree(node9);
        boolean boolean13 = node5.isGetElem();
        int int15 = node5.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newExpr(node5);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node24.setString("");
        com.google.javascript.rhino.Node node27 = node20.useSourceInfoIfMissingFromForTree(node24);
        boolean boolean28 = node20.isGetElem();
        com.google.javascript.rhino.Node node29 = node20.cloneNode();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node37.setString("");
        com.google.javascript.rhino.Node node40 = node33.useSourceInfoIfMissingFromForTree(node37);
        boolean boolean41 = node33.isGetElem();
        int int43 = node33.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newExpr(node33);
        com.google.javascript.rhino.Node node45 = node20.clonePropsFrom(node33);
        boolean boolean46 = node20.isGetElem();
        com.google.javascript.rhino.Node node47 = node16.useSourceInfoFrom(node20);
        com.google.javascript.rhino.Node node48 = node47.removeFirstChild();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node(41, node1, node48, 4095, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node48);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00265");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node11.setString("");
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node11);
        node11.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry19.createFunctionType(jSType20, jSTypeArray21);
        boolean boolean23 = functionType22.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry2.createObjectType("hi!", node11, (com.google.javascript.rhino.jstype.ObjectType) functionType22);
        boolean boolean25 = functionType22.isStringObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, false);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray30 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType31 = jSTypeRegistry28.createFunctionType(jSType29, jSTypeArray30);
        boolean boolean32 = functionType31.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable33 = functionType31.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType34 = functionType31.unboxesTo();
        boolean boolean36 = functionType31.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType37 = functionType31.getImplicitPrototype();
        com.google.javascript.rhino.jstype.ObjectType objectType38 = functionType31.dereference();
        com.google.javascript.rhino.jstype.JSType jSType39 = functionType22.getGreatestSubtype((com.google.javascript.rhino.jstype.JSType) objectType38);
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, false);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray44 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSTypeRegistry42.createFunctionType(jSType43, jSTypeArray44);
        boolean boolean46 = functionType45.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47, false);
        com.google.javascript.rhino.jstype.JSType jSType50 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray51 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType52 = jSTypeRegistry49.createFunctionType(jSType50, jSTypeArray51);
        boolean boolean53 = functionType52.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable54 = functionType52.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType55 = functionType52.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType56 = functionType52.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue57 = functionType45.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType52);
        com.google.javascript.rhino.Node node58 = functionType45.getSource();
        boolean boolean60 = functionType45.isPropertyInExterns("(function (): ?|null)");
        boolean boolean61 = jSType39.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType45);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot63 = functionType45.getOwnSlot("Not declared as a constructor");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jSTypeArray30);
        org.junit.Assert.assertNotNull(functionType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable33);
        org.junit.Assert.assertNull(jSType34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objectType37);
        org.junit.Assert.assertNotNull(objectType38);
        org.junit.Assert.assertNotNull(jSType39);
        org.junit.Assert.assertNotNull(jSTypeArray44);
        org.junit.Assert.assertNotNull(functionType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(jSTypeArray51);
        org.junit.Assert.assertNotNull(functionType52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable54);
        org.junit.Assert.assertNull(jSType55);
        org.junit.Assert.assertNotNull(jSType56);
        org.junit.Assert.assertNotNull(ternaryValue57);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot63);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00266");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node8.setString("");
        com.google.javascript.rhino.Node node11 = node4.useSourceInfoIfMissingFromForTree(node8);
        boolean boolean12 = node4.isGetElem();
        com.google.javascript.rhino.Node node13 = node4.cloneNode();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node21.setString("");
        com.google.javascript.rhino.Node node24 = node17.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean25 = node17.isGetElem();
        int int27 = node17.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newExpr(node17);
        com.google.javascript.rhino.Node node29 = node4.clonePropsFrom(node17);
        boolean boolean30 = node29.isDec();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) 52);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node40.setString("");
        com.google.javascript.rhino.Node node43 = node36.useSourceInfoIfMissingFromForTree(node40);
        boolean boolean44 = node36.isGetElem();
        com.google.javascript.rhino.Node node45 = node36.cloneNode();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node53.setString("");
        com.google.javascript.rhino.Node node56 = node49.useSourceInfoIfMissingFromForTree(node53);
        boolean boolean57 = node49.isGetElem();
        int int59 = node49.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node60 = com.google.javascript.jscomp.NodeUtil.newExpr(node49);
        com.google.javascript.rhino.Node node61 = node36.clonePropsFrom(node49);
        boolean boolean62 = node61.isReturn();
        com.google.javascript.jscomp.CodingConvention.Bind bind63 = new com.google.javascript.jscomp.CodingConvention.Bind(node29, node32, node61);
        boolean boolean64 = node29.isBreak();
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node72.setString("");
        com.google.javascript.rhino.Node node75 = node68.useSourceInfoIfMissingFromForTree(node72);
        boolean boolean76 = node68.isGetElem();
        com.google.javascript.rhino.Node node77 = node68.cloneNode();
        boolean boolean78 = node77.isDebugger();
        node77.setQuotedString();
        com.google.javascript.rhino.Node node82 = new com.google.javascript.rhino.Node(100, node29, node77, 49, 10);
        boolean boolean83 = node77.isVar();
        boolean boolean84 = node77.isCase();
        boolean boolean85 = node77.isObjectLit();
        // The following exception was thrown during execution in test generation
        try {
            node77.setDouble(10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: STRING hi! [quoted: 1] is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00267");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry7.createFunctionType(jSType8, jSTypeArray9);
        boolean boolean11 = functionType10.isNominalType();
        boolean boolean12 = jSTypeRegistry2.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node21.setString("");
        com.google.javascript.rhino.Node node24 = node17.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean25 = node17.isGetElem();
        com.google.javascript.rhino.Node node26 = node17.cloneNode();
        boolean boolean27 = node26.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = node26.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, false);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = functionType37.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry31.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = functionType37.getJSDocInfo();
        boolean boolean43 = functionType37.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType44 = jSTypeRegistry2.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node26, (com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.jstype.EnumType enumType45 = enumType44.toMaybeEnumType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType46 = enumType45.getElementsType();
        boolean boolean47 = enumElementType46.matchesObjectContext();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType48 = enumElementType46.toMaybeEnumElementType();
        boolean boolean49 = enumElementType46.isNullable();
        boolean boolean50 = enumElementType46.hasReferenceName();
        boolean boolean51 = enumElementType46.matchesObjectContext();
        com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> jSTypePredicate52 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean53 = enumElementType46.setValidator(jSTypePredicate52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(staticSourceFile28);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertNull(jSDocInfo39);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertNull(jSDocInfo41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(enumType44);
        org.junit.Assert.assertNotNull(enumType45);
        org.junit.Assert.assertNotNull(enumElementType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(enumElementType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00268");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        com.google.javascript.rhino.jstype.JSType jSType7 = functionType5.getParameterType();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node15.setString("");
        com.google.javascript.rhino.Node node18 = node11.useSourceInfoIfMissingFromForTree(node15);
        boolean boolean19 = node11.isGetElem();
        com.google.javascript.rhino.Node node20 = node11.cloneNode();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile21 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node11);
        boolean boolean22 = node11.isNot();
        functionType5.setSource(node11);
        java.util.Set<java.lang.String> strSet24 = functionType5.getOwnPropertyNames();
        com.google.javascript.rhino.JSDocInfo jSDocInfo25 = functionType5.getJSDocInfo();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(staticSourceFile21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNull(jSDocInfo25);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00269");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        int int13 = node3.getIntProp((int) (byte) -1);
        boolean boolean14 = node3.isLabel();
        boolean boolean15 = node3.isGetProp();
        com.google.javascript.rhino.Node node16 = node3.removeFirstChild();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00270");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        int int4 = node3.getLineno();
        boolean boolean5 = node3.isEmpty();
        node3.setSourceEncodedPosition(54);
        int int8 = node3.getChildCount();
        boolean boolean9 = node3.isQuotedString();
        node3.putBooleanProp(0, false);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node20.setString("");
        com.google.javascript.rhino.Node node23 = node16.useSourceInfoIfMissingFromForTree(node20);
        boolean boolean24 = node16.isGetElem();
        boolean boolean25 = node16.isFromExterns();
        boolean boolean26 = node16.isUnscopedQualifiedName();
        boolean boolean27 = node16.isVoid();
        boolean boolean28 = node16.isScript();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString((int) (short) -1, "true");
        boolean boolean32 = node31.isBlock();
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node31);
        boolean boolean34 = node31.isTry();
        // The following exception was thrown during execution in test generation
        try {
            node3.addChildAfter(node16, node31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00271");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        com.google.javascript.rhino.Node node12 = node3.cloneNode();
        boolean boolean13 = node12.isContinue();
        com.google.javascript.rhino.Node node14 = node12.cloneTree();
        node14.setSourceEncodedPosition((int) (short) 10);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile17 = node14.getStaticSourceFile();
        boolean boolean18 = node14.isFor();
        boolean boolean19 = node14.isFalse();
        // The following exception was thrown during execution in test generation
        try {
            int int21 = node14.getExistingIntProp(31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 31");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(staticSourceFile17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00272");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        com.google.javascript.rhino.Node node12 = node3.cloneNode();
        boolean boolean13 = node12.isDebugger();
        boolean boolean14 = node12.isNull();
        boolean boolean15 = node12.hasMoreThanOneChild();
        com.google.javascript.rhino.InputId inputId16 = com.google.javascript.jscomp.NodeUtil.getInputId(node12);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00273");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry7.createFunctionType(jSType8, jSTypeArray9);
        boolean boolean11 = functionType10.isNominalType();
        boolean boolean12 = jSTypeRegistry2.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node21.setString("");
        com.google.javascript.rhino.Node node24 = node17.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean25 = node17.isGetElem();
        com.google.javascript.rhino.Node node26 = node17.cloneNode();
        boolean boolean27 = node26.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = node26.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, false);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = functionType37.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry31.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = functionType37.getJSDocInfo();
        boolean boolean43 = functionType37.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType44 = jSTypeRegistry2.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node26, (com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.Node node45 = enumType44.getSource();
        boolean boolean46 = enumType44.isNullable();
        java.util.Set<java.lang.String> strSet47 = enumType44.getElements();
        int int48 = strSet47.size();
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(staticSourceFile28);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertNull(jSDocInfo39);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertNull(jSDocInfo41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(enumType44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strSet47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00274");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((int) ' ');
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition2 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node10.setString("");
        com.google.javascript.rhino.Node node13 = node6.useSourceInfoIfMissingFromForTree(node10);
        boolean boolean14 = node6.isGetElem();
        com.google.javascript.rhino.Node node15 = node6.cloneNode();
        boolean boolean16 = node15.isContinue();
        com.google.javascript.rhino.Node node17 = node15.cloneTree();
        boolean boolean18 = node15.isLocalResultCall();
        typePosition2.setItem(node15);
        node1.addChildrenToFront(node15);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node28.setString("");
        com.google.javascript.rhino.Node node31 = node24.useSourceInfoIfMissingFromForTree(node28);
        node28.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node41.setString("");
        com.google.javascript.rhino.Node node44 = node37.useSourceInfoIfMissingFromForTree(node41);
        boolean boolean45 = node37.isGetElem();
        int int47 = node37.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node48 = com.google.javascript.jscomp.NodeUtil.newExpr(node37);
        com.google.javascript.rhino.Node node49 = node28.srcrefTree(node48);
        int int50 = node48.getChildCount();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node58.setString("");
        com.google.javascript.rhino.Node node61 = node54.useSourceInfoIfMissingFromForTree(node58);
        boolean boolean62 = node54.isGetElem();
        com.google.javascript.rhino.Node node63 = node54.cloneNode();
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node71.setString("");
        com.google.javascript.rhino.Node node74 = node67.useSourceInfoIfMissingFromForTree(node71);
        boolean boolean75 = node67.isGetElem();
        int int77 = node67.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node78 = com.google.javascript.jscomp.NodeUtil.newExpr(node67);
        com.google.javascript.rhino.Node node79 = node54.clonePropsFrom(node67);
        int int80 = node54.getLength();
        // The following exception was thrown during execution in test generation
        try {
            node15.addChildAfter(node48, node54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00275");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, false);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry9.createFunctionType(jSType10, jSTypeArray11);
        boolean boolean13 = functionType12.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable14 = functionType12.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType15 = functionType12.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType16 = functionType12.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = functionType5.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType12);
        com.google.javascript.rhino.Node node18 = functionType5.getSource();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19, false);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry21.createFunctionType(jSType22, jSTypeArray23);
        boolean boolean25 = functionType24.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList30 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor31 = strComparableList30.iterator();
        boolean boolean32 = functionType24.equals((java.lang.Object) strComparableItor31);
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, false);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry36.createFunctionType(jSType37, jSTypeArray38);
        boolean boolean40 = functionType39.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable41 = functionType39.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node42 = null;
        boolean boolean43 = functionType24.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType39, node42);
        boolean boolean45 = functionType39.removeProperty("Not declared as a type name");
        boolean boolean46 = functionType5.hasEqualCallType(functionType39);
        boolean boolean47 = functionType5.isTemplateType();
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48, false);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node59.setString("");
        com.google.javascript.rhino.Node node62 = node55.useSourceInfoIfMissingFromForTree(node59);
        node59.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65, false);
        com.google.javascript.rhino.jstype.JSType jSType68 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray69 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType70 = jSTypeRegistry67.createFunctionType(jSType68, jSTypeArray69);
        boolean boolean71 = functionType70.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType72 = jSTypeRegistry50.createObjectType("hi!", node59, (com.google.javascript.rhino.jstype.ObjectType) functionType70);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray73 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node74 = jSTypeRegistry50.createParametersWithVarArgs(jSTypeArray73);
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry78 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76, false);
        com.google.javascript.rhino.jstype.JSType jSType79 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray80 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType81 = jSTypeRegistry78.createFunctionType(jSType79, jSTypeArray80);
        boolean boolean82 = functionType81.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable83 = functionType81.getCtorImplementedInterfaces();
        jSTypeRegistry50.registerPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) functionType81);
        com.google.javascript.rhino.ErrorReporter errorReporter85 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry87 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter85, false);
        com.google.javascript.rhino.jstype.JSType jSType88 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray89 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType90 = jSTypeRegistry87.createFunctionType(jSType88, jSTypeArray89);
        boolean boolean91 = functionType90.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable92 = functionType90.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType93 = functionType90.unboxesTo();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection94 = jSTypeRegistry50.getDirectImplementors((com.google.javascript.rhino.jstype.ObjectType) functionType90);
        boolean boolean96 = functionType90.removeProperty("([, hi!, STRING hi!, STRING hi!])");
        boolean boolean97 = functionType90.hasReferenceName();
        boolean boolean98 = functionType5.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType90);
        boolean boolean99 = functionType90.isNativeObjectType();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strComparableList30);
        org.junit.Assert.assertNotNull(strComparableItor31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSTypeArray38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(jSTypeArray69);
        org.junit.Assert.assertNotNull(functionType70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(objectType72);
        org.junit.Assert.assertNotNull(jSTypeArray73);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertNotNull(jSTypeArray80);
        org.junit.Assert.assertNotNull(functionType81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable83);
        org.junit.Assert.assertNotNull(jSTypeArray89);
        org.junit.Assert.assertNotNull(functionType90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable92);
        org.junit.Assert.assertNull(jSType93);
        org.junit.Assert.assertNotNull(functionTypeCollection94);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00276");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        boolean boolean12 = node3.isFromExterns();
        boolean boolean13 = node3.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder14 = node3.new FileLevelJsDocBuilder();
        fileLevelJsDocBuilder14.append("function (): {621165152}");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00277");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidQualifiedName("function (): {1228830430}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00278");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node8.setString("");
        com.google.javascript.rhino.Node node11 = node4.useSourceInfoIfMissingFromForTree(node8);
        boolean boolean12 = node4.isGetElem();
        int int14 = node4.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newExpr(node4);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node23.setString("");
        com.google.javascript.rhino.Node node26 = node19.useSourceInfoIfMissingFromForTree(node23);
        boolean boolean27 = node19.isGetElem();
        com.google.javascript.rhino.Node node28 = node19.cloneNode();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node36.setString("");
        com.google.javascript.rhino.Node node39 = node32.useSourceInfoIfMissingFromForTree(node36);
        boolean boolean40 = node32.isGetElem();
        int int42 = node32.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newExpr(node32);
        com.google.javascript.rhino.Node node44 = node19.clonePropsFrom(node32);
        boolean boolean45 = node19.isGetElem();
        com.google.javascript.rhino.Node node46 = node15.useSourceInfoFrom(node19);
        node46.detachChildren();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node(31, node46, 36, 51);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node58.setString("");
        com.google.javascript.rhino.Node node61 = node54.useSourceInfoIfMissingFromForTree(node58);
        boolean boolean62 = node54.isGetElem();
        com.google.javascript.rhino.Node node63 = node54.cloneNode();
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node71.setString("");
        com.google.javascript.rhino.Node node74 = node67.useSourceInfoIfMissingFromForTree(node71);
        boolean boolean75 = node67.isGetElem();
        int int77 = node67.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node78 = com.google.javascript.jscomp.NodeUtil.newExpr(node67);
        com.google.javascript.rhino.Node node79 = node54.clonePropsFrom(node67);
        node54.addSuppression("unknown");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node82 = node46.removeChildAfter(node54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNotNull(node79);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00279");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isExport();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility4 = jSDocInfo0.getVisibility();
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative6 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec7 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("", jSTypeNative6);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node15.setString("");
        com.google.javascript.rhino.Node node18 = node11.useSourceInfoIfMissingFromForTree(node15);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node26.setString("");
        com.google.javascript.rhino.Node node29 = node22.useSourceInfoIfMissingFromForTree(node26);
        node26.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node39.setString("");
        com.google.javascript.rhino.Node node42 = node35.useSourceInfoIfMissingFromForTree(node39);
        boolean boolean43 = node35.isGetElem();
        int int45 = node35.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newExpr(node35);
        com.google.javascript.rhino.Node node47 = node26.srcrefTree(node46);
        java.lang.String str48 = node18.checkTreeEquals(node46);
        boolean boolean49 = node46.hasMoreThanOneChild();
        boolean boolean50 = node46.isNE();
        com.google.javascript.rhino.Node node51 = assertionFunctionSpec7.getAssertedParam(node46);
        node51.setSourceEncodedPositionForTree(54);
        jSDocInfo0.setAssociatedNode(node51);
        boolean boolean56 = jSDocInfo0.hasParameterType("function (): {672212780}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(visibility4);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n" + "'", str48, "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00280");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node11.setString("");
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node11);
        node11.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry19.createFunctionType(jSType20, jSTypeArray21);
        boolean boolean23 = functionType22.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry2.createObjectType("hi!", node11, (com.google.javascript.rhino.jstype.ObjectType) functionType22);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, false);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray30 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType31 = jSTypeRegistry28.createFunctionType(jSType29, jSTypeArray30);
        boolean boolean32 = functionType31.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable33 = functionType31.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType34 = functionType31.unboxesTo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo35 = new com.google.javascript.rhino.JSDocInfo();
        functionType31.setJSDocInfo(jSDocInfo35);
        boolean boolean37 = jSDocInfo35.isHidden();
        functionType22.setPropertyJSDocInfo("", jSDocInfo35);
        com.google.javascript.rhino.Node node39 = functionType22.getParametersNode();
        com.google.javascript.rhino.jstype.ObjectType.Property property41 = functionType22.getOwnSlot("function (): {308555690}");
        com.google.javascript.rhino.jstype.ObjectType objectType42 = functionType22.getTypeOfThis();
        com.google.javascript.rhino.Node node44 = functionType22.getPropertyNode("function (): {1479300960}");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(jSTypeArray30);
        org.junit.Assert.assertNotNull(functionType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable33);
        org.junit.Assert.assertNull(jSType34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNull(property41);
        org.junit.Assert.assertNotNull(objectType42);
        org.junit.Assert.assertNull(node44);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00281");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        node7.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node20.setString("");
        com.google.javascript.rhino.Node node23 = node16.useSourceInfoIfMissingFromForTree(node20);
        boolean boolean24 = node16.isGetElem();
        int int26 = node16.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newExpr(node16);
        com.google.javascript.rhino.Node node28 = node7.srcrefTree(node27);
        int int29 = node27.getSideEffectFlags();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(node27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00282");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        int int13 = node3.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
        com.google.javascript.rhino.Node node15 = node3.detachFromParent();
        boolean boolean16 = node3.isQuotedString();
        boolean boolean17 = node3.isNoSideEffectsCall();
        boolean boolean18 = node3.isSyntheticBlock();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00283");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, false);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry5.createFunctionType(jSType6, jSTypeArray7);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = functionType8.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType11 = jSTypeRegistry2.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType8);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, false);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node24.setString("");
        com.google.javascript.rhino.Node node27 = node20.useSourceInfoIfMissingFromForTree(node24);
        node24.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, false);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray34 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType35 = jSTypeRegistry32.createFunctionType(jSType33, jSTypeArray34);
        boolean boolean36 = functionType35.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType37 = jSTypeRegistry15.createObjectType("hi!", node24, (com.google.javascript.rhino.jstype.ObjectType) functionType35);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node39 = jSTypeRegistry15.createParametersWithVarArgs(jSTypeArray38);
        java.lang.String[] strArray47 = new java.lang.String[] { "[, hi!, STRING hi!, STRING hi!]", "unknown", "java.io.IOException: ", "function (): {1386872197}", "Not declared as a constructor", "Named type with empty name component", "function (): {621165152}" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        jSTypeRegistry15.setTemplateTypeNames((java.util.List<java.lang.String>) strList48);
        jSTypeRegistry2.setTemplateTypeNames((java.util.List<java.lang.String>) strList48);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode52 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode53 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode54 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode55 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode56 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode57 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode58 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode59 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode60 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode> resolveModeList61 = com.google.common.collect.ImmutableList.of(resolveMode52, resolveMode53, resolveMode54, resolveMode55, resolveMode56, resolveMode57, resolveMode58, resolveMode59, resolveMode60);
        jSTypeRegistry2.setResolveMode(resolveMode60);
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertNotNull(functionType8);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNotNull(jSType11);
        org.junit.Assert.assertNotNull(objectType12);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(jSTypeArray34);
        org.junit.Assert.assertNotNull(functionType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objectType37);
        org.junit.Assert.assertNotNull(jSTypeArray38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + resolveMode52 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode52.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode53 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode53.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode54 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode54.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode55 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode55.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode56 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode56.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode57 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode57.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode58 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode58.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode59 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode59.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode60 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode60.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertNotNull(resolveModeList61);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00284");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable7 = functionType5.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType8 = functionType5.unboxesTo();
        boolean boolean10 = functionType5.removeProperty("");
        int int11 = functionType5.getMaxArguments();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList12 = functionType5.getSubTypes();
        com.google.javascript.rhino.jstype.FunctionType functionType13 = functionType5.getOwnerFunction();
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<java.lang.String> strList14 = functionType13.getTemplateTypeNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(functionTypeList12);
        org.junit.Assert.assertNull(functionType13);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00285");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable7 = functionType5.getCtorImplementedInterfaces();
        functionType5.clearResolved();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType9 = functionType5.getInstanceType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable7);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00286");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        java.lang.String str1 = ternaryValue0.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = ternaryValue2.and(ternaryValue3);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue5 = ternaryValue0.and(ternaryValue4);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        java.lang.String str7 = ternaryValue6.toString();
        java.lang.Enum<com.google.javascript.rhino.jstype.TernaryValue> ternaryValueEnum8 = null;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = ternaryValue9.and(ternaryValue10);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        java.lang.String str13 = ternaryValue12.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue14 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = ternaryValue14.and(ternaryValue15);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = ternaryValue12.and(ternaryValue16);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue18 = ternaryValue17.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue20 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue23 = ternaryValue20.and(ternaryValue22);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        java.lang.String str25 = ternaryValue24.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue26 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue27 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue28 = ternaryValue26.and(ternaryValue27);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue29 = ternaryValue24.and(ternaryValue28);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue31 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue32 = ternaryValue28.or(ternaryValue31);
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<java.lang.Enum<com.google.javascript.rhino.jstype.TernaryValue>> ternaryValueEnumList33 = com.google.common.collect.ImmutableList.of((java.lang.Enum<com.google.javascript.rhino.jstype.TernaryValue>) ternaryValue4, (java.lang.Enum<com.google.javascript.rhino.jstype.TernaryValue>) ternaryValue6, ternaryValueEnum8, (java.lang.Enum<com.google.javascript.rhino.jstype.TernaryValue>) ternaryValue11, (java.lang.Enum<com.google.javascript.rhino.jstype.TernaryValue>) ternaryValue18, (java.lang.Enum<com.google.javascript.rhino.jstype.TernaryValue>) ternaryValue23, (java.lang.Enum<com.google.javascript.rhino.jstype.TernaryValue>) ternaryValue28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: at index 2");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "unknown" + "'", str1, "unknown");
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertNotNull(ternaryValue5);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "unknown" + "'", str7, "unknown");
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(ternaryValue10);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertNotNull(ternaryValue12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "unknown" + "'", str13, "unknown");
        org.junit.Assert.assertNotNull(ternaryValue14);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertNotNull(ternaryValue18);
        org.junit.Assert.assertNotNull(ternaryValue20);
        org.junit.Assert.assertNotNull(ternaryValue22);
        org.junit.Assert.assertNotNull(ternaryValue23);
        org.junit.Assert.assertNotNull(ternaryValue24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "unknown" + "'", str25, "unknown");
        org.junit.Assert.assertNotNull(ternaryValue26);
        org.junit.Assert.assertNotNull(ternaryValue27);
        org.junit.Assert.assertNotNull(ternaryValue28);
        org.junit.Assert.assertNotNull(ternaryValue29);
        org.junit.Assert.assertNotNull(ternaryValue31);
        org.junit.Assert.assertNotNull(ternaryValue32);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00287");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        int int5 = node4.getLineno();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node13.setString("");
        com.google.javascript.rhino.Node node16 = node9.useSourceInfoIfMissingFromForTree(node13);
        boolean boolean17 = node9.isGetElem();
        com.google.javascript.rhino.Node node18 = node9.cloneNode();
        boolean boolean19 = node18.isContinue();
        com.google.javascript.rhino.Node node20 = node18.cloneTree();
        node20.setSourceEncodedPosition((int) (short) 10);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile23 = node20.getStaticSourceFile();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(46, node4, node20, (int) (byte) -1, (-1));
        int int27 = node4.getSideEffectFlags();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node35.setString("");
        com.google.javascript.rhino.Node node38 = node31.useSourceInfoIfMissingFromForTree(node35);
        boolean boolean39 = node31.isGetElem();
        com.google.javascript.rhino.Node node40 = node31.cloneNode();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node48.setString("");
        com.google.javascript.rhino.Node node51 = node44.useSourceInfoIfMissingFromForTree(node48);
        boolean boolean52 = node44.isGetElem();
        int int54 = node44.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node55 = com.google.javascript.jscomp.NodeUtil.newExpr(node44);
        com.google.javascript.rhino.Node node56 = node31.clonePropsFrom(node44);
        boolean boolean57 = node31.isGetElem();
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node65.setString("");
        com.google.javascript.rhino.Node node68 = node61.useSourceInfoIfMissingFromForTree(node65);
        boolean boolean69 = node61.isGetElem();
        com.google.javascript.rhino.Node node70 = node61.cloneNode();
        boolean boolean71 = node70.isContinue();
        boolean boolean72 = node70.isThrow();
        // The following exception was thrown during execution in test generation
        try {
            node4.addChildBefore(node31, node70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The existing child node of the parent should not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(staticSourceFile23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00288");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("", jSTypeNative1);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node10.setString("");
        com.google.javascript.rhino.Node node13 = node6.useSourceInfoIfMissingFromForTree(node10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node21.setString("");
        com.google.javascript.rhino.Node node24 = node17.useSourceInfoIfMissingFromForTree(node21);
        node21.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node34.setString("");
        com.google.javascript.rhino.Node node37 = node30.useSourceInfoIfMissingFromForTree(node34);
        boolean boolean38 = node30.isGetElem();
        int int40 = node30.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newExpr(node30);
        com.google.javascript.rhino.Node node42 = node21.srcrefTree(node41);
        java.lang.String str43 = node13.checkTreeEquals(node41);
        boolean boolean44 = node41.hasMoreThanOneChild();
        boolean boolean45 = node41.isNE();
        com.google.javascript.rhino.Node node46 = assertionFunctionSpec2.getAssertedParam(node41);
        boolean boolean47 = node46.isWith();
        // The following exception was thrown during execution in test generation
        try {
            node46.setSideEffectFlags(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got EXPR_RESULT");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n" + "'", str43, "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00289");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        com.google.javascript.rhino.Node node12 = node3.cloneNode();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node20.setString("");
        com.google.javascript.rhino.Node node23 = node16.useSourceInfoIfMissingFromForTree(node20);
        boolean boolean24 = node16.isGetElem();
        int int26 = node16.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newExpr(node16);
        com.google.javascript.rhino.Node node28 = node3.clonePropsFrom(node16);
        boolean boolean29 = node28.isDec();
        boolean boolean30 = node28.isFromExterns();
        node28.setVarArgs(true);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00290");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList11 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableList11.iterator();
        boolean boolean13 = functionType5.equals((java.lang.Object) strComparableItor12);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14, false);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray18 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType19 = jSTypeRegistry16.createFunctionType(jSType17, jSTypeArray18);
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = functionType19.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType.TypePair typePair22 = functionType5.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) functionType19);
        boolean boolean23 = functionType5.isNominalType();
        functionType5.clearCachedValues();
        com.google.javascript.rhino.Node node25 = functionType5.getParametersNode();
        // The following exception was thrown during execution in test generation
        try {
            int int27 = node25.getExistingIntProp((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 10");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableList11);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSTypeArray18);
        org.junit.Assert.assertNotNull(functionType19);
        org.junit.Assert.assertNull(jSDocInfo21);
        org.junit.Assert.assertNotNull(typePair22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00291");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node8.setString("");
        com.google.javascript.rhino.Node node11 = node4.useSourceInfoIfMissingFromForTree(node8);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node19.setString("");
        com.google.javascript.rhino.Node node22 = node15.useSourceInfoIfMissingFromForTree(node19);
        node19.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node32.setString("");
        com.google.javascript.rhino.Node node35 = node28.useSourceInfoIfMissingFromForTree(node32);
        boolean boolean36 = node28.isGetElem();
        int int38 = node28.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newExpr(node28);
        com.google.javascript.rhino.Node node40 = node19.srcrefTree(node39);
        java.lang.String str41 = node11.checkTreeEquals(node39);
        boolean boolean42 = node39.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node50.setString("");
        com.google.javascript.rhino.Node node53 = node46.useSourceInfoIfMissingFromForTree(node50);
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node61.setString("");
        com.google.javascript.rhino.Node node64 = node57.useSourceInfoIfMissingFromForTree(node61);
        node61.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node74.setString("");
        com.google.javascript.rhino.Node node77 = node70.useSourceInfoIfMissingFromForTree(node74);
        boolean boolean78 = node70.isGetElem();
        int int80 = node70.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node81 = com.google.javascript.jscomp.NodeUtil.newExpr(node70);
        com.google.javascript.rhino.Node node82 = node61.srcrefTree(node81);
        java.lang.String str83 = node53.checkTreeEquals(node81);
        com.google.javascript.rhino.Node node84 = node39.useSourceInfoFrom(node81);
        java.lang.String str85 = com.google.javascript.jscomp.NodeUtil.getSourceName(node81);
        com.google.javascript.rhino.Node node86 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node89 = new com.google.javascript.rhino.Node(100, node81, node86, 39, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n" + "'", str41, "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n" + "'", str83, "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n");
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertNull(str85);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00292");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry7.createFunctionType(jSType8, jSTypeArray9);
        boolean boolean11 = functionType10.isNominalType();
        boolean boolean12 = jSTypeRegistry2.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node21.setString("");
        com.google.javascript.rhino.Node node24 = node17.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean25 = node17.isGetElem();
        com.google.javascript.rhino.Node node26 = node17.cloneNode();
        boolean boolean27 = node26.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = node26.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, false);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = functionType37.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry31.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = functionType37.getJSDocInfo();
        boolean boolean43 = functionType37.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType44 = jSTypeRegistry2.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node26, (com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.jstype.EnumType enumType45 = enumType44.toMaybeEnumType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType46 = enumType45.getElementsType();
        boolean boolean47 = enumElementType46.matchesObjectContext();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType48 = enumElementType46.toMaybeEnumElementType();
        enumElementType46.clearResolved();
        int int50 = enumElementType46.getPropertiesCount();
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(staticSourceFile28);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertNull(jSDocInfo39);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertNull(jSDocInfo41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(enumType44);
        org.junit.Assert.assertNotNull(enumType45);
        org.junit.Assert.assertNotNull(enumElementType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(enumElementType48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00293");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry7.createFunctionType(jSType8, jSTypeArray9);
        boolean boolean11 = functionType10.isNominalType();
        boolean boolean12 = jSTypeRegistry2.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node21.setString("");
        com.google.javascript.rhino.Node node24 = node17.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean25 = node17.isGetElem();
        com.google.javascript.rhino.Node node26 = node17.cloneNode();
        boolean boolean27 = node26.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = node26.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, false);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = functionType37.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry31.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = functionType37.getJSDocInfo();
        boolean boolean43 = functionType37.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType44 = jSTypeRegistry2.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node26, (com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.jstype.EnumType enumType45 = enumType44.toMaybeEnumType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType46 = enumType45.getElementsType();
        com.google.javascript.rhino.jstype.ObjectType objectType47 = enumElementType46.getImplicitPrototype();
        com.google.javascript.rhino.jstype.FunctionType functionType48 = enumElementType46.getConstructor();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean49 = functionType48.isEmptyType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(staticSourceFile28);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertNull(jSDocInfo39);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertNull(jSDocInfo41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(enumType44);
        org.junit.Assert.assertNotNull(enumType45);
        org.junit.Assert.assertNotNull(enumElementType46);
        org.junit.Assert.assertNull(objectType47);
        org.junit.Assert.assertNull(functionType48);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00294");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, false);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry5.createFunctionType(jSType6, jSTypeArray7);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = functionType8.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType11 = jSTypeRegistry2.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType8);
        java.lang.String str12 = functionType8.getDisplayName();
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertNotNull(functionType8);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNotNull(jSType11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00295");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        int int7 = functionType5.getPropertiesCount();
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, false);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = jSTypeRegistry10.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, false);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray17 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType18 = jSTypeRegistry15.createFunctionType(jSType16, jSTypeArray17);
        boolean boolean19 = functionType18.isNominalType();
        boolean boolean20 = jSTypeRegistry10.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType18);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node29.setString("");
        com.google.javascript.rhino.Node node32 = node25.useSourceInfoIfMissingFromForTree(node29);
        boolean boolean33 = node25.isGetElem();
        com.google.javascript.rhino.Node node34 = node25.cloneNode();
        boolean boolean35 = node34.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile36 = node34.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37, false);
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, false);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray44 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSTypeRegistry42.createFunctionType(jSType43, jSTypeArray44);
        com.google.javascript.rhino.JSDocInfo jSDocInfo47 = functionType45.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType48 = jSTypeRegistry39.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType45);
        com.google.javascript.rhino.JSDocInfo jSDocInfo49 = functionType45.getJSDocInfo();
        boolean boolean51 = functionType45.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType52 = jSTypeRegistry10.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node34, (com.google.javascript.rhino.jstype.JSType) functionType45);
        boolean boolean53 = enumType52.matchesStringContext();
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, false);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType59 = jSTypeRegistry56.createFunctionType(jSType57, jSTypeArray58);
        boolean boolean60 = functionType59.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList65 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor66 = strComparableList65.iterator();
        boolean boolean67 = functionType59.equals((java.lang.Object) strComparableItor66);
        com.google.javascript.rhino.ErrorReporter errorReporter68 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter68, false);
        com.google.javascript.rhino.jstype.JSType jSType71 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray72 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType73 = jSTypeRegistry70.createFunctionType(jSType71, jSTypeArray72);
        com.google.javascript.rhino.JSDocInfo jSDocInfo75 = functionType73.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType.TypePair typePair76 = functionType59.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) functionType73);
        boolean boolean77 = functionType59.isFunctionPrototypeType();
        com.google.javascript.rhino.jstype.JSType jSType78 = functionType59.autoboxesTo();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue79 = enumType52.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType59);
        boolean boolean80 = functionType5.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType59);
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertNotNull(jSTypeArray17);
        org.junit.Assert.assertNotNull(functionType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(staticSourceFile36);
        org.junit.Assert.assertNotNull(jSTypeArray44);
        org.junit.Assert.assertNotNull(functionType45);
        org.junit.Assert.assertNull(jSDocInfo47);
        org.junit.Assert.assertNotNull(jSType48);
        org.junit.Assert.assertNull(jSDocInfo49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(enumType52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertNotNull(functionType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(strComparableList65);
        org.junit.Assert.assertNotNull(strComparableItor66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(jSTypeArray72);
        org.junit.Assert.assertNotNull(functionType73);
        org.junit.Assert.assertNull(jSDocInfo75);
        org.junit.Assert.assertNotNull(typePair76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(jSType78);
        org.junit.Assert.assertNotNull(ternaryValue79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00296");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, false);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry9.createFunctionType(jSType10, jSTypeArray11);
        boolean boolean13 = functionType12.isUnionType();
        int int14 = functionType12.getMinArguments();
        jSTypeRegistry2.unregisterPropertyOnType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", (com.google.javascript.rhino.jstype.JSType) functionType12);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable17 = jSTypeRegistry2.getEachReferenceTypeWithProperty("Unknown class name");
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, false);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = jSTypeRegistry20.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, false);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType28 = jSTypeRegistry25.createFunctionType(jSType26, jSTypeArray27);
        boolean boolean29 = functionType28.isNominalType();
        boolean boolean30 = jSTypeRegistry20.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType28);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node39.setString("");
        com.google.javascript.rhino.Node node42 = node35.useSourceInfoIfMissingFromForTree(node39);
        boolean boolean43 = node35.isGetElem();
        com.google.javascript.rhino.Node node44 = node35.cloneNode();
        boolean boolean45 = node44.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile46 = node44.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47, false);
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50, false);
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray54 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType55 = jSTypeRegistry52.createFunctionType(jSType53, jSTypeArray54);
        com.google.javascript.rhino.JSDocInfo jSDocInfo57 = functionType55.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType58 = jSTypeRegistry49.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType55);
        com.google.javascript.rhino.JSDocInfo jSDocInfo59 = functionType55.getJSDocInfo();
        boolean boolean61 = functionType55.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType62 = jSTypeRegistry20.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node44, (com.google.javascript.rhino.jstype.JSType) functionType55);
        com.google.javascript.rhino.jstype.EnumType enumType63 = enumType62.toMaybeEnumType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType64 = enumType63.getElementsType();
        boolean boolean65 = enumElementType64.matchesObjectContext();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType66 = enumElementType64.toMaybeEnumElementType();
        boolean boolean67 = enumElementType64.isNullable();
        boolean boolean68 = enumElementType64.isAllType();
        com.google.javascript.rhino.jstype.JSType jSType69 = jSTypeRegistry2.createNullableType((com.google.javascript.rhino.jstype.JSType) enumElementType64);
        boolean boolean70 = jSType69.isFunctionType();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objectTypeIterable17);
        org.junit.Assert.assertNotNull(objectType21);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(functionType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(staticSourceFile46);
        org.junit.Assert.assertNotNull(jSTypeArray54);
        org.junit.Assert.assertNotNull(functionType55);
        org.junit.Assert.assertNull(jSDocInfo57);
        org.junit.Assert.assertNotNull(jSType58);
        org.junit.Assert.assertNull(jSDocInfo59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(enumType62);
        org.junit.Assert.assertNotNull(enumType63);
        org.junit.Assert.assertNotNull(enumElementType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(enumElementType66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(jSType69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00297");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList8 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableList8.iterator();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList10 = strComparableList8.reverse();
        boolean boolean11 = strSet2.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList8);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList20 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor21 = strComparableList20.iterator();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList22 = strComparableList20.reverse();
        boolean boolean23 = strSet14.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList20);
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList32 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor33 = strComparableList32.iterator();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList34 = strComparableList32.reverse();
        boolean boolean35 = strSet26.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList32);
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList44 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor45 = strComparableList44.iterator();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList46 = strComparableList44.reverse();
        boolean boolean47 = strSet38.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList44);
        com.google.common.collect.ImmutableList<java.util.AbstractSet<java.lang.String>> strSetList48 = com.google.common.collect.ImmutableList.of((java.util.AbstractSet<java.lang.String>) strSet2, (java.util.AbstractSet<java.lang.String>) strSet14, (java.util.AbstractSet<java.lang.String>) strSet26, (java.util.AbstractSet<java.lang.String>) strSet38);
        strSet26.clear();
        int int50 = strSet26.size();
        boolean boolean52 = strSet26.add("function (): {308555690}");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strComparableList8);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertNotNull(strComparableList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strComparableList20);
        org.junit.Assert.assertNotNull(strComparableItor21);
        org.junit.Assert.assertNotNull(strComparableList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strComparableList32);
        org.junit.Assert.assertNotNull(strComparableItor33);
        org.junit.Assert.assertNotNull(strComparableList34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strComparableList44);
        org.junit.Assert.assertNotNull(strComparableItor45);
        org.junit.Assert.assertNotNull(strComparableList46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strSetList48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00298");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry7.createFunctionType(jSType8, jSTypeArray9);
        boolean boolean11 = functionType10.isNominalType();
        boolean boolean12 = jSTypeRegistry2.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node21.setString("");
        com.google.javascript.rhino.Node node24 = node17.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean25 = node17.isGetElem();
        com.google.javascript.rhino.Node node26 = node17.cloneNode();
        boolean boolean27 = node26.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = node26.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, false);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = functionType37.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry31.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = functionType37.getJSDocInfo();
        boolean boolean43 = functionType37.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType44 = jSTypeRegistry2.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node26, (com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.jstype.EnumType enumType45 = enumType44.toMaybeEnumType();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, false);
        com.google.javascript.rhino.jstype.ObjectType objectType49 = jSTypeRegistry48.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51, false);
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray55 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry53.createFunctionType(jSType54, jSTypeArray55);
        boolean boolean57 = functionType56.isNominalType();
        boolean boolean58 = jSTypeRegistry48.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType56);
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node67.setString("");
        com.google.javascript.rhino.Node node70 = node63.useSourceInfoIfMissingFromForTree(node67);
        boolean boolean71 = node63.isGetElem();
        com.google.javascript.rhino.Node node72 = node63.cloneNode();
        boolean boolean73 = node72.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile74 = node72.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter75 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter75, false);
        com.google.javascript.rhino.ErrorReporter errorReporter78 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry80 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter78, false);
        com.google.javascript.rhino.jstype.JSType jSType81 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray82 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType83 = jSTypeRegistry80.createFunctionType(jSType81, jSTypeArray82);
        com.google.javascript.rhino.JSDocInfo jSDocInfo85 = functionType83.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType86 = jSTypeRegistry77.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType83);
        com.google.javascript.rhino.JSDocInfo jSDocInfo87 = functionType83.getJSDocInfo();
        boolean boolean89 = functionType83.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType90 = jSTypeRegistry48.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node72, (com.google.javascript.rhino.jstype.JSType) functionType83);
        com.google.javascript.rhino.jstype.EnumType enumType91 = enumType90.toMaybeEnumType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType92 = enumType91.getElementsType();
        boolean boolean93 = enumElementType92.matchesObjectContext();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType94 = enumElementType92.toMaybeEnumElementType();
        boolean boolean95 = enumElementType92.isNullable();
        boolean boolean96 = enumElementType92.hasReferenceName();
        boolean boolean97 = enumElementType92.matchesObjectContext();
        boolean boolean98 = enumElementType92.matchesNumberContext();
        enumType45.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) enumElementType92);
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(staticSourceFile28);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertNull(jSDocInfo39);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertNull(jSDocInfo41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(enumType44);
        org.junit.Assert.assertNotNull(enumType45);
        org.junit.Assert.assertNotNull(objectType49);
        org.junit.Assert.assertNotNull(jSTypeArray55);
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(staticSourceFile74);
        org.junit.Assert.assertNotNull(jSTypeArray82);
        org.junit.Assert.assertNotNull(functionType83);
        org.junit.Assert.assertNull(jSDocInfo85);
        org.junit.Assert.assertNotNull(jSType86);
        org.junit.Assert.assertNull(jSDocInfo87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(enumType90);
        org.junit.Assert.assertNotNull(enumType91);
        org.junit.Assert.assertNotNull(enumElementType92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(enumElementType94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00299");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, false);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry9.createFunctionType(jSType10, jSTypeArray11);
        boolean boolean13 = functionType12.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable14 = functionType12.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType15 = functionType12.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType16 = functionType12.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = functionType5.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType12);
        boolean boolean18 = functionType12.isNumberObjectType();
        boolean boolean19 = functionType12.isReturnTypeInferred();
        com.google.javascript.rhino.jstype.JSType jSType20 = functionType12.getParameterType();
        boolean boolean22 = functionType12.removeProperty("function (): {522475926}");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = functionType12.getAllImplementedInterfaces();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable23);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00300");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        int int13 = node3.getIntProp((int) (byte) -1);
        boolean boolean14 = node3.isLabel();
        boolean boolean15 = node3.isGetProp();
        com.google.javascript.rhino.Node node16 = node3.removeFirstChild();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node28.setString("");
        com.google.javascript.rhino.Node node31 = node24.useSourceInfoIfMissingFromForTree(node28);
        node28.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, false);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry36.createFunctionType(jSType37, jSTypeArray38);
        boolean boolean40 = functionType39.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType41 = jSTypeRegistry19.createObjectType("hi!", node28, (com.google.javascript.rhino.jstype.ObjectType) functionType39);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node42 = node16.useSourceInfoIfMissingFrom(node28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(jSTypeArray38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objectType41);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00301");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isExterns();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getTypedefType();
        boolean boolean4 = jSDocInfo0.hasReturnType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(jSTypeExpression3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00302");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node8.setString("");
        com.google.javascript.rhino.Node node11 = node4.useSourceInfoIfMissingFromForTree(node8);
        boolean boolean12 = node4.isGetElem();
        int int14 = node4.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newExpr(node4);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node23.setString("");
        com.google.javascript.rhino.Node node26 = node19.useSourceInfoIfMissingFromForTree(node23);
        boolean boolean27 = node19.isGetElem();
        com.google.javascript.rhino.Node node28 = node19.cloneNode();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node36.setString("");
        com.google.javascript.rhino.Node node39 = node32.useSourceInfoIfMissingFromForTree(node36);
        boolean boolean40 = node32.isGetElem();
        int int42 = node32.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newExpr(node32);
        com.google.javascript.rhino.Node node44 = node19.clonePropsFrom(node32);
        boolean boolean45 = node19.isGetElem();
        com.google.javascript.rhino.Node node46 = node15.useSourceInfoFrom(node19);
        com.google.javascript.rhino.Node node47 = node46.removeFirstChild();
        boolean boolean48 = node46.isCase();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(51, node46);
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node57.setString("");
        com.google.javascript.rhino.Node node60 = node53.useSourceInfoIfMissingFromForTree(node57);
        boolean boolean61 = node53.isGetElem();
        int int63 = node53.getIntProp((int) (byte) -1);
        boolean boolean64 = node53.isLabel();
        com.google.javascript.rhino.Node node65 = node53.getLastChild();
        boolean boolean66 = node53.isDebugger();
        node46.addChildToBack(node53);
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags69 = new com.google.javascript.rhino.Node.SideEffectFlags((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            node46.setSideEffectFlags(sideEffectFlags69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got EXPR_RESULT");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00303");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node11.setString("");
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node11);
        node11.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry19.createFunctionType(jSType20, jSTypeArray21);
        boolean boolean23 = functionType22.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry2.createObjectType("hi!", node11, (com.google.javascript.rhino.jstype.ObjectType) functionType22);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, false);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray30 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType31 = jSTypeRegistry28.createFunctionType(jSType29, jSTypeArray30);
        boolean boolean32 = functionType31.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable33 = functionType31.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType34 = functionType31.unboxesTo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo35 = new com.google.javascript.rhino.JSDocInfo();
        functionType31.setJSDocInfo(jSDocInfo35);
        boolean boolean37 = jSDocInfo35.isHidden();
        functionType22.setPropertyJSDocInfo("", jSDocInfo35);
        com.google.javascript.rhino.Node node39 = functionType22.getParametersNode();
        com.google.javascript.rhino.Node node40 = node39.getNext();
        boolean boolean41 = node39.isDebugger();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(jSTypeArray30);
        org.junit.Assert.assertNotNull(functionType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable33);
        org.junit.Assert.assertNull(jSType34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00304");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node11.setString("");
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node11);
        node11.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry19.createFunctionType(jSType20, jSTypeArray21);
        boolean boolean23 = functionType22.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry2.createObjectType("hi!", node11, (com.google.javascript.rhino.jstype.ObjectType) functionType22);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node26 = jSTypeRegistry2.createParametersWithVarArgs(jSTypeArray25);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, false);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry30.createFunctionType(jSType31, jSTypeArray32);
        boolean boolean34 = functionType33.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable35 = functionType33.getCtorImplementedInterfaces();
        jSTypeRegistry2.registerPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) functionType33);
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37, false);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry39.createFunctionType(jSType40, jSTypeArray41);
        boolean boolean43 = functionType42.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable44 = functionType42.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType45 = functionType42.unboxesTo();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection46 = jSTypeRegistry2.getDirectImplementors((com.google.javascript.rhino.jstype.ObjectType) functionType42);
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47, false);
        com.google.javascript.rhino.jstype.JSType jSType50 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray51 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType52 = jSTypeRegistry49.createFunctionType(jSType50, jSTypeArray51);
        com.google.javascript.rhino.Node node53 = jSTypeRegistry2.createParametersWithVarArgs(jSTypeArray51);
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node62.setString("");
        com.google.javascript.rhino.Node node65 = node58.useSourceInfoIfMissingFromForTree(node62);
        boolean boolean66 = node58.isGetElem();
        boolean boolean67 = node58.isFromExterns();
        com.google.javascript.rhino.Node node68 = node58.getParent();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType69 = jSTypeRegistry2.createInterfaceType("unknown", node58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable35);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable44);
        org.junit.Assert.assertNull(jSType45);
        org.junit.Assert.assertNotNull(functionTypeCollection46);
        org.junit.Assert.assertNotNull(jSTypeArray51);
        org.junit.Assert.assertNotNull(functionType52);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(node68);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00305");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n");
        boolean boolean3 = node2.isFunction();
        boolean boolean4 = node2.isLabel();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        int int9 = node8.getLineno();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = new com.google.javascript.rhino.JSTypeExpression(node8, "unknown");
        boolean boolean12 = jSTypeExpression11.isOptionalArg();
        com.google.javascript.rhino.Node node13 = jSTypeExpression11.getRoot();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        int int18 = node17.getLineno();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression20 = new com.google.javascript.rhino.JSTypeExpression(node17, "unknown");
        boolean boolean21 = jSTypeExpression20.isOptionalArg();
        com.google.javascript.rhino.Node node22 = jSTypeExpression20.getRoot();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression23 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression20);
        com.google.javascript.rhino.Node node24 = jSTypeExpression20.getRoot();
        com.google.javascript.rhino.Node[] nodeArray27 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((-1), nodeArray27);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(16, nodeArray27, 8, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(35, node2, node13, node24, node31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(jSTypeExpression23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(nodeArray27);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00306");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry7.createFunctionType(jSType8, jSTypeArray9);
        boolean boolean11 = functionType10.isNominalType();
        boolean boolean12 = jSTypeRegistry2.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node21.setString("");
        com.google.javascript.rhino.Node node24 = node17.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean25 = node17.isGetElem();
        com.google.javascript.rhino.Node node26 = node17.cloneNode();
        boolean boolean27 = node26.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = node26.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, false);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = functionType37.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry31.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = functionType37.getJSDocInfo();
        boolean boolean43 = functionType37.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType44 = jSTypeRegistry2.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node26, (com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.Node node45 = enumType44.getSource();
        java.lang.String str46 = enumType44.toString();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType47 = enumType44.getElementsType();
        com.google.javascript.rhino.jstype.JSType jSType48 = enumElementType47.autoboxesTo();
        com.google.javascript.rhino.jstype.ObjectType objectType49 = enumElementType47.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50, false);
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray54 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType55 = jSTypeRegistry52.createFunctionType(jSType53, jSTypeArray54);
        boolean boolean56 = functionType55.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter57 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter57, false);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray61 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType62 = jSTypeRegistry59.createFunctionType(jSType60, jSTypeArray61);
        boolean boolean63 = functionType62.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable64 = functionType62.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType65 = functionType62.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType66 = functionType62.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue67 = functionType55.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType62);
        com.google.javascript.rhino.Node node68 = functionType55.getSource();
        com.google.javascript.rhino.ErrorReporter errorReporter69 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter69, false);
        com.google.javascript.rhino.jstype.JSType jSType72 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray73 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType74 = jSTypeRegistry71.createFunctionType(jSType72, jSTypeArray73);
        boolean boolean75 = functionType74.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList80 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor81 = strComparableList80.iterator();
        boolean boolean82 = functionType74.equals((java.lang.Object) strComparableItor81);
        com.google.javascript.rhino.ErrorReporter errorReporter84 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry86 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter84, false);
        com.google.javascript.rhino.jstype.JSType jSType87 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray88 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType89 = jSTypeRegistry86.createFunctionType(jSType87, jSTypeArray88);
        boolean boolean90 = functionType89.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable91 = functionType89.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node92 = null;
        boolean boolean93 = functionType74.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType89, node92);
        boolean boolean95 = functionType89.removeProperty("Not declared as a type name");
        boolean boolean96 = functionType55.hasEqualCallType(functionType89);
        boolean boolean97 = functionType89.isObject();
        boolean boolean98 = enumElementType47.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType89);
        java.util.Set<java.lang.String> strSet99 = enumElementType47.getPropertyNames();
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(staticSourceFile28);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertNull(jSDocInfo39);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertNull(jSDocInfo41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(enumType44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "enum{Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n}" + "'", str46, "enum{Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n}");
        org.junit.Assert.assertNotNull(enumElementType47);
        org.junit.Assert.assertNull(jSType48);
        org.junit.Assert.assertNull(objectType49);
        org.junit.Assert.assertNotNull(jSTypeArray54);
        org.junit.Assert.assertNotNull(functionType55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(jSTypeArray61);
        org.junit.Assert.assertNotNull(functionType62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable64);
        org.junit.Assert.assertNull(jSType65);
        org.junit.Assert.assertNotNull(jSType66);
        org.junit.Assert.assertNotNull(ternaryValue67);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertNotNull(jSTypeArray73);
        org.junit.Assert.assertNotNull(functionType74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(strComparableList80);
        org.junit.Assert.assertNotNull(strComparableItor81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(jSTypeArray88);
        org.junit.Assert.assertNotNull(functionType89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
        org.junit.Assert.assertNotNull(strSet99);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00307");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList4 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList9 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        boolean boolean10 = strComparableList4.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, false);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType16 = jSTypeRegistry13.createFunctionType(jSType14, jSTypeArray15);
        boolean boolean17 = functionType16.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, false);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray22 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry20.createFunctionType(jSType21, jSTypeArray22);
        boolean boolean24 = functionType23.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable25 = functionType23.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType26 = functionType23.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType27 = functionType23.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue28 = functionType16.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType23);
        com.google.javascript.rhino.Node node29 = functionType16.getSource();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, false);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray34 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType35 = jSTypeRegistry32.createFunctionType(jSType33, jSTypeArray34);
        boolean boolean36 = functionType35.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList41 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor42 = strComparableList41.iterator();
        boolean boolean43 = functionType35.equals((java.lang.Object) strComparableItor42);
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, false);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry47.createFunctionType(jSType48, jSTypeArray49);
        boolean boolean51 = functionType50.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = functionType50.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node53 = null;
        boolean boolean54 = functionType35.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType50, node53);
        boolean boolean56 = functionType50.removeProperty("Not declared as a type name");
        boolean boolean57 = functionType16.hasEqualCallType(functionType50);
        boolean boolean58 = strComparableList9.equals((java.lang.Object) functionType16);
        boolean boolean59 = functionType16.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType60 = functionType16.unboxesTo();
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61, false);
        com.google.javascript.rhino.jstype.JSType jSType64 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray65 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType66 = jSTypeRegistry63.createFunctionType(jSType64, jSTypeArray65);
        boolean boolean67 = functionType66.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable68 = functionType66.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType69 = functionType66.unboxesTo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo70 = new com.google.javascript.rhino.JSDocInfo();
        functionType66.setJSDocInfo(jSDocInfo70);
        com.google.javascript.rhino.JSDocInfo jSDocInfo72 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean73 = jSDocInfo72.hasReturnType();
        boolean boolean74 = jSDocInfo72.containsDeclaration();
        functionType66.setJSDocInfo(jSDocInfo72);
        functionType16.setJSDocInfo(jSDocInfo72);
        java.util.Set<java.lang.String> strSet77 = jSDocInfo72.getParameterNames();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean79 = strSet77.add("function (): ?");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableList4);
        org.junit.Assert.assertNotNull(strComparableList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jSTypeArray22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable25);
        org.junit.Assert.assertNull(jSType26);
        org.junit.Assert.assertNotNull(jSType27);
        org.junit.Assert.assertNotNull(ternaryValue28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(jSTypeArray34);
        org.junit.Assert.assertNotNull(functionType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strComparableList41);
        org.junit.Assert.assertNotNull(strComparableItor42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(jSType60);
        org.junit.Assert.assertNotNull(jSTypeArray65);
        org.junit.Assert.assertNotNull(functionType66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable68);
        org.junit.Assert.assertNull(jSType69);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(strSet77);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00308");
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.InputId> inputIdBuilder0 = com.google.common.collect.ImmutableList.builder();
        org.junit.Assert.assertNotNull(inputIdBuilder0);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00309");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        jSDocInfo0.setVisibility(visibility2);
        boolean boolean4 = jSDocInfo0.isImplicitCast();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.isNoShadow();
        boolean boolean7 = jSDocInfo0.hasType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00310");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable7 = functionType5.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType9 = functionType5.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, false);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType16 = jSTypeRegistry13.createFunctionType(jSType14, jSTypeArray15);
        boolean boolean17 = functionType16.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable18 = functionType16.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType19 = functionType16.unboxesTo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = new com.google.javascript.rhino.JSDocInfo();
        functionType16.setJSDocInfo(jSDocInfo20);
        com.google.javascript.rhino.jstype.JSType jSType22 = functionType5.resolve(errorReporter10, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType16);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, false);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType28 = jSTypeRegistry25.createFunctionType(jSType26, jSTypeArray27);
        boolean boolean29 = functionType28.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable30 = functionType28.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType31 = functionType28.unboxesTo();
        boolean boolean33 = functionType28.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType34 = functionType28.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType35 = functionType28.getIndexType();
        com.google.javascript.rhino.jstype.JSType jSType36 = functionType28.getIndexType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue37 = functionType5.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType28);
        com.google.javascript.rhino.jstype.ObjectType objectType38 = functionType28.getTypeOfThis();
        boolean boolean39 = functionType28.matchesUint32Context();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable7);
        org.junit.Assert.assertNotNull(jSType9);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNotNull(jSType22);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(functionType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable30);
        org.junit.Assert.assertNull(jSType31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertNull(jSType35);
        org.junit.Assert.assertNull(jSType36);
        org.junit.Assert.assertNotNull(ternaryValue37);
        org.junit.Assert.assertNotNull(objectType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00311");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter4 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter4, false);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node15.setString("");
        com.google.javascript.rhino.Node node18 = node11.useSourceInfoIfMissingFromForTree(node15);
        node15.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, false);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry23.createFunctionType(jSType24, jSTypeArray25);
        boolean boolean27 = functionType26.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType28 = jSTypeRegistry6.createObjectType("hi!", node15, (com.google.javascript.rhino.jstype.ObjectType) functionType26);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node30 = jSTypeRegistry6.createParametersWithVarArgs(jSTypeArray29);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        boolean boolean38 = functionType37.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable39 = functionType37.getCtorImplementedInterfaces();
        jSTypeRegistry6.registerPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41, false);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray45 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType46 = jSTypeRegistry43.createFunctionType(jSType44, jSTypeArray45);
        boolean boolean47 = functionType46.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable48 = functionType46.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType49 = functionType46.unboxesTo();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection50 = jSTypeRegistry6.getDirectImplementors((com.google.javascript.rhino.jstype.ObjectType) functionType46);
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51, false);
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray55 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry53.createFunctionType(jSType54, jSTypeArray55);
        com.google.javascript.rhino.Node node57 = jSTypeRegistry6.createParametersWithVarArgs(jSTypeArray55);
        com.google.javascript.rhino.jstype.JSType jSType58 = jSTypeRegistry2.createUnionType(jSTypeArray55);
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, false);
        com.google.javascript.rhino.jstype.JSType jSType62 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray63 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType64 = jSTypeRegistry61.createFunctionType(jSType62, jSTypeArray63);
        boolean boolean65 = functionType64.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable66 = functionType64.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType67 = functionType64.unboxesTo();
        boolean boolean69 = functionType64.removeProperty("");
        int int70 = functionType64.getMaxArguments();
        com.google.javascript.rhino.ErrorReporter errorReporter71 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter71, false);
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node82.setString("");
        com.google.javascript.rhino.Node node85 = node78.useSourceInfoIfMissingFromForTree(node82);
        node82.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter88 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry90 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter88, false);
        com.google.javascript.rhino.jstype.JSType jSType91 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray92 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType93 = jSTypeRegistry90.createFunctionType(jSType91, jSTypeArray92);
        boolean boolean94 = functionType93.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType95 = jSTypeRegistry73.createObjectType("hi!", node82, (com.google.javascript.rhino.jstype.ObjectType) functionType93);
        functionType64.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType93);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable97 = functionType64.getImplementedInterfaces();
        jSTypeRegistry2.resolveTypesInScope((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType64);
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objectType28);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable39);
        org.junit.Assert.assertNotNull(jSTypeArray45);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable48);
        org.junit.Assert.assertNull(jSType49);
        org.junit.Assert.assertNotNull(functionTypeCollection50);
        org.junit.Assert.assertNotNull(jSTypeArray55);
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(jSType58);
        org.junit.Assert.assertNotNull(jSTypeArray63);
        org.junit.Assert.assertNotNull(functionType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable66);
        org.junit.Assert.assertNull(jSType67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(jSTypeArray92);
        org.junit.Assert.assertNotNull(functionType93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(objectType95);
        org.junit.Assert.assertNotNull(objectTypeIterable97);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00312");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        jSDocInfo0.setVisibility(visibility2);
        boolean boolean4 = jSDocInfo0.isImplicitCast();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList5 = jSDocInfo0.getThrownTypes();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList5);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00313");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable7 = functionType5.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType8 = functionType5.unboxesTo();
        boolean boolean10 = functionType5.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType11 = functionType5.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType12 = functionType5.getIndexType();
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = jSType12.canTestForEqualityWith(jSType13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertNull(jSType12);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00314");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2, false);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType7 = jSTypeRegistry4.createFunctionType(jSType5, jSTypeArray6);
        boolean boolean8 = functionType7.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable9 = functionType7.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType7.unboxesTo();
        boolean boolean12 = functionType7.removeProperty("");
        int int13 = functionType7.getMaxArguments();
        java.lang.String str14 = functionType7.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, false);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray19 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry17.createFunctionType(jSType18, jSTypeArray19);
        boolean boolean21 = functionType20.isNominalType();
        functionType7.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType20);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, false);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType28 = jSTypeRegistry25.createFunctionType(jSType26, jSTypeArray27);
        boolean boolean29 = functionType28.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable30 = functionType28.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType31 = functionType28.unboxesTo();
        boolean boolean33 = functionType28.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType34 = functionType28.getImplicitPrototype();
        functionType7.setPrototypeBasedOn(objectType34);
        boolean boolean37 = jSTypeRegistry1.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) functionType7, "hi!");
        java.lang.Iterable iterable38 = functionType7.getCtorImplementedInterfaces();
        boolean boolean39 = functionType7.isGlobalThisType();
        boolean boolean40 = functionType7.isStringValueType();
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertNotNull(functionType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(jSTypeArray19);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(functionType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable30);
        org.junit.Assert.assertNull(jSType31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(iterable38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00315");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node((-1), nodeArray1);
        int int3 = node2.getSourceOffset();
        com.google.javascript.rhino.ErrorReporter errorReporter4 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter4, false);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry6.createFunctionType(jSType7, jSTypeArray8);
        boolean boolean10 = functionType9.isNominalType();
        com.google.javascript.rhino.jstype.JSType jSType11 = functionType9.getParameterType();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node19.setString("");
        com.google.javascript.rhino.Node node22 = node15.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean23 = node15.isGetElem();
        com.google.javascript.rhino.Node node24 = node15.cloneNode();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile25 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node15);
        boolean boolean26 = node15.isNot();
        functionType9.setSource(node15);
        boolean boolean28 = node2.isEquivalentToTyped(node15);
        com.google.javascript.rhino.Node node29 = node2.getLastSibling();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(staticSourceFile25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00316");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2, false);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType7 = jSTypeRegistry4.createFunctionType(jSType5, jSTypeArray6);
        boolean boolean8 = functionType7.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable9 = functionType7.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType7.unboxesTo();
        boolean boolean12 = functionType7.removeProperty("");
        int int13 = functionType7.getMaxArguments();
        java.lang.String str14 = functionType7.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, false);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray19 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry17.createFunctionType(jSType18, jSTypeArray19);
        boolean boolean21 = functionType20.isNominalType();
        functionType7.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType20);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, false);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType28 = jSTypeRegistry25.createFunctionType(jSType26, jSTypeArray27);
        boolean boolean29 = functionType28.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable30 = functionType28.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType31 = functionType28.unboxesTo();
        boolean boolean33 = functionType28.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType34 = functionType28.getImplicitPrototype();
        functionType7.setPrototypeBasedOn(objectType34);
        boolean boolean37 = jSTypeRegistry1.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) functionType7, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry1.getGreatestSubtypeWithProperty(jSType38, "");
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41, false);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray45 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType46 = jSTypeRegistry43.createFunctionType(jSType44, jSTypeArray45);
        boolean boolean47 = functionType46.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList52 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor53 = strComparableList52.iterator();
        boolean boolean54 = functionType46.equals((java.lang.Object) strComparableItor53);
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56, false);
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType61 = jSTypeRegistry58.createFunctionType(jSType59, jSTypeArray60);
        boolean boolean62 = functionType61.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable63 = functionType61.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node64 = null;
        boolean boolean65 = functionType46.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType61, node64);
        boolean boolean67 = functionType61.removeProperty("Not declared as a type name");
        com.google.javascript.rhino.jstype.ObjectType objectType68 = jSTypeRegistry1.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType61);
        boolean boolean69 = functionType61.matchesUint32Context();
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertNotNull(functionType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(jSTypeArray19);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(functionType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable30);
        org.junit.Assert.assertNull(jSType31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertNotNull(jSTypeArray45);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strComparableList52);
        org.junit.Assert.assertNotNull(strComparableItor53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertNotNull(functionType61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(objectType68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00317");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        boolean boolean12 = node3.isFromExterns();
        com.google.javascript.rhino.Node node13 = node3.getParent();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newExpr(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00318");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, false);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry9.createFunctionType(jSType10, jSTypeArray11);
        boolean boolean13 = functionType12.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable14 = functionType12.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType15 = functionType12.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType16 = functionType12.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = functionType5.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType12);
        boolean boolean18 = functionType12.isObject();
        boolean boolean19 = functionType12.isFunctionPrototypeType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType20 = functionType12.cloneWithoutArrowType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00319");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2, false);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType7 = jSTypeRegistry4.createFunctionType(jSType5, jSTypeArray6);
        boolean boolean8 = functionType7.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable9 = functionType7.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType7.unboxesTo();
        boolean boolean12 = functionType7.removeProperty("");
        int int13 = functionType7.getMaxArguments();
        java.lang.String str14 = functionType7.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, false);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray19 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry17.createFunctionType(jSType18, jSTypeArray19);
        boolean boolean21 = functionType20.isNominalType();
        functionType7.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType20);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, false);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType28 = jSTypeRegistry25.createFunctionType(jSType26, jSTypeArray27);
        boolean boolean29 = functionType28.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable30 = functionType28.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType31 = functionType28.unboxesTo();
        boolean boolean33 = functionType28.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType34 = functionType28.getImplicitPrototype();
        functionType7.setPrototypeBasedOn(objectType34);
        boolean boolean37 = jSTypeRegistry1.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) functionType7, "hi!");
        java.lang.Iterable iterable38 = functionType7.getCtorImplementedInterfaces();
        java.util.Spliterator<com.google.javascript.rhino.Node> nodeSpliterator39 = iterable38.spliterator();
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertNotNull(functionType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(jSTypeArray19);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(functionType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable30);
        org.junit.Assert.assertNull(jSType31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(iterable38);
        org.junit.Assert.assertNotNull(nodeSpliterator39);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00320");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        com.google.javascript.rhino.Node node12 = node3.cloneNode();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node20.setString("");
        com.google.javascript.rhino.Node node23 = node16.useSourceInfoIfMissingFromForTree(node20);
        boolean boolean24 = node16.isGetElem();
        int int26 = node16.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newExpr(node16);
        com.google.javascript.rhino.Node node28 = node3.clonePropsFrom(node16);
        boolean boolean29 = node28.isDec();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) 52);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node39.setString("");
        com.google.javascript.rhino.Node node42 = node35.useSourceInfoIfMissingFromForTree(node39);
        boolean boolean43 = node35.isGetElem();
        com.google.javascript.rhino.Node node44 = node35.cloneNode();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node52.setString("");
        com.google.javascript.rhino.Node node55 = node48.useSourceInfoIfMissingFromForTree(node52);
        boolean boolean56 = node48.isGetElem();
        int int58 = node48.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newExpr(node48);
        com.google.javascript.rhino.Node node60 = node35.clonePropsFrom(node48);
        boolean boolean61 = node60.isReturn();
        com.google.javascript.jscomp.CodingConvention.Bind bind62 = new com.google.javascript.jscomp.CodingConvention.Bind(node28, node31, node60);
        node31.detachChildren();
        com.google.javascript.rhino.ErrorReporter errorReporter64 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter64, false);
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray68 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType69 = jSTypeRegistry66.createFunctionType(jSType67, jSTypeArray68);
        boolean boolean70 = functionType69.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter71 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter71, false);
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray75 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType76 = jSTypeRegistry73.createFunctionType(jSType74, jSTypeArray75);
        boolean boolean77 = functionType76.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable78 = functionType76.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType79 = functionType76.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType80 = functionType76.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue81 = functionType69.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType76);
        com.google.javascript.rhino.Node node82 = functionType69.getParametersNode();
        boolean boolean83 = node82.isNot();
        boolean boolean84 = node31.isEquivalentToTyped(node82);
        boolean boolean85 = node31.isGetProp();
        java.lang.String str86 = node31.toString();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(jSTypeArray68);
        org.junit.Assert.assertNotNull(functionType69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(jSTypeArray75);
        org.junit.Assert.assertNotNull(functionType76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable78);
        org.junit.Assert.assertNull(jSType79);
        org.junit.Assert.assertNotNull(jSType80);
        org.junit.Assert.assertNotNull(ternaryValue81);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "NUMBER 52.0" + "'", str86, "NUMBER 52.0");
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00321");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList11 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableList11.iterator();
        boolean boolean13 = functionType5.equals((java.lang.Object) strComparableItor12);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14, false);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray18 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType19 = jSTypeRegistry16.createFunctionType(jSType17, jSTypeArray18);
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = functionType19.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType.TypePair typePair22 = functionType5.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) functionType19);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType24 = functionType5.getTopMostDefiningType("function (): {1730712169}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableList11);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSTypeArray18);
        org.junit.Assert.assertNotNull(functionType19);
        org.junit.Assert.assertNull(jSDocInfo21);
        org.junit.Assert.assertNotNull(typePair22);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00322");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry7.createFunctionType(jSType8, jSTypeArray9);
        boolean boolean11 = functionType10.isNominalType();
        boolean boolean12 = jSTypeRegistry2.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node21.setString("");
        com.google.javascript.rhino.Node node24 = node17.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean25 = node17.isGetElem();
        com.google.javascript.rhino.Node node26 = node17.cloneNode();
        boolean boolean27 = node26.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = node26.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, false);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = functionType37.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry31.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = functionType37.getJSDocInfo();
        boolean boolean43 = functionType37.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType44 = jSTypeRegistry2.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node26, (com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.jstype.EnumType enumType45 = enumType44.toMaybeEnumType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType46 = enumType45.getElementsType();
        boolean boolean47 = enumElementType46.matchesObjectContext();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType48 = enumElementType46.toMaybeEnumElementType();
        com.google.javascript.rhino.jstype.FunctionType functionType49 = enumElementType48.getConstructor();
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50, false);
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray54 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType55 = jSTypeRegistry52.createFunctionType(jSType53, jSTypeArray54);
        boolean boolean56 = functionType55.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable57 = functionType55.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType58 = functionType55.unboxesTo();
        com.google.javascript.rhino.jstype.ObjectType.Property property60 = functionType55.getSlot("unknown");
        boolean boolean61 = enumElementType48.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType55);
        com.google.javascript.rhino.jstype.FunctionType functionType62 = enumElementType48.getConstructor();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean63 = functionType62.isFunctionPrototypeType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(staticSourceFile28);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertNull(jSDocInfo39);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertNull(jSDocInfo41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(enumType44);
        org.junit.Assert.assertNotNull(enumType45);
        org.junit.Assert.assertNotNull(enumElementType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(enumElementType48);
        org.junit.Assert.assertNull(functionType49);
        org.junit.Assert.assertNotNull(jSTypeArray54);
        org.junit.Assert.assertNotNull(functionType55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable57);
        org.junit.Assert.assertNull(jSType58);
        org.junit.Assert.assertNull(property60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNull(functionType62);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00323");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2, false);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType7 = jSTypeRegistry4.createFunctionType(jSType5, jSTypeArray6);
        boolean boolean8 = functionType7.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable9 = functionType7.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType7.unboxesTo();
        boolean boolean12 = functionType7.removeProperty("");
        int int13 = functionType7.getMaxArguments();
        java.lang.String str14 = functionType7.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, false);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray19 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry17.createFunctionType(jSType18, jSTypeArray19);
        boolean boolean21 = functionType20.isNominalType();
        functionType7.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType20);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, false);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType28 = jSTypeRegistry25.createFunctionType(jSType26, jSTypeArray27);
        boolean boolean29 = functionType28.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable30 = functionType28.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType31 = functionType28.unboxesTo();
        boolean boolean33 = functionType28.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType34 = functionType28.getImplicitPrototype();
        functionType7.setPrototypeBasedOn(objectType34);
        boolean boolean37 = jSTypeRegistry1.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) functionType7, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry1.getGreatestSubtypeWithProperty(jSType38, "");
        com.google.javascript.rhino.jstype.ObjectType objectType41 = jSType40.dereference();
        com.google.javascript.rhino.jstype.JSType jSType43 = objectType41.getPropertyType("java.io.IOException: ");
        boolean boolean44 = jSType43.isNoObjectType();
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertNotNull(functionType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(jSTypeArray19);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(functionType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable30);
        org.junit.Assert.assertNull(jSType31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertNotNull(objectType41);
        org.junit.Assert.assertNotNull(jSType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00324");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        int int13 = node3.getIntProp((int) (byte) -1);
        boolean boolean14 = node3.isLabel();
        com.google.javascript.rhino.Node node15 = node3.getLastChild();
        // The following exception was thrown during execution in test generation
        try {
            node15.removeProp(31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00325");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, false);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry5.createFunctionType(jSType6, jSTypeArray7);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = functionType8.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType11 = jSTypeRegistry2.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType8);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, false);
        com.google.javascript.rhino.jstype.ObjectType objectType15 = jSTypeRegistry14.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, false);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType21 = jSTypeRegistry18.createFunctionType(jSType19, jSTypeArray20);
        boolean boolean22 = functionType21.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = functionType21.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType24 = functionType21.unboxesTo();
        boolean boolean26 = functionType21.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType27 = functionType21.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType28 = functionType21.getIndexType();
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType21.getIndexType();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, false);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray34 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType35 = jSTypeRegistry32.createFunctionType(jSType33, jSTypeArray34);
        boolean boolean36 = functionType35.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable37 = functionType35.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType38 = functionType35.unboxesTo();
        boolean boolean40 = functionType35.removeProperty("");
        int int41 = functionType35.getMaxArguments();
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, false);
        com.google.javascript.rhino.jstype.JSType jSType45 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray46 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType47 = jSTypeRegistry44.createFunctionType(jSType45, jSTypeArray46);
        boolean boolean48 = functionType47.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable49 = functionType47.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType50 = functionType47.unboxesTo();
        boolean boolean52 = functionType47.removeProperty("");
        int int53 = functionType47.getMaxArguments();
        java.lang.String str54 = functionType47.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, false);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray59 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry57.createFunctionType(jSType58, jSTypeArray59);
        boolean boolean61 = functionType60.isNominalType();
        functionType47.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType60);
        boolean boolean63 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) functionType35, (com.google.javascript.rhino.jstype.JSType) functionType60);
        boolean boolean64 = functionType35.isNullType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSType> jSTypeList65 = com.google.common.collect.ImmutableList.of((com.google.javascript.rhino.jstype.JSType) functionType21, (com.google.javascript.rhino.jstype.JSType) functionType35);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = jSTypeRegistry2.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType15, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList65);
        boolean boolean67 = functionType66.isUnknownType();
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertNotNull(functionType8);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNotNull(jSType11);
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertNotNull(jSTypeArray20);
        org.junit.Assert.assertNotNull(functionType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable23);
        org.junit.Assert.assertNull(jSType24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNull(jSType28);
        org.junit.Assert.assertNull(jSType29);
        org.junit.Assert.assertNotNull(jSTypeArray34);
        org.junit.Assert.assertNotNull(functionType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable37);
        org.junit.Assert.assertNull(jSType38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(jSTypeArray46);
        org.junit.Assert.assertNotNull(functionType47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable49);
        org.junit.Assert.assertNull(jSType50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(jSTypeArray59);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(jSTypeList65);
        org.junit.Assert.assertNotNull(functionType66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00326");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable7 = functionType5.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType9 = functionType5.getRestrictedTypeGivenToBooleanOutcome(true);
        boolean boolean10 = jSType9.isNullType();
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, false);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType16 = jSTypeRegistry13.createFunctionType(jSType14, jSTypeArray15);
        boolean boolean17 = functionType16.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable18 = functionType16.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType19 = functionType16.unboxesTo();
        boolean boolean21 = functionType16.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType22 = functionType16.getImplicitPrototype();
        com.google.javascript.rhino.jstype.ObjectType objectType23 = functionType16.dereference();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = jSType9.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType16);
        com.google.javascript.rhino.jstype.ObjectType objectType25 = functionType16.getPrototype();
        boolean boolean26 = objectType25.matchesObjectContext();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable7);
        org.junit.Assert.assertNotNull(jSType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType23);
        org.junit.Assert.assertNotNull(ternaryValue24);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00327");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition1 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition2 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition3 = marker0.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = stringPosition3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stringPosition1);
        org.junit.Assert.assertNull(typePosition2);
        org.junit.Assert.assertNull(stringPosition3);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00328");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, false);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry9.createFunctionType(jSType10, jSTypeArray11);
        boolean boolean13 = functionType12.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable14 = functionType12.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType15 = functionType12.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType16 = functionType12.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = functionType5.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType12);
        boolean boolean18 = functionType5.isConstructor();
        boolean boolean19 = functionType5.isNativeObjectType();
        boolean boolean20 = functionType5.isDateType();
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, false);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry23.createFunctionType(jSType24, jSTypeArray25);
        boolean boolean27 = functionType26.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList32 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor33 = strComparableList32.iterator();
        boolean boolean34 = functionType26.equals((java.lang.Object) strComparableItor33);
        boolean boolean35 = functionType26.isArrayType();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, false);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType41 = jSTypeRegistry38.createFunctionType(jSType39, jSTypeArray40);
        boolean boolean42 = functionType41.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable43 = functionType41.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType44 = functionType41.unboxesTo();
        boolean boolean46 = functionType41.removeProperty("");
        boolean boolean48 = functionType41.isPropertyTypeDeclared("Not declared as a type name");
        functionType26.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType41);
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50, false);
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray54 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType55 = jSTypeRegistry52.createFunctionType(jSType53, jSTypeArray54);
        boolean boolean56 = functionType55.isNominalType();
        boolean boolean57 = functionType55.isInterface();
        boolean boolean58 = functionType26.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType55);
        functionType5.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType26);
        boolean boolean60 = functionType26.isConstructor();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strComparableList32);
        org.junit.Assert.assertNotNull(strComparableItor33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable43);
        org.junit.Assert.assertNull(jSType44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jSTypeArray54);
        org.junit.Assert.assertNotNull(functionType55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00329");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node18.setString("");
        com.google.javascript.rhino.Node node21 = node14.useSourceInfoIfMissingFromForTree(node18);
        node18.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node31.setString("");
        com.google.javascript.rhino.Node node34 = node27.useSourceInfoIfMissingFromForTree(node31);
        boolean boolean35 = node27.isGetElem();
        int int37 = node27.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newExpr(node27);
        com.google.javascript.rhino.Node node39 = node18.srcrefTree(node38);
        java.lang.String str40 = node10.checkTreeEquals(node38);
        boolean boolean41 = node38.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node49.setString("");
        com.google.javascript.rhino.Node node52 = node45.useSourceInfoIfMissingFromForTree(node49);
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node60.setString("");
        com.google.javascript.rhino.Node node63 = node56.useSourceInfoIfMissingFromForTree(node60);
        node60.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node73.setString("");
        com.google.javascript.rhino.Node node76 = node69.useSourceInfoIfMissingFromForTree(node73);
        boolean boolean77 = node69.isGetElem();
        int int79 = node69.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node80 = com.google.javascript.jscomp.NodeUtil.newExpr(node69);
        com.google.javascript.rhino.Node node81 = node60.srcrefTree(node80);
        java.lang.String str82 = node52.checkTreeEquals(node80);
        com.google.javascript.rhino.Node node83 = node38.useSourceInfoFrom(node80);
        boolean boolean84 = node80.isFromExterns();
        int int85 = node80.getSourceOffset();
        boolean boolean86 = node80.isTry();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n" + "'", str40, "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n" + "'", str82, "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n");
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00330");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry7.createFunctionType(jSType8, jSTypeArray9);
        boolean boolean11 = functionType10.isNominalType();
        boolean boolean12 = jSTypeRegistry2.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node21.setString("");
        com.google.javascript.rhino.Node node24 = node17.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean25 = node17.isGetElem();
        com.google.javascript.rhino.Node node26 = node17.cloneNode();
        boolean boolean27 = node26.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = node26.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, false);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = functionType37.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry31.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = functionType37.getJSDocInfo();
        boolean boolean43 = functionType37.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType44 = jSTypeRegistry2.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node26, (com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.Node node45 = enumType44.getSource();
        java.lang.String str46 = enumType44.toString();
        boolean boolean48 = enumType44.isPropertyTypeDeclared("[, hi!, STRING hi!, STRING hi!]");
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49, false);
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, false);
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray56 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType57 = jSTypeRegistry54.createFunctionType(jSType55, jSTypeArray56);
        com.google.javascript.rhino.JSDocInfo jSDocInfo59 = functionType57.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType60 = jSTypeRegistry51.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType57);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable61 = functionType57.getCtorExtendedInterfaces();
        enumType44.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType57);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType63 = functionType57.getInstanceType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(staticSourceFile28);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertNull(jSDocInfo39);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertNull(jSDocInfo41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(enumType44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "enum{Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n}" + "'", str46, "enum{Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n}");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jSTypeArray56);
        org.junit.Assert.assertNotNull(functionType57);
        org.junit.Assert.assertNull(jSDocInfo59);
        org.junit.Assert.assertNotNull(jSType60);
        org.junit.Assert.assertNotNull(objectTypeIterable61);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00331");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        int int13 = node3.getIntProp((int) (byte) -1);
        boolean boolean14 = node3.isLabel();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression16 = new com.google.javascript.rhino.JSTypeExpression(node3, "STRING hi!");
        com.google.javascript.rhino.Node node17 = jSTypeExpression16.getRoot();
        com.google.javascript.rhino.Node node18 = jSTypeExpression16.getRoot();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression19 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression16);
        boolean boolean20 = jSTypeExpression16.isVarArgs();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(jSTypeExpression19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00332");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node18.setString("");
        com.google.javascript.rhino.Node node21 = node14.useSourceInfoIfMissingFromForTree(node18);
        node18.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node31.setString("");
        com.google.javascript.rhino.Node node34 = node27.useSourceInfoIfMissingFromForTree(node31);
        boolean boolean35 = node27.isGetElem();
        int int37 = node27.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newExpr(node27);
        com.google.javascript.rhino.Node node39 = node18.srcrefTree(node38);
        java.lang.String str40 = node10.checkTreeEquals(node38);
        boolean boolean41 = node38.hasMoreThanOneChild();
        boolean boolean42 = node38.isNE();
        boolean boolean43 = node38.isArrayLit();
        // The following exception was thrown during execution in test generation
        try {
            int int45 = node38.getExistingIntProp(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n" + "'", str40, "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00333");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, false);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry9.createFunctionType(jSType10, jSTypeArray11);
        boolean boolean13 = functionType12.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable14 = functionType12.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType15 = functionType12.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType16 = functionType12.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = functionType5.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType12);
        boolean boolean18 = functionType5.isConstructor();
        boolean boolean19 = functionType5.isNativeObjectType();
        boolean boolean20 = functionType5.isDateType();
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, false);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry23.createFunctionType(jSType24, jSTypeArray25);
        boolean boolean27 = functionType26.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList32 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor33 = strComparableList32.iterator();
        boolean boolean34 = functionType26.equals((java.lang.Object) strComparableItor33);
        boolean boolean35 = functionType26.isArrayType();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, false);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType41 = jSTypeRegistry38.createFunctionType(jSType39, jSTypeArray40);
        boolean boolean42 = functionType41.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable43 = functionType41.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType44 = functionType41.unboxesTo();
        boolean boolean46 = functionType41.removeProperty("");
        boolean boolean48 = functionType41.isPropertyTypeDeclared("Not declared as a type name");
        functionType26.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType41);
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50, false);
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray54 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType55 = jSTypeRegistry52.createFunctionType(jSType53, jSTypeArray54);
        boolean boolean56 = functionType55.isNominalType();
        boolean boolean57 = functionType55.isInterface();
        boolean boolean58 = functionType26.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType55);
        functionType5.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType26);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType60 = functionType26.getInstanceType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strComparableList32);
        org.junit.Assert.assertNotNull(strComparableItor33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable43);
        org.junit.Assert.assertNull(jSType44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jSTypeArray54);
        org.junit.Assert.assertNotNull(functionType55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00334");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node11.setString("");
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node11);
        node11.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry19.createFunctionType(jSType20, jSTypeArray21);
        boolean boolean23 = functionType22.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry2.createObjectType("hi!", node11, (com.google.javascript.rhino.jstype.ObjectType) functionType22);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node26 = jSTypeRegistry2.createParametersWithVarArgs(jSTypeArray25);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, false);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry30.createFunctionType(jSType31, jSTypeArray32);
        boolean boolean34 = functionType33.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable35 = functionType33.getCtorImplementedInterfaces();
        jSTypeRegistry2.registerPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) functionType33);
        com.google.javascript.rhino.jstype.JSType jSType38 = jSTypeRegistry2.getType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n");
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, false);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray43 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry41.createFunctionType(jSType42, jSTypeArray43);
        boolean boolean45 = functionType44.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList50 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor51 = strComparableList50.iterator();
        boolean boolean52 = functionType44.equals((java.lang.Object) strComparableItor51);
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, false);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType59 = jSTypeRegistry56.createFunctionType(jSType57, jSTypeArray58);
        boolean boolean60 = functionType59.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable61 = functionType59.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node62 = null;
        boolean boolean63 = functionType44.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType59, node62);
        java.util.Set<java.lang.String> strSet64 = functionType44.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.ObjectType objectType65 = functionType44.getParentScope();
        com.google.javascript.rhino.Node node67 = functionType44.getPropertyNode("");
        com.google.javascript.rhino.ErrorReporter errorReporter68 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter68, false);
        com.google.javascript.rhino.jstype.JSType jSType71 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray72 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType73 = jSTypeRegistry70.createFunctionType(jSType71, jSTypeArray72);
        boolean boolean74 = functionType73.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter75 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter75, false);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray79 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType80 = jSTypeRegistry77.createFunctionType(jSType78, jSTypeArray79);
        boolean boolean81 = functionType80.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable82 = functionType80.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType83 = functionType80.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType84 = functionType80.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue85 = functionType73.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType80);
        boolean boolean86 = functionType80.isNumberObjectType();
        boolean boolean87 = functionType80.isReturnTypeInferred();
        com.google.javascript.rhino.jstype.JSType jSType88 = functionType80.getParameterType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType89 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType44, jSType88);
        boolean boolean91 = parameterizedType89.isPropertyTypeDeclared("function (): {308555690}");
        boolean boolean92 = parameterizedType89.isNoResolvedType();
        com.google.javascript.rhino.jstype.JSType jSType93 = parameterizedType89.collapseUnion();
        com.google.javascript.rhino.jstype.JSType jSType95 = parameterizedType89.getPropertyType("function (): {308555690}");
        com.google.javascript.rhino.jstype.EnumType enumType96 = parameterizedType89.toMaybeEnumType();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet97 = enumType96.getOwnPropertyNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable35);
        org.junit.Assert.assertNull(jSType38);
        org.junit.Assert.assertNotNull(jSTypeArray43);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strComparableList50);
        org.junit.Assert.assertNotNull(strComparableItor51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertNotNull(functionType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertNotNull(objectType65);
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertNotNull(jSTypeArray72);
        org.junit.Assert.assertNotNull(functionType73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(jSTypeArray79);
        org.junit.Assert.assertNotNull(functionType80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable82);
        org.junit.Assert.assertNull(jSType83);
        org.junit.Assert.assertNotNull(jSType84);
        org.junit.Assert.assertNotNull(ternaryValue85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNull(jSType88);
        org.junit.Assert.assertNotNull(parameterizedType89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(jSType93);
        org.junit.Assert.assertNotNull(jSType95);
        org.junit.Assert.assertNull(enumType96);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00335");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable7 = functionType5.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType8 = functionType5.unboxesTo();
        boolean boolean10 = functionType5.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType11 = functionType5.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType12 = functionType5.getIndexType();
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType5.getIndexType();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14, false);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray18 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType19 = jSTypeRegistry16.createFunctionType(jSType17, jSTypeArray18);
        boolean boolean20 = functionType19.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable21 = functionType19.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType22 = functionType19.unboxesTo();
        boolean boolean24 = functionType19.removeProperty("");
        int int25 = functionType19.getMaxArguments();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, false);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray30 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType31 = jSTypeRegistry28.createFunctionType(jSType29, jSTypeArray30);
        boolean boolean32 = functionType31.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable33 = functionType31.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType34 = functionType31.unboxesTo();
        boolean boolean36 = functionType31.removeProperty("");
        int int37 = functionType31.getMaxArguments();
        java.lang.String str38 = functionType31.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, false);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray43 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry41.createFunctionType(jSType42, jSTypeArray43);
        boolean boolean45 = functionType44.isNominalType();
        functionType31.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType44);
        boolean boolean47 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) functionType19, (com.google.javascript.rhino.jstype.JSType) functionType44);
        boolean boolean48 = functionType19.isNullType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSType> jSTypeList49 = com.google.common.collect.ImmutableList.of((com.google.javascript.rhino.jstype.JSType) functionType5, (com.google.javascript.rhino.jstype.JSType) functionType19);
        com.google.javascript.rhino.jstype.JSType jSType50 = functionType19.autoboxesTo();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNotNull(jSTypeArray18);
        org.junit.Assert.assertNotNull(functionType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable21);
        org.junit.Assert.assertNull(jSType22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(jSTypeArray30);
        org.junit.Assert.assertNotNull(functionType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable33);
        org.junit.Assert.assertNull(jSType34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(jSTypeArray43);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jSTypeList49);
        org.junit.Assert.assertNull(jSType50);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00336");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        com.google.javascript.rhino.jstype.JSType jSType7 = functionType5.getParameterType();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node15.setString("");
        com.google.javascript.rhino.Node node18 = node11.useSourceInfoIfMissingFromForTree(node15);
        boolean boolean19 = node11.isGetElem();
        com.google.javascript.rhino.Node node20 = node11.cloneNode();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile21 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node11);
        boolean boolean22 = node11.isNot();
        functionType5.setSource(node11);
        java.util.Set<java.lang.String> strSet24 = functionType5.getOwnPropertyNames();
        java.util.Iterator<java.lang.String> strItor25 = strSet24.iterator();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(staticSourceFile21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(strItor25);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00337");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList4 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList5 = strComparableList4.reverse();
        int int6 = strComparableList4.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableList4.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableList4);
        org.junit.Assert.assertNotNull(strComparableList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00338");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node11.setString("");
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node11);
        node11.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry19.createFunctionType(jSType20, jSTypeArray21);
        boolean boolean23 = functionType22.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry2.createObjectType("hi!", node11, (com.google.javascript.rhino.jstype.ObjectType) functionType22);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, false);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray30 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType31 = jSTypeRegistry28.createFunctionType(jSType29, jSTypeArray30);
        boolean boolean32 = functionType31.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable33 = functionType31.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType34 = functionType31.unboxesTo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo35 = new com.google.javascript.rhino.JSDocInfo();
        functionType31.setJSDocInfo(jSDocInfo35);
        boolean boolean37 = jSDocInfo35.isHidden();
        functionType22.setPropertyJSDocInfo("", jSDocInfo35);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression39 = jSDocInfo35.getType();
        boolean boolean40 = jSDocInfo35.isConstructor();
        boolean boolean41 = jSDocInfo35.hasThisType();
        jSDocInfo35.addSuppression("");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(jSTypeArray30);
        org.junit.Assert.assertNotNull(functionType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable33);
        org.junit.Assert.assertNull(jSType34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(jSTypeExpression39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00339");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node11.setString("");
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node11);
        node11.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry19.createFunctionType(jSType20, jSTypeArray21);
        boolean boolean23 = functionType22.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry2.createObjectType("hi!", node11, (com.google.javascript.rhino.jstype.ObjectType) functionType22);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node26 = jSTypeRegistry2.createParametersWithVarArgs(jSTypeArray25);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28);
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, false);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray34 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType35 = jSTypeRegistry32.createFunctionType(jSType33, jSTypeArray34);
        boolean boolean36 = functionType35.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable37 = functionType35.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType38 = functionType35.unboxesTo();
        boolean boolean40 = functionType35.removeProperty("");
        int int41 = functionType35.getMaxArguments();
        java.lang.String str42 = functionType35.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, false);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray47 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry45.createFunctionType(jSType46, jSTypeArray47);
        boolean boolean49 = functionType48.isNominalType();
        functionType35.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType48);
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51, false);
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray55 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry53.createFunctionType(jSType54, jSTypeArray55);
        boolean boolean57 = functionType56.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable58 = functionType56.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType59 = functionType56.unboxesTo();
        boolean boolean61 = functionType56.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType62 = functionType56.getImplicitPrototype();
        functionType35.setPrototypeBasedOn(objectType62);
        boolean boolean65 = jSTypeRegistry29.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) functionType35, "hi!");
        jSTypeRegistry2.unregisterPropertyOnType("Named type with empty name component", (com.google.javascript.rhino.jstype.JSType) functionType35);
        boolean boolean67 = functionType35.isConstructor();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType68 = functionType35.cloneWithoutArrowType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(jSTypeArray34);
        org.junit.Assert.assertNotNull(functionType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable37);
        org.junit.Assert.assertNull(jSType38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(jSTypeArray47);
        org.junit.Assert.assertNotNull(functionType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(jSTypeArray55);
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable58);
        org.junit.Assert.assertNull(jSType59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(objectType62);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00340");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node11.setString("");
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node11);
        node11.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry19.createFunctionType(jSType20, jSTypeArray21);
        boolean boolean23 = functionType22.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry2.createObjectType("hi!", node11, (com.google.javascript.rhino.jstype.ObjectType) functionType22);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node26 = jSTypeRegistry2.createParametersWithVarArgs(jSTypeArray25);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, false);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry30.createFunctionType(jSType31, jSTypeArray32);
        boolean boolean34 = functionType33.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable35 = functionType33.getCtorImplementedInterfaces();
        jSTypeRegistry2.registerPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) functionType33);
        com.google.javascript.rhino.jstype.JSType jSType38 = jSTypeRegistry2.getType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n");
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, false);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray43 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry41.createFunctionType(jSType42, jSTypeArray43);
        boolean boolean45 = functionType44.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList50 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor51 = strComparableList50.iterator();
        boolean boolean52 = functionType44.equals((java.lang.Object) strComparableItor51);
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, false);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType59 = jSTypeRegistry56.createFunctionType(jSType57, jSTypeArray58);
        boolean boolean60 = functionType59.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable61 = functionType59.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node62 = null;
        boolean boolean63 = functionType44.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType59, node62);
        java.util.Set<java.lang.String> strSet64 = functionType44.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.ObjectType objectType65 = functionType44.getParentScope();
        com.google.javascript.rhino.Node node67 = functionType44.getPropertyNode("");
        com.google.javascript.rhino.ErrorReporter errorReporter68 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter68, false);
        com.google.javascript.rhino.jstype.JSType jSType71 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray72 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType73 = jSTypeRegistry70.createFunctionType(jSType71, jSTypeArray72);
        boolean boolean74 = functionType73.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter75 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter75, false);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray79 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType80 = jSTypeRegistry77.createFunctionType(jSType78, jSTypeArray79);
        boolean boolean81 = functionType80.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable82 = functionType80.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType83 = functionType80.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType84 = functionType80.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue85 = functionType73.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType80);
        boolean boolean86 = functionType80.isNumberObjectType();
        boolean boolean87 = functionType80.isReturnTypeInferred();
        com.google.javascript.rhino.jstype.JSType jSType88 = functionType80.getParameterType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType89 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType44, jSType88);
        boolean boolean90 = parameterizedType89.isInstanceType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean91 = parameterizedType89.hasAnyTemplateInternal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable35);
        org.junit.Assert.assertNull(jSType38);
        org.junit.Assert.assertNotNull(jSTypeArray43);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strComparableList50);
        org.junit.Assert.assertNotNull(strComparableItor51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertNotNull(functionType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertNotNull(objectType65);
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertNotNull(jSTypeArray72);
        org.junit.Assert.assertNotNull(functionType73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(jSTypeArray79);
        org.junit.Assert.assertNotNull(functionType80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable82);
        org.junit.Assert.assertNull(jSType83);
        org.junit.Assert.assertNotNull(jSType84);
        org.junit.Assert.assertNotNull(ternaryValue85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNull(jSType88);
        org.junit.Assert.assertNotNull(parameterizedType89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00341");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, false);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry9.createFunctionType(jSType10, jSTypeArray11);
        boolean boolean13 = functionType12.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable14 = functionType12.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType15 = functionType12.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType16 = functionType12.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = functionType5.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType12);
        boolean boolean18 = functionType12.isObject();
        boolean boolean19 = functionType12.isFunctionPrototypeType();
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20, false);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry22.createFunctionType(jSType23, jSTypeArray24);
        boolean boolean26 = functionType25.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable27 = functionType25.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType28 = functionType25.unboxesTo();
        boolean boolean30 = functionType25.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType31 = functionType25.getImplicitPrototype();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue32 = functionType12.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType25);
        com.google.javascript.rhino.jstype.ObjectType objectType33 = functionType12.dereference();
        java.lang.String str34 = objectType33.getReferenceName();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable27);
        org.junit.Assert.assertNull(jSType28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objectType31);
        org.junit.Assert.assertNotNull(ternaryValue32);
        org.junit.Assert.assertNotNull(objectType33);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00342");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("Named type with empty name component", 49, 35);
        boolean boolean4 = node3.isNoSideEffectsCall();
        boolean boolean5 = node3.isDec();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00343");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node7.isTry();
        com.google.javascript.rhino.Node node12 = node7.removeChildren();
        boolean boolean13 = node7.isStringKey();
        com.google.javascript.rhino.Node node14 = node7.removeFirstChild();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00344");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        node7.setSourceEncodedPositionForTree((int) '#');
        boolean boolean13 = node7.isOr();
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>> nodeSourcePositionBuilder14 = com.google.common.collect.ImmutableList.builder();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition15 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>> nodeSourcePositionBuilder16 = nodeSourcePositionBuilder14.add((com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>) typePosition15);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node24.setString("");
        com.google.javascript.rhino.Node node27 = node20.useSourceInfoIfMissingFromForTree(node24);
        boolean boolean28 = node20.isGetElem();
        int int30 = node20.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newExpr(node20);
        com.google.javascript.rhino.Node node32 = node20.detachFromParent();
        boolean boolean33 = node20.isQuotedString();
        boolean boolean34 = node20.isNoSideEffectsCall();
        typePosition15.setItem(node20);
        boolean boolean36 = node20.isInc();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node45.setString("");
        com.google.javascript.rhino.Node node48 = node41.useSourceInfoIfMissingFromForTree(node45);
        boolean boolean49 = node41.isGetElem();
        com.google.javascript.rhino.Node node50 = node41.cloneNode();
        boolean boolean51 = node50.isContinue();
        com.google.javascript.rhino.Node node52 = node50.cloneTree();
        node52.setSourceEncodedPosition((int) (short) 10);
        boolean boolean55 = node52.isSetterDef();
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56, false);
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node67.setString("");
        com.google.javascript.rhino.Node node70 = node63.useSourceInfoIfMissingFromForTree(node67);
        node67.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter73 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry75 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter73, false);
        com.google.javascript.rhino.jstype.JSType jSType76 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray77 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType78 = jSTypeRegistry75.createFunctionType(jSType76, jSTypeArray77);
        boolean boolean79 = functionType78.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType80 = jSTypeRegistry58.createObjectType("hi!", node67, (com.google.javascript.rhino.jstype.ObjectType) functionType78);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray81 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node82 = jSTypeRegistry58.createParametersWithVarArgs(jSTypeArray81);
        boolean boolean83 = node82.isIn();
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(52, node52, node82, 42, (int) (byte) 0);
        boolean boolean87 = node52.isContinue();
        boolean boolean88 = node52.isGetProp();
        com.google.javascript.rhino.Node node89 = node52.getFirstChild();
        // The following exception was thrown during execution in test generation
        try {
            node7.addChildBefore(node20, node89);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The existing child node of the parent should not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodeSourcePositionBuilder14);
        org.junit.Assert.assertNotNull(nodeSourcePositionBuilder16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(jSTypeArray77);
        org.junit.Assert.assertNotNull(functionType78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(objectType80);
        org.junit.Assert.assertNotNull(jSTypeArray81);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNull(node89);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00345");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, false);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry5.createFunctionType(jSType6, jSTypeArray7);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = functionType8.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType11 = jSTypeRegistry2.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType8);
        com.google.javascript.rhino.JSDocInfo jSDocInfo12 = functionType8.getJSDocInfo();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType13 = functionType8.toMaybeParameterizedType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType14 = parameterizedType13.restrictByNotNullOrUndefined();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertNotNull(functionType8);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNotNull(jSType11);
        org.junit.Assert.assertNull(jSDocInfo12);
        org.junit.Assert.assertNull(parameterizedType13);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00346");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        java.lang.String str2 = assertionFunctionSpec1.getFunctionName();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node10.setString("");
        com.google.javascript.rhino.Node node13 = node6.useSourceInfoIfMissingFromForTree(node10);
        boolean boolean14 = node6.isGetElem();
        com.google.javascript.rhino.Node node15 = node6.cloneNode();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node23.setString("");
        com.google.javascript.rhino.Node node26 = node19.useSourceInfoIfMissingFromForTree(node23);
        boolean boolean27 = node19.isGetElem();
        int int29 = node19.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newExpr(node19);
        com.google.javascript.rhino.Node node31 = node6.clonePropsFrom(node19);
        boolean boolean32 = node6.isGetElem();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, false);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, false);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType41 = jSTypeRegistry38.createFunctionType(jSType39, jSTypeArray40);
        com.google.javascript.rhino.JSDocInfo jSDocInfo43 = functionType41.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType44 = jSTypeRegistry35.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType41);
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, false);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry47.createFunctionType(jSType48, jSTypeArray49);
        boolean boolean51 = functionType50.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = functionType50.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType53 = functionType50.unboxesTo();
        boolean boolean55 = functionType50.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType56 = functionType50.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType58 = jSTypeRegistry35.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType) objectType56, "unknown");
        com.google.javascript.rhino.jstype.JSType jSType59 = assertionFunctionSpec1.getAssertedType(node6, jSTypeRegistry35);
        java.lang.String str60 = assertionFunctionSpec1.getFunctionName();
        java.lang.String str61 = assertionFunctionSpec1.getFunctionName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertNull(jSDocInfo43);
        org.junit.Assert.assertNotNull(jSType44);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertNull(jSType53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(objectType56);
        org.junit.Assert.assertNotNull(jSType58);
        org.junit.Assert.assertNull(jSType59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00347");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node11.setString("");
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node11);
        node11.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry19.createFunctionType(jSType20, jSTypeArray21);
        boolean boolean23 = functionType22.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry2.createObjectType("hi!", node11, (com.google.javascript.rhino.jstype.ObjectType) functionType22);
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25, false);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry27.createFunctionType(jSType28, jSTypeArray29);
        boolean boolean31 = functionType30.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList36 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor37 = strComparableList36.iterator();
        boolean boolean38 = functionType30.equals((java.lang.Object) strComparableItor37);
        com.google.javascript.rhino.Node node39 = functionType30.getSource();
        com.google.javascript.rhino.jstype.JSType jSType41 = jSTypeRegistry2.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType) functionType30, "hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, false);
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSTypeRegistry44.createAnonymousObjectType();
        boolean boolean46 = objectType45.isNominalType();
        boolean boolean47 = objectType45.isNominalType();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair48 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType30, (com.google.javascript.rhino.jstype.JSType) objectType45);
        com.google.javascript.rhino.jstype.JSType jSType49 = typePair48.typeA;
        com.google.javascript.rhino.jstype.JSType jSType50 = typePair48.typeA;
        boolean boolean51 = jSType50.isOrdinaryFunction();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(functionType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strComparableList36);
        org.junit.Assert.assertNotNull(strComparableItor37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNotNull(jSType41);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(jSType49);
        org.junit.Assert.assertNotNull(jSType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00348");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, false);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry9.createFunctionType(jSType10, jSTypeArray11);
        boolean boolean13 = functionType12.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable14 = functionType12.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType15 = functionType12.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType16 = functionType12.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = functionType5.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType12);
        com.google.javascript.rhino.Node node18 = functionType5.getSource();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19, false);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry21.createFunctionType(jSType22, jSTypeArray23);
        boolean boolean25 = functionType24.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList30 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor31 = strComparableList30.iterator();
        boolean boolean32 = functionType24.equals((java.lang.Object) strComparableItor31);
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, false);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry36.createFunctionType(jSType37, jSTypeArray38);
        boolean boolean40 = functionType39.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable41 = functionType39.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node42 = null;
        boolean boolean43 = functionType24.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType39, node42);
        boolean boolean45 = functionType39.removeProperty("Not declared as a type name");
        boolean boolean46 = functionType5.hasEqualCallType(functionType39);
        java.lang.String str47 = functionType5.getNormalizedReferenceName();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strComparableList30);
        org.junit.Assert.assertNotNull(strComparableItor31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSTypeArray38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00349");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        com.google.javascript.rhino.Node node12 = node3.cloneNode();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node20.setString("");
        com.google.javascript.rhino.Node node23 = node16.useSourceInfoIfMissingFromForTree(node20);
        boolean boolean24 = node16.isGetElem();
        int int26 = node16.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newExpr(node16);
        com.google.javascript.rhino.Node node28 = node3.clonePropsFrom(node16);
        boolean boolean29 = node3.isGetElem();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile30 = null;
        node3.setStaticSourceFile(staticSourceFile30);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node39.setString("");
        com.google.javascript.rhino.Node node42 = node35.useSourceInfoIfMissingFromForTree(node39);
        boolean boolean43 = node35.isGetElem();
        com.google.javascript.rhino.Node node44 = node35.cloneNode();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node52.setString("");
        com.google.javascript.rhino.Node node55 = node48.useSourceInfoIfMissingFromForTree(node52);
        boolean boolean56 = node48.isGetElem();
        int int58 = node48.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newExpr(node48);
        com.google.javascript.rhino.Node node60 = node35.clonePropsFrom(node48);
        boolean boolean61 = node35.isGetElem();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile62 = null;
        node35.setStaticSourceFile(staticSourceFile62);
        com.google.javascript.rhino.Node node64 = node3.useSourceInfoIfMissingFromForTree(node35);
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString((int) (short) -1, "true");
        boolean boolean68 = node67.isBlock();
        boolean boolean69 = node67.isFor();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node70 = node35.getChildBefore(node67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00350");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node8.setString("");
        com.google.javascript.rhino.Node node11 = node4.useSourceInfoIfMissingFromForTree(node8);
        boolean boolean12 = node4.isGetElem();
        com.google.javascript.rhino.Node node13 = node4.cloneNode();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile14 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node4);
        boolean boolean15 = node4.isTypeOf();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node23.setString("");
        com.google.javascript.rhino.Node node26 = node19.useSourceInfoIfMissingFromForTree(node23);
        boolean boolean27 = node19.isGetElem();
        com.google.javascript.rhino.Node node28 = node19.cloneNode();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile29 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node19);
        boolean boolean30 = node19.isTypeOf();
        boolean boolean31 = node4.hasChild(node19);
        boolean boolean32 = node4.isInstanceOf();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node40.setString("");
        com.google.javascript.rhino.Node node43 = node36.useSourceInfoIfMissingFromForTree(node40);
        boolean boolean44 = node36.isGetElem();
        com.google.javascript.rhino.Node node45 = node36.cloneNode();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node53.setString("");
        com.google.javascript.rhino.Node node56 = node49.useSourceInfoIfMissingFromForTree(node53);
        boolean boolean57 = node49.isGetElem();
        int int59 = node49.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node60 = com.google.javascript.jscomp.NodeUtil.newExpr(node49);
        com.google.javascript.rhino.Node node61 = node36.clonePropsFrom(node49);
        node49.setIsSyntheticBlock(false);
        boolean boolean64 = node49.isVoid();
        boolean boolean65 = node49.isVoid();
        node49.setVarArgs(true);
        node49.setWasEmptyNode(true);
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node77.setString("");
        com.google.javascript.rhino.Node node80 = node73.useSourceInfoIfMissingFromForTree(node77);
        boolean boolean81 = node73.isGetElem();
        boolean boolean82 = node73.isCase();
        node73.addSuppression("Not declared as a type name");
        boolean boolean85 = node73.isDebugger();
        com.google.javascript.rhino.Node node86 = node73.cloneNode();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node89 = new com.google.javascript.rhino.Node(54, node4, node49, node73, 44, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(staticSourceFile14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(staticSourceFile29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(node86);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00351");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node11.setString("");
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node11);
        node11.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry19.createFunctionType(jSType20, jSTypeArray21);
        boolean boolean23 = functionType22.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry2.createObjectType("hi!", node11, (com.google.javascript.rhino.jstype.ObjectType) functionType22);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, false);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray30 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType31 = jSTypeRegistry28.createFunctionType(jSType29, jSTypeArray30);
        boolean boolean32 = functionType31.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable33 = functionType31.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType34 = functionType31.unboxesTo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo35 = new com.google.javascript.rhino.JSDocInfo();
        functionType31.setJSDocInfo(jSDocInfo35);
        boolean boolean37 = jSDocInfo35.isHidden();
        functionType22.setPropertyJSDocInfo("", jSDocInfo35);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression39 = jSDocInfo35.getType();
        boolean boolean40 = jSDocInfo35.isNoTypeCheck();
        boolean boolean41 = jSDocInfo35.isExport();
        java.lang.String str42 = jSDocInfo35.getLendsName();
        boolean boolean43 = jSDocInfo35.isNoTypeCheck();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(jSTypeArray30);
        org.junit.Assert.assertNotNull(functionType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable33);
        org.junit.Assert.assertNull(jSType34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(jSTypeExpression39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00352");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node11.setString("");
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node11);
        node11.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry19.createFunctionType(jSType20, jSTypeArray21);
        boolean boolean23 = functionType22.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry2.createObjectType("hi!", node11, (com.google.javascript.rhino.jstype.ObjectType) functionType22);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node26 = jSTypeRegistry2.createParametersWithVarArgs(jSTypeArray25);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, false);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry30.createFunctionType(jSType31, jSTypeArray32);
        boolean boolean34 = functionType33.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable35 = functionType33.getCtorImplementedInterfaces();
        jSTypeRegistry2.registerPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) functionType33);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative37 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType38 = jSTypeRegistry2.getNativeType(jSTypeNative37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable35);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00353");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList11 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableList11.iterator();
        boolean boolean13 = functionType5.equals((java.lang.Object) strComparableItor12);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14, false);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray18 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType19 = jSTypeRegistry16.createFunctionType(jSType17, jSTypeArray18);
        boolean boolean20 = functionType19.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable21 = functionType19.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType23 = functionType19.getRestrictedTypeGivenToBooleanOutcome(true);
        boolean boolean24 = jSType23.isNoType();
        boolean boolean25 = functionType5.canAssignTo(jSType23);
        boolean boolean26 = functionType5.hasReferenceName();
        com.google.javascript.rhino.jstype.TemplateType templateType27 = functionType5.toMaybeTemplateType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot29 = templateType27.getSlot("[, hi!, STRING hi!, STRING hi!]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableList11);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSTypeArray18);
        org.junit.Assert.assertNotNull(functionType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable21);
        org.junit.Assert.assertNotNull(jSType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(templateType27);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00354");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry7.createFunctionType(jSType8, jSTypeArray9);
        boolean boolean11 = functionType10.isNominalType();
        boolean boolean12 = jSTypeRegistry2.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node21.setString("");
        com.google.javascript.rhino.Node node24 = node17.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean25 = node17.isGetElem();
        com.google.javascript.rhino.Node node26 = node17.cloneNode();
        boolean boolean27 = node26.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = node26.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, false);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = functionType37.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry31.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = functionType37.getJSDocInfo();
        boolean boolean43 = functionType37.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType44 = jSTypeRegistry2.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node26, (com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.jstype.EnumType enumType45 = enumType44.toMaybeEnumType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType46 = enumType45.getElementsType();
        boolean boolean47 = enumElementType46.matchesObjectContext();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType48 = enumElementType46.toMaybeEnumElementType();
        boolean boolean49 = enumElementType46.canBeCalled();
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(staticSourceFile28);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertNull(jSDocInfo39);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertNull(jSDocInfo41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(enumType44);
        org.junit.Assert.assertNotNull(enumType45);
        org.junit.Assert.assertNotNull(enumElementType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(enumElementType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00355");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry7.createFunctionType(jSType8, jSTypeArray9);
        boolean boolean11 = functionType10.isNominalType();
        boolean boolean12 = jSTypeRegistry2.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node21.setString("");
        com.google.javascript.rhino.Node node24 = node17.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean25 = node17.isGetElem();
        com.google.javascript.rhino.Node node26 = node17.cloneNode();
        boolean boolean27 = node26.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = node26.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, false);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = functionType37.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry31.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = functionType37.getJSDocInfo();
        boolean boolean43 = functionType37.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType44 = jSTypeRegistry2.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node26, (com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.jstype.EnumType enumType45 = enumType44.toMaybeEnumType();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, false);
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray50 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType51 = jSTypeRegistry48.createFunctionType(jSType49, jSTypeArray50);
        boolean boolean52 = functionType51.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable53 = functionType51.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType55 = functionType51.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter57 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter57, false);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray61 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType62 = jSTypeRegistry59.createFunctionType(jSType60, jSTypeArray61);
        boolean boolean63 = functionType62.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable64 = functionType62.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType65 = functionType62.unboxesTo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo66 = new com.google.javascript.rhino.JSDocInfo();
        functionType62.setJSDocInfo(jSDocInfo66);
        com.google.javascript.rhino.jstype.JSType jSType68 = functionType51.resolve(errorReporter56, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType62);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue69 = enumType44.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType51);
        com.google.javascript.rhino.jstype.FunctionType functionType70 = functionType51.toMaybeFunctionType();
        boolean boolean71 = functionType70.isTemplateType();
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(staticSourceFile28);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertNull(jSDocInfo39);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertNull(jSDocInfo41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(enumType44);
        org.junit.Assert.assertNotNull(enumType45);
        org.junit.Assert.assertNotNull(jSTypeArray50);
        org.junit.Assert.assertNotNull(functionType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable53);
        org.junit.Assert.assertNotNull(jSType55);
        org.junit.Assert.assertNotNull(jSTypeArray61);
        org.junit.Assert.assertNotNull(functionType62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable64);
        org.junit.Assert.assertNull(jSType65);
        org.junit.Assert.assertNotNull(jSType68);
        org.junit.Assert.assertNotNull(ternaryValue69);
        org.junit.Assert.assertNotNull(functionType70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00356");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        boolean boolean12 = node3.isFromExterns();
        boolean boolean13 = node3.isUnscopedQualifiedName();
        boolean boolean14 = node3.isCall();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = node3.detachFromParent();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00357");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidQualifiedName("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00358");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, false);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray10 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry8.createFunctionType(jSType9, jSTypeArray10);
        boolean boolean12 = functionType11.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, false);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray17 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType18 = jSTypeRegistry15.createFunctionType(jSType16, jSTypeArray17);
        boolean boolean19 = functionType18.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable20 = functionType18.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType21 = functionType18.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType22 = functionType18.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue23 = functionType11.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType18);
        boolean boolean24 = functionType18.isObject();
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25, false);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry27.createFunctionType(jSType28, jSTypeArray29);
        boolean boolean31 = functionType30.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        boolean boolean38 = functionType37.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable39 = functionType37.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType40 = functionType37.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType41 = functionType37.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue42 = functionType30.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.Node node43 = functionType30.getSource();
        com.google.javascript.rhino.jstype.JSType jSType45 = functionType30.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, false);
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray50 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType51 = jSTypeRegistry48.createFunctionType(jSType49, jSTypeArray50);
        boolean boolean52 = functionType51.isNominalType();
        int int53 = functionType51.getPropertiesCount();
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, false);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType59 = jSTypeRegistry56.createFunctionType(jSType57, jSTypeArray58);
        boolean boolean60 = functionType59.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList65 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor66 = strComparableList65.iterator();
        boolean boolean67 = functionType59.equals((java.lang.Object) strComparableItor66);
        com.google.javascript.rhino.Node node68 = functionType59.getSource();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.FunctionType> functionTypeList69 = com.google.common.collect.ImmutableList.of(functionType5, functionType18, functionType30, functionType51, functionType59);
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry72 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70, false);
        com.google.javascript.rhino.jstype.JSType jSType73 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray74 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType75 = jSTypeRegistry72.createFunctionType(jSType73, jSTypeArray74);
        boolean boolean76 = functionType75.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable77 = functionType75.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType79 = functionType75.getRestrictedTypeGivenToBooleanOutcome(true);
        boolean boolean80 = functionType59.hasEqualCallType(functionType75);
        com.google.javascript.rhino.JSDocInfo jSDocInfo82 = functionType75.getOwnPropertyJSDocInfo("JSDocInfo");
        com.google.javascript.rhino.Node node83 = functionType75.getParametersNode();
        boolean boolean84 = node83.isString();
        com.google.javascript.rhino.Node node85 = node83.removeChildren();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertNotNull(jSTypeArray10);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSTypeArray17);
        org.junit.Assert.assertNotNull(functionType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable20);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertNotNull(jSType22);
        org.junit.Assert.assertNotNull(ternaryValue23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(functionType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable39);
        org.junit.Assert.assertNull(jSType40);
        org.junit.Assert.assertNotNull(jSType41);
        org.junit.Assert.assertNotNull(ternaryValue42);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(jSType45);
        org.junit.Assert.assertNotNull(jSTypeArray50);
        org.junit.Assert.assertNotNull(functionType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertNotNull(functionType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(strComparableList65);
        org.junit.Assert.assertNotNull(strComparableItor66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertNotNull(functionTypeList69);
        org.junit.Assert.assertNotNull(jSTypeArray74);
        org.junit.Assert.assertNotNull(functionType75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable77);
        org.junit.Assert.assertNotNull(jSType79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNull(jSDocInfo82);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNull(node85);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00359");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable7 = functionType5.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType8 = functionType5.unboxesTo();
        boolean boolean10 = functionType5.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType11 = functionType5.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, false);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType17 = jSTypeRegistry14.createFunctionType(jSType15, jSTypeArray16);
        boolean boolean18 = functionType17.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable19 = functionType17.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType20 = functionType17.unboxesTo();
        boolean boolean22 = functionType17.removeProperty("");
        boolean boolean24 = functionType17.isPropertyTypeDeclared("Not declared as a type name");
        boolean boolean25 = functionType5.differsFrom((com.google.javascript.rhino.jstype.JSType) functionType17);
        java.lang.String str26 = functionType5.getReferenceName();
        boolean boolean27 = functionType5.isString();
        com.google.javascript.rhino.Node node28 = functionType5.getRootNode();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertNotNull(functionType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(node28);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00360");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList11 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableList11.iterator();
        boolean boolean13 = functionType5.equals((java.lang.Object) strComparableItor12);
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, false);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray19 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry17.createFunctionType(jSType18, jSTypeArray19);
        boolean boolean21 = functionType20.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable22 = functionType20.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node23 = null;
        boolean boolean24 = functionType5.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType20, node23);
        boolean boolean26 = functionType20.removeProperty("Not declared as a type name");
        com.google.javascript.rhino.jstype.ObjectType objectType27 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType20);
        int int28 = functionType20.getExtendedInterfacesCount();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableList11);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSTypeArray19);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00361");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor3 = strComparableList1.iterator();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList8 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableList8.iterator();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList10 = strComparableList8.reverse();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = strComparableList8.listIterator();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList16 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor17 = strComparableList16.iterator();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList18 = strComparableList16.reverse();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Comparable<java.lang.String>> strComparableItor19 = strComparableList16.listIterator();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList24 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor25 = strComparableList24.iterator();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList26 = strComparableList24.reverse();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Comparable<java.lang.String>> strComparableItor27 = strComparableList24.listIterator();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList32 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor33 = strComparableList32.iterator();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList34 = strComparableList32.reverse();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Comparable<java.lang.String>> strComparableItor35 = strComparableList32.listIterator();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList40 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor41 = strComparableList40.iterator();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList42 = strComparableList40.reverse();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Comparable<java.lang.String>> strComparableItor43 = strComparableList40.listIterator();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList48 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor49 = strComparableList48.iterator();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList50 = strComparableList48.reverse();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Comparable<java.lang.String>> strComparableItor51 = strComparableList48.listIterator();
        com.google.common.collect.ImmutableList<com.google.common.collect.UnmodifiableListIterator<java.lang.Comparable<java.lang.String>>> strComparableItorList52 = com.google.common.collect.ImmutableList.of(strComparableItor19, strComparableItor27, strComparableItor35, strComparableItor43, strComparableItor51);
        com.google.common.collect.ImmutableList<java.util.Iterator<java.lang.Comparable<java.lang.String>>> strComparableItorList53 = com.google.common.collect.ImmutableList.of(strComparableItor3, (java.util.Iterator<java.lang.Comparable<java.lang.String>>) strComparableItor11, (java.util.Iterator<java.lang.Comparable<java.lang.String>>) strComparableItor43);
        // The following exception was thrown during execution in test generation
        try {
            strComparableItor11.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strComparableItor3);
        org.junit.Assert.assertNotNull(strComparableList8);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertNotNull(strComparableList10);
        org.junit.Assert.assertNotNull(strComparableItor11);
        org.junit.Assert.assertNotNull(strComparableList16);
        org.junit.Assert.assertNotNull(strComparableItor17);
        org.junit.Assert.assertNotNull(strComparableList18);
        org.junit.Assert.assertNotNull(strComparableItor19);
        org.junit.Assert.assertNotNull(strComparableList24);
        org.junit.Assert.assertNotNull(strComparableItor25);
        org.junit.Assert.assertNotNull(strComparableList26);
        org.junit.Assert.assertNotNull(strComparableItor27);
        org.junit.Assert.assertNotNull(strComparableList32);
        org.junit.Assert.assertNotNull(strComparableItor33);
        org.junit.Assert.assertNotNull(strComparableList34);
        org.junit.Assert.assertNotNull(strComparableItor35);
        org.junit.Assert.assertNotNull(strComparableList40);
        org.junit.Assert.assertNotNull(strComparableItor41);
        org.junit.Assert.assertNotNull(strComparableList42);
        org.junit.Assert.assertNotNull(strComparableItor43);
        org.junit.Assert.assertNotNull(strComparableList48);
        org.junit.Assert.assertNotNull(strComparableItor49);
        org.junit.Assert.assertNotNull(strComparableList50);
        org.junit.Assert.assertNotNull(strComparableItor51);
        org.junit.Assert.assertNotNull(strComparableItorList52);
        org.junit.Assert.assertNotNull(strComparableItorList53);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00362");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2, false);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType7 = jSTypeRegistry4.createFunctionType(jSType5, jSTypeArray6);
        boolean boolean8 = functionType7.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable9 = functionType7.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType7.unboxesTo();
        boolean boolean12 = functionType7.removeProperty("");
        int int13 = functionType7.getMaxArguments();
        java.lang.String str14 = functionType7.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, false);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray19 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry17.createFunctionType(jSType18, jSTypeArray19);
        boolean boolean21 = functionType20.isNominalType();
        functionType7.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType20);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, false);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType28 = jSTypeRegistry25.createFunctionType(jSType26, jSTypeArray27);
        boolean boolean29 = functionType28.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable30 = functionType28.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType31 = functionType28.unboxesTo();
        boolean boolean33 = functionType28.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType34 = functionType28.getImplicitPrototype();
        functionType7.setPrototypeBasedOn(objectType34);
        boolean boolean37 = jSTypeRegistry1.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) functionType7, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry1.getGreatestSubtypeWithProperty(jSType38, "");
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41, false);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray45 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType46 = jSTypeRegistry43.createFunctionType(jSType44, jSTypeArray45);
        boolean boolean47 = functionType46.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList52 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor53 = strComparableList52.iterator();
        boolean boolean54 = functionType46.equals((java.lang.Object) strComparableItor53);
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56, false);
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType61 = jSTypeRegistry58.createFunctionType(jSType59, jSTypeArray60);
        boolean boolean62 = functionType61.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable63 = functionType61.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node64 = null;
        boolean boolean65 = functionType46.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType61, node64);
        boolean boolean67 = functionType61.removeProperty("Not declared as a type name");
        com.google.javascript.rhino.jstype.ObjectType objectType68 = jSTypeRegistry1.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType61);
        boolean boolean69 = functionType61.isResolved();
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertNotNull(functionType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(jSTypeArray19);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(functionType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable30);
        org.junit.Assert.assertNull(jSType31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertNotNull(jSTypeArray45);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strComparableList52);
        org.junit.Assert.assertNotNull(strComparableItor53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertNotNull(functionType61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(objectType68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00363");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList11 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableList11.iterator();
        boolean boolean13 = functionType5.equals((java.lang.Object) strComparableItor12);
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, false);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray19 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry17.createFunctionType(jSType18, jSTypeArray19);
        boolean boolean21 = functionType20.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable22 = functionType20.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node23 = null;
        boolean boolean24 = functionType5.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType20, node23);
        java.util.Set<java.lang.String> strSet25 = functionType5.getOwnPropertyNames();
        boolean boolean26 = strSet25.isEmpty();
        java.io.IOException iOException29 = new java.io.IOException("");
        java.io.IOException iOException31 = new java.io.IOException("");
        iOException29.addSuppressed((java.lang.Throwable) iOException31);
        java.lang.Throwable[] throwableArray33 = iOException29.getSuppressed();
        java.io.IOException iOException34 = new java.io.IOException("function (): {1534343319}", (java.lang.Throwable) iOException29);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = strSet25.remove((java.lang.Object) iOException34);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.io.IOException cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableList11);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSTypeArray19);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(throwableArray33);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00364");
        com.google.javascript.rhino.Node node1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(2, node1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00365");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node11.setString("");
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node11);
        node11.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry19.createFunctionType(jSType20, jSTypeArray21);
        boolean boolean23 = functionType22.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry2.createObjectType("hi!", node11, (com.google.javascript.rhino.jstype.ObjectType) functionType22);
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25, false);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry27.createFunctionType(jSType28, jSTypeArray29);
        boolean boolean31 = functionType30.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList36 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor37 = strComparableList36.iterator();
        boolean boolean38 = functionType30.equals((java.lang.Object) strComparableItor37);
        com.google.javascript.rhino.Node node39 = functionType30.getSource();
        com.google.javascript.rhino.jstype.JSType jSType41 = jSTypeRegistry2.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType) functionType30, "hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, false);
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSTypeRegistry44.createAnonymousObjectType();
        boolean boolean46 = objectType45.isNominalType();
        boolean boolean47 = objectType45.isNominalType();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair48 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType30, (com.google.javascript.rhino.jstype.JSType) objectType45);
        com.google.javascript.rhino.jstype.JSType jSType49 = typePair48.typeA;
        com.google.javascript.rhino.jstype.JSType jSType50 = typePair48.typeB;
        com.google.javascript.rhino.jstype.JSType jSType51 = typePair48.typeB;
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(functionType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strComparableList36);
        org.junit.Assert.assertNotNull(strComparableItor37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNotNull(jSType41);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(jSType49);
        org.junit.Assert.assertNotNull(jSType50);
        org.junit.Assert.assertNotNull(jSType51);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00366");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable7 = functionType5.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType8 = functionType5.unboxesTo();
        boolean boolean10 = functionType5.removeProperty("");
        int int11 = functionType5.getMaxArguments();
        java.lang.String str12 = functionType5.toDebugHashCodeString();
        com.google.javascript.rhino.Node node14 = functionType5.getPropertyNode("JSDocInfo");
        java.lang.String str15 = functionType5.toDebugHashCodeString();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType16 = functionType5.cloneWithoutArrowType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "function (): {2019548904}" + "'", str12, "function (): {2019548904}");
        org.junit.Assert.assertNull(node14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "function (): {2019548904}" + "'", str15, "function (): {2019548904}");
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00367");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList4 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableList4.iterator();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList6 = strComparableList4.reverse();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableList6.parallelStream();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility8 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        int int9 = strComparableList6.indexOf((java.lang.Object) visibility8);
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10, false);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray14 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType15 = jSTypeRegistry12.createFunctionType(jSType13, jSTypeArray14);
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, false);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType21 = jSTypeRegistry18.createFunctionType(jSType19, jSTypeArray20);
        boolean boolean22 = functionType21.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList27 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor28 = strComparableList27.iterator();
        boolean boolean29 = functionType21.equals((java.lang.Object) strComparableItor28);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, false);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray35 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry33.createFunctionType(jSType34, jSTypeArray35);
        boolean boolean37 = functionType36.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable38 = functionType36.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node39 = null;
        boolean boolean40 = functionType21.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType36, node39);
        boolean boolean42 = functionType36.removeProperty("Not declared as a type name");
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, false);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray47 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry45.createFunctionType(jSType46, jSTypeArray47);
        boolean boolean49 = functionType48.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList54 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor55 = strComparableList54.iterator();
        boolean boolean56 = functionType48.equals((java.lang.Object) strComparableItor55);
        com.google.javascript.rhino.ErrorReporter errorReporter57 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter57, false);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray61 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType62 = jSTypeRegistry59.createFunctionType(jSType60, jSTypeArray61);
        com.google.javascript.rhino.JSDocInfo jSDocInfo64 = functionType62.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType.TypePair typePair65 = functionType48.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) functionType62);
        boolean boolean66 = jSTypeRegistry12.resetImplicitPrototype((com.google.javascript.rhino.jstype.JSType) functionType36, (com.google.javascript.rhino.jstype.ObjectType) functionType62);
        boolean boolean67 = strComparableList6.contains((java.lang.Object) functionType62);
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList72 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList73 = strComparableList72.reverse();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList74 = strComparableList72.asList();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean75 = strComparableList6.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList72);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableList4);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertNotNull(strComparableList6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertTrue("'" + visibility8 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility8.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(jSTypeArray14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertNotNull(jSTypeArray20);
        org.junit.Assert.assertNotNull(functionType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strComparableList27);
        org.junit.Assert.assertNotNull(strComparableItor28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jSTypeArray35);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(jSTypeArray47);
        org.junit.Assert.assertNotNull(functionType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strComparableList54);
        org.junit.Assert.assertNotNull(strComparableItor55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(jSTypeArray61);
        org.junit.Assert.assertNotNull(functionType62);
        org.junit.Assert.assertNull(jSDocInfo64);
        org.junit.Assert.assertNotNull(typePair65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(strComparableList72);
        org.junit.Assert.assertNotNull(strComparableList73);
        org.junit.Assert.assertNotNull(strComparableList74);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00368");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        java.lang.String str2 = assertionFunctionSpec1.getFunctionName();
        java.lang.String str3 = assertionFunctionSpec1.getFunctionName();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition4 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int5 = namePosition4.getPositionOnEndLine();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition6 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int7 = namePosition6.getPositionOnEndLine();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition8 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int9 = namePosition8.getPositionOnEndLine();
        int int10 = namePosition8.getEndLine();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition11 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int12 = namePosition11.getPositionOnEndLine();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.NamePosition> namePositionList13 = com.google.common.collect.ImmutableList.of(namePosition4, namePosition6, namePosition8, namePosition11);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node21.setString("");
        com.google.javascript.rhino.Node node24 = node17.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean25 = node17.isGetElem();
        int int27 = node17.getIntProp((int) (byte) -1);
        boolean boolean28 = node17.isLabel();
        com.google.javascript.rhino.Node node29 = node17.getLastChild();
        boolean boolean30 = node17.isDebugger();
        boolean boolean32 = node17.getBooleanProp(2);
        namePosition6.setItem(node17);
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, false);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry36.createFunctionType(jSType37, jSTypeArray38);
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, false);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray44 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSTypeRegistry42.createFunctionType(jSType43, jSTypeArray44);
        boolean boolean46 = functionType45.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList51 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor52 = strComparableList51.iterator();
        boolean boolean53 = functionType45.equals((java.lang.Object) strComparableItor52);
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, false);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray59 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry57.createFunctionType(jSType58, jSTypeArray59);
        boolean boolean61 = functionType60.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable62 = functionType60.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node63 = null;
        boolean boolean64 = functionType45.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType60, node63);
        boolean boolean66 = functionType60.removeProperty("Not declared as a type name");
        com.google.javascript.rhino.ErrorReporter errorReporter67 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry69 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter67, false);
        com.google.javascript.rhino.jstype.JSType jSType70 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray71 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry69.createFunctionType(jSType70, jSTypeArray71);
        boolean boolean73 = functionType72.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList78 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor79 = strComparableList78.iterator();
        boolean boolean80 = functionType72.equals((java.lang.Object) strComparableItor79);
        com.google.javascript.rhino.ErrorReporter errorReporter81 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry83 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter81, false);
        com.google.javascript.rhino.jstype.JSType jSType84 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray85 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType86 = jSTypeRegistry83.createFunctionType(jSType84, jSTypeArray85);
        com.google.javascript.rhino.JSDocInfo jSDocInfo88 = functionType86.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType.TypePair typePair89 = functionType72.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) functionType86);
        boolean boolean90 = jSTypeRegistry36.resetImplicitPrototype((com.google.javascript.rhino.jstype.JSType) functionType60, (com.google.javascript.rhino.jstype.ObjectType) functionType86);
        com.google.javascript.rhino.jstype.JSType jSType92 = jSTypeRegistry36.getType("Not declared as a type name");
        jSTypeRegistry36.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType94 = assertionFunctionSpec1.getAssertedType(node17, jSTypeRegistry36);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node95 = node17.detachFromParent();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(namePositionList13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSTypeArray38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertNotNull(jSTypeArray44);
        org.junit.Assert.assertNotNull(functionType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strComparableList51);
        org.junit.Assert.assertNotNull(strComparableItor52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(jSTypeArray59);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(jSTypeArray71);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(strComparableList78);
        org.junit.Assert.assertNotNull(strComparableItor79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(jSTypeArray85);
        org.junit.Assert.assertNotNull(functionType86);
        org.junit.Assert.assertNull(jSDocInfo88);
        org.junit.Assert.assertNotNull(typePair89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNull(jSType92);
        org.junit.Assert.assertNull(jSType94);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00369");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node8.setString("");
        com.google.javascript.rhino.Node node11 = node4.useSourceInfoIfMissingFromForTree(node8);
        boolean boolean12 = node4.isGetElem();
        com.google.javascript.rhino.Node node13 = node4.cloneNode();
        boolean boolean14 = node13.isContinue();
        com.google.javascript.rhino.Node node15 = node13.cloneTree();
        node15.setSourceEncodedPosition((int) (short) 10);
        boolean boolean18 = node15.isSetterDef();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19, false);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node30.setString("");
        com.google.javascript.rhino.Node node33 = node26.useSourceInfoIfMissingFromForTree(node30);
        node30.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, false);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType41 = jSTypeRegistry38.createFunctionType(jSType39, jSTypeArray40);
        boolean boolean42 = functionType41.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType43 = jSTypeRegistry21.createObjectType("hi!", node30, (com.google.javascript.rhino.jstype.ObjectType) functionType41);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray44 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node45 = jSTypeRegistry21.createParametersWithVarArgs(jSTypeArray44);
        boolean boolean46 = node45.isIn();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(52, node15, node45, 42, (int) (byte) 0);
        com.google.javascript.rhino.Node node50 = node45.removeFirstChild();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(objectType43);
        org.junit.Assert.assertNotNull(jSTypeArray44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(node50);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00370");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node11.setString("");
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node11);
        node11.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry19.createFunctionType(jSType20, jSTypeArray21);
        boolean boolean23 = functionType22.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry2.createObjectType("hi!", node11, (com.google.javascript.rhino.jstype.ObjectType) functionType22);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node26 = jSTypeRegistry2.createParametersWithVarArgs(jSTypeArray25);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, false);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry30.createFunctionType(jSType31, jSTypeArray32);
        boolean boolean34 = functionType33.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable35 = functionType33.getCtorImplementedInterfaces();
        jSTypeRegistry2.registerPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) functionType33);
        com.google.javascript.rhino.jstype.JSType jSType38 = jSTypeRegistry2.getType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n");
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, false);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray43 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry41.createFunctionType(jSType42, jSTypeArray43);
        boolean boolean45 = functionType44.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList50 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor51 = strComparableList50.iterator();
        boolean boolean52 = functionType44.equals((java.lang.Object) strComparableItor51);
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, false);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType59 = jSTypeRegistry56.createFunctionType(jSType57, jSTypeArray58);
        boolean boolean60 = functionType59.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable61 = functionType59.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node62 = null;
        boolean boolean63 = functionType44.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType59, node62);
        java.util.Set<java.lang.String> strSet64 = functionType44.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.ObjectType objectType65 = functionType44.getParentScope();
        com.google.javascript.rhino.Node node67 = functionType44.getPropertyNode("");
        com.google.javascript.rhino.ErrorReporter errorReporter68 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter68, false);
        com.google.javascript.rhino.jstype.JSType jSType71 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray72 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType73 = jSTypeRegistry70.createFunctionType(jSType71, jSTypeArray72);
        boolean boolean74 = functionType73.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter75 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter75, false);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray79 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType80 = jSTypeRegistry77.createFunctionType(jSType78, jSTypeArray79);
        boolean boolean81 = functionType80.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable82 = functionType80.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType83 = functionType80.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType84 = functionType80.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue85 = functionType73.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType80);
        boolean boolean86 = functionType80.isNumberObjectType();
        boolean boolean87 = functionType80.isReturnTypeInferred();
        com.google.javascript.rhino.jstype.JSType jSType88 = functionType80.getParameterType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType89 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType44, jSType88);
        boolean boolean91 = parameterizedType89.isPropertyTypeDeclared("function (): {308555690}");
        boolean boolean92 = parameterizedType89.isNoResolvedType();
        com.google.javascript.rhino.jstype.JSType jSType93 = parameterizedType89.collapseUnion();
        com.google.javascript.rhino.jstype.JSType jSType95 = parameterizedType89.getPropertyType("function (): {308555690}");
        com.google.javascript.rhino.jstype.EnumType enumType96 = parameterizedType89.toMaybeEnumType();
        boolean boolean97 = parameterizedType89.isNoType();
        com.google.javascript.rhino.jstype.JSType jSType98 = parameterizedType89.collapseUnion();
        boolean boolean99 = parameterizedType89.isNoResolvedType();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable35);
        org.junit.Assert.assertNull(jSType38);
        org.junit.Assert.assertNotNull(jSTypeArray43);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strComparableList50);
        org.junit.Assert.assertNotNull(strComparableItor51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertNotNull(functionType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertNotNull(objectType65);
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertNotNull(jSTypeArray72);
        org.junit.Assert.assertNotNull(functionType73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(jSTypeArray79);
        org.junit.Assert.assertNotNull(functionType80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable82);
        org.junit.Assert.assertNull(jSType83);
        org.junit.Assert.assertNotNull(jSType84);
        org.junit.Assert.assertNotNull(ternaryValue85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNull(jSType88);
        org.junit.Assert.assertNotNull(parameterizedType89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(jSType93);
        org.junit.Assert.assertNotNull(jSType95);
        org.junit.Assert.assertNull(enumType96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNotNull(jSType98);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00371");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int1 = namePosition0.getPositionOnEndLine();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition2 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int3 = namePosition2.getPositionOnEndLine();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition4 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int5 = namePosition4.getPositionOnEndLine();
        int int6 = namePosition4.getEndLine();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition7 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int8 = namePosition7.getPositionOnEndLine();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.NamePosition> namePositionList9 = com.google.common.collect.ImmutableList.of(namePosition0, namePosition2, namePosition4, namePosition7);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node17.setString("");
        com.google.javascript.rhino.Node node20 = node13.useSourceInfoIfMissingFromForTree(node17);
        boolean boolean21 = node13.isGetElem();
        int int23 = node13.getIntProp((int) (byte) -1);
        boolean boolean24 = node13.isLabel();
        com.google.javascript.rhino.Node node25 = node13.getLastChild();
        boolean boolean26 = node13.isDebugger();
        boolean boolean28 = node13.getBooleanProp(2);
        namePosition2.setItem(node13);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node37.setString("");
        com.google.javascript.rhino.Node node40 = node33.useSourceInfoIfMissingFromForTree(node37);
        boolean boolean41 = node33.isGetElem();
        boolean boolean42 = node33.isFromExterns();
        boolean boolean43 = node33.isBlock();
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((int) ' ');
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition46 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node54.setString("");
        com.google.javascript.rhino.Node node57 = node50.useSourceInfoIfMissingFromForTree(node54);
        boolean boolean58 = node50.isGetElem();
        com.google.javascript.rhino.Node node59 = node50.cloneNode();
        boolean boolean60 = node59.isContinue();
        com.google.javascript.rhino.Node node61 = node59.cloneTree();
        boolean boolean62 = node59.isLocalResultCall();
        typePosition46.setItem(node59);
        node45.addChildrenToFront(node59);
        // The following exception was thrown during execution in test generation
        try {
            node13.addChildBefore(node33, node59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The existing child node of the parent should not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(namePositionList9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00372");
        com.google.javascript.rhino.InputId inputId1 = new com.google.javascript.rhino.InputId("hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2, false);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType7 = jSTypeRegistry4.createFunctionType(jSType5, jSTypeArray6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, false);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray12 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry10.createFunctionType(jSType11, jSTypeArray12);
        boolean boolean14 = functionType13.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, false);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray19 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry17.createFunctionType(jSType18, jSTypeArray19);
        boolean boolean21 = functionType20.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable22 = functionType20.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType23 = functionType20.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType24 = functionType20.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue25 = functionType13.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType20);
        boolean boolean26 = functionType20.isObject();
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27, false);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray31 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry29.createFunctionType(jSType30, jSTypeArray31);
        boolean boolean33 = functionType32.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, false);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry36.createFunctionType(jSType37, jSTypeArray38);
        boolean boolean40 = functionType39.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable41 = functionType39.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType42 = functionType39.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType43 = functionType39.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue44 = functionType32.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType39);
        com.google.javascript.rhino.Node node45 = functionType32.getSource();
        com.google.javascript.rhino.jstype.JSType jSType47 = functionType32.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48, false);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray52 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry50.createFunctionType(jSType51, jSTypeArray52);
        boolean boolean54 = functionType53.isNominalType();
        int int55 = functionType53.getPropertiesCount();
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56, false);
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType61 = jSTypeRegistry58.createFunctionType(jSType59, jSTypeArray60);
        boolean boolean62 = functionType61.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList67 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor68 = strComparableList67.iterator();
        boolean boolean69 = functionType61.equals((java.lang.Object) strComparableItor68);
        com.google.javascript.rhino.Node node70 = functionType61.getSource();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.FunctionType> functionTypeList71 = com.google.common.collect.ImmutableList.of(functionType7, functionType20, functionType32, functionType53, functionType61);
        java.util.Set<java.lang.String> strSet72 = functionType32.getOwnPropertyNames();
        java.util.Spliterator<java.lang.String> strSpliterator73 = strSet72.spliterator();
        boolean boolean74 = inputId1.equals((java.lang.Object) strSet72);
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertNotNull(functionType7);
        org.junit.Assert.assertNotNull(jSTypeArray12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jSTypeArray19);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable22);
        org.junit.Assert.assertNull(jSType23);
        org.junit.Assert.assertNotNull(jSType24);
        org.junit.Assert.assertNotNull(ternaryValue25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(jSTypeArray31);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(jSTypeArray38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable41);
        org.junit.Assert.assertNull(jSType42);
        org.junit.Assert.assertNotNull(jSType43);
        org.junit.Assert.assertNotNull(ternaryValue44);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(jSType47);
        org.junit.Assert.assertNotNull(jSTypeArray52);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertNotNull(functionType61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(strComparableList67);
        org.junit.Assert.assertNotNull(strComparableItor68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertNotNull(functionTypeList71);
        org.junit.Assert.assertNotNull(strSet72);
        org.junit.Assert.assertNotNull(strSpliterator73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00373");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, false);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry9.createFunctionType(jSType10, jSTypeArray11);
        boolean boolean13 = functionType12.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable14 = functionType12.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType15 = functionType12.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType16 = functionType12.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = functionType5.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType12);
        boolean boolean18 = functionType12.isNumberObjectType();
        boolean boolean19 = functionType12.isReturnTypeInferred();
        com.google.javascript.rhino.jstype.JSType jSType20 = functionType12.getParameterType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = jSType20.matchesStringContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(jSType20);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00374");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        boolean boolean12 = node3.isFromExterns();
        com.google.javascript.rhino.Node node13 = node3.getParent();
        boolean boolean14 = node3.isQualifiedName();
        boolean boolean15 = node3.isComma();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00375");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry7.createFunctionType(jSType8, jSTypeArray9);
        boolean boolean11 = functionType10.isNominalType();
        boolean boolean12 = jSTypeRegistry2.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node21.setString("");
        com.google.javascript.rhino.Node node24 = node17.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean25 = node17.isGetElem();
        com.google.javascript.rhino.Node node26 = node17.cloneNode();
        boolean boolean27 = node26.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = node26.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, false);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = functionType37.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry31.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = functionType37.getJSDocInfo();
        boolean boolean43 = functionType37.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType44 = jSTypeRegistry2.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node26, (com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.jstype.EnumType enumType45 = enumType44.toMaybeEnumType();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, false);
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray50 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType51 = jSTypeRegistry48.createFunctionType(jSType49, jSTypeArray50);
        boolean boolean52 = functionType51.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable53 = functionType51.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType55 = functionType51.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter57 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter57, false);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray61 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType62 = jSTypeRegistry59.createFunctionType(jSType60, jSTypeArray61);
        boolean boolean63 = functionType62.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable64 = functionType62.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType65 = functionType62.unboxesTo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo66 = new com.google.javascript.rhino.JSDocInfo();
        functionType62.setJSDocInfo(jSDocInfo66);
        com.google.javascript.rhino.jstype.JSType jSType68 = functionType51.resolve(errorReporter56, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType62);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue69 = enumType44.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType51);
        com.google.javascript.rhino.JSDocInfo jSDocInfo71 = functionType51.getOwnPropertyJSDocInfo("function (): {308555690}");
        boolean boolean72 = functionType51.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType73 = functionType51.toObjectType();
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(staticSourceFile28);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertNull(jSDocInfo39);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertNull(jSDocInfo41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(enumType44);
        org.junit.Assert.assertNotNull(enumType45);
        org.junit.Assert.assertNotNull(jSTypeArray50);
        org.junit.Assert.assertNotNull(functionType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable53);
        org.junit.Assert.assertNotNull(jSType55);
        org.junit.Assert.assertNotNull(jSTypeArray61);
        org.junit.Assert.assertNotNull(functionType62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable64);
        org.junit.Assert.assertNull(jSType65);
        org.junit.Assert.assertNotNull(jSType68);
        org.junit.Assert.assertNotNull(ternaryValue69);
        org.junit.Assert.assertNull(jSDocInfo71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(objectType73);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00376");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable7 = functionType5.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType8 = functionType5.unboxesTo();
        boolean boolean10 = functionType5.removeProperty("");
        int int11 = functionType5.getMaxArguments();
        java.lang.String str12 = functionType5.toDebugHashCodeString();
        com.google.javascript.rhino.Node node14 = functionType5.getPropertyNode("JSDocInfo");
        boolean boolean15 = functionType5.isOrdinaryFunction();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "function (): {78785902}" + "'", str12, "function (): {78785902}");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00377");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        com.google.javascript.rhino.Node node12 = node3.cloneNode();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node20.setString("");
        com.google.javascript.rhino.Node node23 = node16.useSourceInfoIfMissingFromForTree(node20);
        boolean boolean24 = node16.isGetElem();
        int int26 = node16.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newExpr(node16);
        com.google.javascript.rhino.Node node28 = node3.clonePropsFrom(node16);
        boolean boolean29 = node28.isNot();
        boolean boolean30 = node28.isDelProp();
        boolean boolean31 = node28.isNumber();
        com.google.javascript.rhino.InputId inputId32 = node28.getInputId();
        boolean boolean33 = node28.isGetterDef();
        boolean boolean34 = node28.isTypeOf();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(inputId32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00378");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node11.setString("");
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node11);
        node11.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry19.createFunctionType(jSType20, jSTypeArray21);
        boolean boolean23 = functionType22.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry2.createObjectType("hi!", node11, (com.google.javascript.rhino.jstype.ObjectType) functionType22);
        boolean boolean25 = functionType22.isNoObjectType();
        boolean boolean26 = functionType22.isUnionType();
        boolean boolean28 = functionType22.isPropertyTypeInferred("[, hi!, STRING hi!, STRING hi!]");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot30 = functionType22.getSlot("PARAM_LIST");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot30);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00379");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        com.google.javascript.rhino.Node node12 = node3.cloneNode();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node20.setString("");
        com.google.javascript.rhino.Node node23 = node16.useSourceInfoIfMissingFromForTree(node20);
        boolean boolean24 = node16.isGetElem();
        int int26 = node16.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newExpr(node16);
        com.google.javascript.rhino.Node node28 = node3.clonePropsFrom(node16);
        boolean boolean29 = node28.isReturn();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node37.setString("");
        com.google.javascript.rhino.Node node40 = node33.useSourceInfoIfMissingFromForTree(node37);
        boolean boolean41 = node33.isGetElem();
        int int43 = node33.getIntProp((int) (byte) -1);
        boolean boolean44 = node33.isLabel();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression46 = new com.google.javascript.rhino.JSTypeExpression(node33, "STRING hi!");
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node54.setString("");
        com.google.javascript.rhino.Node node57 = node50.useSourceInfoIfMissingFromForTree(node54);
        boolean boolean58 = node50.isGetElem();
        com.google.javascript.rhino.Node node59 = node50.cloneNode();
        boolean boolean60 = node59.isDebugger();
        node33.addChildToFront(node59);
        boolean boolean62 = node59.isFromExterns();
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node70.setString("");
        com.google.javascript.rhino.Node node73 = node66.useSourceInfoIfMissingFromForTree(node70);
        boolean boolean74 = node66.isGetElem();
        com.google.javascript.rhino.Node node75 = node66.cloneNode();
        boolean boolean76 = node75.isContinue();
        com.google.javascript.rhino.Node node77 = node75.cloneTree();
        // The following exception was thrown during execution in test generation
        try {
            node28.addChildrenAfter(node59, node77);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(node77);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00380");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node8.setString("");
        com.google.javascript.rhino.Node node11 = node4.useSourceInfoIfMissingFromForTree(node8);
        boolean boolean12 = node4.isGetElem();
        int int14 = node4.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newExpr(node4);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node23.setString("");
        com.google.javascript.rhino.Node node26 = node19.useSourceInfoIfMissingFromForTree(node23);
        boolean boolean27 = node19.isGetElem();
        com.google.javascript.rhino.Node node28 = node19.cloneNode();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node36.setString("");
        com.google.javascript.rhino.Node node39 = node32.useSourceInfoIfMissingFromForTree(node36);
        boolean boolean40 = node32.isGetElem();
        int int42 = node32.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newExpr(node32);
        com.google.javascript.rhino.Node node44 = node19.clonePropsFrom(node32);
        boolean boolean45 = node19.isGetElem();
        com.google.javascript.rhino.Node node46 = node15.useSourceInfoFrom(node19);
        com.google.javascript.rhino.Node node47 = node46.removeFirstChild();
        boolean boolean48 = node46.isCase();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(51, node46);
        boolean boolean50 = node49.isCall();
        // The following exception was thrown during execution in test generation
        try {
            node49.setDouble((double) 49);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: IN is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00381");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList11 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableList11.iterator();
        boolean boolean13 = functionType5.equals((java.lang.Object) strComparableItor12);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14, false);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray18 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType19 = jSTypeRegistry16.createFunctionType(jSType17, jSTypeArray18);
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = functionType19.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType.TypePair typePair22 = functionType5.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) functionType19);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, false);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = jSTypeRegistry25.createAnonymousObjectType();
        jSTypeRegistry25.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, false);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry30.createFunctionType(jSType31, jSTypeArray32);
        boolean boolean34 = functionType33.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable35 = functionType33.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType36 = functionType33.unboxesTo();
        com.google.javascript.rhino.jstype.ObjectType.Property property38 = functionType33.getSlot("unknown");
        com.google.javascript.rhino.jstype.JSType jSType39 = jSTypeRegistry25.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) functionType33);
        boolean boolean40 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) functionType5, jSType39);
        com.google.javascript.rhino.jstype.FunctionType functionType42 = functionType5.getBindReturnType((int) '4');
        boolean boolean43 = functionType5.isGlobalThisType();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableList11);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSTypeArray18);
        org.junit.Assert.assertNotNull(functionType19);
        org.junit.Assert.assertNull(jSDocInfo21);
        org.junit.Assert.assertNotNull(typePair22);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable35);
        org.junit.Assert.assertNull(jSType36);
        org.junit.Assert.assertNull(property38);
        org.junit.Assert.assertNotNull(jSType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00382");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList4 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList9 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        boolean boolean10 = strComparableList4.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, false);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType16 = jSTypeRegistry13.createFunctionType(jSType14, jSTypeArray15);
        boolean boolean17 = functionType16.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, false);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray22 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry20.createFunctionType(jSType21, jSTypeArray22);
        boolean boolean24 = functionType23.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable25 = functionType23.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType26 = functionType23.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType27 = functionType23.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue28 = functionType16.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType23);
        com.google.javascript.rhino.Node node29 = functionType16.getSource();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, false);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray34 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType35 = jSTypeRegistry32.createFunctionType(jSType33, jSTypeArray34);
        boolean boolean36 = functionType35.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList41 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor42 = strComparableList41.iterator();
        boolean boolean43 = functionType35.equals((java.lang.Object) strComparableItor42);
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, false);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry47.createFunctionType(jSType48, jSTypeArray49);
        boolean boolean51 = functionType50.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = functionType50.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node53 = null;
        boolean boolean54 = functionType35.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType50, node53);
        boolean boolean56 = functionType50.removeProperty("Not declared as a type name");
        boolean boolean57 = functionType16.hasEqualCallType(functionType50);
        boolean boolean58 = strComparableList9.equals((java.lang.Object) functionType16);
        boolean boolean59 = functionType16.isNativeObjectType();
        java.util.Set<java.lang.String> strSet60 = functionType16.getOwnPropertyNames();
        boolean boolean61 = functionType16.canBeCalled();
        org.junit.Assert.assertNotNull(strComparableList4);
        org.junit.Assert.assertNotNull(strComparableList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jSTypeArray22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable25);
        org.junit.Assert.assertNull(jSType26);
        org.junit.Assert.assertNotNull(jSType27);
        org.junit.Assert.assertNotNull(ternaryValue28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(jSTypeArray34);
        org.junit.Assert.assertNotNull(functionType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strComparableList41);
        org.junit.Assert.assertNotNull(strComparableItor42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(strSet60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00383");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node11.setString("");
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node11);
        node11.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry19.createFunctionType(jSType20, jSTypeArray21);
        boolean boolean23 = functionType22.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry2.createObjectType("hi!", node11, (com.google.javascript.rhino.jstype.ObjectType) functionType22);
        boolean boolean25 = functionType22.isNoObjectType();
        boolean boolean26 = functionType22.isNoObjectType();
        boolean boolean27 = functionType22.isInterface();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00384");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        jSDocInfo0.setVisibility(visibility2);
        boolean boolean4 = jSDocInfo0.isDefine();
        int int5 = jSDocInfo0.getImplementedInterfaceCount();
        java.util.Set<java.lang.String> strSet6 = jSDocInfo0.getSuppressions();
        int int7 = strSet6.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00385");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList11 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableList11.iterator();
        boolean boolean13 = functionType5.equals((java.lang.Object) strComparableItor12);
        com.google.javascript.rhino.Node node14 = functionType5.getSource();
        boolean boolean16 = functionType5.isPropertyTypeInferred("Not declared as a type name");
        com.google.javascript.rhino.jstype.JSType jSType17 = functionType5.autoboxesTo();
        boolean boolean18 = functionType5.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19, false);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, false);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry24.createFunctionType(jSType25, jSTypeArray26);
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = functionType27.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType30 = jSTypeRegistry21.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType27);
        boolean boolean31 = functionType27.isOrdinaryFunction();
        boolean boolean32 = functionType27.isFunctionPrototypeType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable33 = functionType27.getCtorExtendedInterfaces();
        functionType5.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType27);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType35 = functionType27.cloneWithoutArrowType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableList11);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jSTypeArray26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertNull(jSDocInfo29);
        org.junit.Assert.assertNotNull(jSType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable33);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00386");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList4 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableList4.iterator();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList6 = strComparableList4.reverse();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList7 = strComparableList6.reverse();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList6.add(100, (java.lang.Comparable<java.lang.String>) "([, hi!, STRING hi!, STRING hi!])");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableList4);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertNotNull(strComparableList6);
        org.junit.Assert.assertNotNull(strComparableList7);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00387");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        boolean boolean12 = node3.isFromExterns();
        node3.putIntProp((int) (byte) 100, 4);
        boolean boolean16 = node3.isDelProp();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry19.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, false);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry24.createFunctionType(jSType25, jSTypeArray26);
        boolean boolean28 = functionType27.isNominalType();
        boolean boolean29 = jSTypeRegistry19.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType27);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node38.setString("");
        com.google.javascript.rhino.Node node41 = node34.useSourceInfoIfMissingFromForTree(node38);
        boolean boolean42 = node34.isGetElem();
        com.google.javascript.rhino.Node node43 = node34.cloneNode();
        boolean boolean44 = node43.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile45 = node43.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, false);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49, false);
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray53 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType54 = jSTypeRegistry51.createFunctionType(jSType52, jSTypeArray53);
        com.google.javascript.rhino.JSDocInfo jSDocInfo56 = functionType54.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType57 = jSTypeRegistry48.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType54);
        com.google.javascript.rhino.JSDocInfo jSDocInfo58 = functionType54.getJSDocInfo();
        boolean boolean60 = functionType54.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType61 = jSTypeRegistry19.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node43, (com.google.javascript.rhino.jstype.JSType) functionType54);
        boolean boolean62 = node43.isGetElem();
        node43.setWasEmptyNode(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node65 = node3.removeChildAfter(node43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(jSTypeArray26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(staticSourceFile45);
        org.junit.Assert.assertNotNull(jSTypeArray53);
        org.junit.Assert.assertNotNull(functionType54);
        org.junit.Assert.assertNull(jSDocInfo56);
        org.junit.Assert.assertNotNull(jSType57);
        org.junit.Assert.assertNull(jSDocInfo58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(enumType61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00388");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = ternaryValue0.not();
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2, false);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType7 = jSTypeRegistry4.createFunctionType(jSType5, jSTypeArray6);
        boolean boolean8 = functionType7.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, false);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry11.createFunctionType(jSType12, jSTypeArray13);
        boolean boolean15 = functionType14.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable16 = functionType14.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType17 = functionType14.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType18 = functionType14.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue19 = functionType7.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType14);
        boolean boolean20 = functionType14.isObject();
        boolean boolean21 = functionType14.isFunctionPrototypeType();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, false);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry24.createFunctionType(jSType25, jSTypeArray26);
        boolean boolean28 = functionType27.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable29 = functionType27.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType30 = functionType27.unboxesTo();
        boolean boolean32 = functionType27.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType33 = functionType27.getImplicitPrototype();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue34 = functionType14.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType27);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue35 = ternaryValue0.or(ternaryValue34);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue36 = null;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue37 = ternaryValue35.and(ternaryValue36);
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertNotNull(functionType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNotNull(jSType18);
        org.junit.Assert.assertNotNull(ternaryValue19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeArray26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable29);
        org.junit.Assert.assertNull(jSType30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objectType33);
        org.junit.Assert.assertNotNull(ternaryValue34);
        org.junit.Assert.assertNotNull(ternaryValue35);
        org.junit.Assert.assertNull(ternaryValue37);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00389");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList4 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableList4.iterator();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList6 = strComparableList4.reverse();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableList6.iterator();
        int int8 = strComparableList6.size();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList6.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "function (): {1534343319}");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableList4);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertNotNull(strComparableList6);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00390");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node((-1), nodeArray1);
        int int3 = node2.getSourceOffset();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node11.setString("");
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node11);
        node11.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node24.setString("");
        com.google.javascript.rhino.Node node27 = node20.useSourceInfoIfMissingFromForTree(node24);
        boolean boolean28 = node20.isGetElem();
        int int30 = node20.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newExpr(node20);
        com.google.javascript.rhino.Node node32 = node11.srcrefTree(node31);
        node2.addChildToBack(node32);
        boolean boolean34 = node32.isIf();
        boolean boolean35 = node32.isVoid();
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00391");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry7.createFunctionType(jSType8, jSTypeArray9);
        boolean boolean11 = functionType10.isNominalType();
        boolean boolean12 = jSTypeRegistry2.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node21.setString("");
        com.google.javascript.rhino.Node node24 = node17.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean25 = node17.isGetElem();
        com.google.javascript.rhino.Node node26 = node17.cloneNode();
        boolean boolean27 = node26.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = node26.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, false);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = functionType37.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry31.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = functionType37.getJSDocInfo();
        boolean boolean43 = functionType37.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType44 = jSTypeRegistry2.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node26, (com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.Node node45 = enumType44.getSource();
        java.lang.String str46 = enumType44.toString();
        com.google.javascript.rhino.jstype.JSType jSType48 = enumType44.getPropertyType("function (): {308555690}");
        boolean boolean49 = jSType48.isEnumType();
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(staticSourceFile28);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertNull(jSDocInfo39);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertNull(jSDocInfo41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(enumType44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "enum{Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n}" + "'", str46, "enum{Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n}");
        org.junit.Assert.assertNotNull(jSType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00392");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry7.createFunctionType(jSType8, jSTypeArray9);
        boolean boolean11 = functionType10.isNominalType();
        boolean boolean12 = jSTypeRegistry2.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node21.setString("");
        com.google.javascript.rhino.Node node24 = node17.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean25 = node17.isGetElem();
        com.google.javascript.rhino.Node node26 = node17.cloneNode();
        boolean boolean27 = node26.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = node26.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, false);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = functionType37.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry31.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = functionType37.getJSDocInfo();
        boolean boolean43 = functionType37.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType44 = jSTypeRegistry2.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node26, (com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.jstype.EnumType enumType45 = enumType44.toMaybeEnumType();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, false);
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray50 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType51 = jSTypeRegistry48.createFunctionType(jSType49, jSTypeArray50);
        boolean boolean52 = functionType51.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable53 = functionType51.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType55 = functionType51.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter57 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter57, false);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray61 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType62 = jSTypeRegistry59.createFunctionType(jSType60, jSTypeArray61);
        boolean boolean63 = functionType62.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable64 = functionType62.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType65 = functionType62.unboxesTo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo66 = new com.google.javascript.rhino.JSDocInfo();
        functionType62.setJSDocInfo(jSDocInfo66);
        com.google.javascript.rhino.jstype.JSType jSType68 = functionType51.resolve(errorReporter56, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType62);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue69 = enumType44.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType51);
        com.google.javascript.rhino.jstype.ObjectType.Property property71 = enumType44.getSlot("");
        java.lang.Iterable iterable72 = enumType44.getCtorImplementedInterfaces();
        boolean boolean73 = enumType44.matchesNumberContext();
        boolean boolean74 = enumType44.isNativeObjectType();
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(staticSourceFile28);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertNull(jSDocInfo39);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertNull(jSDocInfo41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(enumType44);
        org.junit.Assert.assertNotNull(enumType45);
        org.junit.Assert.assertNotNull(jSTypeArray50);
        org.junit.Assert.assertNotNull(functionType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable53);
        org.junit.Assert.assertNotNull(jSType55);
        org.junit.Assert.assertNotNull(jSTypeArray61);
        org.junit.Assert.assertNotNull(functionType62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable64);
        org.junit.Assert.assertNull(jSType65);
        org.junit.Assert.assertNotNull(jSType68);
        org.junit.Assert.assertNotNull(ternaryValue69);
        org.junit.Assert.assertNull(property71);
        org.junit.Assert.assertNotNull(iterable72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00393");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, false);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry5.createFunctionType(jSType6, jSTypeArray7);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = functionType8.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType11 = jSTypeRegistry2.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType8);
        com.google.javascript.rhino.jstype.JSType jSType12 = functionType8.autobox();
        java.util.List<com.google.javascript.rhino.jstype.ObjectType> objectTypeList13 = null;
        // The following exception was thrown during execution in test generation
        try {
            functionType8.setExtendedInterfaces(objectTypeList13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertNotNull(functionType8);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNotNull(jSType11);
        org.junit.Assert.assertNotNull(jSType12);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00394");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node18.setString("");
        com.google.javascript.rhino.Node node21 = node14.useSourceInfoIfMissingFromForTree(node18);
        node18.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node31.setString("");
        com.google.javascript.rhino.Node node34 = node27.useSourceInfoIfMissingFromForTree(node31);
        boolean boolean35 = node27.isGetElem();
        int int37 = node27.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newExpr(node27);
        com.google.javascript.rhino.Node node39 = node18.srcrefTree(node38);
        java.lang.String str40 = node10.checkTreeEquals(node38);
        boolean boolean41 = node38.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node49.setString("");
        com.google.javascript.rhino.Node node52 = node45.useSourceInfoIfMissingFromForTree(node49);
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node60.setString("");
        com.google.javascript.rhino.Node node63 = node56.useSourceInfoIfMissingFromForTree(node60);
        node60.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node73.setString("");
        com.google.javascript.rhino.Node node76 = node69.useSourceInfoIfMissingFromForTree(node73);
        boolean boolean77 = node69.isGetElem();
        int int79 = node69.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node80 = com.google.javascript.jscomp.NodeUtil.newExpr(node69);
        com.google.javascript.rhino.Node node81 = node60.srcrefTree(node80);
        java.lang.String str82 = node52.checkTreeEquals(node80);
        com.google.javascript.rhino.Node node83 = node38.useSourceInfoFrom(node80);
        boolean boolean84 = node80.isFromExterns();
        boolean boolean85 = node80.isQuotedString();
        com.google.javascript.rhino.JSDocInfo jSDocInfo86 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean87 = jSDocInfo86.hasReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility88 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        jSDocInfo86.setVisibility(visibility88);
        java.util.Set<java.lang.String> strSet90 = jSDocInfo86.getParameterNames();
        int int91 = strSet90.size();
        node80.setDirectives(strSet90);
        java.util.Collection<java.lang.Comparable<java.lang.String>> strComparableCollection93 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean94 = strSet90.retainAll(strComparableCollection93);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n" + "'", str40, "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n" + "'", str82, "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n");
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + visibility88 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility88.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
        org.junit.Assert.assertNotNull(strSet90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00395");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        int int4 = node3.getLineno();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = new com.google.javascript.rhino.JSTypeExpression(node3, "unknown");
        boolean boolean7 = jSTypeExpression6.isOptionalArg();
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, false);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray12 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry10.createFunctionType(jSType11, jSTypeArray12);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14, false);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray18 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType19 = jSTypeRegistry16.createFunctionType(jSType17, jSTypeArray18);
        boolean boolean20 = functionType19.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, false);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry23.createFunctionType(jSType24, jSTypeArray25);
        boolean boolean27 = functionType26.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable28 = functionType26.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType26.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType30 = functionType26.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue31 = functionType19.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType26);
        boolean boolean32 = functionType26.isObject();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, false);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray37 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry35.createFunctionType(jSType36, jSTypeArray37);
        boolean boolean39 = functionType38.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, false);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray44 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSTypeRegistry42.createFunctionType(jSType43, jSTypeArray44);
        boolean boolean46 = functionType45.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable47 = functionType45.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType48 = functionType45.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType49 = functionType45.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue50 = functionType38.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType45);
        com.google.javascript.rhino.Node node51 = functionType38.getSource();
        com.google.javascript.rhino.jstype.JSType jSType53 = functionType38.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, false);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType59 = jSTypeRegistry56.createFunctionType(jSType57, jSTypeArray58);
        boolean boolean60 = functionType59.isNominalType();
        int int61 = functionType59.getPropertiesCount();
        com.google.javascript.rhino.ErrorReporter errorReporter62 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter62, false);
        com.google.javascript.rhino.jstype.JSType jSType65 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray66 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType67 = jSTypeRegistry64.createFunctionType(jSType65, jSTypeArray66);
        boolean boolean68 = functionType67.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList73 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor74 = strComparableList73.iterator();
        boolean boolean75 = functionType67.equals((java.lang.Object) strComparableItor74);
        com.google.javascript.rhino.Node node76 = functionType67.getSource();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.FunctionType> functionTypeList77 = com.google.common.collect.ImmutableList.of(functionType13, functionType26, functionType38, functionType59, functionType67);
        boolean boolean78 = functionType38.isFunctionType();
        boolean boolean79 = functionType38.canBeCalled();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry80 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType81 = jSTypeExpression6.evaluate((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType38, jSTypeRegistry80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSTypeArray12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertNotNull(jSTypeArray18);
        org.junit.Assert.assertNotNull(functionType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable28);
        org.junit.Assert.assertNull(jSType29);
        org.junit.Assert.assertNotNull(jSType30);
        org.junit.Assert.assertNotNull(ternaryValue31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(jSTypeArray37);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jSTypeArray44);
        org.junit.Assert.assertNotNull(functionType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable47);
        org.junit.Assert.assertNull(jSType48);
        org.junit.Assert.assertNotNull(jSType49);
        org.junit.Assert.assertNotNull(ternaryValue50);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNotNull(jSType53);
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertNotNull(functionType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(jSTypeArray66);
        org.junit.Assert.assertNotNull(functionType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(strComparableList73);
        org.junit.Assert.assertNotNull(strComparableItor74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNull(node76);
        org.junit.Assert.assertNotNull(functionTypeList77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00396");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2, false);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType7 = jSTypeRegistry4.createFunctionType(jSType5, jSTypeArray6);
        boolean boolean8 = functionType7.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable9 = functionType7.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType7.unboxesTo();
        boolean boolean12 = functionType7.removeProperty("");
        int int13 = functionType7.getMaxArguments();
        java.lang.String str14 = functionType7.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, false);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray19 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry17.createFunctionType(jSType18, jSTypeArray19);
        boolean boolean21 = functionType20.isNominalType();
        functionType7.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType20);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, false);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType28 = jSTypeRegistry25.createFunctionType(jSType26, jSTypeArray27);
        boolean boolean29 = functionType28.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable30 = functionType28.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType31 = functionType28.unboxesTo();
        boolean boolean33 = functionType28.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType34 = functionType28.getImplicitPrototype();
        functionType7.setPrototypeBasedOn(objectType34);
        boolean boolean37 = jSTypeRegistry1.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) functionType7, "hi!");
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node46.setString("");
        com.google.javascript.rhino.Node node49 = node42.useSourceInfoIfMissingFromForTree(node46);
        boolean boolean50 = node42.isGetElem();
        com.google.javascript.rhino.Node node51 = node42.cloneNode();
        boolean boolean52 = node51.isDebugger();
        boolean boolean53 = node51.isArrayLit();
        boolean boolean54 = node51.isReturn();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, false);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray59 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry57.createFunctionType(jSType58, jSTypeArray59);
        boolean boolean61 = functionType60.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList66 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor67 = strComparableList66.iterator();
        boolean boolean68 = functionType60.equals((java.lang.Object) strComparableItor67);
        com.google.javascript.rhino.ErrorReporter errorReporter69 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter69, false);
        com.google.javascript.rhino.jstype.JSType jSType72 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray73 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType74 = jSTypeRegistry71.createFunctionType(jSType72, jSTypeArray73);
        boolean boolean75 = functionType74.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable76 = functionType74.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType78 = functionType74.getRestrictedTypeGivenToBooleanOutcome(true);
        boolean boolean79 = jSType78.isNoType();
        boolean boolean80 = functionType60.canAssignTo(jSType78);
        boolean boolean81 = functionType60.hasReferenceName();
        com.google.javascript.rhino.jstype.ObjectType objectType82 = jSTypeRegistry1.createObjectType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node51, (com.google.javascript.rhino.jstype.ObjectType) functionType60);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative83 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType84 = jSTypeRegistry1.getNativeObjectType(jSTypeNative83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertNotNull(functionType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(jSTypeArray19);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(functionType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable30);
        org.junit.Assert.assertNull(jSType31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(jSTypeArray59);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(strComparableList66);
        org.junit.Assert.assertNotNull(strComparableItor67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(jSTypeArray73);
        org.junit.Assert.assertNotNull(functionType74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable76);
        org.junit.Assert.assertNotNull(jSType78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(objectType82);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00397");
        java.io.IOException iOException1 = new java.io.IOException("");
        java.io.IOException iOException3 = new java.io.IOException("");
        iOException1.addSuppressed((java.lang.Throwable) iOException3);
        java.io.IOException iOException6 = new java.io.IOException("");
        java.io.IOException iOException8 = new java.io.IOException("");
        iOException6.addSuppressed((java.lang.Throwable) iOException8);
        java.lang.Throwable[] throwableArray10 = iOException6.getSuppressed();
        java.io.IOException iOException11 = new java.io.IOException();
        java.io.IOException iOException13 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray14 = iOException13.getSuppressed();
        java.io.IOException iOException16 = new java.io.IOException("");
        java.io.IOException iOException18 = new java.io.IOException("");
        iOException16.addSuppressed((java.lang.Throwable) iOException18);
        java.lang.Throwable[] throwableArray20 = iOException16.getSuppressed();
        java.io.IOException iOException21 = new java.io.IOException();
        java.io.IOException iOException23 = new java.io.IOException("");
        java.io.IOException iOException25 = new java.io.IOException("");
        iOException23.addSuppressed((java.lang.Throwable) iOException25);
        java.lang.Throwable[] throwableArray27 = iOException23.getSuppressed();
        java.io.IOException iOException29 = new java.io.IOException("");
        java.io.IOException iOException31 = new java.io.IOException("");
        java.io.IOException iOException33 = new java.io.IOException("");
        iOException31.addSuppressed((java.lang.Throwable) iOException33);
        java.lang.Throwable[] throwableArray35 = iOException31.getSuppressed();
        java.io.IOException iOException37 = new java.io.IOException("");
        java.io.IOException iOException39 = new java.io.IOException("");
        iOException37.addSuppressed((java.lang.Throwable) iOException39);
        java.io.IOException iOException42 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray43 = iOException42.getSuppressed();
        java.io.IOException iOException44 = new java.io.IOException();
        java.io.IOException iOException45 = new java.io.IOException((java.lang.Throwable) iOException44);
        java.io.IOException iOException47 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray48 = iOException47.getSuppressed();
        java.io.IOException iOException49 = new java.io.IOException();
        java.io.IOException iOException50 = new java.io.IOException((java.lang.Throwable) iOException49);
        java.io.IOException iOException51 = new java.io.IOException();
        java.lang.Throwable[] throwableArray52 = new java.lang.Throwable[] { iOException47, iOException50, iOException51 };
        com.google.common.collect.ImmutableList<java.lang.Throwable> throwableList53 = com.google.common.collect.ImmutableList.of((java.lang.Throwable) iOException1, (java.lang.Throwable) iOException6, (java.lang.Throwable) iOException11, (java.lang.Throwable) iOException13, (java.lang.Throwable) iOException16, (java.lang.Throwable) iOException21, (java.lang.Throwable) iOException23, (java.lang.Throwable) iOException29, (java.lang.Throwable) iOException31, (java.lang.Throwable) iOException37, (java.lang.Throwable) iOException42, (java.lang.Throwable) iOException45, throwableArray52);
        java.lang.Throwable[] throwableArray54 = iOException23.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableList53);
        org.junit.Assert.assertNotNull(throwableArray54);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00398");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName("{proxy:function (): {1157916158}}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00399");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node11.setString("");
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node11);
        node11.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry19.createFunctionType(jSType20, jSTypeArray21);
        boolean boolean23 = functionType22.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry2.createObjectType("hi!", node11, (com.google.javascript.rhino.jstype.ObjectType) functionType22);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node26 = jSTypeRegistry2.createParametersWithVarArgs(jSTypeArray25);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, false);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry30.createFunctionType(jSType31, jSTypeArray32);
        boolean boolean34 = functionType33.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable35 = functionType33.getCtorImplementedInterfaces();
        jSTypeRegistry2.registerPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) functionType33);
        com.google.javascript.rhino.jstype.JSType jSType38 = jSTypeRegistry2.getType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n");
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, false);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray43 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry41.createFunctionType(jSType42, jSTypeArray43);
        boolean boolean45 = functionType44.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList50 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor51 = strComparableList50.iterator();
        boolean boolean52 = functionType44.equals((java.lang.Object) strComparableItor51);
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, false);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType59 = jSTypeRegistry56.createFunctionType(jSType57, jSTypeArray58);
        boolean boolean60 = functionType59.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable61 = functionType59.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node62 = null;
        boolean boolean63 = functionType44.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType59, node62);
        java.util.Set<java.lang.String> strSet64 = functionType44.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.ObjectType objectType65 = functionType44.getParentScope();
        com.google.javascript.rhino.Node node67 = functionType44.getPropertyNode("");
        com.google.javascript.rhino.ErrorReporter errorReporter68 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter68, false);
        com.google.javascript.rhino.jstype.JSType jSType71 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray72 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType73 = jSTypeRegistry70.createFunctionType(jSType71, jSTypeArray72);
        boolean boolean74 = functionType73.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter75 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter75, false);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray79 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType80 = jSTypeRegistry77.createFunctionType(jSType78, jSTypeArray79);
        boolean boolean81 = functionType80.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable82 = functionType80.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType83 = functionType80.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType84 = functionType80.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue85 = functionType73.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType80);
        boolean boolean86 = functionType80.isNumberObjectType();
        boolean boolean87 = functionType80.isReturnTypeInferred();
        com.google.javascript.rhino.jstype.JSType jSType88 = functionType80.getParameterType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType89 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType44, jSType88);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean90 = jSType88.matchesInt32Context();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable35);
        org.junit.Assert.assertNull(jSType38);
        org.junit.Assert.assertNotNull(jSTypeArray43);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strComparableList50);
        org.junit.Assert.assertNotNull(strComparableItor51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertNotNull(functionType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertNotNull(objectType65);
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertNotNull(jSTypeArray72);
        org.junit.Assert.assertNotNull(functionType73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(jSTypeArray79);
        org.junit.Assert.assertNotNull(functionType80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable82);
        org.junit.Assert.assertNull(jSType83);
        org.junit.Assert.assertNotNull(jSType84);
        org.junit.Assert.assertNotNull(ternaryValue85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNull(jSType88);
        org.junit.Assert.assertNotNull(parameterizedType89);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00400");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList15 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList20 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        boolean boolean21 = strComparableList15.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList20);
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags22 = new com.google.javascript.rhino.Node.SideEffectFlags();
        int int23 = strComparableList15.lastIndexOf((java.lang.Object) sideEffectFlags22);
        sideEffectFlags22.setMutatesArguments();
        sideEffectFlags22.setAllFlags();
        // The following exception was thrown during execution in test generation
        try {
            node10.setSideEffectFlags(sideEffectFlags22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got STRING");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(strComparableList15);
        org.junit.Assert.assertNotNull(strComparableList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }
}

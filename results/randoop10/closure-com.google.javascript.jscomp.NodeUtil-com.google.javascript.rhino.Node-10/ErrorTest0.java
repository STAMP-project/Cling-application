import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(48, nodeArray1, (int) (short) 0, (int) ' ');
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable5 = node4.siblings();
        boolean boolean6 = node4.isAdd();
        com.google.javascript.rhino.Node[] nodeArray9 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(48, nodeArray9, (int) (short) 0, (int) ' ');
        node12.setLength((int) (byte) 10);
        boolean boolean15 = node12.isLabelName();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(1, node12, 45, (int) (short) -1);
        com.google.javascript.rhino.Node[] nodeArray20 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(48, nodeArray20, (int) (short) 0, (int) ' ');
        node23.setLength((int) (byte) 10);
        node23.setType((int) ' ');
        com.google.javascript.rhino.Node node28 = node23.cloneNode();
        boolean boolean29 = node28.isGetElem();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.replaceChild(node18, node28);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) ' ', "");
        java.lang.String str3 = com.google.javascript.jscomp.NodeUtil.getSourceName(node2);
        com.google.javascript.rhino.Node[] nodeArray5 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(48, nodeArray5, (int) (short) 0, (int) ' ');
        java.lang.String str9 = node8.getQualifiedName();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray15 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(48, nodeArray15, (int) (short) 0, (int) ' ');
        java.lang.String str19 = node18.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind20 = new com.google.javascript.jscomp.CodingConvention.Bind(node8, node13, node18);
        com.google.javascript.rhino.Node[] nodeArray22 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(48, nodeArray22, (int) (short) 0, (int) ' ');
        node25.setLength((int) (byte) 10);
        boolean boolean28 = node25.isGetProp();
        node13.addChildrenToBack(node25);
        boolean boolean30 = node25.isThis();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.removeChild(node25);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) ' ', "");
        com.google.javascript.rhino.Node node3 = node2.getLastSibling();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) ' ', "");
        com.google.javascript.rhino.Node node7 = node6.getLastSibling();
        com.google.javascript.rhino.Node node8 = node2.useSourceInfoIfMissingFrom(node7);
        boolean boolean9 = node8.wasEmptyNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node11 = node8.getChildAtIndex(4095);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        boolean boolean4 = node3.isString();
        com.google.javascript.rhino.Node node5 = node3.getLastSibling();
        boolean boolean6 = node3.isIf();
        node3.setVarArgs(true);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 4, (int) '4', 47);
        com.google.javascript.rhino.Node node13 = node12.getLastSibling();
        boolean boolean14 = node12.isTrue();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 4, (int) '4', 47);
        com.google.javascript.rhino.Node node19 = node18.cloneTree();
        boolean boolean20 = node12.isEquivalentTo(node19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node21 = node3.getChildBefore(node12);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(48, nodeArray1, (int) (short) 0, (int) ' ');
        java.lang.String str5 = node4.getQualifiedName();
        boolean boolean6 = node4.isIf();
        boolean boolean7 = node4.isFromExterns();
        node4.detachChildren();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node10 = node4.getChildAtIndex(36);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(48, nodeArray1, (int) (short) 0, (int) ' ');
        java.lang.String str5 = node4.getQualifiedName();
        boolean boolean6 = node4.isIf();
        boolean boolean7 = node4.isFromExterns();
        boolean boolean8 = node4.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 4, (int) '4', 47);
        com.google.javascript.rhino.Node node13 = node12.getLastSibling();
        boolean boolean14 = node12.isTrue();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 4, (int) '4', 47);
        com.google.javascript.rhino.Node node19 = node18.cloneTree();
        boolean boolean20 = node12.isEquivalentTo(node19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.removeChild(node19);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        boolean boolean4 = jSTypeRegistry2.hasNamespace("");
        com.google.javascript.rhino.ErrorReporter errorReporter5 = jSTypeRegistry2.getErrorReporter();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList9 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList9, jSTypeArray8);
        com.google.javascript.rhino.Node node11 = jSTypeRegistry7.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList9);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList16 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList16, jSTypeArray15);
        com.google.javascript.rhino.Node node18 = jSTypeRegistry14.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList16);
        com.google.javascript.rhino.jstype.FunctionType functionType19 = jSTypeRegistry7.createFunctionType(jSType12, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList16);
        boolean boolean20 = functionType19.isNativeObjectType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<java.lang.String> strCollection23 = jSDocInfo22.getAuthors();
        boolean boolean24 = jSDocInfo22.hasBaseType();
        functionType19.setPropertyJSDocInfo("Unknown class name", jSDocInfo22);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = functionType19.getParentScope();
        com.google.javascript.rhino.jstype.ObjectType objectType27 = functionType19.getParentScope();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray31 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList32 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList32, jSTypeArray31);
        com.google.javascript.rhino.Node node34 = jSTypeRegistry30.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList32);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList39 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList39, jSTypeArray38);
        com.google.javascript.rhino.Node node41 = jSTypeRegistry37.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList39);
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry30.createFunctionType(jSType35, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList39);
        boolean boolean43 = functionType42.isNativeObjectType();
        boolean boolean44 = functionType42.hasImplementedInterfaces();
        com.google.javascript.rhino.JSDocInfo jSDocInfo46 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<java.lang.String> strCollection47 = jSDocInfo46.getAuthors();
        boolean boolean48 = jSDocInfo46.hasBaseType();
        boolean boolean49 = jSDocInfo46.isDeprecated();
        functionType42.setPropertyJSDocInfo("hi!", jSDocInfo46);
        com.google.javascript.rhino.Node[] nodeArray52 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node(48, nodeArray52, (int) (short) 0, (int) ' ');
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        node58.setJSType(jSType59);
        com.google.javascript.rhino.Node node61 = node55.useSourceInfoIfMissingFrom(node58);
        boolean boolean62 = functionType19.defineSynthesizedProperty("JSDocInfo", (com.google.javascript.rhino.jstype.JSType) functionType42, node61);
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray65 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList66 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList66, jSTypeArray65);
        com.google.javascript.rhino.Node node68 = jSTypeRegistry64.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList66);
        com.google.javascript.rhino.jstype.JSType jSType69 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray72 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList73 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList73, jSTypeArray72);
        com.google.javascript.rhino.Node node75 = jSTypeRegistry71.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList73);
        com.google.javascript.rhino.jstype.FunctionType functionType76 = jSTypeRegistry64.createFunctionType(jSType69, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList73);
        boolean boolean77 = functionType76.isNativeObjectType();
        boolean boolean78 = functionType76.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType79 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType19, (com.google.javascript.rhino.jstype.JSType) functionType76);
        int int80 = functionType76.getExtendedInterfacesCount();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType19 and parameterizedType79.", functionType19.equals(parameterizedType79) == parameterizedType79.equals(functionType19));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(48, nodeArray1, (int) (short) 0, (int) ' ');
        java.lang.String str5 = node4.getQualifiedName();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray11 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(48, nodeArray11, (int) (short) 0, (int) ' ');
        java.lang.String str15 = node14.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind16 = new com.google.javascript.jscomp.CodingConvention.Bind(node4, node9, node14);
        boolean boolean17 = node4.isRegExp();
        boolean boolean18 = node4.isNoSideEffectsCall();
        com.google.javascript.rhino.Node[] nodeArray20 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(48, nodeArray20, (int) (short) 0, (int) ' ');
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable24 = node23.siblings();
        boolean boolean25 = node23.isAdd();
        boolean boolean26 = node23.isNoSideEffectsCall();
        boolean boolean27 = node23.isObjectLit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.removeChild(node23);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(48, nodeArray1, (int) (short) 0, (int) ' ');
        node4.setLength((int) (byte) 10);
        boolean boolean7 = node4.isFor();
        com.google.javascript.rhino.Node[] nodeArray9 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(48, nodeArray9, (int) (short) 0, (int) ' ');
        node12.setLength((int) (byte) 10);
        com.google.javascript.rhino.Node[] nodeArray16 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node(48, nodeArray16, (int) (short) 0, (int) ' ');
        java.lang.String str20 = node19.getQualifiedName();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray26 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(48, nodeArray26, (int) (short) 0, (int) ' ');
        java.lang.String str30 = node29.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind31 = new com.google.javascript.jscomp.CodingConvention.Bind(node19, node24, node29);
        com.google.javascript.rhino.Node node32 = node12.useSourceInfoFromForTree(node24);
        node4.addChildrenToBack(node12);
        boolean boolean34 = node12.isIf();
        com.google.javascript.rhino.Node[] nodeArray36 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(48, nodeArray36, (int) (short) 0, (int) ' ');
        node39.setLength((int) (byte) 10);
        node39.setType((int) ' ');
        com.google.javascript.rhino.Node node44 = node39.cloneNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node12.removeChild(node39);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        boolean boolean4 = jSTypeRegistry2.hasNamespace("");
        com.google.javascript.rhino.ErrorReporter errorReporter5 = jSTypeRegistry2.getErrorReporter();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList9 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList9, jSTypeArray8);
        com.google.javascript.rhino.Node node11 = jSTypeRegistry7.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList9);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList16 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList16, jSTypeArray15);
        com.google.javascript.rhino.Node node18 = jSTypeRegistry14.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList16);
        com.google.javascript.rhino.jstype.FunctionType functionType19 = jSTypeRegistry7.createFunctionType(jSType12, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList16);
        boolean boolean20 = functionType19.isNativeObjectType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<java.lang.String> strCollection23 = jSDocInfo22.getAuthors();
        boolean boolean24 = jSDocInfo22.hasBaseType();
        functionType19.setPropertyJSDocInfo("Unknown class name", jSDocInfo22);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = functionType19.getParentScope();
        com.google.javascript.rhino.jstype.ObjectType objectType27 = functionType19.getParentScope();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray31 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList32 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList32, jSTypeArray31);
        com.google.javascript.rhino.Node node34 = jSTypeRegistry30.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList32);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList39 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList39, jSTypeArray38);
        com.google.javascript.rhino.Node node41 = jSTypeRegistry37.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList39);
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry30.createFunctionType(jSType35, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList39);
        boolean boolean43 = functionType42.isNativeObjectType();
        boolean boolean44 = functionType42.hasImplementedInterfaces();
        com.google.javascript.rhino.JSDocInfo jSDocInfo46 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<java.lang.String> strCollection47 = jSDocInfo46.getAuthors();
        boolean boolean48 = jSDocInfo46.hasBaseType();
        boolean boolean49 = jSDocInfo46.isDeprecated();
        functionType42.setPropertyJSDocInfo("hi!", jSDocInfo46);
        com.google.javascript.rhino.Node[] nodeArray52 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node(48, nodeArray52, (int) (short) 0, (int) ' ');
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        node58.setJSType(jSType59);
        com.google.javascript.rhino.Node node61 = node55.useSourceInfoIfMissingFrom(node58);
        boolean boolean62 = functionType19.defineSynthesizedProperty("JSDocInfo", (com.google.javascript.rhino.jstype.JSType) functionType42, node61);
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray65 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList66 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList66, jSTypeArray65);
        com.google.javascript.rhino.Node node68 = jSTypeRegistry64.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList66);
        com.google.javascript.rhino.jstype.JSType jSType69 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray72 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList73 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList73, jSTypeArray72);
        com.google.javascript.rhino.Node node75 = jSTypeRegistry71.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList73);
        com.google.javascript.rhino.jstype.FunctionType functionType76 = jSTypeRegistry64.createFunctionType(jSType69, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList73);
        boolean boolean77 = functionType76.isNativeObjectType();
        boolean boolean78 = functionType76.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType79 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType19, (com.google.javascript.rhino.jstype.JSType) functionType76);
        com.google.javascript.rhino.jstype.FunctionType functionType80 = functionType76.getConstructor();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType19 and parameterizedType79.", functionType19.equals(parameterizedType79) == parameterizedType79.equals(functionType19));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        boolean boolean4 = jSTypeRegistry2.hasNamespace("");
        com.google.javascript.rhino.ErrorReporter errorReporter5 = jSTypeRegistry2.getErrorReporter();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList9 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList9, jSTypeArray8);
        com.google.javascript.rhino.Node node11 = jSTypeRegistry7.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList9);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList16 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList16, jSTypeArray15);
        com.google.javascript.rhino.Node node18 = jSTypeRegistry14.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList16);
        com.google.javascript.rhino.jstype.FunctionType functionType19 = jSTypeRegistry7.createFunctionType(jSType12, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList16);
        boolean boolean20 = functionType19.isNativeObjectType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<java.lang.String> strCollection23 = jSDocInfo22.getAuthors();
        boolean boolean24 = jSDocInfo22.hasBaseType();
        functionType19.setPropertyJSDocInfo("Unknown class name", jSDocInfo22);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = functionType19.getParentScope();
        com.google.javascript.rhino.jstype.ObjectType objectType27 = functionType19.getParentScope();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray31 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList32 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList32, jSTypeArray31);
        com.google.javascript.rhino.Node node34 = jSTypeRegistry30.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList32);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList39 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList39, jSTypeArray38);
        com.google.javascript.rhino.Node node41 = jSTypeRegistry37.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList39);
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry30.createFunctionType(jSType35, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList39);
        boolean boolean43 = functionType42.isNativeObjectType();
        boolean boolean44 = functionType42.hasImplementedInterfaces();
        com.google.javascript.rhino.JSDocInfo jSDocInfo46 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<java.lang.String> strCollection47 = jSDocInfo46.getAuthors();
        boolean boolean48 = jSDocInfo46.hasBaseType();
        boolean boolean49 = jSDocInfo46.isDeprecated();
        functionType42.setPropertyJSDocInfo("hi!", jSDocInfo46);
        com.google.javascript.rhino.Node[] nodeArray52 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node(48, nodeArray52, (int) (short) 0, (int) ' ');
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        node58.setJSType(jSType59);
        com.google.javascript.rhino.Node node61 = node55.useSourceInfoIfMissingFrom(node58);
        boolean boolean62 = functionType19.defineSynthesizedProperty("JSDocInfo", (com.google.javascript.rhino.jstype.JSType) functionType42, node61);
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray65 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList66 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList66, jSTypeArray65);
        com.google.javascript.rhino.Node node68 = jSTypeRegistry64.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList66);
        com.google.javascript.rhino.jstype.JSType jSType69 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray72 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList73 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList73, jSTypeArray72);
        com.google.javascript.rhino.Node node75 = jSTypeRegistry71.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList73);
        com.google.javascript.rhino.jstype.FunctionType functionType76 = jSTypeRegistry64.createFunctionType(jSType69, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList73);
        boolean boolean77 = functionType76.isNativeObjectType();
        boolean boolean78 = functionType76.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType79 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType19, (com.google.javascript.rhino.jstype.JSType) functionType76);
        java.lang.String str80 = parameterizedType79.getReferenceName();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType81 = parameterizedType79.toMaybeParameterizedType();
        boolean boolean82 = parameterizedType79.matchesStringContext();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType19 and parameterizedType79.", functionType19.equals(parameterizedType79) == parameterizedType79.equals(functionType19));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(48, nodeArray1, (int) (short) 0, (int) ' ');
        java.lang.String str5 = node4.getQualifiedName();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray11 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(48, nodeArray11, (int) (short) 0, (int) ' ');
        java.lang.String str15 = node14.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind16 = new com.google.javascript.jscomp.CodingConvention.Bind(node4, node9, node14);
        boolean boolean17 = node4.isTypeOf();
        com.google.javascript.rhino.Node node18 = node4.removeFirstChild();
        boolean boolean19 = node4.isDo();
        com.google.javascript.rhino.InputId inputId20 = com.google.javascript.jscomp.NodeUtil.getInputId(node4);
        boolean boolean21 = node4.isNumber();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node23 = node4.getChildAtIndex(47);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        boolean boolean4 = node3.isCall();
        node3.removeProp(46);
        boolean boolean7 = node3.isTry();
        node3.setIsSyntheticBlock(false);
        node3.setSourceEncodedPosition((int) (byte) 1);
        com.google.javascript.rhino.Node[] nodeArray13 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(48, nodeArray13, (int) (short) 0, (int) ' ');
        java.lang.String str17 = node16.getQualifiedName();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray23 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(48, nodeArray23, (int) (short) 0, (int) ' ');
        java.lang.String str27 = node26.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind28 = new com.google.javascript.jscomp.CodingConvention.Bind(node16, node21, node26);
        boolean boolean29 = node16.isTypeOf();
        boolean boolean30 = node16.isBlock();
        com.google.javascript.rhino.InputId inputId31 = com.google.javascript.jscomp.NodeUtil.getInputId(node16);
        boolean boolean32 = node16.isOr();
        boolean boolean33 = node16.isFromExterns();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile34 = node16.getStaticSourceFile();
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(52, 51, 36);
        boolean boolean39 = node38.isInc();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.replaceChild(node16, node38);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        boolean boolean4 = jSTypeRegistry2.hasNamespace("");
        com.google.javascript.rhino.ErrorReporter errorReporter5 = jSTypeRegistry2.getErrorReporter();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList9 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList9, jSTypeArray8);
        com.google.javascript.rhino.Node node11 = jSTypeRegistry7.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList9);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList16 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList16, jSTypeArray15);
        com.google.javascript.rhino.Node node18 = jSTypeRegistry14.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList16);
        com.google.javascript.rhino.jstype.FunctionType functionType19 = jSTypeRegistry7.createFunctionType(jSType12, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList16);
        boolean boolean20 = functionType19.isNativeObjectType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<java.lang.String> strCollection23 = jSDocInfo22.getAuthors();
        boolean boolean24 = jSDocInfo22.hasBaseType();
        functionType19.setPropertyJSDocInfo("Unknown class name", jSDocInfo22);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = functionType19.getParentScope();
        com.google.javascript.rhino.jstype.ObjectType objectType27 = functionType19.getParentScope();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray31 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList32 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList32, jSTypeArray31);
        com.google.javascript.rhino.Node node34 = jSTypeRegistry30.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList32);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList39 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList39, jSTypeArray38);
        com.google.javascript.rhino.Node node41 = jSTypeRegistry37.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList39);
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry30.createFunctionType(jSType35, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList39);
        boolean boolean43 = functionType42.isNativeObjectType();
        boolean boolean44 = functionType42.hasImplementedInterfaces();
        com.google.javascript.rhino.JSDocInfo jSDocInfo46 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<java.lang.String> strCollection47 = jSDocInfo46.getAuthors();
        boolean boolean48 = jSDocInfo46.hasBaseType();
        boolean boolean49 = jSDocInfo46.isDeprecated();
        functionType42.setPropertyJSDocInfo("hi!", jSDocInfo46);
        com.google.javascript.rhino.Node[] nodeArray52 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node(48, nodeArray52, (int) (short) 0, (int) ' ');
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        node58.setJSType(jSType59);
        com.google.javascript.rhino.Node node61 = node55.useSourceInfoIfMissingFrom(node58);
        boolean boolean62 = functionType19.defineSynthesizedProperty("JSDocInfo", (com.google.javascript.rhino.jstype.JSType) functionType42, node61);
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray65 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList66 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList66, jSTypeArray65);
        com.google.javascript.rhino.Node node68 = jSTypeRegistry64.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList66);
        com.google.javascript.rhino.jstype.JSType jSType69 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray72 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList73 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList73, jSTypeArray72);
        com.google.javascript.rhino.Node node75 = jSTypeRegistry71.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList73);
        com.google.javascript.rhino.jstype.FunctionType functionType76 = jSTypeRegistry64.createFunctionType(jSType69, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList73);
        boolean boolean77 = functionType76.isNativeObjectType();
        boolean boolean78 = functionType76.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType79 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType19, (com.google.javascript.rhino.jstype.JSType) functionType76);
        boolean boolean80 = functionType76.hasAnyTemplateInternal();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType19 and parameterizedType79.", functionType19.equals(parameterizedType79) == parameterizedType79.equals(functionType19));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("unknown");
        com.google.javascript.rhino.Node[] nodeArray3 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(48, nodeArray3, (int) (short) 0, (int) ' ');
        node6.setLength((int) (byte) 10);
        com.google.javascript.rhino.Node[] nodeArray10 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(48, nodeArray10, (int) (short) 0, (int) ' ');
        java.lang.String str14 = node13.getQualifiedName();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray20 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(48, nodeArray20, (int) (short) 0, (int) ' ');
        java.lang.String str24 = node23.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind25 = new com.google.javascript.jscomp.CodingConvention.Bind(node13, node18, node23);
        com.google.javascript.rhino.Node node26 = node6.useSourceInfoFromForTree(node18);
        com.google.javascript.rhino.Node node27 = assertionFunctionSpec1.getAssertedParam(node26);
        boolean boolean28 = node26.isLocalResultCall();
        int int30 = node26.getIntProp(46);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) 43);
        boolean boolean33 = node32.isCase();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile34 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node32);
        boolean boolean35 = node32.isVarArgs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node26.removeChild(node32);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(97, 2, 2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node5 = node3.getChildAtIndex(12);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (byte) 0);
        com.google.javascript.rhino.Node[] nodeArray3 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(48, nodeArray3, (int) (short) 0, (int) ' ');
        node6.setLength((int) (byte) 10);
        boolean boolean9 = node6.isFor();
        com.google.javascript.rhino.Node[] nodeArray11 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(48, nodeArray11, (int) (short) 0, (int) ' ');
        node14.setLength((int) (byte) 10);
        com.google.javascript.rhino.Node[] nodeArray18 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(48, nodeArray18, (int) (short) 0, (int) ' ');
        java.lang.String str22 = node21.getQualifiedName();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray28 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(48, nodeArray28, (int) (short) 0, (int) ' ');
        java.lang.String str32 = node31.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind33 = new com.google.javascript.jscomp.CodingConvention.Bind(node21, node26, node31);
        com.google.javascript.rhino.Node node34 = node14.useSourceInfoFromForTree(node26);
        node6.addChildrenToBack(node14);
        com.google.javascript.rhino.Node[] nodeArray37 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(48, nodeArray37, (int) (short) 0, (int) ' ');
        node40.setLength((int) (byte) 10);
        node40.setType((int) ' ');
        com.google.javascript.rhino.InputId inputId46 = new com.google.javascript.rhino.InputId("hi!");
        com.google.common.collect.ImmutableList<java.lang.Object> objList53 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList54 = objList53.asList();
        java.lang.Object[] objArray55 = objList54.toArray();
        boolean boolean56 = inputId46.equals((java.lang.Object) objList54);
        node40.setInputId(inputId46);
        com.google.javascript.rhino.Node node58 = node6.copyInformationFromForTree(node40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node40);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        boolean boolean4 = node3.isString();
        com.google.javascript.rhino.Node node5 = node3.getLastSibling();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable6 = node3.children();
        boolean boolean7 = node3.isNot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node9 = node3.getChildAtIndex(4);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(48, nodeArray1, (int) (short) 0, (int) ' ');
        java.lang.String str5 = node4.getQualifiedName();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray11 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(48, nodeArray11, (int) (short) 0, (int) ' ');
        java.lang.String str15 = node14.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind16 = new com.google.javascript.jscomp.CodingConvention.Bind(node4, node9, node14);
        com.google.javascript.rhino.Node[] nodeArray18 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(48, nodeArray18, (int) (short) 0, (int) ' ');
        node21.setLength((int) (byte) 10);
        boolean boolean24 = node21.isGetProp();
        node9.addChildrenToBack(node21);
        boolean boolean26 = node21.isThis();
        boolean boolean27 = node21.isIn();
        boolean boolean28 = node21.isTry();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable29 = node21.siblings();
        int int30 = node21.getLength();
        java.lang.String str31 = node21.getSourceFileName();
        boolean boolean32 = node21.isSwitch();
        boolean boolean34 = node21.getBooleanProp((int) '#');
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 4, (int) '4', 47);
        com.google.javascript.rhino.Node node39 = node38.getLastSibling();
        boolean boolean40 = node39.isBlock();
        int int41 = node39.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node21.removeChild(node39);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        com.google.javascript.rhino.Node[] nodeArray2 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(48, nodeArray2, (int) (short) 0, (int) ' ');
        java.lang.String str6 = node5.getQualifiedName();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(10, node5, 46, 36);
        boolean boolean10 = node5.isFunction();
        boolean boolean11 = node5.wasEmptyNode();
        boolean boolean12 = node5.isTypeOf();
        com.google.javascript.rhino.Node[] nodeArray15 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(48, nodeArray15, (int) (short) 0, (int) ' ');
        node18.setLength((int) (byte) 10);
        boolean boolean21 = node18.isLabelName();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(1, node18, 45, (int) (short) -1);
        int int25 = node18.getLength();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node26 = node5.getChildBefore(node18);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        com.google.javascript.rhino.Node[] nodeArray2 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(48, nodeArray2, (int) (short) 0, (int) ' ');
        node5.setLength((int) (byte) 10);
        boolean boolean8 = node5.isFor();
        com.google.javascript.rhino.Node[] nodeArray10 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(48, nodeArray10, (int) (short) 0, (int) ' ');
        node13.setLength((int) (byte) 10);
        com.google.javascript.rhino.Node[] nodeArray17 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(48, nodeArray17, (int) (short) 0, (int) ' ');
        java.lang.String str21 = node20.getQualifiedName();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray27 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(48, nodeArray27, (int) (short) 0, (int) ' ');
        java.lang.String str31 = node30.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind32 = new com.google.javascript.jscomp.CodingConvention.Bind(node20, node25, node30);
        com.google.javascript.rhino.Node node33 = node13.useSourceInfoFromForTree(node25);
        node5.addChildrenToBack(node13);
        com.google.javascript.rhino.Node[] nodeArray36 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(48, nodeArray36, (int) (short) 0, (int) ' ');
        node39.setLength((int) (byte) 10);
        node39.setType((int) ' ');
        com.google.javascript.rhino.InputId inputId45 = new com.google.javascript.rhino.InputId("hi!");
        com.google.common.collect.ImmutableList<java.lang.Object> objList52 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList53 = objList52.asList();
        java.lang.Object[] objArray54 = objList53.toArray();
        boolean boolean55 = inputId45.equals((java.lang.Object) objList53);
        node39.setInputId(inputId45);
        com.google.javascript.rhino.Node node57 = node5.copyInformationFromForTree(node39);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node(15, node39);
        com.google.javascript.rhino.Node[] nodeArray60 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node(48, nodeArray60, (int) (short) 0, (int) ' ');
        java.lang.String str64 = node63.getQualifiedName();
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray70 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node(48, nodeArray70, (int) (short) 0, (int) ' ');
        java.lang.String str74 = node73.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind75 = new com.google.javascript.jscomp.CodingConvention.Bind(node63, node68, node73);
        com.google.javascript.rhino.Node[] nodeArray77 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node80 = new com.google.javascript.rhino.Node(48, nodeArray77, (int) (short) 0, (int) ' ');
        node80.setLength((int) (byte) 10);
        boolean boolean83 = node80.isGetProp();
        node68.addChildrenToBack(node80);
        boolean boolean85 = node80.isThis();
        boolean boolean86 = node80.isIn();
        boolean boolean87 = node80.isTry();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable88 = node80.siblings();
        int int89 = node80.getLength();
        java.lang.String str90 = node80.getSourceFileName();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList91 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node39, (java.lang.Cloneable) node80);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node93 = node39.getChildAtIndex(54);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        boolean boolean4 = jSTypeRegistry2.hasNamespace("");
        com.google.javascript.rhino.ErrorReporter errorReporter5 = jSTypeRegistry2.getErrorReporter();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList9 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList9, jSTypeArray8);
        com.google.javascript.rhino.Node node11 = jSTypeRegistry7.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList9);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList16 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList16, jSTypeArray15);
        com.google.javascript.rhino.Node node18 = jSTypeRegistry14.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList16);
        com.google.javascript.rhino.jstype.FunctionType functionType19 = jSTypeRegistry7.createFunctionType(jSType12, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList16);
        boolean boolean20 = functionType19.isNativeObjectType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<java.lang.String> strCollection23 = jSDocInfo22.getAuthors();
        boolean boolean24 = jSDocInfo22.hasBaseType();
        functionType19.setPropertyJSDocInfo("Unknown class name", jSDocInfo22);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = functionType19.getParentScope();
        com.google.javascript.rhino.jstype.ObjectType objectType27 = functionType19.getParentScope();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray31 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList32 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList32, jSTypeArray31);
        com.google.javascript.rhino.Node node34 = jSTypeRegistry30.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList32);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList39 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList39, jSTypeArray38);
        com.google.javascript.rhino.Node node41 = jSTypeRegistry37.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList39);
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry30.createFunctionType(jSType35, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList39);
        boolean boolean43 = functionType42.isNativeObjectType();
        boolean boolean44 = functionType42.hasImplementedInterfaces();
        com.google.javascript.rhino.JSDocInfo jSDocInfo46 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<java.lang.String> strCollection47 = jSDocInfo46.getAuthors();
        boolean boolean48 = jSDocInfo46.hasBaseType();
        boolean boolean49 = jSDocInfo46.isDeprecated();
        functionType42.setPropertyJSDocInfo("hi!", jSDocInfo46);
        com.google.javascript.rhino.Node[] nodeArray52 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node(48, nodeArray52, (int) (short) 0, (int) ' ');
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        node58.setJSType(jSType59);
        com.google.javascript.rhino.Node node61 = node55.useSourceInfoIfMissingFrom(node58);
        boolean boolean62 = functionType19.defineSynthesizedProperty("JSDocInfo", (com.google.javascript.rhino.jstype.JSType) functionType42, node61);
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray65 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList66 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList66, jSTypeArray65);
        com.google.javascript.rhino.Node node68 = jSTypeRegistry64.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList66);
        com.google.javascript.rhino.jstype.JSType jSType69 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray72 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList73 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList73, jSTypeArray72);
        com.google.javascript.rhino.Node node75 = jSTypeRegistry71.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList73);
        com.google.javascript.rhino.jstype.FunctionType functionType76 = jSTypeRegistry64.createFunctionType(jSType69, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList73);
        boolean boolean77 = functionType76.isNativeObjectType();
        boolean boolean78 = functionType76.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType79 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType19, (com.google.javascript.rhino.jstype.JSType) functionType76);
        boolean boolean80 = functionType19.isUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType81 = functionType19.restrictByNotNullOrUndefined();
        int int82 = functionType19.getMinArguments();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType19 and parameterizedType79.", functionType19.equals(parameterizedType79) == parameterizedType79.equals(functionType19));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("function (): {1167700309}");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node3 = node1.getChildAtIndex(213039);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("function (): {1834124408}");
        com.google.javascript.rhino.Node[] nodeArray3 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(48, nodeArray3, (int) (short) 0, (int) ' ');
        java.lang.String str7 = node6.getQualifiedName();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray13 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(48, nodeArray13, (int) (short) 0, (int) ' ');
        java.lang.String str17 = node16.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind18 = new com.google.javascript.jscomp.CodingConvention.Bind(node6, node11, node16);
        node11.putIntProp(4, 16);
        int int22 = node11.getChildCount();
        java.lang.String str23 = com.google.javascript.jscomp.NodeUtil.getSourceName(node11);
        boolean boolean24 = node11.isOnlyModifiesThisCall();
        boolean boolean25 = node11.isAssignAdd();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node26 = node1.getChildBefore(node11);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        boolean boolean4 = jSTypeRegistry2.hasNamespace("");
        com.google.javascript.rhino.ErrorReporter errorReporter5 = jSTypeRegistry2.getErrorReporter();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList9 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList9, jSTypeArray8);
        com.google.javascript.rhino.Node node11 = jSTypeRegistry7.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList9);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList16 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList16, jSTypeArray15);
        com.google.javascript.rhino.Node node18 = jSTypeRegistry14.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList16);
        com.google.javascript.rhino.jstype.FunctionType functionType19 = jSTypeRegistry7.createFunctionType(jSType12, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList16);
        boolean boolean20 = functionType19.isNativeObjectType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<java.lang.String> strCollection23 = jSDocInfo22.getAuthors();
        boolean boolean24 = jSDocInfo22.hasBaseType();
        functionType19.setPropertyJSDocInfo("Unknown class name", jSDocInfo22);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = functionType19.getParentScope();
        com.google.javascript.rhino.jstype.ObjectType objectType27 = functionType19.getParentScope();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray31 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList32 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList32, jSTypeArray31);
        com.google.javascript.rhino.Node node34 = jSTypeRegistry30.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList32);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList39 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList39, jSTypeArray38);
        com.google.javascript.rhino.Node node41 = jSTypeRegistry37.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList39);
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry30.createFunctionType(jSType35, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList39);
        boolean boolean43 = functionType42.isNativeObjectType();
        boolean boolean44 = functionType42.hasImplementedInterfaces();
        com.google.javascript.rhino.JSDocInfo jSDocInfo46 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<java.lang.String> strCollection47 = jSDocInfo46.getAuthors();
        boolean boolean48 = jSDocInfo46.hasBaseType();
        boolean boolean49 = jSDocInfo46.isDeprecated();
        functionType42.setPropertyJSDocInfo("hi!", jSDocInfo46);
        com.google.javascript.rhino.Node[] nodeArray52 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node(48, nodeArray52, (int) (short) 0, (int) ' ');
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        node58.setJSType(jSType59);
        com.google.javascript.rhino.Node node61 = node55.useSourceInfoIfMissingFrom(node58);
        boolean boolean62 = functionType19.defineSynthesizedProperty("JSDocInfo", (com.google.javascript.rhino.jstype.JSType) functionType42, node61);
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray65 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList66 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList66, jSTypeArray65);
        com.google.javascript.rhino.Node node68 = jSTypeRegistry64.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList66);
        com.google.javascript.rhino.jstype.JSType jSType69 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray72 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList73 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList73, jSTypeArray72);
        com.google.javascript.rhino.Node node75 = jSTypeRegistry71.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList73);
        com.google.javascript.rhino.jstype.FunctionType functionType76 = jSTypeRegistry64.createFunctionType(jSType69, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList73);
        boolean boolean77 = functionType76.isNativeObjectType();
        boolean boolean78 = functionType76.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType79 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType19, (com.google.javascript.rhino.jstype.JSType) functionType76);
        java.lang.String str80 = parameterizedType79.getReferenceName();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType81 = parameterizedType79.toMaybeParameterizedType();
        boolean boolean82 = parameterizedType79.hasAnyTemplateInternal();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType19 and parameterizedType79.", functionType19.equals(parameterizedType79) == parameterizedType79.equals(functionType19));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("function (): {2129502018}");
        boolean boolean2 = node1.isName();
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec4 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("()");
        com.google.javascript.rhino.Node[] nodeArray7 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(48, nodeArray7, (int) (short) 0, (int) ' ');
        node10.setLength((int) (byte) 10);
        boolean boolean13 = node10.isFor();
        com.google.javascript.rhino.Node[] nodeArray15 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(48, nodeArray15, (int) (short) 0, (int) ' ');
        node18.setLength((int) (byte) 10);
        com.google.javascript.rhino.Node[] nodeArray22 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(48, nodeArray22, (int) (short) 0, (int) ' ');
        java.lang.String str26 = node25.getQualifiedName();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray32 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(48, nodeArray32, (int) (short) 0, (int) ' ');
        java.lang.String str36 = node35.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind37 = new com.google.javascript.jscomp.CodingConvention.Bind(node25, node30, node35);
        com.google.javascript.rhino.Node node38 = node18.useSourceInfoFromForTree(node30);
        node10.addChildrenToBack(node18);
        com.google.javascript.rhino.Node[] nodeArray41 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node(48, nodeArray41, (int) (short) 0, (int) ' ');
        java.lang.String str45 = node44.getQualifiedName();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray51 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node(48, nodeArray51, (int) (short) 0, (int) ' ');
        java.lang.String str55 = node54.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind56 = new com.google.javascript.jscomp.CodingConvention.Bind(node44, node49, node54);
        boolean boolean57 = node44.isTypeOf();
        boolean boolean58 = node44.isBlock();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(40, node10, node44);
        java.lang.String str60 = com.google.javascript.jscomp.NodeUtil.getSourceName(node10);
        boolean boolean61 = node10.isFromExterns();
        com.google.javascript.rhino.Node node62 = assertionFunctionSpec4.getAssertedParam(node10);
        node62.removeProp((int) (short) 1);
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString("Named type with empty name component", 48, 16);
        boolean boolean69 = node68.isDefaultCase();
        com.google.javascript.rhino.Node node70 = node62.copyInformationFromForTree(node68);
        int int71 = node68.getCharno();
        boolean boolean72 = node68.isCase();
        com.google.javascript.rhino.Node node73 = node68.cloneNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node68);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(0.0d, (int) (byte) 100, 42);
        boolean boolean4 = node3.isThis();
        node3.setOptionalArg(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node8 = node3.getChildAtIndex(41);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 4095, (-16), (-1));
        boolean boolean4 = node3.isString();
        com.google.javascript.rhino.Node[] nodeArray6 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(48, nodeArray6, (int) (short) 0, (int) ' ');
        node9.setLength((int) (byte) 10);
        boolean boolean12 = node9.isFor();
        com.google.javascript.rhino.Node[] nodeArray14 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(48, nodeArray14, (int) (short) 0, (int) ' ');
        node17.setLength((int) (byte) 10);
        com.google.javascript.rhino.Node[] nodeArray21 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(48, nodeArray21, (int) (short) 0, (int) ' ');
        java.lang.String str25 = node24.getQualifiedName();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray31 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node(48, nodeArray31, (int) (short) 0, (int) ' ');
        java.lang.String str35 = node34.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind36 = new com.google.javascript.jscomp.CodingConvention.Bind(node24, node29, node34);
        com.google.javascript.rhino.Node node37 = node17.useSourceInfoFromForTree(node29);
        node9.addChildrenToBack(node17);
        com.google.javascript.rhino.Node[] nodeArray40 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(48, nodeArray40, (int) (short) 0, (int) ' ');
        node43.setLength((int) (byte) 10);
        node43.setType((int) ' ');
        com.google.javascript.rhino.InputId inputId49 = new com.google.javascript.rhino.InputId("hi!");
        com.google.common.collect.ImmutableList<java.lang.Object> objList56 = com.google.common.collect.ImmutableList.of((java.lang.Object) ' ', (java.lang.Object) 0L, (java.lang.Object) 0, (java.lang.Object) 0L, (java.lang.Object) 100L, (java.lang.Object) (-1L));
        com.google.common.collect.ImmutableList<java.lang.Object> objList57 = objList56.asList();
        java.lang.Object[] objArray58 = objList57.toArray();
        boolean boolean59 = inputId49.equals((java.lang.Object) objList57);
        node43.setInputId(inputId49);
        com.google.javascript.rhino.Node node61 = node9.copyInformationFromForTree(node43);
        java.util.Set<java.lang.String> strSet62 = node9.getDirectives();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node63 = node3.getChildBefore(node9);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        boolean boolean4 = jSTypeRegistry2.hasNamespace("");
        com.google.javascript.rhino.ErrorReporter errorReporter5 = jSTypeRegistry2.getErrorReporter();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList9 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList9, jSTypeArray8);
        com.google.javascript.rhino.Node node11 = jSTypeRegistry7.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList9);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList16 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList16, jSTypeArray15);
        com.google.javascript.rhino.Node node18 = jSTypeRegistry14.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList16);
        com.google.javascript.rhino.jstype.FunctionType functionType19 = jSTypeRegistry7.createFunctionType(jSType12, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList16);
        boolean boolean20 = functionType19.isNativeObjectType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<java.lang.String> strCollection23 = jSDocInfo22.getAuthors();
        boolean boolean24 = jSDocInfo22.hasBaseType();
        functionType19.setPropertyJSDocInfo("Unknown class name", jSDocInfo22);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = functionType19.getParentScope();
        com.google.javascript.rhino.jstype.ObjectType objectType27 = functionType19.getParentScope();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray31 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList32 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList32, jSTypeArray31);
        com.google.javascript.rhino.Node node34 = jSTypeRegistry30.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList32);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList39 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList39, jSTypeArray38);
        com.google.javascript.rhino.Node node41 = jSTypeRegistry37.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList39);
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry30.createFunctionType(jSType35, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList39);
        boolean boolean43 = functionType42.isNativeObjectType();
        boolean boolean44 = functionType42.hasImplementedInterfaces();
        com.google.javascript.rhino.JSDocInfo jSDocInfo46 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<java.lang.String> strCollection47 = jSDocInfo46.getAuthors();
        boolean boolean48 = jSDocInfo46.hasBaseType();
        boolean boolean49 = jSDocInfo46.isDeprecated();
        functionType42.setPropertyJSDocInfo("hi!", jSDocInfo46);
        com.google.javascript.rhino.Node[] nodeArray52 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node(48, nodeArray52, (int) (short) 0, (int) ' ');
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString(0, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        node58.setJSType(jSType59);
        com.google.javascript.rhino.Node node61 = node55.useSourceInfoIfMissingFrom(node58);
        boolean boolean62 = functionType19.defineSynthesizedProperty("JSDocInfo", (com.google.javascript.rhino.jstype.JSType) functionType42, node61);
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray65 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList66 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList66, jSTypeArray65);
        com.google.javascript.rhino.Node node68 = jSTypeRegistry64.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList66);
        com.google.javascript.rhino.jstype.JSType jSType69 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray72 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList73 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList73, jSTypeArray72);
        com.google.javascript.rhino.Node node75 = jSTypeRegistry71.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList73);
        com.google.javascript.rhino.jstype.FunctionType functionType76 = jSTypeRegistry64.createFunctionType(jSType69, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList73);
        boolean boolean77 = functionType76.isNativeObjectType();
        boolean boolean78 = functionType76.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType79 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType19, (com.google.javascript.rhino.jstype.JSType) functionType76);
        com.google.javascript.rhino.jstype.ObjectType objectType80 = parameterizedType79.toObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType81 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) objectType80);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType19 and objectType81.", functionType19.equals(objectType81) == objectType81.equals(functionType19));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("function (): {521683720}", (int) (short) 10, 42);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString((-1), "{1570648975}", 6, 51);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (short) -1, node9);
        boolean boolean11 = node9.isExprResult();
        boolean boolean12 = node9.isNumber();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) ' ', "");
        com.google.javascript.rhino.Node node16 = node15.getLastSibling();
        node15.setType((int) ' ');
        com.google.javascript.rhino.Node node19 = node9.srcrefTree(node15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node15);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("()");
        com.google.javascript.rhino.Node[] nodeArray4 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(48, nodeArray4, (int) (short) 0, (int) ' ');
        node7.setLength((int) (byte) 10);
        boolean boolean10 = node7.isFor();
        com.google.javascript.rhino.Node[] nodeArray12 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(48, nodeArray12, (int) (short) 0, (int) ' ');
        node15.setLength((int) (byte) 10);
        com.google.javascript.rhino.Node[] nodeArray19 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(48, nodeArray19, (int) (short) 0, (int) ' ');
        java.lang.String str23 = node22.getQualifiedName();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray29 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(48, nodeArray29, (int) (short) 0, (int) ' ');
        java.lang.String str33 = node32.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind34 = new com.google.javascript.jscomp.CodingConvention.Bind(node22, node27, node32);
        com.google.javascript.rhino.Node node35 = node15.useSourceInfoFromForTree(node27);
        node7.addChildrenToBack(node15);
        com.google.javascript.rhino.Node[] nodeArray38 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(48, nodeArray38, (int) (short) 0, (int) ' ');
        java.lang.String str42 = node41.getQualifiedName();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray48 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node(48, nodeArray48, (int) (short) 0, (int) ' ');
        java.lang.String str52 = node51.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind53 = new com.google.javascript.jscomp.CodingConvention.Bind(node41, node46, node51);
        boolean boolean54 = node41.isTypeOf();
        boolean boolean55 = node41.isBlock();
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(40, node7, node41);
        java.lang.String str57 = com.google.javascript.jscomp.NodeUtil.getSourceName(node7);
        boolean boolean58 = node7.isFromExterns();
        com.google.javascript.rhino.Node node59 = assertionFunctionSpec1.getAssertedParam(node7);
        node59.removeProp((int) (short) 1);
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString("Named type with empty name component", 48, 16);
        boolean boolean66 = node65.isDefaultCase();
        com.google.javascript.rhino.Node node67 = node59.copyInformationFromForTree(node65);
        int int68 = node65.getCharno();
        boolean boolean69 = node65.isName();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString((int) ' ', "");
        com.google.javascript.rhino.Node node73 = node72.getLastSibling();
        com.google.javascript.rhino.Node[] nodeArray75 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node78 = new com.google.javascript.rhino.Node(48, nodeArray75, (int) (short) 0, (int) ' ');
        node78.setLength((int) (byte) 10);
        boolean boolean81 = node78.isLabelName();
        boolean boolean82 = node78.isQuotedString();
        com.google.javascript.rhino.Node node83 = node73.srcrefTree(node78);
        boolean boolean84 = node73.isFromExterns();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node65.removeChild(node73);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("()");
        com.google.javascript.rhino.Node[] nodeArray4 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(48, nodeArray4, (int) (short) 0, (int) ' ');
        node7.setLength((int) (byte) 10);
        boolean boolean10 = node7.isFor();
        com.google.javascript.rhino.Node[] nodeArray12 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(48, nodeArray12, (int) (short) 0, (int) ' ');
        node15.setLength((int) (byte) 10);
        com.google.javascript.rhino.Node[] nodeArray19 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(48, nodeArray19, (int) (short) 0, (int) ' ');
        java.lang.String str23 = node22.getQualifiedName();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray29 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(48, nodeArray29, (int) (short) 0, (int) ' ');
        java.lang.String str33 = node32.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind34 = new com.google.javascript.jscomp.CodingConvention.Bind(node22, node27, node32);
        com.google.javascript.rhino.Node node35 = node15.useSourceInfoFromForTree(node27);
        node7.addChildrenToBack(node15);
        com.google.javascript.rhino.Node[] nodeArray38 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(48, nodeArray38, (int) (short) 0, (int) ' ');
        java.lang.String str42 = node41.getQualifiedName();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber((double) 100L, (int) '4', (int) (short) 100);
        com.google.javascript.rhino.Node[] nodeArray48 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node(48, nodeArray48, (int) (short) 0, (int) ' ');
        java.lang.String str52 = node51.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.Bind bind53 = new com.google.javascript.jscomp.CodingConvention.Bind(node41, node46, node51);
        boolean boolean54 = node41.isTypeOf();
        boolean boolean55 = node41.isBlock();
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(40, node7, node41);
        java.lang.String str57 = com.google.javascript.jscomp.NodeUtil.getSourceName(node7);
        boolean boolean58 = node7.isFromExterns();
        com.google.javascript.rhino.Node node59 = assertionFunctionSpec1.getAssertedParam(node7);
        node59.removeProp((int) (short) 1);
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString("Named type with empty name component", 48, 16);
        boolean boolean66 = node65.isDefaultCase();
        com.google.javascript.rhino.Node node67 = node59.copyInformationFromForTree(node65);
        int int68 = node65.getCharno();
        boolean boolean69 = node65.isName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node71 = node65.getChildAtIndex(15);
    }
}


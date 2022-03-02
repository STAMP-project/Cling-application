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
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType4 = jSTypeRegistry1.createFunctionType(jSType2, jSTypeArray3);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry9.createFunctionType(jSType10, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.getParameterType();
        boolean boolean14 = functionType12.isArrayType();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot16 = functionType12.getOwnSlot("");
        boolean boolean17 = functionType12.isFunctionPrototypeType();
        boolean boolean18 = functionType12.isInstanceType();
        boolean boolean19 = functionType12.matchesObjectContext();
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createConstructorType("", node6, node7, (com.google.javascript.rhino.jstype.JSType) functionType12);
        jSTypeRegistry1.clearNamedTypes();
        boolean boolean22 = jSTypeRegistry1.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = jSTypeRegistry1.getErrorReporter();
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType28 = jSTypeRegistry25.createFunctionType(jSType26, jSTypeArray27);
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType28.getParameterType();
        boolean boolean30 = functionType28.isArrayType();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot32 = functionType28.getOwnSlot("");
        boolean boolean33 = functionType28.isFunctionPrototypeType();
        boolean boolean34 = functionType28.isInstanceType();
        boolean boolean35 = functionType28.isStringValueType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet36 = functionType28.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType41 = jSTypeRegistry38.createFunctionType(jSType39, jSTypeArray40);
        com.google.javascript.rhino.jstype.ObjectType objectType42 = functionType41.dereference();
        boolean boolean43 = functionType41.isInstanceType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue44 = functionType28.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType41);
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45);
        com.google.javascript.rhino.jstype.JSType jSType47 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray48 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry46.createFunctionType(jSType47, jSTypeArray48);
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50);
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray53 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType54 = jSTypeRegistry51.createFunctionType(jSType52, jSTypeArray53);
        com.google.javascript.rhino.jstype.JSType jSType55 = functionType54.getParameterType();
        boolean boolean56 = functionType54.isArrayType();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot58 = functionType54.getOwnSlot("");
        boolean boolean59 = functionType54.isFunctionPrototypeType();
        boolean boolean60 = functionType54.isInstanceType();
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray64 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType65 = jSTypeRegistry62.createFunctionType(jSType63, jSTypeArray64);
        com.google.javascript.rhino.jstype.JSType jSType66 = functionType65.getParameterType();
        boolean boolean67 = functionType65.isArrayType();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot69 = functionType65.getOwnSlot("");
        boolean boolean70 = functionType65.isFunctionPrototypeType();
        boolean boolean71 = functionType65.isInstanceType();
        boolean boolean72 = functionType65.matchesObjectContext();
        boolean boolean73 = functionType65.isConstructor();
        com.google.javascript.rhino.jstype.StaticScope[] staticScopeArray75 = new com.google.javascript.rhino.jstype.StaticScope[3];
        @SuppressWarnings("unchecked")
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>[] jSTypeStaticScopeArray76 = (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>[]) staticScopeArray75;
        jSTypeStaticScopeArray76[0] = functionType49;
        jSTypeStaticScopeArray76[1] = functionType54;
        jSTypeStaticScopeArray76[2] = functionType65;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>> jSTypeStaticScopeList83 = com.google.common.collect.ImmutableList.copyOf(jSTypeStaticScopeArray76);
        java.util.Spliterator<com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>> jSTypeStaticScopeSpliterator84 = jSTypeStaticScopeList83.spliterator();
        com.google.javascript.rhino.ErrorReporter errorReporter85 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry86 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter85);
        com.google.javascript.rhino.jstype.JSType jSType87 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray88 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType89 = jSTypeRegistry86.createFunctionType(jSType87, jSTypeArray88);
        com.google.javascript.rhino.jstype.ObjectType objectType90 = functionType89.dereference();
        boolean boolean91 = jSTypeStaticScopeList83.equals((java.lang.Object) objectType90);
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType92 = jSTypeRegistry1.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType28, (com.google.javascript.rhino.jstype.JSType) objectType90);
        boolean boolean93 = objectType90.isGlobalThisType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType28 and parameterizedType92.", functionType28.equals(parameterizedType92) == parameterizedType92.equals(functionType28));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType4 = jSTypeRegistry1.createFunctionType(jSType2, jSTypeArray3);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry9.createFunctionType(jSType10, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.getParameterType();
        boolean boolean14 = functionType12.isArrayType();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot16 = functionType12.getOwnSlot("");
        boolean boolean17 = functionType12.isFunctionPrototypeType();
        boolean boolean18 = functionType12.isInstanceType();
        boolean boolean19 = functionType12.matchesObjectContext();
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createConstructorType("", node6, node7, (com.google.javascript.rhino.jstype.JSType) functionType12);
        jSTypeRegistry1.clearNamedTypes();
        boolean boolean22 = jSTypeRegistry1.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = jSTypeRegistry1.getErrorReporter();
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType28 = jSTypeRegistry25.createFunctionType(jSType26, jSTypeArray27);
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType28.getParameterType();
        boolean boolean30 = functionType28.isArrayType();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot32 = functionType28.getOwnSlot("");
        boolean boolean33 = functionType28.isFunctionPrototypeType();
        boolean boolean34 = functionType28.isInstanceType();
        boolean boolean35 = functionType28.isStringValueType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet36 = functionType28.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType41 = jSTypeRegistry38.createFunctionType(jSType39, jSTypeArray40);
        com.google.javascript.rhino.jstype.ObjectType objectType42 = functionType41.dereference();
        boolean boolean43 = functionType41.isInstanceType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue44 = functionType28.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType41);
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45);
        com.google.javascript.rhino.jstype.JSType jSType47 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray48 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry46.createFunctionType(jSType47, jSTypeArray48);
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50);
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray53 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType54 = jSTypeRegistry51.createFunctionType(jSType52, jSTypeArray53);
        com.google.javascript.rhino.jstype.JSType jSType55 = functionType54.getParameterType();
        boolean boolean56 = functionType54.isArrayType();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot58 = functionType54.getOwnSlot("");
        boolean boolean59 = functionType54.isFunctionPrototypeType();
        boolean boolean60 = functionType54.isInstanceType();
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray64 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType65 = jSTypeRegistry62.createFunctionType(jSType63, jSTypeArray64);
        com.google.javascript.rhino.jstype.JSType jSType66 = functionType65.getParameterType();
        boolean boolean67 = functionType65.isArrayType();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot69 = functionType65.getOwnSlot("");
        boolean boolean70 = functionType65.isFunctionPrototypeType();
        boolean boolean71 = functionType65.isInstanceType();
        boolean boolean72 = functionType65.matchesObjectContext();
        boolean boolean73 = functionType65.isConstructor();
        com.google.javascript.rhino.jstype.StaticScope[] staticScopeArray75 = new com.google.javascript.rhino.jstype.StaticScope[3];
        @SuppressWarnings("unchecked")
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>[] jSTypeStaticScopeArray76 = (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>[]) staticScopeArray75;
        jSTypeStaticScopeArray76[0] = functionType49;
        jSTypeStaticScopeArray76[1] = functionType54;
        jSTypeStaticScopeArray76[2] = functionType65;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>> jSTypeStaticScopeList83 = com.google.common.collect.ImmutableList.copyOf(jSTypeStaticScopeArray76);
        java.util.Spliterator<com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>> jSTypeStaticScopeSpliterator84 = jSTypeStaticScopeList83.spliterator();
        com.google.javascript.rhino.ErrorReporter errorReporter85 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry86 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter85);
        com.google.javascript.rhino.jstype.JSType jSType87 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray88 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType89 = jSTypeRegistry86.createFunctionType(jSType87, jSTypeArray88);
        com.google.javascript.rhino.jstype.ObjectType objectType90 = functionType89.dereference();
        boolean boolean91 = jSTypeStaticScopeList83.equals((java.lang.Object) objectType90);
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType92 = jSTypeRegistry1.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType28, (com.google.javascript.rhino.jstype.JSType) objectType90);
        boolean boolean94 = jSTypeRegistry1.isForwardDeclaredType("function (): {1847742331}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType28 and parameterizedType92.", functionType28.equals(parameterizedType92) == parameterizedType92.equals(functionType28));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(10, 49, 35);
        boolean boolean4 = node3.isInstanceOf();
        com.google.javascript.rhino.Node node5 = node3.getLastSibling();
        boolean boolean6 = node3.isParamList();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node8 = node3.getChildAtIndex(24);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("PARAM_LIST 4095 [jsdoc_info: JSDocInfo]");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable2 = node1.children();
        int int3 = node1.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node5 = node1.getChildAtIndex(40);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean2 = node1.isParamList();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile3 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node1);
        node1.setSourceFileForTesting("function (): {2120356023}");
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(10, 49, 35);
        com.google.javascript.rhino.InputId inputId10 = com.google.javascript.jscomp.NodeUtil.getInputId(node9);
        boolean boolean11 = node9.isRegExp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node9);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(2, "Not declared as a constructor");
        boolean boolean3 = node2.isUnscopedQualifiedName();
        boolean boolean4 = node2.isGetElem();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(10, 49, 35);
        boolean boolean9 = node8.isInstanceOf();
        com.google.javascript.rhino.Node node10 = node8.getLastSibling();
        boolean boolean11 = node10.isEmpty();
        boolean boolean12 = node10.isBreak();
        node10.setSourceEncodedPositionForTree((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.removeChild(node10);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(10, 49, 35);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(48, node4, 16, 35);
        boolean boolean8 = node4.hasChildren();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node10 = node4.getChildAtIndex(38);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType4 = jSTypeRegistry1.createFunctionType(jSType2, jSTypeArray3);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry9.createFunctionType(jSType10, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.getParameterType();
        boolean boolean14 = functionType12.isArrayType();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot16 = functionType12.getOwnSlot("");
        boolean boolean17 = functionType12.isFunctionPrototypeType();
        boolean boolean18 = functionType12.isInstanceType();
        boolean boolean19 = functionType12.matchesObjectContext();
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createConstructorType("", node6, node7, (com.google.javascript.rhino.jstype.JSType) functionType12);
        jSTypeRegistry1.clearNamedTypes();
        boolean boolean22 = jSTypeRegistry1.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = jSTypeRegistry1.getErrorReporter();
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType28 = jSTypeRegistry25.createFunctionType(jSType26, jSTypeArray27);
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType28.getParameterType();
        boolean boolean30 = functionType28.isArrayType();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot32 = functionType28.getOwnSlot("");
        boolean boolean33 = functionType28.isFunctionPrototypeType();
        boolean boolean34 = functionType28.isInstanceType();
        boolean boolean35 = functionType28.isStringValueType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet36 = functionType28.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType41 = jSTypeRegistry38.createFunctionType(jSType39, jSTypeArray40);
        com.google.javascript.rhino.jstype.ObjectType objectType42 = functionType41.dereference();
        boolean boolean43 = functionType41.isInstanceType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue44 = functionType28.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType41);
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45);
        com.google.javascript.rhino.jstype.JSType jSType47 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray48 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry46.createFunctionType(jSType47, jSTypeArray48);
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50);
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray53 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType54 = jSTypeRegistry51.createFunctionType(jSType52, jSTypeArray53);
        com.google.javascript.rhino.jstype.JSType jSType55 = functionType54.getParameterType();
        boolean boolean56 = functionType54.isArrayType();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot58 = functionType54.getOwnSlot("");
        boolean boolean59 = functionType54.isFunctionPrototypeType();
        boolean boolean60 = functionType54.isInstanceType();
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray64 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType65 = jSTypeRegistry62.createFunctionType(jSType63, jSTypeArray64);
        com.google.javascript.rhino.jstype.JSType jSType66 = functionType65.getParameterType();
        boolean boolean67 = functionType65.isArrayType();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot69 = functionType65.getOwnSlot("");
        boolean boolean70 = functionType65.isFunctionPrototypeType();
        boolean boolean71 = functionType65.isInstanceType();
        boolean boolean72 = functionType65.matchesObjectContext();
        boolean boolean73 = functionType65.isConstructor();
        com.google.javascript.rhino.jstype.StaticScope[] staticScopeArray75 = new com.google.javascript.rhino.jstype.StaticScope[3];
        @SuppressWarnings("unchecked")
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>[] jSTypeStaticScopeArray76 = (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>[]) staticScopeArray75;
        jSTypeStaticScopeArray76[0] = functionType49;
        jSTypeStaticScopeArray76[1] = functionType54;
        jSTypeStaticScopeArray76[2] = functionType65;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>> jSTypeStaticScopeList83 = com.google.common.collect.ImmutableList.copyOf(jSTypeStaticScopeArray76);
        java.util.Spliterator<com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>> jSTypeStaticScopeSpliterator84 = jSTypeStaticScopeList83.spliterator();
        com.google.javascript.rhino.ErrorReporter errorReporter85 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry86 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter85);
        com.google.javascript.rhino.jstype.JSType jSType87 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray88 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType89 = jSTypeRegistry86.createFunctionType(jSType87, jSTypeArray88);
        com.google.javascript.rhino.jstype.ObjectType objectType90 = functionType89.dereference();
        boolean boolean91 = jSTypeStaticScopeList83.equals((java.lang.Object) objectType90);
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType92 = jSTypeRegistry1.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType28, (com.google.javascript.rhino.jstype.JSType) objectType90);
        com.google.javascript.rhino.JSDocInfo jSDocInfo93 = objectType90.getJSDocInfo();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType28 and parameterizedType92.", functionType28.equals(parameterizedType92) == parameterizedType92.equals(functionType28));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType4 = jSTypeRegistry1.createFunctionType(jSType2, jSTypeArray3);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry9.createFunctionType(jSType10, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.getParameterType();
        boolean boolean14 = functionType12.isArrayType();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot16 = functionType12.getOwnSlot("");
        boolean boolean17 = functionType12.isFunctionPrototypeType();
        boolean boolean18 = functionType12.isInstanceType();
        boolean boolean19 = functionType12.matchesObjectContext();
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createConstructorType("", node6, node7, (com.google.javascript.rhino.jstype.JSType) functionType12);
        jSTypeRegistry1.clearNamedTypes();
        boolean boolean22 = jSTypeRegistry1.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = jSTypeRegistry1.getErrorReporter();
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType28 = jSTypeRegistry25.createFunctionType(jSType26, jSTypeArray27);
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType28.getParameterType();
        boolean boolean30 = functionType28.isArrayType();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot32 = functionType28.getOwnSlot("");
        boolean boolean33 = functionType28.isFunctionPrototypeType();
        boolean boolean34 = functionType28.isInstanceType();
        boolean boolean35 = functionType28.isStringValueType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet36 = functionType28.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType41 = jSTypeRegistry38.createFunctionType(jSType39, jSTypeArray40);
        com.google.javascript.rhino.jstype.ObjectType objectType42 = functionType41.dereference();
        boolean boolean43 = functionType41.isInstanceType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue44 = functionType28.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType41);
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45);
        com.google.javascript.rhino.jstype.JSType jSType47 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray48 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry46.createFunctionType(jSType47, jSTypeArray48);
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50);
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray53 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType54 = jSTypeRegistry51.createFunctionType(jSType52, jSTypeArray53);
        com.google.javascript.rhino.jstype.JSType jSType55 = functionType54.getParameterType();
        boolean boolean56 = functionType54.isArrayType();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot58 = functionType54.getOwnSlot("");
        boolean boolean59 = functionType54.isFunctionPrototypeType();
        boolean boolean60 = functionType54.isInstanceType();
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray64 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType65 = jSTypeRegistry62.createFunctionType(jSType63, jSTypeArray64);
        com.google.javascript.rhino.jstype.JSType jSType66 = functionType65.getParameterType();
        boolean boolean67 = functionType65.isArrayType();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot69 = functionType65.getOwnSlot("");
        boolean boolean70 = functionType65.isFunctionPrototypeType();
        boolean boolean71 = functionType65.isInstanceType();
        boolean boolean72 = functionType65.matchesObjectContext();
        boolean boolean73 = functionType65.isConstructor();
        com.google.javascript.rhino.jstype.StaticScope[] staticScopeArray75 = new com.google.javascript.rhino.jstype.StaticScope[3];
        @SuppressWarnings("unchecked")
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>[] jSTypeStaticScopeArray76 = (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>[]) staticScopeArray75;
        jSTypeStaticScopeArray76[0] = functionType49;
        jSTypeStaticScopeArray76[1] = functionType54;
        jSTypeStaticScopeArray76[2] = functionType65;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>> jSTypeStaticScopeList83 = com.google.common.collect.ImmutableList.copyOf(jSTypeStaticScopeArray76);
        java.util.Spliterator<com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>> jSTypeStaticScopeSpliterator84 = jSTypeStaticScopeList83.spliterator();
        com.google.javascript.rhino.ErrorReporter errorReporter85 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry86 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter85);
        com.google.javascript.rhino.jstype.JSType jSType87 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray88 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType89 = jSTypeRegistry86.createFunctionType(jSType87, jSTypeArray88);
        com.google.javascript.rhino.jstype.ObjectType objectType90 = functionType89.dereference();
        boolean boolean91 = jSTypeStaticScopeList83.equals((java.lang.Object) objectType90);
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType92 = jSTypeRegistry1.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType28, (com.google.javascript.rhino.jstype.JSType) objectType90);
        com.google.javascript.rhino.Node node93 = functionType28.getParametersNode();
        boolean boolean94 = node93.isCall();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType28 and parameterizedType92.", functionType28.equals(parameterizedType92) == parameterizedType92.equals(functionType28));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType4 = jSTypeRegistry1.createFunctionType(jSType2, jSTypeArray3);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry9.createFunctionType(jSType10, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.getParameterType();
        boolean boolean14 = functionType12.isArrayType();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot16 = functionType12.getOwnSlot("");
        boolean boolean17 = functionType12.isFunctionPrototypeType();
        boolean boolean18 = functionType12.isInstanceType();
        boolean boolean19 = functionType12.matchesObjectContext();
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createConstructorType("", node6, node7, (com.google.javascript.rhino.jstype.JSType) functionType12);
        jSTypeRegistry1.clearNamedTypes();
        boolean boolean22 = jSTypeRegistry1.shouldTolerateUndefinedValues();
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable24 = jSTypeRegistry1.getTypesWithProperty("function (): {355370698}");
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry26.createInterfaceType("Not declared as a constructor", node28);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray30 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType31 = jSTypeRegistry26.createUnionType(jSTypeNativeArray30);
        com.google.javascript.rhino.jstype.JSType jSType32 = jSTypeRegistry1.createUnionType(jSTypeNativeArray30);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        com.google.javascript.rhino.jstype.JSType jSType38 = functionType37.getParameterType();
        boolean boolean39 = functionType37.isArrayType();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot41 = functionType37.getOwnSlot("");
        boolean boolean42 = functionType37.isFunctionPrototypeType();
        boolean boolean43 = functionType37.isInstanceType();
        boolean boolean45 = functionType37.isPropertyTypeInferred("");
        boolean boolean47 = functionType37.isPropertyTypeDeclared("function (): {1901769609}");
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList48 = functionType37.getSubTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable49 = functionType37.getImplementedInterfaces();
        boolean boolean50 = functionType37.hasInstanceType();
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51);
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray54 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType55 = jSTypeRegistry52.createFunctionType(jSType53, jSTypeArray54);
        com.google.javascript.rhino.jstype.JSType jSType56 = functionType55.getParameterType();
        boolean boolean57 = functionType55.isArrayType();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot59 = functionType55.getOwnSlot("");
        boolean boolean60 = functionType55.isFunctionPrototypeType();
        boolean boolean61 = functionType55.isInstanceType();
        boolean boolean62 = functionType55.isStringValueType();
        boolean boolean63 = functionType55.isNullable();
        boolean boolean65 = functionType55.hasOwnProperty("(Unknown class name)");
        java.lang.String str66 = functionType55.getNormalizedReferenceName();
        functionType55.clearCachedValues();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType68 = jSTypeRegistry1.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType37, (com.google.javascript.rhino.jstype.JSType) functionType55);
        boolean boolean69 = functionType55.hasCachedValues();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType37 and parameterizedType68.", functionType37.equals(parameterizedType68) == parameterizedType68.equals(functionType37));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType4 = jSTypeRegistry1.createFunctionType(jSType2, jSTypeArray3);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry9.createFunctionType(jSType10, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.getParameterType();
        boolean boolean14 = functionType12.isArrayType();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot16 = functionType12.getOwnSlot("");
        boolean boolean17 = functionType12.isFunctionPrototypeType();
        boolean boolean18 = functionType12.isInstanceType();
        boolean boolean19 = functionType12.matchesObjectContext();
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry1.createConstructorType("", node6, node7, (com.google.javascript.rhino.jstype.JSType) functionType12);
        jSTypeRegistry1.clearNamedTypes();
        boolean boolean22 = jSTypeRegistry1.shouldTolerateUndefinedValues();
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable24 = jSTypeRegistry1.getTypesWithProperty("function (): {355370698}");
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry26.createInterfaceType("Not declared as a constructor", node28);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray30 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType31 = jSTypeRegistry26.createUnionType(jSTypeNativeArray30);
        com.google.javascript.rhino.jstype.JSType jSType32 = jSTypeRegistry1.createUnionType(jSTypeNativeArray30);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        com.google.javascript.rhino.jstype.JSType jSType38 = functionType37.getParameterType();
        boolean boolean39 = functionType37.isArrayType();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot41 = functionType37.getOwnSlot("");
        boolean boolean42 = functionType37.isFunctionPrototypeType();
        boolean boolean43 = functionType37.isInstanceType();
        boolean boolean45 = functionType37.isPropertyTypeInferred("");
        boolean boolean47 = functionType37.isPropertyTypeDeclared("function (): {1901769609}");
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList48 = functionType37.getSubTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable49 = functionType37.getImplementedInterfaces();
        boolean boolean50 = functionType37.hasInstanceType();
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51);
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray54 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType55 = jSTypeRegistry52.createFunctionType(jSType53, jSTypeArray54);
        com.google.javascript.rhino.jstype.JSType jSType56 = functionType55.getParameterType();
        boolean boolean57 = functionType55.isArrayType();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot59 = functionType55.getOwnSlot("");
        boolean boolean60 = functionType55.isFunctionPrototypeType();
        boolean boolean61 = functionType55.isInstanceType();
        boolean boolean62 = functionType55.isStringValueType();
        boolean boolean63 = functionType55.isNullable();
        boolean boolean65 = functionType55.hasOwnProperty("(Unknown class name)");
        java.lang.String str66 = functionType55.getNormalizedReferenceName();
        functionType55.clearCachedValues();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType68 = jSTypeRegistry1.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType37, (com.google.javascript.rhino.jstype.JSType) functionType55);
        jSTypeRegistry1.clearNamedTypes();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType37 and parameterizedType68.", functionType37.equals(parameterizedType68) == parameterizedType68.equals(functionType37));
    }
}


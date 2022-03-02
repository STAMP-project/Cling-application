import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

    public static boolean debug = false;

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test201");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType50 = parameterizedType48.getIndexType();
        com.google.javascript.rhino.Node node52 = parameterizedType48.getPropertyNode("function (): {259080799}");
        boolean boolean53 = parameterizedType48.hasReferenceName();
        boolean boolean54 = parameterizedType48.isCheckedUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType55 = parameterizedType48.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType jSType56 = parameterizedType48.getParameterType();
        jSType56.clearResolved();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test202");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType50 = parameterizedType48.getIndexType();
        com.google.javascript.rhino.Node node52 = parameterizedType48.getPropertyNode("function (): {259080799}");
        java.lang.String str53 = parameterizedType48.getDisplayName();
        boolean boolean55 = parameterizedType48.isPropertyInExterns("hi!");
        boolean boolean57 = parameterizedType48.isPropertyTypeInferred("{proxy:function (): {1315738101}}");
        com.google.javascript.rhino.jstype.FunctionType functionType58 = parameterizedType48.getConstructor();
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        jSTypeRegistry61.unregisterPropertyOnType("(Not declared as a type name)", jSType63);
        com.google.javascript.rhino.jstype.JSType jSType65 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray67 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType68 = jSTypeRegistry61.createFunctionType(jSType65, true, jSTypeArray67);
        com.google.javascript.rhino.jstype.JSType jSType69 = functionType68.autoboxesTo();
        java.lang.String str70 = functionType68.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter71 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter71, true);
        com.google.javascript.rhino.jstype.JSType jSType75 = null;
        jSTypeRegistry73.unregisterPropertyOnType("(Not declared as a type name)", jSType75);
        com.google.javascript.rhino.jstype.JSType jSType77 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray79 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType80 = jSTypeRegistry73.createFunctionType(jSType77, true, jSTypeArray79);
        com.google.common.collect.ImmutableList<java.lang.String> strList81 = functionType80.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot83 = functionType80.getSlot("NUMBER 0.0 100\n");
        boolean boolean84 = functionType80.isAllType();
        boolean boolean85 = functionType68.hasEqualCallType(functionType80);
        com.google.javascript.rhino.JSDocInfo jSDocInfo87 = functionType80.getOwnPropertyJSDocInfo("function (): {2068438814}");
        com.google.javascript.rhino.jstype.JSType jSType88 = functionType80.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue89 = parameterizedType48.testForEquality(jSType88);
        boolean boolean91 = ternaryValue89.toBoolean(true);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test203");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType48.getTypeOfThis();
        boolean boolean53 = parameterizedType48.removeProperty("function (): {646790426}");
        java.util.Set set54 = parameterizedType48.getOwnPropertyNames();
        boolean boolean55 = parameterizedType48.isNominalType();
        boolean boolean56 = parameterizedType48.isNullable();
        java.util.Set set57 = parameterizedType48.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.TemplateType templateType58 = parameterizedType48.toMaybeTemplateType();
        com.google.javascript.rhino.jstype.JSType jSType59 = parameterizedType48.getParameterType();
        boolean boolean60 = jSType59.isOrdinaryFunction();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test204");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType48.getTypeOfThis();
        boolean boolean53 = parameterizedType48.removeProperty("function (): {646790426}");
        boolean boolean54 = parameterizedType48.canBeCalled();
        boolean boolean55 = parameterizedType48.isNativeObjectType();
        boolean boolean56 = parameterizedType48.isResolved();
        boolean boolean57 = parameterizedType48.isUnknownType();
        com.google.javascript.rhino.jstype.ObjectType objectType58 = parameterizedType48.getImplicitPrototype();
        boolean boolean60 = parameterizedType48.isPropertyTypeDeclared("(function (): {1826660093})");
        com.google.javascript.rhino.JSDocInfo jSDocInfo62 = parameterizedType48.getOwnPropertyJSDocInfo("{proxy:function (): {1827758248}}");
        boolean boolean63 = parameterizedType48.isUnknownType();
        java.lang.Iterable iterable64 = parameterizedType48.getCtorImplementedInterfaces();
        java.util.Spliterator<com.google.javascript.rhino.Node> nodeSpliterator65 = iterable64.spliterator();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test205");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType48.getTypeOfThis();
        boolean boolean53 = parameterizedType48.removeProperty("function (): {646790426}");
        com.google.javascript.rhino.jstype.JSType jSType55 = parameterizedType48.getPropertyType("NUMBER 0.0 100\n");
        boolean boolean56 = parameterizedType48.isNativeObjectType();
        boolean boolean57 = parameterizedType48.isInstanceType();
        com.google.javascript.rhino.ErrorReporter errorReporter58 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter58, true);
        com.google.javascript.rhino.jstype.JSType jSType62 = null;
        jSTypeRegistry60.unregisterPropertyOnType("(Not declared as a type name)", jSType62);
        com.google.javascript.rhino.jstype.JSType jSType64 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray66 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType67 = jSTypeRegistry60.createFunctionType(jSType64, true, jSTypeArray66);
        boolean boolean68 = functionType67.isReturnTypeInferred();
        boolean boolean69 = functionType67.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType71 = functionType67.getBindReturnType((int) (short) 1);
        com.google.javascript.rhino.ErrorReporter errorReporter72 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry74 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter72, true);
        com.google.javascript.rhino.jstype.JSType jSType76 = null;
        jSTypeRegistry74.unregisterPropertyOnType("(Not declared as a type name)", jSType76);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray80 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType81 = jSTypeRegistry74.createFunctionType(jSType78, true, jSTypeArray80);
        com.google.common.collect.ImmutableList<java.lang.String> strList82 = functionType81.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.ObjectType.Property property84 = functionType81.getSlot("function (): ?");
        boolean boolean85 = functionType81.isInterface();
        com.google.javascript.rhino.jstype.ObjectType objectType86 = functionType81.getImplicitPrototype();
        functionType67.setPrototypeBasedOn(objectType86);
        boolean boolean88 = functionType67.matchesObjectContext();
        com.google.javascript.rhino.jstype.JSType jSType89 = parameterizedType48.getLeastSupertype((com.google.javascript.rhino.jstype.JSType) functionType67);
        com.google.javascript.rhino.Node node90 = functionType67.getRootNode();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test206");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        jSTypeRegistry8.unregisterPropertyOnType("(Not declared as a type name)", jSType10);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray14 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType15 = jSTypeRegistry8.createFunctionType(jSType12, true, jSTypeArray14);
        boolean boolean17 = functionType15.removeProperty("false");
        boolean boolean18 = functionType15.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType19 = jSTypeRegistry2.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType15);
        boolean boolean21 = functionType15.hasProperty("(Not declared as a type name)");
        com.google.javascript.rhino.Node node22 = functionType15.getParametersNode();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        jSTypeRegistry25.unregisterPropertyOnType("(Not declared as a type name)", jSType27);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray31 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry25.createFunctionType(jSType29, true, jSTypeArray31);
        boolean boolean33 = functionType32.isReturnTypeInferred();
        boolean boolean34 = functionType15.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType32);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable35 = functionType15.getAllExtendedInterfaces();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, false);
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, true);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        jSTypeRegistry41.unregisterPropertyOnType("(Not declared as a type name)", jSType43);
        com.google.javascript.rhino.jstype.JSType jSType45 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray47 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry41.createFunctionType(jSType45, true, jSTypeArray47);
        com.google.javascript.rhino.jstype.JSType jSType49 = functionType48.autoboxesTo();
        java.lang.String str50 = functionType48.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51, true);
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        jSTypeRegistry53.unregisterPropertyOnType("(Not declared as a type name)", jSType55);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray59 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry53.createFunctionType(jSType57, true, jSTypeArray59);
        com.google.common.collect.ImmutableList<java.lang.String> strList61 = functionType60.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot63 = functionType60.getSlot("NUMBER 0.0 100\n");
        boolean boolean64 = functionType60.isAllType();
        boolean boolean65 = functionType48.hasEqualCallType(functionType60);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType60.getOwnerFunction();
        java.util.Set<java.lang.String> strSet67 = functionType60.getOwnPropertyNames();
        boolean boolean68 = functionType60.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter69 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter69, true);
        com.google.javascript.rhino.jstype.JSType jSType73 = null;
        jSTypeRegistry71.unregisterPropertyOnType("(Not declared as a type name)", jSType73);
        com.google.javascript.rhino.jstype.JSType jSType75 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray77 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType78 = jSTypeRegistry71.createFunctionType(jSType75, true, jSTypeArray77);
        boolean boolean79 = functionType78.isReturnTypeInferred();
        boolean boolean80 = functionType78.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType82 = functionType78.getBindReturnType((int) (short) 1);
        java.lang.String str83 = functionType82.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType84 = jSTypeRegistry38.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType60, (com.google.javascript.rhino.jstype.JSType) functionType82);
        com.google.javascript.rhino.JSDocInfo jSDocInfo86 = parameterizedType84.getOwnPropertyJSDocInfo("");
        boolean boolean87 = parameterizedType84.isNominalType();
        boolean boolean89 = parameterizedType84.removeProperty("function (): {1111800050}");
        boolean boolean90 = functionType15.isSubtype((com.google.javascript.rhino.jstype.JSType) parameterizedType84);
        boolean boolean91 = functionType15.isObject();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType60 and parameterizedType84.", functionType60.equals(parameterizedType84) == parameterizedType84.equals(functionType60));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test207");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = functionType9.getTemplateTypeNames();
        boolean boolean11 = functionType9.isReturnTypeInferred();
        com.google.javascript.rhino.Node node12 = functionType9.getRootNode();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean14 = jSDocInfo13.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression15 = jSDocInfo13.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility16 = null;
        jSDocInfo13.setVisibility(visibility16);
        boolean boolean18 = jSDocInfo13.isOverride();
        functionType9.setJSDocInfo(jSDocInfo13);
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean22 = jSDocInfo21.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression23 = jSDocInfo21.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility24 = null;
        jSDocInfo21.setVisibility(visibility24);
        int int26 = jSDocInfo21.getExtendedInterfacesCount();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList27 = jSDocInfo21.getImplementedInterfaces();
        com.google.common.collect.ImmutableList<java.lang.String> strList28 = jSDocInfo21.getTemplateTypeNames();
        functionType9.setPropertyJSDocInfo("function (): {1442205556}", jSDocInfo21);
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, false);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        com.google.javascript.rhino.jstype.JSType jSType43 = functionType42.autoboxesTo();
        java.lang.String str44 = functionType42.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, true);
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        jSTypeRegistry47.unregisterPropertyOnType("(Not declared as a type name)", jSType49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray53 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType54 = jSTypeRegistry47.createFunctionType(jSType51, true, jSTypeArray53);
        com.google.common.collect.ImmutableList<java.lang.String> strList55 = functionType54.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot57 = functionType54.getSlot("NUMBER 0.0 100\n");
        boolean boolean58 = functionType54.isAllType();
        boolean boolean59 = functionType42.hasEqualCallType(functionType54);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = functionType54.getOwnerFunction();
        java.util.Set<java.lang.String> strSet61 = functionType54.getOwnPropertyNames();
        boolean boolean62 = functionType54.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63, true);
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        jSTypeRegistry65.unregisterPropertyOnType("(Not declared as a type name)", jSType67);
        com.google.javascript.rhino.jstype.JSType jSType69 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray71 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry65.createFunctionType(jSType69, true, jSTypeArray71);
        boolean boolean73 = functionType72.isReturnTypeInferred();
        boolean boolean74 = functionType72.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType76 = functionType72.getBindReturnType((int) (short) 1);
        java.lang.String str77 = functionType76.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType78 = jSTypeRegistry32.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType54, (com.google.javascript.rhino.jstype.JSType) functionType76);
        com.google.javascript.rhino.JSDocInfo jSDocInfo80 = parameterizedType78.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType81 = parameterizedType78.getTypeOfThis();
        boolean boolean83 = parameterizedType78.removeProperty("function (): {646790426}");
        boolean boolean84 = parameterizedType78.canBeCalled();
        boolean boolean85 = parameterizedType78.isNativeObjectType();
        boolean boolean86 = parameterizedType78.isResolved();
        boolean boolean87 = parameterizedType78.isUnknownType();
        boolean boolean88 = functionType9.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType) parameterizedType78);
        boolean boolean90 = parameterizedType78.isPropertyTypeInferred("NUMBER 0.0\n");
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType91 = parameterizedType78.toMaybeParameterizedType();
        boolean boolean92 = parameterizedType91.isNativeObjectType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType54 and parameterizedType91.", functionType54.equals(parameterizedType91) == parameterizedType91.equals(functionType54));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test208");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        java.lang.String str51 = parameterizedType48.toDebugHashCodeString();
        boolean boolean52 = parameterizedType48.matchesObjectContext();
        com.google.javascript.rhino.jstype.JSType jSType53 = parameterizedType48.restrictByNotNullOrUndefined();
        boolean boolean54 = parameterizedType48.isNullType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test209");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList6 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray5);
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList9 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9, charSequenceArray8);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator11 = charSequenceList9.spliterator();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(0);
        node14.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(32, node14);
        boolean boolean19 = node18.isGetterDef();
        boolean boolean20 = charSequenceList9.equals((java.lang.Object) boolean19);
        boolean boolean22 = charSequenceList9.add((java.lang.CharSequence) "[hi!, hi!, , , hi!]");
        boolean boolean23 = charSequenceList6.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(0);
        node25.putIntProp((-1), 35);
        boolean boolean29 = node25.isStringKey();
        boolean boolean30 = node25.isThrow();
        int int31 = charSequenceList6.indexOf((java.lang.Object) node25);
        java.lang.Object[] objArray32 = charSequenceList6.toArray();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node(0);
        boolean boolean35 = node34.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile36 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node34);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(0);
        node38.putIntProp((-1), 35);
        boolean boolean42 = node38.isReturn();
        com.google.javascript.rhino.InputId inputId43 = node38.getInputId();
        node38.setWasEmptyNode(true);
        boolean boolean46 = node38.isLabel();
        boolean boolean47 = node38.isTry();
        com.google.javascript.rhino.Node node48 = node34.srcref(node38);
        boolean boolean49 = node34.isRegExp();
        com.google.javascript.rhino.Node node50 = node34.removeChildren();
        boolean boolean51 = charSequenceList6.contains((java.lang.Object) node34);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection52 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node54 = node34.getChildAtIndex(52);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test210");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = functionType9.getTemplateTypeNames();
        boolean boolean11 = functionType9.isReturnTypeInferred();
        com.google.javascript.rhino.Node node12 = functionType9.getRootNode();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean14 = jSDocInfo13.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression15 = jSDocInfo13.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility16 = null;
        jSDocInfo13.setVisibility(visibility16);
        boolean boolean18 = jSDocInfo13.isOverride();
        functionType9.setJSDocInfo(jSDocInfo13);
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean22 = jSDocInfo21.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression23 = jSDocInfo21.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility24 = null;
        jSDocInfo21.setVisibility(visibility24);
        int int26 = jSDocInfo21.getExtendedInterfacesCount();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList27 = jSDocInfo21.getImplementedInterfaces();
        com.google.common.collect.ImmutableList<java.lang.String> strList28 = jSDocInfo21.getTemplateTypeNames();
        functionType9.setPropertyJSDocInfo("function (): {1442205556}", jSDocInfo21);
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, false);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        com.google.javascript.rhino.jstype.JSType jSType43 = functionType42.autoboxesTo();
        java.lang.String str44 = functionType42.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, true);
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        jSTypeRegistry47.unregisterPropertyOnType("(Not declared as a type name)", jSType49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray53 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType54 = jSTypeRegistry47.createFunctionType(jSType51, true, jSTypeArray53);
        com.google.common.collect.ImmutableList<java.lang.String> strList55 = functionType54.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot57 = functionType54.getSlot("NUMBER 0.0 100\n");
        boolean boolean58 = functionType54.isAllType();
        boolean boolean59 = functionType42.hasEqualCallType(functionType54);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = functionType54.getOwnerFunction();
        java.util.Set<java.lang.String> strSet61 = functionType54.getOwnPropertyNames();
        boolean boolean62 = functionType54.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63, true);
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        jSTypeRegistry65.unregisterPropertyOnType("(Not declared as a type name)", jSType67);
        com.google.javascript.rhino.jstype.JSType jSType69 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray71 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry65.createFunctionType(jSType69, true, jSTypeArray71);
        boolean boolean73 = functionType72.isReturnTypeInferred();
        boolean boolean74 = functionType72.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType76 = functionType72.getBindReturnType((int) (short) 1);
        java.lang.String str77 = functionType76.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType78 = jSTypeRegistry32.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType54, (com.google.javascript.rhino.jstype.JSType) functionType76);
        com.google.javascript.rhino.JSDocInfo jSDocInfo80 = parameterizedType78.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType81 = parameterizedType78.getTypeOfThis();
        boolean boolean83 = parameterizedType78.removeProperty("function (): {646790426}");
        boolean boolean84 = parameterizedType78.canBeCalled();
        boolean boolean85 = parameterizedType78.isNativeObjectType();
        boolean boolean86 = parameterizedType78.isResolved();
        boolean boolean87 = parameterizedType78.isUnknownType();
        boolean boolean88 = functionType9.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType) parameterizedType78);
        com.google.javascript.rhino.jstype.EnumType enumType89 = functionType9.toMaybeEnumType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType54 and parameterizedType78.", functionType54.equals(parameterizedType78) == parameterizedType78.equals(functionType54));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test211");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType48.getTypeOfThis();
        boolean boolean53 = parameterizedType48.removeProperty("function (): {646790426}");
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        jSTypeRegistry56.unregisterPropertyOnType("(Not declared as a type name)", jSType58);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray62 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry56.createFunctionType(jSType60, true, jSTypeArray62);
        com.google.common.collect.ImmutableList<java.lang.String> strList64 = functionType63.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot66 = functionType63.getSlot("NUMBER 0.0 100\n");
        boolean boolean67 = functionType63.isAllType();
        com.google.javascript.rhino.ErrorReporter errorReporter68 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter68, true);
        com.google.javascript.rhino.jstype.JSType jSType72 = null;
        jSTypeRegistry70.unregisterPropertyOnType("(Not declared as a type name)", jSType72);
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray76 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType77 = jSTypeRegistry70.createFunctionType(jSType74, true, jSTypeArray76);
        boolean boolean79 = functionType77.removeProperty("false");
        com.google.javascript.rhino.jstype.JSType jSType81 = functionType77.findPropertyType("Not declared as a type name");
        boolean boolean82 = functionType63.differsFrom((com.google.javascript.rhino.jstype.JSType) functionType77);
        com.google.javascript.rhino.ErrorReporter errorReporter83 = null;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope84 = null;
        com.google.javascript.rhino.jstype.JSType jSType85 = functionType77.resolve(errorReporter83, jSTypeStaticScope84);
        boolean boolean86 = functionType77.isNullable();
        boolean boolean87 = parameterizedType48.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType77);
        boolean boolean88 = parameterizedType48.matchesObjectContext();
        java.util.Set set89 = parameterizedType48.getOwnPropertyNames();
        int int90 = set89.size();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test212");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType50 = parameterizedType48.getIndexType();
        com.google.javascript.rhino.jstype.JSType jSType51 = parameterizedType48.collapseUnion();
        com.google.javascript.rhino.Node node53 = parameterizedType48.getPropertyNode("(Not declared as a type name)");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test213");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType51 = parameterizedType48.findPropertyType("function (): {563988020}");
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, true);
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        jSTypeRegistry54.unregisterPropertyOnType("(Not declared as a type name)", jSType56);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType61 = jSTypeRegistry54.createFunctionType(jSType58, true, jSTypeArray60);
        com.google.javascript.rhino.jstype.JSType jSType62 = functionType61.restrictByNotNullOrUndefined();
        boolean boolean63 = parameterizedType48.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType61);
        com.google.javascript.rhino.ErrorReporter errorReporter64 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter64, true);
        com.google.javascript.rhino.jstype.JSType jSType68 = null;
        jSTypeRegistry66.unregisterPropertyOnType("(Not declared as a type name)", jSType68);
        com.google.javascript.rhino.jstype.JSType jSType70 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray72 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType73 = jSTypeRegistry66.createFunctionType(jSType70, true, jSTypeArray72);
        com.google.common.collect.ImmutableList<java.lang.String> strList74 = functionType73.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.ObjectType.Property property76 = functionType73.getSlot("function (): ?");
        boolean boolean77 = functionType73.isInterface();
        com.google.javascript.rhino.jstype.ObjectType objectType78 = functionType73.getImplicitPrototype();
        boolean boolean79 = parameterizedType48.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) objectType78);
        com.google.javascript.rhino.jstype.JSType jSType81 = objectType78.findPropertyType("java.io.IOException: java.io.IOException");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test214");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = functionType9.removeProperty("false");
        boolean boolean12 = functionType9.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        jSTypeRegistry15.unregisterPropertyOnType("(Not declared as a type name)", jSType17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry15.createFunctionType(jSType19, true, jSTypeArray21);
        boolean boolean23 = functionType22.hasReferenceName();
        boolean boolean24 = functionType9.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType22);
        com.google.javascript.rhino.JSDocInfo jSDocInfo25 = functionType9.getJSDocInfo();
        boolean boolean26 = functionType9.isRegexpType();
        com.google.javascript.rhino.jstype.JSType jSType27 = functionType9.autobox();
        java.lang.String str28 = jSType27.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, false);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        com.google.javascript.rhino.jstype.JSType jSType43 = functionType42.autoboxesTo();
        java.lang.String str44 = functionType42.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, true);
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        jSTypeRegistry47.unregisterPropertyOnType("(Not declared as a type name)", jSType49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray53 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType54 = jSTypeRegistry47.createFunctionType(jSType51, true, jSTypeArray53);
        com.google.common.collect.ImmutableList<java.lang.String> strList55 = functionType54.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot57 = functionType54.getSlot("NUMBER 0.0 100\n");
        boolean boolean58 = functionType54.isAllType();
        boolean boolean59 = functionType42.hasEqualCallType(functionType54);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = functionType54.getOwnerFunction();
        java.util.Set<java.lang.String> strSet61 = functionType54.getOwnPropertyNames();
        boolean boolean62 = functionType54.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63, true);
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        jSTypeRegistry65.unregisterPropertyOnType("(Not declared as a type name)", jSType67);
        com.google.javascript.rhino.jstype.JSType jSType69 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray71 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry65.createFunctionType(jSType69, true, jSTypeArray71);
        boolean boolean73 = functionType72.isReturnTypeInferred();
        boolean boolean74 = functionType72.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType76 = functionType72.getBindReturnType((int) (short) 1);
        java.lang.String str77 = functionType76.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType78 = jSTypeRegistry32.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType54, (com.google.javascript.rhino.jstype.JSType) functionType76);
        boolean boolean79 = parameterizedType78.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType80 = parameterizedType78.getIndexType();
        com.google.javascript.rhino.jstype.JSType jSType81 = jSType27.forceResolve(errorReporter29, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) parameterizedType78);
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType82 = jSType27.toMaybeParameterizedType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType54 and parameterizedType78.", functionType54.equals(parameterizedType78) == parameterizedType78.equals(functionType54));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test215");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType50 = parameterizedType48.getIndexType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType51 = parameterizedType48.toMaybeParameterizedType();
        java.lang.String str52 = parameterizedType48.toDebugHashCodeString();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test216");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType48.getTypeOfThis();
        boolean boolean53 = parameterizedType48.removeProperty("function (): {646790426}");
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        jSTypeRegistry56.unregisterPropertyOnType("(Not declared as a type name)", jSType58);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray62 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry56.createFunctionType(jSType60, true, jSTypeArray62);
        com.google.common.collect.ImmutableList<java.lang.String> strList64 = functionType63.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot66 = functionType63.getSlot("NUMBER 0.0 100\n");
        boolean boolean67 = functionType63.isAllType();
        com.google.javascript.rhino.ErrorReporter errorReporter68 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter68, true);
        com.google.javascript.rhino.jstype.JSType jSType72 = null;
        jSTypeRegistry70.unregisterPropertyOnType("(Not declared as a type name)", jSType72);
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray76 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType77 = jSTypeRegistry70.createFunctionType(jSType74, true, jSTypeArray76);
        boolean boolean79 = functionType77.removeProperty("false");
        com.google.javascript.rhino.jstype.JSType jSType81 = functionType77.findPropertyType("Not declared as a type name");
        boolean boolean82 = functionType63.differsFrom((com.google.javascript.rhino.jstype.JSType) functionType77);
        com.google.javascript.rhino.ErrorReporter errorReporter83 = null;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope84 = null;
        com.google.javascript.rhino.jstype.JSType jSType85 = functionType77.resolve(errorReporter83, jSTypeStaticScope84);
        boolean boolean86 = functionType77.isNullable();
        boolean boolean87 = parameterizedType48.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType77);
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType88 = parameterizedType48.toMaybeParameterizedType();
        boolean boolean89 = parameterizedType48.isNoType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test217");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        node1.putIntProp((-1), 35);
        boolean boolean5 = node1.isReturn();
        com.google.javascript.rhino.InputId inputId6 = node1.getInputId();
        node1.setWasEmptyNode(true);
        boolean boolean9 = node1.isLabel();
        boolean boolean10 = node1.isTry();
        node1.setWasEmptyNode(true);
        node1.setCharno((int) (byte) 100);
        boolean boolean15 = node1.isAssignAdd();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node17 = node1.getChildAtIndex(46);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test218");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType50 = parameterizedType48.getIndexType();
        com.google.javascript.rhino.jstype.JSType jSType51 = parameterizedType48.collapseUnion();
        boolean boolean52 = parameterizedType48.matchesNumberContext();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test219");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType50 = parameterizedType48.getIndexType();
        com.google.javascript.rhino.Node node52 = parameterizedType48.getPropertyNode("function (): {259080799}");
        boolean boolean53 = parameterizedType48.matchesNumberContext();
        com.google.javascript.rhino.JSDocInfo jSDocInfo55 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean56 = jSDocInfo55.hasThisType();
        boolean boolean57 = jSDocInfo55.shouldPreserveTry();
        boolean boolean58 = jSDocInfo55.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression60 = jSDocInfo55.getParameterType("[hi!, hi!, , , hi!]");
        int int61 = jSDocInfo55.getExtendedInterfacesCount();
        java.lang.String str62 = jSDocInfo55.getOriginalCommentString();
        boolean boolean63 = jSDocInfo55.isNoTypeCheck();
        parameterizedType48.setPropertyJSDocInfo("function (): {308723303}", jSDocInfo55);
        com.google.javascript.rhino.JSDocInfo jSDocInfo66 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean67 = jSDocInfo66.hasThisType();
        boolean boolean68 = jSDocInfo66.shouldPreserveTry();
        boolean boolean69 = jSDocInfo66.hasReturnType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression70 = jSDocInfo66.getType();
        parameterizedType48.setPropertyJSDocInfo("NUMBER 2.0 39", jSDocInfo66);
        boolean boolean72 = jSDocInfo66.isExterns();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test220");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType50 = parameterizedType48.getIndexType();
        boolean boolean51 = parameterizedType48.isNativeObjectType();
        boolean boolean52 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.FunctionType functionType53 = parameterizedType48.toMaybeFunctionType();
        boolean boolean54 = functionType53.isNoObjectType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType53 and parameterizedType48.", functionType53.equals(parameterizedType48) == parameterizedType48.equals(functionType53));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test221");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        jSTypeRegistry8.unregisterPropertyOnType("(Not declared as a type name)", jSType10);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray14 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType15 = jSTypeRegistry8.createFunctionType(jSType12, true, jSTypeArray14);
        boolean boolean17 = functionType15.removeProperty("false");
        boolean boolean18 = functionType15.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType19 = jSTypeRegistry2.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType15);
        boolean boolean21 = jSTypeRegistry2.hasNamespace("hi!");
        jSTypeRegistry2.clearTemplateTypeNames();
        boolean boolean23 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry2.createAnonymousObjectType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable26 = jSTypeRegistry2.getEachReferenceTypeWithProperty("(function (): {548870186})");
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27, false);
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, true);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        jSTypeRegistry32.unregisterPropertyOnType("(Not declared as a type name)", jSType34);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry32.createFunctionType(jSType36, true, jSTypeArray38);
        com.google.javascript.rhino.jstype.JSType jSType40 = functionType39.autoboxesTo();
        java.lang.String str41 = functionType39.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, true);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        jSTypeRegistry44.unregisterPropertyOnType("(Not declared as a type name)", jSType46);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray50 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType51 = jSTypeRegistry44.createFunctionType(jSType48, true, jSTypeArray50);
        com.google.common.collect.ImmutableList<java.lang.String> strList52 = functionType51.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot54 = functionType51.getSlot("NUMBER 0.0 100\n");
        boolean boolean55 = functionType51.isAllType();
        boolean boolean56 = functionType39.hasEqualCallType(functionType51);
        com.google.javascript.rhino.jstype.FunctionType functionType57 = functionType51.getOwnerFunction();
        java.util.Set<java.lang.String> strSet58 = functionType51.getOwnPropertyNames();
        boolean boolean59 = functionType51.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60, true);
        com.google.javascript.rhino.jstype.JSType jSType64 = null;
        jSTypeRegistry62.unregisterPropertyOnType("(Not declared as a type name)", jSType64);
        com.google.javascript.rhino.jstype.JSType jSType66 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray68 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType69 = jSTypeRegistry62.createFunctionType(jSType66, true, jSTypeArray68);
        boolean boolean70 = functionType69.isReturnTypeInferred();
        boolean boolean71 = functionType69.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType73 = functionType69.getBindReturnType((int) (short) 1);
        java.lang.String str74 = functionType73.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType75 = jSTypeRegistry29.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType51, (com.google.javascript.rhino.jstype.JSType) functionType73);
        com.google.javascript.rhino.JSDocInfo jSDocInfo77 = parameterizedType75.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType.Property property79 = parameterizedType75.getSlot("(Not declared as a type name)");
        boolean boolean80 = parameterizedType75.isNoObjectType();
        java.lang.Iterable iterable81 = parameterizedType75.getCtorImplementedInterfaces();
        boolean boolean83 = parameterizedType75.hasProperty("(function (): {480423885})");
        com.google.javascript.rhino.jstype.JSType jSType85 = parameterizedType75.getPropertyType("(function (): {480423885})");
        boolean boolean87 = parameterizedType75.removeProperty("NUMBER 0.0");
        com.google.javascript.rhino.jstype.FunctionType functionType88 = parameterizedType75.getConstructor();
        java.lang.String str89 = parameterizedType75.toDebugHashCodeString();
        boolean boolean91 = jSTypeRegistry2.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) parameterizedType75, "function (): {1385595472}");
        boolean boolean93 = jSTypeRegistry2.hasNamespace("{proxy:function (): {1236176823}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType51 and parameterizedType75.", functionType51.equals(parameterizedType75) == parameterizedType75.equals(functionType51));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test222");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        java.lang.String str51 = parameterizedType48.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.ObjectType.Property property53 = parameterizedType48.getSlot("java.io.IOException: java.io.IOException");
        boolean boolean55 = parameterizedType48.isPropertyTypeDeclared("function (): {1393951772}");
        boolean boolean56 = parameterizedType48.isUnknownType();
        java.lang.String str57 = parameterizedType48.getReferenceName();
        com.google.javascript.rhino.JSDocInfo jSDocInfo59 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean60 = jSDocInfo59.hasThisType();
        boolean boolean61 = jSDocInfo59.shouldPreserveTry();
        boolean boolean62 = jSDocInfo59.isDeprecated();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList63 = jSDocInfo59.getImplementedInterfaces();
        java.util.Set<java.lang.String> strSet64 = jSDocInfo59.getParameterNames();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression65 = jSDocInfo59.getEnumParameterType();
        boolean boolean66 = jSDocInfo59.hasFileOverview();
        boolean boolean67 = jSDocInfo59.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression68 = jSDocInfo59.getBaseType();
        parameterizedType48.setPropertyJSDocInfo("function (): {697129060}", jSDocInfo59);
        java.lang.String str70 = jSDocInfo59.getFileOverview();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test223");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType48.getTypeOfThis();
        boolean boolean53 = parameterizedType48.removeProperty("function (): {646790426}");
        boolean boolean54 = parameterizedType48.canBeCalled();
        boolean boolean55 = parameterizedType48.isNativeObjectType();
        boolean boolean56 = parameterizedType48.isResolved();
        com.google.javascript.rhino.ErrorReporter errorReporter57 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter57, true);
        com.google.javascript.rhino.jstype.JSType jSType61 = null;
        jSTypeRegistry59.unregisterPropertyOnType("(Not declared as a type name)", jSType61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray65 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType66 = jSTypeRegistry59.createFunctionType(jSType63, true, jSTypeArray65);
        boolean boolean67 = functionType66.matchesObjectContext();
        boolean boolean68 = parameterizedType48.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType66);
        com.google.javascript.rhino.jstype.ObjectType.Property property70 = functionType66.getSlot("");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test224");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType.Property property52 = parameterizedType48.getSlot("(Not declared as a type name)");
        boolean boolean53 = parameterizedType48.isNoObjectType();
        java.lang.Iterable iterable54 = parameterizedType48.getCtorImplementedInterfaces();
        boolean boolean56 = parameterizedType48.hasProperty("(function (): {480423885})");
        com.google.javascript.rhino.jstype.JSType jSType58 = parameterizedType48.getPropertyType("(function (): {480423885})");
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        jSTypeRegistry61.unregisterPropertyOnType("(Not declared as a type name)", jSType63);
        com.google.javascript.rhino.jstype.JSType jSType65 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray67 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType68 = jSTypeRegistry61.createFunctionType(jSType65, true, jSTypeArray67);
        boolean boolean70 = functionType68.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter71 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter71, true);
        com.google.javascript.rhino.jstype.JSType jSType75 = null;
        jSTypeRegistry73.unregisterPropertyOnType("(Not declared as a type name)", jSType75);
        com.google.javascript.rhino.jstype.JSType jSType77 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray79 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType80 = jSTypeRegistry73.createFunctionType(jSType77, true, jSTypeArray79);
        boolean boolean81 = functionType80.isReturnTypeInferred();
        com.google.javascript.rhino.jstype.JSType jSType82 = functionType68.getGreatestSubtype((com.google.javascript.rhino.jstype.JSType) functionType80);
        java.util.Set<java.lang.String> strSet83 = functionType68.getOwnPropertyNames();
        boolean boolean84 = parameterizedType48.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType68);
        com.google.javascript.rhino.jstype.ObjectType objectType85 = functionType68.getImplicitPrototype();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test225");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType48.getTypeOfThis();
        boolean boolean53 = parameterizedType48.removeProperty("function (): {646790426}");
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        jSTypeRegistry56.unregisterPropertyOnType("(Not declared as a type name)", jSType58);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray62 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry56.createFunctionType(jSType60, true, jSTypeArray62);
        com.google.common.collect.ImmutableList<java.lang.String> strList64 = functionType63.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot66 = functionType63.getSlot("NUMBER 0.0 100\n");
        boolean boolean67 = functionType63.isAllType();
        com.google.javascript.rhino.ErrorReporter errorReporter68 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter68, true);
        com.google.javascript.rhino.jstype.JSType jSType72 = null;
        jSTypeRegistry70.unregisterPropertyOnType("(Not declared as a type name)", jSType72);
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray76 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType77 = jSTypeRegistry70.createFunctionType(jSType74, true, jSTypeArray76);
        boolean boolean79 = functionType77.removeProperty("false");
        com.google.javascript.rhino.jstype.JSType jSType81 = functionType77.findPropertyType("Not declared as a type name");
        boolean boolean82 = functionType63.differsFrom((com.google.javascript.rhino.jstype.JSType) functionType77);
        com.google.javascript.rhino.ErrorReporter errorReporter83 = null;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope84 = null;
        com.google.javascript.rhino.jstype.JSType jSType85 = functionType77.resolve(errorReporter83, jSTypeStaticScope84);
        boolean boolean86 = functionType77.isNullable();
        boolean boolean87 = parameterizedType48.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType77);
        com.google.javascript.rhino.jstype.FunctionType functionType88 = parameterizedType48.toMaybeFunctionType();
        boolean boolean89 = functionType88.hasReferenceName();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType88 and parameterizedType48.", functionType88.equals(parameterizedType48) == parameterizedType48.equals(functionType88));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test226");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType.Property property52 = parameterizedType48.getSlot("(Not declared as a type name)");
        boolean boolean53 = parameterizedType48.isNoObjectType();
        boolean boolean54 = parameterizedType48.isOrdinaryFunction();
        com.google.javascript.rhino.jstype.FunctionType functionType55 = parameterizedType48.getConstructor();
        com.google.javascript.rhino.JSDocInfo jSDocInfo57 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean58 = jSDocInfo57.isHidden();
        com.google.javascript.rhino.JSDocInfo jSDocInfo59 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo60 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo61 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean62 = jSDocInfo61.hasThisType();
        boolean boolean63 = jSDocInfo61.shouldPreserveTry();
        boolean boolean64 = jSDocInfo61.isDeprecated();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList65 = jSDocInfo61.getImplementedInterfaces();
        com.google.javascript.rhino.JSDocInfo jSDocInfo66 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean67 = jSDocInfo66.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression68 = jSDocInfo66.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility69 = null;
        jSDocInfo66.setVisibility(visibility69);
        boolean boolean71 = jSDocInfo66.isExport();
        com.google.javascript.rhino.JSDocInfo jSDocInfo72 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean73 = jSDocInfo72.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression74 = jSDocInfo72.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility75 = null;
        jSDocInfo72.setVisibility(visibility75);
        boolean boolean77 = jSDocInfo72.isExport();
        java.lang.String str78 = jSDocInfo72.getMeaning();
        com.google.javascript.rhino.JSDocInfo jSDocInfo79 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean80 = jSDocInfo79.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression81 = jSDocInfo79.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility82 = null;
        jSDocInfo79.setVisibility(visibility82);
        boolean boolean84 = jSDocInfo79.isExport();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList85 = com.google.common.collect.ImmutableList.of(jSDocInfo57, jSDocInfo59, jSDocInfo60, jSDocInfo61, jSDocInfo66, jSDocInfo72, jSDocInfo79);
        boolean boolean86 = jSDocInfo61.isDefine();
        boolean boolean87 = jSDocInfo61.isNoShadow();
        boolean boolean88 = jSDocInfo61.hasBaseType();
        parameterizedType48.setPropertyJSDocInfo("function (): {1241008589}", jSDocInfo61);
        boolean boolean90 = parameterizedType48.matchesInt32Context();
        com.google.javascript.rhino.jstype.ObjectType objectType91 = parameterizedType48.getImplicitPrototype();
        boolean boolean92 = objectType91.isStringObjectType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test227");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 0);
        com.google.javascript.rhino.Node node2 = node1.getLastChild();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString("(Not declared as a type name)", 0, 43);
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(0);
        boolean boolean9 = node8.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile10 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node8);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(0);
        node12.putIntProp((-1), 35);
        boolean boolean16 = node12.isReturn();
        com.google.javascript.rhino.InputId inputId17 = node12.getInputId();
        node12.setWasEmptyNode(true);
        boolean boolean20 = node12.isLabel();
        boolean boolean21 = node12.isTry();
        com.google.javascript.rhino.Node node22 = node8.srcref(node12);
        com.google.javascript.rhino.Node node23 = node6.useSourceInfoIfMissingFromForTree(node8);
        boolean boolean24 = node8.isIn();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable25 = node8.getAncestors();
        node8.addSuppression("(function (): {1808020359})");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node28 = node1.getChildBefore(node8);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test228");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType.Property property52 = parameterizedType48.getSlot("(Not declared as a type name)");
        boolean boolean53 = parameterizedType48.isNoObjectType();
        java.lang.Iterable iterable54 = parameterizedType48.getCtorImplementedInterfaces();
        java.lang.String str55 = parameterizedType48.toDebugHashCodeString();
        java.lang.String str56 = parameterizedType48.toDebugHashCodeString();
        boolean boolean57 = parameterizedType48.isConstructor();
        boolean boolean58 = parameterizedType48.hasReferenceName();
        boolean boolean59 = parameterizedType48.isOrdinaryFunction();
        boolean boolean60 = parameterizedType48.isCheckedUnknownType();
        com.google.javascript.rhino.jstype.ObjectType objectType61 = parameterizedType48.toObjectType();
        boolean boolean62 = parameterizedType48.isOrdinaryFunction();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test229");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType.Property property52 = parameterizedType48.getSlot("(Not declared as a type name)");
        boolean boolean53 = parameterizedType48.isNoObjectType();
        boolean boolean54 = parameterizedType48.isOrdinaryFunction();
        boolean boolean56 = parameterizedType48.hasOwnProperty("function (): {1657069676}");
        boolean boolean57 = parameterizedType48.isCheckedUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType58 = parameterizedType48.getParameterType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType59 = parameterizedType48.toMaybeParameterizedType();
        com.google.javascript.rhino.jstype.ObjectType objectType60 = parameterizedType48.getParentScope();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test230");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10, true);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        jSTypeRegistry12.unregisterPropertyOnType("(Not declared as a type name)", jSType14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray18 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType19 = jSTypeRegistry12.createFunctionType(jSType16, true, jSTypeArray18);
        com.google.common.collect.ImmutableList<java.lang.String> strList20 = functionType19.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot22 = functionType19.getSlot("NUMBER 0.0 100\n");
        boolean boolean23 = functionType19.hasReferenceName();
        com.google.javascript.rhino.jstype.JSType jSType25 = functionType19.getRestrictedTypeGivenToBooleanOutcome(false);
        com.google.javascript.rhino.JSDocInfo jSDocInfo26 = functionType19.getJSDocInfo();
        functionType9.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType19);
        java.util.Set<java.lang.String> strSet28 = functionType19.getPropertyNames();
        com.google.javascript.rhino.JSDocInfo jSDocInfo30 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean31 = jSDocInfo30.hasThisType();
        java.lang.String str32 = jSDocInfo30.getDescription();
        boolean boolean33 = jSDocInfo30.isIdGenerator();
        functionType19.setPropertyJSDocInfo("{proxy:function (): {551511107}}", jSDocInfo30);
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35, false);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38, true);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        jSTypeRegistry40.unregisterPropertyOnType("(Not declared as a type name)", jSType42);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray46 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType47 = jSTypeRegistry40.createFunctionType(jSType44, true, jSTypeArray46);
        com.google.javascript.rhino.jstype.JSType jSType48 = functionType47.autoboxesTo();
        java.lang.String str49 = functionType47.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50, true);
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        jSTypeRegistry52.unregisterPropertyOnType("(Not declared as a type name)", jSType54);
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType59 = jSTypeRegistry52.createFunctionType(jSType56, true, jSTypeArray58);
        com.google.common.collect.ImmutableList<java.lang.String> strList60 = functionType59.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot62 = functionType59.getSlot("NUMBER 0.0 100\n");
        boolean boolean63 = functionType59.isAllType();
        boolean boolean64 = functionType47.hasEqualCallType(functionType59);
        com.google.javascript.rhino.jstype.FunctionType functionType65 = functionType59.getOwnerFunction();
        java.util.Set<java.lang.String> strSet66 = functionType59.getOwnPropertyNames();
        boolean boolean67 = functionType59.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter68 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter68, true);
        com.google.javascript.rhino.jstype.JSType jSType72 = null;
        jSTypeRegistry70.unregisterPropertyOnType("(Not declared as a type name)", jSType72);
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray76 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType77 = jSTypeRegistry70.createFunctionType(jSType74, true, jSTypeArray76);
        boolean boolean78 = functionType77.isReturnTypeInferred();
        boolean boolean79 = functionType77.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType81 = functionType77.getBindReturnType((int) (short) 1);
        java.lang.String str82 = functionType81.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType83 = jSTypeRegistry37.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType59, (com.google.javascript.rhino.jstype.JSType) functionType81);
        com.google.javascript.rhino.JSDocInfo jSDocInfo85 = parameterizedType83.getOwnPropertyJSDocInfo("");
        java.lang.String str86 = parameterizedType83.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.ObjectType.Property property88 = parameterizedType83.getSlot("java.io.IOException: java.io.IOException");
        boolean boolean90 = parameterizedType83.isPropertyTypeDeclared("function (): {1393951772}");
        boolean boolean91 = parameterizedType83.isUnknownType();
        boolean boolean92 = functionType19.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) parameterizedType83);
        int int93 = functionType19.getPropertiesCount();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType59 and parameterizedType83.", functionType59.equals(parameterizedType83) == parameterizedType83.equals(functionType59));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test231");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        node1.putIntProp((-1), 35);
        boolean boolean5 = node1.isStringKey();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder6 = node1.getJsDocBuilderForNode();
        boolean boolean7 = node1.isCatch();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((-1.0d), 32, 49);
        boolean boolean12 = node11.isTypeOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile13 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node11);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        boolean boolean18 = node17.isEmpty();
        java.lang.CharSequence[] charSequenceArray24 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList25 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray24);
        java.lang.CharSequence[] charSequenceArray27 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList28 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList28, charSequenceArray27);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator30 = charSequenceList28.spliterator();
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node(0);
        node33.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(32, node33);
        boolean boolean38 = node37.isGetterDef();
        boolean boolean39 = charSequenceList28.equals((java.lang.Object) boolean38);
        boolean boolean41 = charSequenceList28.add((java.lang.CharSequence) "[hi!, hi!, , , hi!]");
        boolean boolean42 = charSequenceList25.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList28);
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node(0);
        node44.putIntProp((-1), 35);
        boolean boolean48 = node44.isStringKey();
        boolean boolean49 = node44.isThrow();
        int int50 = charSequenceList25.indexOf((java.lang.Object) node44);
        boolean boolean51 = node17.isEquivalentTo(node44);
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node(0);
        node53.putIntProp((-1), 35);
        boolean boolean57 = node53.isReturn();
        com.google.javascript.rhino.InputId inputId58 = node53.getInputId();
        node53.setWasEmptyNode(true);
        com.google.javascript.rhino.Node node61 = node17.useSourceInfoIfMissingFrom(node53);
        boolean boolean62 = node53.isDo();
        boolean boolean63 = node11.isEquivalentTo(node53);
        node11.setSourceEncodedPositionForTree(4095);
        boolean boolean66 = node11.isDo();
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node(0);
        boolean boolean69 = node68.isCall();
        com.google.javascript.rhino.Node node70 = node68.cloneTree();
        boolean boolean71 = node70.isAssignAdd();
        boolean boolean72 = node70.isFalse();
        com.google.javascript.rhino.Node node74 = new com.google.javascript.rhino.Node(0);
        node74.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node80 = new com.google.javascript.rhino.Node(0);
        node80.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node84 = new com.google.javascript.rhino.Node(32, node80);
        boolean boolean85 = node80.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node87 = new com.google.javascript.rhino.Node(0);
        boolean boolean88 = node87.isCall();
        com.google.javascript.rhino.Node node89 = node87.cloneTree();
        com.google.javascript.jscomp.CodingConvention.Bind bind90 = new com.google.javascript.jscomp.CodingConvention.Bind(node74, node80, node87);
        int int91 = node70.getIndexOfChild(node87);
        boolean boolean92 = node87.isInc();
        com.google.javascript.rhino.Node node93 = node87.cloneTree();
        node93.setLineno(36);
        com.google.javascript.rhino.jstype.JSType jSType96 = node93.getJSType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.replaceChild(node11, node93);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test232");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType48.getTypeOfThis();
        boolean boolean53 = parameterizedType48.removeProperty("function (): {646790426}");
        boolean boolean54 = parameterizedType48.canBeCalled();
        boolean boolean55 = parameterizedType48.isNativeObjectType();
        boolean boolean56 = parameterizedType48.isResolved();
        boolean boolean57 = parameterizedType48.isUnknownType();
        boolean boolean58 = parameterizedType48.isUnknownType();
        boolean boolean59 = parameterizedType48.matchesObjectContext();
        com.google.javascript.rhino.JSDocInfo jSDocInfo61 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean62 = jSDocInfo61.hasThisType();
        boolean boolean63 = jSDocInfo61.shouldPreserveTry();
        java.lang.String str64 = jSDocInfo61.getDescription();
        boolean boolean65 = jSDocInfo61.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression66 = jSDocInfo61.getTypedefType();
        parameterizedType48.setPropertyJSDocInfo("{proxy:function (): {629583372}}", jSDocInfo61);
        boolean boolean68 = jSDocInfo61.isOverride();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test233");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        java.lang.String str3 = jSDocInfo0.getDescription();
        boolean boolean4 = jSDocInfo0.isDeprecated();
        java.util.Set<java.lang.String> strSet5 = jSDocInfo0.getSuppressions();
        java.util.Iterator<java.lang.String> strItor6 = strSet5.iterator();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType7 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition8 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(0);
        node12.putIntProp((-1), 35);
        boolean boolean16 = node12.isStringKey();
        boolean boolean17 = node12.isThrow();
        com.google.javascript.rhino.Node node18 = node10.useSourceInfoFrom(node12);
        namePosition8.setItem(node10);
        boolean boolean20 = node10.isTry();
        node10.putBooleanProp(0, true);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(0);
        boolean boolean26 = node25.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile27 = node25.getStaticSourceFile();
        com.google.javascript.rhino.Node node28 = node25.getNext();
        boolean boolean29 = node25.isFalse();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        boolean boolean34 = node33.isEmpty();
        node25.addChildrenToBack(node33);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship36 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType7, node10, node33);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship[] subclassRelationshipArray37 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship[] { subclassRelationship36 };
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship[] subclassRelationshipArray38 = strSet5.toArray(subclassRelationshipArray37);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.common.collect.ImmutableList<com.google.javascript.jscomp.CodingConvention.SubclassRelationship> subclassRelationshipList39 = com.google.common.collect.ImmutableList.of(subclassRelationshipArray38);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test234");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.isAllType();
        boolean boolean50 = parameterizedType48.isInstanceType();
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType48.getImplicitPrototype();
        java.lang.String str52 = objectType51.toAnnotationString();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test235");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType48.getTypeOfThis();
        boolean boolean53 = parameterizedType48.removeProperty("function (): {646790426}");
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        jSTypeRegistry56.unregisterPropertyOnType("(Not declared as a type name)", jSType58);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray62 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry56.createFunctionType(jSType60, true, jSTypeArray62);
        com.google.common.collect.ImmutableList<java.lang.String> strList64 = functionType63.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot66 = functionType63.getSlot("NUMBER 0.0 100\n");
        boolean boolean67 = functionType63.isAllType();
        com.google.javascript.rhino.ErrorReporter errorReporter68 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter68, true);
        com.google.javascript.rhino.jstype.JSType jSType72 = null;
        jSTypeRegistry70.unregisterPropertyOnType("(Not declared as a type name)", jSType72);
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray76 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType77 = jSTypeRegistry70.createFunctionType(jSType74, true, jSTypeArray76);
        boolean boolean79 = functionType77.removeProperty("false");
        com.google.javascript.rhino.jstype.JSType jSType81 = functionType77.findPropertyType("Not declared as a type name");
        boolean boolean82 = functionType63.differsFrom((com.google.javascript.rhino.jstype.JSType) functionType77);
        com.google.javascript.rhino.ErrorReporter errorReporter83 = null;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope84 = null;
        com.google.javascript.rhino.jstype.JSType jSType85 = functionType77.resolve(errorReporter83, jSTypeStaticScope84);
        boolean boolean86 = functionType77.isNullable();
        boolean boolean87 = parameterizedType48.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType77);
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType88 = parameterizedType48.toMaybeParameterizedType();
        boolean boolean89 = parameterizedType88.isNoType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType88.", functionType24.equals(parameterizedType88) == parameterizedType88.equals(functionType24));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test236");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType.Property property52 = parameterizedType48.getSlot("(Not declared as a type name)");
        boolean boolean53 = parameterizedType48.hasAnyTemplateInternal();
        boolean boolean55 = parameterizedType48.hasProperty("{proxy:function (): {1556474225}}");
        boolean boolean56 = parameterizedType48.isNoType();
        boolean boolean57 = parameterizedType48.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType59 = parameterizedType48.getPropertyType("?");
        boolean boolean60 = jSType59.isEmptyType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test237");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType50 = parameterizedType48.getIndexType();
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, true);
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        jSTypeRegistry54.unregisterPropertyOnType("(Not declared as a type name)", jSType56);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType61 = jSTypeRegistry54.createFunctionType(jSType58, true, jSTypeArray60);
        com.google.common.collect.ImmutableList<java.lang.String> strList62 = functionType61.getTemplateTypeNames();
        boolean boolean63 = functionType61.isReturnTypeInferred();
        com.google.javascript.rhino.Node node64 = functionType61.getRootNode();
        com.google.javascript.rhino.JSDocInfo jSDocInfo65 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean66 = jSDocInfo65.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression67 = jSDocInfo65.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility68 = null;
        jSDocInfo65.setVisibility(visibility68);
        boolean boolean70 = jSDocInfo65.isOverride();
        functionType61.setJSDocInfo(jSDocInfo65);
        com.google.javascript.rhino.JSDocInfo.Visibility visibility72 = jSDocInfo65.getVisibility();
        parameterizedType48.setPropertyJSDocInfo("function (): {1754035944}", jSDocInfo65);
        java.lang.String str74 = jSDocInfo65.getVersion();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test238");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType.Property property52 = parameterizedType48.getSlot("(Not declared as a type name)");
        boolean boolean53 = parameterizedType48.hasAnyTemplateInternal();
        boolean boolean54 = parameterizedType48.isEmptyType();
        com.google.javascript.rhino.jstype.JSType jSType55 = parameterizedType48.autobox();
        boolean boolean57 = parameterizedType48.isPropertyTypeInferred("");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test239");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType9.unboxesTo();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable11 = functionType9.getParameters();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, false);
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        jSTypeRegistry18.unregisterPropertyOnType("(Not declared as a type name)", jSType20);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry18.createFunctionType(jSType22, true, jSTypeArray24);
        com.google.javascript.rhino.jstype.JSType jSType26 = functionType25.autoboxesTo();
        java.lang.String str27 = functionType25.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        jSTypeRegistry30.unregisterPropertyOnType("(Not declared as a type name)", jSType32);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry30.createFunctionType(jSType34, true, jSTypeArray36);
        com.google.common.collect.ImmutableList<java.lang.String> strList38 = functionType37.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot40 = functionType37.getSlot("NUMBER 0.0 100\n");
        boolean boolean41 = functionType37.isAllType();
        boolean boolean42 = functionType25.hasEqualCallType(functionType37);
        com.google.javascript.rhino.jstype.FunctionType functionType43 = functionType37.getOwnerFunction();
        java.util.Set<java.lang.String> strSet44 = functionType37.getOwnPropertyNames();
        boolean boolean45 = functionType37.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, true);
        com.google.javascript.rhino.jstype.JSType jSType50 = null;
        jSTypeRegistry48.unregisterPropertyOnType("(Not declared as a type name)", jSType50);
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray54 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType55 = jSTypeRegistry48.createFunctionType(jSType52, true, jSTypeArray54);
        boolean boolean56 = functionType55.isReturnTypeInferred();
        boolean boolean57 = functionType55.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType59 = functionType55.getBindReturnType((int) (short) 1);
        java.lang.String str60 = functionType59.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType61 = jSTypeRegistry15.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType37, (com.google.javascript.rhino.jstype.JSType) functionType59);
        com.google.javascript.rhino.JSDocInfo jSDocInfo63 = parameterizedType61.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType.Property property65 = parameterizedType61.getSlot("(Not declared as a type name)");
        boolean boolean66 = parameterizedType61.isNoObjectType();
        java.lang.String str67 = parameterizedType61.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.ObjectType objectType68 = parameterizedType61.getImplicitPrototype();
        boolean boolean69 = parameterizedType61.isInstanceType();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(0);
        node71.putIntProp((-1), 35);
        java.lang.Object obj76 = node71.getProp(29);
        boolean boolean77 = functionType9.defineSynthesizedProperty("function (): {1341612873}", (com.google.javascript.rhino.jstype.JSType) parameterizedType61, node71);
        boolean boolean79 = parameterizedType61.isPropertyTypeDeclared("{proxy:function (): {1278869837}}");
        boolean boolean80 = parameterizedType61.matchesStringContext();
        boolean boolean82 = parameterizedType61.removeProperty("function (): {1059200999}");
        com.google.javascript.rhino.jstype.JSType jSType84 = parameterizedType61.getPropertyType("{proxy:function (): {2128767812}}");
        com.google.javascript.rhino.jstype.JSType jSType85 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair86 = jSType84.getTypesUnderShallowEquality(jSType85);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType37 and parameterizedType61.", functionType37.equals(parameterizedType61) == parameterizedType61.equals(functionType37));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test240");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.isAllType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo51 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean52 = jSDocInfo51.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression53 = jSDocInfo51.getBaseType();
        java.lang.String str54 = jSDocInfo51.getFileOverview();
        int int55 = jSDocInfo51.getExtendedInterfacesCount();
        boolean boolean56 = jSDocInfo51.isNoShadow();
        boolean boolean57 = jSDocInfo51.hasReturnType();
        parameterizedType48.setPropertyJSDocInfo("(function (): {1341612873})", jSDocInfo51);
        com.google.javascript.rhino.jstype.ObjectType.Property property60 = parameterizedType48.getSlot("{proxy:function (): {1136642478}}");
        boolean boolean61 = parameterizedType48.isUnknownType();
        boolean boolean62 = parameterizedType48.isConstructor();
        com.google.javascript.rhino.jstype.JSType jSType64 = parameterizedType48.getRestrictedTypeGivenToBooleanOutcome(true);
        boolean boolean66 = parameterizedType48.isPropertyTypeDeclared("{proxy:function (): {2033352958}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test241");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType50 = parameterizedType48.getIndexType();
        com.google.javascript.rhino.Node node52 = parameterizedType48.getPropertyNode("function (): {259080799}");
        boolean boolean53 = parameterizedType48.matchesNumberContext();
        com.google.javascript.rhino.JSDocInfo jSDocInfo55 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean56 = jSDocInfo55.hasThisType();
        boolean boolean57 = jSDocInfo55.shouldPreserveTry();
        boolean boolean58 = jSDocInfo55.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression60 = jSDocInfo55.getParameterType("[hi!, hi!, , , hi!]");
        int int61 = jSDocInfo55.getExtendedInterfacesCount();
        java.lang.String str62 = jSDocInfo55.getOriginalCommentString();
        boolean boolean63 = jSDocInfo55.isNoTypeCheck();
        parameterizedType48.setPropertyJSDocInfo("function (): {308723303}", jSDocInfo55);
        boolean boolean65 = jSDocInfo55.hasTypedefType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test242");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType50 = parameterizedType48.getIndexType();
        boolean boolean52 = parameterizedType48.hasOwnProperty("function (): {620032704}");
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        jSTypeRegistry55.unregisterPropertyOnType("(Not declared as a type name)", jSType57);
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray61 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType62 = jSTypeRegistry55.createFunctionType(jSType59, true, jSTypeArray61);
        com.google.javascript.rhino.jstype.JSType jSType63 = functionType62.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.ObjectType objectType64 = functionType62.toObjectType();
        boolean boolean65 = objectType64.isBooleanValueType();
        boolean boolean66 = parameterizedType48.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) objectType64);
        objectType64.clearCachedValues();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test243");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString((int) ' ', "JSDocInfo", (int) (byte) 100, 5);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable5 = node4.siblings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node7 = node4.getChildAtIndex(30);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test244");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType.Property property52 = parameterizedType48.getSlot("(Not declared as a type name)");
        boolean boolean53 = parameterizedType48.isNoObjectType();
        boolean boolean54 = parameterizedType48.isOrdinaryFunction();
        com.google.javascript.rhino.jstype.FunctionType functionType55 = parameterizedType48.getConstructor();
        com.google.javascript.rhino.JSDocInfo jSDocInfo57 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean58 = jSDocInfo57.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression59 = jSDocInfo57.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility60 = null;
        jSDocInfo57.setVisibility(visibility60);
        int int62 = jSDocInfo57.getExtendedInterfacesCount();
        boolean boolean63 = jSDocInfo57.isDeprecated();
        jSDocInfo57.setDeprecated(true);
        boolean boolean66 = jSDocInfo57.isNoAlias();
        parameterizedType48.setPropertyJSDocInfo("(function (): {2068438814})", jSDocInfo57);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet68 = parameterizedType48.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet70 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(false);
        boolean boolean72 = booleanLiteralSet70.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet74 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet75 = booleanLiteralSet70.intersection(booleanLiteralSet74);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet76 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet77 = booleanLiteralSet75.union(booleanLiteralSet76);
        boolean boolean79 = booleanLiteralSet77.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet80 = booleanLiteralSet68.intersection(booleanLiteralSet77);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test245");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType.Property property52 = parameterizedType48.getSlot("(Not declared as a type name)");
        boolean boolean53 = parameterizedType48.hasAnyTemplateInternal();
        com.google.javascript.rhino.JSDocInfo jSDocInfo54 = parameterizedType48.getJSDocInfo();
        com.google.javascript.rhino.jstype.FunctionType functionType55 = parameterizedType48.toMaybeFunctionType();
        boolean boolean56 = functionType55.isConstructor();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType55 and parameterizedType48.", functionType55.equals(parameterizedType48) == parameterizedType48.equals(functionType55));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test246");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = functionType9.removeProperty("false");
        boolean boolean12 = functionType9.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        jSTypeRegistry15.unregisterPropertyOnType("(Not declared as a type name)", jSType17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry15.createFunctionType(jSType19, true, jSTypeArray21);
        boolean boolean23 = functionType22.hasReferenceName();
        boolean boolean24 = functionType9.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType22);
        com.google.javascript.rhino.JSDocInfo jSDocInfo25 = functionType9.getJSDocInfo();
        boolean boolean26 = functionType9.isRegexpType();
        com.google.javascript.rhino.jstype.JSType jSType27 = functionType9.autobox();
        java.lang.String str28 = jSType27.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, false);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        com.google.javascript.rhino.jstype.JSType jSType43 = functionType42.autoboxesTo();
        java.lang.String str44 = functionType42.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, true);
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        jSTypeRegistry47.unregisterPropertyOnType("(Not declared as a type name)", jSType49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray53 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType54 = jSTypeRegistry47.createFunctionType(jSType51, true, jSTypeArray53);
        com.google.common.collect.ImmutableList<java.lang.String> strList55 = functionType54.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot57 = functionType54.getSlot("NUMBER 0.0 100\n");
        boolean boolean58 = functionType54.isAllType();
        boolean boolean59 = functionType42.hasEqualCallType(functionType54);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = functionType54.getOwnerFunction();
        java.util.Set<java.lang.String> strSet61 = functionType54.getOwnPropertyNames();
        boolean boolean62 = functionType54.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63, true);
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        jSTypeRegistry65.unregisterPropertyOnType("(Not declared as a type name)", jSType67);
        com.google.javascript.rhino.jstype.JSType jSType69 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray71 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry65.createFunctionType(jSType69, true, jSTypeArray71);
        boolean boolean73 = functionType72.isReturnTypeInferred();
        boolean boolean74 = functionType72.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType76 = functionType72.getBindReturnType((int) (short) 1);
        java.lang.String str77 = functionType76.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType78 = jSTypeRegistry32.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType54, (com.google.javascript.rhino.jstype.JSType) functionType76);
        boolean boolean79 = parameterizedType78.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType80 = parameterizedType78.getIndexType();
        com.google.javascript.rhino.jstype.JSType jSType81 = jSType27.forceResolve(errorReporter29, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) parameterizedType78);
        com.google.javascript.rhino.jstype.JSType jSType82 = parameterizedType78.autobox();
        boolean boolean83 = parameterizedType78.isNoResolvedType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType54 and parameterizedType78.", functionType54.equals(parameterizedType78) == parameterizedType78.equals(functionType54));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test247");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        boolean boolean2 = node1.isInstanceOf();
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(0);
        node4.putIntProp((-1), 35);
        boolean boolean8 = node4.isStringKey();
        boolean boolean9 = node4.isThrow();
        boolean boolean10 = node4.isEmpty();
        com.google.javascript.rhino.Node node11 = node1.useSourceInfoFrom(node4);
        boolean boolean12 = node4.isNE();
        boolean boolean13 = node4.isCall();
        boolean boolean14 = node4.isNew();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(0);
        node17.putIntProp((-1), 35);
        boolean boolean21 = node17.isStringKey();
        boolean boolean22 = node17.isThrow();
        int int23 = node17.getLineno();
        boolean boolean24 = node17.hasChildren();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(0);
        node26.putIntProp((-1), 35);
        boolean boolean30 = node17.hasChild(node26);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(0);
        boolean boolean33 = node32.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile34 = node32.getStaticSourceFile();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(0, node26, node32, node38);
        com.google.javascript.rhino.Node node40 = node4.useSourceInfoFromForTree(node26);
        com.google.javascript.rhino.Node node42 = node4.getAncestor(0);
        node4.setOptionalArg(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node46 = node4.getChildAtIndex(37);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test248");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(0, "function (): {2140273663}");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(0);
        node4.putIntProp((-1), 35);
        boolean boolean8 = node4.isStringKey();
        boolean boolean9 = node4.isThrow();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj15 = node13.getProp((int) (byte) 10);
        boolean boolean16 = node4.isEquivalentToTyped(node13);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node(0);
        node19.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(32, node19);
        boolean boolean24 = node23.isInstanceOf();
        com.google.javascript.rhino.Node node25 = node13.useSourceInfoFromForTree(node23);
        com.google.javascript.rhino.Node node26 = node2.useSourceInfoFromForTree(node13);
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27, false);
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, true);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        jSTypeRegistry32.unregisterPropertyOnType("(Not declared as a type name)", jSType34);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry32.createFunctionType(jSType36, true, jSTypeArray38);
        com.google.javascript.rhino.jstype.JSType jSType40 = functionType39.autoboxesTo();
        java.lang.String str41 = functionType39.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, true);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        jSTypeRegistry44.unregisterPropertyOnType("(Not declared as a type name)", jSType46);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray50 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType51 = jSTypeRegistry44.createFunctionType(jSType48, true, jSTypeArray50);
        com.google.common.collect.ImmutableList<java.lang.String> strList52 = functionType51.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot54 = functionType51.getSlot("NUMBER 0.0 100\n");
        boolean boolean55 = functionType51.isAllType();
        boolean boolean56 = functionType39.hasEqualCallType(functionType51);
        com.google.javascript.rhino.jstype.FunctionType functionType57 = functionType51.getOwnerFunction();
        java.util.Set<java.lang.String> strSet58 = functionType51.getOwnPropertyNames();
        boolean boolean59 = functionType51.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60, true);
        com.google.javascript.rhino.jstype.JSType jSType64 = null;
        jSTypeRegistry62.unregisterPropertyOnType("(Not declared as a type name)", jSType64);
        com.google.javascript.rhino.jstype.JSType jSType66 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray68 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType69 = jSTypeRegistry62.createFunctionType(jSType66, true, jSTypeArray68);
        boolean boolean70 = functionType69.isReturnTypeInferred();
        boolean boolean71 = functionType69.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType73 = functionType69.getBindReturnType((int) (short) 1);
        java.lang.String str74 = functionType73.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType75 = jSTypeRegistry29.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType51, (com.google.javascript.rhino.jstype.JSType) functionType73);
        com.google.javascript.rhino.JSDocInfo jSDocInfo77 = parameterizedType75.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType78 = parameterizedType75.getTypeOfThis();
        boolean boolean80 = parameterizedType75.removeProperty("function (): {646790426}");
        boolean boolean81 = parameterizedType75.canBeCalled();
        boolean boolean83 = parameterizedType75.isPropertyTypeDeclared("function (): {367372378}");
        java.lang.String str84 = parameterizedType75.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.JSType jSType85 = parameterizedType75.getIndexType();
        boolean boolean86 = parameterizedType75.isNominalConstructor();
        node2.setJSType((com.google.javascript.rhino.jstype.JSType) parameterizedType75);
        boolean boolean88 = node2.isString();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType51 and parameterizedType75.", functionType51.equals(parameterizedType75) == parameterizedType75.equals(functionType51));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test249");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType48.getTypeOfThis();
        boolean boolean53 = parameterizedType48.removeProperty("function (): {646790426}");
        com.google.javascript.rhino.jstype.JSType jSType55 = parameterizedType48.getPropertyType("NUMBER 0.0 100\n");
        boolean boolean56 = parameterizedType48.isNativeObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType57 = parameterizedType48.getImplicitPrototype();
        com.google.javascript.rhino.jstype.UnionType unionType58 = objectType57.toMaybeUnionType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test250");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        java.lang.String str51 = parameterizedType48.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.ObjectType.Property property53 = parameterizedType48.getSlot("java.io.IOException: java.io.IOException");
        boolean boolean55 = parameterizedType48.isPropertyInExterns("function (): {1382777992}");
        com.google.javascript.rhino.jstype.FunctionType functionType56 = parameterizedType48.getOwnerFunction();
        com.google.javascript.rhino.jstype.FunctionType functionType57 = parameterizedType48.getOwnerFunction();
        boolean boolean59 = parameterizedType48.hasOwnProperty("{proxy:function (): {756515494}}");
        com.google.javascript.rhino.JSDocInfo jSDocInfo61 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean62 = jSDocInfo61.hasThisType();
        boolean boolean63 = jSDocInfo61.hasThisType();
        boolean boolean64 = jSDocInfo61.isExpose();
        java.util.Set<java.lang.String> strSet65 = jSDocInfo61.getParameterNames();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression66 = jSDocInfo61.getEnumParameterType();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList67 = jSDocInfo61.getExtendedInterfaces();
        boolean boolean68 = jSDocInfo61.isConstructor();
        parameterizedType48.setPropertyJSDocInfo("", jSDocInfo61);
        boolean boolean71 = jSDocInfo61.hasParameter("function (): {338536382}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test251");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType50 = parameterizedType48.getIndexType();
        boolean boolean52 = parameterizedType48.hasOwnProperty("function (): {620032704}");
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        jSTypeRegistry55.unregisterPropertyOnType("(Not declared as a type name)", jSType57);
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray61 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType62 = jSTypeRegistry55.createFunctionType(jSType59, true, jSTypeArray61);
        com.google.javascript.rhino.jstype.JSType jSType63 = functionType62.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.ObjectType objectType64 = functionType62.toObjectType();
        boolean boolean65 = objectType64.isBooleanValueType();
        boolean boolean66 = parameterizedType48.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) objectType64);
        com.google.javascript.rhino.JSDocInfo jSDocInfo67 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean68 = jSDocInfo67.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression69 = jSDocInfo67.getBaseType();
        java.lang.String str70 = jSDocInfo67.getFileOverview();
        boolean boolean71 = jSDocInfo67.isOverride();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression72 = jSDocInfo67.getType();
        parameterizedType48.setJSDocInfo(jSDocInfo67);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet74 = parameterizedType48.getPossibleToBooleanOutcomes();
        boolean boolean76 = parameterizedType48.hasProperty("{proxy:function (): {1169425537}}");
        boolean boolean77 = parameterizedType48.isAllType();
        com.google.javascript.rhino.jstype.JSType jSType78 = parameterizedType48.collapseUnion();
        boolean boolean79 = parameterizedType48.isUnknownType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test252");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType48.getTypeOfThis();
        boolean boolean53 = parameterizedType48.removeProperty("function (): {646790426}");
        java.util.Set set54 = parameterizedType48.getOwnPropertyNames();
        boolean boolean55 = parameterizedType48.isNominalType();
        boolean boolean56 = parameterizedType48.isNullable();
        java.util.Set set57 = parameterizedType48.getOwnPropertyNames();
        boolean boolean58 = parameterizedType48.isCheckedUnknownType();
        com.google.javascript.rhino.jstype.FunctionType functionType59 = parameterizedType48.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType60 = functionType59.getPrototype();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType59 and parameterizedType48.", functionType59.equals(parameterizedType48) == parameterizedType48.equals(functionType59));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test253");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType50 = parameterizedType48.getIndexType();
        boolean boolean51 = parameterizedType48.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo53 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean54 = jSDocInfo53.hasThisType();
        boolean boolean55 = jSDocInfo53.shouldPreserveTry();
        boolean boolean56 = jSDocInfo53.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression58 = jSDocInfo53.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean59 = jSDocInfo53.shouldPreserveTry();
        boolean boolean60 = jSDocInfo53.isOverride();
        boolean boolean61 = jSDocInfo53.isNoSideEffects();
        boolean boolean63 = jSDocInfo53.hasParameterType("");
        java.lang.String str64 = jSDocInfo53.getOriginalCommentString();
        parameterizedType48.setPropertyJSDocInfo("function (): {436796145}", jSDocInfo53);
        boolean boolean66 = parameterizedType48.isNominalType();
        java.lang.Iterable iterable67 = parameterizedType48.getCtorImplementedInterfaces();
        com.google.javascript.rhino.JSDocInfo jSDocInfo69 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean70 = jSDocInfo69.hasThisType();
        boolean boolean71 = jSDocInfo69.shouldPreserveTry();
        boolean boolean72 = jSDocInfo69.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression74 = jSDocInfo69.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean75 = jSDocInfo69.shouldPreserveTry();
        boolean boolean76 = jSDocInfo69.isOverride();
        boolean boolean77 = jSDocInfo69.isNoSideEffects();
        boolean boolean79 = jSDocInfo69.hasParameterType("");
        boolean boolean80 = jSDocInfo69.isNoCompile();
        int int81 = jSDocInfo69.getImplementedInterfaceCount();
        boolean boolean82 = jSDocInfo69.hasReturnType();
        parameterizedType48.setPropertyJSDocInfo("function (): {1293550066}", jSDocInfo69);
        java.lang.String str85 = jSDocInfo69.getDescriptionForParameter("");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test254");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49, true);
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        jSTypeRegistry51.unregisterPropertyOnType("(Not declared as a type name)", jSType53);
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, true);
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        jSTypeRegistry57.unregisterPropertyOnType("(Not declared as a type name)", jSType59);
        com.google.javascript.rhino.jstype.JSType jSType61 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray63 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType64 = jSTypeRegistry57.createFunctionType(jSType61, true, jSTypeArray63);
        boolean boolean66 = functionType64.removeProperty("false");
        boolean boolean67 = functionType64.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType68 = jSTypeRegistry51.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType64);
        boolean boolean70 = functionType64.hasProperty("(Not declared as a type name)");
        int int71 = functionType64.getPropertiesCount();
        boolean boolean72 = functionType64.isNominalType();
        boolean boolean73 = parameterizedType48.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType64);
        boolean boolean74 = parameterizedType48.isFunctionPrototypeType();
        com.google.javascript.rhino.jstype.FunctionType functionType75 = parameterizedType48.getOwnerFunction();
        com.google.javascript.rhino.jstype.JSType jSType76 = parameterizedType48.collapseUnion();
        boolean boolean77 = parameterizedType48.isEmptyType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test255");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(0);
        node3.putIntProp((-1), 35);
        boolean boolean7 = node3.isStringKey();
        boolean boolean8 = node3.isThrow();
        com.google.javascript.rhino.Node node9 = node1.useSourceInfoFrom(node3);
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(0);
        node11.putIntProp((-1), 35);
        boolean boolean15 = node11.isReturn();
        com.google.javascript.rhino.InputId inputId16 = node11.getInputId();
        node11.setWasEmptyNode(true);
        int int19 = node9.getIndexOfChild(node11);
        boolean boolean20 = node11.isAssign();
        boolean boolean21 = node11.isLocalResultCall();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile22 = node11.getStaticSourceFile();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(0);
        boolean boolean25 = node24.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile26 = node24.getStaticSourceFile();
        com.google.javascript.rhino.Node node27 = node24.getNext();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(0);
        node29.putIntProp((-1), 35);
        boolean boolean33 = node29.isStringKey();
        boolean boolean34 = node29.isThrow();
        boolean boolean35 = node29.isEmpty();
        com.google.javascript.rhino.Node node36 = node24.copyInformationFrom(node29);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(0);
        node38.putIntProp((-1), 35);
        boolean boolean42 = node38.isReturn();
        com.google.javascript.rhino.Node node43 = node36.srcref(node38);
        boolean boolean44 = node43.isOr();
        boolean boolean45 = node43.isCatch();
        boolean boolean46 = node43.isQuotedString();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(0);
        node49.putIntProp((-1), 35);
        boolean boolean53 = node49.isStringKey();
        boolean boolean54 = node49.isThrow();
        int int55 = node49.getLineno();
        boolean boolean56 = node49.hasChildren();
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node(0);
        node58.putIntProp((-1), 35);
        boolean boolean62 = node49.hasChild(node58);
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node(0);
        boolean boolean65 = node64.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile66 = node64.getStaticSourceFile();
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(0, node58, node64, node70);
        boolean boolean72 = node71.isGetterDef();
        boolean boolean73 = node71.hasMoreThanOneChild();
        node43.addChildrenToBack(node71);
        boolean boolean75 = node71.isArrayLit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node76 = node11.getChildBefore(node71);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test256");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType50 = parameterizedType48.getIndexType();
        boolean boolean51 = parameterizedType48.matchesNumberContext();
        boolean boolean52 = parameterizedType48.isNoResolvedType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType53 = parameterizedType48.toMaybeParameterizedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo54 = null;
        parameterizedType53.setJSDocInfo(jSDocInfo54);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType53.", functionType24.equals(parameterizedType53) == parameterizedType53.equals(functionType24));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test257");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        boolean boolean2 = node1.isInstanceOf();
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(0);
        node4.putIntProp((-1), 35);
        boolean boolean8 = node4.isStringKey();
        boolean boolean9 = node4.isThrow();
        boolean boolean10 = node4.isEmpty();
        com.google.javascript.rhino.Node node11 = node1.useSourceInfoFrom(node4);
        boolean boolean12 = node1.isLocalResultCall();
        node1.putIntProp(40, 43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node17 = node1.getChildAtIndex(40);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test258");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType.Property property52 = parameterizedType48.getSlot("(Not declared as a type name)");
        boolean boolean53 = parameterizedType48.isNoObjectType();
        boolean boolean54 = parameterizedType48.isOrdinaryFunction();
        boolean boolean56 = parameterizedType48.hasOwnProperty("function (): {1657069676}");
        boolean boolean57 = parameterizedType48.isCheckedUnknownType();
        boolean boolean59 = parameterizedType48.isPropertyTypeDeclared("function (): {1533719783}");
        com.google.javascript.rhino.jstype.ObjectType.Property property61 = parameterizedType48.getOwnSlot("{proxy:function (): {1629461247}}");
        com.google.javascript.rhino.JSDocInfo jSDocInfo63 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean64 = jSDocInfo63.hasThisType();
        boolean boolean65 = jSDocInfo63.shouldPreserveTry();
        java.lang.String str66 = jSDocInfo63.getDescription();
        boolean boolean67 = jSDocInfo63.isDeprecated();
        boolean boolean68 = jSDocInfo63.isDefine();
        boolean boolean70 = jSDocInfo63.hasParameterType("");
        boolean boolean71 = jSDocInfo63.isHidden();
        boolean boolean72 = jSDocInfo63.hasType();
        boolean boolean73 = jSDocInfo63.isConsistentIdGenerator();
        parameterizedType48.setPropertyJSDocInfo("function (): {122316613}", jSDocInfo63);
        java.util.Collection<java.lang.String> strCollection75 = jSDocInfo63.getAuthors();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test259");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = functionType9.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        jSTypeRegistry14.unregisterPropertyOnType("(Not declared as a type name)", jSType16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType21 = jSTypeRegistry14.createFunctionType(jSType18, true, jSTypeArray20);
        boolean boolean22 = functionType21.isReturnTypeInferred();
        com.google.javascript.rhino.jstype.JSType jSType23 = functionType9.getGreatestSubtype((com.google.javascript.rhino.jstype.JSType) functionType21);
        boolean boolean24 = functionType21.isAllType();
        java.lang.String str25 = functionType21.toDebugHashCodeString();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, false);
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, true);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        jSTypeRegistry31.unregisterPropertyOnType("(Not declared as a type name)", jSType33);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray37 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry31.createFunctionType(jSType35, true, jSTypeArray37);
        com.google.javascript.rhino.jstype.JSType jSType39 = functionType38.autoboxesTo();
        java.lang.String str40 = functionType38.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41, true);
        com.google.javascript.rhino.jstype.JSType jSType45 = null;
        jSTypeRegistry43.unregisterPropertyOnType("(Not declared as a type name)", jSType45);
        com.google.javascript.rhino.jstype.JSType jSType47 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry43.createFunctionType(jSType47, true, jSTypeArray49);
        com.google.common.collect.ImmutableList<java.lang.String> strList51 = functionType50.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot53 = functionType50.getSlot("NUMBER 0.0 100\n");
        boolean boolean54 = functionType50.isAllType();
        boolean boolean55 = functionType38.hasEqualCallType(functionType50);
        com.google.javascript.rhino.jstype.FunctionType functionType56 = functionType50.getOwnerFunction();
        java.util.Set<java.lang.String> strSet57 = functionType50.getOwnPropertyNames();
        boolean boolean58 = functionType50.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        jSTypeRegistry61.unregisterPropertyOnType("(Not declared as a type name)", jSType63);
        com.google.javascript.rhino.jstype.JSType jSType65 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray67 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType68 = jSTypeRegistry61.createFunctionType(jSType65, true, jSTypeArray67);
        boolean boolean69 = functionType68.isReturnTypeInferred();
        boolean boolean70 = functionType68.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType72 = functionType68.getBindReturnType((int) (short) 1);
        java.lang.String str73 = functionType72.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType74 = jSTypeRegistry28.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType50, (com.google.javascript.rhino.jstype.JSType) functionType72);
        com.google.javascript.rhino.JSDocInfo jSDocInfo76 = parameterizedType74.getOwnPropertyJSDocInfo("");
        java.lang.String str77 = parameterizedType74.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.ObjectType.Property property79 = parameterizedType74.getSlot("java.io.IOException: java.io.IOException");
        boolean boolean81 = parameterizedType74.isPropertyTypeDeclared("function (): {1393951772}");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue82 = functionType21.testForEquality((com.google.javascript.rhino.jstype.JSType) parameterizedType74);
        com.google.javascript.rhino.Node node83 = functionType21.getParametersNode();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType50 and parameterizedType74.", functionType50.equals(parameterizedType74) == parameterizedType74.equals(functionType50));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test260");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType.Property property52 = parameterizedType48.getSlot("(Not declared as a type name)");
        boolean boolean53 = parameterizedType48.isNoObjectType();
        java.lang.Iterable iterable54 = parameterizedType48.getCtorImplementedInterfaces();
        boolean boolean56 = parameterizedType48.hasProperty("(function (): {480423885})");
        com.google.javascript.rhino.jstype.JSType jSType58 = parameterizedType48.getPropertyType("(function (): {480423885})");
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        jSTypeRegistry61.unregisterPropertyOnType("(Not declared as a type name)", jSType63);
        com.google.javascript.rhino.jstype.JSType jSType65 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray67 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType68 = jSTypeRegistry61.createFunctionType(jSType65, true, jSTypeArray67);
        boolean boolean70 = functionType68.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter71 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter71, true);
        com.google.javascript.rhino.jstype.JSType jSType75 = null;
        jSTypeRegistry73.unregisterPropertyOnType("(Not declared as a type name)", jSType75);
        com.google.javascript.rhino.jstype.JSType jSType77 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray79 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType80 = jSTypeRegistry73.createFunctionType(jSType77, true, jSTypeArray79);
        boolean boolean81 = functionType80.isReturnTypeInferred();
        com.google.javascript.rhino.jstype.JSType jSType82 = functionType68.getGreatestSubtype((com.google.javascript.rhino.jstype.JSType) functionType80);
        java.util.Set<java.lang.String> strSet83 = functionType68.getOwnPropertyNames();
        boolean boolean84 = parameterizedType48.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType68);
        boolean boolean86 = functionType68.hasOwnProperty("function (): {1241051621}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test261");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType50 = parameterizedType48.getIndexType();
        boolean boolean51 = parameterizedType48.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo53 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean54 = jSDocInfo53.hasThisType();
        boolean boolean55 = jSDocInfo53.shouldPreserveTry();
        boolean boolean56 = jSDocInfo53.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression58 = jSDocInfo53.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean59 = jSDocInfo53.shouldPreserveTry();
        boolean boolean60 = jSDocInfo53.isOverride();
        boolean boolean61 = jSDocInfo53.isNoSideEffects();
        boolean boolean63 = jSDocInfo53.hasParameterType("");
        java.lang.String str64 = jSDocInfo53.getOriginalCommentString();
        parameterizedType48.setPropertyJSDocInfo("function (): {436796145}", jSDocInfo53);
        boolean boolean66 = parameterizedType48.isNominalType();
        java.lang.Iterable iterable67 = parameterizedType48.getCtorImplementedInterfaces();
        com.google.javascript.rhino.JSDocInfo jSDocInfo69 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean70 = jSDocInfo69.hasThisType();
        boolean boolean71 = jSDocInfo69.shouldPreserveTry();
        boolean boolean72 = jSDocInfo69.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression74 = jSDocInfo69.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean75 = jSDocInfo69.shouldPreserveTry();
        boolean boolean76 = jSDocInfo69.isOverride();
        boolean boolean77 = jSDocInfo69.isNoSideEffects();
        boolean boolean79 = jSDocInfo69.hasParameterType("");
        boolean boolean80 = jSDocInfo69.isNoCompile();
        int int81 = jSDocInfo69.getImplementedInterfaceCount();
        boolean boolean82 = jSDocInfo69.hasReturnType();
        parameterizedType48.setPropertyJSDocInfo("function (): {1293550066}", jSDocInfo69);
        java.util.Collection<java.lang.String> strCollection84 = jSDocInfo69.getReferences();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test262");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.EnumType enumType14 = functionType12.toMaybeEnumType();
        com.google.javascript.rhino.jstype.FunctionType functionType15 = functionType12.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry2.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType12);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.TemplateType templateType18 = objectType17.toMaybeTemplateType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet19 = objectType17.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20, false);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        jSTypeRegistry25.unregisterPropertyOnType("(Not declared as a type name)", jSType27);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray31 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry25.createFunctionType(jSType29, true, jSTypeArray31);
        com.google.javascript.rhino.jstype.JSType jSType33 = functionType32.autoboxesTo();
        java.lang.String str34 = functionType32.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35, true);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        jSTypeRegistry37.unregisterPropertyOnType("(Not declared as a type name)", jSType39);
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray43 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry37.createFunctionType(jSType41, true, jSTypeArray43);
        com.google.common.collect.ImmutableList<java.lang.String> strList45 = functionType44.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot47 = functionType44.getSlot("NUMBER 0.0 100\n");
        boolean boolean48 = functionType44.isAllType();
        boolean boolean49 = functionType32.hasEqualCallType(functionType44);
        com.google.javascript.rhino.jstype.FunctionType functionType50 = functionType44.getOwnerFunction();
        java.util.Set<java.lang.String> strSet51 = functionType44.getOwnPropertyNames();
        boolean boolean52 = functionType44.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        jSTypeRegistry55.unregisterPropertyOnType("(Not declared as a type name)", jSType57);
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray61 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType62 = jSTypeRegistry55.createFunctionType(jSType59, true, jSTypeArray61);
        boolean boolean63 = functionType62.isReturnTypeInferred();
        boolean boolean64 = functionType62.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType62.getBindReturnType((int) (short) 1);
        java.lang.String str67 = functionType66.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType68 = jSTypeRegistry22.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType44, (com.google.javascript.rhino.jstype.JSType) functionType66);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet69 = parameterizedType68.getPossibleToBooleanOutcomes();
        boolean boolean70 = parameterizedType68.isDateType();
        boolean boolean71 = parameterizedType68.canBeCalled();
        parameterizedType68.clearCachedValues();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet73 = parameterizedType68.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet74 = booleanLiteralSet19.intersection(booleanLiteralSet73);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType44 and parameterizedType68.", functionType44.equals(parameterizedType68) == parameterizedType68.equals(functionType44));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test263");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType9.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.ObjectType objectType11 = functionType9.toObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        jSTypeRegistry15.unregisterPropertyOnType("(Not declared as a type name)", jSType17);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19, true);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        jSTypeRegistry21.unregisterPropertyOnType("(Not declared as a type name)", jSType23);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType28 = jSTypeRegistry21.createFunctionType(jSType25, true, jSTypeArray27);
        boolean boolean30 = functionType28.removeProperty("false");
        boolean boolean31 = functionType28.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType32 = jSTypeRegistry15.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType28);
        com.google.javascript.rhino.jstype.JSType jSType33 = functionType9.forceResolve(errorReporter12, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType28);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = functionType28.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35, false);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38, true);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        jSTypeRegistry40.unregisterPropertyOnType("(Not declared as a type name)", jSType42);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray46 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType47 = jSTypeRegistry40.createFunctionType(jSType44, true, jSTypeArray46);
        com.google.javascript.rhino.jstype.JSType jSType48 = functionType47.autoboxesTo();
        java.lang.String str49 = functionType47.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50, true);
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        jSTypeRegistry52.unregisterPropertyOnType("(Not declared as a type name)", jSType54);
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType59 = jSTypeRegistry52.createFunctionType(jSType56, true, jSTypeArray58);
        com.google.common.collect.ImmutableList<java.lang.String> strList60 = functionType59.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot62 = functionType59.getSlot("NUMBER 0.0 100\n");
        boolean boolean63 = functionType59.isAllType();
        boolean boolean64 = functionType47.hasEqualCallType(functionType59);
        com.google.javascript.rhino.jstype.FunctionType functionType65 = functionType59.getOwnerFunction();
        java.util.Set<java.lang.String> strSet66 = functionType59.getOwnPropertyNames();
        boolean boolean67 = functionType59.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter68 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter68, true);
        com.google.javascript.rhino.jstype.JSType jSType72 = null;
        jSTypeRegistry70.unregisterPropertyOnType("(Not declared as a type name)", jSType72);
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray76 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType77 = jSTypeRegistry70.createFunctionType(jSType74, true, jSTypeArray76);
        boolean boolean78 = functionType77.isReturnTypeInferred();
        boolean boolean79 = functionType77.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType81 = functionType77.getBindReturnType((int) (short) 1);
        java.lang.String str82 = functionType81.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType83 = jSTypeRegistry37.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType59, (com.google.javascript.rhino.jstype.JSType) functionType81);
        boolean boolean84 = parameterizedType83.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType85 = parameterizedType83.getIndexType();
        com.google.javascript.rhino.Node node87 = parameterizedType83.getPropertyNode("function (): {259080799}");
        java.lang.String str88 = parameterizedType83.getDisplayName();
        boolean boolean90 = parameterizedType83.isPropertyInExterns("hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType91 = parameterizedType83.getConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType92 = parameterizedType83.toObjectType();
        com.google.javascript.rhino.jstype.JSType jSType93 = functionType28.getLeastSupertype((com.google.javascript.rhino.jstype.JSType) parameterizedType83);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType59 and parameterizedType83.", functionType59.equals(parameterizedType83) == parameterizedType83.equals(functionType59));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test264");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType48.getTypeOfThis();
        boolean boolean53 = parameterizedType48.removeProperty("function (): {646790426}");
        boolean boolean54 = parameterizedType48.canBeCalled();
        boolean boolean56 = parameterizedType48.isPropertyTypeDeclared("function (): {367372378}");
        java.lang.String str57 = parameterizedType48.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.FunctionType functionType58 = parameterizedType48.toMaybeFunctionType();
        boolean boolean60 = functionType58.isPropertyTypeDeclared("NUMBER 0.0\n");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType58 and parameterizedType48.", functionType58.equals(parameterizedType48) == parameterizedType48.equals(functionType58));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test265");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType50 = parameterizedType48.getIndexType();
        boolean boolean51 = parameterizedType48.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo53 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean54 = jSDocInfo53.hasThisType();
        boolean boolean55 = jSDocInfo53.shouldPreserveTry();
        boolean boolean56 = jSDocInfo53.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression58 = jSDocInfo53.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean59 = jSDocInfo53.shouldPreserveTry();
        boolean boolean60 = jSDocInfo53.isOverride();
        boolean boolean61 = jSDocInfo53.isNoSideEffects();
        boolean boolean63 = jSDocInfo53.hasParameterType("");
        java.lang.String str64 = jSDocInfo53.getOriginalCommentString();
        parameterizedType48.setPropertyJSDocInfo("function (): {436796145}", jSDocInfo53);
        boolean boolean66 = parameterizedType48.hasReferenceName();
        com.google.javascript.rhino.jstype.TemplateType templateType67 = parameterizedType48.toMaybeTemplateType();
        com.google.javascript.rhino.jstype.ObjectType objectType68 = parameterizedType48.getTypeOfThis();
        com.google.javascript.rhino.JSDocInfo jSDocInfo69 = objectType68.getJSDocInfo();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test266");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType48.getTypeOfThis();
        boolean boolean53 = parameterizedType48.removeProperty("function (): {646790426}");
        com.google.javascript.rhino.jstype.JSType jSType55 = parameterizedType48.getPropertyType("NUMBER 0.0 100\n");
        boolean boolean56 = parameterizedType48.isNativeObjectType();
        boolean boolean57 = parameterizedType48.isInstanceType();
        com.google.javascript.rhino.ErrorReporter errorReporter58 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter58, true);
        com.google.javascript.rhino.jstype.JSType jSType62 = null;
        jSTypeRegistry60.unregisterPropertyOnType("(Not declared as a type name)", jSType62);
        com.google.javascript.rhino.jstype.JSType jSType64 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray66 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType67 = jSTypeRegistry60.createFunctionType(jSType64, true, jSTypeArray66);
        boolean boolean68 = functionType67.isReturnTypeInferred();
        boolean boolean69 = functionType67.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType71 = functionType67.getBindReturnType((int) (short) 1);
        com.google.javascript.rhino.ErrorReporter errorReporter72 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry74 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter72, true);
        com.google.javascript.rhino.jstype.JSType jSType76 = null;
        jSTypeRegistry74.unregisterPropertyOnType("(Not declared as a type name)", jSType76);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray80 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType81 = jSTypeRegistry74.createFunctionType(jSType78, true, jSTypeArray80);
        com.google.common.collect.ImmutableList<java.lang.String> strList82 = functionType81.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.ObjectType.Property property84 = functionType81.getSlot("function (): ?");
        boolean boolean85 = functionType81.isInterface();
        com.google.javascript.rhino.jstype.ObjectType objectType86 = functionType81.getImplicitPrototype();
        functionType67.setPrototypeBasedOn(objectType86);
        boolean boolean88 = functionType67.matchesObjectContext();
        com.google.javascript.rhino.jstype.JSType jSType89 = parameterizedType48.getLeastSupertype((com.google.javascript.rhino.jstype.JSType) functionType67);
        com.google.javascript.rhino.jstype.JSType jSType90 = jSType89.unboxesTo();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test267");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("(function (): {480423885})", (int) ' ', 8);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 2, 39, 46);
        com.google.javascript.rhino.Node node8 = node7.getLastSibling();
        java.lang.String str9 = node3.checkTreeEquals(node8);
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(0);
        node13.putIntProp((-1), 35);
        boolean boolean17 = node13.isStringKey();
        boolean boolean18 = node13.isThrow();
        com.google.javascript.rhino.Node node19 = node11.useSourceInfoFrom(node13);
        boolean boolean20 = node19.isIn();
        boolean boolean21 = node19.isVoid();
        com.google.javascript.rhino.jstype.JSType jSType22 = node19.getJSType();
        boolean boolean23 = node19.isCall();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node24 = node8.getChildBefore(node19);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test268");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList6 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray5);
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList9 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9, charSequenceArray8);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator11 = charSequenceList9.spliterator();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(0);
        node14.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(32, node14);
        boolean boolean19 = node18.isGetterDef();
        boolean boolean20 = charSequenceList9.equals((java.lang.Object) boolean19);
        boolean boolean22 = charSequenceList9.add((java.lang.CharSequence) "[hi!, hi!, , , hi!]");
        boolean boolean23 = charSequenceList6.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(0);
        node25.putIntProp((-1), 35);
        boolean boolean29 = node25.isStringKey();
        boolean boolean30 = node25.isThrow();
        int int31 = charSequenceList6.indexOf((java.lang.Object) node25);
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream32 = charSequenceList6.parallelStream();
        boolean boolean33 = charSequenceList6.isEmpty();
        java.lang.Object[] objArray34 = charSequenceList6.toArray();
        java.lang.Object[] objArray35 = charSequenceList6.toArray();
        int int37 = charSequenceList6.indexOf((java.lang.Object) "function (): {2115759764}");
        java.lang.Object[] objArray38 = charSequenceList6.toArray();
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, false);
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, true);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        jSTypeRegistry44.unregisterPropertyOnType("(Not declared as a type name)", jSType46);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray50 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType51 = jSTypeRegistry44.createFunctionType(jSType48, true, jSTypeArray50);
        com.google.javascript.rhino.jstype.JSType jSType52 = functionType51.autoboxesTo();
        java.lang.String str53 = functionType51.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        jSTypeRegistry56.unregisterPropertyOnType("(Not declared as a type name)", jSType58);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray62 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry56.createFunctionType(jSType60, true, jSTypeArray62);
        com.google.common.collect.ImmutableList<java.lang.String> strList64 = functionType63.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot66 = functionType63.getSlot("NUMBER 0.0 100\n");
        boolean boolean67 = functionType63.isAllType();
        boolean boolean68 = functionType51.hasEqualCallType(functionType63);
        com.google.javascript.rhino.jstype.FunctionType functionType69 = functionType63.getOwnerFunction();
        java.util.Set<java.lang.String> strSet70 = functionType63.getOwnPropertyNames();
        boolean boolean71 = functionType63.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter72 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry74 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter72, true);
        com.google.javascript.rhino.jstype.JSType jSType76 = null;
        jSTypeRegistry74.unregisterPropertyOnType("(Not declared as a type name)", jSType76);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray80 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType81 = jSTypeRegistry74.createFunctionType(jSType78, true, jSTypeArray80);
        boolean boolean82 = functionType81.isReturnTypeInferred();
        boolean boolean83 = functionType81.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType85 = functionType81.getBindReturnType((int) (short) 1);
        java.lang.String str86 = functionType85.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType87 = jSTypeRegistry41.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType63, (com.google.javascript.rhino.jstype.JSType) functionType85);
        com.google.javascript.rhino.JSDocInfo jSDocInfo89 = parameterizedType87.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType90 = parameterizedType87.getTypeOfThis();
        boolean boolean92 = parameterizedType87.removeProperty("function (): {646790426}");
        java.util.Set set93 = parameterizedType87.getOwnPropertyNames();
        boolean boolean95 = parameterizedType87.hasOwnProperty("function (): {1638710513}");
        boolean boolean96 = charSequenceList6.equals((java.lang.Object) "function (): {1638710513}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType63 and parameterizedType87.", functionType63.equals(parameterizedType87) == parameterizedType87.equals(functionType63));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test269");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType50 = parameterizedType48.getIndexType();
        com.google.javascript.rhino.Node node52 = parameterizedType48.getPropertyNode("function (): {259080799}");
        java.lang.String str53 = parameterizedType48.getDisplayName();
        boolean boolean55 = parameterizedType48.isPropertyInExterns("hi!");
        com.google.javascript.rhino.jstype.UnionType unionType56 = parameterizedType48.toMaybeUnionType();
        boolean boolean57 = parameterizedType48.isInterface();
        boolean boolean58 = parameterizedType48.isNullType();
        com.google.javascript.rhino.jstype.JSType jSType59 = parameterizedType48.getIndexType();
        boolean boolean60 = parameterizedType48.isNoObjectType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo62 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean63 = jSDocInfo62.hasThisType();
        boolean boolean64 = jSDocInfo62.shouldPreserveTry();
        boolean boolean65 = jSDocInfo62.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression67 = jSDocInfo62.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean68 = jSDocInfo62.isHidden();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression69 = jSDocInfo62.getBaseType();
        parameterizedType48.setPropertyJSDocInfo("function (): {212001078}", jSDocInfo62);
        boolean boolean71 = jSDocInfo62.hasFileOverview();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test270");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType48.getTypeOfThis();
        boolean boolean53 = parameterizedType48.removeProperty("function (): {646790426}");
        com.google.javascript.rhino.jstype.JSType jSType55 = parameterizedType48.getPropertyType("NUMBER 0.0 100\n");
        boolean boolean56 = parameterizedType48.isNativeObjectType();
        com.google.javascript.rhino.jstype.FunctionType functionType57 = parameterizedType48.toMaybeFunctionType();
        boolean boolean58 = functionType57.isStringValueType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType57 and parameterizedType48.", functionType57.equals(parameterizedType48) == parameterizedType48.equals(functionType57));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test271");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType.Property property52 = parameterizedType48.getSlot("(Not declared as a type name)");
        boolean boolean53 = parameterizedType48.isNoObjectType();
        java.lang.Iterable iterable54 = parameterizedType48.getCtorImplementedInterfaces();
        java.lang.String str55 = parameterizedType48.toDebugHashCodeString();
        java.lang.String str56 = parameterizedType48.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.JSType jSType57 = parameterizedType48.autobox();
        boolean boolean58 = parameterizedType48.isInterface();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test272");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType.Property property52 = parameterizedType48.getSlot("(Not declared as a type name)");
        boolean boolean53 = parameterizedType48.isNoObjectType();
        boolean boolean54 = parameterizedType48.isOrdinaryFunction();
        boolean boolean56 = parameterizedType48.hasOwnProperty("function (): {1657069676}");
        boolean boolean57 = parameterizedType48.isCheckedUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType58 = parameterizedType48.getParameterType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType59 = parameterizedType48.toMaybeParameterizedType();
        boolean boolean60 = parameterizedType59.hasReferenceName();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType59.", functionType24.equals(parameterizedType59) == parameterizedType59.equals(functionType24));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test273");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = functionType9.getTemplateTypeNames();
        boolean boolean11 = functionType9.isConstructor();
        com.google.javascript.rhino.jstype.JSType jSType12 = functionType9.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, false);
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        jSTypeRegistry18.unregisterPropertyOnType("(Not declared as a type name)", jSType20);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry18.createFunctionType(jSType22, true, jSTypeArray24);
        com.google.javascript.rhino.jstype.JSType jSType26 = functionType25.autoboxesTo();
        java.lang.String str27 = functionType25.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        jSTypeRegistry30.unregisterPropertyOnType("(Not declared as a type name)", jSType32);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry30.createFunctionType(jSType34, true, jSTypeArray36);
        com.google.common.collect.ImmutableList<java.lang.String> strList38 = functionType37.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot40 = functionType37.getSlot("NUMBER 0.0 100\n");
        boolean boolean41 = functionType37.isAllType();
        boolean boolean42 = functionType25.hasEqualCallType(functionType37);
        com.google.javascript.rhino.jstype.FunctionType functionType43 = functionType37.getOwnerFunction();
        java.util.Set<java.lang.String> strSet44 = functionType37.getOwnPropertyNames();
        boolean boolean45 = functionType37.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, true);
        com.google.javascript.rhino.jstype.JSType jSType50 = null;
        jSTypeRegistry48.unregisterPropertyOnType("(Not declared as a type name)", jSType50);
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray54 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType55 = jSTypeRegistry48.createFunctionType(jSType52, true, jSTypeArray54);
        boolean boolean56 = functionType55.isReturnTypeInferred();
        boolean boolean57 = functionType55.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType59 = functionType55.getBindReturnType((int) (short) 1);
        java.lang.String str60 = functionType59.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType61 = jSTypeRegistry15.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType37, (com.google.javascript.rhino.jstype.JSType) functionType59);
        boolean boolean62 = parameterizedType61.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType63 = parameterizedType61.getIndexType();
        com.google.javascript.rhino.Node node65 = parameterizedType61.getPropertyNode("function (): {259080799}");
        boolean boolean66 = parameterizedType61.hasReferenceName();
        boolean boolean67 = parameterizedType61.isCheckedUnknownType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue68 = functionType9.testForEquality((com.google.javascript.rhino.jstype.JSType) parameterizedType61);
        com.google.javascript.rhino.ErrorReporter errorReporter69 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter69, true);
        com.google.javascript.rhino.jstype.JSType jSType73 = null;
        jSTypeRegistry71.unregisterPropertyOnType("(Not declared as a type name)", jSType73);
        com.google.javascript.rhino.ErrorReporter errorReporter75 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter75, true);
        com.google.javascript.rhino.jstype.JSType jSType79 = null;
        jSTypeRegistry77.unregisterPropertyOnType("(Not declared as a type name)", jSType79);
        com.google.javascript.rhino.jstype.JSType jSType81 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray83 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType84 = jSTypeRegistry77.createFunctionType(jSType81, true, jSTypeArray83);
        boolean boolean86 = functionType84.removeProperty("false");
        boolean boolean87 = functionType84.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType88 = jSTypeRegistry71.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType84);
        com.google.javascript.rhino.jstype.JSType jSType89 = functionType84.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType91 = functionType84.getPropertyType("");
        boolean boolean92 = functionType84.hasInstanceType();
        boolean boolean93 = functionType84.matchesNumberContext();
        boolean boolean94 = functionType84.isCheckedUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType95 = functionType84.getTypeOfThis();
        boolean boolean96 = jSType95.isNominalType();
        boolean boolean97 = functionType9.isSubtype(jSType95);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType37 and parameterizedType61.", functionType37.equals(parameterizedType61) == parameterizedType61.equals(functionType37));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test274");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        java.lang.String str51 = parameterizedType48.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.JSType jSType52 = parameterizedType48.collapseUnion();
        boolean boolean53 = parameterizedType48.isNullable();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test275");
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(0);
        boolean boolean3 = node2.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile4 = node2.getStaticSourceFile();
        java.lang.String str5 = node2.getSourceFileName();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(0);
        boolean boolean8 = node7.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile9 = node7.getStaticSourceFile();
        com.google.javascript.rhino.Node node10 = node7.getNext();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(0);
        node12.putIntProp((-1), 35);
        boolean boolean16 = node12.isStringKey();
        boolean boolean17 = node12.isThrow();
        boolean boolean18 = node12.isEmpty();
        com.google.javascript.rhino.Node node19 = node7.copyInformationFrom(node12);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(0);
        node23.putIntProp((-1), 35);
        boolean boolean27 = node23.isStringKey();
        boolean boolean28 = node23.isThrow();
        com.google.javascript.rhino.Node node29 = node21.useSourceInfoFrom(node23);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(0);
        boolean boolean32 = node31.isCall();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(0);
        node35.putIntProp((-1), 35);
        boolean boolean39 = node35.isReturn();
        com.google.common.collect.ImmutableList<java.lang.Object> objList40 = com.google.common.collect.ImmutableList.of((java.lang.Object) node7, (java.lang.Object) node23, (java.lang.Object) node31, (java.lang.Object) 53, (java.lang.Object) node35);
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(0);
        boolean boolean43 = node42.isInstanceOf();
        node35.addChildrenToFront(node42);
        int int45 = node35.getSourceOffset();
        boolean boolean46 = node35.isVoid();
        com.google.javascript.rhino.Node node47 = node2.useSourceInfoIfMissingFrom(node35);
        boolean boolean48 = node35.isEmpty();
        boolean boolean49 = node35.hasMoreThanOneChild();
        boolean boolean50 = node35.isString();
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node(42, node35, 37, 37);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node55 = node53.getChildAtIndex(47);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test276");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49, true);
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        jSTypeRegistry51.unregisterPropertyOnType("(Not declared as a type name)", jSType53);
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, true);
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        jSTypeRegistry57.unregisterPropertyOnType("(Not declared as a type name)", jSType59);
        com.google.javascript.rhino.jstype.JSType jSType61 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray63 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType64 = jSTypeRegistry57.createFunctionType(jSType61, true, jSTypeArray63);
        boolean boolean66 = functionType64.removeProperty("false");
        boolean boolean67 = functionType64.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType68 = jSTypeRegistry51.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType64);
        boolean boolean70 = functionType64.hasProperty("(Not declared as a type name)");
        int int71 = functionType64.getPropertiesCount();
        boolean boolean72 = functionType64.isNominalType();
        boolean boolean73 = parameterizedType48.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType64);
        boolean boolean74 = parameterizedType48.isFunctionPrototypeType();
        com.google.javascript.rhino.jstype.ObjectType objectType75 = parameterizedType48.dereference();
        boolean boolean77 = parameterizedType48.isPropertyTypeDeclared("function (): {1638710513}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test277");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType48.getTypeOfThis();
        boolean boolean53 = parameterizedType48.removeProperty("function (): {646790426}");
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        jSTypeRegistry56.unregisterPropertyOnType("(Not declared as a type name)", jSType58);
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60, true);
        com.google.javascript.rhino.jstype.JSType jSType64 = null;
        jSTypeRegistry62.unregisterPropertyOnType("(Not declared as a type name)", jSType64);
        com.google.javascript.rhino.jstype.JSType jSType66 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray68 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType69 = jSTypeRegistry62.createFunctionType(jSType66, true, jSTypeArray68);
        boolean boolean71 = functionType69.removeProperty("false");
        boolean boolean72 = functionType69.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType73 = jSTypeRegistry56.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType69);
        com.google.javascript.rhino.ErrorReporter errorReporter75 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter75, true);
        com.google.javascript.rhino.jstype.JSType jSType79 = null;
        jSTypeRegistry77.unregisterPropertyOnType("(Not declared as a type name)", jSType79);
        com.google.javascript.rhino.jstype.JSType jSType81 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray83 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType84 = jSTypeRegistry77.createFunctionType(jSType81, true, jSTypeArray83);
        com.google.javascript.rhino.jstype.JSType jSType85 = functionType84.autoboxesTo();
        boolean boolean86 = jSTypeRegistry56.declareType("JSDocInfo", (com.google.javascript.rhino.jstype.JSType) functionType84);
        boolean boolean87 = functionType84.isNoObjectType();
        boolean boolean88 = parameterizedType48.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType84);
        com.google.javascript.rhino.jstype.FunctionType functionType89 = parameterizedType48.getConstructor();
        java.lang.Iterable iterable90 = parameterizedType48.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType91 = parameterizedType48.collapseUnion();
        boolean boolean92 = parameterizedType48.isNoType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test278");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType.Property property52 = parameterizedType48.getSlot("(Not declared as a type name)");
        boolean boolean53 = parameterizedType48.isNoObjectType();
        java.lang.Iterable iterable54 = parameterizedType48.getCtorImplementedInterfaces();
        java.lang.String str55 = parameterizedType48.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.JSType jSType57 = parameterizedType48.getPropertyType("function ");
        com.google.javascript.rhino.jstype.ObjectType objectType58 = parameterizedType48.getImplicitPrototype();
        boolean boolean59 = objectType58.isNumber();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test279");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        java.lang.String str51 = parameterizedType48.toDebugHashCodeString();
        boolean boolean52 = parameterizedType48.isNullable();
        com.google.javascript.rhino.jstype.JSType jSType53 = parameterizedType48.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.JSType jSType55 = parameterizedType48.getPropertyType("function (): {1115692128}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test280");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType48.getTypeOfThis();
        boolean boolean53 = parameterizedType48.removeProperty("function (): {646790426}");
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        jSTypeRegistry56.unregisterPropertyOnType("(Not declared as a type name)", jSType58);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray62 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry56.createFunctionType(jSType60, true, jSTypeArray62);
        com.google.common.collect.ImmutableList<java.lang.String> strList64 = functionType63.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot66 = functionType63.getSlot("NUMBER 0.0 100\n");
        boolean boolean67 = functionType63.isAllType();
        com.google.javascript.rhino.ErrorReporter errorReporter68 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter68, true);
        com.google.javascript.rhino.jstype.JSType jSType72 = null;
        jSTypeRegistry70.unregisterPropertyOnType("(Not declared as a type name)", jSType72);
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray76 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType77 = jSTypeRegistry70.createFunctionType(jSType74, true, jSTypeArray76);
        boolean boolean79 = functionType77.removeProperty("false");
        com.google.javascript.rhino.jstype.JSType jSType81 = functionType77.findPropertyType("Not declared as a type name");
        boolean boolean82 = functionType63.differsFrom((com.google.javascript.rhino.jstype.JSType) functionType77);
        com.google.javascript.rhino.ErrorReporter errorReporter83 = null;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope84 = null;
        com.google.javascript.rhino.jstype.JSType jSType85 = functionType77.resolve(errorReporter83, jSTypeStaticScope84);
        boolean boolean86 = functionType77.isNullable();
        boolean boolean87 = parameterizedType48.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType77);
        com.google.javascript.rhino.jstype.FunctionType functionType88 = parameterizedType48.toMaybeFunctionType();
        int int89 = functionType88.getPropertiesCount();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType88 and parameterizedType48.", functionType88.equals(parameterizedType48) == parameterizedType48.equals(functionType88));
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test281");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType50 = parameterizedType48.getIndexType();
        com.google.javascript.rhino.Node node52 = parameterizedType48.getPropertyNode("function (): {259080799}");
        boolean boolean53 = parameterizedType48.hasReferenceName();
        boolean boolean54 = parameterizedType48.isCheckedUnknownType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo55 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean56 = jSDocInfo55.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression57 = jSDocInfo55.getBaseType();
        java.lang.String str58 = jSDocInfo55.getLicense();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList59 = jSDocInfo55.getImplementedInterfaces();
        java.lang.String str60 = jSDocInfo55.getBlockDescription();
        boolean boolean61 = jSDocInfo55.isNoSideEffects();
        parameterizedType48.setJSDocInfo(jSDocInfo55);
        java.util.Collection<java.lang.String> strCollection63 = jSDocInfo55.getAuthors();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test282");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType48.getTypeOfThis();
        boolean boolean53 = parameterizedType48.removeProperty("function (): {646790426}");
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        jSTypeRegistry56.unregisterPropertyOnType("(Not declared as a type name)", jSType58);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray62 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry56.createFunctionType(jSType60, true, jSTypeArray62);
        com.google.common.collect.ImmutableList<java.lang.String> strList64 = functionType63.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot66 = functionType63.getSlot("NUMBER 0.0 100\n");
        boolean boolean67 = functionType63.isAllType();
        com.google.javascript.rhino.ErrorReporter errorReporter68 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter68, true);
        com.google.javascript.rhino.jstype.JSType jSType72 = null;
        jSTypeRegistry70.unregisterPropertyOnType("(Not declared as a type name)", jSType72);
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray76 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType77 = jSTypeRegistry70.createFunctionType(jSType74, true, jSTypeArray76);
        boolean boolean79 = functionType77.removeProperty("false");
        com.google.javascript.rhino.jstype.JSType jSType81 = functionType77.findPropertyType("Not declared as a type name");
        boolean boolean82 = functionType63.differsFrom((com.google.javascript.rhino.jstype.JSType) functionType77);
        com.google.javascript.rhino.ErrorReporter errorReporter83 = null;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope84 = null;
        com.google.javascript.rhino.jstype.JSType jSType85 = functionType77.resolve(errorReporter83, jSTypeStaticScope84);
        boolean boolean86 = functionType77.isNullable();
        boolean boolean87 = parameterizedType48.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType77);
        com.google.javascript.rhino.jstype.TemplateType templateType88 = parameterizedType48.toMaybeTemplateType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo90 = parameterizedType48.getOwnPropertyJSDocInfo("function (): {581361697}");
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType91 = parameterizedType48.toMaybeParameterizedType();
        boolean boolean92 = parameterizedType48.isNoResolvedType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test283");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType50 = parameterizedType48.getIndexType();
        boolean boolean51 = parameterizedType48.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo53 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean54 = jSDocInfo53.hasThisType();
        boolean boolean55 = jSDocInfo53.shouldPreserveTry();
        boolean boolean56 = jSDocInfo53.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression58 = jSDocInfo53.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean59 = jSDocInfo53.shouldPreserveTry();
        boolean boolean60 = jSDocInfo53.isOverride();
        boolean boolean61 = jSDocInfo53.isNoSideEffects();
        boolean boolean63 = jSDocInfo53.hasParameterType("");
        java.lang.String str64 = jSDocInfo53.getOriginalCommentString();
        parameterizedType48.setPropertyJSDocInfo("function (): {436796145}", jSDocInfo53);
        boolean boolean66 = parameterizedType48.isNominalType();
        java.lang.Iterable iterable67 = parameterizedType48.getCtorImplementedInterfaces();
        com.google.javascript.rhino.JSDocInfo jSDocInfo69 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean70 = jSDocInfo69.hasThisType();
        boolean boolean71 = jSDocInfo69.shouldPreserveTry();
        boolean boolean72 = jSDocInfo69.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression74 = jSDocInfo69.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean75 = jSDocInfo69.shouldPreserveTry();
        boolean boolean76 = jSDocInfo69.isOverride();
        boolean boolean77 = jSDocInfo69.isNoSideEffects();
        boolean boolean79 = jSDocInfo69.hasParameterType("");
        boolean boolean80 = jSDocInfo69.isNoCompile();
        int int81 = jSDocInfo69.getImplementedInterfaceCount();
        boolean boolean82 = jSDocInfo69.hasReturnType();
        parameterizedType48.setPropertyJSDocInfo("function (): {1293550066}", jSDocInfo69);
        java.util.Set<java.lang.String> strSet84 = jSDocInfo69.getSuppressions();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test284");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean10 = functionType9.hasReferenceName();
        boolean boolean11 = functionType9.isConstructor();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        jSTypeRegistry14.unregisterPropertyOnType("(Not declared as a type name)", jSType16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType21 = jSTypeRegistry14.createFunctionType(jSType18, true, jSTypeArray20);
        boolean boolean22 = functionType21.isReturnTypeInferred();
        boolean boolean23 = functionType21.hasReferenceName();
        boolean boolean24 = functionType9.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType21);
        com.google.javascript.rhino.JSDocInfo jSDocInfo26 = functionType9.getOwnPropertyJSDocInfo("function (): {1685012791}");
        boolean boolean27 = functionType9.isString();
        java.lang.String str28 = functionType9.getDisplayName();
        boolean boolean29 = functionType9.isVoidType();
        boolean boolean30 = functionType9.hasInstanceType();
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, false);
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, true);
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        jSTypeRegistry36.unregisterPropertyOnType("(Not declared as a type name)", jSType38);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray42 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType43 = jSTypeRegistry36.createFunctionType(jSType40, true, jSTypeArray42);
        com.google.javascript.rhino.jstype.JSType jSType44 = functionType43.autoboxesTo();
        java.lang.String str45 = functionType43.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, true);
        com.google.javascript.rhino.jstype.JSType jSType50 = null;
        jSTypeRegistry48.unregisterPropertyOnType("(Not declared as a type name)", jSType50);
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray54 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType55 = jSTypeRegistry48.createFunctionType(jSType52, true, jSTypeArray54);
        com.google.common.collect.ImmutableList<java.lang.String> strList56 = functionType55.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot58 = functionType55.getSlot("NUMBER 0.0 100\n");
        boolean boolean59 = functionType55.isAllType();
        boolean boolean60 = functionType43.hasEqualCallType(functionType55);
        com.google.javascript.rhino.jstype.FunctionType functionType61 = functionType55.getOwnerFunction();
        java.util.Set<java.lang.String> strSet62 = functionType55.getOwnPropertyNames();
        boolean boolean63 = functionType55.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter64 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter64, true);
        com.google.javascript.rhino.jstype.JSType jSType68 = null;
        jSTypeRegistry66.unregisterPropertyOnType("(Not declared as a type name)", jSType68);
        com.google.javascript.rhino.jstype.JSType jSType70 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray72 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType73 = jSTypeRegistry66.createFunctionType(jSType70, true, jSTypeArray72);
        boolean boolean74 = functionType73.isReturnTypeInferred();
        boolean boolean75 = functionType73.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType77 = functionType73.getBindReturnType((int) (short) 1);
        java.lang.String str78 = functionType77.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType79 = jSTypeRegistry33.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType55, (com.google.javascript.rhino.jstype.JSType) functionType77);
        com.google.javascript.rhino.JSDocInfo jSDocInfo81 = parameterizedType79.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType82 = parameterizedType79.getTypeOfThis();
        boolean boolean84 = parameterizedType79.removeProperty("function (): {646790426}");
        java.util.Set set85 = parameterizedType79.getOwnPropertyNames();
        boolean boolean86 = parameterizedType79.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType87 = parameterizedType79.getImplicitPrototype();
        boolean boolean88 = parameterizedType79.isUnknownType();
        com.google.javascript.rhino.jstype.ObjectType objectType89 = parameterizedType79.dereference();
        boolean boolean90 = functionType9.isSubtype((com.google.javascript.rhino.jstype.JSType) parameterizedType79);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType55 and parameterizedType79.", functionType55.equals(parameterizedType79) == parameterizedType79.equals(functionType55));
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test285");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType.Property property52 = parameterizedType48.getSlot("(Not declared as a type name)");
        boolean boolean53 = parameterizedType48.isNoObjectType();
        java.lang.Iterable iterable54 = parameterizedType48.getCtorImplementedInterfaces();
        java.lang.String str55 = parameterizedType48.toDebugHashCodeString();
        java.lang.String str56 = parameterizedType48.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.JSType jSType57 = parameterizedType48.autobox();
        java.util.Set set58 = parameterizedType48.getOwnPropertyNames();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test286");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType50 = parameterizedType48.getIndexType();
        com.google.javascript.rhino.Node node52 = parameterizedType48.getPropertyNode("function (): {259080799}");
        boolean boolean53 = parameterizedType48.matchesNumberContext();
        boolean boolean54 = parameterizedType48.matchesStringContext();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType55 = parameterizedType48.toMaybeParameterizedType();
        boolean boolean57 = parameterizedType55.removeProperty("{proxy:function (): {1121782975}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType55.", functionType24.equals(parameterizedType55) == parameterizedType55.equals(functionType24));
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test287");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType50 = parameterizedType48.getIndexType();
        com.google.javascript.rhino.Node node52 = parameterizedType48.getPropertyNode("function (): {259080799}");
        boolean boolean53 = parameterizedType48.matchesNumberContext();
        boolean boolean54 = parameterizedType48.matchesStringContext();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType55 = parameterizedType48.toMaybeParameterizedType();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) (short) 10);
        boolean boolean58 = node57.isStringKey();
        boolean boolean59 = parameterizedType48.equals((java.lang.Object) boolean58);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test288");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        node1.putIntProp((-1), 35);
        boolean boolean5 = node1.isStringKey();
        boolean boolean6 = node1.isThrow();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj12 = node10.getProp((int) (byte) 10);
        boolean boolean13 = node1.isEquivalentToTyped(node10);
        com.google.javascript.rhino.Node node14 = node10.removeChildren();
        boolean boolean15 = node10.isVoid();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(0);
        node17.putIntProp((-1), 35);
        boolean boolean21 = node17.isHook();
        boolean boolean22 = node17.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node23 = node17.getLastSibling();
        boolean boolean25 = node23.getBooleanProp((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node26 = node10.getChildBefore(node23);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test289");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType9.restrictByNotNullOrUndefined();
        java.lang.String str11 = functionType9.toString();
        int int12 = functionType9.getMaxArguments();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable13 = functionType9.getCtorImplementedInterfaces();
        boolean boolean14 = functionType9.isResolved();
        com.google.javascript.rhino.jstype.ObjectType objectType15 = functionType9.getPrototype();
        com.google.javascript.rhino.jstype.FunctionType functionType16 = objectType15.getConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType17 = objectType15.toObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, false);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        jSTypeRegistry23.unregisterPropertyOnType("(Not declared as a type name)", jSType25);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry23.createFunctionType(jSType27, true, jSTypeArray29);
        com.google.javascript.rhino.jstype.JSType jSType31 = functionType30.autoboxesTo();
        java.lang.String str32 = functionType30.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        com.google.common.collect.ImmutableList<java.lang.String> strList43 = functionType42.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot45 = functionType42.getSlot("NUMBER 0.0 100\n");
        boolean boolean46 = functionType42.isAllType();
        boolean boolean47 = functionType30.hasEqualCallType(functionType42);
        com.google.javascript.rhino.jstype.FunctionType functionType48 = functionType42.getOwnerFunction();
        java.util.Set<java.lang.String> strSet49 = functionType42.getOwnPropertyNames();
        boolean boolean50 = functionType42.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51, true);
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        jSTypeRegistry53.unregisterPropertyOnType("(Not declared as a type name)", jSType55);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray59 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry53.createFunctionType(jSType57, true, jSTypeArray59);
        boolean boolean61 = functionType60.isReturnTypeInferred();
        boolean boolean62 = functionType60.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType64 = functionType60.getBindReturnType((int) (short) 1);
        java.lang.String str65 = functionType64.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType66 = jSTypeRegistry20.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType42, (com.google.javascript.rhino.jstype.JSType) functionType64);
        com.google.javascript.rhino.JSDocInfo jSDocInfo68 = parameterizedType66.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType69 = parameterizedType66.getTypeOfThis();
        boolean boolean71 = parameterizedType66.removeProperty("function (): {646790426}");
        boolean boolean72 = parameterizedType66.canBeCalled();
        boolean boolean73 = parameterizedType66.isNativeObjectType();
        boolean boolean74 = parameterizedType66.isResolved();
        boolean boolean75 = parameterizedType66.isUnknownType();
        com.google.javascript.rhino.jstype.ObjectType objectType76 = parameterizedType66.getImplicitPrototype();
        boolean boolean78 = parameterizedType66.isPropertyTypeDeclared("(function (): {1826660093})");
        com.google.javascript.rhino.JSDocInfo jSDocInfo80 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean81 = jSDocInfo80.hasThisType();
        boolean boolean82 = jSDocInfo80.shouldPreserveTry();
        boolean boolean83 = jSDocInfo80.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression85 = jSDocInfo80.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean86 = jSDocInfo80.shouldPreserveTry();
        java.lang.String str87 = jSDocInfo80.getLicense();
        parameterizedType66.setPropertyJSDocInfo("{proxy:function (): {2102377855}}", jSDocInfo80);
        boolean boolean89 = parameterizedType66.hasDisplayName();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair90 = objectType15.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) parameterizedType66);
        com.google.javascript.rhino.jstype.JSType jSType91 = typePair90.typeA;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType42 and parameterizedType66.", functionType42.equals(parameterizedType66) == parameterizedType66.equals(functionType42));
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test290");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType9.unboxesTo();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable11 = functionType9.getParameters();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, false);
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        jSTypeRegistry18.unregisterPropertyOnType("(Not declared as a type name)", jSType20);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry18.createFunctionType(jSType22, true, jSTypeArray24);
        com.google.javascript.rhino.jstype.JSType jSType26 = functionType25.autoboxesTo();
        java.lang.String str27 = functionType25.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        jSTypeRegistry30.unregisterPropertyOnType("(Not declared as a type name)", jSType32);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry30.createFunctionType(jSType34, true, jSTypeArray36);
        com.google.common.collect.ImmutableList<java.lang.String> strList38 = functionType37.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot40 = functionType37.getSlot("NUMBER 0.0 100\n");
        boolean boolean41 = functionType37.isAllType();
        boolean boolean42 = functionType25.hasEqualCallType(functionType37);
        com.google.javascript.rhino.jstype.FunctionType functionType43 = functionType37.getOwnerFunction();
        java.util.Set<java.lang.String> strSet44 = functionType37.getOwnPropertyNames();
        boolean boolean45 = functionType37.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, true);
        com.google.javascript.rhino.jstype.JSType jSType50 = null;
        jSTypeRegistry48.unregisterPropertyOnType("(Not declared as a type name)", jSType50);
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray54 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType55 = jSTypeRegistry48.createFunctionType(jSType52, true, jSTypeArray54);
        boolean boolean56 = functionType55.isReturnTypeInferred();
        boolean boolean57 = functionType55.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType59 = functionType55.getBindReturnType((int) (short) 1);
        java.lang.String str60 = functionType59.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType61 = jSTypeRegistry15.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType37, (com.google.javascript.rhino.jstype.JSType) functionType59);
        com.google.javascript.rhino.JSDocInfo jSDocInfo63 = parameterizedType61.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType.Property property65 = parameterizedType61.getSlot("(Not declared as a type name)");
        boolean boolean66 = parameterizedType61.isNoObjectType();
        java.lang.String str67 = parameterizedType61.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.ObjectType objectType68 = parameterizedType61.getImplicitPrototype();
        boolean boolean69 = parameterizedType61.isInstanceType();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(0);
        node71.putIntProp((-1), 35);
        java.lang.Object obj76 = node71.getProp(29);
        boolean boolean77 = functionType9.defineSynthesizedProperty("function (): {1341612873}", (com.google.javascript.rhino.jstype.JSType) parameterizedType61, node71);
        int int78 = node71.getLength();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType37 and parameterizedType61.", functionType37.equals(parameterizedType61) == parameterizedType61.equals(functionType37));
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test291");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType9.unboxesTo();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable11 = functionType9.getParameters();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, false);
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        jSTypeRegistry18.unregisterPropertyOnType("(Not declared as a type name)", jSType20);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry18.createFunctionType(jSType22, true, jSTypeArray24);
        com.google.javascript.rhino.jstype.JSType jSType26 = functionType25.autoboxesTo();
        java.lang.String str27 = functionType25.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        jSTypeRegistry30.unregisterPropertyOnType("(Not declared as a type name)", jSType32);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry30.createFunctionType(jSType34, true, jSTypeArray36);
        com.google.common.collect.ImmutableList<java.lang.String> strList38 = functionType37.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot40 = functionType37.getSlot("NUMBER 0.0 100\n");
        boolean boolean41 = functionType37.isAllType();
        boolean boolean42 = functionType25.hasEqualCallType(functionType37);
        com.google.javascript.rhino.jstype.FunctionType functionType43 = functionType37.getOwnerFunction();
        java.util.Set<java.lang.String> strSet44 = functionType37.getOwnPropertyNames();
        boolean boolean45 = functionType37.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, true);
        com.google.javascript.rhino.jstype.JSType jSType50 = null;
        jSTypeRegistry48.unregisterPropertyOnType("(Not declared as a type name)", jSType50);
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray54 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType55 = jSTypeRegistry48.createFunctionType(jSType52, true, jSTypeArray54);
        boolean boolean56 = functionType55.isReturnTypeInferred();
        boolean boolean57 = functionType55.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType59 = functionType55.getBindReturnType((int) (short) 1);
        java.lang.String str60 = functionType59.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType61 = jSTypeRegistry15.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType37, (com.google.javascript.rhino.jstype.JSType) functionType59);
        com.google.javascript.rhino.JSDocInfo jSDocInfo63 = parameterizedType61.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType.Property property65 = parameterizedType61.getSlot("(Not declared as a type name)");
        boolean boolean66 = parameterizedType61.isNoObjectType();
        java.lang.String str67 = parameterizedType61.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.ObjectType objectType68 = parameterizedType61.getImplicitPrototype();
        boolean boolean69 = parameterizedType61.isInstanceType();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(0);
        node71.putIntProp((-1), 35);
        java.lang.Object obj76 = node71.getProp(29);
        boolean boolean77 = functionType9.defineSynthesizedProperty("function (): {1341612873}", (com.google.javascript.rhino.jstype.JSType) parameterizedType61, node71);
        com.google.javascript.rhino.jstype.ObjectType.Property property79 = parameterizedType61.getOwnSlot("{proxy:function (): {847075005}}");
        com.google.javascript.rhino.jstype.FunctionType functionType80 = parameterizedType61.toMaybeFunctionType();
        boolean boolean82 = functionType80.removeProperty("(function (): {1967852287})");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType80 and parameterizedType61.", functionType80.equals(parameterizedType61) == parameterizedType61.equals(functionType80));
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test292");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("");
        boolean boolean6 = node5.isBreak();
        com.google.javascript.rhino.Node node7 = node5.getLastSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node5);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test293");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        java.lang.String str51 = parameterizedType48.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.TemplateType templateType52 = parameterizedType48.toMaybeTemplateType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType53 = parameterizedType48.toMaybeParameterizedType();
        com.google.javascript.rhino.jstype.EnumType enumType54 = parameterizedType53.toMaybeEnumType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType53.", functionType24.equals(parameterizedType53) == parameterizedType53.equals(functionType24));
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test294");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType48.getTypeOfThis();
        boolean boolean53 = parameterizedType48.removeProperty("function (): {646790426}");
        com.google.javascript.rhino.jstype.JSType jSType55 = parameterizedType48.getPropertyType("NUMBER 0.0 100\n");
        boolean boolean56 = parameterizedType48.isEnumElementType();
        boolean boolean57 = parameterizedType48.isConstructor();
        boolean boolean58 = parameterizedType48.isUnknownType();
        boolean boolean59 = parameterizedType48.isTemplateType();
        boolean boolean60 = parameterizedType48.isNoObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType61 = parameterizedType48.toMaybeParameterizedType();
        com.google.javascript.rhino.jstype.ObjectType objectType62 = parameterizedType48.getTypeOfThis();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test295");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType50 = parameterizedType48.getIndexType();
        boolean boolean51 = parameterizedType48.matchesNumberContext();
        boolean boolean52 = parameterizedType48.isCheckedUnknownType();
        boolean boolean53 = parameterizedType48.matchesNumberContext();
        boolean boolean54 = parameterizedType48.isNoType();
        boolean boolean55 = parameterizedType48.isNumberValueType();
        com.google.javascript.rhino.jstype.JSType jSType57 = parameterizedType48.getPropertyType("function (): {18409526}");
        jSType57.clearResolved();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test296");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType48.getTypeOfThis();
        java.lang.String str52 = objectType51.getReferenceName();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test297");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        java.lang.String str51 = parameterizedType48.toDebugHashCodeString();
        boolean boolean52 = parameterizedType48.matchesObjectContext();
        com.google.javascript.rhino.jstype.JSType jSType53 = parameterizedType48.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.JSType jSType55 = parameterizedType48.getPropertyType("{proxy:function (): {1425741716}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test298");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType50 = parameterizedType48.getIndexType();
        com.google.javascript.rhino.Node node52 = parameterizedType48.getPropertyNode("function (): {259080799}");
        boolean boolean53 = parameterizedType48.isNullType();
        com.google.javascript.rhino.jstype.JSType jSType55 = parameterizedType48.findPropertyType("PARAM_LIST\n");
        com.google.javascript.rhino.jstype.ObjectType objectType56 = parameterizedType48.getImplicitPrototype();
        boolean boolean57 = objectType56.matchesInt32Context();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test299");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType50 = parameterizedType48.getIndexType();
        boolean boolean51 = parameterizedType48.isNativeObjectType();
        boolean boolean52 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        jSTypeRegistry56.unregisterPropertyOnType("(Not declared as a type name)", jSType58);
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60, true);
        com.google.javascript.rhino.jstype.JSType jSType64 = null;
        jSTypeRegistry62.unregisterPropertyOnType("(Not declared as a type name)", jSType64);
        com.google.javascript.rhino.jstype.JSType jSType66 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray68 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType69 = jSTypeRegistry62.createFunctionType(jSType66, true, jSTypeArray68);
        boolean boolean71 = functionType69.removeProperty("false");
        boolean boolean72 = functionType69.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType73 = jSTypeRegistry56.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType69);
        boolean boolean75 = jSTypeRegistry56.hasNamespace("hi!");
        jSTypeRegistry56.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray77 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType78 = jSTypeRegistry56.createUnionType(jSTypeNativeArray77);
        jSTypeRegistry56.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter80 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry82 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter80, true);
        com.google.javascript.rhino.jstype.JSType jSType84 = null;
        jSTypeRegistry82.unregisterPropertyOnType("(Not declared as a type name)", jSType84);
        com.google.javascript.rhino.jstype.JSType jSType86 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray88 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType89 = jSTypeRegistry82.createFunctionType(jSType86, true, jSTypeArray88);
        com.google.common.collect.ImmutableList<java.lang.String> strList90 = functionType89.getTemplateTypeNames();
        boolean boolean91 = functionType89.isReturnTypeInferred();
        com.google.javascript.rhino.jstype.JSType jSType92 = jSTypeRegistry56.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType89);
        com.google.javascript.rhino.jstype.JSType jSType93 = parameterizedType48.resolve(errorReporter53, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType89);
        boolean boolean95 = functionType89.removeProperty("function (): {367372378}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test300");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        boolean boolean4 = node3.isEmpty();
        java.lang.CharSequence[] charSequenceArray10 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList11 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray10);
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList14 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList14, charSequenceArray13);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator16 = charSequenceList14.spliterator();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node(0);
        node19.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(32, node19);
        boolean boolean24 = node23.isGetterDef();
        boolean boolean25 = charSequenceList14.equals((java.lang.Object) boolean24);
        boolean boolean27 = charSequenceList14.add((java.lang.CharSequence) "[hi!, hi!, , , hi!]");
        boolean boolean28 = charSequenceList11.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList14);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(0);
        node30.putIntProp((-1), 35);
        boolean boolean34 = node30.isStringKey();
        boolean boolean35 = node30.isThrow();
        int int36 = charSequenceList11.indexOf((java.lang.Object) node30);
        boolean boolean37 = node3.isEquivalentTo(node30);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(0);
        node39.putIntProp((-1), 35);
        boolean boolean43 = node39.isReturn();
        com.google.javascript.rhino.InputId inputId44 = node39.getInputId();
        node39.setWasEmptyNode(true);
        com.google.javascript.rhino.Node node47 = node3.useSourceInfoIfMissingFrom(node39);
        boolean boolean48 = node47.isCall();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile49 = node47.getStaticSourceFile();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) 32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node52 = node47.getChildBefore(node51);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test301");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        java.lang.String str51 = parameterizedType48.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.ObjectType.Property property53 = parameterizedType48.getSlot("java.io.IOException: java.io.IOException");
        boolean boolean55 = parameterizedType48.isPropertyTypeDeclared("function (): {1393951772}");
        boolean boolean56 = parameterizedType48.isUnknownType();
        java.lang.String str57 = parameterizedType48.getReferenceName();
        com.google.javascript.rhino.JSDocInfo jSDocInfo59 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean60 = jSDocInfo59.hasThisType();
        boolean boolean61 = jSDocInfo59.shouldPreserveTry();
        boolean boolean62 = jSDocInfo59.isDeprecated();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList63 = jSDocInfo59.getImplementedInterfaces();
        java.util.Set<java.lang.String> strSet64 = jSDocInfo59.getParameterNames();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression65 = jSDocInfo59.getEnumParameterType();
        boolean boolean66 = jSDocInfo59.hasFileOverview();
        boolean boolean67 = jSDocInfo59.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression68 = jSDocInfo59.getBaseType();
        parameterizedType48.setPropertyJSDocInfo("function (): {697129060}", jSDocInfo59);
        boolean boolean70 = jSDocInfo59.shouldPreserveTry();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test302");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType50 = parameterizedType48.getIndexType();
        com.google.javascript.rhino.Node node52 = parameterizedType48.getPropertyNode("function (): {259080799}");
        boolean boolean53 = parameterizedType48.hasReferenceName();
        boolean boolean54 = parameterizedType48.isCheckedUnknownType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo55 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean56 = jSDocInfo55.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression57 = jSDocInfo55.getBaseType();
        java.lang.String str58 = jSDocInfo55.getLicense();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList59 = jSDocInfo55.getImplementedInterfaces();
        java.lang.String str60 = jSDocInfo55.getBlockDescription();
        boolean boolean61 = jSDocInfo55.isNoSideEffects();
        parameterizedType48.setJSDocInfo(jSDocInfo55);
        java.util.Collection<java.lang.String> strCollection63 = jSDocInfo55.getReferences();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test303");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType48.getTypeOfThis();
        boolean boolean53 = parameterizedType48.removeProperty("function (): {646790426}");
        java.util.Set set54 = parameterizedType48.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.FunctionType functionType55 = parameterizedType48.getOwnerFunction();
        boolean boolean56 = parameterizedType48.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo57 = parameterizedType48.getJSDocInfo();
        com.google.javascript.rhino.jstype.JSType jSType58 = parameterizedType48.collapseUnion();
        boolean boolean60 = parameterizedType48.removeProperty("{proxy:function (): {2102377855}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test304");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType50 = parameterizedType48.getIndexType();
        com.google.javascript.rhino.Node node52 = parameterizedType48.getPropertyNode("function (): {259080799}");
        boolean boolean53 = parameterizedType48.matchesNumberContext();
        boolean boolean54 = parameterizedType48.matchesStringContext();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType55 = parameterizedType48.toMaybeParameterizedType();
        boolean boolean56 = parameterizedType48.isNullable();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test305");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.EnumType enumType14 = functionType12.toMaybeEnumType();
        com.google.javascript.rhino.jstype.FunctionType functionType15 = functionType12.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry2.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType12);
        jSTypeRegistry2.incrementGeneration();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        jSTypeRegistry20.unregisterPropertyOnType("(Not declared as a type name)", jSType22);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry20.createFunctionType(jSType24, true, jSTypeArray26);
        boolean boolean29 = functionType27.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        jSTypeRegistry33.unregisterPropertyOnType("(Not declared as a type name)", jSType35);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray39 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType40 = jSTypeRegistry33.createFunctionType(jSType37, true, jSTypeArray39);
        boolean boolean42 = functionType40.removeProperty("false");
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node(0);
        node44.putIntProp((-1), 35);
        boolean boolean48 = node44.isStringKey();
        boolean boolean49 = node44.isThrow();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj55 = node53.getProp((int) (byte) 10);
        boolean boolean56 = node44.isEquivalentToTyped(node53);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(0);
        node59.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node(32, node59);
        boolean boolean64 = node63.isInstanceOf();
        com.google.javascript.rhino.Node node65 = node53.useSourceInfoFromForTree(node63);
        boolean boolean66 = node63.isDo();
        boolean boolean67 = functionType27.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType40, node63);
        java.lang.String str68 = functionType40.getReferenceName();
        boolean boolean69 = functionType40.isUnionType();
        boolean boolean70 = functionType40.isCheckedUnknownType();
        com.google.javascript.rhino.ErrorReporter errorReporter71 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter71, true);
        com.google.javascript.rhino.jstype.JSType jSType75 = null;
        jSTypeRegistry73.unregisterPropertyOnType("(Not declared as a type name)", jSType75);
        com.google.javascript.rhino.jstype.JSType jSType77 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray79 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType80 = jSTypeRegistry73.createFunctionType(jSType77, true, jSTypeArray79);
        boolean boolean82 = functionType80.removeProperty("false");
        com.google.javascript.rhino.jstype.JSType jSType84 = functionType80.findPropertyType("Not declared as a type name");
        boolean boolean86 = functionType80.isPropertyTypeInferred("function (): {1442205556}");
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType87 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType40, (com.google.javascript.rhino.jstype.JSType) functionType80);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable89 = jSTypeRegistry2.getEachReferenceTypeWithProperty("function (): {1393951772}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType40 and parameterizedType87.", functionType40.equals(parameterizedType87) == parameterizedType87.equals(functionType40));
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test306");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType48.getTypeOfThis();
        boolean boolean53 = parameterizedType48.removeProperty("function (): {646790426}");
        boolean boolean54 = parameterizedType48.canBeCalled();
        boolean boolean56 = parameterizedType48.isPropertyTypeDeclared("function (): {367372378}");
        com.google.javascript.rhino.jstype.JSType jSType58 = parameterizedType48.getPropertyType("true");
        boolean boolean60 = parameterizedType48.removeProperty("function (): {1536545239}");
        com.google.javascript.rhino.jstype.ObjectType objectType61 = parameterizedType48.getImplicitPrototype();
        boolean boolean62 = parameterizedType48.isBooleanObjectType();
        boolean boolean63 = parameterizedType48.isNoType();
        boolean boolean65 = parameterizedType48.isPropertyInExterns("{proxy:function (): {1002171987}}");
        boolean boolean66 = parameterizedType48.isVoidType();
        com.google.javascript.rhino.jstype.ObjectType objectType67 = parameterizedType48.getParentScope();
        boolean boolean68 = objectType67.isOrdinaryFunction();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test307");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(0);
        node3.putIntProp((-1), 35);
        boolean boolean7 = node3.isStringKey();
        boolean boolean8 = node3.isThrow();
        com.google.javascript.rhino.Node node9 = node1.useSourceInfoFrom(node3);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(0);
        boolean boolean13 = node12.isCall();
        com.google.javascript.rhino.Node node14 = node12.cloneTree();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString((int) (short) 1, "");
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(35, node14, node17);
        com.google.javascript.rhino.Node node19 = node1.copyInformationFrom(node14);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(0);
        boolean boolean22 = node21.isInstanceOf();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(0);
        node24.putIntProp((-1), 35);
        boolean boolean28 = node24.isStringKey();
        boolean boolean29 = node24.isThrow();
        boolean boolean30 = node24.isEmpty();
        com.google.javascript.rhino.Node node31 = node21.useSourceInfoFrom(node24);
        boolean boolean32 = node31.isVar();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node(0);
        boolean boolean35 = node34.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile36 = node34.getStaticSourceFile();
        node34.setLineno((int) '4');
        com.google.javascript.rhino.Node node39 = node31.useSourceInfoIfMissingFrom(node34);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj45 = node43.getProp((int) (byte) 10);
        com.google.javascript.rhino.Node node46 = node34.copyInformationFrom(node43);
        com.google.javascript.rhino.Node node47 = node19.useSourceInfoIfMissingFrom(node46);
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node(0);
        node50.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(0);
        node56.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node(32, node56);
        boolean boolean61 = node56.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node(0);
        boolean boolean64 = node63.isCall();
        com.google.javascript.rhino.Node node65 = node63.cloneTree();
        com.google.javascript.jscomp.CodingConvention.Bind bind66 = new com.google.javascript.jscomp.CodingConvention.Bind(node50, node56, node63);
        boolean boolean67 = node50.isComma();
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node((int) (byte) 10, node50);
        boolean boolean69 = node50.isVarArgs();
        com.google.javascript.rhino.Node node70 = node47.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean71 = node47.isSetterDef();
        com.google.javascript.rhino.Node node74 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node((int) ' ', node74);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node47.removeChild(node75);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test308");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType50 = parameterizedType48.getIndexType();
        boolean boolean51 = parameterizedType48.matchesNumberContext();
        java.lang.String str52 = parameterizedType48.toAnnotationString();
        boolean boolean53 = parameterizedType48.isInterface();
        boolean boolean54 = parameterizedType48.isNullable();
        com.google.javascript.rhino.JSDocInfo jSDocInfo56 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean57 = jSDocInfo56.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression58 = jSDocInfo56.getBaseType();
        java.lang.String str59 = jSDocInfo56.getLicense();
        java.lang.String str60 = jSDocInfo56.getMeaning();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList61 = jSDocInfo56.getThrownTypes();
        boolean boolean62 = jSDocInfo56.isConsistentIdGenerator();
        boolean boolean63 = jSDocInfo56.hasBaseType();
        parameterizedType48.setPropertyJSDocInfo("function (): {1588302745}", jSDocInfo56);
        com.google.javascript.rhino.jstype.FunctionType functionType65 = parameterizedType48.toMaybeFunctionType();
        java.lang.Iterable iterable66 = functionType65.getCtorExtendedInterfaces();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType65 and parameterizedType48.", functionType65.equals(parameterizedType48) == parameterizedType48.equals(functionType65));
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test309");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        java.lang.String str51 = parameterizedType48.toDebugHashCodeString();
        boolean boolean52 = parameterizedType48.isNullable();
        com.google.javascript.rhino.jstype.JSType jSType53 = parameterizedType48.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        jSTypeRegistry56.unregisterPropertyOnType("(Not declared as a type name)", jSType58);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray62 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry56.createFunctionType(jSType60, true, jSTypeArray62);
        com.google.common.collect.ImmutableList<java.lang.String> strList64 = functionType63.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot66 = functionType63.getSlot("NUMBER 0.0 100\n");
        boolean boolean67 = functionType63.isAllType();
        boolean boolean68 = functionType63.hasReferenceName();
        boolean boolean69 = jSType53.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType63);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and jSType53.", functionType24.equals(jSType53) == jSType53.equals(functionType24));
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test310");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType.Property property52 = parameterizedType48.getSlot("(Not declared as a type name)");
        boolean boolean53 = parameterizedType48.isNoObjectType();
        java.lang.Iterable iterable54 = parameterizedType48.getCtorImplementedInterfaces();
        java.lang.String str55 = parameterizedType48.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.JSType jSType57 = parameterizedType48.getPropertyType("function ");
        com.google.javascript.rhino.jstype.ObjectType objectType58 = parameterizedType48.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        jSTypeRegistry61.unregisterPropertyOnType("(Not declared as a type name)", jSType63);
        com.google.javascript.rhino.jstype.JSType jSType65 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray67 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType68 = jSTypeRegistry61.createFunctionType(jSType65, true, jSTypeArray67);
        com.google.javascript.rhino.jstype.JSType jSType69 = functionType68.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.ObjectType objectType70 = functionType68.toObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter71 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter72 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry74 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter72, true);
        com.google.javascript.rhino.jstype.JSType jSType76 = null;
        jSTypeRegistry74.unregisterPropertyOnType("(Not declared as a type name)", jSType76);
        com.google.javascript.rhino.ErrorReporter errorReporter78 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry80 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter78, true);
        com.google.javascript.rhino.jstype.JSType jSType82 = null;
        jSTypeRegistry80.unregisterPropertyOnType("(Not declared as a type name)", jSType82);
        com.google.javascript.rhino.jstype.JSType jSType84 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray86 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry80.createFunctionType(jSType84, true, jSTypeArray86);
        boolean boolean89 = functionType87.removeProperty("false");
        boolean boolean90 = functionType87.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType91 = jSTypeRegistry74.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType92 = functionType68.forceResolve(errorReporter71, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType87);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot94 = functionType68.getOwnSlot("Not declared as a type name");
        boolean boolean95 = functionType68.isArrayType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue96 = parameterizedType48.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType68);
        boolean boolean97 = functionType68.isFunctionPrototypeType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test311");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        java.lang.String str51 = parameterizedType48.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.ObjectType.Property property53 = parameterizedType48.getSlot("java.io.IOException: java.io.IOException");
        boolean boolean55 = parameterizedType48.isPropertyInExterns("function (): {1382777992}");
        com.google.javascript.rhino.jstype.FunctionType functionType56 = parameterizedType48.getOwnerFunction();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType57 = parameterizedType48.toMaybeParameterizedType();
        boolean boolean59 = parameterizedType57.hasProperty("(function (): {548870186})");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType57.", functionType24.equals(parameterizedType57) == parameterizedType57.equals(functionType24));
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test312");
        com.google.javascript.rhino.InputId inputId1 = new com.google.javascript.rhino.InputId("function (): {480423885}");
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2, false);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        jSTypeRegistry7.unregisterPropertyOnType("(Not declared as a type name)", jSType9);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry7.createFunctionType(jSType11, true, jSTypeArray13);
        com.google.javascript.rhino.jstype.JSType jSType15 = functionType14.autoboxesTo();
        java.lang.String str16 = functionType14.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        jSTypeRegistry19.unregisterPropertyOnType("(Not declared as a type name)", jSType21);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry19.createFunctionType(jSType23, true, jSTypeArray25);
        com.google.common.collect.ImmutableList<java.lang.String> strList27 = functionType26.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot29 = functionType26.getSlot("NUMBER 0.0 100\n");
        boolean boolean30 = functionType26.isAllType();
        boolean boolean31 = functionType14.hasEqualCallType(functionType26);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = functionType26.getOwnerFunction();
        java.util.Set<java.lang.String> strSet33 = functionType26.getOwnPropertyNames();
        boolean boolean34 = functionType26.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35, true);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        jSTypeRegistry37.unregisterPropertyOnType("(Not declared as a type name)", jSType39);
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray43 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry37.createFunctionType(jSType41, true, jSTypeArray43);
        boolean boolean45 = functionType44.isReturnTypeInferred();
        boolean boolean46 = functionType44.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType48 = functionType44.getBindReturnType((int) (short) 1);
        java.lang.String str49 = functionType48.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType50 = jSTypeRegistry4.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType26, (com.google.javascript.rhino.jstype.JSType) functionType48);
        com.google.javascript.rhino.JSDocInfo jSDocInfo52 = parameterizedType50.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType.Property property54 = parameterizedType50.getSlot("(Not declared as a type name)");
        boolean boolean55 = parameterizedType50.isNoObjectType();
        java.lang.Iterable iterable56 = parameterizedType50.getCtorImplementedInterfaces();
        java.lang.String str57 = parameterizedType50.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.JSType jSType59 = parameterizedType50.getPropertyType("function ");
        com.google.javascript.rhino.jstype.ObjectType objectType60 = parameterizedType50.getImplicitPrototype();
        boolean boolean61 = inputId1.equals((java.lang.Object) objectType60);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType26 and parameterizedType50.", functionType26.equals(parameterizedType50) == parameterizedType50.equals(functionType26));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test313");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType.Property property52 = parameterizedType48.getSlot("(Not declared as a type name)");
        boolean boolean53 = parameterizedType48.isNoObjectType();
        java.lang.Iterable iterable54 = parameterizedType48.getCtorImplementedInterfaces();
        java.lang.String str55 = parameterizedType48.toDebugHashCodeString();
        java.lang.String str56 = parameterizedType48.toDebugHashCodeString();
        boolean boolean57 = parameterizedType48.isConstructor();
        boolean boolean58 = parameterizedType48.hasReferenceName();
        com.google.javascript.rhino.jstype.FunctionType functionType59 = parameterizedType48.toMaybeFunctionType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo61 = functionType59.getOwnPropertyJSDocInfo("function (): {1975865191}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType59 and parameterizedType48.", functionType59.equals(parameterizedType48) == parameterizedType48.equals(functionType59));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test314");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType50 = parameterizedType48.getIndexType();
        boolean boolean51 = parameterizedType48.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo53 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean54 = jSDocInfo53.hasThisType();
        boolean boolean55 = jSDocInfo53.shouldPreserveTry();
        boolean boolean56 = jSDocInfo53.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression58 = jSDocInfo53.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean59 = jSDocInfo53.shouldPreserveTry();
        boolean boolean60 = jSDocInfo53.isOverride();
        boolean boolean61 = jSDocInfo53.isNoSideEffects();
        boolean boolean63 = jSDocInfo53.hasParameterType("");
        java.lang.String str64 = jSDocInfo53.getOriginalCommentString();
        parameterizedType48.setPropertyJSDocInfo("function (): {436796145}", jSDocInfo53);
        boolean boolean66 = jSDocInfo53.isConstant();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test315");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.isAllType();
        boolean boolean50 = parameterizedType48.isInstanceType();
        boolean boolean51 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.FunctionType functionType52 = parameterizedType48.getConstructor();
        java.lang.String str53 = parameterizedType48.toDebugHashCodeString();
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope55 = null;
        com.google.javascript.rhino.jstype.JSType jSType56 = parameterizedType48.resolve(errorReporter54, jSTypeStaticScope55);
        com.google.javascript.rhino.jstype.ObjectType objectType57 = parameterizedType48.getTypeOfThis();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test316");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType48.getTypeOfThis();
        boolean boolean53 = parameterizedType48.removeProperty("function (): {646790426}");
        boolean boolean54 = parameterizedType48.canBeCalled();
        boolean boolean55 = parameterizedType48.isNativeObjectType();
        boolean boolean56 = parameterizedType48.isResolved();
        boolean boolean57 = parameterizedType48.isOrdinaryFunction();
        boolean boolean58 = parameterizedType48.isStringValueType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo60 = parameterizedType48.getOwnPropertyJSDocInfo("{proxy:function (): {1002171987}}");
        com.google.javascript.rhino.jstype.FunctionType functionType61 = parameterizedType48.toMaybeFunctionType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList62 = functionType61.getSubTypes();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType61 and parameterizedType48.", functionType61.equals(parameterizedType48) == parameterizedType48.equals(functionType61));
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test317");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = functionType9.getTemplateTypeNames();
        boolean boolean11 = functionType9.isConstructor();
        com.google.javascript.rhino.jstype.JSType jSType12 = functionType9.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, false);
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        jSTypeRegistry18.unregisterPropertyOnType("(Not declared as a type name)", jSType20);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry18.createFunctionType(jSType22, true, jSTypeArray24);
        com.google.javascript.rhino.jstype.JSType jSType26 = functionType25.autoboxesTo();
        java.lang.String str27 = functionType25.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        jSTypeRegistry30.unregisterPropertyOnType("(Not declared as a type name)", jSType32);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry30.createFunctionType(jSType34, true, jSTypeArray36);
        com.google.common.collect.ImmutableList<java.lang.String> strList38 = functionType37.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot40 = functionType37.getSlot("NUMBER 0.0 100\n");
        boolean boolean41 = functionType37.isAllType();
        boolean boolean42 = functionType25.hasEqualCallType(functionType37);
        com.google.javascript.rhino.jstype.FunctionType functionType43 = functionType37.getOwnerFunction();
        java.util.Set<java.lang.String> strSet44 = functionType37.getOwnPropertyNames();
        boolean boolean45 = functionType37.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, true);
        com.google.javascript.rhino.jstype.JSType jSType50 = null;
        jSTypeRegistry48.unregisterPropertyOnType("(Not declared as a type name)", jSType50);
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray54 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType55 = jSTypeRegistry48.createFunctionType(jSType52, true, jSTypeArray54);
        boolean boolean56 = functionType55.isReturnTypeInferred();
        boolean boolean57 = functionType55.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType59 = functionType55.getBindReturnType((int) (short) 1);
        java.lang.String str60 = functionType59.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType61 = jSTypeRegistry15.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType37, (com.google.javascript.rhino.jstype.JSType) functionType59);
        boolean boolean62 = parameterizedType61.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType63 = parameterizedType61.getIndexType();
        com.google.javascript.rhino.Node node65 = parameterizedType61.getPropertyNode("function (): {259080799}");
        boolean boolean66 = parameterizedType61.hasReferenceName();
        boolean boolean67 = parameterizedType61.isCheckedUnknownType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue68 = functionType9.testForEquality((com.google.javascript.rhino.jstype.JSType) parameterizedType61);
        java.lang.String str69 = functionType9.toDebugHashCodeString();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType37 and parameterizedType61.", functionType37.equals(parameterizedType61) == parameterizedType61.equals(functionType37));
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test318");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        java.lang.String str51 = parameterizedType48.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.TemplateType templateType52 = parameterizedType48.toMaybeTemplateType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType53 = parameterizedType48.toMaybeParameterizedType();
        boolean boolean54 = parameterizedType53.isParameterizedType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType53.", functionType24.equals(parameterizedType53) == parameterizedType53.equals(functionType24));
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test319");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(52, "function (): {1757462429}", 49, 29);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj12 = node10.getProp((int) (byte) 10);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(0);
        node16.putIntProp((-1), 35);
        boolean boolean20 = node16.isStringKey();
        boolean boolean21 = node16.isThrow();
        com.google.javascript.rhino.Node node22 = node14.useSourceInfoFrom(node16);
        boolean boolean23 = node22.isIn();
        com.google.javascript.rhino.Node node24 = node10.clonePropsFrom(node22);
        java.lang.String str25 = com.google.javascript.jscomp.NodeUtil.getSourceName(node10);
        boolean boolean26 = node10.isDefaultCase();
        boolean boolean27 = node10.isIn();
        boolean boolean28 = node10.isAssign();
        boolean boolean29 = node10.isInc();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("InputId: NUMBER 0.0 100\n", 41, 40);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(0);
        boolean boolean36 = node35.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile37 = node35.getStaticSourceFile();
        com.google.javascript.rhino.Node node38 = node35.getNext();
        boolean boolean39 = node35.isFalse();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        boolean boolean44 = node43.isEmpty();
        node35.addChildrenToBack(node43);
        boolean boolean46 = node35.isVar();
        com.google.javascript.rhino.InputId inputId47 = node35.getInputId();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node((int) (short) 1, node5, node10, node33, node35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node50 = node35.getChildAtIndex(50);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test320");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType50 = parameterizedType48.getIndexType();
        boolean boolean51 = parameterizedType48.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo53 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean54 = jSDocInfo53.hasThisType();
        boolean boolean55 = jSDocInfo53.shouldPreserveTry();
        boolean boolean56 = jSDocInfo53.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression58 = jSDocInfo53.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean59 = jSDocInfo53.shouldPreserveTry();
        boolean boolean60 = jSDocInfo53.isOverride();
        boolean boolean61 = jSDocInfo53.isNoSideEffects();
        boolean boolean63 = jSDocInfo53.hasParameterType("");
        java.lang.String str64 = jSDocInfo53.getOriginalCommentString();
        parameterizedType48.setPropertyJSDocInfo("function (): {436796145}", jSDocInfo53);
        boolean boolean66 = parameterizedType48.isNominalType();
        boolean boolean67 = parameterizedType48.matchesObjectContext();
        boolean boolean68 = parameterizedType48.canBeCalled();
        boolean boolean69 = parameterizedType48.isNullable();
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry72 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70, true);
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        jSTypeRegistry72.unregisterPropertyOnType("(Not declared as a type name)", jSType74);
        com.google.javascript.rhino.jstype.JSType jSType76 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray78 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType79 = jSTypeRegistry72.createFunctionType(jSType76, true, jSTypeArray78);
        com.google.common.collect.ImmutableList<java.lang.String> strList80 = functionType79.getTemplateTypeNames();
        boolean boolean81 = functionType79.isReturnTypeInferred();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope82 = functionType79.getParentScope();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue83 = parameterizedType48.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType79);
        boolean boolean84 = functionType79.isNominalType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test321");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49, true);
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        jSTypeRegistry51.unregisterPropertyOnType("(Not declared as a type name)", jSType53);
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, true);
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        jSTypeRegistry57.unregisterPropertyOnType("(Not declared as a type name)", jSType59);
        com.google.javascript.rhino.jstype.JSType jSType61 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray63 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType64 = jSTypeRegistry57.createFunctionType(jSType61, true, jSTypeArray63);
        boolean boolean66 = functionType64.removeProperty("false");
        boolean boolean67 = functionType64.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType68 = jSTypeRegistry51.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType64);
        boolean boolean70 = functionType64.hasProperty("(Not declared as a type name)");
        int int71 = functionType64.getPropertiesCount();
        boolean boolean72 = functionType64.isNominalType();
        boolean boolean73 = parameterizedType48.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType64);
        boolean boolean74 = parameterizedType48.isFunctionPrototypeType();
        com.google.javascript.rhino.jstype.FunctionType functionType75 = parameterizedType48.getOwnerFunction();
        com.google.javascript.rhino.jstype.JSType jSType76 = parameterizedType48.collapseUnion();
        boolean boolean77 = jSType76.isObject();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and jSType76.", functionType24.equals(jSType76) == jSType76.equals(functionType24));
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test322");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType50 = parameterizedType48.getIndexType();
        boolean boolean51 = parameterizedType48.matchesNumberContext();
        boolean boolean52 = parameterizedType48.isNullable();
        com.google.javascript.rhino.jstype.FunctionType functionType53 = parameterizedType48.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType54 = parameterizedType48.toMaybeParameterizedType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType55 = parameterizedType54.toMaybeEnumElementType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType54.", functionType24.equals(parameterizedType54) == parameterizedType54.equals(functionType24));
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test323");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType48.getTypeOfThis();
        boolean boolean53 = parameterizedType48.removeProperty("function (): {646790426}");
        com.google.javascript.rhino.jstype.JSType jSType55 = parameterizedType48.getPropertyType("NUMBER 0.0 100\n");
        boolean boolean56 = parameterizedType48.isEnumElementType();
        boolean boolean57 = parameterizedType48.isConstructor();
        boolean boolean58 = parameterizedType48.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        com.google.javascript.rhino.ErrorReporter errorReporter62 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter62, true);
        com.google.javascript.rhino.jstype.JSType jSType66 = null;
        jSTypeRegistry64.unregisterPropertyOnType("(Not declared as a type name)", jSType66);
        com.google.javascript.rhino.jstype.JSType jSType68 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray70 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType71 = jSTypeRegistry64.createFunctionType(jSType68, true, jSTypeArray70);
        com.google.javascript.rhino.jstype.JSType jSType72 = functionType71.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.EnumType enumType73 = functionType71.toMaybeEnumType();
        com.google.javascript.rhino.jstype.FunctionType functionType74 = functionType71.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType75 = jSTypeRegistry61.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType71);
        com.google.javascript.rhino.ErrorReporter errorReporter77 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry79 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter77, true);
        com.google.javascript.rhino.jstype.JSType jSType81 = null;
        jSTypeRegistry79.unregisterPropertyOnType("(Not declared as a type name)", jSType81);
        com.google.javascript.rhino.jstype.JSType jSType83 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray85 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType86 = jSTypeRegistry79.createFunctionType(jSType83, true, jSTypeArray85);
        com.google.javascript.rhino.jstype.JSType jSType87 = functionType86.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.ObjectType objectType88 = functionType86.toObjectType();
        jSTypeRegistry61.registerPropertyOnType("Function", (com.google.javascript.rhino.jstype.JSType) functionType86);
        parameterizedType48.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType86);
        com.google.common.collect.ImmutableList<java.lang.String> strList91 = functionType86.getTemplateTypeNames();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test324");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = functionType9.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        jSTypeRegistry14.unregisterPropertyOnType("(Not declared as a type name)", jSType16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType21 = jSTypeRegistry14.createFunctionType(jSType18, true, jSTypeArray20);
        boolean boolean22 = functionType21.isReturnTypeInferred();
        com.google.javascript.rhino.jstype.JSType jSType23 = functionType9.getGreatestSubtype((com.google.javascript.rhino.jstype.JSType) functionType21);
        boolean boolean24 = functionType21.isAllType();
        java.lang.String str25 = functionType21.toDebugHashCodeString();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, false);
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, true);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        jSTypeRegistry31.unregisterPropertyOnType("(Not declared as a type name)", jSType33);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray37 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry31.createFunctionType(jSType35, true, jSTypeArray37);
        com.google.javascript.rhino.jstype.JSType jSType39 = functionType38.autoboxesTo();
        java.lang.String str40 = functionType38.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41, true);
        com.google.javascript.rhino.jstype.JSType jSType45 = null;
        jSTypeRegistry43.unregisterPropertyOnType("(Not declared as a type name)", jSType45);
        com.google.javascript.rhino.jstype.JSType jSType47 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry43.createFunctionType(jSType47, true, jSTypeArray49);
        com.google.common.collect.ImmutableList<java.lang.String> strList51 = functionType50.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot53 = functionType50.getSlot("NUMBER 0.0 100\n");
        boolean boolean54 = functionType50.isAllType();
        boolean boolean55 = functionType38.hasEqualCallType(functionType50);
        com.google.javascript.rhino.jstype.FunctionType functionType56 = functionType50.getOwnerFunction();
        java.util.Set<java.lang.String> strSet57 = functionType50.getOwnPropertyNames();
        boolean boolean58 = functionType50.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        jSTypeRegistry61.unregisterPropertyOnType("(Not declared as a type name)", jSType63);
        com.google.javascript.rhino.jstype.JSType jSType65 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray67 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType68 = jSTypeRegistry61.createFunctionType(jSType65, true, jSTypeArray67);
        boolean boolean69 = functionType68.isReturnTypeInferred();
        boolean boolean70 = functionType68.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType72 = functionType68.getBindReturnType((int) (short) 1);
        java.lang.String str73 = functionType72.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType74 = jSTypeRegistry28.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType50, (com.google.javascript.rhino.jstype.JSType) functionType72);
        com.google.javascript.rhino.JSDocInfo jSDocInfo76 = parameterizedType74.getOwnPropertyJSDocInfo("");
        java.lang.String str77 = parameterizedType74.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.ObjectType.Property property79 = parameterizedType74.getSlot("java.io.IOException: java.io.IOException");
        boolean boolean81 = parameterizedType74.isPropertyTypeDeclared("function (): {1393951772}");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue82 = functionType21.testForEquality((com.google.javascript.rhino.jstype.JSType) parameterizedType74);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue83 = ternaryValue82.not();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType50 and parameterizedType74.", functionType50.equals(parameterizedType74) == parameterizedType74.equals(functionType50));
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test325");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType48.getTypeOfThis();
        boolean boolean53 = parameterizedType48.removeProperty("function (): {646790426}");
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        jSTypeRegistry56.unregisterPropertyOnType("(Not declared as a type name)", jSType58);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray62 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry56.createFunctionType(jSType60, true, jSTypeArray62);
        com.google.common.collect.ImmutableList<java.lang.String> strList64 = functionType63.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot66 = functionType63.getSlot("NUMBER 0.0 100\n");
        boolean boolean67 = functionType63.isAllType();
        com.google.javascript.rhino.ErrorReporter errorReporter68 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter68, true);
        com.google.javascript.rhino.jstype.JSType jSType72 = null;
        jSTypeRegistry70.unregisterPropertyOnType("(Not declared as a type name)", jSType72);
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray76 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType77 = jSTypeRegistry70.createFunctionType(jSType74, true, jSTypeArray76);
        boolean boolean79 = functionType77.removeProperty("false");
        com.google.javascript.rhino.jstype.JSType jSType81 = functionType77.findPropertyType("Not declared as a type name");
        boolean boolean82 = functionType63.differsFrom((com.google.javascript.rhino.jstype.JSType) functionType77);
        com.google.javascript.rhino.ErrorReporter errorReporter83 = null;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope84 = null;
        com.google.javascript.rhino.jstype.JSType jSType85 = functionType77.resolve(errorReporter83, jSTypeStaticScope84);
        boolean boolean86 = functionType77.isNullable();
        boolean boolean87 = parameterizedType48.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType77);
        com.google.javascript.rhino.jstype.FunctionType functionType88 = parameterizedType48.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType90 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface((com.google.javascript.rhino.jstype.ObjectType) functionType88, "{proxy:function (): {1379032299}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType88 and parameterizedType48.", functionType88.equals(parameterizedType48) == parameterizedType48.equals(functionType88));
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test326");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        boolean boolean2 = node1.isInstanceOf();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = new com.google.javascript.rhino.JSTypeExpression(node1, "hi!");
        com.google.javascript.rhino.Node node5 = jSTypeExpression4.getRoot();
        boolean boolean6 = jSTypeExpression4.isVarArgs();
        boolean boolean7 = jSTypeExpression4.isOptionalArg();
        com.google.javascript.rhino.Node node8 = jSTypeExpression4.getRoot();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, false);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        jSTypeRegistry14.unregisterPropertyOnType("(Not declared as a type name)", jSType16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType21 = jSTypeRegistry14.createFunctionType(jSType18, true, jSTypeArray20);
        com.google.javascript.rhino.jstype.JSType jSType22 = functionType21.autoboxesTo();
        java.lang.String str23 = functionType21.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24, true);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        jSTypeRegistry26.unregisterPropertyOnType("(Not declared as a type name)", jSType28);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry26.createFunctionType(jSType30, true, jSTypeArray32);
        com.google.common.collect.ImmutableList<java.lang.String> strList34 = functionType33.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot36 = functionType33.getSlot("NUMBER 0.0 100\n");
        boolean boolean37 = functionType33.isAllType();
        boolean boolean38 = functionType21.hasEqualCallType(functionType33);
        com.google.javascript.rhino.jstype.FunctionType functionType39 = functionType33.getOwnerFunction();
        java.util.Set<java.lang.String> strSet40 = functionType33.getOwnPropertyNames();
        boolean boolean41 = functionType33.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, true);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        jSTypeRegistry44.unregisterPropertyOnType("(Not declared as a type name)", jSType46);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray50 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType51 = jSTypeRegistry44.createFunctionType(jSType48, true, jSTypeArray50);
        boolean boolean52 = functionType51.isReturnTypeInferred();
        boolean boolean53 = functionType51.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType55 = functionType51.getBindReturnType((int) (short) 1);
        java.lang.String str56 = functionType55.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType57 = jSTypeRegistry11.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType33, (com.google.javascript.rhino.jstype.JSType) functionType55);
        com.google.javascript.rhino.JSDocInfo jSDocInfo59 = parameterizedType57.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType60 = parameterizedType57.getTypeOfThis();
        boolean boolean62 = parameterizedType57.removeProperty("function (): {646790426}");
        java.util.Set set63 = parameterizedType57.getOwnPropertyNames();
        boolean boolean64 = parameterizedType57.isNominalType();
        boolean boolean65 = parameterizedType57.isNullable();
        java.util.Set set66 = parameterizedType57.getOwnPropertyNames();
        boolean boolean67 = jSTypeExpression4.equals((java.lang.Object) set66);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType33 and parameterizedType57.", functionType33.equals(parameterizedType57) == parameterizedType57.equals(functionType33));
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test327");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = functionType9.removeProperty("false");
        boolean boolean12 = functionType9.hasDisplayName();
        boolean boolean13 = functionType9.isStringObjectType();
        java.util.Set<java.lang.String> strSet14 = functionType9.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.JSType jSType15 = functionType9.getTypeOfThis();
        java.lang.String str16 = functionType9.toDebugHashCodeString();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20, true);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        jSTypeRegistry22.unregisterPropertyOnType("(Not declared as a type name)", jSType24);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray28 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry22.createFunctionType(jSType26, true, jSTypeArray28);
        com.google.javascript.rhino.jstype.JSType jSType30 = functionType29.autoboxesTo();
        java.lang.String str31 = functionType29.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, true);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        jSTypeRegistry34.unregisterPropertyOnType("(Not declared as a type name)", jSType36);
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType41 = jSTypeRegistry34.createFunctionType(jSType38, true, jSTypeArray40);
        com.google.common.collect.ImmutableList<java.lang.String> strList42 = functionType41.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot44 = functionType41.getSlot("NUMBER 0.0 100\n");
        boolean boolean45 = functionType41.isAllType();
        boolean boolean46 = functionType29.hasEqualCallType(functionType41);
        com.google.javascript.rhino.jstype.FunctionType functionType47 = functionType41.getOwnerFunction();
        java.util.Set<java.lang.String> strSet48 = functionType41.getOwnPropertyNames();
        boolean boolean49 = functionType41.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50, true);
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        jSTypeRegistry52.unregisterPropertyOnType("(Not declared as a type name)", jSType54);
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType59 = jSTypeRegistry52.createFunctionType(jSType56, true, jSTypeArray58);
        boolean boolean60 = functionType59.isReturnTypeInferred();
        boolean boolean61 = functionType59.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType63 = functionType59.getBindReturnType((int) (short) 1);
        java.lang.String str64 = functionType63.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType65 = jSTypeRegistry19.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType41, (com.google.javascript.rhino.jstype.JSType) functionType63);
        boolean boolean66 = parameterizedType65.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType67 = parameterizedType65.getIndexType();
        boolean boolean68 = parameterizedType65.matchesNumberContext();
        boolean boolean69 = parameterizedType65.isCheckedUnknownType();
        java.lang.String str70 = parameterizedType65.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.JSType jSType72 = parameterizedType65.getPropertyType("function (): {2115759764}");
        boolean boolean73 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) functionType9, (com.google.javascript.rhino.jstype.JSType) parameterizedType65);
        com.google.common.collect.ImmutableList<java.lang.String> strList74 = functionType9.getTemplateTypeNames();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType41 and parameterizedType65.", functionType41.equals(parameterizedType65) == parameterizedType65.equals(functionType41));
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test328");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType.Property property52 = parameterizedType48.getSlot("(Not declared as a type name)");
        boolean boolean53 = parameterizedType48.hasAnyTemplateInternal();
        com.google.javascript.rhino.JSDocInfo jSDocInfo54 = parameterizedType48.getJSDocInfo();
        com.google.javascript.rhino.jstype.FunctionType functionType55 = parameterizedType48.toMaybeFunctionType();
        functionType55.clearResolved();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType55 and parameterizedType48.", functionType55.equals(parameterizedType48) == parameterizedType48.equals(functionType55));
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test329");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType48.getTypeOfThis();
        boolean boolean53 = parameterizedType48.removeProperty("function (): {646790426}");
        boolean boolean54 = parameterizedType48.canBeCalled();
        boolean boolean55 = parameterizedType48.isNativeObjectType();
        boolean boolean56 = parameterizedType48.isResolved();
        boolean boolean57 = parameterizedType48.isOrdinaryFunction();
        boolean boolean58 = parameterizedType48.isNoResolvedType();
        com.google.javascript.rhino.jstype.ObjectType objectType59 = parameterizedType48.getImplicitPrototype();
        com.google.javascript.rhino.Node node60 = objectType59.getRootNode();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test330");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((-1.0d), 32, 49);
        com.google.javascript.rhino.jstype.JSType jSType4 = node3.getJSType();
        boolean boolean5 = node3.isHook();
        com.google.javascript.rhino.Node node6 = node3.getLastSibling();
        boolean boolean7 = node3.isName();
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        jSTypeRegistry10.unregisterPropertyOnType("(Not declared as a type name)", jSType12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType17 = jSTypeRegistry10.createFunctionType(jSType14, true, jSTypeArray16);
        boolean boolean19 = functionType17.removeProperty("false");
        boolean boolean20 = functionType17.hasDisplayName();
        boolean boolean21 = functionType17.isStringObjectType();
        java.util.Set<java.lang.String> strSet22 = functionType17.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.JSType jSType23 = functionType17.getTypeOfThis();
        java.lang.String str24 = functionType17.toDebugHashCodeString();
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25, false);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        jSTypeRegistry30.unregisterPropertyOnType("(Not declared as a type name)", jSType32);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry30.createFunctionType(jSType34, true, jSTypeArray36);
        com.google.javascript.rhino.jstype.JSType jSType38 = functionType37.autoboxesTo();
        java.lang.String str39 = functionType37.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        jSTypeRegistry42.unregisterPropertyOnType("(Not declared as a type name)", jSType44);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray48 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry42.createFunctionType(jSType46, true, jSTypeArray48);
        com.google.common.collect.ImmutableList<java.lang.String> strList50 = functionType49.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot52 = functionType49.getSlot("NUMBER 0.0 100\n");
        boolean boolean53 = functionType49.isAllType();
        boolean boolean54 = functionType37.hasEqualCallType(functionType49);
        com.google.javascript.rhino.jstype.FunctionType functionType55 = functionType49.getOwnerFunction();
        java.util.Set<java.lang.String> strSet56 = functionType49.getOwnPropertyNames();
        boolean boolean57 = functionType49.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter58 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter58, true);
        com.google.javascript.rhino.jstype.JSType jSType62 = null;
        jSTypeRegistry60.unregisterPropertyOnType("(Not declared as a type name)", jSType62);
        com.google.javascript.rhino.jstype.JSType jSType64 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray66 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType67 = jSTypeRegistry60.createFunctionType(jSType64, true, jSTypeArray66);
        boolean boolean68 = functionType67.isReturnTypeInferred();
        boolean boolean69 = functionType67.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType71 = functionType67.getBindReturnType((int) (short) 1);
        java.lang.String str72 = functionType71.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType73 = jSTypeRegistry27.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType49, (com.google.javascript.rhino.jstype.JSType) functionType71);
        boolean boolean74 = parameterizedType73.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType75 = parameterizedType73.getIndexType();
        boolean boolean76 = parameterizedType73.matchesNumberContext();
        boolean boolean77 = parameterizedType73.isCheckedUnknownType();
        java.lang.String str78 = parameterizedType73.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.JSType jSType80 = parameterizedType73.getPropertyType("function (): {2115759764}");
        boolean boolean81 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) functionType17, (com.google.javascript.rhino.jstype.JSType) parameterizedType73);
        java.lang.String str82 = parameterizedType73.toDebugHashCodeString();
        java.util.Set<java.lang.String> strSet83 = parameterizedType73.getPropertyNames();
        node3.setDirectives(strSet83);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType49 and parameterizedType73.", functionType49.equals(parameterizedType73) == parameterizedType73.equals(functionType49));
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test331");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType50 = parameterizedType48.getIndexType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType51 = parameterizedType48.toMaybeParameterizedType();
        com.google.javascript.rhino.jstype.EnumType enumType52 = parameterizedType48.toMaybeEnumType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test332");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType48.getTypeOfThis();
        boolean boolean53 = parameterizedType48.removeProperty("function (): {646790426}");
        java.util.Set set54 = parameterizedType48.getOwnPropertyNames();
        boolean boolean55 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType56 = parameterizedType48.toMaybeEnumElementType();
        java.lang.String str57 = parameterizedType48.toDebugHashCodeString();
        boolean boolean58 = parameterizedType48.isNominalType();
        boolean boolean59 = parameterizedType48.isNoObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType60 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) parameterizedType48);
        boolean boolean62 = parameterizedType48.isPropertyTypeInferred("{proxy:function (): {2102377855}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test333");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        java.lang.String str51 = parameterizedType48.toDebugHashCodeString();
        boolean boolean52 = parameterizedType48.matchesObjectContext();
        com.google.javascript.rhino.jstype.JSType jSType53 = parameterizedType48.restrictByNotNullOrUndefined();
        boolean boolean54 = parameterizedType48.isOrdinaryFunction();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test334");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType.Property property52 = parameterizedType48.getSlot("(Not declared as a type name)");
        boolean boolean53 = parameterizedType48.isNoObjectType();
        java.lang.Iterable iterable54 = parameterizedType48.getCtorImplementedInterfaces();
        java.lang.String str55 = parameterizedType48.toDebugHashCodeString();
        java.lang.String str56 = parameterizedType48.toDebugHashCodeString();
        boolean boolean57 = parameterizedType48.isConstructor();
        boolean boolean58 = parameterizedType48.hasReferenceName();
        boolean boolean59 = parameterizedType48.isOrdinaryFunction();
        boolean boolean61 = parameterizedType48.hasOwnProperty("function (): {259080799}");
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType62 = parameterizedType48.toMaybeParameterizedType();
        com.google.javascript.rhino.jstype.ObjectType objectType63 = parameterizedType62.getTypeOfThis();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType62.", functionType24.equals(parameterizedType62) == parameterizedType62.equals(functionType24));
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test335");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        boolean boolean2 = node1.isCall();
        boolean boolean3 = node1.isDefaultCase();
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(0);
        boolean boolean6 = node5.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile7 = node5.getStaticSourceFile();
        node5.setLineno((int) '4');
        com.google.javascript.rhino.Node node10 = node1.srcref(node5);
        int int11 = node5.getCharno();
        boolean boolean12 = node5.isComma();
        boolean boolean13 = node5.isDefaultCase();
        boolean boolean14 = node5.isQuotedString();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable15 = node5.children();
        boolean boolean16 = node5.isString();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, false);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        jSTypeRegistry23.unregisterPropertyOnType("(Not declared as a type name)", jSType25);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry23.createFunctionType(jSType27, true, jSTypeArray29);
        com.google.javascript.rhino.jstype.JSType jSType31 = functionType30.autoboxesTo();
        java.lang.String str32 = functionType30.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        com.google.common.collect.ImmutableList<java.lang.String> strList43 = functionType42.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot45 = functionType42.getSlot("NUMBER 0.0 100\n");
        boolean boolean46 = functionType42.isAllType();
        boolean boolean47 = functionType30.hasEqualCallType(functionType42);
        com.google.javascript.rhino.jstype.FunctionType functionType48 = functionType42.getOwnerFunction();
        java.util.Set<java.lang.String> strSet49 = functionType42.getOwnPropertyNames();
        boolean boolean50 = functionType42.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51, true);
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        jSTypeRegistry53.unregisterPropertyOnType("(Not declared as a type name)", jSType55);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray59 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry53.createFunctionType(jSType57, true, jSTypeArray59);
        boolean boolean61 = functionType60.isReturnTypeInferred();
        boolean boolean62 = functionType60.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType64 = functionType60.getBindReturnType((int) (short) 1);
        java.lang.String str65 = functionType64.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType66 = jSTypeRegistry20.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType42, (com.google.javascript.rhino.jstype.JSType) functionType64);
        com.google.javascript.rhino.JSDocInfo jSDocInfo68 = parameterizedType66.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType69 = parameterizedType66.getTypeOfThis();
        boolean boolean71 = parameterizedType66.removeProperty("function (): {646790426}");
        com.google.javascript.rhino.jstype.JSType jSType73 = parameterizedType66.getPropertyType("NUMBER 0.0 100\n");
        boolean boolean74 = parameterizedType66.isNativeObjectType();
        boolean boolean75 = parameterizedType66.isInstanceType();
        boolean boolean76 = parameterizedType66.isConstructor();
        com.google.javascript.rhino.jstype.FunctionType functionType77 = parameterizedType66.toMaybeFunctionType();
        node5.putProp((int) ' ', (java.lang.Object) parameterizedType66);
        boolean boolean79 = node5.isLabelName();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType42 and parameterizedType66.", functionType42.equals(parameterizedType66) == parameterizedType66.equals(functionType42));
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test336");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType48.getTypeOfThis();
        boolean boolean53 = parameterizedType48.removeProperty("function (): {646790426}");
        java.util.Set set54 = parameterizedType48.getOwnPropertyNames();
        boolean boolean55 = parameterizedType48.isNominalType();
        boolean boolean56 = parameterizedType48.isNullable();
        java.util.Set set57 = parameterizedType48.getOwnPropertyNames();
        java.util.Iterator<java.lang.String> strItor58 = set57.iterator();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test337");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType.Property property52 = parameterizedType48.getSlot("(Not declared as a type name)");
        boolean boolean53 = parameterizedType48.isNoObjectType();
        java.lang.Iterable iterable54 = parameterizedType48.getCtorImplementedInterfaces();
        java.lang.String str55 = parameterizedType48.toDebugHashCodeString();
        java.lang.String str56 = parameterizedType48.toDebugHashCodeString();
        boolean boolean57 = parameterizedType48.isConstructor();
        boolean boolean58 = parameterizedType48.hasReferenceName();
        boolean boolean59 = parameterizedType48.isOrdinaryFunction();
        boolean boolean61 = parameterizedType48.hasOwnProperty("function (): {259080799}");
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType62 = parameterizedType48.toMaybeParameterizedType();
        boolean boolean63 = parameterizedType62.isUnknownType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType62.", functionType24.equals(parameterizedType62) == parameterizedType62.equals(functionType24));
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test338");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        boolean boolean2 = node1.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile3 = node1.getStaticSourceFile();
        com.google.javascript.rhino.Node node4 = node1.getNext();
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(0);
        node6.putIntProp((-1), 35);
        boolean boolean10 = node6.isStringKey();
        boolean boolean11 = node6.isThrow();
        boolean boolean12 = node6.isEmpty();
        com.google.javascript.rhino.Node node13 = node1.copyInformationFrom(node6);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(0);
        node17.putIntProp((-1), 35);
        boolean boolean21 = node17.isStringKey();
        boolean boolean22 = node17.isThrow();
        com.google.javascript.rhino.Node node23 = node15.useSourceInfoFrom(node17);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(0);
        boolean boolean26 = node25.isCall();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(0);
        node29.putIntProp((-1), 35);
        boolean boolean33 = node29.isReturn();
        com.google.common.collect.ImmutableList<java.lang.Object> objList34 = com.google.common.collect.ImmutableList.of((java.lang.Object) node1, (java.lang.Object) node17, (java.lang.Object) node25, (java.lang.Object) 53, (java.lang.Object) node29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node36 = node1.getChildAtIndex((int) '4');
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test339");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        java.lang.String str51 = parameterizedType48.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.JSType jSType52 = parameterizedType48.collapseUnion();
        boolean boolean53 = parameterizedType48.isNoObjectType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test340");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType9.restrictByNotNullOrUndefined();
        boolean boolean11 = functionType9.isUnionType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo12 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean13 = jSDocInfo12.hasThisType();
        boolean boolean14 = jSDocInfo12.shouldPreserveTry();
        boolean boolean15 = jSDocInfo12.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression17 = jSDocInfo12.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean18 = jSDocInfo12.shouldPreserveTry();
        boolean boolean19 = jSDocInfo12.hasFileOverview();
        java.util.Collection<java.lang.String> strCollection20 = jSDocInfo12.getAuthors();
        java.lang.String str21 = jSDocInfo12.getReturnDescription();
        boolean boolean22 = jSDocInfo12.isOverride();
        functionType9.setJSDocInfo(jSDocInfo12);
        com.google.javascript.rhino.jstype.JSType jSType25 = functionType9.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, false);
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, true);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        jSTypeRegistry31.unregisterPropertyOnType("(Not declared as a type name)", jSType33);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray37 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry31.createFunctionType(jSType35, true, jSTypeArray37);
        com.google.javascript.rhino.jstype.JSType jSType39 = functionType38.autoboxesTo();
        java.lang.String str40 = functionType38.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41, true);
        com.google.javascript.rhino.jstype.JSType jSType45 = null;
        jSTypeRegistry43.unregisterPropertyOnType("(Not declared as a type name)", jSType45);
        com.google.javascript.rhino.jstype.JSType jSType47 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry43.createFunctionType(jSType47, true, jSTypeArray49);
        com.google.common.collect.ImmutableList<java.lang.String> strList51 = functionType50.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot53 = functionType50.getSlot("NUMBER 0.0 100\n");
        boolean boolean54 = functionType50.isAllType();
        boolean boolean55 = functionType38.hasEqualCallType(functionType50);
        com.google.javascript.rhino.jstype.FunctionType functionType56 = functionType50.getOwnerFunction();
        java.util.Set<java.lang.String> strSet57 = functionType50.getOwnPropertyNames();
        boolean boolean58 = functionType50.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        jSTypeRegistry61.unregisterPropertyOnType("(Not declared as a type name)", jSType63);
        com.google.javascript.rhino.jstype.JSType jSType65 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray67 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType68 = jSTypeRegistry61.createFunctionType(jSType65, true, jSTypeArray67);
        boolean boolean69 = functionType68.isReturnTypeInferred();
        boolean boolean70 = functionType68.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType72 = functionType68.getBindReturnType((int) (short) 1);
        java.lang.String str73 = functionType72.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType74 = jSTypeRegistry28.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType50, (com.google.javascript.rhino.jstype.JSType) functionType72);
        com.google.javascript.rhino.JSDocInfo jSDocInfo76 = parameterizedType74.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType.Property property78 = parameterizedType74.getSlot("(Not declared as a type name)");
        boolean boolean79 = parameterizedType74.hasAnyTemplateInternal();
        boolean boolean81 = parameterizedType74.hasProperty("{proxy:function (): {1556474225}}");
        boolean boolean82 = parameterizedType74.isNoType();
        boolean boolean83 = parameterizedType74.isInterface();
        com.google.javascript.rhino.jstype.JSType jSType84 = parameterizedType74.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair85 = jSType25.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) parameterizedType74);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType50 and parameterizedType74.", functionType50.equals(parameterizedType74) == parameterizedType74.equals(functionType50));
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test341");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType48.getTypeOfThis();
        boolean boolean53 = parameterizedType48.removeProperty("function (): {646790426}");
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        jSTypeRegistry56.unregisterPropertyOnType("(Not declared as a type name)", jSType58);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray62 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry56.createFunctionType(jSType60, true, jSTypeArray62);
        com.google.common.collect.ImmutableList<java.lang.String> strList64 = functionType63.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot66 = functionType63.getSlot("NUMBER 0.0 100\n");
        boolean boolean67 = functionType63.isAllType();
        com.google.javascript.rhino.ErrorReporter errorReporter68 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter68, true);
        com.google.javascript.rhino.jstype.JSType jSType72 = null;
        jSTypeRegistry70.unregisterPropertyOnType("(Not declared as a type name)", jSType72);
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray76 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType77 = jSTypeRegistry70.createFunctionType(jSType74, true, jSTypeArray76);
        boolean boolean79 = functionType77.removeProperty("false");
        com.google.javascript.rhino.jstype.JSType jSType81 = functionType77.findPropertyType("Not declared as a type name");
        boolean boolean82 = functionType63.differsFrom((com.google.javascript.rhino.jstype.JSType) functionType77);
        com.google.javascript.rhino.ErrorReporter errorReporter83 = null;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope84 = null;
        com.google.javascript.rhino.jstype.JSType jSType85 = functionType77.resolve(errorReporter83, jSTypeStaticScope84);
        boolean boolean86 = functionType77.isNullable();
        boolean boolean87 = parameterizedType48.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType77);
        boolean boolean88 = parameterizedType48.isInstanceType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType89 = parameterizedType48.toMaybeParameterizedType();
        boolean boolean90 = parameterizedType89.matchesObjectContext();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType89.", functionType24.equals(parameterizedType89) == parameterizedType89.equals(functionType24));
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test342");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType50 = parameterizedType48.getIndexType();
        com.google.javascript.rhino.Node node52 = parameterizedType48.getPropertyNode("function (): {259080799}");
        java.lang.String str53 = parameterizedType48.getDisplayName();
        boolean boolean55 = parameterizedType48.isPropertyInExterns("hi!");
        boolean boolean57 = parameterizedType48.isPropertyTypeInferred("{proxy:function (): {1315738101}}");
        com.google.javascript.rhino.jstype.FunctionType functionType58 = parameterizedType48.getConstructor();
        boolean boolean59 = parameterizedType48.isNominalType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo61 = parameterizedType48.getOwnPropertyJSDocInfo("function (): {1156191911}");
        com.google.javascript.rhino.JSDocInfo jSDocInfo62 = parameterizedType48.getJSDocInfo();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType63 = parameterizedType48.toMaybeParameterizedType();
        java.lang.String str64 = parameterizedType63.getReferenceName();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType63.", functionType24.equals(parameterizedType63) == parameterizedType63.equals(functionType24));
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test343");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = functionType9.removeProperty("false");
        boolean boolean12 = functionType9.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        jSTypeRegistry15.unregisterPropertyOnType("(Not declared as a type name)", jSType17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry15.createFunctionType(jSType19, true, jSTypeArray21);
        boolean boolean23 = functionType22.hasReferenceName();
        boolean boolean24 = functionType9.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType22);
        boolean boolean25 = functionType9.isReturnTypeInferred();
        boolean boolean26 = functionType9.isConstructor();
        boolean boolean27 = functionType9.isInstanceType();
        boolean boolean28 = functionType9.isOrdinaryFunction();
        com.google.javascript.rhino.Node node30 = functionType9.getPropertyNode("{proxy:function (): {1659845601}}");
        com.google.javascript.rhino.jstype.EnumElementType enumElementType31 = functionType9.toMaybeEnumElementType();
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35, true);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        jSTypeRegistry37.unregisterPropertyOnType("(Not declared as a type name)", jSType39);
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray43 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry37.createFunctionType(jSType41, true, jSTypeArray43);
        com.google.javascript.rhino.jstype.JSType jSType45 = functionType44.autoboxesTo();
        java.lang.String str46 = functionType44.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47, true);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        jSTypeRegistry49.unregisterPropertyOnType("(Not declared as a type name)", jSType51);
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray55 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry49.createFunctionType(jSType53, true, jSTypeArray55);
        com.google.common.collect.ImmutableList<java.lang.String> strList57 = functionType56.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot59 = functionType56.getSlot("NUMBER 0.0 100\n");
        boolean boolean60 = functionType56.isAllType();
        boolean boolean61 = functionType44.hasEqualCallType(functionType56);
        com.google.javascript.rhino.jstype.FunctionType functionType62 = functionType56.getOwnerFunction();
        java.util.Set<java.lang.String> strSet63 = functionType56.getOwnPropertyNames();
        boolean boolean64 = functionType56.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65, true);
        com.google.javascript.rhino.jstype.JSType jSType69 = null;
        jSTypeRegistry67.unregisterPropertyOnType("(Not declared as a type name)", jSType69);
        com.google.javascript.rhino.jstype.JSType jSType71 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray73 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType74 = jSTypeRegistry67.createFunctionType(jSType71, true, jSTypeArray73);
        boolean boolean75 = functionType74.isReturnTypeInferred();
        boolean boolean76 = functionType74.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType78 = functionType74.getBindReturnType((int) (short) 1);
        java.lang.String str79 = functionType78.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType80 = jSTypeRegistry34.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType56, (com.google.javascript.rhino.jstype.JSType) functionType78);
        boolean boolean81 = parameterizedType80.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType82 = parameterizedType80.getIndexType();
        com.google.javascript.rhino.Node node84 = parameterizedType80.getPropertyNode("function (): {259080799}");
        boolean boolean85 = parameterizedType80.isNullType();
        com.google.javascript.rhino.jstype.JSType jSType87 = parameterizedType80.findPropertyType("PARAM_LIST\n");
        com.google.javascript.rhino.jstype.ObjectType objectType88 = parameterizedType80.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType89 = parameterizedType80.collapseUnion();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue90 = functionType9.testForEquality(jSType89);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType56 and jSType89.", functionType56.equals(jSType89) == jSType89.equals(functionType56));
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test344");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType.Property property52 = parameterizedType48.getSlot("(Not declared as a type name)");
        boolean boolean53 = parameterizedType48.isNoObjectType();
        java.lang.Iterable iterable54 = parameterizedType48.getCtorImplementedInterfaces();
        java.lang.String str55 = parameterizedType48.toDebugHashCodeString();
        java.lang.String str56 = parameterizedType48.toDebugHashCodeString();
        boolean boolean57 = parameterizedType48.isConstructor();
        boolean boolean58 = parameterizedType48.hasReferenceName();
        boolean boolean59 = parameterizedType48.isOrdinaryFunction();
        boolean boolean61 = parameterizedType48.hasOwnProperty("function (): {259080799}");
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType62 = parameterizedType48.toMaybeParameterizedType();
        boolean boolean63 = parameterizedType48.hasAnyTemplate();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test345");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = functionType9.getTemplateTypeNames();
        boolean boolean11 = functionType9.isReturnTypeInferred();
        com.google.javascript.rhino.Node node12 = functionType9.getRootNode();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean14 = jSDocInfo13.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression15 = jSDocInfo13.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility16 = null;
        jSDocInfo13.setVisibility(visibility16);
        boolean boolean18 = jSDocInfo13.isOverride();
        functionType9.setJSDocInfo(jSDocInfo13);
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean22 = jSDocInfo21.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression23 = jSDocInfo21.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility24 = null;
        jSDocInfo21.setVisibility(visibility24);
        int int26 = jSDocInfo21.getExtendedInterfacesCount();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList27 = jSDocInfo21.getImplementedInterfaces();
        com.google.common.collect.ImmutableList<java.lang.String> strList28 = jSDocInfo21.getTemplateTypeNames();
        functionType9.setPropertyJSDocInfo("function (): {1442205556}", jSDocInfo21);
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, false);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        com.google.javascript.rhino.jstype.JSType jSType43 = functionType42.autoboxesTo();
        java.lang.String str44 = functionType42.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, true);
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        jSTypeRegistry47.unregisterPropertyOnType("(Not declared as a type name)", jSType49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray53 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType54 = jSTypeRegistry47.createFunctionType(jSType51, true, jSTypeArray53);
        com.google.common.collect.ImmutableList<java.lang.String> strList55 = functionType54.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot57 = functionType54.getSlot("NUMBER 0.0 100\n");
        boolean boolean58 = functionType54.isAllType();
        boolean boolean59 = functionType42.hasEqualCallType(functionType54);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = functionType54.getOwnerFunction();
        java.util.Set<java.lang.String> strSet61 = functionType54.getOwnPropertyNames();
        boolean boolean62 = functionType54.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63, true);
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        jSTypeRegistry65.unregisterPropertyOnType("(Not declared as a type name)", jSType67);
        com.google.javascript.rhino.jstype.JSType jSType69 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray71 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry65.createFunctionType(jSType69, true, jSTypeArray71);
        boolean boolean73 = functionType72.isReturnTypeInferred();
        boolean boolean74 = functionType72.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType76 = functionType72.getBindReturnType((int) (short) 1);
        java.lang.String str77 = functionType76.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType78 = jSTypeRegistry32.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType54, (com.google.javascript.rhino.jstype.JSType) functionType76);
        com.google.javascript.rhino.JSDocInfo jSDocInfo80 = parameterizedType78.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType81 = parameterizedType78.getTypeOfThis();
        boolean boolean83 = parameterizedType78.removeProperty("function (): {646790426}");
        boolean boolean84 = parameterizedType78.canBeCalled();
        boolean boolean85 = parameterizedType78.isNativeObjectType();
        boolean boolean86 = parameterizedType78.isResolved();
        boolean boolean87 = parameterizedType78.isUnknownType();
        boolean boolean88 = functionType9.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType) parameterizedType78);
        boolean boolean90 = parameterizedType78.isPropertyTypeInferred("NUMBER 0.0\n");
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType91 = parameterizedType78.toMaybeParameterizedType();
        com.google.javascript.rhino.jstype.FunctionType functionType92 = parameterizedType78.getOwnerFunction();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType54 and parameterizedType78.", functionType54.equals(parameterizedType78) == parameterizedType78.equals(functionType54));
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test346");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = functionType46.hasReferenceName();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test347");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType50 = parameterizedType48.getIndexType();
        com.google.javascript.rhino.Node node52 = parameterizedType48.getPropertyNode("function (): {259080799}");
        boolean boolean53 = parameterizedType48.hasReferenceName();
        boolean boolean54 = parameterizedType48.isCheckedUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType55 = parameterizedType48.getTypeOfThis();
        com.google.javascript.rhino.JSDocInfo jSDocInfo56 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean57 = jSDocInfo56.hasThisType();
        boolean boolean58 = jSDocInfo56.isExterns();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection59 = jSDocInfo56.getTypeNodes();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility60 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        jSDocInfo56.setVisibility(visibility60);
        boolean boolean62 = jSDocInfo56.isOverride();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList63 = jSDocInfo56.getImplementedInterfaces();
        java.lang.String str64 = jSDocInfo56.getMeaning();
        parameterizedType48.setJSDocInfo(jSDocInfo56);
        boolean boolean66 = jSDocInfo56.hasReturnType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test348");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList6 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray5);
        java.lang.String str7 = charSequenceList6.toString();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(0);
        node11.putIntProp((-1), 35);
        boolean boolean15 = node11.isStringKey();
        boolean boolean16 = node11.isThrow();
        com.google.javascript.rhino.Node node17 = node9.useSourceInfoFrom(node11);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(0);
        boolean boolean21 = node20.isCall();
        com.google.javascript.rhino.Node node22 = node20.cloneTree();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString((int) (short) 1, "");
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(35, node22, node25);
        com.google.javascript.rhino.Node node27 = node9.copyInformationFrom(node22);
        int int28 = charSequenceList6.lastIndexOf((java.lang.Object) node9);
        boolean boolean29 = node9.isInstanceOf();
        boolean boolean30 = node9.isDo();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString((int) (byte) 100, "", 50, (int) ' ');
        boolean boolean36 = node35.isGetProp();
        boolean boolean37 = node35.isContinue();
        boolean boolean38 = node35.isNot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node39 = node9.getChildBefore(node35);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test349");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f), 25, 52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node5 = node3.getChildAtIndex(43);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test350");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType50 = parameterizedType48.getIndexType();
        com.google.javascript.rhino.Node node52 = parameterizedType48.getPropertyNode("function (): {259080799}");
        boolean boolean53 = parameterizedType48.hasReferenceName();
        java.util.Set set54 = parameterizedType48.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, true);
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        jSTypeRegistry57.unregisterPropertyOnType("(Not declared as a type name)", jSType59);
        com.google.javascript.rhino.jstype.JSType jSType61 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray63 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType64 = jSTypeRegistry57.createFunctionType(jSType61, true, jSTypeArray63);
        com.google.javascript.rhino.jstype.JSType jSType65 = functionType64.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.EnumType enumType66 = functionType64.toMaybeEnumType();
        com.google.javascript.rhino.jstype.FunctionType functionType67 = functionType64.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType68 = functionType64.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType69 = functionType64.getTypeOfThis();
        boolean boolean70 = parameterizedType48.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType64);
        com.google.javascript.rhino.jstype.ObjectType objectType71 = functionType64.getImplicitPrototype();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test351");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(8, "{proxy:function (): {784021526}}");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(37, "JSDocInfo");
        node6.setSourceEncodedPositionForTree(54);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(0);
        node12.putIntProp((-1), 35);
        boolean boolean16 = node12.isStringKey();
        boolean boolean17 = node12.isThrow();
        com.google.javascript.rhino.Node node18 = node10.useSourceInfoFrom(node12);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(0);
        boolean boolean22 = node21.isCall();
        com.google.javascript.rhino.Node node23 = node21.cloneTree();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString((int) (short) 1, "");
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(35, node23, node26);
        com.google.javascript.rhino.Node node28 = node10.copyInformationFrom(node23);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(0);
        boolean boolean31 = node30.isInstanceOf();
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node(0);
        node33.putIntProp((-1), 35);
        boolean boolean37 = node33.isStringKey();
        boolean boolean38 = node33.isThrow();
        boolean boolean39 = node33.isEmpty();
        com.google.javascript.rhino.Node node40 = node30.useSourceInfoFrom(node33);
        boolean boolean41 = node40.isVar();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(0);
        boolean boolean44 = node43.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile45 = node43.getStaticSourceFile();
        node43.setLineno((int) '4');
        com.google.javascript.rhino.Node node48 = node40.useSourceInfoIfMissingFrom(node43);
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj54 = node52.getProp((int) (byte) 10);
        com.google.javascript.rhino.Node node55 = node43.copyInformationFrom(node52);
        com.google.javascript.rhino.Node node56 = node28.useSourceInfoIfMissingFrom(node55);
        java.lang.String str57 = node28.getQualifiedName();
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node(409700, node6, node28);
        boolean boolean59 = node6.isLabelName();
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(41);
        boolean boolean62 = node61.hasOneChild();
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node(41);
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node(0);
        node66.putIntProp((-1), 35);
        boolean boolean70 = node66.isStringKey();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder71 = node66.getJsDocBuilderForNode();
        boolean boolean72 = node66.isTypeOf();
        com.google.javascript.rhino.Node node73 = node66.removeChildren();
        boolean boolean74 = node66.isGetElem();
        com.google.javascript.rhino.Node node75 = node64.copyInformationFrom(node66);
        boolean boolean76 = node64.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node77 = node61.useSourceInfoFromForTree(node64);
        boolean boolean78 = node64.isWith();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.replaceChild(node6, node64);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test352");
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(0);
        node2.putIntProp((-1), 35);
        boolean boolean6 = node2.isStringKey();
        boolean boolean7 = node2.isThrow();
        int int8 = node2.getLineno();
        boolean boolean9 = node2.hasChildren();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(0);
        node11.putIntProp((-1), 35);
        boolean boolean15 = node2.hasChild(node11);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(0);
        boolean boolean18 = node17.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile19 = node17.getStaticSourceFile();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(0, node11, node17, node23);
        boolean boolean25 = node24.isGetterDef();
        boolean boolean26 = node24.isAssign();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(0);
        boolean boolean29 = node28.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile30 = node28.getStaticSourceFile();
        com.google.javascript.rhino.Node node31 = node28.getNext();
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node(0);
        node33.putIntProp((-1), 35);
        boolean boolean37 = node33.isStringKey();
        boolean boolean38 = node33.isThrow();
        boolean boolean39 = node33.isEmpty();
        com.google.javascript.rhino.Node node40 = node28.copyInformationFrom(node33);
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node(0);
        node44.putIntProp((-1), 35);
        boolean boolean48 = node44.isStringKey();
        boolean boolean49 = node44.isThrow();
        com.google.javascript.rhino.Node node50 = node42.useSourceInfoFrom(node44);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(0);
        boolean boolean53 = node52.isCall();
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(0);
        node56.putIntProp((-1), 35);
        boolean boolean60 = node56.isReturn();
        com.google.common.collect.ImmutableList<java.lang.Object> objList61 = com.google.common.collect.ImmutableList.of((java.lang.Object) node28, (java.lang.Object) node44, (java.lang.Object) node52, (java.lang.Object) 53, (java.lang.Object) node56);
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node(0);
        boolean boolean64 = node63.isInstanceOf();
        node56.addChildrenToFront(node63);
        java.lang.String str66 = com.google.javascript.jscomp.NodeUtil.getSourceName(node63);
        boolean boolean67 = node63.isArrayLit();
        com.google.javascript.rhino.Node node68 = node24.useSourceInfoIfMissingFromForTree(node63);
        boolean boolean69 = node63.isComma();
        boolean boolean70 = node63.isString();
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node(0);
        node73.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node(32, node73);
        boolean boolean78 = node73.hasMoreThanOneChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node79 = node63.getChildBefore(node73);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test353");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType50 = parameterizedType48.getIndexType();
        com.google.javascript.rhino.Node node52 = parameterizedType48.getPropertyNode("function (): {259080799}");
        boolean boolean53 = parameterizedType48.hasReferenceName();
        boolean boolean54 = parameterizedType48.isCheckedUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType55 = parameterizedType48.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType jSType56 = parameterizedType48.getParameterType();
        com.google.javascript.rhino.jstype.JSType jSType57 = parameterizedType48.collapseUnion();
        com.google.javascript.rhino.jstype.ObjectType objectType58 = parameterizedType48.getTypeOfThis();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test354");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType48.getTypeOfThis();
        boolean boolean53 = parameterizedType48.removeProperty("function (): {646790426}");
        boolean boolean54 = parameterizedType48.canBeCalled();
        boolean boolean55 = parameterizedType48.isNativeObjectType();
        boolean boolean56 = parameterizedType48.isResolved();
        boolean boolean57 = parameterizedType48.isUnknownType();
        com.google.javascript.rhino.jstype.ObjectType objectType58 = parameterizedType48.getImplicitPrototype();
        boolean boolean60 = parameterizedType48.isPropertyTypeDeclared("(function (): {1826660093})");
        com.google.javascript.rhino.jstype.JSType jSType61 = parameterizedType48.collapseUnion();
        parameterizedType48.clearCachedValues();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test355");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType50 = parameterizedType48.getIndexType();
        com.google.javascript.rhino.Node node52 = parameterizedType48.getPropertyNode("function (): {259080799}");
        boolean boolean53 = parameterizedType48.matchesNumberContext();
        boolean boolean54 = parameterizedType48.matchesStringContext();
        boolean boolean56 = parameterizedType48.isPropertyInExterns("function (): {620032704}");
        com.google.javascript.rhino.jstype.ObjectType objectType57 = parameterizedType48.getImplicitPrototype();
        com.google.javascript.rhino.jstype.ObjectType objectType58 = objectType57.getTypeOfThis();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test356");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType9.restrictByNotNullOrUndefined();
        java.lang.String str11 = functionType9.toString();
        java.lang.Iterable iterable12 = functionType9.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType14 = functionType9.getPropertyType("NUMBER 0.0");
        com.google.javascript.rhino.jstype.ObjectType objectType15 = functionType9.dereference();
        boolean boolean16 = functionType9.hasReferenceName();
        boolean boolean17 = functionType9.isNoType();
        boolean boolean18 = functionType9.isFunctionPrototypeType();
        com.google.javascript.rhino.jstype.ObjectType objectType19 = functionType9.toObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20, true);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        jSTypeRegistry22.unregisterPropertyOnType("(Not declared as a type name)", jSType24);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray28 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry22.createFunctionType(jSType26, true, jSTypeArray28);
        boolean boolean31 = functionType29.removeProperty("false");
        boolean boolean32 = functionType29.hasDisplayName();
        boolean boolean33 = functionType29.isStringObjectType();
        java.util.Set<java.lang.String> strSet34 = functionType29.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.JSType jSType35 = functionType29.getTypeOfThis();
        java.lang.String str36 = functionType29.toDebugHashCodeString();
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37, false);
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        jSTypeRegistry42.unregisterPropertyOnType("(Not declared as a type name)", jSType44);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray48 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry42.createFunctionType(jSType46, true, jSTypeArray48);
        com.google.javascript.rhino.jstype.JSType jSType50 = functionType49.autoboxesTo();
        java.lang.String str51 = functionType49.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, true);
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        jSTypeRegistry54.unregisterPropertyOnType("(Not declared as a type name)", jSType56);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType61 = jSTypeRegistry54.createFunctionType(jSType58, true, jSTypeArray60);
        com.google.common.collect.ImmutableList<java.lang.String> strList62 = functionType61.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot64 = functionType61.getSlot("NUMBER 0.0 100\n");
        boolean boolean65 = functionType61.isAllType();
        boolean boolean66 = functionType49.hasEqualCallType(functionType61);
        com.google.javascript.rhino.jstype.FunctionType functionType67 = functionType61.getOwnerFunction();
        java.util.Set<java.lang.String> strSet68 = functionType61.getOwnPropertyNames();
        boolean boolean69 = functionType61.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry72 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70, true);
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        jSTypeRegistry72.unregisterPropertyOnType("(Not declared as a type name)", jSType74);
        com.google.javascript.rhino.jstype.JSType jSType76 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray78 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType79 = jSTypeRegistry72.createFunctionType(jSType76, true, jSTypeArray78);
        boolean boolean80 = functionType79.isReturnTypeInferred();
        boolean boolean81 = functionType79.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType83 = functionType79.getBindReturnType((int) (short) 1);
        java.lang.String str84 = functionType83.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType85 = jSTypeRegistry39.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType61, (com.google.javascript.rhino.jstype.JSType) functionType83);
        boolean boolean86 = parameterizedType85.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType87 = parameterizedType85.getIndexType();
        boolean boolean88 = parameterizedType85.matchesNumberContext();
        boolean boolean89 = parameterizedType85.isCheckedUnknownType();
        java.lang.String str90 = parameterizedType85.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.JSType jSType92 = parameterizedType85.getPropertyType("function (): {2115759764}");
        boolean boolean93 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) functionType29, (com.google.javascript.rhino.jstype.JSType) parameterizedType85);
        boolean boolean94 = functionType9.isSubtype((com.google.javascript.rhino.jstype.JSType) parameterizedType85);
        com.google.javascript.rhino.jstype.JSType jSType95 = functionType9.getParameterType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType61 and parameterizedType85.", functionType61.equals(parameterizedType85) == parameterizedType85.equals(functionType61));
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test357");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        functionType46.clearCachedValues();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test358");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType48.getTypeOfThis();
        boolean boolean53 = parameterizedType48.removeProperty("function (): {646790426}");
        com.google.javascript.rhino.jstype.JSType jSType55 = parameterizedType48.getPropertyType("NUMBER 0.0 100\n");
        boolean boolean56 = parameterizedType48.isNativeObjectType();
        com.google.javascript.rhino.jstype.FunctionType functionType57 = parameterizedType48.toMaybeFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable58 = functionType57.getAllImplementedInterfaces();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType57 and parameterizedType48.", functionType57.equals(parameterizedType48) == parameterizedType48.equals(functionType57));
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test359");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType50 = parameterizedType48.getIndexType();
        boolean boolean51 = parameterizedType48.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo53 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean54 = jSDocInfo53.hasThisType();
        boolean boolean55 = jSDocInfo53.shouldPreserveTry();
        boolean boolean56 = jSDocInfo53.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression58 = jSDocInfo53.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean59 = jSDocInfo53.shouldPreserveTry();
        boolean boolean60 = jSDocInfo53.isOverride();
        boolean boolean61 = jSDocInfo53.isNoSideEffects();
        boolean boolean63 = jSDocInfo53.hasParameterType("");
        java.lang.String str64 = jSDocInfo53.getOriginalCommentString();
        parameterizedType48.setPropertyJSDocInfo("function (): {436796145}", jSDocInfo53);
        boolean boolean66 = parameterizedType48.isNominalType();
        boolean boolean67 = parameterizedType48.isNumberObjectType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo69 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean70 = jSDocInfo69.hasThisType();
        boolean boolean71 = jSDocInfo69.shouldPreserveTry();
        boolean boolean72 = jSDocInfo69.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression74 = jSDocInfo69.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean75 = jSDocInfo69.shouldPreserveTry();
        boolean boolean76 = jSDocInfo69.isOverride();
        com.google.common.collect.ImmutableList<java.lang.String> strList77 = jSDocInfo69.getTemplateTypeNames();
        parameterizedType48.setPropertyJSDocInfo("function (): {2032111818}", jSDocInfo69);
        com.google.javascript.rhino.JSDocInfo.Visibility visibility79 = jSDocInfo69.getVisibility();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test360");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType48.getTypeOfThis();
        boolean boolean53 = parameterizedType48.removeProperty("function (): {646790426}");
        java.util.Set set54 = parameterizedType48.getOwnPropertyNames();
        boolean boolean55 = parameterizedType48.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType56 = parameterizedType48.getImplicitPrototype();
        boolean boolean57 = parameterizedType48.isUnknownType();
        com.google.javascript.rhino.jstype.ObjectType objectType58 = parameterizedType48.dereference();
        boolean boolean59 = parameterizedType48.isNumberObjectType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test361");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.EnumType enumType14 = functionType12.toMaybeEnumType();
        com.google.javascript.rhino.jstype.FunctionType functionType15 = functionType12.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry2.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType12);
        jSTypeRegistry2.incrementGeneration();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        jSTypeRegistry20.unregisterPropertyOnType("(Not declared as a type name)", jSType22);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry20.createFunctionType(jSType24, true, jSTypeArray26);
        boolean boolean29 = functionType27.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        jSTypeRegistry33.unregisterPropertyOnType("(Not declared as a type name)", jSType35);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray39 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType40 = jSTypeRegistry33.createFunctionType(jSType37, true, jSTypeArray39);
        boolean boolean42 = functionType40.removeProperty("false");
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node(0);
        node44.putIntProp((-1), 35);
        boolean boolean48 = node44.isStringKey();
        boolean boolean49 = node44.isThrow();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj55 = node53.getProp((int) (byte) 10);
        boolean boolean56 = node44.isEquivalentToTyped(node53);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(0);
        node59.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node(32, node59);
        boolean boolean64 = node63.isInstanceOf();
        com.google.javascript.rhino.Node node65 = node53.useSourceInfoFromForTree(node63);
        boolean boolean66 = node63.isDo();
        boolean boolean67 = functionType27.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType40, node63);
        java.lang.String str68 = functionType40.getReferenceName();
        boolean boolean69 = functionType40.isUnionType();
        boolean boolean70 = functionType40.isCheckedUnknownType();
        com.google.javascript.rhino.ErrorReporter errorReporter71 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter71, true);
        com.google.javascript.rhino.jstype.JSType jSType75 = null;
        jSTypeRegistry73.unregisterPropertyOnType("(Not declared as a type name)", jSType75);
        com.google.javascript.rhino.jstype.JSType jSType77 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray79 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType80 = jSTypeRegistry73.createFunctionType(jSType77, true, jSTypeArray79);
        boolean boolean82 = functionType80.removeProperty("false");
        com.google.javascript.rhino.jstype.JSType jSType84 = functionType80.findPropertyType("Not declared as a type name");
        boolean boolean86 = functionType80.isPropertyTypeInferred("function (): {1442205556}");
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType87 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType40, (com.google.javascript.rhino.jstype.JSType) functionType80);
        java.util.Set<java.lang.String> strSet88 = functionType80.getPropertyNames();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType40 and parameterizedType87.", functionType40.equals(parameterizedType87) == parameterizedType87.equals(functionType40));
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test362");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType48.getTypeOfThis();
        boolean boolean53 = parameterizedType48.removeProperty("function (): {646790426}");
        com.google.javascript.rhino.jstype.JSType jSType55 = parameterizedType48.getPropertyType("NUMBER 0.0 100\n");
        boolean boolean56 = parameterizedType48.isNativeObjectType();
        boolean boolean57 = parameterizedType48.isInstanceType();
        com.google.javascript.rhino.ErrorReporter errorReporter58 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter58, true);
        com.google.javascript.rhino.jstype.JSType jSType62 = null;
        jSTypeRegistry60.unregisterPropertyOnType("(Not declared as a type name)", jSType62);
        com.google.javascript.rhino.jstype.JSType jSType64 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray66 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType67 = jSTypeRegistry60.createFunctionType(jSType64, true, jSTypeArray66);
        boolean boolean68 = functionType67.isReturnTypeInferred();
        boolean boolean69 = functionType67.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType71 = functionType67.getBindReturnType((int) (short) 1);
        com.google.javascript.rhino.ErrorReporter errorReporter72 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry74 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter72, true);
        com.google.javascript.rhino.jstype.JSType jSType76 = null;
        jSTypeRegistry74.unregisterPropertyOnType("(Not declared as a type name)", jSType76);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray80 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType81 = jSTypeRegistry74.createFunctionType(jSType78, true, jSTypeArray80);
        com.google.common.collect.ImmutableList<java.lang.String> strList82 = functionType81.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.ObjectType.Property property84 = functionType81.getSlot("function (): ?");
        boolean boolean85 = functionType81.isInterface();
        com.google.javascript.rhino.jstype.ObjectType objectType86 = functionType81.getImplicitPrototype();
        functionType67.setPrototypeBasedOn(objectType86);
        boolean boolean88 = functionType67.matchesObjectContext();
        com.google.javascript.rhino.jstype.JSType jSType89 = parameterizedType48.getLeastSupertype((com.google.javascript.rhino.jstype.JSType) functionType67);
        boolean boolean90 = functionType67.hasDisplayName();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test363");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType.Property property52 = parameterizedType48.getSlot("(Not declared as a type name)");
        boolean boolean53 = parameterizedType48.isNoObjectType();
        java.lang.String str54 = parameterizedType48.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot56 = parameterizedType48.getOwnSlot("{proxy:function (): {1890831164}}");
        com.google.javascript.rhino.jstype.TemplateType templateType57 = parameterizedType48.toMaybeTemplateType();
        com.google.javascript.rhino.ErrorReporter errorReporter58 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter58, true);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61, true);
        com.google.javascript.rhino.jstype.JSType jSType65 = null;
        jSTypeRegistry63.unregisterPropertyOnType("(Not declared as a type name)", jSType65);
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray69 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType70 = jSTypeRegistry63.createFunctionType(jSType67, true, jSTypeArray69);
        com.google.javascript.rhino.jstype.JSType jSType71 = functionType70.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.EnumType enumType72 = functionType70.toMaybeEnumType();
        com.google.javascript.rhino.jstype.FunctionType functionType73 = functionType70.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType74 = jSTypeRegistry60.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType70);
        jSTypeRegistry60.incrementGeneration();
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry78 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76, true);
        com.google.javascript.rhino.jstype.JSType jSType80 = null;
        jSTypeRegistry78.unregisterPropertyOnType("(Not declared as a type name)", jSType80);
        com.google.javascript.rhino.jstype.JSType jSType82 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray84 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType85 = jSTypeRegistry78.createFunctionType(jSType82, true, jSTypeArray84);
        boolean boolean87 = functionType85.removeProperty("false");
        boolean boolean88 = functionType85.hasAnyTemplateInternal();
        boolean boolean90 = functionType85.hasProperty("Function");
        com.google.javascript.rhino.Node node91 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType92 = jSTypeRegistry60.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType85, node91);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue93 = parameterizedType48.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType85);
        boolean boolean94 = functionType85.isDateType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test364");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType.Property property52 = parameterizedType48.getSlot("(Not declared as a type name)");
        boolean boolean53 = parameterizedType48.isNoObjectType();
        java.lang.Iterable iterable54 = parameterizedType48.getCtorImplementedInterfaces();
        java.lang.String str55 = parameterizedType48.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.JSType jSType57 = parameterizedType48.getPropertyType("function ");
        com.google.javascript.rhino.jstype.ObjectType objectType58 = parameterizedType48.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        jSTypeRegistry61.unregisterPropertyOnType("(Not declared as a type name)", jSType63);
        com.google.javascript.rhino.jstype.JSType jSType65 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray67 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType68 = jSTypeRegistry61.createFunctionType(jSType65, true, jSTypeArray67);
        com.google.javascript.rhino.jstype.JSType jSType69 = functionType68.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.ObjectType objectType70 = functionType68.toObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter71 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter72 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry74 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter72, true);
        com.google.javascript.rhino.jstype.JSType jSType76 = null;
        jSTypeRegistry74.unregisterPropertyOnType("(Not declared as a type name)", jSType76);
        com.google.javascript.rhino.ErrorReporter errorReporter78 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry80 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter78, true);
        com.google.javascript.rhino.jstype.JSType jSType82 = null;
        jSTypeRegistry80.unregisterPropertyOnType("(Not declared as a type name)", jSType82);
        com.google.javascript.rhino.jstype.JSType jSType84 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray86 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry80.createFunctionType(jSType84, true, jSTypeArray86);
        boolean boolean89 = functionType87.removeProperty("false");
        boolean boolean90 = functionType87.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType91 = jSTypeRegistry74.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType92 = functionType68.forceResolve(errorReporter71, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType87);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot94 = functionType68.getOwnSlot("Not declared as a type name");
        boolean boolean95 = functionType68.isArrayType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue96 = parameterizedType48.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType68);
        boolean boolean97 = functionType68.isFunctionType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test365");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = functionType9.getTemplateTypeNames();
        boolean boolean11 = functionType9.isReturnTypeInferred();
        com.google.javascript.rhino.Node node12 = functionType9.getRootNode();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean14 = jSDocInfo13.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression15 = jSDocInfo13.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility16 = null;
        jSDocInfo13.setVisibility(visibility16);
        boolean boolean18 = jSDocInfo13.isOverride();
        functionType9.setJSDocInfo(jSDocInfo13);
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean22 = jSDocInfo21.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression23 = jSDocInfo21.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility24 = null;
        jSDocInfo21.setVisibility(visibility24);
        int int26 = jSDocInfo21.getExtendedInterfacesCount();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList27 = jSDocInfo21.getImplementedInterfaces();
        com.google.common.collect.ImmutableList<java.lang.String> strList28 = jSDocInfo21.getTemplateTypeNames();
        functionType9.setPropertyJSDocInfo("function (): {1442205556}", jSDocInfo21);
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, false);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        com.google.javascript.rhino.jstype.JSType jSType43 = functionType42.autoboxesTo();
        java.lang.String str44 = functionType42.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, true);
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        jSTypeRegistry47.unregisterPropertyOnType("(Not declared as a type name)", jSType49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray53 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType54 = jSTypeRegistry47.createFunctionType(jSType51, true, jSTypeArray53);
        com.google.common.collect.ImmutableList<java.lang.String> strList55 = functionType54.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot57 = functionType54.getSlot("NUMBER 0.0 100\n");
        boolean boolean58 = functionType54.isAllType();
        boolean boolean59 = functionType42.hasEqualCallType(functionType54);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = functionType54.getOwnerFunction();
        java.util.Set<java.lang.String> strSet61 = functionType54.getOwnPropertyNames();
        boolean boolean62 = functionType54.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63, true);
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        jSTypeRegistry65.unregisterPropertyOnType("(Not declared as a type name)", jSType67);
        com.google.javascript.rhino.jstype.JSType jSType69 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray71 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry65.createFunctionType(jSType69, true, jSTypeArray71);
        boolean boolean73 = functionType72.isReturnTypeInferred();
        boolean boolean74 = functionType72.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType76 = functionType72.getBindReturnType((int) (short) 1);
        java.lang.String str77 = functionType76.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType78 = jSTypeRegistry32.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType54, (com.google.javascript.rhino.jstype.JSType) functionType76);
        com.google.javascript.rhino.JSDocInfo jSDocInfo80 = parameterizedType78.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType81 = parameterizedType78.getTypeOfThis();
        boolean boolean83 = parameterizedType78.removeProperty("function (): {646790426}");
        boolean boolean84 = parameterizedType78.canBeCalled();
        boolean boolean85 = parameterizedType78.isNativeObjectType();
        boolean boolean86 = parameterizedType78.isResolved();
        boolean boolean87 = parameterizedType78.isUnknownType();
        boolean boolean88 = functionType9.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType) parameterizedType78);
        boolean boolean90 = parameterizedType78.isPropertyTypeInferred("NUMBER 0.0\n");
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType91 = parameterizedType78.toMaybeParameterizedType();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot93 = parameterizedType78.getOwnSlot("{proxy:function (): {468752906}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType54 and parameterizedType78.", functionType54.equals(parameterizedType78) == parameterizedType78.equals(functionType54));
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test366");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType48.getTypeOfThis();
        boolean boolean53 = parameterizedType48.removeProperty("function (): {646790426}");
        java.util.Set set54 = parameterizedType48.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.FunctionType functionType55 = parameterizedType48.getOwnerFunction();
        boolean boolean56 = parameterizedType48.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo57 = parameterizedType48.getJSDocInfo();
        com.google.javascript.rhino.jstype.JSType jSType58 = parameterizedType48.collapseUnion();
        boolean boolean60 = parameterizedType48.hasProperty("function (): {1203207388}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test367");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType50 = parameterizedType48.getIndexType();
        boolean boolean51 = parameterizedType48.matchesNumberContext();
        java.lang.String str52 = parameterizedType48.toAnnotationString();
        boolean boolean53 = parameterizedType48.isInterface();
        boolean boolean54 = parameterizedType48.isNullable();
        com.google.javascript.rhino.JSDocInfo jSDocInfo56 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean57 = jSDocInfo56.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression58 = jSDocInfo56.getBaseType();
        java.lang.String str59 = jSDocInfo56.getLicense();
        java.lang.String str60 = jSDocInfo56.getMeaning();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList61 = jSDocInfo56.getThrownTypes();
        boolean boolean62 = jSDocInfo56.isConsistentIdGenerator();
        boolean boolean63 = jSDocInfo56.hasBaseType();
        parameterizedType48.setPropertyJSDocInfo("function (): {1588302745}", jSDocInfo56);
        java.lang.String str65 = jSDocInfo56.getReturnDescription();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test368");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType.Property property52 = parameterizedType48.getSlot("(Not declared as a type name)");
        boolean boolean53 = parameterizedType48.isNoObjectType();
        java.lang.Iterable iterable54 = parameterizedType48.getCtorImplementedInterfaces();
        java.lang.String str55 = parameterizedType48.toDebugHashCodeString();
        java.lang.String str56 = parameterizedType48.toDebugHashCodeString();
        boolean boolean57 = parameterizedType48.isConstructor();
        boolean boolean58 = parameterizedType48.hasReferenceName();
        boolean boolean59 = parameterizedType48.isOrdinaryFunction();
        boolean boolean60 = parameterizedType48.isCheckedUnknownType();
        boolean boolean61 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType62 = parameterizedType48.getIndexType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo64 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean65 = jSDocInfo64.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression66 = jSDocInfo64.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility67 = null;
        jSDocInfo64.setVisibility(visibility67);
        int int69 = jSDocInfo64.getExtendedInterfacesCount();
        parameterizedType48.setPropertyJSDocInfo("{proxy:function (): {871791842}}", jSDocInfo64);
        boolean boolean71 = jSDocInfo64.isConstructor();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test369");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType48.getTypeOfThis();
        boolean boolean53 = parameterizedType48.removeProperty("function (): {646790426}");
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        jSTypeRegistry56.unregisterPropertyOnType("(Not declared as a type name)", jSType58);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray62 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry56.createFunctionType(jSType60, true, jSTypeArray62);
        com.google.common.collect.ImmutableList<java.lang.String> strList64 = functionType63.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot66 = functionType63.getSlot("NUMBER 0.0 100\n");
        boolean boolean67 = functionType63.isAllType();
        com.google.javascript.rhino.ErrorReporter errorReporter68 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter68, true);
        com.google.javascript.rhino.jstype.JSType jSType72 = null;
        jSTypeRegistry70.unregisterPropertyOnType("(Not declared as a type name)", jSType72);
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray76 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType77 = jSTypeRegistry70.createFunctionType(jSType74, true, jSTypeArray76);
        boolean boolean79 = functionType77.removeProperty("false");
        com.google.javascript.rhino.jstype.JSType jSType81 = functionType77.findPropertyType("Not declared as a type name");
        boolean boolean82 = functionType63.differsFrom((com.google.javascript.rhino.jstype.JSType) functionType77);
        com.google.javascript.rhino.ErrorReporter errorReporter83 = null;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope84 = null;
        com.google.javascript.rhino.jstype.JSType jSType85 = functionType77.resolve(errorReporter83, jSTypeStaticScope84);
        boolean boolean86 = functionType77.isNullable();
        boolean boolean87 = parameterizedType48.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType77);
        boolean boolean88 = parameterizedType48.isInstanceType();
        java.lang.Iterable iterable89 = parameterizedType48.getCtorImplementedInterfaces();
        boolean boolean90 = parameterizedType48.isInstanceType();
        com.google.javascript.rhino.Node node92 = parameterizedType48.getPropertyNode("function (): {861673153}");
        com.google.javascript.rhino.jstype.EnumElementType enumElementType93 = parameterizedType48.toMaybeEnumElementType();
        com.google.javascript.rhino.jstype.ObjectType objectType94 = parameterizedType48.getTypeOfThis();
        java.lang.String str95 = objectType94.toAnnotationString();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test370");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType50 = parameterizedType48.getIndexType();
        boolean boolean51 = parameterizedType48.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo53 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean54 = jSDocInfo53.hasThisType();
        boolean boolean55 = jSDocInfo53.shouldPreserveTry();
        boolean boolean56 = jSDocInfo53.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression58 = jSDocInfo53.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean59 = jSDocInfo53.shouldPreserveTry();
        boolean boolean60 = jSDocInfo53.isOverride();
        boolean boolean61 = jSDocInfo53.isNoSideEffects();
        boolean boolean63 = jSDocInfo53.hasParameterType("");
        java.lang.String str64 = jSDocInfo53.getOriginalCommentString();
        parameterizedType48.setPropertyJSDocInfo("function (): {436796145}", jSDocInfo53);
        boolean boolean66 = parameterizedType48.isNominalType();
        boolean boolean67 = parameterizedType48.isNumberObjectType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo69 = parameterizedType48.getOwnPropertyJSDocInfo("{proxy:function (): {847075005}}");
        java.util.Set set70 = parameterizedType48.getOwnPropertyNames();
        java.lang.Object[] objArray71 = set70.toArray();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test371");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType48.getTypeOfThis();
        boolean boolean53 = parameterizedType48.removeProperty("function (): {646790426}");
        boolean boolean54 = parameterizedType48.canBeCalled();
        boolean boolean56 = parameterizedType48.isPropertyTypeDeclared("function (): {367372378}");
        com.google.javascript.rhino.jstype.JSType jSType58 = parameterizedType48.getPropertyType("true");
        boolean boolean60 = parameterizedType48.removeProperty("function (): {1536545239}");
        com.google.javascript.rhino.jstype.ObjectType objectType61 = parameterizedType48.getImplicitPrototype();
        boolean boolean62 = parameterizedType48.isBooleanObjectType();
        boolean boolean63 = parameterizedType48.isNoType();
        boolean boolean65 = parameterizedType48.isPropertyInExterns("{proxy:function (): {1002171987}}");
        boolean boolean66 = parameterizedType48.isVoidType();
        com.google.javascript.rhino.jstype.ObjectType objectType67 = parameterizedType48.getParentScope();
        boolean boolean68 = objectType67.isDateType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test372");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        java.lang.String str51 = parameterizedType48.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.ObjectType.Property property53 = parameterizedType48.getSlot("java.io.IOException: java.io.IOException");
        boolean boolean55 = parameterizedType48.isPropertyTypeDeclared("function (): {1393951772}");
        java.lang.String str56 = parameterizedType48.getReferenceName();
        com.google.javascript.rhino.jstype.FunctionType functionType57 = parameterizedType48.getConstructor();
        boolean boolean59 = parameterizedType48.removeProperty("function (): {1657069676}");
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType60 = parameterizedType48.toMaybeParameterizedType();
        com.google.javascript.rhino.jstype.ObjectType objectType61 = parameterizedType48.getImplicitPrototype();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test373");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType50 = parameterizedType48.getIndexType();
        boolean boolean51 = parameterizedType48.matchesNumberContext();
        boolean boolean52 = parameterizedType48.isNoResolvedType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType53 = parameterizedType48.toMaybeParameterizedType();
        boolean boolean54 = parameterizedType53.hasReferenceName();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType53.", functionType24.equals(parameterizedType53) == parameterizedType53.equals(functionType24));
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test374");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.isAllType();
        boolean boolean50 = parameterizedType48.isInstanceType();
        boolean boolean51 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.FunctionType functionType52 = parameterizedType48.getConstructor();
        java.lang.String str53 = parameterizedType48.toDebugHashCodeString();
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope55 = null;
        com.google.javascript.rhino.jstype.JSType jSType56 = parameterizedType48.resolve(errorReporter54, jSTypeStaticScope55);
        com.google.javascript.rhino.jstype.ObjectType.Property property58 = parameterizedType48.getSlot("{proxy:function (): {1359849147}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType48.", functionType24.equals(parameterizedType48) == parameterizedType48.equals(functionType24));
    }
}


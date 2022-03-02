import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest3 {

    public static boolean debug = false;

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test601");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable31 = parameterizedType30.getCtorExtendedInterfaces();
        boolean boolean32 = parameterizedType30.isNominalType();
        boolean boolean33 = parameterizedType30.isAllType();
        boolean boolean34 = parameterizedType30.matchesNumberContext();
        boolean boolean35 = parameterizedType30.isNullable();
        java.lang.Iterable iterable36 = parameterizedType30.getCtorImplementedInterfaces();
        java.util.Spliterator<com.google.javascript.rhino.Node> nodeSpliterator37 = iterable36.spliterator();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test602");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.jstype.JSType jSType10 = jSTypeRegistry2.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = jSType10.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        boolean boolean17 = jSTypeRegistry14.resetImplicitPrototype(jSType15, objectType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, true);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        boolean boolean35 = jSTypeRegistry32.resetImplicitPrototype(jSType33, objectType34);
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry32.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType41 = jSType40.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType42 = jSTypeRegistry14.createParameterizedType(objectType29, jSType40);
        java.util.Set set43 = parameterizedType42.getOwnPropertyNames();
        boolean boolean44 = parameterizedType42.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, true);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType49 = null;
        boolean boolean50 = jSTypeRegistry47.resetImplicitPrototype(jSType48, objectType49);
        com.google.javascript.rhino.jstype.JSType jSType55 = jSTypeRegistry47.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType56 = jSType55.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType57 = jSType55.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType58 = jSType55.restrictByNotNullOrUndefined();
        boolean boolean59 = parameterizedType42.canAssignTo(jSType55);
        boolean boolean61 = parameterizedType42.isPropertyTypeInferred("");
        boolean boolean62 = parameterizedType42.isResolved();
        com.google.javascript.rhino.jstype.ObjectType objectType63 = parameterizedType42.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType65 = parameterizedType42.findPropertyType("{proxy:{proxy:{649633010}}}");
        boolean boolean66 = parameterizedType42.isNominalType();
        boolean boolean67 = parameterizedType42.canBeCalled();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue68 = objectType11.testForEquality((com.google.javascript.rhino.jstype.JSType) parameterizedType42);
        com.google.javascript.rhino.jstype.EnumElementType enumElementType69 = parameterizedType42.toMaybeEnumElementType();
        com.google.javascript.rhino.jstype.JSType jSType70 = parameterizedType42.collapseUnion();
        com.google.javascript.rhino.JSDocInfo jSDocInfo71 = parameterizedType42.getJSDocInfo();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType10 and parameterizedType42.", jSType10.equals(parameterizedType42) == parameterizedType42.equals(jSType10));
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test603");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        jSTypeRegistry2.setLastGeneration(false);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        boolean boolean13 = jSTypeRegistry10.resetImplicitPrototype(jSType11, objectType12);
        com.google.javascript.rhino.jstype.JSType jSType18 = jSTypeRegistry10.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = jSType18.dereference();
        boolean boolean20 = objectType19.isFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType21 = jSTypeRegistry2.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType) objectType19);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = jSTypeRegistry2.getEachReferenceTypeWithProperty("({proxy:{proxy:{1874555938}}})");
        com.google.javascript.rhino.ErrorReporter errorReporter24 = jSTypeRegistry2.getErrorReporter();
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25, true);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        boolean boolean30 = jSTypeRegistry27.resetImplicitPrototype(jSType28, objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = null;
        boolean boolean36 = jSTypeRegistry33.resetImplicitPrototype(jSType34, objectType35);
        com.google.javascript.rhino.jstype.JSType jSType41 = jSTypeRegistry33.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType42 = jSType41.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = null;
        boolean boolean48 = jSTypeRegistry45.resetImplicitPrototype(jSType46, objectType47);
        com.google.javascript.rhino.jstype.JSType jSType53 = jSTypeRegistry45.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType54 = jSType53.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType55 = jSTypeRegistry27.createParameterizedType(objectType42, jSType53);
        java.util.Set set56 = parameterizedType55.getOwnPropertyNames();
        boolean boolean57 = parameterizedType55.hasReferenceName();
        boolean boolean58 = parameterizedType55.hasAnyTemplateInternal();
        boolean boolean59 = parameterizedType55.isOrdinaryFunction();
        boolean boolean60 = parameterizedType55.isInstanceType();
        com.google.javascript.rhino.jstype.JSType jSType62 = parameterizedType55.getPropertyType("{proxy:{proxy:{628733757}}}");
        boolean boolean63 = parameterizedType55.isFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType65 = parameterizedType55.findPropertyType("function (): {proxy:{1288677244}}");
        boolean boolean66 = parameterizedType55.hasReferenceName();
        boolean boolean67 = parameterizedType55.canBeCalled();
        boolean boolean69 = jSTypeRegistry2.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) parameterizedType55, "function (): {proxy:{333019360}}");
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType70 = parameterizedType55.toMaybeParameterizedType();
        boolean boolean71 = parameterizedType70.isRegexpType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType18 and parameterizedType70.", jSType18.equals(parameterizedType70) == parameterizedType70.equals(jSType18));
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test604");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        boolean boolean3 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        boolean boolean18 = objectType17.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable19 = objectType17.getCtorImplementedInterfaces();
        boolean boolean20 = objectType17.isNativeObjectType();
        jSTypeRegistry2.registerPropertyOnType("", (com.google.javascript.rhino.jstype.JSType) objectType17);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        boolean boolean27 = jSTypeRegistry24.resetImplicitPrototype(jSType25, objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = null;
        boolean boolean33 = jSTypeRegistry30.resetImplicitPrototype(jSType31, objectType32);
        com.google.javascript.rhino.jstype.JSType jSType38 = jSTypeRegistry30.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType39 = jSType38.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        boolean boolean45 = jSTypeRegistry42.resetImplicitPrototype(jSType43, objectType44);
        com.google.javascript.rhino.jstype.JSType jSType50 = jSTypeRegistry42.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType51 = jSType50.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType52 = jSTypeRegistry24.createParameterizedType(objectType39, jSType50);
        java.util.Set set53 = parameterizedType52.getOwnPropertyNames();
        boolean boolean54 = parameterizedType52.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, true);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType59 = null;
        boolean boolean60 = jSTypeRegistry57.resetImplicitPrototype(jSType58, objectType59);
        com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry57.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType66 = jSType65.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType67 = jSType65.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType68 = jSType65.restrictByNotNullOrUndefined();
        boolean boolean69 = parameterizedType52.canAssignTo(jSType65);
        boolean boolean71 = parameterizedType52.isPropertyTypeInferred("");
        com.google.javascript.rhino.jstype.JSType jSType76 = jSTypeRegistry2.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) parameterizedType52, "hi!", "Named type with empty name component", 40, 39);
        boolean boolean78 = parameterizedType52.isPropertyTypeDeclared("unknown");
        com.google.javascript.rhino.jstype.UnionType unionType79 = parameterizedType52.toMaybeUnionType();
        com.google.javascript.rhino.jstype.FunctionType functionType80 = parameterizedType52.getOwnerFunction();
        java.lang.String str81 = parameterizedType52.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.ObjectType.Property property83 = parameterizedType52.getSlot("{proxy:{proxy:{2070335273}}}");
        boolean boolean84 = parameterizedType52.isInterface();
        com.google.javascript.rhino.jstype.JSType jSType85 = parameterizedType52.collapseUnion();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable86 = parameterizedType52.getCtorImplementedInterfaces();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType52.", jSType16.equals(parameterizedType52) == parameterizedType52.equals(jSType16));
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test605");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        boolean boolean38 = jSTypeRegistry35.resetImplicitPrototype(jSType36, objectType37);
        com.google.javascript.rhino.jstype.JSType jSType43 = jSTypeRegistry35.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = jSType43.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSType43.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType46 = jSType43.restrictByNotNullOrUndefined();
        boolean boolean47 = parameterizedType30.canAssignTo(jSType43);
        boolean boolean49 = parameterizedType30.isPropertyTypeInferred("");
        boolean boolean50 = parameterizedType30.isResolved();
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType30.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType53 = parameterizedType30.findPropertyType("{proxy:{proxy:{649633010}}}");
        boolean boolean54 = parameterizedType30.isNominalType();
        boolean boolean55 = parameterizedType30.matchesStringContext();
        boolean boolean56 = parameterizedType30.matchesNumberContext();
        boolean boolean57 = parameterizedType30.isUnknownType();
        com.google.javascript.rhino.ErrorReporter errorReporter58 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter58, true);
        com.google.javascript.rhino.jstype.JSType jSType61 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType62 = null;
        boolean boolean63 = jSTypeRegistry60.resetImplicitPrototype(jSType61, objectType62);
        com.google.javascript.rhino.ErrorReporter errorReporter64 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter64, true);
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType68 = null;
        boolean boolean69 = jSTypeRegistry66.resetImplicitPrototype(jSType67, objectType68);
        com.google.javascript.rhino.jstype.JSType jSType74 = jSTypeRegistry66.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType75 = jSType74.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry78 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76, true);
        com.google.javascript.rhino.jstype.JSType jSType79 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType80 = null;
        boolean boolean81 = jSTypeRegistry78.resetImplicitPrototype(jSType79, objectType80);
        com.google.javascript.rhino.jstype.JSType jSType86 = jSTypeRegistry78.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType87 = jSType86.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType88 = jSTypeRegistry60.createParameterizedType(objectType75, jSType86);
        boolean boolean89 = parameterizedType88.isEnumElementType();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair90 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) parameterizedType30, (com.google.javascript.rhino.jstype.JSType) parameterizedType88);
        com.google.javascript.rhino.jstype.JSType jSType91 = typePair90.typeA;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and jSType91.", jSType16.equals(jSType91) == jSType91.equals(jSType16));
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test606");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        jSTypeRegistry2.forwardDeclareType("function (): {proxy:{1506756825}}");
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        boolean boolean10 = jSTypeRegistry7.resetImplicitPrototype(jSType8, objectType9);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, true);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        boolean boolean16 = jSTypeRegistry13.resetImplicitPrototype(jSType14, objectType15);
        com.google.javascript.rhino.jstype.JSType jSType21 = jSTypeRegistry13.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSType21.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = null;
        boolean boolean28 = jSTypeRegistry25.resetImplicitPrototype(jSType26, objectType27);
        com.google.javascript.rhino.jstype.JSType jSType33 = jSTypeRegistry25.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = jSType33.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType35 = jSTypeRegistry7.createParameterizedType(objectType22, jSType33);
        java.util.Set set36 = parameterizedType35.getOwnPropertyNames();
        boolean boolean37 = parameterizedType35.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38, true);
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType42 = null;
        boolean boolean43 = jSTypeRegistry40.resetImplicitPrototype(jSType41, objectType42);
        com.google.javascript.rhino.jstype.JSType jSType48 = jSTypeRegistry40.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType49 = jSType48.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSType48.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType51 = jSType48.restrictByNotNullOrUndefined();
        boolean boolean52 = parameterizedType35.canAssignTo(jSType48);
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean60 = node59.isFalse();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean64 = node63.isTrue();
        boolean boolean65 = node63.hasOneChild();
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean69 = node68.isTrue();
        boolean boolean70 = node68.isBreak();
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node((int) (byte) 1, node56, node59, node63, node68, (int) (byte) 1, 4095);
        boolean boolean74 = node68.isCase();
        boolean boolean75 = node68.isOr();
        int int76 = node68.getChildCount();
        com.google.javascript.rhino.jstype.FunctionType functionType77 = jSTypeRegistry2.createFunctionType((com.google.javascript.rhino.jstype.JSType) parameterizedType35, node68);
        java.lang.Iterable iterable78 = functionType77.getCtorImplementedInterfaces();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType21 and parameterizedType35.", jSType21.equals(parameterizedType35) == parameterizedType35.equals(jSType21));
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test607");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.hasReferenceName();
        boolean boolean33 = parameterizedType30.hasAnyTemplateInternal();
        boolean boolean34 = parameterizedType30.isOrdinaryFunction();
        boolean boolean35 = parameterizedType30.isInstanceType();
        com.google.javascript.rhino.jstype.JSType jSType37 = parameterizedType30.getPropertyType("{proxy:{proxy:{628733757}}}");
        boolean boolean38 = parameterizedType30.isFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType40 = parameterizedType30.findPropertyType("function (): {proxy:{1288677244}}");
        boolean boolean41 = parameterizedType30.hasReferenceName();
        boolean boolean42 = parameterizedType30.isNumberObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType43 = parameterizedType30.toMaybeParameterizedType();
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44, true);
        com.google.javascript.rhino.jstype.JSType jSType47 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType48 = null;
        boolean boolean49 = jSTypeRegistry46.resetImplicitPrototype(jSType47, objectType48);
        com.google.javascript.rhino.jstype.JSType jSType54 = jSTypeRegistry46.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType55 = jSType54.dereference();
        boolean boolean56 = objectType55.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable57 = objectType55.getCtorImplementedInterfaces();
        boolean boolean58 = objectType55.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        com.google.javascript.rhino.jstype.JSType jSType62 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType63 = null;
        boolean boolean64 = jSTypeRegistry61.resetImplicitPrototype(jSType62, objectType63);
        com.google.javascript.rhino.jstype.JSType jSType69 = jSTypeRegistry61.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType70 = jSType69.dereference();
        boolean boolean71 = objectType70.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable72 = objectType70.getCtorImplementedInterfaces();
        boolean boolean73 = objectType70.isNativeObjectType();
        boolean boolean74 = objectType55.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType70);
        boolean boolean76 = objectType55.hasProperty("hi!");
        com.google.javascript.rhino.jstype.JSType jSType77 = objectType55.autobox();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope78 = objectType55.getParentScope();
        com.google.javascript.rhino.jstype.FunctionType functionType79 = objectType55.getOwnerFunction();
        boolean boolean80 = objectType55.isObject();
        boolean boolean82 = objectType55.removeProperty("function (): {proxy:{1262905525}}");
        boolean boolean83 = parameterizedType30.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) objectType55);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test608");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean3 = node2.isTrue();
        boolean boolean4 = node2.hasOneChild();
        boolean boolean5 = node2.isVarArgs();
        node2.removeProp(48);
        node2.setQuotedString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node10 = node2.getChildAtIndex(2147483647);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test609");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        boolean boolean3 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        boolean boolean18 = objectType17.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable19 = objectType17.getCtorImplementedInterfaces();
        boolean boolean20 = objectType17.isNativeObjectType();
        jSTypeRegistry2.registerPropertyOnType("", (com.google.javascript.rhino.jstype.JSType) objectType17);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        boolean boolean27 = jSTypeRegistry24.resetImplicitPrototype(jSType25, objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = null;
        boolean boolean33 = jSTypeRegistry30.resetImplicitPrototype(jSType31, objectType32);
        com.google.javascript.rhino.jstype.JSType jSType38 = jSTypeRegistry30.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType39 = jSType38.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        boolean boolean45 = jSTypeRegistry42.resetImplicitPrototype(jSType43, objectType44);
        com.google.javascript.rhino.jstype.JSType jSType50 = jSTypeRegistry42.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType51 = jSType50.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType52 = jSTypeRegistry24.createParameterizedType(objectType39, jSType50);
        java.util.Set set53 = parameterizedType52.getOwnPropertyNames();
        boolean boolean54 = parameterizedType52.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, true);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType59 = null;
        boolean boolean60 = jSTypeRegistry57.resetImplicitPrototype(jSType58, objectType59);
        com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry57.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType66 = jSType65.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType67 = jSType65.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType68 = jSType65.restrictByNotNullOrUndefined();
        boolean boolean69 = parameterizedType52.canAssignTo(jSType65);
        boolean boolean71 = parameterizedType52.isPropertyTypeInferred("");
        com.google.javascript.rhino.jstype.JSType jSType76 = jSTypeRegistry2.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) parameterizedType52, "hi!", "Named type with empty name component", 40, 39);
        boolean boolean78 = parameterizedType52.isPropertyTypeDeclared("unknown");
        boolean boolean79 = parameterizedType52.hasCachedValues();
        boolean boolean80 = parameterizedType52.isNoType();
        com.google.javascript.rhino.Node node82 = parameterizedType52.getPropertyNode("");
        boolean boolean83 = parameterizedType52.isRegexpType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType84 = parameterizedType52.toMaybeParameterizedType();
        boolean boolean85 = parameterizedType52.isNominalConstructor();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType52.", jSType16.equals(parameterizedType52) == parameterizedType52.equals(jSType16));
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test610");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        boolean boolean38 = jSTypeRegistry35.resetImplicitPrototype(jSType36, objectType37);
        com.google.javascript.rhino.jstype.JSType jSType43 = jSTypeRegistry35.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = jSType43.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSType43.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType46 = jSType43.restrictByNotNullOrUndefined();
        boolean boolean47 = parameterizedType30.canAssignTo(jSType43);
        boolean boolean49 = parameterizedType30.isPropertyTypeInferred("");
        boolean boolean50 = parameterizedType30.isInterface();
        int int51 = parameterizedType30.getPropertiesCount();
        boolean boolean52 = parameterizedType30.isArrayType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType53 = parameterizedType30.toMaybeParameterizedType();
        int int54 = parameterizedType53.getPropertiesCount();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType53.", jSType16.equals(parameterizedType53) == parameterizedType53.equals(jSType16));
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test611");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        boolean boolean3 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        boolean boolean18 = objectType17.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable19 = objectType17.getCtorImplementedInterfaces();
        boolean boolean20 = objectType17.isNativeObjectType();
        jSTypeRegistry2.registerPropertyOnType("", (com.google.javascript.rhino.jstype.JSType) objectType17);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        boolean boolean27 = jSTypeRegistry24.resetImplicitPrototype(jSType25, objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = null;
        boolean boolean33 = jSTypeRegistry30.resetImplicitPrototype(jSType31, objectType32);
        com.google.javascript.rhino.jstype.JSType jSType38 = jSTypeRegistry30.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType39 = jSType38.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        boolean boolean45 = jSTypeRegistry42.resetImplicitPrototype(jSType43, objectType44);
        com.google.javascript.rhino.jstype.JSType jSType50 = jSTypeRegistry42.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType51 = jSType50.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType52 = jSTypeRegistry24.createParameterizedType(objectType39, jSType50);
        java.util.Set set53 = parameterizedType52.getOwnPropertyNames();
        boolean boolean54 = parameterizedType52.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, true);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType59 = null;
        boolean boolean60 = jSTypeRegistry57.resetImplicitPrototype(jSType58, objectType59);
        com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry57.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType66 = jSType65.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType67 = jSType65.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType68 = jSType65.restrictByNotNullOrUndefined();
        boolean boolean69 = parameterizedType52.canAssignTo(jSType65);
        boolean boolean71 = parameterizedType52.isPropertyTypeInferred("");
        com.google.javascript.rhino.jstype.JSType jSType76 = jSTypeRegistry2.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) parameterizedType52, "hi!", "Named type with empty name component", 40, 39);
        com.google.javascript.rhino.jstype.JSType jSType77 = parameterizedType52.getParameterType();
        boolean boolean78 = parameterizedType52.isNoObjectType();
        com.google.javascript.rhino.jstype.EnumType enumType79 = parameterizedType52.toMaybeEnumType();
        com.google.javascript.rhino.jstype.JSType jSType81 = parameterizedType52.getPropertyType("function (): {proxy:{929267642}}");
        java.lang.String str82 = parameterizedType52.toString();
        java.lang.Iterable iterable83 = parameterizedType52.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType84 = parameterizedType52.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.JSDocInfo jSDocInfo86 = parameterizedType52.getOwnPropertyJSDocInfo("{proxy:{proxy:{874271629}}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType52.", jSType16.equals(parameterizedType52) == parameterizedType52.equals(jSType16));
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test612");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean7 = node6.isFalse();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean11 = node10.isTrue();
        boolean boolean12 = node10.hasOneChild();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean16 = node15.isTrue();
        boolean boolean17 = node15.isBreak();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (byte) 1, node3, node6, node10, node15, (int) (byte) 1, 4095);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable21 = node20.children();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean29 = node28.isFalse();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean33 = node32.isTrue();
        boolean boolean34 = node32.hasOneChild();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean38 = node37.isTrue();
        boolean boolean39 = node37.isBreak();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((int) (byte) 1, node25, node28, node32, node37, (int) (byte) 1, 4095);
        node42.detachChildren();
        node42.setVarArgs(true);
        node20.addChildToFront(node42);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean54 = node53.isFalse();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean58 = node57.isTrue();
        boolean boolean59 = node57.hasOneChild();
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean63 = node62.isTrue();
        boolean boolean64 = node62.isBreak();
        com.google.javascript.rhino.Node node67 = new com.google.javascript.rhino.Node((int) (byte) 1, node50, node53, node57, node62, (int) (byte) 1, 4095);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable68 = node67.children();
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean72 = node71.isTrue();
        boolean boolean73 = node71.hasOneChild();
        node67.addChildrenToFront(node71);
        com.google.javascript.rhino.InputId inputId75 = com.google.javascript.jscomp.NodeUtil.getInputId(node71);
        boolean boolean76 = node20.isEquivalentTo(node71);
        boolean boolean77 = node20.isNot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node79 = node20.getChildAtIndex(37);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test613");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        boolean boolean4 = node2.isFalse();
        boolean boolean5 = node2.isScript();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList9 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node8);
        boolean boolean10 = node8.isString();
        node8.setSourceFileForTesting("hi!");
        com.google.javascript.rhino.Node node13 = node2.srcref(node8);
        boolean boolean14 = node8.isDo();
        com.google.javascript.rhino.Node node15 = node8.cloneNode();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean23 = node22.isFalse();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean27 = node26.isTrue();
        boolean boolean28 = node26.hasOneChild();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean32 = node31.isTrue();
        boolean boolean33 = node31.isBreak();
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (byte) 1, node19, node22, node26, node31, (int) (byte) 1, 4095);
        node36.detachChildren();
        com.google.javascript.rhino.Node node38 = node36.removeFirstChild();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable39 = node36.siblings();
        boolean boolean40 = node36.isString();
        boolean boolean41 = node36.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node42 = node8.copyInformationFrom(node36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node44 = node42.getChildAtIndex(44);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test614");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable31 = parameterizedType30.getCtorExtendedInterfaces();
        com.google.javascript.rhino.JSDocInfo jSDocInfo32 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean33 = jSDocInfo32.isInterface();
        com.google.javascript.rhino.JSDocInfo jSDocInfo34 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean35 = jSDocInfo34.isInterface();
        java.lang.String str36 = jSDocInfo34.getOriginalCommentString();
        boolean boolean37 = jSDocInfo34.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo jSDocInfo38 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean39 = jSDocInfo38.isInterface();
        jSDocInfo38.setLicense("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo42 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean43 = jSDocInfo42.isInterface();
        java.lang.String str44 = jSDocInfo42.getOriginalCommentString();
        boolean boolean45 = jSDocInfo42.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo jSDocInfo46 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean47 = jSDocInfo46.isInterface();
        boolean boolean48 = jSDocInfo46.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression49 = jSDocInfo46.getEnumParameterType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean51 = jSDocInfo50.isInterface();
        jSDocInfo50.setLicense("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo54 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean55 = jSDocInfo54.isInterface();
        boolean boolean56 = jSDocInfo54.hasType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo57 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean58 = jSDocInfo57.isInterface();
        boolean boolean59 = jSDocInfo57.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression60 = jSDocInfo57.getEnumParameterType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo61 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean62 = jSDocInfo61.isInterface();
        boolean boolean63 = jSDocInfo61.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression64 = jSDocInfo61.getEnumParameterType();
        boolean boolean65 = jSDocInfo61.containsDeclaration();
        com.google.javascript.rhino.JSDocInfo jSDocInfo66 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean67 = jSDocInfo66.isInterface();
        java.lang.String str68 = jSDocInfo66.getOriginalCommentString();
        boolean boolean69 = jSDocInfo66.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo jSDocInfo70 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean71 = jSDocInfo70.isInterface();
        java.lang.String str72 = jSDocInfo70.getOriginalCommentString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression73 = jSDocInfo70.getType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo74 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean75 = jSDocInfo74.isInterface();
        jSDocInfo74.setLicense("");
        boolean boolean78 = jSDocInfo74.isNoAlias();
        com.google.javascript.rhino.JSDocInfo jSDocInfo79 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean80 = jSDocInfo79.isInterface();
        jSDocInfo79.setLicense("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo83 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean84 = jSDocInfo83.isInterface();
        boolean boolean85 = jSDocInfo83.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression86 = jSDocInfo83.getEnumParameterType();
        boolean boolean87 = jSDocInfo83.containsDeclaration();
        com.google.javascript.rhino.JSDocInfo[] jSDocInfoArray88 = new com.google.javascript.rhino.JSDocInfo[] { jSDocInfo79, jSDocInfo83 };
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList89 = com.google.common.collect.ImmutableList.of(jSDocInfo32, jSDocInfo34, jSDocInfo38, jSDocInfo42, jSDocInfo46, jSDocInfo50, jSDocInfo54, jSDocInfo57, jSDocInfo61, jSDocInfo66, jSDocInfo70, jSDocInfo74, jSDocInfoArray88);
        parameterizedType30.setJSDocInfo(jSDocInfo70);
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList91 = jSDocInfo70.getImplementedInterfaces();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test615");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType33 = parameterizedType30.getIndexType();
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType38 = null;
        boolean boolean39 = jSTypeRegistry36.resetImplicitPrototype(jSType37, objectType38);
        com.google.javascript.rhino.jstype.JSType jSType44 = jSTypeRegistry36.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSType44.dereference();
        boolean boolean46 = objectType45.isRegexpType();
        boolean boolean48 = objectType45.isPropertyTypeInferred("hi!");
        boolean boolean49 = parameterizedType30.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) objectType45);
        java.lang.String str50 = parameterizedType30.toDebugHashCodeString();
        boolean boolean52 = parameterizedType30.hasOwnProperty("");
        boolean boolean53 = parameterizedType30.isInstanceType();
        com.google.javascript.rhino.Node node54 = parameterizedType30.getRootNode();
        com.google.javascript.rhino.jstype.JSType jSType56 = parameterizedType30.getPropertyType("{proxy:{proxy:{268117741}}}");
        java.util.Set<java.lang.String> strSet57 = parameterizedType30.getOwnPropertyNames();
        com.google.javascript.rhino.JSDocInfo jSDocInfo59 = parameterizedType30.getOwnPropertyJSDocInfo("{proxy:{proxy:{1483631908}}}");
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType60 = parameterizedType30.toMaybeParameterizedType();
        boolean boolean62 = parameterizedType30.isPropertyTypeDeclared("{proxy:{proxy:{1092403954}}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test616");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        boolean boolean38 = jSTypeRegistry35.resetImplicitPrototype(jSType36, objectType37);
        com.google.javascript.rhino.jstype.JSType jSType43 = jSTypeRegistry35.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = jSType43.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSType43.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType46 = jSType43.restrictByNotNullOrUndefined();
        boolean boolean47 = parameterizedType30.canAssignTo(jSType43);
        boolean boolean49 = parameterizedType30.isPropertyTypeInferred("");
        boolean boolean50 = parameterizedType30.isResolved();
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType30.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType53 = parameterizedType30.findPropertyType("{proxy:{proxy:{649633010}}}");
        boolean boolean54 = parameterizedType30.isNominalType();
        boolean boolean55 = parameterizedType30.matchesStringContext();
        boolean boolean56 = parameterizedType30.matchesNumberContext();
        boolean boolean57 = parameterizedType30.isUnknownType();
        boolean boolean58 = parameterizedType30.isNominalType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType59 = parameterizedType30.toMaybeParameterizedType();
        com.google.javascript.rhino.jstype.ObjectType objectType60 = parameterizedType59.getTypeOfThis();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType59.", jSType16.equals(parameterizedType59) == parameterizedType59.equals(jSType16));
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test617");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable31 = parameterizedType30.getCtorExtendedInterfaces();
        boolean boolean32 = parameterizedType30.isNominalType();
        boolean boolean33 = parameterizedType30.isAllType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo35 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean36 = jSDocInfo35.isInterface();
        java.util.Collection<java.lang.String> strCollection37 = jSDocInfo35.getReferences();
        parameterizedType30.setPropertyJSDocInfo("", jSDocInfo35);
        boolean boolean39 = jSDocInfo35.isJavaDispatch();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test618");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        boolean boolean5 = cloneableList3.isEmpty();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList6 = cloneableList3.reverse();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList7 = cloneableList3.asList();
        int int8 = cloneableList3.size();
        com.google.common.collect.UnmodifiableIterator<java.lang.Cloneable> cloneableItor9 = cloneableList3.iterator();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList13 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node12);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList14 = cloneableList13.asList();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        boolean boolean20 = jSTypeRegistry17.resetImplicitPrototype(jSType18, objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = null;
        boolean boolean26 = jSTypeRegistry23.resetImplicitPrototype(jSType24, objectType25);
        com.google.javascript.rhino.jstype.JSType jSType31 = jSTypeRegistry23.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSType31.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        boolean boolean38 = jSTypeRegistry35.resetImplicitPrototype(jSType36, objectType37);
        com.google.javascript.rhino.jstype.JSType jSType43 = jSTypeRegistry35.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = jSType43.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType45 = jSTypeRegistry17.createParameterizedType(objectType32, jSType43);
        java.util.Set set46 = parameterizedType45.getOwnPropertyNames();
        boolean boolean47 = parameterizedType45.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType48 = parameterizedType45.getIndexType();
        boolean boolean49 = cloneableList14.equals((java.lang.Object) parameterizedType45);
        boolean boolean50 = parameterizedType45.hasDisplayName();
        com.google.javascript.rhino.jstype.FunctionType functionType51 = parameterizedType45.toMaybeFunctionType();
        boolean boolean53 = parameterizedType45.removeProperty("{proxy:{proxy:{1168420562}}}");
        boolean boolean55 = parameterizedType45.isPropertyTypeDeclared("{proxy:{proxy:{628733757}}}");
        com.google.javascript.rhino.jstype.FunctionType functionType56 = parameterizedType45.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType57 = parameterizedType45.dereference();
        int int58 = cloneableList3.lastIndexOf((java.lang.Object) objectType57);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType31 and objectType57.", jSType31.equals(objectType57) == objectType57.equals(jSType31));
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test619");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        boolean boolean33 = parameterizedType30.isAllType();
        com.google.javascript.rhino.jstype.FunctionType functionType34 = parameterizedType30.getConstructor();
        java.lang.Iterable iterable35 = parameterizedType30.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType36 = parameterizedType30.autobox();
        com.google.javascript.rhino.jstype.ObjectType objectType37 = parameterizedType30.dereference();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and objectType37.", jSType16.equals(objectType37) == objectType37.equals(jSType16));
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test620");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType33 = parameterizedType30.getIndexType();
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType38 = null;
        boolean boolean39 = jSTypeRegistry36.resetImplicitPrototype(jSType37, objectType38);
        com.google.javascript.rhino.jstype.JSType jSType44 = jSTypeRegistry36.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSType44.dereference();
        boolean boolean46 = objectType45.isRegexpType();
        boolean boolean48 = objectType45.isPropertyTypeInferred("hi!");
        boolean boolean49 = parameterizedType30.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) objectType45);
        java.lang.String str50 = parameterizedType30.toDebugHashCodeString();
        boolean boolean52 = parameterizedType30.hasOwnProperty("");
        boolean boolean53 = parameterizedType30.isNullType();
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType58 = null;
        boolean boolean59 = jSTypeRegistry56.resetImplicitPrototype(jSType57, objectType58);
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60, true);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType64 = null;
        boolean boolean65 = jSTypeRegistry62.resetImplicitPrototype(jSType63, objectType64);
        com.google.javascript.rhino.jstype.JSType jSType70 = jSTypeRegistry62.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType71 = jSType70.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter72 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry74 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter72, true);
        com.google.javascript.rhino.jstype.JSType jSType75 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType76 = null;
        boolean boolean77 = jSTypeRegistry74.resetImplicitPrototype(jSType75, objectType76);
        com.google.javascript.rhino.jstype.JSType jSType82 = jSTypeRegistry74.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType83 = jSType82.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType84 = jSTypeRegistry56.createParameterizedType(objectType71, jSType82);
        java.util.Set set85 = parameterizedType84.getOwnPropertyNames();
        boolean boolean86 = parameterizedType84.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType87 = parameterizedType84.getIndexType();
        java.lang.String str88 = parameterizedType84.toDebugHashCodeString();
        boolean boolean89 = parameterizedType84.isInterface();
        com.google.javascript.rhino.jstype.ObjectType objectType90 = parameterizedType84.getTypeOfThis();
        boolean boolean91 = parameterizedType84.isNoObjectType();
        boolean boolean92 = parameterizedType84.matchesObjectContext();
        boolean boolean93 = parameterizedType84.isNominalType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue94 = parameterizedType30.testForEquality((com.google.javascript.rhino.jstype.JSType) parameterizedType84);
        boolean boolean95 = parameterizedType30.isNominalType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType84.", jSType16.equals(parameterizedType84) == parameterizedType84.equals(jSType16));
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test621");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        boolean boolean38 = jSTypeRegistry35.resetImplicitPrototype(jSType36, objectType37);
        com.google.javascript.rhino.jstype.JSType jSType43 = jSTypeRegistry35.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = jSType43.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSType43.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType46 = jSType43.restrictByNotNullOrUndefined();
        boolean boolean47 = parameterizedType30.canAssignTo(jSType43);
        boolean boolean49 = parameterizedType30.isPropertyTypeInferred("");
        boolean boolean50 = parameterizedType30.isResolved();
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType30.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, true);
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType56 = null;
        boolean boolean57 = jSTypeRegistry54.resetImplicitPrototype(jSType55, objectType56);
        com.google.javascript.rhino.jstype.JSType jSType62 = jSTypeRegistry54.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType63 = jSType62.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType64 = jSType62.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType65 = jSType62.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType66 = jSType65.toMaybeEnumElementType();
        boolean boolean67 = parameterizedType30.isEquivalentTo(jSType65);
        boolean boolean68 = parameterizedType30.isNativeObjectType();
        boolean boolean69 = parameterizedType30.isAllType();
        com.google.javascript.rhino.jstype.FunctionType functionType70 = parameterizedType30.getOwnerFunction();
        com.google.javascript.rhino.jstype.JSType jSType72 = parameterizedType30.findPropertyType("function (): {proxy:{1534152661}}");
        com.google.javascript.rhino.jstype.JSType jSType73 = jSType72.autoboxesTo();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test622");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        jSTypeRegistry2.forwardDeclareType("(|function (): )");
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        boolean boolean17 = jSTypeRegistry14.resetImplicitPrototype(jSType15, objectType16);
        com.google.javascript.rhino.jstype.JSType jSType22 = jSTypeRegistry14.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType23 = jSType22.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24, true);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType28 = null;
        boolean boolean29 = jSTypeRegistry26.resetImplicitPrototype(jSType27, objectType28);
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry26.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSType34.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType36 = jSTypeRegistry8.createParameterizedType(objectType23, jSType34);
        java.util.Set set37 = parameterizedType36.getOwnPropertyNames();
        boolean boolean38 = parameterizedType36.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType39 = parameterizedType36.getIndexType();
        java.lang.String str40 = parameterizedType36.toDebugHashCodeString();
        boolean boolean41 = parameterizedType36.matchesNumberContext();
        boolean boolean42 = parameterizedType36.canBeCalled();
        com.google.javascript.rhino.jstype.TemplateType templateType43 = parameterizedType36.toMaybeTemplateType();
        java.lang.String str44 = parameterizedType36.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.JSType jSType46 = parameterizedType36.findPropertyType("(|function (): )");
        com.google.javascript.rhino.jstype.EnumType enumType47 = parameterizedType36.toMaybeEnumType();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((int) (short) -1);
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType((com.google.javascript.rhino.jstype.JSType) parameterizedType36, node49);
        java.lang.String str51 = node49.getSourceFileName();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType22 and parameterizedType36.", jSType22.equals(parameterizedType36) == parameterizedType36.equals(jSType22));
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test623");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        com.google.javascript.rhino.JSDocInfo jSDocInfo32 = parameterizedType30.getJSDocInfo();
        boolean boolean34 = parameterizedType30.removeProperty("function (): {proxy:{929267642}}");
        boolean boolean35 = parameterizedType30.matchesUint32Context();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType36 = parameterizedType30.toMaybeParameterizedType();
        boolean boolean37 = parameterizedType30.isRecordType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test624");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        boolean boolean3 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        boolean boolean18 = objectType17.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable19 = objectType17.getCtorImplementedInterfaces();
        boolean boolean20 = objectType17.isNativeObjectType();
        jSTypeRegistry2.registerPropertyOnType("", (com.google.javascript.rhino.jstype.JSType) objectType17);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        boolean boolean27 = jSTypeRegistry24.resetImplicitPrototype(jSType25, objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = null;
        boolean boolean33 = jSTypeRegistry30.resetImplicitPrototype(jSType31, objectType32);
        com.google.javascript.rhino.jstype.JSType jSType38 = jSTypeRegistry30.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType39 = jSType38.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        boolean boolean45 = jSTypeRegistry42.resetImplicitPrototype(jSType43, objectType44);
        com.google.javascript.rhino.jstype.JSType jSType50 = jSTypeRegistry42.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType51 = jSType50.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType52 = jSTypeRegistry24.createParameterizedType(objectType39, jSType50);
        java.util.Set set53 = parameterizedType52.getOwnPropertyNames();
        boolean boolean54 = parameterizedType52.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, true);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType59 = null;
        boolean boolean60 = jSTypeRegistry57.resetImplicitPrototype(jSType58, objectType59);
        com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry57.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType66 = jSType65.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType67 = jSType65.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType68 = jSType65.restrictByNotNullOrUndefined();
        boolean boolean69 = parameterizedType52.canAssignTo(jSType65);
        boolean boolean71 = parameterizedType52.isPropertyTypeInferred("");
        com.google.javascript.rhino.jstype.JSType jSType76 = jSTypeRegistry2.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) parameterizedType52, "hi!", "Named type with empty name component", 40, 39);
        com.google.javascript.rhino.jstype.JSType jSType77 = parameterizedType52.getParameterType();
        boolean boolean78 = parameterizedType52.isNoObjectType();
        com.google.javascript.rhino.jstype.EnumType enumType79 = parameterizedType52.toMaybeEnumType();
        com.google.javascript.rhino.jstype.JSType jSType81 = parameterizedType52.getPropertyType("function (): {proxy:{929267642}}");
        java.lang.String str82 = parameterizedType52.toString();
        com.google.javascript.rhino.jstype.ObjectType objectType83 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) parameterizedType52);
        com.google.javascript.rhino.jstype.JSType jSType84 = parameterizedType52.getIndexType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType52.", jSType16.equals(parameterizedType52) == parameterizedType52.equals(jSType16));
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test625");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        boolean boolean38 = jSTypeRegistry35.resetImplicitPrototype(jSType36, objectType37);
        com.google.javascript.rhino.jstype.JSType jSType43 = jSTypeRegistry35.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = jSType43.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSType43.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType46 = jSType43.restrictByNotNullOrUndefined();
        boolean boolean47 = parameterizedType30.canAssignTo(jSType43);
        boolean boolean49 = parameterizedType30.isPropertyTypeInferred("");
        boolean boolean50 = parameterizedType30.isResolved();
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType30.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType53 = parameterizedType30.findPropertyType("{proxy:{proxy:{649633010}}}");
        boolean boolean54 = parameterizedType30.isNominalType();
        boolean boolean55 = parameterizedType30.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType56 = parameterizedType30.getIndexType();
        com.google.javascript.rhino.ErrorReporter errorReporter57 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter57, true);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType61 = null;
        boolean boolean62 = jSTypeRegistry59.resetImplicitPrototype(jSType60, objectType61);
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63, true);
        com.google.javascript.rhino.jstype.JSType jSType66 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType67 = null;
        boolean boolean68 = jSTypeRegistry65.resetImplicitPrototype(jSType66, objectType67);
        com.google.javascript.rhino.jstype.JSType jSType73 = jSTypeRegistry65.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType74 = jSType73.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter75 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter75, true);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType79 = null;
        boolean boolean80 = jSTypeRegistry77.resetImplicitPrototype(jSType78, objectType79);
        com.google.javascript.rhino.jstype.JSType jSType85 = jSTypeRegistry77.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType86 = jSType85.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType87 = jSTypeRegistry59.createParameterizedType(objectType74, jSType85);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable88 = parameterizedType87.getCtorExtendedInterfaces();
        boolean boolean89 = parameterizedType87.isNumberValueType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue90 = parameterizedType30.testForEquality((com.google.javascript.rhino.jstype.JSType) parameterizedType87);
        com.google.javascript.rhino.jstype.ObjectType.Property property92 = parameterizedType87.getSlot("InputId: function (): {proxy:{929267642}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test626");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        boolean boolean31 = parameterizedType30.isEnumElementType();
        com.google.javascript.rhino.jstype.FunctionType functionType32 = parameterizedType30.getConstructor();
        com.google.javascript.rhino.jstype.JSType jSType33 = parameterizedType30.collapseUnion();
        com.google.javascript.rhino.JSDocInfo jSDocInfo35 = parameterizedType30.getOwnPropertyJSDocInfo("function (): {proxy:{1836835066}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test627");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable7 = jSTypeRegistry2.getTypesWithProperty("Named type with empty name component");
        com.google.javascript.rhino.ErrorReporter errorReporter8 = jSTypeRegistry2.getErrorReporter();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        boolean boolean14 = jSTypeRegistry11.resetImplicitPrototype(jSType12, objectType13);
        com.google.javascript.rhino.jstype.JSType jSType19 = jSTypeRegistry11.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSType19.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        boolean boolean27 = jSTypeRegistry24.resetImplicitPrototype(jSType25, objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = null;
        boolean boolean33 = jSTypeRegistry30.resetImplicitPrototype(jSType31, objectType32);
        com.google.javascript.rhino.jstype.JSType jSType38 = jSTypeRegistry30.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType39 = jSType38.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        boolean boolean45 = jSTypeRegistry42.resetImplicitPrototype(jSType43, objectType44);
        com.google.javascript.rhino.jstype.JSType jSType50 = jSTypeRegistry42.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType51 = jSType50.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType52 = jSTypeRegistry24.createParameterizedType(objectType39, jSType50);
        java.util.Set set53 = parameterizedType52.getOwnPropertyNames();
        boolean boolean54 = parameterizedType52.isNoObjectType();
        boolean boolean55 = parameterizedType52.isAllType();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) (-1L));
        boolean boolean58 = objectType20.defineInferredProperty("unknown", (com.google.javascript.rhino.jstype.JSType) parameterizedType52, node57);
        com.google.javascript.rhino.jstype.ObjectType objectType59 = parameterizedType52.getImplicitPrototype();
        boolean boolean60 = parameterizedType52.isNativeObjectType();
        boolean boolean61 = parameterizedType52.matchesStringContext();
        boolean boolean62 = parameterizedType52.isNullable();
        com.google.javascript.rhino.jstype.ObjectType objectType63 = jSTypeRegistry2.createObjectType((com.google.javascript.rhino.jstype.ObjectType) parameterizedType52);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative64 = null;
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray65 = new com.google.javascript.rhino.jstype.JSTypeNative[] { jSTypeNative64 };
        com.google.javascript.rhino.ErrorReporter errorReporter66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry68 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter66, true);
        com.google.javascript.rhino.jstype.ObjectType objectType69 = jSTypeRegistry68.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray70 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType71 = jSTypeRegistry68.createUnionType(jSTypeNativeArray70);
        com.google.javascript.rhino.ErrorReporter errorReporter72 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry74 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter72, true);
        com.google.javascript.rhino.jstype.ObjectType objectType75 = jSTypeRegistry74.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray76 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType77 = jSTypeRegistry74.createUnionType(jSTypeNativeArray76);
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeNative[]> jSTypeNativeArrayList78 = com.google.common.collect.ImmutableList.of(jSTypeNativeArray65, jSTypeNativeArray70, jSTypeNativeArray76);
        com.google.javascript.rhino.jstype.JSType jSType79 = jSTypeRegistry2.createUnionType(jSTypeNativeArray76);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType19 and parameterizedType52.", jSType19.equals(parameterizedType52) == parameterizedType52.equals(jSType19));
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test628");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("function (): {proxy:{10439819}}", jSTypeNative1);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (byte) -1, "hi!");
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(41, node6, (int) (short) 1, 40);
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10, true);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        boolean boolean15 = jSTypeRegistry12.resetImplicitPrototype(jSType13, objectType14);
        jSTypeRegistry12.setLastGeneration(false);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        boolean boolean30 = objectType29.isFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType31 = jSTypeRegistry12.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType) objectType29);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable33 = jSTypeRegistry12.getEachReferenceTypeWithProperty("({proxy:{proxy:{1874555938}}})");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable35 = jSTypeRegistry12.getEachReferenceTypeWithProperty("function (): {proxy:{1240268079}}");
        com.google.javascript.rhino.jstype.JSType jSType36 = assertionFunctionSpec2.getAssertedType(node9, jSTypeRegistry12);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38, true);
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType42 = null;
        boolean boolean43 = jSTypeRegistry40.resetImplicitPrototype(jSType41, objectType42);
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44, true);
        com.google.javascript.rhino.jstype.JSType jSType47 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType48 = null;
        boolean boolean49 = jSTypeRegistry46.resetImplicitPrototype(jSType47, objectType48);
        com.google.javascript.rhino.jstype.JSType jSType54 = jSTypeRegistry46.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType55 = jSType54.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56, true);
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType60 = null;
        boolean boolean61 = jSTypeRegistry58.resetImplicitPrototype(jSType59, objectType60);
        com.google.javascript.rhino.jstype.JSType jSType66 = jSTypeRegistry58.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType67 = jSType66.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType68 = jSTypeRegistry40.createParameterizedType(objectType55, jSType66);
        java.util.Set set69 = parameterizedType68.getOwnPropertyNames();
        boolean boolean70 = parameterizedType68.isNoObjectType();
        boolean boolean71 = parameterizedType68.isAllType();
        boolean boolean72 = parameterizedType68.isEnumElementType();
        boolean boolean73 = parameterizedType68.isUnknownType();
        com.google.javascript.rhino.jstype.EnumType enumType74 = parameterizedType68.toMaybeEnumType();
        jSTypeRegistry12.unregisterPropertyOnType("(function (): {proxy:{2008360548}})", (com.google.javascript.rhino.jstype.JSType) parameterizedType68);
        jSTypeRegistry12.clearTemplateTypeNames();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType28 and parameterizedType68.", jSType28.equals(parameterizedType68) == parameterizedType68.equals(jSType28));
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test629");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable31 = parameterizedType30.getCtorExtendedInterfaces();
        boolean boolean32 = parameterizedType30.isNominalType();
        boolean boolean33 = parameterizedType30.isAllType();
        boolean boolean34 = parameterizedType30.isUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType36 = parameterizedType30.getPropertyType("{proxy:{proxy:{51735728}}}");
        boolean boolean37 = parameterizedType30.isNativeObjectType();
        boolean boolean38 = parameterizedType30.matchesObjectContext();
        com.google.javascript.rhino.jstype.JSType jSType39 = parameterizedType30.collapseUnion();
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        boolean boolean45 = jSTypeRegistry42.resetImplicitPrototype(jSType43, objectType44);
        com.google.javascript.rhino.jstype.JSType jSType50 = jSTypeRegistry42.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType51 = jSType50.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType57 = null;
        boolean boolean58 = jSTypeRegistry55.resetImplicitPrototype(jSType56, objectType57);
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        com.google.javascript.rhino.jstype.JSType jSType62 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType63 = null;
        boolean boolean64 = jSTypeRegistry61.resetImplicitPrototype(jSType62, objectType63);
        com.google.javascript.rhino.jstype.JSType jSType69 = jSTypeRegistry61.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType70 = jSType69.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter71 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter71, true);
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType75 = null;
        boolean boolean76 = jSTypeRegistry73.resetImplicitPrototype(jSType74, objectType75);
        com.google.javascript.rhino.jstype.JSType jSType81 = jSTypeRegistry73.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType82 = jSType81.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType83 = jSTypeRegistry55.createParameterizedType(objectType70, jSType81);
        java.util.Set set84 = parameterizedType83.getOwnPropertyNames();
        boolean boolean85 = parameterizedType83.isNoObjectType();
        boolean boolean86 = parameterizedType83.isAllType();
        com.google.javascript.rhino.Node node88 = com.google.javascript.rhino.Node.newNumber((double) (-1L));
        boolean boolean89 = objectType51.defineInferredProperty("unknown", (com.google.javascript.rhino.jstype.JSType) parameterizedType83, node88);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable90 = parameterizedType83.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope91 = parameterizedType83.getParentScope();
        java.lang.String str92 = parameterizedType83.getDisplayName();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot94 = parameterizedType83.getSlot(".<>");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable95 = parameterizedType83.getCtorImplementedInterfaces();
        com.google.javascript.rhino.JSDocInfo jSDocInfo97 = parameterizedType83.getOwnPropertyJSDocInfo("{proxy:{proxy:{136656746}}}");
        boolean boolean98 = jSType39.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) parameterizedType83);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and jSType39.", jSType16.equals(jSType39) == jSType39.equals(jSType16));
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test630");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        boolean boolean3 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        boolean boolean18 = objectType17.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable19 = objectType17.getCtorImplementedInterfaces();
        boolean boolean20 = objectType17.isNativeObjectType();
        jSTypeRegistry2.registerPropertyOnType("", (com.google.javascript.rhino.jstype.JSType) objectType17);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        boolean boolean27 = jSTypeRegistry24.resetImplicitPrototype(jSType25, objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = null;
        boolean boolean33 = jSTypeRegistry30.resetImplicitPrototype(jSType31, objectType32);
        com.google.javascript.rhino.jstype.JSType jSType38 = jSTypeRegistry30.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType39 = jSType38.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        boolean boolean45 = jSTypeRegistry42.resetImplicitPrototype(jSType43, objectType44);
        com.google.javascript.rhino.jstype.JSType jSType50 = jSTypeRegistry42.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType51 = jSType50.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType52 = jSTypeRegistry24.createParameterizedType(objectType39, jSType50);
        java.util.Set set53 = parameterizedType52.getOwnPropertyNames();
        boolean boolean54 = parameterizedType52.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, true);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType59 = null;
        boolean boolean60 = jSTypeRegistry57.resetImplicitPrototype(jSType58, objectType59);
        com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry57.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType66 = jSType65.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType67 = jSType65.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType68 = jSType65.restrictByNotNullOrUndefined();
        boolean boolean69 = parameterizedType52.canAssignTo(jSType65);
        boolean boolean71 = parameterizedType52.isPropertyTypeInferred("");
        com.google.javascript.rhino.jstype.JSType jSType76 = jSTypeRegistry2.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) parameterizedType52, "hi!", "Named type with empty name component", 40, 39);
        com.google.javascript.rhino.jstype.JSType jSType77 = parameterizedType52.getParameterType();
        boolean boolean78 = parameterizedType52.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType80 = parameterizedType52.findPropertyType("{proxy:{proxy:{216812130}}}");
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType81 = parameterizedType52.toMaybeParameterizedType();
        boolean boolean82 = parameterizedType81.hasAnyTemplateInternal();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType81.", jSType16.equals(parameterizedType81) == parameterizedType81.equals(jSType16));
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test631");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        boolean boolean33 = parameterizedType30.isAllType();
        com.google.javascript.rhino.jstype.FunctionType functionType34 = parameterizedType30.getConstructor();
        boolean boolean35 = parameterizedType30.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType36 = parameterizedType30.getTypeOfThis();
        java.util.Set set37 = parameterizedType30.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.ObjectType objectType38 = parameterizedType30.toObjectType();
        boolean boolean39 = parameterizedType30.hasReferenceName();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test632");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        boolean boolean38 = jSTypeRegistry35.resetImplicitPrototype(jSType36, objectType37);
        com.google.javascript.rhino.jstype.JSType jSType43 = jSTypeRegistry35.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = jSType43.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSType43.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType46 = jSType43.restrictByNotNullOrUndefined();
        boolean boolean47 = parameterizedType30.canAssignTo(jSType43);
        boolean boolean49 = parameterizedType30.removeProperty("{proxy:{proxy:{1763454178}}}");
        boolean boolean50 = parameterizedType30.isOrdinaryFunction();
        com.google.javascript.rhino.jstype.JSType jSType51 = parameterizedType30.getParameterType();
        java.lang.String str52 = jSType51.toAnnotationString();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test633");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        jSTypeRegistry2.setLastGeneration(false);
        jSTypeRegistry2.incrementGeneration();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10, true);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        boolean boolean15 = jSTypeRegistry12.resetImplicitPrototype(jSType13, objectType14);
        com.google.javascript.rhino.jstype.JSType jSType20 = jSTypeRegistry12.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = jSType20.dereference();
        boolean boolean22 = objectType21.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = objectType21.getCtorImplementedInterfaces();
        boolean boolean24 = objectType21.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25, true);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        boolean boolean30 = jSTypeRegistry27.resetImplicitPrototype(jSType28, objectType29);
        com.google.javascript.rhino.jstype.JSType jSType35 = jSTypeRegistry27.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType36 = jSType35.dereference();
        boolean boolean37 = objectType36.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable38 = objectType36.getCtorImplementedInterfaces();
        boolean boolean39 = objectType36.isNativeObjectType();
        boolean boolean40 = objectType21.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType36);
        boolean boolean42 = objectType21.hasProperty("hi!");
        com.google.javascript.rhino.jstype.JSType jSType43 = objectType21.autobox();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope44 = objectType21.getParentScope();
        com.google.javascript.rhino.jstype.FunctionType functionType45 = objectType21.getOwnerFunction();
        com.google.javascript.rhino.jstype.ObjectType objectType46 = objectType21.dereference();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot48 = objectType46.getSlot("unknown");
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49, true);
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType53 = null;
        boolean boolean54 = jSTypeRegistry51.resetImplicitPrototype(jSType52, objectType53);
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, true);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType59 = null;
        boolean boolean60 = jSTypeRegistry57.resetImplicitPrototype(jSType58, objectType59);
        com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry57.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType66 = jSType65.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter67 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry69 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter67, true);
        com.google.javascript.rhino.jstype.JSType jSType70 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType71 = null;
        boolean boolean72 = jSTypeRegistry69.resetImplicitPrototype(jSType70, objectType71);
        com.google.javascript.rhino.jstype.JSType jSType77 = jSTypeRegistry69.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType78 = jSType77.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType79 = jSTypeRegistry51.createParameterizedType(objectType66, jSType77);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue80 = objectType46.testForEquality((com.google.javascript.rhino.jstype.JSType) parameterizedType79);
        boolean boolean81 = parameterizedType79.isFunctionPrototypeType();
        com.google.javascript.rhino.Node node83 = parameterizedType79.getPropertyNode("function (): {proxy:{410214344}}");
        jSTypeRegistry2.unregisterPropertyOnType("function (): {proxy:{1076771747}}", (com.google.javascript.rhino.jstype.JSType) parameterizedType79);
        com.google.javascript.rhino.jstype.JSType jSType86 = jSTypeRegistry2.getType("{proxy:{proxy:{2083824417}}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType20 and parameterizedType79.", jSType20.equals(parameterizedType79) == parameterizedType79.equals(jSType20));
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test634");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        com.google.javascript.rhino.JSDocInfo jSDocInfo32 = parameterizedType30.getJSDocInfo();
        boolean boolean34 = parameterizedType30.removeProperty("function (): {proxy:{929267642}}");
        boolean boolean35 = parameterizedType30.matchesUint32Context();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType36 = parameterizedType30.toMaybeParameterizedType();
        boolean boolean37 = parameterizedType36.isUnknownType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType36.", jSType16.equals(parameterizedType36) == parameterizedType36.equals(jSType16));
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test635");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.hasReferenceName();
        boolean boolean33 = parameterizedType30.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.JSType jSType35 = parameterizedType30.findPropertyType("");
        java.lang.String str36 = parameterizedType30.getReferenceName();
        com.google.javascript.rhino.jstype.UnionType unionType37 = parameterizedType30.toMaybeUnionType();
        boolean boolean39 = parameterizedType30.hasOwnProperty("function (): {proxy:{1262905525}}");
        com.google.javascript.rhino.JSDocInfo jSDocInfo40 = parameterizedType30.getJSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = parameterizedType30.getJSDocInfo();
        java.lang.String str42 = parameterizedType30.getReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = null;
        boolean boolean48 = jSTypeRegistry45.resetImplicitPrototype(jSType46, objectType47);
        com.google.javascript.rhino.jstype.JSType jSType53 = jSTypeRegistry45.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType54 = jSType53.dereference();
        boolean boolean55 = objectType54.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable56 = objectType54.getCtorImplementedInterfaces();
        boolean boolean57 = objectType54.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter58 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter58, true);
        com.google.javascript.rhino.jstype.JSType jSType61 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType62 = null;
        boolean boolean63 = jSTypeRegistry60.resetImplicitPrototype(jSType61, objectType62);
        com.google.javascript.rhino.jstype.JSType jSType68 = jSTypeRegistry60.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType69 = jSType68.dereference();
        boolean boolean70 = objectType69.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable71 = objectType69.getCtorImplementedInterfaces();
        boolean boolean72 = objectType69.isNativeObjectType();
        boolean boolean73 = objectType54.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType69);
        boolean boolean75 = objectType54.hasProperty("hi!");
        com.google.javascript.rhino.jstype.JSType jSType76 = objectType54.autobox();
        boolean boolean77 = objectType54.isEmptyType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable78 = objectType54.getCtorImplementedInterfaces();
        boolean boolean79 = objectType54.isNoResolvedType();
        com.google.javascript.rhino.jstype.ObjectType objectType80 = objectType54.toObjectType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue81 = parameterizedType30.testForEquality((com.google.javascript.rhino.jstype.JSType) objectType80);
        java.lang.String str82 = objectType80.toAnnotationString();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test636");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        boolean boolean10 = jSTypeRegistry7.resetImplicitPrototype(jSType8, objectType9);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, true);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        boolean boolean16 = jSTypeRegistry13.resetImplicitPrototype(jSType14, objectType15);
        com.google.javascript.rhino.jstype.JSType jSType21 = jSTypeRegistry13.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSType21.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = null;
        boolean boolean28 = jSTypeRegistry25.resetImplicitPrototype(jSType26, objectType27);
        com.google.javascript.rhino.jstype.JSType jSType33 = jSTypeRegistry25.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = jSType33.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType35 = jSTypeRegistry7.createParameterizedType(objectType22, jSType33);
        java.util.Set set36 = parameterizedType35.getOwnPropertyNames();
        boolean boolean37 = parameterizedType35.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType38 = parameterizedType35.getIndexType();
        boolean boolean39 = cloneableList4.equals((java.lang.Object) parameterizedType35);
        com.google.javascript.rhino.Node node41 = parameterizedType35.getPropertyNode("function (): {proxy:{1288677244}}");
        boolean boolean43 = parameterizedType35.isPropertyTypeDeclared("false");
        boolean boolean44 = parameterizedType35.isNoType();
        boolean boolean46 = parameterizedType35.isPropertyTypeDeclared("{proxy:{proxy:{838073551}}}");
        com.google.javascript.rhino.jstype.JSType jSType47 = parameterizedType35.autobox();
        com.google.javascript.rhino.jstype.JSType jSType49 = parameterizedType35.findPropertyType("{proxy:{proxy:{1690824395}}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType21 and parameterizedType35.", jSType21.equals(parameterizedType35) == parameterizedType35.equals(jSType21));
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test637");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        boolean boolean4 = node2.isString();
        node2.setSourceFileForTesting("hi!");
        boolean boolean7 = node2.isLocalResultCall();
        node2.setType(2147483647);
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition10 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int11 = namePosition10.getStartLine();
        int int12 = namePosition10.getStartLine();
        int int13 = namePosition10.getEndLine();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean17 = node16.isTrue();
        namePosition10.setItem(node16);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean26 = node25.isFalse();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean30 = node29.isTrue();
        boolean boolean31 = node29.hasOneChild();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean35 = node34.isTrue();
        boolean boolean36 = node34.isBreak();
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((int) (byte) 1, node22, node25, node29, node34, (int) (byte) 1, 4095);
        boolean boolean40 = node22.isReturn();
        node22.setType((-1));
        com.google.javascript.rhino.Node node43 = node16.useSourceInfoFrom(node22);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean51 = node50.isFalse();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean55 = node54.isTrue();
        boolean boolean56 = node54.hasOneChild();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean60 = node59.isTrue();
        boolean boolean61 = node59.isBreak();
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node((int) (byte) 1, node47, node50, node54, node59, (int) (byte) 1, 4095);
        java.lang.String str65 = node50.getString();
        boolean boolean66 = node50.isParamList();
        int int68 = node50.getIntProp(0);
        boolean boolean69 = node22.hasChild(node50);
        boolean boolean70 = node22.isComma();
        com.google.javascript.rhino.Node node71 = node2.useSourceInfoFromForTree(node22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node73 = node71.getChildAtIndex(43);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test638");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean11 = node10.isFalse();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean15 = node14.isTrue();
        boolean boolean16 = node14.hasOneChild();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean20 = node19.isTrue();
        boolean boolean21 = node19.isBreak();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (byte) 1, node7, node10, node14, node19, (int) (byte) 1, 4095);
        boolean boolean25 = node7.isDelProp();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        boolean boolean31 = jSTypeRegistry28.resetImplicitPrototype(jSType29, objectType30);
        com.google.javascript.rhino.jstype.JSType jSType36 = jSTypeRegistry28.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType37 = jSType36.dereference();
        boolean boolean38 = objectType37.isFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType39 = jSTypeRegistry2.createObjectType("hi!", node7, objectType37);
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        boolean boolean45 = jSTypeRegistry42.resetImplicitPrototype(jSType43, objectType44);
        com.google.javascript.rhino.jstype.JSType jSType50 = jSTypeRegistry42.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType51 = jSType50.dereference();
        boolean boolean52 = objectType51.isRegexpType();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection53 = jSTypeRegistry2.getDirectImplementors(objectType51);
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, true);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType59 = null;
        boolean boolean60 = jSTypeRegistry57.resetImplicitPrototype(jSType58, objectType59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61, true);
        com.google.javascript.rhino.jstype.JSType jSType64 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType65 = null;
        boolean boolean66 = jSTypeRegistry63.resetImplicitPrototype(jSType64, objectType65);
        com.google.javascript.rhino.jstype.JSType jSType71 = jSTypeRegistry63.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType72 = jSType71.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter73 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry75 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter73, true);
        com.google.javascript.rhino.jstype.JSType jSType76 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType77 = null;
        boolean boolean78 = jSTypeRegistry75.resetImplicitPrototype(jSType76, objectType77);
        com.google.javascript.rhino.jstype.JSType jSType83 = jSTypeRegistry75.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType84 = jSType83.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType85 = jSTypeRegistry57.createParameterizedType(objectType72, jSType83);
        java.util.Set set86 = parameterizedType85.getOwnPropertyNames();
        boolean boolean87 = parameterizedType85.hasReferenceName();
        boolean boolean88 = parameterizedType85.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.JSType jSType90 = parameterizedType85.findPropertyType("");
        jSTypeRegistry2.registerPropertyOnType("Unknown class name", (com.google.javascript.rhino.jstype.JSType) parameterizedType85);
        boolean boolean93 = parameterizedType85.isPropertyInExterns("{proxy:{proxy:{1168420562}}}");
        boolean boolean95 = parameterizedType85.hasProperty("{proxy:{proxy:{2085879732}}}");
        com.google.javascript.rhino.jstype.JSType jSType96 = parameterizedType85.getParameterType();
        boolean boolean97 = jSType96.isString();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType36 and parameterizedType85.", jSType36.equals(parameterizedType85) == parameterizedType85.equals(jSType36));
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test639");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        boolean boolean31 = parameterizedType30.isInterface();
        boolean boolean32 = parameterizedType30.isUnknownType();
        com.google.javascript.rhino.jstype.ObjectType objectType33 = parameterizedType30.getTypeOfThis();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet34 = parameterizedType30.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet36 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(true);
        boolean boolean38 = booleanLiteralSet36.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet39 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean41 = booleanLiteralSet39.contains(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet42 = booleanLiteralSet36.intersection(booleanLiteralSet39);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet44 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(true);
        boolean boolean46 = booleanLiteralSet44.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet47 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        boolean boolean49 = booleanLiteralSet47.contains(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet50 = booleanLiteralSet44.intersection(booleanLiteralSet47);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet51 = booleanLiteralSet36.intersection(booleanLiteralSet47);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet52 = booleanLiteralSet34.intersection(booleanLiteralSet51);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test640");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        boolean boolean38 = jSTypeRegistry35.resetImplicitPrototype(jSType36, objectType37);
        com.google.javascript.rhino.jstype.JSType jSType43 = jSTypeRegistry35.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = jSType43.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSType43.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType46 = jSType43.restrictByNotNullOrUndefined();
        boolean boolean47 = parameterizedType30.canAssignTo(jSType43);
        boolean boolean49 = parameterizedType30.isPropertyTypeInferred("");
        boolean boolean50 = parameterizedType30.isResolved();
        boolean boolean51 = parameterizedType30.isInstanceType();
        boolean boolean52 = parameterizedType30.isConstructor();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType57 = null;
        boolean boolean58 = jSTypeRegistry55.resetImplicitPrototype(jSType56, objectType57);
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        com.google.javascript.rhino.jstype.JSType jSType62 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType63 = null;
        boolean boolean64 = jSTypeRegistry61.resetImplicitPrototype(jSType62, objectType63);
        com.google.javascript.rhino.jstype.JSType jSType69 = jSTypeRegistry61.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType70 = jSType69.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter71 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter71, true);
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType75 = null;
        boolean boolean76 = jSTypeRegistry73.resetImplicitPrototype(jSType74, objectType75);
        com.google.javascript.rhino.jstype.JSType jSType81 = jSTypeRegistry73.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType82 = jSType81.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType83 = jSTypeRegistry55.createParameterizedType(objectType70, jSType81);
        java.util.Set set84 = parameterizedType83.getOwnPropertyNames();
        boolean boolean85 = parameterizedType83.hasReferenceName();
        boolean boolean86 = parameterizedType83.hasAnyTemplateInternal();
        boolean boolean87 = parameterizedType83.isInstanceType();
        boolean boolean88 = parameterizedType83.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType90 = parameterizedType83.findPropertyType("{proxy:{proxy:{1317500836}}}");
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType91 = parameterizedType83.toMaybeParameterizedType();
        boolean boolean92 = parameterizedType30.canAssignTo((com.google.javascript.rhino.jstype.JSType) parameterizedType83);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType83.", jSType16.equals(parameterizedType83) == parameterizedType83.equals(jSType16));
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test641");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        boolean boolean38 = jSTypeRegistry35.resetImplicitPrototype(jSType36, objectType37);
        com.google.javascript.rhino.jstype.JSType jSType43 = jSTypeRegistry35.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = jSType43.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSType43.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType46 = jSType43.restrictByNotNullOrUndefined();
        boolean boolean47 = parameterizedType30.canAssignTo(jSType43);
        int int48 = parameterizedType30.getPropertiesCount();
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49, true);
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType53 = null;
        boolean boolean54 = jSTypeRegistry51.resetImplicitPrototype(jSType52, objectType53);
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, true);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType59 = null;
        boolean boolean60 = jSTypeRegistry57.resetImplicitPrototype(jSType58, objectType59);
        com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry57.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType66 = jSType65.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter67 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry69 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter67, true);
        com.google.javascript.rhino.jstype.JSType jSType70 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType71 = null;
        boolean boolean72 = jSTypeRegistry69.resetImplicitPrototype(jSType70, objectType71);
        com.google.javascript.rhino.jstype.JSType jSType77 = jSTypeRegistry69.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType78 = jSType77.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType79 = jSTypeRegistry51.createParameterizedType(objectType66, jSType77);
        java.util.Set set80 = parameterizedType79.getOwnPropertyNames();
        boolean boolean81 = parameterizedType79.hasReferenceName();
        boolean boolean82 = parameterizedType79.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.JSType jSType84 = parameterizedType79.findPropertyType("");
        java.lang.String str85 = parameterizedType79.getReferenceName();
        com.google.javascript.rhino.jstype.UnionType unionType86 = parameterizedType79.toMaybeUnionType();
        boolean boolean88 = parameterizedType79.hasOwnProperty("function (): {proxy:{1262905525}}");
        com.google.javascript.rhino.JSDocInfo jSDocInfo89 = parameterizedType79.getJSDocInfo();
        com.google.javascript.rhino.jstype.JSType jSType91 = parameterizedType79.findPropertyType("{proxy:{proxy:{1317500836}}}");
        boolean boolean92 = parameterizedType79.isDateType();
        boolean boolean94 = parameterizedType79.isPropertyTypeInferred("{proxy:{proxy:{1702584281}}}");
        boolean boolean95 = parameterizedType30.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) parameterizedType79);
        com.google.javascript.rhino.jstype.EnumType enumType96 = parameterizedType79.toMaybeEnumType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test642");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        boolean boolean38 = jSTypeRegistry35.resetImplicitPrototype(jSType36, objectType37);
        com.google.javascript.rhino.jstype.JSType jSType43 = jSTypeRegistry35.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = jSType43.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSType43.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType46 = jSType43.restrictByNotNullOrUndefined();
        boolean boolean47 = parameterizedType30.canAssignTo(jSType43);
        boolean boolean49 = parameterizedType30.isPropertyTypeInferred("");
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50, true);
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType54 = null;
        boolean boolean55 = jSTypeRegistry52.resetImplicitPrototype(jSType53, objectType54);
        boolean boolean56 = jSTypeRegistry52.shouldTolerateUndefinedValues();
        jSTypeRegistry52.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.JSType jSType59 = jSTypeRegistry52.createUnionType(jSTypeArray58);
        boolean boolean60 = parameterizedType30.isSubtype(jSType59);
        com.google.javascript.rhino.jstype.JSType jSType61 = jSType59.unboxesTo();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test643");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.jstype.JSType jSType10 = jSTypeRegistry2.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = jSType10.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        boolean boolean18 = jSTypeRegistry15.resetImplicitPrototype(jSType16, objectType17);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19, true);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = null;
        boolean boolean24 = jSTypeRegistry21.resetImplicitPrototype(jSType22, objectType23);
        com.google.javascript.rhino.jstype.JSType jSType29 = jSTypeRegistry21.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSType29.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = null;
        boolean boolean36 = jSTypeRegistry33.resetImplicitPrototype(jSType34, objectType35);
        com.google.javascript.rhino.jstype.JSType jSType41 = jSTypeRegistry33.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType42 = jSType41.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType43 = jSTypeRegistry15.createParameterizedType(objectType30, jSType41);
        java.util.Set set44 = parameterizedType43.getOwnPropertyNames();
        boolean boolean45 = parameterizedType43.isNoObjectType();
        boolean boolean46 = parameterizedType43.isAllType();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber((double) (-1L));
        boolean boolean49 = objectType11.defineInferredProperty("unknown", (com.google.javascript.rhino.jstype.JSType) parameterizedType43, node48);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable50 = parameterizedType43.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope51 = parameterizedType43.getParentScope();
        java.lang.String str52 = parameterizedType43.getDisplayName();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope53 = parameterizedType43.getParentScope();
        com.google.javascript.rhino.jstype.JSType jSType54 = parameterizedType43.autobox();
        com.google.javascript.rhino.jstype.UnionType unionType55 = jSType54.toMaybeUnionType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType10 and jSType54.", jSType10.equals(jSType54) == jSType54.equals(jSType10));
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test644");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.jstype.JSType jSType10 = jSTypeRegistry2.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = jSType10.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        boolean boolean18 = jSTypeRegistry15.resetImplicitPrototype(jSType16, objectType17);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19, true);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = null;
        boolean boolean24 = jSTypeRegistry21.resetImplicitPrototype(jSType22, objectType23);
        com.google.javascript.rhino.jstype.JSType jSType29 = jSTypeRegistry21.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSType29.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = null;
        boolean boolean36 = jSTypeRegistry33.resetImplicitPrototype(jSType34, objectType35);
        com.google.javascript.rhino.jstype.JSType jSType41 = jSTypeRegistry33.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType42 = jSType41.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType43 = jSTypeRegistry15.createParameterizedType(objectType30, jSType41);
        java.util.Set set44 = parameterizedType43.getOwnPropertyNames();
        boolean boolean45 = parameterizedType43.isNoObjectType();
        boolean boolean46 = parameterizedType43.isAllType();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber((double) (-1L));
        boolean boolean49 = objectType11.defineInferredProperty("unknown", (com.google.javascript.rhino.jstype.JSType) parameterizedType43, node48);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable50 = parameterizedType43.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope51 = parameterizedType43.getParentScope();
        java.lang.String str52 = parameterizedType43.getDisplayName();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope53 = parameterizedType43.getParentScope();
        com.google.javascript.rhino.jstype.JSType jSType54 = parameterizedType43.autobox();
        com.google.javascript.rhino.jstype.JSType jSType55 = parameterizedType43.collapseUnion();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType10 and jSType55.", jSType10.equals(jSType55) == jSType55.equals(jSType10));
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test645");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        boolean boolean3 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        boolean boolean18 = objectType17.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable19 = objectType17.getCtorImplementedInterfaces();
        boolean boolean20 = objectType17.isNativeObjectType();
        jSTypeRegistry2.registerPropertyOnType("", (com.google.javascript.rhino.jstype.JSType) objectType17);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        boolean boolean27 = jSTypeRegistry24.resetImplicitPrototype(jSType25, objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = null;
        boolean boolean33 = jSTypeRegistry30.resetImplicitPrototype(jSType31, objectType32);
        com.google.javascript.rhino.jstype.JSType jSType38 = jSTypeRegistry30.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType39 = jSType38.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        boolean boolean45 = jSTypeRegistry42.resetImplicitPrototype(jSType43, objectType44);
        com.google.javascript.rhino.jstype.JSType jSType50 = jSTypeRegistry42.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType51 = jSType50.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType52 = jSTypeRegistry24.createParameterizedType(objectType39, jSType50);
        java.util.Set set53 = parameterizedType52.getOwnPropertyNames();
        boolean boolean54 = parameterizedType52.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, true);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType59 = null;
        boolean boolean60 = jSTypeRegistry57.resetImplicitPrototype(jSType58, objectType59);
        com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry57.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType66 = jSType65.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType67 = jSType65.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType68 = jSType65.restrictByNotNullOrUndefined();
        boolean boolean69 = parameterizedType52.canAssignTo(jSType65);
        boolean boolean71 = parameterizedType52.isPropertyTypeInferred("");
        com.google.javascript.rhino.jstype.JSType jSType76 = jSTypeRegistry2.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) parameterizedType52, "hi!", "Named type with empty name component", 40, 39);
        com.google.javascript.rhino.jstype.JSType jSType77 = parameterizedType52.getParameterType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo79 = parameterizedType52.getOwnPropertyJSDocInfo("");
        boolean boolean81 = parameterizedType52.hasOwnProperty("{proxy:{proxy:{2144970728}}}");
        com.google.javascript.rhino.jstype.JSType jSType82 = parameterizedType52.collapseUnion();
        boolean boolean83 = parameterizedType52.isStringObjectType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType52.", jSType16.equals(parameterizedType52) == parameterizedType52.equals(jSType16));
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test646");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        boolean boolean10 = jSTypeRegistry7.resetImplicitPrototype(jSType8, objectType9);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, true);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        boolean boolean16 = jSTypeRegistry13.resetImplicitPrototype(jSType14, objectType15);
        com.google.javascript.rhino.jstype.JSType jSType21 = jSTypeRegistry13.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSType21.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = null;
        boolean boolean28 = jSTypeRegistry25.resetImplicitPrototype(jSType26, objectType27);
        com.google.javascript.rhino.jstype.JSType jSType33 = jSTypeRegistry25.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = jSType33.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType35 = jSTypeRegistry7.createParameterizedType(objectType22, jSType33);
        java.util.Set set36 = parameterizedType35.getOwnPropertyNames();
        boolean boolean37 = parameterizedType35.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType38 = parameterizedType35.getIndexType();
        boolean boolean39 = cloneableList4.equals((java.lang.Object) parameterizedType35);
        boolean boolean40 = parameterizedType35.hasDisplayName();
        com.google.javascript.rhino.jstype.FunctionType functionType41 = parameterizedType35.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.TemplateType templateType42 = parameterizedType35.toMaybeTemplateType();
        java.util.Set set43 = parameterizedType35.getOwnPropertyNames();
        boolean boolean44 = parameterizedType35.isBooleanValueType();
        java.util.Set set45 = parameterizedType35.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.JSType jSType46 = parameterizedType35.restrictByNotNullOrUndefined();
        boolean boolean47 = jSType46.isNumberValueType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType21 and jSType46.", jSType21.equals(jSType46) == jSType46.equals(jSType21));
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test647");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        boolean boolean13 = jSTypeRegistry10.resetImplicitPrototype(jSType11, objectType12);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14, true);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        boolean boolean19 = jSTypeRegistry16.resetImplicitPrototype(jSType17, objectType18);
        com.google.javascript.rhino.jstype.JSType jSType24 = jSTypeRegistry16.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSType24.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        boolean boolean31 = jSTypeRegistry28.resetImplicitPrototype(jSType29, objectType30);
        com.google.javascript.rhino.jstype.JSType jSType36 = jSTypeRegistry28.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType37 = jSType36.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType38 = jSTypeRegistry10.createParameterizedType(objectType25, jSType36);
        boolean boolean39 = parameterizedType38.isEnumElementType();
        com.google.javascript.rhino.jstype.FunctionType functionType40 = parameterizedType38.getOwnerFunction();
        jSTypeRegistry2.registerPropertyOnType("{proxy:{proxy:{1568596850}}}", (com.google.javascript.rhino.jstype.JSType) parameterizedType38);
        parameterizedType38.clearCachedValues();
        boolean boolean43 = parameterizedType38.isNoType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType44 = parameterizedType38.toMaybeEnumElementType();
        boolean boolean45 = parameterizedType38.isInterface();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType46 = parameterizedType38.toMaybeParameterizedType();
        com.google.javascript.rhino.jstype.FunctionType functionType47 = parameterizedType46.getOwnerFunction();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType24 and parameterizedType46.", jSType24.equals(parameterizedType46) == parameterizedType46.equals(jSType24));
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test648");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = null;
        boolean boolean36 = jSTypeRegistry33.resetImplicitPrototype(jSType34, objectType35);
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37, true);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType41 = null;
        boolean boolean42 = jSTypeRegistry39.resetImplicitPrototype(jSType40, objectType41);
        com.google.javascript.rhino.jstype.JSType jSType47 = jSTypeRegistry39.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = jSType47.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49, true);
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType53 = null;
        boolean boolean54 = jSTypeRegistry51.resetImplicitPrototype(jSType52, objectType53);
        com.google.javascript.rhino.jstype.JSType jSType59 = jSTypeRegistry51.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType60 = jSType59.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType61 = jSTypeRegistry33.createParameterizedType(objectType48, jSType59);
        java.util.Set set62 = parameterizedType61.getOwnPropertyNames();
        boolean boolean63 = parameterizedType30.differsFrom((com.google.javascript.rhino.jstype.JSType) parameterizedType61);
        boolean boolean64 = parameterizedType61.matchesObjectContext();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test649");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType33 = parameterizedType30.getIndexType();
        java.lang.String str34 = parameterizedType30.toDebugHashCodeString();
        boolean boolean35 = parameterizedType30.isInterface();
        com.google.javascript.rhino.jstype.ObjectType objectType36 = parameterizedType30.getTypeOfThis();
        boolean boolean37 = parameterizedType30.isNoObjectType();
        boolean boolean38 = parameterizedType30.matchesObjectContext();
        boolean boolean40 = parameterizedType30.isPropertyTypeInferred("{proxy:{proxy:{2070335273}}}");
        com.google.javascript.rhino.jstype.ObjectType objectType42 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface((com.google.javascript.rhino.jstype.ObjectType) parameterizedType30, "function (): {proxy:{1662859276}}");
        com.google.javascript.rhino.jstype.JSType jSType43 = objectType42.collapseUnion();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and jSType43.", jSType16.equals(jSType43) == jSType43.equals(jSType16));
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test650");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.hasReferenceName();
        boolean boolean33 = parameterizedType30.hasAnyTemplateInternal();
        boolean boolean34 = parameterizedType30.isOrdinaryFunction();
        boolean boolean35 = parameterizedType30.isInstanceType();
        com.google.javascript.rhino.jstype.JSType jSType37 = parameterizedType30.getPropertyType("{proxy:{proxy:{628733757}}}");
        com.google.javascript.rhino.jstype.JSType jSType38 = parameterizedType30.collapseUnion();
        parameterizedType30.clearResolved();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test651");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable5 = jSTypeRegistry2.getTypesWithProperty("function (): {proxy:{1288677244}}");
        com.google.javascript.rhino.Node[] nodeArray11 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(52, nodeArray11, 49, 38);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(53, nodeArray11);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(1, nodeArray11);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node(46, nodeArray11, (int) (short) 1, 35);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean23 = node22.isFalse();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList27 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node26);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList31 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node30);
        java.lang.Cloneable[] cloneableArray32 = new java.lang.Cloneable[] { node22, node26, node30 };
        java.util.ArrayList<java.lang.Cloneable> cloneableList33 = new java.util.ArrayList<java.lang.Cloneable>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList33, cloneableArray32);
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition35 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str36 = stringPosition35.getItem();
        boolean boolean37 = cloneableList33.remove((java.lang.Object) str36);
        java.util.stream.Stream<java.lang.Cloneable> cloneableStream38 = cloneableList33.stream();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString((int) (byte) -1, "hi!");
        boolean boolean42 = cloneableList33.add((java.lang.Cloneable) node41);
        boolean boolean43 = node41.isFalse();
        java.lang.String str44 = node41.getSourceFileName();
        java.lang.Object obj46 = node41.getProp(4095);
        com.google.javascript.rhino.Node node47 = node41.cloneNode();
        node47.setSourceFileForTesting("{proxy:{proxy:{3292531}}}");
        node19.addChildrenToBack(node47);
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51, true);
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType55 = null;
        boolean boolean56 = jSTypeRegistry53.resetImplicitPrototype(jSType54, objectType55);
        com.google.javascript.rhino.ErrorReporter errorReporter57 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter57, true);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType61 = null;
        boolean boolean62 = jSTypeRegistry59.resetImplicitPrototype(jSType60, objectType61);
        com.google.javascript.rhino.jstype.JSType jSType67 = jSTypeRegistry59.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType68 = jSType67.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter69 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter69, true);
        com.google.javascript.rhino.jstype.JSType jSType72 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType73 = null;
        boolean boolean74 = jSTypeRegistry71.resetImplicitPrototype(jSType72, objectType73);
        com.google.javascript.rhino.jstype.JSType jSType79 = jSTypeRegistry71.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType80 = jSType79.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType81 = jSTypeRegistry53.createParameterizedType(objectType68, jSType79);
        java.util.Set set82 = parameterizedType81.getOwnPropertyNames();
        boolean boolean83 = parameterizedType81.isNoObjectType();
        boolean boolean84 = parameterizedType81.isAllType();
        boolean boolean85 = parameterizedType81.isEnumElementType();
        boolean boolean86 = parameterizedType81.isUnknownType();
        com.google.javascript.rhino.jstype.EnumType enumType87 = jSTypeRegistry2.createEnumType("{proxy:{proxy:{1528765838}}}", node47, (com.google.javascript.rhino.jstype.JSType) parameterizedType81);
        com.google.javascript.rhino.Node node89 = enumType87.getPropertyNode("function (): {proxy:{4456295}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType67 and parameterizedType81.", jSType67.equals(parameterizedType81) == parameterizedType81.equals(jSType67));
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test652");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = ternaryValue0.not();
        boolean boolean3 = ternaryValue0.toBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = ternaryValue0.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue5 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = ternaryValue5.not();
        boolean boolean8 = ternaryValue5.toBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = ternaryValue5.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = ternaryValue9.xor(ternaryValue10);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = ternaryValue0.or(ternaryValue10);
        java.lang.String str13 = ternaryValue0.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue14 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = ternaryValue14.not();
        boolean boolean17 = ternaryValue14.toBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue18 = ternaryValue14.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue19 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue20 = ternaryValue18.xor(ternaryValue19);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue21 = ternaryValue0.and(ternaryValue19);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = null;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue23 = ternaryValue21.and(ternaryValue22);
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24, true);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType28 = null;
        boolean boolean29 = jSTypeRegistry26.resetImplicitPrototype(jSType27, objectType28);
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry26.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSType34.dereference();
        boolean boolean36 = objectType35.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable37 = objectType35.getCtorImplementedInterfaces();
        boolean boolean38 = objectType35.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, true);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType43 = null;
        boolean boolean44 = jSTypeRegistry41.resetImplicitPrototype(jSType42, objectType43);
        com.google.javascript.rhino.jstype.JSType jSType49 = jSTypeRegistry41.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType50 = jSType49.dereference();
        boolean boolean51 = objectType50.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = objectType50.getCtorImplementedInterfaces();
        boolean boolean53 = objectType50.isNativeObjectType();
        boolean boolean54 = objectType35.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType50);
        boolean boolean56 = objectType35.hasProperty("hi!");
        com.google.javascript.rhino.jstype.JSType jSType57 = objectType35.autobox();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope58 = objectType35.getParentScope();
        com.google.javascript.rhino.jstype.FunctionType functionType59 = objectType35.getOwnerFunction();
        com.google.javascript.rhino.jstype.ObjectType objectType60 = objectType35.dereference();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot62 = objectType60.getSlot("unknown");
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63, true);
        com.google.javascript.rhino.jstype.JSType jSType66 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType67 = null;
        boolean boolean68 = jSTypeRegistry65.resetImplicitPrototype(jSType66, objectType67);
        com.google.javascript.rhino.ErrorReporter errorReporter69 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter69, true);
        com.google.javascript.rhino.jstype.JSType jSType72 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType73 = null;
        boolean boolean74 = jSTypeRegistry71.resetImplicitPrototype(jSType72, objectType73);
        com.google.javascript.rhino.jstype.JSType jSType79 = jSTypeRegistry71.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType80 = jSType79.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter81 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry83 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter81, true);
        com.google.javascript.rhino.jstype.JSType jSType84 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType85 = null;
        boolean boolean86 = jSTypeRegistry83.resetImplicitPrototype(jSType84, objectType85);
        com.google.javascript.rhino.jstype.JSType jSType91 = jSTypeRegistry83.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType92 = jSType91.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType93 = jSTypeRegistry65.createParameterizedType(objectType80, jSType91);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue94 = objectType60.testForEquality((com.google.javascript.rhino.jstype.JSType) parameterizedType93);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue95 = ternaryValue23.or(ternaryValue94);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType34 and parameterizedType93.", jSType34.equals(parameterizedType93) == parameterizedType93.equals(jSType34));
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test653");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        boolean boolean38 = jSTypeRegistry35.resetImplicitPrototype(jSType36, objectType37);
        com.google.javascript.rhino.jstype.JSType jSType43 = jSTypeRegistry35.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = jSType43.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSType43.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType46 = jSType43.restrictByNotNullOrUndefined();
        boolean boolean47 = parameterizedType30.canAssignTo(jSType43);
        boolean boolean49 = parameterizedType30.isPropertyTypeInferred("");
        boolean boolean50 = parameterizedType30.isInterface();
        int int51 = parameterizedType30.getPropertiesCount();
        boolean boolean52 = parameterizedType30.isArrayType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType53 = parameterizedType30.toMaybeParameterizedType();
        boolean boolean54 = parameterizedType30.isUnknownType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test654");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        jSTypeRegistry2.setLastGeneration(false);
        boolean boolean9 = jSTypeRegistry2.hasNamespace("Unknown class name");
        jSTypeRegistry2.forwardDeclareType("(|function (): )");
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        boolean boolean17 = jSTypeRegistry14.resetImplicitPrototype(jSType15, objectType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, true);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        boolean boolean35 = jSTypeRegistry32.resetImplicitPrototype(jSType33, objectType34);
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry32.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType41 = jSType40.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType42 = jSTypeRegistry14.createParameterizedType(objectType29, jSType40);
        java.util.Set set43 = parameterizedType42.getOwnPropertyNames();
        boolean boolean44 = parameterizedType42.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType45 = parameterizedType42.getIndexType();
        java.lang.String str46 = parameterizedType42.toDebugHashCodeString();
        boolean boolean47 = parameterizedType42.isInterface();
        java.lang.String str48 = parameterizedType42.getDisplayName();
        boolean boolean50 = parameterizedType42.isPropertyTypeInferred("");
        com.google.javascript.rhino.jstype.JSType jSType55 = jSTypeRegistry2.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) parameterizedType42, "function (): {proxy:{96813562}}", "{proxy:{proxy:{1106849485}}}", 12, 44);
        jSTypeRegistry2.clearNamedTypes();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType28 and parameterizedType42.", jSType28.equals(parameterizedType42) == parameterizedType42.equals(jSType28));
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test655");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        boolean boolean3 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        boolean boolean18 = objectType17.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable19 = objectType17.getCtorImplementedInterfaces();
        boolean boolean20 = objectType17.isNativeObjectType();
        jSTypeRegistry2.registerPropertyOnType("", (com.google.javascript.rhino.jstype.JSType) objectType17);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        boolean boolean27 = jSTypeRegistry24.resetImplicitPrototype(jSType25, objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = null;
        boolean boolean33 = jSTypeRegistry30.resetImplicitPrototype(jSType31, objectType32);
        com.google.javascript.rhino.jstype.JSType jSType38 = jSTypeRegistry30.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType39 = jSType38.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        boolean boolean45 = jSTypeRegistry42.resetImplicitPrototype(jSType43, objectType44);
        com.google.javascript.rhino.jstype.JSType jSType50 = jSTypeRegistry42.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType51 = jSType50.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType52 = jSTypeRegistry24.createParameterizedType(objectType39, jSType50);
        java.util.Set set53 = parameterizedType52.getOwnPropertyNames();
        boolean boolean54 = parameterizedType52.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, true);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType59 = null;
        boolean boolean60 = jSTypeRegistry57.resetImplicitPrototype(jSType58, objectType59);
        com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry57.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType66 = jSType65.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType67 = jSType65.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType68 = jSType65.restrictByNotNullOrUndefined();
        boolean boolean69 = parameterizedType52.canAssignTo(jSType65);
        boolean boolean71 = parameterizedType52.isPropertyTypeInferred("");
        com.google.javascript.rhino.jstype.JSType jSType76 = jSTypeRegistry2.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) parameterizedType52, "hi!", "Named type with empty name component", 40, 39);
        boolean boolean78 = parameterizedType52.isPropertyTypeDeclared("unknown");
        boolean boolean79 = parameterizedType52.isOrdinaryFunction();
        com.google.javascript.rhino.JSDocInfo jSDocInfo81 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean82 = jSDocInfo81.isInterface();
        java.lang.String str83 = jSDocInfo81.getOriginalCommentString();
        boolean boolean84 = jSDocInfo81.hasEnumParameterType();
        boolean boolean85 = jSDocInfo81.hasModifies();
        boolean boolean86 = jSDocInfo81.isDefine();
        java.lang.String str87 = jSDocInfo81.getSourceName();
        boolean boolean88 = jSDocInfo81.isNoAlias();
        boolean boolean89 = jSDocInfo81.isExterns();
        parameterizedType52.setPropertyJSDocInfo("{proxy:{proxy:{724324866}}}", jSDocInfo81);
        java.lang.String str91 = jSDocInfo81.getFileOverview();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType52.", jSType16.equals(parameterizedType52) == parameterizedType52.equals(jSType16));
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test656");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        jSTypeRegistry2.setLastGeneration(false);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        boolean boolean13 = jSTypeRegistry10.resetImplicitPrototype(jSType11, objectType12);
        com.google.javascript.rhino.jstype.JSType jSType18 = jSTypeRegistry10.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = jSType18.dereference();
        boolean boolean20 = objectType19.isFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType21 = jSTypeRegistry2.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType) objectType19);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = jSTypeRegistry2.getEachReferenceTypeWithProperty("({proxy:{proxy:{1874555938}}})");
        com.google.javascript.rhino.ErrorReporter errorReporter24 = jSTypeRegistry2.getErrorReporter();
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25, true);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        boolean boolean30 = jSTypeRegistry27.resetImplicitPrototype(jSType28, objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = null;
        boolean boolean36 = jSTypeRegistry33.resetImplicitPrototype(jSType34, objectType35);
        com.google.javascript.rhino.jstype.JSType jSType41 = jSTypeRegistry33.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType42 = jSType41.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = null;
        boolean boolean48 = jSTypeRegistry45.resetImplicitPrototype(jSType46, objectType47);
        com.google.javascript.rhino.jstype.JSType jSType53 = jSTypeRegistry45.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType54 = jSType53.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType55 = jSTypeRegistry27.createParameterizedType(objectType42, jSType53);
        java.util.Set set56 = parameterizedType55.getOwnPropertyNames();
        boolean boolean57 = parameterizedType55.hasReferenceName();
        boolean boolean58 = parameterizedType55.hasAnyTemplateInternal();
        boolean boolean59 = parameterizedType55.isOrdinaryFunction();
        boolean boolean60 = parameterizedType55.isInstanceType();
        com.google.javascript.rhino.jstype.JSType jSType62 = parameterizedType55.getPropertyType("{proxy:{proxy:{628733757}}}");
        boolean boolean63 = parameterizedType55.isFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType65 = parameterizedType55.findPropertyType("function (): {proxy:{1288677244}}");
        boolean boolean66 = parameterizedType55.hasReferenceName();
        boolean boolean67 = parameterizedType55.canBeCalled();
        boolean boolean69 = jSTypeRegistry2.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) parameterizedType55, "function (): {proxy:{333019360}}");
        com.google.javascript.rhino.ErrorReporter errorReporter70 = jSTypeRegistry2.getErrorReporter();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType18 and parameterizedType55.", jSType18.equals(parameterizedType55) == parameterizedType55.equals(jSType18));
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test657");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean3 = node2.isTrue();
        boolean boolean4 = node2.hasOneChild();
        boolean boolean5 = node2.isVarArgs();
        int int6 = node2.getType();
        boolean boolean7 = node2.isNull();
        com.google.javascript.rhino.Node node9 = node2.getAncestor(40);
        boolean boolean10 = node2.isSetterDef();
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, true);
        boolean boolean14 = jSTypeRegistry13.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.ObjectType objectType15 = jSTypeRegistry13.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        boolean boolean22 = jSTypeRegistry19.resetImplicitPrototype(jSType20, objectType21);
        com.google.javascript.rhino.jstype.JSType jSType27 = jSTypeRegistry19.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType28 = jSType27.dereference();
        boolean boolean29 = objectType28.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable30 = objectType28.getCtorImplementedInterfaces();
        boolean boolean31 = objectType28.isNativeObjectType();
        jSTypeRegistry13.registerPropertyOnType("", (com.google.javascript.rhino.jstype.JSType) objectType28);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        boolean boolean38 = jSTypeRegistry35.resetImplicitPrototype(jSType36, objectType37);
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, true);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType43 = null;
        boolean boolean44 = jSTypeRegistry41.resetImplicitPrototype(jSType42, objectType43);
        com.google.javascript.rhino.jstype.JSType jSType49 = jSTypeRegistry41.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType50 = jSType49.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51, true);
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType55 = null;
        boolean boolean56 = jSTypeRegistry53.resetImplicitPrototype(jSType54, objectType55);
        com.google.javascript.rhino.jstype.JSType jSType61 = jSTypeRegistry53.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType62 = jSType61.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType63 = jSTypeRegistry35.createParameterizedType(objectType50, jSType61);
        java.util.Set set64 = parameterizedType63.getOwnPropertyNames();
        boolean boolean65 = parameterizedType63.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry68 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter66, true);
        com.google.javascript.rhino.jstype.JSType jSType69 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType70 = null;
        boolean boolean71 = jSTypeRegistry68.resetImplicitPrototype(jSType69, objectType70);
        com.google.javascript.rhino.jstype.JSType jSType76 = jSTypeRegistry68.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType77 = jSType76.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType78 = jSType76.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType79 = jSType76.restrictByNotNullOrUndefined();
        boolean boolean80 = parameterizedType63.canAssignTo(jSType76);
        boolean boolean82 = parameterizedType63.isPropertyTypeInferred("");
        com.google.javascript.rhino.jstype.JSType jSType87 = jSTypeRegistry13.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) parameterizedType63, "hi!", "Named type with empty name component", 40, 39);
        com.google.javascript.rhino.jstype.JSType jSType88 = parameterizedType63.getParameterType();
        boolean boolean89 = parameterizedType63.isNoObjectType();
        boolean boolean90 = parameterizedType63.matchesObjectContext();
        boolean boolean91 = parameterizedType63.isInstanceType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo93 = parameterizedType63.getOwnPropertyJSDocInfo("{proxy:{proxy:{437279302}}}");
        boolean boolean94 = parameterizedType63.isNullType();
        node2.setJSType((com.google.javascript.rhino.jstype.JSType) parameterizedType63);
        boolean boolean96 = node2.isExprResult();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType27 and parameterizedType63.", jSType27.equals(parameterizedType63) == parameterizedType63.equals(jSType27));
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test658");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean11 = node10.isFalse();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean15 = node14.isTrue();
        boolean boolean16 = node14.hasOneChild();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean20 = node19.isTrue();
        boolean boolean21 = node19.isBreak();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (byte) 1, node7, node10, node14, node19, (int) (byte) 1, 4095);
        boolean boolean25 = node7.isDelProp();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        boolean boolean31 = jSTypeRegistry28.resetImplicitPrototype(jSType29, objectType30);
        com.google.javascript.rhino.jstype.JSType jSType36 = jSTypeRegistry28.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType37 = jSType36.dereference();
        boolean boolean38 = objectType37.isFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType39 = jSTypeRegistry2.createObjectType("hi!", node7, objectType37);
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        boolean boolean45 = jSTypeRegistry42.resetImplicitPrototype(jSType43, objectType44);
        com.google.javascript.rhino.jstype.JSType jSType50 = jSTypeRegistry42.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType51 = jSType50.dereference();
        boolean boolean52 = objectType51.isRegexpType();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection53 = jSTypeRegistry2.getDirectImplementors(objectType51);
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, true);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType59 = null;
        boolean boolean60 = jSTypeRegistry57.resetImplicitPrototype(jSType58, objectType59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61, true);
        com.google.javascript.rhino.jstype.JSType jSType64 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType65 = null;
        boolean boolean66 = jSTypeRegistry63.resetImplicitPrototype(jSType64, objectType65);
        com.google.javascript.rhino.jstype.JSType jSType71 = jSTypeRegistry63.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType72 = jSType71.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter73 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry75 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter73, true);
        com.google.javascript.rhino.jstype.JSType jSType76 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType77 = null;
        boolean boolean78 = jSTypeRegistry75.resetImplicitPrototype(jSType76, objectType77);
        com.google.javascript.rhino.jstype.JSType jSType83 = jSTypeRegistry75.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType84 = jSType83.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType85 = jSTypeRegistry57.createParameterizedType(objectType72, jSType83);
        java.util.Set set86 = parameterizedType85.getOwnPropertyNames();
        boolean boolean87 = parameterizedType85.hasReferenceName();
        boolean boolean88 = parameterizedType85.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.JSType jSType90 = parameterizedType85.findPropertyType("");
        jSTypeRegistry2.registerPropertyOnType("Unknown class name", (com.google.javascript.rhino.jstype.JSType) parameterizedType85);
        boolean boolean93 = parameterizedType85.isPropertyInExterns("{proxy:{proxy:{1168420562}}}");
        com.google.javascript.rhino.jstype.JSType jSType94 = parameterizedType85.getIndexType();
        com.google.javascript.rhino.jstype.JSType jSType96 = parameterizedType85.findPropertyType("function (): {proxy:{1977777103}}");
        com.google.javascript.rhino.jstype.JSType jSType97 = null;
        boolean boolean98 = jSType96.isEquivalentTo(jSType97);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType36 and parameterizedType85.", jSType36.equals(parameterizedType85) == parameterizedType85.equals(jSType36));
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test659");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType33 = parameterizedType30.getIndexType();
        java.lang.String str34 = parameterizedType30.toDebugHashCodeString();
        boolean boolean35 = parameterizedType30.isInterface();
        com.google.javascript.rhino.Node node36 = parameterizedType30.getRootNode();
        boolean boolean38 = parameterizedType30.removeProperty("function (): {proxy:{1553899974}}");
        boolean boolean39 = parameterizedType30.isInterface();
        boolean boolean40 = parameterizedType30.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.ObjectType objectType41 = parameterizedType30.toObjectType();
        com.google.javascript.rhino.jstype.FunctionType functionType42 = parameterizedType30.toMaybeFunctionType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test660");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable31 = parameterizedType30.getCtorExtendedInterfaces();
        com.google.javascript.rhino.JSDocInfo jSDocInfo32 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean33 = jSDocInfo32.isInterface();
        com.google.javascript.rhino.JSDocInfo jSDocInfo34 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean35 = jSDocInfo34.isInterface();
        java.lang.String str36 = jSDocInfo34.getOriginalCommentString();
        boolean boolean37 = jSDocInfo34.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo jSDocInfo38 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean39 = jSDocInfo38.isInterface();
        jSDocInfo38.setLicense("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo42 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean43 = jSDocInfo42.isInterface();
        java.lang.String str44 = jSDocInfo42.getOriginalCommentString();
        boolean boolean45 = jSDocInfo42.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo jSDocInfo46 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean47 = jSDocInfo46.isInterface();
        boolean boolean48 = jSDocInfo46.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression49 = jSDocInfo46.getEnumParameterType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean51 = jSDocInfo50.isInterface();
        jSDocInfo50.setLicense("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo54 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean55 = jSDocInfo54.isInterface();
        boolean boolean56 = jSDocInfo54.hasType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo57 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean58 = jSDocInfo57.isInterface();
        boolean boolean59 = jSDocInfo57.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression60 = jSDocInfo57.getEnumParameterType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo61 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean62 = jSDocInfo61.isInterface();
        boolean boolean63 = jSDocInfo61.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression64 = jSDocInfo61.getEnumParameterType();
        boolean boolean65 = jSDocInfo61.containsDeclaration();
        com.google.javascript.rhino.JSDocInfo jSDocInfo66 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean67 = jSDocInfo66.isInterface();
        java.lang.String str68 = jSDocInfo66.getOriginalCommentString();
        boolean boolean69 = jSDocInfo66.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo jSDocInfo70 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean71 = jSDocInfo70.isInterface();
        java.lang.String str72 = jSDocInfo70.getOriginalCommentString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression73 = jSDocInfo70.getType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo74 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean75 = jSDocInfo74.isInterface();
        jSDocInfo74.setLicense("");
        boolean boolean78 = jSDocInfo74.isNoAlias();
        com.google.javascript.rhino.JSDocInfo jSDocInfo79 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean80 = jSDocInfo79.isInterface();
        jSDocInfo79.setLicense("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo83 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean84 = jSDocInfo83.isInterface();
        boolean boolean85 = jSDocInfo83.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression86 = jSDocInfo83.getEnumParameterType();
        boolean boolean87 = jSDocInfo83.containsDeclaration();
        com.google.javascript.rhino.JSDocInfo[] jSDocInfoArray88 = new com.google.javascript.rhino.JSDocInfo[] { jSDocInfo79, jSDocInfo83 };
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList89 = com.google.common.collect.ImmutableList.of(jSDocInfo32, jSDocInfo34, jSDocInfo38, jSDocInfo42, jSDocInfo46, jSDocInfo50, jSDocInfo54, jSDocInfo57, jSDocInfo61, jSDocInfo66, jSDocInfo70, jSDocInfo74, jSDocInfoArray88);
        parameterizedType30.setJSDocInfo(jSDocInfo70);
        int int91 = parameterizedType30.getPropertiesCount();
        boolean boolean93 = parameterizedType30.removeProperty("{proxy:{proxy:{136656746}}}");
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType94 = parameterizedType30.toMaybeParameterizedType();
        boolean boolean95 = parameterizedType30.hasAnyTemplate();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test661");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        boolean boolean3 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = jSTypeRegistry2.getErrorReporter();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        boolean boolean17 = jSTypeRegistry14.resetImplicitPrototype(jSType15, objectType16);
        com.google.javascript.rhino.jstype.JSType jSType22 = jSTypeRegistry14.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType23 = jSType22.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24, true);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType28 = null;
        boolean boolean29 = jSTypeRegistry26.resetImplicitPrototype(jSType27, objectType28);
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry26.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSType34.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType36 = jSTypeRegistry8.createParameterizedType(objectType23, jSType34);
        java.util.Set set37 = parameterizedType36.getOwnPropertyNames();
        boolean boolean38 = parameterizedType36.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, true);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType43 = null;
        boolean boolean44 = jSTypeRegistry41.resetImplicitPrototype(jSType42, objectType43);
        com.google.javascript.rhino.jstype.JSType jSType49 = jSTypeRegistry41.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType50 = jSType49.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType51 = jSType49.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType52 = jSType49.restrictByNotNullOrUndefined();
        boolean boolean53 = parameterizedType36.canAssignTo(jSType49);
        boolean boolean55 = parameterizedType36.isPropertyTypeInferred("");
        boolean boolean56 = parameterizedType36.isResolved();
        boolean boolean57 = parameterizedType36.isInstanceType();
        boolean boolean58 = parameterizedType36.canBeCalled();
        java.util.Set<java.lang.String> strSet59 = parameterizedType36.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.ObjectType objectType60 = parameterizedType36.getParentScope();
        jSTypeRegistry2.resolveTypesInScope((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) parameterizedType36);
        jSTypeRegistry2.identifyNonNullableName("function (): {proxy:{88894895}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType22 and parameterizedType36.", jSType22.equals(parameterizedType36) == parameterizedType36.equals(jSType22));
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test662");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        boolean boolean38 = jSTypeRegistry35.resetImplicitPrototype(jSType36, objectType37);
        com.google.javascript.rhino.jstype.JSType jSType43 = jSTypeRegistry35.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = jSType43.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSType43.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType46 = jSType43.restrictByNotNullOrUndefined();
        boolean boolean47 = parameterizedType30.canAssignTo(jSType43);
        boolean boolean49 = parameterizedType30.isPropertyTypeInferred("");
        boolean boolean50 = parameterizedType30.isResolved();
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType30.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType53 = parameterizedType30.findPropertyType("{proxy:{proxy:{649633010}}}");
        boolean boolean54 = parameterizedType30.isNominalType();
        boolean boolean55 = parameterizedType30.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType56 = parameterizedType30.getIndexType();
        com.google.javascript.rhino.ErrorReporter errorReporter57 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter57, true);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType61 = null;
        boolean boolean62 = jSTypeRegistry59.resetImplicitPrototype(jSType60, objectType61);
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63, true);
        com.google.javascript.rhino.jstype.JSType jSType66 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType67 = null;
        boolean boolean68 = jSTypeRegistry65.resetImplicitPrototype(jSType66, objectType67);
        com.google.javascript.rhino.jstype.JSType jSType73 = jSTypeRegistry65.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType74 = jSType73.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter75 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter75, true);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType79 = null;
        boolean boolean80 = jSTypeRegistry77.resetImplicitPrototype(jSType78, objectType79);
        com.google.javascript.rhino.jstype.JSType jSType85 = jSTypeRegistry77.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType86 = jSType85.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType87 = jSTypeRegistry59.createParameterizedType(objectType74, jSType85);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable88 = parameterizedType87.getCtorExtendedInterfaces();
        boolean boolean89 = parameterizedType87.isNumberValueType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue90 = parameterizedType30.testForEquality((com.google.javascript.rhino.jstype.JSType) parameterizedType87);
        boolean boolean91 = parameterizedType87.isNullable();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test663");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        boolean boolean38 = jSTypeRegistry35.resetImplicitPrototype(jSType36, objectType37);
        com.google.javascript.rhino.jstype.JSType jSType43 = jSTypeRegistry35.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = jSType43.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSType43.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType46 = jSType43.restrictByNotNullOrUndefined();
        boolean boolean47 = parameterizedType30.canAssignTo(jSType43);
        boolean boolean49 = parameterizedType30.isPropertyTypeInferred("");
        boolean boolean50 = parameterizedType30.isResolved();
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType30.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, true);
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType56 = null;
        boolean boolean57 = jSTypeRegistry54.resetImplicitPrototype(jSType55, objectType56);
        com.google.javascript.rhino.jstype.JSType jSType62 = jSTypeRegistry54.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType63 = jSType62.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType64 = jSType62.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType65 = jSType62.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType66 = jSType65.toMaybeEnumElementType();
        boolean boolean67 = parameterizedType30.isEquivalentTo(jSType65);
        boolean boolean68 = parameterizedType30.isStringObjectType();
        boolean boolean69 = parameterizedType30.hasDisplayName();
        com.google.javascript.rhino.jstype.FunctionType functionType70 = parameterizedType30.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType72 = parameterizedType30.getPropertyType("{proxy:{proxy:{1975738059}}}");
        boolean boolean73 = jSType72.isAllType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test664");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(10.0d, (int) (byte) 1, 43);
        boolean boolean4 = node3.isBreak();
        com.google.javascript.rhino.InputId inputId5 = node3.getInputId();
        double double6 = node3.getDouble();
        int int7 = node3.getChildCount();
        node3.setLineno(0);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(43, 12, (int) (short) -1);
        node13.putIntProp(39, 3);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node13);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(43, 12, (int) (short) -1);
        boolean boolean22 = node21.isScript();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean26 = node25.isTrue();
        boolean boolean27 = node25.isBreak();
        boolean boolean28 = node25.isNot();
        node21.addChildrenToBack(node25);
        boolean boolean30 = node25.isDo();
        boolean boolean31 = node25.isCatch();
        node25.detachChildren();
        com.google.javascript.jscomp.CodingConvention.Bind bind33 = new com.google.javascript.jscomp.CodingConvention.Bind(node3, node13, node25);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean37 = node36.isTrue();
        boolean boolean38 = node36.isOr();
        boolean boolean39 = node36.isSetterDef();
        node36.setSourceFileForTesting("{proxy:{proxy:{1763454178}}}");
        node36.setLineno((int) 'a');
        boolean boolean44 = node36.isAssignAdd();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable45 = node36.getAncestors();
        boolean boolean46 = node36.isLocalResultCall();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node36);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test665");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType33 = parameterizedType30.getIndexType();
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType38 = null;
        boolean boolean39 = jSTypeRegistry36.resetImplicitPrototype(jSType37, objectType38);
        com.google.javascript.rhino.jstype.JSType jSType44 = jSTypeRegistry36.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSType44.dereference();
        boolean boolean46 = objectType45.isRegexpType();
        boolean boolean48 = objectType45.isPropertyTypeInferred("hi!");
        boolean boolean49 = parameterizedType30.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) objectType45);
        java.lang.String str50 = parameterizedType30.toDebugHashCodeString();
        boolean boolean52 = parameterizedType30.hasOwnProperty("");
        boolean boolean53 = parameterizedType30.isNullType();
        boolean boolean55 = parameterizedType30.isPropertyTypeDeclared("{proxy:{proxy:{1874555938}}}");
        com.google.javascript.rhino.JSDocInfo jSDocInfo56 = parameterizedType30.getJSDocInfo();
        boolean boolean57 = parameterizedType30.isNumberObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter58 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter58, true);
        boolean boolean61 = jSTypeRegistry60.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.ObjectType objectType62 = jSTypeRegistry60.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.JSType jSType63 = objectType62.collapseUnion();
        boolean boolean64 = objectType62.isTemplateType();
        com.google.javascript.rhino.jstype.JSType jSType65 = parameterizedType30.getLeastSupertype((com.google.javascript.rhino.jstype.JSType) objectType62);
        boolean boolean66 = objectType62.isTemplateType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test666");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean3 = node2.isFalse();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList7 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node6);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList11 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node10);
        java.lang.Cloneable[] cloneableArray12 = new java.lang.Cloneable[] { node2, node6, node10 };
        java.util.ArrayList<java.lang.Cloneable> cloneableList13 = new java.util.ArrayList<java.lang.Cloneable>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList13, cloneableArray12);
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition15 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str16 = stringPosition15.getItem();
        boolean boolean17 = cloneableList13.remove((java.lang.Object) str16);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean24 = node23.isFalse();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean28 = node27.isFalse();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean32 = node31.isTrue();
        boolean boolean33 = node31.isBreak();
        java.lang.Cloneable[] cloneableArray34 = new java.lang.Cloneable[] { cloneableList13, node20, node23, node27, node31 };
        java.util.ArrayList<java.lang.Cloneable> cloneableList35 = new java.util.ArrayList<java.lang.Cloneable>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList35, cloneableArray34);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean40 = cloneableList35.add((java.lang.Cloneable) node39);
        java.util.ListIterator<java.lang.Cloneable> cloneableItor41 = cloneableList35.listIterator();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition42 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int43 = namePosition42.getStartLine();
        int int44 = namePosition42.getStartLine();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition45 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int46 = namePosition45.getStartLine();
        int int47 = namePosition45.getPositionOnEndLine();
        int int48 = namePosition45.getPositionOnStartLine();
        int int49 = namePosition45.getPositionOnEndLine();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.NamePosition> namePositionList50 = com.google.common.collect.ImmutableList.of(namePosition42, namePosition45);
        boolean boolean51 = cloneableList35.contains((java.lang.Object) namePosition42);
        java.util.Iterator<java.lang.Cloneable> cloneableItor52 = cloneableList35.iterator();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType57 = null;
        boolean boolean58 = jSTypeRegistry55.resetImplicitPrototype(jSType56, objectType57);
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        com.google.javascript.rhino.jstype.JSType jSType62 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType63 = null;
        boolean boolean64 = jSTypeRegistry61.resetImplicitPrototype(jSType62, objectType63);
        com.google.javascript.rhino.jstype.JSType jSType69 = jSTypeRegistry61.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType70 = jSType69.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter71 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter71, true);
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType75 = null;
        boolean boolean76 = jSTypeRegistry73.resetImplicitPrototype(jSType74, objectType75);
        com.google.javascript.rhino.jstype.JSType jSType81 = jSTypeRegistry73.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType82 = jSType81.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType83 = jSTypeRegistry55.createParameterizedType(objectType70, jSType81);
        java.util.Set set84 = parameterizedType83.getOwnPropertyNames();
        boolean boolean85 = parameterizedType83.hasReferenceName();
        boolean boolean86 = parameterizedType83.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.JSType jSType88 = parameterizedType83.findPropertyType("");
        java.lang.String str89 = parameterizedType83.getReferenceName();
        com.google.javascript.rhino.jstype.UnionType unionType90 = parameterizedType83.toMaybeUnionType();
        boolean boolean92 = parameterizedType83.hasOwnProperty("function (): {proxy:{1262905525}}");
        com.google.javascript.rhino.JSDocInfo jSDocInfo93 = parameterizedType83.getJSDocInfo();
        com.google.javascript.rhino.jstype.JSType jSType95 = parameterizedType83.findPropertyType("{proxy:{proxy:{1317500836}}}");
        boolean boolean96 = parameterizedType83.isDateType();
        boolean boolean97 = cloneableList35.remove((java.lang.Object) parameterizedType83);
        java.lang.Object[] objArray98 = cloneableList35.toArray();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType69 and parameterizedType83.", jSType69.equals(parameterizedType83) == parameterizedType83.equals(jSType69));
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test667");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean8 = node7.isFalse();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean12 = node11.isTrue();
        boolean boolean13 = node11.hasOneChild();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean17 = node16.isTrue();
        boolean boolean18 = node16.isBreak();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) (byte) 1, node4, node7, node11, node16, (int) (byte) 1, 4095);
        node21.detachChildren();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (short) 100, node21);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean27 = node26.isTrue();
        boolean boolean28 = node26.hasOneChild();
        boolean boolean29 = node26.isVarArgs();
        node26.removeProp(48);
        com.google.javascript.rhino.Node node32 = node23.clonePropsFrom(node26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node34 = node32.getChildAtIndex(35);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test668");
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.ObjectType> objectTypeBuilder0 = com.google.common.collect.ImmutableList.builder();
        com.google.javascript.rhino.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter1, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        boolean boolean6 = jSTypeRegistry3.resetImplicitPrototype(jSType4, objectType5);
        com.google.javascript.rhino.jstype.JSType jSType11 = jSTypeRegistry3.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = jSType11.dereference();
        boolean boolean13 = objectType12.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable14 = objectType12.getCtorImplementedInterfaces();
        boolean boolean15 = objectType12.isNativeObjectType();
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.ObjectType> objectTypeBuilder16 = objectTypeBuilder0.add(objectType12);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        boolean boolean22 = jSTypeRegistry19.resetImplicitPrototype(jSType20, objectType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = null;
        boolean boolean28 = jSTypeRegistry25.resetImplicitPrototype(jSType26, objectType27);
        com.google.javascript.rhino.jstype.JSType jSType33 = jSTypeRegistry25.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = jSType33.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35, true);
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType39 = null;
        boolean boolean40 = jSTypeRegistry37.resetImplicitPrototype(jSType38, objectType39);
        com.google.javascript.rhino.jstype.JSType jSType45 = jSTypeRegistry37.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = jSType45.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType47 = jSTypeRegistry19.createParameterizedType(objectType34, jSType45);
        java.util.Set set48 = parameterizedType47.getOwnPropertyNames();
        boolean boolean49 = parameterizedType47.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType50 = parameterizedType47.getIndexType();
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51, true);
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType55 = null;
        boolean boolean56 = jSTypeRegistry53.resetImplicitPrototype(jSType54, objectType55);
        com.google.javascript.rhino.jstype.JSType jSType61 = jSTypeRegistry53.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType62 = jSType61.dereference();
        boolean boolean63 = objectType62.isRegexpType();
        boolean boolean65 = objectType62.isPropertyTypeInferred("hi!");
        boolean boolean66 = parameterizedType47.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) objectType62);
        java.lang.String str67 = parameterizedType47.toDebugHashCodeString();
        boolean boolean69 = parameterizedType47.hasOwnProperty("");
        boolean boolean70 = parameterizedType47.isNullType();
        boolean boolean72 = parameterizedType47.isPropertyTypeDeclared("{proxy:{proxy:{1874555938}}}");
        boolean boolean73 = parameterizedType47.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType.Property property75 = parameterizedType47.getOwnSlot("JSDocInfo");
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.ObjectType> objectTypeBuilder76 = objectTypeBuilder0.add((com.google.javascript.rhino.jstype.ObjectType) parameterizedType47);
        com.google.javascript.rhino.jstype.JSType jSType77 = parameterizedType47.restrictByNotNullOrUndefined();
        boolean boolean78 = parameterizedType47.isEmptyType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType11 and parameterizedType47.", jSType11.equals(parameterizedType47) == parameterizedType47.equals(jSType11));
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test669");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        boolean boolean3 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        jSTypeRegistry2.clearTemplateTypeNames();
        boolean boolean6 = jSTypeRegistry2.hasNamespace("function (): {proxy:{685828741}}");
        boolean boolean7 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList12 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node11);
        boolean boolean13 = node11.isFalse();
        node11.setWasEmptyNode(false);
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        boolean boolean21 = jSTypeRegistry18.resetImplicitPrototype(jSType19, objectType20);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        boolean boolean27 = jSTypeRegistry24.resetImplicitPrototype(jSType25, objectType26);
        com.google.javascript.rhino.jstype.JSType jSType32 = jSTypeRegistry24.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType33 = jSType32.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType38 = null;
        boolean boolean39 = jSTypeRegistry36.resetImplicitPrototype(jSType37, objectType38);
        com.google.javascript.rhino.jstype.JSType jSType44 = jSTypeRegistry36.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSType44.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType46 = jSTypeRegistry18.createParameterizedType(objectType33, jSType44);
        java.util.Set set47 = parameterizedType46.getOwnPropertyNames();
        boolean boolean48 = parameterizedType46.hasReferenceName();
        boolean boolean49 = parameterizedType46.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.JSType jSType51 = parameterizedType46.findPropertyType("");
        java.lang.String str52 = parameterizedType46.getReferenceName();
        com.google.javascript.rhino.jstype.UnionType unionType53 = parameterizedType46.toMaybeUnionType();
        boolean boolean55 = parameterizedType46.hasOwnProperty("function (): {proxy:{1262905525}}");
        com.google.javascript.rhino.JSDocInfo jSDocInfo56 = parameterizedType46.getJSDocInfo();
        boolean boolean58 = parameterizedType46.isPropertyTypeDeclared("{proxy:{proxy:{1943266088}}}");
        int int59 = parameterizedType46.getPropertiesCount();
        int int60 = parameterizedType46.getPropertiesCount();
        com.google.javascript.rhino.jstype.EnumType enumType61 = jSTypeRegistry2.createEnumType("{proxy:{proxy:{1855868532}}}", node11, (com.google.javascript.rhino.jstype.JSType) parameterizedType46);
        com.google.javascript.rhino.Node node62 = node11.cloneNode();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType32 and parameterizedType46.", jSType32.equals(parameterizedType46) == parameterizedType46.equals(jSType32));
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test670");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        boolean boolean8 = jSTypeRegistry5.resetImplicitPrototype(jSType6, objectType7);
        com.google.javascript.rhino.jstype.JSType jSType13 = jSTypeRegistry5.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType14 = jSType13.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        boolean boolean21 = jSTypeRegistry18.resetImplicitPrototype(jSType19, objectType20);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        boolean boolean27 = jSTypeRegistry24.resetImplicitPrototype(jSType25, objectType26);
        com.google.javascript.rhino.jstype.JSType jSType32 = jSTypeRegistry24.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType33 = jSType32.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType38 = null;
        boolean boolean39 = jSTypeRegistry36.resetImplicitPrototype(jSType37, objectType38);
        com.google.javascript.rhino.jstype.JSType jSType44 = jSTypeRegistry36.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSType44.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType46 = jSTypeRegistry18.createParameterizedType(objectType33, jSType44);
        java.util.Set set47 = parameterizedType46.getOwnPropertyNames();
        boolean boolean48 = parameterizedType46.isNoObjectType();
        boolean boolean49 = parameterizedType46.isAllType();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) (-1L));
        boolean boolean52 = objectType14.defineInferredProperty("unknown", (com.google.javascript.rhino.jstype.JSType) parameterizedType46, node51);
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType57 = null;
        boolean boolean58 = jSTypeRegistry55.resetImplicitPrototype(jSType56, objectType57);
        com.google.javascript.rhino.jstype.JSType jSType63 = jSTypeRegistry55.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = jSType63.dereference();
        boolean boolean65 = parameterizedType46.isEquivalentTo(jSType63);
        com.google.javascript.rhino.JSDocInfo jSDocInfo67 = parameterizedType46.getOwnPropertyJSDocInfo("(|function (): )");
        com.google.javascript.rhino.jstype.UnionType unionType68 = parameterizedType46.toMaybeUnionType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo69 = parameterizedType46.getJSDocInfo();
        boolean boolean70 = parameterizedType46.hasReferenceName();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet71 = parameterizedType46.getPossibleToBooleanOutcomes();
        boolean boolean72 = parameterizedType46.isInterface();
        com.google.javascript.rhino.jstype.JSType jSType73 = jSTypeRegistry2.createNullableType((com.google.javascript.rhino.jstype.JSType) parameterizedType46);
        boolean boolean74 = jSType73.isNullType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType13 and parameterizedType46.", jSType13.equals(parameterizedType46) == parameterizedType46.equals(jSType13));
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test671");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable31 = parameterizedType30.getCtorExtendedInterfaces();
        boolean boolean32 = parameterizedType30.isNominalType();
        boolean boolean33 = parameterizedType30.isAllType();
        com.google.javascript.rhino.jstype.ObjectType objectType34 = parameterizedType30.getImplicitPrototype();
        boolean boolean35 = parameterizedType30.isUnknownType();
        com.google.javascript.rhino.jstype.FunctionType functionType36 = parameterizedType30.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType37 = parameterizedType30.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType38 = parameterizedType30.toMaybeFunctionType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test672");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable31 = parameterizedType30.getCtorExtendedInterfaces();
        boolean boolean32 = parameterizedType30.isNominalType();
        boolean boolean33 = parameterizedType30.isAllType();
        com.google.javascript.rhino.jstype.ObjectType objectType34 = parameterizedType30.getImplicitPrototype();
        boolean boolean35 = parameterizedType30.isUnknownType();
        com.google.javascript.rhino.jstype.FunctionType functionType36 = parameterizedType30.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType37 = parameterizedType30.dereference();
        boolean boolean38 = parameterizedType30.isNoResolvedType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test673");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = jSTypeRegistry2.getErrorReporter();
        boolean boolean7 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        boolean boolean13 = jSTypeRegistry10.resetImplicitPrototype(jSType11, objectType12);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14, true);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        boolean boolean19 = jSTypeRegistry16.resetImplicitPrototype(jSType17, objectType18);
        com.google.javascript.rhino.jstype.JSType jSType24 = jSTypeRegistry16.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSType24.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        boolean boolean31 = jSTypeRegistry28.resetImplicitPrototype(jSType29, objectType30);
        com.google.javascript.rhino.jstype.JSType jSType36 = jSTypeRegistry28.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType37 = jSType36.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType38 = jSTypeRegistry10.createParameterizedType(objectType25, jSType36);
        java.util.Set set39 = parameterizedType38.getOwnPropertyNames();
        boolean boolean40 = parameterizedType38.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41, true);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType45 = null;
        boolean boolean46 = jSTypeRegistry43.resetImplicitPrototype(jSType44, objectType45);
        com.google.javascript.rhino.jstype.JSType jSType51 = jSTypeRegistry43.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType52 = jSType51.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSType51.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType54 = jSType51.restrictByNotNullOrUndefined();
        boolean boolean55 = parameterizedType38.canAssignTo(jSType51);
        boolean boolean57 = parameterizedType38.isPropertyTypeInferred("");
        boolean boolean58 = parameterizedType38.isResolved();
        boolean boolean59 = parameterizedType38.isInstanceType();
        java.util.Set set60 = parameterizedType38.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.JSType jSType62 = parameterizedType38.getPropertyType("{proxy:{proxy:{1004792283}}}");
        boolean boolean63 = parameterizedType38.isNoResolvedType();
        com.google.javascript.rhino.ErrorReporter errorReporter64 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter64, true);
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType68 = null;
        boolean boolean69 = jSTypeRegistry66.resetImplicitPrototype(jSType67, objectType68);
        boolean boolean70 = jSTypeRegistry66.shouldTolerateUndefinedValues();
        jSTypeRegistry66.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray72 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.JSType jSType73 = jSTypeRegistry66.createUnionType(jSTypeArray72);
        com.google.javascript.rhino.jstype.FunctionType functionType74 = jSTypeRegistry2.createFunctionType((com.google.javascript.rhino.jstype.JSType) parameterizedType38, jSTypeArray72);
        com.google.javascript.rhino.jstype.ObjectType objectType75 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) parameterizedType38);
        com.google.javascript.rhino.jstype.JSType jSType76 = parameterizedType38.getIndexType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType24 and parameterizedType38.", jSType24.equals(parameterizedType38) == parameterizedType38.equals(jSType24));
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test674");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        boolean boolean38 = jSTypeRegistry35.resetImplicitPrototype(jSType36, objectType37);
        com.google.javascript.rhino.jstype.JSType jSType43 = jSTypeRegistry35.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = jSType43.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSType43.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType46 = jSType43.restrictByNotNullOrUndefined();
        boolean boolean47 = parameterizedType30.canAssignTo(jSType43);
        boolean boolean49 = parameterizedType30.isPropertyTypeInferred("");
        boolean boolean50 = parameterizedType30.isResolved();
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType30.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType53 = parameterizedType30.findPropertyType("{proxy:{proxy:{649633010}}}");
        boolean boolean54 = parameterizedType30.isNominalType();
        boolean boolean55 = parameterizedType30.matchesStringContext();
        boolean boolean56 = parameterizedType30.matchesNumberContext();
        boolean boolean57 = parameterizedType30.isUnknownType();
        com.google.javascript.rhino.ErrorReporter errorReporter58 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter58, true);
        com.google.javascript.rhino.jstype.JSType jSType61 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType62 = null;
        boolean boolean63 = jSTypeRegistry60.resetImplicitPrototype(jSType61, objectType62);
        com.google.javascript.rhino.ErrorReporter errorReporter64 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter64, true);
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType68 = null;
        boolean boolean69 = jSTypeRegistry66.resetImplicitPrototype(jSType67, objectType68);
        com.google.javascript.rhino.jstype.JSType jSType74 = jSTypeRegistry66.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType75 = jSType74.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry78 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76, true);
        com.google.javascript.rhino.jstype.JSType jSType79 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType80 = null;
        boolean boolean81 = jSTypeRegistry78.resetImplicitPrototype(jSType79, objectType80);
        com.google.javascript.rhino.jstype.JSType jSType86 = jSTypeRegistry78.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType87 = jSType86.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType88 = jSTypeRegistry60.createParameterizedType(objectType75, jSType86);
        boolean boolean89 = parameterizedType88.isEnumElementType();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair90 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) parameterizedType30, (com.google.javascript.rhino.jstype.JSType) parameterizedType88);
        boolean boolean91 = parameterizedType88.isNullable();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test675");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        boolean boolean33 = parameterizedType30.isAllType();
        boolean boolean34 = parameterizedType30.isEnumElementType();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType40 = null;
        boolean boolean41 = jSTypeRegistry38.resetImplicitPrototype(jSType39, objectType40);
        boolean boolean42 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        jSTypeRegistry38.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray44 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.JSType jSType45 = jSTypeRegistry38.createUnionType(jSTypeArray44);
        com.google.javascript.rhino.jstype.UnionType unionType46 = jSType45.toMaybeUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47, true);
        com.google.javascript.rhino.jstype.JSType jSType50 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType51 = null;
        boolean boolean52 = jSTypeRegistry49.resetImplicitPrototype(jSType50, objectType51);
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType57 = null;
        boolean boolean58 = jSTypeRegistry55.resetImplicitPrototype(jSType56, objectType57);
        com.google.javascript.rhino.jstype.JSType jSType63 = jSTypeRegistry55.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = jSType63.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65, true);
        com.google.javascript.rhino.jstype.JSType jSType68 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType69 = null;
        boolean boolean70 = jSTypeRegistry67.resetImplicitPrototype(jSType68, objectType69);
        com.google.javascript.rhino.jstype.JSType jSType75 = jSTypeRegistry67.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType76 = jSType75.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType77 = jSTypeRegistry49.createParameterizedType(objectType64, jSType75);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable78 = parameterizedType77.getCtorExtendedInterfaces();
        boolean boolean79 = parameterizedType77.isNominalType();
        boolean boolean80 = parameterizedType77.isAllType();
        boolean boolean81 = parameterizedType77.isUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType83 = parameterizedType77.getPropertyType("{proxy:{proxy:{51735728}}}");
        com.google.javascript.rhino.JSDocInfo jSDocInfo84 = parameterizedType77.getJSDocInfo();
        boolean boolean85 = jSType45.differsFrom((com.google.javascript.rhino.jstype.JSType) parameterizedType77);
        boolean boolean87 = parameterizedType77.hasProperty("{proxy:{proxy:{1965573194}}}");
        com.google.javascript.rhino.Node node90 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean91 = node90.isTrue();
        boolean boolean92 = node90.hasOneChild();
        boolean boolean93 = node90.isVarArgs();
        boolean boolean94 = node90.isOr();
        boolean boolean95 = parameterizedType30.defineDeclaredProperty("java.io.IOException: function (): {proxy:{10439819}}", (com.google.javascript.rhino.jstype.JSType) parameterizedType77, node90);
        boolean boolean96 = parameterizedType30.isNoType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType77.", jSType16.equals(parameterizedType77) == parameterizedType77.equals(jSType16));
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test676");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean3 = node2.isTrue();
        boolean boolean4 = node2.isOr();
        boolean boolean6 = node2.getBooleanProp(8);
        boolean boolean7 = node2.isWhile();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean11 = node10.isTrue();
        boolean boolean12 = node10.isOr();
        boolean boolean14 = node10.getBooleanProp(8);
        boolean boolean15 = node10.isWhile();
        node10.setLineno(35);
        com.google.javascript.rhino.Node node18 = node2.copyInformationFromForTree(node10);
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20, true);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        boolean boolean25 = jSTypeRegistry22.resetImplicitPrototype(jSType23, objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        boolean boolean31 = jSTypeRegistry28.resetImplicitPrototype(jSType29, objectType30);
        com.google.javascript.rhino.jstype.JSType jSType36 = jSTypeRegistry28.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType37 = jSType36.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38, true);
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType42 = null;
        boolean boolean43 = jSTypeRegistry40.resetImplicitPrototype(jSType41, objectType42);
        com.google.javascript.rhino.jstype.JSType jSType48 = jSTypeRegistry40.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType49 = jSType48.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType50 = jSTypeRegistry22.createParameterizedType(objectType37, jSType48);
        java.util.Set set51 = parameterizedType50.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot53 = parameterizedType50.getOwnSlot("{proxy:{proxy:{437279302}}}");
        java.lang.String str54 = parameterizedType50.toDebugHashCodeString();
        boolean boolean55 = parameterizedType50.isStringObjectType();
        node10.putProp((int) (short) 10, (java.lang.Object) boolean55);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType36 and parameterizedType50.", jSType36.equals(parameterizedType50) == parameterizedType50.equals(jSType36));
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test677");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.jstype.JSType jSType10 = jSTypeRegistry2.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.JSType jSType12 = jSTypeRegistry2.getType("");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        boolean boolean18 = jSTypeRegistry15.resetImplicitPrototype(jSType16, objectType17);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19, true);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = null;
        boolean boolean24 = jSTypeRegistry21.resetImplicitPrototype(jSType22, objectType23);
        com.google.javascript.rhino.jstype.JSType jSType29 = jSTypeRegistry21.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSType29.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = null;
        boolean boolean36 = jSTypeRegistry33.resetImplicitPrototype(jSType34, objectType35);
        com.google.javascript.rhino.jstype.JSType jSType41 = jSTypeRegistry33.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType42 = jSType41.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType43 = jSTypeRegistry15.createParameterizedType(objectType30, jSType41);
        java.util.Set set44 = parameterizedType43.getOwnPropertyNames();
        boolean boolean45 = parameterizedType43.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, true);
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType50 = null;
        boolean boolean51 = jSTypeRegistry48.resetImplicitPrototype(jSType49, objectType50);
        com.google.javascript.rhino.jstype.JSType jSType56 = jSTypeRegistry48.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType57 = jSType56.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType58 = jSType56.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType59 = jSType56.restrictByNotNullOrUndefined();
        boolean boolean60 = parameterizedType43.canAssignTo(jSType56);
        boolean boolean62 = parameterizedType43.isPropertyTypeInferred("");
        boolean boolean63 = parameterizedType43.isResolved();
        com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry2.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType) parameterizedType43, "{proxy:{proxy:{1079051466}}}");
        com.google.javascript.rhino.jstype.JSType jSType66 = parameterizedType43.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.Node node67 = parameterizedType43.getRootNode();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType10 and parameterizedType43.", jSType10.equals(parameterizedType43) == parameterizedType43.equals(jSType10));
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test678");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        boolean boolean3 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        jSTypeRegistry2.clearTemplateTypeNames();
        boolean boolean6 = jSTypeRegistry2.hasNamespace("function (): {proxy:{685828741}}");
        boolean boolean7 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList12 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node11);
        boolean boolean13 = node11.isFalse();
        node11.setWasEmptyNode(false);
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        boolean boolean21 = jSTypeRegistry18.resetImplicitPrototype(jSType19, objectType20);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        boolean boolean27 = jSTypeRegistry24.resetImplicitPrototype(jSType25, objectType26);
        com.google.javascript.rhino.jstype.JSType jSType32 = jSTypeRegistry24.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType33 = jSType32.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType38 = null;
        boolean boolean39 = jSTypeRegistry36.resetImplicitPrototype(jSType37, objectType38);
        com.google.javascript.rhino.jstype.JSType jSType44 = jSTypeRegistry36.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSType44.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType46 = jSTypeRegistry18.createParameterizedType(objectType33, jSType44);
        java.util.Set set47 = parameterizedType46.getOwnPropertyNames();
        boolean boolean48 = parameterizedType46.hasReferenceName();
        boolean boolean49 = parameterizedType46.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.JSType jSType51 = parameterizedType46.findPropertyType("");
        java.lang.String str52 = parameterizedType46.getReferenceName();
        com.google.javascript.rhino.jstype.UnionType unionType53 = parameterizedType46.toMaybeUnionType();
        boolean boolean55 = parameterizedType46.hasOwnProperty("function (): {proxy:{1262905525}}");
        com.google.javascript.rhino.JSDocInfo jSDocInfo56 = parameterizedType46.getJSDocInfo();
        boolean boolean58 = parameterizedType46.isPropertyTypeDeclared("{proxy:{proxy:{1943266088}}}");
        int int59 = parameterizedType46.getPropertiesCount();
        int int60 = parameterizedType46.getPropertiesCount();
        com.google.javascript.rhino.jstype.EnumType enumType61 = jSTypeRegistry2.createEnumType("{proxy:{proxy:{1855868532}}}", node11, (com.google.javascript.rhino.jstype.JSType) parameterizedType46);
        com.google.javascript.rhino.Node node63 = enumType61.getPropertyNode("function (): {proxy:{243873121}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType32 and parameterizedType46.", jSType32.equals(parameterizedType46) == parameterizedType46.equals(jSType32));
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test679");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.jstype.JSType jSType10 = jSTypeRegistry2.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = jSType10.dereference();
        boolean boolean12 = objectType11.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable13 = objectType11.getCtorImplementedInterfaces();
        boolean boolean14 = objectType11.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        boolean boolean20 = jSTypeRegistry17.resetImplicitPrototype(jSType18, objectType19);
        com.google.javascript.rhino.jstype.JSType jSType25 = jSTypeRegistry17.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = jSType25.dereference();
        boolean boolean27 = objectType26.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable28 = objectType26.getCtorImplementedInterfaces();
        boolean boolean29 = objectType26.isNativeObjectType();
        boolean boolean30 = objectType11.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType26);
        boolean boolean32 = objectType11.hasProperty("hi!");
        com.google.javascript.rhino.jstype.JSType jSType33 = objectType11.autobox();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope34 = objectType11.getParentScope();
        com.google.javascript.rhino.jstype.FunctionType functionType35 = objectType11.getOwnerFunction();
        com.google.javascript.rhino.jstype.ObjectType objectType36 = objectType11.dereference();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot38 = objectType36.getSlot("unknown");
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, true);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType43 = null;
        boolean boolean44 = jSTypeRegistry41.resetImplicitPrototype(jSType42, objectType43);
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, true);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType49 = null;
        boolean boolean50 = jSTypeRegistry47.resetImplicitPrototype(jSType48, objectType49);
        com.google.javascript.rhino.jstype.JSType jSType55 = jSTypeRegistry47.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType56 = jSType55.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter57 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter57, true);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType61 = null;
        boolean boolean62 = jSTypeRegistry59.resetImplicitPrototype(jSType60, objectType61);
        com.google.javascript.rhino.jstype.JSType jSType67 = jSTypeRegistry59.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType68 = jSType67.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType69 = jSTypeRegistry41.createParameterizedType(objectType56, jSType67);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue70 = objectType36.testForEquality((com.google.javascript.rhino.jstype.JSType) parameterizedType69);
        com.google.javascript.rhino.JSDocInfo jSDocInfo72 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str74 = jSDocInfo72.getDescriptionForParameter("{proxy:{proxy:{649633010}}}");
        parameterizedType69.setPropertyJSDocInfo("Named type with empty name component", jSDocInfo72);
        boolean boolean76 = parameterizedType69.isNoType();
        com.google.javascript.rhino.jstype.JSType jSType77 = parameterizedType69.getParameterType();
        com.google.javascript.rhino.jstype.JSType jSType79 = jSType77.findPropertyType("{proxy:{proxy:{417283723}}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType10 and parameterizedType69.", jSType10.equals(parameterizedType69) == parameterizedType69.equals(jSType10));
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test680");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean4 = node3.isTrue();
        boolean boolean5 = node3.isOr();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean9 = node8.isTrue();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (byte) 0, node3, node8, 49, 49);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) ' ', 48, 41);
        com.google.javascript.rhino.jstype.JSType jSType17 = node16.getJSType();
        com.google.javascript.rhino.Node node18 = node3.useSourceInfoFromForTree(node16);
        com.google.javascript.rhino.Node node19 = node18.getLastChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node21 = node18.getChildAtIndex(30);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test681");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("({proxy:{proxy:{1874555938}}})", jSTypeNative1);
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList6 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node5);
        boolean boolean7 = node5.isFalse();
        boolean boolean8 = node5.isScript();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        boolean boolean14 = jSTypeRegistry11.resetImplicitPrototype(jSType12, objectType13);
        jSTypeRegistry11.setLastGeneration(false);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        boolean boolean22 = jSTypeRegistry19.resetImplicitPrototype(jSType20, objectType21);
        com.google.javascript.rhino.jstype.JSType jSType27 = jSTypeRegistry19.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType28 = jSType27.dereference();
        boolean boolean29 = objectType28.isFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType30 = jSTypeRegistry11.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType) objectType28);
        boolean boolean32 = jSTypeRegistry11.hasNamespace("{proxy:{proxy:{51735728}}}");
        com.google.javascript.rhino.jstype.JSType jSType33 = assertionFunctionSpec2.getAssertedType(node5, jSTypeRegistry11);
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType38 = null;
        boolean boolean39 = jSTypeRegistry36.resetImplicitPrototype(jSType37, objectType38);
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        boolean boolean45 = jSTypeRegistry42.resetImplicitPrototype(jSType43, objectType44);
        com.google.javascript.rhino.jstype.JSType jSType50 = jSTypeRegistry42.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType51 = jSType50.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, true);
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType56 = null;
        boolean boolean57 = jSTypeRegistry54.resetImplicitPrototype(jSType55, objectType56);
        com.google.javascript.rhino.jstype.JSType jSType62 = jSTypeRegistry54.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType63 = jSType62.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType64 = jSTypeRegistry36.createParameterizedType(objectType51, jSType62);
        boolean boolean65 = parameterizedType64.isConstructor();
        com.google.javascript.rhino.jstype.JSType jSType67 = jSTypeRegistry11.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType) parameterizedType64, "{proxy:{proxy:{1385057952}}}");
        jSTypeRegistry11.setLastGeneration(true);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType27 and parameterizedType64.", jSType27.equals(parameterizedType64) == parameterizedType64.equals(jSType27));
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test682");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node3 = node1.getChildAtIndex(5);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test683");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType33 = parameterizedType30.getIndexType();
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType38 = null;
        boolean boolean39 = jSTypeRegistry36.resetImplicitPrototype(jSType37, objectType38);
        com.google.javascript.rhino.jstype.JSType jSType44 = jSTypeRegistry36.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSType44.dereference();
        boolean boolean46 = objectType45.isRegexpType();
        boolean boolean48 = objectType45.isPropertyTypeInferred("hi!");
        boolean boolean49 = parameterizedType30.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) objectType45);
        java.lang.String str50 = parameterizedType30.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType51 = parameterizedType30.toMaybeParameterizedType();
        boolean boolean52 = parameterizedType30.isOrdinaryFunction();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test684");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        boolean boolean10 = jSTypeRegistry7.resetImplicitPrototype(jSType8, objectType9);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, true);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        boolean boolean16 = jSTypeRegistry13.resetImplicitPrototype(jSType14, objectType15);
        com.google.javascript.rhino.jstype.JSType jSType21 = jSTypeRegistry13.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSType21.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = null;
        boolean boolean28 = jSTypeRegistry25.resetImplicitPrototype(jSType26, objectType27);
        com.google.javascript.rhino.jstype.JSType jSType33 = jSTypeRegistry25.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = jSType33.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType35 = jSTypeRegistry7.createParameterizedType(objectType22, jSType33);
        java.util.Set set36 = parameterizedType35.getOwnPropertyNames();
        boolean boolean37 = parameterizedType35.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType38 = parameterizedType35.getIndexType();
        boolean boolean39 = cloneableList4.equals((java.lang.Object) parameterizedType35);
        com.google.javascript.rhino.jstype.JSType jSType40 = parameterizedType35.collapseUnion();
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = parameterizedType35.getJSDocInfo();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType21 and parameterizedType35.", jSType21.equals(parameterizedType35) == parameterizedType35.equals(jSType21));
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test685");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        boolean boolean38 = jSTypeRegistry35.resetImplicitPrototype(jSType36, objectType37);
        com.google.javascript.rhino.jstype.JSType jSType43 = jSTypeRegistry35.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = jSType43.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSType43.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType46 = jSType43.restrictByNotNullOrUndefined();
        boolean boolean47 = parameterizedType30.canAssignTo(jSType43);
        boolean boolean49 = parameterizedType30.isPropertyTypeInferred("");
        boolean boolean50 = parameterizedType30.isResolved();
        boolean boolean51 = parameterizedType30.isDateType();
        boolean boolean52 = parameterizedType30.isNoResolvedType();
        boolean boolean54 = parameterizedType30.isPropertyTypeInferred("function (): {proxy:{473699289}}");
        boolean boolean55 = parameterizedType30.isOrdinaryFunction();
        com.google.javascript.rhino.Node node57 = parameterizedType30.getPropertyNode("{proxy:{proxy:{893410023}}}");
        com.google.javascript.rhino.jstype.JSType jSType59 = parameterizedType30.getPropertyType("Unknown class name");
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60, true);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType64 = null;
        boolean boolean65 = jSTypeRegistry62.resetImplicitPrototype(jSType63, objectType64);
        com.google.javascript.rhino.jstype.JSType jSType70 = jSTypeRegistry62.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType71 = jSType70.dereference();
        java.lang.String str72 = objectType71.getDisplayName();
        com.google.javascript.rhino.jstype.ObjectType objectType73 = objectType71.getImplicitPrototype();
        boolean boolean74 = objectType71.matchesNumberContext();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot76 = objectType71.getSlot("{proxy:{proxy:{437279302}}}");
        boolean boolean77 = parameterizedType30.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType71);
        boolean boolean79 = objectType71.hasProperty("{proxy:{proxy:{1649378223}}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test686");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        boolean boolean38 = jSTypeRegistry35.resetImplicitPrototype(jSType36, objectType37);
        com.google.javascript.rhino.jstype.JSType jSType43 = jSTypeRegistry35.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = jSType43.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSType43.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType46 = jSType43.restrictByNotNullOrUndefined();
        boolean boolean47 = parameterizedType30.canAssignTo(jSType43);
        boolean boolean49 = parameterizedType30.isPropertyTypeInferred("");
        boolean boolean50 = parameterizedType30.isResolved();
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType30.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, true);
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType56 = null;
        boolean boolean57 = jSTypeRegistry54.resetImplicitPrototype(jSType55, objectType56);
        com.google.javascript.rhino.jstype.JSType jSType62 = jSTypeRegistry54.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType63 = jSType62.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType64 = jSType62.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType65 = jSType62.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType66 = jSType65.toMaybeEnumElementType();
        boolean boolean67 = parameterizedType30.isEquivalentTo(jSType65);
        boolean boolean68 = parameterizedType30.isNativeObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType69 = parameterizedType30.getTypeOfThis();
        boolean boolean70 = parameterizedType30.isAllType();
        com.google.javascript.rhino.jstype.JSType jSType72 = parameterizedType30.getPropertyType("");
        com.google.javascript.rhino.jstype.JSType jSType73 = parameterizedType30.collapseUnion();
        java.lang.String str74 = parameterizedType30.toDebugHashCodeString();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test687");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        boolean boolean3 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        boolean boolean18 = objectType17.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable19 = objectType17.getCtorImplementedInterfaces();
        boolean boolean20 = objectType17.isNativeObjectType();
        jSTypeRegistry2.registerPropertyOnType("", (com.google.javascript.rhino.jstype.JSType) objectType17);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        boolean boolean27 = jSTypeRegistry24.resetImplicitPrototype(jSType25, objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = null;
        boolean boolean33 = jSTypeRegistry30.resetImplicitPrototype(jSType31, objectType32);
        com.google.javascript.rhino.jstype.JSType jSType38 = jSTypeRegistry30.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType39 = jSType38.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        boolean boolean45 = jSTypeRegistry42.resetImplicitPrototype(jSType43, objectType44);
        com.google.javascript.rhino.jstype.JSType jSType50 = jSTypeRegistry42.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType51 = jSType50.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType52 = jSTypeRegistry24.createParameterizedType(objectType39, jSType50);
        java.util.Set set53 = parameterizedType52.getOwnPropertyNames();
        boolean boolean54 = parameterizedType52.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, true);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType59 = null;
        boolean boolean60 = jSTypeRegistry57.resetImplicitPrototype(jSType58, objectType59);
        com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry57.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType66 = jSType65.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType67 = jSType65.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType68 = jSType65.restrictByNotNullOrUndefined();
        boolean boolean69 = parameterizedType52.canAssignTo(jSType65);
        boolean boolean71 = parameterizedType52.isPropertyTypeInferred("");
        com.google.javascript.rhino.jstype.JSType jSType76 = jSTypeRegistry2.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) parameterizedType52, "hi!", "Named type with empty name component", 40, 39);
        boolean boolean78 = parameterizedType52.isPropertyTypeDeclared("unknown");
        com.google.javascript.rhino.jstype.UnionType unionType79 = parameterizedType52.toMaybeUnionType();
        com.google.javascript.rhino.jstype.FunctionType functionType80 = parameterizedType52.getOwnerFunction();
        java.lang.String str81 = parameterizedType52.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.ObjectType.Property property83 = parameterizedType52.getSlot("{proxy:{proxy:{2070335273}}}");
        boolean boolean84 = parameterizedType52.isInterface();
        com.google.javascript.rhino.jstype.JSType jSType85 = parameterizedType52.collapseUnion();
        boolean boolean86 = parameterizedType52.hasReferenceName();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType52.", jSType16.equals(parameterizedType52) == parameterizedType52.equals(jSType16));
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test688");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        boolean boolean38 = jSTypeRegistry35.resetImplicitPrototype(jSType36, objectType37);
        com.google.javascript.rhino.jstype.JSType jSType43 = jSTypeRegistry35.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = jSType43.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSType43.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType46 = jSType43.restrictByNotNullOrUndefined();
        boolean boolean47 = parameterizedType30.canAssignTo(jSType43);
        boolean boolean49 = parameterizedType30.isPropertyTypeInferred("");
        boolean boolean50 = parameterizedType30.isInterface();
        int int51 = parameterizedType30.getPropertiesCount();
        boolean boolean52 = parameterizedType30.isArrayType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType53 = parameterizedType30.toMaybeParameterizedType();
        boolean boolean54 = parameterizedType30.isNoResolvedType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test689");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean7 = node6.isFalse();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean11 = node10.isTrue();
        boolean boolean12 = node10.hasOneChild();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean16 = node15.isTrue();
        boolean boolean17 = node15.isBreak();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (byte) 1, node3, node6, node10, node15, (int) (byte) 1, 4095);
        boolean boolean21 = node6.isParamList();
        boolean boolean22 = node6.isSyntheticBlock();
        boolean boolean23 = node6.isCatch();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean31 = node30.isFalse();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean35 = node34.isTrue();
        boolean boolean36 = node34.hasOneChild();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean40 = node39.isTrue();
        boolean boolean41 = node39.isBreak();
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node((int) (byte) 1, node27, node30, node34, node39, (int) (byte) 1, 4095);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable45 = node44.children();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean53 = node52.isFalse();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean57 = node56.isTrue();
        boolean boolean58 = node56.hasOneChild();
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean62 = node61.isTrue();
        boolean boolean63 = node61.isBreak();
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node((int) (byte) 1, node49, node52, node56, node61, (int) (byte) 1, 4095);
        com.google.javascript.rhino.Node node67 = node44.useSourceInfoIfMissingFromForTree(node61);
        boolean boolean68 = node44.isDefaultCase();
        node44.putIntProp((int) (short) -1, 0);
        java.lang.Object obj73 = node44.getProp((-1));
        boolean boolean74 = node44.isNull();
        boolean boolean75 = node44.isAnd();
        boolean boolean76 = node6.hasChild(node44);
        com.google.javascript.rhino.Node node78 = new com.google.javascript.rhino.Node(44);
        boolean boolean79 = node78.isFor();
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean83 = node82.isTrue();
        com.google.javascript.rhino.InputId inputId84 = node82.getInputId();
        boolean boolean85 = node82.isNot();
        boolean boolean86 = node82.isRegExp();
        com.google.javascript.rhino.Node node90 = com.google.javascript.rhino.Node.newString("", (int) (byte) -1, 30);
        java.lang.Object obj92 = node90.getProp(30);
        int int93 = node90.getSourceOffset();
        boolean boolean94 = node90.isNull();
        boolean boolean95 = node82.hasChild(node90);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node6.replaceChild(node78, node82);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test690");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        boolean boolean38 = jSTypeRegistry35.resetImplicitPrototype(jSType36, objectType37);
        com.google.javascript.rhino.jstype.JSType jSType43 = jSTypeRegistry35.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = jSType43.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSType43.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType46 = jSType43.restrictByNotNullOrUndefined();
        boolean boolean47 = parameterizedType30.canAssignTo(jSType43);
        boolean boolean49 = parameterizedType30.isPropertyTypeInferred("");
        boolean boolean50 = parameterizedType30.isResolved();
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType30.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, true);
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType56 = null;
        boolean boolean57 = jSTypeRegistry54.resetImplicitPrototype(jSType55, objectType56);
        com.google.javascript.rhino.jstype.JSType jSType62 = jSTypeRegistry54.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType63 = jSType62.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType64 = jSType62.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType65 = jSType62.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType66 = jSType65.toMaybeEnumElementType();
        boolean boolean67 = parameterizedType30.isEquivalentTo(jSType65);
        com.google.javascript.rhino.jstype.JSType jSType68 = parameterizedType30.getParameterType();
        boolean boolean69 = jSType68.matchesStringContext();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test691");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable31 = parameterizedType30.getCtorExtendedInterfaces();
        boolean boolean32 = parameterizedType30.isNominalType();
        boolean boolean33 = parameterizedType30.isAllType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo35 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean36 = jSDocInfo35.isInterface();
        java.util.Collection<java.lang.String> strCollection37 = jSDocInfo35.getReferences();
        parameterizedType30.setPropertyJSDocInfo("", jSDocInfo35);
        boolean boolean39 = parameterizedType30.isAllType();
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        boolean boolean45 = jSTypeRegistry42.resetImplicitPrototype(jSType43, objectType44);
        com.google.javascript.rhino.jstype.JSType jSType50 = jSTypeRegistry42.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType51 = jSType50.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType57 = null;
        boolean boolean58 = jSTypeRegistry55.resetImplicitPrototype(jSType56, objectType57);
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        com.google.javascript.rhino.jstype.JSType jSType62 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType63 = null;
        boolean boolean64 = jSTypeRegistry61.resetImplicitPrototype(jSType62, objectType63);
        com.google.javascript.rhino.jstype.JSType jSType69 = jSTypeRegistry61.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType70 = jSType69.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter71 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter71, true);
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType75 = null;
        boolean boolean76 = jSTypeRegistry73.resetImplicitPrototype(jSType74, objectType75);
        com.google.javascript.rhino.jstype.JSType jSType81 = jSTypeRegistry73.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType82 = jSType81.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType83 = jSTypeRegistry55.createParameterizedType(objectType70, jSType81);
        java.util.Set set84 = parameterizedType83.getOwnPropertyNames();
        boolean boolean85 = parameterizedType83.isNoObjectType();
        boolean boolean86 = parameterizedType83.isAllType();
        com.google.javascript.rhino.Node node88 = com.google.javascript.rhino.Node.newNumber((double) (-1L));
        boolean boolean89 = objectType51.defineInferredProperty("unknown", (com.google.javascript.rhino.jstype.JSType) parameterizedType83, node88);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable90 = parameterizedType83.getCtorImplementedInterfaces();
        parameterizedType30.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) parameterizedType83);
        com.google.javascript.rhino.jstype.JSType jSType92 = parameterizedType83.autoboxesTo();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test692");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        boolean boolean10 = jSTypeRegistry7.resetImplicitPrototype(jSType8, objectType9);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, true);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        boolean boolean16 = jSTypeRegistry13.resetImplicitPrototype(jSType14, objectType15);
        com.google.javascript.rhino.jstype.JSType jSType21 = jSTypeRegistry13.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSType21.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = null;
        boolean boolean28 = jSTypeRegistry25.resetImplicitPrototype(jSType26, objectType27);
        com.google.javascript.rhino.jstype.JSType jSType33 = jSTypeRegistry25.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = jSType33.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType35 = jSTypeRegistry7.createParameterizedType(objectType22, jSType33);
        java.util.Set set36 = parameterizedType35.getOwnPropertyNames();
        boolean boolean37 = parameterizedType35.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType38 = parameterizedType35.getIndexType();
        boolean boolean39 = cloneableList4.equals((java.lang.Object) parameterizedType35);
        boolean boolean40 = parameterizedType35.hasDisplayName();
        com.google.javascript.rhino.jstype.FunctionType functionType41 = parameterizedType35.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.TemplateType templateType42 = parameterizedType35.toMaybeTemplateType();
        java.util.Set set43 = parameterizedType35.getOwnPropertyNames();
        boolean boolean44 = parameterizedType35.isBooleanValueType();
        java.util.Set set45 = parameterizedType35.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.JSType jSType46 = parameterizedType35.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.JSType jSType48 = parameterizedType35.findPropertyType("{proxy:{proxy:{2054191764}}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType21 and parameterizedType35.", jSType21.equals(parameterizedType35) == parameterizedType35.equals(jSType21));
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test693");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        boolean boolean38 = jSTypeRegistry35.resetImplicitPrototype(jSType36, objectType37);
        com.google.javascript.rhino.jstype.JSType jSType43 = jSTypeRegistry35.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = jSType43.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSType43.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType46 = jSType43.restrictByNotNullOrUndefined();
        boolean boolean47 = parameterizedType30.canAssignTo(jSType43);
        boolean boolean49 = parameterizedType30.isPropertyTypeInferred("");
        boolean boolean50 = parameterizedType30.isResolved();
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType30.getImplicitPrototype();
        boolean boolean52 = parameterizedType30.isNominalType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType53 = parameterizedType30.toMaybeParameterizedType();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot55 = parameterizedType53.getSlot("java.io.IOException: function (): {proxy:{10439819}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType53.", jSType16.equals(parameterizedType53) == parameterizedType53.equals(jSType16));
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test694");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        boolean boolean38 = jSTypeRegistry35.resetImplicitPrototype(jSType36, objectType37);
        com.google.javascript.rhino.jstype.JSType jSType43 = jSTypeRegistry35.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = jSType43.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSType43.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType46 = jSType43.restrictByNotNullOrUndefined();
        boolean boolean47 = parameterizedType30.canAssignTo(jSType43);
        boolean boolean49 = parameterizedType30.isPropertyTypeInferred("");
        boolean boolean50 = parameterizedType30.isResolved();
        boolean boolean51 = parameterizedType30.isInstanceType();
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, true);
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType56 = null;
        boolean boolean57 = jSTypeRegistry54.resetImplicitPrototype(jSType55, objectType56);
        boolean boolean58 = jSTypeRegistry54.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        com.google.javascript.rhino.jstype.JSType jSType62 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType63 = null;
        boolean boolean64 = jSTypeRegistry61.resetImplicitPrototype(jSType62, objectType63);
        com.google.javascript.rhino.jstype.JSType jSType69 = jSTypeRegistry61.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType70 = jSType69.dereference();
        boolean boolean71 = objectType70.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable72 = objectType70.getCtorImplementedInterfaces();
        boolean boolean73 = objectType70.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter74 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry76 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter74, true);
        com.google.javascript.rhino.jstype.JSType jSType77 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType78 = null;
        boolean boolean79 = jSTypeRegistry76.resetImplicitPrototype(jSType77, objectType78);
        com.google.javascript.rhino.jstype.JSType jSType84 = jSTypeRegistry76.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType85 = jSType84.dereference();
        boolean boolean86 = objectType85.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable87 = objectType85.getCtorImplementedInterfaces();
        boolean boolean88 = objectType85.isNativeObjectType();
        boolean boolean89 = objectType70.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType85);
        com.google.javascript.rhino.jstype.JSType jSType94 = jSTypeRegistry54.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType85, "Named type with empty name component", "hi!", 4095, (int) (byte) 100);
        com.google.javascript.rhino.Node node95 = objectType85.getRootNode();
        boolean boolean96 = objectType85.isAllType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue97 = parameterizedType30.testForEquality((com.google.javascript.rhino.jstype.JSType) objectType85);
        com.google.javascript.rhino.JSDocInfo jSDocInfo98 = objectType85.getJSDocInfo();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test695");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        boolean boolean38 = jSTypeRegistry35.resetImplicitPrototype(jSType36, objectType37);
        com.google.javascript.rhino.jstype.JSType jSType43 = jSTypeRegistry35.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = jSType43.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSType43.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType46 = jSType43.restrictByNotNullOrUndefined();
        boolean boolean47 = parameterizedType30.canAssignTo(jSType43);
        int int48 = parameterizedType30.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType49 = parameterizedType30.dereference();
        com.google.javascript.rhino.jstype.ObjectType.Property property51 = objectType49.getSlot("function (): {proxy:{67645231}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and objectType49.", jSType16.equals(objectType49) == objectType49.equals(jSType16));
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test696");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        boolean boolean38 = jSTypeRegistry35.resetImplicitPrototype(jSType36, objectType37);
        com.google.javascript.rhino.jstype.JSType jSType43 = jSTypeRegistry35.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = jSType43.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSType43.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType46 = jSType43.restrictByNotNullOrUndefined();
        boolean boolean47 = parameterizedType30.canAssignTo(jSType43);
        boolean boolean49 = parameterizedType30.isPropertyTypeInferred("");
        boolean boolean50 = parameterizedType30.isResolved();
        boolean boolean51 = parameterizedType30.isInstanceType();
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, true);
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType56 = null;
        boolean boolean57 = jSTypeRegistry54.resetImplicitPrototype(jSType55, objectType56);
        boolean boolean58 = jSTypeRegistry54.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        com.google.javascript.rhino.jstype.JSType jSType62 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType63 = null;
        boolean boolean64 = jSTypeRegistry61.resetImplicitPrototype(jSType62, objectType63);
        com.google.javascript.rhino.jstype.JSType jSType69 = jSTypeRegistry61.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType70 = jSType69.dereference();
        boolean boolean71 = objectType70.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable72 = objectType70.getCtorImplementedInterfaces();
        boolean boolean73 = objectType70.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter74 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry76 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter74, true);
        com.google.javascript.rhino.jstype.JSType jSType77 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType78 = null;
        boolean boolean79 = jSTypeRegistry76.resetImplicitPrototype(jSType77, objectType78);
        com.google.javascript.rhino.jstype.JSType jSType84 = jSTypeRegistry76.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType85 = jSType84.dereference();
        boolean boolean86 = objectType85.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable87 = objectType85.getCtorImplementedInterfaces();
        boolean boolean88 = objectType85.isNativeObjectType();
        boolean boolean89 = objectType70.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType85);
        com.google.javascript.rhino.jstype.JSType jSType94 = jSTypeRegistry54.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType85, "Named type with empty name component", "hi!", 4095, (int) (byte) 100);
        com.google.javascript.rhino.Node node95 = objectType85.getRootNode();
        boolean boolean96 = objectType85.isAllType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue97 = parameterizedType30.testForEquality((com.google.javascript.rhino.jstype.JSType) objectType85);
        boolean boolean98 = objectType85.isInstanceType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test697");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.jstype.JSType jSType10 = jSTypeRegistry2.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = jSType10.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        boolean boolean17 = jSTypeRegistry14.resetImplicitPrototype(jSType15, objectType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, true);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        boolean boolean35 = jSTypeRegistry32.resetImplicitPrototype(jSType33, objectType34);
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry32.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType41 = jSType40.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType42 = jSTypeRegistry14.createParameterizedType(objectType29, jSType40);
        java.util.Set set43 = parameterizedType42.getOwnPropertyNames();
        boolean boolean44 = parameterizedType42.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, true);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType49 = null;
        boolean boolean50 = jSTypeRegistry47.resetImplicitPrototype(jSType48, objectType49);
        com.google.javascript.rhino.jstype.JSType jSType55 = jSTypeRegistry47.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType56 = jSType55.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType57 = jSType55.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType58 = jSType55.restrictByNotNullOrUndefined();
        boolean boolean59 = parameterizedType42.canAssignTo(jSType55);
        boolean boolean61 = parameterizedType42.isPropertyTypeInferred("");
        boolean boolean62 = parameterizedType42.isResolved();
        com.google.javascript.rhino.jstype.ObjectType objectType63 = parameterizedType42.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType65 = parameterizedType42.findPropertyType("{proxy:{proxy:{649633010}}}");
        boolean boolean66 = parameterizedType42.isNominalType();
        boolean boolean67 = parameterizedType42.canBeCalled();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue68 = objectType11.testForEquality((com.google.javascript.rhino.jstype.JSType) parameterizedType42);
        com.google.javascript.rhino.JSDocInfo jSDocInfo69 = parameterizedType42.getJSDocInfo();
        boolean boolean70 = parameterizedType42.isNativeObjectType();
        boolean boolean71 = parameterizedType42.hasAnyTemplate();
        boolean boolean72 = parameterizedType42.matchesStringContext();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType73 = parameterizedType42.toMaybeParameterizedType();
        java.util.Set set74 = parameterizedType42.getOwnPropertyNames();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType10 and parameterizedType42.", jSType10.equals(parameterizedType42) == parameterizedType42.equals(jSType10));
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test698");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList5 = cloneableList3.reverse();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList6 = cloneableList5.reverse();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList7 = cloneableList5.reverse();
        int int8 = cloneableList7.size();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        boolean boolean14 = jSTypeRegistry11.resetImplicitPrototype(jSType12, objectType13);
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        boolean boolean20 = jSTypeRegistry17.resetImplicitPrototype(jSType18, objectType19);
        com.google.javascript.rhino.jstype.JSType jSType25 = jSTypeRegistry17.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = jSType25.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27, true);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        boolean boolean32 = jSTypeRegistry29.resetImplicitPrototype(jSType30, objectType31);
        com.google.javascript.rhino.jstype.JSType jSType37 = jSTypeRegistry29.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType38 = jSType37.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType39 = jSTypeRegistry11.createParameterizedType(objectType26, jSType37);
        java.util.Set set40 = parameterizedType39.getOwnPropertyNames();
        boolean boolean41 = parameterizedType39.hasReferenceName();
        boolean boolean42 = parameterizedType39.hasAnyTemplateInternal();
        boolean boolean43 = parameterizedType39.isOrdinaryFunction();
        boolean boolean44 = cloneableList7.equals((java.lang.Object) parameterizedType39);
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition45 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str46 = stringPosition45.getItem();
        int int47 = stringPosition45.getPositionOnStartLine();
        stringPosition45.setPositionInformation(39, 29, 2147483647, (int) 'a');
        int int53 = stringPosition45.getEndLine();
        stringPosition45.setItem("{proxy:{proxy:{740044730}}}");
        stringPosition45.setItem("function (): {proxy:{402841066}}");
        int int58 = stringPosition45.getPositionOnEndLine();
        int int59 = cloneableList7.indexOf((java.lang.Object) stringPosition45);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType25 and parameterizedType39.", jSType25.equals(parameterizedType39) == parameterizedType39.equals(jSType25));
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test699");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = jSTypeRegistry2.getErrorReporter();
        boolean boolean7 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        boolean boolean13 = jSTypeRegistry10.resetImplicitPrototype(jSType11, objectType12);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14, true);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        boolean boolean19 = jSTypeRegistry16.resetImplicitPrototype(jSType17, objectType18);
        com.google.javascript.rhino.jstype.JSType jSType24 = jSTypeRegistry16.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSType24.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        boolean boolean31 = jSTypeRegistry28.resetImplicitPrototype(jSType29, objectType30);
        com.google.javascript.rhino.jstype.JSType jSType36 = jSTypeRegistry28.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType37 = jSType36.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType38 = jSTypeRegistry10.createParameterizedType(objectType25, jSType36);
        java.util.Set set39 = parameterizedType38.getOwnPropertyNames();
        boolean boolean40 = parameterizedType38.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41, true);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType45 = null;
        boolean boolean46 = jSTypeRegistry43.resetImplicitPrototype(jSType44, objectType45);
        com.google.javascript.rhino.jstype.JSType jSType51 = jSTypeRegistry43.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType52 = jSType51.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSType51.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType54 = jSType51.restrictByNotNullOrUndefined();
        boolean boolean55 = parameterizedType38.canAssignTo(jSType51);
        boolean boolean57 = parameterizedType38.isPropertyTypeInferred("");
        boolean boolean58 = parameterizedType38.isResolved();
        boolean boolean59 = parameterizedType38.isInstanceType();
        java.util.Set set60 = parameterizedType38.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.JSType jSType62 = parameterizedType38.getPropertyType("{proxy:{proxy:{1004792283}}}");
        boolean boolean63 = parameterizedType38.isNoResolvedType();
        com.google.javascript.rhino.ErrorReporter errorReporter64 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter64, true);
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType68 = null;
        boolean boolean69 = jSTypeRegistry66.resetImplicitPrototype(jSType67, objectType68);
        boolean boolean70 = jSTypeRegistry66.shouldTolerateUndefinedValues();
        jSTypeRegistry66.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray72 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.JSType jSType73 = jSTypeRegistry66.createUnionType(jSTypeArray72);
        com.google.javascript.rhino.jstype.FunctionType functionType74 = jSTypeRegistry2.createFunctionType((com.google.javascript.rhino.jstype.JSType) parameterizedType38, jSTypeArray72);
        int int75 = parameterizedType38.getPropertiesCount();
        com.google.javascript.rhino.jstype.JSType jSType76 = parameterizedType38.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.UnionType unionType77 = parameterizedType38.toMaybeUnionType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType24 and parameterizedType38.", jSType24.equals(parameterizedType38) == parameterizedType38.equals(jSType24));
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test700");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        boolean boolean10 = jSTypeRegistry7.resetImplicitPrototype(jSType8, objectType9);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, true);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        boolean boolean16 = jSTypeRegistry13.resetImplicitPrototype(jSType14, objectType15);
        com.google.javascript.rhino.jstype.JSType jSType21 = jSTypeRegistry13.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSType21.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = null;
        boolean boolean28 = jSTypeRegistry25.resetImplicitPrototype(jSType26, objectType27);
        com.google.javascript.rhino.jstype.JSType jSType33 = jSTypeRegistry25.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = jSType33.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType35 = jSTypeRegistry7.createParameterizedType(objectType22, jSType33);
        java.util.Set set36 = parameterizedType35.getOwnPropertyNames();
        boolean boolean37 = parameterizedType35.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType38 = parameterizedType35.getIndexType();
        boolean boolean39 = cloneableList4.equals((java.lang.Object) parameterizedType35);
        boolean boolean40 = parameterizedType35.hasDisplayName();
        com.google.javascript.rhino.jstype.FunctionType functionType41 = parameterizedType35.toMaybeFunctionType();
        boolean boolean43 = parameterizedType35.removeProperty("{proxy:{proxy:{1168420562}}}");
        boolean boolean45 = parameterizedType35.isPropertyTypeDeclared("{proxy:{proxy:{628733757}}}");
        com.google.javascript.rhino.jstype.FunctionType functionType46 = parameterizedType35.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType47 = parameterizedType35.dereference();
        boolean boolean48 = objectType47.isAllType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType21 and objectType47.", jSType21.equals(objectType47) == objectType47.equals(jSType21));
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test701");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable31 = parameterizedType30.getCtorExtendedInterfaces();
        boolean boolean32 = parameterizedType30.isNominalType();
        boolean boolean33 = parameterizedType30.isAllType();
        com.google.javascript.rhino.jstype.ObjectType objectType34 = parameterizedType30.getImplicitPrototype();
        boolean boolean35 = parameterizedType30.isUnknownType();
        com.google.javascript.rhino.jstype.FunctionType functionType36 = parameterizedType30.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType37 = parameterizedType30.dereference();
        java.lang.String str38 = parameterizedType30.toDebugHashCodeString();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test702");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        boolean boolean38 = jSTypeRegistry35.resetImplicitPrototype(jSType36, objectType37);
        com.google.javascript.rhino.jstype.JSType jSType43 = jSTypeRegistry35.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = jSType43.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSType43.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType46 = jSType43.restrictByNotNullOrUndefined();
        boolean boolean47 = parameterizedType30.canAssignTo(jSType43);
        boolean boolean49 = parameterizedType30.isPropertyTypeInferred("");
        boolean boolean50 = parameterizedType30.isInterface();
        int int51 = parameterizedType30.getPropertiesCount();
        boolean boolean52 = parameterizedType30.isArrayType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType53 = parameterizedType30.toMaybeParameterizedType();
        boolean boolean54 = parameterizedType53.isConstructor();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType53.", jSType16.equals(parameterizedType53) == parameterizedType53.equals(jSType16));
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test703");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray4 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType5 = jSTypeRegistry2.createUnionType(jSTypeNativeArray4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        boolean boolean17 = jSTypeRegistry14.resetImplicitPrototype(jSType15, objectType16);
        com.google.javascript.rhino.jstype.JSType jSType22 = jSTypeRegistry14.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType23 = jSType22.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24, true);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType28 = null;
        boolean boolean29 = jSTypeRegistry26.resetImplicitPrototype(jSType27, objectType28);
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry26.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSType34.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType36 = jSTypeRegistry8.createParameterizedType(objectType23, jSType34);
        java.util.Set set37 = parameterizedType36.getOwnPropertyNames();
        boolean boolean38 = parameterizedType36.hasReferenceName();
        boolean boolean39 = parameterizedType36.hasAnyTemplateInternal();
        boolean boolean40 = parameterizedType36.isOrdinaryFunction();
        boolean boolean41 = parameterizedType36.isInstanceType();
        com.google.javascript.rhino.jstype.JSType jSType43 = parameterizedType36.getPropertyType("{proxy:{proxy:{628733757}}}");
        com.google.javascript.rhino.jstype.ObjectType objectType44 = jSTypeRegistry2.createObjectType((com.google.javascript.rhino.jstype.ObjectType) parameterizedType36);
        boolean boolean45 = objectType44.isNumberObjectType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType22 and parameterizedType36.", jSType22.equals(parameterizedType36) == parameterizedType36.equals(jSType22));
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test704");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean4 = node3.isTrue();
        boolean boolean5 = node3.isOr();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean9 = node8.isTrue();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (byte) 0, node3, node8, 49, 49);
        com.google.javascript.rhino.InputId inputId13 = com.google.javascript.jscomp.NodeUtil.getInputId(node12);
        com.google.javascript.rhino.Node node14 = node12.getLastChild();
        boolean boolean15 = node14.isDefaultCase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node17 = node14.getChildAtIndex((int) '4');
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test705");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        boolean boolean3 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        boolean boolean18 = objectType17.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable19 = objectType17.getCtorImplementedInterfaces();
        boolean boolean20 = objectType17.isNativeObjectType();
        jSTypeRegistry2.registerPropertyOnType("", (com.google.javascript.rhino.jstype.JSType) objectType17);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        boolean boolean27 = jSTypeRegistry24.resetImplicitPrototype(jSType25, objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = null;
        boolean boolean33 = jSTypeRegistry30.resetImplicitPrototype(jSType31, objectType32);
        com.google.javascript.rhino.jstype.JSType jSType38 = jSTypeRegistry30.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType39 = jSType38.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        boolean boolean45 = jSTypeRegistry42.resetImplicitPrototype(jSType43, objectType44);
        com.google.javascript.rhino.jstype.JSType jSType50 = jSTypeRegistry42.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType51 = jSType50.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType52 = jSTypeRegistry24.createParameterizedType(objectType39, jSType50);
        java.util.Set set53 = parameterizedType52.getOwnPropertyNames();
        boolean boolean54 = parameterizedType52.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, true);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType59 = null;
        boolean boolean60 = jSTypeRegistry57.resetImplicitPrototype(jSType58, objectType59);
        com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry57.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType66 = jSType65.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType67 = jSType65.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType68 = jSType65.restrictByNotNullOrUndefined();
        boolean boolean69 = parameterizedType52.canAssignTo(jSType65);
        boolean boolean71 = parameterizedType52.isPropertyTypeInferred("");
        com.google.javascript.rhino.jstype.JSType jSType76 = jSTypeRegistry2.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) parameterizedType52, "hi!", "Named type with empty name component", 40, 39);
        boolean boolean78 = parameterizedType52.isPropertyTypeDeclared("unknown");
        boolean boolean79 = parameterizedType52.isOrdinaryFunction();
        com.google.javascript.rhino.JSDocInfo jSDocInfo81 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean82 = jSDocInfo81.isInterface();
        java.lang.String str83 = jSDocInfo81.getOriginalCommentString();
        boolean boolean84 = jSDocInfo81.hasEnumParameterType();
        boolean boolean85 = jSDocInfo81.hasModifies();
        boolean boolean86 = jSDocInfo81.isDefine();
        java.lang.String str87 = jSDocInfo81.getSourceName();
        boolean boolean88 = jSDocInfo81.isNoAlias();
        boolean boolean89 = jSDocInfo81.isExterns();
        parameterizedType52.setPropertyJSDocInfo("{proxy:{proxy:{724324866}}}", jSDocInfo81);
        java.lang.String str91 = jSDocInfo81.getMeaning();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType52.", jSType16.equals(parameterizedType52) == parameterizedType52.equals(jSType16));
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test706");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        boolean boolean4 = node2.isFalse();
        boolean boolean5 = node2.isScript();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList9 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node8);
        boolean boolean10 = node8.isString();
        node8.setSourceFileForTesting("hi!");
        com.google.javascript.rhino.Node node13 = node2.srcref(node8);
        com.google.javascript.rhino.Node node14 = node2.cloneNode();
        com.google.javascript.rhino.jstype.JSType jSType15 = node2.getJSType();
        node2.setLineno((int) (byte) 100);
        node2.setLength(30);
        boolean boolean20 = node2.isArrayLit();
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.ObjectType> objectTypeBuilder21 = com.google.common.collect.ImmutableList.builder();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        boolean boolean27 = jSTypeRegistry24.resetImplicitPrototype(jSType25, objectType26);
        com.google.javascript.rhino.jstype.JSType jSType32 = jSTypeRegistry24.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType33 = jSType32.dereference();
        boolean boolean34 = objectType33.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable35 = objectType33.getCtorImplementedInterfaces();
        boolean boolean36 = objectType33.isNativeObjectType();
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.ObjectType> objectTypeBuilder37 = objectTypeBuilder21.add(objectType33);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38, true);
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType42 = null;
        boolean boolean43 = jSTypeRegistry40.resetImplicitPrototype(jSType41, objectType42);
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44, true);
        com.google.javascript.rhino.jstype.JSType jSType47 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType48 = null;
        boolean boolean49 = jSTypeRegistry46.resetImplicitPrototype(jSType47, objectType48);
        com.google.javascript.rhino.jstype.JSType jSType54 = jSTypeRegistry46.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType55 = jSType54.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56, true);
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType60 = null;
        boolean boolean61 = jSTypeRegistry58.resetImplicitPrototype(jSType59, objectType60);
        com.google.javascript.rhino.jstype.JSType jSType66 = jSTypeRegistry58.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType67 = jSType66.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType68 = jSTypeRegistry40.createParameterizedType(objectType55, jSType66);
        java.util.Set set69 = parameterizedType68.getOwnPropertyNames();
        boolean boolean70 = parameterizedType68.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType71 = parameterizedType68.getIndexType();
        com.google.javascript.rhino.ErrorReporter errorReporter72 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry74 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter72, true);
        com.google.javascript.rhino.jstype.JSType jSType75 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType76 = null;
        boolean boolean77 = jSTypeRegistry74.resetImplicitPrototype(jSType75, objectType76);
        com.google.javascript.rhino.jstype.JSType jSType82 = jSTypeRegistry74.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType83 = jSType82.dereference();
        boolean boolean84 = objectType83.isRegexpType();
        boolean boolean86 = objectType83.isPropertyTypeInferred("hi!");
        boolean boolean87 = parameterizedType68.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) objectType83);
        java.lang.String str88 = parameterizedType68.toDebugHashCodeString();
        boolean boolean90 = parameterizedType68.hasOwnProperty("");
        boolean boolean91 = parameterizedType68.isNullType();
        boolean boolean93 = parameterizedType68.isPropertyTypeDeclared("{proxy:{proxy:{1874555938}}}");
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.ObjectType> objectTypeBuilder94 = objectTypeBuilder21.add((com.google.javascript.rhino.jstype.ObjectType) parameterizedType68);
        com.google.javascript.rhino.jstype.JSType jSType96 = parameterizedType68.findPropertyType("function (): {proxy:{754195252}}");
        node2.setJSType((com.google.javascript.rhino.jstype.JSType) parameterizedType68);
        node2.detachChildren();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType32 and parameterizedType68.", jSType32.equals(parameterizedType68) == parameterizedType68.equals(jSType32));
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test707");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        jSTypeRegistry2.forwardDeclareType("Unknown class name");
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        boolean boolean17 = jSTypeRegistry14.resetImplicitPrototype(jSType15, objectType16);
        com.google.javascript.rhino.jstype.JSType jSType22 = jSTypeRegistry14.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType23 = jSType22.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24, true);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType28 = null;
        boolean boolean29 = jSTypeRegistry26.resetImplicitPrototype(jSType27, objectType28);
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry26.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSType34.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType36 = jSTypeRegistry8.createParameterizedType(objectType23, jSType34);
        java.util.Set set37 = parameterizedType36.getOwnPropertyNames();
        boolean boolean38 = parameterizedType36.isNoObjectType();
        boolean boolean39 = parameterizedType36.isAllType();
        com.google.javascript.rhino.jstype.ObjectType objectType40 = jSTypeRegistry2.createObjectType((com.google.javascript.rhino.jstype.ObjectType) parameterizedType36);
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType41 = parameterizedType36.toMaybeParameterizedType();
        boolean boolean42 = parameterizedType41.isNominalType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType22 and parameterizedType41.", jSType22.equals(parameterizedType41) == parameterizedType41.equals(jSType22));
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test708");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        boolean boolean10 = jSTypeRegistry7.resetImplicitPrototype(jSType8, objectType9);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, true);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        boolean boolean16 = jSTypeRegistry13.resetImplicitPrototype(jSType14, objectType15);
        com.google.javascript.rhino.jstype.JSType jSType21 = jSTypeRegistry13.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSType21.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = null;
        boolean boolean28 = jSTypeRegistry25.resetImplicitPrototype(jSType26, objectType27);
        com.google.javascript.rhino.jstype.JSType jSType33 = jSTypeRegistry25.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = jSType33.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType35 = jSTypeRegistry7.createParameterizedType(objectType22, jSType33);
        java.util.Set set36 = parameterizedType35.getOwnPropertyNames();
        boolean boolean37 = parameterizedType35.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType38 = parameterizedType35.getIndexType();
        boolean boolean39 = cloneableList4.equals((java.lang.Object) parameterizedType35);
        boolean boolean40 = parameterizedType35.hasDisplayName();
        com.google.javascript.rhino.jstype.FunctionType functionType41 = parameterizedType35.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.jstype.JSType jSType43 = parameterizedType35.getGreatestSubtype(jSType42);
        com.google.javascript.rhino.jstype.JSType jSType44 = parameterizedType35.collapseUnion();
        com.google.javascript.rhino.JSDocInfo jSDocInfo46 = parameterizedType35.getOwnPropertyJSDocInfo("function (): {proxy:{700130429}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType21 and parameterizedType35.", jSType21.equals(parameterizedType35) == parameterizedType35.equals(jSType21));
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test709");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean7 = node6.isFalse();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean11 = node10.isTrue();
        boolean boolean12 = node10.hasOneChild();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean16 = node15.isTrue();
        boolean boolean17 = node15.isBreak();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (byte) 1, node3, node6, node10, node15, (int) (byte) 1, 4095);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable21 = node20.children();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean29 = node28.isFalse();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean33 = node32.isTrue();
        boolean boolean34 = node32.hasOneChild();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean38 = node37.isTrue();
        boolean boolean39 = node37.isBreak();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((int) (byte) 1, node25, node28, node32, node37, (int) (byte) 1, 4095);
        com.google.javascript.rhino.Node node43 = node20.useSourceInfoIfMissingFromForTree(node37);
        boolean boolean44 = node20.isDefaultCase();
        node20.putIntProp((int) (short) -1, 0);
        boolean boolean48 = node20.isGetterDef();
        boolean boolean49 = node20.isComma();
        boolean boolean50 = node20.isLabelName();
        boolean boolean51 = node20.isExprResult();
        boolean boolean52 = node20.isBreak();
        com.google.javascript.rhino.Node node53 = node20.cloneTree();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean61 = node60.isFalse();
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean65 = node64.isTrue();
        boolean boolean66 = node64.hasOneChild();
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean70 = node69.isTrue();
        boolean boolean71 = node69.isBreak();
        com.google.javascript.rhino.Node node74 = new com.google.javascript.rhino.Node((int) (byte) 1, node57, node60, node64, node69, (int) (byte) 1, 4095);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable75 = node74.children();
        boolean boolean76 = node74.isGetterDef();
        com.google.javascript.rhino.Node node77 = node20.srcrefTree(node74);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node79 = node77.getChildAtIndex(39);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test710");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNominalType();
        com.google.javascript.rhino.jstype.JSType jSType33 = parameterizedType30.collapseUnion();
        boolean boolean34 = parameterizedType30.isParameterizedType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test711");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType33 = parameterizedType30.getIndexType();
        java.lang.String str34 = parameterizedType30.toDebugHashCodeString();
        boolean boolean35 = parameterizedType30.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType40 = null;
        boolean boolean41 = jSTypeRegistry38.resetImplicitPrototype(jSType39, objectType40);
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, true);
        com.google.javascript.rhino.jstype.JSType jSType45 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        boolean boolean47 = jSTypeRegistry44.resetImplicitPrototype(jSType45, objectType46);
        com.google.javascript.rhino.jstype.JSType jSType52 = jSTypeRegistry44.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType53 = jSType52.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType58 = null;
        boolean boolean59 = jSTypeRegistry56.resetImplicitPrototype(jSType57, objectType58);
        com.google.javascript.rhino.jstype.JSType jSType64 = jSTypeRegistry56.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType65 = jSType64.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType66 = jSTypeRegistry38.createParameterizedType(objectType53, jSType64);
        java.util.Set set67 = parameterizedType66.getOwnPropertyNames();
        boolean boolean68 = parameterizedType66.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType69 = parameterizedType66.getIndexType();
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry72 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70, true);
        com.google.javascript.rhino.jstype.JSType jSType73 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType74 = null;
        boolean boolean75 = jSTypeRegistry72.resetImplicitPrototype(jSType73, objectType74);
        com.google.javascript.rhino.jstype.JSType jSType80 = jSTypeRegistry72.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType81 = jSType80.dereference();
        boolean boolean82 = objectType81.isRegexpType();
        boolean boolean84 = objectType81.isPropertyTypeInferred("hi!");
        boolean boolean85 = parameterizedType66.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) objectType81);
        java.lang.String str86 = parameterizedType66.toDebugHashCodeString();
        boolean boolean88 = parameterizedType66.hasOwnProperty("");
        boolean boolean89 = parameterizedType66.isNullType();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair90 = parameterizedType30.getTypesUnderInequality((com.google.javascript.rhino.jstype.JSType) parameterizedType66);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot92 = parameterizedType30.getOwnSlot("{proxy:{proxy:{1584525195}}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType66.", jSType16.equals(parameterizedType66) == parameterizedType66.equals(jSType16));
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test712");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.hasReferenceName();
        boolean boolean33 = parameterizedType30.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.JSType jSType35 = parameterizedType30.findPropertyType("");
        java.lang.String str36 = parameterizedType30.getReferenceName();
        com.google.javascript.rhino.jstype.UnionType unionType37 = parameterizedType30.toMaybeUnionType();
        boolean boolean39 = parameterizedType30.hasOwnProperty("function (): {proxy:{1262905525}}");
        com.google.javascript.rhino.JSDocInfo jSDocInfo40 = parameterizedType30.getJSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = parameterizedType30.getJSDocInfo();
        java.lang.String str42 = parameterizedType30.getReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = null;
        boolean boolean48 = jSTypeRegistry45.resetImplicitPrototype(jSType46, objectType47);
        com.google.javascript.rhino.jstype.JSType jSType53 = jSTypeRegistry45.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType54 = jSType53.dereference();
        boolean boolean55 = objectType54.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable56 = objectType54.getCtorImplementedInterfaces();
        boolean boolean57 = objectType54.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter58 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter58, true);
        com.google.javascript.rhino.jstype.JSType jSType61 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType62 = null;
        boolean boolean63 = jSTypeRegistry60.resetImplicitPrototype(jSType61, objectType62);
        com.google.javascript.rhino.jstype.JSType jSType68 = jSTypeRegistry60.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType69 = jSType68.dereference();
        boolean boolean70 = objectType69.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable71 = objectType69.getCtorImplementedInterfaces();
        boolean boolean72 = objectType69.isNativeObjectType();
        boolean boolean73 = objectType54.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType69);
        boolean boolean75 = objectType54.hasProperty("hi!");
        com.google.javascript.rhino.jstype.JSType jSType76 = objectType54.autobox();
        boolean boolean77 = objectType54.isEmptyType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable78 = objectType54.getCtorImplementedInterfaces();
        boolean boolean79 = objectType54.isNoResolvedType();
        com.google.javascript.rhino.jstype.ObjectType objectType80 = objectType54.toObjectType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue81 = parameterizedType30.testForEquality((com.google.javascript.rhino.jstype.JSType) objectType80);
        boolean boolean82 = objectType80.hasDisplayName();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test713");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNominalType();
        com.google.javascript.rhino.jstype.JSType jSType33 = parameterizedType30.collapseUnion();
        boolean boolean34 = jSType33.isNoObjectType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and jSType33.", jSType16.equals(jSType33) == jSType33.equals(jSType16));
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test714");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.hasReferenceName();
        boolean boolean33 = parameterizedType30.hasAnyTemplateInternal();
        boolean boolean34 = parameterizedType30.isInstanceType();
        boolean boolean35 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType37 = parameterizedType30.findPropertyType("{proxy:{proxy:{1317500836}}}");
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType38 = parameterizedType30.toMaybeParameterizedType();
        boolean boolean39 = parameterizedType38.isArrayType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType38.", jSType16.equals(parameterizedType38) == parameterizedType38.equals(jSType16));
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test715");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        boolean boolean10 = jSTypeRegistry7.resetImplicitPrototype(jSType8, objectType9);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, true);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        boolean boolean16 = jSTypeRegistry13.resetImplicitPrototype(jSType14, objectType15);
        com.google.javascript.rhino.jstype.JSType jSType21 = jSTypeRegistry13.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSType21.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = null;
        boolean boolean28 = jSTypeRegistry25.resetImplicitPrototype(jSType26, objectType27);
        com.google.javascript.rhino.jstype.JSType jSType33 = jSTypeRegistry25.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = jSType33.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType35 = jSTypeRegistry7.createParameterizedType(objectType22, jSType33);
        java.util.Set set36 = parameterizedType35.getOwnPropertyNames();
        boolean boolean37 = parameterizedType35.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType38 = parameterizedType35.getIndexType();
        boolean boolean39 = cloneableList4.equals((java.lang.Object) parameterizedType35);
        boolean boolean40 = parameterizedType35.hasDisplayName();
        com.google.javascript.rhino.jstype.FunctionType functionType41 = parameterizedType35.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType42 = parameterizedType35.toMaybeParameterizedType();
        com.google.javascript.rhino.jstype.UnionType unionType43 = parameterizedType35.toMaybeUnionType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType21 and parameterizedType35.", jSType21.equals(parameterizedType35) == parameterizedType35.equals(jSType21));
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test716");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType33 = parameterizedType30.getIndexType();
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType38 = null;
        boolean boolean39 = jSTypeRegistry36.resetImplicitPrototype(jSType37, objectType38);
        com.google.javascript.rhino.jstype.JSType jSType44 = jSTypeRegistry36.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSType44.dereference();
        boolean boolean46 = objectType45.isRegexpType();
        boolean boolean48 = objectType45.isPropertyTypeInferred("hi!");
        boolean boolean49 = parameterizedType30.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) objectType45);
        java.lang.String str50 = parameterizedType30.toDebugHashCodeString();
        com.google.javascript.rhino.Node node51 = parameterizedType30.getRootNode();
        com.google.javascript.rhino.JSDocInfo jSDocInfo52 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean53 = jSDocInfo52.isInterface();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection54 = jSDocInfo52.getMarkers();
        parameterizedType30.setJSDocInfo(jSDocInfo52);
        boolean boolean56 = parameterizedType30.isCheckedUnknownType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType57 = parameterizedType30.toMaybeParameterizedType();
        int int58 = parameterizedType57.getPropertiesCount();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType57.", jSType16.equals(parameterizedType57) == parameterizedType57.equals(jSType16));
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test717");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(52, nodeArray1, 49, 38);
        boolean boolean5 = node4.isDo();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable6 = node4.children();
        node4.setLineno(16);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder9 = node4.new FileLevelJsDocBuilder();
        boolean boolean11 = node4.getBooleanProp(51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node13 = node4.getChildAtIndex(8);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test718");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        boolean boolean33 = parameterizedType30.isAllType();
        com.google.javascript.rhino.jstype.FunctionType functionType34 = parameterizedType30.getConstructor();
        boolean boolean36 = parameterizedType30.removeProperty("Unknown class name");
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37, true);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType41 = null;
        boolean boolean42 = jSTypeRegistry39.resetImplicitPrototype(jSType40, objectType41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = jSTypeRegistry39.getErrorReporter();
        jSTypeRegistry39.clearNamedTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, true);
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean56 = node55.isFalse();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean60 = node59.isTrue();
        boolean boolean61 = node59.hasOneChild();
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean65 = node64.isTrue();
        boolean boolean66 = node64.isBreak();
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node((int) (byte) 1, node52, node55, node59, node64, (int) (byte) 1, 4095);
        boolean boolean70 = node52.isDelProp();
        com.google.javascript.rhino.ErrorReporter errorReporter71 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter71, true);
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType75 = null;
        boolean boolean76 = jSTypeRegistry73.resetImplicitPrototype(jSType74, objectType75);
        com.google.javascript.rhino.jstype.JSType jSType81 = jSTypeRegistry73.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType82 = jSType81.dereference();
        boolean boolean83 = objectType82.isFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType84 = jSTypeRegistry47.createObjectType("hi!", node52, objectType82);
        boolean boolean85 = objectType82.isEnumType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo86 = null;
        objectType82.setJSDocInfo(jSDocInfo86);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray89 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType90 = jSTypeRegistry39.createConstructorType((com.google.javascript.rhino.jstype.JSType) objectType82, false, jSTypeArray89);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable91 = functionType90.getParameters();
        com.google.javascript.rhino.ErrorReporter errorReporter92 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry94 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter92, true);
        com.google.javascript.rhino.jstype.ObjectType objectType95 = jSTypeRegistry94.createAnonymousObjectType();
        boolean boolean96 = functionType90.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) objectType95);
        parameterizedType30.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType90);
        com.google.javascript.rhino.Node node98 = functionType90.getRootNode();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test719");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        boolean boolean10 = jSTypeRegistry7.resetImplicitPrototype(jSType8, objectType9);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, true);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        boolean boolean16 = jSTypeRegistry13.resetImplicitPrototype(jSType14, objectType15);
        com.google.javascript.rhino.jstype.JSType jSType21 = jSTypeRegistry13.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSType21.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = null;
        boolean boolean28 = jSTypeRegistry25.resetImplicitPrototype(jSType26, objectType27);
        com.google.javascript.rhino.jstype.JSType jSType33 = jSTypeRegistry25.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = jSType33.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType35 = jSTypeRegistry7.createParameterizedType(objectType22, jSType33);
        java.util.Set set36 = parameterizedType35.getOwnPropertyNames();
        boolean boolean37 = parameterizedType35.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType38 = parameterizedType35.getIndexType();
        boolean boolean39 = cloneableList4.equals((java.lang.Object) parameterizedType35);
        boolean boolean40 = parameterizedType35.hasDisplayName();
        com.google.javascript.rhino.jstype.FunctionType functionType41 = parameterizedType35.toMaybeFunctionType();
        boolean boolean43 = parameterizedType35.removeProperty("{proxy:{proxy:{1168420562}}}");
        boolean boolean45 = parameterizedType35.isPropertyTypeDeclared("{proxy:{proxy:{628733757}}}");
        com.google.javascript.rhino.jstype.FunctionType functionType46 = parameterizedType35.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType47 = parameterizedType35.dereference();
        boolean boolean48 = parameterizedType35.isNominalType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType21 and parameterizedType35.", jSType21.equals(parameterizedType35) == parameterizedType35.equals(jSType21));
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test720");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable5 = jSTypeRegistry2.getTypesWithProperty("function (): {proxy:{1288677244}}");
        jSTypeRegistry2.identifyNonNullableName("");
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry2.getTypesWithProperty("{proxy:{proxy:{1651679796}}}");
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, true);
        boolean boolean14 = jSTypeRegistry13.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.ObjectType objectType15 = jSTypeRegistry13.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        boolean boolean22 = jSTypeRegistry19.resetImplicitPrototype(jSType20, objectType21);
        com.google.javascript.rhino.jstype.JSType jSType27 = jSTypeRegistry19.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType28 = jSType27.dereference();
        boolean boolean29 = objectType28.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable30 = objectType28.getCtorImplementedInterfaces();
        boolean boolean31 = objectType28.isNativeObjectType();
        jSTypeRegistry13.registerPropertyOnType("", (com.google.javascript.rhino.jstype.JSType) objectType28);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        boolean boolean38 = jSTypeRegistry35.resetImplicitPrototype(jSType36, objectType37);
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, true);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType43 = null;
        boolean boolean44 = jSTypeRegistry41.resetImplicitPrototype(jSType42, objectType43);
        com.google.javascript.rhino.jstype.JSType jSType49 = jSTypeRegistry41.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType50 = jSType49.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51, true);
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType55 = null;
        boolean boolean56 = jSTypeRegistry53.resetImplicitPrototype(jSType54, objectType55);
        com.google.javascript.rhino.jstype.JSType jSType61 = jSTypeRegistry53.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType62 = jSType61.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType63 = jSTypeRegistry35.createParameterizedType(objectType50, jSType61);
        java.util.Set set64 = parameterizedType63.getOwnPropertyNames();
        boolean boolean65 = parameterizedType63.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry68 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter66, true);
        com.google.javascript.rhino.jstype.JSType jSType69 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType70 = null;
        boolean boolean71 = jSTypeRegistry68.resetImplicitPrototype(jSType69, objectType70);
        com.google.javascript.rhino.jstype.JSType jSType76 = jSTypeRegistry68.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType77 = jSType76.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType78 = jSType76.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType79 = jSType76.restrictByNotNullOrUndefined();
        boolean boolean80 = parameterizedType63.canAssignTo(jSType76);
        boolean boolean82 = parameterizedType63.isPropertyTypeInferred("");
        com.google.javascript.rhino.jstype.JSType jSType87 = jSTypeRegistry13.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) parameterizedType63, "hi!", "Named type with empty name component", 40, 39);
        boolean boolean89 = parameterizedType63.isPropertyTypeDeclared("unknown");
        boolean boolean90 = parameterizedType63.hasCachedValues();
        boolean boolean91 = parameterizedType63.isNoType();
        com.google.javascript.rhino.Node node93 = parameterizedType63.getPropertyNode("");
        boolean boolean94 = parameterizedType63.isRegexpType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType95 = parameterizedType63.toMaybeParameterizedType();
        boolean boolean96 = jSTypeRegistry2.declareType("InputId: function (): {proxy:{410214344}}", (com.google.javascript.rhino.jstype.JSType) parameterizedType63);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType27 and parameterizedType63.", jSType27.equals(parameterizedType63) == parameterizedType63.equals(jSType27));
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test721");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable31 = parameterizedType30.getCtorExtendedInterfaces();
        boolean boolean32 = parameterizedType30.isNominalType();
        boolean boolean33 = parameterizedType30.isAllType();
        boolean boolean34 = parameterizedType30.isUnknownType();
        int int35 = parameterizedType30.getPropertiesCount();
        boolean boolean36 = parameterizedType30.isRegexpType();
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37, true);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType41 = null;
        boolean boolean42 = jSTypeRegistry39.resetImplicitPrototype(jSType40, objectType41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = null;
        boolean boolean48 = jSTypeRegistry45.resetImplicitPrototype(jSType46, objectType47);
        com.google.javascript.rhino.jstype.JSType jSType53 = jSTypeRegistry45.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType54 = jSType53.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, true);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType59 = null;
        boolean boolean60 = jSTypeRegistry57.resetImplicitPrototype(jSType58, objectType59);
        com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry57.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType66 = jSType65.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType67 = jSTypeRegistry39.createParameterizedType(objectType54, jSType65);
        java.util.Set set68 = parameterizedType67.getOwnPropertyNames();
        boolean boolean69 = parameterizedType67.hasReferenceName();
        boolean boolean70 = parameterizedType67.hasAnyTemplateInternal();
        boolean boolean71 = parameterizedType67.isOrdinaryFunction();
        boolean boolean72 = parameterizedType67.isInstanceType();
        boolean boolean74 = parameterizedType67.isPropertyTypeDeclared("{proxy:{proxy:{1216263713}}}");
        com.google.javascript.rhino.jstype.JSType.TypePair typePair75 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) parameterizedType30, (com.google.javascript.rhino.jstype.JSType) parameterizedType67);
        com.google.javascript.rhino.JSDocInfo jSDocInfo77 = parameterizedType30.getOwnPropertyJSDocInfo("{proxy:{proxy:{268143200}}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType67.", jSType16.equals(parameterizedType67) == parameterizedType67.equals(jSType16));
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test722");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList7 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node6);
        boolean boolean8 = node6.isFalse();
        boolean boolean9 = node6.isScript();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList13 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node12);
        boolean boolean14 = node12.isString();
        node12.setSourceFileForTesting("hi!");
        com.google.javascript.rhino.Node node17 = node6.srcref(node12);
        node2.addChildrenToBack(node6);
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean20 = jSDocInfo19.isInterface();
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean22 = jSDocInfo21.isInterface();
        java.lang.String str23 = jSDocInfo21.getOriginalCommentString();
        boolean boolean24 = jSDocInfo21.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo jSDocInfo25 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean26 = jSDocInfo25.isInterface();
        jSDocInfo25.setLicense("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean30 = jSDocInfo29.isInterface();
        java.lang.String str31 = jSDocInfo29.getOriginalCommentString();
        boolean boolean32 = jSDocInfo29.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean34 = jSDocInfo33.isInterface();
        boolean boolean35 = jSDocInfo33.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression36 = jSDocInfo33.getEnumParameterType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo37 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean38 = jSDocInfo37.isInterface();
        jSDocInfo37.setLicense("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean42 = jSDocInfo41.isInterface();
        boolean boolean43 = jSDocInfo41.hasType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo44 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean45 = jSDocInfo44.isInterface();
        boolean boolean46 = jSDocInfo44.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression47 = jSDocInfo44.getEnumParameterType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo48 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean49 = jSDocInfo48.isInterface();
        boolean boolean50 = jSDocInfo48.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression51 = jSDocInfo48.getEnumParameterType();
        boolean boolean52 = jSDocInfo48.containsDeclaration();
        com.google.javascript.rhino.JSDocInfo jSDocInfo53 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean54 = jSDocInfo53.isInterface();
        java.lang.String str55 = jSDocInfo53.getOriginalCommentString();
        boolean boolean56 = jSDocInfo53.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo jSDocInfo57 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean58 = jSDocInfo57.isInterface();
        java.lang.String str59 = jSDocInfo57.getOriginalCommentString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression60 = jSDocInfo57.getType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo61 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean62 = jSDocInfo61.isInterface();
        jSDocInfo61.setLicense("");
        boolean boolean65 = jSDocInfo61.isNoAlias();
        com.google.javascript.rhino.JSDocInfo jSDocInfo66 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean67 = jSDocInfo66.isInterface();
        jSDocInfo66.setLicense("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo70 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean71 = jSDocInfo70.isInterface();
        boolean boolean72 = jSDocInfo70.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression73 = jSDocInfo70.getEnumParameterType();
        boolean boolean74 = jSDocInfo70.containsDeclaration();
        com.google.javascript.rhino.JSDocInfo[] jSDocInfoArray75 = new com.google.javascript.rhino.JSDocInfo[] { jSDocInfo66, jSDocInfo70 };
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList76 = com.google.common.collect.ImmutableList.of(jSDocInfo19, jSDocInfo21, jSDocInfo25, jSDocInfo29, jSDocInfo33, jSDocInfo37, jSDocInfo41, jSDocInfo44, jSDocInfo48, jSDocInfo53, jSDocInfo57, jSDocInfo61, jSDocInfoArray75);
        jSDocInfo33.setDeprecated(false);
        com.google.javascript.rhino.Node node82 = new com.google.javascript.rhino.Node(43, 12, (int) (short) -1);
        boolean boolean83 = node82.isScript();
        jSDocInfo33.setAssociatedNode(node82);
        com.google.javascript.rhino.Node node85 = node6.srcrefTree(node82);
        node85.setWasEmptyNode(false);
        com.google.javascript.rhino.InputId inputId88 = node85.getInputId();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable89 = node85.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node91 = node85.getChildAtIndex(46);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test723");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType33 = parameterizedType30.getIndexType();
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType38 = null;
        boolean boolean39 = jSTypeRegistry36.resetImplicitPrototype(jSType37, objectType38);
        com.google.javascript.rhino.jstype.JSType jSType44 = jSTypeRegistry36.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSType44.dereference();
        boolean boolean46 = objectType45.isRegexpType();
        boolean boolean48 = objectType45.isPropertyTypeInferred("hi!");
        boolean boolean49 = parameterizedType30.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) objectType45);
        java.lang.String str50 = parameterizedType30.toDebugHashCodeString();
        com.google.javascript.rhino.Node node51 = parameterizedType30.getRootNode();
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, true);
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType56 = null;
        boolean boolean57 = jSTypeRegistry54.resetImplicitPrototype(jSType55, objectType56);
        com.google.javascript.rhino.ErrorReporter errorReporter58 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter58, true);
        com.google.javascript.rhino.jstype.JSType jSType61 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType62 = null;
        boolean boolean63 = jSTypeRegistry60.resetImplicitPrototype(jSType61, objectType62);
        com.google.javascript.rhino.jstype.JSType jSType68 = jSTypeRegistry60.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType69 = jSType68.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry72 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70, true);
        com.google.javascript.rhino.jstype.JSType jSType73 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType74 = null;
        boolean boolean75 = jSTypeRegistry72.resetImplicitPrototype(jSType73, objectType74);
        com.google.javascript.rhino.jstype.JSType jSType80 = jSTypeRegistry72.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType81 = jSType80.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType82 = jSTypeRegistry54.createParameterizedType(objectType69, jSType80);
        java.util.Set set83 = parameterizedType82.getOwnPropertyNames();
        boolean boolean84 = parameterizedType82.hasReferenceName();
        boolean boolean85 = parameterizedType82.hasAnyTemplateInternal();
        boolean boolean86 = parameterizedType82.isOrdinaryFunction();
        boolean boolean87 = parameterizedType82.isInstanceType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo89 = parameterizedType82.getOwnPropertyJSDocInfo("unknown");
        boolean boolean90 = parameterizedType82.isNoType();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair91 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) parameterizedType30, (com.google.javascript.rhino.jstype.JSType) parameterizedType82);
        boolean boolean92 = parameterizedType30.isCheckedUnknownType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType82.", jSType16.equals(parameterizedType82) == parameterizedType82.equals(jSType16));
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test724");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        jSTypeRegistry2.forwardDeclareType("Unknown class name");
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        boolean boolean17 = jSTypeRegistry14.resetImplicitPrototype(jSType15, objectType16);
        com.google.javascript.rhino.jstype.JSType jSType22 = jSTypeRegistry14.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType23 = jSType22.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24, true);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType28 = null;
        boolean boolean29 = jSTypeRegistry26.resetImplicitPrototype(jSType27, objectType28);
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry26.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSType34.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType36 = jSTypeRegistry8.createParameterizedType(objectType23, jSType34);
        java.util.Set set37 = parameterizedType36.getOwnPropertyNames();
        boolean boolean38 = parameterizedType36.isNoObjectType();
        boolean boolean39 = parameterizedType36.isAllType();
        com.google.javascript.rhino.jstype.ObjectType objectType40 = jSTypeRegistry2.createObjectType((com.google.javascript.rhino.jstype.ObjectType) parameterizedType36);
        boolean boolean41 = parameterizedType36.isStringValueType();
        boolean boolean42 = parameterizedType36.isNoType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType43 = parameterizedType36.toMaybeParameterizedType();
        com.google.javascript.rhino.jstype.JSType jSType45 = parameterizedType43.findPropertyType("{proxy:{proxy:{1940144520}}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType22 and parameterizedType43.", jSType22.equals(parameterizedType43) == parameterizedType43.equals(jSType22));
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test725");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(0, "{proxy:{proxy:{1126014922}}}");
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        boolean boolean8 = jSTypeRegistry5.resetImplicitPrototype(jSType6, objectType7);
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        boolean boolean14 = jSTypeRegistry11.resetImplicitPrototype(jSType12, objectType13);
        com.google.javascript.rhino.jstype.JSType jSType19 = jSTypeRegistry11.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSType19.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = null;
        boolean boolean26 = jSTypeRegistry23.resetImplicitPrototype(jSType24, objectType25);
        com.google.javascript.rhino.jstype.JSType jSType31 = jSTypeRegistry23.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSType31.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType33 = jSTypeRegistry5.createParameterizedType(objectType20, jSType31);
        java.util.Set set34 = parameterizedType33.getOwnPropertyNames();
        boolean boolean35 = parameterizedType33.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType36 = parameterizedType33.getIndexType();
        java.lang.String str37 = parameterizedType33.toDebugHashCodeString();
        boolean boolean38 = parameterizedType33.isInterface();
        com.google.javascript.rhino.Node node39 = parameterizedType33.getRootNode();
        boolean boolean41 = parameterizedType33.removeProperty("function (): {proxy:{1553899974}}");
        boolean boolean42 = parameterizedType33.isInterface();
        boolean boolean43 = parameterizedType33.isDateType();
        java.lang.String str44 = parameterizedType33.getReferenceName();
        java.util.Set<java.lang.String> strSet45 = parameterizedType33.getOwnPropertyNames();
        node2.setDirectives(strSet45);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType19 and parameterizedType33.", jSType19.equals(parameterizedType33) == parameterizedType33.equals(jSType19));
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test726");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        boolean boolean17 = jSTypeRegistry14.resetImplicitPrototype(jSType15, objectType16);
        com.google.javascript.rhino.jstype.JSType jSType22 = jSTypeRegistry14.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType23 = jSType22.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24, true);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType28 = null;
        boolean boolean29 = jSTypeRegistry26.resetImplicitPrototype(jSType27, objectType28);
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry26.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSType34.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType36 = jSTypeRegistry8.createParameterizedType(objectType23, jSType34);
        java.util.Set set37 = parameterizedType36.getOwnPropertyNames();
        boolean boolean38 = parameterizedType36.hasReferenceName();
        boolean boolean39 = parameterizedType36.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.JSType jSType41 = parameterizedType36.findPropertyType("");
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry2.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) parameterizedType36);
        boolean boolean44 = jSTypeRegistry2.isForwardDeclaredType("function (): {proxy:{1923677176}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType22 and parameterizedType36.", jSType22.equals(parameterizedType36) == parameterizedType36.equals(jSType22));
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test727");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) -1, "");
        boolean boolean3 = node2.isVar();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean7 = node6.isTrue();
        node6.removeProp((int) (short) 10);
        node6.setOptionalArg(true);
        boolean boolean12 = node6.isNumber();
        boolean boolean13 = node6.isNumber();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean21 = node20.isFalse();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean25 = node24.isTrue();
        boolean boolean26 = node24.hasOneChild();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean30 = node29.isTrue();
        boolean boolean31 = node29.isBreak();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((int) (byte) 1, node17, node20, node24, node29, (int) (byte) 1, 4095);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable35 = node34.children();
        boolean boolean36 = node34.isGetterDef();
        node6.addChildToBack(node34);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean45 = node44.isFalse();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean49 = node48.isTrue();
        boolean boolean50 = node48.hasOneChild();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean54 = node53.isTrue();
        boolean boolean55 = node53.isBreak();
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node((int) (byte) 1, node41, node44, node48, node53, (int) (byte) 1, 4095);
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node(43, 12, (int) (short) -1);
        boolean boolean63 = node62.isScript();
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean67 = node66.isTrue();
        boolean boolean68 = node66.isBreak();
        boolean boolean69 = node66.isNot();
        node62.addChildrenToBack(node66);
        int int71 = node53.getIndexOfChild(node62);
        com.google.javascript.rhino.Node node72 = node6.srcrefTree(node53);
        boolean boolean73 = node6.isDelProp();
        node6.setSourceFileForTesting("{proxy:{proxy:{1317500836}}}");
        boolean boolean76 = node6.isGetProp();
        node6.detachChildren();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node78 = node2.getChildBefore(node6);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test728");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        jSTypeRegistry2.setLastGeneration(false);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        boolean boolean13 = jSTypeRegistry10.resetImplicitPrototype(jSType11, objectType12);
        com.google.javascript.rhino.jstype.JSType jSType18 = jSTypeRegistry10.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = jSType18.dereference();
        boolean boolean20 = objectType19.isFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType21 = jSTypeRegistry2.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType) objectType19);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = jSTypeRegistry2.getEachReferenceTypeWithProperty("({proxy:{proxy:{1874555938}}})");
        com.google.javascript.rhino.ErrorReporter errorReporter24 = jSTypeRegistry2.getErrorReporter();
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25, true);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        boolean boolean30 = jSTypeRegistry27.resetImplicitPrototype(jSType28, objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = null;
        boolean boolean36 = jSTypeRegistry33.resetImplicitPrototype(jSType34, objectType35);
        com.google.javascript.rhino.jstype.JSType jSType41 = jSTypeRegistry33.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType42 = jSType41.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = null;
        boolean boolean48 = jSTypeRegistry45.resetImplicitPrototype(jSType46, objectType47);
        com.google.javascript.rhino.jstype.JSType jSType53 = jSTypeRegistry45.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType54 = jSType53.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType55 = jSTypeRegistry27.createParameterizedType(objectType42, jSType53);
        java.util.Set set56 = parameterizedType55.getOwnPropertyNames();
        boolean boolean57 = parameterizedType55.hasReferenceName();
        boolean boolean58 = parameterizedType55.hasAnyTemplateInternal();
        boolean boolean59 = parameterizedType55.isOrdinaryFunction();
        boolean boolean60 = parameterizedType55.isInstanceType();
        com.google.javascript.rhino.jstype.JSType jSType62 = parameterizedType55.getPropertyType("{proxy:{proxy:{628733757}}}");
        boolean boolean63 = parameterizedType55.isFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType65 = parameterizedType55.findPropertyType("function (): {proxy:{1288677244}}");
        boolean boolean66 = parameterizedType55.hasReferenceName();
        boolean boolean67 = parameterizedType55.canBeCalled();
        boolean boolean69 = jSTypeRegistry2.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) parameterizedType55, "function (): {proxy:{333019360}}");
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType70 = parameterizedType55.toMaybeParameterizedType();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot72 = parameterizedType55.getOwnSlot("{proxy:{proxy:{1277232942}}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType18 and parameterizedType55.", jSType18.equals(parameterizedType55) == parameterizedType55.equals(jSType18));
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test729");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        boolean boolean3 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        boolean boolean18 = objectType17.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable19 = objectType17.getCtorImplementedInterfaces();
        boolean boolean20 = objectType17.isNativeObjectType();
        jSTypeRegistry2.registerPropertyOnType("", (com.google.javascript.rhino.jstype.JSType) objectType17);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        boolean boolean27 = jSTypeRegistry24.resetImplicitPrototype(jSType25, objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = null;
        boolean boolean33 = jSTypeRegistry30.resetImplicitPrototype(jSType31, objectType32);
        com.google.javascript.rhino.jstype.JSType jSType38 = jSTypeRegistry30.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType39 = jSType38.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        boolean boolean45 = jSTypeRegistry42.resetImplicitPrototype(jSType43, objectType44);
        com.google.javascript.rhino.jstype.JSType jSType50 = jSTypeRegistry42.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType51 = jSType50.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType52 = jSTypeRegistry24.createParameterizedType(objectType39, jSType50);
        java.util.Set set53 = parameterizedType52.getOwnPropertyNames();
        boolean boolean54 = parameterizedType52.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, true);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType59 = null;
        boolean boolean60 = jSTypeRegistry57.resetImplicitPrototype(jSType58, objectType59);
        com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry57.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType66 = jSType65.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType67 = jSType65.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType68 = jSType65.restrictByNotNullOrUndefined();
        boolean boolean69 = parameterizedType52.canAssignTo(jSType65);
        boolean boolean71 = parameterizedType52.isPropertyTypeInferred("");
        com.google.javascript.rhino.jstype.JSType jSType76 = jSTypeRegistry2.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) parameterizedType52, "hi!", "Named type with empty name component", 40, 39);
        boolean boolean78 = parameterizedType52.isPropertyTypeDeclared("unknown");
        boolean boolean79 = parameterizedType52.hasCachedValues();
        boolean boolean80 = parameterizedType52.isNoType();
        boolean boolean81 = parameterizedType52.isNoObjectType();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot83 = parameterizedType52.getSlot("");
        com.google.javascript.rhino.jstype.ObjectType objectType84 = parameterizedType52.toObjectType();
        boolean boolean86 = parameterizedType52.hasProperty("");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType52.", jSType16.equals(parameterizedType52) == parameterizedType52.equals(jSType16));
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test730");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        jSTypeRegistry2.setLastGeneration(false);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        boolean boolean13 = jSTypeRegistry10.resetImplicitPrototype(jSType11, objectType12);
        com.google.javascript.rhino.jstype.JSType jSType18 = jSTypeRegistry10.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = jSType18.dereference();
        boolean boolean20 = objectType19.isFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType21 = jSTypeRegistry2.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType) objectType19);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = jSTypeRegistry2.getEachReferenceTypeWithProperty("({proxy:{proxy:{1874555938}}})");
        com.google.javascript.rhino.ErrorReporter errorReporter24 = jSTypeRegistry2.getErrorReporter();
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25, true);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        boolean boolean30 = jSTypeRegistry27.resetImplicitPrototype(jSType28, objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = null;
        boolean boolean36 = jSTypeRegistry33.resetImplicitPrototype(jSType34, objectType35);
        com.google.javascript.rhino.jstype.JSType jSType41 = jSTypeRegistry33.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType42 = jSType41.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = null;
        boolean boolean48 = jSTypeRegistry45.resetImplicitPrototype(jSType46, objectType47);
        com.google.javascript.rhino.jstype.JSType jSType53 = jSTypeRegistry45.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType54 = jSType53.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType55 = jSTypeRegistry27.createParameterizedType(objectType42, jSType53);
        java.util.Set set56 = parameterizedType55.getOwnPropertyNames();
        boolean boolean57 = parameterizedType55.hasReferenceName();
        boolean boolean58 = parameterizedType55.hasAnyTemplateInternal();
        boolean boolean59 = parameterizedType55.isOrdinaryFunction();
        boolean boolean60 = parameterizedType55.isInstanceType();
        com.google.javascript.rhino.jstype.JSType jSType62 = parameterizedType55.getPropertyType("{proxy:{proxy:{628733757}}}");
        boolean boolean63 = parameterizedType55.isFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType65 = parameterizedType55.findPropertyType("function (): {proxy:{1288677244}}");
        boolean boolean66 = parameterizedType55.hasReferenceName();
        boolean boolean67 = parameterizedType55.canBeCalled();
        boolean boolean69 = jSTypeRegistry2.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) parameterizedType55, "function (): {proxy:{333019360}}");
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType70 = parameterizedType55.toMaybeParameterizedType();
        java.util.Set<java.lang.String> strSet71 = parameterizedType70.getOwnPropertyNames();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType18 and parameterizedType70.", jSType18.equals(parameterizedType70) == parameterizedType70.equals(jSType18));
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test731");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        boolean boolean38 = jSTypeRegistry35.resetImplicitPrototype(jSType36, objectType37);
        com.google.javascript.rhino.jstype.JSType jSType43 = jSTypeRegistry35.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = jSType43.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSType43.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType46 = jSType43.restrictByNotNullOrUndefined();
        boolean boolean47 = parameterizedType30.canAssignTo(jSType43);
        boolean boolean49 = parameterizedType30.isPropertyTypeInferred("");
        boolean boolean50 = parameterizedType30.isResolved();
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType30.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType53 = parameterizedType30.findPropertyType("{proxy:{proxy:{649633010}}}");
        boolean boolean54 = parameterizedType30.isNominalType();
        boolean boolean55 = parameterizedType30.matchesStringContext();
        boolean boolean56 = parameterizedType30.matchesNumberContext();
        boolean boolean57 = parameterizedType30.isUnknownType();
        boolean boolean58 = parameterizedType30.isNominalType();
        boolean boolean59 = parameterizedType30.isNativeObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType60 = parameterizedType30.toObjectType();
        com.google.javascript.rhino.jstype.UnionType unionType61 = parameterizedType30.toMaybeUnionType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test732");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        boolean boolean38 = jSTypeRegistry35.resetImplicitPrototype(jSType36, objectType37);
        com.google.javascript.rhino.jstype.JSType jSType43 = jSTypeRegistry35.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = jSType43.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSType43.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType46 = jSType43.restrictByNotNullOrUndefined();
        boolean boolean47 = parameterizedType30.canAssignTo(jSType43);
        boolean boolean49 = parameterizedType30.isPropertyTypeInferred("");
        boolean boolean50 = parameterizedType30.isResolved();
        boolean boolean51 = parameterizedType30.isInstanceType();
        boolean boolean52 = parameterizedType30.canBeCalled();
        java.util.Set<java.lang.String> strSet53 = parameterizedType30.getOwnPropertyNames();
        boolean boolean54 = parameterizedType30.isNoType();
        boolean boolean55 = parameterizedType30.isNominalConstructor();
        com.google.javascript.rhino.jstype.JSType jSType57 = parameterizedType30.findPropertyType("function (): {proxy:{1904311593}}");
        boolean boolean58 = jSType57.isString();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test733");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.hasReferenceName();
        boolean boolean33 = parameterizedType30.hasAnyTemplateInternal();
        boolean boolean34 = parameterizedType30.isNoResolvedType();
        boolean boolean35 = parameterizedType30.isNoResolvedType();
        boolean boolean36 = parameterizedType30.isBooleanObjectType();
        com.google.javascript.rhino.jstype.JSType jSType37 = parameterizedType30.autobox();
        boolean boolean38 = parameterizedType30.isAllType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test734");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        boolean boolean33 = parameterizedType30.isAllType();
        com.google.javascript.rhino.jstype.UnionType unionType34 = parameterizedType30.toMaybeUnionType();
        boolean boolean35 = parameterizedType30.isBooleanValueType();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType40 = null;
        boolean boolean41 = jSTypeRegistry38.resetImplicitPrototype(jSType39, objectType40);
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, true);
        com.google.javascript.rhino.jstype.JSType jSType45 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        boolean boolean47 = jSTypeRegistry44.resetImplicitPrototype(jSType45, objectType46);
        com.google.javascript.rhino.jstype.JSType jSType52 = jSTypeRegistry44.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType53 = jSType52.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType58 = null;
        boolean boolean59 = jSTypeRegistry56.resetImplicitPrototype(jSType57, objectType58);
        com.google.javascript.rhino.jstype.JSType jSType64 = jSTypeRegistry56.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType65 = jSType64.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType66 = jSTypeRegistry38.createParameterizedType(objectType53, jSType64);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable67 = parameterizedType66.getCtorExtendedInterfaces();
        boolean boolean68 = parameterizedType66.isNominalType();
        boolean boolean69 = parameterizedType66.isAllType();
        boolean boolean70 = parameterizedType66.isUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType72 = parameterizedType66.getPropertyType("{proxy:{proxy:{51735728}}}");
        com.google.javascript.rhino.JSDocInfo jSDocInfo74 = parameterizedType66.getOwnPropertyJSDocInfo("{proxy:{proxy:{1670357488}}}");
        java.lang.String str75 = parameterizedType66.toDebugHashCodeString();
        boolean boolean76 = parameterizedType30.canAssignTo((com.google.javascript.rhino.jstype.JSType) parameterizedType66);
        boolean boolean77 = parameterizedType66.hasDisplayName();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test735");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        boolean boolean10 = jSTypeRegistry7.resetImplicitPrototype(jSType8, objectType9);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, true);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        boolean boolean16 = jSTypeRegistry13.resetImplicitPrototype(jSType14, objectType15);
        com.google.javascript.rhino.jstype.JSType jSType21 = jSTypeRegistry13.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSType21.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = null;
        boolean boolean28 = jSTypeRegistry25.resetImplicitPrototype(jSType26, objectType27);
        com.google.javascript.rhino.jstype.JSType jSType33 = jSTypeRegistry25.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = jSType33.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType35 = jSTypeRegistry7.createParameterizedType(objectType22, jSType33);
        java.util.Set set36 = parameterizedType35.getOwnPropertyNames();
        boolean boolean37 = parameterizedType35.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType38 = parameterizedType35.getIndexType();
        boolean boolean39 = cloneableList4.equals((java.lang.Object) parameterizedType35);
        com.google.javascript.rhino.Node node41 = parameterizedType35.getPropertyNode("function (): {proxy:{1288677244}}");
        boolean boolean42 = parameterizedType35.isOrdinaryFunction();
        boolean boolean44 = parameterizedType35.isPropertyInExterns("function (): {proxy:{1975023194}}");
        boolean boolean45 = parameterizedType35.isNullable();
        com.google.javascript.rhino.Node node47 = parameterizedType35.getPropertyNode("function (): {proxy:{873111549}}");
        java.lang.String str48 = parameterizedType35.getReferenceName();
        com.google.javascript.rhino.JSDocInfo jSDocInfo49 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean50 = jSDocInfo49.isInterface();
        java.lang.String str51 = jSDocInfo49.getOriginalCommentString();
        boolean boolean52 = jSDocInfo49.isImplicitCast();
        java.lang.String str53 = jSDocInfo49.getLicense();
        parameterizedType35.setJSDocInfo(jSDocInfo49);
        com.google.javascript.rhino.jstype.JSType jSType55 = parameterizedType35.collapseUnion();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType56 = parameterizedType35.toMaybeEnumElementType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType21 and parameterizedType35.", jSType21.equals(parameterizedType35) == parameterizedType35.equals(jSType21));
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test736");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.jstype.JSType jSType10 = jSTypeRegistry2.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = jSType10.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        boolean boolean17 = jSTypeRegistry14.resetImplicitPrototype(jSType15, objectType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, true);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        boolean boolean35 = jSTypeRegistry32.resetImplicitPrototype(jSType33, objectType34);
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry32.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType41 = jSType40.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType42 = jSTypeRegistry14.createParameterizedType(objectType29, jSType40);
        java.util.Set set43 = parameterizedType42.getOwnPropertyNames();
        boolean boolean44 = parameterizedType42.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, true);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType49 = null;
        boolean boolean50 = jSTypeRegistry47.resetImplicitPrototype(jSType48, objectType49);
        com.google.javascript.rhino.jstype.JSType jSType55 = jSTypeRegistry47.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType56 = jSType55.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType57 = jSType55.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType58 = jSType55.restrictByNotNullOrUndefined();
        boolean boolean59 = parameterizedType42.canAssignTo(jSType55);
        boolean boolean61 = parameterizedType42.isPropertyTypeInferred("");
        boolean boolean62 = parameterizedType42.isResolved();
        com.google.javascript.rhino.jstype.ObjectType objectType63 = parameterizedType42.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType65 = parameterizedType42.findPropertyType("{proxy:{proxy:{649633010}}}");
        boolean boolean66 = parameterizedType42.isNominalType();
        boolean boolean67 = parameterizedType42.canBeCalled();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue68 = objectType11.testForEquality((com.google.javascript.rhino.jstype.JSType) parameterizedType42);
        com.google.javascript.rhino.JSDocInfo jSDocInfo69 = parameterizedType42.getJSDocInfo();
        boolean boolean71 = parameterizedType42.removeProperty("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType72 = parameterizedType42.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType73 = parameterizedType42.collapseUnion();
        boolean boolean75 = parameterizedType42.isPropertyTypeDeclared("{proxy:{proxy:{1680147791}}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType10 and parameterizedType42.", jSType10.equals(parameterizedType42) == parameterizedType42.equals(jSType10));
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test737");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.hasReferenceName();
        boolean boolean33 = parameterizedType30.hasAnyTemplateInternal();
        boolean boolean34 = parameterizedType30.isOrdinaryFunction();
        boolean boolean35 = parameterizedType30.isInstanceType();
        com.google.javascript.rhino.jstype.JSType jSType37 = parameterizedType30.getPropertyType("{proxy:{proxy:{628733757}}}");
        boolean boolean38 = parameterizedType30.isFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType40 = parameterizedType30.findPropertyType("function (): {proxy:{1288677244}}");
        boolean boolean41 = parameterizedType30.hasReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, true);
        com.google.javascript.rhino.jstype.JSType jSType45 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        boolean boolean47 = jSTypeRegistry44.resetImplicitPrototype(jSType45, objectType46);
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48, true);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType52 = null;
        boolean boolean53 = jSTypeRegistry50.resetImplicitPrototype(jSType51, objectType52);
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType58 = null;
        boolean boolean59 = jSTypeRegistry56.resetImplicitPrototype(jSType57, objectType58);
        com.google.javascript.rhino.jstype.JSType jSType64 = jSTypeRegistry56.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType65 = jSType64.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry68 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter66, true);
        com.google.javascript.rhino.jstype.JSType jSType69 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType70 = null;
        boolean boolean71 = jSTypeRegistry68.resetImplicitPrototype(jSType69, objectType70);
        com.google.javascript.rhino.jstype.JSType jSType76 = jSTypeRegistry68.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType77 = jSType76.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType78 = jSTypeRegistry50.createParameterizedType(objectType65, jSType76);
        java.util.Set set79 = parameterizedType78.getOwnPropertyNames();
        boolean boolean80 = parameterizedType78.hasReferenceName();
        boolean boolean81 = parameterizedType78.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.JSType jSType83 = parameterizedType78.findPropertyType("");
        com.google.javascript.rhino.jstype.JSType jSType84 = jSTypeRegistry44.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) parameterizedType78);
        parameterizedType30.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) parameterizedType78);
        com.google.javascript.rhino.jstype.ObjectType.Property property87 = parameterizedType78.getSlot("JSDocInfo");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test738");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        boolean boolean33 = parameterizedType30.isAllType();
        com.google.javascript.rhino.jstype.FunctionType functionType34 = parameterizedType30.getConstructor();
        boolean boolean35 = parameterizedType30.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType36 = parameterizedType30.getTypeOfThis();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType37 = parameterizedType30.toMaybeParameterizedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = parameterizedType30.getOwnPropertyJSDocInfo("function (): {proxy:{93547093}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test739");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        jSTypeRegistry2.setLastGeneration(false);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        boolean boolean13 = jSTypeRegistry10.resetImplicitPrototype(jSType11, objectType12);
        com.google.javascript.rhino.jstype.JSType jSType18 = jSTypeRegistry10.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = jSType18.dereference();
        boolean boolean20 = objectType19.isFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType21 = jSTypeRegistry2.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType) objectType19);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = jSTypeRegistry2.getEachReferenceTypeWithProperty("({proxy:{proxy:{1874555938}}})");
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24, true);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType28 = null;
        boolean boolean29 = jSTypeRegistry26.resetImplicitPrototype(jSType27, objectType28);
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, true);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        boolean boolean35 = jSTypeRegistry32.resetImplicitPrototype(jSType33, objectType34);
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry32.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType41 = jSType40.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, true);
        com.google.javascript.rhino.jstype.JSType jSType45 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        boolean boolean47 = jSTypeRegistry44.resetImplicitPrototype(jSType45, objectType46);
        com.google.javascript.rhino.jstype.JSType jSType52 = jSTypeRegistry44.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType53 = jSType52.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType54 = jSTypeRegistry26.createParameterizedType(objectType41, jSType52);
        java.util.Set set55 = parameterizedType54.getOwnPropertyNames();
        boolean boolean56 = parameterizedType54.isNominalType();
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        boolean boolean58 = parameterizedType54.canTestForEqualityWith(jSType57);
        boolean boolean59 = parameterizedType54.isInterface();
        com.google.javascript.rhino.jstype.JSType jSType60 = jSTypeRegistry2.createOptionalType((com.google.javascript.rhino.jstype.JSType) parameterizedType54);
        boolean boolean61 = jSType60.matchesObjectContext();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType18 and parameterizedType54.", jSType18.equals(parameterizedType54) == parameterizedType54.equals(jSType18));
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test740");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = ternaryValue0.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = ternaryValue3.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue5 = ternaryValue3.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = ternaryValue2.or(ternaryValue5);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = ternaryValue0.xor(ternaryValue2);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = ternaryValue8.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = ternaryValue2.xor(ternaryValue8);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = ternaryValue11.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = ternaryValue11.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue14 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = ternaryValue14.not();
        boolean boolean17 = ternaryValue14.toBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue18 = ternaryValue14.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue19 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue20 = ternaryValue18.xor(ternaryValue19);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue21 = ternaryValue13.or(ternaryValue19);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = ternaryValue21.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue23 = ternaryValue8.and(ternaryValue21);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue25 = ternaryValue24.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue26 = ternaryValue24.not();
        boolean boolean28 = ternaryValue24.toBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue29 = ternaryValue8.or(ternaryValue24);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue30 = ternaryValue8.not();
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = null;
        boolean boolean36 = jSTypeRegistry33.resetImplicitPrototype(jSType34, objectType35);
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37, true);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType41 = null;
        boolean boolean42 = jSTypeRegistry39.resetImplicitPrototype(jSType40, objectType41);
        com.google.javascript.rhino.jstype.JSType jSType47 = jSTypeRegistry39.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = jSType47.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49, true);
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType53 = null;
        boolean boolean54 = jSTypeRegistry51.resetImplicitPrototype(jSType52, objectType53);
        com.google.javascript.rhino.jstype.JSType jSType59 = jSTypeRegistry51.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType60 = jSType59.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType61 = jSTypeRegistry33.createParameterizedType(objectType48, jSType59);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable62 = parameterizedType61.getCtorExtendedInterfaces();
        boolean boolean63 = parameterizedType61.isNominalType();
        boolean boolean64 = parameterizedType61.isAllType();
        boolean boolean65 = parameterizedType61.matchesObjectContext();
        com.google.javascript.rhino.jstype.JSType jSType66 = null;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue67 = parameterizedType61.testForEquality(jSType66);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue68 = ternaryValue30.and(ternaryValue67);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType47 and parameterizedType61.", jSType47.equals(parameterizedType61) == parameterizedType61.equals(jSType47));
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test741");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        boolean boolean38 = jSTypeRegistry35.resetImplicitPrototype(jSType36, objectType37);
        com.google.javascript.rhino.jstype.JSType jSType43 = jSTypeRegistry35.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = jSType43.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSType43.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType46 = jSType43.restrictByNotNullOrUndefined();
        boolean boolean47 = parameterizedType30.canAssignTo(jSType43);
        boolean boolean49 = parameterizedType30.isPropertyTypeInferred("");
        boolean boolean50 = parameterizedType30.isResolved();
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType30.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, true);
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType56 = null;
        boolean boolean57 = jSTypeRegistry54.resetImplicitPrototype(jSType55, objectType56);
        com.google.javascript.rhino.jstype.JSType jSType62 = jSTypeRegistry54.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType63 = jSType62.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType64 = jSType62.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType65 = jSType62.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType66 = jSType65.toMaybeEnumElementType();
        boolean boolean67 = parameterizedType30.isEquivalentTo(jSType65);
        boolean boolean68 = parameterizedType30.isStringObjectType();
        com.google.javascript.rhino.jstype.JSType jSType70 = parameterizedType30.getPropertyType("{proxy:{proxy:{2122497688}}}");
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType71 = jSType70.toMaybeParameterizedType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test742");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable5 = jSTypeRegistry2.getTypesWithProperty("function (): {proxy:{1288677244}}");
        com.google.javascript.rhino.Node[] nodeArray11 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(52, nodeArray11, 49, 38);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(53, nodeArray11);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(1, nodeArray11);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node(46, nodeArray11, (int) (short) 1, 35);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean23 = node22.isFalse();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList27 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node26);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList31 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node30);
        java.lang.Cloneable[] cloneableArray32 = new java.lang.Cloneable[] { node22, node26, node30 };
        java.util.ArrayList<java.lang.Cloneable> cloneableList33 = new java.util.ArrayList<java.lang.Cloneable>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList33, cloneableArray32);
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition35 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str36 = stringPosition35.getItem();
        boolean boolean37 = cloneableList33.remove((java.lang.Object) str36);
        java.util.stream.Stream<java.lang.Cloneable> cloneableStream38 = cloneableList33.stream();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString((int) (byte) -1, "hi!");
        boolean boolean42 = cloneableList33.add((java.lang.Cloneable) node41);
        boolean boolean43 = node41.isFalse();
        java.lang.String str44 = node41.getSourceFileName();
        java.lang.Object obj46 = node41.getProp(4095);
        com.google.javascript.rhino.Node node47 = node41.cloneNode();
        node47.setSourceFileForTesting("{proxy:{proxy:{3292531}}}");
        node19.addChildrenToBack(node47);
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51, true);
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType55 = null;
        boolean boolean56 = jSTypeRegistry53.resetImplicitPrototype(jSType54, objectType55);
        com.google.javascript.rhino.ErrorReporter errorReporter57 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter57, true);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType61 = null;
        boolean boolean62 = jSTypeRegistry59.resetImplicitPrototype(jSType60, objectType61);
        com.google.javascript.rhino.jstype.JSType jSType67 = jSTypeRegistry59.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType68 = jSType67.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter69 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter69, true);
        com.google.javascript.rhino.jstype.JSType jSType72 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType73 = null;
        boolean boolean74 = jSTypeRegistry71.resetImplicitPrototype(jSType72, objectType73);
        com.google.javascript.rhino.jstype.JSType jSType79 = jSTypeRegistry71.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType80 = jSType79.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType81 = jSTypeRegistry53.createParameterizedType(objectType68, jSType79);
        java.util.Set set82 = parameterizedType81.getOwnPropertyNames();
        boolean boolean83 = parameterizedType81.isNoObjectType();
        boolean boolean84 = parameterizedType81.isAllType();
        boolean boolean85 = parameterizedType81.isEnumElementType();
        boolean boolean86 = parameterizedType81.isUnknownType();
        com.google.javascript.rhino.jstype.EnumType enumType87 = jSTypeRegistry2.createEnumType("{proxy:{proxy:{1528765838}}}", node47, (com.google.javascript.rhino.jstype.JSType) parameterizedType81);
        com.google.javascript.rhino.jstype.EnumElementType enumElementType88 = enumType87.getElementsType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType67 and parameterizedType81.", jSType67.equals(parameterizedType81) == parameterizedType81.equals(jSType67));
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test743");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType33 = parameterizedType30.getIndexType();
        java.lang.String str34 = parameterizedType30.toDebugHashCodeString();
        boolean boolean35 = parameterizedType30.isInterface();
        java.lang.String str36 = parameterizedType30.getDisplayName();
        boolean boolean38 = parameterizedType30.isPropertyTypeInferred("");
        boolean boolean39 = parameterizedType30.isConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType40 = parameterizedType30.toMaybeParameterizedType();
        boolean boolean41 = parameterizedType30.isRegexpType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test744");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.hasReferenceName();
        boolean boolean33 = parameterizedType30.hasAnyTemplateInternal();
        boolean boolean34 = parameterizedType30.isNoResolvedType();
        boolean boolean35 = parameterizedType30.isNoResolvedType();
        boolean boolean36 = parameterizedType30.isBooleanObjectType();
        com.google.javascript.rhino.jstype.JSType jSType37 = parameterizedType30.autobox();
        boolean boolean38 = jSType37.isNoResolvedType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and jSType37.", jSType16.equals(jSType37) == jSType37.equals(jSType16));
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test745");
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.ObjectType> objectTypeBuilder0 = com.google.common.collect.ImmutableList.builder();
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.ObjectType> objectTypeBuilder1 = com.google.common.collect.ImmutableList.builder();
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2, true);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        boolean boolean7 = jSTypeRegistry4.resetImplicitPrototype(jSType5, objectType6);
        com.google.javascript.rhino.jstype.JSType jSType12 = jSTypeRegistry4.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType13 = jSType12.dereference();
        boolean boolean14 = objectType13.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable15 = objectType13.getCtorImplementedInterfaces();
        boolean boolean16 = objectType13.isNativeObjectType();
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.ObjectType> objectTypeBuilder17 = objectTypeBuilder1.add(objectType13);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.ObjectType>> objectTypeBuilderList18 = com.google.common.collect.ImmutableList.of(objectTypeBuilder0, objectTypeBuilder17);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19, true);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = null;
        boolean boolean24 = jSTypeRegistry21.resetImplicitPrototype(jSType22, objectType23);
        com.google.javascript.rhino.jstype.JSType jSType29 = jSTypeRegistry21.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSType29.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, true);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType36 = null;
        boolean boolean37 = jSTypeRegistry34.resetImplicitPrototype(jSType35, objectType36);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38, true);
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType42 = null;
        boolean boolean43 = jSTypeRegistry40.resetImplicitPrototype(jSType41, objectType42);
        com.google.javascript.rhino.jstype.JSType jSType48 = jSTypeRegistry40.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType49 = jSType48.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50, true);
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType54 = null;
        boolean boolean55 = jSTypeRegistry52.resetImplicitPrototype(jSType53, objectType54);
        com.google.javascript.rhino.jstype.JSType jSType60 = jSTypeRegistry52.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType61 = jSType60.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType62 = jSTypeRegistry34.createParameterizedType(objectType49, jSType60);
        java.util.Set set63 = parameterizedType62.getOwnPropertyNames();
        boolean boolean64 = parameterizedType62.isNoObjectType();
        boolean boolean65 = parameterizedType62.isAllType();
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newNumber((double) (-1L));
        boolean boolean68 = objectType30.defineInferredProperty("unknown", (com.google.javascript.rhino.jstype.JSType) parameterizedType62, node67);
        com.google.javascript.rhino.ErrorReporter errorReporter69 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter69, true);
        com.google.javascript.rhino.jstype.JSType jSType72 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType73 = null;
        boolean boolean74 = jSTypeRegistry71.resetImplicitPrototype(jSType72, objectType73);
        com.google.javascript.rhino.jstype.JSType jSType79 = jSTypeRegistry71.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType80 = jSType79.dereference();
        boolean boolean81 = parameterizedType62.isEquivalentTo(jSType79);
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.ObjectType> objectTypeBuilder82 = objectTypeBuilder17.add((com.google.javascript.rhino.jstype.ObjectType) parameterizedType62);
        boolean boolean83 = parameterizedType62.hasAnyTemplate();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType84 = parameterizedType62.toMaybeParameterizedType();
        com.google.javascript.rhino.jstype.ObjectType objectType85 = parameterizedType62.toObjectType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType12 and objectType85.", jSType12.equals(objectType85) == objectType85.equals(jSType12));
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test746");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable31 = parameterizedType30.getCtorExtendedInterfaces();
        boolean boolean32 = parameterizedType30.isNominalType();
        boolean boolean33 = parameterizedType30.isAllType();
        com.google.javascript.rhino.jstype.ObjectType objectType34 = parameterizedType30.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35, true);
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType39 = null;
        boolean boolean40 = jSTypeRegistry37.resetImplicitPrototype(jSType38, objectType39);
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41, true);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType45 = null;
        boolean boolean46 = jSTypeRegistry43.resetImplicitPrototype(jSType44, objectType45);
        com.google.javascript.rhino.jstype.JSType jSType51 = jSTypeRegistry43.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType52 = jSType51.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType57 = null;
        boolean boolean58 = jSTypeRegistry55.resetImplicitPrototype(jSType56, objectType57);
        com.google.javascript.rhino.jstype.JSType jSType63 = jSTypeRegistry55.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = jSType63.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType65 = jSTypeRegistry37.createParameterizedType(objectType52, jSType63);
        java.util.Set set66 = parameterizedType65.getOwnPropertyNames();
        boolean boolean67 = parameterizedType65.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter68 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter68, true);
        com.google.javascript.rhino.jstype.JSType jSType71 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType72 = null;
        boolean boolean73 = jSTypeRegistry70.resetImplicitPrototype(jSType71, objectType72);
        com.google.javascript.rhino.jstype.JSType jSType78 = jSTypeRegistry70.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType79 = jSType78.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType80 = jSType78.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType81 = jSType78.restrictByNotNullOrUndefined();
        boolean boolean82 = parameterizedType65.canAssignTo(jSType78);
        boolean boolean84 = parameterizedType65.isPropertyTypeInferred("");
        boolean boolean85 = parameterizedType65.isResolved();
        com.google.javascript.rhino.jstype.ObjectType objectType86 = parameterizedType65.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType88 = parameterizedType65.findPropertyType("{proxy:{proxy:{649633010}}}");
        boolean boolean89 = parameterizedType65.isNominalType();
        boolean boolean90 = parameterizedType65.isNominalType();
        boolean boolean91 = parameterizedType65.isInterface();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue92 = parameterizedType30.testForEquality((com.google.javascript.rhino.jstype.JSType) parameterizedType65);
        boolean boolean94 = parameterizedType65.isPropertyTypeDeclared("InputId: Named type with empty name component");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test747");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        boolean boolean10 = jSTypeRegistry7.resetImplicitPrototype(jSType8, objectType9);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, true);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        boolean boolean16 = jSTypeRegistry13.resetImplicitPrototype(jSType14, objectType15);
        com.google.javascript.rhino.jstype.JSType jSType21 = jSTypeRegistry13.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSType21.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = null;
        boolean boolean28 = jSTypeRegistry25.resetImplicitPrototype(jSType26, objectType27);
        com.google.javascript.rhino.jstype.JSType jSType33 = jSTypeRegistry25.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = jSType33.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType35 = jSTypeRegistry7.createParameterizedType(objectType22, jSType33);
        java.util.Set set36 = parameterizedType35.getOwnPropertyNames();
        boolean boolean37 = parameterizedType35.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType38 = parameterizedType35.getIndexType();
        boolean boolean39 = cloneableList4.equals((java.lang.Object) parameterizedType35);
        boolean boolean40 = parameterizedType35.hasDisplayName();
        com.google.javascript.rhino.jstype.FunctionType functionType41 = parameterizedType35.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.jstype.JSType jSType43 = parameterizedType35.getGreatestSubtype(jSType42);
        com.google.javascript.rhino.jstype.JSType jSType44 = parameterizedType35.collapseUnion();
        boolean boolean45 = parameterizedType35.isNullable();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType21 and parameterizedType35.", jSType21.equals(parameterizedType35) == parameterizedType35.equals(jSType21));
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test748");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType33 = parameterizedType30.getIndexType();
        java.lang.String str34 = parameterizedType30.toDebugHashCodeString();
        boolean boolean35 = parameterizedType30.isInterface();
        com.google.javascript.rhino.jstype.ObjectType objectType36 = parameterizedType30.getTypeOfThis();
        boolean boolean37 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38, true);
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType42 = null;
        boolean boolean43 = jSTypeRegistry40.resetImplicitPrototype(jSType41, objectType42);
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44, true);
        com.google.javascript.rhino.jstype.JSType jSType47 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType48 = null;
        boolean boolean49 = jSTypeRegistry46.resetImplicitPrototype(jSType47, objectType48);
        com.google.javascript.rhino.jstype.JSType jSType54 = jSTypeRegistry46.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType55 = jSType54.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56, true);
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType60 = null;
        boolean boolean61 = jSTypeRegistry58.resetImplicitPrototype(jSType59, objectType60);
        com.google.javascript.rhino.jstype.JSType jSType66 = jSTypeRegistry58.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType67 = jSType66.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType68 = jSTypeRegistry40.createParameterizedType(objectType55, jSType66);
        java.util.Set set69 = parameterizedType68.getOwnPropertyNames();
        boolean boolean70 = parameterizedType68.hasReferenceName();
        boolean boolean71 = parameterizedType68.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.JSType jSType73 = parameterizedType68.findPropertyType("");
        java.lang.String str74 = parameterizedType68.getReferenceName();
        com.google.javascript.rhino.jstype.UnionType unionType75 = parameterizedType68.toMaybeUnionType();
        boolean boolean77 = parameterizedType68.hasOwnProperty("function (): {proxy:{1262905525}}");
        com.google.javascript.rhino.JSDocInfo jSDocInfo78 = parameterizedType68.getJSDocInfo();
        boolean boolean80 = parameterizedType68.isPropertyTypeDeclared("{proxy:{proxy:{1943266088}}}");
        int int81 = parameterizedType68.getPropertiesCount();
        boolean boolean82 = parameterizedType30.isSubtype((com.google.javascript.rhino.jstype.JSType) parameterizedType68);
        com.google.javascript.rhino.jstype.ObjectType objectType83 = parameterizedType68.getImplicitPrototype();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test749");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList5 = cloneableList3.reverse();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList6 = cloneableList5.reverse();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList7 = cloneableList5.reverse();
        int int8 = cloneableList7.size();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Cloneable> cloneableItor9 = cloneableList7.listIterator();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList13 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node12);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList14 = cloneableList13.asList();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList15 = cloneableList13.reverse();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList16 = cloneableList15.reverse();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList17 = cloneableList15.reverse();
        int int18 = cloneableList17.size();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19, true);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = null;
        boolean boolean24 = jSTypeRegistry21.resetImplicitPrototype(jSType22, objectType23);
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25, true);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        boolean boolean30 = jSTypeRegistry27.resetImplicitPrototype(jSType28, objectType29);
        com.google.javascript.rhino.jstype.JSType jSType35 = jSTypeRegistry27.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType36 = jSType35.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37, true);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType41 = null;
        boolean boolean42 = jSTypeRegistry39.resetImplicitPrototype(jSType40, objectType41);
        com.google.javascript.rhino.jstype.JSType jSType47 = jSTypeRegistry39.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = jSType47.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType49 = jSTypeRegistry21.createParameterizedType(objectType36, jSType47);
        java.util.Set set50 = parameterizedType49.getOwnPropertyNames();
        boolean boolean51 = parameterizedType49.hasReferenceName();
        boolean boolean52 = parameterizedType49.hasAnyTemplateInternal();
        boolean boolean53 = parameterizedType49.isOrdinaryFunction();
        boolean boolean54 = cloneableList17.equals((java.lang.Object) parameterizedType49);
        boolean boolean55 = parameterizedType49.isNominalType();
        boolean boolean56 = parameterizedType49.isConstructor();
        int int57 = cloneableList7.lastIndexOf((java.lang.Object) parameterizedType49);
        java.util.Spliterator<java.lang.Cloneable> cloneableSpliterator58 = cloneableList7.spliterator();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType35 and parameterizedType49.", jSType35.equals(parameterizedType49) == parameterizedType49.equals(jSType35));
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test750");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.hasReferenceName();
        boolean boolean33 = parameterizedType30.hasAnyTemplateInternal();
        boolean boolean34 = parameterizedType30.isOrdinaryFunction();
        boolean boolean35 = parameterizedType30.isOrdinaryFunction();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType40 = null;
        boolean boolean41 = jSTypeRegistry38.resetImplicitPrototype(jSType39, objectType40);
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, true);
        com.google.javascript.rhino.jstype.JSType jSType45 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        boolean boolean47 = jSTypeRegistry44.resetImplicitPrototype(jSType45, objectType46);
        com.google.javascript.rhino.jstype.JSType jSType52 = jSTypeRegistry44.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType53 = jSType52.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType58 = null;
        boolean boolean59 = jSTypeRegistry56.resetImplicitPrototype(jSType57, objectType58);
        com.google.javascript.rhino.jstype.JSType jSType64 = jSTypeRegistry56.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType65 = jSType64.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType66 = jSTypeRegistry38.createParameterizedType(objectType53, jSType64);
        java.util.Set set67 = parameterizedType66.getOwnPropertyNames();
        boolean boolean68 = parameterizedType66.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType69 = parameterizedType66.getIndexType();
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry72 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70, true);
        com.google.javascript.rhino.jstype.JSType jSType73 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType74 = null;
        boolean boolean75 = jSTypeRegistry72.resetImplicitPrototype(jSType73, objectType74);
        com.google.javascript.rhino.jstype.JSType jSType80 = jSTypeRegistry72.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType81 = jSType80.dereference();
        boolean boolean82 = objectType81.isRegexpType();
        boolean boolean84 = objectType81.isPropertyTypeInferred("hi!");
        boolean boolean85 = parameterizedType66.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) objectType81);
        java.lang.String str86 = parameterizedType66.toDebugHashCodeString();
        boolean boolean88 = parameterizedType66.hasOwnProperty("");
        boolean boolean89 = parameterizedType66.isNullType();
        boolean boolean91 = parameterizedType66.isPropertyTypeDeclared("{proxy:{proxy:{1874555938}}}");
        boolean boolean92 = parameterizedType66.isNominalType();
        boolean boolean93 = parameterizedType66.isAllType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet94 = parameterizedType66.getPossibleToBooleanOutcomes();
        boolean boolean95 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) parameterizedType30, (com.google.javascript.rhino.jstype.JSType) parameterizedType66);
        boolean boolean96 = parameterizedType30.isInterface();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType66.", jSType16.equals(parameterizedType66) == parameterizedType66.equals(jSType16));
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test751");
        com.google.javascript.rhino.Node[] nodeArray5 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(52, nodeArray5, 49, 38);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(53, nodeArray5);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(1, nodeArray5);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(4, nodeArray5, 83, 54);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray5);
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType15 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList19 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node18);
        boolean boolean20 = node18.isFalse();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean28 = node27.isFalse();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean32 = node31.isTrue();
        boolean boolean33 = node31.hasOneChild();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean37 = node36.isTrue();
        boolean boolean38 = node36.isBreak();
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((int) (byte) 1, node24, node27, node31, node36, (int) (byte) 1, 4095);
        boolean boolean42 = node18.isEquivalentTo(node24);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean46 = node45.isTrue();
        boolean boolean47 = node45.isBreak();
        boolean boolean48 = node45.isFor();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship49 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType15, node18, node45);
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType50 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.common.collect.ImmutableList<com.google.javascript.jscomp.CodingConvention.SubclassType> subclassTypeList51 = com.google.common.collect.ImmutableList.of(subclassType15, subclassType50);
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node((int) (byte) 100);
        java.util.Set<java.lang.String> strSet54 = node53.getDirectives();
        boolean boolean55 = node53.isVarArgs();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber(10.0d, (int) (byte) 1, 43);
        boolean boolean60 = node59.isBreak();
        boolean boolean62 = node59.getBooleanProp((-1));
        node53.addChildrenToBack(node59);
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean71 = node70.isFalse();
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean75 = node74.isTrue();
        boolean boolean76 = node74.hasOneChild();
        com.google.javascript.rhino.Node node79 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean80 = node79.isTrue();
        boolean boolean81 = node79.isBreak();
        com.google.javascript.rhino.Node node84 = new com.google.javascript.rhino.Node((int) (byte) 1, node67, node70, node74, node79, (int) (byte) 1, 4095);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship85 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType15, node53, node70);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node14.removeChild(node53);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test752");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.jstype.JSType jSType10 = jSTypeRegistry2.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = jSType10.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        boolean boolean17 = jSTypeRegistry14.resetImplicitPrototype(jSType15, objectType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, true);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        boolean boolean35 = jSTypeRegistry32.resetImplicitPrototype(jSType33, objectType34);
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry32.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType41 = jSType40.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType42 = jSTypeRegistry14.createParameterizedType(objectType29, jSType40);
        java.util.Set set43 = parameterizedType42.getOwnPropertyNames();
        boolean boolean44 = parameterizedType42.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, true);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType49 = null;
        boolean boolean50 = jSTypeRegistry47.resetImplicitPrototype(jSType48, objectType49);
        com.google.javascript.rhino.jstype.JSType jSType55 = jSTypeRegistry47.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType56 = jSType55.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType57 = jSType55.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType58 = jSType55.restrictByNotNullOrUndefined();
        boolean boolean59 = parameterizedType42.canAssignTo(jSType55);
        boolean boolean61 = parameterizedType42.isPropertyTypeInferred("");
        boolean boolean62 = parameterizedType42.isResolved();
        com.google.javascript.rhino.jstype.ObjectType objectType63 = parameterizedType42.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType65 = parameterizedType42.findPropertyType("{proxy:{proxy:{649633010}}}");
        boolean boolean66 = parameterizedType42.isNominalType();
        boolean boolean67 = parameterizedType42.canBeCalled();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue68 = objectType11.testForEquality((com.google.javascript.rhino.jstype.JSType) parameterizedType42);
        com.google.javascript.rhino.JSDocInfo jSDocInfo69 = parameterizedType42.getJSDocInfo();
        boolean boolean70 = parameterizedType42.isNativeObjectType();
        boolean boolean71 = parameterizedType42.hasAnyTemplate();
        boolean boolean72 = parameterizedType42.matchesStringContext();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType73 = parameterizedType42.toMaybeParameterizedType();
        boolean boolean74 = parameterizedType42.isInstanceType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType10 and parameterizedType42.", jSType10.equals(parameterizedType42) == parameterizedType42.equals(jSType10));
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test753");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        boolean boolean38 = jSTypeRegistry35.resetImplicitPrototype(jSType36, objectType37);
        com.google.javascript.rhino.jstype.JSType jSType43 = jSTypeRegistry35.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = jSType43.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSType43.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType46 = jSType43.restrictByNotNullOrUndefined();
        boolean boolean47 = parameterizedType30.canAssignTo(jSType43);
        boolean boolean49 = parameterizedType30.isPropertyTypeInferred("");
        boolean boolean50 = parameterizedType30.isResolved();
        boolean boolean51 = parameterizedType30.isInstanceType();
        java.util.Set set52 = parameterizedType30.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.JSType jSType54 = parameterizedType30.getPropertyType("{proxy:{proxy:{1004792283}}}");
        boolean boolean55 = parameterizedType30.isNoResolvedType();
        java.lang.String str56 = parameterizedType30.toDebugHashCodeString();
        boolean boolean57 = parameterizedType30.isNominalType();
        boolean boolean58 = parameterizedType30.matchesUint32Context();
        java.util.Set set59 = parameterizedType30.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.ObjectType objectType61 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface((com.google.javascript.rhino.jstype.ObjectType) parameterizedType30, "function (): {proxy:{1024660089}}");
        com.google.javascript.rhino.jstype.JSType jSType62 = objectType61.getTypeOfThis();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and objectType61.", jSType16.equals(objectType61) == objectType61.equals(jSType16));
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test754");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable31 = parameterizedType30.getCtorExtendedInterfaces();
        boolean boolean32 = parameterizedType30.isNominalType();
        boolean boolean33 = parameterizedType30.isAllType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo35 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean36 = jSDocInfo35.isInterface();
        java.util.Collection<java.lang.String> strCollection37 = jSDocInfo35.getReferences();
        parameterizedType30.setPropertyJSDocInfo("", jSDocInfo35);
        boolean boolean39 = parameterizedType30.isAllType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo40 = parameterizedType30.getJSDocInfo();
        com.google.javascript.rhino.jstype.JSType jSType41 = parameterizedType30.collapseUnion();
        boolean boolean42 = jSType41.isInterface();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and jSType41.", jSType16.equals(jSType41) == jSType41.equals(jSType16));
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test755");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = null;
        boolean boolean36 = jSTypeRegistry33.resetImplicitPrototype(jSType34, objectType35);
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37, true);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType41 = null;
        boolean boolean42 = jSTypeRegistry39.resetImplicitPrototype(jSType40, objectType41);
        com.google.javascript.rhino.jstype.JSType jSType47 = jSTypeRegistry39.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = jSType47.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49, true);
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType53 = null;
        boolean boolean54 = jSTypeRegistry51.resetImplicitPrototype(jSType52, objectType53);
        com.google.javascript.rhino.jstype.JSType jSType59 = jSTypeRegistry51.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType60 = jSType59.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType61 = jSTypeRegistry33.createParameterizedType(objectType48, jSType59);
        java.util.Set set62 = parameterizedType61.getOwnPropertyNames();
        boolean boolean63 = parameterizedType30.differsFrom((com.google.javascript.rhino.jstype.JSType) parameterizedType61);
        com.google.javascript.rhino.jstype.JSType jSType64 = parameterizedType30.getIndexType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType61.", jSType16.equals(parameterizedType61) == parameterizedType61.equals(jSType16));
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test756");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean11 = node10.isFalse();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean15 = node14.isTrue();
        boolean boolean16 = node14.hasOneChild();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean20 = node19.isTrue();
        boolean boolean21 = node19.isBreak();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (byte) 1, node7, node10, node14, node19, (int) (byte) 1, 4095);
        boolean boolean25 = node7.isDelProp();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        boolean boolean31 = jSTypeRegistry28.resetImplicitPrototype(jSType29, objectType30);
        com.google.javascript.rhino.jstype.JSType jSType36 = jSTypeRegistry28.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType37 = jSType36.dereference();
        boolean boolean38 = objectType37.isFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType39 = jSTypeRegistry2.createObjectType("hi!", node7, objectType37);
        com.google.javascript.rhino.ErrorReporter errorReporter40 = jSTypeRegistry2.getErrorReporter();
        com.google.javascript.rhino.jstype.JSType jSType45 = jSTypeRegistry2.createNamedType("({proxy:{proxy:{1321644185}}})", "{proxy:{proxy:{2012184953}}}", (int) (byte) -1, 47);
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, true);
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType50 = null;
        boolean boolean51 = jSTypeRegistry48.resetImplicitPrototype(jSType49, objectType50);
        boolean boolean52 = jSTypeRegistry48.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType58 = null;
        boolean boolean59 = jSTypeRegistry56.resetImplicitPrototype(jSType57, objectType58);
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60, true);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType64 = null;
        boolean boolean65 = jSTypeRegistry62.resetImplicitPrototype(jSType63, objectType64);
        com.google.javascript.rhino.jstype.JSType jSType70 = jSTypeRegistry62.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType71 = jSType70.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter72 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry74 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter72, true);
        com.google.javascript.rhino.jstype.JSType jSType75 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType76 = null;
        boolean boolean77 = jSTypeRegistry74.resetImplicitPrototype(jSType75, objectType76);
        com.google.javascript.rhino.jstype.JSType jSType82 = jSTypeRegistry74.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType83 = jSType82.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType84 = jSTypeRegistry56.createParameterizedType(objectType71, jSType82);
        boolean boolean85 = parameterizedType84.isEnumElementType();
        com.google.javascript.rhino.jstype.FunctionType functionType86 = parameterizedType84.getOwnerFunction();
        jSTypeRegistry48.registerPropertyOnType("{proxy:{proxy:{1568596850}}}", (com.google.javascript.rhino.jstype.JSType) parameterizedType84);
        com.google.javascript.rhino.jstype.JSType jSType88 = jSTypeRegistry2.createOptionalType((com.google.javascript.rhino.jstype.JSType) parameterizedType84);
        com.google.javascript.rhino.jstype.JSType jSType89 = parameterizedType84.collapseUnion();
        com.google.javascript.rhino.jstype.JSType jSType90 = parameterizedType84.getParameterType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType36 and parameterizedType84.", jSType36.equals(parameterizedType84) == parameterizedType84.equals(jSType36));
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test757");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable31 = parameterizedType30.getCtorExtendedInterfaces();
        boolean boolean32 = parameterizedType30.isNominalType();
        boolean boolean33 = parameterizedType30.isAllType();
        boolean boolean34 = parameterizedType30.isUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType36 = parameterizedType30.getPropertyType("{proxy:{proxy:{51735728}}}");
        boolean boolean37 = parameterizedType30.isNativeObjectType();
        java.lang.String str38 = parameterizedType30.getReferenceName();
        boolean boolean39 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType40 = parameterizedType30.collapseUnion();
        boolean boolean41 = parameterizedType30.hasAnyTemplateInternal();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test758");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean11 = node10.isFalse();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean15 = node14.isTrue();
        boolean boolean16 = node14.hasOneChild();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean20 = node19.isTrue();
        boolean boolean21 = node19.isBreak();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (byte) 1, node7, node10, node14, node19, (int) (byte) 1, 4095);
        boolean boolean25 = node7.isDelProp();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        boolean boolean31 = jSTypeRegistry28.resetImplicitPrototype(jSType29, objectType30);
        com.google.javascript.rhino.jstype.JSType jSType36 = jSTypeRegistry28.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType37 = jSType36.dereference();
        boolean boolean38 = objectType37.isFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType39 = jSTypeRegistry2.createObjectType("hi!", node7, objectType37);
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        boolean boolean45 = jSTypeRegistry42.resetImplicitPrototype(jSType43, objectType44);
        com.google.javascript.rhino.jstype.JSType jSType50 = jSTypeRegistry42.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType51 = jSType50.dereference();
        boolean boolean52 = objectType51.isRegexpType();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection53 = jSTypeRegistry2.getDirectImplementors(objectType51);
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, true);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType59 = null;
        boolean boolean60 = jSTypeRegistry57.resetImplicitPrototype(jSType58, objectType59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61, true);
        com.google.javascript.rhino.jstype.JSType jSType64 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType65 = null;
        boolean boolean66 = jSTypeRegistry63.resetImplicitPrototype(jSType64, objectType65);
        com.google.javascript.rhino.jstype.JSType jSType71 = jSTypeRegistry63.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType72 = jSType71.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter73 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry75 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter73, true);
        com.google.javascript.rhino.jstype.JSType jSType76 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType77 = null;
        boolean boolean78 = jSTypeRegistry75.resetImplicitPrototype(jSType76, objectType77);
        com.google.javascript.rhino.jstype.JSType jSType83 = jSTypeRegistry75.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType84 = jSType83.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType85 = jSTypeRegistry57.createParameterizedType(objectType72, jSType83);
        java.util.Set set86 = parameterizedType85.getOwnPropertyNames();
        boolean boolean87 = parameterizedType85.hasReferenceName();
        boolean boolean88 = parameterizedType85.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.JSType jSType90 = parameterizedType85.findPropertyType("");
        jSTypeRegistry2.registerPropertyOnType("Unknown class name", (com.google.javascript.rhino.jstype.JSType) parameterizedType85);
        boolean boolean92 = parameterizedType85.isFunctionPrototypeType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo94 = parameterizedType85.getOwnPropertyJSDocInfo("{proxy:{proxy:{2144970728}}}");
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType95 = parameterizedType85.toMaybeParameterizedType();
        boolean boolean96 = parameterizedType95.isRecordType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType36 and parameterizedType95.", jSType36.equals(parameterizedType95) == parameterizedType95.equals(jSType36));
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test759");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        boolean boolean3 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        boolean boolean18 = objectType17.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable19 = objectType17.getCtorImplementedInterfaces();
        boolean boolean20 = objectType17.isNativeObjectType();
        jSTypeRegistry2.registerPropertyOnType("", (com.google.javascript.rhino.jstype.JSType) objectType17);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        boolean boolean27 = jSTypeRegistry24.resetImplicitPrototype(jSType25, objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = null;
        boolean boolean33 = jSTypeRegistry30.resetImplicitPrototype(jSType31, objectType32);
        com.google.javascript.rhino.jstype.JSType jSType38 = jSTypeRegistry30.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType39 = jSType38.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        boolean boolean45 = jSTypeRegistry42.resetImplicitPrototype(jSType43, objectType44);
        com.google.javascript.rhino.jstype.JSType jSType50 = jSTypeRegistry42.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType51 = jSType50.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType52 = jSTypeRegistry24.createParameterizedType(objectType39, jSType50);
        java.util.Set set53 = parameterizedType52.getOwnPropertyNames();
        boolean boolean54 = parameterizedType52.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, true);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType59 = null;
        boolean boolean60 = jSTypeRegistry57.resetImplicitPrototype(jSType58, objectType59);
        com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry57.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType66 = jSType65.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType67 = jSType65.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType68 = jSType65.restrictByNotNullOrUndefined();
        boolean boolean69 = parameterizedType52.canAssignTo(jSType65);
        boolean boolean71 = parameterizedType52.isPropertyTypeInferred("");
        com.google.javascript.rhino.jstype.JSType jSType76 = jSTypeRegistry2.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) parameterizedType52, "hi!", "Named type with empty name component", 40, 39);
        com.google.javascript.rhino.jstype.JSType jSType77 = parameterizedType52.getParameterType();
        boolean boolean78 = parameterizedType52.isNoType();
        boolean boolean79 = parameterizedType52.isParameterizedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo80 = parameterizedType52.getJSDocInfo();
        java.lang.String str81 = parameterizedType52.getReferenceName();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType82 = parameterizedType52.toMaybeParameterizedType();
        boolean boolean83 = parameterizedType82.isNoType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType82.", jSType16.equals(parameterizedType82) == parameterizedType82.equals(jSType16));
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test760");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        boolean boolean3 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        boolean boolean18 = objectType17.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable19 = objectType17.getCtorImplementedInterfaces();
        boolean boolean20 = objectType17.isNativeObjectType();
        jSTypeRegistry2.registerPropertyOnType("", (com.google.javascript.rhino.jstype.JSType) objectType17);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        boolean boolean27 = jSTypeRegistry24.resetImplicitPrototype(jSType25, objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = null;
        boolean boolean33 = jSTypeRegistry30.resetImplicitPrototype(jSType31, objectType32);
        com.google.javascript.rhino.jstype.JSType jSType38 = jSTypeRegistry30.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType39 = jSType38.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        boolean boolean45 = jSTypeRegistry42.resetImplicitPrototype(jSType43, objectType44);
        com.google.javascript.rhino.jstype.JSType jSType50 = jSTypeRegistry42.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType51 = jSType50.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType52 = jSTypeRegistry24.createParameterizedType(objectType39, jSType50);
        java.util.Set set53 = parameterizedType52.getOwnPropertyNames();
        boolean boolean54 = parameterizedType52.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, true);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType59 = null;
        boolean boolean60 = jSTypeRegistry57.resetImplicitPrototype(jSType58, objectType59);
        com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry57.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType66 = jSType65.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType67 = jSType65.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType68 = jSType65.restrictByNotNullOrUndefined();
        boolean boolean69 = parameterizedType52.canAssignTo(jSType65);
        boolean boolean71 = parameterizedType52.isPropertyTypeInferred("");
        com.google.javascript.rhino.jstype.JSType jSType76 = jSTypeRegistry2.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) parameterizedType52, "hi!", "Named type with empty name component", 40, 39);
        com.google.javascript.rhino.jstype.JSType jSType77 = parameterizedType52.getParameterType();
        boolean boolean78 = parameterizedType52.isNoObjectType();
        com.google.javascript.rhino.jstype.EnumType enumType79 = parameterizedType52.toMaybeEnumType();
        com.google.javascript.rhino.jstype.JSType jSType81 = parameterizedType52.getPropertyType("function (): {proxy:{929267642}}");
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType82 = parameterizedType52.toMaybeParameterizedType();
        com.google.javascript.rhino.jstype.UnionType unionType83 = parameterizedType82.toMaybeUnionType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType82.", jSType16.equals(parameterizedType82) == parameterizedType82.equals(jSType16));
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test761");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        boolean boolean38 = jSTypeRegistry35.resetImplicitPrototype(jSType36, objectType37);
        com.google.javascript.rhino.jstype.JSType jSType43 = jSTypeRegistry35.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = jSType43.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSType43.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType46 = jSType43.restrictByNotNullOrUndefined();
        boolean boolean47 = parameterizedType30.canAssignTo(jSType43);
        boolean boolean49 = parameterizedType30.isPropertyTypeInferred("");
        boolean boolean50 = parameterizedType30.isResolved();
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType30.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType53 = parameterizedType30.findPropertyType("{proxy:{proxy:{649633010}}}");
        boolean boolean54 = parameterizedType30.isNominalType();
        boolean boolean55 = parameterizedType30.isNominalType();
        boolean boolean56 = parameterizedType30.isInterface();
        com.google.javascript.rhino.Node node58 = parameterizedType30.getPropertyNode("JSDocInfo");
        com.google.javascript.rhino.jstype.JSType jSType60 = parameterizedType30.findPropertyType("function (): {proxy:{1940927328}}");
        java.lang.String str61 = parameterizedType30.toDebugHashCodeString();
        java.lang.String str62 = parameterizedType30.getNormalizedReferenceName();
        com.google.javascript.rhino.jstype.ObjectType objectType63 = parameterizedType30.toObjectType();
        com.google.javascript.rhino.jstype.ObjectType.Property property65 = objectType63.getOwnSlot("{proxy:{proxy:{731364329}}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and objectType63.", jSType16.equals(objectType63) == objectType63.equals(jSType16));
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test762");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        boolean boolean3 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        boolean boolean18 = objectType17.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable19 = objectType17.getCtorImplementedInterfaces();
        boolean boolean20 = objectType17.isNativeObjectType();
        jSTypeRegistry2.registerPropertyOnType("", (com.google.javascript.rhino.jstype.JSType) objectType17);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        boolean boolean27 = jSTypeRegistry24.resetImplicitPrototype(jSType25, objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = null;
        boolean boolean33 = jSTypeRegistry30.resetImplicitPrototype(jSType31, objectType32);
        com.google.javascript.rhino.jstype.JSType jSType38 = jSTypeRegistry30.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType39 = jSType38.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        boolean boolean45 = jSTypeRegistry42.resetImplicitPrototype(jSType43, objectType44);
        com.google.javascript.rhino.jstype.JSType jSType50 = jSTypeRegistry42.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType51 = jSType50.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType52 = jSTypeRegistry24.createParameterizedType(objectType39, jSType50);
        java.util.Set set53 = parameterizedType52.getOwnPropertyNames();
        boolean boolean54 = parameterizedType52.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, true);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType59 = null;
        boolean boolean60 = jSTypeRegistry57.resetImplicitPrototype(jSType58, objectType59);
        com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry57.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType66 = jSType65.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType67 = jSType65.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType68 = jSType65.restrictByNotNullOrUndefined();
        boolean boolean69 = parameterizedType52.canAssignTo(jSType65);
        boolean boolean71 = parameterizedType52.isPropertyTypeInferred("");
        com.google.javascript.rhino.jstype.JSType jSType76 = jSTypeRegistry2.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) parameterizedType52, "hi!", "Named type with empty name component", 40, 39);
        com.google.javascript.rhino.jstype.JSType jSType77 = parameterizedType52.getParameterType();
        boolean boolean78 = parameterizedType52.isNoObjectType();
        com.google.javascript.rhino.jstype.EnumType enumType79 = parameterizedType52.toMaybeEnumType();
        com.google.javascript.rhino.jstype.JSType jSType81 = parameterizedType52.getPropertyType("function (): {proxy:{929267642}}");
        java.lang.String str82 = parameterizedType52.toString();
        java.lang.Iterable iterable83 = parameterizedType52.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType84 = parameterizedType52.restrictByNotNullOrUndefined();
        boolean boolean85 = parameterizedType52.isStringObjectType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType52.", jSType16.equals(parameterizedType52) == parameterizedType52.equals(jSType16));
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test763");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.hasReferenceName();
        boolean boolean33 = parameterizedType30.hasAnyTemplateInternal();
        boolean boolean34 = parameterizedType30.isInstanceType();
        boolean boolean35 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType37 = parameterizedType30.findPropertyType("{proxy:{proxy:{1317500836}}}");
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType38 = parameterizedType30.toMaybeParameterizedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = parameterizedType30.getJSDocInfo();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test764");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        boolean boolean5 = cloneableList3.isEmpty();
        boolean boolean6 = cloneableList3.isEmpty();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList10 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node9);
        com.google.javascript.rhino.jstype.JSType jSType11 = node9.getJSType();
        boolean boolean12 = cloneableList3.contains((java.lang.Object) jSType11);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) (byte) 0);
        node14.setVarArgs(true);
        int int18 = node14.getIntProp(3);
        boolean boolean19 = node14.isNE();
        boolean boolean20 = node14.isNE();
        boolean boolean21 = cloneableList3.equals((java.lang.Object) node14);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList25 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node24);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList26 = cloneableList25.asList();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList27 = cloneableList25.asList();
        boolean boolean29 = cloneableList27.contains((java.lang.Object) '4');
        boolean boolean30 = cloneableList27.isEmpty();
        boolean boolean31 = cloneableList3.containsAll((java.util.Collection<java.lang.Cloneable>) cloneableList27);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, true);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType36 = null;
        boolean boolean37 = jSTypeRegistry34.resetImplicitPrototype(jSType35, objectType36);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38, true);
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType42 = null;
        boolean boolean43 = jSTypeRegistry40.resetImplicitPrototype(jSType41, objectType42);
        com.google.javascript.rhino.jstype.JSType jSType48 = jSTypeRegistry40.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType49 = jSType48.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50, true);
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType54 = null;
        boolean boolean55 = jSTypeRegistry52.resetImplicitPrototype(jSType53, objectType54);
        com.google.javascript.rhino.jstype.JSType jSType60 = jSTypeRegistry52.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType61 = jSType60.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType62 = jSTypeRegistry34.createParameterizedType(objectType49, jSType60);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable63 = parameterizedType62.getCtorExtendedInterfaces();
        boolean boolean64 = parameterizedType62.isNominalType();
        boolean boolean65 = parameterizedType62.isAllType();
        boolean boolean66 = parameterizedType62.isUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType68 = parameterizedType62.getPropertyType("{proxy:{proxy:{51735728}}}");
        boolean boolean69 = parameterizedType62.isNativeObjectType();
        boolean boolean70 = parameterizedType62.isInstanceType();
        com.google.javascript.rhino.jstype.ObjectType.Property property72 = parameterizedType62.getSlot("{proxy:{proxy:{1697456536}}}");
        boolean boolean74 = parameterizedType62.hasOwnProperty("{proxy:{proxy:{615250530}}}");
        boolean boolean75 = cloneableList27.equals((java.lang.Object) "{proxy:{proxy:{615250530}}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType48 and parameterizedType62.", jSType48.equals(parameterizedType62) == parameterizedType62.equals(jSType48));
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test765");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable31 = parameterizedType30.getCtorExtendedInterfaces();
        boolean boolean32 = parameterizedType30.isNominalType();
        boolean boolean33 = parameterizedType30.isAllType();
        boolean boolean34 = parameterizedType30.isUnknownType();
        int int35 = parameterizedType30.getPropertiesCount();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType36 = parameterizedType30.toMaybeParameterizedType();
        boolean boolean37 = parameterizedType30.isConstructor();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test766");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        boolean boolean10 = jSTypeRegistry7.resetImplicitPrototype(jSType8, objectType9);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, true);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        boolean boolean16 = jSTypeRegistry13.resetImplicitPrototype(jSType14, objectType15);
        com.google.javascript.rhino.jstype.JSType jSType21 = jSTypeRegistry13.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSType21.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = null;
        boolean boolean28 = jSTypeRegistry25.resetImplicitPrototype(jSType26, objectType27);
        com.google.javascript.rhino.jstype.JSType jSType33 = jSTypeRegistry25.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = jSType33.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType35 = jSTypeRegistry7.createParameterizedType(objectType22, jSType33);
        java.util.Set set36 = parameterizedType35.getOwnPropertyNames();
        boolean boolean37 = parameterizedType35.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType38 = parameterizedType35.getIndexType();
        boolean boolean39 = cloneableList4.equals((java.lang.Object) parameterizedType35);
        com.google.javascript.rhino.Node node41 = parameterizedType35.getPropertyNode("function (): {proxy:{1288677244}}");
        boolean boolean43 = parameterizedType35.isPropertyTypeDeclared("false");
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44, true);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean55 = node54.isFalse();
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean59 = node58.isTrue();
        boolean boolean60 = node58.hasOneChild();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean64 = node63.isTrue();
        boolean boolean65 = node63.isBreak();
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node((int) (byte) 1, node51, node54, node58, node63, (int) (byte) 1, 4095);
        boolean boolean69 = node51.isDelProp();
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry72 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70, true);
        com.google.javascript.rhino.jstype.JSType jSType73 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType74 = null;
        boolean boolean75 = jSTypeRegistry72.resetImplicitPrototype(jSType73, objectType74);
        com.google.javascript.rhino.jstype.JSType jSType80 = jSTypeRegistry72.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType81 = jSType80.dereference();
        boolean boolean82 = objectType81.isFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType83 = jSTypeRegistry46.createObjectType("hi!", node51, objectType81);
        boolean boolean84 = objectType81.isEnumType();
        parameterizedType35.matchConstraint(objectType81);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet86 = objectType81.getPossibleToBooleanOutcomes();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType21 and parameterizedType35.", jSType21.equals(parameterizedType35) == parameterizedType35.equals(jSType21));
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test767");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (byte) 0);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile2 = null;
        node1.setStaticSourceFile(staticSourceFile2);
        int int5 = node1.getIntProp(51);
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newExpr(node1);
        com.google.javascript.rhino.Node node7 = node6.removeChildren();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable8 = node7.children();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1));
        com.google.javascript.rhino.Node node11 = node7.srcref(node10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        boolean boolean17 = jSTypeRegistry14.resetImplicitPrototype(jSType15, objectType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, true);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        boolean boolean35 = jSTypeRegistry32.resetImplicitPrototype(jSType33, objectType34);
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry32.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType41 = jSType40.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType42 = jSTypeRegistry14.createParameterizedType(objectType29, jSType40);
        java.util.Set set43 = parameterizedType42.getOwnPropertyNames();
        boolean boolean44 = parameterizedType42.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, true);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType49 = null;
        boolean boolean50 = jSTypeRegistry47.resetImplicitPrototype(jSType48, objectType49);
        com.google.javascript.rhino.jstype.JSType jSType55 = jSTypeRegistry47.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType56 = jSType55.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType57 = jSType55.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType58 = jSType55.restrictByNotNullOrUndefined();
        boolean boolean59 = parameterizedType42.canAssignTo(jSType55);
        boolean boolean61 = parameterizedType42.isPropertyTypeInferred("");
        boolean boolean62 = parameterizedType42.isResolved();
        com.google.javascript.rhino.jstype.ObjectType objectType63 = parameterizedType42.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType65 = parameterizedType42.findPropertyType("{proxy:{proxy:{649633010}}}");
        boolean boolean66 = parameterizedType42.isNominalType();
        com.google.javascript.rhino.jstype.JSType jSType67 = parameterizedType42.unboxesTo();
        node11.setJSType((com.google.javascript.rhino.jstype.JSType) parameterizedType42);
        com.google.javascript.rhino.Node node69 = node11.removeFirstChild();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType28 and parameterizedType42.", jSType28.equals(parameterizedType42) == parameterizedType42.equals(jSType28));
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test768");
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.ObjectType> objectTypeBuilder0 = com.google.common.collect.ImmutableList.builder();
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.ObjectType> objectTypeBuilder1 = com.google.common.collect.ImmutableList.builder();
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2, true);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        boolean boolean7 = jSTypeRegistry4.resetImplicitPrototype(jSType5, objectType6);
        com.google.javascript.rhino.jstype.JSType jSType12 = jSTypeRegistry4.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType13 = jSType12.dereference();
        boolean boolean14 = objectType13.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable15 = objectType13.getCtorImplementedInterfaces();
        boolean boolean16 = objectType13.isNativeObjectType();
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.ObjectType> objectTypeBuilder17 = objectTypeBuilder1.add(objectType13);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.ObjectType>> objectTypeBuilderList18 = com.google.common.collect.ImmutableList.of(objectTypeBuilder0, objectTypeBuilder17);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19, true);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = null;
        boolean boolean24 = jSTypeRegistry21.resetImplicitPrototype(jSType22, objectType23);
        com.google.javascript.rhino.jstype.JSType jSType29 = jSTypeRegistry21.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSType29.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, true);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType36 = null;
        boolean boolean37 = jSTypeRegistry34.resetImplicitPrototype(jSType35, objectType36);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38, true);
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType42 = null;
        boolean boolean43 = jSTypeRegistry40.resetImplicitPrototype(jSType41, objectType42);
        com.google.javascript.rhino.jstype.JSType jSType48 = jSTypeRegistry40.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType49 = jSType48.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50, true);
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType54 = null;
        boolean boolean55 = jSTypeRegistry52.resetImplicitPrototype(jSType53, objectType54);
        com.google.javascript.rhino.jstype.JSType jSType60 = jSTypeRegistry52.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType61 = jSType60.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType62 = jSTypeRegistry34.createParameterizedType(objectType49, jSType60);
        java.util.Set set63 = parameterizedType62.getOwnPropertyNames();
        boolean boolean64 = parameterizedType62.isNoObjectType();
        boolean boolean65 = parameterizedType62.isAllType();
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newNumber((double) (-1L));
        boolean boolean68 = objectType30.defineInferredProperty("unknown", (com.google.javascript.rhino.jstype.JSType) parameterizedType62, node67);
        com.google.javascript.rhino.ErrorReporter errorReporter69 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter69, true);
        com.google.javascript.rhino.jstype.JSType jSType72 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType73 = null;
        boolean boolean74 = jSTypeRegistry71.resetImplicitPrototype(jSType72, objectType73);
        com.google.javascript.rhino.jstype.JSType jSType79 = jSTypeRegistry71.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType80 = jSType79.dereference();
        boolean boolean81 = parameterizedType62.isEquivalentTo(jSType79);
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.ObjectType> objectTypeBuilder82 = objectTypeBuilder17.add((com.google.javascript.rhino.jstype.ObjectType) parameterizedType62);
        boolean boolean83 = parameterizedType62.hasAnyTemplate();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType84 = parameterizedType62.toMaybeParameterizedType();
        boolean boolean85 = parameterizedType84.isEnumElementType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType12 and parameterizedType84.", jSType12.equals(parameterizedType84) == parameterizedType84.equals(jSType12));
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test769");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.hasReferenceName();
        boolean boolean33 = parameterizedType30.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.JSType jSType35 = parameterizedType30.findPropertyType("");
        boolean boolean36 = parameterizedType30.isEmptyType();
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37, true);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType41 = null;
        boolean boolean42 = jSTypeRegistry39.resetImplicitPrototype(jSType40, objectType41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = null;
        boolean boolean48 = jSTypeRegistry45.resetImplicitPrototype(jSType46, objectType47);
        com.google.javascript.rhino.jstype.JSType jSType53 = jSTypeRegistry45.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType54 = jSType53.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, true);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType59 = null;
        boolean boolean60 = jSTypeRegistry57.resetImplicitPrototype(jSType58, objectType59);
        com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry57.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType66 = jSType65.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType67 = jSTypeRegistry39.createParameterizedType(objectType54, jSType65);
        java.util.Set set68 = parameterizedType67.getOwnPropertyNames();
        com.google.javascript.rhino.JSDocInfo jSDocInfo69 = parameterizedType67.getJSDocInfo();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot71 = parameterizedType67.getOwnSlot("{proxy:{proxy:{1473195276}}}");
        com.google.javascript.rhino.jstype.JSType.TypePair typePair72 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) parameterizedType30, (com.google.javascript.rhino.jstype.JSType) parameterizedType67);
        com.google.javascript.rhino.jstype.JSType jSType73 = typePair72.typeB;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test770");
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.ObjectType> objectTypeBuilder0 = com.google.common.collect.ImmutableList.builder();
        com.google.javascript.rhino.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter1, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        boolean boolean6 = jSTypeRegistry3.resetImplicitPrototype(jSType4, objectType5);
        com.google.javascript.rhino.jstype.JSType jSType11 = jSTypeRegistry3.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = jSType11.dereference();
        boolean boolean13 = objectType12.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable14 = objectType12.getCtorImplementedInterfaces();
        boolean boolean15 = objectType12.isNativeObjectType();
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.ObjectType> objectTypeBuilder16 = objectTypeBuilder0.add(objectType12);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        boolean boolean22 = jSTypeRegistry19.resetImplicitPrototype(jSType20, objectType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = null;
        boolean boolean28 = jSTypeRegistry25.resetImplicitPrototype(jSType26, objectType27);
        com.google.javascript.rhino.jstype.JSType jSType33 = jSTypeRegistry25.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = jSType33.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35, true);
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType39 = null;
        boolean boolean40 = jSTypeRegistry37.resetImplicitPrototype(jSType38, objectType39);
        com.google.javascript.rhino.jstype.JSType jSType45 = jSTypeRegistry37.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = jSType45.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType47 = jSTypeRegistry19.createParameterizedType(objectType34, jSType45);
        java.util.Set set48 = parameterizedType47.getOwnPropertyNames();
        boolean boolean49 = parameterizedType47.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType50 = parameterizedType47.getIndexType();
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51, true);
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType55 = null;
        boolean boolean56 = jSTypeRegistry53.resetImplicitPrototype(jSType54, objectType55);
        com.google.javascript.rhino.jstype.JSType jSType61 = jSTypeRegistry53.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType62 = jSType61.dereference();
        boolean boolean63 = objectType62.isRegexpType();
        boolean boolean65 = objectType62.isPropertyTypeInferred("hi!");
        boolean boolean66 = parameterizedType47.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) objectType62);
        java.lang.String str67 = parameterizedType47.toDebugHashCodeString();
        boolean boolean69 = parameterizedType47.hasOwnProperty("");
        boolean boolean70 = parameterizedType47.isNullType();
        boolean boolean72 = parameterizedType47.isPropertyTypeDeclared("{proxy:{proxy:{1874555938}}}");
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.ObjectType> objectTypeBuilder73 = objectTypeBuilder0.add((com.google.javascript.rhino.jstype.ObjectType) parameterizedType47);
        com.google.javascript.rhino.jstype.ObjectType objectType74 = parameterizedType47.dereference();
        boolean boolean75 = parameterizedType47.isDateType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType11 and parameterizedType47.", jSType11.equals(parameterizedType47) == parameterizedType47.equals(jSType11));
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test771");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType33 = parameterizedType30.getIndexType();
        java.lang.String str34 = parameterizedType30.toDebugHashCodeString();
        boolean boolean35 = parameterizedType30.isInterface();
        com.google.javascript.rhino.Node node36 = parameterizedType30.getRootNode();
        boolean boolean38 = parameterizedType30.removeProperty("function (): {proxy:{1553899974}}");
        boolean boolean39 = parameterizedType30.isInterface();
        boolean boolean40 = parameterizedType30.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.ObjectType objectType41 = parameterizedType30.toObjectType();
        boolean boolean42 = parameterizedType30.isOrdinaryFunction();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test772");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        boolean boolean3 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        boolean boolean18 = objectType17.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable19 = objectType17.getCtorImplementedInterfaces();
        boolean boolean20 = objectType17.isNativeObjectType();
        jSTypeRegistry2.registerPropertyOnType("", (com.google.javascript.rhino.jstype.JSType) objectType17);
        jSTypeRegistry2.clearTemplateTypeNames();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList26 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node25);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList27 = cloneableList26.asList();
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = null;
        boolean boolean33 = jSTypeRegistry30.resetImplicitPrototype(jSType31, objectType32);
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType38 = null;
        boolean boolean39 = jSTypeRegistry36.resetImplicitPrototype(jSType37, objectType38);
        com.google.javascript.rhino.jstype.JSType jSType44 = jSTypeRegistry36.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSType44.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, true);
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType50 = null;
        boolean boolean51 = jSTypeRegistry48.resetImplicitPrototype(jSType49, objectType50);
        com.google.javascript.rhino.jstype.JSType jSType56 = jSTypeRegistry48.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType57 = jSType56.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType58 = jSTypeRegistry30.createParameterizedType(objectType45, jSType56);
        java.util.Set set59 = parameterizedType58.getOwnPropertyNames();
        boolean boolean60 = parameterizedType58.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType61 = parameterizedType58.getIndexType();
        boolean boolean62 = cloneableList27.equals((java.lang.Object) parameterizedType58);
        boolean boolean64 = parameterizedType58.isPropertyInExterns("function (): {proxy:{685828741}}");
        boolean boolean65 = parameterizedType58.isNumberValueType();
        com.google.javascript.rhino.jstype.JSType jSType66 = jSTypeRegistry2.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType) parameterizedType58);
        jSTypeRegistry2.identifyNonNullableName("");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType58.", jSType16.equals(parameterizedType58) == parameterizedType58.equals(jSType16));
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test773");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.hasReferenceName();
        boolean boolean33 = parameterizedType30.hasAnyTemplateInternal();
        boolean boolean34 = parameterizedType30.isOrdinaryFunction();
        boolean boolean35 = parameterizedType30.isInstanceType();
        com.google.javascript.rhino.jstype.JSType jSType37 = parameterizedType30.getPropertyType("{proxy:{proxy:{628733757}}}");
        boolean boolean38 = parameterizedType30.isFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType40 = parameterizedType30.findPropertyType("function (): {proxy:{1288677244}}");
        boolean boolean41 = parameterizedType30.hasReferenceName();
        boolean boolean42 = parameterizedType30.isNumberObjectType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType43 = parameterizedType30.toMaybeParameterizedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo44 = parameterizedType30.getJSDocInfo();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test774");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        boolean boolean3 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        boolean boolean10 = jSTypeRegistry7.resetImplicitPrototype(jSType8, objectType9);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, true);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        boolean boolean16 = jSTypeRegistry13.resetImplicitPrototype(jSType14, objectType15);
        com.google.javascript.rhino.jstype.JSType jSType21 = jSTypeRegistry13.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSType21.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = null;
        boolean boolean28 = jSTypeRegistry25.resetImplicitPrototype(jSType26, objectType27);
        com.google.javascript.rhino.jstype.JSType jSType33 = jSTypeRegistry25.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = jSType33.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType35 = jSTypeRegistry7.createParameterizedType(objectType22, jSType33);
        java.util.Set set36 = parameterizedType35.getOwnPropertyNames();
        boolean boolean37 = parameterizedType35.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, true);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType43 = null;
        boolean boolean44 = jSTypeRegistry41.resetImplicitPrototype(jSType42, objectType43);
        com.google.javascript.rhino.ErrorReporter errorReporter45 = jSTypeRegistry41.getErrorReporter();
        jSTypeRegistry41.clearNamedTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47, true);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean58 = node57.isFalse();
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean62 = node61.isTrue();
        boolean boolean63 = node61.hasOneChild();
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean67 = node66.isTrue();
        boolean boolean68 = node66.isBreak();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node((int) (byte) 1, node54, node57, node61, node66, (int) (byte) 1, 4095);
        boolean boolean72 = node54.isDelProp();
        com.google.javascript.rhino.ErrorReporter errorReporter73 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry75 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter73, true);
        com.google.javascript.rhino.jstype.JSType jSType76 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType77 = null;
        boolean boolean78 = jSTypeRegistry75.resetImplicitPrototype(jSType76, objectType77);
        com.google.javascript.rhino.jstype.JSType jSType83 = jSTypeRegistry75.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType84 = jSType83.dereference();
        boolean boolean85 = objectType84.isFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType86 = jSTypeRegistry49.createObjectType("hi!", node54, objectType84);
        boolean boolean87 = objectType84.isEnumType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo88 = null;
        objectType84.setJSDocInfo(jSDocInfo88);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray91 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType92 = jSTypeRegistry41.createConstructorType((com.google.javascript.rhino.jstype.JSType) objectType84, false, jSTypeArray91);
        com.google.javascript.rhino.jstype.FunctionType functionType93 = jSTypeRegistry2.createConstructorType((com.google.javascript.rhino.jstype.JSType) parameterizedType35, false, jSTypeArray91);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable95 = jSTypeRegistry2.getTypesWithProperty("function (): {proxy:{848640642}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType21 and parameterizedType35.", jSType21.equals(parameterizedType35) == parameterizedType35.equals(jSType21));
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test775");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean7 = node6.isFalse();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean11 = node10.isTrue();
        boolean boolean12 = node10.hasOneChild();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean16 = node15.isTrue();
        boolean boolean17 = node15.isBreak();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (byte) 1, node3, node6, node10, node15, (int) (byte) 1, 4095);
        node20.detachChildren();
        com.google.javascript.rhino.Node node22 = node20.removeFirstChild();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node20.siblings();
        boolean boolean24 = node20.isString();
        boolean boolean25 = node20.isQualifiedName();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) (byte) 10, (int) (byte) 0, 1);
        node29.setLineno((int) ' ');
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression33 = new com.google.javascript.rhino.JSTypeExpression(node29, "function (): {proxy:{1288677244}}");
        com.google.javascript.rhino.Node node34 = jSTypeExpression33.getRoot();
        node34.setIsSyntheticBlock(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node37 = node20.getChildBefore(node34);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test776");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNominalType();
        com.google.javascript.rhino.jstype.JSType jSType33 = parameterizedType30.collapseUnion();
        boolean boolean34 = parameterizedType30.matchesObjectContext();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test777");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean7 = node6.isFalse();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean11 = node10.isTrue();
        boolean boolean12 = node10.hasOneChild();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean16 = node15.isTrue();
        boolean boolean17 = node15.isBreak();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (byte) 1, node3, node6, node10, node15, (int) (byte) 1, 4095);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable21 = node20.children();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean29 = node28.isFalse();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean33 = node32.isTrue();
        boolean boolean34 = node32.hasOneChild();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean38 = node37.isTrue();
        boolean boolean39 = node37.isBreak();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((int) (byte) 1, node25, node28, node32, node37, (int) (byte) 1, 4095);
        com.google.javascript.rhino.Node node43 = node20.useSourceInfoIfMissingFromForTree(node37);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable44 = node20.siblings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node46 = node20.getChildAtIndex(14);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test778");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.hasReferenceName();
        boolean boolean33 = parameterizedType30.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.JSType jSType35 = parameterizedType30.findPropertyType("");
        java.lang.String str36 = parameterizedType30.getReferenceName();
        com.google.javascript.rhino.jstype.UnionType unionType37 = parameterizedType30.toMaybeUnionType();
        boolean boolean39 = parameterizedType30.hasOwnProperty("function (): {proxy:{1262905525}}");
        com.google.javascript.rhino.JSDocInfo jSDocInfo40 = parameterizedType30.getJSDocInfo();
        com.google.javascript.rhino.jstype.JSType jSType42 = parameterizedType30.findPropertyType("{proxy:{proxy:{1317500836}}}");
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = null;
        boolean boolean48 = jSTypeRegistry45.resetImplicitPrototype(jSType46, objectType47);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49, true);
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType53 = null;
        boolean boolean54 = jSTypeRegistry51.resetImplicitPrototype(jSType52, objectType53);
        com.google.javascript.rhino.jstype.JSType jSType59 = jSTypeRegistry51.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType60 = jSType59.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61, true);
        com.google.javascript.rhino.jstype.JSType jSType64 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType65 = null;
        boolean boolean66 = jSTypeRegistry63.resetImplicitPrototype(jSType64, objectType65);
        com.google.javascript.rhino.jstype.JSType jSType71 = jSTypeRegistry63.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType72 = jSType71.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType73 = jSTypeRegistry45.createParameterizedType(objectType60, jSType71);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable74 = parameterizedType73.getCtorExtendedInterfaces();
        boolean boolean75 = parameterizedType73.isNominalType();
        boolean boolean76 = parameterizedType73.isAllType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo78 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean79 = jSDocInfo78.isInterface();
        java.util.Collection<java.lang.String> strCollection80 = jSDocInfo78.getReferences();
        parameterizedType73.setPropertyJSDocInfo("", jSDocInfo78);
        boolean boolean82 = parameterizedType73.canBeCalled();
        boolean boolean83 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) parameterizedType30, (com.google.javascript.rhino.jstype.JSType) parameterizedType73);
        com.google.javascript.rhino.jstype.UnionType unionType84 = parameterizedType73.toMaybeUnionType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test779");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        boolean boolean3 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        jSTypeRegistry2.clearTemplateTypeNames();
        boolean boolean6 = jSTypeRegistry2.hasNamespace("function (): {proxy:{685828741}}");
        jSTypeRegistry2.forwardDeclareType("");
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        boolean boolean14 = jSTypeRegistry11.resetImplicitPrototype(jSType12, objectType13);
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        boolean boolean20 = jSTypeRegistry17.resetImplicitPrototype(jSType18, objectType19);
        com.google.javascript.rhino.jstype.JSType jSType25 = jSTypeRegistry17.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = jSType25.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27, true);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        boolean boolean32 = jSTypeRegistry29.resetImplicitPrototype(jSType30, objectType31);
        com.google.javascript.rhino.jstype.JSType jSType37 = jSTypeRegistry29.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType38 = jSType37.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType39 = jSTypeRegistry11.createParameterizedType(objectType26, jSType37);
        java.util.Set set40 = parameterizedType39.getOwnPropertyNames();
        boolean boolean41 = parameterizedType39.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, true);
        com.google.javascript.rhino.jstype.JSType jSType45 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        boolean boolean47 = jSTypeRegistry44.resetImplicitPrototype(jSType45, objectType46);
        com.google.javascript.rhino.jstype.JSType jSType52 = jSTypeRegistry44.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType53 = jSType52.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType54 = jSType52.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType55 = jSType52.restrictByNotNullOrUndefined();
        boolean boolean56 = parameterizedType39.canAssignTo(jSType52);
        boolean boolean58 = parameterizedType39.isPropertyTypeInferred("");
        boolean boolean59 = parameterizedType39.isResolved();
        com.google.javascript.rhino.jstype.ObjectType objectType60 = parameterizedType39.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType62 = parameterizedType39.findPropertyType("{proxy:{proxy:{649633010}}}");
        boolean boolean63 = parameterizedType39.isNominalType();
        boolean boolean64 = parameterizedType39.isNominalType();
        boolean boolean65 = parameterizedType39.isInterface();
        com.google.javascript.rhino.Node node67 = parameterizedType39.getPropertyNode("JSDocInfo");
        com.google.javascript.rhino.jstype.JSType jSType69 = parameterizedType39.findPropertyType("function (): {proxy:{1940927328}}");
        boolean boolean71 = parameterizedType39.isPropertyTypeInferred("((function (): {proxy:{1262905525}}))");
        com.google.javascript.rhino.jstype.JSType jSType72 = jSTypeRegistry2.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType) parameterizedType39);
        jSTypeRegistry2.forwardDeclareType("function (): {proxy:{1712173712}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType25 and parameterizedType39.", jSType25.equals(parameterizedType39) == parameterizedType39.equals(jSType25));
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test780");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable31 = parameterizedType30.getCtorExtendedInterfaces();
        boolean boolean32 = parameterizedType30.isNominalType();
        boolean boolean33 = parameterizedType30.isAllType();
        com.google.javascript.rhino.jstype.JSType jSType34 = parameterizedType30.collapseUnion();
        com.google.javascript.rhino.jstype.ObjectType objectType35 = parameterizedType30.toObjectType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and objectType35.", jSType16.equals(objectType35) == objectType35.equals(jSType16));
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test781");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        boolean boolean10 = jSTypeRegistry7.resetImplicitPrototype(jSType8, objectType9);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, true);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        boolean boolean16 = jSTypeRegistry13.resetImplicitPrototype(jSType14, objectType15);
        com.google.javascript.rhino.jstype.JSType jSType21 = jSTypeRegistry13.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSType21.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = null;
        boolean boolean28 = jSTypeRegistry25.resetImplicitPrototype(jSType26, objectType27);
        com.google.javascript.rhino.jstype.JSType jSType33 = jSTypeRegistry25.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = jSType33.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType35 = jSTypeRegistry7.createParameterizedType(objectType22, jSType33);
        java.util.Set set36 = parameterizedType35.getOwnPropertyNames();
        boolean boolean37 = parameterizedType35.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType38 = parameterizedType35.getIndexType();
        boolean boolean39 = cloneableList4.equals((java.lang.Object) parameterizedType35);
        boolean boolean40 = parameterizedType35.hasDisplayName();
        com.google.javascript.rhino.jstype.FunctionType functionType41 = parameterizedType35.toMaybeFunctionType();
        boolean boolean43 = parameterizedType35.removeProperty("{proxy:{proxy:{1168420562}}}");
        boolean boolean45 = parameterizedType35.isPropertyTypeDeclared("{proxy:{proxy:{628733757}}}");
        com.google.javascript.rhino.jstype.FunctionType functionType46 = parameterizedType35.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType47 = parameterizedType35.dereference();
        boolean boolean48 = parameterizedType35.isAllType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType21 and parameterizedType35.", jSType21.equals(parameterizedType35) == parameterizedType35.equals(jSType21));
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test782");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        boolean boolean38 = jSTypeRegistry35.resetImplicitPrototype(jSType36, objectType37);
        com.google.javascript.rhino.jstype.JSType jSType43 = jSTypeRegistry35.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = jSType43.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSType43.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType46 = jSType43.restrictByNotNullOrUndefined();
        boolean boolean47 = parameterizedType30.canAssignTo(jSType43);
        boolean boolean49 = parameterizedType30.isPropertyTypeInferred("");
        boolean boolean50 = parameterizedType30.isResolved();
        boolean boolean51 = parameterizedType30.isInstanceType();
        java.util.Set set52 = parameterizedType30.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.JSType jSType54 = parameterizedType30.getPropertyType("{proxy:{proxy:{1004792283}}}");
        boolean boolean55 = parameterizedType30.isNoResolvedType();
        java.lang.String str56 = parameterizedType30.toDebugHashCodeString();
        boolean boolean57 = parameterizedType30.isNominalType();
        boolean boolean58 = parameterizedType30.matchesUint32Context();
        java.util.Set set59 = parameterizedType30.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.ObjectType objectType61 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface((com.google.javascript.rhino.jstype.ObjectType) parameterizedType30, "function (): {proxy:{1024660089}}");
        com.google.javascript.rhino.jstype.FunctionType functionType62 = parameterizedType30.getConstructor();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test783");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.jstype.JSType jSType10 = jSTypeRegistry2.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = jSType10.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        boolean boolean18 = jSTypeRegistry15.resetImplicitPrototype(jSType16, objectType17);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19, true);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = null;
        boolean boolean24 = jSTypeRegistry21.resetImplicitPrototype(jSType22, objectType23);
        com.google.javascript.rhino.jstype.JSType jSType29 = jSTypeRegistry21.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSType29.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = null;
        boolean boolean36 = jSTypeRegistry33.resetImplicitPrototype(jSType34, objectType35);
        com.google.javascript.rhino.jstype.JSType jSType41 = jSTypeRegistry33.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType42 = jSType41.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType43 = jSTypeRegistry15.createParameterizedType(objectType30, jSType41);
        java.util.Set set44 = parameterizedType43.getOwnPropertyNames();
        boolean boolean45 = parameterizedType43.isNoObjectType();
        boolean boolean46 = parameterizedType43.isAllType();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber((double) (-1L));
        boolean boolean49 = objectType11.defineInferredProperty("unknown", (com.google.javascript.rhino.jstype.JSType) parameterizedType43, node48);
        com.google.javascript.rhino.jstype.UnionType unionType50 = parameterizedType43.toMaybeUnionType();
        boolean boolean51 = parameterizedType43.hasReferenceName();
        java.lang.String str52 = parameterizedType43.getNormalizedReferenceName();
        boolean boolean53 = parameterizedType43.matchesStringContext();
        com.google.javascript.rhino.jstype.EnumType enumType54 = parameterizedType43.toMaybeEnumType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType55 = parameterizedType43.toMaybeParameterizedType();
        boolean boolean56 = parameterizedType43.isVoidType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType10 and parameterizedType43.", jSType10.equals(parameterizedType43) == parameterizedType43.equals(jSType10));
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test784");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        boolean boolean3 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        boolean boolean10 = jSTypeRegistry7.resetImplicitPrototype(jSType8, objectType9);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, true);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        boolean boolean16 = jSTypeRegistry13.resetImplicitPrototype(jSType14, objectType15);
        com.google.javascript.rhino.jstype.JSType jSType21 = jSTypeRegistry13.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSType21.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = null;
        boolean boolean28 = jSTypeRegistry25.resetImplicitPrototype(jSType26, objectType27);
        com.google.javascript.rhino.jstype.JSType jSType33 = jSTypeRegistry25.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = jSType33.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType35 = jSTypeRegistry7.createParameterizedType(objectType22, jSType33);
        java.util.Set set36 = parameterizedType35.getOwnPropertyNames();
        boolean boolean37 = parameterizedType35.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, true);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType43 = null;
        boolean boolean44 = jSTypeRegistry41.resetImplicitPrototype(jSType42, objectType43);
        com.google.javascript.rhino.ErrorReporter errorReporter45 = jSTypeRegistry41.getErrorReporter();
        jSTypeRegistry41.clearNamedTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47, true);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean58 = node57.isFalse();
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean62 = node61.isTrue();
        boolean boolean63 = node61.hasOneChild();
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean67 = node66.isTrue();
        boolean boolean68 = node66.isBreak();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node((int) (byte) 1, node54, node57, node61, node66, (int) (byte) 1, 4095);
        boolean boolean72 = node54.isDelProp();
        com.google.javascript.rhino.ErrorReporter errorReporter73 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry75 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter73, true);
        com.google.javascript.rhino.jstype.JSType jSType76 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType77 = null;
        boolean boolean78 = jSTypeRegistry75.resetImplicitPrototype(jSType76, objectType77);
        com.google.javascript.rhino.jstype.JSType jSType83 = jSTypeRegistry75.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType84 = jSType83.dereference();
        boolean boolean85 = objectType84.isFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType86 = jSTypeRegistry49.createObjectType("hi!", node54, objectType84);
        boolean boolean87 = objectType84.isEnumType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo88 = null;
        objectType84.setJSDocInfo(jSDocInfo88);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray91 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType92 = jSTypeRegistry41.createConstructorType((com.google.javascript.rhino.jstype.JSType) objectType84, false, jSTypeArray91);
        com.google.javascript.rhino.jstype.FunctionType functionType93 = jSTypeRegistry2.createConstructorType((com.google.javascript.rhino.jstype.JSType) parameterizedType35, false, jSTypeArray91);
        jSTypeRegistry2.incrementGeneration();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType21 and parameterizedType35.", jSType21.equals(parameterizedType35) == parameterizedType35.equals(jSType21));
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test785");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        boolean boolean10 = jSTypeRegistry7.resetImplicitPrototype(jSType8, objectType9);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, true);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        boolean boolean16 = jSTypeRegistry13.resetImplicitPrototype(jSType14, objectType15);
        com.google.javascript.rhino.jstype.JSType jSType21 = jSTypeRegistry13.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSType21.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = null;
        boolean boolean28 = jSTypeRegistry25.resetImplicitPrototype(jSType26, objectType27);
        com.google.javascript.rhino.jstype.JSType jSType33 = jSTypeRegistry25.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = jSType33.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType35 = jSTypeRegistry7.createParameterizedType(objectType22, jSType33);
        java.util.Set set36 = parameterizedType35.getOwnPropertyNames();
        boolean boolean37 = parameterizedType35.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType38 = parameterizedType35.getIndexType();
        boolean boolean39 = cloneableList4.equals((java.lang.Object) parameterizedType35);
        boolean boolean41 = parameterizedType35.isPropertyInExterns("function (): {proxy:{685828741}}");
        boolean boolean42 = parameterizedType35.isNumberValueType();
        boolean boolean43 = parameterizedType35.isDateType();
        com.google.javascript.rhino.jstype.JSType jSType44 = parameterizedType35.collapseUnion();
        boolean boolean45 = parameterizedType35.isAllType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType21 and parameterizedType35.", jSType21.equals(parameterizedType35) == parameterizedType35.equals(jSType21));
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test786");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        boolean boolean38 = jSTypeRegistry35.resetImplicitPrototype(jSType36, objectType37);
        com.google.javascript.rhino.jstype.JSType jSType43 = jSTypeRegistry35.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = jSType43.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSType43.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType46 = jSType43.restrictByNotNullOrUndefined();
        boolean boolean47 = parameterizedType30.canAssignTo(jSType43);
        boolean boolean49 = parameterizedType30.isPropertyTypeInferred("");
        boolean boolean50 = parameterizedType30.isResolved();
        boolean boolean51 = parameterizedType30.isInstanceType();
        com.google.javascript.rhino.jstype.FunctionType functionType52 = parameterizedType30.getOwnerFunction();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType57 = null;
        boolean boolean58 = jSTypeRegistry55.resetImplicitPrototype(jSType56, objectType57);
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        com.google.javascript.rhino.jstype.JSType jSType62 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType63 = null;
        boolean boolean64 = jSTypeRegistry61.resetImplicitPrototype(jSType62, objectType63);
        com.google.javascript.rhino.jstype.JSType jSType69 = jSTypeRegistry61.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType70 = jSType69.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter71 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter71, true);
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType75 = null;
        boolean boolean76 = jSTypeRegistry73.resetImplicitPrototype(jSType74, objectType75);
        com.google.javascript.rhino.jstype.JSType jSType81 = jSTypeRegistry73.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType82 = jSType81.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType83 = jSTypeRegistry55.createParameterizedType(objectType70, jSType81);
        boolean boolean84 = parameterizedType83.isInterface();
        boolean boolean85 = parameterizedType83.isFunctionPrototypeType();
        boolean boolean86 = parameterizedType83.isObject();
        java.util.Set<java.lang.String> strSet87 = parameterizedType83.getOwnPropertyNames();
        boolean boolean88 = parameterizedType30.canAssignTo((com.google.javascript.rhino.jstype.JSType) parameterizedType83);
        com.google.javascript.rhino.jstype.EnumElementType enumElementType89 = parameterizedType30.toMaybeEnumElementType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType83.", jSType16.equals(parameterizedType83) == parameterizedType83.equals(jSType16));
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test787");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("{proxy:{proxy:{142985216}}}");
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(43, 12, (int) (short) -1);
        boolean boolean6 = node5.isScript();
        java.lang.String str7 = node5.toStringTree();
        boolean boolean8 = node5.isSyntheticBlock();
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative10 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec11 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("function (): {proxy:{10439819}}", jSTypeNative10);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (byte) -1, "hi!");
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(41, node15, (int) (short) 1, 40);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19, true);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = null;
        boolean boolean24 = jSTypeRegistry21.resetImplicitPrototype(jSType22, objectType23);
        jSTypeRegistry21.setLastGeneration(false);
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27, true);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        boolean boolean32 = jSTypeRegistry29.resetImplicitPrototype(jSType30, objectType31);
        com.google.javascript.rhino.jstype.JSType jSType37 = jSTypeRegistry29.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType38 = jSType37.dereference();
        boolean boolean39 = objectType38.isFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry21.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType) objectType38);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable42 = jSTypeRegistry21.getEachReferenceTypeWithProperty("({proxy:{proxy:{1874555938}}})");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable44 = jSTypeRegistry21.getEachReferenceTypeWithProperty("function (): {proxy:{1240268079}}");
        com.google.javascript.rhino.jstype.JSType jSType45 = assertionFunctionSpec11.getAssertedType(node18, jSTypeRegistry21);
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47, true);
        com.google.javascript.rhino.jstype.JSType jSType50 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType51 = null;
        boolean boolean52 = jSTypeRegistry49.resetImplicitPrototype(jSType50, objectType51);
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType57 = null;
        boolean boolean58 = jSTypeRegistry55.resetImplicitPrototype(jSType56, objectType57);
        com.google.javascript.rhino.jstype.JSType jSType63 = jSTypeRegistry55.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = jSType63.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65, true);
        com.google.javascript.rhino.jstype.JSType jSType68 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType69 = null;
        boolean boolean70 = jSTypeRegistry67.resetImplicitPrototype(jSType68, objectType69);
        com.google.javascript.rhino.jstype.JSType jSType75 = jSTypeRegistry67.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType76 = jSType75.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType77 = jSTypeRegistry49.createParameterizedType(objectType64, jSType75);
        java.util.Set set78 = parameterizedType77.getOwnPropertyNames();
        boolean boolean79 = parameterizedType77.isNoObjectType();
        boolean boolean80 = parameterizedType77.isAllType();
        boolean boolean81 = parameterizedType77.isEnumElementType();
        boolean boolean82 = parameterizedType77.isUnknownType();
        com.google.javascript.rhino.jstype.EnumType enumType83 = parameterizedType77.toMaybeEnumType();
        jSTypeRegistry21.unregisterPropertyOnType("(function (): {proxy:{2008360548}})", (com.google.javascript.rhino.jstype.JSType) parameterizedType77);
        com.google.javascript.rhino.jstype.JSType jSType85 = assertionFunctionSpec1.getAssertedType(node5, jSTypeRegistry21);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType37 and parameterizedType77.", jSType37.equals(parameterizedType77) == parameterizedType77.equals(jSType37));
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test788");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.hasReferenceName();
        boolean boolean33 = parameterizedType30.hasAnyTemplateInternal();
        boolean boolean34 = parameterizedType30.isOrdinaryFunction();
        boolean boolean35 = parameterizedType30.isOrdinaryFunction();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType40 = null;
        boolean boolean41 = jSTypeRegistry38.resetImplicitPrototype(jSType39, objectType40);
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, true);
        com.google.javascript.rhino.jstype.JSType jSType45 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        boolean boolean47 = jSTypeRegistry44.resetImplicitPrototype(jSType45, objectType46);
        com.google.javascript.rhino.jstype.JSType jSType52 = jSTypeRegistry44.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType53 = jSType52.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType58 = null;
        boolean boolean59 = jSTypeRegistry56.resetImplicitPrototype(jSType57, objectType58);
        com.google.javascript.rhino.jstype.JSType jSType64 = jSTypeRegistry56.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType65 = jSType64.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType66 = jSTypeRegistry38.createParameterizedType(objectType53, jSType64);
        java.util.Set set67 = parameterizedType66.getOwnPropertyNames();
        boolean boolean68 = parameterizedType66.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType69 = parameterizedType66.getIndexType();
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry72 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70, true);
        com.google.javascript.rhino.jstype.JSType jSType73 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType74 = null;
        boolean boolean75 = jSTypeRegistry72.resetImplicitPrototype(jSType73, objectType74);
        com.google.javascript.rhino.jstype.JSType jSType80 = jSTypeRegistry72.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType81 = jSType80.dereference();
        boolean boolean82 = objectType81.isRegexpType();
        boolean boolean84 = objectType81.isPropertyTypeInferred("hi!");
        boolean boolean85 = parameterizedType66.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) objectType81);
        java.lang.String str86 = parameterizedType66.toDebugHashCodeString();
        boolean boolean88 = parameterizedType66.hasOwnProperty("");
        boolean boolean89 = parameterizedType66.isNullType();
        boolean boolean91 = parameterizedType66.isPropertyTypeDeclared("{proxy:{proxy:{1874555938}}}");
        boolean boolean92 = parameterizedType66.isNominalType();
        boolean boolean93 = parameterizedType66.isAllType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet94 = parameterizedType66.getPossibleToBooleanOutcomes();
        boolean boolean95 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) parameterizedType30, (com.google.javascript.rhino.jstype.JSType) parameterizedType66);
        boolean boolean96 = parameterizedType30.isOrdinaryFunction();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType66.", jSType16.equals(parameterizedType66) == parameterizedType66.equals(jSType16));
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test789");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType33 = parameterizedType30.getIndexType();
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType38 = null;
        boolean boolean39 = jSTypeRegistry36.resetImplicitPrototype(jSType37, objectType38);
        com.google.javascript.rhino.jstype.JSType jSType44 = jSTypeRegistry36.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSType44.dereference();
        boolean boolean46 = objectType45.isRegexpType();
        boolean boolean48 = objectType45.isPropertyTypeInferred("hi!");
        boolean boolean49 = parameterizedType30.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) objectType45);
        boolean boolean50 = parameterizedType30.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType52 = parameterizedType30.getPropertyType("{proxy:{proxy:{644991102}}}");
        com.google.javascript.rhino.jstype.JSType jSType54 = parameterizedType30.findPropertyType("{proxy:{proxy:{1064055734}}}");
        boolean boolean56 = parameterizedType30.removeProperty("{proxy:{proxy:{1719251060}}}");
        com.google.javascript.rhino.jstype.JSType jSType57 = parameterizedType30.collapseUnion();
        java.util.Set set58 = parameterizedType30.getOwnPropertyNames();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test790");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable31 = parameterizedType30.getCtorExtendedInterfaces();
        boolean boolean32 = parameterizedType30.isNominalType();
        boolean boolean33 = parameterizedType30.isAllType();
        boolean boolean34 = parameterizedType30.matchesNumberContext();
        boolean boolean35 = parameterizedType30.isNullable();
        java.lang.Iterable iterable36 = parameterizedType30.getCtorImplementedInterfaces();
        boolean boolean37 = parameterizedType30.isBooleanValueType();
        com.google.javascript.rhino.Node node39 = parameterizedType30.getPropertyNode("{proxy:{proxy:{1910388827}}}");
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        boolean boolean45 = jSTypeRegistry42.resetImplicitPrototype(jSType43, objectType44);
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, true);
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType50 = null;
        boolean boolean51 = jSTypeRegistry48.resetImplicitPrototype(jSType49, objectType50);
        com.google.javascript.rhino.jstype.JSType jSType56 = jSTypeRegistry48.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType57 = jSType56.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter58 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter58, true);
        com.google.javascript.rhino.jstype.JSType jSType61 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType62 = null;
        boolean boolean63 = jSTypeRegistry60.resetImplicitPrototype(jSType61, objectType62);
        com.google.javascript.rhino.jstype.JSType jSType68 = jSTypeRegistry60.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType69 = jSType68.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType70 = jSTypeRegistry42.createParameterizedType(objectType57, jSType68);
        java.util.Set set71 = parameterizedType70.getOwnPropertyNames();
        boolean boolean72 = parameterizedType70.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType73 = parameterizedType70.getIndexType();
        com.google.javascript.rhino.ErrorReporter errorReporter74 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry76 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter74, true);
        com.google.javascript.rhino.jstype.JSType jSType77 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType78 = null;
        boolean boolean79 = jSTypeRegistry76.resetImplicitPrototype(jSType77, objectType78);
        com.google.javascript.rhino.jstype.JSType jSType84 = jSTypeRegistry76.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType85 = jSType84.dereference();
        boolean boolean86 = objectType85.isRegexpType();
        boolean boolean88 = objectType85.isPropertyTypeInferred("hi!");
        boolean boolean89 = parameterizedType70.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) objectType85);
        java.lang.String str90 = parameterizedType70.toDebugHashCodeString();
        boolean boolean92 = parameterizedType70.hasOwnProperty("");
        boolean boolean93 = parameterizedType70.isNullType();
        boolean boolean95 = parameterizedType70.isPropertyTypeDeclared("{proxy:{proxy:{1874555938}}}");
        boolean boolean96 = parameterizedType70.isNominalType();
        boolean boolean97 = parameterizedType70.isAllType();
        com.google.javascript.rhino.jstype.JSType jSType98 = parameterizedType70.autobox();
        boolean boolean99 = parameterizedType30.canTestForShallowEqualityWith(jSType98);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and jSType98.", jSType16.equals(jSType98) == jSType98.equals(jSType16));
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test791");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        boolean boolean3 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        boolean boolean18 = objectType17.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable19 = objectType17.getCtorImplementedInterfaces();
        boolean boolean20 = objectType17.isNativeObjectType();
        jSTypeRegistry2.registerPropertyOnType("", (com.google.javascript.rhino.jstype.JSType) objectType17);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        boolean boolean27 = jSTypeRegistry24.resetImplicitPrototype(jSType25, objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = null;
        boolean boolean33 = jSTypeRegistry30.resetImplicitPrototype(jSType31, objectType32);
        com.google.javascript.rhino.jstype.JSType jSType38 = jSTypeRegistry30.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType39 = jSType38.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        boolean boolean45 = jSTypeRegistry42.resetImplicitPrototype(jSType43, objectType44);
        com.google.javascript.rhino.jstype.JSType jSType50 = jSTypeRegistry42.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType51 = jSType50.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType52 = jSTypeRegistry24.createParameterizedType(objectType39, jSType50);
        java.util.Set set53 = parameterizedType52.getOwnPropertyNames();
        boolean boolean54 = parameterizedType52.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, true);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType59 = null;
        boolean boolean60 = jSTypeRegistry57.resetImplicitPrototype(jSType58, objectType59);
        com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry57.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType66 = jSType65.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType67 = jSType65.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType68 = jSType65.restrictByNotNullOrUndefined();
        boolean boolean69 = parameterizedType52.canAssignTo(jSType65);
        boolean boolean71 = parameterizedType52.isPropertyTypeInferred("");
        com.google.javascript.rhino.jstype.JSType jSType76 = jSTypeRegistry2.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) parameterizedType52, "hi!", "Named type with empty name component", 40, 39);
        com.google.javascript.rhino.jstype.JSType jSType77 = parameterizedType52.getParameterType();
        boolean boolean78 = parameterizedType52.isNoObjectType();
        com.google.javascript.rhino.jstype.EnumType enumType79 = parameterizedType52.toMaybeEnumType();
        com.google.javascript.rhino.jstype.JSType jSType81 = parameterizedType52.getPropertyType("function (): {proxy:{929267642}}");
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType82 = parameterizedType52.toMaybeParameterizedType();
        com.google.javascript.rhino.jstype.JSType jSType84 = parameterizedType52.getPropertyType("{proxy:{proxy:{1036730770}}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType52.", jSType16.equals(parameterizedType52) == parameterizedType52.equals(jSType16));
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test792");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        boolean boolean38 = jSTypeRegistry35.resetImplicitPrototype(jSType36, objectType37);
        com.google.javascript.rhino.jstype.JSType jSType43 = jSTypeRegistry35.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = jSType43.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSType43.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType46 = jSType43.restrictByNotNullOrUndefined();
        boolean boolean47 = parameterizedType30.canAssignTo(jSType43);
        boolean boolean49 = parameterizedType30.isPropertyTypeInferred("");
        boolean boolean50 = parameterizedType30.isResolved();
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType30.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType53 = parameterizedType30.findPropertyType("{proxy:{proxy:{649633010}}}");
        int int54 = parameterizedType30.getPropertiesCount();
        com.google.javascript.rhino.jstype.JSType jSType55 = parameterizedType30.collapseUnion();
        com.google.javascript.rhino.jstype.ObjectType objectType56 = parameterizedType30.getImplicitPrototype();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test793");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.util.Set set31 = parameterizedType30.getOwnPropertyNames();
        boolean boolean32 = parameterizedType30.hasReferenceName();
        boolean boolean33 = parameterizedType30.hasAnyTemplateInternal();
        boolean boolean34 = parameterizedType30.isInstanceType();
        boolean boolean35 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType37 = parameterizedType30.findPropertyType("{proxy:{proxy:{1317500836}}}");
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType38 = parameterizedType30.toMaybeParameterizedType();
        boolean boolean39 = parameterizedType38.isNoType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType38.", jSType16.equals(parameterizedType38) == parameterizedType38.equals(jSType16));
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test794");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        boolean boolean11 = jSTypeRegistry8.resetImplicitPrototype(jSType9, objectType10);
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry8.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSType16.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType30 = jSTypeRegistry2.createParameterizedType(objectType17, jSType28);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable31 = parameterizedType30.getCtorExtendedInterfaces();
        boolean boolean32 = parameterizedType30.isNominalType();
        boolean boolean33 = parameterizedType30.isAllType();
        boolean boolean34 = parameterizedType30.isUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType36 = parameterizedType30.getPropertyType("{proxy:{proxy:{51735728}}}");
        boolean boolean37 = parameterizedType30.isNativeObjectType();
        java.lang.String str38 = parameterizedType30.getReferenceName();
        com.google.javascript.rhino.jstype.JSType jSType39 = parameterizedType30.collapseUnion();
        boolean boolean40 = parameterizedType30.isGlobalThisType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test795");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean11 = node10.isFalse();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean15 = node14.isTrue();
        boolean boolean16 = node14.hasOneChild();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean20 = node19.isTrue();
        boolean boolean21 = node19.isBreak();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (byte) 1, node7, node10, node14, node19, (int) (byte) 1, 4095);
        boolean boolean25 = node7.isDelProp();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        boolean boolean31 = jSTypeRegistry28.resetImplicitPrototype(jSType29, objectType30);
        com.google.javascript.rhino.jstype.JSType jSType36 = jSTypeRegistry28.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType37 = jSType36.dereference();
        boolean boolean38 = objectType37.isFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType39 = jSTypeRegistry2.createObjectType("hi!", node7, objectType37);
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        boolean boolean45 = jSTypeRegistry42.resetImplicitPrototype(jSType43, objectType44);
        com.google.javascript.rhino.jstype.JSType jSType50 = jSTypeRegistry42.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType51 = jSType50.dereference();
        boolean boolean52 = objectType51.isRegexpType();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection53 = jSTypeRegistry2.getDirectImplementors(objectType51);
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, true);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType59 = null;
        boolean boolean60 = jSTypeRegistry57.resetImplicitPrototype(jSType58, objectType59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61, true);
        com.google.javascript.rhino.jstype.JSType jSType64 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType65 = null;
        boolean boolean66 = jSTypeRegistry63.resetImplicitPrototype(jSType64, objectType65);
        com.google.javascript.rhino.jstype.JSType jSType71 = jSTypeRegistry63.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType72 = jSType71.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter73 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry75 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter73, true);
        com.google.javascript.rhino.jstype.JSType jSType76 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType77 = null;
        boolean boolean78 = jSTypeRegistry75.resetImplicitPrototype(jSType76, objectType77);
        com.google.javascript.rhino.jstype.JSType jSType83 = jSTypeRegistry75.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType84 = jSType83.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType85 = jSTypeRegistry57.createParameterizedType(objectType72, jSType83);
        java.util.Set set86 = parameterizedType85.getOwnPropertyNames();
        boolean boolean87 = parameterizedType85.hasReferenceName();
        boolean boolean88 = parameterizedType85.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.JSType jSType90 = parameterizedType85.findPropertyType("");
        jSTypeRegistry2.registerPropertyOnType("Unknown class name", (com.google.javascript.rhino.jstype.JSType) parameterizedType85);
        boolean boolean93 = parameterizedType85.isPropertyInExterns("{proxy:{proxy:{1168420562}}}");
        com.google.javascript.rhino.jstype.JSType jSType94 = parameterizedType85.getIndexType();
        com.google.javascript.rhino.jstype.JSType jSType96 = parameterizedType85.findPropertyType("function (): {proxy:{1977777103}}");
        boolean boolean97 = jSType96.matchesStringContext();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType36 and parameterizedType85.", jSType36.equals(parameterizedType85) == parameterizedType85.equals(jSType36));
    }
}


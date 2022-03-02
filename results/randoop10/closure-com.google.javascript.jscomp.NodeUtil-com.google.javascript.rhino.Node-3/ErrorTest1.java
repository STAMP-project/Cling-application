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
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
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
        boolean boolean68 = node50.isDelProp();
        com.google.javascript.rhino.ErrorReporter errorReporter69 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter69, true);
        com.google.javascript.rhino.jstype.JSType jSType72 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType73 = null;
        boolean boolean74 = jSTypeRegistry71.resetImplicitPrototype(jSType72, objectType73);
        com.google.javascript.rhino.jstype.JSType jSType79 = jSTypeRegistry71.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType80 = jSType79.dereference();
        boolean boolean81 = objectType80.isFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType82 = jSTypeRegistry45.createObjectType("hi!", node50, objectType80);
        boolean boolean83 = objectType82.isUnionType();
        objectType82.clearCachedValues();
        boolean boolean85 = objectType82.isVoidType();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair86 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) templateType42, (com.google.javascript.rhino.jstype.JSType) objectType82);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType21 and parameterizedType35.", jSType21.equals(parameterizedType35) == parameterizedType35.equals(jSType21));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test202");
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
        com.google.javascript.rhino.jstype.JSType jSType51 = parameterizedType43.getPropertyType("{proxy:{proxy:{1168420562}}}");
        com.google.javascript.rhino.jstype.FunctionType functionType52 = jSType51.toMaybeFunctionType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType10 and parameterizedType43.", jSType10.equals(parameterizedType43) == parameterizedType43.equals(jSType10));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test203");
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
        boolean boolean97 = jSType96.isFunctionType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType36 and parameterizedType85.", jSType36.equals(parameterizedType85) == parameterizedType85.equals(jSType36));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test204");
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
        com.google.javascript.rhino.jstype.ObjectType objectType69 = objectType11.getParentScope();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on objectType11 and parameterizedType42.", objectType11.equals(parameterizedType42) == parameterizedType42.equals(objectType11));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test205");
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
        boolean boolean53 = jSType52.isString();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test206");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        boolean boolean3 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
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
        boolean boolean40 = parameterizedType36.isInstanceType();
        boolean boolean41 = parameterizedType36.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType42 = objectType4.forceResolve(errorReporter5, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) parameterizedType36);
        boolean boolean44 = objectType4.hasOwnProperty("function (): {proxy:{1860172424}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType22 and parameterizedType36.", jSType22.equals(parameterizedType36) == parameterizedType36.equals(jSType22));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test207");
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
        boolean boolean56 = parameterizedType30.isNominalType();
        boolean boolean57 = parameterizedType30.isAllType();
        com.google.javascript.rhino.jstype.JSType jSType58 = parameterizedType30.autobox();
        int int59 = parameterizedType30.getPropertiesCount();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test208");
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
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType43.dereference();
        boolean boolean52 = objectType51.isArrayType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType10 and objectType51.", jSType10.equals(objectType51) == objectType51.equals(jSType10));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test209");
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
        boolean boolean44 = parameterizedType30.isPropertyTypeInferred("InputId: function (): {proxy:{410214344}}");
        boolean boolean45 = parameterizedType30.isNoResolvedType();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, true);
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType50 = null;
        boolean boolean51 = jSTypeRegistry48.resetImplicitPrototype(jSType49, objectType50);
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, true);
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType56 = null;
        boolean boolean57 = jSTypeRegistry54.resetImplicitPrototype(jSType55, objectType56);
        com.google.javascript.rhino.jstype.JSType jSType62 = jSTypeRegistry54.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType63 = jSType62.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter64 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter64, true);
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType68 = null;
        boolean boolean69 = jSTypeRegistry66.resetImplicitPrototype(jSType67, objectType68);
        com.google.javascript.rhino.jstype.JSType jSType74 = jSTypeRegistry66.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType75 = jSType74.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType76 = jSTypeRegistry48.createParameterizedType(objectType63, jSType74);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable77 = parameterizedType76.getCtorExtendedInterfaces();
        boolean boolean78 = parameterizedType76.isNominalType();
        boolean boolean79 = parameterizedType76.isAllType();
        boolean boolean80 = parameterizedType76.matchesNumberContext();
        boolean boolean81 = parameterizedType76.isNullable();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair82 = parameterizedType30.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType) parameterizedType76);
        boolean boolean83 = parameterizedType76.isAllType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test210");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, true);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        boolean boolean12 = jSTypeRegistry9.resetImplicitPrototype(jSType10, objectType11);
        com.google.javascript.rhino.jstype.JSType jSType17 = jSTypeRegistry9.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType18 = jSType17.dereference();
        boolean boolean19 = objectType18.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable20 = objectType18.getCtorImplementedInterfaces();
        boolean boolean21 = objectType18.isNativeObjectType();
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
        boolean boolean37 = objectType18.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType33);
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry2.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType33, "Named type with empty name component", "hi!", 4095, (int) (byte) 100);
        com.google.javascript.rhino.Node node43 = objectType33.getRootNode();
        boolean boolean44 = objectType33.isAllType();
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, true);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = jSTypeRegistry47.createAnonymousObjectType();
        jSTypeRegistry47.forwardDeclareType("Unknown class name");
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
        com.google.javascript.rhino.jstype.ObjectType objectType85 = jSTypeRegistry47.createObjectType((com.google.javascript.rhino.jstype.ObjectType) parameterizedType81);
        boolean boolean86 = parameterizedType81.isStringValueType();
        boolean boolean87 = parameterizedType81.isNoType();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair88 = objectType33.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) parameterizedType81);
        com.google.javascript.rhino.jstype.JSType jSType89 = typePair88.typeB;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType17 and parameterizedType81.", jSType17.equals(parameterizedType81) == parameterizedType81.equals(jSType17));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test211");
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
        com.google.javascript.rhino.jstype.JSType jSType42 = parameterizedType39.getIndexType();
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = null;
        boolean boolean48 = jSTypeRegistry45.resetImplicitPrototype(jSType46, objectType47);
        com.google.javascript.rhino.jstype.JSType jSType53 = jSTypeRegistry45.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType54 = jSType53.dereference();
        boolean boolean55 = objectType54.isRegexpType();
        boolean boolean57 = objectType54.isPropertyTypeInferred("hi!");
        boolean boolean58 = parameterizedType39.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) objectType54);
        java.lang.String str59 = parameterizedType39.toDebugHashCodeString();
        boolean boolean61 = parameterizedType39.hasOwnProperty("");
        boolean boolean62 = parameterizedType39.isNullType();
        boolean boolean64 = parameterizedType39.isPropertyTypeDeclared("{proxy:{proxy:{1874555938}}}");
        boolean boolean65 = parameterizedType39.isNominalType();
        boolean boolean66 = parameterizedType39.isAllType();
        com.google.javascript.rhino.jstype.JSType jSType67 = parameterizedType39.autobox();
        com.google.javascript.rhino.jstype.JSType jSType68 = jSTypeRegistry2.createOptionalType((com.google.javascript.rhino.jstype.JSType) parameterizedType39);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType25 and parameterizedType39.", jSType25.equals(parameterizedType39) == parameterizedType39.equals(jSType25));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test212");
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
        boolean boolean86 = parameterizedType30.isInterface();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType78.", jSType16.equals(parameterizedType78) == parameterizedType78.equals(jSType16));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test213");
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
        boolean boolean39 = jSDocInfo35.isConstructor();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test214");
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
        boolean boolean91 = parameterizedType30.matchesStringContext();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType88.", jSType16.equals(parameterizedType88) == parameterizedType88.equals(jSType16));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test215");
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
        com.google.javascript.rhino.jstype.JSType jSType86 = parameterizedType78.getIndexType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test216");
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
        boolean boolean44 = parameterizedType30.isPropertyTypeInferred("InputId: function (): {proxy:{410214344}}");
        boolean boolean45 = parameterizedType30.isNoResolvedType();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, true);
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType50 = null;
        boolean boolean51 = jSTypeRegistry48.resetImplicitPrototype(jSType49, objectType50);
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, true);
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType56 = null;
        boolean boolean57 = jSTypeRegistry54.resetImplicitPrototype(jSType55, objectType56);
        com.google.javascript.rhino.jstype.JSType jSType62 = jSTypeRegistry54.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType63 = jSType62.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter64 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter64, true);
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType68 = null;
        boolean boolean69 = jSTypeRegistry66.resetImplicitPrototype(jSType67, objectType68);
        com.google.javascript.rhino.jstype.JSType jSType74 = jSTypeRegistry66.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType75 = jSType74.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType76 = jSTypeRegistry48.createParameterizedType(objectType63, jSType74);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable77 = parameterizedType76.getCtorExtendedInterfaces();
        boolean boolean78 = parameterizedType76.isNominalType();
        boolean boolean79 = parameterizedType76.isAllType();
        boolean boolean80 = parameterizedType76.matchesNumberContext();
        boolean boolean81 = parameterizedType76.isNullable();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair82 = parameterizedType30.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType) parameterizedType76);
        boolean boolean83 = parameterizedType76.isNullable();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test217");
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
        jSDocInfo52.setLicense("{proxy:{proxy:{272494747}}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test218");
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
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean25 = node24.isTrue();
        boolean boolean26 = node24.hasOneChild();
        node20.addChildrenToFront(node24);
        boolean boolean28 = node24.isThrow();
        boolean boolean29 = node24.isIn();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node31 = node24.getChildAtIndex(52);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test219");
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
        com.google.javascript.rhino.jstype.FunctionType functionType32 = parameterizedType30.getOwnerFunction();
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
        boolean boolean66 = parameterizedType63.isAllType();
        com.google.javascript.rhino.jstype.FunctionType functionType67 = parameterizedType63.getConstructor();
        java.lang.Iterable iterable68 = parameterizedType63.getCtorImplementedInterfaces();
        java.lang.String str69 = parameterizedType63.getReferenceName();
        boolean boolean70 = parameterizedType63.isUnionType();
        com.google.javascript.rhino.jstype.JSType jSType71 = parameterizedType30.getLeastSupertype((com.google.javascript.rhino.jstype.JSType) parameterizedType63);
        com.google.javascript.rhino.jstype.ObjectType objectType72 = parameterizedType63.getImplicitPrototype();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test220");
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
        boolean boolean86 = parameterizedType30.isTemplateType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType78.", jSType16.equals(parameterizedType78) == parameterizedType78.equals(jSType16));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test221");
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
        com.google.javascript.rhino.jstype.JSType jSType83 = parameterizedType52.autoboxesTo();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType52.", jSType16.equals(parameterizedType52) == parameterizedType52.equals(jSType16));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test222");
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
        boolean boolean43 = parameterizedType42.isObject();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType21 and parameterizedType42.", jSType21.equals(parameterizedType42) == parameterizedType42.equals(jSType21));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test223");
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
        com.google.javascript.rhino.jstype.ObjectType objectType32 = parameterizedType30.dereference();
        java.lang.String str33 = objectType32.getDisplayName();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and objectType32.", jSType16.equals(objectType32) == objectType32.equals(jSType16));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test224");
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
        boolean boolean86 = parameterizedType65.isInstanceType();
        java.util.Set set87 = parameterizedType65.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.JSType jSType89 = parameterizedType65.getPropertyType("{proxy:{proxy:{1004792283}}}");
        com.google.javascript.rhino.jstype.JSType jSType90 = parameterizedType65.collapseUnion();
        parameterizedType30.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) parameterizedType65);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType65.", jSType16.equals(parameterizedType65) == parameterizedType65.equals(jSType16));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test225");
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
        com.google.javascript.rhino.jstype.ObjectType.Property property57 = parameterizedType30.getSlot("{proxy:{proxy:{51735728}}}");
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType58 = parameterizedType30.toMaybeParameterizedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo59 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean60 = jSDocInfo59.isInterface();
        java.lang.String str61 = jSDocInfo59.getOriginalCommentString();
        boolean boolean62 = jSDocInfo59.hasEnumParameterType();
        boolean boolean63 = jSDocInfo59.isNoCompile();
        java.lang.String str64 = jSDocInfo59.getLicense();
        java.lang.String str66 = jSDocInfo59.getDescriptionForParameter("function (): {proxy:{2008360548}}");
        boolean boolean67 = jSDocInfo59.isImplicitCast();
        parameterizedType30.setJSDocInfo(jSDocInfo59);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test226");
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
        boolean boolean31 = parameterizedType30.isInstanceType();
        java.lang.Iterable iterable32 = parameterizedType30.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType33 = parameterizedType30.getParentScope();
        com.google.javascript.rhino.jstype.JSType jSType34 = parameterizedType30.collapseUnion();
        com.google.javascript.rhino.jstype.JSType jSType36 = parameterizedType30.findPropertyType("{proxy:{proxy:{2085879732}}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test227");
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
        java.lang.String str70 = parameterizedType66.toDebugHashCodeString();
        boolean boolean71 = parameterizedType66.isInterface();
        com.google.javascript.rhino.jstype.ObjectType objectType72 = parameterizedType66.getTypeOfThis();
        boolean boolean73 = parameterizedType66.isNoObjectType();
        boolean boolean74 = parameterizedType66.matchesNumberContext();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue75 = parameterizedType30.testForEquality((com.google.javascript.rhino.jstype.JSType) parameterizedType66);
        boolean boolean76 = parameterizedType66.isEmptyType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test228");
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
        boolean boolean44 = parameterizedType30.isPropertyTypeInferred("InputId: function (): {proxy:{410214344}}");
        boolean boolean45 = parameterizedType30.isNoResolvedType();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, true);
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType50 = null;
        boolean boolean51 = jSTypeRegistry48.resetImplicitPrototype(jSType49, objectType50);
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, true);
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType56 = null;
        boolean boolean57 = jSTypeRegistry54.resetImplicitPrototype(jSType55, objectType56);
        com.google.javascript.rhino.jstype.JSType jSType62 = jSTypeRegistry54.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType63 = jSType62.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter64 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter64, true);
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType68 = null;
        boolean boolean69 = jSTypeRegistry66.resetImplicitPrototype(jSType67, objectType68);
        com.google.javascript.rhino.jstype.JSType jSType74 = jSTypeRegistry66.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType75 = jSType74.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType76 = jSTypeRegistry48.createParameterizedType(objectType63, jSType74);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable77 = parameterizedType76.getCtorExtendedInterfaces();
        boolean boolean78 = parameterizedType76.isNominalType();
        boolean boolean79 = parameterizedType76.isAllType();
        boolean boolean80 = parameterizedType76.matchesNumberContext();
        boolean boolean81 = parameterizedType76.isNullable();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair82 = parameterizedType30.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType) parameterizedType76);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot84 = parameterizedType30.getOwnSlot("{proxy:{proxy:{693865718}}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType76.", jSType16.equals(parameterizedType76) == parameterizedType76.equals(jSType16));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test229");
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
        boolean boolean92 = parameterizedType82.matchesInt32Context();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test230");
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
        com.google.javascript.rhino.jstype.JSType jSType39 = parameterizedType30.collapseUnion();
        boolean boolean40 = parameterizedType30.matchesStringContext();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test231");
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
        boolean boolean78 = parameterizedType52.isConstructor();
        java.lang.String str79 = parameterizedType52.getNormalizedReferenceName();
        boolean boolean80 = parameterizedType52.isNoType();
        com.google.javascript.rhino.jstype.JSType jSType82 = parameterizedType52.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.jstype.UnionType unionType83 = parameterizedType52.toMaybeUnionType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType52.", jSType16.equals(parameterizedType52) == parameterizedType52.equals(jSType16));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test232");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable25 = jSTypeRegistry2.getEachReferenceTypeWithProperty("function (): {proxy:{1240268079}}");
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        boolean boolean31 = jSTypeRegistry28.resetImplicitPrototype(jSType29, objectType30);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, true);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType36 = null;
        boolean boolean37 = jSTypeRegistry34.resetImplicitPrototype(jSType35, objectType36);
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry34.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType43 = jSType42.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44, true);
        com.google.javascript.rhino.jstype.JSType jSType47 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType48 = null;
        boolean boolean49 = jSTypeRegistry46.resetImplicitPrototype(jSType47, objectType48);
        com.google.javascript.rhino.jstype.JSType jSType54 = jSTypeRegistry46.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType55 = jSType54.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType56 = jSTypeRegistry28.createParameterizedType(objectType43, jSType54);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable57 = parameterizedType56.getCtorExtendedInterfaces();
        boolean boolean58 = parameterizedType56.isNominalType();
        boolean boolean59 = parameterizedType56.isAllType();
        boolean boolean60 = parameterizedType56.matchesNumberContext();
        boolean boolean61 = parameterizedType56.isNullable();
        com.google.javascript.rhino.jstype.ObjectType objectType62 = parameterizedType56.getTypeOfThis();
        boolean boolean64 = jSTypeRegistry2.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) parameterizedType56, "function (): {proxy:{1173704924}}");
        com.google.javascript.rhino.ErrorReporter errorReporter65 = jSTypeRegistry2.getErrorReporter();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType18 and parameterizedType56.", jSType18.equals(parameterizedType56) == parameterizedType56.equals(jSType18));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test233");
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
        boolean boolean84 = objectType83.isRegexpType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and objectType83.", jSType16.equals(objectType83) == objectType83.equals(jSType16));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test234");
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
        boolean boolean41 = parameterizedType35.matchesStringContext();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType21 and parameterizedType35.", jSType21.equals(parameterizedType35) == parameterizedType35.equals(jSType21));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test235");
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
        com.google.javascript.rhino.jstype.FunctionType functionType33 = parameterizedType30.getOwnerFunction();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType34 = parameterizedType30.toMaybeParameterizedType();
        com.google.javascript.rhino.jstype.FunctionType functionType35 = parameterizedType30.toMaybeFunctionType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test236");
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
        java.util.Set<java.lang.String> strSet91 = jSDocInfo70.getModifies();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test237");
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
        boolean boolean40 = parameterizedType30.isDateType();
        java.lang.String str41 = parameterizedType30.getReferenceName();
        boolean boolean42 = parameterizedType30.matchesStringContext();
        com.google.javascript.rhino.jstype.ObjectType objectType43 = parameterizedType30.getTypeOfThis();
        com.google.javascript.rhino.jstype.ObjectType objectType45 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface((com.google.javascript.rhino.jstype.ObjectType) parameterizedType30, "{proxy:{proxy:{874271629}}}");
        com.google.javascript.rhino.jstype.EnumType enumType46 = objectType45.toMaybeEnumType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and objectType45.", jSType16.equals(objectType45) == objectType45.equals(jSType16));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test238");
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
        com.google.javascript.rhino.jstype.ObjectType objectType78 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface((com.google.javascript.rhino.jstype.ObjectType) parameterizedType47, "{proxy:{proxy:{279609923}}}");
        com.google.javascript.rhino.jstype.FunctionType functionType79 = parameterizedType47.getConstructor();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType11 and parameterizedType47.", jSType11.equals(parameterizedType47) == parameterizedType47.equals(jSType11));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test239");
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
        boolean boolean67 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType58.", jSType16.equals(parameterizedType58) == parameterizedType58.equals(jSType16));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test240");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node26 = node20.getChildAtIndex(53);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test241");
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
        java.lang.String str21 = node6.getString();
        boolean boolean22 = node6.isParamList();
        java.util.Set<java.lang.String> strSet23 = node6.getDirectives();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile24 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node6);
        com.google.javascript.rhino.JSDocInfo jSDocInfo25 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean26 = jSDocInfo25.isInterface();
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean28 = jSDocInfo27.isInterface();
        java.lang.String str29 = jSDocInfo27.getOriginalCommentString();
        boolean boolean30 = jSDocInfo27.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo jSDocInfo31 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean32 = jSDocInfo31.isInterface();
        jSDocInfo31.setLicense("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo35 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean36 = jSDocInfo35.isInterface();
        java.lang.String str37 = jSDocInfo35.getOriginalCommentString();
        boolean boolean38 = jSDocInfo35.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean40 = jSDocInfo39.isInterface();
        boolean boolean41 = jSDocInfo39.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression42 = jSDocInfo39.getEnumParameterType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo43 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean44 = jSDocInfo43.isInterface();
        jSDocInfo43.setLicense("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo47 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean48 = jSDocInfo47.isInterface();
        boolean boolean49 = jSDocInfo47.hasType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean51 = jSDocInfo50.isInterface();
        boolean boolean52 = jSDocInfo50.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression53 = jSDocInfo50.getEnumParameterType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo54 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean55 = jSDocInfo54.isInterface();
        boolean boolean56 = jSDocInfo54.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression57 = jSDocInfo54.getEnumParameterType();
        boolean boolean58 = jSDocInfo54.containsDeclaration();
        com.google.javascript.rhino.JSDocInfo jSDocInfo59 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean60 = jSDocInfo59.isInterface();
        java.lang.String str61 = jSDocInfo59.getOriginalCommentString();
        boolean boolean62 = jSDocInfo59.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo jSDocInfo63 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean64 = jSDocInfo63.isInterface();
        java.lang.String str65 = jSDocInfo63.getOriginalCommentString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression66 = jSDocInfo63.getType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo67 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean68 = jSDocInfo67.isInterface();
        jSDocInfo67.setLicense("");
        boolean boolean71 = jSDocInfo67.isNoAlias();
        com.google.javascript.rhino.JSDocInfo jSDocInfo72 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean73 = jSDocInfo72.isInterface();
        jSDocInfo72.setLicense("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo76 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean77 = jSDocInfo76.isInterface();
        boolean boolean78 = jSDocInfo76.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression79 = jSDocInfo76.getEnumParameterType();
        boolean boolean80 = jSDocInfo76.containsDeclaration();
        com.google.javascript.rhino.JSDocInfo[] jSDocInfoArray81 = new com.google.javascript.rhino.JSDocInfo[] { jSDocInfo72, jSDocInfo76 };
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList82 = com.google.common.collect.ImmutableList.of(jSDocInfo25, jSDocInfo27, jSDocInfo31, jSDocInfo35, jSDocInfo39, jSDocInfo43, jSDocInfo47, jSDocInfo50, jSDocInfo54, jSDocInfo59, jSDocInfo63, jSDocInfo67, jSDocInfoArray81);
        com.google.common.collect.ImmutableList<java.lang.String> strList83 = jSDocInfo67.getTemplateTypeNames();
        java.util.Set<java.lang.String> strSet84 = jSDocInfo67.getParameterNames();
        node6.setDirectives(strSet84);
        com.google.javascript.rhino.jstype.JSType jSType86 = node6.getJSType();
        com.google.javascript.rhino.Node node90 = com.google.javascript.rhino.Node.newString((int) (byte) -1, "hi!");
        com.google.javascript.rhino.Node node93 = new com.google.javascript.rhino.Node(41, node90, (int) (short) 1, 40);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder94 = node93.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.Node node95 = node93.cloneNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node96 = node6.getChildBefore(node95);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test242");
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
        com.google.javascript.rhino.jstype.ObjectType.Property property57 = parameterizedType30.getSlot("{proxy:{proxy:{51735728}}}");
        com.google.javascript.rhino.jstype.ObjectType objectType58 = parameterizedType30.getImplicitPrototype();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType59 = parameterizedType30.toMaybeParameterizedType();
        boolean boolean60 = parameterizedType59.isNominalType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType59.", jSType16.equals(parameterizedType59) == parameterizedType59.equals(jSType16));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test243");
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
        com.google.javascript.rhino.jstype.ObjectType.Property property56 = parameterizedType43.getSlot("{proxy:{proxy:{279609923}}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType10 and parameterizedType43.", jSType10.equals(parameterizedType43) == parameterizedType43.equals(jSType10));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test244");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        boolean boolean5 = cloneableList3.isEmpty();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList9 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node8);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList10 = cloneableList9.asList();
        boolean boolean11 = cloneableList3.containsAll((java.util.Collection<java.lang.Cloneable>) cloneableList10);
        com.google.common.collect.UnmodifiableListIterator<java.lang.Cloneable> cloneableItor12 = cloneableList10.listIterator();
        java.lang.Object[] objArray13 = cloneableList10.toArray();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14, true);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        boolean boolean19 = jSTypeRegistry16.resetImplicitPrototype(jSType17, objectType18);
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20, true);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        boolean boolean25 = jSTypeRegistry22.resetImplicitPrototype(jSType23, objectType24);
        com.google.javascript.rhino.jstype.JSType jSType30 = jSTypeRegistry22.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = jSType30.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, true);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType36 = null;
        boolean boolean37 = jSTypeRegistry34.resetImplicitPrototype(jSType35, objectType36);
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry34.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType43 = jSType42.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType44 = jSTypeRegistry16.createParameterizedType(objectType31, jSType42);
        java.util.Set set45 = parameterizedType44.getOwnPropertyNames();
        boolean boolean46 = parameterizedType44.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType47 = parameterizedType44.getIndexType();
        java.lang.String str48 = parameterizedType44.toDebugHashCodeString();
        java.lang.String str49 = parameterizedType44.toAnnotationString();
        int int50 = cloneableList10.lastIndexOf((java.lang.Object) str49);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType30 and parameterizedType44.", jSType30.equals(parameterizedType44) == parameterizedType44.equals(jSType30));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test245");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType.Property property5 = objectType3.getOwnSlot("{proxy:{proxy:{1874555938}}}");
        boolean boolean6 = objectType3.hasAnyTemplate();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, true);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        boolean boolean12 = jSTypeRegistry9.resetImplicitPrototype(jSType10, objectType11);
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        boolean boolean18 = jSTypeRegistry15.resetImplicitPrototype(jSType16, objectType17);
        com.google.javascript.rhino.jstype.JSType jSType23 = jSTypeRegistry15.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSType23.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25, true);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        boolean boolean30 = jSTypeRegistry27.resetImplicitPrototype(jSType28, objectType29);
        com.google.javascript.rhino.jstype.JSType jSType35 = jSTypeRegistry27.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType36 = jSType35.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType37 = jSTypeRegistry9.createParameterizedType(objectType24, jSType35);
        java.util.Set set38 = parameterizedType37.getOwnPropertyNames();
        boolean boolean39 = parameterizedType37.hasReferenceName();
        boolean boolean40 = parameterizedType37.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.JSType jSType42 = parameterizedType37.findPropertyType("");
        java.lang.String str43 = parameterizedType37.getReferenceName();
        com.google.javascript.rhino.jstype.UnionType unionType44 = parameterizedType37.toMaybeUnionType();
        boolean boolean46 = parameterizedType37.hasOwnProperty("function (): {proxy:{1262905525}}");
        com.google.javascript.rhino.JSDocInfo jSDocInfo47 = parameterizedType37.getJSDocInfo();
        com.google.javascript.rhino.jstype.JSType jSType49 = parameterizedType37.findPropertyType("{proxy:{proxy:{1317500836}}}");
        boolean boolean50 = parameterizedType37.isDateType();
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType37.dereference();
        boolean boolean52 = objectType3.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType) parameterizedType37);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType23 and parameterizedType37.", jSType23.equals(parameterizedType37) == parameterizedType37.equals(jSType23));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test246");
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
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList83 = objectTypeBuilder82.build();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType12 and parameterizedType62.", jSType12.equals(parameterizedType62) == parameterizedType62.equals(jSType12));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test247");
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
        com.google.javascript.rhino.jstype.ObjectType.Property property57 = parameterizedType30.getSlot("{proxy:{proxy:{51735728}}}");
        com.google.javascript.rhino.jstype.ObjectType objectType58 = parameterizedType30.getImplicitPrototype();
        boolean boolean59 = parameterizedType30.isNativeObjectType();
        com.google.javascript.rhino.jstype.FunctionType functionType60 = parameterizedType30.getOwnerFunction();
        com.google.javascript.rhino.JSDocInfo jSDocInfo61 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean62 = jSDocInfo61.isInterface();
        java.lang.String str63 = jSDocInfo61.getOriginalCommentString();
        boolean boolean64 = jSDocInfo61.hasEnumParameterType();
        boolean boolean65 = jSDocInfo61.hasModifies();
        boolean boolean66 = jSDocInfo61.isDefine();
        java.lang.String str68 = jSDocInfo61.getDescriptionForParameter("{proxy:{proxy:{1943266088}}}");
        parameterizedType30.setJSDocInfo(jSDocInfo61);
        boolean boolean70 = jSDocInfo61.isIdGenerator();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test248");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        boolean boolean5 = cloneableList3.isEmpty();
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
        boolean boolean43 = cloneableList3.contains((java.lang.Object) parameterizedType36);
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44, true);
        com.google.javascript.rhino.jstype.JSType jSType47 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType48 = null;
        boolean boolean49 = jSTypeRegistry46.resetImplicitPrototype(jSType47, objectType48);
        jSTypeRegistry46.setLastGeneration(false);
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, true);
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType56 = null;
        boolean boolean57 = jSTypeRegistry54.resetImplicitPrototype(jSType55, objectType56);
        com.google.javascript.rhino.jstype.JSType jSType62 = jSTypeRegistry54.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType63 = jSType62.dereference();
        boolean boolean64 = objectType63.isFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry46.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType) objectType63);
        boolean boolean66 = cloneableList3.equals((java.lang.Object) jSTypeRegistry46);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType22 and parameterizedType36.", jSType22.equals(parameterizedType36) == parameterizedType36.equals(jSType22));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test249");
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
        com.google.javascript.rhino.jstype.JSType jSType41 = parameterizedType30.collapseUnion();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType42 = parameterizedType30.toMaybeEnumElementType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test250");
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
        boolean boolean58 = parameterizedType30.isNoObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType60 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface((com.google.javascript.rhino.jstype.ObjectType) parameterizedType30, "true");
        boolean boolean61 = parameterizedType30.isNominalType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test251");
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
        boolean boolean32 = jSTypeRegistry2.isForwardDeclaredType("{proxy:{proxy:{1049973697}}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test252");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = jSTypeRegistry2.getErrorReporter();
        jSTypeRegistry2.clearNamedTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean19 = node18.isFalse();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean23 = node22.isTrue();
        boolean boolean24 = node22.hasOneChild();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean28 = node27.isTrue();
        boolean boolean29 = node27.isBreak();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (byte) 1, node15, node18, node22, node27, (int) (byte) 1, 4095);
        boolean boolean33 = node15.isDelProp();
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType38 = null;
        boolean boolean39 = jSTypeRegistry36.resetImplicitPrototype(jSType37, objectType38);
        com.google.javascript.rhino.jstype.JSType jSType44 = jSTypeRegistry36.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSType44.dereference();
        boolean boolean46 = objectType45.isFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry10.createObjectType("hi!", node15, objectType45);
        boolean boolean48 = objectType45.isEnumType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo49 = null;
        objectType45.setJSDocInfo(jSDocInfo49);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray52 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry2.createConstructorType((com.google.javascript.rhino.jstype.JSType) objectType45, false, jSTypeArray52);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable54 = functionType53.getCtorImplementedInterfaces();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, true);
        com.google.javascript.rhino.jstype.ObjectType objectType58 = jSTypeRegistry57.createAnonymousObjectType();
        jSTypeRegistry57.forwardDeclareType("Unknown class name");
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61, true);
        com.google.javascript.rhino.jstype.JSType jSType64 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType65 = null;
        boolean boolean66 = jSTypeRegistry63.resetImplicitPrototype(jSType64, objectType65);
        com.google.javascript.rhino.ErrorReporter errorReporter67 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry69 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter67, true);
        com.google.javascript.rhino.jstype.JSType jSType70 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType71 = null;
        boolean boolean72 = jSTypeRegistry69.resetImplicitPrototype(jSType70, objectType71);
        com.google.javascript.rhino.jstype.JSType jSType77 = jSTypeRegistry69.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType78 = jSType77.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter79 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry81 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter79, true);
        com.google.javascript.rhino.jstype.JSType jSType82 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType83 = null;
        boolean boolean84 = jSTypeRegistry81.resetImplicitPrototype(jSType82, objectType83);
        com.google.javascript.rhino.jstype.JSType jSType89 = jSTypeRegistry81.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType90 = jSType89.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType91 = jSTypeRegistry63.createParameterizedType(objectType78, jSType89);
        java.util.Set set92 = parameterizedType91.getOwnPropertyNames();
        boolean boolean93 = parameterizedType91.isNoObjectType();
        boolean boolean94 = parameterizedType91.isAllType();
        com.google.javascript.rhino.jstype.ObjectType objectType95 = jSTypeRegistry57.createObjectType((com.google.javascript.rhino.jstype.ObjectType) parameterizedType91);
        boolean boolean96 = functionType53.isSubtype((com.google.javascript.rhino.jstype.JSType) parameterizedType91);
        boolean boolean97 = functionType53.hasReferenceName();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType44 and parameterizedType91.", jSType44.equals(parameterizedType91) == parameterizedType91.equals(jSType44));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test253");
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
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41, true);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType45 = null;
        boolean boolean46 = jSTypeRegistry43.resetImplicitPrototype(jSType44, objectType45);
        com.google.javascript.rhino.jstype.JSType jSType51 = jSTypeRegistry43.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType52 = jSType51.dereference();
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
        boolean boolean87 = parameterizedType84.isAllType();
        com.google.javascript.rhino.Node node89 = com.google.javascript.rhino.Node.newNumber((double) (-1L));
        boolean boolean90 = objectType52.defineInferredProperty("unknown", (com.google.javascript.rhino.jstype.JSType) parameterizedType84, node89);
        com.google.javascript.rhino.jstype.ObjectType objectType91 = parameterizedType84.getImplicitPrototype();
        boolean boolean92 = parameterizedType35.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) parameterizedType84);
        boolean boolean93 = parameterizedType35.isInstanceType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType21 and parameterizedType84.", jSType21.equals(parameterizedType84) == parameterizedType84.equals(jSType21));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test254");
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
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType43.dereference();
        boolean boolean52 = parameterizedType43.isParameterizedType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType10 and parameterizedType43.", jSType10.equals(parameterizedType43) == parameterizedType43.equals(jSType10));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test255");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Cloneable> cloneableItor6 = cloneableList3.listIterator((int) (byte) 0);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList7 = cloneableList3.asList();
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
        int int56 = parameterizedType38.getPropertiesCount();
        com.google.javascript.rhino.JSDocInfo jSDocInfo58 = null;
        parameterizedType38.setPropertyJSDocInfo("unknown", jSDocInfo58);
        boolean boolean60 = parameterizedType38.canBeCalled();
        com.google.javascript.rhino.jstype.FunctionType functionType61 = parameterizedType38.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.EnumType enumType62 = parameterizedType38.toMaybeEnumType();
        boolean boolean63 = cloneableList7.equals((java.lang.Object) enumType62);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType24 and parameterizedType38.", jSType24.equals(parameterizedType38) == parameterizedType38.equals(jSType24));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test256");
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
        boolean boolean95 = parameterizedType30.isObject();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType84.", jSType16.equals(parameterizedType84) == parameterizedType84.equals(jSType16));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test257");
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
        boolean boolean45 = objectType44.isNativeObjectType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType22 and parameterizedType36.", jSType22.equals(parameterizedType36) == parameterizedType36.equals(jSType22));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test258");
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
        boolean boolean17 = objectType12.isUnknownType();
        boolean boolean18 = objectType12.isInterface();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet19 = objectType12.getPossibleToBooleanOutcomes();
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
        boolean boolean52 = parameterizedType50.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType53 = parameterizedType50.getIndexType();
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType58 = null;
        boolean boolean59 = jSTypeRegistry56.resetImplicitPrototype(jSType57, objectType58);
        com.google.javascript.rhino.jstype.JSType jSType64 = jSTypeRegistry56.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType65 = jSType64.dereference();
        boolean boolean66 = objectType65.isRegexpType();
        boolean boolean68 = objectType65.isPropertyTypeInferred("hi!");
        boolean boolean69 = parameterizedType50.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) objectType65);
        java.lang.String str70 = parameterizedType50.toDebugHashCodeString();
        boolean boolean72 = parameterizedType50.hasOwnProperty("");
        boolean boolean73 = parameterizedType50.isNullType();
        boolean boolean75 = parameterizedType50.isPropertyTypeDeclared("{proxy:{proxy:{1874555938}}}");
        boolean boolean76 = parameterizedType50.isNominalType();
        boolean boolean77 = parameterizedType50.isAllType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet78 = parameterizedType50.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet79 = booleanLiteralSet19.intersection(booleanLiteralSet78);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType11 and parameterizedType50.", jSType11.equals(parameterizedType50) == parameterizedType50.equals(jSType11));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test259");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.jstype.JSType jSType10 = jSTypeRegistry2.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = jSType10.dereference();
        boolean boolean12 = objectType11.isFunctionType();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        boolean boolean18 = jSTypeRegistry15.resetImplicitPrototype(jSType16, objectType17);
        com.google.javascript.rhino.jstype.JSType jSType23 = jSTypeRegistry15.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSType23.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSType23.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType26 = jSType23.restrictByNotNullOrUndefined();
        boolean boolean27 = objectType11.isSubtype(jSType26);
        com.google.javascript.rhino.jstype.JSType jSType29 = objectType11.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, true);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        boolean boolean35 = jSTypeRegistry32.resetImplicitPrototype(jSType33, objectType34);
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry32.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType41 = jSType40.dereference();
        java.lang.String str42 = objectType41.getDisplayName();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair43 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) objectType11, (com.google.javascript.rhino.jstype.JSType) objectType41);
        com.google.javascript.rhino.jstype.JSType jSType44 = typePair43.typeB;
        com.google.javascript.rhino.jstype.JSType jSType45 = typePair43.typeA;
        com.google.javascript.rhino.jstype.JSType jSType46 = typePair43.typeB;
        com.google.javascript.rhino.jstype.JSType jSType47 = typePair43.typeA;
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
        boolean boolean80 = parameterizedType78.isNoObjectType();
        boolean boolean81 = parameterizedType78.isAllType();
        com.google.javascript.rhino.jstype.UnionType unionType82 = parameterizedType78.toMaybeUnionType();
        boolean boolean83 = jSType47.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) unionType82);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType47 and parameterizedType78.", jSType47.equals(parameterizedType78) == parameterizedType78.equals(jSType47));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test260");
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
        boolean boolean52 = jSType51.isBooleanObjectType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test261");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable25 = jSTypeRegistry2.getEachReferenceTypeWithProperty("function (): {proxy:{1240268079}}");
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        boolean boolean31 = jSTypeRegistry28.resetImplicitPrototype(jSType29, objectType30);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, true);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType36 = null;
        boolean boolean37 = jSTypeRegistry34.resetImplicitPrototype(jSType35, objectType36);
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry34.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType43 = jSType42.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44, true);
        com.google.javascript.rhino.jstype.JSType jSType47 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType48 = null;
        boolean boolean49 = jSTypeRegistry46.resetImplicitPrototype(jSType47, objectType48);
        com.google.javascript.rhino.jstype.JSType jSType54 = jSTypeRegistry46.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType55 = jSType54.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType56 = jSTypeRegistry28.createParameterizedType(objectType43, jSType54);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable57 = parameterizedType56.getCtorExtendedInterfaces();
        boolean boolean58 = parameterizedType56.isNominalType();
        boolean boolean59 = parameterizedType56.isAllType();
        boolean boolean60 = parameterizedType56.matchesNumberContext();
        boolean boolean61 = parameterizedType56.isNullable();
        com.google.javascript.rhino.jstype.ObjectType objectType62 = parameterizedType56.getTypeOfThis();
        boolean boolean64 = jSTypeRegistry2.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) parameterizedType56, "function (): {proxy:{1173704924}}");
        boolean boolean65 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType18 and parameterizedType56.", jSType18.equals(parameterizedType56) == parameterizedType56.equals(jSType18));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test262");
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
        boolean boolean71 = parameterizedType69.isFunctionPrototypeType();
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.ObjectType> objectTypeBuilder72 = com.google.common.collect.ImmutableList.builder();
        com.google.javascript.rhino.ErrorReporter errorReporter73 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry75 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter73, true);
        com.google.javascript.rhino.jstype.JSType jSType76 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType77 = null;
        boolean boolean78 = jSTypeRegistry75.resetImplicitPrototype(jSType76, objectType77);
        com.google.javascript.rhino.jstype.JSType jSType83 = jSTypeRegistry75.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType84 = jSType83.dereference();
        boolean boolean85 = objectType84.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable86 = objectType84.getCtorImplementedInterfaces();
        boolean boolean87 = objectType84.isNativeObjectType();
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.ObjectType> objectTypeBuilder88 = objectTypeBuilder72.add(objectType84);
        boolean boolean89 = objectType84.isUnknownType();
        boolean boolean90 = objectType84.isInterface();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue91 = parameterizedType69.testForEquality((com.google.javascript.rhino.jstype.JSType) objectType84);
        boolean boolean93 = parameterizedType69.isPropertyTypeDeclared("{proxy:{proxy:{1173196343}}}");
        com.google.javascript.rhino.jstype.JSType jSType94 = parameterizedType69.getParameterType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet95 = jSType94.getPossibleToBooleanOutcomes();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType10 and parameterizedType69.", jSType10.equals(parameterizedType69) == parameterizedType69.equals(jSType10));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test263");
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
        boolean boolean56 = parameterizedType30.isNominalType();
        boolean boolean57 = parameterizedType30.isAllType();
        com.google.javascript.rhino.jstype.JSType jSType58 = parameterizedType30.autobox();
        int int59 = parameterizedType30.getPropertiesCount();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test264");
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
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType43.dereference();
        com.google.javascript.rhino.jstype.UnionType unionType52 = parameterizedType43.toMaybeUnionType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType10 and parameterizedType43.", jSType10.equals(parameterizedType43) == parameterizedType43.equals(jSType10));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test265");
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
        com.google.javascript.rhino.jstype.ObjectType objectType48 = parameterizedType30.toObjectType();
        boolean boolean49 = parameterizedType30.matchesStringContext();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test266");
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
        boolean boolean87 = parameterizedType30.isPropertyTypeDeclared("{proxy:{proxy:{1804010230}}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType78.", jSType16.equals(parameterizedType78) == parameterizedType78.equals(jSType16));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test267");
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
        com.google.javascript.rhino.jstype.JSType jSType31 = objectType26.getIndexType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet32 = objectType26.getPossibleToBooleanOutcomes();
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
        boolean boolean82 = parameterizedType63.removeProperty("{proxy:{proxy:{1763454178}}}");
        com.google.javascript.rhino.jstype.ObjectType.Property property84 = parameterizedType63.getSlot("(({proxy:{proxy:{1874555938}}}))");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet85 = parameterizedType63.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet86 = booleanLiteralSet32.union(booleanLiteralSet85);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType10 and parameterizedType63.", jSType10.equals(parameterizedType63) == parameterizedType63.equals(jSType10));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test268");
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
        com.google.javascript.rhino.jstype.JSType jSType41 = parameterizedType30.collapseUnion();
        boolean boolean43 = parameterizedType30.removeProperty("{proxy:{proxy:{195004422}}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test269");
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
        boolean boolean83 = parameterizedType52.isPropertyInExterns("{proxy:{proxy:{65619198}}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType52.", jSType16.equals(parameterizedType52) == parameterizedType52.equals(jSType16));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test270");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((int) (byte) 100);
        boolean boolean2 = node1.isFalse();
        boolean boolean3 = node1.isReturn();
        boolean boolean4 = node1.isEmpty();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) ' ', 48, 41);
        com.google.javascript.rhino.jstype.JSType jSType9 = node8.getJSType();
        com.google.javascript.rhino.Node node10 = node8.getNext();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean18 = node17.isFalse();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean22 = node21.isTrue();
        boolean boolean23 = node21.hasOneChild();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean27 = node26.isTrue();
        boolean boolean28 = node26.isBreak();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) (byte) 1, node14, node17, node21, node26, (int) (byte) 1, 4095);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable32 = node31.children();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean40 = node39.isFalse();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean44 = node43.isTrue();
        boolean boolean45 = node43.hasOneChild();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean49 = node48.isTrue();
        boolean boolean50 = node48.isBreak();
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node((int) (byte) 1, node36, node39, node43, node48, (int) (byte) 1, 4095);
        com.google.javascript.rhino.Node node54 = node31.useSourceInfoIfMissingFromForTree(node48);
        boolean boolean55 = node31.isDefaultCase();
        com.google.javascript.rhino.Node node56 = node8.srcrefTree(node31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node57 = node1.getChildBefore(node56);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test271");
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
        jSType39.clearResolved();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and jSType39.", jSType16.equals(jSType39) == jSType39.equals(jSType16));
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test272");
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
        boolean boolean55 = parameterizedType30.isPropertyTypeInferred("{proxy:{proxy:{2061149029}}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test273");
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
        boolean boolean83 = parameterizedType52.isNominalType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType52.", jSType16.equals(parameterizedType52) == parameterizedType52.equals(jSType16));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test274");
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
        com.google.javascript.rhino.jstype.JSType jSType55 = parameterizedType30.collapseUnion();
        boolean boolean56 = parameterizedType30.isConstructor();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test275");
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
        boolean boolean68 = jSType65.isTemplateType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test276");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        jSTypeRegistry2.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        boolean boolean13 = jSTypeRegistry10.resetImplicitPrototype(jSType11, objectType12);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = jSTypeRegistry10.getErrorReporter();
        boolean boolean15 = jSTypeRegistry10.shouldTolerateUndefinedValues();
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
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49, true);
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType53 = null;
        boolean boolean54 = jSTypeRegistry51.resetImplicitPrototype(jSType52, objectType53);
        com.google.javascript.rhino.jstype.JSType jSType59 = jSTypeRegistry51.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType60 = jSType59.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType61 = jSType59.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType62 = jSType59.restrictByNotNullOrUndefined();
        boolean boolean63 = parameterizedType46.canAssignTo(jSType59);
        boolean boolean65 = parameterizedType46.isPropertyTypeInferred("");
        boolean boolean66 = parameterizedType46.isResolved();
        boolean boolean67 = parameterizedType46.isInstanceType();
        java.util.Set set68 = parameterizedType46.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.JSType jSType70 = parameterizedType46.getPropertyType("{proxy:{proxy:{1004792283}}}");
        boolean boolean71 = parameterizedType46.isNoResolvedType();
        com.google.javascript.rhino.ErrorReporter errorReporter72 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry74 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter72, true);
        com.google.javascript.rhino.jstype.JSType jSType75 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType76 = null;
        boolean boolean77 = jSTypeRegistry74.resetImplicitPrototype(jSType75, objectType76);
        boolean boolean78 = jSTypeRegistry74.shouldTolerateUndefinedValues();
        jSTypeRegistry74.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray80 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.JSType jSType81 = jSTypeRegistry74.createUnionType(jSTypeArray80);
        com.google.javascript.rhino.jstype.FunctionType functionType82 = jSTypeRegistry10.createFunctionType((com.google.javascript.rhino.jstype.JSType) parameterizedType46, jSTypeArray80);
        com.google.javascript.rhino.Node node83 = jSTypeRegistry2.createParametersWithVarArgs(jSTypeArray80);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType32 and parameterizedType46.", jSType32.equals(parameterizedType46) == parameterizedType46.equals(jSType32));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test277");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo70 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean71 = jSDocInfo70.isInterface();
        boolean boolean72 = jSDocInfo70.hasType();
        boolean boolean73 = jSDocInfo70.containsDeclaration();
        boolean boolean74 = jSDocInfo70.isInterface();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression75 = jSDocInfo70.getBaseType();
        java.lang.String str76 = jSDocInfo70.getDescription();
        parameterizedType30.setPropertyJSDocInfo("{proxy:{proxy:{1763454178}}}", jSDocInfo70);
        com.google.javascript.rhino.Node node78 = jSDocInfo70.getAssociatedNode();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test278");
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
        boolean boolean78 = parameterizedType47.isTemplateType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType11 and parameterizedType47.", jSType11.equals(parameterizedType47) == parameterizedType47.equals(jSType11));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test279");
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
        boolean boolean56 = parameterizedType30.isNominalType();
        boolean boolean57 = parameterizedType30.isAllType();
        com.google.javascript.rhino.jstype.JSType jSType58 = parameterizedType30.autobox();
        boolean boolean59 = parameterizedType30.isInterface();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test280");
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
        boolean boolean93 = parameterizedType30.isNominalConstructor();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType65.", jSType16.equals(parameterizedType65) == parameterizedType65.equals(jSType16));
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test281");
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
        boolean boolean96 = parameterizedType85.isNoObjectType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType36 and parameterizedType85.", jSType36.equals(parameterizedType85) == parameterizedType85.equals(jSType36));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test282");
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
        com.google.javascript.rhino.jstype.ObjectType objectType65 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface((com.google.javascript.rhino.jstype.ObjectType) parameterizedType30, "function (): {proxy:{1361155598}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType61.", jSType16.equals(parameterizedType61) == parameterizedType61.equals(jSType16));
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test283");
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
        boolean boolean68 = jSType65.isInstanceType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test284");
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
        boolean boolean52 = parameterizedType43.isPropertyInExterns("function (): {proxy:{1240268079}}");
        boolean boolean53 = parameterizedType43.isConstructor();
        java.lang.String str54 = parameterizedType43.toString();
        boolean boolean55 = parameterizedType43.isStringObjectType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo56 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean57 = jSDocInfo56.isInterface();
        java.lang.String str58 = jSDocInfo56.getOriginalCommentString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression59 = jSDocInfo56.getType();
        boolean boolean60 = jSDocInfo56.hasEnumParameterType();
        boolean boolean61 = jSDocInfo56.shouldPreserveTry();
        boolean boolean62 = jSDocInfo56.isNoTypeCheck();
        parameterizedType43.setJSDocInfo(jSDocInfo56);
        boolean boolean64 = jSDocInfo56.isExpose();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType10 and parameterizedType43.", jSType10.equals(parameterizedType43) == parameterizedType43.equals(jSType10));
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test285");
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
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41, true);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType45 = null;
        boolean boolean46 = jSTypeRegistry43.resetImplicitPrototype(jSType44, objectType45);
        com.google.javascript.rhino.jstype.JSType jSType51 = jSTypeRegistry43.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType52 = jSType51.dereference();
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
        boolean boolean87 = parameterizedType84.isAllType();
        com.google.javascript.rhino.Node node89 = com.google.javascript.rhino.Node.newNumber((double) (-1L));
        boolean boolean90 = objectType52.defineInferredProperty("unknown", (com.google.javascript.rhino.jstype.JSType) parameterizedType84, node89);
        com.google.javascript.rhino.jstype.ObjectType objectType91 = parameterizedType84.getImplicitPrototype();
        boolean boolean92 = parameterizedType35.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) parameterizedType84);
        com.google.javascript.rhino.JSDocInfo jSDocInfo94 = parameterizedType84.getOwnPropertyJSDocInfo("function (): {proxy:{1667240094}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType21 and parameterizedType35.", jSType21.equals(parameterizedType35) == parameterizedType35.equals(jSType21));
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test286");
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
        com.google.javascript.rhino.jstype.ObjectType objectType48 = parameterizedType30.toObjectType();
        java.lang.String str49 = parameterizedType30.toDebugHashCodeString();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test287");
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
        com.google.javascript.rhino.jstype.JSType jSType35 = parameterizedType30.collapseUnion();
        boolean boolean37 = parameterizedType30.isPropertyTypeDeclared("{proxy:{proxy:{832922763}}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test288");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, true);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        boolean boolean12 = jSTypeRegistry9.resetImplicitPrototype(jSType10, objectType11);
        com.google.javascript.rhino.jstype.JSType jSType17 = jSTypeRegistry9.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType18 = jSType17.dereference();
        boolean boolean19 = objectType18.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable20 = objectType18.getCtorImplementedInterfaces();
        boolean boolean21 = objectType18.isNativeObjectType();
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
        boolean boolean37 = objectType18.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType33);
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry2.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType33, "Named type with empty name component", "hi!", 4095, (int) (byte) 100);
        boolean boolean43 = objectType33.isBooleanObjectType();
        boolean boolean44 = objectType33.isUnknownType();
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, true);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType49 = null;
        boolean boolean50 = jSTypeRegistry47.resetImplicitPrototype(jSType48, objectType49);
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51, true);
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType55 = null;
        boolean boolean56 = jSTypeRegistry53.resetImplicitPrototype(jSType54, objectType55);
        com.google.javascript.rhino.jstype.JSType jSType61 = jSTypeRegistry53.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType62 = jSType61.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63, true);
        com.google.javascript.rhino.jstype.JSType jSType66 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType67 = null;
        boolean boolean68 = jSTypeRegistry65.resetImplicitPrototype(jSType66, objectType67);
        com.google.javascript.rhino.jstype.JSType jSType73 = jSTypeRegistry65.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType74 = jSType73.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType75 = jSTypeRegistry47.createParameterizedType(objectType62, jSType73);
        java.util.Set set76 = parameterizedType75.getOwnPropertyNames();
        boolean boolean77 = parameterizedType75.hasReferenceName();
        boolean boolean78 = parameterizedType75.hasAnyTemplateInternal();
        boolean boolean79 = parameterizedType75.isOrdinaryFunction();
        boolean boolean80 = parameterizedType75.isInstanceType();
        com.google.javascript.rhino.jstype.JSType jSType82 = parameterizedType75.getPropertyType("{proxy:{proxy:{628733757}}}");
        boolean boolean84 = parameterizedType75.isPropertyTypeDeclared("false");
        com.google.javascript.rhino.jstype.JSType.TypePair typePair85 = objectType33.getTypesUnderEquality((com.google.javascript.rhino.jstype.JSType) parameterizedType75);
        com.google.javascript.rhino.jstype.JSType jSType86 = typePair85.typeB;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType17 and jSType86.", jSType17.equals(jSType86) == jSType86.equals(jSType17));
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test289");
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
        boolean boolean54 = parameterizedType43.isBooleanValueType();
        com.google.javascript.rhino.jstype.JSType jSType56 = parameterizedType43.findPropertyType("STRING {proxy:{proxy:{1004792283}}}\n");
        com.google.javascript.rhino.jstype.JSType jSType57 = jSType56.unboxesTo();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType10 and parameterizedType43.", jSType10.equals(parameterizedType43) == parameterizedType43.equals(jSType10));
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test290");
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
        boolean boolean80 = parameterizedType52.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType81 = parameterizedType52.toObjectType();
        boolean boolean82 = parameterizedType52.isConstructor();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType52.", jSType16.equals(parameterizedType52) == parameterizedType52.equals(jSType16));
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test291");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo70 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean71 = jSDocInfo70.isInterface();
        java.util.Collection<java.lang.String> strCollection72 = jSDocInfo70.getReferences();
        java.lang.String str73 = jSDocInfo70.getOriginalCommentString();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList74 = jSDocInfo70.getThrownTypes();
        parameterizedType30.setPropertyJSDocInfo("{proxy:{proxy:{1727383615}}}", jSDocInfo70);
        boolean boolean77 = jSDocInfo70.hasParameter("Named type with empty name component");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test292");
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
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType80 = parameterizedType52.toMaybeParameterizedType();
        boolean boolean81 = parameterizedType52.isInterface();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType52.", jSType16.equals(parameterizedType52) == parameterizedType52.equals(jSType16));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test293");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        boolean boolean4 = node2.isFalse();
        node2.setIsSyntheticBlock(false);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = new com.google.javascript.rhino.JSTypeExpression(node2, "{proxy:{proxy:{69867283}}}");
        boolean boolean9 = jSTypeExpression8.isOptionalArg();
        com.google.javascript.rhino.Node node10 = jSTypeExpression8.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node12 = node10.getChildAtIndex(46);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test294");
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
        com.google.javascript.rhino.jstype.JSType jSType47 = jSTypeRegistry39.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = jSType47.dereference();
        boolean boolean49 = objectType48.isFunctionType();
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50, true);
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType54 = null;
        boolean boolean55 = jSTypeRegistry52.resetImplicitPrototype(jSType53, objectType54);
        com.google.javascript.rhino.jstype.JSType jSType60 = jSTypeRegistry52.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType61 = jSType60.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType62 = jSType60.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType63 = jSType60.restrictByNotNullOrUndefined();
        boolean boolean64 = objectType48.isSubtype(jSType63);
        com.google.javascript.rhino.jstype.JSType jSType66 = objectType48.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.ErrorReporter errorReporter67 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry69 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter67, true);
        com.google.javascript.rhino.jstype.JSType jSType70 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType71 = null;
        boolean boolean72 = jSTypeRegistry69.resetImplicitPrototype(jSType70, objectType71);
        com.google.javascript.rhino.jstype.JSType jSType77 = jSTypeRegistry69.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType78 = jSType77.dereference();
        java.lang.String str79 = objectType78.getDisplayName();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair80 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) objectType48, (com.google.javascript.rhino.jstype.JSType) objectType78);
        com.google.javascript.rhino.JSDocInfo jSDocInfo82 = null;
        objectType48.setPropertyJSDocInfo("{proxy:{proxy:{1321644185}}}", jSDocInfo82);
        boolean boolean84 = parameterizedType30.isSubtype((com.google.javascript.rhino.jstype.JSType) objectType48);
        boolean boolean85 = objectType48.canBeCalled();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test295");
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
        com.google.javascript.rhino.jstype.ObjectType.Property property57 = parameterizedType30.getSlot("{proxy:{proxy:{51735728}}}");
        com.google.javascript.rhino.jstype.ObjectType objectType58 = parameterizedType30.getImplicitPrototype();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType59 = parameterizedType30.toMaybeParameterizedType();
        com.google.javascript.rhino.jstype.FunctionType functionType60 = parameterizedType30.getConstructor();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test296");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        boolean boolean3 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
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
        boolean boolean40 = parameterizedType36.isInstanceType();
        boolean boolean41 = parameterizedType36.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType42 = objectType4.forceResolve(errorReporter5, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) parameterizedType36);
        boolean boolean43 = objectType4.isParameterizedType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType22 and parameterizedType36.", jSType22.equals(parameterizedType36) == parameterizedType36.equals(jSType22));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test297");
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
        com.google.javascript.rhino.jstype.EnumType enumType39 = parameterizedType30.toMaybeEnumType();
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41, true);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType45 = null;
        boolean boolean46 = jSTypeRegistry43.resetImplicitPrototype(jSType44, objectType45);
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47, true);
        com.google.javascript.rhino.jstype.JSType jSType50 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType51 = null;
        boolean boolean52 = jSTypeRegistry49.resetImplicitPrototype(jSType50, objectType51);
        com.google.javascript.rhino.jstype.JSType jSType57 = jSTypeRegistry49.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType58 = jSType57.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        com.google.javascript.rhino.jstype.JSType jSType62 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType63 = null;
        boolean boolean64 = jSTypeRegistry61.resetImplicitPrototype(jSType62, objectType63);
        com.google.javascript.rhino.jstype.JSType jSType69 = jSTypeRegistry61.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType70 = jSType69.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType71 = jSTypeRegistry43.createParameterizedType(objectType58, jSType69);
        java.util.Set set72 = parameterizedType71.getOwnPropertyNames();
        boolean boolean73 = parameterizedType71.hasReferenceName();
        boolean boolean74 = parameterizedType71.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.JSType jSType76 = parameterizedType71.findPropertyType("");
        java.lang.String str77 = parameterizedType71.getReferenceName();
        com.google.javascript.rhino.jstype.TemplateType templateType78 = parameterizedType71.toMaybeTemplateType();
        com.google.javascript.rhino.jstype.UnionType unionType79 = parameterizedType71.toMaybeUnionType();
        boolean boolean80 = parameterizedType71.isNoObjectType();
        com.google.javascript.rhino.Node node83 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList84 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node83);
        boolean boolean85 = node83.isFalse();
        boolean boolean86 = node83.isName();
        boolean boolean87 = parameterizedType30.defineSynthesizedProperty("true", (com.google.javascript.rhino.jstype.JSType) parameterizedType71, node83);
        boolean boolean88 = parameterizedType71.isInstanceType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test298");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        jSTypeRegistry2.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.JSType jSType9 = jSTypeRegistry2.createUnionType(jSTypeArray8);
        com.google.javascript.rhino.jstype.UnionType unionType10 = jSType9.toMaybeUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, true);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        boolean boolean16 = jSTypeRegistry13.resetImplicitPrototype(jSType14, objectType15);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        boolean boolean22 = jSTypeRegistry19.resetImplicitPrototype(jSType20, objectType21);
        com.google.javascript.rhino.jstype.JSType jSType27 = jSTypeRegistry19.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType28 = jSType27.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, true);
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType33 = null;
        boolean boolean34 = jSTypeRegistry31.resetImplicitPrototype(jSType32, objectType33);
        com.google.javascript.rhino.jstype.JSType jSType39 = jSTypeRegistry31.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType40 = jSType39.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType41 = jSTypeRegistry13.createParameterizedType(objectType28, jSType39);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable42 = parameterizedType41.getCtorExtendedInterfaces();
        boolean boolean43 = parameterizedType41.isNominalType();
        boolean boolean44 = parameterizedType41.isAllType();
        boolean boolean45 = parameterizedType41.isUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType47 = parameterizedType41.getPropertyType("{proxy:{proxy:{51735728}}}");
        com.google.javascript.rhino.JSDocInfo jSDocInfo48 = parameterizedType41.getJSDocInfo();
        boolean boolean49 = jSType9.differsFrom((com.google.javascript.rhino.jstype.JSType) parameterizedType41);
        boolean boolean50 = parameterizedType41.isNumberValueType();
        com.google.javascript.rhino.jstype.TemplateType templateType51 = parameterizedType41.toMaybeTemplateType();
        com.google.javascript.rhino.jstype.JSType jSType52 = parameterizedType41.collapseUnion();
        com.google.javascript.rhino.jstype.JSType jSType53 = parameterizedType41.getIndexType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType27 and parameterizedType41.", jSType27.equals(parameterizedType41) == parameterizedType41.equals(jSType27));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test299");
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
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet84 = parameterizedType73.getPossibleToBooleanOutcomes();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test300");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo65 = parameterizedType30.getOwnPropertyJSDocInfo("");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType61.", jSType16.equals(parameterizedType61) == parameterizedType61.equals(jSType16));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test301");
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
        boolean boolean80 = parameterizedType52.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType81 = parameterizedType52.toObjectType();
        com.google.javascript.rhino.jstype.EnumType enumType82 = parameterizedType52.toMaybeEnumType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType52.", jSType16.equals(parameterizedType52) == parameterizedType52.equals(jSType16));
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test302");
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
        com.google.javascript.rhino.jstype.ObjectType objectType41 = parameterizedType35.getParentScope();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType21 and parameterizedType35.", jSType21.equals(parameterizedType35) == parameterizedType35.equals(jSType21));
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test303");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        jSTypeRegistry2.resetForTypeCheck();
        jSTypeRegistry2.forwardDeclareType("hi!");
        boolean boolean11 = jSTypeRegistry2.hasNamespace("function (): {proxy:{1262905525}}");
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
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType42.getImplicitPrototype();
        com.google.javascript.rhino.jstype.ObjectType objectType52 = jSTypeRegistry2.createObjectType((com.google.javascript.rhino.jstype.ObjectType) parameterizedType42);
        java.lang.String str53 = objectType52.getReferenceName();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType28 and parameterizedType42.", jSType28.equals(parameterizedType42) == parameterizedType42.equals(jSType28));
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test304");
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
        boolean boolean44 = parameterizedType30.isPropertyTypeInferred("InputId: function (): {proxy:{410214344}}");
        boolean boolean45 = parameterizedType30.isNoResolvedType();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, true);
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType50 = null;
        boolean boolean51 = jSTypeRegistry48.resetImplicitPrototype(jSType49, objectType50);
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, true);
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType56 = null;
        boolean boolean57 = jSTypeRegistry54.resetImplicitPrototype(jSType55, objectType56);
        com.google.javascript.rhino.jstype.JSType jSType62 = jSTypeRegistry54.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType63 = jSType62.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter64 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter64, true);
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType68 = null;
        boolean boolean69 = jSTypeRegistry66.resetImplicitPrototype(jSType67, objectType68);
        com.google.javascript.rhino.jstype.JSType jSType74 = jSTypeRegistry66.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType75 = jSType74.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType76 = jSTypeRegistry48.createParameterizedType(objectType63, jSType74);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable77 = parameterizedType76.getCtorExtendedInterfaces();
        boolean boolean78 = parameterizedType76.isNominalType();
        boolean boolean79 = parameterizedType76.isAllType();
        boolean boolean80 = parameterizedType76.matchesNumberContext();
        boolean boolean81 = parameterizedType76.isNullable();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair82 = parameterizedType30.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType) parameterizedType76);
        int int83 = parameterizedType30.getPropertiesCount();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType76.", jSType16.equals(parameterizedType76) == parameterizedType76.equals(jSType16));
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test305");
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
        boolean boolean80 = parameterizedType52.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType81 = parameterizedType52.toObjectType();
        boolean boolean83 = parameterizedType52.isPropertyTypeDeclared("{proxy:{proxy:{901464277}}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType52.", jSType16.equals(parameterizedType52) == parameterizedType52.equals(jSType16));
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test306");
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
        boolean boolean69 = parameterizedType67.isNoObjectType();
        boolean boolean71 = parameterizedType67.isPropertyTypeInferred("{proxy:{proxy:{1168420562}}}");
        boolean boolean72 = parameterizedType67.isInstanceType();
        boolean boolean73 = parameterizedType67.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair74 = objectType11.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType) parameterizedType67);
        com.google.javascript.rhino.jstype.JSType jSType75 = typePair74.typeB;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType10 and jSType75.", jSType10.equals(jSType75) == jSType75.equals(jSType10));
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test307");
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
        jSTypeRegistry2.forwardDeclareType("enum{({proxy:{proxy:{1874555938}}})}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType24 and parameterizedType38.", jSType24.equals(parameterizedType38) == parameterizedType38.equals(jSType24));
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test308");
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
        com.google.javascript.rhino.jstype.ObjectType objectType73 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) parameterizedType42);
        boolean boolean74 = objectType73.matchesStringContext();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType10 and objectType73.", jSType10.equals(objectType73) == objectType73.equals(jSType10));
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test309");
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
        com.google.javascript.rhino.jstype.ObjectType objectType78 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface((com.google.javascript.rhino.jstype.ObjectType) parameterizedType47, "{proxy:{proxy:{279609923}}}");
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType79 = parameterizedType47.toMaybeParameterizedType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType11 and parameterizedType79.", jSType11.equals(parameterizedType79) == parameterizedType79.equals(jSType11));
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test310");
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
        boolean boolean96 = node90.isQuotedString();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test311");
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
        boolean boolean41 = jSType40.isInstanceType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType21 and jSType40.", jSType21.equals(jSType40) == jSType40.equals(jSType21));
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test312");
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
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType80 = parameterizedType52.toMaybeParameterizedType();
        boolean boolean81 = parameterizedType52.isInstanceType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType52.", jSType16.equals(parameterizedType52) == parameterizedType52.equals(jSType16));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test313");
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
        int int68 = parameterizedType30.getPropertiesCount();
        com.google.javascript.rhino.JSDocInfo jSDocInfo70 = parameterizedType30.getOwnPropertyJSDocInfo("({proxy:{proxy:{1321644185}}})");
        com.google.javascript.rhino.jstype.JSType jSType72 = parameterizedType30.findPropertyType("({proxy:{proxy:{1321644185}}})");
        boolean boolean73 = parameterizedType30.isNullable();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType74 = parameterizedType30.toMaybeParameterizedType();
        java.lang.String str75 = parameterizedType30.toAnnotationString();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test314");
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
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType84 = parameterizedType30.toMaybeParameterizedType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType73.", jSType16.equals(parameterizedType73) == parameterizedType73.equals(jSType16));
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test315");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean3 = node2.isTrue();
        boolean boolean4 = node2.isOr();
        boolean boolean5 = node2.isSetterDef();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList9 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node8);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList13 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node12);
        node12.detachChildren();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean16 = jSDocInfo15.isInterface();
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean18 = jSDocInfo17.isInterface();
        java.lang.String str19 = jSDocInfo17.getOriginalCommentString();
        boolean boolean20 = jSDocInfo17.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean22 = jSDocInfo21.isInterface();
        jSDocInfo21.setLicense("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo25 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean26 = jSDocInfo25.isInterface();
        java.lang.String str27 = jSDocInfo25.getOriginalCommentString();
        boolean boolean28 = jSDocInfo25.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean30 = jSDocInfo29.isInterface();
        boolean boolean31 = jSDocInfo29.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression32 = jSDocInfo29.getEnumParameterType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean34 = jSDocInfo33.isInterface();
        jSDocInfo33.setLicense("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo37 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean38 = jSDocInfo37.isInterface();
        boolean boolean39 = jSDocInfo37.hasType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo40 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean41 = jSDocInfo40.isInterface();
        boolean boolean42 = jSDocInfo40.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression43 = jSDocInfo40.getEnumParameterType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo44 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean45 = jSDocInfo44.isInterface();
        boolean boolean46 = jSDocInfo44.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression47 = jSDocInfo44.getEnumParameterType();
        boolean boolean48 = jSDocInfo44.containsDeclaration();
        com.google.javascript.rhino.JSDocInfo jSDocInfo49 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean50 = jSDocInfo49.isInterface();
        java.lang.String str51 = jSDocInfo49.getOriginalCommentString();
        boolean boolean52 = jSDocInfo49.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo jSDocInfo53 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean54 = jSDocInfo53.isInterface();
        java.lang.String str55 = jSDocInfo53.getOriginalCommentString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression56 = jSDocInfo53.getType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo57 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean58 = jSDocInfo57.isInterface();
        jSDocInfo57.setLicense("");
        boolean boolean61 = jSDocInfo57.isNoAlias();
        com.google.javascript.rhino.JSDocInfo jSDocInfo62 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean63 = jSDocInfo62.isInterface();
        jSDocInfo62.setLicense("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo66 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean67 = jSDocInfo66.isInterface();
        boolean boolean68 = jSDocInfo66.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression69 = jSDocInfo66.getEnumParameterType();
        boolean boolean70 = jSDocInfo66.containsDeclaration();
        com.google.javascript.rhino.JSDocInfo[] jSDocInfoArray71 = new com.google.javascript.rhino.JSDocInfo[] { jSDocInfo62, jSDocInfo66 };
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList72 = com.google.common.collect.ImmutableList.of(jSDocInfo15, jSDocInfo17, jSDocInfo21, jSDocInfo25, jSDocInfo29, jSDocInfo33, jSDocInfo37, jSDocInfo40, jSDocInfo44, jSDocInfo49, jSDocInfo53, jSDocInfo57, jSDocInfoArray71);
        jSDocInfo29.setDeprecated(false);
        com.google.javascript.rhino.Node node78 = new com.google.javascript.rhino.Node(43, 12, (int) (short) -1);
        boolean boolean79 = node78.isScript();
        jSDocInfo29.setAssociatedNode(node78);
        boolean boolean81 = node78.hasOneChild();
        boolean boolean82 = node78.isName();
        node78.setLineno(48);
        int int85 = node12.getIndexOfChild(node78);
        com.google.javascript.rhino.Node node86 = node8.copyInformationFromForTree(node78);
        com.google.javascript.rhino.Node node87 = node78.cloneTree();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.removeChild(node78);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test316");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1L));
        boolean boolean2 = node1.isQuotedString();
        node1.setWasEmptyNode(false);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = new com.google.javascript.rhino.JSTypeExpression(node1, "{proxy:{proxy:{1321644185}}}");
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, true);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        boolean boolean12 = jSTypeRegistry9.resetImplicitPrototype(jSType10, objectType11);
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        boolean boolean18 = jSTypeRegistry15.resetImplicitPrototype(jSType16, objectType17);
        com.google.javascript.rhino.jstype.JSType jSType23 = jSTypeRegistry15.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSType23.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25, true);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        boolean boolean30 = jSTypeRegistry27.resetImplicitPrototype(jSType28, objectType29);
        com.google.javascript.rhino.jstype.JSType jSType35 = jSTypeRegistry27.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType36 = jSType35.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType37 = jSTypeRegistry9.createParameterizedType(objectType24, jSType35);
        java.util.Set set38 = parameterizedType37.getOwnPropertyNames();
        boolean boolean39 = parameterizedType37.hasReferenceName();
        boolean boolean40 = parameterizedType37.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.JSType jSType42 = parameterizedType37.findPropertyType("");
        java.lang.String str43 = parameterizedType37.getReferenceName();
        com.google.javascript.rhino.jstype.UnionType unionType44 = parameterizedType37.toMaybeUnionType();
        boolean boolean45 = jSTypeExpression6.equals((java.lang.Object) parameterizedType37);
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, true);
        boolean boolean49 = jSTypeRegistry48.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.ObjectType objectType50 = jSTypeRegistry48.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.JSType jSType51 = objectType50.collapseUnion();
        boolean boolean52 = objectType50.isTemplateType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue53 = parameterizedType37.testForEquality((com.google.javascript.rhino.jstype.JSType) objectType50);
        com.google.javascript.rhino.JSDocInfo jSDocInfo54 = objectType50.getJSDocInfo();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType23 and parameterizedType37.", jSType23.equals(parameterizedType37) == parameterizedType37.equals(jSType23));
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test317");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType0 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node3);
        boolean boolean5 = node3.isFalse();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean13 = node12.isFalse();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean17 = node16.isTrue();
        boolean boolean18 = node16.hasOneChild();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean22 = node21.isTrue();
        boolean boolean23 = node21.isBreak();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (byte) 1, node9, node12, node16, node21, (int) (byte) 1, 4095);
        boolean boolean27 = node3.isEquivalentTo(node9);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean31 = node30.isTrue();
        boolean boolean32 = node30.isBreak();
        boolean boolean33 = node30.isFor();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship34 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType0, node3, node30);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString((int) (byte) -1, "hi!");
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(41, node38, (int) (short) 1, 40);
        int int42 = node38.getSideEffectFlags();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression44 = new com.google.javascript.rhino.JSTypeExpression(node38, "({proxy:{proxy:{1321644185}}})");
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean49 = node48.isTrue();
        boolean boolean50 = node48.hasOneChild();
        boolean boolean51 = node48.isVarArgs();
        int int52 = node48.getType();
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString((int) (byte) -1, "hi!");
        com.google.javascript.rhino.Node node59 = node55.useSourceInfoFromForTree(node58);
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node((int) '#', node48, node55, (int) (byte) 100, (int) (short) 10);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship63 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType0, node38, node62);
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean67 = node66.isTrue();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable68 = node66.siblings();
        boolean boolean69 = node66.isAdd();
        int int70 = node66.getSideEffectFlags();
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean74 = node73.isTrue();
        boolean boolean75 = node73.isOr();
        boolean boolean76 = node73.isSetterDef();
        node73.setSourceFileForTesting("{proxy:{proxy:{1763454178}}}");
        node73.setLineno((int) 'a');
        boolean boolean81 = node73.isAssignAdd();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable82 = node73.getAncestors();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship83 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType0, node66, node73);
        com.google.javascript.rhino.jstype.JSType jSType84 = node66.getJSType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node86 = node66.getChildAtIndex(38);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test318");
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
        boolean boolean82 = parameterizedType52.isAllType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType52.", jSType16.equals(parameterizedType52) == parameterizedType52.equals(jSType16));
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test319");
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
        jSTypeRegistry2.clearNamedTypes();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType22 and parameterizedType36.", jSType22.equals(parameterizedType36) == parameterizedType36.equals(jSType22));
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test320");
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
        com.google.javascript.rhino.jstype.JSType jSType61 = null;
        com.google.javascript.rhino.jstype.JSType jSType62 = parameterizedType30.getGreatestSubtype(jSType61);
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
        java.util.Set set94 = parameterizedType93.getOwnPropertyNames();
        boolean boolean95 = parameterizedType93.isNominalType();
        boolean boolean96 = com.google.javascript.rhino.jstype.JSType.isEquivalent(jSType61, (com.google.javascript.rhino.jstype.JSType) parameterizedType93);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test321");
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
        java.lang.String str21 = node6.getString();
        node6.setSourceEncodedPosition(47);
        boolean boolean24 = node6.isTypeOf();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean32 = node31.isFalse();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean36 = node35.isTrue();
        boolean boolean37 = node35.hasOneChild();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean41 = node40.isTrue();
        boolean boolean42 = node40.isBreak();
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((int) (byte) 1, node28, node31, node35, node40, (int) (byte) 1, 4095);
        boolean boolean46 = node28.isReturn();
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node28);
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
        java.lang.String str69 = node54.getString();
        boolean boolean70 = node54.isParamList();
        boolean boolean71 = node54.isCase();
        int int72 = node54.getSideEffectFlags();
        boolean boolean73 = node28.isEquivalentToTyped(node54);
        boolean boolean74 = node28.isNot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node75 = node6.getChildBefore(node28);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test322");
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
        boolean boolean85 = parameterizedType52.removeProperty("function (): {proxy:{848640642}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType52.", jSType16.equals(parameterizedType52) == parameterizedType52.equals(jSType16));
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test323");
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
        java.lang.String str42 = objectType41.toString();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and objectType41.", jSType16.equals(objectType41) == objectType41.equals(jSType16));
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test324");
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
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType57 = null;
        boolean boolean58 = jSTypeRegistry55.resetImplicitPrototype(jSType56, objectType57);
        boolean boolean59 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60, true);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType64 = null;
        boolean boolean65 = jSTypeRegistry62.resetImplicitPrototype(jSType63, objectType64);
        com.google.javascript.rhino.jstype.JSType jSType70 = jSTypeRegistry62.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType71 = jSType70.dereference();
        boolean boolean72 = objectType71.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable73 = objectType71.getCtorImplementedInterfaces();
        boolean boolean74 = objectType71.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter75 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter75, true);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType79 = null;
        boolean boolean80 = jSTypeRegistry77.resetImplicitPrototype(jSType78, objectType79);
        com.google.javascript.rhino.jstype.JSType jSType85 = jSTypeRegistry77.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType86 = jSType85.dereference();
        boolean boolean87 = objectType86.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable88 = objectType86.getCtorImplementedInterfaces();
        boolean boolean89 = objectType86.isNativeObjectType();
        boolean boolean90 = objectType71.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType86);
        com.google.javascript.rhino.jstype.JSType jSType95 = jSTypeRegistry55.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType86, "Named type with empty name component", "hi!", 4095, (int) (byte) 100);
        com.google.javascript.rhino.Node node96 = objectType86.getRootNode();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair97 = jSType52.getTypesUnderInequality((com.google.javascript.rhino.jstype.JSType) objectType86);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test325");
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
        com.google.javascript.rhino.jstype.JSType jSType39 = parameterizedType30.collapseUnion();
        boolean boolean40 = parameterizedType30.isNoResolvedType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test326");
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
        boolean boolean54 = parameterizedType30.isNativeObjectType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test327");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        boolean boolean4 = cloneableList3.isEmpty();
        boolean boolean5 = cloneableList3.isEmpty();
        java.util.stream.Stream<java.lang.Cloneable> cloneableStream6 = cloneableList3.parallelStream();
        java.lang.Object[] objArray7 = cloneableList3.toArray();
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
        com.google.javascript.rhino.jstype.JSType jSType41 = parameterizedType38.getIndexType();
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, true);
        com.google.javascript.rhino.jstype.JSType jSType45 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        boolean boolean47 = jSTypeRegistry44.resetImplicitPrototype(jSType45, objectType46);
        com.google.javascript.rhino.jstype.JSType jSType52 = jSTypeRegistry44.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType53 = jSType52.dereference();
        boolean boolean54 = objectType53.isRegexpType();
        boolean boolean56 = objectType53.isPropertyTypeInferred("hi!");
        boolean boolean57 = parameterizedType38.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) objectType53);
        java.lang.String str58 = parameterizedType38.toDebugHashCodeString();
        boolean boolean60 = parameterizedType38.hasOwnProperty("");
        boolean boolean61 = parameterizedType38.isNullType();
        boolean boolean63 = parameterizedType38.isPropertyTypeDeclared("{proxy:{proxy:{1874555938}}}");
        boolean boolean64 = parameterizedType38.isNominalType();
        boolean boolean65 = parameterizedType38.isAllType();
        com.google.javascript.rhino.jstype.JSType jSType66 = parameterizedType38.unboxesTo();
        com.google.javascript.rhino.jstype.FunctionType functionType67 = parameterizedType38.getOwnerFunction();
        boolean boolean68 = cloneableList3.contains((java.lang.Object) parameterizedType38);
        java.util.Iterator<java.lang.Cloneable> cloneableItor69 = cloneableList3.iterator();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType24 and parameterizedType38.", jSType24.equals(parameterizedType38) == parameterizedType38.equals(jSType24));
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test328");
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
        boolean boolean92 = parameterizedType66.hasProperty("FALSE\n");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test329");
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
        int int49 = node20.getLength();
        com.google.javascript.rhino.Node node50 = node20.getLastSibling();
        boolean boolean51 = node50.hasChildren();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node53 = node50.getChildAtIndex(16);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test330");
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
        com.google.javascript.rhino.jstype.ObjectType.Property property57 = parameterizedType30.getSlot("{proxy:{proxy:{51735728}}}");
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType58 = parameterizedType30.toMaybeParameterizedType();
        boolean boolean59 = parameterizedType58.isEmptyType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType58.", jSType16.equals(parameterizedType58) == parameterizedType58.equals(jSType16));
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test331");
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
        boolean boolean43 = parameterizedType42.isOrdinaryFunction();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType21 and parameterizedType42.", jSType21.equals(parameterizedType42) == parameterizedType42.equals(jSType21));
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test332");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = jSTypeRegistry2.getErrorReporter();
        boolean boolean7 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean12 = node11.isTrue();
        boolean boolean13 = node11.isOr();
        boolean boolean14 = node11.isSetterDef();
        node11.setSourceFileForTesting("{proxy:{proxy:{1763454178}}}");
        node11.setLineno((int) 'a');
        boolean boolean19 = node11.isAssignAdd();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(0);
        node21.setVarArgs(false);
        int int24 = node11.getIndexOfChild(node21);
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
        boolean boolean57 = parameterizedType55.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter58 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter58, true);
        com.google.javascript.rhino.jstype.JSType jSType61 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType62 = null;
        boolean boolean63 = jSTypeRegistry60.resetImplicitPrototype(jSType61, objectType62);
        com.google.javascript.rhino.jstype.JSType jSType68 = jSTypeRegistry60.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType69 = jSType68.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType70 = jSType68.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType71 = jSType68.restrictByNotNullOrUndefined();
        boolean boolean72 = parameterizedType55.canAssignTo(jSType68);
        boolean boolean74 = parameterizedType55.isPropertyTypeInferred("");
        boolean boolean75 = parameterizedType55.isResolved();
        com.google.javascript.rhino.jstype.ObjectType objectType76 = parameterizedType55.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType78 = parameterizedType55.findPropertyType("{proxy:{proxy:{649633010}}}");
        boolean boolean79 = parameterizedType55.isNominalType();
        boolean boolean80 = parameterizedType55.matchesStringContext();
        com.google.javascript.rhino.jstype.ObjectType.Property property82 = parameterizedType55.getSlot("{proxy:{proxy:{51735728}}}");
        com.google.javascript.rhino.jstype.ObjectType objectType83 = parameterizedType55.getImplicitPrototype();
        com.google.javascript.rhino.jstype.ObjectType objectType84 = jSTypeRegistry2.createObjectType("{proxy:{proxy:{2042384320}}}", node21, objectType83);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType41 and parameterizedType55.", jSType41.equals(parameterizedType55) == parameterizedType55.equals(jSType41));
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test333");
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
        boolean boolean40 = parameterizedType30.isDateType();
        java.lang.String str41 = parameterizedType30.getReferenceName();
        boolean boolean42 = parameterizedType30.matchesStringContext();
        com.google.javascript.rhino.jstype.ObjectType objectType43 = parameterizedType30.getTypeOfThis();
        com.google.javascript.rhino.jstype.ObjectType objectType45 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface((com.google.javascript.rhino.jstype.ObjectType) parameterizedType30, "{proxy:{proxy:{874271629}}}");
        boolean boolean46 = parameterizedType30.isNominalType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test334");
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
        boolean boolean82 = jSType81.isNoObjectType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType52.", jSType16.equals(parameterizedType52) == parameterizedType52.equals(jSType16));
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test335");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable7 = jSTypeRegistry2.getTypesWithProperty("Named type with empty name component");
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.ObjectType objectType12 = jSTypeRegistry10.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14, true);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        boolean boolean19 = jSTypeRegistry16.resetImplicitPrototype(jSType17, objectType18);
        com.google.javascript.rhino.jstype.JSType jSType24 = jSTypeRegistry16.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSType24.dereference();
        boolean boolean26 = objectType25.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable27 = objectType25.getCtorImplementedInterfaces();
        boolean boolean28 = objectType25.isNativeObjectType();
        jSTypeRegistry10.registerPropertyOnType("", (com.google.javascript.rhino.jstype.JSType) objectType25);
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, true);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        boolean boolean35 = jSTypeRegistry32.resetImplicitPrototype(jSType33, objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType40 = null;
        boolean boolean41 = jSTypeRegistry38.resetImplicitPrototype(jSType39, objectType40);
        com.google.javascript.rhino.jstype.JSType jSType46 = jSTypeRegistry38.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSType46.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48, true);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType52 = null;
        boolean boolean53 = jSTypeRegistry50.resetImplicitPrototype(jSType51, objectType52);
        com.google.javascript.rhino.jstype.JSType jSType58 = jSTypeRegistry50.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType59 = jSType58.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType60 = jSTypeRegistry32.createParameterizedType(objectType47, jSType58);
        java.util.Set set61 = parameterizedType60.getOwnPropertyNames();
        boolean boolean62 = parameterizedType60.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63, true);
        com.google.javascript.rhino.jstype.JSType jSType66 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType67 = null;
        boolean boolean68 = jSTypeRegistry65.resetImplicitPrototype(jSType66, objectType67);
        com.google.javascript.rhino.jstype.JSType jSType73 = jSTypeRegistry65.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType74 = jSType73.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType75 = jSType73.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType76 = jSType73.restrictByNotNullOrUndefined();
        boolean boolean77 = parameterizedType60.canAssignTo(jSType73);
        boolean boolean79 = parameterizedType60.isPropertyTypeInferred("");
        com.google.javascript.rhino.jstype.JSType jSType84 = jSTypeRegistry10.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) parameterizedType60, "hi!", "Named type with empty name component", 40, 39);
        com.google.javascript.rhino.jstype.JSType jSType85 = parameterizedType60.getParameterType();
        boolean boolean86 = parameterizedType60.isNoType();
        boolean boolean87 = parameterizedType60.isParameterizedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo88 = parameterizedType60.getJSDocInfo();
        java.lang.String str89 = parameterizedType60.getReferenceName();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType90 = parameterizedType60.toMaybeParameterizedType();
        com.google.javascript.rhino.jstype.JSType jSType91 = jSTypeRegistry2.createNullableType((com.google.javascript.rhino.jstype.JSType) parameterizedType90);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType24 and parameterizedType90.", jSType24.equals(parameterizedType90) == parameterizedType90.equals(jSType24));
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test336");
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
        boolean boolean40 = parameterizedType30.isDateType();
        java.lang.String str41 = parameterizedType30.getReferenceName();
        boolean boolean42 = parameterizedType30.matchesStringContext();
        com.google.javascript.rhino.jstype.ObjectType objectType44 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface((com.google.javascript.rhino.jstype.ObjectType) parameterizedType30, "");
        boolean boolean45 = parameterizedType30.isNumberValueType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test337");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(50, "function (new:{...}): ");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean10 = node9.isFalse();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean14 = node13.isTrue();
        boolean boolean15 = node13.hasOneChild();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean19 = node18.isTrue();
        boolean boolean20 = node18.isBreak();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (byte) 1, node6, node9, node13, node18, (int) (byte) 1, 4095);
        node18.removeProp(30);
        node18.addSuppression("{proxy:{proxy:{2014603671}}}");
        boolean boolean28 = node18.isThrow();
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node18);
        boolean boolean30 = node18.isWhile();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean38 = node37.isFalse();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean42 = node41.isTrue();
        boolean boolean43 = node41.hasOneChild();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean47 = node46.isTrue();
        boolean boolean48 = node46.isBreak();
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node((int) (byte) 1, node34, node37, node41, node46, (int) (byte) 1, 4095);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable52 = node51.children();
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
        com.google.javascript.rhino.Node node74 = node51.useSourceInfoIfMissingFromForTree(node68);
        boolean boolean75 = node51.isDefaultCase();
        node51.putIntProp((int) (short) -1, 0);
        java.lang.Object obj80 = node51.getProp((-1));
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable81 = node51.children();
        com.google.javascript.rhino.Node node82 = node18.useSourceInfoIfMissingFromForTree(node51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.removeChild(node51);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test338");
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
        com.google.javascript.rhino.InputId inputId47 = node42.getInputId();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean51 = node50.isTrue();
        boolean boolean52 = node50.isOr();
        boolean boolean53 = node50.isSetterDef();
        node50.setSourceFileForTesting("{proxy:{proxy:{1763454178}}}");
        node50.setLineno((int) 'a');
        boolean boolean58 = node50.isAssignAdd();
        boolean boolean59 = node42.isEquivalentTo(node50);
        boolean boolean60 = node50.isLabelName();
        com.google.javascript.rhino.Node node61 = node50.getLastChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node63 = node50.getChildAtIndex(50);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test339");
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
        boolean boolean91 = parameterizedType66.matchesObjectContext();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test340");
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
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType80 = parameterizedType52.toMaybeParameterizedType();
        int int81 = parameterizedType80.getPropertiesCount();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType80.", jSType16.equals(parameterizedType80) == parameterizedType80.equals(jSType16));
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test341");
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
        com.google.javascript.rhino.jstype.JSType jSType35 = parameterizedType30.collapseUnion();
        boolean boolean36 = jSType35.matchesUint32Context();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and jSType35.", jSType16.equals(jSType35) == jSType35.equals(jSType16));
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test342");
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
        com.google.javascript.rhino.Node node67 = new com.google.javascript.rhino.Node((int) (byte) 10);
        com.google.javascript.rhino.Node[] nodeArray72 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node(52, nodeArray72, 49, 38);
        com.google.javascript.rhino.Node node76 = new com.google.javascript.rhino.Node(53, nodeArray72);
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node(1, nodeArray72);
        com.google.javascript.rhino.Node node80 = new com.google.javascript.rhino.Node(47, nodeArray72, 47, 36);
        com.google.javascript.rhino.Node node83 = new com.google.javascript.rhino.Node(52, node67, node80, 15, 14);
        com.google.javascript.rhino.ErrorReporter errorReporter84 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry86 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter84, false);
        com.google.javascript.rhino.Node node88 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType89 = jSTypeRegistry86.createInterfaceType("{proxy:{proxy:{233769208}}}", node88);
        com.google.javascript.rhino.jstype.EnumType enumType90 = jSTypeRegistry2.createEnumType("(function (): {proxy:{685828741}})", node83, (com.google.javascript.rhino.jstype.JSType) functionType89);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType19 and parameterizedType52.", jSType19.equals(parameterizedType52) == parameterizedType52.equals(jSType19));
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test343");
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
        jSTypeRegistry2.clearTemplateTypeNames();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType36 and parameterizedType84.", jSType36.equals(parameterizedType84) == parameterizedType84.equals(jSType36));
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test344");
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
        com.google.javascript.rhino.jstype.JSType jSType38 = jSType36.findPropertyType("function (): {proxy:{1071469504}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and jSType36.", jSType16.equals(jSType36) == jSType36.equals(jSType16));
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test345");
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
        boolean boolean84 = objectType83.isFunctionPrototypeType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and objectType83.", jSType16.equals(objectType83) == objectType83.equals(jSType16));
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test346");
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
        com.google.javascript.rhino.jstype.ObjectType.Property property65 = parameterizedType61.getSlot("{proxy:{proxy:{670672264}}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test347");
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
        com.google.javascript.rhino.jstype.ObjectType.Property property57 = parameterizedType30.getSlot("{proxy:{proxy:{51735728}}}");
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType58 = parameterizedType30.toMaybeParameterizedType();
        com.google.javascript.rhino.jstype.ObjectType.Property property60 = parameterizedType30.getOwnSlot("{proxy:{2114306987}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test348");
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
        com.google.javascript.rhino.jstype.ObjectType objectType32 = parameterizedType30.dereference();
        com.google.javascript.rhino.jstype.ObjectType objectType33 = parameterizedType30.getTypeOfThis();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test349");
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
        com.google.javascript.rhino.jstype.EnumType enumType39 = parameterizedType30.toMaybeEnumType();
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41, true);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType45 = null;
        boolean boolean46 = jSTypeRegistry43.resetImplicitPrototype(jSType44, objectType45);
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47, true);
        com.google.javascript.rhino.jstype.JSType jSType50 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType51 = null;
        boolean boolean52 = jSTypeRegistry49.resetImplicitPrototype(jSType50, objectType51);
        com.google.javascript.rhino.jstype.JSType jSType57 = jSTypeRegistry49.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType58 = jSType57.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        com.google.javascript.rhino.jstype.JSType jSType62 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType63 = null;
        boolean boolean64 = jSTypeRegistry61.resetImplicitPrototype(jSType62, objectType63);
        com.google.javascript.rhino.jstype.JSType jSType69 = jSTypeRegistry61.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType70 = jSType69.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType71 = jSTypeRegistry43.createParameterizedType(objectType58, jSType69);
        java.util.Set set72 = parameterizedType71.getOwnPropertyNames();
        boolean boolean73 = parameterizedType71.hasReferenceName();
        boolean boolean74 = parameterizedType71.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.JSType jSType76 = parameterizedType71.findPropertyType("");
        java.lang.String str77 = parameterizedType71.getReferenceName();
        com.google.javascript.rhino.jstype.TemplateType templateType78 = parameterizedType71.toMaybeTemplateType();
        com.google.javascript.rhino.jstype.UnionType unionType79 = parameterizedType71.toMaybeUnionType();
        boolean boolean80 = parameterizedType71.isNoObjectType();
        com.google.javascript.rhino.Node node83 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList84 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node83);
        boolean boolean85 = node83.isFalse();
        boolean boolean86 = node83.isName();
        boolean boolean87 = parameterizedType30.defineSynthesizedProperty("true", (com.google.javascript.rhino.jstype.JSType) parameterizedType71, node83);
        boolean boolean88 = parameterizedType30.isObject();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType71.", jSType16.equals(parameterizedType71) == parameterizedType71.equals(jSType16));
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test350");
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
        boolean boolean42 = parameterizedType30.isPropertyTypeDeclared("{proxy:{proxy:{1943266088}}}");
        int int43 = parameterizedType30.getPropertiesCount();
        int int44 = parameterizedType30.getPropertiesCount();
        com.google.javascript.rhino.JSDocInfo jSDocInfo46 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean47 = jSDocInfo46.isInterface();
        java.lang.String str48 = jSDocInfo46.getOriginalCommentString();
        boolean boolean49 = jSDocInfo46.isImplicitCast();
        boolean boolean50 = jSDocInfo46.isOverride();
        java.lang.String str51 = jSDocInfo46.getVersion();
        boolean boolean52 = jSDocInfo46.isConstant();
        boolean boolean53 = jSDocInfo46.isIdGenerator();
        boolean boolean54 = jSDocInfo46.isDeprecated();
        parameterizedType30.setPropertyJSDocInfo("{proxy:{proxy:{1473195276}}}", jSDocInfo46);
        java.lang.String str56 = jSDocInfo46.getFileOverview();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test351");
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
        boolean boolean82 = parameterizedType81.isNoType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType81.", jSType16.equals(parameterizedType81) == parameterizedType81.equals(jSType16));
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test352");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(10.0d, (int) (byte) 1, 43);
        boolean boolean4 = node3.isBreak();
        node3.setType(4095);
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
        com.google.javascript.rhino.jstype.JSType jSType41 = parameterizedType38.getIndexType();
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, true);
        com.google.javascript.rhino.jstype.JSType jSType45 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        boolean boolean47 = jSTypeRegistry44.resetImplicitPrototype(jSType45, objectType46);
        com.google.javascript.rhino.jstype.JSType jSType52 = jSTypeRegistry44.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType53 = jSType52.dereference();
        boolean boolean54 = objectType53.isRegexpType();
        boolean boolean56 = objectType53.isPropertyTypeInferred("hi!");
        boolean boolean57 = parameterizedType38.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) objectType53);
        node3.putProp(100, (java.lang.Object) objectType53);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType24 and parameterizedType38.", jSType24.equals(parameterizedType38) == parameterizedType38.equals(jSType24));
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test353");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((int) ' ');
        boolean boolean2 = node1.isFor();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean10 = node9.isFalse();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean14 = node13.isTrue();
        boolean boolean15 = node13.hasOneChild();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean19 = node18.isTrue();
        boolean boolean20 = node18.isBreak();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (byte) 1, node6, node9, node13, node18, (int) (byte) 1, 4095);
        boolean boolean24 = node23.isGetProp();
        node23.setSourceEncodedPosition((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node27 = node1.getChildBefore(node23);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test354");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        jSTypeRegistry2.resetForTypeCheck();
        jSTypeRegistry2.forwardDeclareType("hi!");
        boolean boolean11 = jSTypeRegistry2.hasNamespace("function (): {proxy:{1262905525}}");
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
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType42.getImplicitPrototype();
        com.google.javascript.rhino.jstype.ObjectType objectType52 = jSTypeRegistry2.createObjectType((com.google.javascript.rhino.jstype.ObjectType) parameterizedType42);
        boolean boolean53 = objectType52.isEnumElementType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType28 and parameterizedType42.", jSType28.equals(parameterizedType42) == parameterizedType42.equals(jSType28));
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test355");
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
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType40 = parameterizedType35.toMaybeParameterizedType();
        com.google.javascript.rhino.jstype.TemplateType templateType41 = parameterizedType40.toMaybeTemplateType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType21 and parameterizedType40.", jSType21.equals(parameterizedType40) == parameterizedType40.equals(jSType21));
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test356");
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
        boolean boolean83 = parameterizedType52.hasAnyTemplateInternal();
        java.lang.Iterable iterable84 = parameterizedType52.getCtorImplementedInterfaces();
        java.util.Spliterator<com.google.javascript.rhino.Node> nodeSpliterator85 = iterable84.spliterator();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType52.", jSType16.equals(parameterizedType52) == parameterizedType52.equals(jSType16));
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test357");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2, true);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        boolean boolean7 = jSTypeRegistry4.resetImplicitPrototype(jSType5, objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        boolean boolean13 = jSTypeRegistry10.resetImplicitPrototype(jSType11, objectType12);
        com.google.javascript.rhino.jstype.JSType jSType18 = jSTypeRegistry10.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = jSType18.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20, true);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        boolean boolean25 = jSTypeRegistry22.resetImplicitPrototype(jSType23, objectType24);
        com.google.javascript.rhino.jstype.JSType jSType30 = jSTypeRegistry22.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = jSType30.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType32 = jSTypeRegistry4.createParameterizedType(objectType19, jSType30);
        java.util.Set set33 = parameterizedType32.getOwnPropertyNames();
        boolean boolean34 = parameterizedType32.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType35 = parameterizedType32.getIndexType();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType40 = null;
        boolean boolean41 = jSTypeRegistry38.resetImplicitPrototype(jSType39, objectType40);
        com.google.javascript.rhino.jstype.JSType jSType46 = jSTypeRegistry38.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSType46.dereference();
        boolean boolean48 = objectType47.isRegexpType();
        boolean boolean50 = objectType47.isPropertyTypeInferred("hi!");
        boolean boolean51 = parameterizedType32.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) objectType47);
        java.lang.String str52 = parameterizedType32.toDebugHashCodeString();
        com.google.javascript.rhino.Node node53 = parameterizedType32.getRootNode();
        com.google.javascript.rhino.JSDocInfo jSDocInfo54 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean55 = jSDocInfo54.isInterface();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection56 = jSDocInfo54.getMarkers();
        parameterizedType32.setJSDocInfo(jSDocInfo54);
        boolean boolean58 = parameterizedType32.isCheckedUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType59 = jSTypeRegistry1.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) parameterizedType32);
        jSTypeRegistry1.clearTemplateTypeNames();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType18 and parameterizedType32.", jSType18.equals(parameterizedType32) == parameterizedType32.equals(jSType18));
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test358");
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
        com.google.javascript.rhino.jstype.JSType jSType39 = parameterizedType30.findPropertyType("{proxy:{proxy:{1112346298}}}");
        com.google.javascript.rhino.jstype.JSType jSType40 = jSType39.collapseUnion();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test359");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        boolean boolean4 = cloneableList3.isEmpty();
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable36 = parameterizedType35.getCtorExtendedInterfaces();
        boolean boolean37 = parameterizedType35.isNominalType();
        boolean boolean38 = parameterizedType35.isAllType();
        boolean boolean39 = parameterizedType35.matchesNumberContext();
        boolean boolean40 = parameterizedType35.isNullable();
        java.lang.Iterable iterable41 = parameterizedType35.getCtorImplementedInterfaces();
        boolean boolean42 = parameterizedType35.isBooleanValueType();
        boolean boolean43 = cloneableList3.equals((java.lang.Object) boolean42);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType21 and parameterizedType35.", jSType21.equals(parameterizedType35) == parameterizedType35.equals(jSType21));
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test360");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo70 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean71 = jSDocInfo70.isInterface();
        java.util.Collection<java.lang.String> strCollection72 = jSDocInfo70.getReferences();
        java.lang.String str73 = jSDocInfo70.getOriginalCommentString();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList74 = jSDocInfo70.getThrownTypes();
        parameterizedType30.setPropertyJSDocInfo("{proxy:{proxy:{1727383615}}}", jSDocInfo70);
        java.lang.String str76 = jSDocInfo70.toString();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test361");
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
        boolean boolean94 = parameterizedType30.hasOwnProperty("");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType65.", jSType16.equals(parameterizedType65) == parameterizedType65.equals(jSType16));
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test362");
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
        java.lang.String str95 = parameterizedType84.getNormalizedReferenceName();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test363");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        boolean boolean4 = node2.isString();
        node2.setSourceFileForTesting("hi!");
        boolean boolean7 = node2.isLocalResultCall();
        node2.setType(2147483647);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean17 = node16.isFalse();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean21 = node20.isTrue();
        boolean boolean22 = node20.hasOneChild();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean26 = node25.isTrue();
        boolean boolean27 = node25.isBreak();
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (byte) 1, node13, node16, node20, node25, (int) (byte) 1, 4095);
        boolean boolean31 = node16.isParamList();
        boolean boolean32 = node16.isSyntheticBlock();
        boolean boolean33 = node16.isLabelName();
        boolean boolean34 = node2.isEquivalentTo(node16);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean42 = node41.isFalse();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean46 = node45.isTrue();
        boolean boolean47 = node45.hasOneChild();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean51 = node50.isTrue();
        boolean boolean52 = node50.isBreak();
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((int) (byte) 1, node38, node41, node45, node50, (int) (byte) 1, 4095);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable56 = node55.children();
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean64 = node63.isFalse();
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean68 = node67.isTrue();
        boolean boolean69 = node67.hasOneChild();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean73 = node72.isTrue();
        boolean boolean74 = node72.isBreak();
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node((int) (byte) 1, node60, node63, node67, node72, (int) (byte) 1, 4095);
        com.google.javascript.rhino.Node node78 = node55.useSourceInfoIfMissingFromForTree(node72);
        boolean boolean79 = node55.isThrow();
        boolean boolean80 = node55.isAssignAdd();
        com.google.javascript.rhino.Node node81 = node55.getLastSibling();
        com.google.javascript.rhino.Node node82 = node16.srcrefTree(node55);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node84 = node55.getChildAtIndex((int) '#');
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test364");
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
        com.google.javascript.rhino.jstype.ObjectType objectType32 = parameterizedType30.dereference();
        boolean boolean33 = parameterizedType30.isOrdinaryFunction();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test365");
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
        boolean boolean71 = parameterizedType69.isFunctionPrototypeType();
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.ObjectType> objectTypeBuilder72 = com.google.common.collect.ImmutableList.builder();
        com.google.javascript.rhino.ErrorReporter errorReporter73 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry75 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter73, true);
        com.google.javascript.rhino.jstype.JSType jSType76 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType77 = null;
        boolean boolean78 = jSTypeRegistry75.resetImplicitPrototype(jSType76, objectType77);
        com.google.javascript.rhino.jstype.JSType jSType83 = jSTypeRegistry75.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType84 = jSType83.dereference();
        boolean boolean85 = objectType84.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable86 = objectType84.getCtorImplementedInterfaces();
        boolean boolean87 = objectType84.isNativeObjectType();
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.ObjectType> objectTypeBuilder88 = objectTypeBuilder72.add(objectType84);
        boolean boolean89 = objectType84.isUnknownType();
        boolean boolean90 = objectType84.isInterface();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue91 = parameterizedType69.testForEquality((com.google.javascript.rhino.jstype.JSType) objectType84);
        java.lang.String str92 = ternaryValue91.toString();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType10 and parameterizedType69.", jSType10.equals(parameterizedType69) == parameterizedType69.equals(jSType10));
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test366");
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
        boolean boolean56 = parameterizedType30.isNominalType();
        boolean boolean57 = parameterizedType30.isConstructor();
        com.google.javascript.rhino.jstype.JSType jSType59 = parameterizedType30.getPropertyType("{proxy:{proxy:{376814457}}}");
        boolean boolean60 = jSType59.matchesNumberContext();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test367");
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
        java.lang.String str70 = parameterizedType66.toDebugHashCodeString();
        boolean boolean71 = parameterizedType66.isInterface();
        com.google.javascript.rhino.jstype.ObjectType objectType72 = parameterizedType66.getTypeOfThis();
        boolean boolean73 = parameterizedType66.isNoObjectType();
        boolean boolean74 = parameterizedType66.matchesNumberContext();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue75 = parameterizedType30.testForEquality((com.google.javascript.rhino.jstype.JSType) parameterizedType66);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable76 = parameterizedType30.getCtorImplementedInterfaces();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType66.", jSType16.equals(parameterizedType66) == parameterizedType66.equals(jSType16));
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test368");
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
        com.google.javascript.rhino.jstype.ObjectType objectType77 = parameterizedType38.getImplicitPrototype();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType24 and parameterizedType38.", jSType24.equals(parameterizedType38) == parameterizedType38.equals(jSType24));
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test369");
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
        boolean boolean94 = functionType93.matchesStringContext();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType21 and parameterizedType35.", jSType21.equals(parameterizedType35) == parameterizedType35.equals(jSType21));
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test370");
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
        boolean boolean43 = parameterizedType35.isOrdinaryFunction();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType21 and parameterizedType35.", jSType21.equals(parameterizedType35) == parameterizedType35.equals(jSType21));
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test371");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean3 = node2.isTrue();
        boolean boolean4 = node2.isOr();
        com.google.javascript.rhino.Node[] nodeArray9 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(52, nodeArray9, 49, 38);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(53, nodeArray9);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(1, nodeArray9);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (short) 100, nodeArray9, (int) (byte) 1, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node18 = node2.getChildBefore(node17);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test372");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        jSTypeRegistry2.resetForTypeCheck();
        jSTypeRegistry2.forwardDeclareType("hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10, true);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        boolean boolean15 = jSTypeRegistry12.resetImplicitPrototype(jSType13, objectType14);
        com.google.javascript.rhino.jstype.JSType jSType20 = jSTypeRegistry12.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = jSType20.dereference();
        java.lang.String str22 = objectType21.getDisplayName();
        com.google.javascript.rhino.jstype.JSType jSType23 = jSTypeRegistry2.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) objectType21);
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
        boolean boolean56 = parameterizedType54.hasReferenceName();
        boolean boolean57 = parameterizedType54.hasAnyTemplateInternal();
        boolean boolean58 = parameterizedType54.isInstanceType();
        boolean boolean59 = parameterizedType54.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType61 = parameterizedType54.findPropertyType("{proxy:{proxy:{1317500836}}}");
        boolean boolean62 = parameterizedType54.isInstanceType();
        com.google.javascript.rhino.jstype.JSType jSType67 = jSTypeRegistry2.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) parameterizedType54, "{proxy:{proxy:{1282305139}}}", "function (): {proxy:{1262905525}}", 36, 38);
        jSTypeRegistry2.setLastGeneration(true);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType20 and parameterizedType54.", jSType20.equals(parameterizedType54) == parameterizedType54.equals(jSType20));
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test373");
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
        boolean boolean33 = parameterizedType30.isParameterizedType();
        com.google.javascript.rhino.jstype.JSType jSType35 = parameterizedType30.findPropertyType("{proxy:{proxy:{1897950347}}}");
        boolean boolean36 = jSType35.matchesStringContext();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test374");
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
        com.google.javascript.rhino.jstype.ObjectType objectType32 = parameterizedType30.dereference();
        boolean boolean33 = parameterizedType30.isNominalConstructor();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test375");
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
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression17 = new com.google.javascript.rhino.JSTypeExpression(node15, "{proxy:{proxy:{1218052024}}}");
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24, true);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType28 = null;
        boolean boolean29 = jSTypeRegistry26.resetImplicitPrototype(jSType27, objectType28);
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry26.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSType34.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType40 = null;
        boolean boolean41 = jSTypeRegistry38.resetImplicitPrototype(jSType39, objectType40);
        com.google.javascript.rhino.jstype.JSType jSType46 = jSTypeRegistry38.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSType46.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry20.createParameterizedType(objectType35, jSType46);
        java.util.Set set49 = parameterizedType48.getOwnPropertyNames();
        boolean boolean50 = parameterizedType48.hasReferenceName();
        boolean boolean51 = parameterizedType48.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.JSType jSType53 = parameterizedType48.findPropertyType("");
        java.lang.String str54 = parameterizedType48.getReferenceName();
        com.google.javascript.rhino.jstype.TemplateType templateType55 = parameterizedType48.toMaybeTemplateType();
        boolean boolean56 = jSTypeExpression17.equals((java.lang.Object) templateType55);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType34 and parameterizedType48.", jSType34.equals(parameterizedType48) == parameterizedType48.equals(jSType34));
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test376");
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
        boolean boolean56 = parameterizedType30.isNominalType();
        com.google.javascript.rhino.jstype.JSType jSType57 = parameterizedType30.collapseUnion();
        boolean boolean58 = parameterizedType30.isInterface();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test377");
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
        com.google.javascript.rhino.jstype.JSType jSType52 = parameterizedType30.unboxesTo();
        boolean boolean54 = parameterizedType30.removeProperty("Named type with empty name component");
        com.google.javascript.rhino.jstype.JSType jSType55 = parameterizedType30.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot57 = parameterizedType30.getSlot("function (): {proxy:{1804213098}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test378");
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
        boolean boolean38 = parameterizedType30.isInstanceType();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList42 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node41);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList43 = cloneableList42.asList();
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44, true);
        com.google.javascript.rhino.jstype.JSType jSType47 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType48 = null;
        boolean boolean49 = jSTypeRegistry46.resetImplicitPrototype(jSType47, objectType48);
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50, true);
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType54 = null;
        boolean boolean55 = jSTypeRegistry52.resetImplicitPrototype(jSType53, objectType54);
        com.google.javascript.rhino.jstype.JSType jSType60 = jSTypeRegistry52.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType61 = jSType60.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter62 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter62, true);
        com.google.javascript.rhino.jstype.JSType jSType65 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType66 = null;
        boolean boolean67 = jSTypeRegistry64.resetImplicitPrototype(jSType65, objectType66);
        com.google.javascript.rhino.jstype.JSType jSType72 = jSTypeRegistry64.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType73 = jSType72.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType74 = jSTypeRegistry46.createParameterizedType(objectType61, jSType72);
        java.util.Set set75 = parameterizedType74.getOwnPropertyNames();
        boolean boolean76 = parameterizedType74.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType77 = parameterizedType74.getIndexType();
        boolean boolean78 = cloneableList43.equals((java.lang.Object) parameterizedType74);
        com.google.javascript.rhino.Node node80 = parameterizedType74.getPropertyNode("function (): {proxy:{1288677244}}");
        boolean boolean81 = parameterizedType74.isOrdinaryFunction();
        boolean boolean83 = parameterizedType74.isPropertyInExterns("function (): {proxy:{1975023194}}");
        com.google.javascript.rhino.jstype.FunctionType functionType84 = parameterizedType74.getConstructor();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue85 = parameterizedType30.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType84);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType74.", jSType16.equals(parameterizedType74) == parameterizedType74.equals(jSType16));
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test379");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber(10.0d, (int) (byte) 1, 43);
        boolean boolean5 = node4.isBreak();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable6 = node4.siblings();
        int int7 = node4.getSourcePosition();
        node4.setWasEmptyNode(false);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(53, node4, 100, 29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node14 = node12.getChildAtIndex(16);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test380");
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
        com.google.javascript.rhino.jstype.JSType jSType34 = parameterizedType30.autobox();
        com.google.javascript.rhino.jstype.JSType jSType36 = parameterizedType30.getPropertyType("function (): {proxy:{1024660089}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test381");
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
        com.google.javascript.rhino.jstype.JSType jSType96 = parameterizedType77.getIndexType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test382");
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
        boolean boolean42 = parameterizedType35.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType43 = parameterizedType35.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType44 = parameterizedType35.getConstructor();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType21 and parameterizedType35.", jSType21.equals(parameterizedType35) == parameterizedType35.equals(jSType21));
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test383");
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
        boolean boolean41 = parameterizedType30.isNoObjectType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test384");
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
        boolean boolean38 = parameterizedType30.matchesObjectContext();
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
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType58 = null;
        boolean boolean59 = jSTypeRegistry56.resetImplicitPrototype(jSType57, objectType58);
        com.google.javascript.rhino.jstype.JSType jSType64 = jSTypeRegistry56.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType65 = jSType64.dereference();
        boolean boolean66 = objectType65.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable67 = objectType65.getCtorImplementedInterfaces();
        boolean boolean68 = objectType65.isNativeObjectType();
        boolean boolean69 = objectType50.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType65);
        boolean boolean71 = objectType50.hasProperty("hi!");
        com.google.javascript.rhino.jstype.JSType jSType72 = objectType50.autobox();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope73 = objectType50.getParentScope();
        com.google.javascript.rhino.jstype.FunctionType functionType74 = objectType50.getOwnerFunction();
        boolean boolean75 = objectType50.isObject();
        com.google.javascript.rhino.jstype.ObjectType objectType76 = objectType50.dereference();
        objectType76.clearResolved();
        boolean boolean78 = objectType76.isUnionType();
        boolean boolean79 = parameterizedType30.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) objectType76);
        java.lang.String str80 = objectType76.toAnnotationString();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test385");
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
        int int68 = parameterizedType30.getPropertiesCount();
        com.google.javascript.rhino.JSDocInfo jSDocInfo70 = parameterizedType30.getOwnPropertyJSDocInfo("({proxy:{proxy:{1321644185}}})");
        com.google.javascript.rhino.jstype.JSType jSType72 = parameterizedType30.findPropertyType("({proxy:{proxy:{1321644185}}})");
        boolean boolean73 = parameterizedType30.isNullable();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType74 = parameterizedType30.toMaybeParameterizedType();
        boolean boolean76 = parameterizedType30.hasProperty("{proxy:{proxy:{1136754992}}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test386");
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
        java.lang.String str95 = parameterizedType84.toDebugHashCodeString();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test387");
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
        com.google.javascript.rhino.jstype.JSType jSType57 = parameterizedType30.getParameterType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo58 = jSType57.getJSDocInfo();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test388");
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
        boolean boolean75 = functionType74.isTemplateType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType24 and parameterizedType38.", jSType24.equals(parameterizedType38) == parameterizedType38.equals(jSType24));
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test389");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition1 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int2 = namePosition1.getStartLine();
        int int3 = namePosition1.getStartLine();
        int int4 = namePosition1.getEndLine();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean8 = node7.isTrue();
        namePosition1.setItem(node7);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(2147483647, node7);
        boolean boolean11 = node10.isRegExp();
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
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, true);
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType50 = null;
        boolean boolean51 = jSTypeRegistry48.resetImplicitPrototype(jSType49, objectType50);
        com.google.javascript.rhino.jstype.JSType jSType56 = jSTypeRegistry48.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType57 = jSType56.dereference();
        boolean boolean58 = objectType57.isRegexpType();
        boolean boolean60 = objectType57.isPropertyTypeInferred("hi!");
        boolean boolean61 = parameterizedType42.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) objectType57);
        java.lang.String str62 = parameterizedType42.toDebugHashCodeString();
        boolean boolean64 = parameterizedType42.hasOwnProperty("");
        java.lang.String str65 = parameterizedType42.getNormalizedReferenceName();
        node10.setJSType((com.google.javascript.rhino.jstype.JSType) parameterizedType42);
        boolean boolean67 = node10.isVar();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType28 and parameterizedType42.", jSType28.equals(parameterizedType42) == parameterizedType42.equals(jSType28));
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test390");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo84 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean85 = jSDocInfo84.isInterface();
        boolean boolean86 = jSDocInfo84.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression87 = jSDocInfo84.getEnumParameterType();
        boolean boolean88 = jSDocInfo84.containsDeclaration();
        java.lang.String str89 = jSDocInfo84.getDescription();
        java.lang.String str90 = jSDocInfo84.getFileOverview();
        boolean boolean91 = jSDocInfo84.isNoAlias();
        parameterizedType52.setPropertyJSDocInfo("{proxy:{proxy:{283733277}}}", jSDocInfo84);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType52.", jSType16.equals(parameterizedType52) == parameterizedType52.equals(jSType16));
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test391");
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
        com.google.javascript.rhino.jstype.UnionType unionType79 = parameterizedType52.toMaybeUnionType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo80 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean81 = jSDocInfo80.isInterface();
        java.lang.String str82 = jSDocInfo80.getOriginalCommentString();
        boolean boolean83 = jSDocInfo80.hasEnumParameterType();
        boolean boolean84 = jSDocInfo80.hasModifies();
        boolean boolean85 = jSDocInfo80.isDefine();
        java.lang.String str86 = jSDocInfo80.getSourceName();
        boolean boolean87 = jSDocInfo80.isConsistentIdGenerator();
        parameterizedType52.setJSDocInfo(jSDocInfo80);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression89 = jSDocInfo80.getReturnType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType52.", jSType16.equals(parameterizedType52) == parameterizedType52.equals(jSType16));
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test392");
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
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative42 = null;
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray43 = new com.google.javascript.rhino.jstype.JSTypeNative[] { jSTypeNative42 };
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44, true);
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry46.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray48 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType49 = jSTypeRegistry46.createUnionType(jSTypeNativeArray48);
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50, true);
        com.google.javascript.rhino.jstype.ObjectType objectType53 = jSTypeRegistry52.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray54 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType55 = jSTypeRegistry52.createUnionType(jSTypeNativeArray54);
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeNative[]> jSTypeNativeArrayList56 = com.google.common.collect.ImmutableList.of(jSTypeNativeArray43, jSTypeNativeArray48, jSTypeNativeArray54);
        com.google.javascript.rhino.jstype.JSType jSType57 = jSTypeRegistry2.createUnionType(jSTypeNativeArray48);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType24 and parameterizedType38.", jSType24.equals(parameterizedType38) == parameterizedType38.equals(jSType24));
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test393");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo70 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean71 = jSDocInfo70.isInterface();
        boolean boolean72 = jSDocInfo70.hasType();
        boolean boolean73 = jSDocInfo70.containsDeclaration();
        boolean boolean74 = jSDocInfo70.isInterface();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression75 = jSDocInfo70.getBaseType();
        java.lang.String str76 = jSDocInfo70.getDescription();
        parameterizedType30.setPropertyJSDocInfo("{proxy:{proxy:{1763454178}}}", jSDocInfo70);
        java.lang.String str78 = jSDocInfo70.getVersion();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test394");
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
        com.google.javascript.rhino.jstype.JSType jSType54 = parameterizedType30.getParameterType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test395");
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
        com.google.javascript.rhino.Node node41 = parameterizedType30.getPropertyNode("{proxy:{proxy:{1920657899}}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test396");
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
        boolean boolean70 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType18 and parameterizedType55.", jSType18.equals(parameterizedType55) == parameterizedType55.equals(jSType18));
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test397");
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
        com.google.javascript.rhino.jstype.ObjectType objectType32 = parameterizedType30.dereference();
        boolean boolean34 = parameterizedType30.removeProperty("function (): {proxy:{2000537501}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test398");
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
        boolean boolean68 = parameterizedType66.hasReferenceName();
        boolean boolean69 = parameterizedType66.hasAnyTemplateInternal();
        boolean boolean70 = parameterizedType66.isOrdinaryFunction();
        parameterizedType30.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) parameterizedType66);
        boolean boolean72 = parameterizedType66.isRecordType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test399");
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
        com.google.javascript.rhino.jstype.ObjectType.Property property57 = parameterizedType30.getSlot("{proxy:{proxy:{51735728}}}");
        com.google.javascript.rhino.jstype.ObjectType objectType58 = parameterizedType30.getImplicitPrototype();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType59 = parameterizedType30.toMaybeParameterizedType();
        com.google.javascript.rhino.jstype.JSType jSType61 = parameterizedType59.getPropertyType("{proxy:{proxy:{1363288493}}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType59.", jSType16.equals(parameterizedType59) == parameterizedType59.equals(jSType16));
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test400");
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
        boolean boolean21 = node3.isDelProp();
        boolean boolean22 = node3.isThis();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node3.siblings();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList27 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node26);
        boolean boolean28 = node26.isFalse();
        boolean boolean29 = node26.isScript();
        node26.setType((int) (short) -1);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean35 = node34.isTrue();
        boolean boolean36 = node34.isBreak();
        boolean boolean37 = node34.isNot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.replaceChild(node26, node34);
    }
}


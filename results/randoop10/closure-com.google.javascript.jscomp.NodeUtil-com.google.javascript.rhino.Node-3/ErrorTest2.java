import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest2 {

    public static boolean debug = false;

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test401");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((int) (byte) 100);
        java.util.Set<java.lang.String> strSet2 = node1.getDirectives();
        boolean boolean3 = node1.isVar();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean8 = node7.isTrue();
        boolean boolean9 = node7.hasOneChild();
        boolean boolean10 = node7.isVarArgs();
        int int11 = node7.getType();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString((int) (byte) -1, "hi!");
        com.google.javascript.rhino.Node node18 = node14.useSourceInfoFromForTree(node17);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) '#', node7, node14, (int) (byte) 100, (int) (short) 10);
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = node14.getJSDocInfo();
        boolean boolean23 = node14.isSwitch();
        boolean boolean24 = node14.isNumber();
        int int25 = node1.getIndexOfChild(node14);
        node14.setLineno(15);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean35 = node34.isFalse();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean39 = node38.isTrue();
        boolean boolean40 = node38.hasOneChild();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean44 = node43.isTrue();
        boolean boolean45 = node43.isBreak();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node((int) (byte) 1, node31, node34, node38, node43, (int) (byte) 1, 4095);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable49 = node48.children();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean57 = node56.isFalse();
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean61 = node60.isTrue();
        boolean boolean62 = node60.hasOneChild();
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean66 = node65.isTrue();
        boolean boolean67 = node65.isBreak();
        com.google.javascript.rhino.Node node70 = new com.google.javascript.rhino.Node((int) (byte) 1, node53, node56, node60, node65, (int) (byte) 1, 4095);
        com.google.javascript.rhino.Node node71 = node48.useSourceInfoIfMissingFromForTree(node65);
        int int72 = node65.getSourcePosition();
        boolean boolean73 = node65.isVarArgs();
        int int74 = node65.getSourcePosition();
        com.google.javascript.rhino.Node node75 = node65.removeChildren();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node14.removeChild(node65);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test402");
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
        java.lang.String str74 = parameterizedType70.toDebugHashCodeString();
        boolean boolean75 = parameterizedType70.isInterface();
        com.google.javascript.rhino.jstype.ObjectType objectType76 = parameterizedType70.getTypeOfThis();
        boolean boolean77 = parameterizedType70.isNoObjectType();
        boolean boolean79 = jSTypeRegistry2.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) parameterizedType70, "function (): {proxy:{1288677244}}");
        jSTypeRegistry2.clearNamedTypes();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType36 and parameterizedType70.", jSType36.equals(parameterizedType70) == parameterizedType70.equals(jSType36));
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test403");
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
        boolean boolean77 = parameterizedType38.isNoObjectType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType24 and parameterizedType38.", jSType24.equals(parameterizedType38) == parameterizedType38.equals(jSType24));
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test404");
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
        boolean boolean41 = parameterizedType40.isCheckedUnknownType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType21 and parameterizedType40.", jSType21.equals(parameterizedType40) == parameterizedType40.equals(jSType21));
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test405");
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
        com.google.javascript.rhino.jstype.JSType jSType44 = parameterizedType30.collapseUnion();
        boolean boolean45 = parameterizedType30.hasAnyTemplateInternal();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test406");
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
        com.google.javascript.rhino.jstype.ObjectType objectType86 = parameterizedType66.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair87 = jSType35.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType) parameterizedType66);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test407");
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
        boolean boolean50 = objectType49.isNominalConstructor();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and objectType49.", jSType16.equals(objectType49) == objectType49.equals(jSType16));
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test408");
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
        boolean boolean45 = objectType44.isUnknownType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and objectType44.", jSType16.equals(objectType44) == objectType44.equals(jSType16));
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test409");
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
        node2.setString("function (): {proxy:{1294170139}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType32 and parameterizedType68.", jSType32.equals(parameterizedType68) == parameterizedType68.equals(jSType32));
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test410");
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
        boolean boolean76 = objectType74.removeProperty("");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType11 and objectType74.", jSType11.equals(objectType74) == objectType74.equals(jSType11));
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test411");
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
        com.google.javascript.rhino.jstype.ObjectType objectType53 = parameterizedType30.toObjectType();
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        boolean boolean55 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) parameterizedType30, jSType54);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test412");
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
        com.google.javascript.rhino.jstype.JSType jSType41 = parameterizedType40.getIndexType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType40.", jSType16.equals(parameterizedType40) == parameterizedType40.equals(jSType16));
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test413");
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
        com.google.javascript.rhino.jstype.JSType jSType60 = jSType59.restrictByNotNullOrUndefined();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test414");
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
        boolean boolean51 = parameterizedType30.isPropertyInExterns("function (): {proxy:{1240268079}}");
        com.google.javascript.rhino.jstype.JSType jSType52 = parameterizedType30.autobox();
        com.google.javascript.rhino.JSDocInfo jSDocInfo54 = parameterizedType30.getOwnPropertyJSDocInfo("function (): {proxy:{114435359}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test415");
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
        boolean boolean36 = parameterizedType30.isPropertyInExterns("STRING ");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test416");
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
        com.google.javascript.rhino.jstype.JSType jSType39 = parameterizedType30.getPropertyType("PARAM_LIST\n");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test417");
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
        node6.setOptionalArg(false);
        com.google.javascript.rhino.InputId inputId25 = com.google.javascript.jscomp.NodeUtil.getInputId(node6);
        com.google.javascript.rhino.Node node26 = node6.getLastSibling();
        boolean boolean27 = node6.isDebugger();
        boolean boolean28 = node6.isGetElem();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList32 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node31);
        boolean boolean33 = cloneableList32.isEmpty();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition34 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int35 = namePosition34.getStartLine();
        int int36 = namePosition34.getStartLine();
        int int37 = cloneableList32.lastIndexOf((java.lang.Object) namePosition34);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean41 = node40.isFalse();
        namePosition34.setItem(node40);
        boolean boolean43 = node40.hasChildren();
        boolean boolean44 = node40.isAnd();
        node40.setOptionalArg(false);
        boolean boolean47 = node40.isTypeOf();
        boolean boolean48 = node40.isAssignAdd();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node6.removeChild(node40);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test418");
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
        boolean boolean56 = jSDocInfo46.hasFileOverview();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test419");
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
        boolean boolean39 = jSDocInfo35.isIdGenerator();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test420");
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
        boolean boolean74 = parameterizedType42.isNominalType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType10 and parameterizedType42.", jSType10.equals(parameterizedType42) == parameterizedType42.equals(jSType10));
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test421");
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
        com.google.javascript.rhino.jstype.ObjectType.Property property84 = parameterizedType68.getOwnSlot("function (): {proxy:{518769796}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test422");
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
        boolean boolean91 = parameterizedType30.isNullType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType87.", jSType16.equals(parameterizedType87) == parameterizedType87.equals(jSType16));
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test423");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo95 = parameterizedType84.getJSDocInfo();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test424");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.jstype.JSType jSType10 = jSTypeRegistry2.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = jSType10.dereference();
        java.lang.String str12 = objectType11.getDisplayName();
        com.google.javascript.rhino.jstype.FunctionType functionType13 = objectType11.getConstructor();
        boolean boolean14 = objectType11.hasReferenceName();
        boolean boolean15 = objectType11.isObject();
        com.google.javascript.rhino.jstype.JSType jSType17 = objectType11.getPropertyType("{proxy:{proxy:{1835926569}}}");
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
        com.google.javascript.rhino.jstype.UnionType unionType55 = parameterizedType48.toMaybeUnionType();
        boolean boolean57 = parameterizedType48.hasOwnProperty("function (): {proxy:{1262905525}}");
        com.google.javascript.rhino.JSDocInfo jSDocInfo58 = parameterizedType48.getJSDocInfo();
        com.google.javascript.rhino.jstype.JSType jSType60 = parameterizedType48.findPropertyType("{proxy:{proxy:{1317500836}}}");
        boolean boolean62 = parameterizedType48.isPropertyTypeInferred("InputId: function (): {proxy:{410214344}}");
        boolean boolean64 = parameterizedType48.isPropertyTypeDeclared("{proxy:{proxy:{1603363525}}}");
        com.google.javascript.rhino.jstype.FunctionType functionType65 = parameterizedType48.getOwnerFunction();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair66 = jSType17.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) functionType65);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType10 and parameterizedType48.", jSType10.equals(parameterizedType48) == parameterizedType48.equals(jSType10));
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test425");
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
        java.lang.Iterable iterable44 = parameterizedType30.getCtorImplementedInterfaces();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test426");
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
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType53 = parameterizedType30.toMaybeParameterizedType();
        com.google.javascript.rhino.jstype.ObjectType objectType54 = parameterizedType53.toObjectType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and objectType54.", jSType16.equals(objectType54) == objectType54.equals(jSType16));
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test427");
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
        com.google.javascript.rhino.jstype.FunctionType functionType36 = parameterizedType30.getConstructor();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test428");
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
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet89 = parameterizedType52.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.JSType jSType91 = parameterizedType52.getPropertyType("{1522912769}");
        boolean boolean92 = jSType91.isDateType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType52.", jSType16.equals(parameterizedType52) == parameterizedType52.equals(jSType16));
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test429");
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
        com.google.javascript.rhino.jstype.FunctionType functionType45 = parameterizedType35.getConstructor();
        com.google.javascript.rhino.jstype.JSType jSType46 = parameterizedType35.getParameterType();
        java.lang.Object obj47 = null;
        boolean boolean48 = jSType46.equals(obj47);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType21 and parameterizedType35.", jSType21.equals(parameterizedType35) == parameterizedType35.equals(jSType21));
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test430");
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
        boolean boolean69 = parameterizedType67.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType70 = parameterizedType67.getIndexType();
        com.google.javascript.rhino.ErrorReporter errorReporter71 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter71, true);
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType75 = null;
        boolean boolean76 = jSTypeRegistry73.resetImplicitPrototype(jSType74, objectType75);
        com.google.javascript.rhino.jstype.JSType jSType81 = jSTypeRegistry73.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType82 = jSType81.dereference();
        boolean boolean83 = objectType82.isRegexpType();
        boolean boolean85 = objectType82.isPropertyTypeInferred("hi!");
        boolean boolean86 = parameterizedType67.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) objectType82);
        java.lang.String str87 = parameterizedType67.toDebugHashCodeString();
        boolean boolean89 = parameterizedType67.hasOwnProperty("");
        boolean boolean90 = parameterizedType67.isNullType();
        boolean boolean92 = parameterizedType67.isPropertyTypeDeclared("{proxy:{proxy:{1874555938}}}");
        boolean boolean93 = parameterizedType67.isNominalType();
        boolean boolean95 = parameterizedType67.isPropertyTypeInferred("{proxy:{proxy:{2094569109}}}");
        boolean boolean96 = parameterizedType30.differsFrom((com.google.javascript.rhino.jstype.JSType) parameterizedType67);
        boolean boolean97 = parameterizedType67.hasReferenceName();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test431");
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
        boolean boolean81 = jSType80.isRecordType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType52.", jSType16.equals(parameterizedType52) == parameterizedType52.equals(jSType16));
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test432");
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
        boolean boolean69 = objectType11.canBeCalled();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on objectType11 and parameterizedType42.", objectType11.equals(parameterizedType42) == parameterizedType42.equals(objectType11));
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test433");
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
        boolean boolean46 = jSTypeExpression6.isVarArgs();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType23 and parameterizedType37.", jSType23.equals(parameterizedType37) == parameterizedType37.equals(jSType23));
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test434");
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
        boolean boolean95 = jSTypeRegistry2.hasNamespace("function (): {proxy:{685828741}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType21 and parameterizedType35.", jSType21.equals(parameterizedType35) == parameterizedType35.equals(jSType21));
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test435");
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
        boolean boolean54 = node36.isDelProp();
        com.google.javascript.rhino.Node node55 = node26.copyInformationFromForTree(node36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node57 = node55.getChildAtIndex(6);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test436");
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
        boolean boolean91 = parameterizedType30.isInterface();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType87.", jSType16.equals(parameterizedType87) == parameterizedType87.equals(jSType16));
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test437");
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
        com.google.javascript.rhino.jstype.ObjectType objectType64 = parameterizedType61.getImplicitPrototype();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test438");
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
        java.lang.String str92 = parameterizedType30.getReferenceName();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType82.", jSType16.equals(parameterizedType82) == parameterizedType82.equals(jSType16));
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test439");
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
        boolean boolean90 = parameterizedType84.isInstanceType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType36 and parameterizedType84.", jSType36.equals(parameterizedType84) == parameterizedType84.equals(jSType36));
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test440");
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
        boolean boolean39 = parameterizedType30.isPropertyInExterns("STRING {proxy:{proxy:{1004792283}}}\n");
        com.google.javascript.rhino.jstype.ObjectType objectType40 = parameterizedType30.toObjectType();
        com.google.javascript.rhino.jstype.JSType jSType41 = parameterizedType30.getParameterType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test441");
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
        boolean boolean91 = parameterizedType88.isAllType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test442");
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
        com.google.javascript.rhino.Node node44 = parameterizedType43.getRootNode();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType43.", jSType16.equals(parameterizedType43) == parameterizedType43.equals(jSType16));
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test443");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        boolean boolean5 = cloneableList3.isEmpty();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList6 = cloneableList3.reverse();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList7 = cloneableList3.asList();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Cloneable> cloneableItor8 = cloneableList3.listIterator();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean16 = node15.isFalse();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean20 = node19.isTrue();
        boolean boolean21 = node19.hasOneChild();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean25 = node24.isTrue();
        boolean boolean26 = node24.isBreak();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (byte) 1, node12, node15, node19, node24, (int) (byte) 1, 4095);
        java.lang.String str30 = node15.getString();
        boolean boolean31 = node15.isParamList();
        java.util.Set<java.lang.String> strSet32 = node15.getDirectives();
        boolean boolean33 = node15.isSyntheticBlock();
        com.google.javascript.rhino.Node node34 = node15.getLastChild();
        boolean boolean35 = cloneableList3.equals((java.lang.Object) node15);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString("{proxy:{proxy:{216812130}}}", 35, 49);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile40 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node41 = node15.getChildBefore(node39);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test444");
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
        com.google.javascript.rhino.Node node42 = parameterizedType35.getPropertyNode("{proxy:{proxy:{1715914140}}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType21 and parameterizedType35.", jSType21.equals(parameterizedType35) == parameterizedType35.equals(jSType21));
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test445");
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
        boolean boolean45 = objectType43.isPropertyTypeInferred("{proxy:{proxy:{83976669}}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType21 and objectType43.", jSType21.equals(objectType43) == objectType43.equals(jSType21));
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test446");
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
        com.google.javascript.rhino.jstype.JSType jSType54 = parameterizedType30.autobox();
        com.google.javascript.rhino.jstype.UnionType unionType55 = parameterizedType30.toMaybeUnionType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test447");
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
        boolean boolean96 = node2.isUnscopedQualifiedName();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType27 and parameterizedType63.", jSType27.equals(parameterizedType63) == parameterizedType63.equals(jSType27));
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test448");
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
        com.google.javascript.rhino.ErrorReporter errorReporter80 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry82 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter80, true);
        com.google.javascript.rhino.jstype.JSType jSType83 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType84 = null;
        boolean boolean85 = jSTypeRegistry82.resetImplicitPrototype(jSType83, objectType84);
        com.google.javascript.rhino.jstype.JSType jSType90 = jSTypeRegistry82.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType91 = jSType90.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType92 = jSType90.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType93 = jSType90.restrictByNotNullOrUndefined();
        boolean boolean94 = jSType90.isNumberObjectType();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair95 = parameterizedType52.getTypesUnderEquality(jSType90);
        com.google.javascript.rhino.jstype.JSType jSType96 = typePair95.typeA;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and jSType96.", jSType16.equals(jSType96) == jSType96.equals(jSType16));
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test449");
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
        java.util.Set<java.lang.String> strSet85 = parameterizedType52.getPropertyNames();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType52.", jSType16.equals(parameterizedType52) == parameterizedType52.equals(jSType16));
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test450");
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
        java.lang.Object obj71 = null;
        boolean boolean72 = parameterizedType70.equals(obj71);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType18 and parameterizedType70.", jSType18.equals(parameterizedType70) == parameterizedType70.equals(jSType18));
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test451");
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
        com.google.javascript.rhino.jstype.JSType jSType34 = parameterizedType30.getParameterType();
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35, true);
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType39 = null;
        boolean boolean40 = jSTypeRegistry37.resetImplicitPrototype(jSType38, objectType39);
        com.google.javascript.rhino.jstype.JSType jSType45 = jSTypeRegistry37.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = jSType45.dereference();
        boolean boolean47 = objectType46.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable48 = objectType46.getCtorImplementedInterfaces();
        boolean boolean49 = objectType46.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50, true);
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType54 = null;
        boolean boolean55 = jSTypeRegistry52.resetImplicitPrototype(jSType53, objectType54);
        com.google.javascript.rhino.jstype.JSType jSType60 = jSTypeRegistry52.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType61 = jSType60.dereference();
        boolean boolean62 = objectType61.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable63 = objectType61.getCtorImplementedInterfaces();
        boolean boolean64 = objectType61.isNativeObjectType();
        boolean boolean65 = objectType46.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType61);
        boolean boolean67 = objectType46.hasProperty("hi!");
        com.google.javascript.rhino.jstype.JSType jSType68 = objectType46.autobox();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope69 = objectType46.getParentScope();
        com.google.javascript.rhino.jstype.FunctionType functionType70 = objectType46.getOwnerFunction();
        com.google.javascript.rhino.jstype.ObjectType objectType71 = objectType46.dereference();
        com.google.javascript.rhino.jstype.JSType jSType72 = objectType71.getIndexType();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair73 = parameterizedType30.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType) objectType71);
        java.lang.Object obj74 = null;
        boolean boolean75 = objectType71.equals(obj74);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test452");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean1 = typePosition0.hasBrackets();
        boolean boolean2 = typePosition0.hasBrackets();
        com.google.javascript.rhino.Node node3 = typePosition0.getItem();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString((int) (byte) -1, "hi!");
        com.google.javascript.rhino.Node node10 = node6.useSourceInfoFromForTree(node9);
        boolean boolean11 = node6.isAdd();
        node6.detachChildren();
        typePosition0.setItem(node6);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("{proxy:{proxy:{216812130}}}", 35, 49);
        int int18 = node17.getSideEffectFlags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node6.removeChild(node17);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test453");
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
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet89 = parameterizedType52.getPossibleToBooleanOutcomes();
        boolean boolean91 = booleanLiteralSet89.contains(false);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType52.", jSType16.equals(parameterizedType52) == parameterizedType52.equals(jSType16));
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test454");
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
        boolean boolean72 = parameterizedType66.isNativeObjectType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test455");
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
        boolean boolean79 = parameterizedType52.isStringValueType();
        boolean boolean80 = parameterizedType52.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType81 = parameterizedType52.autobox();
        boolean boolean82 = parameterizedType52.matchesNumberContext();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType52.", jSType16.equals(parameterizedType52) == parameterizedType52.equals(jSType16));
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test456");
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
        boolean boolean73 = parameterizedType30.removeProperty("{proxy:{proxy:{670672264}}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType63.", jSType16.equals(parameterizedType63) == parameterizedType63.equals(jSType16));
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test457");
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
        java.util.Set set64 = parameterizedType30.getOwnPropertyNames();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType61.", jSType16.equals(parameterizedType61) == parameterizedType61.equals(jSType16));
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test458");
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
        boolean boolean42 = parameterizedType35.isNoType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType43 = parameterizedType35.toMaybeParameterizedType();
        boolean boolean44 = parameterizedType35.isNominalConstructor();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType21 and parameterizedType35.", jSType21.equals(parameterizedType35) == parameterizedType35.equals(jSType21));
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test459");
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
        boolean boolean72 = ternaryValue70.toBoolean(true);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType10 and parameterizedType69.", jSType10.equals(parameterizedType69) == parameterizedType69.equals(jSType10));
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test460");
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
        com.google.javascript.rhino.jstype.JSType jSType83 = objectType81.getRestrictedTypeGivenToBooleanOutcome(true);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and jSType83.", jSType16.equals(jSType83) == jSType83.equals(jSType16));
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test461");
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
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot33 = parameterizedType30.getOwnSlot("{proxy:{proxy:{437279302}}}");
        com.google.javascript.rhino.jstype.JSType jSType35 = parameterizedType30.getRestrictedTypeGivenToBooleanOutcome(false);
        boolean boolean36 = jSType35.isArrayType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test462");
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
        com.google.javascript.rhino.jstype.JSType jSType21 = jSTypeRegistry13.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSType21.dereference();
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
        boolean boolean56 = parameterizedType54.isNoObjectType();
        boolean boolean57 = parameterizedType54.isAllType();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber((double) (-1L));
        boolean boolean60 = objectType22.defineInferredProperty("unknown", (com.google.javascript.rhino.jstype.JSType) parameterizedType54, node59);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable61 = parameterizedType54.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope62 = parameterizedType54.getParentScope();
        java.lang.String str63 = parameterizedType54.getDisplayName();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot65 = parameterizedType54.getSlot(".<>");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable66 = parameterizedType54.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair67 = jSType9.getTypesUnderInequality((com.google.javascript.rhino.jstype.JSType) parameterizedType54);
        com.google.javascript.rhino.jstype.JSType jSType68 = typePair67.typeB;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType21 and jSType68.", jSType21.equals(jSType68) == jSType68.equals(jSType21));
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test463");
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
        com.google.javascript.rhino.jstype.TemplateType templateType83 = parameterizedType68.toMaybeTemplateType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test464");
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
        boolean boolean83 = parameterizedType30.isConstructor();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType68.", jSType16.equals(parameterizedType68) == parameterizedType68.equals(jSType16));
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test465");
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
        boolean boolean82 = parameterizedType81.isInterface();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType81.", jSType16.equals(parameterizedType81) == parameterizedType81.equals(jSType16));
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test466");
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
        com.google.javascript.rhino.JSDocInfo.Visibility visibility78 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo70.setVisibility(visibility78);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test467");
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
        java.lang.String str81 = parameterizedType52.getReferenceName();
        boolean boolean83 = parameterizedType52.isPropertyInExterns("{proxy:{proxy:{269952572}}}");
        com.google.javascript.rhino.Node node84 = parameterizedType52.getRootNode();
        com.google.javascript.rhino.jstype.JSType jSType85 = parameterizedType52.autobox();
        com.google.javascript.rhino.jstype.FunctionType functionType86 = parameterizedType52.toMaybeFunctionType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType52.", jSType16.equals(parameterizedType52) == parameterizedType52.equals(jSType16));
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test468");
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
        boolean boolean28 = objectType11.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, true);
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType33 = null;
        boolean boolean34 = jSTypeRegistry31.resetImplicitPrototype(jSType32, objectType33);
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35, true);
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType39 = null;
        boolean boolean40 = jSTypeRegistry37.resetImplicitPrototype(jSType38, objectType39);
        com.google.javascript.rhino.jstype.JSType jSType45 = jSTypeRegistry37.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = jSType45.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47, true);
        com.google.javascript.rhino.jstype.JSType jSType50 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType51 = null;
        boolean boolean52 = jSTypeRegistry49.resetImplicitPrototype(jSType50, objectType51);
        com.google.javascript.rhino.jstype.JSType jSType57 = jSTypeRegistry49.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType58 = jSType57.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType59 = jSTypeRegistry31.createParameterizedType(objectType46, jSType57);
        java.util.Set set60 = parameterizedType59.getOwnPropertyNames();
        boolean boolean61 = parameterizedType59.hasReferenceName();
        boolean boolean62 = parameterizedType59.hasAnyTemplateInternal();
        boolean boolean63 = parameterizedType59.isOrdinaryFunction();
        boolean boolean64 = parameterizedType59.isInstanceType();
        com.google.javascript.rhino.jstype.JSType jSType66 = parameterizedType59.getPropertyType("{proxy:{proxy:{628733757}}}");
        boolean boolean68 = parameterizedType59.isPropertyTypeDeclared("false");
        java.util.Set set69 = parameterizedType59.getOwnPropertyNames();
        boolean boolean70 = objectType11.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) parameterizedType59);
        boolean boolean71 = objectType11.hasReferenceName();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on objectType11 and parameterizedType59.", objectType11.equals(parameterizedType59) == parameterizedType59.equals(objectType11));
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test469");
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
        boolean boolean51 = parameterizedType30.isPropertyInExterns("function (): {proxy:{1240268079}}");
        com.google.javascript.rhino.jstype.JSType jSType52 = parameterizedType30.autobox();
        com.google.javascript.rhino.jstype.FunctionType functionType53 = parameterizedType30.toMaybeFunctionType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test470");
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
        boolean boolean83 = parameterizedType52.isPropertyTypeInferred("{proxy:{proxy:{437279302}}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType52.", jSType16.equals(parameterizedType52) == parameterizedType52.equals(jSType16));
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test471");
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
        node6.setQuotedString();
        boolean boolean22 = node6.isFalse();
        int int23 = node6.getChildCount();
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
        boolean boolean76 = parameterizedType55.isInstanceType();
        java.util.Set set77 = parameterizedType55.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.JSType jSType79 = parameterizedType55.findPropertyType("{proxy:{proxy:{1096617336}}}");
        boolean boolean81 = parameterizedType55.isPropertyTypeInferred("{proxy:{proxy:{2088464089}}}");
        node6.putProp(16, (java.lang.Object) "{proxy:{proxy:{2088464089}}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType41 and parameterizedType55.", jSType41.equals(parameterizedType55) == parameterizedType55.equals(jSType41));
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test472");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo37 = parameterizedType30.getOwnPropertyJSDocInfo("unknown");
        boolean boolean38 = parameterizedType30.isNoType();
        com.google.javascript.rhino.Node node40 = parameterizedType30.getPropertyNode("{proxy:{proxy:{1697456536}}}");
        com.google.javascript.rhino.jstype.JSType jSType41 = parameterizedType30.getParameterType();
        boolean boolean42 = jSType41.matchesUint32Context();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test473");
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
        com.google.javascript.rhino.jstype.ObjectType objectType58 = parameterizedType30.getImplicitPrototype();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test474");
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
        boolean boolean39 = parameterizedType30.isNominalType();
        boolean boolean40 = parameterizedType30.matchesObjectContext();
        com.google.javascript.rhino.jstype.ObjectType objectType41 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) parameterizedType30);
        boolean boolean42 = parameterizedType30.isRegexpType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test475");
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
        com.google.javascript.rhino.jstype.FunctionType functionType83 = parameterizedType52.toMaybeFunctionType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType52.", jSType16.equals(parameterizedType52) == parameterizedType52.equals(jSType16));
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test476");
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
        com.google.javascript.rhino.jstype.JSType jSType81 = jSTypeRegistry2.createNamedType("{proxy:{proxy:{439353474}}}", "{proxy:{proxy:{1528752248}}}", 42, 40);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType52.", jSType16.equals(parameterizedType52) == parameterizedType52.equals(jSType16));
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test477");
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
        boolean boolean22 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList27 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node26);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList28 = cloneableList27.asList();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList29 = cloneableList27.reverse();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList30 = cloneableList29.reverse();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList31 = cloneableList29.reverse();
        int int32 = cloneableList31.size();
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
        boolean boolean65 = parameterizedType63.hasReferenceName();
        boolean boolean66 = parameterizedType63.hasAnyTemplateInternal();
        boolean boolean67 = parameterizedType63.isOrdinaryFunction();
        boolean boolean68 = cloneableList31.equals((java.lang.Object) parameterizedType63);
        boolean boolean69 = parameterizedType63.isNominalConstructor();
        com.google.javascript.rhino.jstype.JSType jSType70 = parameterizedType63.getIndexType();
        com.google.javascript.rhino.jstype.FunctionType functionType71 = parameterizedType63.getConstructor();
        boolean boolean72 = jSTypeRegistry2.declareType("{proxy:{proxy:{1446031097}}}", (com.google.javascript.rhino.jstype.JSType) parameterizedType63);
        jSTypeRegistry2.resetForTypeCheck();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType18 and parameterizedType63.", jSType18.equals(parameterizedType63) == parameterizedType63.equals(jSType18));
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test478");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        boolean boolean5 = cloneableList3.isEmpty();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList6 = cloneableList3.reverse();
        boolean boolean7 = cloneableList6.isEmpty();
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        boolean boolean13 = jSTypeRegistry10.resetImplicitPrototype(jSType11, objectType12);
        com.google.javascript.rhino.jstype.JSType jSType18 = jSTypeRegistry10.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = jSType18.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = null;
        boolean boolean26 = jSTypeRegistry23.resetImplicitPrototype(jSType24, objectType25);
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27, true);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        boolean boolean32 = jSTypeRegistry29.resetImplicitPrototype(jSType30, objectType31);
        com.google.javascript.rhino.jstype.JSType jSType37 = jSTypeRegistry29.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType38 = jSType37.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, true);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType43 = null;
        boolean boolean44 = jSTypeRegistry41.resetImplicitPrototype(jSType42, objectType43);
        com.google.javascript.rhino.jstype.JSType jSType49 = jSTypeRegistry41.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType50 = jSType49.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType51 = jSTypeRegistry23.createParameterizedType(objectType38, jSType49);
        java.util.Set set52 = parameterizedType51.getOwnPropertyNames();
        boolean boolean53 = parameterizedType51.isNoObjectType();
        boolean boolean54 = parameterizedType51.isAllType();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber((double) (-1L));
        boolean boolean57 = objectType19.defineInferredProperty("unknown", (com.google.javascript.rhino.jstype.JSType) parameterizedType51, node56);
        boolean boolean58 = parameterizedType51.isVoidType();
        boolean boolean59 = parameterizedType51.isNoObjectType();
        boolean boolean60 = cloneableList6.equals((java.lang.Object) boolean59);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType18 and parameterizedType51.", jSType18.equals(parameterizedType51) == parameterizedType51.equals(jSType18));
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test479");
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
        boolean boolean41 = parameterizedType30.isPropertyTypeDeclared("Unknown class name");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test480");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        boolean boolean4 = cloneableList3.isEmpty();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition5 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int6 = namePosition5.getStartLine();
        int int7 = namePosition5.getStartLine();
        int int8 = cloneableList3.lastIndexOf((java.lang.Object) namePosition5);
        java.lang.Object[] objArray9 = cloneableList3.toArray();
        java.util.Spliterator<java.lang.Cloneable> cloneableSpliterator10 = cloneableList3.spliterator();
        java.lang.Object[] objArray11 = cloneableList3.toArray();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.ObjectType objectType16 = jSTypeRegistry14.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        boolean boolean30 = objectType29.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable31 = objectType29.getCtorImplementedInterfaces();
        boolean boolean32 = objectType29.isNativeObjectType();
        jSTypeRegistry14.registerPropertyOnType("", (com.google.javascript.rhino.jstype.JSType) objectType29);
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
        java.util.Set set65 = parameterizedType64.getOwnPropertyNames();
        boolean boolean66 = parameterizedType64.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter67 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry69 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter67, true);
        com.google.javascript.rhino.jstype.JSType jSType70 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType71 = null;
        boolean boolean72 = jSTypeRegistry69.resetImplicitPrototype(jSType70, objectType71);
        com.google.javascript.rhino.jstype.JSType jSType77 = jSTypeRegistry69.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType78 = jSType77.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType79 = jSType77.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType80 = jSType77.restrictByNotNullOrUndefined();
        boolean boolean81 = parameterizedType64.canAssignTo(jSType77);
        boolean boolean83 = parameterizedType64.isPropertyTypeInferred("");
        com.google.javascript.rhino.jstype.JSType jSType88 = jSTypeRegistry14.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) parameterizedType64, "hi!", "Named type with empty name component", 40, 39);
        boolean boolean89 = cloneableList3.equals((java.lang.Object) 40);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType28 and parameterizedType64.", jSType28.equals(parameterizedType64) == parameterizedType64.equals(jSType28));
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test481");
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
        boolean boolean62 = enumType61.canBeCalled();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType32 and parameterizedType46.", jSType32.equals(parameterizedType46) == parameterizedType46.equals(jSType32));
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test482");
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
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType53 = parameterizedType30.toMaybeParameterizedType();
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType58 = null;
        boolean boolean59 = jSTypeRegistry56.resetImplicitPrototype(jSType57, objectType58);
        com.google.javascript.rhino.jstype.JSType jSType64 = jSTypeRegistry56.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType65 = jSType64.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType66 = jSType64.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType67 = jSType64.restrictByNotNullOrUndefined();
        boolean boolean68 = jSType67.hasDisplayName();
        boolean boolean69 = jSType67.matchesObjectContext();
        boolean boolean70 = parameterizedType53.isSubtype(jSType67);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType53.", jSType16.equals(parameterizedType53) == parameterizedType53.equals(jSType16));
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test483");
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
        jSTypeRegistry2.clearNamedTypes();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType18 and parameterizedType56.", jSType18.equals(parameterizedType56) == parameterizedType56.equals(jSType18));
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test484");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean3 = node2.isTrue();
        boolean boolean4 = node2.hasOneChild();
        boolean boolean5 = node2.isVarArgs();
        java.lang.Object obj7 = node2.getProp(39);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString((int) (byte) -1, "hi!");
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(41, node11, (int) (short) 1, 40);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder15 = node14.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) (-1L));
        boolean boolean18 = node17.isQuotedString();
        node17.setWasEmptyNode(false);
        com.google.javascript.rhino.Node node21 = node14.srcrefTree(node17);
        boolean boolean22 = node21.isGetterDef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.removeChild(node21);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test485");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) (byte) 10, (int) (byte) 0, 1);
        com.google.javascript.rhino.Node node4 = node3.getLastChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node6 = node3.getChildAtIndex(43);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test486");
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
        boolean boolean71 = jSTypeRegistry2.hasNamespace("function (): {proxy:{49473424}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType18 and parameterizedType55.", jSType18.equals(parameterizedType55) == parameterizedType55.equals(jSType18));
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test487");
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
        boolean boolean83 = parameterizedType30.isNullable();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType76.", jSType16.equals(parameterizedType76) == parameterizedType76.equals(jSType16));
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test488");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(35, "{proxy:{proxy:{269952572}}}");
        boolean boolean3 = node2.isSwitch();
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
        boolean boolean26 = node7.isNot();
        node7.setLength(0);
        boolean boolean29 = node7.isContinue();
        boolean boolean30 = node7.isOr();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node31 = node2.getChildBefore(node7);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test489");
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
        boolean boolean72 = parameterizedType66.hasReferenceName();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test490");
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
        boolean boolean43 = parameterizedType35.isNoObjectType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType21 and parameterizedType35.", jSType21.equals(parameterizedType35) == parameterizedType35.equals(jSType21));
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test491");
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
        boolean boolean41 = parameterizedType30.isNoType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo42 = parameterizedType30.getJSDocInfo();
        com.google.javascript.rhino.jstype.ObjectType objectType43 = parameterizedType30.toObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType44 = parameterizedType30.getImplicitPrototype();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test492");
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
        com.google.javascript.rhino.jstype.JSType jSType44 = jSTypeRegistry2.getType("{proxy:{proxy:{733645911}}}");
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
        java.util.Set set77 = parameterizedType76.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot79 = parameterizedType76.getOwnSlot("{proxy:{proxy:{437279302}}}");
        java.lang.String str80 = parameterizedType76.toDebugHashCodeString();
        boolean boolean81 = parameterizedType76.isStringObjectType();
        jSTypeRegistry2.registerPropertyOnType("{proxy:{proxy:{1603363525}}}", (com.google.javascript.rhino.jstype.JSType) parameterizedType76);
        jSTypeRegistry2.clearTemplateTypeNames();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType17 and parameterizedType76.", jSType17.equals(parameterizedType76) == parameterizedType76.equals(jSType17));
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test493");
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
        boolean boolean58 = parameterizedType57.isUnknownType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType57.", jSType16.equals(parameterizedType57) == parameterizedType57.equals(jSType16));
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test494");
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
        boolean boolean22 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList27 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node26);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList28 = cloneableList27.asList();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList29 = cloneableList27.reverse();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList30 = cloneableList29.reverse();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList31 = cloneableList29.reverse();
        int int32 = cloneableList31.size();
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
        boolean boolean65 = parameterizedType63.hasReferenceName();
        boolean boolean66 = parameterizedType63.hasAnyTemplateInternal();
        boolean boolean67 = parameterizedType63.isOrdinaryFunction();
        boolean boolean68 = cloneableList31.equals((java.lang.Object) parameterizedType63);
        boolean boolean69 = parameterizedType63.isNominalConstructor();
        com.google.javascript.rhino.jstype.JSType jSType70 = parameterizedType63.getIndexType();
        com.google.javascript.rhino.jstype.FunctionType functionType71 = parameterizedType63.getConstructor();
        boolean boolean72 = jSTypeRegistry2.declareType("{proxy:{proxy:{1446031097}}}", (com.google.javascript.rhino.jstype.JSType) parameterizedType63);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable74 = jSTypeRegistry2.getEachReferenceTypeWithProperty("{proxy:{proxy:{545956702}}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType18 and parameterizedType63.", jSType18.equals(parameterizedType63) == parameterizedType63.equals(jSType18));
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test495");
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
        boolean boolean31 = parameterizedType30.isAllType();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList35 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node34);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList36 = cloneableList35.asList();
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
        com.google.javascript.rhino.jstype.JSType jSType70 = parameterizedType67.getIndexType();
        boolean boolean71 = cloneableList36.equals((java.lang.Object) parameterizedType67);
        boolean boolean72 = parameterizedType67.hasDisplayName();
        boolean boolean73 = parameterizedType67.isUnionType();
        boolean boolean74 = parameterizedType30.isSubtype((com.google.javascript.rhino.jstype.JSType) parameterizedType67);
        com.google.javascript.rhino.jstype.ObjectType objectType76 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface((com.google.javascript.rhino.jstype.ObjectType) parameterizedType67, "{proxy:{proxy:{1231976244}}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test496");
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
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode62 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES;
        jSTypeRegistry2.setResolveMode(resolveMode62);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType22 and parameterizedType36.", jSType22.equals(parameterizedType36) == parameterizedType36.equals(jSType22));
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test497");
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
        java.util.Set<java.lang.String> strSet91 = parameterizedType30.getPropertyNames();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType88.", jSType16.equals(parameterizedType88) == parameterizedType88.equals(jSType16));
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test498");
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
        boolean boolean64 = jSDocInfo56.isNoSideEffects();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType10 and parameterizedType43.", jSType10.equals(parameterizedType43) == parameterizedType43.equals(jSType10));
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test499");
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
        java.lang.String str91 = parameterizedType66.getDisplayName();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test500");
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
        boolean boolean22 = node20.isAssign();
        com.google.javascript.rhino.InputId inputId24 = new com.google.javascript.rhino.InputId("Named type with empty name component");
        node20.setInputId(inputId24);
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
        java.util.Set set57 = parameterizedType56.getOwnPropertyNames();
        boolean boolean58 = parameterizedType56.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType59 = parameterizedType56.getIndexType();
        java.lang.String str60 = parameterizedType56.toDebugHashCodeString();
        boolean boolean61 = parameterizedType56.isInterface();
        com.google.javascript.rhino.Node node62 = parameterizedType56.getRootNode();
        boolean boolean64 = parameterizedType56.removeProperty("function (): {proxy:{1553899974}}");
        com.google.javascript.rhino.jstype.EnumElementType enumElementType65 = parameterizedType56.toMaybeEnumElementType();
        boolean boolean66 = inputId24.equals((java.lang.Object) enumElementType65);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType42 and parameterizedType56.", jSType42.equals(parameterizedType56) == parameterizedType56.equals(jSType42));
    }

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test501");
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
        com.google.javascript.rhino.jstype.ObjectType objectType53 = parameterizedType30.toObjectType();
        boolean boolean54 = objectType53.isInterface();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and objectType53.", jSType16.equals(objectType53) == objectType53.equals(jSType16));
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test502");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (byte) -1);
        com.google.javascript.rhino.Node node3 = node1.getAncestor(38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node5 = node1.getChildAtIndex(196649);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test503");
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
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType53 = parameterizedType30.toMaybeParameterizedType();
        boolean boolean54 = parameterizedType53.isCheckedUnknownType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType53.", jSType16.equals(parameterizedType53) == parameterizedType53.equals(jSType16));
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test504");
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
        boolean boolean83 = parameterizedType30.isConstructor();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType68.", jSType16.equals(parameterizedType68) == parameterizedType68.equals(jSType16));
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test505");
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
        com.google.javascript.rhino.ErrorReporter errorReporter80 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry82 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter80, true);
        com.google.javascript.rhino.jstype.JSType jSType83 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType84 = null;
        boolean boolean85 = jSTypeRegistry82.resetImplicitPrototype(jSType83, objectType84);
        com.google.javascript.rhino.jstype.JSType jSType90 = jSTypeRegistry82.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType91 = jSType90.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType92 = jSType90.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType93 = jSType90.restrictByNotNullOrUndefined();
        boolean boolean94 = jSType90.isNumberObjectType();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair95 = parameterizedType52.getTypesUnderEquality(jSType90);
        boolean boolean96 = jSType90.isUnionType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType52.", jSType16.equals(parameterizedType52) == parameterizedType52.equals(jSType16));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test506");
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
        java.lang.String str93 = ternaryValue92.toString();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test507");
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
        jSTypeRegistry15.setLastGeneration(false);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = null;
        boolean boolean26 = jSTypeRegistry23.resetImplicitPrototype(jSType24, objectType25);
        com.google.javascript.rhino.jstype.JSType jSType31 = jSTypeRegistry23.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSType31.dereference();
        boolean boolean33 = objectType32.isFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry15.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType) objectType32);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable36 = jSTypeRegistry15.getEachReferenceTypeWithProperty("({proxy:{proxy:{1874555938}}})");
        com.google.javascript.rhino.ErrorReporter errorReporter37 = jSTypeRegistry15.getErrorReporter();
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
        boolean boolean72 = parameterizedType68.isOrdinaryFunction();
        boolean boolean73 = parameterizedType68.isInstanceType();
        com.google.javascript.rhino.jstype.JSType jSType75 = parameterizedType68.getPropertyType("{proxy:{proxy:{628733757}}}");
        boolean boolean76 = parameterizedType68.isFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType78 = parameterizedType68.findPropertyType("function (): {proxy:{1288677244}}");
        boolean boolean79 = parameterizedType68.hasReferenceName();
        boolean boolean80 = parameterizedType68.canBeCalled();
        boolean boolean82 = jSTypeRegistry15.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) parameterizedType68, "function (): {proxy:{333019360}}");
        com.google.javascript.rhino.jstype.ObjectType objectType83 = jSTypeRegistry2.createObjectType((com.google.javascript.rhino.jstype.ObjectType) parameterizedType68);
        com.google.javascript.rhino.jstype.ObjectType objectType84 = jSTypeRegistry2.createAnonymousObjectType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType10 and parameterizedType68.", jSType10.equals(parameterizedType68) == parameterizedType68.equals(jSType10));
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test508");
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
        boolean boolean67 = jSTypeRegistry2.hasNamespace("function (): {proxy:{1096078295}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType10 and parameterizedType43.", jSType10.equals(parameterizedType43) == parameterizedType43.equals(jSType10));
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test509");
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
        boolean boolean37 = parameterizedType30.isNoObjectType();
        boolean boolean38 = parameterizedType30.isConstructor();
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        boolean boolean45 = jSTypeRegistry42.resetImplicitPrototype(jSType43, objectType44);
        com.google.javascript.rhino.jstype.JSType jSType50 = jSTypeRegistry42.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType51 = jSType50.dereference();
        java.lang.String str52 = objectType51.getDisplayName();
        com.google.javascript.rhino.jstype.FunctionType functionType53 = objectType51.getConstructor();
        boolean boolean54 = objectType51.hasReferenceName();
        boolean boolean55 = objectType51.isObject();
        com.google.javascript.rhino.jstype.JSType jSType57 = objectType51.getPropertyType("{proxy:{proxy:{1835926569}}}");
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newNumber((double) ' ', 48, 41);
        com.google.javascript.rhino.jstype.JSType jSType62 = node61.getJSType();
        boolean boolean63 = node61.isLocalResultCall();
        boolean boolean64 = parameterizedType30.defineSynthesizedProperty("{proxy:{proxy:{646148492}}}", (com.google.javascript.rhino.jstype.JSType) objectType51, node61);
        com.google.javascript.rhino.jstype.EnumType enumType65 = objectType51.toMaybeEnumType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test510");
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
        com.google.javascript.rhino.jstype.ObjectType.Property property89 = parameterizedType71.getOwnSlot("function (): {proxy:{205573484}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test511");
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
        com.google.javascript.rhino.jstype.UnionType unionType80 = parameterizedType30.toMaybeUnionType();
        boolean boolean82 = parameterizedType30.isPropertyTypeInferred("function (): {proxy:{832956806}}");
        com.google.javascript.rhino.jstype.ObjectType objectType83 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) parameterizedType30);
        boolean boolean85 = objectType83.isPropertyInExterns("");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and objectType83.", jSType16.equals(objectType83) == objectType83.equals(jSType16));
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test512");
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
        jSTypeRegistry2.incrementGeneration();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType22 and parameterizedType36.", jSType22.equals(parameterizedType36) == parameterizedType36.equals(jSType22));
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test513");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        boolean boolean4 = cloneableList3.isEmpty();
        boolean boolean5 = cloneableList3.isEmpty();
        java.lang.Object[] objArray6 = cloneableList3.toArray();
        java.lang.Object[] objArray7 = cloneableList3.toArray();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList11 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node10);
        boolean boolean12 = node10.isFalse();
        boolean boolean13 = node10.isScript();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList17 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node16);
        boolean boolean18 = node16.isString();
        node16.setSourceFileForTesting("hi!");
        com.google.javascript.rhino.Node node21 = node10.srcref(node16);
        com.google.javascript.rhino.Node node22 = node10.cloneNode();
        com.google.javascript.rhino.jstype.JSType jSType23 = node10.getJSType();
        node10.setLineno((int) (byte) 100);
        boolean boolean26 = cloneableList3.contains((java.lang.Object) (byte) 100);
        java.util.ListIterator<java.lang.Cloneable> cloneableItor27 = cloneableList3.listIterator();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList28 = cloneableList3.reverse();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, true);
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType33 = null;
        boolean boolean34 = jSTypeRegistry31.resetImplicitPrototype(jSType32, objectType33);
        boolean boolean35 = jSTypeRegistry31.shouldTolerateUndefinedValues();
        jSTypeRegistry31.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray37 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.JSType jSType38 = jSTypeRegistry31.createUnionType(jSTypeArray37);
        com.google.javascript.rhino.jstype.UnionType unionType39 = jSType38.toMaybeUnionType();
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable71 = parameterizedType70.getCtorExtendedInterfaces();
        boolean boolean72 = parameterizedType70.isNominalType();
        boolean boolean73 = parameterizedType70.isAllType();
        boolean boolean74 = parameterizedType70.isUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType76 = parameterizedType70.getPropertyType("{proxy:{proxy:{51735728}}}");
        com.google.javascript.rhino.JSDocInfo jSDocInfo77 = parameterizedType70.getJSDocInfo();
        boolean boolean78 = jSType38.differsFrom((com.google.javascript.rhino.jstype.JSType) parameterizedType70);
        int int79 = cloneableList3.indexOf((java.lang.Object) jSType38);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType56 and parameterizedType70.", jSType56.equals(parameterizedType70) == parameterizedType70.equals(jSType56));
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test514");
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
        com.google.javascript.rhino.jstype.EnumElementType enumElementType92 = parameterizedType83.toMaybeEnumElementType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test515");
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
        com.google.javascript.rhino.jstype.FunctionType functionType36 = parameterizedType30.getConstructor();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test516");
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
        boolean boolean34 = parameterizedType30.isNoResolvedType();
        java.lang.String str35 = parameterizedType30.getReferenceName();
        boolean boolean36 = parameterizedType30.isNominalType();
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
        boolean boolean65 = objectType48.isStringValueType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType66 = objectType48.toMaybeParameterizedType();
        com.google.javascript.rhino.jstype.ObjectType objectType68 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(objectType48, "");
        com.google.javascript.rhino.Node node69 = objectType68.getRootNode();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue70 = parameterizedType30.testForEquality((com.google.javascript.rhino.jstype.JSType) objectType68);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue71 = ternaryValue70.not();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test517");
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
        boolean boolean99 = functionType90.isPropertyTypeInferred("{proxy:{proxy:{455207564}}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test518");
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
        boolean boolean41 = parameterizedType40.matchesNumberContext();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType40.", jSType16.equals(parameterizedType40) == parameterizedType40.equals(jSType16));
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test519");
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
        jSTypeRegistry15.setLastGeneration(false);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = null;
        boolean boolean26 = jSTypeRegistry23.resetImplicitPrototype(jSType24, objectType25);
        com.google.javascript.rhino.jstype.JSType jSType31 = jSTypeRegistry23.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSType31.dereference();
        boolean boolean33 = objectType32.isFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry15.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType) objectType32);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable36 = jSTypeRegistry15.getEachReferenceTypeWithProperty("({proxy:{proxy:{1874555938}}})");
        com.google.javascript.rhino.ErrorReporter errorReporter37 = jSTypeRegistry15.getErrorReporter();
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
        boolean boolean72 = parameterizedType68.isOrdinaryFunction();
        boolean boolean73 = parameterizedType68.isInstanceType();
        com.google.javascript.rhino.jstype.JSType jSType75 = parameterizedType68.getPropertyType("{proxy:{proxy:{628733757}}}");
        boolean boolean76 = parameterizedType68.isFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType78 = parameterizedType68.findPropertyType("function (): {proxy:{1288677244}}");
        boolean boolean79 = parameterizedType68.hasReferenceName();
        boolean boolean80 = parameterizedType68.canBeCalled();
        boolean boolean82 = jSTypeRegistry15.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) parameterizedType68, "function (): {proxy:{333019360}}");
        com.google.javascript.rhino.jstype.ObjectType objectType83 = jSTypeRegistry2.createObjectType((com.google.javascript.rhino.jstype.ObjectType) parameterizedType68);
        boolean boolean84 = objectType83.isUnknownType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType10 and parameterizedType68.", jSType10.equals(parameterizedType68) == parameterizedType68.equals(jSType10));
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test520");
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
        boolean boolean83 = parameterizedType82.hasReferenceName();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType82.", jSType16.equals(parameterizedType82) == parameterizedType82.equals(jSType16));
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test521");
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
        boolean boolean62 = enumType61.isNullable();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType32 and parameterizedType46.", jSType32.equals(parameterizedType46) == parameterizedType46.equals(jSType32));
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test522");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        boolean boolean3 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter4 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter4, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        boolean boolean9 = jSTypeRegistry6.resetImplicitPrototype(jSType7, objectType8);
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10, true);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        boolean boolean15 = jSTypeRegistry12.resetImplicitPrototype(jSType13, objectType14);
        com.google.javascript.rhino.jstype.JSType jSType20 = jSTypeRegistry12.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = jSType20.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        boolean boolean27 = jSTypeRegistry24.resetImplicitPrototype(jSType25, objectType26);
        com.google.javascript.rhino.jstype.JSType jSType32 = jSTypeRegistry24.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType33 = jSType32.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType34 = jSTypeRegistry6.createParameterizedType(objectType21, jSType32);
        java.util.Set set35 = parameterizedType34.getOwnPropertyNames();
        boolean boolean36 = parameterizedType34.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37, true);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType41 = null;
        boolean boolean42 = jSTypeRegistry39.resetImplicitPrototype(jSType40, objectType41);
        com.google.javascript.rhino.jstype.JSType jSType47 = jSTypeRegistry39.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = jSType47.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSType47.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType50 = jSType47.restrictByNotNullOrUndefined();
        boolean boolean51 = parameterizedType34.canAssignTo(jSType47);
        int int52 = parameterizedType34.getPropertiesCount();
        com.google.javascript.rhino.JSDocInfo jSDocInfo54 = null;
        parameterizedType34.setPropertyJSDocInfo("unknown", jSDocInfo54);
        boolean boolean56 = parameterizedType34.canBeCalled();
        com.google.javascript.rhino.jstype.FunctionType functionType57 = parameterizedType34.toMaybeFunctionType();
        jSTypeRegistry2.resolveTypesInScope((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) parameterizedType34);
        jSTypeRegistry2.clearNamedTypes();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType20 and parameterizedType34.", jSType20.equals(parameterizedType34) == parameterizedType34.equals(jSType20));
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test523");
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
        boolean boolean37 = parameterizedType30.isNoObjectType();
        boolean boolean38 = parameterizedType30.isConstructor();
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        boolean boolean45 = jSTypeRegistry42.resetImplicitPrototype(jSType43, objectType44);
        com.google.javascript.rhino.jstype.JSType jSType50 = jSTypeRegistry42.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType51 = jSType50.dereference();
        java.lang.String str52 = objectType51.getDisplayName();
        com.google.javascript.rhino.jstype.FunctionType functionType53 = objectType51.getConstructor();
        boolean boolean54 = objectType51.hasReferenceName();
        boolean boolean55 = objectType51.isObject();
        com.google.javascript.rhino.jstype.JSType jSType57 = objectType51.getPropertyType("{proxy:{proxy:{1835926569}}}");
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newNumber((double) ' ', 48, 41);
        com.google.javascript.rhino.jstype.JSType jSType62 = node61.getJSType();
        boolean boolean63 = node61.isLocalResultCall();
        boolean boolean64 = parameterizedType30.defineSynthesizedProperty("{proxy:{proxy:{646148492}}}", (com.google.javascript.rhino.jstype.JSType) objectType51, node61);
        com.google.javascript.rhino.jstype.JSType jSType65 = objectType51.autoboxesTo();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test524");
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
        jSDocInfo81.addSuppression("function (): {proxy:{1575469569}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType52.", jSType16.equals(parameterizedType52) == parameterizedType52.equals(jSType16));
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test525");
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
        com.google.javascript.rhino.jstype.ObjectType.Property property86 = parameterizedType84.getSlot("{proxy:{proxy:{774609245}}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType84.", jSType16.equals(parameterizedType84) == parameterizedType84.equals(jSType16));
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test526");
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
        boolean boolean42 = jSTypeRegistry2.hasNamespace("NULL 1\n    ERROR hi!\n");
        com.google.javascript.rhino.jstype.JSType jSType44 = jSTypeRegistry2.getType("function (): {proxy:{371284571}}");
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList48 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node47);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList49 = cloneableList48.asList();
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50, true);
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType54 = null;
        boolean boolean55 = jSTypeRegistry52.resetImplicitPrototype(jSType53, objectType54);
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56, true);
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType60 = null;
        boolean boolean61 = jSTypeRegistry58.resetImplicitPrototype(jSType59, objectType60);
        com.google.javascript.rhino.jstype.JSType jSType66 = jSTypeRegistry58.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType67 = jSType66.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter68 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter68, true);
        com.google.javascript.rhino.jstype.JSType jSType71 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType72 = null;
        boolean boolean73 = jSTypeRegistry70.resetImplicitPrototype(jSType71, objectType72);
        com.google.javascript.rhino.jstype.JSType jSType78 = jSTypeRegistry70.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType79 = jSType78.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType80 = jSTypeRegistry52.createParameterizedType(objectType67, jSType78);
        java.util.Set set81 = parameterizedType80.getOwnPropertyNames();
        boolean boolean82 = parameterizedType80.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType83 = parameterizedType80.getIndexType();
        boolean boolean84 = cloneableList49.equals((java.lang.Object) parameterizedType80);
        com.google.javascript.rhino.Node node86 = parameterizedType80.getPropertyNode("function (): {proxy:{1288677244}}");
        boolean boolean87 = parameterizedType80.isOrdinaryFunction();
        boolean boolean89 = parameterizedType80.isPropertyInExterns("function (): {proxy:{1975023194}}");
        com.google.javascript.rhino.jstype.FunctionType functionType90 = parameterizedType80.getConstructor();
        com.google.javascript.rhino.jstype.JSType jSType91 = parameterizedType80.getParameterType();
        com.google.javascript.rhino.jstype.JSType jSType92 = jSTypeRegistry2.createNullableType(jSType91);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType36 and parameterizedType80.", jSType36.equals(parameterizedType80) == parameterizedType80.equals(jSType36));
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test527");
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
        boolean boolean45 = objectType43.isPropertyTypeInferred("function (): {proxy:{205573484}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType21 and objectType43.", jSType21.equals(objectType43) == objectType43.equals(jSType21));
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test528");
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
        boolean boolean51 = parameterizedType30.isPropertyInExterns("function (): {proxy:{1240268079}}");
        com.google.javascript.rhino.jstype.JSType jSType52 = parameterizedType30.autobox();
        boolean boolean53 = parameterizedType30.isNativeObjectType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test529");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        boolean boolean5 = cloneableList3.isEmpty();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList9 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node8);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList10 = cloneableList9.asList();
        boolean boolean11 = cloneableList3.containsAll((java.util.Collection<java.lang.Cloneable>) cloneableList10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.ObjectType objectType16 = jSTypeRegistry14.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        boolean boolean23 = jSTypeRegistry20.resetImplicitPrototype(jSType21, objectType22);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry20.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSType28.dereference();
        boolean boolean30 = objectType29.isFunctionType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable31 = objectType29.getCtorImplementedInterfaces();
        boolean boolean32 = objectType29.isNativeObjectType();
        jSTypeRegistry14.registerPropertyOnType("", (com.google.javascript.rhino.jstype.JSType) objectType29);
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
        java.util.Set set65 = parameterizedType64.getOwnPropertyNames();
        boolean boolean66 = parameterizedType64.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter67 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry69 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter67, true);
        com.google.javascript.rhino.jstype.JSType jSType70 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType71 = null;
        boolean boolean72 = jSTypeRegistry69.resetImplicitPrototype(jSType70, objectType71);
        com.google.javascript.rhino.jstype.JSType jSType77 = jSTypeRegistry69.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType78 = jSType77.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType79 = jSType77.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType80 = jSType77.restrictByNotNullOrUndefined();
        boolean boolean81 = parameterizedType64.canAssignTo(jSType77);
        boolean boolean83 = parameterizedType64.isPropertyTypeInferred("");
        com.google.javascript.rhino.jstype.JSType jSType88 = jSTypeRegistry14.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) parameterizedType64, "hi!", "Named type with empty name component", 40, 39);
        com.google.javascript.rhino.jstype.JSType jSType89 = parameterizedType64.getParameterType();
        boolean boolean90 = parameterizedType64.isNoType();
        boolean boolean91 = parameterizedType64.isParameterizedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo92 = parameterizedType64.getJSDocInfo();
        java.lang.String str93 = parameterizedType64.getReferenceName();
        boolean boolean94 = cloneableList3.equals((java.lang.Object) str93);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType28 and parameterizedType64.", jSType28.equals(parameterizedType64) == parameterizedType64.equals(jSType28));
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test530");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable84 = parameterizedType83.getCtorExtendedInterfaces();
        boolean boolean85 = parameterizedType83.isNominalType();
        boolean boolean86 = parameterizedType83.isAllType();
        boolean boolean87 = parameterizedType83.matchesNumberContext();
        boolean boolean88 = parameterizedType83.isNullable();
        boolean boolean89 = parameterizedType83.isNoObjectType();
        boolean boolean90 = parameterizedType83.isBooleanValueType();
        boolean boolean91 = parameterizedType42.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType) parameterizedType83);
        boolean boolean92 = parameterizedType42.isCheckedUnknownType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType28 and parameterizedType83.", jSType28.equals(parameterizedType83) == parameterizedType83.equals(jSType28));
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test531");
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
        boolean boolean53 = parameterizedType43.removeProperty("function (): ");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType10 and parameterizedType43.", jSType10.equals(parameterizedType43) == parameterizedType43.equals(jSType10));
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test532");
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
        com.google.javascript.rhino.jstype.JSType jSType21 = jSTypeRegistry13.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSType21.dereference();
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
        boolean boolean56 = parameterizedType54.isNoObjectType();
        boolean boolean57 = parameterizedType54.isAllType();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber((double) (-1L));
        boolean boolean60 = objectType22.defineInferredProperty("unknown", (com.google.javascript.rhino.jstype.JSType) parameterizedType54, node59);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable61 = parameterizedType54.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope62 = parameterizedType54.getParentScope();
        java.lang.String str63 = parameterizedType54.getDisplayName();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot65 = parameterizedType54.getSlot(".<>");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable66 = parameterizedType54.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair67 = jSType9.getTypesUnderInequality((com.google.javascript.rhino.jstype.JSType) parameterizedType54);
        com.google.javascript.rhino.jstype.JSType jSType68 = typePair67.typeA;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType21 and parameterizedType54.", jSType21.equals(parameterizedType54) == parameterizedType54.equals(jSType21));
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test533");
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
        com.google.javascript.rhino.jstype.EnumType enumType84 = parameterizedType73.toMaybeEnumType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test534");
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
        boolean boolean51 = parameterizedType30.isPropertyInExterns("function (): {proxy:{1240268079}}");
        com.google.javascript.rhino.jstype.JSType jSType52 = parameterizedType30.autobox();
        boolean boolean53 = parameterizedType30.isInstanceType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test535");
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
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression91 = jSDocInfo81.getReturnType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType52.", jSType16.equals(parameterizedType52) == parameterizedType52.equals(jSType16));
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test536");
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
        boolean boolean21 = node10.isParamList();
        boolean boolean22 = node10.isOptionalArg();
        boolean boolean23 = node10.isComma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node25 = node10.getChildAtIndex(42);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test537");
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
        boolean boolean93 = parameterizedType84.isNoObjectType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType21 and parameterizedType35.", jSType21.equals(parameterizedType35) == parameterizedType35.equals(jSType21));
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test538");
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
        com.google.javascript.rhino.jstype.JSType jSType97 = parameterizedType30.getPropertyType("");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType77.", jSType16.equals(parameterizedType77) == parameterizedType77.equals(jSType16));
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test539");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean4 = node3.isTrue();
        boolean boolean5 = node3.hasOneChild();
        boolean boolean6 = node3.isVarArgs();
        int int7 = node3.getType();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString((int) (byte) -1, "hi!");
        com.google.javascript.rhino.Node node14 = node10.useSourceInfoFromForTree(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) '#', node3, node10, (int) (byte) 100, (int) (short) 10);
        boolean boolean18 = node10.isTry();
        boolean boolean19 = node10.isLabelName();
        boolean boolean20 = node10.isComma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node22 = node10.getChildAtIndex(38);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test540");
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
        boolean boolean34 = parameterizedType30.isPropertyTypeInferred("{proxy:{proxy:{1168420562}}}");
        com.google.javascript.rhino.JSDocInfo jSDocInfo35 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean36 = jSDocInfo35.isInterface();
        com.google.javascript.rhino.JSDocInfo jSDocInfo37 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean38 = jSDocInfo37.isInterface();
        java.lang.String str39 = jSDocInfo37.getOriginalCommentString();
        boolean boolean40 = jSDocInfo37.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean42 = jSDocInfo41.isInterface();
        jSDocInfo41.setLicense("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo45 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean46 = jSDocInfo45.isInterface();
        java.lang.String str47 = jSDocInfo45.getOriginalCommentString();
        boolean boolean48 = jSDocInfo45.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo jSDocInfo49 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean50 = jSDocInfo49.isInterface();
        boolean boolean51 = jSDocInfo49.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression52 = jSDocInfo49.getEnumParameterType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo53 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean54 = jSDocInfo53.isInterface();
        jSDocInfo53.setLicense("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo57 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean58 = jSDocInfo57.isInterface();
        boolean boolean59 = jSDocInfo57.hasType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo60 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean61 = jSDocInfo60.isInterface();
        boolean boolean62 = jSDocInfo60.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression63 = jSDocInfo60.getEnumParameterType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo64 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean65 = jSDocInfo64.isInterface();
        boolean boolean66 = jSDocInfo64.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression67 = jSDocInfo64.getEnumParameterType();
        boolean boolean68 = jSDocInfo64.containsDeclaration();
        com.google.javascript.rhino.JSDocInfo jSDocInfo69 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean70 = jSDocInfo69.isInterface();
        java.lang.String str71 = jSDocInfo69.getOriginalCommentString();
        boolean boolean72 = jSDocInfo69.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo jSDocInfo73 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean74 = jSDocInfo73.isInterface();
        java.lang.String str75 = jSDocInfo73.getOriginalCommentString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression76 = jSDocInfo73.getType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo77 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean78 = jSDocInfo77.isInterface();
        jSDocInfo77.setLicense("");
        boolean boolean81 = jSDocInfo77.isNoAlias();
        com.google.javascript.rhino.JSDocInfo jSDocInfo82 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean83 = jSDocInfo82.isInterface();
        jSDocInfo82.setLicense("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo86 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean87 = jSDocInfo86.isInterface();
        boolean boolean88 = jSDocInfo86.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression89 = jSDocInfo86.getEnumParameterType();
        boolean boolean90 = jSDocInfo86.containsDeclaration();
        com.google.javascript.rhino.JSDocInfo[] jSDocInfoArray91 = new com.google.javascript.rhino.JSDocInfo[] { jSDocInfo82, jSDocInfo86 };
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList92 = com.google.common.collect.ImmutableList.of(jSDocInfo35, jSDocInfo37, jSDocInfo41, jSDocInfo45, jSDocInfo49, jSDocInfo53, jSDocInfo57, jSDocInfo60, jSDocInfo64, jSDocInfo69, jSDocInfo73, jSDocInfo77, jSDocInfoArray91);
        java.lang.String str93 = jSDocInfo37.getVersion();
        boolean boolean94 = jSDocInfo37.isOverride();
        java.lang.String str95 = jSDocInfo37.getLendsName();
        java.lang.String str96 = jSDocInfo37.getDescription();
        parameterizedType30.setJSDocInfo(jSDocInfo37);
        java.util.Set<java.lang.String> strSet98 = jSDocInfo37.getSuppressions();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test541");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        boolean boolean3 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        jSTypeRegistry2.clearTemplateTypeNames();
        boolean boolean6 = jSTypeRegistry2.hasNamespace("function (): {proxy:{685828741}}");
        jSTypeRegistry2.forwardDeclareType("");
        jSTypeRegistry2.setLastGeneration(false);
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
        java.util.Set set42 = parameterizedType41.getOwnPropertyNames();
        boolean boolean43 = parameterizedType41.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44, true);
        com.google.javascript.rhino.jstype.JSType jSType47 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType48 = null;
        boolean boolean49 = jSTypeRegistry46.resetImplicitPrototype(jSType47, objectType48);
        com.google.javascript.rhino.jstype.JSType jSType54 = jSTypeRegistry46.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType55 = jSType54.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSType54.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType57 = jSType54.restrictByNotNullOrUndefined();
        boolean boolean58 = parameterizedType41.canAssignTo(jSType54);
        boolean boolean60 = parameterizedType41.isPropertyTypeInferred("");
        boolean boolean61 = parameterizedType41.isResolved();
        boolean boolean62 = parameterizedType41.isInstanceType();
        boolean boolean63 = parameterizedType41.canBeCalled();
        java.util.Set<java.lang.String> strSet64 = parameterizedType41.getOwnPropertyNames();
        boolean boolean66 = parameterizedType41.removeProperty("({proxy:{proxy:{1321644185}}})");
        com.google.javascript.rhino.jstype.JSType jSType67 = parameterizedType41.getParameterType();
        boolean boolean69 = jSTypeRegistry2.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) parameterizedType41, "function (): {proxy:{1294170139}}");
        com.google.javascript.rhino.jstype.JSType jSType71 = jSTypeRegistry2.getType("");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType27 and parameterizedType41.", jSType27.equals(parameterizedType41) == parameterizedType41.equals(jSType27));
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test542");
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
        com.google.javascript.rhino.jstype.ObjectType.Property property51 = parameterizedType30.getSlot("(({proxy:{proxy:{1874555938}}}))");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet52 = parameterizedType30.getPossibleToBooleanOutcomes();
        boolean boolean54 = booleanLiteralSet52.contains(true);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test543");
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
        boolean boolean76 = parameterizedType67.isUnknownType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test544");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 45);
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean9 = node8.isFalse();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean13 = node12.isTrue();
        boolean boolean14 = node12.hasOneChild();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean18 = node17.isTrue();
        boolean boolean19 = node17.isBreak();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (byte) 1, node5, node8, node12, node17, (int) (byte) 1, 4095);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node22.children();
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
        com.google.javascript.rhino.Node node45 = node22.useSourceInfoIfMissingFromForTree(node39);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable46 = node22.siblings();
        boolean boolean47 = node22.isFor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node22);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test545");
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
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot81 = parameterizedType52.getOwnSlot("{proxy:{proxy:{1920657899}}}");
        com.google.javascript.rhino.jstype.JSType jSType82 = parameterizedType52.collapseUnion();
        com.google.javascript.rhino.jstype.FunctionType functionType83 = parameterizedType52.getOwnerFunction();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType52.", jSType16.equals(parameterizedType52) == parameterizedType52.equals(jSType16));
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test546");
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
        com.google.javascript.rhino.jstype.JSType jSType93 = parameterizedType83.findPropertyType("{proxy:{proxy:{2083824417}}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test547");
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
        boolean boolean58 = jSType57.isGlobalThisType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test548");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable42 = jSTypeRegistry2.getTypesWithProperty("{proxy:{proxy:{1168420562}}}");
        boolean boolean44 = jSTypeRegistry2.isForwardDeclaredType("{proxy:{proxy:{832922763}}}");
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
        java.util.Set set77 = parameterizedType76.getOwnPropertyNames();
        boolean boolean78 = parameterizedType76.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType79 = parameterizedType76.getIndexType();
        com.google.javascript.rhino.ErrorReporter errorReporter80 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry82 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter80, true);
        com.google.javascript.rhino.jstype.JSType jSType83 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType84 = null;
        boolean boolean85 = jSTypeRegistry82.resetImplicitPrototype(jSType83, objectType84);
        com.google.javascript.rhino.jstype.JSType jSType90 = jSTypeRegistry82.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType91 = jSType90.dereference();
        boolean boolean92 = objectType91.isRegexpType();
        boolean boolean94 = objectType91.isPropertyTypeInferred("hi!");
        boolean boolean95 = parameterizedType76.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) objectType91);
        boolean boolean96 = parameterizedType76.isNativeObjectType();
        int int97 = parameterizedType76.getPropertiesCount();
        jSTypeRegistry2.registerPropertyOnType("{proxy:{proxy:{1592861047}}}", (com.google.javascript.rhino.jstype.JSType) parameterizedType76);
        jSTypeRegistry2.resetForTypeCheck();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType36 and parameterizedType76.", jSType36.equals(parameterizedType76) == parameterizedType76.equals(jSType36));
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test549");
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
        com.google.javascript.rhino.jstype.JSType jSType69 = jSTypeRegistry2.getType("function (): {proxy:{771052197}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType20 and parameterizedType54.", jSType20.equals(parameterizedType54) == parameterizedType54.equals(jSType20));
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test550");
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
        boolean boolean98 = objectType85.isAllType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test551");
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
        com.google.javascript.rhino.jstype.EnumElementType enumElementType41 = parameterizedType35.toMaybeEnumElementType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType21 and parameterizedType35.", jSType21.equals(parameterizedType35) == parameterizedType35.equals(jSType21));
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test552");
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
        jSTypeRegistry2.forwardDeclareType("{proxy:{proxy:{38765934}}}");
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27, true);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        boolean boolean32 = jSTypeRegistry29.resetImplicitPrototype(jSType30, objectType31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        boolean boolean38 = jSTypeRegistry35.resetImplicitPrototype(jSType36, objectType37);
        com.google.javascript.rhino.jstype.JSType jSType43 = jSTypeRegistry35.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = jSType43.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, true);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType49 = null;
        boolean boolean50 = jSTypeRegistry47.resetImplicitPrototype(jSType48, objectType49);
        com.google.javascript.rhino.jstype.JSType jSType55 = jSTypeRegistry47.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType56 = jSType55.dereference();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType57 = jSTypeRegistry29.createParameterizedType(objectType44, jSType55);
        java.util.Set set58 = parameterizedType57.getOwnPropertyNames();
        boolean boolean59 = parameterizedType57.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType60 = parameterizedType57.getIndexType();
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61, true);
        com.google.javascript.rhino.jstype.JSType jSType64 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType65 = null;
        boolean boolean66 = jSTypeRegistry63.resetImplicitPrototype(jSType64, objectType65);
        com.google.javascript.rhino.jstype.JSType jSType71 = jSTypeRegistry63.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType72 = jSType71.dereference();
        boolean boolean73 = objectType72.isRegexpType();
        boolean boolean75 = objectType72.isPropertyTypeInferred("hi!");
        boolean boolean76 = parameterizedType57.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) objectType72);
        boolean boolean77 = parameterizedType57.isAllType();
        boolean boolean79 = parameterizedType57.isPropertyTypeDeclared("{proxy:{proxy:{1874555938}}}");
        com.google.javascript.rhino.jstype.JSType jSType80 = jSTypeRegistry2.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) parameterizedType57);
        com.google.javascript.rhino.jstype.JSType jSType82 = parameterizedType57.getPropertyType("{proxy:{proxy:{151790543}}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType21 and jSType80.", jSType21.equals(jSType80) == jSType80.equals(jSType21));
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test553");
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
        boolean boolean96 = node90.isIf();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test554");
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
        boolean boolean51 = parameterizedType30.isPropertyInExterns("function (): {proxy:{1240268079}}");
        com.google.javascript.rhino.jstype.JSType jSType52 = parameterizedType30.autobox();
        com.google.javascript.rhino.jstype.JSType jSType53 = parameterizedType30.getParameterType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test555");
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
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition18 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int19 = namePosition18.getStartLine();
        int int20 = namePosition18.getStartLine();
        boolean boolean21 = cloneableList13.contains((java.lang.Object) int20);
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
        boolean boolean72 = parameterizedType52.isResolved();
        boolean boolean73 = parameterizedType52.isInstanceType();
        boolean boolean74 = parameterizedType52.canBeCalled();
        java.util.Set<java.lang.String> strSet75 = parameterizedType52.getOwnPropertyNames();
        boolean boolean77 = parameterizedType52.removeProperty("({proxy:{proxy:{1321644185}}})");
        boolean boolean78 = parameterizedType52.isConstructor();
        boolean boolean79 = cloneableList13.remove((java.lang.Object) parameterizedType52);
        java.util.stream.Stream<java.lang.Cloneable> cloneableStream80 = cloneableList13.stream();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType38 and parameterizedType52.", jSType38.equals(parameterizedType52) == parameterizedType52.equals(jSType38));
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test556");
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
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot33 = parameterizedType30.getOwnSlot("{proxy:{proxy:{437279302}}}");
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType38 = null;
        boolean boolean39 = jSTypeRegistry36.resetImplicitPrototype(jSType37, objectType38);
        com.google.javascript.rhino.ErrorReporter errorReporter40 = jSTypeRegistry36.getErrorReporter();
        jSTypeRegistry36.clearNamedTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, true);
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
        boolean boolean67 = node49.isDelProp();
        com.google.javascript.rhino.ErrorReporter errorReporter68 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter68, true);
        com.google.javascript.rhino.jstype.JSType jSType71 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType72 = null;
        boolean boolean73 = jSTypeRegistry70.resetImplicitPrototype(jSType71, objectType72);
        com.google.javascript.rhino.jstype.JSType jSType78 = jSTypeRegistry70.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType79 = jSType78.dereference();
        boolean boolean80 = objectType79.isFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType81 = jSTypeRegistry44.createObjectType("hi!", node49, objectType79);
        boolean boolean82 = objectType79.isEnumType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo83 = null;
        objectType79.setJSDocInfo(jSDocInfo83);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray86 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry36.createConstructorType((com.google.javascript.rhino.jstype.JSType) objectType79, false, jSTypeArray86);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable88 = functionType87.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType89 = functionType87.getInstanceType();
        com.google.javascript.rhino.jstype.JSType jSType91 = functionType87.getPropertyType("hi!");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet92 = functionType87.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.ObjectType objectType93 = functionType87.getParentScope();
        boolean boolean94 = functionType87.isGlobalThisType();
        parameterizedType30.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType87);
        java.lang.String str96 = functionType87.toDebugHashCodeString();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test557");
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
        boolean boolean79 = parameterizedType52.isStringValueType();
        com.google.javascript.rhino.jstype.ObjectType objectType80 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) parameterizedType52);
        java.lang.String str81 = parameterizedType52.getReferenceName();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType52.", jSType16.equals(parameterizedType52) == parameterizedType52.equals(jSType16));
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test558");
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
        com.google.javascript.rhino.jstype.ObjectType objectType53 = parameterizedType30.toObjectType();
        boolean boolean54 = parameterizedType30.isCheckedUnknownType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test559");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 4);
        int int2 = node1.getSourcePosition();
        boolean boolean3 = node1.isNull();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("{proxy:{proxy:{649633010}}}", 0, 35);
        boolean boolean8 = node7.isBreak();
        boolean boolean9 = node7.isNE();
        boolean boolean10 = node7.isQualifiedName();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition11 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int12 = namePosition11.getStartLine();
        int int13 = namePosition11.getStartLine();
        int int14 = namePosition11.getEndLine();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean18 = node17.isTrue();
        namePosition11.setItem(node17);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean27 = node26.isFalse();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean31 = node30.isTrue();
        boolean boolean32 = node30.hasOneChild();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean36 = node35.isTrue();
        boolean boolean37 = node35.isBreak();
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (byte) 1, node23, node26, node30, node35, (int) (byte) 1, 4095);
        boolean boolean41 = node23.isReturn();
        node23.setType((-1));
        com.google.javascript.rhino.Node node44 = node17.useSourceInfoFrom(node23);
        boolean boolean45 = node7.isEquivalentTo(node23);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList49 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node48);
        boolean boolean50 = node48.isFalse();
        boolean boolean51 = node48.isScript();
        node48.setType((int) (short) -1);
        com.google.javascript.rhino.Node node54 = node7.clonePropsFrom(node48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node54);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test560");
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
        com.google.javascript.rhino.jstype.JSType jSType54 = parameterizedType30.autobox();
        boolean boolean55 = jSType54.isNullType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and jSType54.", jSType16.equals(jSType54) == jSType54.equals(jSType16));
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test561");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        jSTypeRegistry2.setLastGeneration(false);
        com.google.javascript.rhino.jstype.JSType jSType12 = jSTypeRegistry2.createNamedType("{proxy:{proxy:{1874555938}}}", "hi!", (int) '#', (int) ' ');
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
        com.google.javascript.rhino.jstype.ObjectType objectType64 = parameterizedType43.getImplicitPrototype();
        boolean boolean65 = parameterizedType43.isNominalType();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair66 = jSType12.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) parameterizedType43);
        com.google.javascript.rhino.jstype.JSType jSType67 = typePair66.typeB;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType29 and parameterizedType43.", jSType29.equals(parameterizedType43) == parameterizedType43.equals(jSType29));
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test562");
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
        boolean boolean44 = node20.isThrow();
        boolean boolean45 = node20.isAssignAdd();
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node20);
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
        java.lang.String str84 = parameterizedType78.getReferenceName();
        com.google.javascript.rhino.jstype.UnionType unionType85 = parameterizedType78.toMaybeUnionType();
        boolean boolean87 = parameterizedType78.hasOwnProperty("function (): {proxy:{1262905525}}");
        com.google.javascript.rhino.JSDocInfo jSDocInfo88 = parameterizedType78.getJSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo89 = parameterizedType78.getJSDocInfo();
        boolean boolean90 = parameterizedType78.isNullType();
        node20.putProp((int) (short) -1, (java.lang.Object) parameterizedType78);
        node20.setLineno(4);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType64 and parameterizedType78.", jSType64.equals(parameterizedType78) == parameterizedType78.equals(jSType64));
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test563");
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
        jSTypeRegistry2.identifyNonNullableName("{proxy:{1607239370}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType22 and parameterizedType36.", jSType22.equals(parameterizedType36) == parameterizedType36.equals(jSType22));
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test564");
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
        com.google.javascript.rhino.jstype.JSType jSType38 = parameterizedType30.getParameterType();
        com.google.javascript.rhino.jstype.ObjectType objectType39 = jSType38.dereference();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test565");
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
        boolean boolean70 = parameterizedType30.removeProperty("function (new:{...}): ");
        com.google.javascript.rhino.jstype.ObjectType objectType71 = parameterizedType30.toObjectType();
        boolean boolean72 = parameterizedType30.matchesObjectContext();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test566");
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
        boolean boolean77 = parameterizedType66.isObject();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test567");
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
        com.google.javascript.rhino.jstype.JSType jSType76 = typePair75.typeB;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test568");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable7 = jSTypeRegistry2.getTypesWithProperty("Named type with empty name component");
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
        boolean boolean40 = parameterizedType38.hasReferenceName();
        boolean boolean41 = parameterizedType38.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.JSType jSType43 = parameterizedType38.findPropertyType("");
        java.lang.String str44 = parameterizedType38.getReferenceName();
        com.google.javascript.rhino.jstype.TemplateType templateType45 = parameterizedType38.toMaybeTemplateType();
        com.google.javascript.rhino.jstype.UnionType unionType46 = parameterizedType38.toMaybeUnionType();
        com.google.javascript.rhino.jstype.ObjectType.Property property48 = parameterizedType38.getSlot("NUMBER 10.0 32");
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49, true);
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType53 = null;
        boolean boolean54 = jSTypeRegistry51.resetImplicitPrototype(jSType52, objectType53);
        com.google.javascript.rhino.jstype.JSType jSType59 = jSTypeRegistry51.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType60 = jSType59.dereference();
        boolean boolean61 = objectType60.isFunctionType();
        com.google.javascript.rhino.ErrorReporter errorReporter62 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter62, true);
        com.google.javascript.rhino.jstype.JSType jSType65 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType66 = null;
        boolean boolean67 = jSTypeRegistry64.resetImplicitPrototype(jSType65, objectType66);
        com.google.javascript.rhino.jstype.JSType jSType72 = jSTypeRegistry64.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType73 = jSType72.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType74 = jSType72.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType75 = jSType72.restrictByNotNullOrUndefined();
        boolean boolean76 = objectType60.isSubtype(jSType75);
        com.google.javascript.rhino.jstype.JSType jSType78 = objectType60.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.ErrorReporter errorReporter79 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry81 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter79, true);
        com.google.javascript.rhino.jstype.JSType jSType82 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType83 = null;
        boolean boolean84 = jSTypeRegistry81.resetImplicitPrototype(jSType82, objectType83);
        com.google.javascript.rhino.jstype.JSType jSType89 = jSTypeRegistry81.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType90 = jSType89.dereference();
        java.lang.String str91 = objectType90.getDisplayName();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair92 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) objectType60, (com.google.javascript.rhino.jstype.JSType) objectType90);
        com.google.javascript.rhino.jstype.JSType jSType93 = typePair92.typeB;
        com.google.javascript.rhino.jstype.JSType jSType94 = typePair92.typeB;
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType95 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) parameterizedType38, jSType94);
        boolean boolean96 = parameterizedType38.isStringObjectType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType24 and parameterizedType95.", jSType24.equals(parameterizedType95) == parameterizedType95.equals(jSType24));
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test569");
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
        com.google.javascript.rhino.Node node95 = parameterizedType30.getRootNode();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType84.", jSType16.equals(parameterizedType84) == parameterizedType84.equals(jSType16));
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test570");
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
        boolean boolean79 = parameterizedType52.isStringValueType();
        boolean boolean80 = parameterizedType52.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType81 = parameterizedType52.autobox();
        com.google.javascript.rhino.jstype.ObjectType objectType82 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) parameterizedType52);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and objectType82.", jSType16.equals(objectType82) == objectType82.equals(jSType16));
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test571");
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
        boolean boolean79 = parameterizedType52.isStringValueType();
        com.google.javascript.rhino.jstype.ObjectType objectType80 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) parameterizedType52);
        com.google.javascript.rhino.jstype.ObjectType objectType81 = parameterizedType52.dereference();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and objectType81.", jSType16.equals(objectType81) == objectType81.equals(jSType16));
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test572");
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
        boolean boolean63 = jSTypeRegistry2.isForwardDeclaredType("function (): {proxy:{2000537501}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType32 and parameterizedType46.", jSType32.equals(parameterizedType46) == parameterizedType46.equals(jSType32));
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test573");
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
        com.google.javascript.rhino.jstype.JSType jSType60 = parameterizedType30.collapseUnion();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and jSType60.", jSType16.equals(jSType60) == jSType60.equals(jSType16));
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test574");
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
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType56 = parameterizedType30.toMaybeParameterizedType();
        com.google.javascript.rhino.jstype.ObjectType objectType57 = parameterizedType56.toObjectType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and objectType57.", jSType16.equals(objectType57) == objectType57.equals(jSType16));
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test575");
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
        boolean boolean82 = parameterizedType52.matchesStringContext();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType52.", jSType16.equals(parameterizedType52) == parameterizedType52.equals(jSType16));
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test576");
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
        java.lang.String str36 = parameterizedType30.getReferenceName();
        com.google.javascript.rhino.jstype.JSType jSType37 = parameterizedType30.getIndexType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType38 = parameterizedType30.toMaybeParameterizedType();
        com.google.javascript.rhino.jstype.JSType jSType39 = parameterizedType30.getTypeOfThis();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test577");
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
        boolean boolean70 = parameterizedType30.removeProperty("function (new:{...}): ");
        com.google.javascript.rhino.jstype.ObjectType objectType71 = parameterizedType30.toObjectType();
        com.google.javascript.rhino.Node node73 = parameterizedType30.getPropertyNode("");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test578");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList3 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node2);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList4 = cloneableList3.asList();
        boolean boolean5 = cloneableList3.isEmpty();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList6 = cloneableList3.asList();
        boolean boolean7 = cloneableList6.isEmpty();
        java.lang.Object[] objArray8 = cloneableList6.toArray();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList12 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node11);
        boolean boolean13 = cloneableList12.isEmpty();
        boolean boolean14 = cloneableList12.isEmpty();
        java.lang.Object[] objArray15 = cloneableList12.toArray();
        java.lang.Object[] objArray16 = cloneableList12.toArray();
        java.lang.Object[] objArray17 = cloneableList12.toArray();
        boolean boolean18 = cloneableList6.containsAll((java.util.Collection<java.lang.Cloneable>) cloneableList12);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean22 = node21.isFalse();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList26 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node25);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList30 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node29);
        java.lang.Cloneable[] cloneableArray31 = new java.lang.Cloneable[] { node21, node25, node29 };
        java.util.ArrayList<java.lang.Cloneable> cloneableList32 = new java.util.ArrayList<java.lang.Cloneable>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Cloneable>) cloneableList32, cloneableArray31);
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition34 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str35 = stringPosition34.getItem();
        boolean boolean36 = cloneableList32.remove((java.lang.Object) str35);
        java.util.stream.Stream<java.lang.Cloneable> cloneableStream37 = cloneableList32.stream();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList41 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node40);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList42 = cloneableList41.asList();
        boolean boolean43 = cloneableList41.isEmpty();
        boolean boolean44 = cloneableList32.retainAll((java.util.Collection<java.lang.Cloneable>) cloneableList41);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString("");
        boolean boolean47 = node46.isCatch();
        boolean boolean48 = cloneableList32.add((java.lang.Cloneable) node46);
        java.util.ListIterator<java.lang.Cloneable> cloneableItor49 = cloneableList32.listIterator();
        boolean boolean50 = cloneableList12.containsAll((java.util.Collection<java.lang.Cloneable>) cloneableList32);
        java.util.stream.Stream<java.lang.Cloneable> cloneableStream51 = cloneableList32.parallelStream();
        int int52 = cloneableList32.size();
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable84 = parameterizedType83.getCtorExtendedInterfaces();
        boolean boolean85 = parameterizedType83.isNominalType();
        boolean boolean86 = parameterizedType83.isAllType();
        boolean boolean87 = parameterizedType83.matchesNumberContext();
        boolean boolean88 = parameterizedType83.isInstanceType();
        boolean boolean89 = parameterizedType83.isNominalConstructor();
        boolean boolean90 = cloneableList32.remove((java.lang.Object) boolean89);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType69 and parameterizedType83.", jSType69.equals(parameterizedType83) == parameterizedType83.equals(jSType69));
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test579");
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
        boolean boolean82 = parameterizedType52.isUnionType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType52.", jSType16.equals(parameterizedType52) == parameterizedType52.equals(jSType16));
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test580");
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
        boolean boolean82 = parameterizedType52.isInstanceType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType52.", jSType16.equals(parameterizedType52) == parameterizedType52.equals(jSType16));
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test581");
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
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51, true);
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType55 = null;
        boolean boolean56 = jSTypeRegistry53.resetImplicitPrototype(jSType54, objectType55);
        com.google.javascript.rhino.jstype.JSType jSType61 = jSTypeRegistry53.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType62 = jSType61.dereference();
        boolean boolean63 = objectType62.isFunctionType();
        com.google.javascript.rhino.ErrorReporter errorReporter64 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter64, true);
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType68 = null;
        boolean boolean69 = jSTypeRegistry66.resetImplicitPrototype(jSType67, objectType68);
        com.google.javascript.rhino.jstype.JSType jSType74 = jSTypeRegistry66.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType75 = jSType74.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType76 = jSType74.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType77 = jSType74.restrictByNotNullOrUndefined();
        boolean boolean78 = objectType62.isSubtype(jSType77);
        boolean boolean79 = jSType77.hasDisplayName();
        com.google.javascript.rhino.jstype.JSType jSType81 = jSType77.findPropertyType("{proxy:{proxy:{649633010}}}");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet82 = jSType77.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.Node node86 = com.google.javascript.rhino.Node.newString("function (): {proxy:{427096499}}", (int) (short) 10, 32);
        boolean boolean87 = node86.isSetterDef();
        boolean boolean88 = node86.isRegExp();
        boolean boolean89 = node86.isTry();
        com.google.javascript.rhino.jstype.FunctionType functionType90 = jSTypeRegistry2.createFunctionType(jSType77, node86);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType22 and parameterizedType36.", jSType22.equals(parameterizedType36) == parameterizedType36.equals(jSType22));
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test582");
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
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType56 = parameterizedType30.toMaybeParameterizedType();
        com.google.javascript.rhino.jstype.FunctionType functionType57 = parameterizedType30.getConstructor();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test583");
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
        jSTypeRegistry2.setLastGeneration(false);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType21 and parameterizedType35.", jSType21.equals(parameterizedType35) == parameterizedType35.equals(jSType21));
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test584");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        boolean boolean7 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry2.getTypesWithProperty("{proxy:{proxy:{1921124358}}}");
        com.google.javascript.rhino.jstype.ObjectType objectType10 = jSTypeRegistry2.createAnonymousObjectType();
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
        java.util.Set set42 = parameterizedType41.getOwnPropertyNames();
        boolean boolean43 = parameterizedType41.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44, true);
        com.google.javascript.rhino.jstype.JSType jSType47 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType48 = null;
        boolean boolean49 = jSTypeRegistry46.resetImplicitPrototype(jSType47, objectType48);
        com.google.javascript.rhino.jstype.JSType jSType54 = jSTypeRegistry46.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType55 = jSType54.dereference();
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSType54.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType57 = jSType54.restrictByNotNullOrUndefined();
        boolean boolean58 = parameterizedType41.canAssignTo(jSType54);
        boolean boolean60 = parameterizedType41.isPropertyTypeInferred("");
        boolean boolean61 = parameterizedType41.isResolved();
        com.google.javascript.rhino.jstype.ObjectType objectType62 = parameterizedType41.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType64 = parameterizedType41.findPropertyType("{proxy:{proxy:{649633010}}}");
        boolean boolean65 = parameterizedType41.isNominalType();
        boolean boolean66 = parameterizedType41.isNominalType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo67 = null;
        parameterizedType41.setJSDocInfo(jSDocInfo67);
        boolean boolean70 = parameterizedType41.isPropertyTypeInferred("STRING {proxy:{proxy:{1004792283}}}\n");
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection71 = jSTypeRegistry2.getDirectImplementors((com.google.javascript.rhino.jstype.ObjectType) parameterizedType41);
        boolean boolean72 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType27 and parameterizedType41.", jSType27.equals(parameterizedType41) == parameterizedType41.equals(jSType27));
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test585");
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
        parameterizedType30.clearCachedValues();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test586");
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
        boolean boolean51 = functionType50.isNumberValueType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType22 and parameterizedType36.", jSType22.equals(parameterizedType36) == parameterizedType36.equals(jSType22));
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test587");
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
        com.google.javascript.rhino.InputId inputId22 = new com.google.javascript.rhino.InputId("function (): {proxy:{410214344}}");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition23 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean24 = typePosition23.hasBrackets();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition25 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean26 = typePosition25.hasBrackets();
        boolean boolean27 = typePosition25.hasBrackets();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition28 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        typePosition28.setPositionInformation(15, 43, 49, 36);
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition34 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean35 = typePosition34.hasBrackets();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition36 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean37 = typePosition36.hasBrackets();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition38 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int39 = namePosition38.getStartLine();
        int int40 = namePosition38.getPositionOnEndLine();
        int int41 = namePosition38.getPositionOnStartLine();
        int int42 = namePosition38.getStartLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition43 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>> nodeSourcePositionList44 = com.google.common.collect.ImmutableList.of((com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>) namePosition38, (com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>) typePosition43);
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.TypePosition> typePositionList45 = com.google.common.collect.ImmutableList.of(typePosition23, typePosition25, typePosition28, typePosition34, typePosition36, typePosition43);
        boolean boolean46 = inputId22.equals((java.lang.Object) typePosition36);
        java.lang.String str47 = inputId22.toString();
        node3.setInputId(inputId22);
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
        boolean boolean81 = parameterizedType79.isNominalType();
        boolean boolean82 = inputId22.equals((java.lang.Object) parameterizedType79);
        java.lang.String str83 = inputId22.getIdName();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType65 and parameterizedType79.", jSType65.equals(parameterizedType79) == parameterizedType79.equals(jSType65));
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test588");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        boolean boolean5 = jSTypeRegistry2.resetImplicitPrototype(jSType3, objectType4);
        com.google.javascript.rhino.jstype.JSType jSType10 = jSTypeRegistry2.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = jSType10.dereference();
        java.lang.String str12 = objectType11.getDisplayName();
        boolean boolean14 = objectType11.removeProperty("{proxy:{proxy:{1321644185}}}");
        java.lang.String str15 = objectType11.getDisplayName();
        int int16 = objectType11.getPropertiesCount();
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable48 = parameterizedType47.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType49 = parameterizedType47.dereference();
        boolean boolean50 = objectType11.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType49);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on objectType11 and objectType49.", objectType11.equals(objectType49) == objectType49.equals(objectType11));
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test589");
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
        node6.setOptionalArg(false);
        boolean boolean25 = node6.isBreak();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean33 = node32.isFalse();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean37 = node36.isTrue();
        boolean boolean38 = node36.hasOneChild();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        boolean boolean42 = node41.isTrue();
        boolean boolean43 = node41.isBreak();
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((int) (byte) 1, node29, node32, node36, node41, (int) (byte) 1, 4095);
        boolean boolean47 = node32.isParamList();
        boolean boolean48 = node32.isSyntheticBlock();
        boolean boolean49 = node32.isCatch();
        com.google.javascript.rhino.Node node50 = node32.cloneNode();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "hi!");
        java.lang.Object obj55 = node53.getProp((int) (byte) 100);
        boolean boolean56 = node53.isArrayLit();
        int int57 = node53.getSourceOffset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node6.replaceChild(node32, node53);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test590");
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
        boolean boolean50 = parameterizedType30.isNullType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test591");
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
        boolean boolean53 = jSType52.isInterface();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test592");
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
        jSTypeRegistry15.setLastGeneration(false);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = null;
        boolean boolean26 = jSTypeRegistry23.resetImplicitPrototype(jSType24, objectType25);
        com.google.javascript.rhino.jstype.JSType jSType31 = jSTypeRegistry23.createNamedType("", "", (int) (short) 100, (int) (short) 10);
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSType31.dereference();
        boolean boolean33 = objectType32.isFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry15.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType) objectType32);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable36 = jSTypeRegistry15.getEachReferenceTypeWithProperty("({proxy:{proxy:{1874555938}}})");
        com.google.javascript.rhino.ErrorReporter errorReporter37 = jSTypeRegistry15.getErrorReporter();
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
        boolean boolean72 = parameterizedType68.isOrdinaryFunction();
        boolean boolean73 = parameterizedType68.isInstanceType();
        com.google.javascript.rhino.jstype.JSType jSType75 = parameterizedType68.getPropertyType("{proxy:{proxy:{628733757}}}");
        boolean boolean76 = parameterizedType68.isFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType78 = parameterizedType68.findPropertyType("function (): {proxy:{1288677244}}");
        boolean boolean79 = parameterizedType68.hasReferenceName();
        boolean boolean80 = parameterizedType68.canBeCalled();
        boolean boolean82 = jSTypeRegistry15.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) parameterizedType68, "function (): {proxy:{333019360}}");
        com.google.javascript.rhino.jstype.ObjectType objectType83 = jSTypeRegistry2.createObjectType((com.google.javascript.rhino.jstype.ObjectType) parameterizedType68);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable85 = jSTypeRegistry2.getTypesWithProperty("java.io.IOException: function (): {proxy:{10439819}}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType10 and parameterizedType68.", jSType10.equals(parameterizedType68) == parameterizedType68.equals(jSType10));
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test593");
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
        boolean boolean69 = cloneableList3.isEmpty();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType24 and parameterizedType38.", jSType24.equals(parameterizedType38) == parameterizedType38.equals(jSType24));
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test594");
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
        boolean boolean44 = parameterizedType36.canBeCalled();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType22 and parameterizedType36.", jSType22.equals(parameterizedType36) == parameterizedType36.equals(jSType22));
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test595");
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
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet58 = parameterizedType30.getPossibleToBooleanOutcomes();
        boolean boolean60 = booleanLiteralSet58.contains(false);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test596");
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
        boolean boolean81 = parameterizedType80.isParameterizedType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType80.", jSType16.equals(parameterizedType80) == parameterizedType80.equals(jSType16));
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test597");
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
        boolean boolean85 = parameterizedType84.isStringValueType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType12 and parameterizedType84.", jSType12.equals(parameterizedType84) == parameterizedType84.equals(jSType12));
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test598");
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
        boolean boolean80 = parameterizedType52.isPropertyInExterns("{proxy:{proxy:{644991102}}}");
        com.google.javascript.rhino.jstype.ObjectType objectType81 = parameterizedType52.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType82 = parameterizedType52.collapseUnion();
        parameterizedType52.clearResolved();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType52.", jSType16.equals(parameterizedType52) == parameterizedType52.equals(jSType16));
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test599");
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
        boolean boolean44 = parameterizedType35.isInstanceType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType21 and parameterizedType35.", jSType21.equals(parameterizedType35) == parameterizedType35.equals(jSType21));
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test600");
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
        boolean boolean92 = parameterizedType83.isInterface();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on jSType16 and parameterizedType30.", jSType16.equals(parameterizedType30) == parameterizedType30.equals(jSType16));
    }
}


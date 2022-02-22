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
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("((hi!))");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node5 = node4.getParent();
        boolean boolean6 = node4.isArrayLit();
        node4.setType(54);
        com.google.javascript.rhino.Node node9 = node4.getNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node10 = node1.getChildBefore(node4);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 36, (int) (short) 0);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean7 = node6.hasChildren();
        node6.setOptionalArg(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node10 = node3.getChildBefore(node6);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable3 = node2.siblings();
        boolean boolean4 = node2.isAssign();
        com.google.javascript.rhino.Node node5 = node2.cloneTree();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString(36, "JSDocInfo", 2, 0);
        boolean boolean11 = node10.isObjectLit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node5.removeChild(node10);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("Not declared as a type name", 42, 40);
        int int4 = node3.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node6 = node3.getChildAtIndex(46);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "Not declared as a constructor", "Unknown class name", "Not declared as a type name", "Not declared as a type name" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        java.util.Iterator<java.lang.String> strItor8 = strSet6.iterator();
        java.lang.String[] strArray12 = new java.lang.String[] { "Not declared as a type name", "(hi!)", "Not declared as a type name" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        java.lang.String[] strArray24 = new java.lang.String[] { "[class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode]", "Not declared as a constructor", "((hi!))", "hi!", "JSDocInfo", "((hi!))", "Not declared as a type name", "Not declared as a constructor", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        java.lang.Object[] objArray27 = strSet25.toArray();
        java.lang.String[] strArray33 = new java.lang.String[] { "", "Not declared as a constructor", "Unknown class name", "Not declared as a type name", "Not declared as a type name" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        java.util.Iterator<java.lang.String> strItor36 = strSet34.iterator();
        com.google.common.collect.ImmutableList<java.util.AbstractSet<java.lang.String>> strSetList37 = com.google.common.collect.ImmutableList.of((java.util.AbstractSet<java.lang.String>) strSet6, (java.util.AbstractSet<java.lang.String>) strSet13, (java.util.AbstractSet<java.lang.String>) strSet25, (java.util.AbstractSet<java.lang.String>) strSet34);
        boolean boolean38 = strSet34.isEmpty();
        java.util.Spliterator<java.lang.String> strSpliterator39 = strSet34.spliterator();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean44 = node43.hasChildren();
        boolean boolean45 = node43.isAssignAdd();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder46 = node43.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(41, node43);
        boolean boolean48 = strSet34.equals((java.lang.Object) node43);
        boolean boolean49 = node43.isSetterDef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node51 = node43.getChildAtIndex(35);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node3 = node2.getParent();
        boolean boolean4 = node2.isArrayLit();
        node2.setOptionalArg(true);
        boolean boolean7 = node2.isNot();
        boolean boolean8 = node2.isLocalResultCall();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(50);
        boolean boolean11 = node10.isScript();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.removeChild(node10);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("Not declared as a type name", 42, 40);
        boolean boolean4 = node3.isInc();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node6 = node3.getChildAtIndex((int) (short) 100);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(39, "", 32, 1);
        boolean boolean5 = node4.isIf();
        int int6 = node4.getLength();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean10 = node9.isContinue();
        boolean boolean12 = node9.getBooleanProp((int) (byte) 100);
        boolean boolean13 = node9.isVarArgs();
        com.google.javascript.rhino.Node node14 = node4.clonePropsFrom(node9);
        boolean boolean15 = node4.isFor();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean19 = node18.hasChildren();
        boolean boolean20 = node18.isAssignAdd();
        boolean boolean21 = node18.isDebugger();
        boolean boolean22 = node18.isFromExterns();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile23 = node18.getStaticSourceFile();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder24 = node18.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node28 = node27.getParent();
        boolean boolean29 = node27.isArrayLit();
        boolean boolean30 = node27.isThrow();
        boolean boolean31 = node27.isInstanceOf();
        boolean boolean32 = node27.isSwitch();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.replaceChild(node18, node27);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.hasChildren();
        boolean boolean4 = node2.isAssignAdd();
        boolean boolean5 = node2.isFalse();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node7 = node2.getChildAtIndex(49);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(42, 43, 45);
        node3.setSourceEncodedPositionForTree(100);
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection7 = jSDocInfo6.getMarkers();
        java.lang.String str8 = jSDocInfo6.getDeprecationReason();
        java.lang.String str9 = jSDocInfo6.getLicense();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = jSDocInfo6.getThisType();
        java.lang.String str11 = jSDocInfo6.toString();
        node3.setJSDocInfo(jSDocInfo6);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) ' ', 8, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node16);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(44, "java.io.IOException: OR \n", 54, 4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (short) 10);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(29, "java.io.IOException: (hi!)", (int) '#', 37);
        int int5 = node4.getType();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean10 = node9.hasChildren();
        com.google.javascript.rhino.Node node11 = node9.getLastSibling();
        node11.setSourceFileForTesting("Not declared as a type name");
        boolean boolean14 = node11.isWith();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(100, node11, 51, 10);
        boolean boolean18 = node17.isDebugger();
        com.google.javascript.rhino.Node node19 = node17.getNext();
        int int20 = node17.getType();
        com.google.javascript.rhino.Node node21 = node17.cloneTree();
        node17.setSourceEncodedPosition(36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node24 = node4.getChildBefore(node17);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) -1, (int) (byte) 10, (int) ' ');
        boolean boolean4 = node3.isThrow();
        boolean boolean5 = node3.isIn();
        boolean boolean7 = node3.getBooleanProp(32);
        boolean boolean8 = node3.isNE();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node12 = node11.getParent();
        com.google.javascript.rhino.Node node14 = node11.getAncestor((int) (short) 0);
        node14.setType(50);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder17 = node14.getJsDocBuilderForNode();
        boolean boolean18 = node14.isDo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node19 = node3.getChildBefore(node14);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(4095, 50, 47);
        boolean boolean4 = node3.isReturn();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node6 = node3.getChildAtIndex(15);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(35, "java.io.IOException: java.io.IOException: Named type with empty name component", (int) (byte) 0, 41);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean8 = node7.isContinue();
        boolean boolean9 = node7.isNE();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node10 = node4.getChildBefore(node7);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("java.io.IOException: Named type with empty name component", (int) (short) 10, 41);
        boolean boolean4 = node3.isAnd();
        boolean boolean5 = node3.isWith();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean9 = node8.hasChildren();
        boolean boolean10 = node8.isAssignAdd();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean12 = jSDocInfo11.isNoShadow();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList13 = jSDocInfo11.getImplementedInterfaces();
        node8.setJSDocInfo(jSDocInfo11);
        boolean boolean15 = node8.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node16 = node3.getChildBefore(node8);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(47);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString((int) (byte) 0, "hi!", 38, 10);
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(46, node7);
        boolean boolean9 = node8.isGetProp();
        boolean boolean10 = node8.isFor();
        boolean boolean11 = node8.isWith();
        boolean boolean12 = node8.isQualifiedName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node13 = node1.getChildBefore(node8);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "Not declared as a constructor", "Unknown class name", "Not declared as a type name", "Not declared as a type name" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        java.util.Iterator<java.lang.String> strItor8 = strSet6.iterator();
        java.lang.String[] strArray12 = new java.lang.String[] { "Not declared as a type name", "(hi!)", "Not declared as a type name" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        java.lang.String[] strArray24 = new java.lang.String[] { "[class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode]", "Not declared as a constructor", "((hi!))", "hi!", "JSDocInfo", "((hi!))", "Not declared as a type name", "Not declared as a constructor", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        java.lang.Object[] objArray27 = strSet25.toArray();
        java.lang.String[] strArray33 = new java.lang.String[] { "", "Not declared as a constructor", "Unknown class name", "Not declared as a type name", "Not declared as a type name" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        java.util.Iterator<java.lang.String> strItor36 = strSet34.iterator();
        com.google.common.collect.ImmutableList<java.util.AbstractSet<java.lang.String>> strSetList37 = com.google.common.collect.ImmutableList.of((java.util.AbstractSet<java.lang.String>) strSet6, (java.util.AbstractSet<java.lang.String>) strSet13, (java.util.AbstractSet<java.lang.String>) strSet25, (java.util.AbstractSet<java.lang.String>) strSet34);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean41 = node40.isContinue();
        boolean boolean42 = node40.isStringKey();
        node40.addSuppression("");
        boolean boolean45 = strSet34.equals((java.lang.Object) node40);
        boolean boolean46 = node40.isOnlyModifiesThisCall();
        java.util.Set<java.lang.String> strSet47 = node40.getDirectives();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString(39, "JSDocInfo", 2, (int) (byte) 10);
        boolean boolean53 = node52.isString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node54 = node40.getChildBefore(node52);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) -1, (int) (byte) 10, (int) ' ');
        boolean boolean4 = node3.isThrow();
        boolean boolean5 = node3.isGetElem();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node7 = node3.getChildAtIndex(1);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(47);
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node((int) (byte) 10, 42, 4095);
        node5.setVarArgs(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node8 = node1.getChildBefore(node5);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(49, "Not declared as a constructor");
        boolean boolean3 = node2.isThrow();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean7 = node6.hasChildren();
        com.google.javascript.rhino.Node node8 = node6.getLastSibling();
        boolean boolean9 = node8.isStringKey();
        boolean boolean10 = node8.isCall();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.removeChild(node8);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.hasChildren();
        boolean boolean4 = node2.isAssignAdd();
        boolean boolean5 = node2.isDebugger();
        boolean boolean6 = node2.isFromExterns();
        node2.setSourceEncodedPosition(35);
        boolean boolean9 = node2.isSetterDef();
        boolean boolean11 = node2.getBooleanProp(51);
        boolean boolean12 = node2.isRegExp();
        node2.setCharno(36);
        boolean boolean15 = node2.isTry();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean20 = node19.hasChildren();
        com.google.javascript.rhino.Node node21 = node19.getParent();
        boolean boolean22 = node19.isGetElem();
        boolean boolean23 = node19.isDebugger();
        com.google.javascript.rhino.Node[] nodeArray26 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(40, nodeArray26);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (byte) 10, nodeArray26);
        java.lang.String str32 = node28.toString(true, true, false);
        boolean boolean33 = node28.isDelProp();
        boolean boolean34 = node28.isLabel();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (short) 10, node19, node28, 4095, 4095);
        boolean boolean38 = node19.isNE();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node39 = node2.getChildBefore(node19);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean4 = node3.hasChildren();
        boolean boolean5 = node3.isAssignAdd();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder6 = node3.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(41, node3);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("InputId: [class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode]", 48, (int) (short) -1);
        boolean boolean12 = node11.isFunction();
        com.google.javascript.rhino.jstype.JSType jSType13 = node11.getJSType();
        int int14 = node11.getChildCount();
        boolean boolean15 = node11.isQuotedString();
        com.google.javascript.rhino.Node node16 = node3.srcrefTree(node11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node18 = node3.getChildAtIndex(4);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(2, "java.io.IOException", 29, (int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex(1);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isQuotedString();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node6 = node5.getParent();
        boolean boolean7 = node5.isArrayLit();
        node5.setOptionalArg(true);
        int int10 = node5.getType();
        boolean boolean11 = node5.isWhile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node12 = node1.getChildBefore(node5);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        java.util.Set<java.lang.String> strSet2 = jSDocInfo0.getModifies();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue5 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = ternaryValue5.and(ternaryValue7);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = ternaryValue9.and(ternaryValue11);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = ternaryValue5.or(ternaryValue9);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue14 = ternaryValue4.and(ternaryValue9);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue18 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue19 = ternaryValue16.and(ternaryValue18);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue20 = ternaryValue16.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue21 = ternaryValue15.or(ternaryValue20);
        com.google.javascript.rhino.jstype.TernaryValue[] ternaryValueArray22 = new com.google.javascript.rhino.jstype.TernaryValue[] { ternaryValue14, ternaryValue15 };
        com.google.javascript.rhino.jstype.TernaryValue[] ternaryValueArray23 = strSet2.toArray(ternaryValueArray22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.TernaryValue> ternaryValueList24 = com.google.common.collect.ImmutableList.of(ternaryValueArray22);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        com.google.javascript.rhino.Node[] nodeArray5 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(40, nodeArray5);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(48, nodeArray5);
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((int) '#', nodeArray5);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(0, nodeArray5);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(51, nodeArray5, 44, (int) ' ');
        node12.setCharno(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node16 = node12.getChildAtIndex(50);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean5 = node4.hasChildren();
        com.google.javascript.rhino.Node node6 = node4.getLastSibling();
        node6.setSourceFileForTesting("Not declared as a type name");
        boolean boolean9 = node6.isWith();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(100, node6, 51, 10);
        boolean boolean13 = node12.isDebugger();
        com.google.javascript.rhino.Node node14 = node12.getNext();
        int int15 = node12.getType();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(30, node12, (-2147483648), (int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node20 = node18.getChildAtIndex(18);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.hasChildren();
        boolean boolean4 = node2.isAssignAdd();
        boolean boolean5 = node2.isFalse();
        com.google.javascript.rhino.Node[] nodeArray10 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(40, nodeArray10);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(48, nodeArray10);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) 0, nodeArray10);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(36, nodeArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node15 = node2.getChildBefore(node14);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node3 = node2.getParent();
        boolean boolean4 = node2.isArrayLit();
        boolean boolean5 = node2.isThrow();
        boolean boolean6 = node2.isInc();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(47, (int) (byte) 100, 45);
        com.google.javascript.rhino.Node node11 = node2.useSourceInfoIfMissingFromForTree(node10);
        com.google.javascript.rhino.Node node13 = node10.getChildAtIndex((-2147483648));
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) 48, 12, 5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node10.removeChild(node17);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber(1.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node3 = node1.getChildAtIndex(2);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        java.util.Set<java.lang.String> strSet2 = jSDocInfo0.getParameterNames();
        boolean boolean3 = jSDocInfo0.isDeprecated();
        java.lang.String str4 = jSDocInfo0.getReturnDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getType();
        boolean boolean6 = jSDocInfo0.isExport();
        java.util.Set<java.lang.String> strSet7 = jSDocInfo0.getParameterNames();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("[class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode]", 0, 15);
        boolean boolean12 = strSet7.contains((java.lang.Object) 0);
        com.google.javascript.rhino.Node[][] nodeArray13 = new com.google.javascript.rhino.Node[][] {};
        com.google.javascript.rhino.Node[][] nodeArray14 = new com.google.javascript.rhino.Node[][] {};
        com.google.javascript.rhino.Node[][][] nodeArray15 = new com.google.javascript.rhino.Node[][][] { nodeArray13, nodeArray14 };
        com.google.javascript.rhino.Node[][][] nodeArray16 = strSet7.toArray(nodeArray15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.Node[][]> nodeArrayList17 = com.google.common.collect.ImmutableList.of(nodeArray16);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, 47, 4095);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node5 = node3.getChildAtIndex(51);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node3 = node2.getParent();
        boolean boolean4 = node2.isArrayLit();
        node2.setOptionalArg(true);
        com.google.javascript.rhino.jstype.JSType jSType7 = node2.getJSType();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile8 = node2.getStaticSourceFile();
        boolean boolean9 = node2.isWith();
        boolean boolean10 = node2.isObjectLit();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean14 = node13.isNot();
        boolean boolean15 = node13.isExprResult();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.removeChild(node13);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isContinue();
        boolean boolean5 = node2.getBooleanProp((int) (byte) 100);
        boolean boolean6 = node2.isString();
        boolean boolean7 = node2.isNoSideEffectsCall();
        boolean boolean8 = node2.isDebugger();
        boolean boolean9 = node2.isNull();
        int int10 = node2.getCharno();
        boolean boolean11 = node2.isCatch();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean15 = node14.isContinue();
        boolean boolean16 = node14.isFromExterns();
        int int18 = node14.getIntProp(15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.removeChild(node14);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node3 = node1.getChildAtIndex(41);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(29, (int) (short) 1, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node5 = node3.getChildAtIndex(3);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.hasChildren();
        boolean boolean4 = node2.isAssignAdd();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean6 = jSDocInfo5.isNoShadow();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo5.getImplementedInterfaces();
        node2.setJSDocInfo(jSDocInfo5);
        java.lang.String str9 = jSDocInfo5.getMeaning();
        com.google.javascript.rhino.Node node10 = jSDocInfo5.getAssociatedNode();
        java.lang.String str11 = jSDocInfo5.getFileOverview();
        boolean boolean12 = jSDocInfo5.isDefine();
        java.lang.String str13 = jSDocInfo5.getFileOverview();
        java.util.Set<java.lang.String> strSet14 = jSDocInfo5.getSuppressions();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue18 = ternaryValue15.and(ternaryValue17);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue20 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(false);
        java.lang.String str21 = ternaryValue20.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue25 = ternaryValue22.and(ternaryValue24);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue26 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue28 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue29 = ternaryValue26.and(ternaryValue28);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue30 = ternaryValue22.or(ternaryValue26);
        boolean boolean32 = ternaryValue22.toBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue33 = ternaryValue20.xor(ternaryValue22);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue34 = ternaryValue17.and(ternaryValue33);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue35 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue37 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue38 = ternaryValue35.and(ternaryValue37);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue39 = ternaryValue35.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue40 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue41 = ternaryValue35.or(ternaryValue40);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue42 = ternaryValue34.and(ternaryValue35);
        boolean boolean43 = strSet14.remove((java.lang.Object) ternaryValue34);
        java.util.Iterator<java.lang.String> strItor44 = strSet14.iterator();
        boolean boolean45 = strSet14.isEmpty();
        com.google.common.collect.UnmodifiableListIterator[] unmodifiableListIteratorArray47 = new com.google.common.collect.UnmodifiableListIterator[0];
        @SuppressWarnings("unchecked")
        com.google.common.collect.UnmodifiableListIterator<java.lang.reflect.Type>[] typeItorArray48 = (com.google.common.collect.UnmodifiableListIterator<java.lang.reflect.Type>[]) unmodifiableListIteratorArray47;
        com.google.common.collect.UnmodifiableListIterator[][] unmodifiableListIteratorArray50 = new com.google.common.collect.UnmodifiableListIterator[1][];
        @SuppressWarnings("unchecked")
        com.google.common.collect.UnmodifiableListIterator<java.lang.reflect.Type>[][] typeItorArray51 = (com.google.common.collect.UnmodifiableListIterator<java.lang.reflect.Type>[][]) unmodifiableListIteratorArray50;
        typeItorArray51[0] = unmodifiableListIteratorArray47;
        com.google.common.collect.UnmodifiableListIterator<java.lang.reflect.Type>[][] typeItorArray54 = strSet14.toArray(typeItorArray51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.common.collect.ImmutableList<com.google.common.collect.UnmodifiableListIterator<java.lang.reflect.Type>[]> typeItorArrayList55 = com.google.common.collect.ImmutableList.of(typeItorArray51);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        com.google.javascript.rhino.Node[] nodeArray2 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(40, nodeArray2);
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (byte) 10, nodeArray2);
        java.lang.String str8 = node4.toString(true, true, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node10 = node4.getChildAtIndex(37);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        com.google.javascript.rhino.Node[] nodeArray5 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((-1), nodeArray5, 1, (int) '#');
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(49, nodeArray5, 48, (int) (byte) 0);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(45, nodeArray5, 40, (int) 'a');
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(32, nodeArray5);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(54, nodeArray5, 0, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node20 = node18.getChildAtIndex(28);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoShadow();
        boolean boolean2 = jSDocInfo0.isConstant();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getParameterType("hi!");
        boolean boolean5 = jSDocInfo0.isConsistentIdGenerator();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility6 = jSDocInfo0.getVisibility();
        boolean boolean7 = jSDocInfo0.hasBaseType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getType();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("Named type with empty name component");
        com.google.javascript.rhino.Node node11 = node10.getLastSibling();
        jSDocInfo0.setAssociatedNode(node11);
        int int13 = node11.getSourcePosition();
        boolean boolean14 = node11.isGetProp();
        boolean boolean15 = node11.isNull();
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>> nodeSourcePositionBuilder16 = new com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>>();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition17 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int18 = typePosition17.getEndLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition19 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int20 = typePosition19.getEndLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition21 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int22 = typePosition21.getEndLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition23 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition24 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int25 = typePosition24.getEndLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition26 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.TypePosition> typePositionList27 = com.google.common.collect.ImmutableList.of(typePosition17, typePosition19, typePosition21, typePosition23, typePosition24, typePosition26);
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition28 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int29 = typePosition28.getEndLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition30 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int31 = typePosition30.getEndLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition32 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int33 = typePosition32.getEndLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition34 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition35 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int36 = typePosition35.getEndLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition37 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.TypePosition> typePositionList38 = com.google.common.collect.ImmutableList.of(typePosition28, typePosition30, typePosition32, typePosition34, typePosition35, typePosition37);
        com.google.javascript.rhino.SourcePosition[] sourcePositionArray40 = new com.google.javascript.rhino.SourcePosition[2];
        @SuppressWarnings("unchecked")
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>[] nodeSourcePositionArray41 = (com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>[]) sourcePositionArray40;
        nodeSourcePositionArray41[0] = typePosition23;
        nodeSourcePositionArray41[1] = typePosition37;
        com.google.common.collect.ImmutableCollection.Builder<com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>> nodeSourcePositionBuilder46 = nodeSourcePositionBuilder16.add(nodeSourcePositionArray41);
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition47 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int48 = typePosition47.getEndLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition49 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int50 = typePosition49.getEndLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition51 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int52 = typePosition51.getEndLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition53 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition54 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int55 = typePosition54.getEndLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition56 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.TypePosition> typePositionList57 = com.google.common.collect.ImmutableList.of(typePosition47, typePosition49, typePosition51, typePosition53, typePosition54, typePosition56);
        com.google.common.collect.ImmutableCollection.Builder<com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>> nodeSourcePositionBuilder58 = nodeSourcePositionBuilder46.add((com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>) typePosition56);
        int int59 = typePosition56.getEndLine();
        int int60 = typePosition56.getStartLine();
        boolean boolean61 = typePosition56.hasBrackets();
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean65 = node64.hasChildren();
        com.google.javascript.rhino.Node node66 = node64.getParent();
        boolean boolean67 = node64.isGetElem();
        boolean boolean68 = node64.isFromExterns();
        node64.setType(29);
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean74 = node73.isNot();
        boolean boolean75 = node73.isGetterDef();
        com.google.javascript.rhino.Node node76 = node64.useSourceInfoFrom(node73);
        typePosition56.setItem(node64);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node78 = node11.getChildBefore(node64);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        java.util.Set<java.lang.String> strSet2 = jSDocInfo0.getParameterNames();
        boolean boolean3 = jSDocInfo0.isDeprecated();
        java.lang.String str4 = jSDocInfo0.getReturnDescription();
        boolean boolean5 = jSDocInfo0.isConstructor();
        boolean boolean6 = jSDocInfo0.shouldPreserveTry();
        java.lang.String str8 = jSDocInfo0.getDescriptionForParameter("([class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode])");
        java.util.Set<java.lang.String> strSet9 = jSDocInfo0.getParameterNames();
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>> nodeSourcePositionBuilder10 = new com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>>();
        com.google.common.collect.ImmutableCollection<com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>> nodeSourcePositionCollection11 = nodeSourcePositionBuilder10.build();
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>> nodeSourcePositionBuilder12 = new com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>>();
        com.google.common.collect.ImmutableCollection<com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>> nodeSourcePositionCollection13 = nodeSourcePositionBuilder12.build();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition14 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int15 = typePosition14.getEndLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition16 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int17 = typePosition16.getEndLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition18 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int19 = typePosition18.getEndLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition20 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition21 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int22 = typePosition21.getEndLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition23 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.TypePosition> typePositionList24 = com.google.common.collect.ImmutableList.of(typePosition14, typePosition16, typePosition18, typePosition20, typePosition21, typePosition23);
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition25 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int26 = typePosition25.getEndLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition27 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int28 = typePosition27.getEndLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition29 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int30 = typePosition29.getEndLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition31 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition32 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int33 = typePosition32.getEndLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition34 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.TypePosition> typePositionList35 = com.google.common.collect.ImmutableList.of(typePosition25, typePosition27, typePosition29, typePosition31, typePosition32, typePosition34);
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition36 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int37 = typePosition36.getEndLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition38 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int39 = typePosition38.getEndLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition40 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int41 = typePosition40.getEndLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition42 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition43 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int44 = typePosition43.getEndLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition45 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.TypePosition> typePositionList46 = com.google.common.collect.ImmutableList.of(typePosition36, typePosition38, typePosition40, typePosition42, typePosition43, typePosition45);
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition47 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int48 = typePosition47.getEndLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition49 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int50 = typePosition49.getEndLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition51 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int52 = typePosition51.getEndLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition53 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition54 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int55 = typePosition54.getEndLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition56 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.TypePosition> typePositionList57 = com.google.common.collect.ImmutableList.of(typePosition47, typePosition49, typePosition51, typePosition53, typePosition54, typePosition56);
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition58 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int59 = typePosition58.getEndLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition60 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int61 = typePosition60.getEndLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition62 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int63 = typePosition62.getEndLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition64 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition65 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int66 = typePosition65.getEndLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition67 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.TypePosition> typePositionList68 = com.google.common.collect.ImmutableList.of(typePosition58, typePosition60, typePosition62, typePosition64, typePosition65, typePosition67);
        typePosition58.setPositionInformation((int) ' ', (int) ' ', (int) (byte) 100, 31);
        com.google.javascript.rhino.SourcePosition[] sourcePositionArray75 = new com.google.javascript.rhino.SourcePosition[5];
        @SuppressWarnings("unchecked")
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>[] nodeSourcePositionArray76 = (com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>[]) sourcePositionArray75;
        nodeSourcePositionArray76[0] = typePosition20;
        nodeSourcePositionArray76[1] = typePosition27;
        nodeSourcePositionArray76[2] = typePosition38;
        nodeSourcePositionArray76[3] = typePosition47;
        nodeSourcePositionArray76[4] = typePosition58;
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>> nodeSourcePositionBuilder87 = nodeSourcePositionBuilder12.add(nodeSourcePositionArray76);
        com.google.common.collect.ImmutableCollection.Builder<com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>> nodeSourcePositionBuilder88 = nodeSourcePositionBuilder10.add(nodeSourcePositionArray76);
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>[] nodeSourcePositionArray89 = strSet9.toArray(nodeSourcePositionArray76);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>> nodeSourcePositionList90 = com.google.common.collect.ImmutableList.of(nodeSourcePositionArray76);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(41, "java.io.IOException: Named type with empty name component", 30, (int) (short) 100);
        boolean boolean5 = node4.isCase();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("InputId: [class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode]", 48, (int) (short) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(12, node10, 18, 50);
        boolean boolean14 = node13.isFunction();
        boolean boolean15 = node13.isSetterDef();
        com.google.javascript.rhino.Node node16 = node4.srcrefTree(node13);
        com.google.javascript.rhino.Node node17 = node13.removeFirstChild();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean21 = node20.hasChildren();
        com.google.javascript.rhino.Node node22 = node20.getLastSibling();
        int int23 = node20.getLineno();
        boolean boolean24 = node20.isTry();
        com.google.javascript.rhino.InputId inputId25 = node20.getInputId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node13.removeChild(node20);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        boolean boolean2 = node1.isCase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node4 = node1.getChildAtIndex(100);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("Named type with empty name component");
        com.google.javascript.rhino.Node node2 = node1.getLastSibling();
        node2.setVarArgs(true);
        boolean boolean5 = node2.isReturn();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node9 = node8.getParent();
        com.google.javascript.rhino.Node node11 = node8.getAncestor((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.removeChild(node8);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isContinue();
        boolean boolean4 = node2.isNE();
        boolean boolean5 = node2.isVoid();
        boolean boolean6 = node2.isArrayLit();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(40, 53, 4);
        boolean boolean11 = node2.isEquivalentToTyped(node10);
        boolean boolean12 = node10.isHook();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(45, "([class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode])");
        com.google.javascript.rhino.jstype.JSType jSType17 = node16.getJSType();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(44, node16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node19 = node10.getChildBefore(node16);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        com.google.javascript.rhino.Node[] nodeArray3 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((-1), nodeArray3, 1, (int) '#');
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(49, nodeArray3, 48, (int) (byte) 0);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(5, nodeArray3);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (short) 100, "false", 39, (int) (byte) -1);
        com.google.javascript.rhino.Node node16 = node10.copyInformationFromForTree(node15);
        boolean boolean17 = node10.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean21 = node20.hasChildren();
        com.google.javascript.rhino.Node node22 = node20.getLastSibling();
        com.google.javascript.rhino.Node node23 = node22.getLastChild();
        com.google.javascript.rhino.Node node24 = node22.getLastSibling();
        java.lang.String str25 = node24.getQualifiedName();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable26 = node24.siblings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node10.removeChild(node24);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node3 = node2.getParent();
        boolean boolean4 = node2.isArrayLit();
        com.google.common.collect.ImmutableList.Builder<java.lang.Throwable> throwableBuilder6 = new com.google.common.collect.ImmutableList.Builder<java.lang.Throwable>();
        node2.putProp(50, (java.lang.Object) throwableBuilder6);
        java.util.Set<java.lang.String> strSet8 = node2.getDirectives();
        node2.setLength((int) (byte) 100);
        boolean boolean11 = node2.isDebugger();
        int int12 = node2.getSourceOffset();
        boolean boolean13 = node2.isWith();
        boolean boolean14 = node2.isStringKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node16 = node2.getChildAtIndex(53);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.hasChildren();
        boolean boolean4 = node2.isAssignAdd();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean6 = jSDocInfo5.isNoShadow();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo5.getImplementedInterfaces();
        node2.setJSDocInfo(jSDocInfo5);
        boolean boolean9 = node2.isBlock();
        boolean boolean10 = node2.isQualifiedName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node12 = node2.getChildAtIndex(73778);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("InputId: [class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode]", 48, (int) (short) -1);
        boolean boolean4 = node3.isFunction();
        boolean boolean5 = node3.isSwitch();
        boolean boolean6 = node3.isLabelName();
        node3.putIntProp(1, 44);
        boolean boolean10 = node3.isInstanceOf();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node12 = node3.getChildAtIndex(12289);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node3 = node2.getParent();
        boolean boolean4 = node2.isArrayLit();
        boolean boolean5 = node2.isLocalResultCall();
        boolean boolean6 = node2.isRegExp();
        boolean boolean7 = node2.isNew();
        boolean boolean8 = node2.isString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node10 = node2.getChildAtIndex(45);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        java.util.Set<java.lang.String> strSet2 = jSDocInfo0.getModifies();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue5 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = ternaryValue5.and(ternaryValue7);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = ternaryValue9.and(ternaryValue11);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = ternaryValue5.or(ternaryValue9);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue14 = ternaryValue4.and(ternaryValue9);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue18 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue19 = ternaryValue16.and(ternaryValue18);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue20 = ternaryValue16.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue21 = ternaryValue15.or(ternaryValue20);
        com.google.javascript.rhino.jstype.TernaryValue[] ternaryValueArray22 = new com.google.javascript.rhino.jstype.TernaryValue[] { ternaryValue14, ternaryValue15 };
        com.google.javascript.rhino.jstype.TernaryValue[] ternaryValueArray23 = strSet2.toArray(ternaryValueArray22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.TernaryValue> ternaryValueList24 = com.google.common.collect.ImmutableList.copyOf(ternaryValueArray23);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isContinue();
        boolean boolean4 = node2.isNE();
        java.lang.String str5 = node2.getString();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString(100, "");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.siblings();
        boolean boolean10 = node8.isDelProp();
        com.google.javascript.rhino.Node node11 = node8.getParent();
        com.google.javascript.rhino.Node node12 = node8.getLastSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node13 = node2.getChildBefore(node12);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.hasChildren();
        boolean boolean4 = node2.isAssignAdd();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean6 = jSDocInfo5.isNoShadow();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo5.getImplementedInterfaces();
        node2.setJSDocInfo(jSDocInfo5);
        java.lang.String str9 = jSDocInfo5.getMeaning();
        com.google.javascript.rhino.Node node10 = jSDocInfo5.getAssociatedNode();
        java.lang.String str11 = jSDocInfo5.getFileOverview();
        boolean boolean12 = jSDocInfo5.isDefine();
        java.lang.String str13 = jSDocInfo5.getFileOverview();
        java.util.Set<java.lang.String> strSet14 = jSDocInfo5.getSuppressions();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue18 = ternaryValue15.and(ternaryValue17);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue20 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(false);
        java.lang.String str21 = ternaryValue20.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue25 = ternaryValue22.and(ternaryValue24);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue26 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue28 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue29 = ternaryValue26.and(ternaryValue28);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue30 = ternaryValue22.or(ternaryValue26);
        boolean boolean32 = ternaryValue22.toBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue33 = ternaryValue20.xor(ternaryValue22);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue34 = ternaryValue17.and(ternaryValue33);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue35 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue37 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue38 = ternaryValue35.and(ternaryValue37);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue39 = ternaryValue35.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue40 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue41 = ternaryValue35.or(ternaryValue40);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue42 = ternaryValue34.and(ternaryValue35);
        boolean boolean43 = strSet14.remove((java.lang.Object) ternaryValue34);
        java.util.Iterator<java.lang.String> strItor44 = strSet14.iterator();
        boolean boolean45 = strSet14.isEmpty();
        com.google.common.collect.UnmodifiableListIterator[] unmodifiableListIteratorArray47 = new com.google.common.collect.UnmodifiableListIterator[0];
        @SuppressWarnings("unchecked")
        com.google.common.collect.UnmodifiableListIterator<java.lang.reflect.Type>[] typeItorArray48 = (com.google.common.collect.UnmodifiableListIterator<java.lang.reflect.Type>[]) unmodifiableListIteratorArray47;
        com.google.common.collect.UnmodifiableListIterator[][] unmodifiableListIteratorArray50 = new com.google.common.collect.UnmodifiableListIterator[1][];
        @SuppressWarnings("unchecked")
        com.google.common.collect.UnmodifiableListIterator<java.lang.reflect.Type>[][] typeItorArray51 = (com.google.common.collect.UnmodifiableListIterator<java.lang.reflect.Type>[][]) unmodifiableListIteratorArray50;
        typeItorArray51[0] = unmodifiableListIteratorArray47;
        com.google.common.collect.UnmodifiableListIterator<java.lang.reflect.Type>[][] typeItorArray54 = strSet14.toArray(typeItorArray51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.common.collect.ImmutableList<com.google.common.collect.UnmodifiableListIterator<java.lang.reflect.Type>[]> typeItorArrayList55 = com.google.common.collect.ImmutableList.copyOf(typeItorArray51);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        java.util.Set<java.lang.String> strSet2 = jSDocInfo0.getParameterNames();
        boolean boolean3 = jSDocInfo0.isDeprecated();
        java.lang.String str4 = jSDocInfo0.getReturnDescription();
        java.lang.String str5 = jSDocInfo0.toString();
        java.util.Collection<java.lang.String> strCollection6 = jSDocInfo0.getAuthors();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility7 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        jSDocInfo0.setVisibility(visibility7);
        boolean boolean9 = jSDocInfo0.isConsistentIdGenerator();
        java.util.Set<java.lang.String> strSet10 = jSDocInfo0.getSuppressions();
        java.lang.String[] strArray11 = new java.lang.String[] {};
        java.lang.String[] strArray12 = new java.lang.String[] {};
        java.lang.String[] strArray13 = new java.lang.String[] {};
        java.lang.String[] strArray14 = new java.lang.String[] {};
        java.lang.String[] strArray15 = new java.lang.String[] {};
        java.lang.String[][] strArray16 = new java.lang.String[][] { strArray11, strArray12, strArray13, strArray14, strArray15 };
        java.lang.String[] strArray17 = new java.lang.String[] {};
        java.lang.String[] strArray18 = new java.lang.String[] {};
        java.lang.String[] strArray19 = new java.lang.String[] {};
        java.lang.String[] strArray20 = new java.lang.String[] {};
        java.lang.String[] strArray21 = new java.lang.String[] {};
        java.lang.String[][] strArray22 = new java.lang.String[][] { strArray17, strArray18, strArray19, strArray20, strArray21 };
        java.lang.String[] strArray23 = new java.lang.String[] {};
        java.lang.String[] strArray24 = new java.lang.String[] {};
        java.lang.String[] strArray25 = new java.lang.String[] {};
        java.lang.String[] strArray26 = new java.lang.String[] {};
        java.lang.String[] strArray27 = new java.lang.String[] {};
        java.lang.String[][] strArray28 = new java.lang.String[][] { strArray23, strArray24, strArray25, strArray26, strArray27 };
        java.lang.String[] strArray29 = new java.lang.String[] {};
        java.lang.String[] strArray30 = new java.lang.String[] {};
        java.lang.String[] strArray31 = new java.lang.String[] {};
        java.lang.String[] strArray32 = new java.lang.String[] {};
        java.lang.String[] strArray33 = new java.lang.String[] {};
        java.lang.String[][] strArray34 = new java.lang.String[][] { strArray29, strArray30, strArray31, strArray32, strArray33 };
        java.lang.String[] strArray35 = new java.lang.String[] {};
        java.lang.String[] strArray36 = new java.lang.String[] {};
        java.lang.String[] strArray37 = new java.lang.String[] {};
        java.lang.String[] strArray38 = new java.lang.String[] {};
        java.lang.String[] strArray39 = new java.lang.String[] {};
        java.lang.String[][] strArray40 = new java.lang.String[][] { strArray35, strArray36, strArray37, strArray38, strArray39 };
        java.lang.String[][][] strArray41 = new java.lang.String[][][] { strArray16, strArray22, strArray28, strArray34, strArray40 };
        java.lang.String[][][] strArray42 = strSet10.toArray(strArray41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.common.collect.ImmutableList<java.lang.String[][]> strArrayList43 = com.google.common.collect.ImmutableList.copyOf(strArray41);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isContinue();
        boolean boolean5 = node2.getBooleanProp((int) (byte) 100);
        com.google.javascript.rhino.Node node6 = node2.getNext();
        node2.setLength(43);
        boolean boolean9 = node2.isIn();
        boolean boolean10 = node2.isFunction();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node14 = node13.getParent();
        com.google.javascript.rhino.Node node16 = node13.getAncestor((int) (short) 0);
        boolean boolean17 = node16.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean21 = node20.hasChildren();
        com.google.javascript.rhino.Node node22 = node20.getLastSibling();
        int int23 = node22.getLength();
        boolean boolean24 = node22.isIf();
        java.lang.String str25 = node16.checkTreeEquals(node22);
        node16.putIntProp(41, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.removeChild(node16);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isContinue();
        int int4 = node2.getSourcePosition();
        com.google.javascript.rhino.Node node5 = node2.removeChildren();
        java.lang.String str6 = node2.getSourceFileName();
        boolean boolean7 = node2.isContinue();
        boolean boolean8 = node2.isGetElem();
        boolean boolean9 = node2.isVoid();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node11 = node2.getChildAtIndex(10);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node3 = node2.getParent();
        boolean boolean4 = node2.isArrayLit();
        node2.setOptionalArg(true);
        int int7 = node2.getType();
        boolean boolean8 = node2.isWhile();
        boolean boolean9 = node2.isGetterDef();
        boolean boolean10 = node2.isNew();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node12 = node2.getChildAtIndex(32783);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean1 = typePosition0.hasBrackets();
        typePosition0.setPositionInformation((int) (short) 10, (int) '4', 41, 40);
        int int7 = typePosition0.getPositionOnEndLine();
        com.google.javascript.rhino.Node[] nodeArray11 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(40, nodeArray11);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(48, nodeArray11);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(18, nodeArray11, 49, 0);
        boolean boolean17 = node16.isThis();
        typePosition0.setItem(node16);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node22 = node21.getParent();
        com.google.javascript.rhino.Node node24 = node21.getAncestor((int) (short) 0);
        node24.putBooleanProp((int) (short) 10, false);
        java.lang.String str28 = node24.toStringTree();
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = node24.getJSDocInfo();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString(41, "java.io.IOException: Named type with empty name component", 30, (int) (short) 100);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node(25, node35);
        boolean boolean37 = node36.isObjectLit();
        boolean boolean38 = node36.isGetterDef();
        boolean boolean39 = node36.isFunction();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node16.replaceChild(node24, node36);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isContinue();
        boolean boolean4 = node2.isVarArgs();
        com.google.javascript.rhino.Node node6 = node2.getAncestor(0);
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(42);
        com.google.javascript.rhino.Node node10 = node8.getAncestor(49);
        node6.addChildrenToFront(node8);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(42);
        boolean boolean14 = node13.isWhile();
        boolean boolean15 = node13.isNoSideEffectsCall();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node8.removeChild(node13);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isContinue();
        boolean boolean5 = node2.getBooleanProp((int) (byte) 100);
        boolean boolean6 = node2.isString();
        boolean boolean7 = node2.isNoSideEffectsCall();
        node2.addSuppression("");
        java.lang.String[] strArray15 = new java.lang.String[] { "", "Not declared as a constructor", "Unknown class name", "Not declared as a type name", "Not declared as a type name" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        java.util.Iterator<java.lang.String> strItor18 = strSet16.iterator();
        java.lang.String[] strArray22 = new java.lang.String[] { "Not declared as a type name", "(hi!)", "Not declared as a type name" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        java.lang.String[] strArray34 = new java.lang.String[] { "[class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode]", "Not declared as a constructor", "((hi!))", "hi!", "JSDocInfo", "((hi!))", "Not declared as a type name", "Not declared as a constructor", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        java.lang.Object[] objArray37 = strSet35.toArray();
        java.lang.String[] strArray43 = new java.lang.String[] { "", "Not declared as a constructor", "Unknown class name", "Not declared as a type name", "Not declared as a type name" };
        java.util.LinkedHashSet<java.lang.String> strSet44 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet44, strArray43);
        java.util.Iterator<java.lang.String> strItor46 = strSet44.iterator();
        com.google.common.collect.ImmutableList<java.util.AbstractSet<java.lang.String>> strSetList47 = com.google.common.collect.ImmutableList.of((java.util.AbstractSet<java.lang.String>) strSet16, (java.util.AbstractSet<java.lang.String>) strSet23, (java.util.AbstractSet<java.lang.String>) strSet35, (java.util.AbstractSet<java.lang.String>) strSet44);
        com.google.javascript.rhino.InputId inputId49 = new com.google.javascript.rhino.InputId("JSDocInfo");
        boolean boolean50 = strSet16.contains((java.lang.Object) "JSDocInfo");
        int int51 = strSet16.size();
        node2.setDirectives((java.util.Set<java.lang.String>) strSet16);
        boolean boolean53 = node2.isSwitch();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean58 = node57.isContinue();
        boolean boolean59 = node57.isNE();
        java.lang.String str60 = node57.getString();
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(48, node57);
        boolean boolean62 = node57.isNull();
        boolean boolean63 = node57.isOr();
        boolean boolean64 = node57.isContinue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node65 = node2.getChildBefore(node57);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable3 = node2.siblings();
        boolean boolean4 = node2.isAssign();
        com.google.javascript.rhino.Node node5 = node2.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = new com.google.javascript.rhino.JSTypeExpression(node2, "DELPROP OR ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node9 = node2.getChildAtIndex(12);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.hasChildren();
        boolean boolean4 = node2.isAssignAdd();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean6 = jSDocInfo5.isNoShadow();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo5.getImplementedInterfaces();
        node2.setJSDocInfo(jSDocInfo5);
        java.lang.String str9 = jSDocInfo5.getMeaning();
        com.google.javascript.rhino.Node node10 = jSDocInfo5.getAssociatedNode();
        java.lang.String str11 = jSDocInfo5.getFileOverview();
        boolean boolean12 = jSDocInfo5.isDefine();
        java.lang.String str13 = jSDocInfo5.getFileOverview();
        java.util.Set<java.lang.String> strSet14 = jSDocInfo5.getSuppressions();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue18 = ternaryValue15.and(ternaryValue17);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue20 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(false);
        java.lang.String str21 = ternaryValue20.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue25 = ternaryValue22.and(ternaryValue24);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue26 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue28 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue29 = ternaryValue26.and(ternaryValue28);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue30 = ternaryValue22.or(ternaryValue26);
        boolean boolean32 = ternaryValue22.toBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue33 = ternaryValue20.xor(ternaryValue22);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue34 = ternaryValue17.and(ternaryValue33);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue35 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue37 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue38 = ternaryValue35.and(ternaryValue37);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue39 = ternaryValue35.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue40 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue41 = ternaryValue35.or(ternaryValue40);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue42 = ternaryValue34.and(ternaryValue35);
        boolean boolean43 = strSet14.remove((java.lang.Object) ternaryValue34);
        java.util.Iterator<java.lang.String> strItor44 = strSet14.iterator();
        boolean boolean45 = strSet14.isEmpty();
        com.google.common.collect.UnmodifiableListIterator[] unmodifiableListIteratorArray47 = new com.google.common.collect.UnmodifiableListIterator[0];
        @SuppressWarnings("unchecked")
        com.google.common.collect.UnmodifiableListIterator<java.lang.reflect.Type>[] typeItorArray48 = (com.google.common.collect.UnmodifiableListIterator<java.lang.reflect.Type>[]) unmodifiableListIteratorArray47;
        com.google.common.collect.UnmodifiableListIterator[][] unmodifiableListIteratorArray50 = new com.google.common.collect.UnmodifiableListIterator[1][];
        @SuppressWarnings("unchecked")
        com.google.common.collect.UnmodifiableListIterator<java.lang.reflect.Type>[][] typeItorArray51 = (com.google.common.collect.UnmodifiableListIterator<java.lang.reflect.Type>[][]) unmodifiableListIteratorArray50;
        typeItorArray51[0] = unmodifiableListIteratorArray47;
        com.google.common.collect.UnmodifiableListIterator<java.lang.reflect.Type>[][] typeItorArray54 = strSet14.toArray(typeItorArray51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.common.collect.ImmutableList<com.google.common.collect.UnmodifiableListIterator<java.lang.reflect.Type>[]> typeItorArrayList55 = com.google.common.collect.ImmutableList.of(typeItorArray51);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node3 = node2.getParent();
        com.google.javascript.rhino.Node node5 = node2.getAncestor((int) (short) 0);
        node5.removeProp(0);
        boolean boolean8 = node5.isNoSideEffectsCall();
        java.lang.String str9 = node5.getString();
        node5.detachChildren();
        boolean boolean11 = node5.isThis();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString(37, "Unknown class name");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node15 = node5.getChildBefore(node14);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(2, "STRING (hi!)");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(0);
        boolean boolean5 = node4.isCase();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = node4.getStaticSourceFile();
        int int7 = node4.getChildCount();
        int int8 = node4.getType();
        boolean boolean9 = node4.wasEmptyNode();
        boolean boolean10 = node4.isDo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.removeChild(node4);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        java.util.Set<java.lang.String> strSet2 = jSDocInfo0.getParameterNames();
        int int3 = jSDocInfo0.getImplementedInterfaceCount();
        java.util.Set<java.lang.String> strSet4 = jSDocInfo0.getSuppressions();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection6 = jSDocInfo5.getMarkers();
        java.util.Set<java.lang.String> strSet7 = jSDocInfo5.getParameterNames();
        boolean boolean8 = jSDocInfo5.isDeprecated();
        java.lang.String str9 = jSDocInfo5.getReturnDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = jSDocInfo5.getType();
        boolean boolean11 = jSDocInfo5.isExport();
        java.util.Set<java.lang.String> strSet12 = jSDocInfo5.getParameterNames();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("[class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode, class com.google.javascript.rhino.Node$StringNode]", 0, 15);
        boolean boolean17 = strSet12.contains((java.lang.Object) 0);
        com.google.javascript.rhino.Node[][] nodeArray18 = new com.google.javascript.rhino.Node[][] {};
        com.google.javascript.rhino.Node[][] nodeArray19 = new com.google.javascript.rhino.Node[][] {};
        com.google.javascript.rhino.Node[][][] nodeArray20 = new com.google.javascript.rhino.Node[][][] { nodeArray18, nodeArray19 };
        com.google.javascript.rhino.Node[][][] nodeArray21 = strSet12.toArray(nodeArray20);
        com.google.javascript.rhino.Node[][][] nodeArray22 = strSet4.toArray(nodeArray20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.common.collect.ImmutableList<java.lang.Cloneable[]> cloneableArrayList23 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable[][]) nodeArray22);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        com.google.javascript.rhino.Node[] nodeArray5 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(40, nodeArray5);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(48, nodeArray5);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(18, nodeArray5, 49, 0);
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(37, nodeArray5);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(0, nodeArray5, 8, 46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node16 = node14.getChildAtIndex((int) 'a');
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(39, "", 32, 1);
        boolean boolean5 = node4.isIf();
        boolean boolean6 = node4.isSwitch();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("STRING hi! 100");
        boolean boolean9 = node8.isTrue();
        boolean boolean10 = node8.isReturn();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.removeChild(node8);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        boolean boolean2 = node1.isFor();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = new com.google.javascript.rhino.JSTypeExpression(node1, "");
        node1.setWasEmptyNode(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node8 = node1.getChildAtIndex(16);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(155658, "OR ", 52, (int) (short) 1);
        boolean boolean6 = node4.getBooleanProp((int) (byte) 1);
        boolean boolean7 = node4.isTry();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 42, (int) ' ', 53);
        java.lang.String str13 = node12.toString();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(30, node12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node15 = node4.getChildBefore(node12);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoShadow();
        boolean boolean2 = jSDocInfo0.isConstant();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getParameterType("hi!");
        jSDocInfo0.setLicense("Unknown class name");
        java.lang.String str7 = jSDocInfo0.getReturnDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getReturnType();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList9 = jSDocInfo0.getExtendedInterfaces();
        boolean boolean10 = jSDocInfo0.isConstructor();
        java.lang.String str11 = jSDocInfo0.getDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList12 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("Named type with empty name component");
        jSDocInfo0.setAssociatedNode(node14);
        boolean boolean17 = node14.getBooleanProp(172032);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node19 = node14.getChildAtIndex((int) '#');
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable3 = node2.siblings();
        boolean boolean4 = node2.isAssign();
        com.google.javascript.rhino.Node node5 = node2.cloneTree();
        boolean boolean6 = node5.isGetterDef();
        boolean boolean7 = node5.isWhile();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node5.removeChild(node9);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) (short) 0, 50, 10);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(97, 1, 4095);
        boolean boolean8 = node7.isInstanceOf();
        boolean boolean9 = node7.isIf();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node7);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node3 = node2.getParent();
        com.google.javascript.rhino.Node node5 = node2.getAncestor((int) (short) 0);
        node5.setType(50);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder8 = node5.getJsDocBuilderForNode();
        node5.setSourceFileForTesting("JSDocInfo");
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean14 = node13.isContinue();
        int int15 = node13.getSourcePosition();
        com.google.javascript.rhino.Node node16 = node13.removeChildren();
        boolean boolean17 = node5.hasChild(node13);
        boolean boolean18 = node13.isQuotedString();
        boolean boolean19 = node13.isGetElem();
        java.lang.String str20 = node13.getSourceFileName();
        java.util.Set<java.lang.String> strSet21 = node13.getDirectives();
        boolean boolean22 = node13.isFromExterns();
        node13.setCharno((int) (byte) 100);
        com.google.javascript.rhino.Node[] nodeArray29 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(40, nodeArray29);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) (byte) 10, nodeArray29);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(23, nodeArray29);
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((int) ' ', nodeArray29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node34 = node13.getChildBefore(node33);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test75");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node3 = node2.getParent();
        boolean boolean4 = node2.isArrayLit();
        boolean boolean5 = node2.isGetterDef();
        boolean boolean6 = node2.isNE();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString((int) (byte) 0, "hi!", 38, 10);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(46, node12);
        boolean boolean14 = node13.isGetProp();
        boolean boolean15 = node13.isFor();
        node13.putIntProp((-1), 0);
        boolean boolean19 = node13.isDo();
        java.lang.Object obj21 = node13.getProp(2);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node25 = node24.getParent();
        boolean boolean26 = node24.isArrayLit();
        boolean boolean27 = node24.isThrow();
        boolean boolean28 = node24.isReturn();
        boolean boolean29 = node24.isSetterDef();
        boolean boolean30 = node24.isFunction();
        int int31 = node24.getLength();
        com.google.javascript.rhino.Node node32 = node13.copyInformationFrom(node24);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean36 = node35.hasChildren();
        com.google.javascript.rhino.Node node37 = node35.getParent();
        boolean boolean38 = node35.isGetElem();
        boolean boolean39 = node35.isDebugger();
        com.google.javascript.rhino.Node node40 = node32.useSourceInfoFrom(node35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.removeChild(node35);
    }
}


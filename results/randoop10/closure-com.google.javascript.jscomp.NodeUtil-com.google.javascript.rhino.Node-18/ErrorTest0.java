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
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean4 = node3.hasOneChild();
        boolean boolean5 = node3.isOnlyModifiesThisCall();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node7 = node3.getChildAtIndex(12);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(39, node4);
        boolean boolean6 = node5.isIf();
        node5.detachChildren();
        boolean boolean8 = node5.isVoid();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(39, node13);
        boolean boolean15 = node14.isIf();
        node14.removeProp(54);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node5.removeChild(node14);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
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
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("NUMBER 0.0 36", 54, 49);
        com.google.javascript.rhino.Node node28 = node20.useSourceInfoIfMissingFromForTree(node27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node30 = node28.getChildAtIndex(54);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int15 = node14.getSourceOffset();
        com.google.javascript.rhino.Node node16 = node3.useSourceInfoIfMissingFrom(node14);
        boolean boolean17 = node14.isAssign();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int22 = node21.getSourceOffset();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable27 = node26.children();
        node21.addChildrenToBack(node26);
        node21.detachChildren();
        node21.setLineno(16);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean36 = node35.hasOneChild();
        node35.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable39 = node35.getAncestors();
        boolean boolean40 = node35.isNoSideEffectsCall();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node14.replaceChild(node21, node35);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((int) (byte) 0);
        node1.setCharno((int) (short) 1);
        boolean boolean4 = node1.isArrayLit();
        boolean boolean5 = node1.isDo();
        node1.setLineno(2147483647);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable12 = node11.children();
        boolean boolean13 = node11.isQuotedString();
        node11.setLength(0);
        boolean boolean16 = node11.isVar();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean21 = node20.hasOneChild();
        node11.addChildToBack(node20);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int27 = node26.getSourceOffset();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable32 = node31.children();
        node26.addChildrenToBack(node31);
        boolean boolean34 = node26.isSwitch();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.replaceChild(node11, node26);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node12 = node3.getChildAtIndex(42);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
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
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int26 = node25.getSourceOffset();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable31 = node30.children();
        node25.addChildrenToBack(node30);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int37 = node36.getSourceOffset();
        com.google.javascript.rhino.Node node38 = node25.useSourceInfoIfMissingFrom(node36);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (byte) 0);
        int int41 = node25.getIndexOfChild(node40);
        com.google.javascript.rhino.Node node42 = node20.srcref(node25);
        node25.putIntProp((int) (byte) 100, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node47 = node25.getChildAtIndex(46);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        java.lang.String str5 = node3.getQualifiedName();
        node3.setSourceFileForTesting("");
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean12 = node11.hasOneChild();
        node11.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable15 = node11.getAncestors();
        boolean boolean16 = node11.isFromExterns();
        node11.putIntProp(44, (int) '#');
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int24 = node23.getSourceOffset();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable29 = node28.children();
        node23.addChildrenToBack(node28);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int35 = node34.getSourceOffset();
        com.google.javascript.rhino.Node node36 = node23.useSourceInfoIfMissingFrom(node34);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((int) (byte) 0);
        int int39 = node23.getIndexOfChild(node38);
        boolean boolean40 = node38.isIf();
        boolean boolean41 = node38.isHook();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.replaceChild(node11, node38);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        boolean boolean11 = node8.isGetElem();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int16 = node15.getSourceOffset();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable21 = node20.children();
        node15.addChildrenToBack(node20);
        node15.detachChildren();
        node15.setLineno(16);
        node8.addChildrenToFront(node15);
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = node15.getJSDocInfo();
        node15.removeProp(50);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node31 = node15.getChildAtIndex(8);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
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
        boolean boolean45 = node43.isAnd();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString("Named type with empty name component");
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node47);
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node(0, node43, node47, 2147483647, 45);
        boolean boolean52 = node47.isSwitch();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node54 = node47.getChildAtIndex(46);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 32, 8, 52);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int8 = node7.getSourceOffset();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable13 = node12.children();
        node7.addChildrenToBack(node12);
        node7.detachChildren();
        java.lang.String str16 = node7.getSourceFileName();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean21 = node20.hasOneChild();
        node7.addChildrenToBack(node20);
        int int23 = node7.getChildCount();
        boolean boolean24 = node7.isName();
        boolean boolean25 = node7.isWhile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node7);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        node3.detachChildren();
        node3.setLineno(16);
        boolean boolean14 = node3.isSwitch();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int19 = node18.getSourceOffset();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable24 = node23.children();
        node18.addChildrenToBack(node23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node26 = node3.getChildBefore(node18);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("Named type with empty name component");
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node1);
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(48, "false");
        boolean boolean6 = node5.isSwitch();
        com.google.common.collect.ImmutableList<java.lang.Object> objList9 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray10 = objList9.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor11 = objList9.listIterator();
        int int12 = objList9.size();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor14 = objList9.listIterator((int) (byte) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(39, node19);
        boolean boolean21 = node20.isIf();
        node20.detachChildren();
        boolean boolean23 = node20.isVoid();
        boolean boolean24 = node20.isNE();
        int int25 = objList9.indexOf((java.lang.Object) node20);
        com.google.javascript.rhino.Node node26 = node5.useSourceInfoIfMissingFrom(node20);
        boolean boolean27 = node20.isGetProp();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable32 = node31.children();
        boolean boolean33 = node31.isQuotedString();
        node31.setLength(0);
        boolean boolean36 = node31.isScript();
        boolean boolean37 = node31.hasChildren();
        boolean boolean38 = node31.isCatch();
        java.lang.String str39 = node31.toStringTree();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.replaceChild(node20, node31);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(48, "false");
        boolean boolean3 = node2.isSwitch();
        com.google.common.collect.ImmutableList<java.lang.Object> objList6 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray7 = objList6.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor8 = objList6.listIterator();
        int int9 = objList6.size();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor11 = objList6.listIterator((int) (byte) 1);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(39, node16);
        boolean boolean18 = node17.isIf();
        node17.detachChildren();
        boolean boolean20 = node17.isVoid();
        boolean boolean21 = node17.isNE();
        int int22 = objList6.indexOf((java.lang.Object) node17);
        com.google.javascript.rhino.Node node23 = node2.useSourceInfoIfMissingFrom(node17);
        boolean boolean24 = node17.isGetProp();
        boolean boolean25 = node17.isDec();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 32, 8, 52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node30 = node17.getChildBefore(node29);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo3.getReturnType();
        boolean boolean6 = jSDocInfo3.isConsistentIdGenerator();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility7 = jSDocInfo3.getVisibility();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility8 = jSDocInfo3.getVisibility();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility9 = jSDocInfo3.getVisibility();
        java.util.Set<java.lang.String> strSet10 = jSDocInfo3.getModifies();
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec12 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("function ({1905212938}): {1905212938}");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec[] assertionFunctionSpecArray13 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec[] { assertionFunctionSpec12 };
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec15 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("function ({1905212938}): {1905212938}");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec[] assertionFunctionSpecArray16 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec[] { assertionFunctionSpec15 };
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec18 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("function ({1905212938}): {1905212938}");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec[] assertionFunctionSpecArray19 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec[] { assertionFunctionSpec18 };
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec21 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("function ({1905212938}): {1905212938}");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec[] assertionFunctionSpecArray22 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec[] { assertionFunctionSpec21 };
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec[][] assertionFunctionSpecArray23 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec[][] { assertionFunctionSpecArray13, assertionFunctionSpecArray16, assertionFunctionSpecArray19, assertionFunctionSpecArray22 };
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec[][] assertionFunctionSpecArray24 = strSet10.toArray(assertionFunctionSpecArray23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.common.collect.ImmutableList<java.lang.Object> objList25 = com.google.common.collect.ImmutableList.of((java.lang.Object[]) assertionFunctionSpecArray23);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int15 = node14.getSourceOffset();
        com.google.javascript.rhino.Node node16 = node3.useSourceInfoIfMissingFrom(node14);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (byte) 0);
        int int19 = node3.getIndexOfChild(node18);
        boolean boolean20 = node18.isIf();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable25 = node24.children();
        boolean boolean26 = node24.isQuotedString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression28 = new com.google.javascript.rhino.JSTypeExpression(node24, "hi!");
        com.google.javascript.rhino.Node node29 = node18.useSourceInfoFrom(node24);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable34 = node33.children();
        boolean boolean35 = node33.isQuotedString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression37 = new com.google.javascript.rhino.JSTypeExpression(node33, "hi!");
        boolean boolean38 = jSTypeExpression37.isOptionalArg();
        boolean boolean39 = jSTypeExpression37.isOptionalArg();
        com.google.javascript.rhino.Node node40 = jSTypeExpression37.getRoot();
        node40.setSourceEncodedPositionForTree((int) (short) 100);
        com.google.javascript.rhino.Node node43 = node18.clonePropsFrom(node40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression28 and jSTypeExpression37", jSTypeExpression28.equals(jSTypeExpression37) ? jSTypeExpression28.hashCode() == jSTypeExpression37.hashCode() : true);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        boolean boolean11 = node8.isGetElem();
        int int12 = node8.getType();
        com.google.javascript.rhino.jstype.JSType jSType13 = node8.getJSType();
        boolean boolean14 = node8.isAssignAdd();
        boolean boolean15 = node8.isInc();
        boolean boolean16 = node8.isFunction();
        node8.detachChildren();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile18 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node8);
        java.lang.String str22 = node8.toString(true, true, true);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(39, node27);
        boolean boolean29 = node28.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node30 = node28.getFirstChild();
        boolean boolean31 = node28.isObjectLit();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable36 = node35.children();
        boolean boolean37 = node35.isEmpty();
        node35.detachChildren();
        com.google.javascript.rhino.InputId inputId39 = node35.getInputId();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int45 = node44.getSourceOffset();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable50 = node49.children();
        node44.addChildrenToBack(node49);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int56 = node55.getSourceOffset();
        com.google.javascript.rhino.Node node57 = node44.useSourceInfoIfMissingFrom(node55);
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node(10, node44, 49, (int) (short) 100);
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean63 = node60.isEquivalentTo(node62);
        boolean boolean64 = node60.isSwitch();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile65 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node60);
        java.lang.Object obj67 = node60.getProp(54);
        boolean boolean68 = node35.isEquivalentTo(node60);
        boolean boolean69 = node35.isFunction();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node8.replaceChild(node28, node35);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(31, "function ({1610321739}): {1610321739}");
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
        boolean boolean40 = node7.isObjectLit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.removeChild(node7);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        node3.setSourceFileForTesting("[10, 0]");
        node3.removeProp(36);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
        java.lang.String[] strArray25 = new java.lang.String[] { "NUMBER 0.0 36", "function ({1265812580}): {1265812580}", "function ({1265812580}): {1265812580}", "{1936444324}", "Not declared as a type name", "Not declared as a type name", "function ({1704073426}): {1704073426}", "[10, 0]", "", "function ({1265812580}): {1265812580}", "JSDocInfo", "{1936444324}", "", "java.io.IOException: ", "JSDocInfo" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        node3.setDirectives((java.util.Set<java.lang.String>) strSet26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node30 = node3.getChildAtIndex(11);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(4095, "java.io.IOException: ", 47, 39);
        boolean boolean5 = node4.isAdd();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node7 = node4.getChildAtIndex((int) 'a');
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        boolean boolean5 = node3.isQuotedString();
        node3.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable8 = node3.getAncestors();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node3.children();
        boolean boolean10 = node3.isFalse();
        node3.setDouble((double) 49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node14 = node3.getChildAtIndex((int) (byte) 100);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
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
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node((int) (byte) 0);
        int int45 = node29.getIndexOfChild(node44);
        com.google.javascript.rhino.Node node46 = node16.srcref(node44);
        node44.setSourceFileForTesting("{1936444324}");
        boolean boolean49 = node44.isAdd();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node51 = node44.getChildAtIndex((int) '4');
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        boolean boolean5 = node3.isQuotedString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = new com.google.javascript.rhino.JSTypeExpression(node3, "hi!");
        boolean boolean8 = node3.isCatch();
        java.lang.String str9 = node3.getQualifiedName();
        boolean boolean10 = node3.hasChildren();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("function (...[?]): ?", 1, (-1));
        boolean boolean15 = node14.isScript();
        boolean boolean16 = node14.isString();
        boolean boolean17 = node14.isDo();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int22 = node21.getSourceOffset();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable27 = node26.children();
        node21.addChildrenToBack(node26);
        boolean boolean29 = node26.isGetElem();
        int int30 = node26.getType();
        com.google.javascript.rhino.jstype.JSType jSType31 = node26.getJSType();
        boolean boolean32 = node26.isOptionalArg();
        boolean boolean33 = node26.isParamList();
        java.lang.String str34 = node14.checkTreeEquals(node26);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString(48, "false");
        boolean boolean39 = node38.isSwitch();
        com.google.javascript.rhino.Node[] nodeArray40 = new com.google.javascript.rhino.Node[] { node38 };
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(29, nodeArray40);
        node41.putIntProp(32, 16);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder45 = node41.getJsDocBuilderForNode();
        boolean boolean46 = node41.isIn();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.replaceChild(node26, node41);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean4 = node3.hasOneChild();
        boolean boolean5 = node3.isOnlyModifiesThisCall();
        boolean boolean6 = node3.isSyntheticBlock();
        boolean boolean7 = node3.isAssign();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node9 = node3.getChildAtIndex(46);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        com.google.common.collect.ImmutableList<java.lang.Object> objList6 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream7 = objList6.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList8 = objList6.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList9 = objList6.reverse();
        java.util.Spliterator<java.lang.Object> objSpliterator10 = objList6.spliterator();
        boolean boolean11 = objList2.containsAll((java.util.Collection<java.lang.Object>) objList6);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean16 = node15.hasOneChild();
        boolean boolean17 = node15.isOnlyModifiesThisCall();
        boolean boolean18 = node15.isLabel();
        int int19 = node15.getType();
        boolean boolean20 = objList6.contains((java.lang.Object) node15);
        com.google.javascript.rhino.jstype.JSType jSType21 = node15.getJSType();
        boolean boolean22 = node15.isSyntheticBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node24 = node15.getChildAtIndex(54);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
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
        java.lang.Object obj18 = node14.getProp(4);
        boolean boolean19 = node14.isContinue();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable24 = node23.children();
        boolean boolean25 = node23.isQuotedString();
        node23.setLength(0);
        boolean boolean28 = node23.isVar();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean33 = node32.hasOneChild();
        node23.addChildToBack(node32);
        boolean boolean35 = node32.isInc();
        node32.addSuppression("false");
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection38 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node32);
        boolean boolean39 = node32.isFalse();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node14.removeChild(node32);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("Named type with empty name component");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int7 = node6.getSourceOffset();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable12 = node11.children();
        node6.addChildrenToBack(node11);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int18 = node17.getSourceOffset();
        com.google.javascript.rhino.Node node19 = node6.useSourceInfoIfMissingFrom(node17);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(10, node6, 49, (int) (short) 100);
        boolean boolean23 = node6.isComma();
        boolean boolean24 = node6.isAssignAdd();
        boolean boolean25 = node6.isQualifiedName();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean30 = node29.hasOneChild();
        node29.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable33 = node29.getAncestors();
        int int34 = node29.getChildCount();
        java.lang.String str35 = node29.toString();
        com.google.javascript.rhino.Node node36 = node6.useSourceInfoIfMissingFromForTree(node29);
        com.google.javascript.rhino.Node node37 = node6.cloneTree();
        java.lang.String str38 = node6.getSourceFileName();
        com.google.javascript.rhino.Node node39 = node1.useSourceInfoIfMissingFromForTree(node6);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((int) (byte) 0);
        com.google.javascript.rhino.JSDocInfo jSDocInfo42 = node41.getJSDocInfo();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.Node node46 = node44.getAncestor(47);
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node((int) 'a', 29, 49);
        node44.addChildrenToBack(node50);
        com.google.javascript.rhino.Node node52 = node41.useSourceInfoFrom(node50);
        boolean boolean53 = node50.isAssign();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable58 = node57.children();
        boolean boolean59 = node57.isQuotedString();
        node57.setLength(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node39.replaceChild(node50, node57);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean4 = node3.hasOneChild();
        boolean boolean5 = node3.isOnlyModifiesThisCall();
        boolean boolean6 = node3.isFromExterns();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder7 = node3.new FileLevelJsDocBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node9 = node3.getChildAtIndex(47);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(39, node4);
        node5.setSourceFileForTesting("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node9 = node5.getChildAtIndex(147456);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) 'a', 29, 49);
        node3.setIsSyntheticBlock(false);
        node3.setOptionalArg(true);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int12 = node11.getSourceOffset();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable17 = node16.children();
        node11.addChildrenToBack(node16);
        node11.detachChildren();
        node11.setLineno(16);
        boolean boolean22 = node11.isSwitch();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(39, node27);
        boolean boolean29 = node28.isIf();
        node28.detachChildren();
        boolean boolean31 = node11.hasChild(node28);
        boolean boolean32 = node11.isVoid();
        boolean boolean33 = node11.isRegExp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node11);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(48, "false");
        boolean boolean3 = node2.isSwitch();
        java.lang.String str4 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node2);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int10 = node9.getSourceOffset();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable15 = node14.children();
        node9.addChildrenToBack(node14);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int21 = node20.getSourceOffset();
        com.google.javascript.rhino.Node node22 = node9.useSourceInfoIfMissingFrom(node20);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(10, node9, 49, (int) (short) 100);
        boolean boolean26 = node9.isComma();
        boolean boolean27 = node9.isAssignAdd();
        node9.removeProp((int) (short) 0);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection30 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node9);
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec32 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("Unknown class name");
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int37 = node36.getSourceOffset();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable42 = node41.children();
        node36.addChildrenToBack(node41);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int48 = node47.getSourceOffset();
        com.google.javascript.rhino.Node node49 = node36.useSourceInfoIfMissingFrom(node47);
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean54 = node53.hasOneChild();
        node53.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable57 = node53.getAncestors();
        int int58 = node53.getLineno();
        boolean boolean59 = node53.isLocalResultCall();
        com.google.javascript.rhino.Node node60 = node49.useSourceInfoFromForTree(node53);
        com.google.javascript.rhino.Node node61 = assertionFunctionSpec32.getAssertedParam(node49);
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int66 = node65.getSourceOffset();
        boolean boolean67 = node65.isDo();
        int int68 = node65.getChildCount();
        node65.setDouble((double) 45);
        com.google.javascript.rhino.Node node71 = node61.srcrefTree(node65);
        node9.addChildrenToBack(node65);
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int77 = node76.getSourceOffset();
        com.google.javascript.rhino.Node node81 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable82 = node81.children();
        node76.addChildrenToBack(node81);
        node76.detachChildren();
        node76.setLineno(16);
        boolean boolean87 = node76.isSwitch();
        node76.setDouble((double) 47);
        com.google.javascript.rhino.Node node90 = node65.useSourceInfoFromForTree(node76);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node91 = node2.getChildBefore(node65);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int15 = node14.getSourceOffset();
        com.google.javascript.rhino.Node node16 = node3.useSourceInfoIfMissingFrom(node14);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (byte) 0);
        int int19 = node3.getIndexOfChild(node18);
        boolean boolean20 = node18.isIf();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int25 = node24.getSourceOffset();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable30 = node29.children();
        node24.addChildrenToBack(node29);
        boolean boolean32 = node29.isGetElem();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int37 = node36.getSourceOffset();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable42 = node41.children();
        node36.addChildrenToBack(node41);
        node36.detachChildren();
        node36.setLineno(16);
        node29.addChildrenToFront(node36);
        boolean boolean48 = node36.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node49 = node18.copyInformationFrom(node36);
        boolean boolean50 = node49.isReturn();
        boolean boolean51 = node49.isSyntheticBlock();
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((int) 'a', 29, 49);
        boolean boolean56 = node55.isFalse();
        node55.setOptionalArg(true);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node55);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node60 = node49.getChildBefore(node55);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        boolean boolean11 = node8.isGetElem();
        int int12 = node8.getType();
        com.google.javascript.rhino.jstype.JSType jSType13 = node8.getJSType();
        boolean boolean14 = node8.isOptionalArg();
        boolean boolean15 = node8.isParamList();
        node8.setWasEmptyNode(false);
        com.google.common.collect.ImmutableList<java.lang.Object> objList20 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray21 = objList20.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor22 = objList20.listIterator();
        int int23 = objList20.size();
        java.util.stream.Stream<java.lang.Object> objStream24 = objList20.parallelStream();
        java.util.Spliterator<java.lang.Object> objSpliterator25 = objList20.spliterator();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int31 = node30.getSourceOffset();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable36 = node35.children();
        node30.addChildrenToBack(node35);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int42 = node41.getSourceOffset();
        com.google.javascript.rhino.Node node43 = node30.useSourceInfoIfMissingFrom(node41);
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node(10, node30, 49, (int) (short) 100);
        boolean boolean47 = node30.isComma();
        boolean boolean48 = node30.isAssignAdd();
        boolean boolean49 = node30.isQualifiedName();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean54 = node53.hasOneChild();
        node53.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable57 = node53.getAncestors();
        int int58 = node53.getChildCount();
        java.lang.String str59 = node53.toString();
        com.google.javascript.rhino.Node node60 = node30.useSourceInfoIfMissingFromForTree(node53);
        com.google.javascript.rhino.Node node61 = node30.cloneTree();
        boolean boolean62 = objList20.contains((java.lang.Object) node30);
        boolean boolean63 = node8.hasChild(node30);
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int68 = node67.getSourceOffset();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable73 = node72.children();
        node67.addChildrenToBack(node72);
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int79 = node78.getSourceOffset();
        com.google.javascript.rhino.Node node80 = node67.useSourceInfoIfMissingFrom(node78);
        node80.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node87 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node88 = new com.google.javascript.rhino.Node(39, node87);
        com.google.javascript.rhino.Node node89 = node80.srcref(node88);
        boolean boolean90 = node89.isCall();
        boolean boolean91 = node89.isGetProp();
        boolean boolean92 = node89.isFromExterns();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node93 = node8.getChildBefore(node89);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(39, node4);
        boolean boolean6 = node5.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node7 = node5.getFirstChild();
        boolean boolean8 = node5.isObjectLit();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int14 = node13.getSourceOffset();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable19 = node18.children();
        node13.addChildrenToBack(node18);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int25 = node24.getSourceOffset();
        com.google.javascript.rhino.Node node26 = node13.useSourceInfoIfMissingFrom(node24);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(10, node13, 49, (int) (short) 100);
        java.util.Set<java.lang.String> strSet30 = node29.getDirectives();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable31 = node29.getAncestors();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean36 = node35.hasOneChild();
        node35.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable39 = node35.getAncestors();
        int int40 = node35.getChildCount();
        node29.addChildrenToFront(node35);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable46 = node45.children();
        boolean boolean47 = node45.isQuotedString();
        node45.setLength(0);
        boolean boolean50 = node45.isVar();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean55 = node54.hasOneChild();
        node45.addChildToBack(node54);
        node54.detachChildren();
        boolean boolean58 = node35.isEquivalentTo(node54);
        double double59 = node54.getDouble();
        com.google.javascript.rhino.Node node60 = node54.cloneNode();
        com.google.javascript.rhino.Node node61 = node5.useSourceInfoFromForTree(node54);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node63 = node61.getChildAtIndex(48);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        boolean boolean5 = node3.isQuotedString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = new com.google.javascript.rhino.JSTypeExpression(node3, "hi!");
        boolean boolean9 = jSTypeExpression7.equals((java.lang.Object) (short) -1);
        com.google.javascript.rhino.Node node10 = jSTypeExpression7.getRoot();
        com.google.javascript.rhino.Node node11 = jSTypeExpression7.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node13 = node11.getChildAtIndex((int) (byte) 100);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        boolean boolean5 = node3.isQuotedString();
        node3.setLength(0);
        boolean boolean8 = node3.isScript();
        boolean boolean9 = node3.hasChildren();
        node3.setDouble((double) 100);
        int int12 = node3.getSourceOffset();
        node3.detachChildren();
        boolean boolean14 = node3.isLocalResultCall();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable19 = node18.children();
        node18.setSourceFileForTesting("[10, 0]");
        node18.setVarArgs(true);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder24 = node18.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node25 = node3.copyInformationFrom(node18);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int31 = node30.getSourceOffset();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable36 = node35.children();
        node30.addChildrenToBack(node35);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int42 = node41.getSourceOffset();
        com.google.javascript.rhino.Node node43 = node30.useSourceInfoIfMissingFrom(node41);
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node(10, node30, 49, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node25.removeChild(node46);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 54, 118833, 4);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable8 = node7.children();
        boolean boolean9 = node7.isQuotedString();
        node7.setLength(0);
        boolean boolean12 = node7.isScript();
        boolean boolean13 = node7.isThrow();
        boolean boolean14 = node7.isInc();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int19 = node18.getSourceOffset();
        java.lang.String str20 = node18.getQualifiedName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.replaceChild(node7, node18);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(1, "function ({2141952508}): {2141952508}");
        com.google.common.collect.ImmutableList<java.lang.Object> objList5 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray6 = objList5.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor7 = objList5.listIterator();
        int int8 = objList5.size();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int13 = node12.getSourceOffset();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable18 = node17.children();
        node12.addChildrenToBack(node17);
        boolean boolean20 = node17.isGetElem();
        int int21 = node17.getType();
        boolean boolean22 = objList5.equals((java.lang.Object) node17);
        boolean boolean23 = node17.isDebugger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.removeChild(node17);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(39, node4);
        boolean boolean6 = node5.isIf();
        node5.detachChildren();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile8 = node5.getStaticSourceFile();
        boolean boolean9 = node5.isOnlyModifiesThisCall();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node11 = node5.getChildAtIndex(100);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        boolean boolean11 = node8.isGetElem();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int16 = node15.getSourceOffset();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable21 = node20.children();
        node15.addChildrenToBack(node20);
        node15.detachChildren();
        node15.setLineno(16);
        node8.addChildrenToFront(node15);
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = node15.getJSDocInfo();
        node15.removeProp(50);
        boolean boolean30 = node15.wasEmptyNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node32 = node15.getChildAtIndex(30);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int15 = node14.getSourceOffset();
        com.google.javascript.rhino.Node node16 = node3.useSourceInfoIfMissingFrom(node14);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (byte) 0);
        int int19 = node3.getIndexOfChild(node18);
        boolean boolean20 = node18.isIf();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable25 = node24.children();
        boolean boolean26 = node24.isQuotedString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression28 = new com.google.javascript.rhino.JSTypeExpression(node24, "hi!");
        com.google.javascript.rhino.Node node29 = node18.useSourceInfoFrom(node24);
        node24.setSourceFileForTesting("function ({775221821}): {775221821}");
        boolean boolean32 = node24.isAnd();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("JSDocInfo");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node24.removeChild(node34);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
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
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable35 = node34.children();
        com.google.javascript.rhino.Node node36 = node34.getFirstChild();
        int int37 = node36.getSourceOffset();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable42 = node41.children();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int47 = node46.getSourceOffset();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable52 = node51.children();
        node46.addChildrenToBack(node51);
        node46.detachChildren();
        boolean boolean55 = node46.isOr();
        com.google.javascript.rhino.Node node56 = node41.copyInformationFrom(node46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node57 = node36.getChildBefore(node46);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        boolean boolean11 = node8.isGetElem();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int16 = node15.getSourceOffset();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable21 = node20.children();
        node15.addChildrenToBack(node20);
        node15.detachChildren();
        node15.setLineno(16);
        node8.addChildrenToFront(node15);
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = node15.getJSDocInfo();
        node15.setLineno(46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo30 = node15.getJSDocInfo();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean35 = node34.hasOneChild();
        node34.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable38 = node34.getAncestors();
        boolean boolean39 = node34.isNoSideEffectsCall();
        boolean boolean40 = node34.isLabelName();
        java.lang.String str41 = node34.getSourceFileName();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable42 = node34.getAncestors();
        boolean boolean43 = node34.isBreak();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node15.removeChild(node34);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean2 = node1.isBlock();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("(function ({1399396790}): {1399396790})");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node4);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(36, "java.io.IOException: function ({1364769836}): {1364769836}", 44, 43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex(8);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
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
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("NUMBER 0.0 36", 54, 49);
        com.google.javascript.rhino.Node node28 = node20.useSourceInfoIfMissingFromForTree(node27);
        node27.putBooleanProp((int) (byte) 100, false);
        boolean boolean32 = node27.isNot();
        boolean boolean33 = node27.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int38 = node37.getSourceOffset();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable43 = node42.children();
        node37.addChildrenToBack(node42);
        node37.detachChildren();
        node37.setLineno(16);
        boolean boolean48 = node37.isSwitch();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node27.removeChild(node37);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        boolean boolean5 = node3.isQuotedString();
        node3.setLength(0);
        boolean boolean8 = node3.isVar();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean13 = node12.hasOneChild();
        node3.addChildToBack(node12);
        boolean boolean15 = node12.isInc();
        node12.addSuppression("false");
        java.lang.String str18 = node12.getQualifiedName();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) (short) 10, 37, 15);
        node22.setSourceFileForTesting("function ({97160775}): {97160775}");
        boolean boolean25 = node22.isAssign();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node26 = node12.getChildBefore(node22);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        node3.setLineno(9);
        node3.putProp(53, (java.lang.Object) 12);
        boolean boolean9 = node3.isNot();
        boolean boolean10 = node3.isVarArgs();
        boolean boolean11 = node3.isAssignAdd();
        boolean boolean12 = node3.isParamList();
        com.google.javascript.rhino.Node node13 = node3.cloneNode();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node(39, node18);
        boolean boolean20 = node19.isIf();
        node19.detachChildren();
        boolean boolean22 = node19.isVoid();
        boolean boolean23 = node19.isBlock();
        boolean boolean24 = node19.isDelProp();
        node19.setOptionalArg(true);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString(100, "Not declared as a type name");
        boolean boolean31 = node30.isDebugger();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable36 = node35.children();
        boolean boolean37 = node35.isQuotedString();
        node35.setLength(0);
        boolean boolean40 = node35.isLabelName();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean45 = node44.hasOneChild();
        node44.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable48 = node44.getAncestors();
        boolean boolean49 = node44.isNoSideEffectsCall();
        node44.setWasEmptyNode(false);
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node(2, node30, node35, node44, 15, 0);
        boolean boolean55 = node19.isEquivalentToTyped(node44);
        boolean boolean56 = node44.isWith();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node57 = node3.getChildBefore(node44);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 51, (int) (byte) 0, 0);
        boolean boolean4 = node3.isNoSideEffectsCall();
        boolean boolean5 = node3.isFalse();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int10 = node9.getSourceOffset();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable15 = node14.children();
        node9.addChildrenToBack(node14);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int21 = node20.getSourceOffset();
        com.google.javascript.rhino.Node node22 = node9.useSourceInfoIfMissingFrom(node20);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (byte) 0);
        int int25 = node9.getIndexOfChild(node24);
        node9.detachChildren();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int31 = node30.getSourceOffset();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable36 = node35.children();
        node30.addChildrenToBack(node35);
        boolean boolean38 = node9.isEquivalentTo(node30);
        node30.putIntProp((int) ' ', (int) (byte) 0);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int46 = node45.getSourceOffset();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable51 = node50.children();
        node45.addChildrenToBack(node50);
        node45.detachChildren();
        node45.setLineno(16);
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(39, node60);
        boolean boolean62 = node61.isIf();
        node61.detachChildren();
        boolean boolean64 = node61.isVoid();
        com.google.javascript.rhino.Node node65 = node45.useSourceInfoIfMissingFrom(node61);
        boolean boolean66 = node45.isAdd();
        com.google.javascript.rhino.Node node67 = node30.srcref(node45);
        com.google.javascript.rhino.Node node68 = node45.cloneNode();
        boolean boolean69 = node45.hasOneChild();
        node45.putBooleanProp(24, true);
        boolean boolean73 = node45.hasOneChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node45);
    }
}


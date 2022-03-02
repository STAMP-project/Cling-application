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
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.hasOneChild();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean6 = node5.hasOneChild();
        boolean boolean7 = node5.isObjectLit();
        com.google.javascript.rhino.InputId inputId8 = com.google.javascript.jscomp.NodeUtil.getInputId(node5);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((-1), node5);
        boolean boolean10 = node5.isSyntheticBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node11 = node1.getChildBefore(node5);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        boolean boolean3 = node1.isLabel();
        java.lang.String str4 = node1.toStringTree();
        boolean boolean5 = node1.isDebugger();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean8 = node7.hasOneChild();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean11 = node10.isOr();
        com.google.javascript.jscomp.CodingConvention.Bind bind12 = new com.google.javascript.jscomp.CodingConvention.Bind(node1, node7, node10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node14 = node1.getChildAtIndex(31);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isObjectLit();
        com.google.javascript.rhino.InputId inputId5 = com.google.javascript.jscomp.NodeUtil.getInputId(node2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((-1), node2);
        boolean boolean7 = node2.isName();
        boolean boolean8 = node2.isComma();
        boolean boolean9 = node2.isDo();
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node2);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.isOr();
        boolean boolean15 = node13.isLabel();
        java.lang.String str16 = node13.toStringTree();
        boolean boolean17 = node13.isDebugger();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean20 = node19.hasOneChild();
        boolean boolean21 = node19.isObjectLit();
        com.google.javascript.rhino.InputId inputId22 = com.google.javascript.jscomp.NodeUtil.getInputId(node19);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection23 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node19);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean26 = node25.hasOneChild();
        boolean boolean27 = node25.isAnd();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean30 = node29.hasOneChild();
        boolean boolean31 = node29.isObjectLit();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node(0, node13, node19, node25, node29, 12, 0);
        com.google.javascript.rhino.Node node35 = node19.cloneNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.removeChild(node35);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        boolean boolean3 = node1.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean6 = node5.hasOneChild();
        boolean boolean7 = node5.isObjectLit();
        com.google.javascript.rhino.InputId inputId8 = com.google.javascript.jscomp.NodeUtil.getInputId(node5);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection9 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node5);
        int int10 = node5.getLineno();
        boolean boolean11 = node5.isHook();
        java.lang.String str12 = node5.getSourceFileName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node5);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.hasOneChild();
        boolean boolean3 = node1.isAnd();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node5 = node1.getChildAtIndex(38);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        com.google.javascript.rhino.Node[] nodeArray4 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(46, nodeArray4);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(47, nodeArray4);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(37, nodeArray4);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, nodeArray4, 12, 36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node12 = node10.getChildAtIndex(42);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(39, "(JSDocInfo)", 42, (int) '#');
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((-1), "hi!", 36, (int) (byte) 0);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.isOr();
        node13.setLineno(2);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(0, node13);
        java.lang.String str18 = node13.toStringTree();
        int int19 = node13.getChildCount();
        boolean boolean20 = node13.isArrayLit();
        node13.removeProp(3);
        boolean boolean23 = node13.isNull();
        boolean boolean24 = node13.isFor();
        com.google.javascript.rhino.Node node25 = node10.useSourceInfoFrom(node13);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean29 = node28.isOr();
        boolean boolean30 = node28.isLabel();
        java.lang.String str31 = node28.toStringTree();
        boolean boolean32 = node28.isDebugger();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean35 = node34.hasOneChild();
        boolean boolean36 = node34.isObjectLit();
        com.google.javascript.rhino.InputId inputId37 = com.google.javascript.jscomp.NodeUtil.getInputId(node34);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection38 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node34);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean41 = node40.hasOneChild();
        boolean boolean42 = node40.isAnd();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean45 = node44.hasOneChild();
        boolean boolean46 = node44.isObjectLit();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(0, node28, node34, node40, node44, 12, 0);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile50 = node49.getStaticSourceFile();
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node((int) (short) -1, node5, node10, node49);
        com.google.javascript.rhino.Node node52 = node5.removeFirstChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node54 = node5.getChildAtIndex(39);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        boolean boolean3 = node1.isLabel();
        java.lang.String str4 = node1.toStringTree();
        boolean boolean5 = node1.isDebugger();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean8 = node7.hasOneChild();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean11 = node10.isOr();
        com.google.javascript.jscomp.CodingConvention.Bind bind12 = new com.google.javascript.jscomp.CodingConvention.Bind(node1, node7, node10);
        boolean boolean14 = node1.getBooleanProp(2);
        boolean boolean15 = node1.isLocalResultCall();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        node17.setSourceEncodedPositionForTree(2);
        boolean boolean20 = node17.isUnscopedQualifiedName();
        int int21 = node17.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node22 = node1.getChildBefore(node17);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        boolean boolean3 = node1.isLabel();
        boolean boolean4 = node1.isAssignAdd();
        boolean boolean5 = node1.isQualifiedName();
        java.lang.String str6 = node1.getSourceFileName();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean10 = node9.hasOneChild();
        boolean boolean11 = node9.isObjectLit();
        com.google.javascript.rhino.InputId inputId12 = com.google.javascript.jscomp.NodeUtil.getInputId(node9);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((-1), node9);
        java.lang.String str14 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node13);
        boolean boolean15 = node13.isBreak();
        boolean boolean16 = node13.isAssignAdd();
        boolean boolean17 = node13.isOnlyModifiesThisCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression19 = jSDocInfo18.getReturnType();
        java.lang.String str20 = jSDocInfo18.getOriginalCommentString();
        boolean boolean21 = jSDocInfo18.isExterns();
        jSDocInfo18.addSuppression("hi!");
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean26 = node25.hasOneChild();
        boolean boolean27 = node25.isObjectLit();
        java.lang.String str28 = com.google.javascript.jscomp.NodeUtil.getSourceName(node25);
        jSDocInfo18.setAssociatedNode(node25);
        boolean boolean30 = node25.isNE();
        boolean boolean31 = node25.isWhile();
        boolean boolean32 = node25.isDefaultCase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.replaceChild(node13, node25);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        boolean boolean3 = node1.isLabel();
        java.lang.String str4 = node1.toStringTree();
        boolean boolean5 = node1.isDebugger();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean8 = node7.hasOneChild();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean11 = node10.isOr();
        com.google.javascript.jscomp.CodingConvention.Bind bind12 = new com.google.javascript.jscomp.CodingConvention.Bind(node1, node7, node10);
        boolean boolean13 = node1.isSwitch();
        boolean boolean14 = node1.isQuotedString();
        boolean boolean15 = node1.isOr();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean18 = node17.isOr();
        boolean boolean19 = node17.isLabel();
        java.lang.String str20 = node17.toStringTree();
        boolean boolean21 = node17.isDebugger();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean24 = node23.hasOneChild();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean27 = node26.isOr();
        com.google.javascript.jscomp.CodingConvention.Bind bind28 = new com.google.javascript.jscomp.CodingConvention.Bind(node17, node23, node26);
        boolean boolean29 = node26.isCatch();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node30 = node1.getChildBefore(node26);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        boolean boolean3 = node1.isLabel();
        java.lang.String str4 = node1.toStringTree();
        boolean boolean5 = node1.isDebugger();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean8 = node7.hasOneChild();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean11 = node10.isOr();
        com.google.javascript.jscomp.CodingConvention.Bind bind12 = new com.google.javascript.jscomp.CodingConvention.Bind(node1, node7, node10);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(12);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean18 = node17.hasOneChild();
        boolean boolean19 = node17.isObjectLit();
        com.google.javascript.rhino.InputId inputId20 = com.google.javascript.jscomp.NodeUtil.getInputId(node17);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((-1), node17);
        node21.setType(43);
        com.google.javascript.jscomp.CodingConvention.Bind bind24 = new com.google.javascript.jscomp.CodingConvention.Bind(node10, node14, node21);
        node21.setSourceEncodedPosition((int) (byte) 10);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable27 = node21.children();
        boolean boolean28 = node21.isBreak();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression30 = new com.google.javascript.rhino.JSTypeExpression(node21, "");
        com.google.javascript.rhino.Node node31 = jSTypeExpression30.getRoot();
        com.google.javascript.rhino.Node node32 = jSTypeExpression30.getRoot();
        boolean boolean33 = node32.isTry();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node35 = node32.getChildAtIndex(29);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean4 = node3.hasOneChild();
        boolean boolean5 = node3.isObjectLit();
        com.google.javascript.rhino.InputId inputId6 = com.google.javascript.jscomp.NodeUtil.getInputId(node3);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((-1), node3);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node7);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean11 = node10.isOr();
        boolean boolean12 = node10.isLabel();
        boolean boolean13 = node10.isAssignAdd();
        boolean boolean14 = node10.isQualifiedName();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(30, node7, node10, 4095, (int) (short) 0);
        boolean boolean18 = node10.isWith();
        com.google.javascript.rhino.Node node19 = node10.detachFromParent();
        node19.setOptionalArg(false);
        boolean boolean22 = node19.isDo();
        boolean boolean23 = node19.isThis();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node19.removeChild(node25);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        boolean boolean3 = node1.isLabel();
        boolean boolean4 = node1.isAssignAdd();
        boolean boolean5 = node1.isQualifiedName();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString(31, "");
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean12 = node11.isOr();
        node11.setLineno(2);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(0, node11);
        com.google.javascript.rhino.Node node16 = node8.useSourceInfoFromForTree(node11);
        boolean boolean17 = node1.isEquivalentTo(node11);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean22 = node21.isOr();
        com.google.javascript.rhino.InputId inputId23 = node21.getInputId();
        boolean boolean24 = node21.isNot();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (byte) 10, node21);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (short) 100, node25, 8, 40);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean31 = node30.isOr();
        boolean boolean32 = node30.isLabel();
        java.lang.String str33 = node30.toStringTree();
        boolean boolean34 = node30.isDebugger();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean37 = node36.hasOneChild();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean40 = node39.isOr();
        com.google.javascript.jscomp.CodingConvention.Bind bind41 = new com.google.javascript.jscomp.CodingConvention.Bind(node30, node36, node39);
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(12);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean47 = node46.hasOneChild();
        boolean boolean48 = node46.isObjectLit();
        com.google.javascript.rhino.InputId inputId49 = com.google.javascript.jscomp.NodeUtil.getInputId(node46);
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node((-1), node46);
        node50.setType(43);
        com.google.javascript.jscomp.CodingConvention.Bind bind53 = new com.google.javascript.jscomp.CodingConvention.Bind(node39, node43, node50);
        node50.setSourceEncodedPosition((int) (byte) 10);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable56 = node50.children();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean60 = node59.hasOneChild();
        boolean boolean61 = node59.isObjectLit();
        com.google.javascript.rhino.InputId inputId62 = com.google.javascript.jscomp.NodeUtil.getInputId(node59);
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node((-1), node59);
        java.lang.String str64 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node63);
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec66 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        java.lang.String str67 = assertionFunctionSpec66.getFunctionName();
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean71 = node70.isOr();
        node70.setLineno(2);
        com.google.javascript.rhino.Node node74 = new com.google.javascript.rhino.Node(0, node70);
        com.google.javascript.rhino.Node node75 = assertionFunctionSpec66.getAssertedParam(node70);
        com.google.javascript.rhino.Node node76 = node63.srcref(node75);
        com.google.javascript.rhino.Node node77 = node50.useSourceInfoFrom(node76);
        boolean boolean78 = node76.isQuotedString();
        com.google.javascript.rhino.Node node80 = node76.getChildAtIndex(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node11.replaceChild(node25, node76);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isObjectLit();
        com.google.javascript.rhino.InputId inputId5 = com.google.javascript.jscomp.NodeUtil.getInputId(node2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((-1), node2);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node6);
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec9 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        java.lang.String str10 = assertionFunctionSpec9.getFunctionName();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean14 = node13.isOr();
        node13.setLineno(2);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(0, node13);
        com.google.javascript.rhino.Node node18 = assertionFunctionSpec9.getAssertedParam(node13);
        com.google.javascript.rhino.Node node19 = node6.srcref(node18);
        com.google.javascript.rhino.Node node20 = node19.getFirstChild();
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec22 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        java.lang.String str23 = assertionFunctionSpec22.getFunctionName();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean27 = node26.isOr();
        node26.setLineno(2);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(0, node26);
        com.google.javascript.rhino.Node node31 = assertionFunctionSpec22.getAssertedParam(node26);
        java.lang.String str32 = com.google.javascript.jscomp.NodeUtil.getSourceName(node26);
        node26.addSuppression("hi!");
        boolean boolean35 = node26.isTypeOf();
        boolean boolean36 = node26.isBreak();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node37 = node20.getChildBefore(node26);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.isOr();
        boolean boolean4 = node2.isLabel();
        java.lang.String str5 = node2.toStringTree();
        boolean boolean6 = node2.isDebugger();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean9 = node8.hasOneChild();
        boolean boolean10 = node8.isObjectLit();
        com.google.javascript.rhino.InputId inputId11 = com.google.javascript.jscomp.NodeUtil.getInputId(node8);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection12 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node8);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean15 = node14.hasOneChild();
        boolean boolean16 = node14.isAnd();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean19 = node18.hasOneChild();
        boolean boolean20 = node18.isObjectLit();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(0, node2, node8, node14, node18, 12, 0);
        com.google.javascript.rhino.Node node24 = node8.cloneNode();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString(39, "(JSDocInfo)", 42, (int) '#');
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString((-1), "hi!", 36, (int) (byte) 0);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean39 = node38.isOr();
        node38.setLineno(2);
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(0, node38);
        java.lang.String str43 = node38.toStringTree();
        int int44 = node38.getChildCount();
        boolean boolean45 = node38.isArrayLit();
        node38.removeProp(3);
        boolean boolean48 = node38.isNull();
        boolean boolean49 = node38.isFor();
        com.google.javascript.rhino.Node node50 = node35.useSourceInfoFrom(node38);
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean54 = node53.isOr();
        boolean boolean55 = node53.isLabel();
        java.lang.String str56 = node53.toStringTree();
        boolean boolean57 = node53.isDebugger();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean60 = node59.hasOneChild();
        boolean boolean61 = node59.isObjectLit();
        com.google.javascript.rhino.InputId inputId62 = com.google.javascript.jscomp.NodeUtil.getInputId(node59);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection63 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node59);
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean66 = node65.hasOneChild();
        boolean boolean67 = node65.isAnd();
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean70 = node69.hasOneChild();
        boolean boolean71 = node69.isObjectLit();
        com.google.javascript.rhino.Node node74 = new com.google.javascript.rhino.Node(0, node53, node59, node65, node69, 12, 0);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile75 = node74.getStaticSourceFile();
        com.google.javascript.rhino.Node node76 = new com.google.javascript.rhino.Node((int) (short) -1, node30, node35, node74);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node24.removeChild(node76);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isObjectLit();
        boolean boolean5 = node2.isFunction();
        boolean boolean6 = node2.isSyntheticBlock();
        boolean boolean7 = node2.isCall();
        boolean boolean8 = node2.isInc();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean11 = node10.isOr();
        boolean boolean12 = node10.isLabel();
        java.lang.String str13 = node10.toStringTree();
        boolean boolean14 = node10.isDebugger();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean17 = node16.hasOneChild();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean20 = node19.isOr();
        com.google.javascript.jscomp.CodingConvention.Bind bind21 = new com.google.javascript.jscomp.CodingConvention.Bind(node10, node16, node19);
        boolean boolean22 = node10.isSwitch();
        boolean boolean23 = node10.isQuotedString();
        boolean boolean24 = node10.isOr();
        com.google.javascript.rhino.Node node25 = node2.copyInformationFrom(node10);
        node2.setIsSyntheticBlock(true);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (short) 1, node2);
        boolean boolean29 = node2.isNumber();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node31 = node2.getChildAtIndex((int) (byte) 1);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean4 = node3.hasOneChild();
        boolean boolean5 = node3.isObjectLit();
        com.google.javascript.rhino.InputId inputId6 = com.google.javascript.jscomp.NodeUtil.getInputId(node3);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((-1), node3);
        node7.setType(43);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean12 = node11.hasOneChild();
        boolean boolean13 = node11.isObjectLit();
        java.lang.String str14 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node11);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean17 = node16.isOr();
        boolean boolean18 = node16.isLabel();
        java.lang.String str19 = node16.toStringTree();
        node16.setVarArgs(false);
        double double22 = node16.getDouble();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(3, node7, node11, node16, 2, 49);
        java.lang.String str29 = node16.toString(true, true, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node31 = node16.getChildAtIndex(16);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        boolean boolean3 = node1.isLabel();
        boolean boolean4 = node1.isAssignAdd();
        boolean boolean5 = node1.isQualifiedName();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean9 = node8.isOr();
        boolean boolean10 = node8.isLabel();
        java.lang.String str11 = node8.toStringTree();
        boolean boolean12 = node8.isDebugger();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean15 = node14.hasOneChild();
        boolean boolean16 = node14.isObjectLit();
        com.google.javascript.rhino.InputId inputId17 = com.google.javascript.jscomp.NodeUtil.getInputId(node14);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection18 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node14);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean21 = node20.hasOneChild();
        boolean boolean22 = node20.isAnd();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean25 = node24.hasOneChild();
        boolean boolean26 = node24.isObjectLit();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(0, node8, node14, node20, node24, 12, 0);
        boolean boolean30 = node1.isEquivalentToTyped(node20);
        boolean boolean31 = node1.isName();
        java.lang.String str32 = node1.getSourceFileName();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString(39, "(JSDocInfo)", 42, (int) '#');
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString((-1), "hi!", 36, (int) (byte) 0);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean47 = node46.isOr();
        node46.setLineno(2);
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node(0, node46);
        java.lang.String str51 = node46.toStringTree();
        int int52 = node46.getChildCount();
        boolean boolean53 = node46.isArrayLit();
        node46.removeProp(3);
        boolean boolean56 = node46.isNull();
        boolean boolean57 = node46.isFor();
        com.google.javascript.rhino.Node node58 = node43.useSourceInfoFrom(node46);
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean62 = node61.isOr();
        boolean boolean63 = node61.isLabel();
        java.lang.String str64 = node61.toStringTree();
        boolean boolean65 = node61.isDebugger();
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean68 = node67.hasOneChild();
        boolean boolean69 = node67.isObjectLit();
        com.google.javascript.rhino.InputId inputId70 = com.google.javascript.jscomp.NodeUtil.getInputId(node67);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection71 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node67);
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean74 = node73.hasOneChild();
        boolean boolean75 = node73.isAnd();
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean78 = node77.hasOneChild();
        boolean boolean79 = node77.isObjectLit();
        com.google.javascript.rhino.Node node82 = new com.google.javascript.rhino.Node(0, node61, node67, node73, node77, 12, 0);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile83 = node82.getStaticSourceFile();
        com.google.javascript.rhino.Node node84 = new com.google.javascript.rhino.Node((int) (short) -1, node38, node43, node82);
        com.google.javascript.rhino.Node node85 = node38.removeFirstChild();
        node38.putBooleanProp(41, false);
        com.google.javascript.rhino.Node node89 = node1.copyInformationFromForTree(node38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node91 = node38.getChildAtIndex(16);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.hasOneChild();
        boolean boolean3 = node1.isObjectLit();
        java.lang.String str4 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node1);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable5 = node1.children();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean8 = node7.hasOneChild();
        boolean boolean9 = node7.isObjectLit();
        com.google.javascript.rhino.InputId inputId10 = com.google.javascript.jscomp.NodeUtil.getInputId(node7);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection11 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node7);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean16 = node15.hasOneChild();
        boolean boolean17 = node15.isObjectLit();
        com.google.javascript.rhino.InputId inputId18 = com.google.javascript.jscomp.NodeUtil.getInputId(node15);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((-1), node15);
        node19.setType(43);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean24 = node23.hasOneChild();
        boolean boolean25 = node23.isObjectLit();
        java.lang.String str26 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node23);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean29 = node28.isOr();
        boolean boolean30 = node28.isLabel();
        java.lang.String str31 = node28.toStringTree();
        node28.setVarArgs(false);
        double double34 = node28.getDouble();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(3, node19, node23, node28, 2, 49);
        boolean boolean38 = node23.isDefaultCase();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean41 = node40.isOr();
        boolean boolean42 = node40.isLabel();
        boolean boolean43 = node40.isAssignAdd();
        boolean boolean44 = node40.isQualifiedName();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean48 = node47.isOr();
        boolean boolean49 = node47.isLabel();
        java.lang.String str50 = node47.toStringTree();
        boolean boolean51 = node47.isDebugger();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean54 = node53.hasOneChild();
        boolean boolean55 = node53.isObjectLit();
        com.google.javascript.rhino.InputId inputId56 = com.google.javascript.jscomp.NodeUtil.getInputId(node53);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection57 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node53);
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean60 = node59.hasOneChild();
        boolean boolean61 = node59.isAnd();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean64 = node63.hasOneChild();
        boolean boolean65 = node63.isObjectLit();
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node(0, node47, node53, node59, node63, 12, 0);
        boolean boolean69 = node40.isEquivalentToTyped(node59);
        com.google.javascript.jscomp.CodingConvention.Bind bind70 = new com.google.javascript.jscomp.CodingConvention.Bind(node7, node23, node59);
        boolean boolean71 = node7.isAssign();
        com.google.javascript.rhino.Node node72 = node1.useSourceInfoIfMissingFrom(node7);
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean76 = node75.hasOneChild();
        boolean boolean77 = node75.isObjectLit();
        com.google.javascript.rhino.InputId inputId78 = com.google.javascript.jscomp.NodeUtil.getInputId(node75);
        com.google.javascript.rhino.Node node79 = new com.google.javascript.rhino.Node((-1), node75);
        boolean boolean80 = node75.isName();
        boolean boolean81 = node75.isCatch();
        boolean boolean82 = node75.isFalse();
        com.google.javascript.rhino.Node node84 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean85 = node84.hasOneChild();
        boolean boolean86 = node84.isObjectLit();
        java.lang.String str87 = com.google.javascript.jscomp.NodeUtil.getSourceName(node84);
        boolean boolean88 = node84.isOr();
        boolean boolean89 = node84.isIf();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node72.replaceChild(node75, node84);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        boolean boolean3 = node1.isLabel();
        java.lang.String str4 = node1.toStringTree();
        boolean boolean5 = node1.isDebugger();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean8 = node7.hasOneChild();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean11 = node10.isOr();
        com.google.javascript.jscomp.CodingConvention.Bind bind12 = new com.google.javascript.jscomp.CodingConvention.Bind(node1, node7, node10);
        boolean boolean13 = node10.isCatch();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean17 = node16.isOr();
        node16.setLineno(2);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(0, node16);
        java.lang.String str21 = node16.toStringTree();
        boolean boolean22 = node16.isSetterDef();
        boolean boolean23 = node10.isEquivalentTo(node16);
        boolean boolean24 = node16.isIf();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((-1), 31, 47);
        boolean boolean29 = node28.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString((int) '#', "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node16.replaceChild(node28, node32);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.hasOneChild();
        boolean boolean3 = node1.isObjectLit();
        com.google.javascript.rhino.InputId inputId4 = com.google.javascript.jscomp.NodeUtil.getInputId(node1);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection5 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node1);
        int int6 = node1.getLineno();
        boolean boolean7 = node1.isHook();
        node1.putIntProp((int) (byte) 10, 10);
        boolean boolean11 = node1.hasMoreThanOneChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node13 = node1.getChildAtIndex(2);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isExterns();
        jSDocInfo0.addSuppression("hi!");
        java.util.Set<java.lang.String> strSet6 = jSDocInfo0.getModifies();
        int int7 = strSet6.size();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean10 = node9.isOr();
        node9.setLineno(2);
        boolean boolean13 = strSet6.contains((java.lang.Object) 2);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList17 = com.google.common.collect.ImmutableList.copyOf(strArray16);
        java.util.Iterator<java.lang.String> strItor18 = strList17.iterator();
        boolean boolean19 = strSet6.retainAll((java.util.Collection<java.lang.String>) strList17);
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression21 = jSDocInfo20.getReturnType();
        java.lang.String str22 = jSDocInfo20.getOriginalCommentString();
        boolean boolean23 = jSDocInfo20.isExterns();
        jSDocInfo20.addSuppression("hi!");
        java.util.Set<java.lang.String> strSet26 = jSDocInfo20.getModifies();
        int int27 = strSet26.size();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean30 = node29.isOr();
        node29.setLineno(2);
        boolean boolean33 = strSet26.contains((java.lang.Object) 2);
        java.util.Iterator<java.lang.String> strItor34 = strSet26.iterator();
        int int35 = strSet26.size();
        java.util.Spliterator<java.lang.String> strSpliterator36 = strSet26.spliterator();
        java.lang.String[] strArray37 = new java.lang.String[] {};
        java.lang.String[][] strArray38 = new java.lang.String[][] { strArray37 };
        java.lang.String[][] strArray39 = strSet26.toArray(strArray38);
        boolean boolean40 = strSet6.containsAll((java.util.Collection<java.lang.String>) strSet26);
        java.lang.String[] strArray43 = new java.lang.String[] { "unknown", "unknown" };
        java.util.LinkedHashSet<java.lang.String> strSet44 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet44, strArray43);
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        boolean boolean52 = strList49.add("");
        boolean boolean53 = strSet44.remove((java.lang.Object) strList49);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue54 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue55 = ternaryValue54.not();
        java.lang.String str56 = ternaryValue54.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue57 = ternaryValue54.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue58 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue59 = ternaryValue58.not();
        java.lang.String str60 = ternaryValue58.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue61 = ternaryValue58.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue62 = ternaryValue57.and(ternaryValue61);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue63 = ternaryValue57.not();
        boolean boolean64 = strSet44.remove((java.lang.Object) ternaryValue63);
        java.util.Iterator<java.lang.String> strItor65 = strSet44.iterator();
        java.lang.String[] strArray68 = new java.lang.String[] { "unknown", "unknown" };
        java.util.LinkedHashSet<java.lang.String> strSet69 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet69, strArray68);
        java.lang.String[] strArray73 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList74 = new java.util.ArrayList<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList74, strArray73);
        boolean boolean77 = strList74.add("");
        boolean boolean78 = strSet69.remove((java.lang.Object) strList74);
        com.google.common.collect.ImmutableList<java.util.AbstractSet<java.lang.String>> strSetList79 = com.google.common.collect.ImmutableList.of((java.util.AbstractSet<java.lang.String>) strSet69);
        java.util.LinkedHashSet[] linkedHashSetArray81 = new java.util.LinkedHashSet[2];
        @SuppressWarnings("unchecked")
        java.util.LinkedHashSet<java.lang.String>[] strSetArray82 = (java.util.LinkedHashSet<java.lang.String>[]) linkedHashSetArray81;
        strSetArray82[0] = strSet44;
        strSetArray82[1] = strSet69;
        java.util.LinkedHashSet<java.lang.String>[] strSetArray87 = strSet26.toArray(strSetArray82);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.common.collect.ImmutableList<java.lang.Iterable<java.lang.String>> strIterableList88 = com.google.common.collect.ImmutableList.of((java.lang.Iterable<java.lang.String>[]) strSetArray82);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = com.google.common.collect.ImmutableList.copyOf(strArray2);
        java.util.Iterator<java.lang.String> strItor4 = strList3.iterator();
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = com.google.common.collect.ImmutableList.copyOf(strArray7);
        int int10 = strList8.lastIndexOf((java.lang.Object) (short) 100);
        boolean boolean11 = strList3.contains((java.lang.Object) int10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        jSTypeRegistry13.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean19 = node18.hasOneChild();
        boolean boolean20 = node18.isObjectLit();
        com.google.javascript.rhino.InputId inputId21 = com.google.javascript.jscomp.NodeUtil.getInputId(node18);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((-1), node18);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean26 = node25.hasOneChild();
        boolean boolean27 = node25.isObjectLit();
        com.google.javascript.rhino.InputId inputId28 = com.google.javascript.jscomp.NodeUtil.getInputId(node25);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((-1), node25);
        boolean boolean30 = node29.isNE();
        node22.addChildToBack(node29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry13.createFunctionType(jSType15, node29);
        int int33 = functionType32.getMaxArguments();
        boolean boolean34 = functionType32.isParameterizedType();
        java.lang.String str35 = functionType32.toAnnotationString();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36);
        jSTypeRegistry37.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean43 = node42.hasOneChild();
        boolean boolean44 = node42.isObjectLit();
        com.google.javascript.rhino.InputId inputId45 = com.google.javascript.jscomp.NodeUtil.getInputId(node42);
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((-1), node42);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean50 = node49.hasOneChild();
        boolean boolean51 = node49.isObjectLit();
        com.google.javascript.rhino.InputId inputId52 = com.google.javascript.jscomp.NodeUtil.getInputId(node49);
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node((-1), node49);
        boolean boolean54 = node53.isNE();
        node46.addChildToBack(node53);
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry37.createFunctionType(jSType39, node53);
        com.google.javascript.rhino.ErrorReporter errorReporter57 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter57);
        jSTypeRegistry58.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean64 = node63.hasOneChild();
        boolean boolean65 = node63.isObjectLit();
        com.google.javascript.rhino.InputId inputId66 = com.google.javascript.jscomp.NodeUtil.getInputId(node63);
        com.google.javascript.rhino.Node node67 = new com.google.javascript.rhino.Node((-1), node63);
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean71 = node70.hasOneChild();
        boolean boolean72 = node70.isObjectLit();
        com.google.javascript.rhino.InputId inputId73 = com.google.javascript.jscomp.NodeUtil.getInputId(node70);
        com.google.javascript.rhino.Node node74 = new com.google.javascript.rhino.Node((-1), node70);
        boolean boolean75 = node74.isNE();
        node67.addChildToBack(node74);
        com.google.javascript.rhino.jstype.FunctionType functionType77 = jSTypeRegistry58.createFunctionType(jSType60, node74);
        int int78 = functionType77.getMaxArguments();
        functionType56.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType77);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair80 = functionType32.getTypesUnderEquality((com.google.javascript.rhino.jstype.JSType) functionType77);
        boolean boolean81 = functionType77.isEnumElementType();
        com.google.javascript.rhino.jstype.FunctionType functionType83 = functionType77.getBindReturnType((int) (byte) -1);
        boolean boolean84 = strList3.equals((java.lang.Object) (byte) -1);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType83 and functionType77.", functionType83.equals(functionType77) == functionType77.equals(functionType83));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.isOr();
        node2.setLineno(2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(0, node2);
        java.lang.String str7 = node2.toStringTree();
        boolean boolean8 = node2.isLocalResultCall();
        int int9 = node2.getSideEffectFlags();
        boolean boolean10 = node2.isArrayLit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node12 = node2.getChildAtIndex(41);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.hasOneChild();
        boolean boolean3 = node1.isAnd();
        java.lang.Object obj5 = node1.getProp((int) (short) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node8 = node1.getChildAtIndex(44);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isObjectLit();
        com.google.javascript.rhino.InputId inputId5 = com.google.javascript.jscomp.NodeUtil.getInputId(node2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((-1), node2);
        boolean boolean7 = node2.isName();
        boolean boolean8 = node2.isComma();
        node2.setOptionalArg(true);
        boolean boolean11 = node2.isVoid();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("Node tree inequality:\nTree1:\nFALSE\n    NUMBER -1.0\n\n\nTree2:\nNUMBER -1.0 0\n\n\nSubtree1: FALSE\n    NUMBER -1.0\n\n\nSubtree2: NUMBER -1.0 0\n", 100, 15);
        com.google.javascript.rhino.Node node16 = node2.useSourceInfoIfMissingFromForTree(node15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node18 = node2.getChildAtIndex(42);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getReturnType();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isExterns();
        jSDocInfo0.addSuppression("hi!");
        java.util.Set<java.lang.String> strSet6 = jSDocInfo0.getModifies();
        int int7 = strSet6.size();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean10 = node9.isOr();
        node9.setLineno(2);
        boolean boolean13 = strSet6.contains((java.lang.Object) 2);
        com.google.javascript.rhino.JSDocInfo jSDocInfo14 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression15 = jSDocInfo14.getReturnType();
        java.lang.String str16 = jSDocInfo14.getOriginalCommentString();
        boolean boolean17 = jSDocInfo14.isExterns();
        jSDocInfo14.addSuppression("hi!");
        java.util.Set<java.lang.String> strSet20 = jSDocInfo14.getModifies();
        boolean boolean21 = strSet6.retainAll((java.util.Collection<java.lang.String>) strSet20);
        java.lang.String[] strArray27 = new java.lang.String[] { "unknown", "NUMBER -1.0\n", "unknown", "JSDocInfo", "JSDocInfo" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        com.google.javascript.rhino.JSDocInfo jSDocInfo30 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression31 = jSDocInfo30.getReturnType();
        java.lang.String str32 = jSDocInfo30.getOriginalCommentString();
        boolean boolean33 = jSDocInfo30.isExterns();
        jSDocInfo30.addSuppression("hi!");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList36 = jSDocInfo30.getExtendedInterfaces();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression37 = jSDocInfo30.getType();
        boolean boolean38 = strList28.contains((java.lang.Object) jSDocInfo30);
        java.lang.Object[] objArray39 = strList28.toArray();
        boolean boolean40 = strSet6.retainAll((java.util.Collection<java.lang.String>) strList28);
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        java.util.Spliterator<java.lang.String> strSpliterator46 = strList44.spliterator();
        boolean boolean47 = strSet6.retainAll((java.util.Collection<java.lang.String>) strList44);
        java.io.IOException iOException49 = new java.io.IOException("Node tree inequality:\nTree1:\nOR 43\n    ERROR\n        NUMBER -1.0\n    ERROR 2\n        NUMBER -1.0\n\n\nTree2:\nNUMBER -1.0\n\n\nSubtree1: OR 43\n    ERROR\n        NUMBER -1.0\n    ERROR 2\n        NUMBER -1.0\n\n\nSubtree2: NUMBER -1.0\n");
        java.io.IOException iOException51 = new java.io.IOException("Not declared as a constructor");
        iOException49.addSuppressed((java.lang.Throwable) iOException51);
        java.io.IOException[] iOExceptionArray53 = new java.io.IOException[] { iOException51 };
        java.io.IOException[] iOExceptionArray54 = strSet6.toArray(iOExceptionArray53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.common.collect.ImmutableList<java.io.IOException> iOExceptionList55 = com.google.common.collect.ImmutableList.of(iOExceptionArray54);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        boolean boolean3 = node1.isLabel();
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node((int) (byte) -1);
        boolean boolean6 = node1.isEquivalentTo(node5);
        boolean boolean7 = node1.isStringKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node9 = node1.getChildAtIndex(43);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.hasOneChild();
        boolean boolean3 = node1.isObjectLit();
        java.lang.String str4 = com.google.javascript.jscomp.NodeUtil.getSourceName(node1);
        boolean boolean5 = node1.isOr();
        int int6 = node1.getSourceOffset();
        boolean boolean7 = node1.isSyntheticBlock();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean11 = node10.isOr();
        node10.setLineno(2);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(0, node10);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder15 = node14.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node16 = node1.useSourceInfoFrom(node14);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("(JSDocInfo)");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node19 = node16.getChildBefore(node18);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        boolean boolean3 = node1.hasMoreThanOneChild();
        boolean boolean4 = node1.isReturn();
        boolean boolean5 = node1.isScript();
        boolean boolean6 = node1.isUnscopedQualifiedName();
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node1);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("Not declared as a type name");
        boolean boolean11 = node10.isOr();
        node10.setCharno(43);
        boolean boolean14 = node10.isObjectLit();
        boolean boolean15 = node10.isEmpty();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(40, node10, (int) (byte) 1, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node19 = node1.getChildBefore(node18);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.hasOneChild();
        boolean boolean3 = node1.isObjectLit();
        boolean boolean4 = node1.isFunction();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.isOr();
        boolean boolean8 = node6.isLabel();
        boolean boolean9 = node6.isAssignAdd();
        int int10 = node6.getChildCount();
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec12 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        java.lang.String str13 = assertionFunctionSpec12.getFunctionName();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean17 = node16.isOr();
        node16.setLineno(2);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(0, node16);
        com.google.javascript.rhino.Node node21 = assertionFunctionSpec12.getAssertedParam(node16);
        java.lang.String str22 = com.google.javascript.jscomp.NodeUtil.getSourceName(node16);
        node16.addSuppression("hi!");
        boolean boolean25 = node16.isTypeOf();
        boolean boolean26 = node16.isBreak();
        com.google.javascript.rhino.Node node27 = node6.srcref(node16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node6);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.hasOneChild();
        boolean boolean3 = node1.isObjectLit();
        com.google.javascript.rhino.InputId inputId4 = com.google.javascript.jscomp.NodeUtil.getInputId(node1);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection5 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node1);
        int int6 = node1.getLineno();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean9 = node8.isOr();
        node8.setLineno(2);
        com.google.javascript.rhino.Node node12 = node1.useSourceInfoFromForTree(node8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node14 = node12.getChildAtIndex(38);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.isOr();
        node2.setLineno(2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(0, node2);
        java.lang.String str7 = node2.toStringTree();
        com.google.javascript.rhino.Node node8 = node2.cloneNode();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean11 = node10.hasOneChild();
        boolean boolean12 = node10.isObjectLit();
        java.lang.String str13 = com.google.javascript.jscomp.NodeUtil.getSourceName(node10);
        java.lang.String str14 = node10.getSourceFileName();
        boolean boolean15 = node10.isOr();
        boolean boolean16 = node10.isComma();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList17 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node10);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean20 = node19.isOr();
        boolean boolean21 = node19.isLabel();
        boolean boolean22 = node19.isAssignAdd();
        boolean boolean23 = node19.isQualifiedName();
        int int24 = node19.getSourcePosition();
        boolean boolean25 = node19.isBlock();
        boolean boolean26 = node19.isIf();
        boolean boolean27 = node19.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node28 = node10.srcrefTree(node19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.removeChild(node10);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.isOr();
        boolean boolean4 = node2.hasMoreThanOneChild();
        boolean boolean5 = node2.isReturn();
        boolean boolean6 = node2.isScript();
        boolean boolean7 = node2.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean10 = node9.isOr();
        com.google.javascript.rhino.InputId inputId11 = node9.getInputId();
        boolean boolean12 = node9.isNot();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(31, "");
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean19 = node18.isOr();
        node18.setLineno(2);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(0, node18);
        com.google.javascript.rhino.Node node23 = node15.useSourceInfoFromForTree(node18);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean26 = node25.isOr();
        boolean boolean27 = node25.hasMoreThanOneChild();
        com.google.javascript.rhino.jstype.JSType jSType28 = node25.getJSType();
        boolean boolean29 = node25.isAssignAdd();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(41, node2, node9, node23, node25, (int) '4', 45);
        boolean boolean33 = node25.isLabelName();
        boolean boolean34 = node25.isFalse();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean38 = node37.hasOneChild();
        boolean boolean39 = node37.isObjectLit();
        com.google.javascript.rhino.InputId inputId40 = com.google.javascript.jscomp.NodeUtil.getInputId(node37);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((-1), node37);
        java.lang.String str42 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node41);
        boolean boolean43 = node41.isBreak();
        int int44 = node41.getLength();
        boolean boolean45 = node41.isInc();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean48 = node47.isOr();
        boolean boolean49 = node47.isLabel();
        java.lang.String str50 = node47.toStringTree();
        boolean boolean51 = node47.isDebugger();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean54 = node53.hasOneChild();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean57 = node56.isOr();
        com.google.javascript.jscomp.CodingConvention.Bind bind58 = new com.google.javascript.jscomp.CodingConvention.Bind(node47, node53, node56);
        java.lang.Object obj60 = node47.getProp(40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node25.replaceChild(node41, node47);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.isOr();
        com.google.javascript.rhino.InputId inputId3 = node1.getInputId();
        boolean boolean4 = node1.isNew();
        boolean boolean5 = node1.isInc();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(2);
        node7.setCharno(29);
        boolean boolean10 = node7.isTrue();
        int int11 = node7.getCharno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node12 = node1.getChildBefore(node7);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean2 = node1.hasOneChild();
        boolean boolean3 = node1.isObjectLit();
        java.lang.String str4 = node1.getSourceFileName();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean7 = node6.isOr();
        boolean boolean8 = node6.isLabel();
        java.lang.String str9 = node6.toStringTree();
        boolean boolean10 = node6.isDebugger();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean13 = node12.hasOneChild();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean16 = node15.isOr();
        com.google.javascript.jscomp.CodingConvention.Bind bind17 = new com.google.javascript.jscomp.CodingConvention.Bind(node6, node12, node15);
        boolean boolean18 = node15.isCatch();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean22 = node21.isOr();
        node21.setLineno(2);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(0, node21);
        java.lang.String str26 = node21.toStringTree();
        boolean boolean27 = node21.isSetterDef();
        boolean boolean28 = node15.isEquivalentTo(node21);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean31 = node30.isOr();
        boolean boolean32 = node30.isLabel();
        java.lang.String str33 = node30.toStringTree();
        boolean boolean34 = node30.isDebugger();
        boolean boolean35 = node30.isWith();
        java.util.Set<java.lang.String> strSet36 = node30.getDirectives();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) 47, (int) '#', 52);
        node30.addChildToFront(node40);
        com.google.javascript.rhino.Node node42 = node30.getFirstChild();
        boolean boolean43 = node30.isDelProp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.replaceChild(node15, node30);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean3 = node2.hasOneChild();
        boolean boolean4 = node2.isObjectLit();
        com.google.javascript.rhino.InputId inputId5 = com.google.javascript.jscomp.NodeUtil.getInputId(node2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((-1), node2);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node6);
        int int8 = node6.getChildCount();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean11 = node10.isFor();
        boolean boolean12 = node10.isObjectLit();
        com.google.javascript.rhino.Node node13 = node6.useSourceInfoFrom(node10);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean16 = node15.isOr();
        node15.setLineno(2);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node15);
        boolean boolean20 = node15.isIf();
        boolean boolean21 = node15.isAnd();
        java.lang.String str22 = com.google.javascript.jscomp.NodeUtil.getSourceName(node15);
        java.lang.String str23 = node15.getQualifiedName();
        node13.addChildrenToFront(node15);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) (-1.0f));
        boolean boolean27 = node26.hasOneChild();
        boolean boolean28 = node26.isAnd();
        node26.addSuppression("");
        boolean boolean31 = node26.isScript();
        boolean boolean32 = node26.isDo();
        int int33 = node26.getSourceOffset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node34 = node15.getChildBefore(node26);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 2);
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) 4, 0, 38);
        boolean boolean6 = node5.isRegExp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node7 = node1.getChildBefore(node5);
    }
}


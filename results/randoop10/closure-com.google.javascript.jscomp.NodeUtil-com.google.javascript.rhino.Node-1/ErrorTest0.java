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
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isName();
        boolean boolean3 = node1.isSwitch();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean6 = node1.hasChild(node5);
        boolean boolean7 = node1.isVar();
        com.google.javascript.rhino.Node node8 = node1.getParent();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean11 = node10.isName();
        boolean boolean12 = node10.isSwitch();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean15 = node10.hasChild(node14);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newExpr(node10);
        node10.setOptionalArg(true);
        node10.putBooleanProp((int) (short) -1, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node22 = node1.getChildBefore(node10);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) (byte) 100, 100, (int) 'a');
        int int5 = node4.getChildCount();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean8 = node7.isName();
        boolean boolean9 = node7.isSwitch();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean12 = node7.hasChild(node11);
        boolean boolean13 = node7.isVar();
        com.google.javascript.rhino.Node node14 = node7.getParent();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean17 = node16.isName();
        boolean boolean18 = node16.isSwitch();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean21 = node16.hasChild(node20);
        boolean boolean22 = node16.isVar();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean25 = node24.isName();
        boolean boolean26 = node24.isSwitch();
        java.lang.String str27 = node24.toString();
        boolean boolean28 = node24.isWith();
        com.google.javascript.rhino.Node node29 = node16.srcref(node24);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber((double) (byte) 100, 100, (int) 'a');
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node(130, node4, node7, node24, node33, 0, 15);
        com.google.javascript.rhino.Node node37 = node36.getFirstChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node39 = node36.getChildAtIndex((int) '#');
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isName();
        boolean boolean3 = node1.isSwitch();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean6 = node1.hasChild(node5);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newExpr(node1);
        int int8 = node7.getType();
        com.google.javascript.rhino.Node node9 = node7.getFirstChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node11 = node9.getChildAtIndex((int) (byte) 100);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isFunction();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean6 = node5.isName();
        boolean boolean7 = node5.isSwitch();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean10 = node5.hasChild(node9);
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newExpr(node5);
        boolean boolean12 = node11.isRegExp();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean15 = node14.isName();
        boolean boolean16 = node14.isSwitch();
        java.lang.String str17 = node14.toString();
        com.google.javascript.rhino.Node node18 = node11.useSourceInfoIfMissingFromForTree(node14);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        node20.setWasEmptyNode(true);
        boolean boolean23 = node20.isOr();
        boolean boolean24 = node20.isInstanceOf();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((int) '#', node18, node20, 32, 4095);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node28 = node1.getChildBefore(node27);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isName();
        boolean boolean3 = node1.isSwitch();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean6 = node1.hasChild(node5);
        boolean boolean7 = node5.isGetElem();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection8 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node5);
        node5.setWasEmptyNode(false);
        node5.setOptionalArg(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node14 = node5.getChildAtIndex((int) (short) 100);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isName();
        boolean boolean3 = node1.isSwitch();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean6 = node1.hasChild(node5);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newExpr(node1);
        node1.setOptionalArg(true);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder10 = node1.getJsDocBuilderForNode();
        boolean boolean11 = node1.isThis();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node13 = node1.getChildAtIndex(10);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isName();
        boolean boolean3 = node1.isSwitch();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean6 = node1.hasChild(node5);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newExpr(node1);
        int int8 = node1.getLength();
        boolean boolean9 = node1.isNew();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean12 = node11.isName();
        boolean boolean13 = node11.isSwitch();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean16 = node11.hasChild(node15);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newExpr(node11);
        int int18 = node11.getLength();
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        node11.setDirectives((java.util.Set<java.lang.String>) strSet22);
        boolean boolean26 = node11.getBooleanProp(41);
        com.google.javascript.rhino.Node node27 = node1.useSourceInfoFromForTree(node11);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node11);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString("Node tree inequality:\nTree1:\nNUMBER -1.0\n\n\nTree2:\nEXPR_RESULT\n    NUMBER -1.0\n\n\nSubtree1: NUMBER -1.0\n\n\nSubtree2: EXPR_RESULT\n    NUMBER -1.0\n");
        boolean boolean31 = node30.isDelProp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node32 = node11.getChildBefore(node30);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) (byte) 100, 100, (int) 'a');
        int int4 = node3.getChildCount();
        int int5 = node3.getSideEffectFlags();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean8 = node7.isName();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean11 = node10.isName();
        boolean boolean12 = node10.isSwitch();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean15 = node10.hasChild(node14);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newExpr(node10);
        boolean boolean17 = node16.isRegExp();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean20 = node19.isName();
        boolean boolean21 = node19.isSwitch();
        java.lang.String str22 = node19.toString();
        com.google.javascript.rhino.Node node23 = node16.useSourceInfoIfMissingFromForTree(node19);
        java.lang.String str24 = node7.checkTreeEquals(node23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node25 = node3.getChildBefore(node23);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isName();
        boolean boolean3 = node1.isSwitch();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean6 = node1.hasChild(node5);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection7 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node9 = node5.getChildAtIndex(100);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isName();
        boolean boolean3 = node1.isSwitch();
        java.lang.String str4 = node1.toString();
        boolean boolean5 = node1.isNumber();
        boolean boolean6 = node1.isComma();
        boolean boolean7 = node1.isDebugger();
        boolean boolean8 = node1.isWith();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean11 = node10.isName();
        boolean boolean12 = node10.isSwitch();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean15 = node10.hasChild(node14);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean18 = node17.isName();
        boolean boolean19 = node17.isSwitch();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean22 = node17.hasChild(node21);
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newExpr(node17);
        int int24 = node17.getLength();
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        node17.setDirectives((java.util.Set<java.lang.String>) strSet28);
        java.lang.String str31 = node14.checkTreeEquals(node17);
        node14.setSourceEncodedPosition((int) 'a');
        com.google.javascript.rhino.jstype.JSType jSType34 = node14.getJSType();
        com.google.javascript.rhino.Node node35 = node1.copyInformationFrom(node14);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString("Node tree inequality:\nTree1:\nNUMBER -1.0\n\n\nTree2:\nEXPR_RESULT\n    NUMBER -1.0\n\n\nSubtree1: NUMBER -1.0\n\n\nSubtree2: EXPR_RESULT\n    NUMBER -1.0\n");
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean41 = node40.isName();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean44 = node43.isName();
        boolean boolean45 = node43.isSwitch();
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((int) (byte) 100, node38, node40, node43);
        boolean boolean47 = node40.wasEmptyNode();
        com.google.javascript.rhino.Node node48 = node14.useSourceInfoIfMissingFrom(node40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node50 = node40.getChildAtIndex(43);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        com.google.javascript.rhino.jstype.JSType jSType2 = node1.getJSType();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(0, "NUMBER -1.0", (int) '#', 44);
        boolean boolean8 = node1.hasChild(node7);
        boolean boolean9 = node7.isExprResult();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean13 = node12.isName();
        boolean boolean14 = node12.isSwitch();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean17 = node12.hasChild(node16);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newExpr(node12);
        boolean boolean19 = node18.isRegExp();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean22 = node21.isName();
        boolean boolean23 = node21.isSwitch();
        java.lang.String str24 = node21.toString();
        com.google.javascript.rhino.Node node25 = node18.useSourceInfoIfMissingFromForTree(node21);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        node27.setWasEmptyNode(true);
        boolean boolean30 = node27.isOr();
        boolean boolean31 = node27.isInstanceOf();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((int) '#', node25, node27, 32, 4095);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node7.removeChild(node27);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isName();
        boolean boolean3 = node1.isSwitch();
        java.lang.String str4 = node1.toString();
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(130);
        com.google.javascript.rhino.Node node7 = node1.clonePropsFrom(node6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node9 = node1.getChildAtIndex(39);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isName();
        boolean boolean3 = node1.isSwitch();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean6 = node1.hasChild(node5);
        boolean boolean7 = node1.isVar();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean10 = node9.isName();
        boolean boolean11 = node9.isSwitch();
        java.lang.String str12 = node9.toString();
        boolean boolean13 = node9.isWith();
        com.google.javascript.rhino.Node node14 = node1.srcref(node9);
        boolean boolean15 = node1.isNoSideEffectsCall();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable16 = node1.getAncestors();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("Node tree inequality:\nTree1:\nNUMBER -1.0\n\n\nTree2:\nEXPR_RESULT\n    NUMBER -1.0\n\n\nSubtree1: NUMBER -1.0\n\n\nSubtree2: EXPR_RESULT\n    NUMBER -1.0\n");
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean22 = node21.isName();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean25 = node24.isName();
        boolean boolean26 = node24.isSwitch();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((int) (byte) 100, node19, node21, node24);
        boolean boolean28 = node21.isBreak();
        com.google.javascript.rhino.Node node29 = node21.cloneNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node30 = node1.getChildBefore(node29);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isName();
        boolean boolean3 = node1.isSwitch();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean6 = node1.hasChild(node5);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newExpr(node1);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean10 = node9.isName();
        boolean boolean11 = node9.isSwitch();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean14 = node9.hasChild(node13);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newExpr(node9);
        node9.setOptionalArg(true);
        node9.putBooleanProp((int) (short) -1, true);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean23 = node22.isName();
        boolean boolean24 = node22.isSwitch();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean27 = node22.hasChild(node26);
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newExpr(node22);
        boolean boolean29 = node28.isRegExp();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean32 = node31.isName();
        boolean boolean33 = node31.isSwitch();
        java.lang.String str34 = node31.toString();
        com.google.javascript.rhino.Node node35 = node28.useSourceInfoIfMissingFromForTree(node31);
        com.google.javascript.rhino.Node node36 = node9.useSourceInfoFromForTree(node28);
        boolean boolean37 = node7.hasChild(node9);
        node7.setIsSyntheticBlock(true);
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Set<java.lang.String> strSet42 = jSDocInfo41.getParameterNames();
        node7.putProp(45, (java.lang.Object) jSDocInfo41);
        boolean boolean44 = node7.isHook();
        boolean boolean45 = node7.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) (byte) 100, 100, (int) 'a');
        int int51 = node50.getChildCount();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean54 = node53.isName();
        boolean boolean55 = node53.isSwitch();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean58 = node53.hasChild(node57);
        boolean boolean59 = node53.isVar();
        com.google.javascript.rhino.Node node60 = node53.getParent();
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean63 = node62.isName();
        boolean boolean64 = node62.isSwitch();
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean67 = node62.hasChild(node66);
        boolean boolean68 = node62.isVar();
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean71 = node70.isName();
        boolean boolean72 = node70.isSwitch();
        java.lang.String str73 = node70.toString();
        boolean boolean74 = node70.isWith();
        com.google.javascript.rhino.Node node75 = node62.srcref(node70);
        com.google.javascript.rhino.Node node79 = com.google.javascript.rhino.Node.newNumber((double) (byte) 100, 100, (int) 'a');
        com.google.javascript.rhino.Node node82 = new com.google.javascript.rhino.Node(130, node50, node53, node70, node79, 0, 15);
        boolean boolean83 = node70.isTypeOf();
        java.lang.String str84 = node7.checkTreeEquals(node70);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node86 = node7.getChildAtIndex(48);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("Node tree inequality:\nTree1:\nNUMBER -1.0\n\n\nTree2:\nEXPR_RESULT\n    NUMBER -1.0\n\n\nSubtree1: NUMBER -1.0\n\n\nSubtree2: EXPR_RESULT\n    NUMBER -1.0\n", (int) (short) 100, 42);
        node3.setOptionalArg(true);
        boolean boolean6 = node3.isAssign();
        java.lang.Object obj8 = node3.getProp((int) ' ');
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = node3.getJSDocInfo();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean12 = node11.isName();
        boolean boolean13 = node11.isSwitch();
        java.lang.String str14 = node11.toString();
        boolean boolean15 = node11.isNumber();
        boolean boolean16 = node11.isComma();
        boolean boolean17 = node11.isDebugger();
        boolean boolean18 = node11.isWith();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean21 = node20.isName();
        boolean boolean22 = node20.isSwitch();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean25 = node20.hasChild(node24);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean28 = node27.isName();
        boolean boolean29 = node27.isSwitch();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean32 = node27.hasChild(node31);
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newExpr(node27);
        int int34 = node27.getLength();
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        node27.setDirectives((java.util.Set<java.lang.String>) strSet38);
        java.lang.String str41 = node24.checkTreeEquals(node27);
        node24.setSourceEncodedPosition((int) 'a');
        com.google.javascript.rhino.jstype.JSType jSType44 = node24.getJSType();
        com.google.javascript.rhino.Node node45 = node11.copyInformationFrom(node24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node45);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(29, "java.io.IOException: BITXOR 0\n", 8, 32);
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType5 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString(49, "Node tree inequality:\nTree1:\nNUMBER -1.0\n\n\nTree2:\nEXPR_RESULT\n    NUMBER -1.0\n\n\nSubtree1: NUMBER -1.0\n\n\nSubtree2: EXPR_RESULT\n    NUMBER -1.0\n", (int) (short) 100, (int) (short) 100);
        boolean boolean11 = node10.isTry();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean14 = node13.isName();
        boolean boolean15 = node13.isSwitch();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean18 = node13.hasChild(node17);
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newExpr(node13);
        node13.setOptionalArg(true);
        node13.putBooleanProp((int) (short) -1, true);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean27 = node26.isName();
        boolean boolean28 = node26.isSwitch();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean31 = node26.hasChild(node30);
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newExpr(node26);
        boolean boolean33 = node32.isRegExp();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean36 = node35.isName();
        boolean boolean37 = node35.isSwitch();
        java.lang.String str38 = node35.toString();
        com.google.javascript.rhino.Node node39 = node32.useSourceInfoIfMissingFromForTree(node35);
        com.google.javascript.rhino.Node node40 = node13.useSourceInfoFromForTree(node32);
        boolean boolean41 = node32.isFor();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship42 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType5, node10, node32);
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition43 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int44 = namePosition43.getPositionOnStartLine();
        int int45 = namePosition43.getStartLine();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean48 = node47.isName();
        boolean boolean49 = node47.isSwitch();
        java.lang.String str50 = node47.toString();
        boolean boolean51 = node47.isNumber();
        boolean boolean52 = node47.isComma();
        boolean boolean53 = node47.isDebugger();
        boolean boolean54 = node47.isWith();
        namePosition43.setItem(node47);
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean58 = node57.isName();
        boolean boolean59 = node57.isSwitch();
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean62 = node57.hasChild(node61);
        com.google.javascript.rhino.Node node63 = com.google.javascript.jscomp.NodeUtil.newExpr(node57);
        int int64 = node57.getLength();
        node57.addSuppression("Node tree inequality:\nTree1:\nNUMBER -1.0\n\n\nTree2:\nEXPR_RESULT\n    NUMBER -1.0\n\n\nSubtree1: NUMBER -1.0\n\n\nSubtree2: EXPR_RESULT\n    NUMBER -1.0\n");
        java.lang.String str67 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node57);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship68 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType5, node47, node57);
        boolean boolean69 = node47.isParamList();
        boolean boolean70 = node47.isIn();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean73 = node72.isName();
        boolean boolean74 = node72.isSwitch();
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean77 = node72.hasChild(node76);
        com.google.javascript.rhino.Node node78 = com.google.javascript.jscomp.NodeUtil.newExpr(node72);
        int int79 = node78.getType();
        com.google.javascript.rhino.Node node80 = node78.getFirstChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.replaceChild(node47, node78);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isName();
        boolean boolean3 = node1.isSwitch();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean6 = node1.hasChild(node5);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newExpr(node1);
        node1.setOptionalArg(true);
        node1.putBooleanProp((int) (short) -1, true);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean15 = node14.isName();
        boolean boolean16 = node14.isSwitch();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean19 = node14.hasChild(node18);
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newExpr(node14);
        boolean boolean21 = node20.isRegExp();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean24 = node23.isName();
        boolean boolean25 = node23.isSwitch();
        java.lang.String str26 = node23.toString();
        com.google.javascript.rhino.Node node27 = node20.useSourceInfoIfMissingFromForTree(node23);
        com.google.javascript.rhino.Node node28 = node1.useSourceInfoFromForTree(node20);
        boolean boolean29 = node1.isFromExterns();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean32 = node31.isName();
        boolean boolean33 = node31.isSwitch();
        java.lang.String str34 = node31.toString();
        boolean boolean35 = node31.isWith();
        boolean boolean36 = node31.hasOneChild();
        boolean boolean37 = node31.isLocalResultCall();
        boolean boolean38 = node31.isQualifiedName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node31);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isName();
        boolean boolean3 = node1.isSwitch();
        java.lang.String str4 = node1.toString();
        boolean boolean5 = node1.isWith();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean8 = node7.isName();
        boolean boolean9 = node7.isSwitch();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean12 = node7.hasChild(node11);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newExpr(node7);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean16 = node15.isName();
        boolean boolean17 = node15.isSwitch();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean20 = node15.hasChild(node19);
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newExpr(node15);
        node15.setOptionalArg(true);
        node15.putBooleanProp((int) (short) -1, true);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean29 = node28.isName();
        boolean boolean30 = node28.isSwitch();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean33 = node28.hasChild(node32);
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newExpr(node28);
        boolean boolean35 = node34.isRegExp();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean38 = node37.isName();
        boolean boolean39 = node37.isSwitch();
        java.lang.String str40 = node37.toString();
        com.google.javascript.rhino.Node node41 = node34.useSourceInfoIfMissingFromForTree(node37);
        com.google.javascript.rhino.Node node42 = node15.useSourceInfoFromForTree(node34);
        boolean boolean43 = node13.hasChild(node15);
        com.google.javascript.rhino.Node node44 = node1.useSourceInfoFromForTree(node15);
        node1.setSourceEncodedPositionForTree((int) (byte) 0);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean49 = node48.isName();
        boolean boolean50 = node48.isSwitch();
        java.lang.String str51 = node48.toString();
        boolean boolean52 = node48.isNumber();
        boolean boolean53 = node48.isComma();
        boolean boolean54 = node48.isDebugger();
        boolean boolean55 = node48.isWith();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean58 = node57.isName();
        boolean boolean59 = node57.isSwitch();
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean62 = node57.hasChild(node61);
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean65 = node64.isName();
        boolean boolean66 = node64.isSwitch();
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean69 = node64.hasChild(node68);
        com.google.javascript.rhino.Node node70 = com.google.javascript.jscomp.NodeUtil.newExpr(node64);
        int int71 = node64.getLength();
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet75 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet75, strArray74);
        node64.setDirectives((java.util.Set<java.lang.String>) strSet75);
        java.lang.String str78 = node61.checkTreeEquals(node64);
        node61.setSourceEncodedPosition((int) 'a');
        com.google.javascript.rhino.jstype.JSType jSType81 = node61.getJSType();
        com.google.javascript.rhino.Node node82 = node48.copyInformationFrom(node61);
        java.lang.String str83 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node82);
        int int84 = node82.getLineno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node85 = node1.getChildBefore(node82);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 409642);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node3 = node1.getChildAtIndex(31);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isName();
        boolean boolean3 = node1.isSwitch();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean6 = node1.hasChild(node5);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getSourceName(node1);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newExpr(node1);
        java.lang.String str9 = node1.getSourceFileName();
        com.google.javascript.rhino.Node node10 = node1.cloneTree();
        boolean boolean11 = node10.isInc();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node13 = node10.getChildAtIndex(10);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isFunction();
        boolean boolean3 = node1.isUnscopedQualifiedName();
        boolean boolean4 = node1.isEmpty();
        boolean boolean5 = node1.isEmpty();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean8 = node7.isName();
        boolean boolean9 = node7.isSwitch();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean12 = node7.hasChild(node11);
        boolean boolean13 = node7.isVar();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean16 = node15.isName();
        boolean boolean17 = node15.isSwitch();
        java.lang.String str18 = node15.toString();
        boolean boolean19 = node15.isWith();
        com.google.javascript.rhino.Node node20 = node7.srcref(node15);
        node7.detachChildren();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        com.google.javascript.jscomp.CodingConvention.Bind bind24 = new com.google.javascript.jscomp.CodingConvention.Bind(node1, node7, node23);
        boolean boolean25 = node1.isNew();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean28 = node27.isName();
        boolean boolean29 = node27.isSwitch();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean32 = node27.hasChild(node31);
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newExpr(node27);
        boolean boolean34 = node33.isGetElem();
        com.google.javascript.rhino.Node node35 = node33.cloneTree();
        int int36 = node35.getCharno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node37 = node1.getChildBefore(node35);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isName();
        boolean boolean3 = node1.isSwitch();
        java.lang.String str4 = node1.toString();
        boolean boolean5 = node1.isWith();
        boolean boolean6 = node1.isBreak();
        node1.setLength(130);
        boolean boolean9 = node1.isUnscopedQualifiedName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile10 = node1.getStaticSourceFile();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean13 = node12.isName();
        boolean boolean14 = node12.isSwitch();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean17 = node12.hasChild(node16);
        boolean boolean18 = node16.isGetElem();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection19 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node16);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) (byte) 100, 100, (int) 'a');
        int int25 = node24.getChildCount();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean28 = node27.isName();
        boolean boolean29 = node27.isSwitch();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean32 = node27.hasChild(node31);
        boolean boolean33 = node27.isVar();
        com.google.javascript.rhino.Node node34 = node27.getParent();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean37 = node36.isName();
        boolean boolean38 = node36.isSwitch();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean41 = node36.hasChild(node40);
        boolean boolean42 = node36.isVar();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean45 = node44.isName();
        boolean boolean46 = node44.isSwitch();
        java.lang.String str47 = node44.toString();
        boolean boolean48 = node44.isWith();
        com.google.javascript.rhino.Node node49 = node36.srcref(node44);
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber((double) (byte) 100, 100, (int) 'a');
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(130, node24, node27, node44, node53, 0, 15);
        java.lang.String str57 = node16.checkTreeEquals(node24);
        com.google.javascript.rhino.Node node58 = node24.getLastSibling();
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node24);
        boolean boolean60 = node24.isVar();
        com.google.javascript.rhino.Node node61 = node1.useSourceInfoIfMissingFrom(node24);
        java.lang.String str62 = node61.getSourceFileName();
        com.google.javascript.rhino.Node[] nodeArray65 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node(35, nodeArray65, 54, (int) (byte) 100);
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(10, nodeArray65, 100, 52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node61.removeChild(node71);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isName();
        boolean boolean3 = node1.isSwitch();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean6 = node1.hasChild(node5);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newExpr(node1);
        node1.setOptionalArg(true);
        node1.putBooleanProp((int) (short) -1, true);
        boolean boolean13 = node1.hasChildren();
        boolean boolean14 = node1.isOptionalArg();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node16 = node1.getChildAtIndex(4);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isFunction();
        node1.putIntProp((int) (byte) 100, (int) (short) 1);
        boolean boolean6 = node1.isAdd();
        boolean boolean7 = node1.isArrayLit();
        node1.setSourceEncodedPositionForTree(31);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean12 = node11.isName();
        boolean boolean13 = node11.isSwitch();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean16 = node11.hasChild(node15);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newExpr(node11);
        int int18 = node17.getType();
        int int19 = node17.getChildCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node17);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        com.google.javascript.rhino.Node[] nodeArray4 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(35, nodeArray4, 54, (int) (byte) 100);
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(40, nodeArray4);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(409642, nodeArray4);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (byte) 0, nodeArray4);
        java.lang.String str11 = node10.getQualifiedName();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean14 = node13.isName();
        boolean boolean15 = node13.isSwitch();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean18 = node17.isFunction();
        boolean boolean19 = node17.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node20 = node13.useSourceInfoIfMissingFrom(node17);
        boolean boolean21 = node20.isQuotedString();
        boolean boolean22 = node20.isWhile();
        boolean boolean23 = node20.isContinue();
        boolean boolean24 = node20.isContinue();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean28 = node27.isName();
        boolean boolean29 = node27.isSwitch();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean32 = node27.hasChild(node31);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean35 = node34.isName();
        boolean boolean36 = node34.isSwitch();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean39 = node34.hasChild(node38);
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newExpr(node34);
        boolean boolean41 = node40.isRegExp();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean44 = node43.isName();
        boolean boolean45 = node43.isSwitch();
        java.lang.String str46 = node43.toString();
        com.google.javascript.rhino.Node node47 = node40.useSourceInfoIfMissingFromForTree(node43);
        boolean boolean48 = node31.isEquivalentToTyped(node43);
        boolean boolean49 = node43.isReturn();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(53, node43, (int) (byte) 1, 12);
        node20.addChildrenToBack(node52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node10.removeChild(node52);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean3 = node2.isName();
        boolean boolean4 = node2.isSwitch();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean7 = node2.hasChild(node6);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newExpr(node2);
        boolean boolean9 = node8.isRegExp();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean12 = node11.isName();
        boolean boolean13 = node11.isSwitch();
        java.lang.String str14 = node11.toString();
        com.google.javascript.rhino.Node node15 = node8.useSourceInfoIfMissingFromForTree(node11);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(50, node15);
        com.google.javascript.rhino.Node node17 = node16.cloneNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node19 = node17.getChildAtIndex(42);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isName();
        boolean boolean3 = node1.isSwitch();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean6 = node1.hasChild(node5);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newExpr(node1);
        node1.setOptionalArg(true);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder10 = node1.getJsDocBuilderForNode();
        boolean boolean11 = node1.isName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node13 = node1.getChildAtIndex((int) 'a');
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isName();
        boolean boolean3 = node1.isSwitch();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean6 = node1.hasChild(node5);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newExpr(node1);
        node1.setOptionalArg(true);
        node1.putBooleanProp((int) (short) -1, true);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean15 = node14.isName();
        boolean boolean16 = node14.isSwitch();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean19 = node14.hasChild(node18);
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newExpr(node14);
        boolean boolean21 = node20.isRegExp();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean24 = node23.isName();
        boolean boolean25 = node23.isSwitch();
        java.lang.String str26 = node23.toString();
        com.google.javascript.rhino.Node node27 = node20.useSourceInfoIfMissingFromForTree(node23);
        com.google.javascript.rhino.Node node28 = node1.useSourceInfoFromForTree(node20);
        com.google.javascript.rhino.InputId inputId29 = com.google.javascript.jscomp.NodeUtil.getInputId(node28);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean32 = node31.isName();
        boolean boolean33 = node31.isSwitch();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean36 = node31.hasChild(node35);
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newExpr(node31);
        int int38 = node31.getLength();
        boolean boolean39 = node31.isNew();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean42 = node41.isName();
        boolean boolean43 = node41.isSwitch();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean46 = node41.hasChild(node45);
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newExpr(node41);
        int int48 = node41.getLength();
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet52 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet52, strArray51);
        node41.setDirectives((java.util.Set<java.lang.String>) strSet52);
        boolean boolean56 = node41.getBooleanProp(41);
        com.google.javascript.rhino.Node node57 = node31.useSourceInfoFromForTree(node41);
        com.google.javascript.rhino.Node node58 = node28.useSourceInfoIfMissingFrom(node57);
        int int59 = node57.getLineno();
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean62 = node61.isName();
        boolean boolean63 = node61.isSwitch();
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean66 = node61.hasChild(node65);
        com.google.javascript.rhino.Node node67 = com.google.javascript.jscomp.NodeUtil.newExpr(node65);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node68 = node57.getChildBefore(node67);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isName();
        boolean boolean3 = node1.isSwitch();
        java.lang.String str4 = node1.toString();
        boolean boolean5 = node1.isWith();
        boolean boolean6 = node1.hasOneChild();
        boolean boolean7 = node1.isDebugger();
        com.google.javascript.rhino.Node node8 = node1.cloneNode();
        boolean boolean9 = node1.isCase();
        boolean boolean10 = node1.isSyntheticBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node12 = node1.getChildAtIndex((int) (short) 100);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isName();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean5 = node4.isName();
        boolean boolean6 = node4.isSwitch();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean9 = node4.hasChild(node8);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newExpr(node4);
        boolean boolean11 = node10.isRegExp();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean14 = node13.isName();
        boolean boolean15 = node13.isSwitch();
        java.lang.String str16 = node13.toString();
        com.google.javascript.rhino.Node node17 = node10.useSourceInfoIfMissingFromForTree(node13);
        java.lang.String str18 = node1.checkTreeEquals(node17);
        boolean boolean19 = node1.isScript();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean22 = node21.isName();
        boolean boolean23 = node21.isSwitch();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean26 = node21.hasChild(node25);
        boolean boolean27 = node21.isVar();
        boolean boolean28 = node21.isBreak();
        node1.addChildrenToFront(node21);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean32 = node31.isName();
        boolean boolean33 = node31.isSwitch();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean36 = node31.hasChild(node35);
        boolean boolean37 = node35.isGetElem();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection38 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node35);
        boolean boolean39 = node35.isOptionalArg();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable40 = node35.getAncestors();
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = new com.google.javascript.rhino.JSDocInfo();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList42 = jSDocInfo41.getExtendedInterfaces();
        java.lang.String str43 = jSDocInfo41.getVersion();
        boolean boolean44 = jSDocInfo41.isInterface();
        boolean boolean45 = jSDocInfo41.isJavaDispatch();
        java.lang.String str46 = jSDocInfo41.getSourceName();
        boolean boolean48 = jSDocInfo41.hasDescriptionForParameter("Node tree inequality:\nTree1:\nNUMBER -1.0\n\n\nTree2:\nNUMBER 100.0 100\n\n\nSubtree1: NUMBER -1.0\n\n\nSubtree2: NUMBER 100.0 100\n");
        boolean boolean49 = jSDocInfo41.hasBaseType();
        boolean boolean50 = jSDocInfo41.isExterns();
        node35.setJSDocInfo(jSDocInfo41);
        boolean boolean52 = node35.isInstanceOf();
        node35.setVarArgs(true);
        node35.setVarArgs(true);
        java.lang.String str57 = node35.getQualifiedName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node21.removeChild(node35);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isName();
        boolean boolean3 = node1.isSwitch();
        java.lang.String str4 = node1.toString();
        boolean boolean5 = node1.isNumber();
        boolean boolean6 = node1.isComma();
        boolean boolean7 = node1.isDebugger();
        boolean boolean8 = node1.isWith();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean11 = node10.isName();
        boolean boolean12 = node10.isSwitch();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean15 = node10.hasChild(node14);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean18 = node17.isName();
        boolean boolean19 = node17.isSwitch();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean22 = node17.hasChild(node21);
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newExpr(node17);
        int int24 = node17.getLength();
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        node17.setDirectives((java.util.Set<java.lang.String>) strSet28);
        java.lang.String str31 = node14.checkTreeEquals(node17);
        node14.setSourceEncodedPosition((int) 'a');
        com.google.javascript.rhino.jstype.JSType jSType34 = node14.getJSType();
        com.google.javascript.rhino.Node node35 = node1.copyInformationFrom(node14);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString("Node tree inequality:\nTree1:\nNUMBER -1.0\n\n\nTree2:\nEXPR_RESULT\n    NUMBER -1.0\n\n\nSubtree1: NUMBER -1.0\n\n\nSubtree2: EXPR_RESULT\n    NUMBER -1.0\n");
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean41 = node40.isName();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean44 = node43.isName();
        boolean boolean45 = node43.isSwitch();
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((int) (byte) 100, node38, node40, node43);
        boolean boolean47 = node40.wasEmptyNode();
        com.google.javascript.rhino.Node node48 = node14.useSourceInfoIfMissingFrom(node40);
        boolean boolean49 = node48.isArrayLit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node51 = node48.getChildAtIndex(130);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("Node tree inequality:\nTree1:\nNUMBER -1.0\n\n\nTree2:\nEXPR_RESULT\n    NUMBER -1.0\n\n\nSubtree1: NUMBER -1.0\n\n\nSubtree2: EXPR_RESULT\n    NUMBER -1.0\n", (int) (short) 100, 42);
        node3.setOptionalArg(true);
        boolean boolean6 = node3.isAssign();
        node3.setString("");
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean11 = node10.isName();
        boolean boolean12 = node10.isSwitch();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean15 = node10.hasChild(node14);
        java.lang.String str16 = com.google.javascript.jscomp.NodeUtil.getSourceName(node10);
        node10.setSourceFileForTesting("hi!");
        boolean boolean19 = node10.isString();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean22 = node21.isName();
        boolean boolean23 = node21.isSwitch();
        java.lang.String str24 = node21.toString();
        boolean boolean25 = node21.isWith();
        boolean boolean26 = node21.isBreak();
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = new com.google.javascript.rhino.JSDocInfo();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList28 = jSDocInfo27.getExtendedInterfaces();
        java.util.Collection<java.lang.String> strCollection29 = jSDocInfo27.getReferences();
        java.util.Collection<java.lang.String> strCollection30 = jSDocInfo27.getReferences();
        com.google.javascript.rhino.Node node31 = jSDocInfo27.getAssociatedNode();
        node21.setJSDocInfo(jSDocInfo27);
        com.google.javascript.rhino.Node node33 = node10.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean34 = node21.isGetterDef();
        node21.setIsSyntheticBlock(true);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean39 = node38.isName();
        boolean boolean40 = node38.isSwitch();
        java.lang.String str41 = node38.toString();
        boolean boolean42 = node38.isNumber();
        boolean boolean43 = node38.isComma();
        boolean boolean44 = node38.isDebugger();
        boolean boolean45 = node38.isWith();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean48 = node47.isName();
        boolean boolean49 = node47.isSwitch();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean52 = node47.hasChild(node51);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean55 = node54.isName();
        boolean boolean56 = node54.isSwitch();
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean59 = node54.hasChild(node58);
        com.google.javascript.rhino.Node node60 = com.google.javascript.jscomp.NodeUtil.newExpr(node54);
        int int61 = node54.getLength();
        java.lang.String[] strArray64 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet65 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet65, strArray64);
        node54.setDirectives((java.util.Set<java.lang.String>) strSet65);
        java.lang.String str68 = node51.checkTreeEquals(node54);
        node51.setSourceEncodedPosition((int) 'a');
        com.google.javascript.rhino.jstype.JSType jSType71 = node51.getJSType();
        com.google.javascript.rhino.Node node72 = node38.copyInformationFrom(node51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.replaceChild(node21, node51);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isName();
        boolean boolean3 = node1.isSwitch();
        java.lang.String str4 = node1.toString();
        boolean boolean5 = node1.isWith();
        int int7 = node1.getIntProp((int) ' ');
        boolean boolean8 = node1.isNE();
        com.google.javascript.rhino.InputId inputId9 = node1.getInputId();
        com.google.javascript.rhino.Node node10 = node1.cloneNode();
        java.util.Set<java.lang.String> strSet11 = node1.getDirectives();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean14 = node13.isFunction();
        boolean boolean15 = node13.isNot();
        boolean boolean16 = node13.isIf();
        com.google.javascript.rhino.jstype.JSType jSType17 = node13.getJSType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node18 = node1.getChildBefore(node13);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("BITXOR 0\n", 4095, (int) (byte) 100);
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = new com.google.javascript.rhino.JSDocInfo();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList6 = jSDocInfo5.getExtendedInterfaces();
        java.lang.String str7 = jSDocInfo5.getVersion();
        boolean boolean8 = jSDocInfo5.isInterface();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection9 = jSDocInfo5.getMarkers();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean12 = node11.isName();
        boolean boolean13 = node11.isSwitch();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean16 = node11.hasChild(node15);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newExpr(node11);
        int int18 = node17.getType();
        boolean boolean19 = node17.isDefaultCase();
        jSDocInfo5.setAssociatedNode(node17);
        node17.setSourceEncodedPosition(54);
        node17.putBooleanProp(4, true);
        boolean boolean26 = node17.hasOneChild();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(29, node17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node28 = node3.getChildBefore(node17);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 43, 16, 52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node5 = node3.getChildAtIndex(27);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean3 = node2.isName();
        boolean boolean4 = node2.isSwitch();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean7 = node2.hasChild(node6);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newExpr(node2);
        boolean boolean9 = node8.isRegExp();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean12 = node11.isName();
        boolean boolean13 = node11.isSwitch();
        java.lang.String str14 = node11.toString();
        com.google.javascript.rhino.Node node15 = node8.useSourceInfoIfMissingFromForTree(node11);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(50, node15);
        boolean boolean17 = node15.isGetterDef();
        boolean boolean18 = node15.isVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = new com.google.javascript.rhino.JSDocInfo();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList20 = jSDocInfo19.getExtendedInterfaces();
        java.lang.String str21 = jSDocInfo19.getVersion();
        boolean boolean22 = jSDocInfo19.isInterface();
        boolean boolean23 = jSDocInfo19.isJavaDispatch();
        java.lang.String str24 = jSDocInfo19.getSourceName();
        java.lang.String str25 = jSDocInfo19.toString();
        boolean boolean26 = jSDocInfo19.hasFileOverview();
        java.util.Set<java.lang.String> strSet27 = jSDocInfo19.getParameterNames();
        java.lang.String str28 = jSDocInfo19.getLendsName();
        int int29 = jSDocInfo19.getImplementedInterfaceCount();
        node15.setJSDocInfo(jSDocInfo19);
        boolean boolean31 = node15.isLabelName();
        boolean boolean32 = node15.isDebugger();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString("BITXOR 0\n", 4095, (int) (byte) 100);
        node15.addChildrenToBack(node36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node39 = node36.getChildAtIndex(97);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isFunction();
        boolean boolean3 = node1.isUnscopedQualifiedName();
        boolean boolean4 = node1.isEmpty();
        boolean boolean5 = node1.isEmpty();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean8 = node7.isName();
        boolean boolean9 = node7.isSwitch();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean12 = node7.hasChild(node11);
        boolean boolean13 = node7.isVar();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean16 = node15.isName();
        boolean boolean17 = node15.isSwitch();
        java.lang.String str18 = node15.toString();
        boolean boolean19 = node15.isWith();
        com.google.javascript.rhino.Node node20 = node7.srcref(node15);
        node7.detachChildren();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        com.google.javascript.jscomp.CodingConvention.Bind bind24 = new com.google.javascript.jscomp.CodingConvention.Bind(node1, node7, node23);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean28 = node27.isName();
        boolean boolean29 = node27.isSwitch();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean32 = node27.hasChild(node31);
        java.lang.String str33 = com.google.javascript.jscomp.NodeUtil.getSourceName(node27);
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newExpr(node27);
        node27.setCharno(30);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean39 = node38.isFunction();
        com.google.javascript.rhino.Node node40 = node38.cloneTree();
        int int41 = node38.getCharno();
        boolean boolean42 = node38.isAssign();
        com.google.javascript.rhino.InputId inputId43 = com.google.javascript.jscomp.NodeUtil.getInputId(node38);
        node38.setSourceEncodedPosition((int) (short) 1);
        java.lang.String str46 = node27.checkTreeEquals(node38);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        node48.setWasEmptyNode(true);
        boolean boolean51 = node48.isOr();
        boolean boolean52 = node48.isRegExp();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean55 = node54.isName();
        boolean boolean56 = node54.isSwitch();
        java.lang.String str57 = node54.toString();
        boolean boolean58 = node54.isNumber();
        boolean boolean59 = node54.isComma();
        boolean boolean60 = node54.isDebugger();
        boolean boolean61 = node54.isOptionalArg();
        com.google.javascript.rhino.jstype.JSType jSType62 = node54.getJSType();
        boolean boolean63 = node54.isEmpty();
        com.google.javascript.rhino.Node node64 = node48.useSourceInfoIfMissingFrom(node54);
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node(47, node38, node48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node23.removeChild(node48);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        com.google.javascript.rhino.Node[] nodeArray3 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(35, nodeArray3, 54, (int) (byte) 100);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(10, nodeArray3, 100, 52);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray3);
        boolean boolean11 = node10.isBreak();
        com.google.javascript.rhino.Node node12 = node10.cloneNode();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(29, 0, 4095);
        boolean boolean17 = node16.wasEmptyNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node10.removeChild(node16);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isName();
        boolean boolean3 = node1.isSwitch();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean6 = node1.hasChild(node5);
        boolean boolean7 = node1.isReturn();
        boolean boolean8 = node1.isFromExterns();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean11 = node10.isFunction();
        boolean boolean12 = node10.isUnscopedQualifiedName();
        boolean boolean13 = node10.isEmpty();
        boolean boolean14 = node10.isEmpty();
        boolean boolean15 = node10.isAssign();
        boolean boolean16 = node10.isScript();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node10);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean3 = node2.isName();
        boolean boolean4 = node2.isSwitch();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean7 = node2.hasChild(node6);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newExpr(node2);
        boolean boolean9 = node8.isRegExp();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean12 = node11.isName();
        boolean boolean13 = node11.isSwitch();
        java.lang.String str14 = node11.toString();
        com.google.javascript.rhino.Node node15 = node8.useSourceInfoIfMissingFromForTree(node11);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(50, node15);
        boolean boolean17 = node15.isGetterDef();
        boolean boolean18 = node15.isVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = new com.google.javascript.rhino.JSDocInfo();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList20 = jSDocInfo19.getExtendedInterfaces();
        java.lang.String str21 = jSDocInfo19.getVersion();
        boolean boolean22 = jSDocInfo19.isInterface();
        boolean boolean23 = jSDocInfo19.isJavaDispatch();
        java.lang.String str24 = jSDocInfo19.getSourceName();
        java.lang.String str25 = jSDocInfo19.toString();
        boolean boolean26 = jSDocInfo19.hasFileOverview();
        java.util.Set<java.lang.String> strSet27 = jSDocInfo19.getParameterNames();
        java.lang.String str28 = jSDocInfo19.getLendsName();
        int int29 = jSDocInfo19.getImplementedInterfaceCount();
        node15.setJSDocInfo(jSDocInfo19);
        boolean boolean31 = node15.isLabelName();
        boolean boolean32 = node15.isDebugger();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString("BITXOR 0\n", 4095, (int) (byte) 100);
        node15.addChildrenToBack(node36);
        boolean boolean38 = node36.isDo();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean41 = node40.isName();
        boolean boolean42 = node40.isSwitch();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean45 = node40.hasChild(node44);
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newExpr(node40);
        node40.setOptionalArg(true);
        node40.putBooleanProp((int) (short) -1, true);
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean54 = node53.isName();
        boolean boolean55 = node53.isSwitch();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean58 = node53.hasChild(node57);
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newExpr(node53);
        boolean boolean60 = node59.isRegExp();
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean63 = node62.isName();
        boolean boolean64 = node62.isSwitch();
        java.lang.String str65 = node62.toString();
        com.google.javascript.rhino.Node node66 = node59.useSourceInfoIfMissingFromForTree(node62);
        com.google.javascript.rhino.Node node67 = node40.useSourceInfoFromForTree(node59);
        boolean boolean68 = node40.hasOneChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node69 = node36.getChildBefore(node40);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("hi!");
        boolean boolean2 = node1.isInstanceOf();
        int int3 = node1.getSideEffectFlags();
        boolean boolean4 = node1.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(29, 0, 4095);
        com.google.javascript.rhino.Node node9 = node8.getLastChild();
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node8);
        com.google.javascript.rhino.Node node11 = node8.cloneTree();
        boolean boolean12 = node8.isContinue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node13 = node1.getChildBefore(node8);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 10, 100, 12);
        boolean boolean4 = node3.isDec();
        node3.setLineno(100);
        boolean boolean7 = node3.isGetProp();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean10 = node9.isName();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean13 = node12.isName();
        boolean boolean14 = node12.isSwitch();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean17 = node12.hasChild(node16);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newExpr(node12);
        boolean boolean19 = node18.isRegExp();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean22 = node21.isName();
        boolean boolean23 = node21.isSwitch();
        java.lang.String str24 = node21.toString();
        com.google.javascript.rhino.Node node25 = node18.useSourceInfoIfMissingFromForTree(node21);
        java.lang.String str26 = node9.checkTreeEquals(node25);
        boolean boolean27 = node9.isIf();
        java.lang.String str28 = node9.getSourceFileName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node9);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isName();
        boolean boolean3 = node1.isSwitch();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean6 = node1.hasChild(node5);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newExpr(node1);
        int int8 = node1.getLength();
        boolean boolean9 = node1.isNew();
        boolean boolean10 = node1.isBreak();
        boolean boolean11 = node1.isDec();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node13 = node1.getChildAtIndex(30);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isName();
        boolean boolean3 = node1.isSwitch();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean6 = node1.hasChild(node5);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newExpr(node1);
        int int8 = node1.getLength();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder9 = node1.new FileLevelJsDocBuilder();
        boolean boolean10 = node1.isAssignAdd();
        boolean boolean11 = node1.isBreak();
        boolean boolean12 = node1.isInc();
        int int14 = node1.getIntProp((-1));
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean17 = node16.isName();
        boolean boolean18 = node16.isSwitch();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean21 = node16.hasChild(node20);
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newExpr(node16);
        boolean boolean23 = node22.isInstanceOf();
        com.google.javascript.rhino.InputId inputId24 = com.google.javascript.jscomp.NodeUtil.getInputId(node22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node22);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(0, "NUMBER -1.0", (int) '#', 44);
        boolean boolean6 = node5.isUnscopedQualifiedName();
        int int7 = node5.getSourceOffset();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean10 = node9.isName();
        boolean boolean11 = node9.isSwitch();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean14 = node9.hasChild(node13);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newExpr(node9);
        boolean boolean16 = node15.isRegExp();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean19 = node18.isName();
        boolean boolean20 = node18.isSwitch();
        java.lang.String str21 = node18.toString();
        com.google.javascript.rhino.Node node22 = node15.useSourceInfoIfMissingFromForTree(node18);
        com.google.javascript.rhino.Node node23 = node22.removeChildren();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(27, node5, node23, (-1), 0);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean30 = node29.isName();
        boolean boolean31 = node29.isSwitch();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean34 = node29.hasChild(node33);
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newExpr(node29);
        boolean boolean36 = node35.isRegExp();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean39 = node38.isName();
        boolean boolean40 = node38.isSwitch();
        java.lang.String str41 = node38.toString();
        com.google.javascript.rhino.Node node42 = node35.useSourceInfoIfMissingFromForTree(node38);
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(50, node42);
        java.lang.String str44 = node42.getSourceFileName();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString("Node tree inequality:\nTree1:\nNUMBER -1.0\n\n\nTree2:\nEXPR_RESULT\n    NUMBER -1.0\n\n\nSubtree1: NUMBER -1.0\n\n\nSubtree2: EXPR_RESULT\n    NUMBER -1.0\n");
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean50 = node49.isName();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean53 = node52.isName();
        boolean boolean54 = node52.isSwitch();
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((int) (byte) 100, node47, node49, node52);
        boolean boolean56 = node49.isBreak();
        com.google.javascript.rhino.Node node57 = node49.cloneNode();
        boolean boolean58 = node42.isEquivalentTo(node57);
        boolean boolean59 = node42.isSyntheticBlock();
        boolean boolean60 = node42.isNumber();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node61 = node23.getChildBefore(node42);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isName();
        boolean boolean3 = node1.isSwitch();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean6 = node1.hasChild(node5);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newExpr(node1);
        boolean boolean8 = node1.isIn();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean11 = node10.isName();
        boolean boolean12 = node10.isSwitch();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean15 = node10.hasChild(node14);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newExpr(node10);
        int int17 = node16.getType();
        com.google.javascript.rhino.Node node18 = node16.getFirstChild();
        com.google.javascript.rhino.Node node19 = node16.getLastChild();
        com.google.javascript.rhino.Node node20 = node1.useSourceInfoFromForTree(node16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node22 = node16.getChildAtIndex(8);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        node1.setWasEmptyNode(true);
        boolean boolean4 = node1.isCatch();
        boolean boolean5 = node1.wasEmptyNode();
        boolean boolean6 = node1.isLabelName();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition7 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean8 = typePosition7.hasBrackets();
        int int9 = typePosition7.getEndLine();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean12 = node11.isName();
        boolean boolean13 = node11.isSwitch();
        java.lang.String str14 = node11.toString();
        boolean boolean15 = node11.isWith();
        int int17 = node11.getIntProp((int) ' ');
        boolean boolean18 = node11.isNE();
        com.google.javascript.rhino.jstype.JSType jSType19 = node11.getJSType();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition20 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int21 = namePosition20.getPositionOnStartLine();
        int int22 = namePosition20.getStartLine();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean25 = node24.isName();
        boolean boolean26 = node24.isSwitch();
        java.lang.String str27 = node24.toString();
        boolean boolean28 = node24.isNumber();
        boolean boolean29 = node24.isComma();
        boolean boolean30 = node24.isDebugger();
        boolean boolean31 = node24.isWith();
        namePosition20.setItem(node24);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean35 = node34.isName();
        boolean boolean36 = node34.isSwitch();
        java.lang.String str37 = node34.toString();
        boolean boolean38 = node34.isWith();
        int int40 = node34.getIntProp((int) ' ');
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder41 = node34.new FileLevelJsDocBuilder();
        int int42 = node24.getIndexOfChild(node34);
        node11.addChildToFront(node34);
        boolean boolean44 = node34.isRegExp();
        typePosition7.setItem(node34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node34);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isName();
        boolean boolean3 = node1.isSwitch();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean6 = node1.hasChild(node5);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newExpr(node1);
        boolean boolean8 = node7.isGetElem();
        boolean boolean9 = node7.isTypeOf();
        boolean boolean10 = node7.isAnd();
        boolean boolean11 = node7.isThrow();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node13 = node7.getChildAtIndex((int) 'a');
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isName();
        boolean boolean3 = node1.isSwitch();
        node1.detachChildren();
        boolean boolean5 = node1.isDebugger();
        boolean boolean6 = node1.isIf();
        boolean boolean7 = node1.isDefaultCase();
        boolean boolean8 = node1.isGetElem();
        boolean boolean9 = node1.isDec();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node11 = node1.getChildAtIndex(4);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isName();
        boolean boolean3 = node1.isSwitch();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean6 = node1.hasChild(node5);
        int int7 = node5.getLineno();
        boolean boolean8 = node5.isAdd();
        java.util.Set<java.lang.String> strSet9 = node5.getDirectives();
        com.google.javascript.rhino.Node node10 = node5.getLastSibling();
        boolean boolean11 = node5.isDebugger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node13 = node5.getChildAtIndex(44);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isName();
        boolean boolean3 = node1.isSwitch();
        java.lang.String str4 = node1.toString();
        boolean boolean5 = node1.isNumber();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean8 = node7.isName();
        boolean boolean9 = node7.isSwitch();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean12 = node7.hasChild(node11);
        boolean boolean13 = node11.isGetElem();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection14 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node11);
        int int15 = node11.getType();
        boolean boolean16 = node11.isThrow();
        boolean boolean17 = node11.isDebugger();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean20 = node19.isName();
        boolean boolean21 = node19.isSwitch();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean24 = node19.hasChild(node23);
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newExpr(node19);
        node19.setOptionalArg(true);
        node19.putBooleanProp((int) (short) -1, true);
        int int31 = node19.getLineno();
        boolean boolean32 = node19.isDebugger();
        boolean boolean33 = node11.hasChild(node19);
        boolean boolean34 = node19.isBlock();
        boolean boolean35 = node19.isGetterDef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node36 = node1.getChildBefore(node19);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isName();
        boolean boolean3 = node1.isSwitch();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean6 = node1.hasChild(node5);
        boolean boolean7 = node1.isVar();
        boolean boolean8 = node1.isBreak();
        java.lang.String str9 = node1.toString();
        int int10 = node1.getSourceOffset();
        boolean boolean11 = node1.isExprResult();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node13 = node1.getChildAtIndex(143361);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isName();
        boolean boolean3 = node1.isSwitch();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean6 = node5.isFunction();
        boolean boolean7 = node5.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node8 = node1.useSourceInfoIfMissingFrom(node5);
        boolean boolean9 = node1.isNE();
        java.lang.String str10 = node1.toStringTree();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean13 = node12.isName();
        boolean boolean14 = node12.isSwitch();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean17 = node12.hasChild(node16);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newExpr(node12);
        int int19 = node12.getLength();
        node12.addSuppression("Node tree inequality:\nTree1:\nNUMBER -1.0\n\n\nTree2:\nEXPR_RESULT\n    NUMBER -1.0\n\n\nSubtree1: NUMBER -1.0\n\n\nSubtree2: EXPR_RESULT\n    NUMBER -1.0\n");
        java.lang.String str22 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node12);
        boolean boolean23 = node12.isWhile();
        com.google.javascript.rhino.Node node24 = node12.getLastChild();
        boolean boolean25 = node12.isGetProp();
        node12.setSourceFileForTesting("STRING Node tree inequality:\nTree1:\nNUMBER -1.0\n\n\nTree2:\nEXPR_RESULT\n    NUMBER -1.0\n\n\nSubtree1: NUMBER -1.0\n\n\nSubtree2: EXPR_RESULT\n    NUMBER -1.0\n 100\n");
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean30 = node29.isName();
        boolean boolean31 = node29.isSwitch();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean34 = node29.hasChild(node33);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder35 = node29.new FileLevelJsDocBuilder();
        java.lang.String str36 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node29);
        com.google.javascript.rhino.jstype.JSType jSType37 = node29.getJSType();
        boolean boolean38 = node29.isLabelName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.replaceChild(node12, node29);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isName();
        boolean boolean3 = node1.isSwitch();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean6 = node1.hasChild(node5);
        boolean boolean7 = node1.isReturn();
        java.lang.Object obj9 = node1.getProp(0);
        node1.setIsSyntheticBlock(true);
        boolean boolean12 = node1.isSetterDef();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) (byte) 100, 100, (int) 'a');
        int int18 = node17.getChildCount();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean21 = node20.isName();
        boolean boolean22 = node20.isSwitch();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean25 = node20.hasChild(node24);
        boolean boolean26 = node20.isVar();
        com.google.javascript.rhino.Node node27 = node20.getParent();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean30 = node29.isName();
        boolean boolean31 = node29.isSwitch();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean34 = node29.hasChild(node33);
        boolean boolean35 = node29.isVar();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean38 = node37.isName();
        boolean boolean39 = node37.isSwitch();
        java.lang.String str40 = node37.toString();
        boolean boolean41 = node37.isWith();
        com.google.javascript.rhino.Node node42 = node29.srcref(node37);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber((double) (byte) 100, 100, (int) 'a');
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(130, node17, node20, node37, node46, 0, 15);
        boolean boolean50 = node37.isTypeOf();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean53 = node52.isName();
        double double54 = node52.getDouble();
        node37.addChildToFront(node52);
        com.google.javascript.rhino.Node node56 = node37.getLastChild();
        boolean boolean57 = node37.isTry();
        boolean boolean58 = node37.isStringKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node59 = node1.getChildBefore(node37);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isName();
        boolean boolean3 = node1.isSwitch();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean6 = node1.hasChild(node5);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getSourceName(node1);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newExpr(node1);
        node1.setCharno(30);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean14 = node13.isName();
        boolean boolean15 = node13.isSwitch();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean18 = node13.hasChild(node17);
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newExpr(node13);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean22 = node21.isName();
        boolean boolean23 = node21.isSwitch();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean26 = node21.hasChild(node25);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newExpr(node21);
        node21.setOptionalArg(true);
        node21.putBooleanProp((int) (short) -1, true);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean35 = node34.isName();
        boolean boolean36 = node34.isSwitch();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean39 = node34.hasChild(node38);
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newExpr(node34);
        boolean boolean41 = node40.isRegExp();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean44 = node43.isName();
        boolean boolean45 = node43.isSwitch();
        java.lang.String str46 = node43.toString();
        com.google.javascript.rhino.Node node47 = node40.useSourceInfoIfMissingFromForTree(node43);
        com.google.javascript.rhino.Node node48 = node21.useSourceInfoFromForTree(node40);
        boolean boolean49 = node19.hasChild(node21);
        node19.setIsSyntheticBlock(true);
        boolean boolean52 = node19.isVar();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean55 = node54.isName();
        boolean boolean56 = node54.isSwitch();
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean59 = node54.hasChild(node58);
        java.lang.String str60 = com.google.javascript.jscomp.NodeUtil.getSourceName(node54);
        java.lang.String str61 = node54.getSourceFileName();
        int int62 = node54.getLength();
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean65 = node64.isName();
        boolean boolean66 = node64.isSwitch();
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean69 = node64.hasChild(node68);
        boolean boolean70 = node64.isVar();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean73 = node72.isName();
        boolean boolean74 = node72.isSwitch();
        java.lang.String str75 = node72.toString();
        boolean boolean76 = node72.isWith();
        com.google.javascript.rhino.Node node77 = node64.srcref(node72);
        boolean boolean78 = node72.isFor();
        boolean boolean79 = node72.isGetterDef();
        com.google.javascript.rhino.Node node81 = node72.getAncestor(0);
        boolean boolean82 = node81.isDec();
        com.google.javascript.rhino.Node node85 = new com.google.javascript.rhino.Node((-1), node19, node54, node81, 30, 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node81);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isName();
        boolean boolean3 = node1.isSwitch();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean6 = node5.isFunction();
        boolean boolean7 = node5.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node8 = node1.useSourceInfoIfMissingFrom(node5);
        boolean boolean9 = node1.isNE();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean12 = node11.isName();
        boolean boolean13 = node11.isSwitch();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean16 = node11.hasChild(node15);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newExpr(node11);
        node11.setOptionalArg(true);
        node11.putBooleanProp((int) (short) -1, true);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean25 = node24.isName();
        boolean boolean26 = node24.isSwitch();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean29 = node24.hasChild(node28);
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newExpr(node24);
        boolean boolean31 = node30.isRegExp();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean34 = node33.isName();
        boolean boolean35 = node33.isSwitch();
        java.lang.String str36 = node33.toString();
        com.google.javascript.rhino.Node node37 = node30.useSourceInfoIfMissingFromForTree(node33);
        com.google.javascript.rhino.Node node38 = node11.useSourceInfoFromForTree(node30);
        boolean boolean39 = node11.hasOneChild();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean42 = node41.isName();
        boolean boolean43 = node41.isSwitch();
        java.lang.String str44 = node41.toString();
        boolean boolean45 = node41.isVar();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean48 = node47.isName();
        boolean boolean49 = node47.isSwitch();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean52 = node47.hasChild(node51);
        com.google.javascript.rhino.Node node53 = com.google.javascript.jscomp.NodeUtil.newExpr(node47);
        boolean boolean54 = node53.isRegExp();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean57 = node56.isName();
        boolean boolean58 = node56.isSwitch();
        java.lang.String str59 = node56.toString();
        com.google.javascript.rhino.Node node60 = node53.useSourceInfoIfMissingFromForTree(node56);
        com.google.javascript.jscomp.CodingConvention.Bind bind61 = new com.google.javascript.jscomp.CodingConvention.Bind(node11, node41, node53);
        com.google.javascript.rhino.InputId inputId63 = new com.google.javascript.rhino.InputId("");
        java.lang.String str64 = inputId63.getIdName();
        java.lang.String str65 = inputId63.getIdName();
        node41.setInputId(inputId63);
        boolean boolean67 = node41.isContinue();
        com.google.javascript.rhino.Node node68 = node1.srcref(node41);
        int int70 = node41.getIntProp(46);
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean73 = node72.isName();
        boolean boolean74 = node72.isSwitch();
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean77 = node72.hasChild(node76);
        int int78 = node76.getLineno();
        boolean boolean79 = node76.isAdd();
        int int80 = node76.getLineno();
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean83 = node82.isName();
        boolean boolean84 = node82.isSwitch();
        com.google.javascript.rhino.Node node86 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean87 = node82.hasChild(node86);
        com.google.javascript.rhino.Node node88 = com.google.javascript.jscomp.NodeUtil.newExpr(node82);
        boolean boolean89 = node88.isGetElem();
        com.google.javascript.rhino.Node node90 = node88.cloneTree();
        boolean boolean91 = node90.isBreak();
        com.google.javascript.rhino.Node node92 = node76.srcrefTree(node90);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node41.removeChild(node90);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isName();
        boolean boolean3 = node1.isSwitch();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean6 = node1.hasChild(node5);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newExpr(node1);
        int int8 = node1.getLength();
        boolean boolean9 = node1.isNew();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean12 = node11.isName();
        boolean boolean13 = node11.isSwitch();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean16 = node11.hasChild(node15);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newExpr(node11);
        int int18 = node11.getLength();
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        node11.setDirectives((java.util.Set<java.lang.String>) strSet22);
        boolean boolean26 = node11.getBooleanProp(41);
        com.google.javascript.rhino.Node node27 = node1.useSourceInfoFromForTree(node11);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean30 = node29.isName();
        boolean boolean31 = node29.isSwitch();
        boolean boolean32 = node27.hasChild(node29);
        boolean boolean33 = node29.isVar();
        boolean boolean34 = node29.isAnd();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node36 = node29.getChildAtIndex((int) ' ');
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("Node tree inequality:\nTree1:\nNUMBER -1.0\n\n\nTree2:\nEXPR_RESULT\n    NUMBER -1.0\n\n\nSubtree1: NUMBER -1.0\n\n\nSubtree2: EXPR_RESULT\n    NUMBER -1.0\n");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean5 = node4.isName();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean8 = node7.isName();
        boolean boolean9 = node7.isSwitch();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (byte) 100, node2, node4, node7);
        boolean boolean11 = node4.isLabelName();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("BITXOR 0\n", 41, (int) ' ');
        boolean boolean17 = node16.isFunction();
        node16.setQuotedString();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.Node node21 = node20.removeFirstChild();
        boolean boolean22 = node20.isQualifiedName();
        boolean boolean23 = node20.isExprResult();
        boolean boolean24 = node20.isOptionalArg();
        boolean boolean25 = node20.isThrow();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(2, node16, node20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.removeChild(node16);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isName();
        boolean boolean3 = node1.isSwitch();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean6 = node1.hasChild(node5);
        boolean boolean7 = node1.isVar();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean10 = node9.isName();
        boolean boolean11 = node9.isSwitch();
        java.lang.String str12 = node9.toString();
        boolean boolean13 = node9.isWith();
        com.google.javascript.rhino.Node node14 = node1.srcref(node9);
        boolean boolean15 = node9.isFor();
        boolean boolean16 = node9.isGetterDef();
        com.google.javascript.rhino.Node node18 = node9.getAncestor(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node20 = node9.getChildAtIndex(53);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isName();
        boolean boolean3 = node1.isSwitch();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean6 = node1.hasChild(node5);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getSourceName(node1);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newExpr(node1);
        java.lang.String str9 = node1.getSourceFileName();
        boolean boolean10 = node1.isFalse();
        boolean boolean11 = node1.isParamList();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node13 = node1.getChildAtIndex(12);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isName();
        boolean boolean3 = node1.isSwitch();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean6 = node1.hasChild(node5);
        java.lang.String str7 = node1.getSourceFileName();
        boolean boolean8 = node1.isIn();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder9 = node1.new FileLevelJsDocBuilder();
        boolean boolean10 = node1.isReturn();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean13 = node12.isName();
        boolean boolean14 = node12.isSwitch();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean17 = node12.hasChild(node16);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newExpr(node12);
        boolean boolean19 = node18.isRegExp();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean22 = node21.isName();
        boolean boolean23 = node21.isSwitch();
        java.lang.String str24 = node21.toString();
        com.google.javascript.rhino.Node node25 = node18.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean26 = node18.isDo();
        boolean boolean27 = node18.isWhile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node18);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 15, 50, (int) '4');
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean7 = node6.isName();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean10 = node9.isName();
        boolean boolean11 = node9.isSwitch();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean14 = node9.hasChild(node13);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newExpr(node9);
        boolean boolean16 = node15.isRegExp();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean19 = node18.isName();
        boolean boolean20 = node18.isSwitch();
        java.lang.String str21 = node18.toString();
        com.google.javascript.rhino.Node node22 = node15.useSourceInfoIfMissingFromForTree(node18);
        java.lang.String str23 = node6.checkTreeEquals(node22);
        boolean boolean24 = node6.isScript();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection25 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node6);
        boolean boolean26 = node6.isCatch();
        boolean boolean28 = node6.getBooleanProp(47);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(409612, node6, 4095, 39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node6);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(43, 42, (int) ' ');
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 100, 4095, 16);
        boolean boolean8 = node7.isBreak();
        java.lang.String str9 = node7.toStringTree();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node7);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isName();
        boolean boolean3 = node1.isSwitch();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean6 = node1.hasChild(node5);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newExpr(node1);
        boolean boolean8 = node7.isRegExp();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean11 = node10.isName();
        boolean boolean12 = node10.isSwitch();
        java.lang.String str13 = node10.toString();
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node10);
        node10.setCharno(31);
        java.lang.String str20 = node10.toString(false, true, true);
        java.lang.String str21 = node10.toString();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Set<java.lang.String> strSet23 = jSDocInfo22.getParameterNames();
        java.util.stream.Stream<java.lang.String> strStream24 = strSet23.stream();
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean34 = node33.isName();
        boolean boolean35 = node33.isSwitch();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean38 = node33.hasChild(node37);
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newExpr(node33);
        int int40 = node33.getLength();
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet44 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet44, strArray43);
        node33.setDirectives((java.util.Set<java.lang.String>) strSet44);
        java.util.Spliterator<java.lang.String> strSpliterator47 = strSet44.spliterator();
        boolean boolean48 = strSet30.retainAll((java.util.Collection<java.lang.String>) strSet44);
        java.lang.Object[] objArray49 = strSet30.toArray();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean52 = node51.isName();
        boolean boolean53 = node51.isSwitch();
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean56 = node51.hasChild(node55);
        com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.newExpr(node51);
        int int58 = node51.getLength();
        java.lang.String[] strArray61 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet62 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet62, strArray61);
        node51.setDirectives((java.util.Set<java.lang.String>) strSet62);
        boolean boolean65 = strSet62.isEmpty();
        boolean boolean66 = strSet30.containsAll((java.util.Collection<java.lang.String>) strSet62);
        boolean boolean67 = strSet23.containsAll((java.util.Collection<java.lang.String>) strSet30);
        int int68 = strSet30.size();
        com.google.javascript.rhino.JSDocInfo jSDocInfo69 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Set<java.lang.String> strSet70 = jSDocInfo69.getParameterNames();
        boolean boolean72 = jSDocInfo69.hasParameter("hi!");
        boolean boolean73 = jSDocInfo69.hasThisType();
        boolean boolean74 = jSDocInfo69.isIdGenerator();
        boolean boolean75 = jSDocInfo69.isDeprecated();
        boolean boolean76 = strSet30.remove((java.lang.Object) boolean75);
        java.util.Spliterator<java.lang.String> strSpliterator77 = strSet30.spliterator();
        com.google.javascript.rhino.Node node79 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean80 = node79.isName();
        boolean boolean81 = node79.isSwitch();
        node79.detachChildren();
        boolean boolean83 = node79.isDebugger();
        boolean boolean84 = node79.isIf();
        boolean boolean85 = node79.isDefaultCase();
        boolean boolean86 = node79.isGetElem();
        boolean boolean87 = strSet30.contains((java.lang.Object) node79);
        int int88 = node79.getSideEffectFlags();
        boolean boolean89 = node79.isEmpty();
        java.lang.String str90 = node79.getSourceFileName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node91 = node10.getChildBefore(node79);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(42, 0, 32);
        int int5 = node3.getIntProp(52);
        boolean boolean6 = node3.isFor();
        int int7 = node3.getLength();
        node3.putBooleanProp(50, true);
        boolean boolean11 = node3.isDebugger();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean15 = node14.isName();
        boolean boolean16 = node14.isSwitch();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean19 = node14.hasChild(node18);
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newExpr(node14);
        boolean boolean21 = node20.isRegExp();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean24 = node23.isName();
        boolean boolean25 = node23.isSwitch();
        java.lang.String str26 = node23.toString();
        com.google.javascript.rhino.Node node27 = node20.useSourceInfoIfMissingFromForTree(node23);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        node29.setWasEmptyNode(true);
        boolean boolean32 = node29.isOr();
        boolean boolean33 = node29.isInstanceOf();
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) '#', node27, node29, 32, 4095);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile37 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node29);
        boolean boolean38 = node29.isGetProp();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber((double) (byte) 100, 100, (int) 'a');
        int int44 = node43.getChildCount();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean47 = node46.isName();
        boolean boolean48 = node46.isSwitch();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean51 = node46.hasChild(node50);
        boolean boolean52 = node46.isVar();
        com.google.javascript.rhino.Node node53 = node46.getParent();
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean56 = node55.isName();
        boolean boolean57 = node55.isSwitch();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean60 = node55.hasChild(node59);
        boolean boolean61 = node55.isVar();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean64 = node63.isName();
        boolean boolean65 = node63.isSwitch();
        java.lang.String str66 = node63.toString();
        boolean boolean67 = node63.isWith();
        com.google.javascript.rhino.Node node68 = node55.srcref(node63);
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newNumber((double) (byte) 100, 100, (int) 'a');
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node(130, node43, node46, node63, node72, 0, 15);
        node75.removeProp(42);
        boolean boolean78 = node75.isCatch();
        boolean boolean79 = node75.isGetElem();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.replaceChild(node29, node75);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isName();
        boolean boolean3 = node1.isSwitch();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean6 = node1.hasChild(node5);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newExpr(node1);
        int int8 = node1.getLength();
        boolean boolean9 = node1.isNew();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean12 = node11.isName();
        boolean boolean13 = node11.isSwitch();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean16 = node11.hasChild(node15);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newExpr(node11);
        int int18 = node11.getLength();
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        node11.setDirectives((java.util.Set<java.lang.String>) strSet22);
        boolean boolean26 = node11.getBooleanProp(41);
        com.google.javascript.rhino.Node node27 = node1.useSourceInfoFromForTree(node11);
        com.google.javascript.rhino.InputId inputId29 = new com.google.javascript.rhino.InputId("");
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean32 = node31.isName();
        boolean boolean33 = node31.isSwitch();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean36 = node31.hasChild(node35);
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newExpr(node31);
        node31.setOptionalArg(true);
        node31.putBooleanProp((int) (short) -1, true);
        boolean boolean43 = inputId29.equals((java.lang.Object) true);
        node11.setInputId(inputId29);
        boolean boolean45 = node11.isFunction();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber((double) (byte) 100, 100, (int) 'a');
        int int50 = node49.getChildCount();
        boolean boolean51 = node49.isFor();
        boolean boolean52 = node49.isNew();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable53 = node49.children();
        boolean boolean54 = node49.isUnscopedQualifiedName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node55 = node11.getChildBefore(node49);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isName();
        boolean boolean3 = node1.isSwitch();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean6 = node1.hasChild(node5);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newExpr(node1);
        int int8 = node1.getLength();
        boolean boolean9 = node1.isNew();
        com.google.javascript.rhino.Node node10 = node1.cloneTree();
        boolean boolean11 = node1.isWith();
        java.lang.String str12 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node1);
        node1.removeProp(409642);
        int int15 = node1.getCharno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node17 = node1.getChildAtIndex(36);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isName();
        boolean boolean3 = node1.isSwitch();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean6 = node1.hasChild(node5);
        java.lang.String str7 = node1.getSourceFileName();
        boolean boolean8 = node1.isWith();
        com.google.javascript.rhino.Node node9 = node1.getLastChild();
        boolean boolean10 = node1.isNumber();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean13 = node12.isName();
        boolean boolean14 = node12.isSwitch();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean17 = node12.hasChild(node16);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newExpr(node12);
        node12.setOptionalArg(true);
        node12.putBooleanProp((int) (short) -1, true);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean26 = node25.isName();
        boolean boolean27 = node25.isSwitch();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean30 = node25.hasChild(node29);
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newExpr(node25);
        boolean boolean32 = node31.isRegExp();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean35 = node34.isName();
        boolean boolean36 = node34.isSwitch();
        java.lang.String str37 = node34.toString();
        com.google.javascript.rhino.Node node38 = node31.useSourceInfoIfMissingFromForTree(node34);
        com.google.javascript.rhino.Node node39 = node12.useSourceInfoFromForTree(node31);
        com.google.javascript.rhino.Node node40 = node1.clonePropsFrom(node39);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((int) (short) 10, (int) (byte) 0, 41);
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(51, node45, (int) '#', (int) 'a');
        boolean boolean49 = node48.isDo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node50 = node40.getChildBefore(node48);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isName();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean5 = node4.isName();
        boolean boolean6 = node4.isSwitch();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean9 = node4.hasChild(node8);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newExpr(node4);
        boolean boolean11 = node10.isRegExp();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean14 = node13.isName();
        boolean boolean15 = node13.isSwitch();
        java.lang.String str16 = node13.toString();
        com.google.javascript.rhino.Node node17 = node10.useSourceInfoIfMissingFromForTree(node13);
        java.lang.String str18 = node1.checkTreeEquals(node17);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean22 = node21.isName();
        boolean boolean23 = node21.isSwitch();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean26 = node21.hasChild(node25);
        boolean boolean27 = node25.isGetElem();
        node1.putProp((int) (short) 100, (java.lang.Object) boolean27);
        boolean boolean29 = node1.isGetProp();
        boolean boolean30 = node1.isCall();
        node1.setCharno((int) (short) 0);
        int int33 = node1.getSideEffectFlags();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString("Node tree inequality:\nTree1:\nNUMBER -1.0\n\n\nTree2:\nEXPR_RESULT\n    NUMBER -1.0\n\n\nSubtree1: NUMBER -1.0\n\n\nSubtree2: EXPR_RESULT\n    NUMBER -1.0\n");
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean39 = node38.isName();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean42 = node41.isName();
        boolean boolean43 = node41.isSwitch();
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node((int) (byte) 100, node36, node38, node41);
        boolean boolean45 = node38.wasEmptyNode();
        java.lang.String str46 = node38.getQualifiedName();
        com.google.javascript.rhino.jstype.JSType jSType47 = node38.getJSType();
        boolean boolean48 = node38.isExprResult();
        double double49 = node38.getDouble();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString((int) (short) 1, "InputId: java.io.IOException");
        node52.setOptionalArg(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.replaceChild(node38, node52);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(29, 0, 4095);
        com.google.javascript.rhino.Node node4 = node3.getLastChild();
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node3);
        boolean boolean6 = node3.isSetterDef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node8 = node3.getChildAtIndex(31);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isName();
        boolean boolean3 = node1.isSwitch();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean6 = node1.hasChild(node5);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newExpr(node1);
        node1.setOptionalArg(true);
        node1.putBooleanProp((int) (short) -1, true);
        boolean boolean13 = node1.isDo();
        com.google.javascript.rhino.Node node14 = node1.removeChildren();
        boolean boolean15 = node1.isArrayLit();
        com.google.javascript.rhino.Node node16 = node1.getParent();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder17 = node16.getJsDocBuilderForNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node19 = node16.getChildAtIndex(42);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isFunction();
        com.google.javascript.rhino.Node node3 = node1.cloneTree();
        int int4 = node1.getCharno();
        boolean boolean5 = node1.isAssign();
        java.lang.String str6 = node1.getQualifiedName();
        com.google.javascript.rhino.Node node7 = node1.cloneTree();
        java.lang.String str11 = node7.toString(false, true, false);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(24);
        boolean boolean14 = node13.isNumber();
        node13.setOptionalArg(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node7.removeChild(node13);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(29, 0, 4095);
        com.google.javascript.rhino.Node node4 = node3.getLastChild();
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node3);
        com.google.javascript.rhino.Node node6 = node3.cloneTree();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node8 = node6.getChildAtIndex((int) (short) 1);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isName();
        boolean boolean3 = node1.isSwitch();
        boolean boolean4 = node1.isNull();
        boolean boolean5 = node1.isFunction();
        node1.putBooleanProp(12, false);
        node1.setVarArgs(false);
        boolean boolean11 = node1.isAnd();
        boolean boolean12 = node1.isIn();
        node1.setSourceEncodedPosition((int) 'a');
        boolean boolean15 = node1.isOnlyModifiesThisCall();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node17 = node1.getChildAtIndex(4);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test75");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        com.google.javascript.rhino.jstype.JSType jSType2 = node1.getJSType();
        java.lang.Object obj4 = node1.getProp(32);
        boolean boolean5 = node1.isInstanceOf();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node7 = node1.getChildAtIndex(11);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test76");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isName();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean5 = node4.isName();
        boolean boolean6 = node4.isSwitch();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean9 = node4.hasChild(node8);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newExpr(node4);
        boolean boolean11 = node10.isRegExp();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean14 = node13.isName();
        boolean boolean15 = node13.isSwitch();
        java.lang.String str16 = node13.toString();
        com.google.javascript.rhino.Node node17 = node10.useSourceInfoIfMissingFromForTree(node13);
        java.lang.String str18 = node1.checkTreeEquals(node17);
        boolean boolean19 = node1.isIf();
        com.google.javascript.rhino.Node node20 = node1.removeChildren();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean23 = node22.isName();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean26 = node25.isName();
        boolean boolean27 = node25.isSwitch();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean30 = node25.hasChild(node29);
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newExpr(node25);
        boolean boolean32 = node31.isRegExp();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean35 = node34.isName();
        boolean boolean36 = node34.isSwitch();
        java.lang.String str37 = node34.toString();
        com.google.javascript.rhino.Node node38 = node31.useSourceInfoIfMissingFromForTree(node34);
        java.lang.String str39 = node22.checkTreeEquals(node38);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean43 = node42.isName();
        boolean boolean44 = node42.isSwitch();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean47 = node42.hasChild(node46);
        boolean boolean48 = node46.isGetElem();
        node22.putProp((int) (short) 100, (java.lang.Object) boolean48);
        boolean boolean50 = node22.isCatch();
        boolean boolean51 = node22.isRegExp();
        java.lang.String str52 = node1.checkTreeEquals(node22);
        boolean boolean53 = node22.isInc();
        boolean boolean54 = node22.isDec();
        com.google.javascript.rhino.Node node55 = node22.cloneNode();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable56 = node22.getAncestors();
        boolean boolean57 = node22.isSyntheticBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node59 = node22.getChildAtIndex(38);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test77");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((int) (short) 100);
        boolean boolean2 = node1.isOptionalArg();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean5 = node4.isName();
        boolean boolean6 = node4.isSwitch();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean9 = node4.hasChild(node8);
        boolean boolean10 = node4.isVar();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean13 = node12.isName();
        boolean boolean14 = node12.isSwitch();
        java.lang.String str15 = node12.toString();
        boolean boolean16 = node12.isWith();
        com.google.javascript.rhino.Node node17 = node4.srcref(node12);
        boolean boolean18 = node17.isWith();
        node17.putBooleanProp(12, true);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString(0, "Node tree inequality:\nTree1:\nEXPR_RESULT\n\n\nTree2:\nNUMBER 100.0 100\n\n\nSubtree1: EXPR_RESULT\n\n\nSubtree2: NUMBER 100.0 100\n", 36, 0);
        com.google.javascript.rhino.Node node27 = node17.srcrefTree(node26);
        boolean boolean28 = node17.isIn();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean31 = node30.isName();
        boolean boolean32 = node30.isSwitch();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean35 = node30.hasChild(node34);
        java.lang.String str36 = node30.getSourceFileName();
        boolean boolean37 = node30.isIn();
        com.google.javascript.rhino.InputId inputId38 = com.google.javascript.jscomp.NodeUtil.getInputId(node30);
        boolean boolean39 = node30.isVoid();
        boolean boolean40 = node30.isLocalResultCall();
        boolean boolean41 = node30.isInstanceOf();
        node17.addChildrenToFront(node30);
        java.lang.Object obj44 = node30.getProp((int) (byte) 1);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        node46.setWasEmptyNode(true);
        boolean boolean49 = node46.isOr();
        boolean boolean50 = node46.isNumber();
        node46.putIntProp((int) (short) 0, 51);
        boolean boolean54 = node46.isOr();
        node46.setWasEmptyNode(false);
        boolean boolean57 = node46.isGetProp();
        boolean boolean58 = node46.isGetProp();
        com.google.javascript.jscomp.CodingConvention.Bind bind59 = new com.google.javascript.jscomp.CodingConvention.Bind(node1, node30, node46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo60 = new com.google.javascript.rhino.JSDocInfo();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList61 = jSDocInfo60.getExtendedInterfaces();
        java.lang.String str62 = jSDocInfo60.getVersion();
        boolean boolean63 = jSDocInfo60.isInterface();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection64 = jSDocInfo60.getMarkers();
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean67 = node66.isName();
        boolean boolean68 = node66.isSwitch();
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean71 = node66.hasChild(node70);
        com.google.javascript.rhino.Node node72 = com.google.javascript.jscomp.NodeUtil.newExpr(node66);
        int int73 = node72.getType();
        boolean boolean74 = node72.isDefaultCase();
        jSDocInfo60.setAssociatedNode(node72);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable76 = node72.siblings();
        boolean boolean77 = node72.isWhile();
        com.google.javascript.rhino.Node node79 = node72.getAncestor(30);
        java.lang.String str80 = node72.toStringTree();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node81 = node46.getChildBefore(node72);
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test78");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isName();
        boolean boolean3 = node1.isSwitch();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean6 = node1.hasChild(node5);
        boolean boolean7 = node5.isGetElem();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection8 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node5);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newExpr(node5);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean12 = node11.isName();
        boolean boolean13 = node11.isSwitch();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean16 = node11.hasChild(node15);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newExpr(node11);
        boolean boolean18 = node17.isRegExp();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean21 = node20.isName();
        boolean boolean22 = node20.isSwitch();
        java.lang.String str23 = node20.toString();
        com.google.javascript.rhino.Node node24 = node17.useSourceInfoIfMissingFromForTree(node20);
        boolean boolean25 = node17.isDefaultCase();
        node17.setVarArgs(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node5.removeChild(node17);
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test79");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("Node tree inequality:\nTree1:\nNUMBER -1.0\n\n\nTree2:\nEXPR_RESULT\n    NUMBER -1.0\n\n\nSubtree1: NUMBER -1.0\n\n\nSubtree2: EXPR_RESULT\n    NUMBER -1.0\n");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean5 = node4.isName();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean8 = node7.isName();
        boolean boolean9 = node7.isSwitch();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (byte) 100, node2, node4, node7);
        boolean boolean11 = node4.isBreak();
        com.google.javascript.rhino.Node node12 = node4.cloneNode();
        boolean boolean13 = node4.isBlock();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean16 = node15.isName();
        boolean boolean17 = node15.isSwitch();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean20 = node19.isFunction();
        boolean boolean21 = node19.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node22 = node15.useSourceInfoIfMissingFrom(node19);
        boolean boolean23 = node22.isQuotedString();
        boolean boolean24 = node22.isWhile();
        boolean boolean25 = node22.isContinue();
        boolean boolean26 = node22.isContinue();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean30 = node29.isName();
        boolean boolean31 = node29.isSwitch();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean34 = node29.hasChild(node33);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean37 = node36.isName();
        boolean boolean38 = node36.isSwitch();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean41 = node36.hasChild(node40);
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newExpr(node36);
        boolean boolean43 = node42.isRegExp();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean46 = node45.isName();
        boolean boolean47 = node45.isSwitch();
        java.lang.String str48 = node45.toString();
        com.google.javascript.rhino.Node node49 = node42.useSourceInfoIfMissingFromForTree(node45);
        boolean boolean50 = node33.isEquivalentToTyped(node45);
        boolean boolean51 = node45.isReturn();
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node(53, node45, (int) (byte) 1, 12);
        node22.addChildrenToBack(node54);
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean58 = node57.isName();
        boolean boolean59 = node57.isSwitch();
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean62 = node57.hasChild(node61);
        java.lang.String str63 = node57.getSourceFileName();
        boolean boolean64 = node57.isIn();
        com.google.javascript.rhino.InputId inputId65 = com.google.javascript.jscomp.NodeUtil.getInputId(node57);
        boolean boolean66 = node57.isVoid();
        boolean boolean67 = node57.isLocalResultCall();
        boolean boolean68 = node57.isDefaultCase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.replaceChild(node22, node57);
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test80");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int1 = namePosition0.getPositionOnStartLine();
        int int2 = namePosition0.getPositionOnEndLine();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean5 = node4.isName();
        boolean boolean6 = node4.isSwitch();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean9 = node4.hasChild(node8);
        java.lang.String str10 = com.google.javascript.jscomp.NodeUtil.getSourceName(node4);
        node4.setSourceFileForTesting("hi!");
        boolean boolean13 = node4.isString();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean16 = node15.isName();
        boolean boolean17 = node15.isSwitch();
        java.lang.String str18 = node15.toString();
        boolean boolean19 = node15.isWith();
        boolean boolean20 = node15.isBreak();
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = new com.google.javascript.rhino.JSDocInfo();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList22 = jSDocInfo21.getExtendedInterfaces();
        java.util.Collection<java.lang.String> strCollection23 = jSDocInfo21.getReferences();
        java.util.Collection<java.lang.String> strCollection24 = jSDocInfo21.getReferences();
        com.google.javascript.rhino.Node node25 = jSDocInfo21.getAssociatedNode();
        node15.setJSDocInfo(jSDocInfo21);
        com.google.javascript.rhino.Node node27 = node4.useSourceInfoIfMissingFromForTree(node15);
        namePosition0.setItem(node27);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(130, "java.io.IOException: NUMBER -1.0\n", 30, 31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node34 = node27.getChildBefore(node33);
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test81");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isFunction();
        boolean boolean3 = node1.isNot();
        boolean boolean4 = node1.isFor();
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(35, nodeArray8, 54, (int) (byte) 100);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(40, nodeArray8);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(409642, nodeArray8);
        com.google.javascript.rhino.Node[] nodeArray18 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(35, nodeArray18, 54, (int) (byte) 100);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(40, nodeArray18);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(409642, nodeArray18);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(24, nodeArray18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.replaceChild(node13, node24);
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test82");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean3 = node2.isName();
        boolean boolean4 = node2.isSwitch();
        boolean boolean5 = node2.isNull();
        boolean boolean6 = node2.isFunction();
        node2.putBooleanProp(12, false);
        node2.setVarArgs(false);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (byte) 100, node2, (int) (byte) 10, 27);
        java.util.Set<java.lang.String> strSet15 = node14.getDirectives();
        java.lang.String str19 = node14.toString(false, true, true);
        node14.setLength(32);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean24 = node23.isName();
        boolean boolean25 = node23.isSwitch();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean28 = node23.hasChild(node27);
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newExpr(node23);
        int int30 = node23.getLength();
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        node23.setDirectives((java.util.Set<java.lang.String>) strSet34);
        java.lang.Object[] objArray37 = strSet34.toArray();
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        int int42 = strList40.size();
        boolean boolean43 = strSet34.containsAll((java.util.Collection<java.lang.String>) strList40);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean46 = node45.isName();
        boolean boolean47 = node45.isSwitch();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean50 = node45.hasChild(node49);
        com.google.javascript.rhino.Node node51 = com.google.javascript.jscomp.NodeUtil.newExpr(node45);
        int int52 = node45.getLength();
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet56 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet56, strArray55);
        node45.setDirectives((java.util.Set<java.lang.String>) strSet56);
        java.lang.Object[] objArray59 = strSet56.toArray();
        boolean boolean60 = strSet34.removeAll((java.util.Collection<java.lang.String>) strSet56);
        boolean boolean62 = strSet34.add("JSDocInfo");
        java.util.Iterator<java.lang.String> strItor63 = strSet34.iterator();
        node14.setDirectives((java.util.Set<java.lang.String>) strSet34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node66 = node14.getChildAtIndex(11);
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test83");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isName();
        boolean boolean3 = node1.isSwitch();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean6 = node1.hasChild(node5);
        boolean boolean7 = node5.isGetElem();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection8 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node5);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) (byte) 100, 100, (int) 'a');
        int int14 = node13.getChildCount();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean17 = node16.isName();
        boolean boolean18 = node16.isSwitch();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean21 = node16.hasChild(node20);
        boolean boolean22 = node16.isVar();
        com.google.javascript.rhino.Node node23 = node16.getParent();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean26 = node25.isName();
        boolean boolean27 = node25.isSwitch();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean30 = node25.hasChild(node29);
        boolean boolean31 = node25.isVar();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean34 = node33.isName();
        boolean boolean35 = node33.isSwitch();
        java.lang.String str36 = node33.toString();
        boolean boolean37 = node33.isWith();
        com.google.javascript.rhino.Node node38 = node25.srcref(node33);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) (byte) 100, 100, (int) 'a');
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(130, node13, node16, node33, node42, 0, 15);
        java.lang.String str46 = node5.checkTreeEquals(node13);
        com.google.javascript.rhino.Node node47 = node13.getLastSibling();
        boolean boolean48 = node13.isContinue();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString("Node tree inequality:\nTree1:\nNUMBER -1.0\n\n\nTree2:\nEXPR_RESULT\n    NUMBER -1.0\n\n\nSubtree1: NUMBER -1.0\n\n\nSubtree2: EXPR_RESULT\n    NUMBER -1.0\n");
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean54 = node53.isName();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean57 = node56.isName();
        boolean boolean58 = node56.isSwitch();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node((int) (byte) 100, node51, node53, node56);
        boolean boolean60 = node51.isTypeOf();
        boolean boolean61 = node51.isBlock();
        node51.setCharno(42);
        boolean boolean64 = node51.isDelProp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node65 = node13.getChildBefore(node51);
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test84");
        com.google.javascript.rhino.Node[] nodeArray6 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(35, nodeArray6, 54, (int) (byte) 100);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(0, nodeArray6, 4, 27);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(0, nodeArray6);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(53, nodeArray6);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(0, nodeArray6);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(54, nodeArray6, (int) (byte) 10, 50);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean21 = node20.isName();
        boolean boolean22 = node20.isSwitch();
        java.lang.String str23 = node20.toString();
        boolean boolean24 = node20.isWith();
        int int26 = node20.getIntProp((int) ' ');
        boolean boolean27 = node20.isNE();
        com.google.javascript.rhino.InputId inputId28 = node20.getInputId();
        com.google.javascript.rhino.Node node29 = node20.cloneNode();
        java.util.Set<java.lang.String> strSet30 = node20.getDirectives();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node18.removeChild(node20);
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test85");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("BITXOR 0\n", 41, (int) ' ');
        boolean boolean4 = node3.isVar();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean7 = node6.isName();
        boolean boolean8 = node6.isSwitch();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean11 = node6.hasChild(node10);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newExpr(node6);
        int int13 = node6.getLength();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder14 = node6.new FileLevelJsDocBuilder();
        boolean boolean15 = node6.isInstanceOf();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node6);
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test86");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean2 = node1.isFunction();
        boolean boolean3 = node1.isUnscopedQualifiedName();
        boolean boolean4 = node1.isEmpty();
        boolean boolean5 = node1.isEmpty();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean8 = node7.isName();
        boolean boolean9 = node7.isSwitch();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean12 = node7.hasChild(node11);
        boolean boolean13 = node7.isVar();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean16 = node15.isName();
        boolean boolean17 = node15.isSwitch();
        java.lang.String str18 = node15.toString();
        boolean boolean19 = node15.isWith();
        com.google.javascript.rhino.Node node20 = node7.srcref(node15);
        node7.detachChildren();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        com.google.javascript.jscomp.CodingConvention.Bind bind24 = new com.google.javascript.jscomp.CodingConvention.Bind(node1, node7, node23);
        boolean boolean25 = node1.isNew();
        boolean boolean26 = node1.isString();
        boolean boolean27 = node1.isNumber();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean30 = node29.isName();
        boolean boolean31 = node29.isSwitch();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        boolean boolean34 = node29.hasChild(node33);
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newExpr(node29);
        int int36 = node29.getLength();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder37 = node29.new FileLevelJsDocBuilder();
        boolean boolean38 = node29.isDo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node39 = node1.getChildBefore(node29);
    }
}


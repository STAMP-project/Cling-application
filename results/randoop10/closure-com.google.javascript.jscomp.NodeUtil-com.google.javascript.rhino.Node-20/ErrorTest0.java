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
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean5 = node4.isDefaultCase();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int11 = node10.getType();
        boolean boolean12 = node10.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.removeChild(node10);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int5 = node4.getType();
        node4.setSourceEncodedPosition((int) (byte) 0);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder14 = node13.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean20 = node19.isDefaultCase();
        node19.setVarArgs(true);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) 'a', node13, node19, node27);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile29 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node27);
        boolean boolean30 = node27.isRegExp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.removeChild(node27);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(17, (int) (short) 0, (int) (byte) -1);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder10 = node9.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean16 = node15.isDefaultCase();
        node15.setVarArgs(true);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) 'a', node9, node15, node23);
        boolean boolean25 = node9.isScript();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node26 = node3.getChildBefore(node9);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder6 = node5.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean12 = node11.isDefaultCase();
        node11.setVarArgs(true);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) 'a', node5, node11, node19);
        boolean boolean21 = node20.isGetterDef();
        boolean boolean22 = node20.isQuotedString();
        node20.setSourceEncodedPosition(4);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression26 = new com.google.javascript.rhino.JSTypeExpression(node20, "Unknown class name");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node28 = node20.getChildAtIndex(52);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node8 = node5.useSourceInfoIfMissingFromForTree(node7);
        node8.setLineno(10);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder17 = node16.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean23 = node22.isDefaultCase();
        node22.setVarArgs(true);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) 'a', node16, node22, node30);
        boolean boolean32 = node31.isGetterDef();
        boolean boolean33 = node31.isQuotedString();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int39 = node38.getType();
        node38.setSourceEncodedPosition((int) (byte) 0);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int47 = node46.getType();
        node46.setSourceEncodedPosition((int) (byte) 0);
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node(40, node8, node31, node38, node46);
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean54 = node53.isGetProp();
        boolean boolean55 = node53.isNumber();
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder61 = node60.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int67 = node66.getType();
        boolean boolean68 = node66.isBlock();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node((int) (short) 10, node53, node60, node66, (int) (byte) 10, 44);
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node79 = node76.useSourceInfoIfMissingFromForTree(node78);
        com.google.javascript.rhino.Node node84 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean85 = node84.isDefaultCase();
        node84.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId88 = node84.getInputId();
        node84.detachChildren();
        com.google.javascript.rhino.Node node90 = node78.copyInformationFrom(node84);
        int int91 = node84.getType();
        com.google.javascript.rhino.Node node92 = node66.copyInformationFrom(node84);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node38.removeChild(node66);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node7 = node4.useSourceInfoIfMissingFromForTree(node6);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean13 = node12.isDefaultCase();
        node12.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId16 = node12.getInputId();
        node12.detachChildren();
        com.google.javascript.rhino.Node node18 = node6.copyInformationFrom(node12);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean22 = node21.isGetProp();
        boolean boolean23 = node21.isNumber();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder29 = node28.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int35 = node34.getType();
        boolean boolean36 = node34.isBlock();
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((int) (short) 10, node21, node28, node34, (int) (byte) 10, 44);
        node34.setSourceEncodedPositionForTree(45);
        boolean boolean42 = node34.isExprResult();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean45 = node44.isGetProp();
        com.google.javascript.rhino.Node node46 = node34.copyInformationFrom(node44);
        boolean boolean47 = node44.isLabelName();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node55 = node52.useSourceInfoIfMissingFromForTree(node54);
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean58 = node57.isFalse();
        boolean boolean59 = node54.hasChild(node57);
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean65 = node64.isDefaultCase();
        node64.setVarArgs(true);
        node64.setVarArgs(false);
        boolean boolean70 = node64.isDebugger();
        boolean boolean71 = node64.isNoSideEffectsCall();
        com.google.javascript.rhino.InputId inputId73 = new com.google.javascript.rhino.InputId("hi!");
        java.lang.String str74 = inputId73.toString();
        node64.setInputId(inputId73);
        node54.setInputId(inputId73);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node12.replaceChild(node44, node54);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean5 = node4.isDefaultCase();
        node4.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId8 = node4.getInputId();
        boolean boolean9 = node4.isCase();
        boolean boolean10 = node4.isFalse();
        java.lang.String str11 = node4.getString();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int17 = node16.getType();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder24 = node23.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean30 = node29.isDefaultCase();
        node29.setVarArgs(true);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((int) 'a', node23, node29, node37);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile39 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node37);
        com.google.javascript.rhino.Node node40 = node16.useSourceInfoFromForTree(node37);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile41 = node37.getStaticSourceFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.removeChild(node37);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node7 = node4.useSourceInfoIfMissingFromForTree(node6);
        boolean boolean8 = node6.isExprResult();
        int int9 = node6.getLineno();
        boolean boolean10 = node6.wasEmptyNode();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean16 = node15.isDefaultCase();
        boolean boolean17 = node15.isTry();
        com.google.javascript.rhino.Node node18 = node15.getLastSibling();
        com.google.javascript.rhino.Node node19 = node6.copyInformationFrom(node18);
        boolean boolean20 = node19.isLabel();
        com.google.javascript.rhino.Node[] nodeArray23 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(4095, nodeArray23);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(32, nodeArray23, 54, 50);
        node19.addChildToFront(node27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node30 = node27.getChildAtIndex(44);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int5 = node4.getType();
        boolean boolean6 = node4.isDebugger();
        boolean boolean7 = node4.isString();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder14 = node13.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean20 = node19.isDefaultCase();
        node19.setVarArgs(true);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) 'a', node13, node19, node27);
        com.google.javascript.rhino.InputId inputId29 = node13.getInputId();
        com.google.javascript.rhino.Node node30 = node4.useSourceInfoFrom(node13);
        boolean boolean31 = node30.isInstanceOf();
        boolean boolean32 = node30.isInstanceOf();
        boolean boolean34 = node30.getBooleanProp(1);
        boolean boolean35 = node30.isInc();
        boolean boolean36 = node30.isDelProp();
        boolean boolean37 = node30.isSetterDef();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder44 = node43.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean50 = node49.isDefaultCase();
        node49.setVarArgs(true);
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node((int) 'a', node43, node49, node57);
        boolean boolean59 = node58.isGetterDef();
        boolean boolean60 = node58.isQuotedString();
        node58.setSourceEncodedPosition(4);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression64 = new com.google.javascript.rhino.JSTypeExpression(node58, "Unknown class name");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression65 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression64);
        com.google.javascript.rhino.Node node66 = jSTypeExpression64.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node30.removeChild(node66);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean5 = node4.isDefaultCase();
        node4.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId8 = node4.getInputId();
        node4.detachChildren();
        boolean boolean10 = node4.isAssignAdd();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean14 = node13.isGetProp();
        boolean boolean15 = node13.isNumber();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder21 = node20.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int27 = node26.getType();
        boolean boolean28 = node26.isBlock();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) (short) 10, node13, node20, node26, (int) (byte) 10, 44);
        com.google.javascript.rhino.Node node32 = node13.getNext();
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node32);
        com.google.javascript.rhino.Node node34 = node32.cloneNode();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean40 = node39.isDefaultCase();
        boolean boolean41 = node39.isTry();
        com.google.javascript.rhino.Node node42 = node39.getLastSibling();
        boolean boolean43 = node39.isBlock();
        boolean boolean44 = node32.isEquivalentTo(node39);
        int int45 = node32.getSourceOffset();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean51 = node50.isDefaultCase();
        node50.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId54 = node50.getInputId();
        boolean boolean55 = node50.isCase();
        boolean boolean56 = node50.isFalse();
        boolean boolean57 = node50.isAssign();
        node50.detachChildren();
        boolean boolean59 = node50.isWhile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.replaceChild(node32, node50);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder6 = node5.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean12 = node11.isDefaultCase();
        node11.setVarArgs(true);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) 'a', node5, node11, node19);
        boolean boolean21 = node20.isGetterDef();
        boolean boolean22 = node20.isQuotedString();
        node20.setSourceEncodedPosition(4);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression26 = new com.google.javascript.rhino.JSTypeExpression(node20, "Unknown class name");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression27 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression26);
        boolean boolean28 = jSTypeExpression26.isVarArgs();
        com.google.javascript.rhino.Node node29 = jSTypeExpression26.getRoot();
        boolean boolean30 = node29.isLabel();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node32 = node29.getChildAtIndex(6);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder7 = node6.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean13 = node12.isDefaultCase();
        node12.setVarArgs(true);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) 'a', node6, node12, node20);
        boolean boolean22 = node21.isGetterDef();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(45, node21, node24, 44, 16);
        boolean boolean28 = node27.isHook();
        com.google.javascript.rhino.Node node30 = node27.getAncestor(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node32 = node30.getChildAtIndex(51);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int5 = node4.getType();
        boolean boolean6 = node4.isDebugger();
        boolean boolean7 = node4.isString();
        boolean boolean8 = node4.hasMoreThanOneChild();
        boolean boolean9 = node4.isTrue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node11 = node4.getChildAtIndex((int) ' ');
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node7 = node4.useSourceInfoIfMissingFromForTree(node6);
        boolean boolean8 = node4.isSwitch();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean14 = node13.isDefaultCase();
        node13.setVarArgs(true);
        node13.setVarArgs(false);
        boolean boolean19 = node13.isDebugger();
        boolean boolean20 = node13.isNoSideEffectsCall();
        com.google.javascript.rhino.InputId inputId22 = new com.google.javascript.rhino.InputId("hi!");
        java.lang.String str23 = inputId22.toString();
        node13.setInputId(inputId22);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean30 = node29.isDefaultCase();
        node29.setVarArgs(true);
        node29.setVarArgs(false);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable35 = node29.getAncestors();
        boolean boolean36 = inputId22.equals((java.lang.Object) node29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node37 = node4.getChildBefore(node29);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean6 = node5.isDefaultCase();
        node5.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId9 = node5.getInputId();
        node5.detachChildren();
        boolean boolean11 = node5.isNull();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) 'a', node5);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable13 = node5.children();
        boolean boolean14 = node5.isIn();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node16 = node5.getChildAtIndex(37);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder6 = node5.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean12 = node11.isDefaultCase();
        node11.setVarArgs(true);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) 'a', node5, node11, node19);
        boolean boolean21 = node5.isScript();
        boolean boolean22 = node5.isObjectLit();
        node5.setString("{12965601}");
        java.lang.String str25 = node5.getString();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node33 = node30.useSourceInfoIfMissingFromForTree(node32);
        node33.setLineno(10);
        boolean boolean36 = node33.isWith();
        boolean boolean37 = node33.isThrow();
        java.lang.String str38 = node33.getSourceFileName();
        int int39 = node33.getSideEffectFlags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node5.removeChild(node33);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean1 = typePosition0.hasBrackets();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean7 = node6.isDefaultCase();
        node6.setVarArgs(true);
        node6.setVarArgs(false);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable12 = node6.getAncestors();
        typePosition0.setItem(node6);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node21 = node18.useSourceInfoIfMissingFromForTree(node20);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean27 = node26.isDefaultCase();
        node26.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId30 = node26.getInputId();
        node26.detachChildren();
        com.google.javascript.rhino.Node node32 = node20.copyInformationFrom(node26);
        int int33 = node26.getType();
        boolean boolean34 = node26.isFunction();
        typePosition0.setItem(node26);
        int int36 = node26.getCharno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node38 = node26.getChildAtIndex(39);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int5 = node4.getType();
        boolean boolean6 = node4.isDebugger();
        boolean boolean7 = node4.isString();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder14 = node13.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean20 = node19.isDefaultCase();
        node19.setVarArgs(true);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) 'a', node13, node19, node27);
        com.google.javascript.rhino.InputId inputId29 = node13.getInputId();
        com.google.javascript.rhino.Node node30 = node4.useSourceInfoFrom(node13);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node38 = node35.useSourceInfoIfMissingFromForTree(node37);
        boolean boolean39 = node37.isExprResult();
        boolean boolean40 = node37.isDelProp();
        com.google.javascript.rhino.InputId inputId41 = node37.getInputId();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node50 = node47.useSourceInfoIfMissingFromForTree(node49);
        node50.setLineno(10);
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder59 = node58.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean65 = node64.isDefaultCase();
        node64.setVarArgs(true);
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node((int) 'a', node58, node64, node72);
        boolean boolean74 = node73.isGetterDef();
        boolean boolean75 = node73.isQuotedString();
        com.google.javascript.rhino.Node node80 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int81 = node80.getType();
        node80.setSourceEncodedPosition((int) (byte) 0);
        com.google.javascript.rhino.Node node88 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int89 = node88.getType();
        node88.setSourceEncodedPosition((int) (byte) 0);
        com.google.javascript.rhino.Node node92 = new com.google.javascript.rhino.Node(40, node50, node73, node80, node88);
        boolean boolean93 = node73.isArrayLit();
        com.google.javascript.rhino.Node node94 = node37.useSourceInfoIfMissingFromForTree(node73);
        int int96 = node37.getIntProp((int) (byte) -1);
        node37.detachChildren();
        int int98 = node37.getLength();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node30.removeChild(node37);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean5 = node4.isDefaultCase();
        node4.setVarArgs(true);
        node4.setVarArgs(false);
        boolean boolean10 = node4.isDebugger();
        boolean boolean11 = node4.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node12 = node4.cloneNode();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean26 = node25.isDefaultCase();
        node25.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId29 = node25.getInputId();
        node25.detachChildren();
        com.google.javascript.rhino.Node node31 = node19.copyInformationFrom(node25);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node39 = node36.useSourceInfoIfMissingFromForTree(node38);
        node39.setLineno(10);
        com.google.javascript.rhino.Node node42 = node25.copyInformationFrom(node39);
        boolean boolean43 = node42.isLabelName();
        node42.setQuotedString();
        node42.setOptionalArg(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node12.removeChild(node42);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean5 = node4.isDefaultCase();
        node4.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId8 = node4.getInputId();
        node4.detachChildren();
        boolean boolean10 = node4.isNull();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber(1.0d, 0, 0);
        boolean boolean15 = node14.isString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.removeChild(node14);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node7 = node4.useSourceInfoIfMissingFromForTree(node6);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean13 = node12.isDefaultCase();
        node12.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId16 = node12.getInputId();
        node12.detachChildren();
        com.google.javascript.rhino.Node node18 = node6.copyInformationFrom(node12);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node26 = node23.useSourceInfoIfMissingFromForTree(node25);
        node26.setLineno(10);
        com.google.javascript.rhino.Node node29 = node12.copyInformationFrom(node26);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean33 = node32.isGetProp();
        boolean boolean34 = node32.isNumber();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder40 = node39.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int46 = node45.getType();
        boolean boolean47 = node45.isBlock();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node((int) (short) 10, node32, node39, node45, (int) (byte) 10, 44);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node58 = node55.useSourceInfoIfMissingFromForTree(node57);
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean64 = node63.isDefaultCase();
        node63.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId67 = node63.getInputId();
        node63.detachChildren();
        com.google.javascript.rhino.Node node69 = node57.copyInformationFrom(node63);
        int int70 = node63.getType();
        com.google.javascript.rhino.Node node71 = node45.copyInformationFrom(node63);
        boolean boolean72 = node45.hasChildren();
        com.google.javascript.rhino.Node node73 = node45.cloneTree();
        com.google.javascript.rhino.Node node74 = node45.detachFromParent();
        com.google.javascript.rhino.Node node75 = node74.getLastSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node76 = node12.getChildBefore(node74);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(42, "{33678463}", 44, (int) ' ');
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean8 = node7.isGetProp();
        boolean boolean9 = node7.isNumber();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder15 = node14.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int21 = node20.getType();
        boolean boolean22 = node20.isBlock();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (short) 10, node7, node14, node20, (int) (byte) 10, 44);
        node20.setSourceEncodedPositionForTree(45);
        boolean boolean28 = node20.isSetterDef();
        boolean boolean29 = node20.isNumber();
        int int31 = node20.getIntProp(53);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node39 = node36.useSourceInfoIfMissingFromForTree(node38);
        boolean boolean40 = node38.isExprResult();
        int int41 = node38.getLineno();
        boolean boolean42 = node38.wasEmptyNode();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean48 = node47.isDefaultCase();
        boolean boolean49 = node47.isTry();
        com.google.javascript.rhino.Node node50 = node47.getLastSibling();
        com.google.javascript.rhino.Node node51 = node38.copyInformationFrom(node50);
        boolean boolean52 = node38.isContinue();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int58 = node57.getType();
        boolean boolean59 = node57.isDebugger();
        boolean boolean60 = node57.isString();
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder67 = node66.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean73 = node72.isDefaultCase();
        node72.setVarArgs(true);
        com.google.javascript.rhino.Node node80 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node81 = new com.google.javascript.rhino.Node((int) 'a', node66, node72, node80);
        com.google.javascript.rhino.InputId inputId82 = node66.getInputId();
        com.google.javascript.rhino.Node node83 = node57.useSourceInfoFrom(node66);
        com.google.javascript.rhino.Node node84 = node57.cloneTree();
        node84.setIsSyntheticBlock(true);
        boolean boolean87 = node84.isLocalResultCall();
        java.lang.Object obj89 = node84.getProp(35);
        boolean boolean90 = node84.isRegExp();
        node38.addChildrenToBack(node84);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.replaceChild(node20, node38);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean3 = node2.isGetProp();
        boolean boolean4 = node2.isNumber();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder10 = node9.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int16 = node15.getType();
        boolean boolean17 = node15.isBlock();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, node2, node9, node15, (int) (byte) 10, 44);
        node15.setSourceEncodedPositionForTree(45);
        boolean boolean23 = node15.isSetterDef();
        boolean boolean24 = node15.isParamList();
        boolean boolean25 = node15.hasOneChild();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder31 = node30.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node32 = node30.getLastSibling();
        boolean boolean33 = node30.isOptionalArg();
        com.google.javascript.rhino.JSDocInfo jSDocInfo34 = node30.getJSDocInfo();
        com.google.javascript.rhino.Node node35 = node15.copyInformationFrom(node30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node37 = node30.getChildAtIndex(45);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node7 = node4.useSourceInfoIfMissingFromForTree(node6);
        boolean boolean8 = node6.isExprResult();
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        int int10 = node9.getSourcePosition();
        boolean boolean11 = node9.isIn();
        com.google.javascript.rhino.Node node12 = node9.getFirstChild();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = node9.getJSDocInfo();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean16 = node15.isFalse();
        boolean boolean17 = node15.isQualifiedName();
        boolean boolean18 = node15.isExprResult();
        boolean boolean19 = node15.isTrue();
        boolean boolean20 = node15.isLocalResultCall();
        boolean boolean21 = node15.isDebugger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node9.removeChild(node15);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean3 = node2.isGetProp();
        boolean boolean4 = node2.isNumber();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder10 = node9.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int16 = node15.getType();
        boolean boolean17 = node15.isBlock();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, node2, node9, node15, (int) (byte) 10, 44);
        com.google.javascript.rhino.Node node21 = node2.detachFromParent();
        boolean boolean22 = node21.isInc();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean28 = node27.isDefaultCase();
        node27.setVarArgs(true);
        node27.setVarArgs(false);
        node27.setLength((int) (byte) 0);
        node27.removeProp((int) 'a');
        node27.setIsSyntheticBlock(true);
        boolean boolean40 = node27.getBooleanProp((-1));
        boolean boolean41 = node27.isFor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node21.removeChild(node27);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean6 = node5.isDefaultCase();
        node5.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId9 = node5.getInputId();
        node5.detachChildren();
        boolean boolean11 = node5.isNull();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList14 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean15 = strComparableList14.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean16 = strComparableList14.add((java.lang.Comparable<java.lang.String>) "");
        int int17 = strComparableList14.size();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean23 = node22.isDefaultCase();
        node22.setVarArgs(true);
        node22.setVarArgs(false);
        boolean boolean28 = strComparableList14.contains((java.lang.Object) node22);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int34 = node33.getType();
        node33.setSourceEncodedPosition((int) (byte) 0);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(54, node5, node22, node33);
        int int38 = node5.getLength();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) 2, 54, (int) (short) 100);
        java.lang.String str43 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node44 = node5.getChildBefore(node42);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 5);
        boolean boolean2 = node1.isCatch();
        boolean boolean3 = node1.isThis();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node5 = node1.getChildAtIndex(41);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean3 = node2.isGetProp();
        boolean boolean4 = node2.isNumber();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder10 = node9.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int16 = node15.getType();
        boolean boolean17 = node15.isBlock();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, node2, node9, node15, (int) (byte) 10, 44);
        node15.setSourceEncodedPositionForTree(45);
        boolean boolean23 = node15.isExprResult();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean26 = node25.isGetProp();
        com.google.javascript.rhino.Node node27 = node15.copyInformationFrom(node25);
        boolean boolean28 = node25.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile29 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node25);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node37 = node34.useSourceInfoIfMissingFromForTree(node36);
        boolean boolean38 = node37.isParamList();
        boolean boolean39 = node25.isEquivalentToTyped(node37);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node41 = node25.getChildAtIndex(54);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType0 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node8 = node5.useSourceInfoIfMissingFromForTree(node7);
        node8.setLineno(10);
        int int11 = node8.getType();
        boolean boolean12 = node8.isNew();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int18 = node17.getType();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder25 = node24.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean31 = node30.isDefaultCase();
        node30.setVarArgs(true);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((int) 'a', node24, node30, node38);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile40 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node38);
        com.google.javascript.rhino.Node node41 = node17.useSourceInfoFromForTree(node38);
        int int42 = node17.getSourcePosition();
        boolean boolean43 = node8.isEquivalentToTyped(node17);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean50 = node49.isDefaultCase();
        node49.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId53 = node49.getInputId();
        node49.detachChildren();
        boolean boolean55 = node49.isNull();
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((int) 'a', node49);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable57 = node49.children();
        boolean boolean58 = node49.isIn();
        com.google.javascript.rhino.Node node59 = node49.detachFromParent();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship60 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType0, node8, node49);
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean66 = node65.isDefaultCase();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection67 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node65);
        boolean boolean68 = node65.isLabel();
        boolean boolean69 = node65.isHook();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean73 = node72.isGetProp();
        boolean boolean74 = node72.isNumber();
        com.google.javascript.rhino.Node node79 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder80 = node79.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node85 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int86 = node85.getType();
        boolean boolean87 = node85.isBlock();
        com.google.javascript.rhino.Node node90 = new com.google.javascript.rhino.Node((int) (short) 10, node72, node79, node85, (int) (byte) 10, 44);
        node85.setSourceEncodedPositionForTree(45);
        boolean boolean93 = node85.isSetterDef();
        com.google.javascript.rhino.Node node94 = node65.useSourceInfoIfMissingFromForTree(node85);
        boolean boolean95 = node65.isInstanceOf();
        com.google.javascript.rhino.Node node96 = node8.srcref(node65);
        boolean boolean97 = node96.isTrue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node99 = node96.getChildAtIndex(31);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType0 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node8 = node5.useSourceInfoIfMissingFromForTree(node7);
        node8.setLineno(10);
        int int11 = node8.getType();
        boolean boolean12 = node8.isNew();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int18 = node17.getType();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder25 = node24.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean31 = node30.isDefaultCase();
        node30.setVarArgs(true);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((int) 'a', node24, node30, node38);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile40 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node38);
        com.google.javascript.rhino.Node node41 = node17.useSourceInfoFromForTree(node38);
        int int42 = node17.getSourcePosition();
        boolean boolean43 = node8.isEquivalentToTyped(node17);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean50 = node49.isDefaultCase();
        node49.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId53 = node49.getInputId();
        node49.detachChildren();
        boolean boolean55 = node49.isNull();
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((int) 'a', node49);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable57 = node49.children();
        boolean boolean58 = node49.isIn();
        com.google.javascript.rhino.Node node59 = node49.detachFromParent();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship60 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType0, node8, node49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node62 = node49.getChildAtIndex(35);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean5 = node4.isDefaultCase();
        node4.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId8 = node4.getInputId();
        java.util.Set<java.lang.String> strSet9 = node4.getDirectives();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean15 = node14.isDefaultCase();
        node14.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId18 = node14.getInputId();
        boolean boolean19 = node14.isCase();
        int int20 = node14.getSourcePosition();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean27 = node26.isDefaultCase();
        boolean boolean28 = node26.isContinue();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean31 = node30.isFalse();
        boolean boolean32 = node30.isQualifiedName();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) 2, 54, (int) (short) 100);
        com.google.javascript.rhino.Node node37 = node30.srcref(node36);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString((int) ' ', "{proxy:function (): {882920012}}", 1, (int) '#');
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder48 = node47.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node49 = node47.getLastSibling();
        boolean boolean50 = node47.isOptionalArg();
        com.google.javascript.rhino.JSDocInfo jSDocInfo51 = node47.getJSDocInfo();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(4097, node26, node36, node42, node47);
        com.google.javascript.rhino.InputId inputId53 = com.google.javascript.jscomp.NodeUtil.getInputId(node52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.replaceChild(node14, node52);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean5 = node4.isDefaultCase();
        node4.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId8 = node4.getInputId();
        boolean boolean9 = node4.isCase();
        boolean boolean10 = node4.isInc();
        java.lang.String str14 = node4.toString(false, true, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node16 = node4.getChildAtIndex(4);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean5 = node4.isDefaultCase();
        node4.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId8 = node4.getInputId();
        node4.detachChildren();
        boolean boolean10 = node4.isNot();
        boolean boolean11 = node4.isSetterDef();
        node4.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node21 = node18.useSourceInfoIfMissingFromForTree(node20);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean27 = node26.isDefaultCase();
        node26.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId30 = node26.getInputId();
        node26.detachChildren();
        com.google.javascript.rhino.Node node32 = node20.copyInformationFrom(node26);
        int int33 = node26.getType();
        java.lang.String[] strArray39 = new java.lang.String[] { "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]", "Unknown class name", "Unknown class name", "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]", "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        node26.setDirectives((java.util.Set<java.lang.String>) strSet40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node43 = node4.getChildBefore(node26);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition1 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition2 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition3 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition4 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.NamePosition> namePositionList5 = com.google.common.collect.ImmutableList.of(namePosition0, namePosition1, namePosition2, namePosition3, namePosition4);
        int int6 = namePosition4.getStartLine();
        int int7 = namePosition4.getEndLine();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean13 = node12.isDefaultCase();
        boolean boolean14 = node12.isTry();
        com.google.javascript.rhino.Node node15 = node12.getLastSibling();
        boolean boolean16 = node12.isEmpty();
        int int17 = node12.getLength();
        com.google.javascript.rhino.jstype.JSType jSType18 = node12.getJSType();
        namePosition4.setItem(node12);
        com.google.javascript.rhino.Node node20 = namePosition4.getItem();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node22 = node20.getChildAtIndex(40960);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean3 = node2.isGetProp();
        boolean boolean4 = node2.isNumber();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder10 = node9.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int16 = node15.getType();
        boolean boolean17 = node15.isBlock();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, node2, node9, node15, (int) (byte) 10, 44);
        boolean boolean21 = node2.isSwitch();
        boolean boolean22 = node2.isComma();
        boolean boolean23 = node2.isNot();
        boolean boolean24 = node2.isGetterDef();
        com.google.javascript.rhino.Node node25 = node2.getParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node27 = node2.getChildAtIndex(31);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean3 = node2.isGetProp();
        boolean boolean4 = node2.isNumber();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder10 = node9.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int16 = node15.getType();
        boolean boolean17 = node15.isBlock();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, node2, node9, node15, (int) (byte) 10, 44);
        com.google.javascript.rhino.Node node21 = node2.getNext();
        com.google.javascript.rhino.Node node22 = node21.cloneNode();
        com.google.javascript.rhino.Node node23 = node21.getParent();
        node23.setSourceFileForTesting("{2135530380}");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node27 = node23.getChildAtIndex((int) ' ');
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder7 = node6.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean13 = node12.isDefaultCase();
        node12.setVarArgs(true);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) 'a', node6, node12, node20);
        boolean boolean22 = node21.isGetterDef();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(45, node21, node24, 44, 16);
        boolean boolean28 = node24.isFalse();
        boolean boolean29 = node24.isTypeOf();
        boolean boolean30 = node24.isSyntheticBlock();
        boolean boolean31 = node24.isThis();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder39 = node38.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean45 = node44.isDefaultCase();
        node44.setVarArgs(true);
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node((int) 'a', node38, node44, node52);
        boolean boolean54 = node53.isGetterDef();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(45, node53, node56, 44, 16);
        boolean boolean60 = node53.isOptionalArg();
        com.google.javascript.rhino.Node node61 = node53.getNext();
        node61.setLineno(17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node24.removeChild(node61);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) (-1), (int) (short) 10, 15);
        java.lang.String str7 = node3.toString(false, true, true);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node15 = node12.useSourceInfoIfMissingFromForTree(node14);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean18 = node17.isFalse();
        boolean boolean19 = node14.hasChild(node17);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean25 = node24.isDefaultCase();
        node24.setVarArgs(true);
        node24.setVarArgs(false);
        boolean boolean30 = node24.isDebugger();
        boolean boolean31 = node24.isNoSideEffectsCall();
        com.google.javascript.rhino.InputId inputId33 = new com.google.javascript.rhino.InputId("hi!");
        java.lang.String str34 = inputId33.toString();
        node24.setInputId(inputId33);
        node14.setInputId(inputId33);
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newExpr(node14);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean40 = node39.isGetProp();
        boolean boolean41 = node39.isNumber();
        com.google.javascript.rhino.Node node42 = node14.srcrefTree(node39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node43 = node3.getChildBefore(node39);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder5 = node4.getJsDocBuilderForNode();
        boolean boolean6 = node4.isCase();
        com.google.javascript.rhino.jstype.JSType jSType7 = node4.getJSType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node9 = node4.getChildAtIndex(47);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = jSTypeRegistry2.getErrorReporter();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable11 = jSTypeRegistry9.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean12 = jSTypeRegistry9.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray14 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList15 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList15, jSTypeArray14);
        com.google.javascript.rhino.jstype.FunctionType functionType17 = jSTypeRegistry9.createFunctionTypeWithVarArgs(jSType13, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList15);
        boolean boolean18 = functionType17.canBeCalled();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot20 = functionType17.getOwnSlot("[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]");
        boolean boolean21 = functionType17.isUnionType();
        java.lang.String str22 = functionType17.toString();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet23 = functionType17.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = functionType17.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray28 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node29 = jSTypeRegistry27.createParameters(jSTypeArray28);
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable34 = jSTypeRegistry32.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean35 = jSTypeRegistry32.shouldTolerateUndefinedValues();
        boolean boolean36 = jSTypeRegistry32.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node45 = node42.useSourceInfoIfMissingFromForTree(node44);
        boolean boolean46 = node44.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable51 = jSTypeRegistry49.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean52 = jSTypeRegistry49.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray54 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList55 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList55, jSTypeArray54);
        com.google.javascript.rhino.jstype.FunctionType functionType57 = jSTypeRegistry49.createFunctionTypeWithVarArgs(jSType53, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList55);
        boolean boolean58 = functionType57.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType59 = jSTypeRegistry32.createEnumType("false", node44, (com.google.javascript.rhino.jstype.JSType) functionType57);
        java.util.Set<java.lang.String> strSet60 = functionType57.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable65 = jSTypeRegistry63.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean66 = jSTypeRegistry63.shouldTolerateUndefinedValues();
        boolean boolean67 = jSTypeRegistry63.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node76 = node73.useSourceInfoIfMissingFromForTree(node75);
        boolean boolean77 = node75.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter78 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry80 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter78, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable82 = jSTypeRegistry80.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean83 = jSTypeRegistry80.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType84 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray85 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList86 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList86, jSTypeArray85);
        com.google.javascript.rhino.jstype.FunctionType functionType88 = jSTypeRegistry80.createFunctionTypeWithVarArgs(jSType84, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList86);
        boolean boolean89 = functionType88.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType90 = jSTypeRegistry63.createEnumType("false", node75, (com.google.javascript.rhino.jstype.JSType) functionType88);
        com.google.javascript.rhino.jstype.FunctionType functionType91 = functionType88.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType92 = jSTypeRegistry27.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType57, (com.google.javascript.rhino.jstype.JSType) functionType91);
        boolean boolean93 = parameterizedType92.isBooleanObjectType();
        com.google.javascript.rhino.jstype.JSType jSType94 = parameterizedType92.autobox();
        com.google.javascript.rhino.JSDocInfo jSDocInfo95 = null;
        parameterizedType92.setJSDocInfo(jSDocInfo95);
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType97 = jSTypeRegistry2.createParameterizedType(objectType24, (com.google.javascript.rhino.jstype.JSType) parameterizedType92);
        jSTypeRegistry2.resetForTypeCheck();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType17 and parameterizedType97.", functionType17.equals(parameterizedType97) == parameterizedType97.equals(functionType17));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = jSTypeRegistry2.getErrorReporter();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable11 = jSTypeRegistry9.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean12 = jSTypeRegistry9.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray14 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList15 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList15, jSTypeArray14);
        com.google.javascript.rhino.jstype.FunctionType functionType17 = jSTypeRegistry9.createFunctionTypeWithVarArgs(jSType13, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList15);
        boolean boolean18 = functionType17.canBeCalled();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot20 = functionType17.getOwnSlot("[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]");
        boolean boolean21 = functionType17.isUnionType();
        java.lang.String str22 = functionType17.toString();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet23 = functionType17.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = functionType17.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray28 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node29 = jSTypeRegistry27.createParameters(jSTypeArray28);
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable34 = jSTypeRegistry32.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean35 = jSTypeRegistry32.shouldTolerateUndefinedValues();
        boolean boolean36 = jSTypeRegistry32.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node45 = node42.useSourceInfoIfMissingFromForTree(node44);
        boolean boolean46 = node44.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable51 = jSTypeRegistry49.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean52 = jSTypeRegistry49.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray54 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList55 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList55, jSTypeArray54);
        com.google.javascript.rhino.jstype.FunctionType functionType57 = jSTypeRegistry49.createFunctionTypeWithVarArgs(jSType53, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList55);
        boolean boolean58 = functionType57.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType59 = jSTypeRegistry32.createEnumType("false", node44, (com.google.javascript.rhino.jstype.JSType) functionType57);
        java.util.Set<java.lang.String> strSet60 = functionType57.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable65 = jSTypeRegistry63.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean66 = jSTypeRegistry63.shouldTolerateUndefinedValues();
        boolean boolean67 = jSTypeRegistry63.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node76 = node73.useSourceInfoIfMissingFromForTree(node75);
        boolean boolean77 = node75.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter78 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry80 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter78, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable82 = jSTypeRegistry80.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean83 = jSTypeRegistry80.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType84 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray85 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList86 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList86, jSTypeArray85);
        com.google.javascript.rhino.jstype.FunctionType functionType88 = jSTypeRegistry80.createFunctionTypeWithVarArgs(jSType84, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList86);
        boolean boolean89 = functionType88.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType90 = jSTypeRegistry63.createEnumType("false", node75, (com.google.javascript.rhino.jstype.JSType) functionType88);
        com.google.javascript.rhino.jstype.FunctionType functionType91 = functionType88.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType92 = jSTypeRegistry27.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType57, (com.google.javascript.rhino.jstype.JSType) functionType91);
        boolean boolean93 = parameterizedType92.isBooleanObjectType();
        com.google.javascript.rhino.jstype.JSType jSType94 = parameterizedType92.autobox();
        com.google.javascript.rhino.JSDocInfo jSDocInfo95 = null;
        parameterizedType92.setJSDocInfo(jSDocInfo95);
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType97 = jSTypeRegistry2.createParameterizedType(objectType24, (com.google.javascript.rhino.jstype.JSType) parameterizedType92);
        jSTypeRegistry2.identifyNonNullableName("{1607321917}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType17 and parameterizedType97.", functionType17.equals(parameterizedType97) == parameterizedType97.equals(functionType17));
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean2 = node1.isFalse();
        boolean boolean3 = node1.isGetterDef();
        com.google.javascript.rhino.Node node4 = node1.cloneNode();
        node4.setLength(0);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean12 = node11.isDefaultCase();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection13 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node11);
        boolean boolean14 = node11.isLabel();
        boolean boolean15 = node11.isGetterDef();
        boolean boolean16 = node11.isIf();
        node4.addChildToBack(node11);
        node4.detachChildren();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node20 = node4.getChildAtIndex(17);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node7 = node4.useSourceInfoIfMissingFromForTree(node6);
        boolean boolean8 = node6.isExprResult();
        int int9 = node6.getLineno();
        boolean boolean10 = node6.wasEmptyNode();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean16 = node15.isDefaultCase();
        boolean boolean17 = node15.isTry();
        com.google.javascript.rhino.Node node18 = node15.getLastSibling();
        com.google.javascript.rhino.Node node19 = node6.copyInformationFrom(node18);
        boolean boolean20 = node6.isHook();
        boolean boolean21 = node6.wasEmptyNode();
        int int23 = node6.getIntProp(104);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node25 = node6.getChildAtIndex(4);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition1 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean2 = typePosition1.hasBrackets();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean8 = node7.isDefaultCase();
        node7.setVarArgs(true);
        node7.setVarArgs(false);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable13 = node7.getAncestors();
        typePosition1.setItem(node7);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node22 = node19.useSourceInfoIfMissingFromForTree(node21);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean28 = node27.isDefaultCase();
        node27.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId31 = node27.getInputId();
        node27.detachChildren();
        com.google.javascript.rhino.Node node33 = node21.copyInformationFrom(node27);
        int int34 = node27.getType();
        boolean boolean35 = node27.isFunction();
        typePosition1.setItem(node27);
        com.google.javascript.rhino.Node node37 = typePosition1.getItem();
        com.google.javascript.rhino.Node node38 = node37.cloneTree();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int44 = node43.getType();
        boolean boolean45 = node43.isDebugger();
        int int46 = node43.getLineno();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString("{18933907}", 36, 32);
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node(15, node37, node43, node50, 40960, 52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node55 = node37.getChildAtIndex(6);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder5 = node4.getJsDocBuilderForNode();
        boolean boolean6 = node4.isCase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node8 = node4.getChildAtIndex(40);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 49, 0, (int) (byte) 10);
        boolean boolean4 = node3.isObjectLit();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node12 = node9.useSourceInfoIfMissingFromForTree(node11);
        boolean boolean13 = node12.isParamList();
        node12.addSuppression("{328973212}");
        com.google.javascript.rhino.Node node16 = node12.removeFirstChild();
        com.google.javascript.rhino.Node node17 = node3.useSourceInfoFromForTree(node12);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int23 = node22.getType();
        boolean boolean24 = node22.isBlock();
        boolean boolean25 = node22.isThrow();
        com.google.javascript.rhino.Node node26 = node22.getLastSibling();
        boolean boolean27 = node26.isLocalResultCall();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node17.removeChild(node26);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder6 = node5.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean12 = node11.isDefaultCase();
        node11.setVarArgs(true);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) 'a', node5, node11, node19);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection21 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node5);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int27 = node26.getType();
        boolean boolean28 = node26.isDebugger();
        boolean boolean29 = node26.isString();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder36 = node35.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean42 = node41.isDefaultCase();
        node41.setVarArgs(true);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node((int) 'a', node35, node41, node49);
        com.google.javascript.rhino.InputId inputId51 = node35.getInputId();
        com.google.javascript.rhino.Node node52 = node26.useSourceInfoFrom(node35);
        boolean boolean53 = node52.isInstanceOf();
        boolean boolean54 = node52.isInstanceOf();
        boolean boolean56 = node52.getBooleanProp(1);
        boolean boolean57 = node52.isInc();
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node65 = node62.useSourceInfoIfMissingFromForTree(node64);
        boolean boolean66 = node64.isExprResult();
        int int67 = node64.getLineno();
        boolean boolean68 = node64.wasEmptyNode();
        boolean boolean69 = node64.isExprResult();
        com.google.javascript.rhino.Node node70 = node52.copyInformationFrom(node64);
        boolean boolean71 = node5.isEquivalentToTyped(node64);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node73 = node5.getChildAtIndex(45);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = jSTypeRegistry2.getErrorReporter();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable11 = jSTypeRegistry9.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean12 = jSTypeRegistry9.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray14 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList15 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList15, jSTypeArray14);
        com.google.javascript.rhino.jstype.FunctionType functionType17 = jSTypeRegistry9.createFunctionTypeWithVarArgs(jSType13, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList15);
        boolean boolean18 = functionType17.canBeCalled();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot20 = functionType17.getOwnSlot("[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]");
        boolean boolean21 = functionType17.isUnionType();
        java.lang.String str22 = functionType17.toString();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet23 = functionType17.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = functionType17.dereference();
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray28 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node29 = jSTypeRegistry27.createParameters(jSTypeArray28);
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable34 = jSTypeRegistry32.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean35 = jSTypeRegistry32.shouldTolerateUndefinedValues();
        boolean boolean36 = jSTypeRegistry32.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node45 = node42.useSourceInfoIfMissingFromForTree(node44);
        boolean boolean46 = node44.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable51 = jSTypeRegistry49.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean52 = jSTypeRegistry49.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray54 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList55 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList55, jSTypeArray54);
        com.google.javascript.rhino.jstype.FunctionType functionType57 = jSTypeRegistry49.createFunctionTypeWithVarArgs(jSType53, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList55);
        boolean boolean58 = functionType57.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType59 = jSTypeRegistry32.createEnumType("false", node44, (com.google.javascript.rhino.jstype.JSType) functionType57);
        java.util.Set<java.lang.String> strSet60 = functionType57.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable65 = jSTypeRegistry63.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean66 = jSTypeRegistry63.shouldTolerateUndefinedValues();
        boolean boolean67 = jSTypeRegistry63.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node76 = node73.useSourceInfoIfMissingFromForTree(node75);
        boolean boolean77 = node75.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter78 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry80 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter78, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable82 = jSTypeRegistry80.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean83 = jSTypeRegistry80.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType84 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray85 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList86 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList86, jSTypeArray85);
        com.google.javascript.rhino.jstype.FunctionType functionType88 = jSTypeRegistry80.createFunctionTypeWithVarArgs(jSType84, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList86);
        boolean boolean89 = functionType88.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType90 = jSTypeRegistry63.createEnumType("false", node75, (com.google.javascript.rhino.jstype.JSType) functionType88);
        com.google.javascript.rhino.jstype.FunctionType functionType91 = functionType88.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType92 = jSTypeRegistry27.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType57, (com.google.javascript.rhino.jstype.JSType) functionType91);
        boolean boolean93 = parameterizedType92.isBooleanObjectType();
        com.google.javascript.rhino.jstype.JSType jSType94 = parameterizedType92.autobox();
        com.google.javascript.rhino.JSDocInfo jSDocInfo95 = null;
        parameterizedType92.setJSDocInfo(jSDocInfo95);
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType97 = jSTypeRegistry2.createParameterizedType(objectType24, (com.google.javascript.rhino.jstype.JSType) parameterizedType92);
        boolean boolean99 = jSTypeRegistry2.hasNamespace("{794143334}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType17 and parameterizedType97.", functionType17.equals(parameterizedType97) == parameterizedType97.equals(functionType17));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node7 = node4.useSourceInfoIfMissingFromForTree(node6);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable8 = node6.getAncestors();
        boolean boolean9 = node6.isFalse();
        boolean boolean10 = node6.isAssign();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean17 = node16.isDefaultCase();
        node16.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId20 = node16.getInputId();
        node16.detachChildren();
        boolean boolean22 = node16.isNull();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) 'a', node16);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable24 = node16.children();
        com.google.javascript.rhino.Node node25 = node6.useSourceInfoIfMissingFrom(node16);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder26 = node6.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(7, (int) (short) 100, 50);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) 29);
        boolean boolean33 = node32.isLocalResultCall();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node6.replaceChild(node30, node32);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder6 = node5.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean12 = node11.isDefaultCase();
        node11.setVarArgs(true);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) 'a', node5, node11, node19);
        boolean boolean21 = node5.isScript();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder22 = node5.new FileLevelJsDocBuilder();
        boolean boolean23 = node5.isQuotedString();
        boolean boolean24 = node5.isAnd();
        boolean boolean25 = node5.isNew();
        int int26 = node5.getCharno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node28 = node5.getChildAtIndex(45);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean5 = node4.isDefaultCase();
        node4.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId8 = node4.getInputId();
        node4.detachChildren();
        boolean boolean10 = node4.isAssignAdd();
        com.google.javascript.rhino.Node node11 = node4.removeFirstChild();
        node4.setSourceEncodedPositionForTree(6);
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition15 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean16 = typePosition15.hasBrackets();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean22 = node21.isDefaultCase();
        node21.setVarArgs(true);
        node21.setVarArgs(false);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable27 = node21.getAncestors();
        typePosition15.setItem(node21);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node36 = node33.useSourceInfoIfMissingFromForTree(node35);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean42 = node41.isDefaultCase();
        node41.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId45 = node41.getInputId();
        node41.detachChildren();
        com.google.javascript.rhino.Node node47 = node35.copyInformationFrom(node41);
        int int48 = node41.getType();
        boolean boolean49 = node41.isFunction();
        typePosition15.setItem(node41);
        com.google.javascript.rhino.Node node51 = typePosition15.getItem();
        com.google.javascript.rhino.Node node52 = node51.cloneTree();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int58 = node57.getType();
        boolean boolean59 = node57.isDebugger();
        int int60 = node57.getLineno();
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString("{18933907}", 36, 32);
        com.google.javascript.rhino.Node node67 = new com.google.javascript.rhino.Node(15, node51, node57, node64, 40960, 52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node68 = node4.getChildBefore(node57);
    }
}


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100);
        node1.addChildrenToFront(node3);
        com.google.javascript.rhino.Node node5 = node3.getParent();
        node3.setIsSyntheticBlock(true);
        boolean boolean8 = node3.isContinue();
        boolean boolean9 = node3.isParamList();
        node3.setSourceEncodedPositionForTree(54);
        boolean boolean12 = node3.isCall();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node14 = node3.getChildAtIndex(43);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        node1.addSuppression("");
        java.lang.String str4 = node1.toString();
        com.google.javascript.rhino.Node node5 = node1.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = node1.getStaticSourceFile();
        boolean boolean7 = node1.isLocalResultCall();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(100);
        node9.addSuppression("");
        java.lang.String str12 = node9.toString();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(100);
        node14.addSuppression("");
        java.lang.String str17 = node14.toString();
        com.google.javascript.rhino.Node node18 = node14.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile19 = node14.getStaticSourceFile();
        com.google.javascript.rhino.Node node20 = node9.copyInformationFromForTree(node14);
        com.google.javascript.rhino.Node node21 = node1.useSourceInfoFrom(node14);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(100);
        node23.addChildrenToFront(node25);
        com.google.javascript.rhino.Node node27 = node25.getParent();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(100);
        node29.addSuppression("");
        java.lang.String str32 = node29.toString();
        com.google.javascript.rhino.Node node33 = node29.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile34 = node29.getStaticSourceFile();
        boolean boolean35 = node29.isLocalResultCall();
        boolean boolean36 = node29.isArrayLit();
        boolean boolean37 = node29.isAssign();
        boolean boolean38 = node29.isAssign();
        boolean boolean39 = node29.isFromExterns();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node21.replaceChild(node25, node29);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100);
        node1.addChildrenToFront(node3);
        com.google.javascript.rhino.Node node5 = node3.getParent();
        boolean boolean6 = node5.isDefaultCase();
        boolean boolean7 = node5.isNoSideEffectsCall();
        boolean boolean8 = node5.isNew();
        node5.setSourceEncodedPosition((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node12 = node5.getChildAtIndex(49);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100);
        node1.addChildrenToFront(node3);
        boolean boolean5 = node3.isLabel();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(100);
        node7.addChildrenToFront(node9);
        boolean boolean11 = node7.isNot();
        boolean boolean12 = node7.isLocalResultCall();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(100);
        node14.addSuppression("");
        com.google.javascript.rhino.Node node17 = node7.copyInformationFromForTree(node14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node7);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        node1.addSuppression("");
        java.lang.String str4 = node1.toString();
        int int5 = node1.getChildCount();
        boolean boolean6 = node1.isGetProp();
        boolean boolean7 = node1.isOnlyModifiesThisCall();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node9 = node1.getChildAtIndex(6);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100);
        node1.addChildrenToFront(node3);
        int int5 = node3.getType();
        com.google.javascript.rhino.InputId inputId6 = node3.getInputId();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(100);
        node8.addChildrenToFront(node10);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable12 = node8.children();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable13 = node8.siblings();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable14 = node8.children();
        boolean boolean15 = node8.isObjectLit();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node(100);
        node17.addChildrenToFront(node19);
        boolean boolean21 = node17.isReturn();
        com.google.javascript.rhino.InputId inputId22 = node17.getInputId();
        boolean boolean23 = node17.isArrayLit();
        boolean boolean24 = node17.isInc();
        com.google.javascript.rhino.Node node25 = node8.srcrefTree(node17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node26 = node3.getChildBefore(node8);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        node1.addSuppression("");
        java.lang.String str4 = node1.toString();
        com.google.javascript.rhino.Node node5 = node1.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = node1.getStaticSourceFile();
        boolean boolean7 = node1.isVarArgs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node9 = node1.getChildAtIndex((int) (byte) 100);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getFileOverview();
        java.lang.String str2 = jSDocInfo0.getFileOverview();
        java.lang.String str3 = jSDocInfo0.getMeaning();
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(100);
        node5.addSuppression("");
        java.lang.String str8 = node5.toString();
        com.google.javascript.rhino.Node node9 = node5.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile10 = node5.getStaticSourceFile();
        boolean boolean11 = node5.isLocalResultCall();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(100);
        node13.addSuppression("");
        java.lang.String str16 = node13.toString();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(100);
        node18.addSuppression("");
        java.lang.String str21 = node18.toString();
        com.google.javascript.rhino.Node node22 = node18.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile23 = node18.getStaticSourceFile();
        com.google.javascript.rhino.Node node24 = node13.copyInformationFromForTree(node18);
        com.google.javascript.rhino.Node node25 = node5.useSourceInfoFrom(node18);
        jSDocInfo0.setAssociatedNode(node5);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable27 = node5.children();
        boolean boolean28 = node5.isReturn();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node30 = node5.getChildAtIndex((int) 'a');
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100);
        node1.addChildrenToFront(node3);
        boolean boolean5 = node1.isBreak();
        boolean boolean6 = node1.isScript();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node8 = node1.getChildAtIndex((int) (byte) 10);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition1 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition2 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition3 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition4 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition5 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition6 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition7 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.TypePosition> typePositionList8 = com.google.common.collect.ImmutableList.of(typePosition0, typePosition1, typePosition2, typePosition3, typePosition4, typePosition5, typePosition6, typePosition7);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(100);
        node10.addChildrenToFront(node12);
        com.google.javascript.rhino.Node node14 = node12.getParent();
        node12.setIsSyntheticBlock(true);
        boolean boolean17 = node12.isContinue();
        java.lang.String str18 = node12.getQualifiedName();
        boolean boolean19 = node12.isSetterDef();
        typePosition3.setItem(node12);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(100);
        node22.addChildrenToFront(node24);
        com.google.javascript.rhino.Node node26 = node24.getParent();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(100);
        node28.addChildrenToFront(node30);
        boolean boolean32 = node28.isTypeOf();
        com.google.javascript.rhino.jstype.JSType jSType33 = node28.getJSType();
        boolean boolean34 = node28.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node35 = node26.useSourceInfoIfMissingFromForTree(node28);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString(1, "unknown", (int) (byte) 10, 39);
        int int41 = node40.getSideEffectFlags();
        com.google.javascript.rhino.Node node42 = node28.useSourceInfoIfMissingFrom(node40);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder43 = node40.getJsDocBuilderForNode();
        boolean boolean44 = node40.isLocalResultCall();
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(100);
        node46.addChildrenToFront(node48);
        boolean boolean50 = node46.isNot();
        boolean boolean51 = node46.isDefaultCase();
        java.lang.String str52 = node46.toStringTree();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node12.replaceChild(node40, node46);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        node1.addSuppression("");
        java.lang.String str4 = node1.toString();
        com.google.javascript.rhino.Node node5 = node1.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = node1.getStaticSourceFile();
        boolean boolean7 = node1.isLocalResultCall();
        boolean boolean8 = node1.isArrayLit();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(100);
        node10.addChildrenToFront(node12);
        int int14 = node10.getCharno();
        boolean boolean15 = node10.isName();
        com.google.javascript.rhino.Node node16 = node1.srcrefTree(node10);
        boolean boolean17 = node10.isObjectLit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node19 = node10.getChildAtIndex(50);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100);
        node1.addChildrenToFront(node3);
        com.google.javascript.rhino.Node node5 = node3.getParent();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(100);
        node7.addChildrenToFront(node9);
        boolean boolean11 = node7.isTypeOf();
        com.google.javascript.rhino.jstype.JSType jSType12 = node7.getJSType();
        boolean boolean13 = node7.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node14 = node5.useSourceInfoIfMissingFromForTree(node7);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(1, "unknown", (int) (byte) 10, 39);
        int int20 = node19.getSideEffectFlags();
        com.google.javascript.rhino.Node node21 = node7.useSourceInfoIfMissingFrom(node19);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder22 = node19.getJsDocBuilderForNode();
        boolean boolean23 = node19.isLocalResultCall();
        java.lang.Object obj25 = node19.getProp((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node27 = node19.getChildAtIndex(54);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(100);
        node2.addChildrenToFront(node4);
        boolean boolean6 = node2.isReturn();
        com.google.javascript.rhino.InputId inputId7 = node2.getInputId();
        boolean boolean8 = node2.isAdd();
        boolean boolean9 = node2.isQuotedString();
        int int11 = node2.getIntProp((int) (byte) 1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(100);
        node13.addChildrenToFront(node15);
        boolean boolean17 = node13.isNot();
        boolean boolean18 = node13.isLocalResultCall();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(100);
        node20.addSuppression("");
        com.google.javascript.rhino.Node node23 = node13.copyInformationFromForTree(node20);
        node13.setOptionalArg(true);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) (short) -1);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(100);
        node29.addSuppression("");
        java.lang.String str32 = node29.toString();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node(100);
        node34.addChildrenToFront(node36);
        com.google.javascript.rhino.Node node38 = node36.getParent();
        com.google.javascript.rhino.Node node39 = node29.useSourceInfoFromForTree(node36);
        boolean boolean40 = node39.isSetterDef();
        com.google.javascript.rhino.Node node41 = node39.getLastChild();
        boolean boolean42 = node39.isLocalResultCall();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(1, node2, node13, node27, node39);
        boolean boolean44 = node39.isAssign();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node46 = node39.getChildAtIndex(31);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100);
        node1.addChildrenToFront(node3);
        boolean boolean5 = node1.isNot();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node8 = node1.copyInformationFromForTree(node7);
        boolean boolean9 = node8.isExprResult();
        boolean boolean10 = node8.isDefaultCase();
        boolean boolean11 = node8.isTrue();
        boolean boolean12 = node8.isNew();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node14 = node8.getChildAtIndex(29);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getFileOverview();
        java.lang.String str2 = jSDocInfo0.getFileOverview();
        java.lang.String str3 = jSDocInfo0.getMeaning();
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(100);
        node5.addSuppression("");
        java.lang.String str8 = node5.toString();
        com.google.javascript.rhino.Node node9 = node5.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile10 = node5.getStaticSourceFile();
        boolean boolean11 = node5.isLocalResultCall();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(100);
        node13.addSuppression("");
        java.lang.String str16 = node13.toString();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(100);
        node18.addSuppression("");
        java.lang.String str21 = node18.toString();
        com.google.javascript.rhino.Node node22 = node18.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile23 = node18.getStaticSourceFile();
        com.google.javascript.rhino.Node node24 = node13.copyInformationFromForTree(node18);
        com.google.javascript.rhino.Node node25 = node5.useSourceInfoFrom(node18);
        jSDocInfo0.setAssociatedNode(node5);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable27 = node5.children();
        boolean boolean28 = node5.isAnd();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node30 = node5.getChildAtIndex(52);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        node1.addSuppression("");
        java.lang.String str4 = node1.toString();
        com.google.javascript.rhino.Node node5 = node1.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = node1.getStaticSourceFile();
        boolean boolean7 = node1.isLocalResultCall();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(100);
        node9.addSuppression("");
        java.lang.String str12 = node9.toString();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(100);
        node14.addSuppression("");
        java.lang.String str17 = node14.toString();
        com.google.javascript.rhino.Node node18 = node14.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile19 = node14.getStaticSourceFile();
        com.google.javascript.rhino.Node node20 = node9.copyInformationFromForTree(node14);
        com.google.javascript.rhino.Node node21 = node1.useSourceInfoFrom(node14);
        boolean boolean22 = node1.isTrue();
        boolean boolean23 = node1.isWhile();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition24 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 10);
        typePosition24.setItem(node26);
        int int28 = node26.getSourceOffset();
        boolean boolean29 = node26.isNumber();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node26);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        node1.addSuppression("");
        java.lang.String str4 = node1.toString();
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(100);
        node6.addSuppression("");
        java.lang.String str9 = node6.toString();
        com.google.javascript.rhino.Node node10 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile11 = node6.getStaticSourceFile();
        com.google.javascript.rhino.Node node12 = node1.copyInformationFromForTree(node6);
        boolean boolean13 = node6.isAssignAdd();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(100);
        node15.addChildrenToFront(node17);
        boolean boolean19 = node15.isTypeOf();
        boolean boolean20 = node15.isVarArgs();
        boolean boolean21 = node15.isIn();
        node6.addChildToFront(node15);
        node15.removeProp(48);
        com.google.javascript.rhino.Node node26 = node15.getAncestor(0);
        com.google.javascript.rhino.Node node28 = node26.getChildAtIndex((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node30 = node26.getChildAtIndex(32);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100);
        node1.addChildrenToFront(node3);
        int int5 = node1.getCharno();
        boolean boolean6 = node1.isName();
        boolean boolean7 = node1.isNE();
        boolean boolean8 = node1.isIn();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(100);
        node10.addChildrenToFront(node12);
        com.google.javascript.rhino.Node node14 = node12.getParent();
        boolean boolean15 = node14.isDefaultCase();
        int int16 = node1.getIndexOfChild(node14);
        node14.setWasEmptyNode(false);
        boolean boolean19 = node14.isAssign();
        boolean boolean20 = node14.isGetElem();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node22 = node14.getChildAtIndex(29);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("Node tree inequality:\nTree1:\nOR 0 [jsdoc_info: JSDocInfo]\n\n\nTree2:\nOR\n    OR\n\n\nSubtree1: OR 0 [jsdoc_info: JSDocInfo]\n\n\nSubtree2: OR\n    OR\n", (-1), 8);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder4 = node3.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str6 = jSDocInfo5.getFileOverview();
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = jSDocInfo5.getTemplateTypeNames();
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = strList7.reverse();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(100);
        node10.addChildrenToFront(node12);
        boolean boolean14 = node10.isReturn();
        com.google.javascript.rhino.InputId inputId15 = node10.getInputId();
        boolean boolean16 = node10.isArrayLit();
        boolean boolean17 = node10.isInc();
        boolean boolean18 = node10.isAssign();
        java.lang.String str19 = node10.getSourceFileName();
        int int20 = strList8.lastIndexOf((java.lang.Object) node10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node21 = node3.getChildBefore(node10);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100);
        node1.addChildrenToFront(node3);
        com.google.javascript.rhino.Node node5 = node3.getParent();
        boolean boolean6 = node5.isDefaultCase();
        boolean boolean7 = node5.isNoSideEffectsCall();
        java.lang.String str11 = node5.toString(false, false, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node13 = node5.getChildAtIndex(7);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100);
        node1.addChildrenToFront(node3);
        com.google.javascript.rhino.Node node5 = node3.getParent();
        node3.setIsSyntheticBlock(true);
        boolean boolean8 = node3.isContinue();
        java.lang.String str9 = node3.getQualifiedName();
        boolean boolean10 = node3.isSwitch();
        node3.removeProp((int) '4');
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(100);
        node14.addChildrenToFront(node16);
        boolean boolean18 = node16.isLabel();
        boolean boolean19 = node16.isContinue();
        com.google.javascript.rhino.Node node20 = node16.removeFirstChild();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(100);
        node22.addChildrenToFront(node24);
        int int26 = node22.getCharno();
        com.google.javascript.rhino.Node node27 = node16.useSourceInfoIfMissingFrom(node22);
        boolean boolean28 = node3.isEquivalentTo(node22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node30 = node3.getChildAtIndex((int) (byte) 100);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(43, 29, 35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node5 = node3.getChildAtIndex(52);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(36, 52, (int) '4');
        boolean boolean4 = node3.isName();
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(100);
        node6.addSuppression("");
        java.lang.String str9 = node6.toString();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(100);
        node11.addChildrenToFront(node13);
        com.google.javascript.rhino.Node node15 = node13.getParent();
        com.google.javascript.rhino.Node node16 = node6.useSourceInfoFromForTree(node13);
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean18 = jSDocInfo17.hasBaseType();
        jSDocInfo17.setLicense("Node tree inequality:\nTree1:\nOR 0 [jsdoc_info: JSDocInfo]\n\n\nTree2:\nOR\n    OR\n\n\nSubtree1: OR 0 [jsdoc_info: JSDocInfo]\n\n\nSubtree2: OR\n    OR\n");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression21 = jSDocInfo17.getBaseType();
        node16.setJSDocInfo(jSDocInfo17);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(100);
        node24.addChildrenToFront(node26);
        com.google.javascript.rhino.Node node28 = node26.getParent();
        boolean boolean29 = node28.isDefaultCase();
        boolean boolean30 = node28.isVoid();
        node16.addChildToBack(node28);
        java.lang.String str32 = node28.getQualifiedName();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node(100);
        node34.addChildrenToFront(node36);
        boolean boolean38 = node34.isNot();
        boolean boolean39 = node34.isDefaultCase();
        node34.setCharno((int) (byte) 10);
        boolean boolean42 = node34.isNumber();
        boolean boolean43 = node34.isNew();
        boolean boolean44 = node34.isQuotedString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.replaceChild(node28, node34);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100);
        node1.addChildrenToFront(node3);
        com.google.javascript.rhino.Node node5 = node3.getParent();
        node3.setIsSyntheticBlock(true);
        boolean boolean8 = node3.isContinue();
        boolean boolean9 = node3.isParamList();
        boolean boolean10 = node3.isParamList();
        com.google.javascript.rhino.Node node11 = node3.cloneTree();
        com.google.javascript.rhino.Node node12 = node3.cloneTree();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(100);
        node14.addChildrenToFront(node16);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(100);
        node19.addChildrenToFront(node21);
        boolean boolean23 = node19.isNot();
        boolean boolean24 = node19.isIf();
        com.google.javascript.rhino.Node node25 = node16.copyInformationFromForTree(node19);
        boolean boolean26 = node25.isParamList();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression28 = new com.google.javascript.rhino.JSTypeExpression(node25, "OR [jsdoc_info: JSDocInfo]\n");
        com.google.javascript.rhino.Node node29 = node25.cloneTree();
        boolean boolean30 = node25.isCall();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node31 = node3.getChildBefore(node25);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        node1.addSuppression("");
        java.lang.String str4 = node1.toString();
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(100);
        node6.addChildrenToFront(node8);
        com.google.javascript.rhino.Node node10 = node8.getParent();
        com.google.javascript.rhino.Node node11 = node1.useSourceInfoFromForTree(node8);
        boolean boolean12 = node11.isSetterDef();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable13 = node11.siblings();
        int int14 = node11.getChildCount();
        com.google.javascript.rhino.InputId inputId15 = node11.getInputId();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node(100);
        node17.addChildrenToFront(node19);
        com.google.javascript.rhino.Node node21 = node19.getParent();
        boolean boolean22 = node21.isDefaultCase();
        boolean boolean23 = node21.isNoSideEffectsCall();
        boolean boolean24 = node21.isAssignAdd();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node25 = node11.getChildBefore(node21);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        node1.addSuppression("");
        java.lang.String str4 = node1.toString();
        com.google.javascript.rhino.Node node5 = node1.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = node1.getStaticSourceFile();
        boolean boolean7 = node1.isLocalResultCall();
        boolean boolean8 = node1.isArrayLit();
        boolean boolean9 = node1.isAssign();
        boolean boolean10 = node1.isAssign();
        boolean boolean11 = node1.isReturn();
        boolean boolean12 = node1.isTypeOf();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node14 = node1.getChildAtIndex(100);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        boolean boolean2 = node1.isParamList();
        node1.putBooleanProp(42, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node7 = node1.getChildAtIndex((int) (short) 1);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100);
        node1.addChildrenToFront(node3);
        boolean boolean5 = node1.isNot();
        boolean boolean6 = node1.isDefaultCase();
        boolean boolean7 = node1.isEmpty();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(100);
        node9.addChildrenToFront(node11);
        int int13 = node9.getCharno();
        boolean boolean14 = node9.isName();
        boolean boolean15 = node9.isNE();
        boolean boolean16 = node9.isIn();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(100);
        node18.addChildrenToFront(node20);
        com.google.javascript.rhino.Node node22 = node20.getParent();
        boolean boolean23 = node22.isDefaultCase();
        int int24 = node9.getIndexOfChild(node22);
        boolean boolean25 = node22.isLabelName();
        boolean boolean26 = node1.isEquivalentTo(node22);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString(53, "OR [jsdoc_info: JSDocInfo]");
        boolean boolean30 = node29.isRegExp();
        boolean boolean32 = node29.getBooleanProp(16);
        com.google.javascript.rhino.Node node33 = node22.copyInformationFrom(node29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node35 = node22.getChildAtIndex(49);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        com.google.common.collect.ImmutableList<java.lang.String> strList6 = com.google.common.collect.ImmutableList.of("", "", "hi!", "OR [jsdoc_info: JSDocInfo]", "", "OR [jsdoc_info: JSDocInfo]");
        java.lang.String[] strArray9 = new java.lang.String[] { "OR [jsdoc_info: JSDocInfo]", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        com.google.common.collect.ImmutableList<java.lang.String> strList18 = com.google.common.collect.ImmutableList.of("", "", "hi!", "OR [jsdoc_info: JSDocInfo]", "", "OR [jsdoc_info: JSDocInfo]");
        boolean boolean19 = strList10.equals((java.lang.Object) "OR [jsdoc_info: JSDocInfo]");
        boolean boolean20 = strList10.isEmpty();
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "OR [jsdoc_info: JSDocInfo]" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        boolean boolean30 = strList23.retainAll((java.util.Collection<java.lang.String>) strList28);
        com.google.common.collect.ImmutableList<java.lang.String> strList37 = com.google.common.collect.ImmutableList.of("", "", "hi!", "OR [jsdoc_info: JSDocInfo]", "", "OR [jsdoc_info: JSDocInfo]");
        com.google.common.collect.ImmutableList<java.lang.String> strList44 = com.google.common.collect.ImmutableList.of("", "", "hi!", "OR [jsdoc_info: JSDocInfo]", "", "OR [jsdoc_info: JSDocInfo]");
        boolean boolean45 = strList37.containsAll((java.util.Collection<java.lang.String>) strList44);
        java.lang.String[] strArray47 = new java.lang.String[] { "unknown" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "OR [jsdoc_info: JSDocInfo]" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        boolean boolean59 = strList52.retainAll((java.util.Collection<java.lang.String>) strList57);
        java.lang.String[] strArray61 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList62 = new java.util.ArrayList<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList62, strArray61);
        java.lang.String[] strArray66 = new java.lang.String[] { "hi!", "OR [jsdoc_info: JSDocInfo]" };
        java.util.ArrayList<java.lang.String> strList67 = new java.util.ArrayList<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList67, strArray66);
        boolean boolean69 = strList62.retainAll((java.util.Collection<java.lang.String>) strList67);
        com.google.common.collect.ImmutableList<java.util.List<java.lang.String>> strListList70 = com.google.common.collect.ImmutableList.of((java.util.List<java.lang.String>) strList6, (java.util.List<java.lang.String>) strList10, (java.util.List<java.lang.String>) strList28, (java.util.List<java.lang.String>) strList37, (java.util.List<java.lang.String>) strList48, (java.util.List<java.lang.String>) strList52, (java.util.List<java.lang.String>) strList62);
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node(100);
        node72.addSuppression("");
        java.lang.String str75 = node72.toString();
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node(100);
        node77.addSuppression("");
        java.lang.String str80 = node77.toString();
        com.google.javascript.rhino.Node node81 = node77.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile82 = node77.getStaticSourceFile();
        com.google.javascript.rhino.Node node83 = node72.copyInformationFromForTree(node77);
        boolean boolean84 = strList28.remove((java.lang.Object) node83);
        boolean boolean85 = node83.isHook();
        node83.setSourceFileForTesting("OR\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node89 = node83.getChildAtIndex(41);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100);
        node1.addChildrenToFront(node3);
        boolean boolean5 = node1.isTypeOf();
        boolean boolean6 = node1.wasEmptyNode();
        boolean boolean7 = node1.isLabelName();
        node1.removeProp(49);
        boolean boolean10 = node1.isCall();
        boolean boolean11 = node1.isQualifiedName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node13 = node1.getChildAtIndex(3);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100);
        node1.addChildrenToFront(node3);
        node1.putIntProp((int) (short) 0, 38);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder8 = node1.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(100);
        node10.addChildrenToFront(node12);
        boolean boolean14 = node10.isNot();
        boolean boolean15 = node10.isIf();
        boolean boolean16 = node10.isNoSideEffectsCall();
        int int17 = node10.getType();
        boolean boolean18 = node10.isAssign();
        com.google.javascript.rhino.Node node19 = node1.copyInformationFromForTree(node10);
        boolean boolean20 = node10.isNew();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node22 = node10.getChildAtIndex(16);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(43, "(Not declared as a type name)");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 4, (int) (byte) 1, 4);
        boolean boolean7 = node6.isRegExp();
        boolean boolean8 = node6.isDebugger();
        boolean boolean9 = node6.isCall();
        node6.setLength(30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node12 = node2.getChildBefore(node6);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) 'a', "");
        node2.addSuppression("Node tree inequality:\nTree1:\nOR 0 [jsdoc_info: JSDocInfo]\n\n\nTree2:\nOR\n    OR\n\n\nSubtree1: OR 0 [jsdoc_info: JSDocInfo]\n\n\nSubtree2: OR\n    OR\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node6 = node2.getChildAtIndex((int) (short) 1);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100);
        node1.addChildrenToFront(node3);
        com.google.javascript.rhino.Node node5 = node3.getParent();
        node3.setIsSyntheticBlock(true);
        boolean boolean8 = node3.isContinue();
        java.lang.String str9 = node3.getQualifiedName();
        boolean boolean10 = node3.isSwitch();
        node3.removeProp((int) '4');
        boolean boolean13 = node3.isParamList();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable14 = node3.siblings();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable15 = node3.children();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder16 = node3.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(1, "unknown", (int) (byte) 10, 39);
        int int22 = node21.getSideEffectFlags();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(100);
        node24.addChildrenToFront(node26);
        int int28 = node24.getCharno();
        boolean boolean29 = node24.isName();
        boolean boolean30 = node24.isNE();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression32 = new com.google.javascript.rhino.JSTypeExpression(node24, "Unknown class name");
        node21.addChildrenToFront(node24);
        boolean boolean34 = node24.isInstanceOf();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node24);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100);
        node1.addChildrenToFront(node3);
        boolean boolean5 = node1.isReturn();
        com.google.javascript.rhino.InputId inputId6 = node1.getInputId();
        boolean boolean7 = node1.isArrayLit();
        boolean boolean8 = node1.isObjectLit();
        boolean boolean9 = node1.isBreak();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node11 = node1.getChildAtIndex(41);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(100);
        node2.addSuppression("");
        java.lang.String str5 = node2.toString();
        com.google.javascript.rhino.Node node6 = node2.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile7 = node2.getStaticSourceFile();
        boolean boolean8 = node2.isVar();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(100);
        node10.addSuppression("");
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile13 = null;
        node10.setStaticSourceFile(staticSourceFile13);
        boolean boolean15 = node10.isComma();
        boolean boolean16 = node10.isBlock();
        com.google.javascript.rhino.Node node17 = node10.getLastSibling();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node(100);
        node19.addSuppression("");
        java.lang.String str22 = node19.toString();
        com.google.javascript.rhino.Node node23 = node19.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile24 = node19.getStaticSourceFile();
        boolean boolean25 = node19.isVarArgs();
        node10.addChildrenToFront(node19);
        node10.setSourceEncodedPositionForTree(51);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(50, node2, node10);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression31 = new com.google.javascript.rhino.JSTypeExpression(node2, "OR [jsdoc_info: JSDocInfo]\n");
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(100);
        node33.addChildrenToFront(node35);
        int int37 = node33.getCharno();
        boolean boolean38 = node33.isName();
        boolean boolean39 = node33.isNE();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression41 = new com.google.javascript.rhino.JSTypeExpression(node33, "Unknown class name");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression42 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression41);
        com.google.javascript.rhino.Node node43 = jSTypeExpression42.getRoot();
        com.google.javascript.rhino.JSDocInfo jSDocInfo44 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean45 = jSDocInfo44.hasBaseType();
        jSDocInfo44.setLicense("Node tree inequality:\nTree1:\nOR 0 [jsdoc_info: JSDocInfo]\n\n\nTree2:\nOR\n    OR\n\n\nSubtree1: OR 0 [jsdoc_info: JSDocInfo]\n\n\nSubtree2: OR\n    OR\n");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression48 = jSDocInfo44.getBaseType();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection49 = jSDocInfo44.getTypeNodes();
        boolean boolean50 = jSDocInfo44.shouldPreserveTry();
        boolean boolean51 = jSDocInfo44.isOverride();
        boolean boolean52 = jSTypeExpression42.equals((java.lang.Object) boolean51);
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(100);
        node54.addChildrenToFront(node56);
        int int58 = node54.getCharno();
        boolean boolean59 = node54.isName();
        boolean boolean60 = node54.isNE();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression62 = new com.google.javascript.rhino.JSTypeExpression(node54, "Unknown class name");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression63 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression62);
        boolean boolean64 = jSTypeExpression63.isVarArgs();
        boolean boolean65 = jSTypeExpression63.isVarArgs();
        boolean boolean66 = jSTypeExpression63.isOptionalArg();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression67 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression63);
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(100);
        node69.addChildrenToFront(node71);
        com.google.javascript.rhino.Node node74 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node76 = new com.google.javascript.rhino.Node(100);
        node74.addChildrenToFront(node76);
        boolean boolean78 = node74.isNot();
        boolean boolean79 = node74.isIf();
        com.google.javascript.rhino.Node node80 = node71.copyInformationFromForTree(node74);
        boolean boolean81 = node80.isParamList();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression83 = new com.google.javascript.rhino.JSTypeExpression(node80, "OR [jsdoc_info: JSDocInfo]\n");
        com.google.javascript.rhino.Node node84 = jSTypeExpression83.getRoot();
        com.google.javascript.rhino.JSTypeExpression[] jSTypeExpressionArray85 = new com.google.javascript.rhino.JSTypeExpression[] { jSTypeExpression31, jSTypeExpression42, jSTypeExpression67, jSTypeExpression83 };
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList86 = com.google.common.collect.ImmutableList.of(jSTypeExpressionArray85);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression31 and jSTypeExpression83", jSTypeExpression31.equals(jSTypeExpression83) ? jSTypeExpression31.hashCode() == jSTypeExpression83.hashCode() : true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(100);
        node2.addSuppression("");
        java.lang.String str5 = node2.toString();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(100);
        node7.addChildrenToFront(node9);
        com.google.javascript.rhino.Node node11 = node9.getParent();
        com.google.javascript.rhino.Node node12 = node2.useSourceInfoFromForTree(node9);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(100);
        node14.addChildrenToFront(node16);
        int int18 = node14.getCharno();
        boolean boolean19 = node14.isName();
        boolean boolean20 = node14.isNE();
        boolean boolean21 = node14.isIn();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(100);
        node23.addChildrenToFront(node25);
        com.google.javascript.rhino.Node node27 = node25.getParent();
        boolean boolean28 = node27.isDefaultCase();
        int int29 = node14.getIndexOfChild(node27);
        node14.setSourceEncodedPosition(4095);
        com.google.javascript.rhino.Node node32 = node12.useSourceInfoIfMissingFromForTree(node14);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("OR");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable35 = node34.siblings();
        int int36 = node34.getSourcePosition();
        boolean boolean37 = node34.isDefaultCase();
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(47, node32, node34, 6, 37);
        java.lang.String str41 = node32.toStringTree();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node43 = node32.getChildAtIndex(40999);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100);
        node1.addChildrenToFront(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node6 = node3.getChildAtIndex(6);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isExport();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList2 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean4 = jSDocInfo0.hasParameterType("OR");
        com.google.common.collect.ImmutableList<java.lang.String> strList5 = jSDocInfo0.getTemplateTypeNames();
        java.lang.String[] strArray12 = new java.lang.String[] { "Named type with empty name component", "unknown", "Not declared as a type name", "(Unknown class name)", "Unknown class name", "JSDocInfo" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        java.lang.Object[] objArray15 = strSet13.toArray();
        strSet13.clear();
        boolean boolean17 = strList5.containsAll((java.util.Collection<java.lang.String>) strSet13);
        com.google.common.collect.ImmutableList<java.lang.String> strList18 = strList5.reverse();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags20 = new com.google.javascript.rhino.Node.SideEffectFlags(35);
        sideEffectFlags20.setReturnsTainted();
        sideEffectFlags20.setMutatesGlobalState();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags24 = new com.google.javascript.rhino.Node.SideEffectFlags(35);
        sideEffectFlags24.setMutatesArguments();
        sideEffectFlags24.setMutatesArguments();
        sideEffectFlags24.setMutatesGlobalState();
        sideEffectFlags24.setMutatesThis();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags29 = new com.google.javascript.rhino.Node.SideEffectFlags();
        sideEffectFlags29.setMutatesGlobalState();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags32 = new com.google.javascript.rhino.Node.SideEffectFlags((int) (byte) 1);
        com.google.javascript.rhino.Node.SideEffectFlags[] sideEffectFlagsArray33 = new com.google.javascript.rhino.Node.SideEffectFlags[] { sideEffectFlags20, sideEffectFlags24, sideEffectFlags29, sideEffectFlags32 };
        com.google.javascript.rhino.Node.SideEffectFlags[] sideEffectFlagsArray34 = strList5.toArray(sideEffectFlagsArray33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.Node.SideEffectFlags> sideEffectFlagsList35 = com.google.common.collect.ImmutableList.of(sideEffectFlagsArray33);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        node1.addSuppression("");
        java.lang.String str4 = node1.toString();
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(100);
        node6.addSuppression("");
        java.lang.String str9 = node6.toString();
        com.google.javascript.rhino.Node node10 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile11 = node6.getStaticSourceFile();
        com.google.javascript.rhino.Node node12 = node1.copyInformationFromForTree(node6);
        node6.setOptionalArg(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node16 = node6.getChildAtIndex(213092);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100);
        node1.addChildrenToFront(node3);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = new com.google.javascript.rhino.JSTypeExpression(node3, "Node tree inequality:\nTree1:\nOR 0 [jsdoc_info: JSDocInfo]\n\n\nTree2:\nOR\n    OR\n\n\nSubtree1: OR 0 [jsdoc_info: JSDocInfo]\n\n\nSubtree2: OR\n    OR\n");
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(100);
        node8.addChildrenToFront(node10);
        boolean boolean12 = node8.isNot();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node15 = node8.copyInformationFromForTree(node14);
        com.google.javascript.rhino.InputId inputId16 = node8.getInputId();
        boolean boolean17 = node8.isIn();
        node3.addChildToFront(node8);
        node8.setVarArgs(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node22 = node8.getChildAtIndex(49);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100);
        node1.addChildrenToFront(node3);
        int int5 = node1.getCharno();
        boolean boolean6 = node1.isName();
        boolean boolean7 = node1.isNE();
        boolean boolean8 = node1.isIn();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(100);
        node10.addChildrenToFront(node12);
        com.google.javascript.rhino.Node node14 = node12.getParent();
        boolean boolean15 = node14.isDefaultCase();
        int int16 = node1.getIndexOfChild(node14);
        boolean boolean17 = node14.isLabelName();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable18 = node14.children();
        boolean boolean19 = node14.isAssignAdd();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node21 = node14.getChildAtIndex(40);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("OR\n", 24, 35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node5 = node3.getChildAtIndex((int) '4');
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasBaseType();
        jSDocInfo0.setLicense("Node tree inequality:\nTree1:\nOR 0 [jsdoc_info: JSDocInfo]\n\n\nTree2:\nOR\n    OR\n\n\nSubtree1: OR 0 [jsdoc_info: JSDocInfo]\n\n\nSubtree2: OR\n    OR\n");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getBaseType();
        java.util.Set<java.lang.String> strSet5 = jSDocInfo0.getParameterNames();
        com.google.common.collect.ImmutableList<java.lang.String> strList12 = com.google.common.collect.ImmutableList.of("", "", "hi!", "OR [jsdoc_info: JSDocInfo]", "", "OR [jsdoc_info: JSDocInfo]");
        com.google.common.collect.ImmutableList<java.lang.String> strList19 = com.google.common.collect.ImmutableList.of("", "", "hi!", "OR [jsdoc_info: JSDocInfo]", "", "OR [jsdoc_info: JSDocInfo]");
        boolean boolean20 = strList12.containsAll((java.util.Collection<java.lang.String>) strList19);
        com.google.common.collect.UnmodifiableListIterator<java.lang.String> strItor21 = strList12.listIterator();
        boolean boolean22 = strSet5.containsAll((java.util.Collection<java.lang.String>) strList12);
        com.google.common.collect.UnmodifiableListIterator<java.lang.String> strItor23 = strList12.listIterator();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(100);
        node25.addChildrenToFront(node27);
        node25.putIntProp((int) (short) 0, 38);
        boolean boolean32 = node25.isCall();
        int int33 = node25.getCharno();
        node25.removeProp(0);
        int int36 = strList12.lastIndexOf((java.lang.Object) 0);
        java.util.stream.Stream<java.lang.String> strStream37 = strList12.parallelStream();
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(100);
        node39.addChildrenToFront(node41);
        boolean boolean43 = node39.isNot();
        boolean boolean44 = node39.isDefaultCase();
        node39.setCharno((int) (byte) 10);
        boolean boolean47 = node39.isNumber();
        boolean boolean48 = node39.isNew();
        boolean boolean49 = node39.isBlock();
        boolean boolean50 = strList12.equals((java.lang.Object) node39);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node(100);
        node52.addChildrenToFront(node54);
        boolean boolean56 = node52.isNot();
        boolean boolean57 = node52.isLocalResultCall();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(100);
        node59.addSuppression("");
        com.google.javascript.rhino.Node node62 = node52.copyInformationFromForTree(node59);
        boolean boolean63 = node62.isAssignAdd();
        boolean boolean64 = node62.hasOneChild();
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node(29);
        com.google.javascript.rhino.Node node67 = node62.copyInformationFrom(node66);
        boolean boolean68 = strList12.contains((java.lang.Object) node67);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node70 = node67.getChildAtIndex(45);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        node1.addSuppression("");
        java.lang.String str4 = node1.toString();
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(100);
        node6.addSuppression("");
        java.lang.String str9 = node6.toString();
        com.google.javascript.rhino.Node node10 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile11 = node6.getStaticSourceFile();
        com.google.javascript.rhino.Node node12 = node1.copyInformationFromForTree(node6);
        boolean boolean13 = node6.isAssignAdd();
        int int14 = node6.getLength();
        boolean boolean15 = node6.isThis();
        java.lang.String str16 = node6.getSourceFileName();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(100);
        node18.addChildrenToFront(node20);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node18.children();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node18.siblings();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable24 = node18.children();
        boolean boolean25 = node18.isQualifiedName();
        boolean boolean26 = node18.isFromExterns();
        com.google.javascript.rhino.Node node27 = node18.removeFirstChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node6.removeChild(node27);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 4, (int) (byte) 1, 4);
        boolean boolean4 = node3.isRegExp();
        boolean boolean5 = node3.isName();
        boolean boolean6 = node3.isBreak();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node8 = node3.getChildAtIndex(10);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100);
        node1.addChildrenToFront(node3);
        boolean boolean5 = node1.isTypeOf();
        boolean boolean6 = node1.isOnlyModifiesThisCall();
        node1.setWasEmptyNode(true);
        java.util.Set<java.lang.String> strSet9 = node1.getDirectives();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node11 = node1.getChildAtIndex(37);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        node1.addSuppression("");
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(100);
        node5.addSuppression("");
        java.lang.String str8 = node5.toString();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(100);
        node10.addChildrenToFront(node12);
        com.google.javascript.rhino.Node node14 = node12.getParent();
        com.google.javascript.rhino.Node node15 = node5.useSourceInfoFromForTree(node12);
        boolean boolean16 = node15.isArrayLit();
        node1.addChildToFront(node15);
        boolean boolean18 = node1.isCase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node20 = node1.getChildAtIndex(41);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(49);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(100);
        node3.addChildrenToFront(node5);
        int int7 = node3.getCharno();
        boolean boolean8 = node3.isName();
        boolean boolean9 = node3.isNE();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = new com.google.javascript.rhino.JSTypeExpression(node3, "Unknown class name");
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(100);
        node13.addChildrenToFront(node15);
        int int17 = node13.getCharno();
        boolean boolean18 = node13.isName();
        boolean boolean19 = node13.isNE();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression21 = new com.google.javascript.rhino.JSTypeExpression(node13, "Unknown class name");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression22 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression21);
        com.google.javascript.rhino.Node node23 = jSTypeExpression22.getRoot();
        boolean boolean24 = jSTypeExpression22.isVarArgs();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility25 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        boolean boolean26 = jSTypeExpression22.equals((java.lang.Object) visibility25);
        com.google.javascript.rhino.Node node27 = jSTypeExpression22.getRoot();
        node3.addChildrenToFront(node27);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 42);
        boolean boolean31 = node30.isGetterDef();
        boolean boolean32 = node30.isCase();
        boolean boolean33 = node30.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.replaceChild(node3, node30);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("EQ OR [jsdoc_info: JSDocInfo]", 39, 49);
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(100);
        node5.addChildrenToFront(node7);
        int int9 = node5.getCharno();
        boolean boolean10 = node5.isName();
        boolean boolean11 = node5.isDefaultCase();
        boolean boolean12 = node5.isLocalResultCall();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber(1.0d);
        boolean boolean15 = node14.hasOneChild();
        boolean boolean16 = node14.isInc();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.replaceChild(node5, node14);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100);
        node1.addChildrenToFront(node3);
        com.google.javascript.rhino.Node node5 = node3.getParent();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(100);
        node7.addChildrenToFront(node9);
        node7.putIntProp((int) (short) 0, 38);
        node3.addChildToBack(node7);
        boolean boolean15 = node7.isEmpty();
        node7.putBooleanProp(16, true);
        boolean boolean19 = node7.isVoid();
        boolean boolean20 = node7.isNot();
        boolean boolean21 = node7.isStringKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node23 = node7.getChildAtIndex((int) ' ');
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("(Not declared as a type name)", 6, (int) (byte) 1);
        node3.setWasEmptyNode(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node7 = node3.getChildAtIndex(32);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(100);
        node2.addChildrenToFront(node4);
        boolean boolean6 = node2.isNot();
        boolean boolean7 = node2.isIf();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(100);
        boolean boolean10 = node9.isParamList();
        com.google.javascript.rhino.Node node11 = node2.useSourceInfoIfMissingFrom(node9);
        boolean boolean12 = node9.isComma();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(100);
        node15.addSuppression("");
        java.lang.String str18 = node15.toString();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(100);
        node20.addChildrenToFront(node22);
        com.google.javascript.rhino.Node node24 = node22.getParent();
        com.google.javascript.rhino.Node node25 = node15.useSourceInfoFromForTree(node22);
        com.google.javascript.rhino.JSDocInfo jSDocInfo26 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean27 = jSDocInfo26.hasBaseType();
        jSDocInfo26.setLicense("Node tree inequality:\nTree1:\nOR 0 [jsdoc_info: JSDocInfo]\n\n\nTree2:\nOR\n    OR\n\n\nSubtree1: OR 0 [jsdoc_info: JSDocInfo]\n\n\nSubtree2: OR\n    OR\n");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression30 = jSDocInfo26.getBaseType();
        node25.setJSDocInfo(jSDocInfo26);
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((int) (short) 1, node25, 38, (int) '4');
        boolean boolean35 = node34.isThis();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(100);
        node37.addChildrenToFront(node39);
        boolean boolean41 = node37.isReturn();
        boolean boolean42 = node37.isContinue();
        com.google.javascript.rhino.Node node43 = node34.srcref(node37);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(100);
        node45.addChildrenToFront(node47);
        boolean boolean49 = node45.isNot();
        boolean boolean50 = node45.isIf();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(100);
        boolean boolean53 = node52.isParamList();
        com.google.javascript.rhino.Node node54 = node45.useSourceInfoIfMissingFrom(node52);
        boolean boolean55 = node52.isComma();
        java.lang.String str56 = node52.getSourceFileName();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(47, node9, node34, node52, 41, 43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node61 = node9.getChildAtIndex((int) (short) 1);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(48, "[OR 0 [jsdoc_info: JSDocInfo]\n, OR 0 [jsdoc_info: JSDocInfo]\n, ((OR)), false, (OR), Not declared as a type name, (Unknown class name), NUMBER 4.0 1\n, , Named type with empty name component]", (int) ' ', (int) (byte) 100);
        boolean boolean5 = node4.isComma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node7 = node4.getChildAtIndex(37);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100);
        node1.addChildrenToFront(node3);
        int int5 = node1.getCharno();
        boolean boolean6 = node1.isName();
        boolean boolean7 = node1.isNE();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = new com.google.javascript.rhino.JSTypeExpression(node1, "Unknown class name");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression9);
        boolean boolean12 = jSTypeExpression9.equals((java.lang.Object) 36);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(100);
        node14.addChildrenToFront(node16);
        int int18 = node14.getCharno();
        boolean boolean19 = node14.isName();
        boolean boolean20 = node14.isNE();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression22 = new com.google.javascript.rhino.JSTypeExpression(node14, "Unknown class name");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression23 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression22);
        com.google.javascript.rhino.Node node24 = jSTypeExpression23.getRoot();
        boolean boolean25 = jSTypeExpression23.isVarArgs();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList26 = com.google.common.collect.ImmutableList.of(jSTypeExpression9, jSTypeExpression23);
        boolean boolean27 = jSTypeExpression23.isOptionalArg();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression28 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression23);
        com.google.javascript.rhino.Node node29 = jSTypeExpression23.getRoot();
        node29.putIntProp(37, 47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression10 and jSTypeExpression23", jSTypeExpression10.equals(jSTypeExpression23) ? jSTypeExpression10.hashCode() == jSTypeExpression23.hashCode() : true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        node1.addSuppression("");
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile4 = null;
        node1.setStaticSourceFile(staticSourceFile4);
        boolean boolean6 = node1.isComma();
        boolean boolean7 = node1.isBlock();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node10 = node9.cloneNode();
        com.google.javascript.rhino.Node node11 = node1.copyInformationFromForTree(node10);
        boolean boolean12 = node10.isWhile();
        boolean boolean13 = node10.isDo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression15 = new com.google.javascript.rhino.JSTypeExpression(node10, "unknown");
        boolean boolean16 = jSTypeExpression15.isOptionalArg();
        boolean boolean17 = jSTypeExpression15.isOptionalArg();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node(100);
        node19.addSuppression("");
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile22 = null;
        node19.setStaticSourceFile(staticSourceFile22);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(100);
        node25.addSuppression("");
        java.lang.String str28 = node25.toString();
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(100);
        node30.addChildrenToFront(node32);
        com.google.javascript.rhino.Node node34 = node32.getParent();
        com.google.javascript.rhino.Node node35 = node25.useSourceInfoFromForTree(node32);
        boolean boolean36 = node19.hasChild(node25);
        boolean boolean37 = node19.isStringKey();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression39 = new com.google.javascript.rhino.JSTypeExpression(node19, "NUMBER 1.0 37\n");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression40 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression39);
        boolean boolean41 = jSTypeExpression40.isVarArgs();
        boolean boolean42 = jSTypeExpression15.equals((java.lang.Object) jSTypeExpression40);
        com.google.javascript.rhino.Node node43 = jSTypeExpression40.getRoot();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression15 and jSTypeExpression39", jSTypeExpression15.equals(jSTypeExpression39) ? jSTypeExpression15.hashCode() == jSTypeExpression39.hashCode() : true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        java.lang.String[] strArray2 = new java.lang.String[] { "OR [jsdoc_info: JSDocInfo]", "OR [jsdoc_info: JSDocInfo]" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(100);
        node6.addChildrenToFront(node8);
        boolean boolean10 = node6.isTypeOf();
        boolean boolean11 = node6.wasEmptyNode();
        int int12 = strList3.indexOf((java.lang.Object) boolean11);
        boolean boolean13 = strList3.isEmpty();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition14 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int15 = stringPosition14.getEndLine();
        java.lang.String str16 = stringPosition14.getItem();
        int int17 = stringPosition14.getEndLine();
        boolean boolean18 = strList3.equals((java.lang.Object) int17);
        java.util.Spliterator<java.lang.String> strSpliterator19 = strList3.spliterator();
        java.lang.String[] strArray33 = new java.lang.String[] { "Named type with empty name component", "unknown", "hi!", "Unknown class name", "JSDocInfo", "Unknown class name", "hi!", "", "Node tree inequality:\nTree1:\nOR 0 [jsdoc_info: JSDocInfo]\n\n\nTree2:\nOR\n    OR\n\n\nSubtree1: OR 0 [jsdoc_info: JSDocInfo]\n\n\nSubtree2: OR\n    OR\n", "Not declared as a type name", "OR", "unknown", "Not declared as a type name" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        java.lang.String[] strArray39 = new java.lang.String[] { "(Unknown class name)", "OR [jsdoc_info: JSDocInfo]\n", "OR [jsdoc_info: JSDocInfo]\n" };
        java.lang.Comparable<java.lang.String>[] strComparableArray40 = strSet34.toArray((java.lang.Comparable<java.lang.String>[]) strArray39);
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "NUMBER 4.0 1\n" };
        java.lang.String[] strArray57 = new java.lang.String[] { "Named type with empty name component", "unknown", "hi!", "Unknown class name", "JSDocInfo", "Unknown class name", "hi!", "", "Node tree inequality:\nTree1:\nOR 0 [jsdoc_info: JSDocInfo]\n\n\nTree2:\nOR\n    OR\n\n\nSubtree1: OR 0 [jsdoc_info: JSDocInfo]\n\n\nSubtree2: OR\n    OR\n", "Not declared as a type name", "OR", "unknown", "Not declared as a type name" };
        java.util.LinkedHashSet<java.lang.String> strSet58 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet58, strArray57);
        java.lang.String[] strArray63 = new java.lang.String[] { "(Unknown class name)", "OR [jsdoc_info: JSDocInfo]\n", "OR [jsdoc_info: JSDocInfo]\n" };
        java.lang.Comparable<java.lang.String>[] strComparableArray64 = strSet58.toArray((java.lang.Comparable<java.lang.String>[]) strArray63);
        java.lang.String[] strArray67 = new java.lang.String[] { "unknown", "Not declared as a type name" };
        java.lang.String[] strArray72 = new java.lang.String[] { "OR 0 [jsdoc_info: JSDocInfo]\n", "(Named type with empty name component)", "OR", "OR [jsdoc_info: JSDocInfo]\n    OR\n        OR\n" };
        com.google.common.collect.ImmutableList<java.lang.String[]> strArrayList73 = com.google.common.collect.ImmutableList.of(strArray39, strArray43, strArray63, strArray67, strArray72);
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList74 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>[]) strArray63);
        java.lang.String[] strArray75 = strList3.toArray(strArray63);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList76 = com.google.common.collect.ImmutableList.copyOf((java.lang.Comparable<java.lang.String>[]) strArray75);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100);
        node1.addChildrenToFront(node3);
        boolean boolean5 = node1.isTypeOf();
        boolean boolean6 = node1.wasEmptyNode();
        boolean boolean7 = node1.isLabelName();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable8 = node1.siblings();
        node1.putIntProp(0, 0);
        boolean boolean12 = node1.isHook();
        node1.setCharno((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node16 = node1.getChildAtIndex(15);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100);
        node1.addChildrenToFront(node3);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(100);
        node6.addChildrenToFront(node8);
        boolean boolean10 = node6.isNot();
        boolean boolean11 = node6.isIf();
        com.google.javascript.rhino.Node node12 = node3.copyInformationFromForTree(node6);
        boolean boolean13 = node12.isParamList();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression15 = new com.google.javascript.rhino.JSTypeExpression(node12, "OR [jsdoc_info: JSDocInfo]\n");
        node12.detachChildren();
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean18 = jSDocInfo17.hasBaseType();
        java.lang.String str19 = jSDocInfo17.getFileOverview();
        boolean boolean20 = jSDocInfo17.hasType();
        boolean boolean21 = jSDocInfo17.isImplicitCast();
        java.lang.String str22 = jSDocInfo17.getVersion();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(100);
        node24.addChildrenToFront(node26);
        int int28 = node24.getCharno();
        boolean boolean29 = node24.isName();
        boolean boolean30 = node24.isNE();
        boolean boolean31 = node24.isIn();
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(100);
        node33.addChildrenToFront(node35);
        com.google.javascript.rhino.Node node37 = node35.getParent();
        boolean boolean38 = node37.isDefaultCase();
        int int39 = node24.getIndexOfChild(node37);
        boolean boolean40 = node37.isLabelName();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable41 = node37.children();
        boolean boolean42 = node37.isAssignAdd();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(1, "((OR))", (int) (byte) 1, 10);
        boolean boolean48 = node47.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node49 = node37.srcref(node47);
        jSDocInfo17.setAssociatedNode(node47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node51 = node12.getChildBefore(node47);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100);
        node1.addChildrenToFront(node3);
        com.google.javascript.rhino.Node node5 = node3.getParent();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(100);
        node7.addChildrenToFront(node9);
        boolean boolean11 = node7.isTypeOf();
        com.google.javascript.rhino.jstype.JSType jSType12 = node7.getJSType();
        boolean boolean13 = node7.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node14 = node5.useSourceInfoIfMissingFromForTree(node7);
        com.google.javascript.rhino.jstype.JSType jSType15 = node5.getJSType();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(100);
        node17.addSuppression("");
        java.lang.String str20 = node17.toString();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(100);
        node22.addSuppression("");
        java.lang.String str25 = node22.toString();
        com.google.javascript.rhino.Node node26 = node22.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile27 = node22.getStaticSourceFile();
        com.google.javascript.rhino.Node node28 = node17.copyInformationFromForTree(node22);
        boolean boolean29 = node5.isEquivalentTo(node17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node31 = node5.getChildAtIndex(131072);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100);
        node1.addChildrenToFront(node3);
        boolean boolean5 = node3.isLabel();
        boolean boolean6 = node3.isContinue();
        com.google.javascript.rhino.Node node7 = node3.removeFirstChild();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(100);
        node9.addChildrenToFront(node11);
        int int13 = node9.getCharno();
        com.google.javascript.rhino.Node node14 = node3.useSourceInfoIfMissingFrom(node9);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(1, "unknown", (int) (byte) 10, 39);
        node19.setLength(1);
        com.google.javascript.rhino.Node node22 = node3.useSourceInfoFrom(node19);
        com.google.javascript.rhino.Node node23 = node3.detachFromParent();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(100);
        node25.addChildrenToFront(node27);
        boolean boolean29 = node25.isGetterDef();
        java.util.Set<java.lang.String> strSet30 = node25.getDirectives();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node(100);
        node32.addChildrenToFront(node34);
        boolean boolean36 = node32.isFalse();
        boolean boolean37 = node32.isParamList();
        com.google.javascript.rhino.Node node38 = node25.useSourceInfoIfMissingFrom(node32);
        java.util.Set<java.lang.String> strSet39 = node32.getDirectives();
        boolean boolean40 = node32.isOptionalArg();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(100);
        node42.addSuppression("");
        java.lang.String str45 = node42.toString();
        com.google.javascript.rhino.Node node46 = node42.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile47 = node42.getStaticSourceFile();
        boolean boolean48 = node42.isLocalResultCall();
        boolean boolean49 = node42.isArrayLit();
        boolean boolean50 = node42.isAssign();
        boolean boolean51 = node42.isUnscopedQualifiedName();
        node42.putBooleanProp(36, true);
        boolean boolean55 = node42.isFromExterns();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node23.replaceChild(node32, node42);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(15, "BITXOR 0");
        boolean boolean3 = node2.isFromExterns();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node5 = node2.getChildAtIndex(12);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(100, "NUMBER 1.0 37\n", 29, 4);
        int int6 = node4.getIntProp(100);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(30, "OR [synthetic: 1]");
        java.lang.String str10 = node9.getSourceFileName();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(1, "unknown", (int) (byte) 10, 39);
        int int17 = node16.getSideEffectFlags();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node(100);
        node19.addSuppression("");
        java.lang.String str22 = node19.toString();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(100);
        node24.addSuppression("");
        java.lang.String str27 = node24.toString();
        com.google.javascript.rhino.Node node28 = node24.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile29 = node24.getStaticSourceFile();
        com.google.javascript.rhino.Node node30 = node19.copyInformationFromForTree(node24);
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node(30, node16, node19, (int) '4', (int) (byte) 100);
        boolean boolean34 = node16.isParamList();
        com.google.javascript.rhino.Node node35 = node9.srcref(node16);
        boolean boolean36 = node16.isQualifiedName();
        com.google.javascript.rhino.Node node37 = node4.copyInformationFromForTree(node16);
        boolean boolean38 = node16.isObjectLit();
        boolean boolean39 = node16.isAssignAdd();
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(100);
        node41.addChildrenToFront(node43);
        com.google.javascript.rhino.Node node45 = node43.getParent();
        int int46 = node43.getLength();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(100);
        node48.addSuppression("");
        node43.addChildrenToFront(node48);
        com.google.javascript.rhino.JSDocInfo jSDocInfo52 = node43.getJSDocInfo();
        boolean boolean53 = node43.isName();
        node43.setWasEmptyNode(false);
        node43.setSourceEncodedPosition(38);
        boolean boolean58 = node43.isAssignAdd();
        boolean boolean59 = node43.isAssignAdd();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node16.removeChild(node43);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100);
        node1.addChildrenToFront(node3);
        int int5 = node1.getCharno();
        boolean boolean6 = node1.isName();
        boolean boolean7 = node1.isDefaultCase();
        boolean boolean8 = node1.isExprResult();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node10 = node1.getChildAtIndex(204841);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100);
        node1.addChildrenToFront(node3);
        boolean boolean5 = node3.isLabel();
        boolean boolean6 = node3.isContinue();
        com.google.javascript.rhino.Node node7 = node3.removeFirstChild();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(100);
        node9.addChildrenToFront(node11);
        int int13 = node9.getCharno();
        com.google.javascript.rhino.Node node14 = node3.useSourceInfoIfMissingFrom(node9);
        boolean boolean15 = node14.isLocalResultCall();
        java.lang.Object obj17 = node14.getProp(51);
        boolean boolean18 = node14.isWhile();
        boolean boolean19 = node14.isName();
        boolean boolean20 = node14.isInc();
        node14.setLineno((-1));
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node25 = node14.getChildBefore(node24);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100);
        node1.addChildrenToFront(node3);
        boolean boolean5 = node1.isNot();
        boolean boolean6 = node1.isDefaultCase();
        boolean boolean7 = node1.isEmpty();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(100);
        node9.addChildrenToFront(node11);
        int int13 = node9.getCharno();
        boolean boolean14 = node9.isName();
        boolean boolean15 = node9.isNE();
        boolean boolean16 = node9.isIn();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(100);
        node18.addChildrenToFront(node20);
        com.google.javascript.rhino.Node node22 = node20.getParent();
        boolean boolean23 = node22.isDefaultCase();
        int int24 = node9.getIndexOfChild(node22);
        boolean boolean25 = node22.isLabelName();
        boolean boolean26 = node1.isEquivalentTo(node22);
        boolean boolean27 = node22.isTypeOf();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(36, 52, (int) '4');
        boolean boolean32 = node31.isName();
        node31.setWasEmptyNode(true);
        com.google.javascript.rhino.Node node35 = node22.useSourceInfoIfMissingFrom(node31);
        boolean boolean36 = node22.isDefaultCase();
        boolean boolean37 = node22.isSetterDef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node39 = node22.getChildAtIndex(43);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100);
        node1.addChildrenToFront(node3);
        com.google.javascript.rhino.Node node5 = node3.getParent();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(100);
        node7.addChildrenToFront(node9);
        node7.putIntProp((int) (short) 0, 38);
        node3.addChildToBack(node7);
        boolean boolean15 = node7.isNE();
        int int16 = node7.getType();
        boolean boolean17 = node7.isOr();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node19 = node7.getChildAtIndex((int) ' ');
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(0, "(OR \n)", 41, (int) (short) -1);
        boolean boolean5 = node4.isArrayLit();
        boolean boolean6 = node4.isContinue();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(100);
        node8.addChildrenToFront(node10);
        boolean boolean12 = node8.isReturn();
        com.google.javascript.rhino.InputId inputId13 = node8.getInputId();
        boolean boolean14 = node8.isArrayLit();
        boolean boolean15 = node8.isInc();
        boolean boolean16 = node8.isAssign();
        boolean boolean17 = node8.isWith();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.removeChild(node8);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber(1.0d);
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(100);
        node4.addChildrenToFront(node6);
        com.google.javascript.rhino.Node node8 = node6.getParent();
        boolean boolean9 = node8.isDefaultCase();
        boolean boolean10 = node8.isNoSideEffectsCall();
        boolean boolean11 = node8.isNew();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) 36);
        boolean boolean14 = node13.isString();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(43, node8, node13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node15);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100);
        node1.addChildrenToFront(node3);
        boolean boolean5 = node1.isNot();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node8 = node1.copyInformationFromForTree(node7);
        boolean boolean9 = node8.isExprResult();
        boolean boolean10 = node8.isDefaultCase();
        com.google.javascript.rhino.Node node11 = node8.getNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node13 = node8.getChildAtIndex(51);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100);
        node1.addChildrenToFront(node3);
        com.google.javascript.rhino.Node node5 = node3.getParent();
        boolean boolean6 = node3.isHook();
        boolean boolean7 = node3.isString();
        node3.setOptionalArg(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node11 = node3.getChildAtIndex(3);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        boolean boolean2 = node1.isParamList();
        boolean boolean3 = node1.isStringKey();
        boolean boolean4 = node1.isExprResult();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node6 = node1.getChildAtIndex((int) (short) 100);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isExport();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList2 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean4 = jSDocInfo0.hasParameterType("OR");
        com.google.common.collect.ImmutableList<java.lang.String> strList5 = jSDocInfo0.getTemplateTypeNames();
        java.lang.String[] strArray12 = new java.lang.String[] { "Named type with empty name component", "unknown", "Not declared as a type name", "(Unknown class name)", "Unknown class name", "JSDocInfo" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        java.lang.Object[] objArray15 = strSet13.toArray();
        strSet13.clear();
        boolean boolean17 = strList5.containsAll((java.util.Collection<java.lang.String>) strSet13);
        com.google.common.collect.ImmutableList<java.lang.String> strList18 = strList5.reverse();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags20 = new com.google.javascript.rhino.Node.SideEffectFlags(35);
        sideEffectFlags20.setReturnsTainted();
        sideEffectFlags20.setMutatesGlobalState();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags24 = new com.google.javascript.rhino.Node.SideEffectFlags(35);
        sideEffectFlags24.setMutatesArguments();
        sideEffectFlags24.setMutatesArguments();
        sideEffectFlags24.setMutatesGlobalState();
        sideEffectFlags24.setMutatesThis();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags29 = new com.google.javascript.rhino.Node.SideEffectFlags();
        sideEffectFlags29.setMutatesGlobalState();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags32 = new com.google.javascript.rhino.Node.SideEffectFlags((int) (byte) 1);
        com.google.javascript.rhino.Node.SideEffectFlags[] sideEffectFlagsArray33 = new com.google.javascript.rhino.Node.SideEffectFlags[] { sideEffectFlags20, sideEffectFlags24, sideEffectFlags29, sideEffectFlags32 };
        com.google.javascript.rhino.Node.SideEffectFlags[] sideEffectFlagsArray34 = strList5.toArray(sideEffectFlagsArray33);
        com.google.javascript.rhino.JSDocInfo jSDocInfo35 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean36 = jSDocInfo35.isExport();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList37 = jSDocInfo35.getImplementedInterfaces();
        boolean boolean39 = jSDocInfo35.hasParameterType("OR");
        com.google.common.collect.ImmutableList<java.lang.String> strList40 = jSDocInfo35.getTemplateTypeNames();
        java.lang.String[] strArray47 = new java.lang.String[] { "Named type with empty name component", "unknown", "Not declared as a type name", "(Unknown class name)", "Unknown class name", "JSDocInfo" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        java.lang.Object[] objArray50 = strSet48.toArray();
        strSet48.clear();
        boolean boolean52 = strList40.containsAll((java.util.Collection<java.lang.String>) strSet48);
        com.google.common.collect.ImmutableList<java.lang.String> strList53 = strList40.reverse();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags55 = new com.google.javascript.rhino.Node.SideEffectFlags(35);
        sideEffectFlags55.setReturnsTainted();
        sideEffectFlags55.setMutatesGlobalState();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags59 = new com.google.javascript.rhino.Node.SideEffectFlags(35);
        sideEffectFlags59.setMutatesArguments();
        sideEffectFlags59.setMutatesArguments();
        sideEffectFlags59.setMutatesGlobalState();
        sideEffectFlags59.setMutatesThis();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags64 = new com.google.javascript.rhino.Node.SideEffectFlags();
        sideEffectFlags64.setMutatesGlobalState();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags67 = new com.google.javascript.rhino.Node.SideEffectFlags((int) (byte) 1);
        com.google.javascript.rhino.Node.SideEffectFlags[] sideEffectFlagsArray68 = new com.google.javascript.rhino.Node.SideEffectFlags[] { sideEffectFlags55, sideEffectFlags59, sideEffectFlags64, sideEffectFlags67 };
        com.google.javascript.rhino.Node.SideEffectFlags[] sideEffectFlagsArray69 = strList40.toArray(sideEffectFlagsArray68);
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags71 = new com.google.javascript.rhino.Node.SideEffectFlags(35);
        sideEffectFlags71.setReturnsTainted();
        sideEffectFlags71.setMutatesGlobalState();
        int int74 = sideEffectFlags71.valueOf();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags75 = new com.google.javascript.rhino.Node.SideEffectFlags();
        int int76 = sideEffectFlags75.valueOf();
        sideEffectFlags75.clearSideEffectFlags();
        sideEffectFlags75.setThrows();
        sideEffectFlags75.setMutatesArguments();
        boolean boolean80 = sideEffectFlags75.areAllFlagsSet();
        sideEffectFlags75.clearAllFlags();
        com.google.javascript.rhino.Node.SideEffectFlags[] sideEffectFlagsArray82 = new com.google.javascript.rhino.Node.SideEffectFlags[] { sideEffectFlags71, sideEffectFlags75 };
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.Node.SideEffectFlags[]> sideEffectFlagsArrayList83 = com.google.common.collect.ImmutableList.of(sideEffectFlagsArray33, sideEffectFlagsArray69, sideEffectFlagsArray82);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.Node.SideEffectFlags> sideEffectFlagsList84 = com.google.common.collect.ImmutableList.copyOf(sideEffectFlagsArray69);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        java.lang.String[] strArray6 = new java.lang.String[] { "Named type with empty name component", "unknown", "Not declared as a type name", "(Unknown class name)", "Unknown class name", "JSDocInfo" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        java.lang.Object[] objArray9 = strSet7.toArray();
        strSet7.clear();
        java.lang.Object[] objArray11 = strSet7.toArray();
        int int12 = strSet7.size();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean14 = jSDocInfo13.hasBaseType();
        jSDocInfo13.setLicense("Node tree inequality:\nTree1:\nOR 0 [jsdoc_info: JSDocInfo]\n\n\nTree2:\nOR\n    OR\n\n\nSubtree1: OR 0 [jsdoc_info: JSDocInfo]\n\n\nSubtree2: OR\n    OR\n");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList17 = jSDocInfo13.getThrownTypes();
        int int18 = jSDocInfo13.getParameterCount();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection19 = jSDocInfo13.getTypeNodes();
        com.google.common.collect.ImmutableList<java.lang.String> strList20 = jSDocInfo13.getTemplateTypeNames();
        java.util.Iterator<java.lang.String> strItor21 = strList20.iterator();
        com.google.common.collect.ImmutableList<java.lang.String> strList28 = com.google.common.collect.ImmutableList.of("", "", "hi!", "OR [jsdoc_info: JSDocInfo]", "", "OR [jsdoc_info: JSDocInfo]");
        com.google.common.collect.ImmutableList<java.lang.String> strList35 = com.google.common.collect.ImmutableList.of("", "", "hi!", "OR [jsdoc_info: JSDocInfo]", "", "OR [jsdoc_info: JSDocInfo]");
        boolean boolean36 = strList28.containsAll((java.util.Collection<java.lang.String>) strList35);
        com.google.common.collect.UnmodifiableListIterator<java.lang.String> strItor37 = strList28.listIterator();
        int int38 = strList28.size();
        boolean boolean39 = strList28.isEmpty();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility40 = com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC;
        int int41 = strList28.lastIndexOf((java.lang.Object) visibility40);
        java.util.stream.Stream<java.lang.String> strStream42 = strList28.parallelStream();
        java.util.Iterator<java.lang.String> strItor43 = strList28.iterator();
        int int44 = strList28.size();
        com.google.common.collect.ImmutableList<java.lang.String> strList45 = strList28.asList();
        com.google.common.collect.UnmodifiableListIterator<java.lang.String> strItor46 = strList45.listIterator();
        com.google.common.collect.UnmodifiableListIterator[] unmodifiableListIteratorArray48 = new com.google.common.collect.UnmodifiableListIterator[1];
        @SuppressWarnings("unchecked")
        com.google.common.collect.UnmodifiableListIterator<java.lang.String>[] strItorArray49 = (com.google.common.collect.UnmodifiableListIterator<java.lang.String>[]) unmodifiableListIteratorArray48;
        strItorArray49[0] = strItor46;
        com.google.common.collect.ImmutableList<com.google.common.collect.UnmodifiableListIterator<java.lang.String>> strItorList52 = com.google.common.collect.ImmutableList.copyOf(strItorArray49);
        com.google.common.collect.ImmutableList<com.google.common.collect.UnmodifiableIterator<java.lang.String>> strItorList53 = com.google.common.collect.ImmutableList.of((com.google.common.collect.UnmodifiableIterator<java.lang.String>[]) strItorArray49);
        com.google.common.collect.UnmodifiableIterator<java.lang.String>[] strItorArray54 = strList20.toArray((com.google.common.collect.UnmodifiableIterator<java.lang.String>[]) strItorArray49);
        java.util.ListIterator<java.lang.String>[] strItorArray55 = strSet7.toArray((java.util.ListIterator<java.lang.String>[]) strItorArray49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.common.collect.ImmutableList<com.google.common.collect.UnmodifiableListIterator<java.lang.String>> strItorList56 = com.google.common.collect.ImmutableList.copyOf(strItorArray49);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100);
        node1.addChildrenToFront(node3);
        boolean boolean5 = node1.isNot();
        boolean boolean6 = node1.isIf();
        boolean boolean7 = node1.isNoSideEffectsCall();
        int int8 = node1.getType();
        boolean boolean9 = node1.isAssign();
        node1.setLineno((int) (short) 1);
        boolean boolean12 = node1.hasOneChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node14 = node1.getChildAtIndex(24613);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoShadow();
        boolean boolean2 = jSDocInfo0.isNoShadow();
        boolean boolean3 = jSDocInfo0.hasModifies();
        boolean boolean4 = jSDocInfo0.isOverride();
        java.util.Collection<java.lang.String> strCollection5 = jSDocInfo0.getAuthors();
        java.lang.String str6 = jSDocInfo0.getBlockDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getParameterType("JSDocInfo");
        java.util.Set<java.lang.String> strSet9 = jSDocInfo0.getModifies();
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.JSType.TypePair> typePairBuilder10 = new com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.JSType.TypePair>();
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.TernaryValue[]> ternaryValueArrayBuilder11 = com.google.common.collect.ImmutableList.builder();
        com.google.common.collect.ImmutableList.Builder[] builderArray12 = new com.google.common.collect.ImmutableList.Builder[] { typePairBuilder10, ternaryValueArrayBuilder11 };
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.JSType.TypePair> typePairBuilder13 = new com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.JSType.TypePair>();
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.TernaryValue[]> ternaryValueArrayBuilder14 = com.google.common.collect.ImmutableList.builder();
        com.google.common.collect.ImmutableList.Builder[] builderArray15 = new com.google.common.collect.ImmutableList.Builder[] { typePairBuilder13, ternaryValueArrayBuilder14 };
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.JSType.TypePair> typePairBuilder16 = new com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.JSType.TypePair>();
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.TernaryValue[]> ternaryValueArrayBuilder17 = com.google.common.collect.ImmutableList.builder();
        com.google.common.collect.ImmutableList.Builder[] builderArray18 = new com.google.common.collect.ImmutableList.Builder[] { typePairBuilder16, ternaryValueArrayBuilder17 };
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.JSType.TypePair> typePairBuilder19 = new com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.JSType.TypePair>();
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.TernaryValue[]> ternaryValueArrayBuilder20 = com.google.common.collect.ImmutableList.builder();
        com.google.common.collect.ImmutableList.Builder[] builderArray21 = new com.google.common.collect.ImmutableList.Builder[] { typePairBuilder19, ternaryValueArrayBuilder20 };
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.JSType.TypePair> typePairBuilder22 = new com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.JSType.TypePair>();
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.TernaryValue[]> ternaryValueArrayBuilder23 = com.google.common.collect.ImmutableList.builder();
        com.google.common.collect.ImmutableList.Builder[] builderArray24 = new com.google.common.collect.ImmutableList.Builder[] { typePairBuilder22, ternaryValueArrayBuilder23 };
        com.google.common.collect.ImmutableList.Builder[][] builderArray25 = new com.google.common.collect.ImmutableList.Builder[][] { builderArray12, builderArray15, builderArray18, builderArray21, builderArray24 };
        com.google.common.collect.ImmutableList.Builder[][] builderArray26 = strSet9.toArray(builderArray25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList.Builder[]> builderArrayList27 = com.google.common.collect.ImmutableList.of(builderArray25);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100);
        node1.addChildrenToFront(node3);
        com.google.javascript.rhino.Node node5 = node3.getParent();
        node3.setIsSyntheticBlock(true);
        boolean boolean8 = node3.isContinue();
        boolean boolean9 = node3.isParamList();
        node3.setSourceEncodedPositionForTree(54);
        int int12 = node3.getType();
        boolean boolean13 = node3.isNot();
        boolean boolean14 = node3.isIf();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(100);
        node16.addChildrenToFront(node18);
        boolean boolean20 = node16.isNot();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node23 = node16.copyInformationFromForTree(node22);
        com.google.javascript.rhino.InputId inputId24 = node16.getInputId();
        com.google.javascript.rhino.Node node25 = node16.getNext();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression27 = new com.google.javascript.rhino.JSTypeExpression(node16, "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node16);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 51, (int) '#', 0);
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) (short) 10);
        boolean boolean6 = node5.isOptionalArg();
        com.google.javascript.rhino.Node node7 = node5.getLastSibling();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(6, (int) (short) 10, 50);
        boolean boolean12 = node11.isDelProp();
        boolean boolean13 = node11.isNE();
        com.google.javascript.rhino.Node node14 = node5.copyInformationFrom(node11);
        com.google.javascript.rhino.Node node15 = node3.useSourceInfoFrom(node11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node17 = node15.getChildAtIndex(3);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        java.lang.String[] strArray13 = new java.lang.String[] { "Named type with empty name component", "unknown", "hi!", "Unknown class name", "JSDocInfo", "Unknown class name", "hi!", "", "Node tree inequality:\nTree1:\nOR 0 [jsdoc_info: JSDocInfo]\n\n\nTree2:\nOR\n    OR\n\n\nSubtree1: OR 0 [jsdoc_info: JSDocInfo]\n\n\nSubtree2: OR\n    OR\n", "Not declared as a type name", "OR", "unknown", "Not declared as a type name" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        java.lang.String[] strArray19 = new java.lang.String[] { "(Unknown class name)", "OR [jsdoc_info: JSDocInfo]\n", "OR [jsdoc_info: JSDocInfo]\n" };
        java.lang.Comparable<java.lang.String>[] strComparableArray20 = strSet14.toArray((java.lang.Comparable<java.lang.String>[]) strArray19);
        strSet14.clear();
        com.google.common.collect.ImmutableList<java.lang.String> strList28 = com.google.common.collect.ImmutableList.of("", "", "hi!", "OR [jsdoc_info: JSDocInfo]", "", "OR [jsdoc_info: JSDocInfo]");
        com.google.common.collect.ImmutableList<java.lang.String> strList35 = com.google.common.collect.ImmutableList.of("", "", "hi!", "OR [jsdoc_info: JSDocInfo]", "", "OR [jsdoc_info: JSDocInfo]");
        boolean boolean36 = strList28.containsAll((java.util.Collection<java.lang.String>) strList35);
        java.util.Spliterator<java.lang.String> strSpliterator37 = strList28.spliterator();
        com.google.common.collect.ImmutableList<java.lang.String> strList38 = strList28.asList();
        com.google.common.collect.ImmutableList<java.lang.String> strList42 = com.google.common.collect.ImmutableList.of("OR", "[, , hi!, OR [jsdoc_info: JSDocInfo], , OR [jsdoc_info: JSDocInfo]]", "[, , hi!, OR [jsdoc_info: JSDocInfo], , OR [jsdoc_info: JSDocInfo]]");
        boolean boolean43 = strList38.containsAll((java.util.Collection<java.lang.String>) strList42);
        java.util.Iterator<java.lang.String> strItor44 = strList38.iterator();
        java.lang.Object[] objArray45 = strList38.toArray();
        boolean boolean46 = strSet14.containsAll((java.util.Collection<java.lang.String>) strList38);
        com.google.javascript.rhino.jstype.BooleanLiteralSet[][] booleanLiteralSetArray47 = new com.google.javascript.rhino.jstype.BooleanLiteralSet[][] {};
        com.google.javascript.rhino.jstype.BooleanLiteralSet[][] booleanLiteralSetArray48 = new com.google.javascript.rhino.jstype.BooleanLiteralSet[][] {};
        com.google.javascript.rhino.jstype.BooleanLiteralSet[][] booleanLiteralSetArray49 = new com.google.javascript.rhino.jstype.BooleanLiteralSet[][] {};
        com.google.javascript.rhino.jstype.BooleanLiteralSet[][] booleanLiteralSetArray50 = new com.google.javascript.rhino.jstype.BooleanLiteralSet[][] {};
        com.google.javascript.rhino.jstype.BooleanLiteralSet[][] booleanLiteralSetArray51 = new com.google.javascript.rhino.jstype.BooleanLiteralSet[][] {};
        com.google.javascript.rhino.jstype.BooleanLiteralSet[][][] booleanLiteralSetArray52 = new com.google.javascript.rhino.jstype.BooleanLiteralSet[][][] { booleanLiteralSetArray47, booleanLiteralSetArray48, booleanLiteralSetArray49, booleanLiteralSetArray50, booleanLiteralSetArray51 };
        com.google.javascript.rhino.jstype.BooleanLiteralSet[][][] booleanLiteralSetArray53 = strSet14.toArray(booleanLiteralSetArray52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.BooleanLiteralSet[][]> booleanLiteralSetArrayList54 = com.google.common.collect.ImmutableList.copyOf(booleanLiteralSetArray52);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getFileOverview();
        java.lang.String str2 = jSDocInfo0.getFileOverview();
        java.lang.String str3 = jSDocInfo0.getMeaning();
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(100);
        node5.addSuppression("");
        java.lang.String str8 = node5.toString();
        com.google.javascript.rhino.Node node9 = node5.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile10 = node5.getStaticSourceFile();
        boolean boolean11 = node5.isLocalResultCall();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(100);
        node13.addSuppression("");
        java.lang.String str16 = node13.toString();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(100);
        node18.addSuppression("");
        java.lang.String str21 = node18.toString();
        com.google.javascript.rhino.Node node22 = node18.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile23 = node18.getStaticSourceFile();
        com.google.javascript.rhino.Node node24 = node13.copyInformationFromForTree(node18);
        com.google.javascript.rhino.Node node25 = node5.useSourceInfoFrom(node18);
        jSDocInfo0.setAssociatedNode(node5);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable27 = node5.children();
        boolean boolean28 = node5.isAnd();
        boolean boolean29 = node5.isBlock();
        boolean boolean30 = node5.isVoid();
        node5.setWasEmptyNode(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node34 = node5.getChildAtIndex(32);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node2 = node1.cloneNode();
        boolean boolean4 = node1.getBooleanProp(4095);
        boolean boolean5 = node1.isNull();
        boolean boolean6 = node1.isComma();
        boolean boolean7 = node1.isAdd();
        com.google.javascript.rhino.JSDocInfo jSDocInfo8 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str9 = jSDocInfo8.getFileOverview();
        java.lang.String str10 = jSDocInfo8.getFileOverview();
        java.lang.String str11 = jSDocInfo8.getMeaning();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(100);
        node13.addSuppression("");
        java.lang.String str16 = node13.toString();
        com.google.javascript.rhino.Node node17 = node13.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile18 = node13.getStaticSourceFile();
        boolean boolean19 = node13.isLocalResultCall();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(100);
        node21.addSuppression("");
        java.lang.String str24 = node21.toString();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(100);
        node26.addSuppression("");
        java.lang.String str29 = node26.toString();
        com.google.javascript.rhino.Node node30 = node26.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile31 = node26.getStaticSourceFile();
        com.google.javascript.rhino.Node node32 = node21.copyInformationFromForTree(node26);
        com.google.javascript.rhino.Node node33 = node13.useSourceInfoFrom(node26);
        jSDocInfo8.setAssociatedNode(node13);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable35 = node13.children();
        boolean boolean36 = node13.isAnd();
        boolean boolean37 = node13.isBlock();
        boolean boolean38 = node13.isSyntheticBlock();
        boolean boolean39 = node13.isLabel();
        boolean boolean40 = node13.isLabel();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node(100);
        node42.addChildrenToFront(node44);
        com.google.javascript.rhino.Node node46 = node44.getParent();
        boolean boolean47 = node46.isDefaultCase();
        boolean boolean48 = node46.isNoSideEffectsCall();
        boolean boolean49 = node46.isNew();
        node46.setSourceEncodedPosition((int) (short) 100);
        boolean boolean52 = node46.isExprResult();
        boolean boolean53 = node46.isNE();
        java.lang.String str54 = node13.checkTreeEquals(node46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node13);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(36, 52, (int) '4');
        boolean boolean4 = node3.isName();
        node3.setWasEmptyNode(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node8 = node3.getChildAtIndex(2);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        com.google.common.collect.ImmutableList<java.lang.String> strList6 = com.google.common.collect.ImmutableList.of("", "", "hi!", "OR [jsdoc_info: JSDocInfo]", "", "OR [jsdoc_info: JSDocInfo]");
        java.lang.String[] strArray9 = new java.lang.String[] { "OR [jsdoc_info: JSDocInfo]", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        com.google.common.collect.ImmutableList<java.lang.String> strList18 = com.google.common.collect.ImmutableList.of("", "", "hi!", "OR [jsdoc_info: JSDocInfo]", "", "OR [jsdoc_info: JSDocInfo]");
        boolean boolean19 = strList10.equals((java.lang.Object) "OR [jsdoc_info: JSDocInfo]");
        boolean boolean20 = strList10.isEmpty();
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "OR [jsdoc_info: JSDocInfo]" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        boolean boolean30 = strList23.retainAll((java.util.Collection<java.lang.String>) strList28);
        com.google.common.collect.ImmutableList<java.lang.String> strList37 = com.google.common.collect.ImmutableList.of("", "", "hi!", "OR [jsdoc_info: JSDocInfo]", "", "OR [jsdoc_info: JSDocInfo]");
        com.google.common.collect.ImmutableList<java.lang.String> strList44 = com.google.common.collect.ImmutableList.of("", "", "hi!", "OR [jsdoc_info: JSDocInfo]", "", "OR [jsdoc_info: JSDocInfo]");
        boolean boolean45 = strList37.containsAll((java.util.Collection<java.lang.String>) strList44);
        java.lang.String[] strArray47 = new java.lang.String[] { "unknown" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "OR [jsdoc_info: JSDocInfo]" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        boolean boolean59 = strList52.retainAll((java.util.Collection<java.lang.String>) strList57);
        java.lang.String[] strArray61 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList62 = new java.util.ArrayList<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList62, strArray61);
        java.lang.String[] strArray66 = new java.lang.String[] { "hi!", "OR [jsdoc_info: JSDocInfo]" };
        java.util.ArrayList<java.lang.String> strList67 = new java.util.ArrayList<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList67, strArray66);
        boolean boolean69 = strList62.retainAll((java.util.Collection<java.lang.String>) strList67);
        com.google.common.collect.ImmutableList<java.util.List<java.lang.String>> strListList70 = com.google.common.collect.ImmutableList.of((java.util.List<java.lang.String>) strList6, (java.util.List<java.lang.String>) strList10, (java.util.List<java.lang.String>) strList28, (java.util.List<java.lang.String>) strList37, (java.util.List<java.lang.String>) strList48, (java.util.List<java.lang.String>) strList52, (java.util.List<java.lang.String>) strList62);
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node(100);
        node72.addSuppression("");
        java.lang.String str75 = node72.toString();
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node(100);
        node77.addSuppression("");
        java.lang.String str80 = node77.toString();
        com.google.javascript.rhino.Node node81 = node77.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile82 = node77.getStaticSourceFile();
        com.google.javascript.rhino.Node node83 = node72.copyInformationFromForTree(node77);
        boolean boolean84 = strList28.remove((java.lang.Object) node83);
        node83.setType(16);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable87 = node83.getAncestors();
        com.google.javascript.rhino.Node node91 = com.google.javascript.rhino.Node.newNumber((double) 29, 4, (int) (byte) -1);
        boolean boolean92 = node91.isCatch();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node83.removeChild(node91);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100);
        node1.addChildrenToFront(node3);
        com.google.javascript.rhino.Node node5 = node3.getParent();
        node3.setIsSyntheticBlock(true);
        boolean boolean8 = node3.isContinue();
        boolean boolean9 = node3.isParamList();
        boolean boolean10 = node3.isParamList();
        boolean boolean11 = node3.isOptionalArg();
        boolean boolean12 = node3.isAssign();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(43, "NUMBER 4.0 1\n");
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node(100);
        node17.addChildrenToFront(node19);
        boolean boolean21 = node19.isLabel();
        boolean boolean22 = node19.isContinue();
        node19.setVarArgs(false);
        boolean boolean25 = node19.isVoid();
        com.google.javascript.rhino.Node node26 = node15.copyInformationFrom(node19);
        node19.setWasEmptyNode(true);
        boolean boolean29 = node19.isNot();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node(100);
        node31.addChildrenToFront(node33);
        boolean boolean35 = node31.isNot();
        boolean boolean36 = node31.isDefaultCase();
        boolean boolean37 = node31.isWhile();
        boolean boolean38 = node31.isReturn();
        boolean boolean39 = node31.isObjectLit();
        com.google.javascript.rhino.Node node40 = node19.useSourceInfoIfMissingFromForTree(node31);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber(1.0d);
        boolean boolean43 = node42.isLabelName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.replaceChild(node31, node42);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoShadow();
        boolean boolean2 = jSDocInfo0.isNoShadow();
        boolean boolean3 = jSDocInfo0.isIdGenerator();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility4 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility5 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility6 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.Visibility> visibilityList7 = com.google.common.collect.ImmutableList.of(visibility4, visibility5, visibility6);
        jSDocInfo0.setVisibility(visibility6);
        boolean boolean9 = jSDocInfo0.containsDeclaration();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility10 = jSDocInfo0.getVisibility();
        java.util.Set<java.lang.String> strSet11 = jSDocInfo0.getModifies();
        java.lang.String[] strArray13 = new java.lang.String[] { "OR [jsdoc_info: JSDocInfo]" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        boolean boolean16 = strList14.isEmpty();
        java.util.Iterator<java.lang.String> strItor17 = strList14.iterator();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue18 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        boolean boolean20 = ternaryValue18.toBoolean(false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue21 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        java.lang.String str22 = ternaryValue21.toString();
        boolean boolean24 = ternaryValue21.toBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue25 = ternaryValue18.and(ternaryValue21);
        boolean boolean26 = strList14.contains((java.lang.Object) ternaryValue18);
        strList14.clear();
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean29 = jSDocInfo28.isExport();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList30 = jSDocInfo28.getImplementedInterfaces();
        boolean boolean32 = jSDocInfo28.hasParameterType("OR");
        com.google.common.collect.ImmutableList<java.lang.String> strList33 = jSDocInfo28.getTemplateTypeNames();
        java.lang.String[] strArray40 = new java.lang.String[] { "Named type with empty name component", "unknown", "Not declared as a type name", "(Unknown class name)", "Unknown class name", "JSDocInfo" };
        java.util.LinkedHashSet<java.lang.String> strSet41 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet41, strArray40);
        java.lang.Object[] objArray43 = strSet41.toArray();
        strSet41.clear();
        boolean boolean45 = strList33.containsAll((java.util.Collection<java.lang.String>) strSet41);
        com.google.common.collect.ImmutableList<java.lang.String> strList46 = strList33.reverse();
        boolean boolean47 = strList14.removeAll((java.util.Collection<java.lang.String>) strList46);
        java.util.Iterator<java.lang.String> strItor48 = strList14.iterator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo49 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean50 = jSDocInfo49.hasBaseType();
        jSDocInfo49.setLicense("Node tree inequality:\nTree1:\nOR 0 [jsdoc_info: JSDocInfo]\n\n\nTree2:\nOR\n    OR\n\n\nSubtree1: OR 0 [jsdoc_info: JSDocInfo]\n\n\nSubtree2: OR\n    OR\n");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression53 = jSDocInfo49.getBaseType();
        boolean boolean54 = jSDocInfo49.containsDeclaration();
        com.google.common.collect.ImmutableList<java.lang.String> strList55 = jSDocInfo49.getTemplateTypeNames();
        boolean boolean56 = strList14.addAll((java.util.Collection<java.lang.String>) strList55);
        java.lang.String[] strArray59 = new java.lang.String[] { "STRING  32\n", "OR 6\n    OR\n" };
        java.lang.Comparable[][] comparableArray61 = new java.lang.Comparable[1][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray62 = (java.lang.Comparable<java.lang.String>[][]) comparableArray61;
        strComparableArray62[0] = strArray59;
        java.lang.String[] strArray67 = new java.lang.String[] { "STRING  32\n", "OR 6\n    OR\n" };
        java.lang.Comparable[][] comparableArray69 = new java.lang.Comparable[1][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray70 = (java.lang.Comparable<java.lang.String>[][]) comparableArray69;
        strComparableArray70[0] = strArray67;
        java.lang.String[] strArray75 = new java.lang.String[] { "STRING  32\n", "OR 6\n    OR\n" };
        java.lang.Comparable[][] comparableArray77 = new java.lang.Comparable[1][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray78 = (java.lang.Comparable<java.lang.String>[][]) comparableArray77;
        strComparableArray78[0] = strArray75;
        java.lang.Comparable[][][] comparableArray82 = new java.lang.Comparable[3][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray83 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray82;
        strComparableArray83[0] = strComparableArray62;
        strComparableArray83[1] = strComparableArray70;
        strComparableArray83[2] = strComparableArray78;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray90 = strList55.toArray(strComparableArray83);
        java.io.Serializable[][] serializableArray91 = strSet11.toArray((java.io.Serializable[][]) strComparableArray90);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>[][]> strComparableArrayList92 = com.google.common.collect.ImmutableList.copyOf(strComparableArray90);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        node1.addSuppression("");
        java.lang.String str4 = node1.toString();
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(100);
        node6.addSuppression("");
        java.lang.String str9 = node6.toString();
        com.google.javascript.rhino.Node node10 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile11 = node6.getStaticSourceFile();
        com.google.javascript.rhino.Node node12 = node1.copyInformationFromForTree(node6);
        node6.setOptionalArg(false);
        node6.setSourceEncodedPositionForTree((int) (short) -1);
        boolean boolean17 = node6.isExprResult();
        boolean boolean18 = node6.isParamList();
        boolean boolean19 = node6.isContinue();
        boolean boolean20 = node6.isOptionalArg();
        boolean boolean21 = node6.isOr();
        node6.setVarArgs(false);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(100);
        node25.addChildrenToFront(node27);
        com.google.javascript.rhino.Node node29 = node27.getParent();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node(100);
        node31.addChildrenToFront(node33);
        node31.putIntProp((int) (short) 0, 38);
        node27.addChildToBack(node31);
        boolean boolean39 = node31.isEmpty();
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(100);
        node41.addChildrenToFront(node43);
        boolean boolean45 = node41.isNot();
        boolean boolean46 = node41.isLocalResultCall();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(100);
        node48.addSuppression("");
        com.google.javascript.rhino.Node node51 = node41.copyInformationFromForTree(node48);
        com.google.javascript.rhino.Node node52 = node31.srcref(node48);
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(100);
        node54.addChildrenToFront(node56);
        boolean boolean58 = node54.isTypeOf();
        boolean boolean59 = node54.wasEmptyNode();
        boolean boolean60 = node54.isLabelName();
        node54.removeProp(49);
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node(100);
        node64.addChildrenToFront(node66);
        boolean boolean68 = node64.isNot();
        com.google.javascript.rhino.Node node70 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node71 = node64.copyInformationFromForTree(node70);
        com.google.javascript.rhino.InputId inputId72 = node64.getInputId();
        boolean boolean73 = node64.isIn();
        boolean boolean74 = node64.isContinue();
        com.google.javascript.rhino.Node node75 = node54.copyInformationFromForTree(node64);
        int int76 = node75.getSideEffectFlags();
        com.google.javascript.rhino.Node node77 = node75.getLastChild();
        com.google.javascript.rhino.Node node78 = node31.copyInformationFromForTree(node75);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node79 = node6.getChildBefore(node75);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("Node tree inequality:\nTree1:\nNUMBER 4.0 1\n\n\nTree2:\nOR 0 [incrdecr: 45]\n\n\nSubtree1: NUMBER 4.0 1\n\n\nSubtree2: OR 0 [incrdecr: 45]\n", (int) (byte) 10, 44);
        boolean boolean4 = node3.hasChildren();
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(100);
        node6.addSuppression("");
        java.lang.String str9 = node6.toString();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(100);
        node11.addChildrenToFront(node13);
        com.google.javascript.rhino.Node node15 = node13.getParent();
        com.google.javascript.rhino.Node node16 = node6.useSourceInfoFromForTree(node13);
        boolean boolean17 = node16.isArrayLit();
        node16.setSourceEncodedPositionForTree((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node20 = node3.getChildBefore(node16);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(12, "Unknown class name");
        boolean boolean3 = node2.isReturn();
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(100);
        node5.addSuppression("");
        java.lang.String str8 = node5.toString();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(100);
        node10.addChildrenToFront(node12);
        com.google.javascript.rhino.Node node14 = node12.getParent();
        com.google.javascript.rhino.Node node15 = node5.useSourceInfoFromForTree(node12);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node(100);
        node17.addChildrenToFront(node19);
        int int21 = node17.getCharno();
        boolean boolean22 = node17.isName();
        boolean boolean23 = node17.isNE();
        boolean boolean24 = node17.isIn();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(100);
        node26.addChildrenToFront(node28);
        com.google.javascript.rhino.Node node30 = node28.getParent();
        boolean boolean31 = node30.isDefaultCase();
        int int32 = node17.getIndexOfChild(node30);
        node17.setSourceEncodedPosition(4095);
        com.google.javascript.rhino.Node node35 = node15.useSourceInfoIfMissingFromForTree(node17);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(100);
        node38.addSuppression("");
        java.lang.String str41 = node38.toString();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(100);
        node43.addChildrenToFront(node45);
        com.google.javascript.rhino.Node node47 = node45.getParent();
        com.google.javascript.rhino.Node node48 = node38.useSourceInfoFromForTree(node45);
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(100);
        node50.addChildrenToFront(node52);
        int int54 = node50.getCharno();
        boolean boolean55 = node50.isName();
        boolean boolean56 = node50.isNE();
        boolean boolean57 = node50.isIn();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(100);
        node59.addChildrenToFront(node61);
        com.google.javascript.rhino.Node node63 = node61.getParent();
        boolean boolean64 = node63.isDefaultCase();
        int int65 = node50.getIndexOfChild(node63);
        node50.setSourceEncodedPosition(4095);
        com.google.javascript.rhino.Node node68 = node48.useSourceInfoIfMissingFromForTree(node50);
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newString("OR");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable71 = node70.siblings();
        int int72 = node70.getSourcePosition();
        boolean boolean73 = node70.isDefaultCase();
        com.google.javascript.rhino.Node node76 = new com.google.javascript.rhino.Node(47, node68, node70, 6, 37);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.replaceChild(node35, node76);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoShadow();
        boolean boolean2 = jSDocInfo0.isNoTypeCheck();
        jSDocInfo0.setLicense("OR 0 [jsdoc_info: JSDocInfo]\n");
        java.util.Set<java.lang.String> strSet5 = jSDocInfo0.getModifies();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean7 = jSDocInfo6.isNoShadow();
        java.lang.String str8 = jSDocInfo6.getMeaning();
        com.google.javascript.rhino.Node node9 = jSDocInfo6.getAssociatedNode();
        boolean boolean10 = jSDocInfo6.hasEnumParameterType();
        boolean boolean11 = strSet5.remove((java.lang.Object) boolean10);
        java.lang.String[] strArray17 = new java.lang.String[] { "OR \n", "Node tree inequality:\nTree1:\nOR 1\n    OR\n\n\nTree2:\nSTRING (NUMBER 1.0 37\n)\n\n\nSubtree1: OR 1\n    OR\n\n\nSubtree2: STRING (NUMBER 1.0 37\n)\n", "(Node tree inequality:\nTree1:\nSTRING  3\n\n\nTree2:\nSTRING OR\n\n\nSubtree1: STRING  3\n\n\nSubtree2: STRING OR\n)", "NUMBER -1.0\n", "OR 0" };
        java.lang.String[] strArray23 = new java.lang.String[] { "OR \n", "Node tree inequality:\nTree1:\nOR 1\n    OR\n\n\nTree2:\nSTRING (NUMBER 1.0 37\n)\n\n\nSubtree1: OR 1\n    OR\n\n\nSubtree2: STRING (NUMBER 1.0 37\n)\n", "(Node tree inequality:\nTree1:\nSTRING  3\n\n\nTree2:\nSTRING OR\n\n\nSubtree1: STRING  3\n\n\nSubtree2: STRING OR\n)", "NUMBER -1.0\n", "OR 0" };
        java.lang.String[] strArray29 = new java.lang.String[] { "OR \n", "Node tree inequality:\nTree1:\nOR 1\n    OR\n\n\nTree2:\nSTRING (NUMBER 1.0 37\n)\n\n\nSubtree1: OR 1\n    OR\n\n\nSubtree2: STRING (NUMBER 1.0 37\n)\n", "(Node tree inequality:\nTree1:\nSTRING  3\n\n\nTree2:\nSTRING OR\n\n\nSubtree1: STRING  3\n\n\nSubtree2: STRING OR\n)", "NUMBER -1.0\n", "OR 0" };
        java.lang.String[] strArray35 = new java.lang.String[] { "OR \n", "Node tree inequality:\nTree1:\nOR 1\n    OR\n\n\nTree2:\nSTRING (NUMBER 1.0 37\n)\n\n\nSubtree1: OR 1\n    OR\n\n\nSubtree2: STRING (NUMBER 1.0 37\n)\n", "(Node tree inequality:\nTree1:\nSTRING  3\n\n\nTree2:\nSTRING OR\n\n\nSubtree1: STRING  3\n\n\nSubtree2: STRING OR\n)", "NUMBER -1.0\n", "OR 0" };
        java.lang.String[] strArray41 = new java.lang.String[] { "OR \n", "Node tree inequality:\nTree1:\nOR 1\n    OR\n\n\nTree2:\nSTRING (NUMBER 1.0 37\n)\n\n\nSubtree1: OR 1\n    OR\n\n\nSubtree2: STRING (NUMBER 1.0 37\n)\n", "(Node tree inequality:\nTree1:\nSTRING  3\n\n\nTree2:\nSTRING OR\n\n\nSubtree1: STRING  3\n\n\nSubtree2: STRING OR\n)", "NUMBER -1.0\n", "OR 0" };
        java.lang.String[][] strArray42 = new java.lang.String[][] { strArray17, strArray23, strArray29, strArray35, strArray41 };
        com.google.common.collect.ImmutableList<java.lang.String[]> strArrayList43 = com.google.common.collect.ImmutableList.copyOf(strArray42);
        java.lang.Comparable<java.lang.String>[][] strComparableArray44 = strSet5.toArray((java.lang.Comparable<java.lang.String>[][]) strArray42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.common.collect.ImmutableList<java.lang.CharSequence[]> charSequenceArrayList45 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence[][]) strArray42);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        java.lang.String[] strArray2 = new java.lang.String[] { "OR [jsdoc_info: JSDocInfo]", "OR [jsdoc_info: JSDocInfo]" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(100);
        node6.addChildrenToFront(node8);
        boolean boolean10 = node6.isTypeOf();
        boolean boolean11 = node6.wasEmptyNode();
        int int12 = strList3.indexOf((java.lang.Object) boolean11);
        boolean boolean13 = strList3.isEmpty();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition14 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int15 = stringPosition14.getEndLine();
        java.lang.String str16 = stringPosition14.getItem();
        int int17 = stringPosition14.getEndLine();
        boolean boolean18 = strList3.equals((java.lang.Object) int17);
        java.util.Spliterator<java.lang.String> strSpliterator19 = strList3.spliterator();
        java.lang.String[] strArray33 = new java.lang.String[] { "Named type with empty name component", "unknown", "hi!", "Unknown class name", "JSDocInfo", "Unknown class name", "hi!", "", "Node tree inequality:\nTree1:\nOR 0 [jsdoc_info: JSDocInfo]\n\n\nTree2:\nOR\n    OR\n\n\nSubtree1: OR 0 [jsdoc_info: JSDocInfo]\n\n\nSubtree2: OR\n    OR\n", "Not declared as a type name", "OR", "unknown", "Not declared as a type name" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        java.lang.String[] strArray39 = new java.lang.String[] { "(Unknown class name)", "OR [jsdoc_info: JSDocInfo]\n", "OR [jsdoc_info: JSDocInfo]\n" };
        java.lang.Comparable<java.lang.String>[] strComparableArray40 = strSet34.toArray((java.lang.Comparable<java.lang.String>[]) strArray39);
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "NUMBER 4.0 1\n" };
        java.lang.String[] strArray57 = new java.lang.String[] { "Named type with empty name component", "unknown", "hi!", "Unknown class name", "JSDocInfo", "Unknown class name", "hi!", "", "Node tree inequality:\nTree1:\nOR 0 [jsdoc_info: JSDocInfo]\n\n\nTree2:\nOR\n    OR\n\n\nSubtree1: OR 0 [jsdoc_info: JSDocInfo]\n\n\nSubtree2: OR\n    OR\n", "Not declared as a type name", "OR", "unknown", "Not declared as a type name" };
        java.util.LinkedHashSet<java.lang.String> strSet58 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet58, strArray57);
        java.lang.String[] strArray63 = new java.lang.String[] { "(Unknown class name)", "OR [jsdoc_info: JSDocInfo]\n", "OR [jsdoc_info: JSDocInfo]\n" };
        java.lang.Comparable<java.lang.String>[] strComparableArray64 = strSet58.toArray((java.lang.Comparable<java.lang.String>[]) strArray63);
        java.lang.String[] strArray67 = new java.lang.String[] { "unknown", "Not declared as a type name" };
        java.lang.String[] strArray72 = new java.lang.String[] { "OR 0 [jsdoc_info: JSDocInfo]\n", "(Named type with empty name component)", "OR", "OR [jsdoc_info: JSDocInfo]\n    OR\n        OR\n" };
        com.google.common.collect.ImmutableList<java.lang.String[]> strArrayList73 = com.google.common.collect.ImmutableList.of(strArray39, strArray43, strArray63, strArray67, strArray72);
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList74 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>[]) strArray63);
        java.lang.String[] strArray75 = strList3.toArray(strArray63);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList76 = com.google.common.collect.ImmutableList.copyOf((java.lang.Comparable<java.lang.String>[]) strArray63);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100);
        node1.addChildrenToFront(node3);
        boolean boolean5 = node1.isReturn();
        com.google.javascript.rhino.InputId inputId6 = node1.getInputId();
        boolean boolean7 = node1.isAdd();
        boolean boolean8 = node1.isQuotedString();
        int int10 = node1.getIntProp((int) (byte) 1);
        boolean boolean11 = node1.isVarArgs();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(100);
        node13.addChildrenToFront(node15);
        boolean boolean17 = node13.isTypeOf();
        boolean boolean18 = node13.wasEmptyNode();
        boolean boolean19 = node1.isEquivalentTo(node13);
        com.google.javascript.rhino.Node node20 = node1.getNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node22 = node1.getChildAtIndex(409600);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(100);
        node2.addChildrenToFront(node4);
        boolean boolean6 = node2.isReturn();
        com.google.javascript.rhino.InputId inputId7 = node2.getInputId();
        boolean boolean8 = node2.isAdd();
        boolean boolean9 = node2.isQuotedString();
        int int11 = node2.getIntProp((int) (byte) 1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(100);
        node13.addChildrenToFront(node15);
        boolean boolean17 = node13.isNot();
        boolean boolean18 = node13.isLocalResultCall();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(100);
        node20.addSuppression("");
        com.google.javascript.rhino.Node node23 = node13.copyInformationFromForTree(node20);
        node13.setOptionalArg(true);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) (short) -1);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(100);
        node29.addSuppression("");
        java.lang.String str32 = node29.toString();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node(100);
        node34.addChildrenToFront(node36);
        com.google.javascript.rhino.Node node38 = node36.getParent();
        com.google.javascript.rhino.Node node39 = node29.useSourceInfoFromForTree(node36);
        boolean boolean40 = node39.isSetterDef();
        com.google.javascript.rhino.Node node41 = node39.getLastChild();
        boolean boolean42 = node39.isLocalResultCall();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(1, node2, node13, node27, node39);
        boolean boolean44 = node2.isInc();
        boolean boolean45 = node2.isVoid();
        com.google.javascript.rhino.Node node46 = node2.removeChildren();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(100);
        node48.addSuppression("");
        java.lang.String str51 = node48.toString();
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node(100);
        node53.addChildrenToFront(node55);
        com.google.javascript.rhino.Node node57 = node55.getParent();
        com.google.javascript.rhino.Node node58 = node48.useSourceInfoFromForTree(node55);
        boolean boolean59 = node58.isArrayLit();
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(100);
        node61.addSuppression("");
        java.lang.String str64 = node61.toString();
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node(100);
        node66.addSuppression("");
        java.lang.String str69 = node66.toString();
        com.google.javascript.rhino.Node node70 = node66.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile71 = node66.getStaticSourceFile();
        com.google.javascript.rhino.Node node72 = node61.copyInformationFromForTree(node66);
        java.lang.String str73 = node72.getSourceFileName();
        com.google.javascript.rhino.Node node74 = node58.copyInformationFromForTree(node72);
        node46.addChildrenToFront(node72);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node77 = node46.getChildAtIndex(52);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 4, (int) (byte) 1, 4);
        boolean boolean4 = node3.isRegExp();
        boolean boolean5 = node3.isName();
        boolean boolean6 = node3.isBreak();
        com.google.javascript.rhino.Node node7 = node3.cloneTree();
        boolean boolean8 = node3.isVar();
        node3.setCharno(9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(4, "OR [jsdoc_info: JSDocInfo] [length: 46]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node14 = node3.getChildBefore(node13);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("OR [jsdoc_info: JSDocInfo]", 4, (int) (byte) 10);
        boolean boolean4 = node3.isName();
        boolean boolean5 = node3.isDo();
        boolean boolean6 = node3.isAssignAdd();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node8 = node3.getChildAtIndex(40);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(49, "(OR 0\n)");
        java.util.Set<java.lang.String> strSet3 = node2.getDirectives();
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(100);
        node5.addSuppression("");
        java.lang.String str8 = node5.toString();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(100);
        node10.addChildrenToFront(node12);
        com.google.javascript.rhino.Node node14 = node12.getParent();
        com.google.javascript.rhino.Node node15 = node5.useSourceInfoFromForTree(node12);
        boolean boolean16 = node15.isGetElem();
        int int17 = node15.getCharno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.removeChild(node15);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100);
        node1.addChildrenToFront(node3);
        int int5 = node1.getCharno();
        boolean boolean6 = node1.isName();
        boolean boolean7 = node1.isNE();
        boolean boolean8 = node1.isIn();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(100);
        node10.addChildrenToFront(node12);
        com.google.javascript.rhino.Node node14 = node12.getParent();
        boolean boolean15 = node14.isDefaultCase();
        int int16 = node1.getIndexOfChild(node14);
        node1.setSourceEncodedPosition(4095);
        boolean boolean19 = node1.hasOneChild();
        node1.setWasEmptyNode(false);
        boolean boolean22 = node1.isCase();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node1.siblings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node25 = node1.getChildAtIndex(45);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(43, "NUMBER 4.0 1\n");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(100);
        node4.addChildrenToFront(node6);
        boolean boolean8 = node6.isLabel();
        boolean boolean9 = node6.isContinue();
        node6.setVarArgs(false);
        boolean boolean12 = node6.isVoid();
        com.google.javascript.rhino.Node node13 = node2.copyInformationFrom(node6);
        node6.setWasEmptyNode(true);
        int int16 = node6.getChildCount();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(1, "unknown", (int) (byte) 10, 39);
        int int22 = node21.getSideEffectFlags();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(100);
        node24.addChildrenToFront(node26);
        int int28 = node24.getCharno();
        boolean boolean29 = node24.isName();
        boolean boolean30 = node24.isNE();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression32 = new com.google.javascript.rhino.JSTypeExpression(node24, "Unknown class name");
        node21.addChildrenToFront(node24);
        java.lang.String str34 = node24.getSourceFileName();
        boolean boolean35 = node24.isBreak();
        boolean boolean36 = node24.isObjectLit();
        boolean boolean37 = node24.isRegExp();
        boolean boolean38 = node24.isBreak();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node6.removeChild(node24);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getFileOverview();
        com.google.common.collect.ImmutableList<java.lang.String> strList2 = jSDocInfo0.getTemplateTypeNames();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder[] fileLevelJsDocBuilderArray3 = new com.google.javascript.rhino.Node.FileLevelJsDocBuilder[] {};
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder[] fileLevelJsDocBuilderArray4 = new com.google.javascript.rhino.Node.FileLevelJsDocBuilder[] {};
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder[] fileLevelJsDocBuilderArray5 = new com.google.javascript.rhino.Node.FileLevelJsDocBuilder[] {};
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder[] fileLevelJsDocBuilderArray6 = new com.google.javascript.rhino.Node.FileLevelJsDocBuilder[] {};
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder[] fileLevelJsDocBuilderArray7 = new com.google.javascript.rhino.Node.FileLevelJsDocBuilder[] {};
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder[] fileLevelJsDocBuilderArray8 = new com.google.javascript.rhino.Node.FileLevelJsDocBuilder[] {};
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder[][] fileLevelJsDocBuilderArray9 = new com.google.javascript.rhino.Node.FileLevelJsDocBuilder[][] { fileLevelJsDocBuilderArray3, fileLevelJsDocBuilderArray4, fileLevelJsDocBuilderArray5, fileLevelJsDocBuilderArray6, fileLevelJsDocBuilderArray7, fileLevelJsDocBuilderArray8 };
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder[][] fileLevelJsDocBuilderArray10 = strList2.toArray(fileLevelJsDocBuilderArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.Node.FileLevelJsDocBuilder[]> fileLevelJsDocBuilderArrayList11 = com.google.common.collect.ImmutableList.of(fileLevelJsDocBuilderArray9);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100);
        node1.addChildrenToFront(node3);
        com.google.javascript.rhino.Node node5 = node3.getParent();
        boolean boolean6 = node3.isHook();
        com.google.javascript.rhino.Node node7 = node3.detachFromParent();
        boolean boolean8 = node7.isBreak();
        node7.setLength(59);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node12 = node7.getChildAtIndex(45);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(100);
        node2.addSuppression("");
        java.lang.String str5 = node2.toString();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(100);
        node7.addChildrenToFront(node9);
        com.google.javascript.rhino.Node node11 = node9.getParent();
        com.google.javascript.rhino.Node node12 = node2.useSourceInfoFromForTree(node9);
        boolean boolean13 = node12.isGetElem();
        boolean boolean14 = node12.isInstanceOf();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(1, node12, 29, 3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node19 = node12.getChildAtIndex(213028);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        java.lang.String[] strArray13 = new java.lang.String[] { "Named type with empty name component", "unknown", "hi!", "Unknown class name", "JSDocInfo", "Unknown class name", "hi!", "", "Node tree inequality:\nTree1:\nOR 0 [jsdoc_info: JSDocInfo]\n\n\nTree2:\nOR\n    OR\n\n\nSubtree1: OR 0 [jsdoc_info: JSDocInfo]\n\n\nSubtree2: OR\n    OR\n", "Not declared as a type name", "OR", "unknown", "Not declared as a type name" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        java.lang.String[] strArray19 = new java.lang.String[] { "(Unknown class name)", "OR [jsdoc_info: JSDocInfo]\n", "OR [jsdoc_info: JSDocInfo]\n" };
        java.lang.Comparable<java.lang.String>[] strComparableArray20 = strSet14.toArray((java.lang.Comparable<java.lang.String>[]) strArray19);
        strSet14.clear();
        com.google.common.collect.ImmutableList<java.lang.String> strList28 = com.google.common.collect.ImmutableList.of("", "", "hi!", "OR [jsdoc_info: JSDocInfo]", "", "OR [jsdoc_info: JSDocInfo]");
        com.google.common.collect.ImmutableList<java.lang.String> strList35 = com.google.common.collect.ImmutableList.of("", "", "hi!", "OR [jsdoc_info: JSDocInfo]", "", "OR [jsdoc_info: JSDocInfo]");
        boolean boolean36 = strList28.containsAll((java.util.Collection<java.lang.String>) strList35);
        java.util.Spliterator<java.lang.String> strSpliterator37 = strList28.spliterator();
        com.google.common.collect.ImmutableList<java.lang.String> strList38 = strList28.asList();
        com.google.common.collect.ImmutableList<java.lang.String> strList42 = com.google.common.collect.ImmutableList.of("OR", "[, , hi!, OR [jsdoc_info: JSDocInfo], , OR [jsdoc_info: JSDocInfo]]", "[, , hi!, OR [jsdoc_info: JSDocInfo], , OR [jsdoc_info: JSDocInfo]]");
        boolean boolean43 = strList38.containsAll((java.util.Collection<java.lang.String>) strList42);
        java.util.Iterator<java.lang.String> strItor44 = strList38.iterator();
        java.lang.Object[] objArray45 = strList38.toArray();
        boolean boolean46 = strSet14.containsAll((java.util.Collection<java.lang.String>) strList38);
        com.google.javascript.rhino.jstype.BooleanLiteralSet[][] booleanLiteralSetArray47 = new com.google.javascript.rhino.jstype.BooleanLiteralSet[][] {};
        com.google.javascript.rhino.jstype.BooleanLiteralSet[][] booleanLiteralSetArray48 = new com.google.javascript.rhino.jstype.BooleanLiteralSet[][] {};
        com.google.javascript.rhino.jstype.BooleanLiteralSet[][] booleanLiteralSetArray49 = new com.google.javascript.rhino.jstype.BooleanLiteralSet[][] {};
        com.google.javascript.rhino.jstype.BooleanLiteralSet[][] booleanLiteralSetArray50 = new com.google.javascript.rhino.jstype.BooleanLiteralSet[][] {};
        com.google.javascript.rhino.jstype.BooleanLiteralSet[][] booleanLiteralSetArray51 = new com.google.javascript.rhino.jstype.BooleanLiteralSet[][] {};
        com.google.javascript.rhino.jstype.BooleanLiteralSet[][][] booleanLiteralSetArray52 = new com.google.javascript.rhino.jstype.BooleanLiteralSet[][][] { booleanLiteralSetArray47, booleanLiteralSetArray48, booleanLiteralSetArray49, booleanLiteralSetArray50, booleanLiteralSetArray51 };
        com.google.javascript.rhino.jstype.BooleanLiteralSet[][][] booleanLiteralSetArray53 = strSet14.toArray(booleanLiteralSetArray52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.BooleanLiteralSet[][]> booleanLiteralSetArrayList54 = com.google.common.collect.ImmutableList.copyOf(booleanLiteralSetArray53);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        node1.addSuppression("");
        java.lang.String str4 = node1.toString();
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(100);
        node6.addSuppression("");
        java.lang.String str9 = node6.toString();
        com.google.javascript.rhino.Node node10 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile11 = node6.getStaticSourceFile();
        com.google.javascript.rhino.Node node12 = node1.copyInformationFromForTree(node6);
        boolean boolean13 = node1.isReturn();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression15 = new com.google.javascript.rhino.JSTypeExpression(node1, "");
        boolean boolean16 = node1.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(100);
        node18.addChildrenToFront(node20);
        com.google.javascript.rhino.Node node22 = node20.getParent();
        boolean boolean23 = node22.isDefaultCase();
        boolean boolean24 = node22.isNoSideEffectsCall();
        java.lang.String str28 = node22.toString(false, false, false);
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean30 = jSDocInfo29.hasTypedefType();
        java.lang.String str31 = jSDocInfo29.toString();
        node22.setJSDocInfo(jSDocInfo29);
        com.google.javascript.rhino.Node node33 = node22.cloneTree();
        com.google.javascript.rhino.jstype.JSType jSType34 = node22.getJSType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node35 = node1.getChildBefore(node22);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) (short) 0, 100, 16);
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(100);
        node5.addSuppression("");
        java.lang.String str8 = node5.toString();
        com.google.javascript.rhino.Node node9 = node5.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile10 = node5.getStaticSourceFile();
        boolean boolean11 = node5.isLocalResultCall();
        boolean boolean12 = node5.isArrayLit();
        boolean boolean13 = node5.isAssign();
        boolean boolean14 = node5.isAssign();
        boolean boolean15 = node5.isIf();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node16 = node3.getChildBefore(node5);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100);
        node1.addChildrenToFront(node3);
        com.google.javascript.rhino.Node node5 = node3.getParent();
        node3.setIsSyntheticBlock(true);
        boolean boolean8 = node3.isContinue();
        boolean boolean9 = node3.isParamList();
        node3.setSourceEncodedPositionForTree(54);
        int int12 = node3.getType();
        node3.setSourceEncodedPositionForTree(40);
        node3.setLength(54);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(12, "OR [jsdoc_info: JSDocInfo]");
        com.google.javascript.rhino.Node node20 = node19.getLastSibling();
        boolean boolean21 = node20.isQualifiedName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node20);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100);
        node1.addChildrenToFront(node3);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable5 = node1.children();
        node1.putIntProp(8, (int) '4');
        boolean boolean9 = node1.isInstanceOf();
        boolean boolean10 = node1.isBreak();
        int int11 = node1.getLength();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node13 = node1.getChildAtIndex(2);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100);
        node1.addChildrenToFront(node3);
        boolean boolean5 = node1.isNot();
        boolean boolean6 = node1.isDefaultCase();
        boolean boolean7 = node1.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo8 = node1.getJSDocInfo();
        boolean boolean9 = node1.isScript();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node11 = node1.getChildAtIndex(52);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        node1.addSuppression("");
        java.lang.String str4 = node1.toString();
        com.google.javascript.rhino.Node node5 = node1.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = node1.getStaticSourceFile();
        boolean boolean7 = node1.isLocalResultCall();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(100);
        node9.addSuppression("");
        java.lang.String str12 = node9.toString();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(100);
        node14.addSuppression("");
        java.lang.String str17 = node14.toString();
        com.google.javascript.rhino.Node node18 = node14.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile19 = node14.getStaticSourceFile();
        com.google.javascript.rhino.Node node20 = node9.copyInformationFromForTree(node14);
        com.google.javascript.rhino.Node node21 = node1.useSourceInfoFrom(node14);
        node21.detachChildren();
        boolean boolean23 = node21.isSyntheticBlock();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(100);
        node25.addChildrenToFront(node27);
        com.google.javascript.rhino.Node node29 = node27.getParent();
        node27.setIsSyntheticBlock(true);
        boolean boolean32 = node27.isContinue();
        java.lang.String str33 = node27.getQualifiedName();
        boolean boolean34 = node27.isSwitch();
        node27.removeProp((int) '4');
        boolean boolean37 = node27.isParamList();
        boolean boolean38 = node27.isSwitch();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node39 = node21.getChildBefore(node27);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("OR");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable2 = node1.siblings();
        int int3 = node1.getSourcePosition();
        java.util.Set<java.lang.String> strSet4 = node1.getDirectives();
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(100);
        node6.addChildrenToFront(node8);
        com.google.javascript.rhino.Node node10 = node8.getParent();
        int int11 = node8.getLength();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(100);
        node13.addSuppression("");
        node8.addChildrenToFront(node13);
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = node8.getJSDocInfo();
        boolean boolean18 = node8.isName();
        node8.setWasEmptyNode(false);
        int int21 = node8.getSideEffectFlags();
        node8.setSourceEncodedPosition(4);
        com.google.javascript.rhino.Node node24 = node8.removeFirstChild();
        node8.setType((int) '4');
        com.google.javascript.rhino.Node node27 = node1.copyInformationFrom(node8);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString(30, "OR [synthetic: 1]");
        java.lang.String str31 = node30.getSourceFileName();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString(1, "unknown", (int) (byte) 10, 39);
        int int38 = node37.getSideEffectFlags();
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(100);
        node40.addSuppression("");
        java.lang.String str43 = node40.toString();
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(100);
        node45.addSuppression("");
        java.lang.String str48 = node45.toString();
        com.google.javascript.rhino.Node node49 = node45.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile50 = node45.getStaticSourceFile();
        com.google.javascript.rhino.Node node51 = node40.copyInformationFromForTree(node45);
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node(30, node37, node40, (int) '4', (int) (byte) 100);
        boolean boolean55 = node37.isParamList();
        com.google.javascript.rhino.Node node56 = node30.srcref(node37);
        com.google.javascript.rhino.Node node57 = node27.copyInformationFromForTree(node30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node59 = node57.getChildAtIndex(7);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.Node[]> nodeArrayBuilder1 = new com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.Node[]>();
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100);
        node3.addSuppression("");
        java.lang.String str6 = node3.toString();
        com.google.javascript.rhino.Node node7 = node3.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile8 = node3.getStaticSourceFile();
        com.google.javascript.rhino.Node[] nodeArray9 = new com.google.javascript.rhino.Node[] { node3 };
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(100);
        node11.addSuppression("");
        java.lang.String str14 = node11.toString();
        com.google.javascript.rhino.Node node15 = node11.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile16 = node11.getStaticSourceFile();
        com.google.javascript.rhino.Node[] nodeArray17 = new com.google.javascript.rhino.Node[] { node11 };
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node(100);
        node19.addSuppression("");
        java.lang.String str22 = node19.toString();
        com.google.javascript.rhino.Node node23 = node19.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile24 = node19.getStaticSourceFile();
        com.google.javascript.rhino.Node[] nodeArray25 = new com.google.javascript.rhino.Node[] { node19 };
        com.google.javascript.rhino.Node[][] nodeArray26 = new com.google.javascript.rhino.Node[][] { nodeArray9, nodeArray17, nodeArray25 };
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.Node[]> nodeArrayBuilder27 = nodeArrayBuilder1.add(nodeArray26);
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.Node[]> nodeArrayBuilder28 = new com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.Node[]>();
        com.google.javascript.rhino.Node[] nodeArray29 = new com.google.javascript.rhino.Node[] {};
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.Node[]> nodeArrayBuilder30 = nodeArrayBuilder28.add(nodeArray29);
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.Node[]> nodeArrayBuilder31 = nodeArrayBuilder27.add(nodeArray29);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(0, nodeArray29);
        boolean boolean33 = node32.isNE();
        boolean boolean34 = node32.isBreak();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) 45);
        com.google.javascript.rhino.Node node37 = node36.getNext();
        node32.addChildToBack(node36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node40 = node32.getChildAtIndex((int) (byte) 100);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        com.google.common.collect.ImmutableList<java.lang.String> strList6 = com.google.common.collect.ImmutableList.of("", "", "hi!", "OR [jsdoc_info: JSDocInfo]", "", "OR [jsdoc_info: JSDocInfo]");
        com.google.common.collect.ImmutableList<java.lang.String> strList13 = com.google.common.collect.ImmutableList.of("", "", "hi!", "OR [jsdoc_info: JSDocInfo]", "", "OR [jsdoc_info: JSDocInfo]");
        boolean boolean14 = strList6.containsAll((java.util.Collection<java.lang.String>) strList13);
        com.google.common.collect.UnmodifiableIterator<java.lang.String> strItor15 = strList13.iterator();
        int int16 = strList13.size();
        boolean boolean17 = strList13.isEmpty();
        int int18 = strList13.size();
        com.google.common.collect.UnmodifiableIterator<java.lang.String> strItor19 = strList13.iterator();
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "OR [jsdoc_info: JSDocInfo]" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        boolean boolean29 = strList22.retainAll((java.util.Collection<java.lang.String>) strList27);
        java.util.ListIterator<java.lang.String> strItor30 = strList22.listIterator();
        boolean boolean31 = strList13.containsAll((java.util.Collection<java.lang.String>) strList22);
        java.lang.String[] strArray38 = new java.lang.String[] { "((Unknown class name))", "(OR 0\n    OR\n)", "((Unknown class name))", "Node tree inequality:\nTree1:\nOR\n    OR\n\n\nTree2:\nOR\n\n\nSubtree1: OR\n    OR\n\n\nSubtree2: OR\n", "(OR 0\n    OR\n)", "OR [jsdoc_info: JSDocInfo] [length: 46]" };
        java.lang.String[] strArray45 = new java.lang.String[] { "((Unknown class name))", "(OR 0\n    OR\n)", "((Unknown class name))", "Node tree inequality:\nTree1:\nOR\n    OR\n\n\nTree2:\nOR\n\n\nSubtree1: OR\n    OR\n\n\nSubtree2: OR\n", "(OR 0\n    OR\n)", "OR [jsdoc_info: JSDocInfo] [length: 46]" };
        java.lang.String[] strArray52 = new java.lang.String[] { "((Unknown class name))", "(OR 0\n    OR\n)", "((Unknown class name))", "Node tree inequality:\nTree1:\nOR\n    OR\n\n\nTree2:\nOR\n\n\nSubtree1: OR\n    OR\n\n\nSubtree2: OR\n", "(OR 0\n    OR\n)", "OR [jsdoc_info: JSDocInfo] [length: 46]" };
        java.lang.String[] strArray59 = new java.lang.String[] { "((Unknown class name))", "(OR 0\n    OR\n)", "((Unknown class name))", "Node tree inequality:\nTree1:\nOR\n    OR\n\n\nTree2:\nOR\n\n\nSubtree1: OR\n    OR\n\n\nSubtree2: OR\n", "(OR 0\n    OR\n)", "OR [jsdoc_info: JSDocInfo] [length: 46]" };
        java.lang.String[] strArray66 = new java.lang.String[] { "((Unknown class name))", "(OR 0\n    OR\n)", "((Unknown class name))", "Node tree inequality:\nTree1:\nOR\n    OR\n\n\nTree2:\nOR\n\n\nSubtree1: OR\n    OR\n\n\nSubtree2: OR\n", "(OR 0\n    OR\n)", "OR [jsdoc_info: JSDocInfo] [length: 46]" };
        java.lang.String[][] strArray67 = new java.lang.String[][] { strArray38, strArray45, strArray52, strArray59, strArray66 };
        java.lang.String[][] strArray68 = strList22.toArray(strArray67);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.common.collect.ImmutableList<java.lang.String[]> strArrayList69 = com.google.common.collect.ImmutableList.of(strArray67);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100);
        node1.addChildrenToFront(node3);
        boolean boolean5 = node1.isNot();
        boolean boolean6 = node1.isIf();
        boolean boolean7 = node1.isOptionalArg();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node9 = node1.getChildAtIndex(32);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(0, "Node tree inequality:\nTree1:\nOR\n    OR\n\n\nTree2:\nOR NUMBER 1.0 37\n 29\n\n\nSubtree1: OR\n    OR\n\n\nSubtree2: OR NUMBER 1.0 37\n 29\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node4 = node2.getChildAtIndex(155684);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        node1.addSuppression("");
        java.lang.String str4 = node1.toString();
        com.google.javascript.rhino.Node node5 = node1.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = node1.getStaticSourceFile();
        boolean boolean7 = node1.isLocalResultCall();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(100);
        node9.addChildrenToFront(node11);
        boolean boolean13 = node9.isNot();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node16 = node9.copyInformationFromForTree(node15);
        com.google.javascript.rhino.InputId inputId17 = node9.getInputId();
        boolean boolean18 = node9.isIn();
        boolean boolean19 = node1.isEquivalentToTyped(node9);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(100);
        node21.addChildrenToFront(node23);
        boolean boolean25 = node21.isNot();
        boolean boolean26 = node21.isLocalResultCall();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(100);
        node28.addSuppression("");
        com.google.javascript.rhino.Node node31 = node21.copyInformationFromForTree(node28);
        boolean boolean32 = node31.isAssignAdd();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable33 = node31.children();
        boolean boolean34 = node31.isComma();
        boolean boolean35 = node9.isEquivalentTo(node31);
        com.google.javascript.rhino.Node node36 = node31.getFirstChild();
        boolean boolean37 = node36.isNull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node39 = node36.getChildAtIndex(52);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 4, (int) (byte) 1, 4);
        java.lang.String str4 = node3.toStringTree();
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(100);
        node6.addChildrenToFront(node8);
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(100);
        node11.addChildrenToFront(node13);
        boolean boolean15 = node11.isNot();
        boolean boolean16 = node11.isIf();
        com.google.javascript.rhino.Node node17 = node8.copyInformationFromForTree(node11);
        boolean boolean18 = node8.isEmpty();
        int int19 = node3.getIndexOfChild(node8);
        boolean boolean20 = node8.isNull();
        boolean boolean21 = node8.isObjectLit();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString(1, "unknown", (int) (byte) 10, 39);
        int int27 = node26.getSideEffectFlags();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(100);
        node29.addChildrenToFront(node31);
        int int33 = node29.getCharno();
        boolean boolean34 = node29.isName();
        boolean boolean35 = node29.isNE();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression37 = new com.google.javascript.rhino.JSTypeExpression(node29, "Unknown class name");
        node26.addChildrenToFront(node29);
        boolean boolean39 = node29.isVar();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node40 = node8.getChildBefore(node29);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((-1.0d));
        boolean boolean2 = node1.isCatch();
        boolean boolean3 = node1.isRegExp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node5 = node1.getChildAtIndex(9);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoShadow();
        java.lang.String str2 = jSDocInfo0.getMeaning();
        boolean boolean3 = jSDocInfo0.hasReturnType();
        boolean boolean4 = jSDocInfo0.isDeprecated();
        boolean boolean5 = jSDocInfo0.shouldPreserveTry();
        java.util.Set<java.lang.String> strSet6 = jSDocInfo0.getParameterNames();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(100);
        node8.addChildrenToFront(node10);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(100);
        node13.addChildrenToFront(node15);
        boolean boolean17 = node13.isNot();
        boolean boolean18 = node13.isIf();
        com.google.javascript.rhino.Node node19 = node10.copyInformationFromForTree(node13);
        boolean boolean20 = node10.isEmpty();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(100);
        node22.addChildrenToFront(node24);
        boolean boolean26 = node22.isReturn();
        com.google.javascript.rhino.InputId inputId27 = node22.getInputId();
        boolean boolean28 = node22.isAdd();
        node10.addChildrenToFront(node22);
        com.google.javascript.rhino.Node node30 = node22.getLastChild();
        boolean boolean31 = strSet6.contains((java.lang.Object) node30);
        java.lang.Object[] objArray32 = strSet6.toArray();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString(43, "NUMBER 4.0 1\n");
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(100);
        node37.addChildrenToFront(node39);
        boolean boolean41 = node39.isLabel();
        boolean boolean42 = node39.isContinue();
        node39.setVarArgs(false);
        boolean boolean45 = node39.isVoid();
        com.google.javascript.rhino.Node node46 = node35.copyInformationFrom(node39);
        boolean boolean47 = node39.isNE();
        boolean boolean48 = strSet6.equals((java.lang.Object) node39);
        node39.setSourceEncodedPosition(29);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node(100);
        node54.addSuppression("");
        boolean boolean57 = node54.isVarArgs();
        int int58 = node54.getChildCount();
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node(100);
        node60.addChildrenToFront(node62);
        boolean boolean64 = node60.isNot();
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node67 = node60.copyInformationFromForTree(node66);
        com.google.javascript.rhino.Node node68 = node54.useSourceInfoFromForTree(node66);
        com.google.javascript.rhino.Node node69 = node52.useSourceInfoFromForTree(node68);
        boolean boolean70 = node39.hasChild(node52);
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node74 = new com.google.javascript.rhino.Node(100);
        node72.addChildrenToFront(node74);
        com.google.javascript.rhino.Node node76 = node74.getParent();
        node74.setIsSyntheticBlock(true);
        boolean boolean79 = node74.isContinue();
        java.lang.String str80 = node74.getQualifiedName();
        boolean boolean81 = node74.isSwitch();
        node74.removeProp((int) '4');
        boolean boolean84 = node74.isParamList();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable85 = node74.siblings();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable86 = node74.children();
        boolean boolean87 = node74.isOr();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node39.removeChild(node74);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100);
        node1.addChildrenToFront(node3);
        com.google.javascript.rhino.Node node5 = node3.getParent();
        node3.setOptionalArg(false);
        boolean boolean8 = node3.isAssign();
        java.lang.Object obj10 = node3.getProp((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node12 = node3.getChildAtIndex(49);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoShadow();
        java.lang.String str2 = jSDocInfo0.getMeaning();
        boolean boolean3 = jSDocInfo0.hasReturnType();
        boolean boolean4 = jSDocInfo0.isDeprecated();
        boolean boolean5 = jSDocInfo0.shouldPreserveTry();
        java.util.Set<java.lang.String> strSet6 = jSDocInfo0.getParameterNames();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(100);
        node8.addChildrenToFront(node10);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(100);
        node13.addChildrenToFront(node15);
        boolean boolean17 = node13.isNot();
        boolean boolean18 = node13.isIf();
        com.google.javascript.rhino.Node node19 = node10.copyInformationFromForTree(node13);
        boolean boolean20 = node10.isEmpty();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(100);
        node22.addChildrenToFront(node24);
        boolean boolean26 = node22.isReturn();
        com.google.javascript.rhino.InputId inputId27 = node22.getInputId();
        boolean boolean28 = node22.isAdd();
        node10.addChildrenToFront(node22);
        com.google.javascript.rhino.Node node30 = node22.getLastChild();
        boolean boolean31 = strSet6.contains((java.lang.Object) node30);
        java.util.Spliterator<java.lang.String> strSpliterator32 = strSet6.spliterator();
        java.lang.Object[] objArray33 = strSet6.toArray();
        java.util.HashSet[][] hashSetArray35 = new java.util.HashSet[0][];
        @SuppressWarnings("unchecked")
        java.util.HashSet<java.lang.String>[][] strSetArray36 = (java.util.HashSet<java.lang.String>[][]) hashSetArray35;
        java.util.HashSet[][] hashSetArray38 = new java.util.HashSet[0][];
        @SuppressWarnings("unchecked")
        java.util.HashSet<java.lang.String>[][] strSetArray39 = (java.util.HashSet<java.lang.String>[][]) hashSetArray38;
        java.util.HashSet[][] hashSetArray41 = new java.util.HashSet[0][];
        @SuppressWarnings("unchecked")
        java.util.HashSet<java.lang.String>[][] strSetArray42 = (java.util.HashSet<java.lang.String>[][]) hashSetArray41;
        java.util.HashSet[][][] hashSetArray44 = new java.util.HashSet[3][][];
        @SuppressWarnings("unchecked")
        java.util.HashSet<java.lang.String>[][][] strSetArray45 = (java.util.HashSet<java.lang.String>[][][]) hashSetArray44;
        strSetArray45[0] = strSetArray36;
        strSetArray45[1] = strSetArray39;
        strSetArray45[2] = strSetArray42;
        java.util.HashSet<java.lang.String>[][][] strSetArray52 = strSet6.toArray(strSetArray45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.common.collect.ImmutableList<java.lang.Cloneable[]> cloneableArrayList53 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable[][]) strSetArray52);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100);
        node1.addChildrenToFront(node3);
        com.google.javascript.rhino.Node node5 = node3.getParent();
        node3.setIsSyntheticBlock(true);
        boolean boolean8 = node3.isContinue();
        java.lang.String str9 = node3.getQualifiedName();
        boolean boolean10 = node3.isSwitch();
        node3.removeProp((int) '4');
        boolean boolean13 = node3.isParamList();
        node3.setWasEmptyNode(false);
        boolean boolean16 = node3.isAssign();
        node3.setLength(12);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(100);
        node20.addChildrenToFront(node22);
        com.google.javascript.rhino.Node node24 = node22.getParent();
        int int25 = node22.getLength();
        node22.setSourceEncodedPositionForTree(1);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(100);
        node29.addSuppression("");
        java.lang.String str32 = node29.toString();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node(100);
        node34.addSuppression("");
        java.lang.String str37 = node34.toString();
        com.google.javascript.rhino.Node node38 = node34.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile39 = node34.getStaticSourceFile();
        com.google.javascript.rhino.Node node40 = node29.copyInformationFromForTree(node34);
        boolean boolean41 = node34.isAssignAdd();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(100);
        node43.addChildrenToFront(node45);
        boolean boolean47 = node43.isTypeOf();
        boolean boolean48 = node43.isVarArgs();
        boolean boolean49 = node43.isIn();
        node34.addChildToFront(node43);
        node43.removeProp(48);
        node43.addSuppression("OR [jsdoc_info: JSDocInfo]\n");
        com.google.javascript.rhino.Node node55 = node22.copyInformationFrom(node43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node56 = node3.getChildBefore(node55);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100);
        node1.addChildrenToFront(node3);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable5 = node1.children();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable6 = node1.siblings();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node1.children();
        boolean boolean8 = node1.isObjectLit();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(100);
        node10.addChildrenToFront(node12);
        boolean boolean14 = node10.isReturn();
        com.google.javascript.rhino.InputId inputId15 = node10.getInputId();
        boolean boolean16 = node10.isArrayLit();
        boolean boolean17 = node10.isInc();
        com.google.javascript.rhino.Node node18 = node1.srcrefTree(node10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node20 = node18.getChildAtIndex(39);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasBaseType();
        jSDocInfo0.setLicense("Node tree inequality:\nTree1:\nOR 0 [jsdoc_info: JSDocInfo]\n\n\nTree2:\nOR\n    OR\n\n\nSubtree1: OR 0 [jsdoc_info: JSDocInfo]\n\n\nSubtree2: OR\n    OR\n");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getTypedefType();
        boolean boolean5 = jSDocInfo0.isNoSideEffects();
        com.google.javascript.rhino.Node node6 = jSDocInfo0.getAssociatedNode();
        java.util.Set<java.lang.String> strSet7 = jSDocInfo0.getSuppressions();
        boolean boolean9 = jSDocInfo0.hasParameterType("OR");
        java.lang.String str10 = jSDocInfo0.getMeaning();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection11 = jSDocInfo0.getMarkers();
        java.lang.String str12 = jSDocInfo0.getDescription();
        com.google.common.collect.ImmutableList<java.lang.String> strList13 = jSDocInfo0.getTemplateTypeNames();
        com.google.javascript.rhino.JSTypeExpression[] jSTypeExpressionArray14 = new com.google.javascript.rhino.JSTypeExpression[] {};
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList15 = com.google.common.collect.ImmutableList.copyOf(jSTypeExpressionArray14);
        com.google.javascript.rhino.JSTypeExpression[] jSTypeExpressionArray16 = strList13.toArray(jSTypeExpressionArray14);
        com.google.common.collect.ImmutableList<java.lang.String> strList23 = com.google.common.collect.ImmutableList.of("", "", "hi!", "OR [jsdoc_info: JSDocInfo]", "", "OR [jsdoc_info: JSDocInfo]");
        com.google.common.collect.ImmutableList<java.lang.String> strList30 = com.google.common.collect.ImmutableList.of("", "", "hi!", "OR [jsdoc_info: JSDocInfo]", "", "OR [jsdoc_info: JSDocInfo]");
        boolean boolean31 = strList23.containsAll((java.util.Collection<java.lang.String>) strList30);
        com.google.common.collect.UnmodifiableListIterator<java.lang.String> strItor32 = strList23.listIterator();
        int int33 = strList23.size();
        boolean boolean34 = strList23.isEmpty();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility35 = com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC;
        int int36 = strList23.lastIndexOf((java.lang.Object) visibility35);
        java.util.stream.Stream<java.lang.String> strStream37 = strList23.parallelStream();
        java.util.Iterator<java.lang.String> strItor38 = strList23.iterator();
        int int39 = strList23.size();
        com.google.common.collect.ImmutableList<java.lang.String> strList40 = strList23.asList();
        com.google.common.collect.UnmodifiableListIterator<java.lang.String> strItor41 = strList40.listIterator();
        com.google.common.collect.UnmodifiableListIterator[] unmodifiableListIteratorArray43 = new com.google.common.collect.UnmodifiableListIterator[1];
        @SuppressWarnings("unchecked")
        com.google.common.collect.UnmodifiableListIterator<java.lang.String>[] strItorArray44 = (com.google.common.collect.UnmodifiableListIterator<java.lang.String>[]) unmodifiableListIteratorArray43;
        strItorArray44[0] = strItor41;
        com.google.common.collect.ImmutableList<com.google.common.collect.UnmodifiableListIterator<java.lang.String>> strItorList47 = com.google.common.collect.ImmutableList.copyOf(strItorArray44);
        com.google.common.collect.ImmutableList<com.google.common.collect.UnmodifiableIterator<java.lang.String>> strItorList48 = com.google.common.collect.ImmutableList.of((com.google.common.collect.UnmodifiableIterator<java.lang.String>[]) strItorArray44);
        java.util.ListIterator<java.lang.String>[] strItorArray49 = strList13.toArray((java.util.ListIterator<java.lang.String>[]) strItorArray44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.common.collect.ImmutableList<java.util.ListIterator<java.lang.String>> strItorList50 = com.google.common.collect.ImmutableList.of(strItorArray49);
    }
}


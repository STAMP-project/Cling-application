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
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        boolean boolean8 = node5.isNot();
        int int9 = node5.getLineno();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean16 = node15.isThis();
        node12.addChildToBack(node15);
        boolean boolean18 = node15.isNot();
        int int19 = node15.getLineno();
        com.google.javascript.rhino.Node node20 = node5.srcref(node15);
        int int21 = node5.getCharno();
        boolean boolean22 = node5.isQuotedString();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean29 = node28.isThis();
        node25.addChildToBack(node28);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean37 = node36.isThis();
        node33.addChildToBack(node36);
        boolean boolean39 = node33.isDebugger();
        boolean boolean40 = node33.isAssign();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node5.replaceChild(node25, node33);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        boolean boolean8 = node5.isNot();
        int int9 = node5.getLineno();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean16 = node15.isThis();
        node12.addChildToBack(node15);
        boolean boolean18 = node15.isNot();
        int int19 = node15.getLineno();
        com.google.javascript.rhino.Node node20 = node5.srcref(node15);
        int int21 = node5.getCharno();
        boolean boolean22 = node5.isQuotedString();
        boolean boolean23 = node5.isIf();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean30 = node29.isThis();
        node26.addChildToBack(node29);
        boolean boolean32 = node29.isNot();
        int int33 = node29.getLineno();
        boolean boolean34 = node29.isAdd();
        com.google.javascript.rhino.Node node35 = node5.useSourceInfoFromForTree(node29);
        boolean boolean36 = node29.isDo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node38 = node29.getChildAtIndex((int) ' ');
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        boolean boolean8 = node5.isNot();
        int int9 = node5.getLineno();
        boolean boolean10 = node5.isAdd();
        com.google.javascript.rhino.Node node11 = node5.cloneTree();
        java.lang.Object obj13 = node11.getProp((int) (byte) 0);
        int int14 = node11.getChildCount();
        boolean boolean15 = node11.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean22 = node21.isThis();
        node18.addChildToBack(node21);
        boolean boolean24 = node21.isNot();
        int int25 = node21.getLineno();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean32 = node31.isThis();
        node28.addChildToBack(node31);
        boolean boolean34 = node31.isNot();
        int int35 = node31.getLineno();
        com.google.javascript.rhino.Node node36 = node21.srcref(node31);
        int int37 = node21.getCharno();
        boolean boolean38 = node21.isQuotedString();
        boolean boolean39 = node21.isIf();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean46 = node45.isThis();
        node42.addChildToBack(node45);
        boolean boolean48 = node45.isNot();
        int int49 = node45.getLineno();
        boolean boolean50 = node45.isAdd();
        com.google.javascript.rhino.Node node51 = node21.useSourceInfoFromForTree(node45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node11.removeChild(node21);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        boolean boolean8 = node2.isDec();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean15 = node14.isThis();
        node11.addChildToBack(node14);
        boolean boolean17 = node11.isDebugger();
        boolean boolean18 = node11.isVoid();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean22 = node21.isTypeOf();
        com.google.javascript.rhino.Node node23 = node11.srcrefTree(node21);
        int int24 = node2.getIndexOfChild(node21);
        boolean boolean25 = node21.isDelProp();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean32 = node31.isThis();
        node28.addChildToBack(node31);
        boolean boolean34 = node31.isNot();
        int int35 = node31.getLineno();
        boolean boolean36 = node31.isAdd();
        node31.setSourceEncodedPosition((int) (byte) 1);
        boolean boolean39 = node31.isDec();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean47 = node46.isThis();
        node43.addChildToBack(node46);
        boolean boolean49 = node43.isDebugger();
        boolean boolean50 = node43.isAssign();
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node(51, node43, (int) (short) 10, 0);
        com.google.javascript.rhino.Node node54 = node31.srcrefTree(node53);
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean61 = node60.isThis();
        node57.addChildToBack(node60);
        boolean boolean63 = node60.isNot();
        int int64 = node60.getLineno();
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean71 = node70.isThis();
        node67.addChildToBack(node70);
        boolean boolean73 = node70.isNot();
        int int74 = node70.getLineno();
        com.google.javascript.rhino.Node node75 = node60.srcref(node70);
        boolean boolean76 = node75.isDelProp();
        com.google.javascript.rhino.Node node77 = node75.getLastSibling();
        boolean boolean78 = node77.isFunction();
        java.lang.Object obj80 = node77.getProp((int) ' ');
        boolean boolean81 = node54.isEquivalentToTyped(node77);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node82 = node21.getChildBefore(node77);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        boolean boolean8 = node5.isNot();
        int int9 = node5.getLineno();
        boolean boolean10 = node5.isAdd();
        node5.setSourceEncodedPosition((int) (byte) 1);
        boolean boolean13 = node5.isDec();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean21 = node20.isThis();
        node17.addChildToBack(node20);
        boolean boolean23 = node17.isDebugger();
        boolean boolean24 = node17.isAssign();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(51, node17, (int) (short) 10, 0);
        com.google.javascript.rhino.Node node28 = node5.srcrefTree(node27);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean35 = node34.isThis();
        node31.addChildToBack(node34);
        boolean boolean37 = node34.isNot();
        int int38 = node34.getLineno();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean45 = node44.isThis();
        node41.addChildToBack(node44);
        boolean boolean47 = node44.isNot();
        int int48 = node44.getLineno();
        com.google.javascript.rhino.Node node49 = node34.srcref(node44);
        boolean boolean50 = node49.isDelProp();
        com.google.javascript.rhino.Node node51 = node49.getLastSibling();
        boolean boolean52 = node51.isFunction();
        java.lang.Object obj54 = node51.getProp((int) ' ');
        boolean boolean55 = node28.isEquivalentToTyped(node51);
        node28.setWasEmptyNode(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node59 = node28.getChildAtIndex(49);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        boolean boolean8 = node5.isNot();
        int int9 = node5.getLineno();
        boolean boolean10 = node5.isAdd();
        node5.setSourceEncodedPosition((int) (byte) 1);
        boolean boolean13 = node5.isDec();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean21 = node20.isThis();
        node17.addChildToBack(node20);
        boolean boolean23 = node17.isDebugger();
        boolean boolean24 = node17.isAssign();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(51, node17, (int) (short) 10, 0);
        com.google.javascript.rhino.Node node28 = node27.getLastChild();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable29 = node27.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node30 = node5.getChildBefore(node27);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean3 = node2.isThis();
        boolean boolean4 = node2.isDelProp();
        boolean boolean5 = node2.isOr();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 100.0f);
        boolean boolean8 = node7.isGetProp();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean15 = node14.isThis();
        node11.addChildToBack(node14);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable17 = node11.siblings();
        node11.setWasEmptyNode(true);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean26 = node25.isThis();
        node22.addChildToBack(node25);
        node25.setOptionalArg(false);
        com.google.javascript.rhino.Node node30 = node11.srcref(node25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.replaceChild(node7, node30);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        node5.removeProp(1);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean13 = node12.isThis();
        boolean boolean14 = node12.isDelProp();
        int int15 = node12.getChildCount();
        com.google.javascript.rhino.Node node16 = node12.cloneTree();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node5.removeChild(node16);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean3 = node2.isNE();
        boolean boolean4 = node2.isInstanceOf();
        boolean boolean5 = node2.isThrow();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean12 = node11.isThis();
        node8.addChildToBack(node11);
        boolean boolean14 = node11.isNot();
        int int15 = node11.getLineno();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean22 = node21.isThis();
        node18.addChildToBack(node21);
        boolean boolean24 = node21.isNot();
        int int25 = node21.getLineno();
        com.google.javascript.rhino.Node node26 = node11.srcref(node21);
        int int27 = node11.getCharno();
        java.lang.String str31 = node11.toString(true, true, true);
        int int32 = node11.getSourceOffset();
        node11.removeProp(36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.removeChild(node11);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder0 = new com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>>();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility1 = com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC;
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder2 = visibilityEnumBuilder0.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>) visibility1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean4 = jSDocInfo3.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo3.getType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility6 = jSDocInfo3.getVisibility();
        boolean boolean7 = jSDocInfo3.shouldPreserveTry();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility8 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        jSDocInfo3.setVisibility(visibility8);
        com.google.javascript.rhino.JSDocInfo.Visibility[] visibilityArray10 = new com.google.javascript.rhino.JSDocInfo.Visibility[] { visibility8 };
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder11 = visibilityEnumBuilder2.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>[]) visibilityArray10);
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList12 = com.google.common.collect.ImmutableList.of();
        java.lang.Object[] objArray13 = nodeIterableList12.toArray();
        boolean boolean14 = nodeIterableList12.isEmpty();
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder15 = new com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>>();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility16 = com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC;
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder17 = visibilityEnumBuilder15.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>) visibility16);
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder18 = new com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>>();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility19 = com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC;
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder20 = visibilityEnumBuilder18.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>) visibility19);
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean22 = jSDocInfo21.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression23 = jSDocInfo21.getType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility24 = jSDocInfo21.getVisibility();
        boolean boolean25 = jSDocInfo21.shouldPreserveTry();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility26 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        jSDocInfo21.setVisibility(visibility26);
        com.google.javascript.rhino.JSDocInfo.Visibility[] visibilityArray28 = new com.google.javascript.rhino.JSDocInfo.Visibility[] { visibility26 };
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder29 = visibilityEnumBuilder20.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>[]) visibilityArray28);
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder30 = new com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>>();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility31 = com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC;
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder32 = visibilityEnumBuilder30.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>) visibility31);
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean34 = jSDocInfo33.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression35 = jSDocInfo33.getType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility36 = jSDocInfo33.getVisibility();
        boolean boolean37 = jSDocInfo33.shouldPreserveTry();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility38 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        jSDocInfo33.setVisibility(visibility38);
        com.google.javascript.rhino.JSDocInfo.Visibility[] visibilityArray40 = new com.google.javascript.rhino.JSDocInfo.Visibility[] { visibility38 };
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder41 = visibilityEnumBuilder32.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>[]) visibilityArray40);
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder42 = visibilityEnumBuilder29.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>[]) visibilityArray40);
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder43 = visibilityEnumBuilder17.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>[]) visibilityArray40);
        java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>[] visibilityEnumArray44 = nodeIterableList12.toArray((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>[]) visibilityArray40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder45 = visibilityEnumBuilder11.add(visibilityEnumArray44);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        boolean boolean8 = node5.isNot();
        int int9 = node5.getLineno();
        boolean boolean10 = node5.isAdd();
        com.google.javascript.rhino.Node node11 = node5.cloneTree();
        java.lang.String str12 = node11.getSourceFileName();
        boolean boolean13 = node11.isIf();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean20 = node19.isThis();
        node16.addChildToBack(node19);
        boolean boolean22 = node19.isNot();
        int int23 = node19.getLineno();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean30 = node29.isThis();
        node26.addChildToBack(node29);
        boolean boolean32 = node29.isNot();
        int int33 = node29.getLineno();
        com.google.javascript.rhino.Node node34 = node19.srcref(node29);
        int int35 = node19.getCharno();
        boolean boolean36 = node19.isQuotedString();
        boolean boolean37 = node19.isIf();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean44 = node43.isThis();
        node40.addChildToBack(node43);
        boolean boolean46 = node43.isNot();
        int int47 = node43.getLineno();
        boolean boolean48 = node43.isAdd();
        com.google.javascript.rhino.Node node49 = node19.useSourceInfoFromForTree(node43);
        boolean boolean50 = node43.isDo();
        com.google.javascript.rhino.Node node51 = node11.srcrefTree(node43);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean58 = node57.isThis();
        node54.addChildToBack(node57);
        boolean boolean60 = node57.isNot();
        int int61 = node57.getLineno();
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean68 = node67.isThis();
        node64.addChildToBack(node67);
        boolean boolean70 = node67.isNot();
        int int71 = node67.getLineno();
        com.google.javascript.rhino.Node node72 = node57.srcref(node67);
        int int73 = node57.getCharno();
        boolean boolean74 = node57.isQuotedString();
        boolean boolean75 = node57.isIf();
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node81 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean82 = node81.isThis();
        node78.addChildToBack(node81);
        boolean boolean84 = node81.isNot();
        int int85 = node81.getLineno();
        boolean boolean86 = node81.isAdd();
        com.google.javascript.rhino.Node node87 = node57.useSourceInfoFromForTree(node81);
        boolean boolean88 = node87.isVar();
        com.google.javascript.rhino.InputId inputId89 = node87.getInputId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node90 = node43.getChildBefore(node87);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(36, "hi!", 38, 48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex(10);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder0 = new com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>>();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility1 = com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC;
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder2 = visibilityEnumBuilder0.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>) visibility1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean4 = jSDocInfo3.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo3.getType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility6 = jSDocInfo3.getVisibility();
        boolean boolean7 = jSDocInfo3.shouldPreserveTry();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility8 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        jSDocInfo3.setVisibility(visibility8);
        com.google.javascript.rhino.JSDocInfo.Visibility[] visibilityArray10 = new com.google.javascript.rhino.JSDocInfo.Visibility[] { visibility8 };
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder11 = visibilityEnumBuilder2.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>[]) visibilityArray10);
        com.google.javascript.rhino.JSDocInfo.Visibility visibility12 = com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC;
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder13 = visibilityEnumBuilder2.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>) visibility12);
        com.google.javascript.rhino.JSDocInfo jSDocInfo14 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean15 = jSDocInfo14.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression16 = jSDocInfo14.getType();
        boolean boolean17 = jSDocInfo14.isImplicitCast();
        boolean boolean18 = jSDocInfo14.isExport();
        boolean boolean19 = jSDocInfo14.isNoShadow();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression20 = jSDocInfo14.getReturnType();
        boolean boolean21 = jSDocInfo14.hasTypedefType();
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder22 = new com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>>();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility23 = com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC;
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder24 = visibilityEnumBuilder22.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>) visibility23);
        jSDocInfo14.setVisibility(visibility23);
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder26 = visibilityEnumBuilder13.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>) visibility23);
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList27 = com.google.common.collect.ImmutableList.of();
        java.lang.Object[] objArray28 = nodeIterableList27.toArray();
        boolean boolean29 = nodeIterableList27.isEmpty();
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder30 = new com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>>();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility31 = com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC;
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder32 = visibilityEnumBuilder30.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>) visibility31);
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder33 = new com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>>();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility34 = com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC;
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder35 = visibilityEnumBuilder33.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>) visibility34);
        com.google.javascript.rhino.JSDocInfo jSDocInfo36 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean37 = jSDocInfo36.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression38 = jSDocInfo36.getType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility39 = jSDocInfo36.getVisibility();
        boolean boolean40 = jSDocInfo36.shouldPreserveTry();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility41 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        jSDocInfo36.setVisibility(visibility41);
        com.google.javascript.rhino.JSDocInfo.Visibility[] visibilityArray43 = new com.google.javascript.rhino.JSDocInfo.Visibility[] { visibility41 };
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder44 = visibilityEnumBuilder35.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>[]) visibilityArray43);
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder45 = new com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>>();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility46 = com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC;
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder47 = visibilityEnumBuilder45.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>) visibility46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo48 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean49 = jSDocInfo48.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression50 = jSDocInfo48.getType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility51 = jSDocInfo48.getVisibility();
        boolean boolean52 = jSDocInfo48.shouldPreserveTry();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility53 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        jSDocInfo48.setVisibility(visibility53);
        com.google.javascript.rhino.JSDocInfo.Visibility[] visibilityArray55 = new com.google.javascript.rhino.JSDocInfo.Visibility[] { visibility53 };
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder56 = visibilityEnumBuilder47.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>[]) visibilityArray55);
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder57 = visibilityEnumBuilder44.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>[]) visibilityArray55);
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder58 = visibilityEnumBuilder32.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>[]) visibilityArray55);
        java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>[] visibilityEnumArray59 = nodeIterableList27.toArray((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>[]) visibilityArray55);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.common.collect.ImmutableCollection.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder60 = visibilityEnumBuilder26.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>[]) visibilityArray55);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(40);
        boolean boolean2 = node1.isQualifiedName();
        boolean boolean3 = node1.isAnd();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean10 = node9.isThis();
        node6.addChildToBack(node9);
        boolean boolean12 = node9.isNot();
        int int13 = node9.getLineno();
        boolean boolean14 = node9.isAdd();
        com.google.javascript.rhino.Node node15 = node9.cloneTree();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node16 = node1.getChildBefore(node15);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        boolean boolean8 = node5.isNot();
        int int9 = node5.getLineno();
        boolean boolean10 = node5.isAdd();
        com.google.javascript.rhino.Node node11 = node5.cloneTree();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean18 = node17.isThis();
        node14.addChildToBack(node17);
        boolean boolean20 = node17.isNot();
        int int21 = node17.getLineno();
        boolean boolean22 = node17.isAdd();
        boolean boolean23 = node11.hasChild(node17);
        boolean boolean24 = node17.isDefaultCase();
        int int25 = node17.getSourcePosition();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean32 = node31.isThis();
        node28.addChildToBack(node31);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable34 = node28.siblings();
        node28.setWasEmptyNode(true);
        com.google.javascript.rhino.Node node37 = node28.getLastChild();
        java.lang.String str38 = node37.getString();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean45 = node44.isThis();
        node41.addChildToBack(node44);
        boolean boolean47 = node44.isNot();
        int int48 = node44.getLineno();
        boolean boolean49 = node44.isAdd();
        com.google.javascript.rhino.Node node50 = node44.cloneTree();
        com.google.javascript.rhino.Node node51 = node37.clonePropsFrom(node44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node52 = node17.getChildBefore(node51);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 100.0f);
        com.google.javascript.rhino.Node node2 = node1.getLastChild();
        boolean boolean3 = node1.isNumber();
        node1.setLength(100);
        boolean boolean6 = node1.isString();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean13 = node12.isThis();
        node9.addChildToBack(node12);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable15 = node9.siblings();
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        node9.setDirectives((java.util.Set<java.lang.String>) strSet18);
        node9.putBooleanProp(0, false);
        node9.setVarArgs(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node9);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        boolean boolean8 = node2.isDec();
        boolean boolean9 = node2.isBlock();
        boolean boolean10 = node2.isTrue();
        com.google.javascript.rhino.Node node11 = node2.cloneNode();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean18 = node17.isThis();
        node14.addChildToBack(node17);
        boolean boolean20 = node17.isNot();
        int int21 = node17.getLineno();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean28 = node27.isThis();
        node24.addChildToBack(node27);
        boolean boolean30 = node27.isNot();
        int int31 = node27.getLineno();
        com.google.javascript.rhino.Node node32 = node17.srcref(node27);
        int int33 = node17.getCharno();
        boolean boolean34 = node17.isQuotedString();
        boolean boolean35 = node17.isIf();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean42 = node41.isThis();
        node38.addChildToBack(node41);
        boolean boolean44 = node41.isNot();
        int int45 = node41.getLineno();
        boolean boolean46 = node41.isAdd();
        com.google.javascript.rhino.Node node47 = node17.useSourceInfoFromForTree(node41);
        com.google.javascript.rhino.Node node48 = node2.useSourceInfoFromForTree(node17);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean55 = node54.isThis();
        node51.addChildToBack(node54);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable57 = node51.siblings();
        java.lang.String[] strArray59 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet60 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet60, strArray59);
        node51.setDirectives((java.util.Set<java.lang.String>) strSet60);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node63 = node17.getChildBefore(node51);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable8 = node2.siblings();
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        node2.setDirectives((java.util.Set<java.lang.String>) strSet11);
        node2.detachChildren();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 5, (int) (short) 1);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean22 = node21.isNE();
        boolean boolean23 = node21.isInstanceOf();
        boolean boolean24 = node21.isThrow();
        boolean boolean25 = node21.isWhile();
        boolean boolean26 = node21.isIf();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.replaceChild(node18, node21);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        boolean boolean8 = node5.isNot();
        int int9 = node5.getLineno();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean16 = node15.isThis();
        node12.addChildToBack(node15);
        boolean boolean18 = node15.isNot();
        int int19 = node15.getLineno();
        com.google.javascript.rhino.Node node20 = node5.srcref(node15);
        boolean boolean21 = node5.isString();
        boolean boolean22 = node5.isRegExp();
        boolean boolean23 = node5.isFromExterns();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean31 = node30.isThis();
        node27.addChildToBack(node30);
        boolean boolean33 = node27.isDebugger();
        node27.setSourceFileForTesting("");
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean42 = node41.isThis();
        node38.addChildToBack(node41);
        boolean boolean44 = node41.isNot();
        int int45 = node41.getLineno();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean52 = node51.isThis();
        node48.addChildToBack(node51);
        boolean boolean54 = node51.isNot();
        int int55 = node51.getLineno();
        com.google.javascript.rhino.Node node56 = node41.srcref(node51);
        int int57 = node41.getCharno();
        com.google.javascript.rhino.Node node58 = node27.copyInformationFrom(node41);
        boolean boolean59 = node27.isTrue();
        boolean boolean60 = node27.isCase();
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(52, node27);
        boolean boolean62 = node27.isDefaultCase();
        boolean boolean63 = node27.isSetterDef();
        boolean boolean64 = node27.isWhile();
        node27.setType((int) (byte) -1);
        boolean boolean67 = node27.isStringKey();
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean74 = node73.isThis();
        node70.addChildToBack(node73);
        boolean boolean76 = node73.isNot();
        int int77 = node73.getLineno();
        boolean boolean78 = node73.isAdd();
        com.google.javascript.rhino.Node node79 = node73.cloneTree();
        java.lang.String str80 = node79.toStringTree();
        boolean boolean81 = node79.isNE();
        boolean boolean82 = node79.isSwitch();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node5.replaceChild(node27, node79);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean3 = node2.isAnd();
        boolean boolean4 = node2.isAdd();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean11 = node10.isThis();
        node7.addChildToBack(node10);
        com.google.javascript.rhino.Node node13 = node7.cloneNode();
        boolean boolean14 = node7.hasOneChild();
        boolean boolean15 = node7.isVarArgs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node16 = node2.getChildBefore(node7);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean3 = node2.isTypeOf();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean10 = node9.isThis();
        node6.addChildToBack(node9);
        boolean boolean12 = node9.isNot();
        int int13 = node9.getLineno();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean20 = node19.isThis();
        node16.addChildToBack(node19);
        boolean boolean22 = node19.isNot();
        int int23 = node19.getLineno();
        com.google.javascript.rhino.Node node24 = node9.srcref(node19);
        boolean boolean25 = node9.isString();
        boolean boolean26 = node9.isTry();
        boolean boolean27 = node9.isHook();
        com.google.javascript.rhino.Node node28 = node2.copyInformationFrom(node9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node30 = node28.getChildAtIndex(10);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable8 = node2.siblings();
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        node2.setDirectives((java.util.Set<java.lang.String>) strSet11);
        int int14 = strSet11.size();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean21 = node20.isThis();
        node17.addChildToBack(node20);
        boolean boolean23 = node20.isAdd();
        boolean boolean24 = node20.isAnd();
        boolean boolean25 = strSet11.remove((java.lang.Object) node20);
        boolean boolean26 = node20.isOr();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node28 = node20.getChildAtIndex(4);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        boolean boolean8 = node5.isNot();
        int int9 = node5.getLineno();
        boolean boolean10 = node5.isAdd();
        node5.setSourceEncodedPosition((int) (byte) 1);
        boolean boolean13 = node5.isDec();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean21 = node20.isThis();
        node17.addChildToBack(node20);
        boolean boolean23 = node17.isDebugger();
        boolean boolean24 = node17.isAssign();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(51, node17, (int) (short) 10, 0);
        com.google.javascript.rhino.Node node28 = node5.srcrefTree(node27);
        int int29 = node28.getLength();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable30 = node28.children();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean38 = node37.isThis();
        node34.addChildToBack(node37);
        boolean boolean40 = node34.isDebugger();
        node34.setSourceFileForTesting("");
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean49 = node48.isThis();
        node45.addChildToBack(node48);
        boolean boolean51 = node48.isNot();
        int int52 = node48.getLineno();
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean59 = node58.isThis();
        node55.addChildToBack(node58);
        boolean boolean61 = node58.isNot();
        int int62 = node58.getLineno();
        com.google.javascript.rhino.Node node63 = node48.srcref(node58);
        int int64 = node48.getCharno();
        com.google.javascript.rhino.Node node65 = node34.copyInformationFrom(node48);
        boolean boolean66 = node34.isTrue();
        boolean boolean67 = node34.isCase();
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node(52, node34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node28.removeChild(node34);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) '#', 2, (int) (byte) 10);
        boolean boolean4 = node3.isOptionalArg();
        com.google.javascript.rhino.jstype.JSType jSType5 = node3.getJSType();
        int int6 = node3.getSourcePosition();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean10 = node9.isDebugger();
        com.google.javascript.rhino.InputId inputId12 = new com.google.javascript.rhino.InputId("");
        java.lang.String str13 = inputId12.getIdName();
        node9.setInputId(inputId12);
        boolean boolean15 = node9.isThrow();
        com.google.javascript.rhino.Node node16 = node9.getFirstChild();
        boolean boolean17 = node9.isHook();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node18 = node3.getChildBefore(node9);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        boolean boolean8 = node5.isNot();
        int int9 = node5.getLineno();
        boolean boolean10 = node5.isAdd();
        com.google.javascript.rhino.Node node11 = node5.cloneTree();
        java.lang.String str12 = node11.toStringTree();
        boolean boolean13 = node11.isLocalResultCall();
        boolean boolean14 = node11.wasEmptyNode();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString((int) ' ', "hi!", 38, (int) (short) 0);
        com.google.javascript.rhino.Node node20 = node19.cloneNode();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean27 = node26.isThis();
        node23.addChildToBack(node26);
        boolean boolean29 = node26.isNot();
        int int30 = node26.getLineno();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean37 = node36.isThis();
        node33.addChildToBack(node36);
        boolean boolean39 = node36.isNot();
        int int40 = node36.getLineno();
        com.google.javascript.rhino.Node node41 = node26.srcref(node36);
        boolean boolean42 = node26.isString();
        boolean boolean43 = node26.isRegExp();
        boolean boolean44 = node20.isEquivalentToTyped(node26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node45 = node11.getChildBefore(node26);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean8 = node7.isThis();
        node4.addChildToBack(node7);
        com.google.javascript.rhino.Node node10 = node4.cloneNode();
        boolean boolean11 = node4.hasOneChild();
        node1.addChildrenToFront(node4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node14 = node1.getChildAtIndex(8);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 100.0f);
        com.google.javascript.rhino.Node node2 = node1.getLastChild();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean9 = node8.isThis();
        node5.addChildToBack(node8);
        boolean boolean11 = node5.isDec();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean18 = node17.isThis();
        node14.addChildToBack(node17);
        boolean boolean20 = node14.isDebugger();
        boolean boolean21 = node14.isVoid();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean25 = node24.isTypeOf();
        com.google.javascript.rhino.Node node26 = node14.srcrefTree(node24);
        int int27 = node5.getIndexOfChild(node24);
        int int28 = node5.getSourceOffset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node29 = node1.getChildBefore(node5);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 100, 10);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean11 = node10.isThis();
        node7.addChildToBack(node10);
        boolean boolean13 = node10.isNot();
        int int14 = node10.getLineno();
        boolean boolean15 = node10.isAdd();
        node10.setSourceEncodedPosition((int) (byte) 1);
        boolean boolean18 = node10.isDec();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean26 = node25.isThis();
        node22.addChildToBack(node25);
        boolean boolean28 = node22.isDebugger();
        boolean boolean29 = node22.isAssign();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(51, node22, (int) (short) 10, 0);
        com.google.javascript.rhino.Node node33 = node10.srcrefTree(node32);
        int int34 = node33.getLength();
        com.google.javascript.rhino.Node node35 = node4.useSourceInfoFromForTree(node33);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean42 = node41.isThis();
        node38.addChildToBack(node41);
        boolean boolean44 = node38.isDebugger();
        boolean boolean45 = node38.isVoid();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean49 = node48.isTypeOf();
        com.google.javascript.rhino.Node node50 = node38.srcrefTree(node48);
        com.google.javascript.rhino.Node node52 = node48.getAncestor((int) (byte) 1);
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node(40, node35, node48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node55 = node48.getChildAtIndex(46);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable8 = node2.siblings();
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        node2.setDirectives((java.util.Set<java.lang.String>) strSet11);
        java.lang.String str14 = node2.getSourceFileName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node16 = node2.getChildAtIndex((int) (short) 10);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList0 = com.google.common.collect.ImmutableList.of();
        java.lang.Object[] objArray1 = nodeIterableList0.toArray();
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList2 = nodeIterableList0.reverse();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition3 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition4 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition5 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition6 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition7 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition8 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition[] typePositionArray9 = new com.google.javascript.rhino.JSDocInfo.TypePosition[] { typePosition3, typePosition4, typePosition5, typePosition6, typePosition7, typePosition8 };
        com.google.javascript.rhino.JSDocInfo.TypePosition[] typePositionArray10 = nodeIterableList0.toArray(typePositionArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>> nodeSourcePositionList11 = com.google.common.collect.ImmutableList.of((com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>[]) typePositionArray10);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder0 = com.google.common.collect.ImmutableList.builder();
        com.google.common.collect.ImmutableCollection<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumCollection1 = visibilityEnumBuilder0.build();
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList2 = com.google.common.collect.ImmutableList.of();
        java.lang.Object[] objArray3 = nodeIterableList2.toArray();
        boolean boolean4 = nodeIterableList2.isEmpty();
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder5 = new com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>>();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility6 = com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC;
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder7 = visibilityEnumBuilder5.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>) visibility6);
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder8 = new com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>>();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility9 = com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC;
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder10 = visibilityEnumBuilder8.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>) visibility9);
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean12 = jSDocInfo11.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = jSDocInfo11.getType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility14 = jSDocInfo11.getVisibility();
        boolean boolean15 = jSDocInfo11.shouldPreserveTry();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility16 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        jSDocInfo11.setVisibility(visibility16);
        com.google.javascript.rhino.JSDocInfo.Visibility[] visibilityArray18 = new com.google.javascript.rhino.JSDocInfo.Visibility[] { visibility16 };
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder19 = visibilityEnumBuilder10.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>[]) visibilityArray18);
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder20 = new com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>>();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility21 = com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC;
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder22 = visibilityEnumBuilder20.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>) visibility21);
        com.google.javascript.rhino.JSDocInfo jSDocInfo23 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean24 = jSDocInfo23.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression25 = jSDocInfo23.getType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility26 = jSDocInfo23.getVisibility();
        boolean boolean27 = jSDocInfo23.shouldPreserveTry();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility28 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        jSDocInfo23.setVisibility(visibility28);
        com.google.javascript.rhino.JSDocInfo.Visibility[] visibilityArray30 = new com.google.javascript.rhino.JSDocInfo.Visibility[] { visibility28 };
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder31 = visibilityEnumBuilder22.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>[]) visibilityArray30);
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder32 = visibilityEnumBuilder19.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>[]) visibilityArray30);
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder33 = visibilityEnumBuilder7.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>[]) visibilityArray30);
        java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>[] visibilityEnumArray34 = nodeIterableList2.toArray((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>[]) visibilityArray30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder35 = visibilityEnumBuilder0.add(visibilityEnumArray34);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean3 = node2.isNE();
        boolean boolean4 = node2.isInstanceOf();
        boolean boolean5 = node2.isThrow();
        boolean boolean6 = node2.isWhile();
        boolean boolean7 = node2.isIf();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean14 = node13.isThis();
        node10.addChildToBack(node13);
        boolean boolean16 = node13.isNot();
        int int17 = node13.getLineno();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean24 = node23.isThis();
        node20.addChildToBack(node23);
        boolean boolean26 = node23.isNot();
        int int27 = node23.getLineno();
        com.google.javascript.rhino.Node node28 = node13.srcref(node23);
        boolean boolean29 = node28.isNE();
        boolean boolean30 = node28.isGetterDef();
        int int31 = node28.getSourcePosition();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean38 = node37.isThis();
        node34.addChildToBack(node37);
        boolean boolean40 = node37.isNot();
        int int41 = node37.getLineno();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean48 = node47.isThis();
        node44.addChildToBack(node47);
        boolean boolean50 = node47.isNot();
        int int51 = node47.getLineno();
        com.google.javascript.rhino.Node node52 = node37.srcref(node47);
        boolean boolean53 = node52.isDelProp();
        boolean boolean55 = node52.getBooleanProp(0);
        boolean boolean56 = node52.isName();
        java.lang.String str57 = node28.checkTreeEquals(node52);
        boolean boolean58 = node2.isEquivalentTo(node52);
        boolean boolean59 = node2.wasEmptyNode();
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.removeChild(node61);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("{599635391}");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node3 = node1.getChildAtIndex(16);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 0);
        node1.setType((int) (byte) 1);
        boolean boolean4 = node1.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("?", 42, 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node8);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString((int) ' ', "hi!", 38, (int) (short) 0);
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(5, 37, 29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.removeChild(node8);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(40);
        boolean boolean2 = node1.isQualifiedName();
        boolean boolean3 = node1.isNE();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node5 = node1.getChildAtIndex(41);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(4095, "STRING INSTANCEOF 50", 45, (int) (byte) 10);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (byte) 100);
        com.google.javascript.rhino.Node node7 = node4.copyInformationFrom(node6);
        boolean boolean8 = node4.isVar();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean15 = node14.isThis();
        node11.addChildToBack(node14);
        boolean boolean17 = node14.isNot();
        int int18 = node14.getLineno();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean25 = node24.isThis();
        node21.addChildToBack(node24);
        boolean boolean27 = node24.isNot();
        int int28 = node24.getLineno();
        com.google.javascript.rhino.Node node29 = node14.srcref(node24);
        int int30 = node14.getCharno();
        java.lang.String str34 = node14.toString(true, true, true);
        int int35 = node14.getSourceOffset();
        node14.removeProp(36);
        com.google.javascript.rhino.JSDocInfo jSDocInfo38 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean39 = jSDocInfo38.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression40 = jSDocInfo38.getType();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean44 = node43.isTypeOf();
        jSDocInfo38.setAssociatedNode(node43);
        boolean boolean46 = jSDocInfo38.containsDeclaration();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression48 = jSDocInfo38.getParameterType("java.io.IOException: java.io.IOException: java.io.IOException");
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString("OR hi!");
        boolean boolean51 = node50.isInc();
        jSDocInfo38.setAssociatedNode(node50);
        com.google.javascript.rhino.Node node53 = node14.copyInformationFromForTree(node50);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node54 = node4.getChildBefore(node53);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable8 = node2.siblings();
        node2.setWasEmptyNode(true);
        com.google.javascript.rhino.Node node11 = node2.getLastChild();
        com.google.javascript.rhino.Node node12 = node11.getLastChild();
        boolean boolean13 = node11.wasEmptyNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node15 = node11.getChildAtIndex(53);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        boolean boolean8 = node5.isNot();
        int int9 = node5.getLineno();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean16 = node15.isThis();
        node12.addChildToBack(node15);
        boolean boolean18 = node15.isNot();
        int int19 = node15.getLineno();
        com.google.javascript.rhino.Node node20 = node5.srcref(node15);
        int int21 = node5.getCharno();
        java.lang.String str25 = node5.toString(true, true, true);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean32 = node31.isThis();
        node28.addChildToBack(node31);
        boolean boolean34 = node31.isNot();
        int int35 = node31.getLineno();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean42 = node41.isThis();
        node38.addChildToBack(node41);
        boolean boolean44 = node41.isNot();
        int int45 = node41.getLineno();
        com.google.javascript.rhino.Node node46 = node31.srcref(node41);
        int int47 = node31.getCharno();
        boolean boolean48 = node31.isQuotedString();
        boolean boolean49 = node31.isIf();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean56 = node55.isThis();
        node52.addChildToBack(node55);
        boolean boolean58 = node55.isNot();
        int int59 = node55.getLineno();
        boolean boolean60 = node55.isAdd();
        com.google.javascript.rhino.Node node61 = node31.useSourceInfoFromForTree(node55);
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean68 = node67.isThis();
        node64.addChildToBack(node67);
        boolean boolean70 = node67.isNot();
        int int71 = node67.getLineno();
        boolean boolean72 = node67.isAdd();
        com.google.javascript.rhino.Node node73 = node67.cloneTree();
        java.lang.Object obj75 = node73.getProp((int) (byte) 0);
        int int76 = node73.getChildCount();
        node61.addChildrenToFront(node73);
        boolean boolean78 = node5.isEquivalentToTyped(node61);
        boolean boolean79 = node5.isWith();
        boolean boolean80 = node5.isOr();
        com.google.javascript.rhino.Node node83 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node86 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean87 = node86.isThis();
        node83.addChildToBack(node86);
        boolean boolean89 = node83.isDebugger();
        boolean boolean90 = node83.isVoid();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node91 = node5.getChildBefore(node83);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList0 = com.google.common.collect.ImmutableList.of();
        java.lang.Object[] objArray1 = nodeIterableList0.toArray();
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList2 = nodeIterableList0.reverse();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition3 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition4 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition5 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition6 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition7 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition8 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition[] typePositionArray9 = new com.google.javascript.rhino.JSDocInfo.TypePosition[] { typePosition3, typePosition4, typePosition5, typePosition6, typePosition7, typePosition8 };
        com.google.javascript.rhino.JSDocInfo.TypePosition[] typePositionArray10 = nodeIterableList0.toArray(typePositionArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>> nodeSourcePositionList11 = com.google.common.collect.ImmutableList.of((com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>[]) typePositionArray9);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        boolean boolean8 = node2.isDebugger();
        boolean boolean9 = node2.isVoid();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean13 = node12.isTypeOf();
        com.google.javascript.rhino.Node node14 = node2.srcrefTree(node12);
        boolean boolean15 = node14.isObjectLit();
        boolean boolean16 = node14.isCall();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean23 = node22.isThis();
        node19.addChildToBack(node22);
        boolean boolean25 = node19.isDebugger();
        boolean boolean26 = node19.isVoid();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean30 = node29.isTypeOf();
        com.google.javascript.rhino.Node node31 = node19.srcrefTree(node29);
        boolean boolean32 = node31.isObjectLit();
        boolean boolean33 = node31.isExprResult();
        boolean boolean34 = node14.hasChild(node31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node36 = node31.getChildAtIndex(35);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        boolean boolean8 = node2.isDec();
        boolean boolean9 = node2.isBlock();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean16 = node15.isThis();
        node12.addChildToBack(node15);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable18 = node12.siblings();
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        node12.setDirectives((java.util.Set<java.lang.String>) strSet21);
        int int24 = strSet21.size();
        strSet21.clear();
        node2.setDirectives((java.util.Set<java.lang.String>) strSet21);
        boolean boolean27 = node2.isCase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node29 = node2.getChildAtIndex(31);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 42, 30, 29);
        node3.setSourceFileForTesting("{511159613}");
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean10 = node9.isTypeOf();
        boolean boolean11 = node9.isRegExp();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean15 = node14.isNE();
        boolean boolean16 = node14.isInstanceOf();
        boolean boolean17 = node14.isThrow();
        node14.setCharno(54);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable20 = node14.getAncestors();
        java.util.Set<java.lang.String> strSet21 = node14.getDirectives();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean28 = node27.isThis();
        node24.addChildToBack(node27);
        boolean boolean30 = node24.isDebugger();
        boolean boolean31 = node24.isVoid();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean35 = node34.isTypeOf();
        com.google.javascript.rhino.Node node36 = node24.srcrefTree(node34);
        boolean boolean37 = node36.hasMoreThanOneChild();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder38 = node36.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean45 = node44.isThis();
        node41.addChildToBack(node44);
        boolean boolean47 = node41.isDebugger();
        node41.setSourceFileForTesting("");
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean56 = node55.isThis();
        node52.addChildToBack(node55);
        boolean boolean58 = node55.isNot();
        int int59 = node55.getLineno();
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean66 = node65.isThis();
        node62.addChildToBack(node65);
        boolean boolean68 = node65.isNot();
        int int69 = node65.getLineno();
        com.google.javascript.rhino.Node node70 = node55.srcref(node65);
        int int71 = node55.getCharno();
        com.google.javascript.rhino.Node node72 = node41.copyInformationFrom(node55);
        java.lang.String str73 = node41.getQualifiedName();
        com.google.javascript.rhino.Node node76 = new com.google.javascript.rhino.Node(2, node9, node14, node36, node41, 36, 32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node77 = node3.getChildBefore(node14);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        boolean boolean8 = node2.isDebugger();
        boolean boolean9 = node2.isVoid();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean13 = node12.isTypeOf();
        com.google.javascript.rhino.Node node14 = node2.srcrefTree(node12);
        boolean boolean15 = node14.hasMoreThanOneChild();
        int int16 = node14.getCharno();
        node14.setString("?");
        boolean boolean19 = node14.isSyntheticBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node21 = node14.getChildAtIndex((int) '4');
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("hi!");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean8 = node7.isThis();
        node4.addChildToBack(node7);
        boolean boolean10 = node4.isDebugger();
        boolean boolean11 = node4.isVoid();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean15 = node14.isTypeOf();
        com.google.javascript.rhino.Node node16 = node4.srcrefTree(node14);
        boolean boolean17 = node16.isObjectLit();
        boolean boolean18 = node16.isExprResult();
        com.google.javascript.rhino.Node node19 = node1.useSourceInfoIfMissingFrom(node16);
        boolean boolean20 = node19.isNoSideEffectsCall();
        boolean boolean21 = node19.isVoid();
        com.google.javascript.rhino.InputId inputId22 = node19.getInputId();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean29 = node28.isThis();
        node25.addChildToBack(node28);
        boolean boolean31 = node28.isAdd();
        boolean boolean32 = node28.isExprResult();
        boolean boolean33 = node28.isThrow();
        boolean boolean34 = node28.isVarArgs();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) 54);
        com.google.javascript.rhino.Node node37 = node28.useSourceInfoFrom(node36);
        node28.setLineno(5);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean47 = node46.isThis();
        node43.addChildToBack(node46);
        boolean boolean49 = node43.isDebugger();
        com.google.javascript.rhino.Node node50 = node43.getFirstChild();
        boolean boolean51 = node43.isNot();
        boolean boolean52 = node43.isIn();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean60 = node59.isThis();
        node56.addChildToBack(node59);
        boolean boolean62 = node56.isDebugger();
        boolean boolean63 = node56.isAssign();
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node(51, node56, (int) (short) 10, 0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable67 = node66.getAncestors();
        com.google.javascript.rhino.Node node70 = new com.google.javascript.rhino.Node(1, node43, node66, 54, 10);
        int int71 = node28.getIndexOfChild(node70);
        boolean boolean72 = node19.hasChild(node70);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node74 = node70.getChildAtIndex(49);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(40, "OR hi!\n    OR hi!\n", 16, 40);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean11 = node10.isThis();
        node7.addChildToBack(node10);
        node10.setOptionalArg(false);
        boolean boolean15 = node10.isName();
        boolean boolean16 = node10.isRegExp();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean23 = node22.isThis();
        node19.addChildToBack(node22);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable25 = node19.siblings();
        node19.setSourceFileForTesting("[]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.replaceChild(node10, node19);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean7 = node6.isThis();
        node3.addChildToBack(node6);
        boolean boolean9 = node3.isDebugger();
        node3.setSourceFileForTesting("");
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean18 = node17.isThis();
        node14.addChildToBack(node17);
        boolean boolean20 = node17.isNot();
        int int21 = node17.getLineno();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean28 = node27.isThis();
        node24.addChildToBack(node27);
        boolean boolean30 = node27.isNot();
        int int31 = node27.getLineno();
        com.google.javascript.rhino.Node node32 = node17.srcref(node27);
        int int33 = node17.getCharno();
        com.google.javascript.rhino.Node node34 = node3.copyInformationFrom(node17);
        boolean boolean35 = node3.isTrue();
        boolean boolean36 = node3.isCase();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(52, node3);
        java.lang.String str38 = node37.toString();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean46 = node45.isThis();
        node42.addChildToBack(node45);
        boolean boolean48 = node42.isDebugger();
        node42.setSourceFileForTesting("");
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean57 = node56.isThis();
        node53.addChildToBack(node56);
        boolean boolean59 = node56.isNot();
        int int60 = node56.getLineno();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean67 = node66.isThis();
        node63.addChildToBack(node66);
        boolean boolean69 = node66.isNot();
        int int70 = node66.getLineno();
        com.google.javascript.rhino.Node node71 = node56.srcref(node66);
        int int72 = node56.getCharno();
        com.google.javascript.rhino.Node node73 = node42.copyInformationFrom(node56);
        boolean boolean74 = node42.isTrue();
        boolean boolean75 = node42.isCase();
        com.google.javascript.rhino.Node node76 = new com.google.javascript.rhino.Node(52, node42);
        com.google.javascript.rhino.Node node77 = node37.srcrefTree(node76);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node79 = node37.getChildAtIndex((int) (byte) 100);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable8 = node2.siblings();
        node2.setWasEmptyNode(true);
        com.google.javascript.rhino.Node node11 = node2.getLastChild();
        boolean boolean12 = node2.isCall();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean19 = node18.isThis();
        node15.addChildToBack(node18);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable21 = node15.siblings();
        node15.setWasEmptyNode(true);
        com.google.javascript.rhino.Node node24 = node15.getLastChild();
        boolean boolean25 = node15.isCall();
        com.google.javascript.rhino.Node node26 = node2.copyInformationFrom(node15);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean33 = node32.isThis();
        node29.addChildToBack(node32);
        boolean boolean35 = node29.isDebugger();
        boolean boolean36 = node29.isVoid();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean40 = node39.isTypeOf();
        com.google.javascript.rhino.Node node41 = node29.srcrefTree(node39);
        node26.addChildrenToFront(node29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node44 = node29.getChildAtIndex((int) (byte) 100);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        boolean boolean8 = node5.isNot();
        int int9 = node5.getLineno();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean16 = node15.isThis();
        node12.addChildToBack(node15);
        boolean boolean18 = node15.isNot();
        int int19 = node15.getLineno();
        com.google.javascript.rhino.Node node20 = node5.srcref(node15);
        boolean boolean21 = node20.isDelProp();
        boolean boolean22 = node20.isExprResult();
        int int23 = node20.getLineno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node25 = node20.getChildAtIndex(30);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString((int) (short) -1, "hi!", 4095, 8202);
        boolean boolean5 = node4.isCase();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean12 = node11.isThis();
        node8.addChildToBack(node11);
        boolean boolean14 = node11.isNot();
        int int15 = node11.getLineno();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean22 = node21.isThis();
        node18.addChildToBack(node21);
        boolean boolean24 = node21.isNot();
        int int25 = node21.getLineno();
        com.google.javascript.rhino.Node node26 = node11.srcref(node21);
        boolean boolean27 = node26.isDelProp();
        int int28 = node26.getChildCount();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber(10.0d);
        com.google.javascript.rhino.Node node31 = node26.copyInformationFromForTree(node30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.removeChild(node30);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 10);
        boolean boolean2 = node1.isBreak();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean9 = node8.isThis();
        node5.addChildToBack(node8);
        int int11 = node5.getCharno();
        java.lang.String str12 = node5.toStringTree();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node13 = node1.getChildBefore(node5);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        boolean boolean8 = node5.isNot();
        int int9 = node5.getLineno();
        boolean boolean10 = node5.isAdd();
        com.google.javascript.rhino.Node node11 = node5.cloneTree();
        java.lang.String str12 = node11.toStringTree();
        boolean boolean13 = node11.isNE();
        boolean boolean14 = node11.isLocalResultCall();
        int int16 = node11.getIntProp(46);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean20 = node19.isThis();
        boolean boolean21 = node19.isCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean23 = jSDocInfo22.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression24 = jSDocInfo22.getType();
        boolean boolean25 = jSDocInfo22.isNoTypeCheck();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString((int) ' ', "OR hi!\n");
        jSDocInfo22.setAssociatedNode(node28);
        boolean boolean30 = node28.isNoSideEffectsCall();
        boolean boolean31 = node19.isEquivalentTo(node28);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean38 = node37.isThis();
        node34.addChildToBack(node37);
        boolean boolean40 = node37.isNot();
        int int41 = node37.getLineno();
        boolean boolean42 = node37.isAdd();
        com.google.javascript.rhino.Node node43 = node37.cloneTree();
        boolean boolean44 = node37.isWith();
        com.google.javascript.rhino.Node node45 = node28.srcrefTree(node37);
        boolean boolean46 = node28.isSwitch();
        boolean boolean47 = node28.isDebugger();
        java.lang.String str51 = node28.toString(false, true, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node11.removeChild(node28);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean7 = node6.isThis();
        node3.addChildToBack(node6);
        boolean boolean9 = node3.isDebugger();
        node3.setSourceFileForTesting("");
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean18 = node17.isThis();
        node14.addChildToBack(node17);
        boolean boolean20 = node17.isNot();
        int int21 = node17.getLineno();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean28 = node27.isThis();
        node24.addChildToBack(node27);
        boolean boolean30 = node27.isNot();
        int int31 = node27.getLineno();
        com.google.javascript.rhino.Node node32 = node17.srcref(node27);
        int int33 = node17.getCharno();
        com.google.javascript.rhino.Node node34 = node3.copyInformationFrom(node17);
        boolean boolean35 = node3.isTrue();
        boolean boolean36 = node3.isCase();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(52, node3);
        java.lang.String str38 = node37.toString();
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean40 = jSDocInfo39.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression41 = jSDocInfo39.getType();
        boolean boolean42 = jSDocInfo39.isImplicitCast();
        boolean boolean43 = jSDocInfo39.isInterface();
        boolean boolean44 = jSDocInfo39.hasFileOverview();
        node37.setJSDocInfo(jSDocInfo39);
        boolean boolean46 = node37.isBreak();
        boolean boolean47 = node37.isNot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node49 = node37.getChildAtIndex((int) '4');
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        com.google.javascript.rhino.Node[] nodeArray3 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((int) 'a', nodeArray3, 8202, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(4098, nodeArray3);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (short) 10, nodeArray3, 44, (int) (short) 10);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean17 = node16.isThis();
        node13.addChildToBack(node16);
        boolean boolean19 = node13.isDebugger();
        boolean boolean21 = node13.getBooleanProp((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node22 = node10.getChildBefore(node13);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        boolean boolean8 = node5.isNot();
        int int9 = node5.getLineno();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean16 = node15.isThis();
        node12.addChildToBack(node15);
        boolean boolean18 = node15.isNot();
        int int19 = node15.getLineno();
        com.google.javascript.rhino.Node node20 = node5.srcref(node15);
        boolean boolean21 = node20.isDelProp();
        com.google.javascript.rhino.Node node22 = node20.getLastSibling();
        boolean boolean23 = node22.isFunction();
        java.lang.Object obj25 = node22.getProp((int) ' ');
        com.google.javascript.rhino.Node node26 = node22.getLastSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node28 = node26.getChildAtIndex(13);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 10);
        boolean boolean2 = node1.isBreak();
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(31, 1, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node6);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean3 = node2.isThis();
        com.google.javascript.rhino.Node node4 = node2.getNext();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean11 = node10.isThis();
        node7.addChildToBack(node10);
        node10.removeProp(1);
        boolean boolean15 = node10.isEmpty();
        boolean boolean16 = node10.isString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.removeChild(node10);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable8 = node2.siblings();
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        node2.setDirectives((java.util.Set<java.lang.String>) strSet11);
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList14 = com.google.common.collect.ImmutableList.of();
        java.lang.Object[] objArray15 = nodeIterableList14.toArray();
        boolean boolean16 = strSet11.removeAll((java.util.Collection<java.lang.Iterable<com.google.javascript.rhino.Node>>) nodeIterableList14);
        int int17 = nodeIterableList14.size();
        java.util.ListIterator<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableItor18 = nodeIterableList14.listIterator();
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder19 = new com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>>();
        com.google.common.collect.ImmutableList<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumList20 = visibilityEnumBuilder19.build();
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean22 = jSDocInfo21.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression23 = jSDocInfo21.getType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility24 = jSDocInfo21.getVisibility();
        boolean boolean25 = jSDocInfo21.shouldPreserveTry();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility26 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        jSDocInfo21.setVisibility(visibility26);
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder28 = visibilityEnumBuilder19.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>) visibility26);
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder29 = new com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>>();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility30 = com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC;
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder31 = visibilityEnumBuilder29.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>) visibility30);
        com.google.javascript.rhino.JSDocInfo jSDocInfo32 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean33 = jSDocInfo32.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression34 = jSDocInfo32.getType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility35 = jSDocInfo32.getVisibility();
        boolean boolean36 = jSDocInfo32.shouldPreserveTry();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility37 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        jSDocInfo32.setVisibility(visibility37);
        com.google.javascript.rhino.JSDocInfo.Visibility[] visibilityArray39 = new com.google.javascript.rhino.JSDocInfo.Visibility[] { visibility37 };
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder40 = visibilityEnumBuilder31.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>[]) visibilityArray39);
        com.google.common.collect.ImmutableCollection.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder41 = visibilityEnumBuilder28.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>[]) visibilityArray39);
        boolean boolean42 = nodeIterableList14.contains((java.lang.Object) visibilityArray39);
        com.google.javascript.rhino.jstype.JSType[][] jSTypeArray43 = new com.google.javascript.rhino.jstype.JSType[][] {};
        com.google.javascript.rhino.jstype.JSType[][][] jSTypeArray44 = new com.google.javascript.rhino.jstype.JSType[][][] { jSTypeArray43 };
        com.google.javascript.rhino.jstype.JSType[][][] jSTypeArray45 = nodeIterableList14.toArray(jSTypeArray44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSType[][]> jSTypeArrayList46 = com.google.common.collect.ImmutableList.copyOf(jSTypeArray44);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean7 = node6.isThis();
        node3.addChildToBack(node6);
        boolean boolean9 = node3.isDebugger();
        com.google.javascript.rhino.Node node10 = node3.getFirstChild();
        boolean boolean11 = node3.isNot();
        boolean boolean12 = node3.isIn();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean20 = node19.isThis();
        node16.addChildToBack(node19);
        boolean boolean22 = node16.isDebugger();
        boolean boolean23 = node16.isAssign();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(51, node16, (int) (short) 10, 0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable27 = node26.getAncestors();
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(1, node3, node26, 54, 10);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable31 = node3.siblings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node33 = node3.getChildAtIndex(16);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        boolean boolean8 = node5.isNot();
        int int9 = node5.getLineno();
        boolean boolean10 = node5.isAdd();
        node5.setSourceEncodedPosition((int) (byte) 1);
        boolean boolean13 = node5.isDec();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean21 = node20.isThis();
        node17.addChildToBack(node20);
        boolean boolean23 = node17.isDebugger();
        boolean boolean24 = node17.isAssign();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(51, node17, (int) (short) 10, 0);
        com.google.javascript.rhino.Node node28 = node5.srcrefTree(node27);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean35 = node34.isThis();
        node31.addChildToBack(node34);
        boolean boolean37 = node31.isDebugger();
        com.google.javascript.rhino.Node node38 = node31.getFirstChild();
        boolean boolean39 = node31.isNot();
        com.google.javascript.rhino.JSDocInfo jSDocInfo40 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean41 = jSDocInfo40.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression42 = jSDocInfo40.getType();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean46 = node45.isTypeOf();
        jSDocInfo40.setAssociatedNode(node45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node5.replaceChild(node31, node45);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        boolean boolean8 = node2.isDec();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean15 = node14.isThis();
        node11.addChildToBack(node14);
        boolean boolean17 = node11.isDebugger();
        boolean boolean18 = node11.isVoid();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean22 = node21.isTypeOf();
        com.google.javascript.rhino.Node node23 = node11.srcrefTree(node21);
        int int24 = node2.getIndexOfChild(node21);
        boolean boolean25 = node2.isOptionalArg();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node27 = node2.getChildAtIndex(35);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean3 = node2.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean10 = node9.isThis();
        node6.addChildToBack(node9);
        boolean boolean12 = node6.isDebugger();
        boolean boolean13 = node6.isVoid();
        boolean boolean14 = node6.isOptionalArg();
        int int15 = node2.getIndexOfChild(node6);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression17 = new com.google.javascript.rhino.JSTypeExpression(node2, "{1604895782}");
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean21 = node20.isNE();
        boolean boolean22 = node20.isInstanceOf();
        boolean boolean23 = node20.isThrow();
        boolean boolean24 = node20.isWhile();
        boolean boolean25 = node20.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node26 = node20.removeChildren();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder27 = node20.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node28 = node2.useSourceInfoFromForTree(node20);
        boolean boolean29 = node20.isInstanceOf();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean38 = node37.isThis();
        node34.addChildToBack(node37);
        boolean boolean40 = node34.isDebugger();
        boolean boolean41 = node34.isAssign();
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node(51, node34, (int) (short) 10, 0);
        com.google.javascript.rhino.Node node45 = node44.getLastChild();
        boolean boolean46 = node44.isTrue();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(51, node44, 44, 200716);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node20.removeChild(node49);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 83, (int) (short) 100, 47);
        boolean boolean4 = node3.isQuotedString();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean11 = node10.isThis();
        node7.addChildToBack(node10);
        boolean boolean13 = node10.isNot();
        int int14 = node10.getLineno();
        boolean boolean15 = node10.isAdd();
        com.google.javascript.rhino.Node node16 = node10.cloneTree();
        java.lang.String str17 = node16.toStringTree();
        boolean boolean18 = node16.isNE();
        boolean boolean19 = node16.isLocalResultCall();
        int int21 = node16.getIntProp(46);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(31);
        com.google.javascript.rhino.Node node24 = node16.srcref(node23);
        com.google.javascript.rhino.Node node25 = node3.srcref(node23);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean29 = node28.isNE();
        boolean boolean30 = node28.isInstanceOf();
        boolean boolean31 = node28.isThrow();
        node28.setCharno(54);
        boolean boolean34 = node28.isDebugger();
        boolean boolean35 = node28.isOr();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node25.removeChild(node28);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        boolean boolean8 = node5.isNot();
        int int9 = node5.getLineno();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean16 = node15.isThis();
        node12.addChildToBack(node15);
        boolean boolean18 = node15.isNot();
        int int19 = node15.getLineno();
        com.google.javascript.rhino.Node node20 = node5.srcref(node15);
        int int21 = node5.getCharno();
        boolean boolean22 = node5.isQuotedString();
        boolean boolean23 = node5.isBreak();
        boolean boolean24 = node5.wasEmptyNode();
        boolean boolean25 = node5.isVarArgs();
        com.google.javascript.rhino.Node node26 = node5.detachFromParent();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable27 = node26.getAncestors();
        boolean boolean28 = node26.isLocalResultCall();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node30 = node26.getChildAtIndex(30);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(40);
        java.lang.String str2 = node1.getQualifiedName();
        boolean boolean3 = node1.isLabelName();
        node1.putBooleanProp(46, false);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("hi!");
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean15 = node14.isThis();
        node11.addChildToBack(node14);
        boolean boolean17 = node11.isDebugger();
        boolean boolean18 = node11.isVoid();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean22 = node21.isTypeOf();
        com.google.javascript.rhino.Node node23 = node11.srcrefTree(node21);
        boolean boolean24 = node23.isObjectLit();
        boolean boolean25 = node23.isExprResult();
        com.google.javascript.rhino.Node node26 = node8.useSourceInfoIfMissingFrom(node23);
        boolean boolean27 = node26.isAnd();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node28 = node1.getChildBefore(node26);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList0 = com.google.common.collect.ImmutableList.of();
        java.lang.Object[] objArray1 = nodeIterableList0.toArray();
        boolean boolean2 = nodeIterableList0.isEmpty();
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder3 = new com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>>();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility4 = com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC;
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder5 = visibilityEnumBuilder3.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>) visibility4);
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder6 = new com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>>();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility7 = com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC;
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder8 = visibilityEnumBuilder6.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>) visibility7);
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean10 = jSDocInfo9.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = jSDocInfo9.getType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility12 = jSDocInfo9.getVisibility();
        boolean boolean13 = jSDocInfo9.shouldPreserveTry();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility14 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        jSDocInfo9.setVisibility(visibility14);
        com.google.javascript.rhino.JSDocInfo.Visibility[] visibilityArray16 = new com.google.javascript.rhino.JSDocInfo.Visibility[] { visibility14 };
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder17 = visibilityEnumBuilder8.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>[]) visibilityArray16);
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder18 = new com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>>();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility19 = com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC;
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder20 = visibilityEnumBuilder18.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>) visibility19);
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean22 = jSDocInfo21.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression23 = jSDocInfo21.getType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility24 = jSDocInfo21.getVisibility();
        boolean boolean25 = jSDocInfo21.shouldPreserveTry();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility26 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        jSDocInfo21.setVisibility(visibility26);
        com.google.javascript.rhino.JSDocInfo.Visibility[] visibilityArray28 = new com.google.javascript.rhino.JSDocInfo.Visibility[] { visibility26 };
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder29 = visibilityEnumBuilder20.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>[]) visibilityArray28);
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder30 = visibilityEnumBuilder17.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>[]) visibilityArray28);
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder31 = visibilityEnumBuilder5.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>[]) visibilityArray28);
        java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>[] visibilityEnumArray32 = nodeIterableList0.toArray((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>[]) visibilityArray28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList33 = com.google.common.collect.ImmutableList.copyOf((java.io.Serializable[]) visibilityEnumArray32);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList0 = com.google.common.collect.ImmutableList.of();
        java.lang.Object[] objArray1 = nodeIterableList0.toArray();
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList2 = nodeIterableList0.reverse();
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList6 = com.google.common.collect.ImmutableList.of();
        java.lang.Object[] objArray7 = nodeIterableList6.toArray();
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList8 = nodeIterableList6.reverse();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean16 = node15.isThis();
        node12.addChildToBack(node15);
        java.lang.Object[] objArray18 = new java.lang.Object[] { 45, (short) -1, (short) -1, nodeIterableList8, 52, node15 };
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList22 = com.google.common.collect.ImmutableList.of();
        java.lang.Object[] objArray23 = nodeIterableList22.toArray();
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList24 = nodeIterableList22.reverse();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean32 = node31.isThis();
        node28.addChildToBack(node31);
        java.lang.Object[] objArray34 = new java.lang.Object[] { 45, (short) -1, (short) -1, nodeIterableList24, 52, node31 };
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList38 = com.google.common.collect.ImmutableList.of();
        java.lang.Object[] objArray39 = nodeIterableList38.toArray();
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList40 = nodeIterableList38.reverse();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean48 = node47.isThis();
        node44.addChildToBack(node47);
        java.lang.Object[] objArray50 = new java.lang.Object[] { 45, (short) -1, (short) -1, nodeIterableList40, 52, node47 };
        java.lang.Object[][] objArray51 = new java.lang.Object[][] { objArray18, objArray34, objArray50 };
        java.lang.Object[][] objArray52 = nodeIterableList2.toArray(objArray51);
        java.util.stream.Stream<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableStream53 = nodeIterableList2.parallelStream();
        boolean boolean54 = nodeIterableList2.isEmpty();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableItor55 = nodeIterableList2.listIterator();
        int int56 = nodeIterableList2.size();
        java.util.Iterator<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableItor57 = nodeIterableList2.iterator();
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList58 = com.google.common.collect.ImmutableList.of();
        java.lang.Object[] objArray59 = nodeIterableList58.toArray();
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList60 = nodeIterableList58.reverse();
        java.util.stream.Stream<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableStream61 = nodeIterableList58.stream();
        java.lang.String[] strArray63 = new java.lang.String[] { "OR hi!\n" };
        java.lang.String[] strArray64 = nodeIterableList58.toArray(strArray63);
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList65 = com.google.common.collect.ImmutableList.of();
        java.lang.Object[] objArray66 = nodeIterableList65.toArray();
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList67 = nodeIterableList65.reverse();
        java.util.stream.Stream<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableStream68 = nodeIterableList65.stream();
        java.lang.String[] strArray70 = new java.lang.String[] { "OR hi!\n" };
        java.lang.String[] strArray71 = nodeIterableList65.toArray(strArray70);
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList72 = com.google.common.collect.ImmutableList.of();
        java.lang.Object[] objArray73 = nodeIterableList72.toArray();
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList74 = nodeIterableList72.reverse();
        java.util.stream.Stream<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableStream75 = nodeIterableList72.stream();
        java.lang.String[] strArray77 = new java.lang.String[] { "OR hi!\n" };
        java.lang.String[] strArray78 = nodeIterableList72.toArray(strArray77);
        java.lang.String[] strArray83 = new java.lang.String[] { "Not declared as a type name", "INSTANCEOF", "{1604895782}", "OR hi!\n    OR hi!\n" };
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList84 = com.google.common.collect.ImmutableList.of();
        java.lang.Object[] objArray85 = nodeIterableList84.toArray();
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList86 = nodeIterableList84.reverse();
        java.util.stream.Stream<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableStream87 = nodeIterableList84.stream();
        java.lang.String[] strArray89 = new java.lang.String[] { "OR hi!\n" };
        java.lang.String[] strArray90 = nodeIterableList84.toArray(strArray89);
        com.google.common.collect.ImmutableList<java.lang.String[]> strArrayList91 = com.google.common.collect.ImmutableList.of(strArray63, strArray70, strArray78, strArray83, strArray90);
        java.lang.String[] strArray92 = nodeIterableList2.toArray(strArray90);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList93 = com.google.common.collect.ImmutableList.copyOf((java.lang.Comparable<java.lang.String>[]) strArray92);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        boolean boolean8 = node2.isDebugger();
        boolean boolean9 = node2.isVoid();
        boolean boolean10 = node2.hasOneChild();
        com.google.javascript.rhino.InputId inputId11 = node2.getInputId();
        boolean boolean12 = node2.hasChildren();
        boolean boolean13 = node2.isReturn();
        java.lang.String str14 = node2.toString();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean21 = node20.isThis();
        node17.addChildToBack(node20);
        boolean boolean23 = node20.isNot();
        int int24 = node20.getLineno();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean31 = node30.isThis();
        node27.addChildToBack(node30);
        boolean boolean33 = node30.isNot();
        int int34 = node30.getLineno();
        com.google.javascript.rhino.Node node35 = node20.srcref(node30);
        boolean boolean36 = node35.isDelProp();
        com.google.javascript.rhino.Node node37 = node35.getLastSibling();
        boolean boolean38 = node37.isFunction();
        boolean boolean39 = node37.isComma();
        java.lang.String str43 = node37.toString(false, true, false);
        com.google.javascript.rhino.Node node44 = node37.removeFirstChild();
        com.google.javascript.rhino.jstype.JSType jSType45 = node37.getJSType();
        com.google.javascript.rhino.Node node46 = node2.useSourceInfoFromForTree(node37);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node48 = node2.getChildAtIndex(16);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) '#', 2, (int) (byte) 10);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.siblings();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Set<java.lang.String> strSet6 = jSDocInfo5.getSuppressions();
        boolean boolean7 = jSDocInfo5.isNoSideEffects();
        java.lang.String str8 = jSDocInfo5.getReturnDescription();
        boolean boolean10 = jSDocInfo5.hasParameter("Not declared as a constructor");
        java.lang.String str11 = jSDocInfo5.getMeaning();
        boolean boolean12 = jSDocInfo5.isJavaDispatch();
        node3.setJSDocInfo(jSDocInfo5);
        boolean boolean14 = node3.isDo();
        com.google.javascript.rhino.InputId inputId16 = new com.google.javascript.rhino.InputId("Node tree inequality:\nTree1:\nPARAM_LIST\n\n\nTree2:\nOR hi! 0\n\n\nSubtree1: PARAM_LIST\n\n\nSubtree2: OR hi! 0\n");
        node3.setInputId(inputId16);
        boolean boolean18 = node3.isSwitch();
        com.google.javascript.rhino.Node node19 = node3.cloneNode();
        int int20 = node19.getType();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean27 = node26.isThis();
        node23.addChildToBack(node26);
        boolean boolean29 = node26.isNot();
        int int30 = node26.getLineno();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean37 = node36.isThis();
        node33.addChildToBack(node36);
        boolean boolean39 = node36.isNot();
        int int40 = node36.getLineno();
        com.google.javascript.rhino.Node node41 = node26.srcref(node36);
        boolean boolean42 = node41.isDelProp();
        com.google.javascript.rhino.Node node43 = node41.getLastSibling();
        boolean boolean44 = node43.isFunction();
        boolean boolean45 = node43.isComma();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable46 = node43.getAncestors();
        node43.setCharno((int) (short) 100);
        boolean boolean49 = node43.isString();
        com.google.javascript.rhino.Node node50 = node43.getLastSibling();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean54 = node53.isThis();
        boolean boolean55 = node53.isDelProp();
        boolean boolean56 = node53.hasChildren();
        boolean boolean57 = node53.isOr();
        boolean boolean58 = node53.isTypeOf();
        boolean boolean59 = node53.isNE();
        com.google.javascript.rhino.Node node60 = node50.srcref(node53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node61 = node19.getChildBefore(node53);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        boolean boolean8 = node2.isDebugger();
        boolean boolean9 = node2.isVoid();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean13 = node12.isTypeOf();
        com.google.javascript.rhino.Node node14 = node2.srcrefTree(node12);
        com.google.javascript.rhino.Node node15 = node2.getLastSibling();
        boolean boolean16 = node2.isNew();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder18 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean19 = jSDocInfoBuilder18.recordInterface();
        boolean boolean21 = jSDocInfoBuilder18.recordDescription("hi!");
        boolean boolean22 = jSDocInfoBuilder18.recordHiddenness();
        boolean boolean23 = jSDocInfoBuilder18.recordExpose();
        boolean boolean24 = jSDocInfoBuilder18.recordNoCompile();
        boolean boolean25 = jSDocInfoBuilder18.isPopulatedWithFileOverview();
        boolean boolean26 = jSDocInfoBuilder18.isPopulated();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean34 = node33.isThis();
        node30.addChildToBack(node33);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable36 = node30.siblings();
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        node30.setDirectives((java.util.Set<java.lang.String>) strSet39);
        node30.putBooleanProp(0, false);
        node30.setSourceFileForTesting("OR hi!\n    OR hi!\n");
        boolean boolean47 = node30.isThrow();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile48 = node30.getStaticSourceFile();
        boolean boolean49 = staticSourceFile48.isExtern();
        int int51 = staticSourceFile48.getLineOffset(16);
        jSDocInfoBuilder18.markName("None", staticSourceFile48, (int) (byte) 1, 43);
        int int56 = staticSourceFile48.getColumnOfOffset(4);
        int int58 = staticSourceFile48.getColumnOfOffset(2);
        node2.setStaticSourceFile(staticSourceFile48);
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString(47, "Unknown class name", (int) (byte) 100, (int) ' ');
        boolean boolean65 = node64.isThrow();
        com.google.javascript.rhino.Node node66 = node2.useSourceInfoIfMissingFrom(node64);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node68 = node66.getChildAtIndex(29);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean7 = node6.isThis();
        node3.addChildToBack(node6);
        boolean boolean9 = node3.isDec();
        boolean boolean10 = node3.isBlock();
        boolean boolean11 = node3.isTrue();
        com.google.javascript.rhino.Node node12 = node3.cloneNode();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(38, node3, (int) (short) 100, 39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node17 = node3.getChildAtIndex(8);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        boolean boolean8 = node5.isNot();
        int int9 = node5.getLineno();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean16 = node15.isThis();
        node12.addChildToBack(node15);
        boolean boolean18 = node15.isNot();
        int int19 = node15.getLineno();
        com.google.javascript.rhino.Node node20 = node5.srcref(node15);
        int int21 = node5.getCharno();
        java.lang.String str25 = node5.toString(true, true, true);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean32 = node31.isThis();
        node28.addChildToBack(node31);
        boolean boolean34 = node31.isNot();
        int int35 = node31.getLineno();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean42 = node41.isThis();
        node38.addChildToBack(node41);
        boolean boolean44 = node41.isNot();
        int int45 = node41.getLineno();
        com.google.javascript.rhino.Node node46 = node31.srcref(node41);
        int int47 = node31.getCharno();
        boolean boolean48 = node31.isQuotedString();
        boolean boolean49 = node31.isIf();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean56 = node55.isThis();
        node52.addChildToBack(node55);
        boolean boolean58 = node55.isNot();
        int int59 = node55.getLineno();
        boolean boolean60 = node55.isAdd();
        com.google.javascript.rhino.Node node61 = node31.useSourceInfoFromForTree(node55);
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean68 = node67.isThis();
        node64.addChildToBack(node67);
        boolean boolean70 = node67.isNot();
        int int71 = node67.getLineno();
        boolean boolean72 = node67.isAdd();
        com.google.javascript.rhino.Node node73 = node67.cloneTree();
        java.lang.Object obj75 = node73.getProp((int) (byte) 0);
        int int76 = node73.getChildCount();
        node61.addChildrenToFront(node73);
        boolean boolean78 = node5.isEquivalentToTyped(node61);
        boolean boolean79 = node5.isWith();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression81 = new com.google.javascript.rhino.JSTypeExpression(node5, "");
        node5.setVarArgs(false);
        com.google.javascript.rhino.JSDocInfo jSDocInfo84 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean85 = jSDocInfo84.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression86 = jSDocInfo84.getType();
        boolean boolean87 = jSDocInfo84.isNoTypeCheck();
        com.google.javascript.rhino.Node node90 = com.google.javascript.rhino.Node.newString((int) ' ', "OR hi!\n");
        jSDocInfo84.setAssociatedNode(node90);
        boolean boolean92 = node90.isNoSideEffectsCall();
        node90.setWasEmptyNode(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node5.removeChild(node90);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable8 = node2.siblings();
        node2.setWasEmptyNode(true);
        com.google.javascript.rhino.Node node11 = node2.getLastChild();
        boolean boolean12 = node2.isCall();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean19 = node18.isThis();
        node15.addChildToBack(node18);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable21 = node15.siblings();
        node15.setWasEmptyNode(true);
        com.google.javascript.rhino.Node node24 = node15.getLastChild();
        boolean boolean25 = node15.isCall();
        com.google.javascript.rhino.Node node26 = node2.copyInformationFrom(node15);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString(41, "function (this:me, {1469723246}): me");
        com.google.javascript.rhino.Node node30 = node15.useSourceInfoIfMissingFrom(node29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node32 = node30.getChildAtIndex(97);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        boolean boolean8 = node5.isAdd();
        boolean boolean9 = node5.isExprResult();
        boolean boolean10 = node5.isThrow();
        boolean boolean11 = node5.isVarArgs();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) 54);
        com.google.javascript.rhino.Node node14 = node5.useSourceInfoFrom(node13);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean22 = node21.isThis();
        node18.addChildToBack(node21);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean30 = node29.isThis();
        node26.addChildToBack(node29);
        boolean boolean32 = node26.isDebugger();
        boolean boolean33 = node26.isSyntheticBlock();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(46);
        boolean boolean36 = node35.isCall();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean43 = node42.isThis();
        node39.addChildToBack(node42);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable45 = node39.siblings();
        java.lang.String[] strArray47 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        node39.setDirectives((java.util.Set<java.lang.String>) strSet48);
        node39.detachChildren();
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node(45, node18, node26, node35, node39, (int) (short) 10, 8);
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString(41, "Node tree inequality:\nTree1:\nOR hi! [empty_block: 1]\n    OR hi!\n\n\nTree2:\nOR hi!\n\n\nSubtree1: OR hi! [empty_block: 1]\n    OR hi!\n\n\nSubtree2: OR hi!\n", 49, 12);
        com.google.javascript.rhino.Node node60 = node35.srcref(node59);
        com.google.javascript.rhino.Node node61 = node13.useSourceInfoIfMissingFromForTree(node60);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node63 = node61.getChildAtIndex(40);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getType();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isTypeOf();
        jSDocInfo0.setAssociatedNode(node5);
        boolean boolean8 = jSDocInfo0.containsDeclaration();
        boolean boolean9 = jSDocInfo0.hasType();
        java.lang.String str10 = jSDocInfo0.getDescription();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(50);
        node12.setLength((int) ' ');
        jSDocInfo0.setAssociatedNode(node12);
        boolean boolean16 = node12.isIf();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 38, (int) (byte) 1, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node12.removeChild(node20);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) ' ', "hi!", 38, (int) (short) 0);
        com.google.javascript.rhino.Node node6 = node5.cloneNode();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((int) (short) 100, node5);
        boolean boolean8 = node5.isBreak();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean12 = node11.isNE();
        boolean boolean13 = node11.wasEmptyNode();
        int int14 = node11.getSourceOffset();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition16 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int17 = stringPosition16.getPositionOnEndLine();
        int int18 = stringPosition16.getEndLine();
        int int19 = stringPosition16.getEndLine();
        stringPosition16.setItem("InputId: ");
        stringPosition16.setItem("{1078264502}");
        node11.putProp(41, (java.lang.Object) stringPosition16);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean31 = node30.isThis();
        node27.addChildToBack(node30);
        boolean boolean33 = node30.isNot();
        int int34 = node30.getLineno();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean41 = node40.isThis();
        node37.addChildToBack(node40);
        boolean boolean43 = node40.isNot();
        int int44 = node40.getLineno();
        com.google.javascript.rhino.Node node45 = node30.srcref(node40);
        int int46 = node30.getCharno();
        boolean boolean47 = node30.isQuotedString();
        boolean boolean48 = node30.isIf();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean55 = node54.isThis();
        node51.addChildToBack(node54);
        boolean boolean57 = node54.isNot();
        int int58 = node54.getLineno();
        boolean boolean59 = node54.isAdd();
        com.google.javascript.rhino.Node node60 = node30.useSourceInfoFromForTree(node54);
        boolean boolean61 = node54.isDo();
        boolean boolean62 = node54.isBlock();
        node54.setWasEmptyNode(true);
        boolean boolean65 = node54.isAnd();
        node54.setSourceEncodedPositionForTree((int) (byte) 10);
        com.google.javascript.rhino.Node node68 = node11.useSourceInfoFrom(node54);
        boolean boolean69 = node68.isGetterDef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node5.removeChild(node68);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("{764597585}", 29, 4095);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(54, node4, 8, 100);
        boolean boolean8 = node4.isInc();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean15 = node14.isThis();
        node11.addChildToBack(node14);
        boolean boolean17 = node14.isAdd();
        boolean boolean18 = node14.isAnd();
        boolean boolean19 = node14.isDo();
        boolean boolean20 = node14.isLocalResultCall();
        node14.setIsSyntheticBlock(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node23 = node4.getChildBefore(node14);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean4 = node3.isTypeOf();
        boolean boolean5 = node3.isRegExp();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean9 = node8.isNE();
        boolean boolean10 = node8.isInstanceOf();
        boolean boolean11 = node8.isThrow();
        node8.setCharno(54);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable14 = node8.getAncestors();
        java.util.Set<java.lang.String> strSet15 = node8.getDirectives();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean22 = node21.isThis();
        node18.addChildToBack(node21);
        boolean boolean24 = node18.isDebugger();
        boolean boolean25 = node18.isVoid();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean29 = node28.isTypeOf();
        com.google.javascript.rhino.Node node30 = node18.srcrefTree(node28);
        boolean boolean31 = node30.hasMoreThanOneChild();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder32 = node30.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean39 = node38.isThis();
        node35.addChildToBack(node38);
        boolean boolean41 = node35.isDebugger();
        node35.setSourceFileForTesting("");
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean50 = node49.isThis();
        node46.addChildToBack(node49);
        boolean boolean52 = node49.isNot();
        int int53 = node49.getLineno();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean60 = node59.isThis();
        node56.addChildToBack(node59);
        boolean boolean62 = node59.isNot();
        int int63 = node59.getLineno();
        com.google.javascript.rhino.Node node64 = node49.srcref(node59);
        int int65 = node49.getCharno();
        com.google.javascript.rhino.Node node66 = node35.copyInformationFrom(node49);
        java.lang.String str67 = node35.getQualifiedName();
        com.google.javascript.rhino.Node node70 = new com.google.javascript.rhino.Node(2, node3, node8, node30, node35, 36, 32);
        com.google.javascript.rhino.Node node71 = node3.removeFirstChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node73 = node3.getChildAtIndex(143360);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", 43, 46);
        boolean boolean4 = node3.isVoid();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((int) '4');
        boolean boolean8 = node7.isInstanceOf();
        com.google.javascript.rhino.Node node9 = node7.getLastChild();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean16 = node15.isThis();
        node12.addChildToBack(node15);
        boolean boolean18 = node12.isDec();
        boolean boolean19 = node12.isBlock();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean26 = node25.isThis();
        node22.addChildToBack(node25);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable28 = node22.siblings();
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        node22.setDirectives((java.util.Set<java.lang.String>) strSet31);
        int int34 = strSet31.size();
        strSet31.clear();
        node12.setDirectives((java.util.Set<java.lang.String>) strSet31);
        boolean boolean37 = node12.isCase();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable38 = node12.siblings();
        int int39 = node12.getLineno();
        boolean boolean40 = node12.isNumber();
        boolean boolean41 = node12.isOptionalArg();
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node(100, node7, node12, 50, (int) 'a');
        com.google.javascript.rhino.Node node45 = node7.detachFromParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node45);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean7 = node6.isThis();
        node3.addChildToBack(node6);
        boolean boolean9 = node3.isDec();
        boolean boolean10 = node3.isBlock();
        boolean boolean11 = node3.isTrue();
        com.google.javascript.rhino.Node node12 = node3.cloneNode();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(38, node3, (int) (short) 100, 39);
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = node15.getJSDocInfo();
        boolean boolean18 = node15.getBooleanProp(200716);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node20 = node15.getChildAtIndex(46);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean3 = node2.isThis();
        boolean boolean4 = node2.isCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean6 = jSDocInfo5.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo5.getType();
        boolean boolean8 = jSDocInfo5.isNoTypeCheck();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString((int) ' ', "OR hi!\n");
        jSDocInfo5.setAssociatedNode(node11);
        boolean boolean13 = node11.isNoSideEffectsCall();
        boolean boolean14 = node2.isEquivalentTo(node11);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean21 = node20.isThis();
        node17.addChildToBack(node20);
        boolean boolean23 = node20.isNot();
        int int24 = node20.getLineno();
        boolean boolean25 = node20.isAdd();
        com.google.javascript.rhino.Node node26 = node20.cloneTree();
        boolean boolean27 = node20.isWith();
        com.google.javascript.rhino.Node node28 = node11.srcrefTree(node20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node30 = node28.getChildAtIndex(12);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        boolean boolean8 = node2.isDebugger();
        boolean boolean9 = node2.isAssign();
        boolean boolean10 = node2.isInstanceOf();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node12 = node2.getChildAtIndex(42);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        boolean boolean8 = node5.isNot();
        int int9 = node5.getLineno();
        boolean boolean10 = node5.isAdd();
        com.google.javascript.rhino.Node node11 = node5.cloneTree();
        java.lang.String str12 = node11.toStringTree();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean16 = node15.isThis();
        boolean boolean17 = node15.isDelProp();
        boolean boolean18 = node15.hasChildren();
        boolean boolean19 = node15.isOr();
        boolean boolean20 = node15.isAnd();
        com.google.javascript.rhino.Node node21 = node11.srcref(node15);
        boolean boolean22 = node21.isTry();
        boolean boolean23 = node21.isStringKey();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean27 = node26.isDebugger();
        com.google.javascript.rhino.InputId inputId29 = new com.google.javascript.rhino.InputId("");
        java.lang.String str30 = inputId29.getIdName();
        node26.setInputId(inputId29);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean35 = node34.isDebugger();
        boolean boolean36 = inputId29.equals((java.lang.Object) node34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node21.removeChild(node34);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        boolean boolean8 = node2.isDebugger();
        boolean boolean9 = node2.isVoid();
        boolean boolean10 = node2.hasOneChild();
        com.google.javascript.rhino.InputId inputId11 = node2.getInputId();
        java.lang.String str12 = node2.toStringTree();
        com.google.javascript.rhino.Node node13 = node2.removeFirstChild();
        boolean boolean14 = node2.isVarArgs();
        boolean boolean15 = node2.isNot();
        boolean boolean16 = node2.isName();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean23 = node22.isThis();
        node19.addChildToBack(node22);
        boolean boolean25 = node19.isDebugger();
        boolean boolean26 = node19.isVoid();
        boolean boolean27 = node19.hasOneChild();
        com.google.javascript.rhino.InputId inputId28 = node19.getInputId();
        boolean boolean29 = node19.hasChildren();
        int int30 = node19.getLength();
        java.lang.String str31 = node19.getString();
        com.google.javascript.rhino.Node node32 = node2.clonePropsFrom(node19);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("{764597585}", 29, 4095);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(54, node37, 8, 100);
        boolean boolean41 = node37.isInc();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.removeChild(node37);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable8 = node2.siblings();
        node2.setWasEmptyNode(true);
        com.google.javascript.rhino.Node node11 = node2.getLastChild();
        int int12 = node11.getType();
        boolean boolean13 = node11.wasEmptyNode();
        java.lang.String str14 = node11.toStringTree();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean21 = node20.isThis();
        node17.addChildToBack(node20);
        boolean boolean23 = node17.isDebugger();
        com.google.javascript.rhino.Node node24 = node17.getFirstChild();
        boolean boolean25 = node17.isSwitch();
        int int26 = node17.getLineno();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean33 = node32.isThis();
        node29.addChildToBack(node32);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable35 = node29.siblings();
        node29.setWasEmptyNode(true);
        com.google.javascript.rhino.Node node38 = node29.getLastChild();
        boolean boolean39 = node29.isCall();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean46 = node45.isThis();
        node42.addChildToBack(node45);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable48 = node42.siblings();
        node42.setWasEmptyNode(true);
        com.google.javascript.rhino.Node node51 = node42.getLastChild();
        boolean boolean52 = node42.isCall();
        com.google.javascript.rhino.Node node53 = node29.copyInformationFrom(node42);
        boolean boolean54 = node53.isAnd();
        boolean boolean55 = node53.isTrue();
        node17.addChildToBack(node53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node57 = node11.getChildBefore(node17);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean4 = node3.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node5 = node3.getLastSibling();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(40, node3, (int) (byte) 10, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node10 = node3.getChildAtIndex(7);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        boolean boolean8 = node5.isNot();
        int int9 = node5.getLineno();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean16 = node15.isThis();
        node12.addChildToBack(node15);
        boolean boolean18 = node15.isNot();
        int int19 = node15.getLineno();
        com.google.javascript.rhino.Node node20 = node5.srcref(node15);
        int int21 = node5.getCharno();
        boolean boolean22 = node5.isQuotedString();
        boolean boolean23 = node5.isIf();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean30 = node29.isThis();
        node26.addChildToBack(node29);
        boolean boolean32 = node29.isNot();
        int int33 = node29.getLineno();
        boolean boolean34 = node29.isAdd();
        com.google.javascript.rhino.Node node35 = node5.useSourceInfoFromForTree(node29);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable36 = node35.getAncestors();
        com.google.javascript.rhino.Node node38 = node35.getAncestor(52);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean45 = node44.isThis();
        node41.addChildToBack(node44);
        boolean boolean47 = node44.isCatch();
        boolean boolean48 = node44.isDefaultCase();
        boolean boolean49 = node44.isCatch();
        boolean boolean50 = node44.isVar();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node51 = node35.getChildBefore(node44);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean7 = node6.isThis();
        node3.addChildToBack(node6);
        boolean boolean9 = node3.isDebugger();
        node3.setSourceFileForTesting("");
        java.lang.String[] strArray14 = new java.lang.String[] { "OR hi!\n", "" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        boolean boolean17 = strSet15.isEmpty();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean24 = node23.isThis();
        node20.addChildToBack(node23);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable26 = node20.siblings();
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        node20.setDirectives((java.util.Set<java.lang.String>) strSet29);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean38 = node37.isThis();
        node34.addChildToBack(node37);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable40 = node34.siblings();
        java.lang.String[] strArray42 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet43 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet43, strArray42);
        node34.setDirectives((java.util.Set<java.lang.String>) strSet43);
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList46 = com.google.common.collect.ImmutableList.of();
        java.lang.Object[] objArray47 = nodeIterableList46.toArray();
        boolean boolean48 = strSet43.removeAll((java.util.Collection<java.lang.Iterable<com.google.javascript.rhino.Node>>) nodeIterableList46);
        com.google.common.collect.ImmutableList<java.util.LinkedHashSet<java.lang.String>> strSetList49 = com.google.common.collect.ImmutableList.of(strSet15, strSet29, strSet43);
        int int50 = strSet29.size();
        node3.setDirectives((java.util.Set<java.lang.String>) strSet29);
        boolean boolean52 = node3.isLabelName();
        boolean boolean53 = node3.isNumber();
        int int54 = node3.getSideEffectFlags();
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node(54, node3, 35, 43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node59 = node57.getChildAtIndex(35);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList0 = com.google.common.collect.ImmutableList.of();
        java.lang.Object[] objArray1 = nodeIterableList0.toArray();
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList2 = nodeIterableList0.reverse();
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList6 = com.google.common.collect.ImmutableList.of();
        java.lang.Object[] objArray7 = nodeIterableList6.toArray();
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList8 = nodeIterableList6.reverse();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean16 = node15.isThis();
        node12.addChildToBack(node15);
        java.lang.Object[] objArray18 = new java.lang.Object[] { 45, (short) -1, (short) -1, nodeIterableList8, 52, node15 };
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList22 = com.google.common.collect.ImmutableList.of();
        java.lang.Object[] objArray23 = nodeIterableList22.toArray();
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList24 = nodeIterableList22.reverse();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean32 = node31.isThis();
        node28.addChildToBack(node31);
        java.lang.Object[] objArray34 = new java.lang.Object[] { 45, (short) -1, (short) -1, nodeIterableList24, 52, node31 };
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList38 = com.google.common.collect.ImmutableList.of();
        java.lang.Object[] objArray39 = nodeIterableList38.toArray();
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList40 = nodeIterableList38.reverse();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean48 = node47.isThis();
        node44.addChildToBack(node47);
        java.lang.Object[] objArray50 = new java.lang.Object[] { 45, (short) -1, (short) -1, nodeIterableList40, 52, node47 };
        java.lang.Object[][] objArray51 = new java.lang.Object[][] { objArray18, objArray34, objArray50 };
        java.lang.Object[][] objArray52 = nodeIterableList2.toArray(objArray51);
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList53 = com.google.common.collect.ImmutableList.of();
        java.lang.Object[] objArray54 = nodeIterableList53.toArray();
        int int56 = nodeIterableList53.lastIndexOf((java.lang.Object) (short) 0);
        java.lang.Object[] objArray57 = nodeIterableList53.toArray();
        boolean boolean58 = nodeIterableList2.containsAll((java.util.Collection<java.lang.Iterable<com.google.javascript.rhino.Node>>) nodeIterableList53);
        boolean boolean60 = nodeIterableList2.equals((java.lang.Object) (short) 1);
        int int61 = nodeIterableList2.size();
        java.util.stream.Stream<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableStream62 = nodeIterableList2.stream();
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList63 = nodeIterableList2.reverse();
        boolean boolean64 = nodeIterableList63.isEmpty();
        boolean boolean65 = nodeIterableList63.isEmpty();
        com.google.common.collect.ImmutableList[] immutableListArray67 = new com.google.common.collect.ImmutableList[0];
        @SuppressWarnings("unchecked")
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>>[] nodeIterableListArray68 = (com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>>[]) immutableListArray67;
        com.google.common.collect.ImmutableList[][] immutableListArray70 = new com.google.common.collect.ImmutableList[1][];
        @SuppressWarnings("unchecked")
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>>[][] nodeIterableListArray71 = (com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>>[][]) immutableListArray70;
        nodeIterableListArray71[0] = nodeIterableListArray68;
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>>[][] nodeIterableListArray74 = nodeIterableList63.toArray(nodeIterableListArray71);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.common.collect.ImmutableList<java.util.Collection<java.lang.Iterable<com.google.javascript.rhino.Node>>[]> iterableCollectionArrayList75 = com.google.common.collect.ImmutableList.of((java.util.Collection<java.lang.Iterable<com.google.javascript.rhino.Node>>[][]) nodeIterableListArray74);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder0 = new com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>>();
        com.google.common.collect.ImmutableList<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumList1 = visibilityEnumBuilder0.build();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean3 = jSDocInfo2.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo2.getType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility5 = jSDocInfo2.getVisibility();
        boolean boolean6 = jSDocInfo2.shouldPreserveTry();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility7 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        jSDocInfo2.setVisibility(visibility7);
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder9 = visibilityEnumBuilder0.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>) visibility7);
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder10 = new com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>>();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility11 = com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC;
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder12 = visibilityEnumBuilder10.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>) visibility11);
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean14 = jSDocInfo13.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression15 = jSDocInfo13.getType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility16 = jSDocInfo13.getVisibility();
        boolean boolean17 = jSDocInfo13.shouldPreserveTry();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility18 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        jSDocInfo13.setVisibility(visibility18);
        com.google.javascript.rhino.JSDocInfo.Visibility[] visibilityArray20 = new com.google.javascript.rhino.JSDocInfo.Visibility[] { visibility18 };
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder21 = visibilityEnumBuilder12.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>[]) visibilityArray20);
        com.google.common.collect.ImmutableCollection.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder22 = visibilityEnumBuilder9.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>[]) visibilityArray20);
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder23 = new com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>>();
        com.google.common.collect.ImmutableList<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumList24 = visibilityEnumBuilder23.build();
        com.google.javascript.rhino.JSDocInfo jSDocInfo25 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean26 = jSDocInfo25.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression27 = jSDocInfo25.getType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility28 = jSDocInfo25.getVisibility();
        boolean boolean29 = jSDocInfo25.shouldPreserveTry();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility30 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        jSDocInfo25.setVisibility(visibility30);
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder32 = visibilityEnumBuilder23.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>) visibility30);
        com.google.common.collect.ImmutableCollection.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder33 = visibilityEnumBuilder22.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>) visibility30);
        com.google.javascript.rhino.JSDocInfo.Visibility visibility34 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        com.google.common.collect.ImmutableCollection.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder35 = visibilityEnumBuilder33.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>) visibility34);
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList36 = com.google.common.collect.ImmutableList.of();
        java.lang.Object[] objArray37 = nodeIterableList36.toArray();
        boolean boolean38 = nodeIterableList36.isEmpty();
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder39 = new com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>>();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility40 = com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC;
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder41 = visibilityEnumBuilder39.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>) visibility40);
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder42 = new com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>>();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility43 = com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC;
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder44 = visibilityEnumBuilder42.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>) visibility43);
        com.google.javascript.rhino.JSDocInfo jSDocInfo45 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean46 = jSDocInfo45.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression47 = jSDocInfo45.getType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility48 = jSDocInfo45.getVisibility();
        boolean boolean49 = jSDocInfo45.shouldPreserveTry();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility50 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        jSDocInfo45.setVisibility(visibility50);
        com.google.javascript.rhino.JSDocInfo.Visibility[] visibilityArray52 = new com.google.javascript.rhino.JSDocInfo.Visibility[] { visibility50 };
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder53 = visibilityEnumBuilder44.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>[]) visibilityArray52);
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder54 = new com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>>();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility55 = com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC;
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder56 = visibilityEnumBuilder54.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>) visibility55);
        com.google.javascript.rhino.JSDocInfo jSDocInfo57 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean58 = jSDocInfo57.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression59 = jSDocInfo57.getType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility60 = jSDocInfo57.getVisibility();
        boolean boolean61 = jSDocInfo57.shouldPreserveTry();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility62 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        jSDocInfo57.setVisibility(visibility62);
        com.google.javascript.rhino.JSDocInfo.Visibility[] visibilityArray64 = new com.google.javascript.rhino.JSDocInfo.Visibility[] { visibility62 };
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder65 = visibilityEnumBuilder56.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>[]) visibilityArray64);
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder66 = visibilityEnumBuilder53.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>[]) visibilityArray64);
        com.google.common.collect.ImmutableList.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder67 = visibilityEnumBuilder41.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>[]) visibilityArray64);
        java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>[] visibilityEnumArray68 = nodeIterableList36.toArray((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>[]) visibilityArray64);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.common.collect.ImmutableCollection.Builder<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumBuilder69 = visibilityEnumBuilder35.add((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>[]) visibilityArray64);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        boolean boolean8 = node5.isNot();
        int int9 = node5.getLineno();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean16 = node15.isThis();
        node12.addChildToBack(node15);
        boolean boolean18 = node15.isNot();
        int int19 = node15.getLineno();
        com.google.javascript.rhino.Node node20 = node5.srcref(node15);
        int int21 = node5.getCharno();
        java.lang.String str25 = node5.toString(true, true, true);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean32 = node31.isThis();
        node28.addChildToBack(node31);
        boolean boolean34 = node31.isNot();
        int int35 = node31.getLineno();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean42 = node41.isThis();
        node38.addChildToBack(node41);
        boolean boolean44 = node41.isNot();
        int int45 = node41.getLineno();
        com.google.javascript.rhino.Node node46 = node31.srcref(node41);
        int int47 = node31.getCharno();
        boolean boolean48 = node31.isQuotedString();
        boolean boolean49 = node31.isIf();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean56 = node55.isThis();
        node52.addChildToBack(node55);
        boolean boolean58 = node55.isNot();
        int int59 = node55.getLineno();
        boolean boolean60 = node55.isAdd();
        com.google.javascript.rhino.Node node61 = node31.useSourceInfoFromForTree(node55);
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean68 = node67.isThis();
        node64.addChildToBack(node67);
        boolean boolean70 = node67.isNot();
        int int71 = node67.getLineno();
        boolean boolean72 = node67.isAdd();
        com.google.javascript.rhino.Node node73 = node67.cloneTree();
        java.lang.Object obj75 = node73.getProp((int) (byte) 0);
        int int76 = node73.getChildCount();
        node61.addChildrenToFront(node73);
        boolean boolean78 = node5.isEquivalentToTyped(node61);
        com.google.javascript.rhino.Node node79 = node61.cloneNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node81 = node79.getChildAtIndex(30);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList0 = com.google.common.collect.ImmutableList.of();
        java.lang.Object[] objArray1 = nodeIterableList0.toArray();
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList2 = nodeIterableList0.reverse();
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList6 = com.google.common.collect.ImmutableList.of();
        java.lang.Object[] objArray7 = nodeIterableList6.toArray();
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList8 = nodeIterableList6.reverse();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean16 = node15.isThis();
        node12.addChildToBack(node15);
        java.lang.Object[] objArray18 = new java.lang.Object[] { 45, (short) -1, (short) -1, nodeIterableList8, 52, node15 };
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList22 = com.google.common.collect.ImmutableList.of();
        java.lang.Object[] objArray23 = nodeIterableList22.toArray();
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList24 = nodeIterableList22.reverse();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean32 = node31.isThis();
        node28.addChildToBack(node31);
        java.lang.Object[] objArray34 = new java.lang.Object[] { 45, (short) -1, (short) -1, nodeIterableList24, 52, node31 };
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList38 = com.google.common.collect.ImmutableList.of();
        java.lang.Object[] objArray39 = nodeIterableList38.toArray();
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList40 = nodeIterableList38.reverse();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean48 = node47.isThis();
        node44.addChildToBack(node47);
        java.lang.Object[] objArray50 = new java.lang.Object[] { 45, (short) -1, (short) -1, nodeIterableList40, 52, node47 };
        java.lang.Object[][] objArray51 = new java.lang.Object[][] { objArray18, objArray34, objArray50 };
        java.lang.Object[][] objArray52 = nodeIterableList2.toArray(objArray51);
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList53 = com.google.common.collect.ImmutableList.of();
        java.lang.Object[] objArray54 = nodeIterableList53.toArray();
        int int56 = nodeIterableList53.lastIndexOf((java.lang.Object) (short) 0);
        java.lang.Object[] objArray57 = nodeIterableList53.toArray();
        boolean boolean58 = nodeIterableList2.containsAll((java.util.Collection<java.lang.Iterable<com.google.javascript.rhino.Node>>) nodeIterableList53);
        boolean boolean60 = nodeIterableList2.equals((java.lang.Object) (short) 1);
        int int61 = nodeIterableList2.size();
        java.util.stream.Stream<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableStream62 = nodeIterableList2.stream();
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList63 = nodeIterableList2.reverse();
        boolean boolean64 = nodeIterableList63.isEmpty();
        boolean boolean65 = nodeIterableList63.isEmpty();
        com.google.common.collect.ImmutableList[] immutableListArray67 = new com.google.common.collect.ImmutableList[0];
        @SuppressWarnings("unchecked")
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>>[] nodeIterableListArray68 = (com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>>[]) immutableListArray67;
        com.google.common.collect.ImmutableList[][] immutableListArray70 = new com.google.common.collect.ImmutableList[1][];
        @SuppressWarnings("unchecked")
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>>[][] nodeIterableListArray71 = (com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>>[][]) immutableListArray70;
        nodeIterableListArray71[0] = nodeIterableListArray68;
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>>[][] nodeIterableListArray74 = nodeIterableList63.toArray(nodeIterableListArray71);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>>[]> iterableListArrayList75 = com.google.common.collect.ImmutableList.copyOf(nodeIterableListArray74);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean7 = node6.isThis();
        node3.addChildToBack(node6);
        boolean boolean9 = node3.isDebugger();
        boolean boolean10 = node3.isVoid();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean14 = node13.isTypeOf();
        com.google.javascript.rhino.Node node15 = node3.srcrefTree(node13);
        com.google.javascript.rhino.Node node16 = node3.getLastSibling();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean23 = node22.isThis();
        node19.addChildToBack(node22);
        boolean boolean25 = node19.isDebugger();
        com.google.javascript.rhino.Node node26 = node19.getFirstChild();
        boolean boolean27 = node3.hasChild(node26);
        typePosition0.setItem(node26);
        boolean boolean29 = node26.isFor();
        boolean boolean30 = node26.isComma();
        node26.setSourceFileForTesting("");
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString(51, "OR hi! [directives: []]\n");
        boolean boolean36 = node26.hasChild(node35);
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.Node> nodeList37 = com.google.common.collect.ImmutableList.of(node26);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString("{690905048}");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node40 = node26.getChildBefore(node39);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node3 = node1.getChildAtIndex(53);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(51, "OR hi! [directives: []]\n");
        java.lang.String str3 = node2.getString();
        boolean boolean4 = node2.isIf();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 100.0f);
        com.google.javascript.rhino.Node node7 = node6.getLastChild();
        int int8 = node6.getLength();
        boolean boolean9 = node6.isVarArgs();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean16 = node15.isThis();
        node12.addChildToBack(node15);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable18 = node12.siblings();
        node12.setWasEmptyNode(true);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder21 = node12.getJsDocBuilderForNode();
        boolean boolean22 = node6.isEquivalentTo(node12);
        com.google.javascript.rhino.Node[] nodeArray28 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) 'a', nodeArray28, 8202, (int) (short) -1);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) 'a', nodeArray28);
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node(43, nodeArray28);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node(35, nodeArray28, 100, 36);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(31, nodeArray28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.replaceChild(node6, node37);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        boolean boolean8 = node5.isNot();
        int int9 = node5.getLineno();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean16 = node15.isThis();
        node12.addChildToBack(node15);
        boolean boolean18 = node15.isNot();
        int int19 = node15.getLineno();
        com.google.javascript.rhino.Node node20 = node5.srcref(node15);
        boolean boolean21 = node20.isDelProp();
        com.google.javascript.rhino.Node node22 = node20.getLastSibling();
        node22.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable25 = node22.getAncestors();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean29 = node28.isThis();
        boolean boolean30 = node28.isDelProp();
        int int31 = node28.getChildCount();
        boolean boolean32 = node28.isComma();
        boolean boolean33 = node28.isOr();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node34 = node22.getChildBefore(node28);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(31, "INSTANCEOF", 10, 53);
        boolean boolean5 = node4.isQuotedString();
        node4.setLength(4095);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node9 = node4.getChildAtIndex(97);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList0 = com.google.common.collect.ImmutableList.of();
        java.lang.Object[] objArray1 = nodeIterableList0.toArray();
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList2 = nodeIterableList0.reverse();
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList6 = com.google.common.collect.ImmutableList.of();
        java.lang.Object[] objArray7 = nodeIterableList6.toArray();
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList8 = nodeIterableList6.reverse();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean16 = node15.isThis();
        node12.addChildToBack(node15);
        java.lang.Object[] objArray18 = new java.lang.Object[] { 45, (short) -1, (short) -1, nodeIterableList8, 52, node15 };
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList22 = com.google.common.collect.ImmutableList.of();
        java.lang.Object[] objArray23 = nodeIterableList22.toArray();
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList24 = nodeIterableList22.reverse();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean32 = node31.isThis();
        node28.addChildToBack(node31);
        java.lang.Object[] objArray34 = new java.lang.Object[] { 45, (short) -1, (short) -1, nodeIterableList24, 52, node31 };
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList38 = com.google.common.collect.ImmutableList.of();
        java.lang.Object[] objArray39 = nodeIterableList38.toArray();
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList40 = nodeIterableList38.reverse();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean48 = node47.isThis();
        node44.addChildToBack(node47);
        java.lang.Object[] objArray50 = new java.lang.Object[] { 45, (short) -1, (short) -1, nodeIterableList40, 52, node47 };
        java.lang.Object[][] objArray51 = new java.lang.Object[][] { objArray18, objArray34, objArray50 };
        java.lang.Object[][] objArray52 = nodeIterableList2.toArray(objArray51);
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList53 = com.google.common.collect.ImmutableList.of();
        java.lang.Object[] objArray54 = nodeIterableList53.toArray();
        int int56 = nodeIterableList53.lastIndexOf((java.lang.Object) (short) 0);
        java.lang.Object[] objArray57 = nodeIterableList53.toArray();
        boolean boolean58 = nodeIterableList2.containsAll((java.util.Collection<java.lang.Iterable<com.google.javascript.rhino.Node>>) nodeIterableList53);
        boolean boolean60 = nodeIterableList2.equals((java.lang.Object) (short) 1);
        int int61 = nodeIterableList2.size();
        java.util.stream.Stream<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableStream62 = nodeIterableList2.stream();
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList63 = nodeIterableList2.reverse();
        boolean boolean64 = nodeIterableList63.isEmpty();
        boolean boolean65 = nodeIterableList63.isEmpty();
        com.google.common.collect.ImmutableList[] immutableListArray67 = new com.google.common.collect.ImmutableList[0];
        @SuppressWarnings("unchecked")
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>>[] nodeIterableListArray68 = (com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>>[]) immutableListArray67;
        com.google.common.collect.ImmutableList[][] immutableListArray70 = new com.google.common.collect.ImmutableList[1][];
        @SuppressWarnings("unchecked")
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>>[][] nodeIterableListArray71 = (com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>>[][]) immutableListArray70;
        nodeIterableListArray71[0] = nodeIterableListArray68;
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>>[][] nodeIterableListArray74 = nodeIterableList63.toArray(nodeIterableListArray71);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableCollection<java.lang.Iterable<com.google.javascript.rhino.Node>>[]> iterableCollectionArrayList75 = com.google.common.collect.ImmutableList.copyOf((com.google.common.collect.ImmutableCollection<java.lang.Iterable<com.google.javascript.rhino.Node>>[][]) nodeIterableListArray74);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.Node node1 = typePosition0.getItem();
        int int2 = typePosition0.getStartLine();
        int int3 = typePosition0.getPositionOnEndLine();
        com.google.javascript.rhino.Node node4 = typePosition0.getItem();
        int int5 = typePosition0.getEndLine();
        com.google.javascript.rhino.Node node6 = typePosition0.getItem();
        int int7 = typePosition0.getStartLine();
        int int8 = typePosition0.getStartLine();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) '#', 2, (int) (byte) 10);
        boolean boolean14 = node13.isOptionalArg();
        int int15 = node13.getSourceOffset();
        boolean boolean16 = node13.isCatch();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean23 = node22.isThis();
        node19.addChildToBack(node22);
        boolean boolean25 = node22.isNot();
        int int26 = node22.getLineno();
        boolean boolean27 = node22.isAdd();
        com.google.javascript.rhino.Node node28 = node22.cloneTree();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean35 = node34.isThis();
        node31.addChildToBack(node34);
        boolean boolean37 = node34.isNot();
        int int38 = node34.getLineno();
        boolean boolean39 = node34.isAdd();
        boolean boolean40 = node28.hasChild(node34);
        boolean boolean41 = node34.isDefaultCase();
        int int42 = node34.getSourcePosition();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean46 = node45.isTypeOf();
        boolean boolean47 = node45.isRegExp();
        com.google.javascript.rhino.Node node48 = node34.copyInformationFromForTree(node45);
        boolean boolean49 = node48.isBlock();
        boolean boolean50 = node48.isLabel();
        com.google.javascript.rhino.Node node51 = node13.srcrefTree(node48);
        boolean boolean52 = node13.isVarArgs();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean60 = node59.isThis();
        node56.addChildToBack(node59);
        boolean boolean62 = node56.isDebugger();
        boolean boolean63 = node56.isAssign();
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node(51, node56, (int) (short) 10, 0);
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newNumber((double) (short) 100, (int) ' ', (int) (byte) 1);
        com.google.javascript.rhino.Node node71 = node56.useSourceInfoIfMissingFrom(node70);
        node56.putBooleanProp(32, false);
        boolean boolean75 = node56.isLabel();
        com.google.javascript.rhino.Node node76 = node56.cloneTree();
        com.google.javascript.rhino.Node node79 = new com.google.javascript.rhino.Node((-1), node13, node76, 51, 48);
        node13.setSourceFileForTesting("Node tree inequality:\nTree1:\nOR hi! [empty_block: 1]\n    OR hi!\n\n\nTree2:\nOR hi!\n\n\nSubtree1: OR hi! [empty_block: 1]\n    OR hi!\n\n\nSubtree2: OR hi!\n");
        typePosition0.setItem(node13);
        com.google.javascript.rhino.Node node88 = com.google.javascript.rhino.Node.newString((int) ' ', "hi!", 38, (int) (short) 0);
        com.google.javascript.rhino.Node node89 = node88.cloneNode();
        com.google.javascript.rhino.Node node90 = new com.google.javascript.rhino.Node((int) (short) 100, node88);
        boolean boolean91 = node88.isBreak();
        boolean boolean92 = node88.isVarArgs();
        boolean boolean93 = node13.hasChild(node88);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node95 = node13.getChildAtIndex((int) '4');
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable8 = node2.siblings();
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        node2.setDirectives((java.util.Set<java.lang.String>) strSet11);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder15 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean16 = jSDocInfoBuilder15.recordInterface();
        boolean boolean18 = jSDocInfoBuilder15.recordDescription("hi!");
        boolean boolean19 = jSDocInfoBuilder15.recordHiddenness();
        boolean boolean20 = strSet11.remove((java.lang.Object) jSDocInfoBuilder15);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean27 = node26.isThis();
        node23.addChildToBack(node26);
        boolean boolean29 = node26.isNot();
        int int30 = node26.getLineno();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean37 = node36.isThis();
        node33.addChildToBack(node36);
        boolean boolean39 = node36.isNot();
        int int40 = node36.getLineno();
        com.google.javascript.rhino.Node node41 = node26.srcref(node36);
        int int42 = node26.getCharno();
        boolean boolean43 = node26.isQuotedString();
        boolean boolean44 = node26.isIf();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean51 = node50.isThis();
        node47.addChildToBack(node50);
        boolean boolean53 = node50.isNot();
        int int54 = node50.getLineno();
        boolean boolean55 = node50.isAdd();
        com.google.javascript.rhino.Node node56 = node26.useSourceInfoFromForTree(node50);
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean63 = node62.isThis();
        node59.addChildToBack(node62);
        boolean boolean65 = node62.isNot();
        int int66 = node62.getLineno();
        boolean boolean67 = node62.isAdd();
        com.google.javascript.rhino.Node node68 = node62.cloneTree();
        java.lang.Object obj70 = node68.getProp((int) (byte) 0);
        int int71 = node68.getChildCount();
        node56.addChildrenToFront(node68);
        boolean boolean73 = strSet11.contains((java.lang.Object) node56);
        boolean boolean74 = node56.isQuotedString();
        boolean boolean75 = node56.isVoid();
        boolean boolean76 = node56.isCase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node78 = node56.getChildAtIndex(39);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable8 = node2.siblings();
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        node2.setDirectives((java.util.Set<java.lang.String>) strSet11);
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList14 = com.google.common.collect.ImmutableList.of();
        java.lang.Object[] objArray15 = nodeIterableList14.toArray();
        boolean boolean16 = strSet11.removeAll((java.util.Collection<java.lang.Iterable<com.google.javascript.rhino.Node>>) nodeIterableList14);
        java.lang.Object[] objArray17 = nodeIterableList14.toArray();
        java.lang.Object[] objArray18 = nodeIterableList14.toArray();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean26 = node25.isThis();
        node22.addChildToBack(node25);
        boolean boolean28 = node22.isDebugger();
        boolean boolean29 = node22.isAssign();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(51, node22, (int) (short) 10, 0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable33 = node32.getAncestors();
        java.util.Spliterator<com.google.javascript.rhino.Node> nodeSpliterator34 = ancestorIterable33.spliterator();
        int int35 = nodeIterableList14.lastIndexOf((java.lang.Object) ancestorIterable33);
        java.util.Iterator<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableItor36 = nodeIterableList14.iterator();
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList37 = com.google.common.collect.ImmutableList.of();
        java.lang.Object[] objArray38 = nodeIterableList37.toArray();
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList39 = nodeIterableList37.reverse();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition40 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition41 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition42 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition43 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition44 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition45 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition[] typePositionArray46 = new com.google.javascript.rhino.JSDocInfo.TypePosition[] { typePosition40, typePosition41, typePosition42, typePosition43, typePosition44, typePosition45 };
        com.google.javascript.rhino.JSDocInfo.TypePosition[] typePositionArray47 = nodeIterableList37.toArray(typePositionArray46);
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>[] nodeSourcePositionArray48 = nodeIterableList14.toArray((com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>[]) typePositionArray47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.TypePosition> typePositionList49 = com.google.common.collect.ImmutableList.of(typePositionArray47);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean7 = node6.isThis();
        node3.addChildToBack(node6);
        boolean boolean9 = node3.isDebugger();
        boolean boolean10 = node3.isVoid();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean14 = node13.isTypeOf();
        com.google.javascript.rhino.Node node15 = node3.srcrefTree(node13);
        com.google.javascript.rhino.Node node16 = node3.getLastSibling();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean23 = node22.isThis();
        node19.addChildToBack(node22);
        boolean boolean25 = node19.isDebugger();
        com.google.javascript.rhino.Node node26 = node19.getFirstChild();
        boolean boolean27 = node3.hasChild(node26);
        typePosition0.setItem(node26);
        boolean boolean29 = node26.isDelProp();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder30 = node26.new FileLevelJsDocBuilder();
        node26.setString("{1558153567}");
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString("INSTANCEOF", 50, 46);
        boolean boolean37 = node36.isObjectLit();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean44 = node43.isThis();
        node40.addChildToBack(node43);
        boolean boolean46 = node40.isBreak();
        boolean boolean47 = node40.isAssignAdd();
        com.google.javascript.rhino.Node node48 = node36.useSourceInfoIfMissingFrom(node40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node49 = node26.getChildBefore(node36);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable8 = node2.siblings();
        java.util.ArrayList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList9 = new java.util.ArrayList<java.lang.Iterable<com.google.javascript.rhino.Node>>();
        boolean boolean10 = nodeIterableList9.add(nodeIterable8);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean17 = node16.isThis();
        node13.addChildToBack(node16);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable19 = node13.siblings();
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        node13.setDirectives((java.util.Set<java.lang.String>) strSet22);
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList25 = com.google.common.collect.ImmutableList.of();
        java.lang.Object[] objArray26 = nodeIterableList25.toArray();
        boolean boolean27 = strSet22.removeAll((java.util.Collection<java.lang.Iterable<com.google.javascript.rhino.Node>>) nodeIterableList25);
        java.lang.Object[] objArray28 = nodeIterableList25.toArray();
        boolean boolean29 = nodeIterableList25.isEmpty();
        boolean boolean30 = nodeIterableList9.containsAll((java.util.Collection<java.lang.Iterable<com.google.javascript.rhino.Node>>) nodeIterableList25);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean37 = node36.isThis();
        node33.addChildToBack(node36);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable39 = node33.siblings();
        java.lang.String[] strArray41 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        node33.setDirectives((java.util.Set<java.lang.String>) strSet42);
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList45 = com.google.common.collect.ImmutableList.of();
        java.lang.Object[] objArray46 = nodeIterableList45.toArray();
        boolean boolean47 = strSet42.removeAll((java.util.Collection<java.lang.Iterable<com.google.javascript.rhino.Node>>) nodeIterableList45);
        java.lang.Object[] objArray48 = nodeIterableList45.toArray();
        java.util.ListIterator<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableItor49 = nodeIterableList45.listIterator();
        boolean boolean50 = nodeIterableList45.isEmpty();
        boolean boolean51 = nodeIterableList9.retainAll((java.util.Collection<java.lang.Iterable<com.google.javascript.rhino.Node>>) nodeIterableList45);
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition52 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.NamePosition> namePositionList53 = com.google.common.collect.ImmutableList.of(namePosition52);
        com.google.javascript.rhino.Node node54 = namePosition52.getItem();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition55 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition56 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition57 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition58 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.NamePosition> namePositionList59 = com.google.common.collect.ImmutableList.of(namePosition58);
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition60 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.NamePosition> namePositionList61 = com.google.common.collect.ImmutableList.of(namePosition60);
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition62 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition63 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition64 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition65 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition66 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.NamePosition> namePositionList67 = com.google.common.collect.ImmutableList.of(namePosition66);
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition68 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.NamePosition> namePositionList69 = com.google.common.collect.ImmutableList.of(namePosition55, namePosition56, namePosition57, namePosition58, namePosition60, namePosition62, namePosition63, namePosition64, namePosition65, namePosition66, namePosition68);
        int int70 = namePosition60.getStartLine();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition71 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition72 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition73 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition74 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.NamePosition> namePositionList75 = com.google.common.collect.ImmutableList.of(namePosition74);
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition76 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.NamePosition> namePositionList77 = com.google.common.collect.ImmutableList.of(namePosition76);
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition78 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition79 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition80 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition81 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition82 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.NamePosition> namePositionList83 = com.google.common.collect.ImmutableList.of(namePosition82);
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition84 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.NamePosition> namePositionList85 = com.google.common.collect.ImmutableList.of(namePosition71, namePosition72, namePosition73, namePosition74, namePosition76, namePosition78, namePosition79, namePosition80, namePosition81, namePosition82, namePosition84);
        com.google.javascript.rhino.JSDocInfo.NamePosition[] namePositionArray86 = new com.google.javascript.rhino.JSDocInfo.NamePosition[] { namePosition52, namePosition60, namePosition72 };
        com.google.javascript.rhino.JSDocInfo.NamePosition[] namePositionArray87 = nodeIterableList45.toArray(namePositionArray86);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.NamePosition> namePositionList88 = com.google.common.collect.ImmutableList.of(namePositionArray86);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 100.0f);
        com.google.javascript.rhino.Node node2 = node1.getLastChild();
        int int3 = node1.getLength();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean7 = node6.isNE();
        boolean boolean8 = node6.isInstanceOf();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean15 = node14.isThis();
        node11.addChildToBack(node14);
        boolean boolean17 = node11.isDebugger();
        node11.setSourceFileForTesting("");
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean26 = node25.isThis();
        node22.addChildToBack(node25);
        boolean boolean28 = node25.isNot();
        int int29 = node25.getLineno();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean36 = node35.isThis();
        node32.addChildToBack(node35);
        boolean boolean38 = node35.isNot();
        int int39 = node35.getLineno();
        com.google.javascript.rhino.Node node40 = node25.srcref(node35);
        int int41 = node25.getCharno();
        com.google.javascript.rhino.Node node42 = node11.copyInformationFrom(node25);
        boolean boolean43 = node11.isTrue();
        boolean boolean44 = node11.isCase();
        boolean boolean45 = node11.isObjectLit();
        com.google.javascript.rhino.Node node46 = node6.srcrefTree(node11);
        boolean boolean47 = node46.isReturn();
        boolean boolean48 = node46.isLabel();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node((int) '#', 2, (int) (byte) 10);
        boolean boolean53 = node52.isOptionalArg();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean57 = node56.isThis();
        boolean boolean58 = node56.isDelProp();
        int int59 = node56.getChildCount();
        boolean boolean60 = node56.isComma();
        boolean boolean61 = node56.isNoSideEffectsCall();
        boolean boolean62 = node56.isSetterDef();
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString((int) ' ', "hi!", 38, (int) (short) 0);
        com.google.javascript.rhino.Node node68 = node67.cloneNode();
        com.google.javascript.rhino.Node node69 = node68.removeChildren();
        com.google.javascript.rhino.Node node70 = node56.copyInformationFromForTree(node68);
        node56.putBooleanProp(39, true);
        com.google.javascript.rhino.Node node74 = node52.copyInformationFromForTree(node56);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.replaceChild(node46, node74);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        boolean boolean8 = node5.isNot();
        int int9 = node5.getLineno();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean16 = node15.isThis();
        node12.addChildToBack(node15);
        boolean boolean18 = node15.isNot();
        int int19 = node15.getLineno();
        com.google.javascript.rhino.Node node20 = node5.srcref(node15);
        boolean boolean21 = node20.isDelProp();
        com.google.javascript.rhino.Node node22 = node20.getLastSibling();
        boolean boolean23 = node22.isSetterDef();
        com.google.javascript.rhino.Node node24 = node22.removeChildren();
        boolean boolean25 = node22.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node27 = node22.getChildAtIndex(143360);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        boolean boolean8 = node5.isNot();
        int int9 = node5.getLineno();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean16 = node15.isThis();
        node12.addChildToBack(node15);
        boolean boolean18 = node15.isNot();
        int int19 = node15.getLineno();
        com.google.javascript.rhino.Node node20 = node5.srcref(node15);
        int int21 = node5.getCharno();
        boolean boolean22 = node5.isScript();
        com.google.javascript.rhino.Node node23 = node5.cloneNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node25 = node23.getChildAtIndex((int) (short) 10);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("OR []");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean8 = node7.isThis();
        node4.addChildToBack(node7);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node4.siblings();
        node4.setWasEmptyNode(true);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean16 = node15.isThis();
        boolean boolean17 = node15.isDelProp();
        boolean boolean18 = node15.hasChildren();
        boolean boolean19 = node15.isOr();
        java.lang.String str20 = node4.checkTreeEquals(node15);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean28 = node27.isThis();
        node24.addChildToBack(node27);
        boolean boolean30 = node24.isDebugger();
        boolean boolean31 = node24.isAssign();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node(51, node24, (int) (short) 10, 0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable35 = node34.getAncestors();
        com.google.javascript.rhino.Node node36 = node15.copyInformationFrom(node34);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression38 = new com.google.javascript.rhino.JSTypeExpression(node34, "OR hi! [source_file: ]\n    OR hi!\n");
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean45 = node44.isThis();
        node41.addChildToBack(node44);
        boolean boolean47 = node44.isNot();
        int int48 = node44.getLineno();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean55 = node54.isThis();
        node51.addChildToBack(node54);
        boolean boolean57 = node54.isNot();
        int int58 = node54.getLineno();
        com.google.javascript.rhino.Node node59 = node44.srcref(node54);
        boolean boolean60 = node59.isDelProp();
        com.google.javascript.rhino.Node node61 = node59.getLastSibling();
        com.google.javascript.rhino.Node node62 = node34.clonePropsFrom(node59);
        boolean boolean63 = node34.isName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node34);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        boolean boolean8 = node2.isDec();
        boolean boolean9 = node2.isBlock();
        boolean boolean10 = node2.isTrue();
        com.google.javascript.rhino.Node node11 = node2.cloneNode();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean18 = node17.isThis();
        node14.addChildToBack(node17);
        boolean boolean20 = node17.isNot();
        int int21 = node17.getLineno();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean28 = node27.isThis();
        node24.addChildToBack(node27);
        boolean boolean30 = node27.isNot();
        int int31 = node27.getLineno();
        com.google.javascript.rhino.Node node32 = node17.srcref(node27);
        int int33 = node17.getCharno();
        boolean boolean34 = node17.isQuotedString();
        boolean boolean35 = node17.isIf();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean42 = node41.isThis();
        node38.addChildToBack(node41);
        boolean boolean44 = node41.isNot();
        int int45 = node41.getLineno();
        boolean boolean46 = node41.isAdd();
        com.google.javascript.rhino.Node node47 = node17.useSourceInfoFromForTree(node41);
        com.google.javascript.rhino.Node node48 = node2.useSourceInfoFromForTree(node17);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString("{599635391}");
        boolean boolean51 = node50.isRegExp();
        boolean boolean53 = node50.getBooleanProp(4095);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node54 = node17.getChildBefore(node50);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        com.google.javascript.rhino.Node[] nodeArray2 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node((int) 'a', nodeArray2, 8202, (int) (short) -1);
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(29, nodeArray2, 42, 37);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean15 = node14.isThis();
        node11.addChildToBack(node14);
        boolean boolean17 = node14.isNot();
        int int18 = node14.getLineno();
        boolean boolean19 = node14.isCatch();
        boolean boolean21 = node14.getBooleanProp((int) '#');
        node14.removeProp(47);
        boolean boolean24 = node14.isAdd();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean31 = node30.isThis();
        node27.addChildToBack(node30);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable33 = node27.siblings();
        java.lang.String[] strArray35 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        node27.setDirectives((java.util.Set<java.lang.String>) strSet36);
        int int39 = strSet36.size();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean46 = node45.isThis();
        node42.addChildToBack(node45);
        boolean boolean48 = node45.isAdd();
        boolean boolean49 = node45.isAnd();
        boolean boolean50 = strSet36.remove((java.lang.Object) node45);
        com.google.javascript.rhino.Node node51 = node14.useSourceInfoIfMissingFromForTree(node45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node8.removeChild(node51);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList0 = com.google.common.collect.ImmutableList.of();
        java.lang.Object[] objArray1 = nodeIterableList0.toArray();
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList2 = nodeIterableList0.reverse();
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList6 = com.google.common.collect.ImmutableList.of();
        java.lang.Object[] objArray7 = nodeIterableList6.toArray();
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList8 = nodeIterableList6.reverse();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean16 = node15.isThis();
        node12.addChildToBack(node15);
        java.lang.Object[] objArray18 = new java.lang.Object[] { 45, (short) -1, (short) -1, nodeIterableList8, 52, node15 };
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList22 = com.google.common.collect.ImmutableList.of();
        java.lang.Object[] objArray23 = nodeIterableList22.toArray();
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList24 = nodeIterableList22.reverse();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean32 = node31.isThis();
        node28.addChildToBack(node31);
        java.lang.Object[] objArray34 = new java.lang.Object[] { 45, (short) -1, (short) -1, nodeIterableList24, 52, node31 };
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList38 = com.google.common.collect.ImmutableList.of();
        java.lang.Object[] objArray39 = nodeIterableList38.toArray();
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList40 = nodeIterableList38.reverse();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean48 = node47.isThis();
        node44.addChildToBack(node47);
        java.lang.Object[] objArray50 = new java.lang.Object[] { 45, (short) -1, (short) -1, nodeIterableList40, 52, node47 };
        java.lang.Object[][] objArray51 = new java.lang.Object[][] { objArray18, objArray34, objArray50 };
        java.lang.Object[][] objArray52 = nodeIterableList2.toArray(objArray51);
        java.util.stream.Stream<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableStream53 = nodeIterableList2.parallelStream();
        boolean boolean54 = nodeIterableList2.isEmpty();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableItor55 = nodeIterableList2.listIterator();
        int int56 = nodeIterableList2.size();
        com.google.common.collect.UnmodifiableIterator<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableItor57 = nodeIterableList2.iterator();
        com.google.common.collect.UnmodifiableIterator<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableItor58 = nodeIterableList2.iterator();
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList59 = nodeIterableList2.reverse();
        java.util.LinkedHashSet[] linkedHashSetArray60 = new java.util.LinkedHashSet[] {};
        java.util.LinkedHashSet[][] linkedHashSetArray61 = new java.util.LinkedHashSet[][] { linkedHashSetArray60 };
        java.util.LinkedHashSet[][] linkedHashSetArray62 = nodeIterableList2.toArray(linkedHashSetArray61);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.common.collect.ImmutableList<java.util.LinkedHashSet[]> linkedHashSetArrayList63 = com.google.common.collect.ImmutableList.copyOf(linkedHashSetArray62);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable8 = node2.siblings();
        node2.setWasEmptyNode(true);
        com.google.javascript.rhino.Node node11 = node2.getLastChild();
        java.lang.String str12 = node11.getString();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean19 = node18.isThis();
        node15.addChildToBack(node18);
        boolean boolean21 = node18.isNot();
        int int22 = node18.getLineno();
        boolean boolean23 = node18.isAdd();
        com.google.javascript.rhino.Node node24 = node18.cloneTree();
        com.google.javascript.rhino.Node node25 = node11.clonePropsFrom(node18);
        node11.setLength((int) (byte) 100);
        boolean boolean28 = node11.isGetterDef();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean33 = node32.isDebugger();
        com.google.javascript.rhino.InputId inputId35 = new com.google.javascript.rhino.InputId("");
        java.lang.String str36 = inputId35.getIdName();
        node32.setInputId(inputId35);
        boolean boolean38 = node32.isTypeOf();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean42 = node41.isThis();
        boolean boolean43 = node41.isDelProp();
        int int44 = node41.getChildCount();
        boolean boolean45 = node41.isComma();
        boolean boolean46 = node41.isNoSideEffectsCall();
        boolean boolean47 = node41.isSetterDef();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString((int) ' ', "hi!", 38, (int) (short) 0);
        com.google.javascript.rhino.Node node53 = node52.cloneNode();
        com.google.javascript.rhino.Node node54 = node53.removeChildren();
        com.google.javascript.rhino.Node node55 = node41.copyInformationFromForTree(node53);
        com.google.javascript.rhino.Node node56 = node32.useSourceInfoFrom(node53);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(39, node53, 54, 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node11.removeChild(node53);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean3 = node2.isGetElem();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(51, "OR hi! [directives: []]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.removeChild(node6);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) '#', 2, (int) (byte) 10);
        boolean boolean4 = node3.isOptionalArg();
        int int5 = node3.getSourceOffset();
        boolean boolean6 = node3.isCatch();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean13 = node12.isThis();
        node9.addChildToBack(node12);
        boolean boolean15 = node12.isNot();
        int int16 = node12.getLineno();
        boolean boolean17 = node12.isAdd();
        com.google.javascript.rhino.Node node18 = node12.cloneTree();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean25 = node24.isThis();
        node21.addChildToBack(node24);
        boolean boolean27 = node24.isNot();
        int int28 = node24.getLineno();
        boolean boolean29 = node24.isAdd();
        boolean boolean30 = node18.hasChild(node24);
        boolean boolean31 = node24.isDefaultCase();
        int int32 = node24.getSourcePosition();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean36 = node35.isTypeOf();
        boolean boolean37 = node35.isRegExp();
        com.google.javascript.rhino.Node node38 = node24.copyInformationFromForTree(node35);
        boolean boolean39 = node38.isBlock();
        boolean boolean40 = node38.isLabel();
        com.google.javascript.rhino.Node node41 = node3.srcrefTree(node38);
        java.lang.String str42 = node3.getQualifiedName();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean49 = node48.isThis();
        node45.addChildToBack(node48);
        boolean boolean51 = node48.isNot();
        int int52 = node48.getLineno();
        boolean boolean53 = node48.isDo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node54 = node3.getChildBefore(node48);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        boolean boolean8 = node5.isNot();
        int int9 = node5.getLineno();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean16 = node15.isThis();
        node12.addChildToBack(node15);
        boolean boolean18 = node15.isNot();
        int int19 = node15.getLineno();
        com.google.javascript.rhino.Node node20 = node5.srcref(node15);
        int int21 = node5.getCharno();
        boolean boolean22 = node5.isQuotedString();
        boolean boolean23 = node5.isIf();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean30 = node29.isThis();
        node26.addChildToBack(node29);
        boolean boolean32 = node29.isNot();
        int int33 = node29.getLineno();
        boolean boolean34 = node29.isAdd();
        com.google.javascript.rhino.Node node35 = node5.useSourceInfoFromForTree(node29);
        com.google.javascript.rhino.Node node37 = node29.getAncestor(45);
        boolean boolean38 = node29.isGetterDef();
        boolean boolean39 = node29.isFalse();
        boolean boolean40 = node29.isSetterDef();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean47 = node46.isThis();
        node43.addChildToBack(node46);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable49 = node43.siblings();
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet52 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet52, strArray51);
        node43.setDirectives((java.util.Set<java.lang.String>) strSet52);
        node43.putBooleanProp(0, false);
        node43.setSourceFileForTesting("OR hi!\n    OR hi!\n");
        boolean boolean60 = node43.isThrow();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile61 = node43.getStaticSourceFile();
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean68 = node67.isThis();
        node64.addChildToBack(node67);
        boolean boolean70 = node64.isDebugger();
        com.google.javascript.rhino.Node node71 = node64.getFirstChild();
        boolean boolean72 = node64.isSwitch();
        int int73 = node43.getIndexOfChild(node64);
        boolean boolean74 = node64.isNull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node29.removeChild(node64);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        boolean boolean8 = node2.isDebugger();
        node2.setSourceFileForTesting("");
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean17 = node16.isThis();
        node13.addChildToBack(node16);
        boolean boolean19 = node16.isNot();
        int int20 = node16.getLineno();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean27 = node26.isThis();
        node23.addChildToBack(node26);
        boolean boolean29 = node26.isNot();
        int int30 = node26.getLineno();
        com.google.javascript.rhino.Node node31 = node16.srcref(node26);
        int int32 = node16.getCharno();
        com.google.javascript.rhino.Node node33 = node2.copyInformationFrom(node16);
        java.lang.String str34 = node2.getQualifiedName();
        int int35 = node2.getSideEffectFlags();
        int int36 = node2.getChildCount();
        com.google.javascript.rhino.Node node37 = node2.removeFirstChild();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString("{1574821220}");
        boolean boolean40 = node39.isIn();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node41 = node2.getChildBefore(node39);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList0 = com.google.common.collect.ImmutableList.of();
        java.lang.Object[] objArray1 = nodeIterableList0.toArray();
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList2 = nodeIterableList0.reverse();
        java.util.stream.Stream<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableStream3 = nodeIterableList0.stream();
        java.lang.String[] strArray5 = new java.lang.String[] { "OR hi!\n" };
        java.lang.String[] strArray6 = nodeIterableList0.toArray(strArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList7 = com.google.common.collect.ImmutableList.copyOf((java.lang.CharSequence[]) strArray6);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean3 = node2.isThis();
        boolean boolean4 = node2.isDelProp();
        int int5 = node2.getChildCount();
        boolean boolean6 = node2.isComma();
        boolean boolean7 = node2.isNoSideEffectsCall();
        boolean boolean8 = node2.isDec();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node10 = node2.getChildAtIndex((int) '#');
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        com.google.javascript.rhino.InputId inputId1 = new com.google.javascript.rhino.InputId("InputId: ");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder3 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean4 = jSDocInfoBuilder3.recordInterface();
        boolean boolean5 = jSDocInfoBuilder3.isInterfaceRecorded();
        boolean boolean6 = jSDocInfoBuilder3.recordIdGenerator();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean10 = node9.isGetElem();
        jSDocInfoBuilder3.markTypeNode(node9, (int) '#', (int) (short) -1, (int) '4', 2, false);
        java.lang.String str17 = node9.toStringTree();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean21 = node20.isThis();
        boolean boolean22 = node20.isDelProp();
        int int23 = node20.getChildCount();
        boolean boolean24 = node20.isComma();
        boolean boolean25 = node20.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node26 = node9.srcrefTree(node20);
        boolean boolean27 = inputId1.equals((java.lang.Object) node26);
        boolean boolean28 = node26.wasEmptyNode();
        boolean boolean29 = node26.isTry();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean36 = node35.isThis();
        node32.addChildToBack(node35);
        boolean boolean38 = node32.isDec();
        boolean boolean39 = node32.isBlock();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean46 = node45.isThis();
        node42.addChildToBack(node45);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable48 = node42.siblings();
        java.lang.String[] strArray50 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet51 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet51, strArray50);
        node42.setDirectives((java.util.Set<java.lang.String>) strSet51);
        int int54 = strSet51.size();
        strSet51.clear();
        node32.setDirectives((java.util.Set<java.lang.String>) strSet51);
        boolean boolean57 = node32.isCase();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable58 = node32.siblings();
        int int59 = node32.getLineno();
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean66 = node65.isThis();
        node62.addChildToBack(node65);
        boolean boolean68 = node62.isDebugger();
        boolean boolean69 = node62.isVoid();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean73 = node72.isTypeOf();
        com.google.javascript.rhino.Node node74 = node62.srcrefTree(node72);
        boolean boolean75 = node74.isObjectLit();
        boolean boolean76 = node74.isCall();
        com.google.javascript.rhino.Node node79 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean83 = node82.isThis();
        node79.addChildToBack(node82);
        boolean boolean85 = node79.isDebugger();
        boolean boolean86 = node79.isVoid();
        com.google.javascript.rhino.Node node89 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean90 = node89.isTypeOf();
        com.google.javascript.rhino.Node node91 = node79.srcrefTree(node89);
        boolean boolean92 = node91.isObjectLit();
        boolean boolean93 = node91.isExprResult();
        boolean boolean94 = node74.hasChild(node91);
        com.google.javascript.rhino.Node node95 = node32.useSourceInfoFromForTree(node74);
        com.google.javascript.rhino.Node node96 = node95.cloneTree();
        java.lang.String str97 = node95.getString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node98 = node26.getChildBefore(node95);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean6 = node5.isThis();
        node2.addChildToBack(node5);
        boolean boolean8 = node5.isAdd();
        boolean boolean9 = node5.isExprResult();
        boolean boolean10 = node5.isThrow();
        boolean boolean11 = node5.isVarArgs();
        boolean boolean12 = node5.isGetProp();
        boolean boolean13 = node5.isReturn();
        boolean boolean14 = node5.isInstanceOf();
        boolean boolean15 = node5.isComma();
        boolean boolean16 = node5.isCase();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean20 = node19.isThis();
        java.lang.String str21 = node19.getSourceFileName();
        node19.setSourceEncodedPosition(46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node5.removeChild(node19);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString((int) ' ', "hi!", 38, (int) (short) 0);
        com.google.javascript.rhino.Node node5 = node4.cloneNode();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean12 = node11.isThis();
        node8.addChildToBack(node11);
        boolean boolean14 = node11.isNot();
        int int15 = node11.getLineno();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean22 = node21.isThis();
        node18.addChildToBack(node21);
        boolean boolean24 = node21.isNot();
        int int25 = node21.getLineno();
        com.google.javascript.rhino.Node node26 = node11.srcref(node21);
        boolean boolean27 = node11.isString();
        boolean boolean28 = node11.isRegExp();
        boolean boolean29 = node5.isEquivalentToTyped(node11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node31 = node11.getChildAtIndex(143360);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList0 = com.google.common.collect.ImmutableList.of();
        java.lang.Object[] objArray1 = nodeIterableList0.toArray();
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList2 = nodeIterableList0.reverse();
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList6 = com.google.common.collect.ImmutableList.of();
        java.lang.Object[] objArray7 = nodeIterableList6.toArray();
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList8 = nodeIterableList6.reverse();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean16 = node15.isThis();
        node12.addChildToBack(node15);
        java.lang.Object[] objArray18 = new java.lang.Object[] { 45, (short) -1, (short) -1, nodeIterableList8, 52, node15 };
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList22 = com.google.common.collect.ImmutableList.of();
        java.lang.Object[] objArray23 = nodeIterableList22.toArray();
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList24 = nodeIterableList22.reverse();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean32 = node31.isThis();
        node28.addChildToBack(node31);
        java.lang.Object[] objArray34 = new java.lang.Object[] { 45, (short) -1, (short) -1, nodeIterableList24, 52, node31 };
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList38 = com.google.common.collect.ImmutableList.of();
        java.lang.Object[] objArray39 = nodeIterableList38.toArray();
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList40 = nodeIterableList38.reverse();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean48 = node47.isThis();
        node44.addChildToBack(node47);
        java.lang.Object[] objArray50 = new java.lang.Object[] { 45, (short) -1, (short) -1, nodeIterableList40, 52, node47 };
        java.lang.Object[][] objArray51 = new java.lang.Object[][] { objArray18, objArray34, objArray50 };
        java.lang.Object[][] objArray52 = nodeIterableList2.toArray(objArray51);
        int int53 = nodeIterableList2.size();
        int int54 = nodeIterableList2.size();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder56 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean57 = jSDocInfoBuilder56.recordInterface();
        boolean boolean59 = jSDocInfoBuilder56.recordDescription("hi!");
        boolean boolean60 = jSDocInfoBuilder56.recordHiddenness();
        boolean boolean61 = jSDocInfoBuilder56.recordExpose();
        boolean boolean62 = jSDocInfoBuilder56.recordNoCompile();
        boolean boolean63 = jSDocInfoBuilder56.recordConstructor();
        jSDocInfoBuilder56.recordOriginalCommentString("OR hi!");
        int int66 = nodeIterableList2.indexOf((java.lang.Object) jSDocInfoBuilder56);
        java.util.AbstractSet[] abstractSetArray68 = new java.util.AbstractSet[0];
        @SuppressWarnings("unchecked")
        java.util.AbstractSet<java.lang.String>[] strSetArray69 = (java.util.AbstractSet<java.lang.String>[]) abstractSetArray68;
        java.util.AbstractSet[] abstractSetArray71 = new java.util.AbstractSet[0];
        @SuppressWarnings("unchecked")
        java.util.AbstractSet<java.lang.String>[] strSetArray72 = (java.util.AbstractSet<java.lang.String>[]) abstractSetArray71;
        java.util.AbstractSet[] abstractSetArray74 = new java.util.AbstractSet[0];
        @SuppressWarnings("unchecked")
        java.util.AbstractSet<java.lang.String>[] strSetArray75 = (java.util.AbstractSet<java.lang.String>[]) abstractSetArray74;
        java.util.AbstractSet[] abstractSetArray77 = new java.util.AbstractSet[0];
        @SuppressWarnings("unchecked")
        java.util.AbstractSet<java.lang.String>[] strSetArray78 = (java.util.AbstractSet<java.lang.String>[]) abstractSetArray77;
        java.util.AbstractSet[] abstractSetArray80 = new java.util.AbstractSet[0];
        @SuppressWarnings("unchecked")
        java.util.AbstractSet<java.lang.String>[] strSetArray81 = (java.util.AbstractSet<java.lang.String>[]) abstractSetArray80;
        java.util.AbstractSet[][] abstractSetArray83 = new java.util.AbstractSet[5][];
        @SuppressWarnings("unchecked")
        java.util.AbstractSet<java.lang.String>[][] strSetArray84 = (java.util.AbstractSet<java.lang.String>[][]) abstractSetArray83;
        strSetArray84[0] = abstractSetArray68;
        strSetArray84[1] = abstractSetArray71;
        strSetArray84[2] = abstractSetArray74;
        strSetArray84[3] = abstractSetArray77;
        strSetArray84[4] = abstractSetArray80;
        java.util.AbstractSet<java.lang.String>[][] strSetArray95 = nodeIterableList2.toArray(strSetArray84);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.common.collect.ImmutableList<java.util.AbstractCollection<java.lang.String>[]> strCollectionArrayList96 = com.google.common.collect.ImmutableList.copyOf((java.util.AbstractCollection<java.lang.String>[][]) strSetArray84);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        com.google.javascript.rhino.Node[] nodeArray5 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((int) 'a', nodeArray5, 8202, (int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) 'a', nodeArray5);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(43, nodeArray5);
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node((int) (byte) 10, nodeArray5);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((-1), nodeArray5);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean19 = node18.isThis();
        node15.addChildToBack(node18);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable21 = node15.siblings();
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        node15.setDirectives((java.util.Set<java.lang.String>) strSet24);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean30 = node29.isThis();
        boolean boolean31 = strSet24.remove((java.lang.Object) boolean30);
        com.google.javascript.rhino.JSDocInfo jSDocInfo32 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Set<java.lang.String> strSet33 = jSDocInfo32.getSuppressions();
        boolean boolean34 = jSDocInfo32.isNoSideEffects();
        boolean boolean35 = jSDocInfo32.isConsistentIdGenerator();
        boolean boolean36 = strSet24.contains((java.lang.Object) jSDocInfo32);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean43 = node42.isThis();
        node39.addChildToBack(node42);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable45 = node39.siblings();
        java.lang.String[] strArray47 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        node39.setDirectives((java.util.Set<java.lang.String>) strSet48);
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList51 = com.google.common.collect.ImmutableList.of();
        java.lang.Object[] objArray52 = nodeIterableList51.toArray();
        boolean boolean53 = strSet48.removeAll((java.util.Collection<java.lang.Iterable<com.google.javascript.rhino.Node>>) nodeIterableList51);
        com.google.common.collect.ImmutableList<java.lang.Iterable<com.google.javascript.rhino.Node>> nodeIterableList54 = com.google.common.collect.ImmutableList.of();
        boolean boolean55 = strSet48.contains((java.lang.Object) nodeIterableList54);
        boolean boolean56 = strSet48.isEmpty();
        com.google.common.collect.ImmutableList<java.util.AbstractCollection<java.lang.String>> strCollectionList57 = com.google.common.collect.ImmutableList.of((java.util.AbstractCollection<java.lang.String>) strSet24, (java.util.AbstractCollection<java.lang.String>) strSet48);
        java.lang.Object[] objArray58 = strSet24.toArray();
        java.util.Spliterator<java.lang.String> strSpliterator59 = strSet24.spliterator();
        node12.setDirectives((java.util.Set<java.lang.String>) strSet24);
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition61 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.Node node62 = typePosition61.getItem();
        com.google.javascript.rhino.Node node63 = typePosition61.getItem();
        int int64 = typePosition61.getPositionOnEndLine();
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean71 = node70.isThis();
        node67.addChildToBack(node70);
        boolean boolean73 = node70.isNot();
        int int74 = node70.getLineno();
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node80 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean81 = node80.isThis();
        node77.addChildToBack(node80);
        boolean boolean83 = node80.isNot();
        int int84 = node80.getLineno();
        com.google.javascript.rhino.Node node85 = node70.srcref(node80);
        boolean boolean86 = node85.isNE();
        typePosition61.setItem(node85);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node88 = node12.getChildBefore(node85);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(40);
        boolean boolean2 = node1.isReturn();
        boolean boolean3 = node1.isSetterDef();
        boolean boolean4 = node1.isSyntheticBlock();
        com.google.javascript.rhino.Node node5 = node1.getParent();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean13 = node12.isThis();
        node9.addChildToBack(node12);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean21 = node20.isThis();
        node17.addChildToBack(node20);
        boolean boolean23 = node17.isDebugger();
        boolean boolean24 = node17.isSyntheticBlock();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(46);
        boolean boolean27 = node26.isCall();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString((int) (short) 100, "hi!");
        boolean boolean34 = node33.isThis();
        node30.addChildToBack(node33);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable36 = node30.siblings();
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        node30.setDirectives((java.util.Set<java.lang.String>) strSet39);
        node30.detachChildren();
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(45, node9, node17, node26, node30, (int) (short) 10, 8);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString(41, "Node tree inequality:\nTree1:\nOR hi! [empty_block: 1]\n    OR hi!\n\n\nTree2:\nOR hi!\n\n\nSubtree1: OR hi! [empty_block: 1]\n    OR hi!\n\n\nSubtree2: OR hi!\n", 49, 12);
        com.google.javascript.rhino.Node node51 = node26.srcref(node50);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node51);
    }
}


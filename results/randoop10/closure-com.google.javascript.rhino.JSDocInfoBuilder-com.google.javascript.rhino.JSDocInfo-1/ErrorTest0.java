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
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int4 = node3.getSourceOffset();
        boolean boolean5 = node3.hasChildren();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node9.setIsSyntheticBlock(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node12 = node3.getChildBefore(node9);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean4 = node3.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node5 = node3.cloneNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node7 = node3.getChildAtIndex(176129);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj5 = node3.getProp(43);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int10 = node9.getSourceOffset();
        com.google.javascript.rhino.Node node11 = node3.useSourceInfoIfMissingFromForTree(node9);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        node15.setDirectives((java.util.Set<java.lang.String>) strSet18);
        com.google.javascript.rhino.Node node21 = node9.useSourceInfoIfMissingFromForTree(node15);
        boolean boolean22 = node21.isContinue();
        boolean boolean23 = node21.isOnlyModifiesThisCall();
        boolean boolean24 = node21.isDefaultCase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node26 = node21.getChildAtIndex((int) ' ');
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node3.addChildrenToFront(node7);
        com.google.javascript.rhino.Node node10 = node3.getChildAtIndex(0);
        java.lang.String str11 = node10.toString();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int17 = node16.getSourceOffset();
        com.google.javascript.rhino.jstype.JSType jSType18 = node16.getJSType();
        boolean boolean19 = node16.isWith();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node24.addChildrenToFront(node28);
        boolean boolean30 = node24.isGetterDef();
        boolean boolean31 = node24.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj37 = node35.getProp(43);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int42 = node41.getSourceOffset();
        com.google.javascript.rhino.Node node43 = node35.useSourceInfoIfMissingFromForTree(node41);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray49 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet50 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet50, strArray49);
        node47.setDirectives((java.util.Set<java.lang.String>) strSet50);
        com.google.javascript.rhino.Node node53 = node41.useSourceInfoIfMissingFromForTree(node47);
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node(32, node24, node41);
        boolean boolean55 = node54.isExprResult();
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((int) (byte) 0, node16, node54);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node10.removeChild(node54);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj10 = node8.getProp(43);
        boolean boolean11 = node8.isCall();
        boolean boolean12 = node8.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression14 = new com.google.javascript.rhino.JSTypeExpression(node8, "STRING ");
        boolean boolean15 = node8.isDo();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node19.addChildrenToFront(node23);
        boolean boolean25 = node23.isComma();
        com.google.javascript.rhino.Node node26 = node8.useSourceInfoFromForTree(node23);
        boolean boolean27 = node26.isAssignAdd();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int32 = node31.getSourceOffset();
        node31.detachChildren();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.replaceChild(node26, node31);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj5 = node3.getProp(43);
        boolean boolean6 = node3.isCall();
        boolean boolean7 = node3.isEmpty();
        boolean boolean8 = node3.isInstanceOf();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node10 = node3.getChildAtIndex(37);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj6 = node4.getProp(43);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        boolean boolean11 = node10.isIf();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj17 = node15.getProp(43);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int22 = node21.getSourceOffset();
        com.google.javascript.rhino.Node node23 = node15.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean24 = node23.isAssignAdd();
        boolean boolean25 = node23.isEmpty();
        node23.setSourceEncodedPosition(40);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean32 = node31.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        node36.setDirectives((java.util.Set<java.lang.String>) strSet39);
        java.lang.Object obj43 = node36.getProp((int) (byte) 1);
        com.google.javascript.rhino.Node node44 = node31.copyInformationFrom(node36);
        boolean boolean45 = node31.isOr();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(1, node4, node10, node23, node31, 176180, 1);
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj54 = node52.getProp(43);
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int59 = node58.getSourceOffset();
        com.google.javascript.rhino.Node node60 = node52.useSourceInfoIfMissingFromForTree(node58);
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray66 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet67 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet67, strArray66);
        node64.setDirectives((java.util.Set<java.lang.String>) strSet67);
        com.google.javascript.rhino.Node node70 = node58.useSourceInfoIfMissingFromForTree(node64);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node71 = node4.getChildBefore(node70);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = com.google.common.collect.ImmutableList.of("", "hi!", "", "", "hi!", "", "hi!", "");
        int int10 = strList8.indexOf((java.lang.Object) 'a');
        java.util.Spliterator<java.lang.String> strSpliterator11 = strList8.spliterator();
        com.google.common.collect.ImmutableList<java.lang.String> strList20 = com.google.common.collect.ImmutableList.of("", "hi!", "", "", "hi!", "", "hi!", "");
        int int22 = strList20.indexOf((java.lang.Object) 'a');
        int int23 = strList20.size();
        boolean boolean24 = strList8.containsAll((java.util.Collection<java.lang.String>) strList20);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node28.addChildrenToFront(node32);
        node32.setQuotedString();
        boolean boolean35 = node32.isHook();
        boolean boolean36 = strList20.equals((java.lang.Object) node32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node38 = node32.getChildAtIndex(42);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node4 = node3.getNext();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition5 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean6 = typePosition5.hasBrackets();
        int int7 = typePosition5.getEndLine();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node11.addChildrenToFront(node15);
        boolean boolean17 = node11.isGetterDef();
        boolean boolean18 = node11.isEmpty();
        typePosition5.setItem(node11);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node11.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node21 = node3.getChildBefore(node11);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        com.google.javascript.rhino.Node[] nodeArray2 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(42, nodeArray2, (int) (byte) 1, 43);
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(39, nodeArray2, (int) '4', 32);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj15 = node13.getProp(43);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int20 = node19.getSourceOffset();
        com.google.javascript.rhino.Node node21 = node13.useSourceInfoIfMissingFromForTree(node19);
        int int22 = node13.getSourceOffset();
        com.google.javascript.rhino.JSDocInfo jSDocInfo23 = node13.getJSDocInfo();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(49, node13, (int) (byte) -1, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node27 = node8.getChildBefore(node26);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean4 = node3.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node5 = node3.cloneNode();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj11 = node9.getProp(43);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int16 = node15.getSourceOffset();
        com.google.javascript.rhino.Node node17 = node9.useSourceInfoIfMissingFromForTree(node15);
        boolean boolean18 = node17.isIf();
        boolean boolean19 = node17.isAnd();
        node17.detachChildren();
        com.google.javascript.rhino.Node node21 = node5.useSourceInfoIfMissingFromForTree(node17);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj27 = node25.getProp(43);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int32 = node31.getSourceOffset();
        com.google.javascript.rhino.Node node33 = node25.useSourceInfoIfMissingFromForTree(node31);
        int int34 = node25.getSourceOffset();
        com.google.javascript.rhino.JSDocInfo jSDocInfo35 = node25.getJSDocInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node36 = node17.getChildBefore(node25);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean2 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean3 = jSDocInfoBuilder1.recordConstructor();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder5 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean6 = jSDocInfoBuilder5.isInterfaceRecorded();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder5.recordParameter("", jSTypeExpression8);
        boolean boolean10 = jSDocInfoBuilder5.recordExterns();
        boolean boolean11 = jSDocInfoBuilder5.recordPreserveTry();
        boolean boolean12 = jSDocInfoBuilder5.recordNoCompile();
        boolean boolean14 = jSDocInfoBuilder5.recordLends("");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder16 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean17 = jSDocInfoBuilder16.recordJavaDispatch();
        jSDocInfoBuilder16.markText("hi!", (-1), (int) (byte) -1, 4095, 1);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder25 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean26 = jSDocInfoBuilder25.recordJavaDispatch();
        boolean boolean27 = jSDocInfoBuilder25.recordNoCompile();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj34 = node32.getProp(43);
        boolean boolean35 = node32.isCall();
        boolean boolean36 = node32.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression38 = new com.google.javascript.rhino.JSTypeExpression(node32, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder39 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray41 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray42 = (java.util.ArrayList<java.lang.String>[]) arrayListArray41;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder43 = strListBuilder39.add((java.util.ArrayList<java.lang.String>[]) arrayListArray41);
        boolean boolean44 = jSTypeExpression38.equals((java.lang.Object) arrayListArray41);
        boolean boolean45 = jSDocInfoBuilder25.recordParameter("", jSTypeExpression38);
        boolean boolean46 = jSDocInfoBuilder16.recordThrowType(jSTypeExpression38);
        boolean boolean47 = jSDocInfoBuilder5.recordBaseType(jSTypeExpression38);
        boolean boolean48 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression38);
        jSDocInfoBuilder1.recordOriginalCommentString("OR  54\n");
        boolean boolean51 = jSDocInfoBuilder1.recordDeprecated();
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean56 = node55.isVar();
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node61 = node55.copyInformationFromForTree(node60);
        com.google.javascript.rhino.Node node62 = node55.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression64 = new com.google.javascript.rhino.JSTypeExpression(node62, "STRING  43");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression65 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression64);
        boolean boolean66 = jSDocInfoBuilder1.recordBaseType(jSTypeExpression65);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression38 and jSTypeExpression64", jSTypeExpression38.equals(jSTypeExpression64) ? jSTypeExpression38.hashCode() == jSTypeExpression64.hashCode() : true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean1 = typePosition0.hasBrackets();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean6 = node5.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        node10.setDirectives((java.util.Set<java.lang.String>) strSet13);
        java.lang.Object obj17 = node10.getProp((int) (byte) 1);
        com.google.javascript.rhino.Node node18 = node5.copyInformationFrom(node10);
        typePosition0.setItem(node18);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj25 = node23.getProp(43);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int30 = node29.getSourceOffset();
        com.google.javascript.rhino.Node node31 = node23.useSourceInfoIfMissingFromForTree(node29);
        boolean boolean32 = node31.isAssignAdd();
        boolean boolean33 = node31.isFromExterns();
        com.google.javascript.rhino.Node node34 = node18.copyInformationFromForTree(node31);
        boolean boolean35 = node18.isDelProp();
        boolean boolean36 = node18.hasOneChild();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj42 = node40.getProp(43);
        int int43 = node40.getType();
        boolean boolean44 = node40.isGetterDef();
        node40.setSourceEncodedPositionForTree(54);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node47 = node18.getChildBefore(node40);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean2 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean3 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder5 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean6 = jSDocInfoBuilder5.isInterfaceRecorded();
        boolean boolean8 = jSDocInfoBuilder5.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj14 = node12.getProp(43);
        boolean boolean15 = node12.isCall();
        boolean boolean16 = node12.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression18 = new com.google.javascript.rhino.JSTypeExpression(node12, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder19 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray21 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray22 = (java.util.ArrayList<java.lang.String>[]) arrayListArray21;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder23 = strListBuilder19.add((java.util.ArrayList<java.lang.String>[]) arrayListArray21);
        boolean boolean24 = jSTypeExpression18.equals((java.lang.Object) arrayListArray21);
        boolean boolean25 = jSDocInfoBuilder5.recordDefineType(jSTypeExpression18);
        boolean boolean26 = jSTypeExpression18.isVarArgs();
        java.lang.Object obj27 = null;
        boolean boolean28 = jSTypeExpression18.equals(obj27);
        boolean boolean29 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression18);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean34 = node33.isVar();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node39 = node33.copyInformationFromForTree(node38);
        com.google.javascript.rhino.Node node40 = node33.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression42 = new com.google.javascript.rhino.JSTypeExpression(node40, "STRING  43");
        boolean boolean43 = jSDocInfoBuilder1.recordExtendedInterface(jSTypeExpression42);
        boolean boolean44 = jSDocInfoBuilder1.recordDeprecated();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression18 and jSTypeExpression42", jSTypeExpression18.equals(jSTypeExpression42) ? jSTypeExpression18.hashCode() == jSTypeExpression42.hashCode() : true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean5 = node4.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        node9.setDirectives((java.util.Set<java.lang.String>) strSet12);
        java.lang.Object obj16 = node9.getProp((int) (byte) 1);
        com.google.javascript.rhino.Node node17 = node4.copyInformationFrom(node9);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        boolean boolean22 = node21.isNull();
        boolean boolean23 = node21.isSyntheticBlock();
        com.google.javascript.rhino.Node node24 = node21.removeChildren();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        boolean boolean29 = node28.isDebugger();
        com.google.javascript.rhino.Node node30 = node28.getFirstChild();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj36 = node34.getProp(43);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int41 = node40.getSourceOffset();
        com.google.javascript.rhino.Node node42 = node34.useSourceInfoIfMissingFromForTree(node40);
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(38, node9, node21, node28, node34);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj49 = node47.getProp(43);
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int54 = node53.getSourceOffset();
        com.google.javascript.rhino.Node node55 = node47.useSourceInfoIfMissingFromForTree(node53);
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray61 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet62 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet62, strArray61);
        node59.setDirectives((java.util.Set<java.lang.String>) strSet62);
        com.google.javascript.rhino.Node node65 = node53.useSourceInfoIfMissingFromForTree(node59);
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean70 = node69.isVar();
        node69.putBooleanProp(30, false);
        boolean boolean74 = node69.isSwitch();
        boolean boolean75 = node69.isUnscopedQualifiedName();
        boolean boolean76 = node69.hasChildren();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node21.replaceChild(node59, node69);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node3.addChildrenToFront(node7);
        boolean boolean9 = node7.isComma();
        boolean boolean10 = node7.isThis();
        boolean boolean11 = node7.isOptionalArg();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node13 = node7.getChildAtIndex(176180);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj5 = node3.getProp(43);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int10 = node9.getSourceOffset();
        com.google.javascript.rhino.Node node11 = node3.useSourceInfoIfMissingFromForTree(node9);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        node15.setDirectives((java.util.Set<java.lang.String>) strSet18);
        com.google.javascript.rhino.Node node21 = node9.useSourceInfoIfMissingFromForTree(node15);
        boolean boolean22 = node21.isContinue();
        boolean boolean23 = node21.isOnlyModifiesThisCall();
        boolean boolean24 = node21.isDefaultCase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node26 = node21.getChildAtIndex(30);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean3 = jSDocInfoBuilder1.recordVersion("");
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile5 = null;
        jSDocInfoBuilder1.markName("hi!", staticSourceFile5, (int) (short) 0, (int) (short) 100);
        boolean boolean9 = jSDocInfoBuilder1.recordNoTypeCheck();
        boolean boolean10 = jSDocInfoBuilder1.recordExpose();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node14.addChildrenToFront(node18);
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = jSDocInfoBuilder1.build(node18);
        boolean boolean21 = jSDocInfoBuilder1.shouldParseDocumentation();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean26 = node25.isVar();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node31 = node25.copyInformationFromForTree(node30);
        com.google.javascript.rhino.Node node32 = node25.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression34 = new com.google.javascript.rhino.JSTypeExpression(node32, "STRING  43");
        boolean boolean35 = jSTypeExpression34.isVarArgs();
        boolean boolean36 = jSDocInfoBuilder1.recordBaseType(jSTypeExpression34);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder38 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean39 = jSDocInfoBuilder38.recordJavaDispatch();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder41 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression42 = null;
        boolean boolean43 = jSDocInfoBuilder41.recordTypedef(jSTypeExpression42);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder45 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean46 = jSDocInfoBuilder45.recordNoTypeCheck();
        boolean boolean47 = jSDocInfoBuilder45.isInterfaceRecorded();
        jSDocInfoBuilder45.markAnnotation("[, hi!, , , hi!, , hi!, ]", (int) (short) 0, 2);
        boolean boolean52 = jSDocInfoBuilder45.recordIdGenerator();
        boolean boolean53 = jSDocInfoBuilder45.recordNoAlias();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder55 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean56 = jSDocInfoBuilder55.isInterfaceRecorded();
        boolean boolean58 = jSDocInfoBuilder55.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj64 = node62.getProp(43);
        boolean boolean65 = node62.isCall();
        boolean boolean66 = node62.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression68 = new com.google.javascript.rhino.JSTypeExpression(node62, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder69 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray71 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray72 = (java.util.ArrayList<java.lang.String>[]) arrayListArray71;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder73 = strListBuilder69.add((java.util.ArrayList<java.lang.String>[]) arrayListArray71);
        boolean boolean74 = jSTypeExpression68.equals((java.lang.Object) arrayListArray71);
        boolean boolean75 = jSDocInfoBuilder55.recordDefineType(jSTypeExpression68);
        boolean boolean76 = jSDocInfoBuilder45.recordThisType(jSTypeExpression68);
        boolean boolean77 = jSDocInfoBuilder41.recordThisType(jSTypeExpression68);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression78 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression68);
        boolean boolean79 = jSDocInfoBuilder38.recordTypedef(jSTypeExpression78);
        boolean boolean80 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression78);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression34 and jSTypeExpression68", jSTypeExpression34.equals(jSTypeExpression68) ? jSTypeExpression34.hashCode() == jSTypeExpression68.hashCode() : true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean4 = node3.isVar();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node9 = node3.copyInformationFromForTree(node8);
        boolean boolean10 = node9.isRegExp();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj16 = node14.getProp(43);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int21 = node20.getSourceOffset();
        com.google.javascript.rhino.Node node22 = node14.useSourceInfoIfMissingFromForTree(node20);
        boolean boolean23 = node22.isIf();
        boolean boolean24 = node22.isAnd();
        boolean boolean25 = node22.isVar();
        node22.setType((int) (byte) -1);
        node22.setSourceEncodedPositionForTree((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node30 = node9.getChildBefore(node22);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj5 = node3.getProp(43);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int10 = node9.getSourceOffset();
        com.google.javascript.rhino.Node node11 = node3.useSourceInfoIfMissingFromForTree(node9);
        boolean boolean12 = node11.isSyntheticBlock();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int17 = node16.getSourceOffset();
        double double18 = node16.getDouble();
        boolean boolean19 = node16.isFor();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable20 = node16.getAncestors();
        com.google.javascript.rhino.Node node21 = node11.clonePropsFrom(node16);
        boolean boolean22 = node21.isIn();
        boolean boolean23 = node21.isBlock();
        com.google.javascript.rhino.Node node24 = node21.getNext();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean29 = node28.isVar();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node34 = node28.copyInformationFromForTree(node33);
        com.google.javascript.rhino.JSDocInfo jSDocInfo35 = node34.getJSDocInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node21.removeChild(node34);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean4 = node3.isVar();
        node3.putBooleanProp(30, false);
        boolean boolean8 = node3.isSwitch();
        boolean boolean9 = node3.isUnscopedQualifiedName();
        boolean boolean10 = node3.hasChildren();
        boolean boolean11 = node3.isDefaultCase();
        boolean boolean12 = node3.hasOneChild();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj18 = node16.getProp(43);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int23 = node22.getSourceOffset();
        com.google.javascript.rhino.Node node24 = node16.useSourceInfoIfMissingFromForTree(node22);
        boolean boolean25 = node24.isIf();
        boolean boolean26 = node24.isBreak();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node24);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean2 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean3 = jSDocInfoBuilder1.isConstructorRecorded();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder5 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean6 = jSDocInfoBuilder5.isInterfaceRecorded();
        boolean boolean8 = jSDocInfoBuilder5.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj14 = node12.getProp(43);
        boolean boolean15 = node12.isCall();
        boolean boolean16 = node12.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression18 = new com.google.javascript.rhino.JSTypeExpression(node12, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder19 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray21 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray22 = (java.util.ArrayList<java.lang.String>[]) arrayListArray21;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder23 = strListBuilder19.add((java.util.ArrayList<java.lang.String>[]) arrayListArray21);
        boolean boolean24 = jSTypeExpression18.equals((java.lang.Object) arrayListArray21);
        boolean boolean25 = jSDocInfoBuilder5.recordDefineType(jSTypeExpression18);
        com.google.javascript.rhino.Node node26 = jSTypeExpression18.getRoot();
        boolean boolean28 = jSDocInfoBuilder1.recordThrowDescription(jSTypeExpression18, "Node tree inequality:\nTree1:\nSTRING  43\n\n\nTree2:\nTYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n\n\nSubtree1: STRING  43\n\n\nSubtree2: TYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder30 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean31 = jSDocInfoBuilder30.isInterfaceRecorded();
        boolean boolean33 = jSDocInfoBuilder30.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj39 = node37.getProp(43);
        boolean boolean40 = node37.isCall();
        boolean boolean41 = node37.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression43 = new com.google.javascript.rhino.JSTypeExpression(node37, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder44 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray46 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray47 = (java.util.ArrayList<java.lang.String>[]) arrayListArray46;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder48 = strListBuilder44.add((java.util.ArrayList<java.lang.String>[]) arrayListArray46);
        boolean boolean49 = jSTypeExpression43.equals((java.lang.Object) arrayListArray46);
        boolean boolean50 = jSDocInfoBuilder30.recordDefineType(jSTypeExpression43);
        boolean boolean51 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression43);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder53 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean54 = jSDocInfoBuilder53.recordNoTypeCheck();
        boolean boolean55 = jSDocInfoBuilder53.isInterfaceRecorded();
        jSDocInfoBuilder53.markAnnotation("[, hi!, , , hi!, , hi!, ]", (int) (short) 0, 2);
        boolean boolean60 = jSDocInfoBuilder53.recordIdGenerator();
        boolean boolean61 = jSDocInfoBuilder53.recordInterface();
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean66 = node65.isVar();
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node71 = node65.copyInformationFromForTree(node70);
        com.google.javascript.rhino.Node node72 = node65.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression74 = new com.google.javascript.rhino.JSTypeExpression(node72, "STRING  43");
        boolean boolean75 = jSTypeExpression74.isVarArgs();
        boolean boolean76 = jSDocInfoBuilder53.recordDefineType(jSTypeExpression74);
        boolean boolean77 = jSDocInfoBuilder1.recordBaseType(jSTypeExpression74);
        boolean boolean79 = jSDocInfoBuilder1.addAuthor("NUMBER 12.0\n");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression18 and jSTypeExpression74", jSTypeExpression18.equals(jSTypeExpression74) ? jSTypeExpression18.hashCode() == jSTypeExpression74.hashCode() : true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString((int) (short) 10, "Node tree inequality:\nTree1:\nSTRING  43\n\n\nTree2:\nTYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n\n\nSubtree1: STRING  43\n\n\nSubtree2: TYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n", 51, 46);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj11 = node9.getProp(43);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int16 = node15.getSourceOffset();
        com.google.javascript.rhino.Node node17 = node9.useSourceInfoIfMissingFromForTree(node15);
        int int18 = node9.getSourceOffset();
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = node9.getJSDocInfo();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(49, node9, (int) (byte) -1, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.removeChild(node22);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean4 = node3.isVar();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node9 = node3.copyInformationFromForTree(node8);
        boolean boolean10 = node3.isIf();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj16 = node14.getProp(43);
        boolean boolean17 = node14.isCall();
        int int18 = node14.getSourcePosition();
        java.lang.String str22 = node14.toString(false, true, false);
        boolean boolean23 = node14.isDo();
        boolean boolean24 = node14.isWith();
        boolean boolean25 = node14.isThrow();
        node14.setString("Node tree inequality:\nTree1:\nNUMBER 0.0 43\n\n\nTree2:\nSTRING  43\n\n\nSubtree1: NUMBER 0.0 43\n\n\nSubtree2: STRING  43\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node14);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean2 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean3 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder5 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean6 = jSDocInfoBuilder5.isInterfaceRecorded();
        boolean boolean8 = jSDocInfoBuilder5.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj14 = node12.getProp(43);
        boolean boolean15 = node12.isCall();
        boolean boolean16 = node12.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression18 = new com.google.javascript.rhino.JSTypeExpression(node12, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder19 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray21 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray22 = (java.util.ArrayList<java.lang.String>[]) arrayListArray21;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder23 = strListBuilder19.add((java.util.ArrayList<java.lang.String>[]) arrayListArray21);
        boolean boolean24 = jSTypeExpression18.equals((java.lang.Object) arrayListArray21);
        boolean boolean25 = jSDocInfoBuilder5.recordDefineType(jSTypeExpression18);
        boolean boolean26 = jSTypeExpression18.isVarArgs();
        java.lang.Object obj27 = null;
        boolean boolean28 = jSTypeExpression18.equals(obj27);
        boolean boolean29 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression18);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean34 = node33.isVar();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node39 = node33.copyInformationFromForTree(node38);
        com.google.javascript.rhino.Node node40 = node33.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression42 = new com.google.javascript.rhino.JSTypeExpression(node40, "STRING  43");
        boolean boolean43 = jSDocInfoBuilder1.recordExtendedInterface(jSTypeExpression42);
        boolean boolean45 = jSDocInfoBuilder1.recordDescription("Node tree inequality:\nTree1:\nNUMBER 40.0\n\n\nTree2:\nNUMBER 0.0 43\n\n\nSubtree1: NUMBER 40.0\n\n\nSubtree2: NUMBER 0.0 43\n");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression18 and jSTypeExpression42", jSTypeExpression18.equals(jSTypeExpression42) ? jSTypeExpression18.hashCode() == jSTypeExpression42.hashCode() : true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj5 = node3.getProp(43);
        int int6 = node3.getType();
        boolean boolean7 = node3.isGetterDef();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj13 = node11.getProp(43);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int18 = node17.getSourceOffset();
        com.google.javascript.rhino.Node node19 = node11.useSourceInfoIfMissingFromForTree(node17);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean24 = node23.isVar();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node29 = node23.copyInformationFromForTree(node28);
        com.google.javascript.rhino.Node node30 = node11.copyInformationFromForTree(node29);
        boolean boolean31 = node30.isLocalResultCall();
        com.google.javascript.rhino.Node node32 = node3.useSourceInfoIfMissingFrom(node30);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj38 = node36.getProp(43);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int43 = node42.getSourceOffset();
        com.google.javascript.rhino.Node node44 = node36.useSourceInfoIfMissingFromForTree(node42);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray50 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet51 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet51, strArray50);
        node48.setDirectives((java.util.Set<java.lang.String>) strSet51);
        com.google.javascript.rhino.Node node54 = node42.useSourceInfoIfMissingFromForTree(node48);
        boolean boolean55 = node48.isThrow();
        boolean boolean56 = node48.isNot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node57 = node3.getChildBefore(node48);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean2 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean3 = jSDocInfoBuilder1.isConstructorRecorded();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder5 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean6 = jSDocInfoBuilder5.isInterfaceRecorded();
        boolean boolean8 = jSDocInfoBuilder5.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj14 = node12.getProp(43);
        boolean boolean15 = node12.isCall();
        boolean boolean16 = node12.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression18 = new com.google.javascript.rhino.JSTypeExpression(node12, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder19 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray21 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray22 = (java.util.ArrayList<java.lang.String>[]) arrayListArray21;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder23 = strListBuilder19.add((java.util.ArrayList<java.lang.String>[]) arrayListArray21);
        boolean boolean24 = jSTypeExpression18.equals((java.lang.Object) arrayListArray21);
        boolean boolean25 = jSDocInfoBuilder5.recordDefineType(jSTypeExpression18);
        com.google.javascript.rhino.Node node26 = jSTypeExpression18.getRoot();
        boolean boolean28 = jSDocInfoBuilder1.recordThrowDescription(jSTypeExpression18, "Node tree inequality:\nTree1:\nSTRING  43\n\n\nTree2:\nTYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n\n\nSubtree1: STRING  43\n\n\nSubtree2: TYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder30 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean31 = jSDocInfoBuilder30.isInterfaceRecorded();
        boolean boolean33 = jSDocInfoBuilder30.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj39 = node37.getProp(43);
        boolean boolean40 = node37.isCall();
        boolean boolean41 = node37.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression43 = new com.google.javascript.rhino.JSTypeExpression(node37, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder44 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray46 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray47 = (java.util.ArrayList<java.lang.String>[]) arrayListArray46;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder48 = strListBuilder44.add((java.util.ArrayList<java.lang.String>[]) arrayListArray46);
        boolean boolean49 = jSTypeExpression43.equals((java.lang.Object) arrayListArray46);
        boolean boolean50 = jSDocInfoBuilder30.recordDefineType(jSTypeExpression43);
        boolean boolean51 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression43);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder53 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean54 = jSDocInfoBuilder53.recordNoTypeCheck();
        boolean boolean55 = jSDocInfoBuilder53.isInterfaceRecorded();
        jSDocInfoBuilder53.markAnnotation("[, hi!, , , hi!, , hi!, ]", (int) (short) 0, 2);
        boolean boolean60 = jSDocInfoBuilder53.recordIdGenerator();
        boolean boolean61 = jSDocInfoBuilder53.recordInterface();
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean66 = node65.isVar();
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node71 = node65.copyInformationFromForTree(node70);
        com.google.javascript.rhino.Node node72 = node65.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression74 = new com.google.javascript.rhino.JSTypeExpression(node72, "STRING  43");
        boolean boolean75 = jSTypeExpression74.isVarArgs();
        boolean boolean76 = jSDocInfoBuilder53.recordDefineType(jSTypeExpression74);
        boolean boolean77 = jSDocInfoBuilder1.recordBaseType(jSTypeExpression74);
        boolean boolean78 = jSDocInfoBuilder1.recordConstructor();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression18 and jSTypeExpression74", jSTypeExpression18.equals(jSTypeExpression74) ? jSTypeExpression18.hashCode() == jSTypeExpression74.hashCode() : true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj6 = node4.getProp(43);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int11 = node10.getSourceOffset();
        com.google.javascript.rhino.Node node12 = node4.useSourceInfoIfMissingFromForTree(node10);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        node16.setDirectives((java.util.Set<java.lang.String>) strSet19);
        com.google.javascript.rhino.Node node22 = node10.useSourceInfoIfMissingFromForTree(node16);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj28 = node26.getProp(43);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int33 = node32.getSourceOffset();
        com.google.javascript.rhino.Node node34 = node26.useSourceInfoIfMissingFromForTree(node32);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray40 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet41 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet41, strArray40);
        node38.setDirectives((java.util.Set<java.lang.String>) strSet41);
        com.google.javascript.rhino.Node node44 = node32.useSourceInfoIfMissingFromForTree(node38);
        boolean boolean45 = node44.isContinue();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj51 = node49.getProp(43);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int56 = node55.getSourceOffset();
        com.google.javascript.rhino.Node node57 = node49.useSourceInfoIfMissingFromForTree(node55);
        boolean boolean58 = node57.isAssignAdd();
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean63 = node62.isVar();
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node((int) ' ', node16, node44, node57, node62, 1, 100);
        int int67 = node57.getSideEffectFlags();
        boolean boolean68 = node57.isDelProp();
        node57.setCharno(0);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression72 = new com.google.javascript.rhino.JSTypeExpression(node57, "TYPEOF 1\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n");
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj78 = node76.getProp(43);
        boolean boolean79 = node76.isCall();
        boolean boolean80 = node76.isEmpty();
        boolean boolean81 = node76.isCatch();
        com.google.javascript.rhino.Node node82 = node57.clonePropsFrom(node76);
        com.google.javascript.rhino.Node node86 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj88 = node86.getProp(43);
        boolean boolean89 = node86.isCall();
        boolean boolean90 = node86.isQuotedString();
        boolean boolean91 = node86.isObjectLit();
        boolean boolean92 = node86.isOr();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node76.removeChild(node86);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj5 = node3.getProp(43);
        boolean boolean6 = node3.isCall();
        int int7 = node3.getSourcePosition();
        java.lang.String str11 = node3.toString(false, true, false);
        boolean boolean12 = node3.isNot();
        boolean boolean13 = node3.isDelProp();
        boolean boolean14 = node3.isTrue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node16 = node3.getChildAtIndex(32);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj5 = node3.getProp(43);
        int int6 = node3.getType();
        boolean boolean7 = node3.isGetterDef();
        node3.setSourceEncodedPositionForTree(54);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean14 = node13.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        node18.setDirectives((java.util.Set<java.lang.String>) strSet21);
        java.lang.Object obj25 = node18.getProp((int) (byte) 1);
        com.google.javascript.rhino.Node node26 = node13.copyInformationFrom(node18);
        boolean boolean27 = node3.isEquivalentToTyped(node13);
        com.google.javascript.rhino.InputId inputId28 = node13.getInputId();
        boolean boolean29 = node13.isNoSideEffectsCall();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition30 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean31 = typePosition30.hasBrackets();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean36 = node35.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray42 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet43 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet43, strArray42);
        node40.setDirectives((java.util.Set<java.lang.String>) strSet43);
        java.lang.Object obj47 = node40.getProp((int) (byte) 1);
        com.google.javascript.rhino.Node node48 = node35.copyInformationFrom(node40);
        typePosition30.setItem(node48);
        int int50 = node48.getSideEffectFlags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node51 = node13.getChildBefore(node48);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj5 = node3.getProp(43);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int10 = node9.getSourceOffset();
        com.google.javascript.rhino.Node node11 = node3.useSourceInfoIfMissingFromForTree(node9);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        node15.setDirectives((java.util.Set<java.lang.String>) strSet18);
        com.google.javascript.rhino.Node node21 = node9.useSourceInfoIfMissingFromForTree(node15);
        boolean boolean22 = node15.isThrow();
        boolean boolean23 = node15.isNot();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean28 = node27.isVar();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node33 = node27.copyInformationFromForTree(node32);
        java.lang.String str34 = node15.checkTreeEquals(node33);
        node33.setString("hi!");
        boolean boolean37 = node33.isAssignAdd();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node39 = node33.getChildAtIndex(39);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj5 = node3.getProp(43);
        boolean boolean6 = node3.isCall();
        boolean boolean7 = node3.isEmpty();
        boolean boolean8 = node3.isInstanceOf();
        boolean boolean9 = node3.isDefaultCase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node11 = node3.getChildAtIndex(30);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) (byte) 10, 50, 30);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj9 = node7.getProp(43);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int14 = node13.getSourceOffset();
        com.google.javascript.rhino.Node node15 = node7.useSourceInfoIfMissingFromForTree(node13);
        node7.setIsSyntheticBlock(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node18 = node3.getChildBefore(node7);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node3.addChildrenToFront(node7);
        node7.setQuotedString();
        java.lang.String str10 = node7.getSourceFileName();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node14.addChildrenToFront(node18);
        com.google.javascript.rhino.Node node21 = node14.getChildAtIndex(0);
        com.google.javascript.rhino.Node node22 = node14.removeChildren();
        boolean boolean23 = node22.isInstanceOf();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node24 = node7.getChildBefore(node22);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj6 = node4.getProp(43);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int11 = node10.getSourceOffset();
        com.google.javascript.rhino.Node node12 = node4.useSourceInfoIfMissingFromForTree(node10);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        node16.setDirectives((java.util.Set<java.lang.String>) strSet19);
        com.google.javascript.rhino.Node node22 = node10.useSourceInfoIfMissingFromForTree(node16);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj28 = node26.getProp(43);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int33 = node32.getSourceOffset();
        com.google.javascript.rhino.Node node34 = node26.useSourceInfoIfMissingFromForTree(node32);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray40 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet41 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet41, strArray40);
        node38.setDirectives((java.util.Set<java.lang.String>) strSet41);
        com.google.javascript.rhino.Node node44 = node32.useSourceInfoIfMissingFromForTree(node38);
        boolean boolean45 = node44.isContinue();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj51 = node49.getProp(43);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int56 = node55.getSourceOffset();
        com.google.javascript.rhino.Node node57 = node49.useSourceInfoIfMissingFromForTree(node55);
        boolean boolean58 = node57.isAssignAdd();
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean63 = node62.isVar();
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node((int) ' ', node16, node44, node57, node62, 1, 100);
        int int67 = node57.getSideEffectFlags();
        int int68 = node57.getSideEffectFlags();
        boolean boolean69 = node57.isStringKey();
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node73.addChildrenToFront(node77);
        node77.setQuotedString();
        com.google.javascript.rhino.Node node80 = node77.removeFirstChild();
        boolean boolean81 = node77.isFalse();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node57.removeChild(node77);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node3.addChildrenToFront(node7);
        com.google.javascript.rhino.Node node10 = node3.getChildAtIndex(0);
        java.lang.String str11 = node10.toString();
        node10.setSourceEncodedPositionForTree((int) (byte) -1);
        boolean boolean14 = node10.isGetterDef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node16 = node10.getChildAtIndex(43);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj5 = node3.getProp(43);
        boolean boolean6 = node3.isCall();
        int int7 = node3.getSourcePosition();
        int int8 = node3.getSourcePosition();
        boolean boolean9 = node3.isStringKey();
        boolean boolean10 = node3.isExprResult();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node12 = node3.getChildAtIndex(4095);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj5 = node3.getProp(43);
        boolean boolean6 = node3.isCall();
        int int7 = node3.getSourcePosition();
        java.lang.String str11 = node3.toString(false, true, false);
        boolean boolean12 = node3.isVarArgs();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node16.addChildrenToFront(node20);
        node20.setQuotedString();
        boolean boolean23 = node20.isHook();
        boolean boolean24 = node3.isEquivalentTo(node20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node26 = node3.getChildAtIndex(2);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean2 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean3 = jSDocInfoBuilder1.isConstructorRecorded();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder5 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean6 = jSDocInfoBuilder5.isInterfaceRecorded();
        boolean boolean8 = jSDocInfoBuilder5.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj14 = node12.getProp(43);
        boolean boolean15 = node12.isCall();
        boolean boolean16 = node12.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression18 = new com.google.javascript.rhino.JSTypeExpression(node12, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder19 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray21 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray22 = (java.util.ArrayList<java.lang.String>[]) arrayListArray21;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder23 = strListBuilder19.add((java.util.ArrayList<java.lang.String>[]) arrayListArray21);
        boolean boolean24 = jSTypeExpression18.equals((java.lang.Object) arrayListArray21);
        boolean boolean25 = jSDocInfoBuilder5.recordDefineType(jSTypeExpression18);
        com.google.javascript.rhino.Node node26 = jSTypeExpression18.getRoot();
        boolean boolean28 = jSDocInfoBuilder1.recordThrowDescription(jSTypeExpression18, "Node tree inequality:\nTree1:\nSTRING  43\n\n\nTree2:\nTYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n\n\nSubtree1: STRING  43\n\n\nSubtree2: TYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder30 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean31 = jSDocInfoBuilder30.isInterfaceRecorded();
        boolean boolean33 = jSDocInfoBuilder30.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj39 = node37.getProp(43);
        boolean boolean40 = node37.isCall();
        boolean boolean41 = node37.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression43 = new com.google.javascript.rhino.JSTypeExpression(node37, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder44 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray46 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray47 = (java.util.ArrayList<java.lang.String>[]) arrayListArray46;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder48 = strListBuilder44.add((java.util.ArrayList<java.lang.String>[]) arrayListArray46);
        boolean boolean49 = jSTypeExpression43.equals((java.lang.Object) arrayListArray46);
        boolean boolean50 = jSDocInfoBuilder30.recordDefineType(jSTypeExpression43);
        boolean boolean51 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression43);
        boolean boolean52 = jSDocInfoBuilder1.recordNoShadow();
        boolean boolean54 = jSDocInfoBuilder1.recordDeprecationReason("TYPEOF");
        boolean boolean56 = jSDocInfoBuilder1.recordDescription("JSDocInfo");
        boolean boolean57 = jSDocInfoBuilder1.recordInterface();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder59 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean60 = jSDocInfoBuilder59.recordNoTypeCheck();
        boolean boolean61 = jSDocInfoBuilder59.isInterfaceRecorded();
        jSDocInfoBuilder59.markAnnotation("[, hi!, , , hi!, , hi!, ]", (int) (short) 0, 2);
        boolean boolean66 = jSDocInfoBuilder59.recordIdGenerator();
        boolean boolean67 = jSDocInfoBuilder59.recordInterface();
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean72 = node71.isVar();
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node77 = node71.copyInformationFromForTree(node76);
        com.google.javascript.rhino.Node node78 = node71.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression80 = new com.google.javascript.rhino.JSTypeExpression(node78, "STRING  43");
        boolean boolean81 = jSTypeExpression80.isVarArgs();
        boolean boolean82 = jSDocInfoBuilder59.recordDefineType(jSTypeExpression80);
        boolean boolean83 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression80);
        com.google.javascript.rhino.Node node87 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int88 = node87.getSourceOffset();
        boolean boolean89 = node87.isFor();
        com.google.javascript.rhino.JSDocInfo jSDocInfo90 = jSDocInfoBuilder1.build(node87);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression18 and jSTypeExpression80", jSTypeExpression18.equals(jSTypeExpression80) ? jSTypeExpression18.hashCode() == jSTypeExpression80.hashCode() : true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int5 = node4.getSourceOffset();
        com.google.javascript.rhino.jstype.JSType jSType6 = node4.getJSType();
        boolean boolean7 = node4.isWith();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node12.addChildrenToFront(node16);
        boolean boolean18 = node12.isGetterDef();
        boolean boolean19 = node12.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj25 = node23.getProp(43);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int30 = node29.getSourceOffset();
        com.google.javascript.rhino.Node node31 = node23.useSourceInfoIfMissingFromForTree(node29);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        node35.setDirectives((java.util.Set<java.lang.String>) strSet38);
        com.google.javascript.rhino.Node node41 = node29.useSourceInfoIfMissingFromForTree(node35);
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(32, node12, node29);
        boolean boolean43 = node42.isExprResult();
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node((int) (byte) 0, node4, node42);
        node4.removeProp(10);
        node4.setVarArgs(true);
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj54 = node52.getProp(43);
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int59 = node58.getSourceOffset();
        com.google.javascript.rhino.Node node60 = node52.useSourceInfoIfMissingFromForTree(node58);
        boolean boolean61 = node60.isSyntheticBlock();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile62 = node60.getStaticSourceFile();
        boolean boolean63 = node60.isDo();
        com.google.javascript.rhino.Node node64 = node4.useSourceInfoFrom(node60);
        node64.setVarArgs(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node68 = node64.getChildAtIndex(44);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int1 = namePosition0.getEndLine();
        int int2 = namePosition0.getStartLine();
        com.google.javascript.rhino.Node node3 = namePosition0.getItem();
        int int4 = namePosition0.getStartLine();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj11 = node9.getProp(43);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int16 = node15.getSourceOffset();
        com.google.javascript.rhino.Node node17 = node9.useSourceInfoIfMissingFromForTree(node15);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        node21.setDirectives((java.util.Set<java.lang.String>) strSet24);
        com.google.javascript.rhino.Node node27 = node15.useSourceInfoIfMissingFromForTree(node21);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj33 = node31.getProp(43);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int38 = node37.getSourceOffset();
        com.google.javascript.rhino.Node node39 = node31.useSourceInfoIfMissingFromForTree(node37);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray45 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        node43.setDirectives((java.util.Set<java.lang.String>) strSet46);
        com.google.javascript.rhino.Node node49 = node37.useSourceInfoIfMissingFromForTree(node43);
        boolean boolean50 = node49.isContinue();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj56 = node54.getProp(43);
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int61 = node60.getSourceOffset();
        com.google.javascript.rhino.Node node62 = node54.useSourceInfoIfMissingFromForTree(node60);
        boolean boolean63 = node62.isAssignAdd();
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean68 = node67.isVar();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node((int) ' ', node21, node49, node62, node67, 1, 100);
        node67.setWasEmptyNode(true);
        boolean boolean74 = node67.isQuotedString();
        boolean boolean76 = node67.getBooleanProp((int) (byte) 0);
        boolean boolean77 = node67.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node78 = node67.getLastSibling();
        namePosition0.setItem(node78);
        boolean boolean80 = node78.isNE();
        com.google.javascript.rhino.Node node84 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node88 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node84.addChildrenToFront(node88);
        node88.setQuotedString();
        boolean boolean91 = node88.isHook();
        com.google.javascript.rhino.Node node92 = node88.getFirstChild();
        boolean boolean93 = node88.isNumber();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node94 = node78.getChildBefore(node88);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = com.google.common.collect.ImmutableList.of("", "hi!", "", "", "hi!", "", "hi!", "");
        int int10 = strList8.indexOf((java.lang.Object) 'a');
        com.google.common.collect.ImmutableList<java.lang.String> strList19 = com.google.common.collect.ImmutableList.of("", "hi!", "", "", "hi!", "", "hi!", "");
        int int21 = strList19.indexOf((java.lang.Object) 'a');
        com.google.common.collect.ImmutableList<java.lang.String> strList30 = com.google.common.collect.ImmutableList.of("", "hi!", "", "", "hi!", "", "hi!", "");
        com.google.common.collect.ImmutableList<java.lang.String> strList39 = com.google.common.collect.ImmutableList.of("", "hi!", "", "", "hi!", "", "hi!", "");
        com.google.common.collect.ImmutableList<java.lang.Iterable<java.lang.String>> strIterableList40 = com.google.common.collect.ImmutableList.of((java.lang.Iterable<java.lang.String>) strList8, (java.lang.Iterable<java.lang.String>) strList19, (java.lang.Iterable<java.lang.String>) strList30, (java.lang.Iterable<java.lang.String>) strList39);
        com.google.common.collect.ImmutableList<java.lang.String> strList49 = com.google.common.collect.ImmutableList.of("", "hi!", "", "", "hi!", "", "hi!", "");
        int int51 = strList49.indexOf((java.lang.Object) 'a');
        java.util.Spliterator<java.lang.String> strSpliterator52 = strList49.spliterator();
        boolean boolean53 = strList19.equals((java.lang.Object) strList49);
        com.google.common.collect.ImmutableList<java.lang.String> strList62 = com.google.common.collect.ImmutableList.of("", "hi!", "", "", "hi!", "", "hi!", "");
        boolean boolean63 = strList19.containsAll((java.util.Collection<java.lang.String>) strList62);
        java.util.Iterator<java.lang.String> strItor64 = strList19.iterator();
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int69 = node68.getSourceOffset();
        double double70 = node68.getDouble();
        boolean boolean71 = node68.isInc();
        int int72 = strList19.indexOf((java.lang.Object) node68);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable73 = node68.siblings();
        int int74 = node68.getSourcePosition();
        boolean boolean75 = node68.isInc();
        com.google.javascript.rhino.Node node79 = com.google.javascript.rhino.Node.newNumber((-1.0d), 16, 1);
        node79.setType(44);
        com.google.javascript.rhino.Node node82 = node68.useSourceInfoIfMissingFrom(node79);
        com.google.javascript.rhino.Node node85 = com.google.javascript.rhino.Node.newString((int) ' ', "");
        boolean boolean86 = node85.isNew();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node68.removeChild(node85);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node3.addChildrenToFront(node7);
        com.google.javascript.rhino.Node node10 = node3.getChildAtIndex(0);
        java.lang.String str11 = node10.toString();
        node10.setSourceEncodedPositionForTree((int) (byte) -1);
        boolean boolean14 = node10.isGetterDef();
        boolean boolean15 = node10.isAssignAdd();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean20 = node19.isVar();
        node19.putBooleanProp(30, false);
        boolean boolean24 = node19.isSwitch();
        boolean boolean25 = node19.isIn();
        boolean boolean26 = node19.isIn();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node30.addChildrenToFront(node34);
        node34.setQuotedString();
        boolean boolean37 = node34.isHook();
        int int38 = node34.getType();
        com.google.javascript.rhino.Node node39 = node19.useSourceInfoIfMissingFromForTree(node34);
        boolean boolean40 = node19.isGetProp();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj46 = node44.getProp(43);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int51 = node50.getSourceOffset();
        com.google.javascript.rhino.Node node52 = node44.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean53 = node52.isAssignAdd();
        boolean boolean54 = node52.isEmpty();
        boolean boolean55 = node52.isUnscopedQualifiedName();
        java.lang.Object obj57 = node52.getProp((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node10.replaceChild(node19, node52);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj5 = node3.getProp(43);
        boolean boolean6 = node3.isCall();
        int int7 = node3.getSourcePosition();
        java.lang.String str11 = node3.toString(false, true, false);
        boolean boolean12 = node3.isDo();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (short) 0, "[, hi!, , , hi!, , hi!, ]");
        boolean boolean16 = node3.isEquivalentTo(node15);
        boolean boolean17 = node3.isIn();
        boolean boolean18 = node3.hasOneChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node20 = node3.getChildAtIndex((int) (byte) 10);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj5 = node3.getProp(43);
        int int6 = node3.getType();
        boolean boolean7 = node3.isGetterDef();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 12);
        com.google.javascript.rhino.Node node10 = node9.removeChildren();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable11 = node9.getAncestors();
        com.google.javascript.rhino.Node node12 = node3.srcref(node9);
        node3.setString("NUMBER 0.0");
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int19 = node18.getSourceOffset();
        double double20 = node18.getDouble();
        boolean boolean21 = node18.isFor();
        java.util.Set<java.lang.String> strSet22 = node18.getDirectives();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node18);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean4 = node3.isAdd();
        boolean boolean5 = node3.isFalse();
        com.google.common.collect.ImmutableList<java.lang.String> strList14 = com.google.common.collect.ImmutableList.of("", "hi!", "", "", "hi!", "", "hi!", "");
        int int16 = strList14.indexOf((java.lang.Object) 'a');
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = com.google.common.collect.ImmutableList.of("", "hi!", "", "", "hi!", "", "hi!", "");
        int int27 = strList25.indexOf((java.lang.Object) 'a');
        com.google.common.collect.ImmutableList<java.lang.String> strList36 = com.google.common.collect.ImmutableList.of("", "hi!", "", "", "hi!", "", "hi!", "");
        com.google.common.collect.ImmutableList<java.lang.String> strList45 = com.google.common.collect.ImmutableList.of("", "hi!", "", "", "hi!", "", "hi!", "");
        com.google.common.collect.ImmutableList<java.lang.Iterable<java.lang.String>> strIterableList46 = com.google.common.collect.ImmutableList.of((java.lang.Iterable<java.lang.String>) strList14, (java.lang.Iterable<java.lang.String>) strList25, (java.lang.Iterable<java.lang.String>) strList36, (java.lang.Iterable<java.lang.String>) strList45);
        com.google.common.collect.ImmutableList<java.lang.String> strList55 = com.google.common.collect.ImmutableList.of("", "hi!", "", "", "hi!", "", "hi!", "");
        int int57 = strList55.indexOf((java.lang.Object) 'a');
        java.util.Spliterator<java.lang.String> strSpliterator58 = strList55.spliterator();
        boolean boolean59 = strList25.equals((java.lang.Object) strList55);
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean64 = node63.isVar();
        boolean boolean65 = strList55.contains((java.lang.Object) node63);
        boolean boolean66 = node63.hasChildren();
        node63.setQuotedString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node68 = node3.getChildBefore(node63);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 44, 39);
        com.google.javascript.rhino.Node node4 = node3.getFirstChild();
        boolean boolean5 = node3.isName();
        boolean boolean6 = node3.isName();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj12 = node10.getProp(43);
        int int13 = node10.getType();
        boolean boolean14 = node10.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("TYPEOF");
        node16.setType(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.replaceChild(node10, node16);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) ' ', "");
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean8 = node7.isVar();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj14 = node12.getProp(43);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int19 = node18.getSourceOffset();
        com.google.javascript.rhino.Node node20 = node12.useSourceInfoIfMissingFromForTree(node18);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        node24.setDirectives((java.util.Set<java.lang.String>) strSet27);
        com.google.javascript.rhino.Node node30 = node18.useSourceInfoIfMissingFromForTree(node24);
        boolean boolean31 = node24.isThrow();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(35, node7, node24);
        node32.setLength(31);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean39 = node38.isNull();
        boolean boolean40 = node38.isFromExterns();
        boolean boolean41 = node38.isFunction();
        com.google.javascript.rhino.Node node42 = node38.cloneTree();
        boolean boolean43 = node42.isFor();
        com.google.javascript.rhino.Node node44 = node32.srcrefTree(node42);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray50 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet51 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet51, strArray50);
        node48.setDirectives((java.util.Set<java.lang.String>) strSet51);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable54 = node48.children();
        boolean boolean55 = node32.hasChild(node48);
        boolean boolean56 = node48.isString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node57 = node2.getChildBefore(node48);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition1 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition2 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition3 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition4 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition5 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean6 = typePosition5.hasBrackets();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.TypePosition> typePositionList7 = com.google.common.collect.ImmutableList.of(typePosition0, typePosition1, typePosition2, typePosition3, typePosition4, typePosition5);
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition8 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean9 = typePosition8.hasBrackets();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean14 = node13.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        node18.setDirectives((java.util.Set<java.lang.String>) strSet21);
        java.lang.Object obj25 = node18.getProp((int) (byte) 1);
        com.google.javascript.rhino.Node node26 = node13.copyInformationFrom(node18);
        typePosition8.setItem(node26);
        int int28 = typePosition8.getStartLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition29 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition30 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition31 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition32 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition33 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition34 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean35 = typePosition34.hasBrackets();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.TypePosition> typePositionList36 = com.google.common.collect.ImmutableList.of(typePosition29, typePosition30, typePosition31, typePosition32, typePosition33, typePosition34);
        int int37 = typePosition31.getEndLine();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        boolean boolean42 = node41.isNull();
        boolean boolean43 = node41.isSyntheticBlock();
        boolean boolean44 = node41.hasMoreThanOneChild();
        typePosition31.setItem(node41);
        boolean boolean46 = typePosition31.hasBrackets();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>> nodeSourcePositionList47 = com.google.common.collect.ImmutableList.of((com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>) typePosition4, (com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>) typePosition8, (com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>) typePosition31);
        int int48 = typePosition31.getStartLine();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int53 = node52.getSourceOffset();
        node52.addSuppression("[, hi!, , , hi!, , hi!, ]");
        typePosition31.setItem(node52);
        com.google.javascript.rhino.JSDocInfo jSDocInfo57 = node52.getJSDocInfo();
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj63 = node61.getProp(43);
        boolean boolean64 = node61.isCall();
        int int65 = node61.getSourcePosition();
        java.lang.String str69 = node61.toString(false, true, false);
        boolean boolean70 = node61.isVarArgs();
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node74.addChildrenToFront(node78);
        node78.setQuotedString();
        boolean boolean81 = node78.isHook();
        boolean boolean82 = node61.isEquivalentTo(node78);
        boolean boolean83 = node78.isBlock();
        com.google.javascript.rhino.Node node88 = com.google.javascript.rhino.Node.newString((int) (short) 10, "Node tree inequality:\nTree1:\nSTRING  43\n\n\nTree2:\nTYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n\n\nSubtree1: STRING  43\n\n\nSubtree2: TYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n", 51, 46);
        boolean boolean89 = node88.isStringKey();
        node88.setQuotedString();
        com.google.javascript.rhino.Node node91 = node78.srcref(node88);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node92 = node52.getChildBefore(node78);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj6 = node4.getProp(43);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int11 = node10.getSourceOffset();
        com.google.javascript.rhino.Node node12 = node4.useSourceInfoIfMissingFromForTree(node10);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        node16.setDirectives((java.util.Set<java.lang.String>) strSet19);
        com.google.javascript.rhino.Node node22 = node10.useSourceInfoIfMissingFromForTree(node16);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj28 = node26.getProp(43);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int33 = node32.getSourceOffset();
        com.google.javascript.rhino.Node node34 = node26.useSourceInfoIfMissingFromForTree(node32);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray40 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet41 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet41, strArray40);
        node38.setDirectives((java.util.Set<java.lang.String>) strSet41);
        com.google.javascript.rhino.Node node44 = node32.useSourceInfoIfMissingFromForTree(node38);
        boolean boolean45 = node44.isContinue();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj51 = node49.getProp(43);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int56 = node55.getSourceOffset();
        com.google.javascript.rhino.Node node57 = node49.useSourceInfoIfMissingFromForTree(node55);
        boolean boolean58 = node57.isAssignAdd();
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean63 = node62.isVar();
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node((int) ' ', node16, node44, node57, node62, 1, 100);
        boolean boolean67 = node16.isThrow();
        int int68 = node16.getLineno();
        node16.setSourceFileForTesting("");
        node16.setOptionalArg(false);
        boolean boolean73 = node16.isSyntheticBlock();
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.Node.newNumber((double) (short) 10, 52, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node16.removeChild(node77);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int4 = node3.getSourceOffset();
        boolean boolean5 = node3.isFor();
        boolean boolean6 = node3.isSwitch();
        int int7 = node3.getSourcePosition();
        com.google.javascript.rhino.Node node8 = node3.removeFirstChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node10 = node3.getChildAtIndex((int) (byte) 100);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean5 = node4.isVar();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj11 = node9.getProp(43);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int16 = node15.getSourceOffset();
        com.google.javascript.rhino.Node node17 = node9.useSourceInfoIfMissingFromForTree(node15);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        node21.setDirectives((java.util.Set<java.lang.String>) strSet24);
        com.google.javascript.rhino.Node node27 = node15.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean28 = node21.isThrow();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(35, node4, node21);
        int int30 = node4.getSourcePosition();
        boolean boolean31 = node4.isComma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node33 = node4.getChildAtIndex(47);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        node3.setDirectives((java.util.Set<java.lang.String>) strSet6);
        boolean boolean10 = strSet6.contains((java.lang.Object) 10.0d);
        com.google.common.collect.ImmutableList<java.lang.String> strList19 = com.google.common.collect.ImmutableList.of("", "hi!", "", "", "hi!", "", "hi!", "");
        int int21 = strList19.indexOf((java.lang.Object) 'a');
        com.google.common.collect.ImmutableList<java.lang.String> strList30 = com.google.common.collect.ImmutableList.of("", "hi!", "", "", "hi!", "", "hi!", "");
        int int32 = strList30.indexOf((java.lang.Object) 'a');
        com.google.common.collect.ImmutableList<java.lang.String> strList41 = com.google.common.collect.ImmutableList.of("", "hi!", "", "", "hi!", "", "hi!", "");
        com.google.common.collect.ImmutableList<java.lang.String> strList50 = com.google.common.collect.ImmutableList.of("", "hi!", "", "", "hi!", "", "hi!", "");
        com.google.common.collect.ImmutableList<java.lang.Iterable<java.lang.String>> strIterableList51 = com.google.common.collect.ImmutableList.of((java.lang.Iterable<java.lang.String>) strList19, (java.lang.Iterable<java.lang.String>) strList30, (java.lang.Iterable<java.lang.String>) strList41, (java.lang.Iterable<java.lang.String>) strList50);
        com.google.common.collect.ImmutableList<java.lang.String> strList60 = com.google.common.collect.ImmutableList.of("", "hi!", "", "", "hi!", "", "hi!", "");
        int int62 = strList60.indexOf((java.lang.Object) 'a');
        java.util.Spliterator<java.lang.String> strSpliterator63 = strList60.spliterator();
        boolean boolean64 = strList30.equals((java.lang.Object) strList60);
        boolean boolean65 = strSet6.addAll((java.util.Collection<java.lang.String>) strList60);
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        boolean boolean70 = node69.isIf();
        boolean boolean71 = strSet6.equals((java.lang.Object) node69);
        boolean boolean72 = node69.isNew();
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean77 = node76.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node78 = node76.cloneNode();
        boolean boolean79 = node78.isGetElem();
        node78.addSuppression("");
        com.google.javascript.rhino.Node node85 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int86 = node85.getSourceOffset();
        boolean boolean87 = node85.isBreak();
        int int88 = node85.getSourcePosition();
        com.google.javascript.rhino.Node node89 = node78.useSourceInfoFrom(node85);
        com.google.javascript.rhino.Node node93 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        boolean boolean94 = node93.isNull();
        boolean boolean95 = node93.isLabelName();
        com.google.javascript.rhino.Node node96 = node85.useSourceInfoFrom(node93);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node97 = node69.getChildBefore(node85);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean3 = jSDocInfoBuilder1.recordVersion("");
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile5 = null;
        jSDocInfoBuilder1.markName("hi!", staticSourceFile5, (int) (short) 0, (int) (short) 100);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = null;
        boolean boolean10 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression9);
        boolean boolean11 = jSDocInfoBuilder1.recordConstructor();
        boolean boolean12 = jSDocInfoBuilder1.recordNoTypeCheck();
        boolean boolean13 = jSDocInfoBuilder1.isConstructorRecorded();
        boolean boolean14 = jSDocInfoBuilder1.isDescriptionRecorded();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj21 = node19.getProp(43);
        boolean boolean22 = node19.isCall();
        boolean boolean23 = node19.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression25 = new com.google.javascript.rhino.JSTypeExpression(node19, "STRING ");
        boolean boolean26 = jSDocInfoBuilder1.recordParameter("Node tree inequality:\nTree1:\nSTRING  43\n\n\nTree2:\nNUMBER 0.0 43\n\n\nSubtree1: STRING  43\n\n\nSubtree2: NUMBER 0.0 43\n", jSTypeExpression25);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder28 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean30 = jSDocInfoBuilder28.recordVersion("");
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile32 = null;
        jSDocInfoBuilder28.markName("hi!", staticSourceFile32, (int) (short) 0, (int) (short) 100);
        boolean boolean36 = jSDocInfoBuilder28.recordNoTypeCheck();
        boolean boolean37 = jSDocInfoBuilder28.recordExpose();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node41.addChildrenToFront(node45);
        com.google.javascript.rhino.JSDocInfo jSDocInfo47 = jSDocInfoBuilder28.build(node45);
        boolean boolean48 = jSDocInfoBuilder28.shouldParseDocumentation();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean53 = node52.isVar();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node58 = node52.copyInformationFromForTree(node57);
        com.google.javascript.rhino.Node node59 = node52.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression61 = new com.google.javascript.rhino.JSTypeExpression(node59, "STRING  43");
        boolean boolean62 = jSTypeExpression61.isVarArgs();
        boolean boolean63 = jSDocInfoBuilder28.recordBaseType(jSTypeExpression61);
        boolean boolean64 = jSDocInfoBuilder1.recordDefineType(jSTypeExpression61);
        boolean boolean65 = jSDocInfoBuilder1.recordExport();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression25 and jSTypeExpression61", jSTypeExpression25.equals(jSTypeExpression61) ? jSTypeExpression25.hashCode() == jSTypeExpression61.hashCode() : true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj5 = node3.getProp(43);
        boolean boolean6 = node3.isCall();
        boolean boolean7 = node3.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = new com.google.javascript.rhino.JSTypeExpression(node3, "STRING ");
        boolean boolean10 = node3.isDo();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node14.addChildrenToFront(node18);
        boolean boolean20 = node18.isComma();
        com.google.javascript.rhino.Node node21 = node3.useSourceInfoFromForTree(node18);
        boolean boolean22 = node21.isDelProp();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node21.children();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node21.removeChild(node25);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean2 = jSDocInfoBuilder1.recordNoTypeCheck();
        boolean boolean3 = jSDocInfoBuilder1.isInterfaceRecorded();
        jSDocInfoBuilder1.markAnnotation("[, hi!, , , hi!, , hi!, ]", (int) (short) 0, 2);
        boolean boolean8 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean9 = jSDocInfoBuilder1.recordInterface();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean14 = node13.isVar();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node19 = node13.copyInformationFromForTree(node18);
        com.google.javascript.rhino.Node node20 = node13.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression22 = new com.google.javascript.rhino.JSTypeExpression(node20, "STRING  43");
        boolean boolean23 = jSTypeExpression22.isVarArgs();
        boolean boolean24 = jSDocInfoBuilder1.recordDefineType(jSTypeExpression22);
        jSDocInfoBuilder1.recordOriginalCommentString("NUMBER 0.0 43");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder28 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean30 = jSDocInfoBuilder28.recordVersion("");
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile32 = null;
        jSDocInfoBuilder28.markName("hi!", staticSourceFile32, (int) (short) 0, (int) (short) 100);
        jSDocInfoBuilder28.markText("hi!", 0, 32, (int) (short) 10, (int) '#');
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj47 = node45.getProp(43);
        boolean boolean48 = node45.isCall();
        int int49 = node45.getSourcePosition();
        java.lang.String str53 = node45.toString(false, true, false);
        boolean boolean54 = node45.isDo();
        boolean boolean55 = node45.isWith();
        com.google.javascript.rhino.JSDocInfo jSDocInfo56 = jSDocInfoBuilder28.build(node45);
        boolean boolean57 = jSDocInfoBuilder28.recordConstancy();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder59 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean60 = jSDocInfoBuilder59.isInterfaceRecorded();
        boolean boolean62 = jSDocInfoBuilder59.recordBlockDescription("hi!");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder64 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean65 = jSDocInfoBuilder64.isInterfaceRecorded();
        boolean boolean67 = jSDocInfoBuilder64.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj73 = node71.getProp(43);
        boolean boolean74 = node71.isCall();
        boolean boolean75 = node71.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression77 = new com.google.javascript.rhino.JSTypeExpression(node71, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder78 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray80 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray81 = (java.util.ArrayList<java.lang.String>[]) arrayListArray80;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder82 = strListBuilder78.add((java.util.ArrayList<java.lang.String>[]) arrayListArray80);
        boolean boolean83 = jSTypeExpression77.equals((java.lang.Object) arrayListArray80);
        boolean boolean84 = jSDocInfoBuilder64.recordDefineType(jSTypeExpression77);
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition85 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int86 = namePosition85.getEndLine();
        int int87 = namePosition85.getStartLine();
        com.google.javascript.rhino.Node node88 = namePosition85.getItem();
        boolean boolean89 = jSTypeExpression77.equals((java.lang.Object) node88);
        boolean boolean90 = jSDocInfoBuilder59.recordTypedef(jSTypeExpression77);
        boolean boolean91 = jSDocInfoBuilder28.recordReturnType(jSTypeExpression77);
        boolean boolean92 = jSDocInfoBuilder1.recordReturnType(jSTypeExpression77);
        boolean boolean94 = jSDocInfoBuilder1.hasParameter("Node tree inequality:\nTree1:\nNUMBER 12.0\n\n\nTree2:\nNUMBER 0.0 43\n\n\nSubtree1: NUMBER 12.0\n\n\nSubtree2: NUMBER 0.0 43\n");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression22 and jSTypeExpression77", jSTypeExpression22.equals(jSTypeExpression77) ? jSTypeExpression22.hashCode() == jSTypeExpression77.hashCode() : true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean2 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean3 = jSDocInfoBuilder1.recordConstructor();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder5 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean6 = jSDocInfoBuilder5.isInterfaceRecorded();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder5.recordParameter("", jSTypeExpression8);
        boolean boolean10 = jSDocInfoBuilder5.recordExterns();
        boolean boolean11 = jSDocInfoBuilder5.recordPreserveTry();
        boolean boolean12 = jSDocInfoBuilder5.recordNoCompile();
        boolean boolean14 = jSDocInfoBuilder5.recordLends("");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder16 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean17 = jSDocInfoBuilder16.recordJavaDispatch();
        jSDocInfoBuilder16.markText("hi!", (-1), (int) (byte) -1, 4095, 1);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder25 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean26 = jSDocInfoBuilder25.recordJavaDispatch();
        boolean boolean27 = jSDocInfoBuilder25.recordNoCompile();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj34 = node32.getProp(43);
        boolean boolean35 = node32.isCall();
        boolean boolean36 = node32.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression38 = new com.google.javascript.rhino.JSTypeExpression(node32, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder39 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray41 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray42 = (java.util.ArrayList<java.lang.String>[]) arrayListArray41;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder43 = strListBuilder39.add((java.util.ArrayList<java.lang.String>[]) arrayListArray41);
        boolean boolean44 = jSTypeExpression38.equals((java.lang.Object) arrayListArray41);
        boolean boolean45 = jSDocInfoBuilder25.recordParameter("", jSTypeExpression38);
        boolean boolean46 = jSDocInfoBuilder16.recordThrowType(jSTypeExpression38);
        boolean boolean47 = jSDocInfoBuilder5.recordBaseType(jSTypeExpression38);
        boolean boolean48 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression38);
        boolean boolean49 = jSDocInfoBuilder1.isDescriptionRecorded();
        boolean boolean50 = jSDocInfoBuilder1.recordOverride();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean55 = node54.isVar();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node60 = node54.copyInformationFromForTree(node59);
        com.google.javascript.rhino.Node node61 = node54.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression63 = new com.google.javascript.rhino.JSTypeExpression(node61, "STRING  43");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression64 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression63);
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray70 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet71 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet71, strArray70);
        node68.setDirectives((java.util.Set<java.lang.String>) strSet71);
        java.lang.Object[] objArray74 = strSet71.toArray();
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray80 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet81 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet81, strArray80);
        node78.setDirectives((java.util.Set<java.lang.String>) strSet81);
        java.lang.Object[] objArray84 = strSet81.toArray();
        boolean boolean85 = strSet71.retainAll((java.util.Collection<java.lang.String>) strSet81);
        int int86 = strSet81.size();
        boolean boolean88 = strSet81.add("");
        boolean boolean89 = jSTypeExpression64.equals((java.lang.Object) strSet81);
        boolean boolean90 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression64);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression38 and jSTypeExpression63", jSTypeExpression38.equals(jSTypeExpression63) ? jSTypeExpression38.hashCode() == jSTypeExpression63.hashCode() : true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition1 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition2 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition3 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition4 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition5 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean6 = typePosition5.hasBrackets();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.TypePosition> typePositionList7 = com.google.common.collect.ImmutableList.of(typePosition0, typePosition1, typePosition2, typePosition3, typePosition4, typePosition5);
        int int8 = typePosition1.getEndLine();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "", 54, 15);
        java.lang.String str14 = node13.toStringTree();
        java.lang.String str15 = node13.getSourceFileName();
        typePosition1.setItem(node13);
        com.google.javascript.rhino.Node node17 = node13.getFirstChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node19 = node13.getChildAtIndex(4095);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        node3.setDirectives((java.util.Set<java.lang.String>) strSet6);
        java.lang.Object[] objArray9 = strSet6.toArray();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        node13.setDirectives((java.util.Set<java.lang.String>) strSet16);
        java.lang.Object[] objArray19 = strSet16.toArray();
        boolean boolean20 = strSet6.retainAll((java.util.Collection<java.lang.String>) strSet16);
        strSet16.clear();
        java.lang.Comparable[][] comparableArray23 = new java.lang.Comparable[0][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray24 = (java.lang.Comparable<java.lang.String>[][]) comparableArray23;
        java.lang.Comparable[][] comparableArray26 = new java.lang.Comparable[0][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray27 = (java.lang.Comparable<java.lang.String>[][]) comparableArray26;
        java.lang.Comparable[][] comparableArray29 = new java.lang.Comparable[0][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray30 = (java.lang.Comparable<java.lang.String>[][]) comparableArray29;
        java.lang.Comparable[][][] comparableArray32 = new java.lang.Comparable[3][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray33 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray32;
        strComparableArray33[0] = strComparableArray24;
        strComparableArray33[1] = strComparableArray27;
        strComparableArray33[2] = strComparableArray30;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray40 = strSet16.toArray(strComparableArray33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>[][]> strComparableArrayList41 = com.google.common.collect.ImmutableList.copyOf(strComparableArray33);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj5 = node3.getProp(43);
        int int6 = node3.getType();
        boolean boolean7 = node3.isGetterDef();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 12);
        com.google.javascript.rhino.Node node10 = node9.removeChildren();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable11 = node9.getAncestors();
        com.google.javascript.rhino.Node node12 = node3.srcref(node9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node14 = node9.getChildAtIndex(45);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj5 = node3.getProp(43);
        int int6 = node3.getType();
        boolean boolean7 = node3.isName();
        boolean boolean8 = node3.isDebugger();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.Node> nodeList9 = com.google.common.collect.ImmutableList.of(node3);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder10 = node3.new FileLevelJsDocBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node12 = node3.getChildAtIndex(35);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean2 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean3 = jSDocInfoBuilder1.recordNoCompile();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj10 = node8.getProp(43);
        boolean boolean11 = node8.isCall();
        boolean boolean12 = node8.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression14 = new com.google.javascript.rhino.JSTypeExpression(node8, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder15 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray17 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray18 = (java.util.ArrayList<java.lang.String>[]) arrayListArray17;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder19 = strListBuilder15.add((java.util.ArrayList<java.lang.String>[]) arrayListArray17);
        boolean boolean20 = jSTypeExpression14.equals((java.lang.Object) arrayListArray17);
        boolean boolean21 = jSDocInfoBuilder1.recordParameter("", jSTypeExpression14);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder23 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean24 = jSDocInfoBuilder23.isInterfaceRecorded();
        boolean boolean26 = jSDocInfoBuilder23.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj32 = node30.getProp(43);
        boolean boolean33 = node30.isCall();
        boolean boolean34 = node30.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression36 = new com.google.javascript.rhino.JSTypeExpression(node30, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder37 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray39 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray40 = (java.util.ArrayList<java.lang.String>[]) arrayListArray39;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder41 = strListBuilder37.add((java.util.ArrayList<java.lang.String>[]) arrayListArray39);
        boolean boolean42 = jSTypeExpression36.equals((java.lang.Object) arrayListArray39);
        boolean boolean43 = jSDocInfoBuilder23.recordDefineType(jSTypeExpression36);
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition44 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int45 = namePosition44.getEndLine();
        int int46 = namePosition44.getStartLine();
        com.google.javascript.rhino.Node node47 = namePosition44.getItem();
        boolean boolean48 = jSTypeExpression36.equals((java.lang.Object) node47);
        boolean boolean49 = jSTypeExpression36.isOptionalArg();
        boolean boolean50 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression36);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder52 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean54 = jSDocInfoBuilder52.recordVersion("");
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile56 = null;
        jSDocInfoBuilder52.markName("hi!", staticSourceFile56, (int) (short) 0, (int) (short) 100);
        boolean boolean60 = jSDocInfoBuilder52.recordNoTypeCheck();
        boolean boolean61 = jSDocInfoBuilder52.recordExpose();
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node65.addChildrenToFront(node69);
        com.google.javascript.rhino.JSDocInfo jSDocInfo71 = jSDocInfoBuilder52.build(node69);
        boolean boolean72 = jSDocInfoBuilder52.shouldParseDocumentation();
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean77 = node76.isVar();
        com.google.javascript.rhino.Node node81 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node82 = node76.copyInformationFromForTree(node81);
        com.google.javascript.rhino.Node node83 = node76.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression85 = new com.google.javascript.rhino.JSTypeExpression(node83, "STRING  43");
        boolean boolean86 = jSTypeExpression85.isVarArgs();
        boolean boolean87 = jSDocInfoBuilder52.recordBaseType(jSTypeExpression85);
        boolean boolean88 = jSTypeExpression85.isOptionalArg();
        boolean boolean89 = jSDocInfoBuilder1.recordThrowType(jSTypeExpression85);
        boolean boolean90 = jSDocInfoBuilder1.recordNoCompile();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression14 and jSTypeExpression85", jSTypeExpression14.equals(jSTypeExpression85) ? jSTypeExpression14.hashCode() == jSTypeExpression85.hashCode() : true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj6 = node4.getProp(43);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        boolean boolean11 = node10.isIf();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj17 = node15.getProp(43);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int22 = node21.getSourceOffset();
        com.google.javascript.rhino.Node node23 = node15.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean24 = node23.isAssignAdd();
        boolean boolean25 = node23.isEmpty();
        node23.setSourceEncodedPosition(40);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean32 = node31.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        node36.setDirectives((java.util.Set<java.lang.String>) strSet39);
        java.lang.Object obj43 = node36.getProp((int) (byte) 1);
        com.google.javascript.rhino.Node node44 = node31.copyInformationFrom(node36);
        boolean boolean45 = node31.isOr();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(1, node4, node10, node23, node31, 176180, 1);
        boolean boolean49 = node10.isVar();
        node10.detachChildren();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int55 = node54.getSourceOffset();
        boolean boolean56 = node54.isFor();
        boolean boolean57 = node54.isNE();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node10.removeChild(node54);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition1 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition2 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition3 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition4 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition5 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean6 = typePosition5.hasBrackets();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.TypePosition> typePositionList7 = com.google.common.collect.ImmutableList.of(typePosition0, typePosition1, typePosition2, typePosition3, typePosition4, typePosition5);
        int int8 = typePosition2.getEndLine();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        boolean boolean13 = node12.isNull();
        boolean boolean14 = node12.isSyntheticBlock();
        boolean boolean15 = node12.hasMoreThanOneChild();
        typePosition2.setItem(node12);
        int int17 = typePosition2.getStartLine();
        com.google.javascript.rhino.Node node18 = typePosition2.getItem();
        boolean boolean19 = node18.isLabel();
        boolean boolean20 = node18.isStringKey();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean25 = node24.isVar();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node30 = node24.copyInformationFromForTree(node29);
        boolean boolean31 = node24.isIf();
        java.lang.String str32 = node24.getSourceFileName();
        node24.setString("NUMBER 0.0 43\n    STRING  43\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node18.removeChild(node24);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj5 = node3.getProp(43);
        boolean boolean6 = node3.isCall();
        boolean boolean7 = node3.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = new com.google.javascript.rhino.JSTypeExpression(node3, "STRING ");
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj16 = node14.getProp(43);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int21 = node20.getSourceOffset();
        com.google.javascript.rhino.Node node22 = node14.useSourceInfoIfMissingFromForTree(node20);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        node26.setDirectives((java.util.Set<java.lang.String>) strSet29);
        com.google.javascript.rhino.Node node32 = node20.useSourceInfoIfMissingFromForTree(node26);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj38 = node36.getProp(43);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int43 = node42.getSourceOffset();
        com.google.javascript.rhino.Node node44 = node36.useSourceInfoIfMissingFromForTree(node42);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray50 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet51 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet51, strArray50);
        node48.setDirectives((java.util.Set<java.lang.String>) strSet51);
        com.google.javascript.rhino.Node node54 = node42.useSourceInfoIfMissingFromForTree(node48);
        boolean boolean55 = node54.isContinue();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj61 = node59.getProp(43);
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int66 = node65.getSourceOffset();
        com.google.javascript.rhino.Node node67 = node59.useSourceInfoIfMissingFromForTree(node65);
        boolean boolean68 = node67.isAssignAdd();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean73 = node72.isVar();
        com.google.javascript.rhino.Node node76 = new com.google.javascript.rhino.Node((int) ' ', node26, node54, node67, node72, 1, 100);
        boolean boolean77 = node54.isHook();
        node54.setSourceEncodedPositionForTree(12);
        boolean boolean80 = node54.isQualifiedName();
        boolean boolean81 = node3.isEquivalentTo(node54);
        com.google.javascript.rhino.Node node85 = new com.google.javascript.rhino.Node(12, (-1), (int) (short) 10);
        boolean boolean86 = node85.isNot();
        com.google.javascript.rhino.jstype.JSType jSType87 = node85.getJSType();
        com.google.javascript.rhino.Node node88 = node54.clonePropsFrom(node85);
        com.google.javascript.rhino.Node node90 = node88.getAncestor((int) (short) 0);
        boolean boolean91 = node88.isFor();
        boolean boolean92 = node88.isFor();
        com.google.javascript.rhino.Node node96 = new com.google.javascript.rhino.Node(31, (int) (short) -1, 47);
        boolean boolean97 = node96.isWhile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node98 = node88.getChildBefore(node96);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node3.setIsSyntheticBlock(true);
        boolean boolean6 = node3.wasEmptyNode();
        int int7 = node3.getLength();
        node3.putIntProp((int) (byte) 0, 39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node12 = node3.getChildAtIndex(176180);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj6 = node4.getProp(43);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        boolean boolean11 = node10.isIf();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj17 = node15.getProp(43);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int22 = node21.getSourceOffset();
        com.google.javascript.rhino.Node node23 = node15.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean24 = node23.isAssignAdd();
        boolean boolean25 = node23.isEmpty();
        node23.setSourceEncodedPosition(40);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean32 = node31.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        node36.setDirectives((java.util.Set<java.lang.String>) strSet39);
        java.lang.Object obj43 = node36.getProp((int) (byte) 1);
        com.google.javascript.rhino.Node node44 = node31.copyInformationFrom(node36);
        boolean boolean45 = node31.isOr();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(1, node4, node10, node23, node31, 176180, 1);
        boolean boolean49 = node10.isInstanceOf();
        boolean boolean50 = node10.isGetterDef();
        node10.setSourceFileForTesting("hi!");
        boolean boolean53 = node10.isAnd();
        boolean boolean54 = node10.isNull();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable55 = node10.siblings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node57 = node10.getChildAtIndex(23);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean4 = node3.isVar();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node9 = node3.copyInformationFromForTree(node8);
        com.google.javascript.rhino.Node node10 = node3.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = new com.google.javascript.rhino.JSTypeExpression(node10, "STRING  43");
        int int13 = node10.getSourceOffset();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj19 = node17.getProp(43);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int24 = node23.getSourceOffset();
        com.google.javascript.rhino.Node node25 = node17.useSourceInfoIfMissingFromForTree(node23);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray31 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        node29.setDirectives((java.util.Set<java.lang.String>) strSet32);
        com.google.javascript.rhino.Node node35 = node23.useSourceInfoIfMissingFromForTree(node29);
        boolean boolean36 = node35.isLabel();
        node35.removeProp((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node39 = node10.getChildBefore(node35);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node3.addChildrenToFront(node7);
        com.google.javascript.rhino.Node node10 = node3.getChildAtIndex(0);
        java.lang.String str11 = node10.toString();
        node10.setSourceEncodedPositionForTree((int) (byte) -1);
        boolean boolean14 = node10.isGetterDef();
        boolean boolean15 = node10.isAssignAdd();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean20 = node19.isAdd();
        java.util.Set<java.lang.String> strSet21 = node19.getDirectives();
        boolean boolean22 = node19.isTrue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node10.removeChild(node19);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj6 = node4.getProp(43);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int11 = node10.getSourceOffset();
        com.google.javascript.rhino.Node node12 = node4.useSourceInfoIfMissingFromForTree(node10);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        node16.setDirectives((java.util.Set<java.lang.String>) strSet19);
        com.google.javascript.rhino.Node node22 = node10.useSourceInfoIfMissingFromForTree(node16);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj28 = node26.getProp(43);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int33 = node32.getSourceOffset();
        com.google.javascript.rhino.Node node34 = node26.useSourceInfoIfMissingFromForTree(node32);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray40 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet41 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet41, strArray40);
        node38.setDirectives((java.util.Set<java.lang.String>) strSet41);
        com.google.javascript.rhino.Node node44 = node32.useSourceInfoIfMissingFromForTree(node38);
        boolean boolean45 = node44.isContinue();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj51 = node49.getProp(43);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int56 = node55.getSourceOffset();
        com.google.javascript.rhino.Node node57 = node49.useSourceInfoIfMissingFromForTree(node55);
        boolean boolean58 = node57.isAssignAdd();
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean63 = node62.isVar();
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node((int) ' ', node16, node44, node57, node62, 1, 100);
        int int67 = node57.getSideEffectFlags();
        int int68 = node57.getSideEffectFlags();
        boolean boolean69 = node57.isDec();
        java.util.Set<java.lang.String> strSet70 = node57.getDirectives();
        boolean boolean71 = node57.isNew();
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        int int76 = node75.getSideEffectFlags();
        node75.setType(35);
        boolean boolean79 = node75.isDefaultCase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node57.removeChild(node75);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean2 = jSDocInfoBuilder1.recordNoTypeCheck();
        boolean boolean3 = jSDocInfoBuilder1.isInterfaceRecorded();
        jSDocInfoBuilder1.markAnnotation("[, hi!, , , hi!, , hi!, ]", (int) (short) 0, 2);
        boolean boolean8 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean9 = jSDocInfoBuilder1.recordInterface();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean14 = node13.isVar();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node19 = node13.copyInformationFromForTree(node18);
        com.google.javascript.rhino.Node node20 = node13.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression22 = new com.google.javascript.rhino.JSTypeExpression(node20, "STRING  43");
        boolean boolean23 = jSTypeExpression22.isVarArgs();
        boolean boolean24 = jSDocInfoBuilder1.recordDefineType(jSTypeExpression22);
        jSDocInfoBuilder1.recordOriginalCommentString("NUMBER 0.0 43");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder28 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean30 = jSDocInfoBuilder28.recordVersion("");
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile32 = null;
        jSDocInfoBuilder28.markName("hi!", staticSourceFile32, (int) (short) 0, (int) (short) 100);
        jSDocInfoBuilder28.markText("hi!", 0, 32, (int) (short) 10, (int) '#');
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj47 = node45.getProp(43);
        boolean boolean48 = node45.isCall();
        int int49 = node45.getSourcePosition();
        java.lang.String str53 = node45.toString(false, true, false);
        boolean boolean54 = node45.isDo();
        boolean boolean55 = node45.isWith();
        com.google.javascript.rhino.JSDocInfo jSDocInfo56 = jSDocInfoBuilder28.build(node45);
        boolean boolean57 = jSDocInfoBuilder28.recordConstancy();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder59 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean60 = jSDocInfoBuilder59.isInterfaceRecorded();
        boolean boolean62 = jSDocInfoBuilder59.recordBlockDescription("hi!");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder64 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean65 = jSDocInfoBuilder64.isInterfaceRecorded();
        boolean boolean67 = jSDocInfoBuilder64.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj73 = node71.getProp(43);
        boolean boolean74 = node71.isCall();
        boolean boolean75 = node71.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression77 = new com.google.javascript.rhino.JSTypeExpression(node71, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder78 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray80 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray81 = (java.util.ArrayList<java.lang.String>[]) arrayListArray80;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder82 = strListBuilder78.add((java.util.ArrayList<java.lang.String>[]) arrayListArray80);
        boolean boolean83 = jSTypeExpression77.equals((java.lang.Object) arrayListArray80);
        boolean boolean84 = jSDocInfoBuilder64.recordDefineType(jSTypeExpression77);
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition85 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int86 = namePosition85.getEndLine();
        int int87 = namePosition85.getStartLine();
        com.google.javascript.rhino.Node node88 = namePosition85.getItem();
        boolean boolean89 = jSTypeExpression77.equals((java.lang.Object) node88);
        boolean boolean90 = jSDocInfoBuilder59.recordTypedef(jSTypeExpression77);
        boolean boolean91 = jSDocInfoBuilder28.recordReturnType(jSTypeExpression77);
        boolean boolean92 = jSDocInfoBuilder1.recordReturnType(jSTypeExpression77);
        boolean boolean93 = jSDocInfoBuilder1.recordConsistentIdGenerator();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression22 and jSTypeExpression77", jSTypeExpression22.equals(jSTypeExpression77) ? jSTypeExpression22.hashCode() == jSTypeExpression77.hashCode() : true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj5 = node3.getProp(43);
        boolean boolean6 = node3.isCall();
        boolean boolean7 = node3.isQuotedString();
        boolean boolean8 = node3.isObjectLit();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj14 = node12.getProp(43);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int19 = node18.getSourceOffset();
        com.google.javascript.rhino.Node node20 = node12.useSourceInfoIfMissingFromForTree(node18);
        boolean boolean21 = node20.isAssignAdd();
        boolean boolean22 = node20.isEmpty();
        node20.setSourceEncodedPosition(40);
        com.google.javascript.rhino.Node node25 = node3.copyInformationFromForTree(node20);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj31 = node29.getProp(43);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int36 = node35.getSourceOffset();
        com.google.javascript.rhino.Node node37 = node29.useSourceInfoIfMissingFromForTree(node35);
        boolean boolean38 = node37.isAssignAdd();
        boolean boolean39 = node37.isScript();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node20.removeChild(node37);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj5 = node3.getProp(43);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int10 = node9.getSourceOffset();
        com.google.javascript.rhino.Node node11 = node3.useSourceInfoIfMissingFromForTree(node9);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean16 = node15.isVar();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node21 = node15.copyInformationFromForTree(node20);
        com.google.javascript.rhino.Node node22 = node3.copyInformationFromForTree(node21);
        boolean boolean23 = node21.isOr();
        boolean boolean24 = node21.isHook();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString(29, "", 16, 38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node30 = node21.getChildBefore(node29);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj5 = node3.getProp(43);
        boolean boolean6 = node3.isCall();
        boolean boolean7 = node3.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = new com.google.javascript.rhino.JSTypeExpression(node3, "STRING ");
        boolean boolean10 = node3.isDo();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj16 = node14.getProp(43);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int21 = node20.getSourceOffset();
        com.google.javascript.rhino.Node node22 = node14.useSourceInfoIfMissingFromForTree(node20);
        int int23 = node14.getSourceOffset();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = node14.getJSDocInfo();
        boolean boolean25 = node14.isIn();
        node3.addChildrenToFront(node14);
        node3.putIntProp(48, 15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node31 = node3.getChildAtIndex(12);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 12);
        node1.setSourceEncodedPositionForTree(4);
        boolean boolean4 = node1.isBlock();
        boolean boolean5 = node1.isQualifiedName();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj11 = node9.getProp(43);
        boolean boolean12 = node9.isCall();
        int int13 = node9.getSourcePosition();
        java.lang.String str17 = node9.toString(false, true, false);
        boolean boolean18 = node9.isExprResult();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder19 = node9.getJsDocBuilderForNode();
        boolean boolean20 = node9.isSwitch();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable21 = node9.getAncestors();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition22 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean23 = typePosition22.hasBrackets();
        int int24 = typePosition22.getEndLine();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node28.addChildrenToFront(node32);
        boolean boolean34 = node28.isGetterDef();
        boolean boolean35 = node28.isEmpty();
        typePosition22.setItem(node28);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable37 = node28.children();
        com.google.javascript.rhino.Node node38 = node9.copyInformationFromForTree(node28);
        com.google.javascript.rhino.Node node39 = node1.srcref(node9);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean44 = node43.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node45 = node43.cloneNode();
        boolean boolean46 = node45.isGetElem();
        node45.addSuppression("");
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int53 = node52.getSourceOffset();
        boolean boolean54 = node52.isBreak();
        int int55 = node52.getSourcePosition();
        com.google.javascript.rhino.Node node56 = node45.useSourceInfoFrom(node52);
        com.google.javascript.rhino.JSDocInfo jSDocInfo57 = node52.getJSDocInfo();
        com.google.javascript.rhino.Node node58 = node52.cloneNode();
        boolean boolean59 = node52.isDec();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node52);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean4 = node3.isNull();
        boolean boolean5 = node3.isFromExterns();
        boolean boolean6 = node3.isFunction();
        com.google.javascript.rhino.Node node7 = node3.cloneTree();
        boolean boolean8 = node3.isTypeOf();
        boolean boolean9 = node3.isGetElem();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int14 = node13.getSourceOffset();
        node13.detachChildren();
        boolean boolean16 = node13.isLabelName();
        com.google.javascript.rhino.Node node17 = node13.cloneTree();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node18 = node3.getChildBefore(node13);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int5 = node4.getSourceOffset();
        com.google.javascript.rhino.jstype.JSType jSType6 = node4.getJSType();
        boolean boolean7 = node4.isWith();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node12.addChildrenToFront(node16);
        boolean boolean18 = node12.isGetterDef();
        boolean boolean19 = node12.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj25 = node23.getProp(43);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int30 = node29.getSourceOffset();
        com.google.javascript.rhino.Node node31 = node23.useSourceInfoIfMissingFromForTree(node29);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        node35.setDirectives((java.util.Set<java.lang.String>) strSet38);
        com.google.javascript.rhino.Node node41 = node29.useSourceInfoIfMissingFromForTree(node35);
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(32, node12, node29);
        boolean boolean43 = node42.isExprResult();
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node((int) (byte) 0, node4, node42);
        boolean boolean45 = node44.isObjectLit();
        node44.setLength(4095);
        boolean boolean48 = node44.wasEmptyNode();
        int int49 = node44.getLineno();
        boolean boolean50 = node44.isGetProp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node52 = node44.getChildAtIndex(50);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj5 = node3.getProp(43);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int10 = node9.getSourceOffset();
        com.google.javascript.rhino.Node node11 = node3.useSourceInfoIfMissingFromForTree(node9);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        node15.setDirectives((java.util.Set<java.lang.String>) strSet18);
        com.google.javascript.rhino.Node node21 = node9.useSourceInfoIfMissingFromForTree(node15);
        boolean boolean22 = node21.isContinue();
        boolean boolean23 = node21.isVoid();
        double double24 = node21.getDouble();
        node21.setLength(176180);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray32 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet33 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet33, strArray32);
        node30.setDirectives((java.util.Set<java.lang.String>) strSet33);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj41 = node39.getProp(43);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int46 = node45.getSourceOffset();
        com.google.javascript.rhino.Node node47 = node39.useSourceInfoIfMissingFromForTree(node45);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray53 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet54 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet54, strArray53);
        node51.setDirectives((java.util.Set<java.lang.String>) strSet54);
        com.google.javascript.rhino.Node node57 = node45.useSourceInfoIfMissingFromForTree(node51);
        boolean boolean58 = node57.isContinue();
        boolean boolean59 = node57.isOnlyModifiesThisCall();
        boolean boolean60 = node57.isDefaultCase();
        boolean boolean61 = node30.hasChild(node57);
        int int62 = node30.getSourceOffset();
        boolean boolean63 = node30.isNew();
        boolean boolean64 = node30.isVar();
        boolean boolean65 = node30.isVarArgs();
        boolean boolean66 = node30.isInstanceOf();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node67 = node21.getChildBefore(node30);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj6 = node4.getProp(43);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int11 = node10.getSourceOffset();
        com.google.javascript.rhino.Node node12 = node4.useSourceInfoIfMissingFromForTree(node10);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        node16.setDirectives((java.util.Set<java.lang.String>) strSet19);
        com.google.javascript.rhino.Node node22 = node10.useSourceInfoIfMissingFromForTree(node16);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj28 = node26.getProp(43);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int33 = node32.getSourceOffset();
        com.google.javascript.rhino.Node node34 = node26.useSourceInfoIfMissingFromForTree(node32);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray40 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet41 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet41, strArray40);
        node38.setDirectives((java.util.Set<java.lang.String>) strSet41);
        com.google.javascript.rhino.Node node44 = node32.useSourceInfoIfMissingFromForTree(node38);
        boolean boolean45 = node44.isContinue();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj51 = node49.getProp(43);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int56 = node55.getSourceOffset();
        com.google.javascript.rhino.Node node57 = node49.useSourceInfoIfMissingFromForTree(node55);
        boolean boolean58 = node57.isAssignAdd();
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean63 = node62.isVar();
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node((int) ' ', node16, node44, node57, node62, 1, 100);
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node70.addChildrenToFront(node74);
        com.google.javascript.rhino.Node node77 = node70.getChildAtIndex(0);
        java.lang.String str78 = node77.toString();
        boolean boolean79 = node77.isExprResult();
        boolean boolean80 = node77.isCall();
        com.google.javascript.rhino.Node node81 = node62.srcrefTree(node77);
        com.google.javascript.rhino.Node node82 = node77.cloneNode();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder83 = node77.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node[] nodeArray85 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node88 = new com.google.javascript.rhino.Node(42, nodeArray85, (int) (byte) 1, 43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node89 = node77.getChildBefore(node88);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean4 = node3.isNull();
        boolean boolean5 = node3.isFromExterns();
        boolean boolean6 = node3.isFunction();
        com.google.javascript.rhino.Node node7 = node3.cloneTree();
        boolean boolean8 = node3.isLocalResultCall();
        boolean boolean9 = node3.isSetterDef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node11 = node3.getChildAtIndex(1);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 12);
        com.google.javascript.rhino.Node node2 = node1.cloneTree();
        com.google.javascript.rhino.Node node3 = node2.cloneNode();
        com.google.common.collect.ImmutableList<java.lang.String> strList12 = com.google.common.collect.ImmutableList.of("", "hi!", "", "", "hi!", "", "hi!", "");
        int int14 = strList12.indexOf((java.lang.Object) 'a');
        com.google.common.collect.ImmutableList<java.lang.String> strList23 = com.google.common.collect.ImmutableList.of("", "hi!", "", "", "hi!", "", "hi!", "");
        int int25 = strList23.indexOf((java.lang.Object) 'a');
        com.google.common.collect.ImmutableList<java.lang.String> strList34 = com.google.common.collect.ImmutableList.of("", "hi!", "", "", "hi!", "", "hi!", "");
        com.google.common.collect.ImmutableList<java.lang.String> strList43 = com.google.common.collect.ImmutableList.of("", "hi!", "", "", "hi!", "", "hi!", "");
        com.google.common.collect.ImmutableList<java.lang.Iterable<java.lang.String>> strIterableList44 = com.google.common.collect.ImmutableList.of((java.lang.Iterable<java.lang.String>) strList12, (java.lang.Iterable<java.lang.String>) strList23, (java.lang.Iterable<java.lang.String>) strList34, (java.lang.Iterable<java.lang.String>) strList43);
        com.google.common.collect.ImmutableList<java.lang.String> strList53 = com.google.common.collect.ImmutableList.of("", "hi!", "", "", "hi!", "", "hi!", "");
        int int55 = strList53.indexOf((java.lang.Object) 'a');
        int int56 = strList53.size();
        java.lang.String[] strArray59 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray60 = strList53.toArray(strArray59);
        java.lang.String[] strArray61 = strList12.toArray(strArray59);
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj67 = node65.getProp(43);
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int72 = node71.getSourceOffset();
        com.google.javascript.rhino.Node node73 = node65.useSourceInfoIfMissingFromForTree(node71);
        int int74 = node65.getSourceOffset();
        com.google.javascript.rhino.Node node76 = node65.getAncestor(8);
        boolean boolean77 = strList12.contains((java.lang.Object) 8);
        com.google.javascript.rhino.Node node81 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean82 = node81.isOptionalArg();
        com.google.javascript.rhino.Node node83 = node81.getNext();
        boolean boolean84 = node81.isThrow();
        boolean boolean85 = node81.isFor();
        boolean boolean86 = node81.isNE();
        com.google.javascript.rhino.Node node90 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node91 = node90.getNext();
        com.google.javascript.rhino.JSDocInfo jSDocInfo92 = node90.getJSDocInfo();
        com.google.javascript.rhino.Node node93 = node81.useSourceInfoIfMissingFrom(node90);
        int int94 = strList12.indexOf((java.lang.Object) node93);
        boolean boolean95 = node93.isLabelName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node96 = node3.getChildBefore(node93);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj6 = node4.getProp(43);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int11 = node10.getSourceOffset();
        com.google.javascript.rhino.Node node12 = node4.useSourceInfoIfMissingFromForTree(node10);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        node16.setDirectives((java.util.Set<java.lang.String>) strSet19);
        com.google.javascript.rhino.Node node22 = node10.useSourceInfoIfMissingFromForTree(node16);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj28 = node26.getProp(43);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int33 = node32.getSourceOffset();
        com.google.javascript.rhino.Node node34 = node26.useSourceInfoIfMissingFromForTree(node32);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray40 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet41 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet41, strArray40);
        node38.setDirectives((java.util.Set<java.lang.String>) strSet41);
        com.google.javascript.rhino.Node node44 = node32.useSourceInfoIfMissingFromForTree(node38);
        boolean boolean45 = node44.isContinue();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj51 = node49.getProp(43);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int56 = node55.getSourceOffset();
        com.google.javascript.rhino.Node node57 = node49.useSourceInfoIfMissingFromForTree(node55);
        boolean boolean58 = node57.isAssignAdd();
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean63 = node62.isVar();
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node((int) ' ', node16, node44, node57, node62, 1, 100);
        int int67 = node57.getSideEffectFlags();
        int int68 = node57.getSideEffectFlags();
        boolean boolean69 = node57.isGetElem();
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj75 = node73.getProp(43);
        com.google.javascript.rhino.Node node79 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int80 = node79.getSourceOffset();
        com.google.javascript.rhino.Node node81 = node73.useSourceInfoIfMissingFromForTree(node79);
        com.google.javascript.rhino.Node node85 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray87 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet88 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet88, strArray87);
        node85.setDirectives((java.util.Set<java.lang.String>) strSet88);
        com.google.javascript.rhino.Node node91 = node79.useSourceInfoIfMissingFromForTree(node85);
        boolean boolean92 = node91.isContinue();
        com.google.javascript.rhino.Node node93 = node91.cloneTree();
        boolean boolean94 = node93.isObjectLit();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression96 = new com.google.javascript.rhino.JSTypeExpression(node93, "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node57.removeChild(node93);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj5 = node3.getProp(43);
        boolean boolean6 = node3.isCall();
        int int7 = node3.getSourcePosition();
        java.lang.String str11 = node3.toString(false, true, false);
        boolean boolean12 = node3.isDo();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString((int) (short) 0, "[, hi!, , , hi!, , hi!, ]");
        boolean boolean16 = node3.isEquivalentTo(node15);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean21 = node20.isNull();
        boolean boolean22 = node20.isFromExterns();
        boolean boolean23 = node20.isFunction();
        com.google.javascript.rhino.Node node24 = node20.cloneTree();
        com.google.javascript.rhino.Node node25 = node3.copyInformationFrom(node20);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node29.addChildrenToFront(node33);
        boolean boolean36 = node29.getBooleanProp(8);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj42 = node40.getProp(43);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int47 = node46.getSourceOffset();
        com.google.javascript.rhino.Node node48 = node40.useSourceInfoIfMissingFromForTree(node46);
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray54 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet55 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet55, strArray54);
        node52.setDirectives((java.util.Set<java.lang.String>) strSet55);
        com.google.javascript.rhino.Node node58 = node46.useSourceInfoIfMissingFromForTree(node52);
        boolean boolean59 = node58.isContinue();
        boolean boolean60 = node58.isVoid();
        double double61 = node58.getDouble();
        java.lang.String str62 = node29.checkTreeEquals(node58);
        com.google.javascript.rhino.JSDocInfo jSDocInfo63 = node58.getJSDocInfo();
        boolean boolean64 = node58.isBreak();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node58);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean1 = typePosition0.hasBrackets();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean6 = node5.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        node10.setDirectives((java.util.Set<java.lang.String>) strSet13);
        java.lang.Object obj17 = node10.getProp((int) (byte) 1);
        com.google.javascript.rhino.Node node18 = node5.copyInformationFrom(node10);
        typePosition0.setItem(node18);
        int int20 = typePosition0.getStartLine();
        com.google.javascript.rhino.Node node21 = typePosition0.getItem();
        com.google.javascript.rhino.jstype.JSType jSType22 = node21.getJSType();
        int int23 = node21.getChildCount();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean28 = node27.isNoSideEffectsCall();
        boolean boolean29 = node27.isQualifiedName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node30 = node21.getChildBefore(node27);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean5 = node4.isVar();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj11 = node9.getProp(43);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int16 = node15.getSourceOffset();
        com.google.javascript.rhino.Node node17 = node9.useSourceInfoIfMissingFromForTree(node15);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        node21.setDirectives((java.util.Set<java.lang.String>) strSet24);
        com.google.javascript.rhino.Node node27 = node15.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean28 = node21.isThrow();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(35, node4, node21);
        int int30 = node4.getSourcePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition31 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition32 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition33 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition34 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition35 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition36 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean37 = typePosition36.hasBrackets();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.TypePosition> typePositionList38 = com.google.common.collect.ImmutableList.of(typePosition31, typePosition32, typePosition33, typePosition34, typePosition35, typePosition36);
        int int39 = typePosition33.getEndLine();
        int int40 = typePosition33.getStartLine();
        com.google.javascript.rhino.Node node41 = typePosition33.getItem();
        int int42 = typePosition33.getStartLine();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean48 = node47.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray54 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet55 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet55, strArray54);
        node52.setDirectives((java.util.Set<java.lang.String>) strSet55);
        java.lang.Object obj59 = node52.getProp((int) (byte) 1);
        com.google.javascript.rhino.Node node60 = node47.copyInformationFrom(node52);
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        boolean boolean65 = node64.isNull();
        boolean boolean66 = node64.isSyntheticBlock();
        com.google.javascript.rhino.Node node67 = node64.removeChildren();
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        boolean boolean72 = node71.isDebugger();
        com.google.javascript.rhino.Node node73 = node71.getFirstChild();
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj79 = node77.getProp(43);
        com.google.javascript.rhino.Node node83 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int84 = node83.getSourceOffset();
        com.google.javascript.rhino.Node node85 = node77.useSourceInfoIfMissingFromForTree(node83);
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(38, node52, node64, node71, node77);
        java.lang.String str87 = node77.getQualifiedName();
        node77.setType((int) (short) 100);
        typePosition33.setItem(node77);
        com.google.javascript.rhino.Node node91 = node4.clonePropsFrom(node77);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node93 = node4.getChildAtIndex(35);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj7 = node5.getProp(43);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int12 = node11.getSourceOffset();
        com.google.javascript.rhino.Node node13 = node5.useSourceInfoIfMissingFromForTree(node11);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        node17.setDirectives((java.util.Set<java.lang.String>) strSet20);
        com.google.javascript.rhino.Node node23 = node11.useSourceInfoIfMissingFromForTree(node17);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj29 = node27.getProp(43);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int34 = node33.getSourceOffset();
        com.google.javascript.rhino.Node node35 = node27.useSourceInfoIfMissingFromForTree(node33);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray41 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        node39.setDirectives((java.util.Set<java.lang.String>) strSet42);
        com.google.javascript.rhino.Node node45 = node33.useSourceInfoIfMissingFromForTree(node39);
        boolean boolean46 = node45.isContinue();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj52 = node50.getProp(43);
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int57 = node56.getSourceOffset();
        com.google.javascript.rhino.Node node58 = node50.useSourceInfoIfMissingFromForTree(node56);
        boolean boolean59 = node58.isAssignAdd();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean64 = node63.isVar();
        com.google.javascript.rhino.Node node67 = new com.google.javascript.rhino.Node((int) ' ', node17, node45, node58, node63, 1, 100);
        boolean boolean68 = node67.isFromExterns();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj74 = node72.getProp(43);
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int79 = node78.getSourceOffset();
        com.google.javascript.rhino.Node node80 = node72.useSourceInfoIfMissingFromForTree(node78);
        com.google.javascript.rhino.Node node84 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean85 = node84.isVar();
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(53, node67, node80, node84);
        boolean boolean87 = node67.isNot();
        com.google.javascript.rhino.Node node88 = node67.detachFromParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node90 = node88.getChildAtIndex(42);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean4 = node3.isVar();
        node3.putBooleanProp(30, false);
        boolean boolean8 = node3.isSwitch();
        boolean boolean9 = node3.isIn();
        boolean boolean10 = node3.isIn();
        boolean boolean11 = node3.isOr();
        com.google.javascript.rhino.Node node12 = node3.getLastSibling();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int18 = node17.getSourceOffset();
        com.google.javascript.rhino.jstype.JSType jSType19 = node17.getJSType();
        boolean boolean20 = node17.isWith();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node25.addChildrenToFront(node29);
        boolean boolean31 = node25.isGetterDef();
        boolean boolean32 = node25.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj38 = node36.getProp(43);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int43 = node42.getSourceOffset();
        com.google.javascript.rhino.Node node44 = node36.useSourceInfoIfMissingFromForTree(node42);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray50 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet51 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet51, strArray50);
        node48.setDirectives((java.util.Set<java.lang.String>) strSet51);
        com.google.javascript.rhino.Node node54 = node42.useSourceInfoIfMissingFromForTree(node48);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node(32, node25, node42);
        boolean boolean56 = node55.isExprResult();
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node((int) (byte) 0, node17, node55);
        node17.removeProp(10);
        node17.setVarArgs(true);
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj67 = node65.getProp(43);
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int72 = node71.getSourceOffset();
        com.google.javascript.rhino.Node node73 = node65.useSourceInfoIfMissingFromForTree(node71);
        boolean boolean74 = node73.isSyntheticBlock();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile75 = node73.getStaticSourceFile();
        boolean boolean76 = node73.isDo();
        com.google.javascript.rhino.Node node77 = node17.useSourceInfoFrom(node73);
        com.google.javascript.rhino.InputId inputId78 = node77.getInputId();
        com.google.javascript.rhino.Node node79 = node77.detachFromParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node80 = node12.getChildBefore(node79);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean3 = jSDocInfoBuilder1.recordVersion("");
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile5 = null;
        jSDocInfoBuilder1.markName("hi!", staticSourceFile5, (int) (short) 0, (int) (short) 100);
        boolean boolean9 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean10 = jSDocInfoBuilder1.recordNoCompile();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder12 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean13 = jSDocInfoBuilder12.recordJavaDispatch();
        jSDocInfoBuilder12.markText("hi!", (-1), (int) (byte) -1, 4095, 1);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder21 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean22 = jSDocInfoBuilder21.recordJavaDispatch();
        boolean boolean23 = jSDocInfoBuilder21.recordNoCompile();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj30 = node28.getProp(43);
        boolean boolean31 = node28.isCall();
        boolean boolean32 = node28.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression34 = new com.google.javascript.rhino.JSTypeExpression(node28, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder35 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray37 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray38 = (java.util.ArrayList<java.lang.String>[]) arrayListArray37;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder39 = strListBuilder35.add((java.util.ArrayList<java.lang.String>[]) arrayListArray37);
        boolean boolean40 = jSTypeExpression34.equals((java.lang.Object) arrayListArray37);
        boolean boolean41 = jSDocInfoBuilder21.recordParameter("", jSTypeExpression34);
        boolean boolean42 = jSDocInfoBuilder12.recordThrowType(jSTypeExpression34);
        boolean boolean43 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression34);
        boolean boolean45 = jSDocInfoBuilder1.hasParameter("[, hi!, , , hi!, , hi!, ]");
        boolean boolean46 = jSDocInfoBuilder1.isPopulated();
        boolean boolean47 = jSDocInfoBuilder1.recordJavaDispatch();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean52 = node51.isVar();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node57 = node51.copyInformationFromForTree(node56);
        com.google.javascript.rhino.Node node58 = node51.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression60 = new com.google.javascript.rhino.JSTypeExpression(node58, "STRING  43");
        boolean boolean61 = jSTypeExpression60.isVarArgs();
        boolean boolean62 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression60);
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj68 = node66.getProp(43);
        boolean boolean69 = node66.isCall();
        int int70 = node66.getSourcePosition();
        java.lang.String str74 = node66.toString(false, true, false);
        boolean boolean75 = node66.isVarArgs();
        com.google.javascript.rhino.Node node79 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node83 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node79.addChildrenToFront(node83);
        node83.setQuotedString();
        boolean boolean86 = node83.isHook();
        boolean boolean87 = node66.isEquivalentTo(node83);
        boolean boolean88 = node83.isBlock();
        boolean boolean89 = jSTypeExpression60.equals((java.lang.Object) node83);
        boolean boolean90 = node83.isAssignAdd();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression34 and jSTypeExpression60", jSTypeExpression34.equals(jSTypeExpression60) ? jSTypeExpression34.hashCode() == jSTypeExpression60.hashCode() : true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj5 = node3.getProp(43);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int10 = node9.getSourceOffset();
        com.google.javascript.rhino.Node node11 = node3.useSourceInfoIfMissingFromForTree(node9);
        int int12 = node3.getSourceOffset();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = node3.getJSDocInfo();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean18 = node17.isVar();
        node17.putBooleanProp(30, false);
        boolean boolean22 = node17.isSwitch();
        boolean boolean23 = node17.isUnscopedQualifiedName();
        boolean boolean24 = node17.hasChildren();
        node17.setCharno(52);
        com.google.javascript.rhino.Node node27 = node3.clonePropsFrom(node17);
        boolean boolean28 = node3.isQuotedString();
        boolean boolean29 = node3.isBlock();
        boolean boolean30 = node3.isTry();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean35 = node34.isOptionalArg();
        node34.setSourceEncodedPosition(12);
        boolean boolean38 = node34.isFromExterns();
        com.google.javascript.rhino.Node node39 = node3.useSourceInfoIfMissingFrom(node34);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj46 = node44.getProp(43);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int51 = node50.getSourceOffset();
        com.google.javascript.rhino.Node node52 = node44.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean53 = node52.isIf();
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(49, node52, 0, 100);
        com.google.javascript.rhino.Node node57 = node52.detachFromParent();
        boolean boolean58 = node57.isFalse();
        node57.putIntProp(31, 29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node39.removeChild(node57);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean2 = jSDocInfoBuilder1.isInterfaceRecorded();
        jSDocInfoBuilder1.recordOriginalCommentString("");
        boolean boolean5 = jSDocInfoBuilder1.recordImplicitCast();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder8 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean9 = jSDocInfoBuilder8.isInterfaceRecorded();
        boolean boolean10 = jSDocInfoBuilder8.isConstructorRecorded();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder12 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean13 = jSDocInfoBuilder12.isInterfaceRecorded();
        boolean boolean15 = jSDocInfoBuilder12.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj21 = node19.getProp(43);
        boolean boolean22 = node19.isCall();
        boolean boolean23 = node19.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression25 = new com.google.javascript.rhino.JSTypeExpression(node19, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder26 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray28 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray29 = (java.util.ArrayList<java.lang.String>[]) arrayListArray28;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder30 = strListBuilder26.add((java.util.ArrayList<java.lang.String>[]) arrayListArray28);
        boolean boolean31 = jSTypeExpression25.equals((java.lang.Object) arrayListArray28);
        boolean boolean32 = jSDocInfoBuilder12.recordDefineType(jSTypeExpression25);
        com.google.javascript.rhino.Node node33 = jSTypeExpression25.getRoot();
        boolean boolean35 = jSDocInfoBuilder8.recordThrowDescription(jSTypeExpression25, "Node tree inequality:\nTree1:\nSTRING  43\n\n\nTree2:\nTYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n\n\nSubtree1: STRING  43\n\n\nSubtree2: TYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder37 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean38 = jSDocInfoBuilder37.isInterfaceRecorded();
        boolean boolean40 = jSDocInfoBuilder37.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj46 = node44.getProp(43);
        boolean boolean47 = node44.isCall();
        boolean boolean48 = node44.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression50 = new com.google.javascript.rhino.JSTypeExpression(node44, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder51 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray53 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray54 = (java.util.ArrayList<java.lang.String>[]) arrayListArray53;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder55 = strListBuilder51.add((java.util.ArrayList<java.lang.String>[]) arrayListArray53);
        boolean boolean56 = jSTypeExpression50.equals((java.lang.Object) arrayListArray53);
        boolean boolean57 = jSDocInfoBuilder37.recordDefineType(jSTypeExpression50);
        boolean boolean58 = jSDocInfoBuilder8.recordEnumParameterType(jSTypeExpression50);
        boolean boolean59 = jSDocInfoBuilder8.recordNoShadow();
        boolean boolean61 = jSDocInfoBuilder8.recordDeprecationReason("TYPEOF");
        boolean boolean63 = jSDocInfoBuilder8.recordDescription("JSDocInfo");
        boolean boolean64 = jSDocInfoBuilder8.recordInterface();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder66 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean67 = jSDocInfoBuilder66.recordNoTypeCheck();
        boolean boolean68 = jSDocInfoBuilder66.isInterfaceRecorded();
        jSDocInfoBuilder66.markAnnotation("[, hi!, , , hi!, , hi!, ]", (int) (short) 0, 2);
        boolean boolean73 = jSDocInfoBuilder66.recordIdGenerator();
        boolean boolean74 = jSDocInfoBuilder66.recordInterface();
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean79 = node78.isVar();
        com.google.javascript.rhino.Node node83 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node84 = node78.copyInformationFromForTree(node83);
        com.google.javascript.rhino.Node node85 = node78.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression87 = new com.google.javascript.rhino.JSTypeExpression(node85, "STRING  43");
        boolean boolean88 = jSTypeExpression87.isVarArgs();
        boolean boolean89 = jSDocInfoBuilder66.recordDefineType(jSTypeExpression87);
        boolean boolean90 = jSDocInfoBuilder8.recordEnumParameterType(jSTypeExpression87);
        boolean boolean91 = jSDocInfoBuilder1.recordParameter("NUMBER 12.0\n", jSTypeExpression87);
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfoBuilder> jSDocInfoBuilderList92 = com.google.common.collect.ImmutableList.of(jSDocInfoBuilder1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression25 and jSTypeExpression87", jSTypeExpression25.equals(jSTypeExpression87) ? jSTypeExpression25.hashCode() == jSTypeExpression87.hashCode() : true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj5 = node3.getProp(43);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int10 = node9.getSourceOffset();
        com.google.javascript.rhino.Node node11 = node3.useSourceInfoIfMissingFromForTree(node9);
        boolean boolean12 = node11.isAssignAdd();
        int int13 = node11.getType();
        node11.setSourceFileForTesting("TYPEOF 1\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n");
        boolean boolean16 = node11.isCase();
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = com.google.common.collect.ImmutableList.of("", "hi!", "", "", "hi!", "", "hi!", "");
        int int27 = strList25.indexOf((java.lang.Object) 'a');
        int int28 = strList25.size();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj34 = node32.getProp(43);
        int int35 = node32.getType();
        boolean boolean36 = node32.isGetterDef();
        node32.setSourceEncodedPositionForTree(54);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean43 = node42.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray49 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet50 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet50, strArray49);
        node47.setDirectives((java.util.Set<java.lang.String>) strSet50);
        java.lang.Object obj54 = node47.getProp((int) (byte) 1);
        com.google.javascript.rhino.Node node55 = node42.copyInformationFrom(node47);
        boolean boolean56 = node32.isEquivalentToTyped(node42);
        boolean boolean57 = strList25.contains((java.lang.Object) node42);
        node42.setWasEmptyNode(true);
        node42.setType(12);
        boolean boolean62 = node42.isNull();
        boolean boolean63 = node42.isDo();
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj69 = node67.getProp(43);
        int int70 = node67.getType();
        boolean boolean71 = node67.isOnlyModifiesThisCall();
        boolean boolean72 = node67.isNew();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node11.replaceChild(node42, node67);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean2 = jSDocInfoBuilder1.recordNoTypeCheck();
        boolean boolean4 = jSDocInfoBuilder1.addAuthor("");
        boolean boolean5 = jSDocInfoBuilder1.recordExport();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder7 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean8 = jSDocInfoBuilder7.isInterfaceRecorded();
        boolean boolean9 = jSDocInfoBuilder7.isConstructorRecorded();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder11 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean12 = jSDocInfoBuilder11.isInterfaceRecorded();
        boolean boolean14 = jSDocInfoBuilder11.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj20 = node18.getProp(43);
        boolean boolean21 = node18.isCall();
        boolean boolean22 = node18.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression24 = new com.google.javascript.rhino.JSTypeExpression(node18, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder25 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray27 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray28 = (java.util.ArrayList<java.lang.String>[]) arrayListArray27;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder29 = strListBuilder25.add((java.util.ArrayList<java.lang.String>[]) arrayListArray27);
        boolean boolean30 = jSTypeExpression24.equals((java.lang.Object) arrayListArray27);
        boolean boolean31 = jSDocInfoBuilder11.recordDefineType(jSTypeExpression24);
        com.google.javascript.rhino.Node node32 = jSTypeExpression24.getRoot();
        boolean boolean34 = jSDocInfoBuilder7.recordThrowDescription(jSTypeExpression24, "Node tree inequality:\nTree1:\nSTRING  43\n\n\nTree2:\nTYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n\n\nSubtree1: STRING  43\n\n\nSubtree2: TYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder36 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean37 = jSDocInfoBuilder36.isInterfaceRecorded();
        boolean boolean39 = jSDocInfoBuilder36.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj45 = node43.getProp(43);
        boolean boolean46 = node43.isCall();
        boolean boolean47 = node43.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression49 = new com.google.javascript.rhino.JSTypeExpression(node43, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder50 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray52 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray53 = (java.util.ArrayList<java.lang.String>[]) arrayListArray52;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder54 = strListBuilder50.add((java.util.ArrayList<java.lang.String>[]) arrayListArray52);
        boolean boolean55 = jSTypeExpression49.equals((java.lang.Object) arrayListArray52);
        boolean boolean56 = jSDocInfoBuilder36.recordDefineType(jSTypeExpression49);
        boolean boolean57 = jSDocInfoBuilder7.recordEnumParameterType(jSTypeExpression49);
        boolean boolean58 = jSTypeExpression49.isOptionalArg();
        boolean boolean59 = jSTypeExpression49.isVarArgs();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression60 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression49);
        boolean boolean61 = jSDocInfoBuilder1.recordReturnType(jSTypeExpression60);
        boolean boolean62 = jSDocInfoBuilder1.recordNoSideEffects();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder64 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean65 = jSDocInfoBuilder64.recordNoTypeCheck();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression66 = null;
        boolean boolean67 = jSDocInfoBuilder64.recordThisType(jSTypeExpression66);
        boolean boolean68 = jSDocInfoBuilder64.recordOverride();
        boolean boolean69 = jSDocInfoBuilder64.recordExpose();
        boolean boolean70 = jSDocInfoBuilder64.recordExport();
        boolean boolean71 = jSDocInfoBuilder64.recordNoTypeCheck();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder73 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean74 = jSDocInfoBuilder73.recordNoTypeCheck();
        jSDocInfoBuilder73.recordOriginalCommentString("");
        com.google.javascript.rhino.Node node80 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean81 = node80.isVar();
        com.google.javascript.rhino.Node node85 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node86 = node80.copyInformationFromForTree(node85);
        com.google.javascript.rhino.Node node87 = node80.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression89 = new com.google.javascript.rhino.JSTypeExpression(node87, "STRING  43");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression90 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression89);
        boolean boolean91 = jSDocInfoBuilder73.recordReturnType(jSTypeExpression89);
        boolean boolean93 = jSDocInfoBuilder64.recordThrowDescription(jSTypeExpression89, "STRING  43");
        boolean boolean94 = jSDocInfoBuilder1.recordExtendedInterface(jSTypeExpression89);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression60 and jSTypeExpression90", jSTypeExpression60.equals(jSTypeExpression90) ? jSTypeExpression60.hashCode() == jSTypeExpression90.hashCode() : true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj6 = node4.getProp(43);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int11 = node10.getSourceOffset();
        com.google.javascript.rhino.Node node12 = node4.useSourceInfoIfMissingFromForTree(node10);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        node16.setDirectives((java.util.Set<java.lang.String>) strSet19);
        com.google.javascript.rhino.Node node22 = node10.useSourceInfoIfMissingFromForTree(node16);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj28 = node26.getProp(43);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int33 = node32.getSourceOffset();
        com.google.javascript.rhino.Node node34 = node26.useSourceInfoIfMissingFromForTree(node32);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray40 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet41 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet41, strArray40);
        node38.setDirectives((java.util.Set<java.lang.String>) strSet41);
        com.google.javascript.rhino.Node node44 = node32.useSourceInfoIfMissingFromForTree(node38);
        boolean boolean45 = node44.isContinue();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj51 = node49.getProp(43);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int56 = node55.getSourceOffset();
        com.google.javascript.rhino.Node node57 = node49.useSourceInfoIfMissingFromForTree(node55);
        boolean boolean58 = node57.isAssignAdd();
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean63 = node62.isVar();
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node((int) ' ', node16, node44, node57, node62, 1, 100);
        int int67 = node57.getSideEffectFlags();
        boolean boolean68 = node57.isDelProp();
        java.lang.String str72 = node57.toString(false, false, false);
        boolean boolean73 = node57.isIn();
        boolean boolean74 = node57.isNumber();
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean79 = node78.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node80 = node78.cloneNode();
        boolean boolean81 = node80.isGetElem();
        node80.addSuppression("");
        com.google.javascript.rhino.Node node87 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int88 = node87.getSourceOffset();
        boolean boolean89 = node87.isBreak();
        int int90 = node87.getSourcePosition();
        com.google.javascript.rhino.Node node91 = node80.useSourceInfoFrom(node87);
        com.google.javascript.rhino.JSDocInfo jSDocInfo92 = node87.getJSDocInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node93 = node57.getChildBefore(node87);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean4 = node3.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node5 = node3.cloneNode();
        boolean boolean6 = node5.isGetElem();
        node5.addSuppression("");
        int int9 = node5.getType();
        boolean boolean10 = node5.isInc();
        boolean boolean11 = node5.isNE();
        boolean boolean12 = node5.isName();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition13 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition14 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition15 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition16 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition17 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition18 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean19 = typePosition18.hasBrackets();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.TypePosition> typePositionList20 = com.google.common.collect.ImmutableList.of(typePosition13, typePosition14, typePosition15, typePosition16, typePosition17, typePosition18);
        int int21 = typePosition15.getEndLine();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        boolean boolean26 = node25.isNull();
        boolean boolean27 = node25.isSyntheticBlock();
        boolean boolean28 = node25.hasMoreThanOneChild();
        typePosition15.setItem(node25);
        com.google.javascript.rhino.Node node30 = node25.getParent();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable31 = node25.children();
        boolean boolean32 = node25.isLabelName();
        node25.setVarArgs(false);
        boolean boolean35 = node25.isBreak();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node5.removeChild(node25);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean4 = node3.isNull();
        boolean boolean5 = node3.isWhile();
        boolean boolean6 = node3.isTypeOf();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj13 = node11.getProp(43);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int18 = node17.getSourceOffset();
        com.google.javascript.rhino.Node node19 = node11.useSourceInfoIfMissingFromForTree(node17);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        node23.setDirectives((java.util.Set<java.lang.String>) strSet26);
        com.google.javascript.rhino.Node node29 = node17.useSourceInfoIfMissingFromForTree(node23);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj35 = node33.getProp(43);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int40 = node39.getSourceOffset();
        com.google.javascript.rhino.Node node41 = node33.useSourceInfoIfMissingFromForTree(node39);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray47 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        node45.setDirectives((java.util.Set<java.lang.String>) strSet48);
        com.google.javascript.rhino.Node node51 = node39.useSourceInfoIfMissingFromForTree(node45);
        boolean boolean52 = node51.isContinue();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj58 = node56.getProp(43);
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int63 = node62.getSourceOffset();
        com.google.javascript.rhino.Node node64 = node56.useSourceInfoIfMissingFromForTree(node62);
        boolean boolean65 = node64.isAssignAdd();
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean70 = node69.isVar();
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node((int) ' ', node23, node51, node64, node69, 1, 100);
        boolean boolean74 = node51.isHook();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node75 = node3.getChildBefore(node51);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj5 = node3.getProp(43);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int10 = node9.getSourceOffset();
        com.google.javascript.rhino.Node node11 = node3.useSourceInfoIfMissingFromForTree(node9);
        int int12 = node3.getSourceOffset();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = node3.getJSDocInfo();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean18 = node17.isVar();
        node17.putBooleanProp(30, false);
        boolean boolean22 = node17.isSwitch();
        boolean boolean23 = node17.isUnscopedQualifiedName();
        boolean boolean24 = node17.hasChildren();
        node17.setCharno(52);
        com.google.javascript.rhino.Node node27 = node3.clonePropsFrom(node17);
        node27.putIntProp(42, 46);
        com.google.javascript.rhino.InputId inputId31 = node27.getInputId();
        node27.setSourceEncodedPositionForTree(52);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node37.addChildrenToFront(node41);
        boolean boolean43 = node37.isInc();
        boolean boolean44 = node37.isEmpty();
        node37.setOptionalArg(true);
        int int47 = node37.getSourceOffset();
        com.google.javascript.rhino.Node node48 = node37.getLastChild();
        node37.putIntProp(176180, (int) (short) -1);
        boolean boolean52 = node37.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node56.setIsSyntheticBlock(true);
        boolean boolean59 = node56.isReturn();
        boolean boolean60 = node56.isCatch();
        node37.addChildToFront(node56);
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newString(48, "ERROR  43\n", 10, 41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node27.replaceChild(node37, node66);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        node3.setDirectives((java.util.Set<java.lang.String>) strSet6);
        java.lang.Object[] objArray9 = strSet6.toArray();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        node13.setDirectives((java.util.Set<java.lang.String>) strSet16);
        java.lang.Object[] objArray19 = strSet16.toArray();
        boolean boolean20 = strSet6.retainAll((java.util.Collection<java.lang.String>) strSet16);
        strSet16.clear();
        java.lang.Comparable[][] comparableArray23 = new java.lang.Comparable[0][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray24 = (java.lang.Comparable<java.lang.String>[][]) comparableArray23;
        java.lang.Comparable[][] comparableArray26 = new java.lang.Comparable[0][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray27 = (java.lang.Comparable<java.lang.String>[][]) comparableArray26;
        java.lang.Comparable[][] comparableArray29 = new java.lang.Comparable[0][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray30 = (java.lang.Comparable<java.lang.String>[][]) comparableArray29;
        java.lang.Comparable[][][] comparableArray32 = new java.lang.Comparable[3][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray33 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray32;
        strComparableArray33[0] = strComparableArray24;
        strComparableArray33[1] = strComparableArray27;
        strComparableArray33[2] = strComparableArray30;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray40 = strSet16.toArray(strComparableArray33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>[][]> strComparableArrayList41 = com.google.common.collect.ImmutableList.of(strComparableArray33);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj5 = node3.getProp(43);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int10 = node9.getSourceOffset();
        com.google.javascript.rhino.Node node11 = node3.useSourceInfoIfMissingFromForTree(node9);
        int int12 = node3.getSourceOffset();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = node3.getJSDocInfo();
        boolean boolean14 = node3.isIn();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node18.addChildrenToFront(node22);
        node22.setQuotedString();
        com.google.javascript.rhino.Node node25 = node22.removeFirstChild();
        int int27 = node22.getIntProp((int) 'a');
        node22.setCharno(47);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj35 = node33.getProp(43);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int40 = node39.getSourceOffset();
        com.google.javascript.rhino.Node node41 = node33.useSourceInfoIfMissingFromForTree(node39);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean46 = node45.isVar();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node51 = node45.copyInformationFromForTree(node50);
        com.google.javascript.rhino.Node node52 = node33.copyInformationFromForTree(node51);
        boolean boolean53 = node22.hasChild(node52);
        com.google.javascript.rhino.Node node54 = node52.cloneNode();
        com.google.javascript.rhino.Node node55 = node3.copyInformationFrom(node54);
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj61 = node59.getProp(43);
        boolean boolean62 = node59.isCall();
        boolean boolean63 = node59.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression65 = new com.google.javascript.rhino.JSTypeExpression(node59, "STRING ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node59);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 1);
        boolean boolean2 = node1.isIf();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj9 = node7.getProp(43);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int14 = node13.getSourceOffset();
        com.google.javascript.rhino.Node node15 = node7.useSourceInfoIfMissingFromForTree(node13);
        int int16 = node7.getSourceOffset();
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = node7.getJSDocInfo();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(49, node7, (int) (byte) -1, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node21 = node1.getChildBefore(node7);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        com.google.javascript.rhino.Node[] nodeArray5 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(42, nodeArray5, (int) (byte) 1, 43);
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(39, nodeArray5, (int) '4', 32);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(50, nodeArray5, 32, 15);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(10, nodeArray5, 1, (int) ' ');
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (byte) 10, nodeArray5, 176180, 147494);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean25 = node24.isVar();
        node24.putBooleanProp(30, false);
        boolean boolean29 = node24.isSwitch();
        boolean boolean30 = node24.isIn();
        node24.setSourceEncodedPosition(45);
        boolean boolean33 = node24.isAssign();
        int int34 = node24.getSourceOffset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node20.removeChild(node24);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 100, 43, (-1));
        node3.detachChildren();
        boolean boolean5 = node3.isWith();
        int int6 = node3.getChildCount();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj13 = node11.getProp(43);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        boolean boolean18 = node17.isIf();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj24 = node22.getProp(43);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int29 = node28.getSourceOffset();
        com.google.javascript.rhino.Node node30 = node22.useSourceInfoIfMissingFromForTree(node28);
        boolean boolean31 = node30.isAssignAdd();
        boolean boolean32 = node30.isEmpty();
        node30.setSourceEncodedPosition(40);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean39 = node38.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray45 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        node43.setDirectives((java.util.Set<java.lang.String>) strSet46);
        java.lang.Object obj50 = node43.getProp((int) (byte) 1);
        com.google.javascript.rhino.Node node51 = node38.copyInformationFrom(node43);
        boolean boolean52 = node38.isOr();
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node(1, node11, node17, node30, node38, 176180, 1);
        boolean boolean56 = node55.isIf();
        boolean boolean57 = node55.isCatch();
        com.google.javascript.rhino.Node node58 = node55.removeChildren();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node59 = node3.getChildBefore(node55);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        node4.setDirectives((java.util.Set<java.lang.String>) strSet7);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj15 = node13.getProp(43);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int20 = node19.getSourceOffset();
        com.google.javascript.rhino.Node node21 = node13.useSourceInfoIfMissingFromForTree(node19);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        node25.setDirectives((java.util.Set<java.lang.String>) strSet28);
        com.google.javascript.rhino.Node node31 = node19.useSourceInfoIfMissingFromForTree(node25);
        boolean boolean32 = node31.isContinue();
        boolean boolean33 = node31.isOnlyModifiesThisCall();
        boolean boolean34 = node31.isDefaultCase();
        boolean boolean35 = node4.hasChild(node31);
        java.lang.String str39 = node4.toString(false, true, true);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable40 = node4.siblings();
        node4.setOptionalArg(false);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean47 = node46.isVar();
        node46.putBooleanProp(30, false);
        boolean boolean51 = node46.isSwitch();
        boolean boolean52 = node46.isIn();
        boolean boolean53 = node46.isFromExterns();
        boolean boolean54 = node46.isNot();
        boolean boolean55 = node46.isNumber();
        int int56 = node46.getSideEffectFlags();
        com.google.javascript.rhino.Node[] nodeArray62 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node(42, nodeArray62, (int) (byte) 1, 43);
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node(49, nodeArray62, 53, 43);
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(176180, nodeArray62, 41, 38);
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node((int) (byte) 1, nodeArray62);
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node(26, nodeArray62);
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean78 = node77.isVar();
        node77.putBooleanProp(30, false);
        boolean boolean82 = node77.isSwitch();
        boolean boolean83 = node77.isIn();
        boolean boolean84 = node77.isIn();
        boolean boolean85 = node77.isOr();
        com.google.javascript.rhino.Node node86 = node77.getLastSibling();
        com.google.javascript.rhino.Node node87 = new com.google.javascript.rhino.Node(46, node4, node46, node73, node77);
        com.google.javascript.rhino.Node node91 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean92 = node91.isNoSideEffectsCall();
        boolean boolean93 = node91.isWith();
        boolean boolean94 = node91.hasOneChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node95 = node46.getChildBefore(node91);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean2 = jSDocInfoBuilder1.isInterfaceRecorded();
        jSDocInfoBuilder1.recordOriginalCommentString("");
        boolean boolean5 = jSDocInfoBuilder1.isConstructorRecorded();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder7 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean8 = jSDocInfoBuilder7.recordJavaDispatch();
        boolean boolean9 = jSDocInfoBuilder7.recordNoCompile();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj16 = node14.getProp(43);
        boolean boolean17 = node14.isCall();
        boolean boolean18 = node14.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression20 = new com.google.javascript.rhino.JSTypeExpression(node14, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder21 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray23 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray24 = (java.util.ArrayList<java.lang.String>[]) arrayListArray23;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder25 = strListBuilder21.add((java.util.ArrayList<java.lang.String>[]) arrayListArray23);
        boolean boolean26 = jSTypeExpression20.equals((java.lang.Object) arrayListArray23);
        boolean boolean27 = jSDocInfoBuilder7.recordParameter("", jSTypeExpression20);
        boolean boolean28 = jSTypeExpression20.isOptionalArg();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression29 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression20);
        boolean boolean30 = jSDocInfoBuilder1.recordType(jSTypeExpression20);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder32 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean34 = jSDocInfoBuilder32.recordVersion("");
        boolean boolean35 = jSDocInfoBuilder32.recordExpose();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean40 = node39.isVar();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node45 = node39.copyInformationFromForTree(node44);
        com.google.javascript.rhino.Node node46 = node39.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression48 = new com.google.javascript.rhino.JSTypeExpression(node46, "STRING  43");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression49 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression48);
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray55 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet56 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet56, strArray55);
        node53.setDirectives((java.util.Set<java.lang.String>) strSet56);
        java.lang.Object[] objArray59 = strSet56.toArray();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray65 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet66 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet66, strArray65);
        node63.setDirectives((java.util.Set<java.lang.String>) strSet66);
        java.lang.Object[] objArray69 = strSet66.toArray();
        boolean boolean70 = strSet56.retainAll((java.util.Collection<java.lang.String>) strSet66);
        int int71 = strSet66.size();
        boolean boolean73 = strSet66.add("");
        boolean boolean74 = jSTypeExpression49.equals((java.lang.Object) strSet66);
        boolean boolean75 = jSDocInfoBuilder32.recordDefineType(jSTypeExpression49);
        boolean boolean76 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression20 and jSTypeExpression48", jSTypeExpression20.equals(jSTypeExpression48) ? jSTypeExpression20.hashCode() == jSTypeExpression48.hashCode() : true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj5 = node3.getProp(43);
        boolean boolean6 = node3.isCall();
        int int7 = node3.getSourcePosition();
        java.lang.String str11 = node3.toString(false, true, false);
        boolean boolean12 = node3.isNot();
        boolean boolean13 = node3.isString();
        com.google.javascript.rhino.Node node14 = node3.getLastSibling();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj20 = node18.getProp(43);
        boolean boolean21 = node18.isCall();
        int int22 = node18.getSourcePosition();
        java.lang.String str26 = node18.toString(false, true, false);
        boolean boolean27 = node18.isNot();
        boolean boolean28 = node18.isDelProp();
        boolean boolean29 = node18.isTrue();
        boolean boolean30 = node18.isAdd();
        com.google.javascript.rhino.jstype.JSType jSType31 = node18.getJSType();
        boolean boolean32 = node18.isFromExterns();
        node18.addSuppression("Node tree inequality:\nTree1:\nSTRING  43\n\n\nTree2:\nNUMBER 0.0 43\n\n\nSubtree1: STRING  43\n\n\nSubtree2: NUMBER 0.0 43\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node18);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node3.addChildrenToFront(node7);
        boolean boolean9 = node3.isGetterDef();
        boolean boolean10 = node3.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean15 = node14.isOptionalArg();
        boolean boolean16 = node14.isSwitch();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node21.addChildrenToFront(node25);
        boolean boolean27 = node21.isGetterDef();
        boolean boolean28 = node21.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj34 = node32.getProp(43);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int39 = node38.getSourceOffset();
        com.google.javascript.rhino.Node node40 = node32.useSourceInfoIfMissingFromForTree(node38);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet47 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet47, strArray46);
        node44.setDirectives((java.util.Set<java.lang.String>) strSet47);
        com.google.javascript.rhino.Node node50 = node38.useSourceInfoIfMissingFromForTree(node44);
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node(32, node21, node38);
        boolean boolean52 = node51.isExprResult();
        boolean boolean53 = node51.isFunction();
        com.google.javascript.rhino.Node node54 = node14.srcrefTree(node51);
        boolean boolean55 = node14.isDebugger();
        boolean boolean56 = node14.isFalse();
        boolean boolean57 = node14.isLocalResultCall();
        com.google.javascript.rhino.Node node59 = node14.getAncestor(50);
        boolean boolean60 = node3.isEquivalentTo(node14);
        boolean boolean61 = node14.isComma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node63 = node14.getChildAtIndex(100);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean3 = jSDocInfoBuilder1.recordVersion("");
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile5 = null;
        jSDocInfoBuilder1.markName("hi!", staticSourceFile5, (int) (short) 0, (int) (short) 100);
        boolean boolean9 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean10 = jSDocInfoBuilder1.recordNoCompile();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder12 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean13 = jSDocInfoBuilder12.recordJavaDispatch();
        jSDocInfoBuilder12.markText("hi!", (-1), (int) (byte) -1, 4095, 1);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder21 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean22 = jSDocInfoBuilder21.recordJavaDispatch();
        boolean boolean23 = jSDocInfoBuilder21.recordNoCompile();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj30 = node28.getProp(43);
        boolean boolean31 = node28.isCall();
        boolean boolean32 = node28.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression34 = new com.google.javascript.rhino.JSTypeExpression(node28, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder35 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray37 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray38 = (java.util.ArrayList<java.lang.String>[]) arrayListArray37;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder39 = strListBuilder35.add((java.util.ArrayList<java.lang.String>[]) arrayListArray37);
        boolean boolean40 = jSTypeExpression34.equals((java.lang.Object) arrayListArray37);
        boolean boolean41 = jSDocInfoBuilder21.recordParameter("", jSTypeExpression34);
        boolean boolean42 = jSDocInfoBuilder12.recordThrowType(jSTypeExpression34);
        boolean boolean43 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression34);
        boolean boolean45 = jSDocInfoBuilder1.hasParameter("[, hi!, , , hi!, , hi!, ]");
        boolean boolean46 = jSDocInfoBuilder1.isPopulated();
        boolean boolean47 = jSDocInfoBuilder1.recordJavaDispatch();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean52 = node51.isVar();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node57 = node51.copyInformationFromForTree(node56);
        com.google.javascript.rhino.Node node58 = node51.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression60 = new com.google.javascript.rhino.JSTypeExpression(node58, "STRING  43");
        boolean boolean61 = jSTypeExpression60.isVarArgs();
        boolean boolean62 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression60);
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj68 = node66.getProp(43);
        boolean boolean69 = node66.isCall();
        int int70 = node66.getSourcePosition();
        java.lang.String str74 = node66.toString(false, true, false);
        boolean boolean75 = node66.isVarArgs();
        com.google.javascript.rhino.Node node79 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node83 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node79.addChildrenToFront(node83);
        node83.setQuotedString();
        boolean boolean86 = node83.isHook();
        boolean boolean87 = node66.isEquivalentTo(node83);
        boolean boolean88 = node83.isBlock();
        boolean boolean89 = jSTypeExpression60.equals((java.lang.Object) node83);
        com.google.javascript.rhino.Node node93 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj95 = node93.getProp(43);
        com.google.javascript.rhino.Node node96 = node83.useSourceInfoIfMissingFromForTree(node93);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression34 and jSTypeExpression60", jSTypeExpression34.equals(jSTypeExpression60) ? jSTypeExpression34.hashCode() == jSTypeExpression60.hashCode() : true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.jstype.JSType jSType5 = node3.getJSType();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder6 = node3.getJsDocBuilderForNode();
        boolean boolean7 = node3.isOr();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node11.addChildrenToFront(node15);
        com.google.javascript.rhino.Node node18 = node11.getChildAtIndex(0);
        boolean boolean19 = node11.isExprResult();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean24 = node23.isNull();
        boolean boolean25 = node23.isThis();
        boolean boolean26 = node11.hasChild(node23);
        com.google.javascript.rhino.Node node27 = node3.useSourceInfoIfMissingFromForTree(node11);
        boolean boolean28 = node3.isTry();
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node31 = node3.getChildBefore(node30);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj5 = node3.getProp(43);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int10 = node9.getSourceOffset();
        com.google.javascript.rhino.Node node11 = node3.useSourceInfoIfMissingFromForTree(node9);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        node15.setDirectives((java.util.Set<java.lang.String>) strSet18);
        com.google.javascript.rhino.Node node21 = node9.useSourceInfoIfMissingFromForTree(node15);
        boolean boolean22 = node15.isThrow();
        boolean boolean23 = node15.isNot();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean28 = node27.isVar();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node33 = node27.copyInformationFromForTree(node32);
        java.lang.String str34 = node15.checkTreeEquals(node33);
        boolean boolean35 = node15.isIf();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean40 = node39.isOptionalArg();
        com.google.javascript.rhino.Node node41 = node39.getNext();
        boolean boolean42 = node39.isThrow();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node15.removeChild(node39);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj5 = node3.getProp(43);
        boolean boolean6 = node3.isCall();
        int int7 = node3.getSourcePosition();
        java.lang.String str11 = node3.toString(false, true, false);
        boolean boolean12 = node3.isExprResult();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder13 = node3.getJsDocBuilderForNode();
        boolean boolean14 = node3.hasOneChild();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(12, (-1), (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node18);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean2 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean3 = jSDocInfoBuilder1.recordNoCompile();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj10 = node8.getProp(43);
        boolean boolean11 = node8.isCall();
        boolean boolean12 = node8.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression14 = new com.google.javascript.rhino.JSTypeExpression(node8, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder15 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray17 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray18 = (java.util.ArrayList<java.lang.String>[]) arrayListArray17;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder19 = strListBuilder15.add((java.util.ArrayList<java.lang.String>[]) arrayListArray17);
        boolean boolean20 = jSTypeExpression14.equals((java.lang.Object) arrayListArray17);
        boolean boolean21 = jSDocInfoBuilder1.recordParameter("", jSTypeExpression14);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder23 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean24 = jSDocInfoBuilder23.isInterfaceRecorded();
        boolean boolean26 = jSDocInfoBuilder23.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj32 = node30.getProp(43);
        boolean boolean33 = node30.isCall();
        boolean boolean34 = node30.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression36 = new com.google.javascript.rhino.JSTypeExpression(node30, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder37 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray39 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray40 = (java.util.ArrayList<java.lang.String>[]) arrayListArray39;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder41 = strListBuilder37.add((java.util.ArrayList<java.lang.String>[]) arrayListArray39);
        boolean boolean42 = jSTypeExpression36.equals((java.lang.Object) arrayListArray39);
        boolean boolean43 = jSDocInfoBuilder23.recordDefineType(jSTypeExpression36);
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition44 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int45 = namePosition44.getEndLine();
        int int46 = namePosition44.getStartLine();
        com.google.javascript.rhino.Node node47 = namePosition44.getItem();
        boolean boolean48 = jSTypeExpression36.equals((java.lang.Object) node47);
        boolean boolean49 = jSTypeExpression36.isOptionalArg();
        boolean boolean50 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression36);
        boolean boolean51 = jSDocInfoBuilder1.isJavaDispatch();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfoBuilder> jSDocInfoBuilderList52 = com.google.common.collect.ImmutableList.of(jSDocInfoBuilder1);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.rhino.JSDocInfo jSDocInfo54 = jSDocInfoBuilder1.build(node53);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder56 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean58 = jSDocInfoBuilder56.recordVersion("");
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile60 = null;
        jSDocInfoBuilder56.markName("hi!", staticSourceFile60, (int) (short) 0, (int) (short) 100);
        jSDocInfoBuilder56.markText("hi!", 0, 32, (int) (short) 10, (int) '#');
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder71 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean72 = jSDocInfoBuilder71.recordNoTypeCheck();
        jSDocInfoBuilder71.recordOriginalCommentString("");
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean79 = node78.isVar();
        com.google.javascript.rhino.Node node83 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node84 = node78.copyInformationFromForTree(node83);
        com.google.javascript.rhino.Node node85 = node78.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression87 = new com.google.javascript.rhino.JSTypeExpression(node85, "STRING  43");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression88 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression87);
        boolean boolean89 = jSDocInfoBuilder71.recordReturnType(jSTypeExpression87);
        boolean boolean90 = jSDocInfoBuilder56.recordType(jSTypeExpression87);
        boolean boolean91 = jSDocInfoBuilder1.recordThisType(jSTypeExpression87);
        boolean boolean92 = jSDocInfoBuilder1.recordOverride();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression14 and jSTypeExpression87", jSTypeExpression14.equals(jSTypeExpression87) ? jSTypeExpression14.hashCode() == jSTypeExpression87.hashCode() : true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = com.google.common.collect.ImmutableList.of("", "hi!", "", "", "hi!", "", "hi!", "");
        int int10 = strList8.indexOf((java.lang.Object) 'a');
        com.google.common.collect.ImmutableList<java.lang.String> strList19 = com.google.common.collect.ImmutableList.of("", "hi!", "", "", "hi!", "", "hi!", "");
        int int21 = strList19.indexOf((java.lang.Object) 'a');
        com.google.common.collect.ImmutableList<java.lang.String> strList30 = com.google.common.collect.ImmutableList.of("", "hi!", "", "", "hi!", "", "hi!", "");
        com.google.common.collect.ImmutableList<java.lang.String> strList39 = com.google.common.collect.ImmutableList.of("", "hi!", "", "", "hi!", "", "hi!", "");
        com.google.common.collect.ImmutableList<java.lang.Iterable<java.lang.String>> strIterableList40 = com.google.common.collect.ImmutableList.of((java.lang.Iterable<java.lang.String>) strList8, (java.lang.Iterable<java.lang.String>) strList19, (java.lang.Iterable<java.lang.String>) strList30, (java.lang.Iterable<java.lang.String>) strList39);
        com.google.common.collect.ImmutableList<java.lang.String> strList49 = com.google.common.collect.ImmutableList.of("", "hi!", "", "", "hi!", "", "hi!", "");
        int int51 = strList49.indexOf((java.lang.Object) 'a');
        java.util.Spliterator<java.lang.String> strSpliterator52 = strList49.spliterator();
        boolean boolean53 = strList19.equals((java.lang.Object) strList49);
        com.google.common.collect.ImmutableList<java.lang.String> strList62 = com.google.common.collect.ImmutableList.of("", "hi!", "", "", "hi!", "", "hi!", "");
        boolean boolean63 = strList19.containsAll((java.util.Collection<java.lang.String>) strList62);
        java.util.Iterator<java.lang.String> strItor64 = strList19.iterator();
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int69 = node68.getSourceOffset();
        double double70 = node68.getDouble();
        boolean boolean71 = node68.isInc();
        int int72 = strList19.indexOf((java.lang.Object) node68);
        boolean boolean73 = node68.isEmpty();
        node68.detachChildren();
        java.util.Set<java.lang.String> strSet75 = node68.getDirectives();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node77 = node68.getChildAtIndex(43);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean4 = node3.isAdd();
        boolean boolean5 = node3.isFalse();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node10.addChildrenToFront(node14);
        boolean boolean16 = node10.isGetterDef();
        boolean boolean17 = node10.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj23 = node21.getProp(43);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int28 = node27.getSourceOffset();
        com.google.javascript.rhino.Node node29 = node21.useSourceInfoIfMissingFromForTree(node27);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray35 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        node33.setDirectives((java.util.Set<java.lang.String>) strSet36);
        com.google.javascript.rhino.Node node39 = node27.useSourceInfoIfMissingFromForTree(node33);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(32, node10, node27);
        boolean boolean41 = node40.isExprResult();
        boolean boolean42 = node40.isFunction();
        java.lang.String str43 = node40.toString();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node47.addChildrenToFront(node51);
        node51.setQuotedString();
        boolean boolean54 = node51.isHook();
        int int55 = node51.getType();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj61 = node59.getProp(43);
        int int62 = node59.getType();
        boolean boolean63 = node59.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node64 = node51.useSourceInfoIfMissingFromForTree(node59);
        boolean boolean65 = node40.hasChild(node64);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression67 = new com.google.javascript.rhino.JSTypeExpression(node40, "Node tree inequality:\nTree1:\nNUMBER 0.0 43 [directives: []]\n\n\nTree2:\nSTRING \n\n\nSubtree1: NUMBER 0.0 43 [directives: []]\n\n\nSubtree2: STRING \n");
        node40.setLineno((int) ' ');
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj75 = node73.getProp(43);
        boolean boolean76 = node73.isCall();
        int int77 = node73.getSourcePosition();
        java.lang.String str81 = node73.toString(false, true, false);
        com.google.javascript.rhino.Node node85 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int86 = node85.getSourceOffset();
        com.google.javascript.rhino.jstype.JSType jSType87 = node85.getJSType();
        boolean boolean88 = node85.isDelProp();
        boolean boolean89 = node73.isEquivalentTo(node85);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable90 = node85.siblings();
        int int91 = node85.getCharno();
        boolean boolean92 = node40.isEquivalentToTyped(node85);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node85);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("TYPEOF");
        node1.setType(0);
        boolean boolean4 = node1.isFalse();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean9 = node8.isVar();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node14 = node8.copyInformationFromForTree(node13);
        com.google.javascript.rhino.Node node15 = node8.cloneTree();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj21 = node19.getProp(43);
        boolean boolean22 = node19.isCall();
        boolean boolean23 = node19.isGetterDef();
        java.lang.String str24 = node8.checkTreeEquals(node19);
        node8.setSourceEncodedPositionForTree(1);
        com.google.javascript.rhino.Node node27 = node8.getLastSibling();
        node8.setQuotedString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node8);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean3 = jSDocInfoBuilder1.recordVersion("");
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile5 = null;
        jSDocInfoBuilder1.markName("hi!", staticSourceFile5, (int) (short) 0, (int) (short) 100);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = null;
        boolean boolean10 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression9);
        boolean boolean11 = jSDocInfoBuilder1.recordConstructor();
        boolean boolean12 = jSDocInfoBuilder1.recordNoTypeCheck();
        boolean boolean13 = jSDocInfoBuilder1.isConstructorRecorded();
        boolean boolean14 = jSDocInfoBuilder1.isDescriptionRecorded();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj21 = node19.getProp(43);
        boolean boolean22 = node19.isCall();
        boolean boolean23 = node19.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression25 = new com.google.javascript.rhino.JSTypeExpression(node19, "STRING ");
        boolean boolean26 = jSDocInfoBuilder1.recordParameter("Node tree inequality:\nTree1:\nSTRING  43\n\n\nTree2:\nNUMBER 0.0 43\n\n\nSubtree1: STRING  43\n\n\nSubtree2: NUMBER 0.0 43\n", jSTypeExpression25);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder28 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean30 = jSDocInfoBuilder28.recordVersion("");
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile32 = null;
        jSDocInfoBuilder28.markName("hi!", staticSourceFile32, (int) (short) 0, (int) (short) 100);
        boolean boolean36 = jSDocInfoBuilder28.recordNoTypeCheck();
        boolean boolean37 = jSDocInfoBuilder28.recordExpose();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node41.addChildrenToFront(node45);
        com.google.javascript.rhino.JSDocInfo jSDocInfo47 = jSDocInfoBuilder28.build(node45);
        boolean boolean48 = jSDocInfoBuilder28.shouldParseDocumentation();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean53 = node52.isVar();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node58 = node52.copyInformationFromForTree(node57);
        com.google.javascript.rhino.Node node59 = node52.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression61 = new com.google.javascript.rhino.JSTypeExpression(node59, "STRING  43");
        boolean boolean62 = jSTypeExpression61.isVarArgs();
        boolean boolean63 = jSDocInfoBuilder28.recordBaseType(jSTypeExpression61);
        boolean boolean64 = jSDocInfoBuilder1.recordDefineType(jSTypeExpression61);
        boolean boolean65 = jSDocInfoBuilder1.recordDeprecated();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression25 and jSTypeExpression61", jSTypeExpression25.equals(jSTypeExpression61) ? jSTypeExpression25.hashCode() == jSTypeExpression61.hashCode() : true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean2 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean3 = jSDocInfoBuilder1.isConstructorRecorded();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder5 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean6 = jSDocInfoBuilder5.isInterfaceRecorded();
        boolean boolean8 = jSDocInfoBuilder5.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj14 = node12.getProp(43);
        boolean boolean15 = node12.isCall();
        boolean boolean16 = node12.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression18 = new com.google.javascript.rhino.JSTypeExpression(node12, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder19 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray21 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray22 = (java.util.ArrayList<java.lang.String>[]) arrayListArray21;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder23 = strListBuilder19.add((java.util.ArrayList<java.lang.String>[]) arrayListArray21);
        boolean boolean24 = jSTypeExpression18.equals((java.lang.Object) arrayListArray21);
        boolean boolean25 = jSDocInfoBuilder5.recordDefineType(jSTypeExpression18);
        com.google.javascript.rhino.Node node26 = jSTypeExpression18.getRoot();
        boolean boolean28 = jSDocInfoBuilder1.recordThrowDescription(jSTypeExpression18, "Node tree inequality:\nTree1:\nSTRING  43\n\n\nTree2:\nTYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n\n\nSubtree1: STRING  43\n\n\nSubtree2: TYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder30 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean31 = jSDocInfoBuilder30.isInterfaceRecorded();
        boolean boolean33 = jSDocInfoBuilder30.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj39 = node37.getProp(43);
        boolean boolean40 = node37.isCall();
        boolean boolean41 = node37.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression43 = new com.google.javascript.rhino.JSTypeExpression(node37, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder44 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray46 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray47 = (java.util.ArrayList<java.lang.String>[]) arrayListArray46;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder48 = strListBuilder44.add((java.util.ArrayList<java.lang.String>[]) arrayListArray46);
        boolean boolean49 = jSTypeExpression43.equals((java.lang.Object) arrayListArray46);
        boolean boolean50 = jSDocInfoBuilder30.recordDefineType(jSTypeExpression43);
        boolean boolean51 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression43);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder53 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean54 = jSDocInfoBuilder53.recordNoTypeCheck();
        boolean boolean55 = jSDocInfoBuilder53.isInterfaceRecorded();
        jSDocInfoBuilder53.markAnnotation("[, hi!, , , hi!, , hi!, ]", (int) (short) 0, 2);
        boolean boolean60 = jSDocInfoBuilder53.recordIdGenerator();
        boolean boolean61 = jSDocInfoBuilder53.recordInterface();
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean66 = node65.isVar();
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node71 = node65.copyInformationFromForTree(node70);
        com.google.javascript.rhino.Node node72 = node65.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression74 = new com.google.javascript.rhino.JSTypeExpression(node72, "STRING  43");
        boolean boolean75 = jSTypeExpression74.isVarArgs();
        boolean boolean76 = jSDocInfoBuilder53.recordDefineType(jSTypeExpression74);
        boolean boolean77 = jSDocInfoBuilder1.recordBaseType(jSTypeExpression74);
        boolean boolean78 = jSDocInfoBuilder1.recordPreserveTry();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression18 and jSTypeExpression74", jSTypeExpression18.equals(jSTypeExpression74) ? jSTypeExpression18.hashCode() == jSTypeExpression74.hashCode() : true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 46);
        boolean boolean2 = node1.isRegExp();
        boolean boolean3 = node1.isDec();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder5 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean6 = jSDocInfoBuilder5.recordNoTypeCheck();
        boolean boolean7 = jSDocInfoBuilder5.isInterfaceRecorded();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj13 = node11.getProp(43);
        int int14 = node11.getType();
        boolean boolean15 = node11.isGetterDef();
        node11.setSourceEncodedPositionForTree(54);
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = jSDocInfoBuilder5.build(node11);
        boolean boolean19 = jSDocInfo18.isNoSideEffects();
        boolean boolean20 = jSDocInfo18.hasTypedefType();
        boolean boolean21 = jSDocInfo18.isConsistentIdGenerator();
        boolean boolean22 = jSDocInfo18.containsDeclaration();
        boolean boolean23 = jSDocInfo18.containsDeclaration();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility24 = jSDocInfo18.getVisibility();
        boolean boolean25 = jSDocInfo18.isNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression26 = jSDocInfo18.getThisType();
        com.google.javascript.rhino.Node node27 = jSDocInfo18.getAssociatedNode();
        int int28 = node27.getSourceOffset();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj34 = node32.getProp(43);
        int int35 = node32.getType();
        boolean boolean36 = node32.isGetterDef();
        node32.setSourceEncodedPositionForTree(54);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean43 = node42.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray49 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet50 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet50, strArray49);
        node47.setDirectives((java.util.Set<java.lang.String>) strSet50);
        java.lang.Object obj54 = node47.getProp((int) (byte) 1);
        com.google.javascript.rhino.Node node55 = node42.copyInformationFrom(node47);
        boolean boolean56 = node32.isEquivalentToTyped(node42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.replaceChild(node27, node42);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean5 = node4.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        node9.setDirectives((java.util.Set<java.lang.String>) strSet12);
        java.lang.Object obj16 = node9.getProp((int) (byte) 1);
        com.google.javascript.rhino.Node node17 = node4.copyInformationFrom(node9);
        boolean boolean18 = node9.isDefaultCase();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj24 = node22.getProp(43);
        int int25 = node22.getType();
        boolean boolean26 = node22.isGetterDef();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) 12);
        com.google.javascript.rhino.Node node29 = node28.removeChildren();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable30 = node28.getAncestors();
        com.google.javascript.rhino.Node node31 = node22.srcref(node28);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean36 = node35.isVar();
        node35.putBooleanProp(30, false);
        boolean boolean40 = node35.isSwitch();
        boolean boolean41 = node35.isUnscopedQualifiedName();
        boolean boolean42 = node35.hasChildren();
        boolean boolean43 = node35.isDefaultCase();
        int int45 = node35.getIntProp((int) '#');
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable46 = node35.children();
        boolean boolean47 = node35.isIn();
        node35.setSourceEncodedPositionForTree((int) (byte) -1);
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node((int) (short) 0, node9, node22, node35);
        boolean boolean51 = node35.wasEmptyNode();
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj57 = node55.getProp(43);
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int62 = node61.getSourceOffset();
        com.google.javascript.rhino.Node node63 = node55.useSourceInfoIfMissingFromForTree(node61);
        int int64 = node55.getSourceOffset();
        com.google.javascript.rhino.JSDocInfo jSDocInfo65 = node55.getJSDocInfo();
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean70 = node69.isVar();
        node69.putBooleanProp(30, false);
        boolean boolean74 = node69.isSwitch();
        boolean boolean75 = node69.isUnscopedQualifiedName();
        boolean boolean76 = node69.hasChildren();
        node69.setCharno(52);
        com.google.javascript.rhino.Node node79 = node55.clonePropsFrom(node69);
        node79.putIntProp(42, 46);
        node79.setVarArgs(false);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable85 = node79.siblings();
        boolean boolean86 = node79.isAssignAdd();
        boolean boolean87 = node79.isNot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node88 = node35.getChildBefore(node79);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int4 = node3.getSourceOffset();
        double double5 = node3.getDouble();
        boolean boolean6 = node3.isFalse();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean11 = node10.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node12 = node10.cloneNode();
        boolean boolean13 = node12.isGetElem();
        node12.addSuppression("");
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int20 = node19.getSourceOffset();
        boolean boolean21 = node19.isBreak();
        int int22 = node19.getSourcePosition();
        com.google.javascript.rhino.Node node23 = node12.useSourceInfoFrom(node19);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) 18, 54, 47);
        com.google.javascript.rhino.Node node28 = node12.useSourceInfoFrom(node27);
        com.google.javascript.rhino.Node node29 = node3.useSourceInfoIfMissingFrom(node27);
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition31 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean32 = typePosition31.hasBrackets();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean37 = node36.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray43 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet44 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet44, strArray43);
        node41.setDirectives((java.util.Set<java.lang.String>) strSet44);
        java.lang.Object obj48 = node41.getProp((int) (byte) 1);
        com.google.javascript.rhino.Node node49 = node36.copyInformationFrom(node41);
        typePosition31.setItem(node49);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj56 = node54.getProp(43);
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int61 = node60.getSourceOffset();
        com.google.javascript.rhino.Node node62 = node54.useSourceInfoIfMissingFromForTree(node60);
        boolean boolean63 = node62.isAssignAdd();
        boolean boolean64 = node62.isFromExterns();
        com.google.javascript.rhino.Node node65 = node49.copyInformationFromForTree(node62);
        node49.setCharno((int) (byte) -1);
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node(39, node49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node29.removeChild(node49);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean1 = typePosition0.hasBrackets();
        int int2 = typePosition0.getEndLine();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int7 = node6.getSourceOffset();
        com.google.javascript.rhino.jstype.JSType jSType8 = node6.getJSType();
        boolean boolean9 = node6.isWith();
        typePosition0.setItem(node6);
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.TypePosition> typePositionList11 = com.google.common.collect.ImmutableList.of(typePosition0);
        com.google.javascript.rhino.Node node12 = typePosition0.getItem();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node14 = node12.getChildAtIndex(11);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean2 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean3 = jSDocInfoBuilder1.isConstructorRecorded();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder5 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean6 = jSDocInfoBuilder5.isInterfaceRecorded();
        boolean boolean8 = jSDocInfoBuilder5.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj14 = node12.getProp(43);
        boolean boolean15 = node12.isCall();
        boolean boolean16 = node12.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression18 = new com.google.javascript.rhino.JSTypeExpression(node12, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder19 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray21 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray22 = (java.util.ArrayList<java.lang.String>[]) arrayListArray21;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder23 = strListBuilder19.add((java.util.ArrayList<java.lang.String>[]) arrayListArray21);
        boolean boolean24 = jSTypeExpression18.equals((java.lang.Object) arrayListArray21);
        boolean boolean25 = jSDocInfoBuilder5.recordDefineType(jSTypeExpression18);
        com.google.javascript.rhino.Node node26 = jSTypeExpression18.getRoot();
        boolean boolean28 = jSDocInfoBuilder1.recordThrowDescription(jSTypeExpression18, "Node tree inequality:\nTree1:\nSTRING  43\n\n\nTree2:\nTYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n\n\nSubtree1: STRING  43\n\n\nSubtree2: TYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder30 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean31 = jSDocInfoBuilder30.isInterfaceRecorded();
        boolean boolean33 = jSDocInfoBuilder30.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj39 = node37.getProp(43);
        boolean boolean40 = node37.isCall();
        boolean boolean41 = node37.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression43 = new com.google.javascript.rhino.JSTypeExpression(node37, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder44 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray46 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray47 = (java.util.ArrayList<java.lang.String>[]) arrayListArray46;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder48 = strListBuilder44.add((java.util.ArrayList<java.lang.String>[]) arrayListArray46);
        boolean boolean49 = jSTypeExpression43.equals((java.lang.Object) arrayListArray46);
        boolean boolean50 = jSDocInfoBuilder30.recordDefineType(jSTypeExpression43);
        boolean boolean51 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression43);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder53 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean54 = jSDocInfoBuilder53.recordNoTypeCheck();
        boolean boolean55 = jSDocInfoBuilder53.isInterfaceRecorded();
        jSDocInfoBuilder53.markAnnotation("[, hi!, , , hi!, , hi!, ]", (int) (short) 0, 2);
        boolean boolean60 = jSDocInfoBuilder53.recordIdGenerator();
        boolean boolean61 = jSDocInfoBuilder53.recordInterface();
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean66 = node65.isVar();
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node71 = node65.copyInformationFromForTree(node70);
        com.google.javascript.rhino.Node node72 = node65.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression74 = new com.google.javascript.rhino.JSTypeExpression(node72, "STRING  43");
        boolean boolean75 = jSTypeExpression74.isVarArgs();
        boolean boolean76 = jSDocInfoBuilder53.recordDefineType(jSTypeExpression74);
        boolean boolean77 = jSDocInfoBuilder1.recordBaseType(jSTypeExpression74);
        boolean boolean79 = jSDocInfoBuilder1.recordFileOverview("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression18 and jSTypeExpression74", jSTypeExpression18.equals(jSTypeExpression74) ? jSTypeExpression18.hashCode() == jSTypeExpression74.hashCode() : true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean2 = jSDocInfoBuilder1.recordJavaDispatch();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = null;
        boolean boolean5 = jSDocInfoBuilder1.recordParameter("hi!", jSTypeExpression4);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder7 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean8 = jSDocInfoBuilder7.isInterfaceRecorded();
        boolean boolean9 = jSDocInfoBuilder7.isConstructorRecorded();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder11 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean12 = jSDocInfoBuilder11.isInterfaceRecorded();
        boolean boolean14 = jSDocInfoBuilder11.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj20 = node18.getProp(43);
        boolean boolean21 = node18.isCall();
        boolean boolean22 = node18.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression24 = new com.google.javascript.rhino.JSTypeExpression(node18, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder25 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray27 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray28 = (java.util.ArrayList<java.lang.String>[]) arrayListArray27;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder29 = strListBuilder25.add((java.util.ArrayList<java.lang.String>[]) arrayListArray27);
        boolean boolean30 = jSTypeExpression24.equals((java.lang.Object) arrayListArray27);
        boolean boolean31 = jSDocInfoBuilder11.recordDefineType(jSTypeExpression24);
        com.google.javascript.rhino.Node node32 = jSTypeExpression24.getRoot();
        boolean boolean34 = jSDocInfoBuilder7.recordThrowDescription(jSTypeExpression24, "Node tree inequality:\nTree1:\nSTRING  43\n\n\nTree2:\nTYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n\n\nSubtree1: STRING  43\n\n\nSubtree2: TYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder36 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean37 = jSDocInfoBuilder36.isInterfaceRecorded();
        boolean boolean39 = jSDocInfoBuilder36.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj45 = node43.getProp(43);
        boolean boolean46 = node43.isCall();
        boolean boolean47 = node43.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression49 = new com.google.javascript.rhino.JSTypeExpression(node43, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder50 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray52 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray53 = (java.util.ArrayList<java.lang.String>[]) arrayListArray52;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder54 = strListBuilder50.add((java.util.ArrayList<java.lang.String>[]) arrayListArray52);
        boolean boolean55 = jSTypeExpression49.equals((java.lang.Object) arrayListArray52);
        boolean boolean56 = jSDocInfoBuilder36.recordDefineType(jSTypeExpression49);
        boolean boolean57 = jSDocInfoBuilder7.recordEnumParameterType(jSTypeExpression49);
        boolean boolean58 = jSTypeExpression49.isOptionalArg();
        boolean boolean59 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression49);
        boolean boolean61 = jSDocInfoBuilder1.recordDescription("Node tree inequality:\nTree1:\nSTRING  43\n\n\nTree2:\nNUMBER 0.0 43\n\n\nSubtree1: STRING  43\n\n\nSubtree2: NUMBER 0.0 43\n");
        boolean boolean62 = jSDocInfoBuilder1.recordNoCompile();
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean67 = node66.isVar();
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node72 = node66.copyInformationFromForTree(node71);
        com.google.javascript.rhino.Node node73 = node66.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression75 = new com.google.javascript.rhino.JSTypeExpression(node73, "STRING  43");
        boolean boolean76 = jSTypeExpression75.isVarArgs();
        boolean boolean77 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression75);
        jSDocInfoBuilder1.markText("Node tree inequality:\nTree1:\nSTRING  43\n\n\nTree2:\nNUMBER 0.0 43\n\n\nSubtree1: STRING  43\n\n\nSubtree2: NUMBER 0.0 43\n", 48, (int) (short) 100, 44, 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression24 and jSTypeExpression75", jSTypeExpression24.equals(jSTypeExpression75) ? jSTypeExpression24.hashCode() == jSTypeExpression75.hashCode() : true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean4 = node3.isNull();
        boolean boolean5 = node3.isFromExterns();
        boolean boolean6 = node3.isFunction();
        com.google.javascript.rhino.Node node7 = node3.cloneTree();
        boolean boolean8 = node3.isLocalResultCall();
        boolean boolean9 = node3.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int14 = node13.getSourceOffset();
        boolean boolean15 = node13.isFor();
        boolean boolean16 = node13.isSwitch();
        int int17 = node13.getSourcePosition();
        com.google.javascript.rhino.Node node18 = node13.removeFirstChild();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString((int) (short) 100, "Node tree inequality:\nTree1:\nSTRING  43\n\n\nTree2:\nNUMBER 0.0 43\n\n\nSubtree1: STRING  43\n\n\nSubtree2: NUMBER 0.0 43\n", 52, 24);
        boolean boolean24 = node23.isTypeOf();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.replaceChild(node13, node23);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean2 = jSDocInfoBuilder1.recordJavaDispatch();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordBaseType(jSTypeExpression3);
        boolean boolean6 = jSDocInfoBuilder1.recordVersion("NUMBER 0.0 43");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder8 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean9 = jSDocInfoBuilder8.isInterfaceRecorded();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = null;
        boolean boolean12 = jSDocInfoBuilder8.recordParameter("", jSTypeExpression11);
        boolean boolean13 = jSDocInfoBuilder8.recordExterns();
        boolean boolean14 = jSDocInfoBuilder8.recordPreserveTry();
        boolean boolean15 = jSDocInfoBuilder8.recordNoCompile();
        boolean boolean17 = jSDocInfoBuilder8.recordLends("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression18 = null;
        boolean boolean19 = jSDocInfoBuilder8.recordType(jSTypeExpression18);
        boolean boolean20 = jSDocInfoBuilder8.recordOverride();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder22 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean23 = jSDocInfoBuilder22.isInterfaceRecorded();
        boolean boolean25 = jSDocInfoBuilder22.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj31 = node29.getProp(43);
        boolean boolean32 = node29.isCall();
        boolean boolean33 = node29.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression35 = new com.google.javascript.rhino.JSTypeExpression(node29, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder36 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray38 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray39 = (java.util.ArrayList<java.lang.String>[]) arrayListArray38;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder40 = strListBuilder36.add((java.util.ArrayList<java.lang.String>[]) arrayListArray38);
        boolean boolean41 = jSTypeExpression35.equals((java.lang.Object) arrayListArray38);
        boolean boolean42 = jSDocInfoBuilder22.recordDefineType(jSTypeExpression35);
        boolean boolean43 = jSDocInfoBuilder8.recordBaseType(jSTypeExpression35);
        boolean boolean44 = jSDocInfoBuilder1.recordThrowType(jSTypeExpression35);
        boolean boolean45 = jSDocInfoBuilder1.recordInterface();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder47 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean48 = jSDocInfoBuilder47.recordNoTypeCheck();
        jSDocInfoBuilder47.recordOriginalCommentString("");
        boolean boolean51 = jSDocInfoBuilder47.recordNoTypeCheck();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean57 = node56.isVar();
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node62 = node56.copyInformationFromForTree(node61);
        com.google.javascript.rhino.Node node63 = node56.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression65 = new com.google.javascript.rhino.JSTypeExpression(node63, "STRING  43");
        boolean boolean66 = jSDocInfoBuilder47.recordParameter("Node tree inequality:\nTree1:\nSTRING  43\n\n\nTree2:\nTYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n\n\nSubtree1: STRING  43\n\n\nSubtree2: TYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n", jSTypeExpression65);
        boolean boolean67 = jSDocInfoBuilder1.recordType(jSTypeExpression65);
        jSDocInfoBuilder1.markText("NUMBER 12.0\n", 50, 30, 43, 221199);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression35 and jSTypeExpression65", jSTypeExpression35.equals(jSTypeExpression65) ? jSTypeExpression35.hashCode() == jSTypeExpression65.hashCode() : true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj5 = node3.getProp(43);
        int int6 = node3.getType();
        boolean boolean7 = node3.isGetterDef();
        node3.setSourceEncodedPositionForTree(54);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean14 = node13.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        node18.setDirectives((java.util.Set<java.lang.String>) strSet21);
        java.lang.Object obj25 = node18.getProp((int) (byte) 1);
        com.google.javascript.rhino.Node node26 = node13.copyInformationFrom(node18);
        boolean boolean27 = node3.isEquivalentToTyped(node13);
        com.google.javascript.rhino.Node node28 = node3.removeFirstChild();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean33 = node32.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node34 = node32.cloneNode();
        boolean boolean35 = node34.isGetElem();
        node34.addSuppression("");
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int42 = node41.getSourceOffset();
        boolean boolean43 = node41.isBreak();
        int int44 = node41.getSourcePosition();
        com.google.javascript.rhino.Node node45 = node34.useSourceInfoFrom(node41);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        boolean boolean50 = node49.isNull();
        boolean boolean51 = node49.isLabelName();
        com.google.javascript.rhino.Node node52 = node41.useSourceInfoFrom(node49);
        boolean boolean53 = node52.isExprResult();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean58 = node57.isVar();
        node57.putBooleanProp(30, false);
        boolean boolean62 = node57.isSwitch();
        boolean boolean63 = node57.isIn();
        boolean boolean64 = node57.isFromExterns();
        java.lang.Object obj66 = node57.getProp((int) (byte) 10);
        int int68 = node57.getIntProp(30);
        boolean boolean69 = node57.isCase();
        boolean boolean70 = node57.isNull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.replaceChild(node52, node57);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj5 = node3.getProp(43);
        int int6 = node3.getType();
        boolean boolean7 = node3.isName();
        com.google.javascript.rhino.Node[] nodeArray11 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(42, nodeArray11, (int) (byte) 1, 43);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((int) (short) 1, nodeArray11);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(16, nodeArray11);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int22 = node21.getSourceOffset();
        com.google.javascript.rhino.jstype.JSType jSType23 = node21.getJSType();
        boolean boolean24 = node21.isWith();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node29.addChildrenToFront(node33);
        boolean boolean35 = node29.isGetterDef();
        boolean boolean36 = node29.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj42 = node40.getProp(43);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int47 = node46.getSourceOffset();
        com.google.javascript.rhino.Node node48 = node40.useSourceInfoIfMissingFromForTree(node46);
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray54 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet55 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet55, strArray54);
        node52.setDirectives((java.util.Set<java.lang.String>) strSet55);
        com.google.javascript.rhino.Node node58 = node46.useSourceInfoIfMissingFromForTree(node52);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(32, node29, node46);
        boolean boolean60 = node59.isExprResult();
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node((int) (byte) 0, node21, node59);
        com.google.javascript.rhino.Node node62 = node16.copyInformationFromForTree(node59);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node16);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean3 = jSDocInfoBuilder1.recordVersion("");
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile5 = null;
        jSDocInfoBuilder1.markName("hi!", staticSourceFile5, (int) (short) 0, (int) (short) 100);
        boolean boolean9 = jSDocInfoBuilder1.recordNoTypeCheck();
        boolean boolean10 = jSDocInfoBuilder1.recordExpose();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node14.addChildrenToFront(node18);
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = jSDocInfoBuilder1.build(node18);
        boolean boolean21 = jSDocInfoBuilder1.shouldParseDocumentation();
        boolean boolean23 = jSDocInfoBuilder1.recordDeprecationReason("Node tree inequality:\nTree1:\nNUMBER 0.0 43 [directives: []]\n\n\nTree2:\nSTRING \n\n\nSubtree1: NUMBER 0.0 43 [directives: []]\n\n\nSubtree2: STRING \n");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder25 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean27 = jSDocInfoBuilder25.recordVersion("");
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile29 = null;
        jSDocInfoBuilder25.markName("hi!", staticSourceFile29, (int) (short) 0, (int) (short) 100);
        boolean boolean33 = jSDocInfoBuilder25.recordNoTypeCheck();
        boolean boolean34 = jSDocInfoBuilder25.recordExpose();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node38.addChildrenToFront(node42);
        com.google.javascript.rhino.JSDocInfo jSDocInfo44 = jSDocInfoBuilder25.build(node42);
        boolean boolean45 = jSDocInfoBuilder25.shouldParseDocumentation();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean50 = node49.isVar();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node55 = node49.copyInformationFromForTree(node54);
        com.google.javascript.rhino.Node node56 = node49.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression58 = new com.google.javascript.rhino.JSTypeExpression(node56, "STRING  43");
        boolean boolean59 = jSTypeExpression58.isVarArgs();
        boolean boolean60 = jSDocInfoBuilder25.recordBaseType(jSTypeExpression58);
        boolean boolean61 = jSTypeExpression58.isOptionalArg();
        boolean boolean62 = jSDocInfoBuilder1.recordBaseType(jSTypeExpression58);
        boolean boolean64 = jSDocInfoBuilder1.recordVersion("NUMBER 0.0 43 [directives: []]\n");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder66 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean67 = jSDocInfoBuilder66.recordJavaDispatch();
        boolean boolean68 = jSDocInfoBuilder66.recordNoCompile();
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj75 = node73.getProp(43);
        boolean boolean76 = node73.isCall();
        boolean boolean77 = node73.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression79 = new com.google.javascript.rhino.JSTypeExpression(node73, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder80 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray82 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray83 = (java.util.ArrayList<java.lang.String>[]) arrayListArray82;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder84 = strListBuilder80.add((java.util.ArrayList<java.lang.String>[]) arrayListArray82);
        boolean boolean85 = jSTypeExpression79.equals((java.lang.Object) arrayListArray82);
        boolean boolean86 = jSDocInfoBuilder66.recordParameter("", jSTypeExpression79);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression87 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression79);
        boolean boolean88 = jSDocInfoBuilder1.recordExtendedInterface(jSTypeExpression79);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile90 = null;
        jSDocInfoBuilder1.markName("Node tree inequality:\nTree1:\nSTRING \n\n\nTree2:\nNUMBER 0.0 43 [directives: []]\n\n\nSubtree1: STRING \n\n\nSubtree2: NUMBER 0.0 43 [directives: []]\n", staticSourceFile90, 1, 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression58 and jSTypeExpression79", jSTypeExpression58.equals(jSTypeExpression79) ? jSTypeExpression58.hashCode() == jSTypeExpression79.hashCode() : true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj5 = node3.getProp(43);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int10 = node9.getSourceOffset();
        com.google.javascript.rhino.Node node11 = node3.useSourceInfoIfMissingFromForTree(node9);
        com.google.javascript.rhino.Node node12 = node9.cloneNode();
        boolean boolean13 = node12.isName();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean18 = node17.isOptionalArg();
        boolean boolean19 = node17.isSwitch();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node24.addChildrenToFront(node28);
        boolean boolean30 = node24.isGetterDef();
        boolean boolean31 = node24.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj37 = node35.getProp(43);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int42 = node41.getSourceOffset();
        com.google.javascript.rhino.Node node43 = node35.useSourceInfoIfMissingFromForTree(node41);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray49 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet50 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet50, strArray49);
        node47.setDirectives((java.util.Set<java.lang.String>) strSet50);
        com.google.javascript.rhino.Node node53 = node41.useSourceInfoIfMissingFromForTree(node47);
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node(32, node24, node41);
        boolean boolean55 = node54.isExprResult();
        boolean boolean56 = node54.isFunction();
        com.google.javascript.rhino.Node node57 = node17.srcrefTree(node54);
        java.lang.Object obj59 = node17.getProp((int) (byte) -1);
        com.google.javascript.rhino.Node node60 = node12.useSourceInfoIfMissingFrom(node17);
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition61 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean62 = typePosition61.hasBrackets();
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean67 = node66.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray73 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet74 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet74, strArray73);
        node71.setDirectives((java.util.Set<java.lang.String>) strSet74);
        java.lang.Object obj78 = node71.getProp((int) (byte) 1);
        com.google.javascript.rhino.Node node79 = node66.copyInformationFrom(node71);
        typePosition61.setItem(node79);
        com.google.javascript.rhino.Node node84 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj86 = node84.getProp(43);
        com.google.javascript.rhino.Node node90 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int91 = node90.getSourceOffset();
        com.google.javascript.rhino.Node node92 = node84.useSourceInfoIfMissingFromForTree(node90);
        boolean boolean93 = node92.isAssignAdd();
        boolean boolean94 = node92.isFromExterns();
        com.google.javascript.rhino.Node node95 = node79.copyInformationFromForTree(node92);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile96 = node92.getStaticSourceFile();
        boolean boolean97 = node92.hasOneChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node12.removeChild(node92);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj5 = node3.getProp(43);
        boolean boolean6 = node3.isCall();
        int int7 = node3.getSourcePosition();
        java.lang.String str11 = node3.toString(false, true, false);
        boolean boolean12 = node3.isExprResult();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder13 = node3.getJsDocBuilderForNode();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition14 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition15 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition16 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition17 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition18 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition19 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean20 = typePosition19.hasBrackets();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.TypePosition> typePositionList21 = com.google.common.collect.ImmutableList.of(typePosition14, typePosition15, typePosition16, typePosition17, typePosition18, typePosition19);
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition22 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean23 = typePosition22.hasBrackets();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean28 = node27.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray34 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        node32.setDirectives((java.util.Set<java.lang.String>) strSet35);
        java.lang.Object obj39 = node32.getProp((int) (byte) 1);
        com.google.javascript.rhino.Node node40 = node27.copyInformationFrom(node32);
        typePosition22.setItem(node40);
        int int42 = typePosition22.getStartLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition43 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition44 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition45 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition46 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition47 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition48 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean49 = typePosition48.hasBrackets();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.TypePosition> typePositionList50 = com.google.common.collect.ImmutableList.of(typePosition43, typePosition44, typePosition45, typePosition46, typePosition47, typePosition48);
        int int51 = typePosition45.getEndLine();
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        boolean boolean56 = node55.isNull();
        boolean boolean57 = node55.isSyntheticBlock();
        boolean boolean58 = node55.hasMoreThanOneChild();
        typePosition45.setItem(node55);
        boolean boolean60 = typePosition45.hasBrackets();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>> nodeSourcePositionList61 = com.google.common.collect.ImmutableList.of((com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>) typePosition18, (com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>) typePosition22, (com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>) typePosition45);
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj67 = node65.getProp(43);
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int72 = node71.getSourceOffset();
        com.google.javascript.rhino.Node node73 = node65.useSourceInfoIfMissingFromForTree(node71);
        com.google.javascript.rhino.Node node74 = node65.removeFirstChild();
        boolean boolean75 = node65.isFor();
        boolean boolean76 = node65.isNumber();
        typePosition45.setItem(node65);
        com.google.javascript.rhino.Node node81 = com.google.javascript.rhino.Node.newNumber((double) 18, 54, 47);
        java.lang.String str85 = node81.toString(false, true, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.replaceChild(node65, node81);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean4 = node3.isVar();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node9 = node3.copyInformationFromForTree(node8);
        boolean boolean10 = node9.isVarArgs();
        int int11 = node9.getSideEffectFlags();
        com.google.javascript.rhino.Node node12 = node9.getLastChild();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj18 = node16.getProp(43);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int23 = node22.getSourceOffset();
        com.google.javascript.rhino.Node node24 = node16.useSourceInfoIfMissingFromForTree(node22);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        node28.setDirectives((java.util.Set<java.lang.String>) strSet31);
        com.google.javascript.rhino.Node node34 = node22.useSourceInfoIfMissingFromForTree(node28);
        boolean boolean35 = node28.isThrow();
        boolean boolean36 = node28.isNot();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean41 = node40.isVar();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node46 = node40.copyInformationFromForTree(node45);
        java.lang.String str47 = node28.checkTreeEquals(node46);
        boolean boolean49 = node46.getBooleanProp(43);
        boolean boolean50 = node46.isIn();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj56 = node54.getProp(43);
        int int57 = node54.getType();
        boolean boolean58 = node54.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node59 = node46.clonePropsFrom(node54);
        com.google.javascript.rhino.InputId inputId60 = node59.getInputId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node61 = node9.getChildBefore(node59);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean2 = jSDocInfoBuilder1.recordNoTypeCheck();
        boolean boolean4 = jSDocInfoBuilder1.addAuthor("");
        boolean boolean5 = jSDocInfoBuilder1.recordExport();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder7 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean8 = jSDocInfoBuilder7.isInterfaceRecorded();
        boolean boolean9 = jSDocInfoBuilder7.isConstructorRecorded();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder11 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean12 = jSDocInfoBuilder11.isInterfaceRecorded();
        boolean boolean14 = jSDocInfoBuilder11.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj20 = node18.getProp(43);
        boolean boolean21 = node18.isCall();
        boolean boolean22 = node18.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression24 = new com.google.javascript.rhino.JSTypeExpression(node18, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder25 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray27 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray28 = (java.util.ArrayList<java.lang.String>[]) arrayListArray27;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder29 = strListBuilder25.add((java.util.ArrayList<java.lang.String>[]) arrayListArray27);
        boolean boolean30 = jSTypeExpression24.equals((java.lang.Object) arrayListArray27);
        boolean boolean31 = jSDocInfoBuilder11.recordDefineType(jSTypeExpression24);
        com.google.javascript.rhino.Node node32 = jSTypeExpression24.getRoot();
        boolean boolean34 = jSDocInfoBuilder7.recordThrowDescription(jSTypeExpression24, "Node tree inequality:\nTree1:\nSTRING  43\n\n\nTree2:\nTYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n\n\nSubtree1: STRING  43\n\n\nSubtree2: TYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder36 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean37 = jSDocInfoBuilder36.isInterfaceRecorded();
        boolean boolean39 = jSDocInfoBuilder36.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj45 = node43.getProp(43);
        boolean boolean46 = node43.isCall();
        boolean boolean47 = node43.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression49 = new com.google.javascript.rhino.JSTypeExpression(node43, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder50 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray52 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray53 = (java.util.ArrayList<java.lang.String>[]) arrayListArray52;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder54 = strListBuilder50.add((java.util.ArrayList<java.lang.String>[]) arrayListArray52);
        boolean boolean55 = jSTypeExpression49.equals((java.lang.Object) arrayListArray52);
        boolean boolean56 = jSDocInfoBuilder36.recordDefineType(jSTypeExpression49);
        boolean boolean57 = jSDocInfoBuilder7.recordEnumParameterType(jSTypeExpression49);
        boolean boolean58 = jSTypeExpression49.isOptionalArg();
        boolean boolean59 = jSTypeExpression49.isVarArgs();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression60 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression49);
        boolean boolean61 = jSDocInfoBuilder1.recordReturnType(jSTypeExpression60);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile63 = null;
        jSDocInfoBuilder1.markName("OR  54\n", staticSourceFile63, 51, 0);
        boolean boolean67 = jSDocInfoBuilder1.isDescriptionRecorded();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder69 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean70 = jSDocInfoBuilder69.recordNoTypeCheck();
        jSDocInfoBuilder69.recordOriginalCommentString("");
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean77 = node76.isVar();
        com.google.javascript.rhino.Node node81 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node82 = node76.copyInformationFromForTree(node81);
        com.google.javascript.rhino.Node node83 = node76.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression85 = new com.google.javascript.rhino.JSTypeExpression(node83, "STRING  43");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression86 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression85);
        boolean boolean87 = jSDocInfoBuilder69.recordReturnType(jSTypeExpression85);
        boolean boolean88 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression85);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression60 and jSTypeExpression86", jSTypeExpression60.equals(jSTypeExpression86) ? jSTypeExpression60.hashCode() == jSTypeExpression86.hashCode() : true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean3 = jSDocInfoBuilder1.recordVersion("");
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile5 = null;
        jSDocInfoBuilder1.markName("hi!", staticSourceFile5, (int) (short) 0, (int) (short) 100);
        boolean boolean9 = jSDocInfoBuilder1.recordNoTypeCheck();
        boolean boolean10 = jSDocInfoBuilder1.recordExpose();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node14.addChildrenToFront(node18);
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = jSDocInfoBuilder1.build(node18);
        boolean boolean21 = jSDocInfoBuilder1.shouldParseDocumentation();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean26 = node25.isVar();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node31 = node25.copyInformationFromForTree(node30);
        com.google.javascript.rhino.Node node32 = node25.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression34 = new com.google.javascript.rhino.JSTypeExpression(node32, "STRING  43");
        boolean boolean35 = jSTypeExpression34.isVarArgs();
        boolean boolean36 = jSDocInfoBuilder1.recordBaseType(jSTypeExpression34);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder38 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean39 = jSDocInfoBuilder38.isInterfaceRecorded();
        boolean boolean40 = jSDocInfoBuilder38.isConstructorRecorded();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder42 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean43 = jSDocInfoBuilder42.isInterfaceRecorded();
        boolean boolean45 = jSDocInfoBuilder42.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj51 = node49.getProp(43);
        boolean boolean52 = node49.isCall();
        boolean boolean53 = node49.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression55 = new com.google.javascript.rhino.JSTypeExpression(node49, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder56 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray58 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray59 = (java.util.ArrayList<java.lang.String>[]) arrayListArray58;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder60 = strListBuilder56.add((java.util.ArrayList<java.lang.String>[]) arrayListArray58);
        boolean boolean61 = jSTypeExpression55.equals((java.lang.Object) arrayListArray58);
        boolean boolean62 = jSDocInfoBuilder42.recordDefineType(jSTypeExpression55);
        com.google.javascript.rhino.Node node63 = jSTypeExpression55.getRoot();
        boolean boolean65 = jSDocInfoBuilder38.recordThrowDescription(jSTypeExpression55, "Node tree inequality:\nTree1:\nSTRING  43\n\n\nTree2:\nTYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n\n\nSubtree1: STRING  43\n\n\nSubtree2: TYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder67 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean68 = jSDocInfoBuilder67.isInterfaceRecorded();
        boolean boolean70 = jSDocInfoBuilder67.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj76 = node74.getProp(43);
        boolean boolean77 = node74.isCall();
        boolean boolean78 = node74.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression80 = new com.google.javascript.rhino.JSTypeExpression(node74, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder81 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray83 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray84 = (java.util.ArrayList<java.lang.String>[]) arrayListArray83;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder85 = strListBuilder81.add((java.util.ArrayList<java.lang.String>[]) arrayListArray83);
        boolean boolean86 = jSTypeExpression80.equals((java.lang.Object) arrayListArray83);
        boolean boolean87 = jSDocInfoBuilder67.recordDefineType(jSTypeExpression80);
        boolean boolean88 = jSDocInfoBuilder38.recordEnumParameterType(jSTypeExpression80);
        boolean boolean89 = jSTypeExpression80.isOptionalArg();
        boolean boolean90 = jSTypeExpression80.isVarArgs();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression91 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression80);
        boolean boolean92 = jSTypeExpression91.isVarArgs();
        boolean boolean93 = jSDocInfoBuilder1.recordBaseType(jSTypeExpression91);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression34 and jSTypeExpression55", jSTypeExpression34.equals(jSTypeExpression55) ? jSTypeExpression34.hashCode() == jSTypeExpression55.hashCode() : true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(36);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable2 = node1.siblings();
        int int3 = node1.getLength();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean8 = node7.isOptionalArg();
        boolean boolean9 = node7.isSwitch();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node14.addChildrenToFront(node18);
        boolean boolean20 = node14.isGetterDef();
        boolean boolean21 = node14.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj27 = node25.getProp(43);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int32 = node31.getSourceOffset();
        com.google.javascript.rhino.Node node33 = node25.useSourceInfoIfMissingFromForTree(node31);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        node37.setDirectives((java.util.Set<java.lang.String>) strSet40);
        com.google.javascript.rhino.Node node43 = node31.useSourceInfoIfMissingFromForTree(node37);
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node(32, node14, node31);
        boolean boolean45 = node44.isExprResult();
        boolean boolean46 = node44.isFunction();
        com.google.javascript.rhino.Node node47 = node7.srcrefTree(node44);
        node44.addSuppression("NUMBER 0.0 [directives: []]");
        node44.setIsSyntheticBlock(false);
        boolean boolean52 = node44.isIf();
        int int53 = node44.getSourceOffset();
        node44.removeProp(43);
        node44.setVarArgs(true);
        boolean boolean58 = node44.isVoid();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node44);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node1 = namePosition0.getItem();
        int int2 = namePosition0.getStartLine();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        boolean boolean7 = node6.isNull();
        boolean boolean8 = node6.isSyntheticBlock();
        namePosition0.setItem(node6);
        int int10 = namePosition0.getStartLine();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(0, "[]");
        namePosition0.setItem(node13);
        boolean boolean15 = node13.isFromExterns();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj21 = node19.getProp(43);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int26 = node25.getSourceOffset();
        com.google.javascript.rhino.Node node27 = node19.useSourceInfoIfMissingFromForTree(node25);
        com.google.javascript.rhino.Node node28 = node25.cloneNode();
        node28.setType(0);
        int int31 = node28.getCharno();
        boolean boolean32 = node28.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean37 = node36.isNull();
        boolean boolean38 = node36.isThis();
        boolean boolean39 = node36.isLabelName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node13.replaceChild(node28, node36);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean4 = node3.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node5 = node3.cloneNode();
        boolean boolean6 = node5.isGetElem();
        node5.addSuppression("");
        boolean boolean9 = node5.isInstanceOf();
        boolean boolean10 = node5.isNew();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj16 = node14.getProp(43);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int21 = node20.getSourceOffset();
        com.google.javascript.rhino.Node node22 = node14.useSourceInfoIfMissingFromForTree(node20);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean27 = node26.isVar();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node32 = node26.copyInformationFromForTree(node31);
        com.google.javascript.rhino.Node node33 = node14.copyInformationFromForTree(node32);
        boolean boolean34 = node33.isTrue();
        boolean boolean35 = node33.isFromExterns();
        com.google.javascript.rhino.Node node36 = node5.copyInformationFrom(node33);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean41 = node40.isVar();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node46 = node40.copyInformationFromForTree(node45);
        com.google.javascript.rhino.Node node47 = node40.cloneTree();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj53 = node51.getProp(43);
        boolean boolean54 = node51.isCall();
        boolean boolean55 = node51.isGetterDef();
        java.lang.String str56 = node40.checkTreeEquals(node51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node33.removeChild(node51);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean2 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean3 = jSDocInfoBuilder1.isConstructorRecorded();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder5 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean6 = jSDocInfoBuilder5.isInterfaceRecorded();
        boolean boolean8 = jSDocInfoBuilder5.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj14 = node12.getProp(43);
        boolean boolean15 = node12.isCall();
        boolean boolean16 = node12.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression18 = new com.google.javascript.rhino.JSTypeExpression(node12, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder19 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray21 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray22 = (java.util.ArrayList<java.lang.String>[]) arrayListArray21;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder23 = strListBuilder19.add((java.util.ArrayList<java.lang.String>[]) arrayListArray21);
        boolean boolean24 = jSTypeExpression18.equals((java.lang.Object) arrayListArray21);
        boolean boolean25 = jSDocInfoBuilder5.recordDefineType(jSTypeExpression18);
        com.google.javascript.rhino.Node node26 = jSTypeExpression18.getRoot();
        boolean boolean28 = jSDocInfoBuilder1.recordThrowDescription(jSTypeExpression18, "Node tree inequality:\nTree1:\nSTRING  43\n\n\nTree2:\nTYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n\n\nSubtree1: STRING  43\n\n\nSubtree2: TYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder30 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean31 = jSDocInfoBuilder30.isInterfaceRecorded();
        boolean boolean33 = jSDocInfoBuilder30.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj39 = node37.getProp(43);
        boolean boolean40 = node37.isCall();
        boolean boolean41 = node37.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression43 = new com.google.javascript.rhino.JSTypeExpression(node37, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder44 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray46 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray47 = (java.util.ArrayList<java.lang.String>[]) arrayListArray46;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder48 = strListBuilder44.add((java.util.ArrayList<java.lang.String>[]) arrayListArray46);
        boolean boolean49 = jSTypeExpression43.equals((java.lang.Object) arrayListArray46);
        boolean boolean50 = jSDocInfoBuilder30.recordDefineType(jSTypeExpression43);
        boolean boolean51 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression43);
        boolean boolean52 = jSDocInfoBuilder1.recordNoShadow();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder54 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean55 = jSDocInfoBuilder54.isInterfaceRecorded();
        boolean boolean57 = jSDocInfoBuilder54.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj63 = node61.getProp(43);
        boolean boolean64 = node61.isCall();
        boolean boolean65 = node61.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression67 = new com.google.javascript.rhino.JSTypeExpression(node61, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder68 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray70 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray71 = (java.util.ArrayList<java.lang.String>[]) arrayListArray70;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder72 = strListBuilder68.add((java.util.ArrayList<java.lang.String>[]) arrayListArray70);
        boolean boolean73 = jSTypeExpression67.equals((java.lang.Object) arrayListArray70);
        boolean boolean74 = jSDocInfoBuilder54.recordDefineType(jSTypeExpression67);
        boolean boolean75 = jSDocInfoBuilder1.recordThisType(jSTypeExpression67);
        boolean boolean76 = jSDocInfoBuilder1.recordConstancy();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder78 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean79 = jSDocInfoBuilder78.recordNoTypeCheck();
        jSDocInfoBuilder78.recordOriginalCommentString("");
        com.google.javascript.rhino.Node node85 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean86 = node85.isVar();
        com.google.javascript.rhino.Node node90 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node91 = node85.copyInformationFromForTree(node90);
        com.google.javascript.rhino.Node node92 = node85.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression94 = new com.google.javascript.rhino.JSTypeExpression(node92, "STRING  43");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression95 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression94);
        boolean boolean96 = jSDocInfoBuilder78.recordReturnType(jSTypeExpression94);
        boolean boolean97 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression94);
        boolean boolean98 = jSDocInfoBuilder1.recordIdGenerator();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression18 and jSTypeExpression94", jSTypeExpression18.equals(jSTypeExpression94) ? jSTypeExpression18.hashCode() == jSTypeExpression94.hashCode() : true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj5 = node3.getProp(43);
        boolean boolean6 = node3.isCall();
        int int7 = node3.getSourcePosition();
        java.lang.String str11 = node3.toString(false, true, false);
        boolean boolean12 = node3.isDo();
        boolean boolean13 = node3.isWith();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean18 = node17.isVar();
        node17.putBooleanProp(30, false);
        boolean boolean22 = node17.isSwitch();
        boolean boolean23 = node17.isUnscopedQualifiedName();
        boolean boolean24 = node3.isEquivalentTo(node17);
        com.google.javascript.rhino.Node node25 = node3.getParent();
        node3.setQuotedString();
        java.lang.Object obj28 = node3.getProp(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable29 = node3.getAncestors();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node34.addChildrenToFront(node38);
        com.google.javascript.rhino.Node node41 = node34.getChildAtIndex(0);
        com.google.javascript.rhino.Node node42 = node34.getNext();
        com.google.javascript.rhino.Node node43 = node34.getNext();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable44 = node34.siblings();
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(49, node34, 39, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node48 = node3.getChildBefore(node47);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(45, 2, (int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node5 = node3.getChildAtIndex((int) (byte) 1);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node4.addChildrenToFront(node8);
        boolean boolean10 = node4.isGetterDef();
        boolean boolean11 = node4.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj17 = node15.getProp(43);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int22 = node21.getSourceOffset();
        com.google.javascript.rhino.Node node23 = node15.useSourceInfoIfMissingFromForTree(node21);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        node27.setDirectives((java.util.Set<java.lang.String>) strSet30);
        com.google.javascript.rhino.Node node33 = node21.useSourceInfoIfMissingFromForTree(node27);
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node(32, node4, node21);
        boolean boolean35 = node34.isExprResult();
        boolean boolean36 = node34.isFunction();
        java.lang.String str37 = node34.toString();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node41.addChildrenToFront(node45);
        node45.setQuotedString();
        boolean boolean48 = node45.isHook();
        int int49 = node45.getType();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj55 = node53.getProp(43);
        int int56 = node53.getType();
        boolean boolean57 = node53.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node58 = node45.useSourceInfoIfMissingFromForTree(node53);
        boolean boolean59 = node34.hasChild(node58);
        boolean boolean60 = node58.isTry();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node62 = node58.getChildAtIndex(15);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean3 = jSDocInfoBuilder1.recordVersion("");
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile5 = null;
        jSDocInfoBuilder1.markName("hi!", staticSourceFile5, (int) (short) 0, (int) (short) 100);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = null;
        boolean boolean10 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression9);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder12 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean13 = jSDocInfoBuilder12.isInterfaceRecorded();
        boolean boolean14 = jSDocInfoBuilder12.isConstructorRecorded();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder16 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean17 = jSDocInfoBuilder16.isInterfaceRecorded();
        boolean boolean19 = jSDocInfoBuilder16.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj25 = node23.getProp(43);
        boolean boolean26 = node23.isCall();
        boolean boolean27 = node23.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression29 = new com.google.javascript.rhino.JSTypeExpression(node23, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder30 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray32 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray33 = (java.util.ArrayList<java.lang.String>[]) arrayListArray32;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder34 = strListBuilder30.add((java.util.ArrayList<java.lang.String>[]) arrayListArray32);
        boolean boolean35 = jSTypeExpression29.equals((java.lang.Object) arrayListArray32);
        boolean boolean36 = jSDocInfoBuilder16.recordDefineType(jSTypeExpression29);
        com.google.javascript.rhino.Node node37 = jSTypeExpression29.getRoot();
        boolean boolean39 = jSDocInfoBuilder12.recordThrowDescription(jSTypeExpression29, "Node tree inequality:\nTree1:\nSTRING  43\n\n\nTree2:\nTYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n\n\nSubtree1: STRING  43\n\n\nSubtree2: TYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder41 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean42 = jSDocInfoBuilder41.isInterfaceRecorded();
        boolean boolean44 = jSDocInfoBuilder41.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj50 = node48.getProp(43);
        boolean boolean51 = node48.isCall();
        boolean boolean52 = node48.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression54 = new com.google.javascript.rhino.JSTypeExpression(node48, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder55 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray57 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray58 = (java.util.ArrayList<java.lang.String>[]) arrayListArray57;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder59 = strListBuilder55.add((java.util.ArrayList<java.lang.String>[]) arrayListArray57);
        boolean boolean60 = jSTypeExpression54.equals((java.lang.Object) arrayListArray57);
        boolean boolean61 = jSDocInfoBuilder41.recordDefineType(jSTypeExpression54);
        boolean boolean62 = jSDocInfoBuilder12.recordEnumParameterType(jSTypeExpression54);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder64 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean65 = jSDocInfoBuilder64.recordNoTypeCheck();
        boolean boolean66 = jSDocInfoBuilder64.isInterfaceRecorded();
        jSDocInfoBuilder64.markAnnotation("[, hi!, , , hi!, , hi!, ]", (int) (short) 0, 2);
        boolean boolean71 = jSDocInfoBuilder64.recordIdGenerator();
        boolean boolean72 = jSDocInfoBuilder64.recordInterface();
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean77 = node76.isVar();
        com.google.javascript.rhino.Node node81 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node82 = node76.copyInformationFromForTree(node81);
        com.google.javascript.rhino.Node node83 = node76.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression85 = new com.google.javascript.rhino.JSTypeExpression(node83, "STRING  43");
        boolean boolean86 = jSTypeExpression85.isVarArgs();
        boolean boolean87 = jSDocInfoBuilder64.recordDefineType(jSTypeExpression85);
        boolean boolean88 = jSDocInfoBuilder12.recordBaseType(jSTypeExpression85);
        boolean boolean89 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression85);
        boolean boolean90 = jSDocInfoBuilder1.recordDeprecated();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression29 and jSTypeExpression85", jSTypeExpression29.equals(jSTypeExpression85) ? jSTypeExpression29.hashCode() == jSTypeExpression85.hashCode() : true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 4);
        com.google.javascript.rhino.Node node2 = node1.removeFirstChild();
        node1.putIntProp(26, 2);
        com.google.javascript.rhino.Node node6 = node1.removeChildren();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj12 = node10.getProp(43);
        boolean boolean13 = node10.isCall();
        int int14 = node10.getSourcePosition();
        com.google.javascript.rhino.Node node15 = node10.getParent();
        boolean boolean16 = node10.isIf();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition17 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean18 = typePosition17.hasBrackets();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean23 = node22.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        node27.setDirectives((java.util.Set<java.lang.String>) strSet30);
        java.lang.Object obj34 = node27.getProp((int) (byte) 1);
        com.google.javascript.rhino.Node node35 = node22.copyInformationFrom(node27);
        typePosition17.setItem(node35);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj42 = node40.getProp(43);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int47 = node46.getSourceOffset();
        com.google.javascript.rhino.Node node48 = node40.useSourceInfoIfMissingFromForTree(node46);
        int int49 = node40.getSourceOffset();
        typePosition17.setItem(node40);
        boolean boolean51 = node40.isDelProp();
        java.lang.String str52 = node10.checkTreeEquals(node40);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder54 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean55 = jSDocInfoBuilder54.recordNoTypeCheck();
        boolean boolean56 = jSDocInfoBuilder54.isInterfaceRecorded();
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj62 = node60.getProp(43);
        int int63 = node60.getType();
        boolean boolean64 = node60.isGetterDef();
        node60.setSourceEncodedPositionForTree(54);
        com.google.javascript.rhino.JSDocInfo jSDocInfo67 = jSDocInfoBuilder54.build(node60);
        boolean boolean68 = jSDocInfo67.isNoSideEffects();
        boolean boolean69 = jSDocInfo67.hasTypedefType();
        boolean boolean70 = jSDocInfo67.isConsistentIdGenerator();
        boolean boolean71 = jSDocInfo67.containsDeclaration();
        boolean boolean72 = jSDocInfo67.containsDeclaration();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility73 = jSDocInfo67.getVisibility();
        boolean boolean74 = jSDocInfo67.isNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression75 = jSDocInfo67.getThisType();
        com.google.javascript.rhino.Node node76 = jSDocInfo67.getAssociatedNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.replaceChild(node10, node76);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj6 = node4.getProp(43);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int11 = node10.getSourceOffset();
        com.google.javascript.rhino.Node node12 = node4.useSourceInfoIfMissingFromForTree(node10);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        node16.setDirectives((java.util.Set<java.lang.String>) strSet19);
        com.google.javascript.rhino.Node node22 = node10.useSourceInfoIfMissingFromForTree(node16);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj28 = node26.getProp(43);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int33 = node32.getSourceOffset();
        com.google.javascript.rhino.Node node34 = node26.useSourceInfoIfMissingFromForTree(node32);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray40 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet41 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet41, strArray40);
        node38.setDirectives((java.util.Set<java.lang.String>) strSet41);
        com.google.javascript.rhino.Node node44 = node32.useSourceInfoIfMissingFromForTree(node38);
        boolean boolean45 = node44.isContinue();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj51 = node49.getProp(43);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int56 = node55.getSourceOffset();
        com.google.javascript.rhino.Node node57 = node49.useSourceInfoIfMissingFromForTree(node55);
        boolean boolean58 = node57.isAssignAdd();
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean63 = node62.isVar();
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node((int) ' ', node16, node44, node57, node62, 1, 100);
        boolean boolean67 = node44.isCall();
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int72 = node71.getSourceOffset();
        boolean boolean73 = node71.isBreak();
        int int74 = node71.getSourcePosition();
        com.google.javascript.rhino.Node node75 = node44.useSourceInfoFromForTree(node71);
        com.google.javascript.rhino.Node node79 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node83 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node79.addChildrenToFront(node83);
        com.google.javascript.rhino.Node node86 = node79.getChildAtIndex(0);
        java.lang.String str87 = node86.toString();
        node86.setSourceEncodedPositionForTree((int) (byte) -1);
        boolean boolean90 = node86.isGetterDef();
        boolean boolean91 = node86.isScript();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node92 = node71.getChildBefore(node86);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj5 = node3.getProp(43);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int10 = node9.getSourceOffset();
        com.google.javascript.rhino.Node node11 = node3.useSourceInfoIfMissingFromForTree(node9);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        node15.setDirectives((java.util.Set<java.lang.String>) strSet18);
        com.google.javascript.rhino.Node node21 = node9.useSourceInfoIfMissingFromForTree(node15);
        boolean boolean22 = node15.isThrow();
        boolean boolean23 = node15.isNot();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean28 = node27.isVar();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node33 = node27.copyInformationFromForTree(node32);
        java.lang.String str34 = node15.checkTreeEquals(node33);
        boolean boolean36 = node33.getBooleanProp(43);
        boolean boolean37 = node33.isIn();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj43 = node41.getProp(43);
        int int44 = node41.getType();
        boolean boolean45 = node41.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node46 = node33.clonePropsFrom(node41);
        com.google.javascript.rhino.InputId inputId47 = node46.getInputId();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj53 = node51.getProp(43);
        boolean boolean54 = node51.isCall();
        int int55 = node51.getSourcePosition();
        java.lang.String str59 = node51.toString(false, true, false);
        boolean boolean60 = node51.isExprResult();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder61 = node51.getJsDocBuilderForNode();
        boolean boolean62 = node51.isSwitch();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable63 = node51.getAncestors();
        java.lang.String str64 = node51.getQualifiedName();
        java.lang.String str65 = node46.checkTreeEquals(node51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node67 = node51.getChildAtIndex(167974);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int4 = node3.getSourceOffset();
        node3.detachChildren();
        boolean boolean6 = node3.isAnd();
        boolean boolean7 = node3.isSwitch();
        boolean boolean8 = node3.hasMoreThanOneChild();
        boolean boolean9 = node3.isDec();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int14 = node13.getSourceOffset();
        com.google.javascript.rhino.jstype.JSType jSType15 = node13.getJSType();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder16 = node13.getJsDocBuilderForNode();
        node13.putBooleanProp(30, false);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder20 = node13.getJsDocBuilderForNode();
        node13.setSourceEncodedPositionForTree(12);
        node13.setCharno(8);
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition25 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition26 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition27 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition28 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition29 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition30 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean31 = typePosition30.hasBrackets();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.TypePosition> typePositionList32 = com.google.common.collect.ImmutableList.of(typePosition25, typePosition26, typePosition27, typePosition28, typePosition29, typePosition30);
        int int33 = typePosition27.getEndLine();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        boolean boolean38 = node37.isNull();
        boolean boolean39 = node37.isSyntheticBlock();
        boolean boolean40 = node37.hasMoreThanOneChild();
        typePosition27.setItem(node37);
        com.google.javascript.rhino.Node node42 = node37.getParent();
        boolean boolean43 = node37.isLabelName();
        com.google.javascript.rhino.Node node44 = node37.getLastSibling();
        int int45 = node37.getSourceOffset();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable46 = node37.getAncestors();
        boolean boolean47 = node37.isString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.replaceChild(node13, node37);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean2 = jSDocInfoBuilder1.recordNoTypeCheck();
        boolean boolean3 = jSDocInfoBuilder1.isInterfaceRecorded();
        jSDocInfoBuilder1.markAnnotation("[, hi!, , , hi!, , hi!, ]", (int) (short) 0, 2);
        boolean boolean8 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean9 = jSDocInfoBuilder1.recordInterface();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean14 = node13.isVar();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node19 = node13.copyInformationFromForTree(node18);
        com.google.javascript.rhino.Node node20 = node13.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression22 = new com.google.javascript.rhino.JSTypeExpression(node20, "STRING  43");
        boolean boolean23 = jSTypeExpression22.isVarArgs();
        boolean boolean24 = jSDocInfoBuilder1.recordDefineType(jSTypeExpression22);
        jSDocInfoBuilder1.recordOriginalCommentString("NUMBER 0.0 43");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder28 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean30 = jSDocInfoBuilder28.recordVersion("");
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile32 = null;
        jSDocInfoBuilder28.markName("hi!", staticSourceFile32, (int) (short) 0, (int) (short) 100);
        jSDocInfoBuilder28.markText("hi!", 0, 32, (int) (short) 10, (int) '#');
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj47 = node45.getProp(43);
        boolean boolean48 = node45.isCall();
        int int49 = node45.getSourcePosition();
        java.lang.String str53 = node45.toString(false, true, false);
        boolean boolean54 = node45.isDo();
        boolean boolean55 = node45.isWith();
        com.google.javascript.rhino.JSDocInfo jSDocInfo56 = jSDocInfoBuilder28.build(node45);
        boolean boolean57 = jSDocInfoBuilder28.recordConstancy();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder59 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean60 = jSDocInfoBuilder59.isInterfaceRecorded();
        boolean boolean62 = jSDocInfoBuilder59.recordBlockDescription("hi!");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder64 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean65 = jSDocInfoBuilder64.isInterfaceRecorded();
        boolean boolean67 = jSDocInfoBuilder64.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj73 = node71.getProp(43);
        boolean boolean74 = node71.isCall();
        boolean boolean75 = node71.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression77 = new com.google.javascript.rhino.JSTypeExpression(node71, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder78 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray80 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray81 = (java.util.ArrayList<java.lang.String>[]) arrayListArray80;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder82 = strListBuilder78.add((java.util.ArrayList<java.lang.String>[]) arrayListArray80);
        boolean boolean83 = jSTypeExpression77.equals((java.lang.Object) arrayListArray80);
        boolean boolean84 = jSDocInfoBuilder64.recordDefineType(jSTypeExpression77);
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition85 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int86 = namePosition85.getEndLine();
        int int87 = namePosition85.getStartLine();
        com.google.javascript.rhino.Node node88 = namePosition85.getItem();
        boolean boolean89 = jSTypeExpression77.equals((java.lang.Object) node88);
        boolean boolean90 = jSDocInfoBuilder59.recordTypedef(jSTypeExpression77);
        boolean boolean91 = jSDocInfoBuilder28.recordReturnType(jSTypeExpression77);
        boolean boolean92 = jSDocInfoBuilder1.recordReturnType(jSTypeExpression77);
        boolean boolean94 = jSDocInfoBuilder1.recordLends("NUMBER 0.0");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression22 and jSTypeExpression77", jSTypeExpression22.equals(jSTypeExpression77) ? jSTypeExpression22.hashCode() == jSTypeExpression77.hashCode() : true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 12);
        boolean boolean3 = node1.getBooleanProp(51);
        boolean boolean4 = node1.isExprResult();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node8.addChildrenToFront(node12);
        boolean boolean14 = node8.isInc();
        boolean boolean15 = node8.isEmpty();
        node8.setOptionalArg(true);
        int int18 = node8.getSourceOffset();
        com.google.javascript.rhino.Node node19 = node8.getLastChild();
        node8.putIntProp(176180, (int) (short) -1);
        com.google.javascript.rhino.Node node23 = node1.clonePropsFrom(node8);
        boolean boolean24 = node23.isComma();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder25 = node23.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj31 = node29.getProp(43);
        boolean boolean32 = node29.isCall();
        int int33 = node29.getSourcePosition();
        java.lang.String str37 = node29.toString(false, true, false);
        boolean boolean38 = node29.isExprResult();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder39 = node29.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(40, "hi!");
        java.lang.String str43 = node42.getSourceFileName();
        node42.putBooleanProp(30, false);
        node29.addChildToFront(node42);
        com.google.javascript.rhino.JSDocInfo jSDocInfo48 = node29.getJSDocInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node23.removeChild(node29);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node3.addChildrenToFront(node7);
        boolean boolean9 = node7.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType10 = node7.getJSType();
        boolean boolean11 = node7.isDebugger();
        boolean boolean12 = node7.isComma();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj19 = node17.getProp(43);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int24 = node23.getSourceOffset();
        com.google.javascript.rhino.Node node25 = node17.useSourceInfoIfMissingFromForTree(node23);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray31 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        node29.setDirectives((java.util.Set<java.lang.String>) strSet32);
        com.google.javascript.rhino.Node node35 = node23.useSourceInfoIfMissingFromForTree(node29);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj41 = node39.getProp(43);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int46 = node45.getSourceOffset();
        com.google.javascript.rhino.Node node47 = node39.useSourceInfoIfMissingFromForTree(node45);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray53 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet54 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet54, strArray53);
        node51.setDirectives((java.util.Set<java.lang.String>) strSet54);
        com.google.javascript.rhino.Node node57 = node45.useSourceInfoIfMissingFromForTree(node51);
        boolean boolean58 = node57.isContinue();
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj64 = node62.getProp(43);
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int69 = node68.getSourceOffset();
        com.google.javascript.rhino.Node node70 = node62.useSourceInfoIfMissingFromForTree(node68);
        boolean boolean71 = node70.isAssignAdd();
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean76 = node75.isVar();
        com.google.javascript.rhino.Node node79 = new com.google.javascript.rhino.Node((int) ' ', node29, node57, node70, node75, 1, 100);
        int int80 = node70.getSideEffectFlags();
        boolean boolean81 = node70.isDelProp();
        node70.setCharno(0);
        boolean boolean84 = node70.isAssign();
        int int85 = node70.getSideEffectFlags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node7.removeChild(node70);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        node3.setDirectives((java.util.Set<java.lang.String>) strSet6);
        java.lang.Object[] objArray9 = strSet6.toArray();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        node13.setDirectives((java.util.Set<java.lang.String>) strSet16);
        java.lang.Object[] objArray19 = strSet16.toArray();
        boolean boolean20 = strSet6.retainAll((java.util.Collection<java.lang.String>) strSet16);
        strSet16.clear();
        java.lang.Comparable[][] comparableArray23 = new java.lang.Comparable[0][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray24 = (java.lang.Comparable<java.lang.String>[][]) comparableArray23;
        java.lang.Comparable[][] comparableArray26 = new java.lang.Comparable[0][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray27 = (java.lang.Comparable<java.lang.String>[][]) comparableArray26;
        java.lang.Comparable[][] comparableArray29 = new java.lang.Comparable[0][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray30 = (java.lang.Comparable<java.lang.String>[][]) comparableArray29;
        java.lang.Comparable[][][] comparableArray32 = new java.lang.Comparable[3][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][] strComparableArray33 = (java.lang.Comparable<java.lang.String>[][][]) comparableArray32;
        strComparableArray33[0] = strComparableArray24;
        strComparableArray33[1] = strComparableArray27;
        strComparableArray33[2] = strComparableArray30;
        java.lang.Comparable<java.lang.String>[][][] strComparableArray40 = strSet16.toArray(strComparableArray33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.common.collect.ImmutableList<java.lang.Object[]> objArrayList41 = com.google.common.collect.ImmutableList.copyOf((java.lang.Object[][]) strComparableArray33);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean1 = typePosition0.hasBrackets();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean6 = node5.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        node10.setDirectives((java.util.Set<java.lang.String>) strSet13);
        java.lang.Object obj17 = node10.getProp((int) (byte) 1);
        com.google.javascript.rhino.Node node18 = node5.copyInformationFrom(node10);
        typePosition0.setItem(node18);
        int int20 = typePosition0.getStartLine();
        com.google.javascript.rhino.Node node21 = typePosition0.getItem();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node23 = node21.getChildAtIndex((int) (short) 10);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj5 = node3.getProp(43);
        int int6 = node3.getType();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node3.siblings();
        java.lang.String str11 = node3.toString(true, false, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node13 = node3.getChildAtIndex(46);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean2 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean3 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder5 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean6 = jSDocInfoBuilder5.isInterfaceRecorded();
        boolean boolean8 = jSDocInfoBuilder5.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj14 = node12.getProp(43);
        boolean boolean15 = node12.isCall();
        boolean boolean16 = node12.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression18 = new com.google.javascript.rhino.JSTypeExpression(node12, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder19 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray21 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray22 = (java.util.ArrayList<java.lang.String>[]) arrayListArray21;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder23 = strListBuilder19.add((java.util.ArrayList<java.lang.String>[]) arrayListArray21);
        boolean boolean24 = jSTypeExpression18.equals((java.lang.Object) arrayListArray21);
        boolean boolean25 = jSDocInfoBuilder5.recordDefineType(jSTypeExpression18);
        boolean boolean26 = jSTypeExpression18.isVarArgs();
        java.lang.Object obj27 = null;
        boolean boolean28 = jSTypeExpression18.equals(obj27);
        boolean boolean29 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression18);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean34 = node33.isVar();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node39 = node33.copyInformationFromForTree(node38);
        com.google.javascript.rhino.Node node40 = node33.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression42 = new com.google.javascript.rhino.JSTypeExpression(node40, "STRING  43");
        boolean boolean43 = jSDocInfoBuilder1.recordExtendedInterface(jSTypeExpression42);
        com.google.javascript.rhino.Node node44 = jSTypeExpression42.getRoot();
        com.google.javascript.rhino.Node node45 = node44.removeFirstChild();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression18 and jSTypeExpression42", jSTypeExpression18.equals(jSTypeExpression42) ? jSTypeExpression18.hashCode() == jSTypeExpression42.hashCode() : true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj5 = node3.getProp(43);
        boolean boolean6 = node3.isCall();
        int int7 = node3.getSourcePosition();
        java.lang.String str11 = node3.toString(false, true, false);
        boolean boolean12 = node3.isExprResult();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder13 = node3.getJsDocBuilderForNode();
        boolean boolean14 = node3.isSwitch();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable15 = node3.getAncestors();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition16 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean17 = typePosition16.hasBrackets();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean22 = node21.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        node26.setDirectives((java.util.Set<java.lang.String>) strSet29);
        java.lang.Object obj33 = node26.getProp((int) (byte) 1);
        com.google.javascript.rhino.Node node34 = node21.copyInformationFrom(node26);
        typePosition16.setItem(node34);
        int int36 = typePosition16.getStartLine();
        com.google.javascript.rhino.Node node37 = typePosition16.getItem();
        com.google.javascript.rhino.jstype.JSType jSType38 = node37.getJSType();
        com.google.javascript.rhino.Node node39 = node3.copyInformationFromForTree(node37);
        node39.setSourceEncodedPositionForTree(51);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString(100, "", 54, 15);
        java.lang.String str47 = node46.toStringTree();
        boolean boolean48 = node46.isNoSideEffectsCall();
        boolean boolean49 = node46.isNull();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean54 = node53.isAdd();
        boolean boolean55 = node53.isFalse();
        node53.setLineno(40);
        node53.putIntProp(2, 32);
        boolean boolean61 = node53.isCall();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node39.replaceChild(node46, node53);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj5 = node3.getProp(43);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int10 = node9.getSourceOffset();
        com.google.javascript.rhino.Node node11 = node3.useSourceInfoIfMissingFromForTree(node9);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        node15.setDirectives((java.util.Set<java.lang.String>) strSet18);
        com.google.javascript.rhino.Node node21 = node9.useSourceInfoIfMissingFromForTree(node15);
        boolean boolean22 = node21.isContinue();
        boolean boolean23 = node21.isOnlyModifiesThisCall();
        boolean boolean24 = node21.isDefaultCase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node26 = node21.getChildAtIndex(45055);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("STRING  [length: 53]\n", 8, (int) (short) 1);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int9 = node8.getSourceOffset();
        double double10 = node8.getDouble();
        boolean boolean11 = node8.isFor();
        java.util.Set<java.lang.String> strSet12 = node8.getDirectives();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(53, node8);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj19 = node17.getProp(43);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int24 = node23.getSourceOffset();
        com.google.javascript.rhino.Node node25 = node17.useSourceInfoIfMissingFromForTree(node23);
        com.google.javascript.rhino.Node node26 = node23.cloneNode();
        node26.setType(0);
        int int29 = node26.getCharno();
        boolean boolean30 = node26.hasMoreThanOneChild();
        node13.addChildToBack(node26);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean36 = node35.isVar();
        node35.putBooleanProp(30, false);
        boolean boolean40 = node35.isSwitch();
        boolean boolean41 = node35.isIn();
        boolean boolean42 = node35.isFromExterns();
        boolean boolean43 = node35.isNot();
        boolean boolean44 = node35.isNumber();
        boolean boolean45 = node35.isVarArgs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.replaceChild(node26, node35);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(35, "STRING  43 [var_args_name: 1]\n", 4095, 52);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        node9.setDirectives((java.util.Set<java.lang.String>) strSet12);
        boolean boolean16 = strSet12.contains((java.lang.Object) 10.0d);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = com.google.common.collect.ImmutableList.of("", "hi!", "", "", "hi!", "", "hi!", "");
        int int27 = strList25.indexOf((java.lang.Object) 'a');
        com.google.common.collect.ImmutableList<java.lang.String> strList36 = com.google.common.collect.ImmutableList.of("", "hi!", "", "", "hi!", "", "hi!", "");
        int int38 = strList36.indexOf((java.lang.Object) 'a');
        com.google.common.collect.ImmutableList<java.lang.String> strList47 = com.google.common.collect.ImmutableList.of("", "hi!", "", "", "hi!", "", "hi!", "");
        com.google.common.collect.ImmutableList<java.lang.String> strList56 = com.google.common.collect.ImmutableList.of("", "hi!", "", "", "hi!", "", "hi!", "");
        com.google.common.collect.ImmutableList<java.lang.Iterable<java.lang.String>> strIterableList57 = com.google.common.collect.ImmutableList.of((java.lang.Iterable<java.lang.String>) strList25, (java.lang.Iterable<java.lang.String>) strList36, (java.lang.Iterable<java.lang.String>) strList47, (java.lang.Iterable<java.lang.String>) strList56);
        com.google.common.collect.ImmutableList<java.lang.String> strList66 = com.google.common.collect.ImmutableList.of("", "hi!", "", "", "hi!", "", "hi!", "");
        int int68 = strList66.indexOf((java.lang.Object) 'a');
        java.util.Spliterator<java.lang.String> strSpliterator69 = strList66.spliterator();
        boolean boolean70 = strList36.equals((java.lang.Object) strList66);
        boolean boolean71 = strSet12.addAll((java.util.Collection<java.lang.String>) strList66);
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        boolean boolean76 = node75.isIf();
        boolean boolean77 = strSet12.equals((java.lang.Object) node75);
        com.google.javascript.rhino.Node node78 = new com.google.javascript.rhino.Node((int) (short) -1, node75);
        int int79 = node78.getSourcePosition();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder80 = node78.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.JSDocInfo jSDocInfo81 = node78.getJSDocInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node82 = node4.getChildBefore(node78);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.jstype.JSType jSType5 = node3.getJSType();
        boolean boolean6 = node3.isDelProp();
        boolean boolean7 = node3.isQualifiedName();
        boolean boolean9 = node3.getBooleanProp(15);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        boolean boolean14 = node13.isNull();
        boolean boolean15 = node13.isLabelName();
        int int17 = node13.getIntProp((int) 'a');
        boolean boolean18 = node13.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 50);
        node20.setLength(12);
        com.google.javascript.rhino.Node node23 = node20.cloneTree();
        com.google.javascript.rhino.Node node24 = node13.copyInformationFromForTree(node20);
        boolean boolean25 = node24.isBreak();
        com.google.javascript.rhino.Node node26 = node3.copyInformationFromForTree(node24);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj32 = node30.getProp(43);
        boolean boolean33 = node30.isParamList();
        boolean boolean34 = node30.isParamList();
        com.google.javascript.rhino.Node node35 = node30.cloneNode();
        boolean boolean36 = node30.isVar();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) 1.0f, (int) (short) 10, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node24.replaceChild(node30, node40);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj5 = node3.getProp(43);
        boolean boolean6 = node3.isCall();
        boolean boolean7 = node3.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = new com.google.javascript.rhino.JSTypeExpression(node3, "STRING ");
        boolean boolean10 = node3.isDo();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node14.addChildrenToFront(node18);
        boolean boolean20 = node18.isComma();
        com.google.javascript.rhino.Node node21 = node3.useSourceInfoFromForTree(node18);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj28 = node26.getProp(43);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        boolean boolean33 = node32.isIf();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj39 = node37.getProp(43);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int44 = node43.getSourceOffset();
        com.google.javascript.rhino.Node node45 = node37.useSourceInfoIfMissingFromForTree(node43);
        boolean boolean46 = node45.isAssignAdd();
        boolean boolean47 = node45.isEmpty();
        node45.setSourceEncodedPosition(40);
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean54 = node53.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray60 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet61 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet61, strArray60);
        node58.setDirectives((java.util.Set<java.lang.String>) strSet61);
        java.lang.Object obj65 = node58.getProp((int) (byte) 1);
        com.google.javascript.rhino.Node node66 = node53.copyInformationFrom(node58);
        boolean boolean67 = node53.isOr();
        com.google.javascript.rhino.Node node70 = new com.google.javascript.rhino.Node(1, node26, node32, node45, node53, 176180, 1);
        com.google.javascript.rhino.Node node71 = node18.copyInformationFromForTree(node53);
        boolean boolean72 = node53.isCase();
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.Node.newNumber((double) 39);
        node74.setType(38);
        node74.putBooleanProp(0, false);
        node53.addChildToFront(node74);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node82 = node74.getChildAtIndex(40);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj5 = node3.getProp(43);
        boolean boolean6 = node3.isCall();
        int int7 = node3.getSourcePosition();
        int int8 = node3.getSourcePosition();
        boolean boolean9 = node3.isStringKey();
        boolean boolean10 = node3.isNew();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean15 = node14.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node16 = node14.cloneNode();
        boolean boolean17 = node16.isGetElem();
        node16.addSuppression("");
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int24 = node23.getSourceOffset();
        boolean boolean25 = node23.isBreak();
        int int26 = node23.getSourcePosition();
        com.google.javascript.rhino.Node node27 = node16.useSourceInfoFrom(node23);
        com.google.javascript.rhino.Node[] nodeArray29 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(42, nodeArray29, (int) (byte) 1, 43);
        com.google.javascript.rhino.Node node33 = node23.useSourceInfoIfMissingFromForTree(node32);
        node32.setSourceFileForTesting("Node tree inequality:\nTree1:\nSTRING  43\n\n\nTree2:\nNUMBER 0.0 43\n\n\nSubtree1: STRING  43\n\n\nSubtree2: NUMBER 0.0 43\n");
        boolean boolean36 = node32.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 12);
        com.google.javascript.rhino.Node node39 = node38.cloneTree();
        com.google.javascript.rhino.JSDocInfo jSDocInfo40 = node38.getJSDocInfo();
        node38.putIntProp(52, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.replaceChild(node32, node38);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 0, "[, hi!, , , hi!, , hi!, ]");
        boolean boolean3 = node2.isFor();
        boolean boolean4 = node2.isNull();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj10 = node8.getProp(43);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int15 = node14.getSourceOffset();
        com.google.javascript.rhino.Node node16 = node8.useSourceInfoIfMissingFromForTree(node14);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        node20.setDirectives((java.util.Set<java.lang.String>) strSet23);
        com.google.javascript.rhino.Node node26 = node14.useSourceInfoIfMissingFromForTree(node20);
        boolean boolean27 = node26.isContinue();
        com.google.javascript.rhino.Node node28 = node26.cloneTree();
        node2.addChildToBack(node26);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean35 = node34.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray41 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        node39.setDirectives((java.util.Set<java.lang.String>) strSet42);
        java.lang.Object obj46 = node39.getProp((int) (byte) 1);
        com.google.javascript.rhino.Node node47 = node34.copyInformationFrom(node39);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        boolean boolean52 = node51.isNull();
        boolean boolean53 = node51.isSyntheticBlock();
        com.google.javascript.rhino.Node node54 = node51.removeChildren();
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        boolean boolean59 = node58.isDebugger();
        com.google.javascript.rhino.Node node60 = node58.getFirstChild();
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj66 = node64.getProp(43);
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int71 = node70.getSourceOffset();
        com.google.javascript.rhino.Node node72 = node64.useSourceInfoIfMissingFromForTree(node70);
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node(38, node39, node51, node58, node64);
        com.google.javascript.rhino.Node node74 = node51.getFirstChild();
        boolean boolean75 = node51.isNumber();
        java.lang.String str76 = node51.getSourceFileName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node77 = node26.getChildBefore(node51);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean2 = jSDocInfoBuilder1.recordNoTypeCheck();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordThisType(jSTypeExpression3);
        boolean boolean6 = jSDocInfoBuilder1.addReference("hi!");
        boolean boolean7 = jSDocInfoBuilder1.shouldParseDocumentation();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder9 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean10 = jSDocInfoBuilder9.recordNoTypeCheck();
        boolean boolean12 = jSDocInfoBuilder9.addAuthor("");
        boolean boolean13 = jSDocInfoBuilder9.recordExport();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder15 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean16 = jSDocInfoBuilder15.isInterfaceRecorded();
        boolean boolean17 = jSDocInfoBuilder15.isConstructorRecorded();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder19 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean20 = jSDocInfoBuilder19.isInterfaceRecorded();
        boolean boolean22 = jSDocInfoBuilder19.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj28 = node26.getProp(43);
        boolean boolean29 = node26.isCall();
        boolean boolean30 = node26.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression32 = new com.google.javascript.rhino.JSTypeExpression(node26, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder33 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray35 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray36 = (java.util.ArrayList<java.lang.String>[]) arrayListArray35;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder37 = strListBuilder33.add((java.util.ArrayList<java.lang.String>[]) arrayListArray35);
        boolean boolean38 = jSTypeExpression32.equals((java.lang.Object) arrayListArray35);
        boolean boolean39 = jSDocInfoBuilder19.recordDefineType(jSTypeExpression32);
        com.google.javascript.rhino.Node node40 = jSTypeExpression32.getRoot();
        boolean boolean42 = jSDocInfoBuilder15.recordThrowDescription(jSTypeExpression32, "Node tree inequality:\nTree1:\nSTRING  43\n\n\nTree2:\nTYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n\n\nSubtree1: STRING  43\n\n\nSubtree2: TYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder44 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean45 = jSDocInfoBuilder44.isInterfaceRecorded();
        boolean boolean47 = jSDocInfoBuilder44.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj53 = node51.getProp(43);
        boolean boolean54 = node51.isCall();
        boolean boolean55 = node51.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression57 = new com.google.javascript.rhino.JSTypeExpression(node51, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder58 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray60 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray61 = (java.util.ArrayList<java.lang.String>[]) arrayListArray60;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder62 = strListBuilder58.add((java.util.ArrayList<java.lang.String>[]) arrayListArray60);
        boolean boolean63 = jSTypeExpression57.equals((java.lang.Object) arrayListArray60);
        boolean boolean64 = jSDocInfoBuilder44.recordDefineType(jSTypeExpression57);
        boolean boolean65 = jSDocInfoBuilder15.recordEnumParameterType(jSTypeExpression57);
        boolean boolean66 = jSTypeExpression57.isOptionalArg();
        boolean boolean67 = jSTypeExpression57.isVarArgs();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression68 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression57);
        boolean boolean69 = jSDocInfoBuilder9.recordReturnType(jSTypeExpression68);
        boolean boolean70 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression68);
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean75 = node74.isVar();
        com.google.javascript.rhino.Node node79 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node80 = node74.copyInformationFromForTree(node79);
        com.google.javascript.rhino.Node node81 = node74.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression83 = new com.google.javascript.rhino.JSTypeExpression(node81, "STRING  43");
        boolean boolean84 = jSDocInfoBuilder1.recordThisType(jSTypeExpression83);
        boolean boolean85 = jSDocInfoBuilder1.recordConstancy();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression32 and jSTypeExpression83", jSTypeExpression32.equals(jSTypeExpression83) ? jSTypeExpression32.hashCode() == jSTypeExpression83.hashCode() : true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean2 = jSDocInfoBuilder1.recordNoTypeCheck();
        boolean boolean3 = jSDocInfoBuilder1.isJavaDispatch();
        boolean boolean4 = jSDocInfoBuilder1.recordImplicitCast();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder6 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean7 = jSDocInfoBuilder6.isInterfaceRecorded();
        boolean boolean8 = jSDocInfoBuilder6.isConstructorRecorded();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder10 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean11 = jSDocInfoBuilder10.isInterfaceRecorded();
        boolean boolean13 = jSDocInfoBuilder10.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj19 = node17.getProp(43);
        boolean boolean20 = node17.isCall();
        boolean boolean21 = node17.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression23 = new com.google.javascript.rhino.JSTypeExpression(node17, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder24 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray26 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray27 = (java.util.ArrayList<java.lang.String>[]) arrayListArray26;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder28 = strListBuilder24.add((java.util.ArrayList<java.lang.String>[]) arrayListArray26);
        boolean boolean29 = jSTypeExpression23.equals((java.lang.Object) arrayListArray26);
        boolean boolean30 = jSDocInfoBuilder10.recordDefineType(jSTypeExpression23);
        com.google.javascript.rhino.Node node31 = jSTypeExpression23.getRoot();
        boolean boolean33 = jSDocInfoBuilder6.recordThrowDescription(jSTypeExpression23, "Node tree inequality:\nTree1:\nSTRING  43\n\n\nTree2:\nTYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n\n\nSubtree1: STRING  43\n\n\nSubtree2: TYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder35 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean36 = jSDocInfoBuilder35.isInterfaceRecorded();
        boolean boolean38 = jSDocInfoBuilder35.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj44 = node42.getProp(43);
        boolean boolean45 = node42.isCall();
        boolean boolean46 = node42.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression48 = new com.google.javascript.rhino.JSTypeExpression(node42, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder49 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray51 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray52 = (java.util.ArrayList<java.lang.String>[]) arrayListArray51;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder53 = strListBuilder49.add((java.util.ArrayList<java.lang.String>[]) arrayListArray51);
        boolean boolean54 = jSTypeExpression48.equals((java.lang.Object) arrayListArray51);
        boolean boolean55 = jSDocInfoBuilder35.recordDefineType(jSTypeExpression48);
        boolean boolean56 = jSDocInfoBuilder6.recordEnumParameterType(jSTypeExpression48);
        boolean boolean57 = jSTypeExpression48.isOptionalArg();
        boolean boolean58 = jSTypeExpression48.isVarArgs();
        boolean boolean59 = jSDocInfoBuilder1.recordExtendedInterface(jSTypeExpression48);
        boolean boolean60 = jSDocInfoBuilder1.isConstructorRecorded();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder62 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean64 = jSDocInfoBuilder62.recordVersion("");
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile66 = null;
        jSDocInfoBuilder62.markName("hi!", staticSourceFile66, (int) (short) 0, (int) (short) 100);
        jSDocInfoBuilder62.markText("hi!", 0, 32, (int) (short) 10, (int) '#');
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder77 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean78 = jSDocInfoBuilder77.recordNoTypeCheck();
        jSDocInfoBuilder77.recordOriginalCommentString("");
        com.google.javascript.rhino.Node node84 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean85 = node84.isVar();
        com.google.javascript.rhino.Node node89 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node90 = node84.copyInformationFromForTree(node89);
        com.google.javascript.rhino.Node node91 = node84.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression93 = new com.google.javascript.rhino.JSTypeExpression(node91, "STRING  43");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression94 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression93);
        boolean boolean95 = jSDocInfoBuilder77.recordReturnType(jSTypeExpression93);
        boolean boolean96 = jSDocInfoBuilder62.recordType(jSTypeExpression93);
        boolean boolean97 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression93);
        boolean boolean98 = jSDocInfoBuilder1.isPopulated();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression23 and jSTypeExpression93", jSTypeExpression23.equals(jSTypeExpression93) ? jSTypeExpression23.hashCode() == jSTypeExpression93.hashCode() : true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 0, 48, 12);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int8 = node7.getSourceOffset();
        node7.detachChildren();
        boolean boolean10 = node7.isAnd();
        boolean boolean11 = node7.hasOneChild();
        boolean boolean12 = node7.isVoid();
        node7.setSourceEncodedPositionForTree(29);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) ' ', 16, 51);
        boolean boolean19 = node18.isComma();
        boolean boolean20 = node18.isNull();
        java.lang.String str21 = node18.getSourceFileName();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        node25.setDirectives((java.util.Set<java.lang.String>) strSet28);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj36 = node34.getProp(43);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int41 = node40.getSourceOffset();
        com.google.javascript.rhino.Node node42 = node34.useSourceInfoIfMissingFromForTree(node40);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray48 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet49 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet49, strArray48);
        node46.setDirectives((java.util.Set<java.lang.String>) strSet49);
        com.google.javascript.rhino.Node node52 = node40.useSourceInfoIfMissingFromForTree(node46);
        boolean boolean53 = node52.isContinue();
        boolean boolean54 = node52.isOnlyModifiesThisCall();
        boolean boolean55 = node52.isDefaultCase();
        boolean boolean56 = node25.hasChild(node52);
        int int57 = node25.getSourceOffset();
        boolean boolean58 = node25.isNew();
        boolean boolean59 = node25.isVar();
        boolean boolean60 = node25.isVarArgs();
        com.google.javascript.rhino.Node node61 = node18.srcrefTree(node25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.replaceChild(node7, node61);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 43);
        boolean boolean2 = node1.isTry();
        boolean boolean3 = node1.isEmpty();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj9 = node7.getProp(43);
        boolean boolean10 = node7.isCall();
        boolean boolean11 = node7.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = new com.google.javascript.rhino.JSTypeExpression(node7, "STRING ");
        boolean boolean14 = node7.isDo();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node18.addChildrenToFront(node22);
        boolean boolean24 = node22.isComma();
        com.google.javascript.rhino.Node node25 = node7.useSourceInfoFromForTree(node22);
        boolean boolean26 = node22.isDec();
        boolean boolean27 = node22.hasOneChild();
        boolean boolean28 = node22.isAssignAdd();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable29 = node22.siblings();
        boolean boolean30 = node22.isDelProp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node22);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean4 = node3.isOptionalArg();
        node3.setSourceEncodedPosition(12);
        boolean boolean7 = node3.isFromExterns();
        boolean boolean8 = node3.isNull();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node12.addChildrenToFront(node16);
        com.google.javascript.rhino.Node node19 = node12.getChildAtIndex(0);
        java.lang.String str20 = node19.toString();
        node19.setSourceEncodedPositionForTree((int) (byte) -1);
        com.google.javascript.rhino.Node node23 = node3.clonePropsFrom(node19);
        boolean boolean24 = node19.isDec();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression26 = new com.google.javascript.rhino.JSTypeExpression(node19, "JSDocInfo");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder28 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean29 = jSDocInfoBuilder28.isInterfaceRecorded();
        boolean boolean31 = jSDocInfoBuilder28.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj37 = node35.getProp(43);
        boolean boolean38 = node35.isCall();
        boolean boolean39 = node35.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression41 = new com.google.javascript.rhino.JSTypeExpression(node35, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder42 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray44 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray45 = (java.util.ArrayList<java.lang.String>[]) arrayListArray44;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder46 = strListBuilder42.add((java.util.ArrayList<java.lang.String>[]) arrayListArray44);
        boolean boolean47 = jSTypeExpression41.equals((java.lang.Object) arrayListArray44);
        boolean boolean48 = jSDocInfoBuilder28.recordDefineType(jSTypeExpression41);
        com.google.javascript.rhino.Node node49 = jSTypeExpression41.getRoot();
        boolean boolean50 = node49.isLabel();
        boolean boolean51 = node49.isNot();
        boolean boolean52 = jSTypeExpression26.equals((java.lang.Object) node49);
        boolean boolean53 = node49.isSwitch();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression26 and jSTypeExpression41", jSTypeExpression26.equals(jSTypeExpression41) ? jSTypeExpression26.hashCode() == jSTypeExpression41.hashCode() : true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean2 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean3 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder5 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean6 = jSDocInfoBuilder5.isInterfaceRecorded();
        boolean boolean8 = jSDocInfoBuilder5.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj14 = node12.getProp(43);
        boolean boolean15 = node12.isCall();
        boolean boolean16 = node12.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression18 = new com.google.javascript.rhino.JSTypeExpression(node12, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder19 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray21 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray22 = (java.util.ArrayList<java.lang.String>[]) arrayListArray21;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder23 = strListBuilder19.add((java.util.ArrayList<java.lang.String>[]) arrayListArray21);
        boolean boolean24 = jSTypeExpression18.equals((java.lang.Object) arrayListArray21);
        boolean boolean25 = jSDocInfoBuilder5.recordDefineType(jSTypeExpression18);
        boolean boolean26 = jSTypeExpression18.isVarArgs();
        java.lang.Object obj27 = null;
        boolean boolean28 = jSTypeExpression18.equals(obj27);
        boolean boolean29 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression18);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean34 = node33.isVar();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node39 = node33.copyInformationFromForTree(node38);
        com.google.javascript.rhino.Node node40 = node33.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression42 = new com.google.javascript.rhino.JSTypeExpression(node40, "STRING  43");
        boolean boolean43 = jSDocInfoBuilder1.recordExtendedInterface(jSTypeExpression42);
        com.google.javascript.rhino.Node node44 = jSTypeExpression42.getRoot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile45 = null;
        node44.setStaticSourceFile(staticSourceFile45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression18 and jSTypeExpression42", jSTypeExpression18.equals(jSTypeExpression42) ? jSTypeExpression18.hashCode() == jSTypeExpression42.hashCode() : true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean4 = node3.isVar();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node9 = node3.copyInformationFromForTree(node8);
        com.google.javascript.rhino.Node node10 = node3.cloneTree();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj16 = node14.getProp(43);
        boolean boolean17 = node14.isCall();
        boolean boolean18 = node14.isGetterDef();
        java.lang.String str19 = node3.checkTreeEquals(node14);
        boolean boolean20 = node14.isSetterDef();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(26, 0, 39);
        boolean boolean25 = node24.isCatch();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node26 = node14.getChildBefore(node24);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("[, hi!, , , hi!, , hi!, ]", 35, 26);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString(100, "", 54, 15);
        java.lang.String str9 = node8.toStringTree();
        java.lang.String str10 = node8.getSourceFileName();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj16 = node14.getProp(43);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int21 = node20.getSourceOffset();
        com.google.javascript.rhino.Node node22 = node14.useSourceInfoIfMissingFromForTree(node20);
        boolean boolean23 = node22.isAssignAdd();
        boolean boolean24 = node22.isEmpty();
        java.lang.Object obj26 = node22.getProp((int) '#');
        com.google.javascript.rhino.Node node27 = node8.srcref(node22);
        node3.addChildrenToFront(node22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node30 = node22.getChildAtIndex((int) (byte) 10);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int4 = node3.getSourceOffset();
        boolean boolean5 = node3.isFor();
        java.lang.Object obj7 = node3.getProp(49);
        java.util.Set<java.lang.String> strSet8 = node3.getDirectives();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder9 = node3.new FileLevelJsDocBuilder();
        boolean boolean10 = node3.isSyntheticBlock();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        boolean boolean15 = node14.isIf();
        boolean boolean16 = node14.isAnd();
        boolean boolean17 = node14.isOnlyModifiesThisCall();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node14);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj6 = node4.getProp(43);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int11 = node10.getSourceOffset();
        com.google.javascript.rhino.Node node12 = node4.useSourceInfoIfMissingFromForTree(node10);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        node16.setDirectives((java.util.Set<java.lang.String>) strSet19);
        com.google.javascript.rhino.Node node22 = node10.useSourceInfoIfMissingFromForTree(node16);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj28 = node26.getProp(43);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int33 = node32.getSourceOffset();
        com.google.javascript.rhino.Node node34 = node26.useSourceInfoIfMissingFromForTree(node32);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray40 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet41 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet41, strArray40);
        node38.setDirectives((java.util.Set<java.lang.String>) strSet41);
        com.google.javascript.rhino.Node node44 = node32.useSourceInfoIfMissingFromForTree(node38);
        boolean boolean45 = node44.isContinue();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj51 = node49.getProp(43);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int56 = node55.getSourceOffset();
        com.google.javascript.rhino.Node node57 = node49.useSourceInfoIfMissingFromForTree(node55);
        boolean boolean58 = node57.isAssignAdd();
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean63 = node62.isVar();
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node((int) ' ', node16, node44, node57, node62, 1, 100);
        int int67 = node57.getSideEffectFlags();
        int int68 = node57.getSideEffectFlags();
        boolean boolean69 = node57.isDebugger();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile70 = node57.getStaticSourceFile();
        node57.putBooleanProp(2, false);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder74 = node57.getJsDocBuilderForNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node76 = node57.getChildAtIndex(36);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "Node tree inequality:\nTree1:\nSTRING \n\n\nTree2:\nNUMBER 0.0 43 [directives: []]\n\n\nSubtree1: STRING \n\n\nSubtree2: NUMBER 0.0 43 [directives: []]\n");
        boolean boolean3 = node2.isEmpty();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder5 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean6 = jSDocInfoBuilder5.recordNoTypeCheck();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean11 = node10.isVar();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node16 = node10.copyInformationFromForTree(node15);
        boolean boolean17 = node16.isVarArgs();
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = jSDocInfoBuilder5.build(node16);
        boolean boolean19 = node16.isIf();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.removeChild(node16);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(12, "", (int) ' ', 47);
        boolean boolean5 = node4.isAdd();
        boolean boolean6 = node4.isLocalResultCall();
        boolean boolean7 = node4.isTypeOf();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean12 = node11.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node13 = node11.cloneNode();
        boolean boolean14 = node11.isQualifiedName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node15 = node4.getChildBefore(node11);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean5 = node4.isVar();
        node4.putBooleanProp(30, false);
        java.lang.String str9 = node4.toString();
        boolean boolean10 = node4.isCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = node4.getJSDocInfo();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean16 = node15.isVar();
        node15.putBooleanProp(30, false);
        boolean boolean20 = node15.isSwitch();
        boolean boolean21 = node15.isUnscopedQualifiedName();
        boolean boolean22 = node15.hasChildren();
        boolean boolean23 = node15.isDefaultCase();
        int int25 = node15.getIntProp((int) '#');
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable26 = node15.children();
        boolean boolean27 = node15.isIn();
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(46, node4, node15, 12, 176129);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj36 = node34.getProp(43);
        int int37 = node34.getType();
        boolean boolean38 = node34.isGetterDef();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) 12);
        com.google.javascript.rhino.Node node41 = node40.removeChildren();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable42 = node40.getAncestors();
        com.google.javascript.rhino.Node node43 = node34.srcref(node40);
        java.lang.String str47 = node43.toString(true, false, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node15.removeChild(node43);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj6 = node4.getProp(43);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int11 = node10.getSourceOffset();
        com.google.javascript.rhino.Node node12 = node4.useSourceInfoIfMissingFromForTree(node10);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        node16.setDirectives((java.util.Set<java.lang.String>) strSet19);
        com.google.javascript.rhino.Node node22 = node10.useSourceInfoIfMissingFromForTree(node16);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj28 = node26.getProp(43);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int33 = node32.getSourceOffset();
        com.google.javascript.rhino.Node node34 = node26.useSourceInfoIfMissingFromForTree(node32);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray40 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet41 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet41, strArray40);
        node38.setDirectives((java.util.Set<java.lang.String>) strSet41);
        com.google.javascript.rhino.Node node44 = node32.useSourceInfoIfMissingFromForTree(node38);
        boolean boolean45 = node44.isContinue();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj51 = node49.getProp(43);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int56 = node55.getSourceOffset();
        com.google.javascript.rhino.Node node57 = node49.useSourceInfoIfMissingFromForTree(node55);
        boolean boolean58 = node57.isAssignAdd();
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean63 = node62.isVar();
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node((int) ' ', node16, node44, node57, node62, 1, 100);
        node62.setWasEmptyNode(true);
        boolean boolean69 = node62.isQuotedString();
        boolean boolean71 = node62.getBooleanProp((int) (byte) 0);
        boolean boolean72 = node62.isEmpty();
        boolean boolean73 = node62.isLocalResultCall();
        boolean boolean74 = node62.isLabel();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node76 = node62.getChildAtIndex(39);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean2 = jSDocInfoBuilder1.isInterfaceRecorded();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = null;
        boolean boolean5 = jSDocInfoBuilder1.recordParameter("", jSTypeExpression4);
        boolean boolean6 = jSDocInfoBuilder1.recordExterns();
        boolean boolean7 = jSDocInfoBuilder1.recordPreserveTry();
        boolean boolean8 = jSDocInfoBuilder1.recordNoCompile();
        boolean boolean10 = jSDocInfoBuilder1.recordLends("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = null;
        boolean boolean12 = jSDocInfoBuilder1.recordType(jSTypeExpression11);
        boolean boolean13 = jSDocInfoBuilder1.recordNoCompile();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder16 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean17 = jSDocInfoBuilder16.isInterfaceRecorded();
        boolean boolean18 = jSDocInfoBuilder16.isConstructorRecorded();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder20 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean21 = jSDocInfoBuilder20.isInterfaceRecorded();
        boolean boolean23 = jSDocInfoBuilder20.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj29 = node27.getProp(43);
        boolean boolean30 = node27.isCall();
        boolean boolean31 = node27.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression33 = new com.google.javascript.rhino.JSTypeExpression(node27, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder34 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray36 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray37 = (java.util.ArrayList<java.lang.String>[]) arrayListArray36;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder38 = strListBuilder34.add((java.util.ArrayList<java.lang.String>[]) arrayListArray36);
        boolean boolean39 = jSTypeExpression33.equals((java.lang.Object) arrayListArray36);
        boolean boolean40 = jSDocInfoBuilder20.recordDefineType(jSTypeExpression33);
        com.google.javascript.rhino.Node node41 = jSTypeExpression33.getRoot();
        boolean boolean43 = jSDocInfoBuilder16.recordThrowDescription(jSTypeExpression33, "Node tree inequality:\nTree1:\nSTRING  43\n\n\nTree2:\nTYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n\n\nSubtree1: STRING  43\n\n\nSubtree2: TYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder45 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean46 = jSDocInfoBuilder45.isInterfaceRecorded();
        boolean boolean48 = jSDocInfoBuilder45.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj54 = node52.getProp(43);
        boolean boolean55 = node52.isCall();
        boolean boolean56 = node52.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression58 = new com.google.javascript.rhino.JSTypeExpression(node52, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder59 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray61 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray62 = (java.util.ArrayList<java.lang.String>[]) arrayListArray61;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder63 = strListBuilder59.add((java.util.ArrayList<java.lang.String>[]) arrayListArray61);
        boolean boolean64 = jSTypeExpression58.equals((java.lang.Object) arrayListArray61);
        boolean boolean65 = jSDocInfoBuilder45.recordDefineType(jSTypeExpression58);
        boolean boolean66 = jSDocInfoBuilder16.recordEnumParameterType(jSTypeExpression58);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder68 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean69 = jSDocInfoBuilder68.recordNoTypeCheck();
        boolean boolean70 = jSDocInfoBuilder68.isInterfaceRecorded();
        jSDocInfoBuilder68.markAnnotation("[, hi!, , , hi!, , hi!, ]", (int) (short) 0, 2);
        boolean boolean75 = jSDocInfoBuilder68.recordIdGenerator();
        boolean boolean76 = jSDocInfoBuilder68.recordInterface();
        com.google.javascript.rhino.Node node80 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean81 = node80.isVar();
        com.google.javascript.rhino.Node node85 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node86 = node80.copyInformationFromForTree(node85);
        com.google.javascript.rhino.Node node87 = node80.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression89 = new com.google.javascript.rhino.JSTypeExpression(node87, "STRING  43");
        boolean boolean90 = jSTypeExpression89.isVarArgs();
        boolean boolean91 = jSDocInfoBuilder68.recordDefineType(jSTypeExpression89);
        boolean boolean92 = jSDocInfoBuilder16.recordBaseType(jSTypeExpression89);
        boolean boolean93 = jSDocInfoBuilder1.recordParameter("STRING  43\n    NUMBER 0.0 43\n        STRING  43\n", jSTypeExpression89);
        boolean boolean94 = jSDocInfoBuilder1.isConstructorRecorded();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression33 and jSTypeExpression89", jSTypeExpression33.equals(jSTypeExpression89) ? jSTypeExpression33.hashCode() == jSTypeExpression89.hashCode() : true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int4 = node3.getSourceOffset();
        double double5 = node3.getDouble();
        boolean boolean6 = node3.isInc();
        boolean boolean7 = node3.isSetterDef();
        node3.setOptionalArg(false);
        boolean boolean10 = node3.isAssignAdd();
        node3.putIntProp(10, 31);
        boolean boolean14 = node3.isFromExterns();
        java.lang.String str15 = node3.getSourceFileName();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        node19.setDirectives((java.util.Set<java.lang.String>) strSet22);
        boolean boolean25 = node19.isParamList();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean30 = node29.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        node34.setDirectives((java.util.Set<java.lang.String>) strSet37);
        java.lang.Object obj41 = node34.getProp((int) (byte) 1);
        com.google.javascript.rhino.Node node42 = node29.copyInformationFrom(node34);
        boolean boolean43 = node29.isOr();
        int int45 = node29.getIntProp(53);
        com.google.javascript.rhino.Node node46 = node29.cloneNode();
        boolean boolean47 = node46.wasEmptyNode();
        boolean boolean48 = node19.isEquivalentTo(node46);
        java.lang.String str49 = node46.toStringTree();
        boolean boolean50 = node46.isBreak();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node51 = node3.getChildBefore(node46);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean3 = jSDocInfoBuilder1.recordVersion("");
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile5 = null;
        jSDocInfoBuilder1.markName("hi!", staticSourceFile5, (int) (short) 0, (int) (short) 100);
        boolean boolean9 = jSDocInfoBuilder1.recordNoTypeCheck();
        boolean boolean10 = jSDocInfoBuilder1.recordExpose();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node14.addChildrenToFront(node18);
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = jSDocInfoBuilder1.build(node18);
        boolean boolean21 = jSDocInfoBuilder1.shouldParseDocumentation();
        boolean boolean23 = jSDocInfoBuilder1.recordDeprecationReason("Node tree inequality:\nTree1:\nNUMBER 0.0 43 [directives: []]\n\n\nTree2:\nSTRING \n\n\nSubtree1: NUMBER 0.0 43 [directives: []]\n\n\nSubtree2: STRING \n");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder25 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean27 = jSDocInfoBuilder25.recordVersion("");
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile29 = null;
        jSDocInfoBuilder25.markName("hi!", staticSourceFile29, (int) (short) 0, (int) (short) 100);
        boolean boolean33 = jSDocInfoBuilder25.recordNoTypeCheck();
        boolean boolean34 = jSDocInfoBuilder25.recordExpose();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node38.addChildrenToFront(node42);
        com.google.javascript.rhino.JSDocInfo jSDocInfo44 = jSDocInfoBuilder25.build(node42);
        boolean boolean45 = jSDocInfoBuilder25.shouldParseDocumentation();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean50 = node49.isVar();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node55 = node49.copyInformationFromForTree(node54);
        com.google.javascript.rhino.Node node56 = node49.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression58 = new com.google.javascript.rhino.JSTypeExpression(node56, "STRING  43");
        boolean boolean59 = jSTypeExpression58.isVarArgs();
        boolean boolean60 = jSDocInfoBuilder25.recordBaseType(jSTypeExpression58);
        boolean boolean61 = jSTypeExpression58.isOptionalArg();
        boolean boolean62 = jSDocInfoBuilder1.recordBaseType(jSTypeExpression58);
        boolean boolean63 = jSDocInfoBuilder1.isDescriptionRecorded();
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj69 = node67.getProp(43);
        boolean boolean70 = node67.isCall();
        boolean boolean71 = node67.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression73 = new com.google.javascript.rhino.JSTypeExpression(node67, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder74 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray76 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray77 = (java.util.ArrayList<java.lang.String>[]) arrayListArray76;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder78 = strListBuilder74.add((java.util.ArrayList<java.lang.String>[]) arrayListArray76);
        boolean boolean79 = jSTypeExpression73.equals((java.lang.Object) arrayListArray76);
        boolean boolean81 = jSDocInfoBuilder1.recordThrowDescription(jSTypeExpression73, "hi!");
        boolean boolean82 = jSDocInfoBuilder1.recordExterns();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression58 and jSTypeExpression73", jSTypeExpression58.equals(jSTypeExpression73) ? jSTypeExpression58.hashCode() == jSTypeExpression73.hashCode() : true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj5 = node3.getProp(43);
        boolean boolean6 = node3.isCall();
        int int7 = node3.getSourcePosition();
        java.lang.String str11 = node3.toString(false, true, false);
        boolean boolean12 = node3.isExprResult();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder13 = node3.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        node17.setDirectives((java.util.Set<java.lang.String>) strSet20);
        java.lang.Object[] objArray23 = strSet20.toArray();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        node27.setDirectives((java.util.Set<java.lang.String>) strSet30);
        java.lang.Object[] objArray33 = strSet30.toArray();
        boolean boolean34 = strSet20.retainAll((java.util.Collection<java.lang.String>) strSet30);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray40 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet41 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet41, strArray40);
        node38.setDirectives((java.util.Set<java.lang.String>) strSet41);
        boolean boolean44 = strSet30.containsAll((java.util.Collection<java.lang.String>) strSet41);
        node3.setDirectives((java.util.Set<java.lang.String>) strSet30);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("NUMBER 0.0 43", 53, 47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node49);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean2 = jSDocInfoBuilder1.recordNoTypeCheck();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordThisType(jSTypeExpression3);
        boolean boolean5 = jSDocInfoBuilder1.recordOverride();
        boolean boolean6 = jSDocInfoBuilder1.recordExpose();
        boolean boolean7 = jSDocInfoBuilder1.recordIdGenerator();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder9 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean10 = jSDocInfoBuilder9.isInterfaceRecorded();
        boolean boolean11 = jSDocInfoBuilder9.isConstructorRecorded();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder13 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean14 = jSDocInfoBuilder13.isInterfaceRecorded();
        boolean boolean16 = jSDocInfoBuilder13.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj22 = node20.getProp(43);
        boolean boolean23 = node20.isCall();
        boolean boolean24 = node20.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression26 = new com.google.javascript.rhino.JSTypeExpression(node20, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder27 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray29 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray30 = (java.util.ArrayList<java.lang.String>[]) arrayListArray29;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder31 = strListBuilder27.add((java.util.ArrayList<java.lang.String>[]) arrayListArray29);
        boolean boolean32 = jSTypeExpression26.equals((java.lang.Object) arrayListArray29);
        boolean boolean33 = jSDocInfoBuilder13.recordDefineType(jSTypeExpression26);
        com.google.javascript.rhino.Node node34 = jSTypeExpression26.getRoot();
        boolean boolean36 = jSDocInfoBuilder9.recordThrowDescription(jSTypeExpression26, "Node tree inequality:\nTree1:\nSTRING  43\n\n\nTree2:\nTYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n\n\nSubtree1: STRING  43\n\n\nSubtree2: TYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder38 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean39 = jSDocInfoBuilder38.isInterfaceRecorded();
        boolean boolean41 = jSDocInfoBuilder38.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj47 = node45.getProp(43);
        boolean boolean48 = node45.isCall();
        boolean boolean49 = node45.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression51 = new com.google.javascript.rhino.JSTypeExpression(node45, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder52 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray54 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray55 = (java.util.ArrayList<java.lang.String>[]) arrayListArray54;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder56 = strListBuilder52.add((java.util.ArrayList<java.lang.String>[]) arrayListArray54);
        boolean boolean57 = jSTypeExpression51.equals((java.lang.Object) arrayListArray54);
        boolean boolean58 = jSDocInfoBuilder38.recordDefineType(jSTypeExpression51);
        boolean boolean59 = jSDocInfoBuilder9.recordEnumParameterType(jSTypeExpression51);
        boolean boolean60 = jSDocInfoBuilder9.recordNoShadow();
        boolean boolean62 = jSDocInfoBuilder9.recordDeprecationReason("TYPEOF");
        boolean boolean64 = jSDocInfoBuilder9.recordDescription("JSDocInfo");
        boolean boolean65 = jSDocInfoBuilder9.recordInterface();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder67 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean68 = jSDocInfoBuilder67.recordNoTypeCheck();
        boolean boolean69 = jSDocInfoBuilder67.isInterfaceRecorded();
        jSDocInfoBuilder67.markAnnotation("[, hi!, , , hi!, , hi!, ]", (int) (short) 0, 2);
        boolean boolean74 = jSDocInfoBuilder67.recordIdGenerator();
        boolean boolean75 = jSDocInfoBuilder67.recordInterface();
        com.google.javascript.rhino.Node node79 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean80 = node79.isVar();
        com.google.javascript.rhino.Node node84 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node85 = node79.copyInformationFromForTree(node84);
        com.google.javascript.rhino.Node node86 = node79.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression88 = new com.google.javascript.rhino.JSTypeExpression(node86, "STRING  43");
        boolean boolean89 = jSTypeExpression88.isVarArgs();
        boolean boolean90 = jSDocInfoBuilder67.recordDefineType(jSTypeExpression88);
        boolean boolean91 = jSDocInfoBuilder9.recordEnumParameterType(jSTypeExpression88);
        boolean boolean93 = jSDocInfoBuilder1.recordThrowDescription(jSTypeExpression88, "GETELEM");
        boolean boolean94 = jSDocInfoBuilder1.shouldParseDocumentation();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression26 and jSTypeExpression88", jSTypeExpression26.equals(jSTypeExpression88) ? jSTypeExpression26.hashCode() == jSTypeExpression88.hashCode() : true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean4 = node3.isNoSideEffectsCall();
        boolean boolean5 = node3.isFunction();
        int int6 = node3.getCharno();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int11 = node10.getSourceOffset();
        com.google.javascript.rhino.jstype.JSType jSType12 = node10.getJSType();
        boolean boolean13 = node10.isDelProp();
        boolean boolean14 = node10.isQualifiedName();
        com.google.javascript.rhino.Node node15 = node10.cloneTree();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node10);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean3 = jSDocInfoBuilder1.recordVersion("");
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile5 = null;
        jSDocInfoBuilder1.markName("hi!", staticSourceFile5, (int) (short) 0, (int) (short) 100);
        boolean boolean9 = jSDocInfoBuilder1.recordNoTypeCheck();
        boolean boolean10 = jSDocInfoBuilder1.recordExpose();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node14.addChildrenToFront(node18);
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = jSDocInfoBuilder1.build(node18);
        boolean boolean21 = jSDocInfoBuilder1.shouldParseDocumentation();
        boolean boolean23 = jSDocInfoBuilder1.recordDeprecationReason("Node tree inequality:\nTree1:\nNUMBER 0.0 43 [directives: []]\n\n\nTree2:\nSTRING \n\n\nSubtree1: NUMBER 0.0 43 [directives: []]\n\n\nSubtree2: STRING \n");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder25 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean27 = jSDocInfoBuilder25.recordVersion("");
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile29 = null;
        jSDocInfoBuilder25.markName("hi!", staticSourceFile29, (int) (short) 0, (int) (short) 100);
        boolean boolean33 = jSDocInfoBuilder25.recordNoTypeCheck();
        boolean boolean34 = jSDocInfoBuilder25.recordExpose();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node38.addChildrenToFront(node42);
        com.google.javascript.rhino.JSDocInfo jSDocInfo44 = jSDocInfoBuilder25.build(node42);
        boolean boolean45 = jSDocInfoBuilder25.shouldParseDocumentation();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean50 = node49.isVar();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node55 = node49.copyInformationFromForTree(node54);
        com.google.javascript.rhino.Node node56 = node49.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression58 = new com.google.javascript.rhino.JSTypeExpression(node56, "STRING  43");
        boolean boolean59 = jSTypeExpression58.isVarArgs();
        boolean boolean60 = jSDocInfoBuilder25.recordBaseType(jSTypeExpression58);
        boolean boolean61 = jSTypeExpression58.isOptionalArg();
        boolean boolean62 = jSDocInfoBuilder1.recordBaseType(jSTypeExpression58);
        boolean boolean64 = jSDocInfoBuilder1.recordVersion("NUMBER 0.0 43 [directives: []]\n");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder66 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean67 = jSDocInfoBuilder66.recordJavaDispatch();
        boolean boolean68 = jSDocInfoBuilder66.recordNoCompile();
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj75 = node73.getProp(43);
        boolean boolean76 = node73.isCall();
        boolean boolean77 = node73.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression79 = new com.google.javascript.rhino.JSTypeExpression(node73, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder80 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray82 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray83 = (java.util.ArrayList<java.lang.String>[]) arrayListArray82;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder84 = strListBuilder80.add((java.util.ArrayList<java.lang.String>[]) arrayListArray82);
        boolean boolean85 = jSTypeExpression79.equals((java.lang.Object) arrayListArray82);
        boolean boolean86 = jSDocInfoBuilder66.recordParameter("", jSTypeExpression79);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression87 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression79);
        boolean boolean88 = jSDocInfoBuilder1.recordExtendedInterface(jSTypeExpression79);
        boolean boolean89 = jSDocInfoBuilder1.recordIdGenerator();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression58 and jSTypeExpression79", jSTypeExpression58.equals(jSTypeExpression79) ? jSTypeExpression58.hashCode() == jSTypeExpression79.hashCode() : true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(53, "[, hi!, , , hi!, , hi!, ]", (int) '#', 50);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("TYPEOF");
        node7.setType(0);
        boolean boolean10 = node7.isFalse();
        com.google.javascript.rhino.Node node11 = node7.getParent();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(49, node7, 31, 45);
        boolean boolean16 = node7.getBooleanProp(46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.removeChild(node7);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj5 = node3.getProp(43);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int10 = node9.getSourceOffset();
        com.google.javascript.rhino.Node node11 = node3.useSourceInfoIfMissingFromForTree(node9);
        com.google.javascript.rhino.Node node12 = node9.cloneNode();
        boolean boolean13 = node12.isHook();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean18 = node17.isVar();
        node17.putBooleanProp(30, false);
        boolean boolean22 = node17.isSwitch();
        boolean boolean23 = node17.isIn();
        boolean boolean24 = node17.isFromExterns();
        boolean boolean25 = node17.isSyntheticBlock();
        boolean boolean26 = node17.isQuotedString();
        boolean boolean27 = node17.isObjectLit();
        com.google.javascript.rhino.Node node28 = node17.getParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node29 = node12.getChildBefore(node17);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition1 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition2 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition3 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition4 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition5 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean6 = typePosition5.hasBrackets();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.TypePosition> typePositionList7 = com.google.common.collect.ImmutableList.of(typePosition0, typePosition1, typePosition2, typePosition3, typePosition4, typePosition5);
        int int8 = typePosition2.getEndLine();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        boolean boolean13 = node12.isNull();
        boolean boolean14 = node12.isSyntheticBlock();
        boolean boolean15 = node12.hasMoreThanOneChild();
        typePosition2.setItem(node12);
        com.google.javascript.rhino.Node node17 = node12.getParent();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable18 = node12.children();
        boolean boolean19 = node12.isLabelName();
        node12.setVarArgs(false);
        node12.setSourceEncodedPosition(45);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj29 = node27.getProp(43);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int34 = node33.getSourceOffset();
        com.google.javascript.rhino.Node node35 = node27.useSourceInfoIfMissingFromForTree(node33);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray41 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        node39.setDirectives((java.util.Set<java.lang.String>) strSet42);
        com.google.javascript.rhino.Node node45 = node33.useSourceInfoIfMissingFromForTree(node39);
        boolean boolean46 = node39.isThrow();
        boolean boolean47 = node39.isNot();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node52 = node39.useSourceInfoFromForTree(node51);
        boolean boolean53 = node52.isQuotedString();
        boolean boolean54 = node52.isNE();
        boolean boolean55 = node52.isArrayLit();
        boolean boolean56 = node52.isVoid();
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj63 = node61.getProp(43);
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int68 = node67.getSourceOffset();
        com.google.javascript.rhino.Node node69 = node61.useSourceInfoIfMissingFromForTree(node67);
        int int70 = node61.getSourceOffset();
        com.google.javascript.rhino.JSDocInfo jSDocInfo71 = node61.getJSDocInfo();
        com.google.javascript.rhino.Node node74 = new com.google.javascript.rhino.Node(49, node61, (int) (byte) -1, (int) 'a');
        node61.detachChildren();
        boolean boolean76 = node61.isObjectLit();
        com.google.javascript.rhino.Node node77 = node52.srcref(node61);
        node61.setSourceFileForTesting("STRING  43");
        boolean boolean80 = node61.isScript();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node12.removeChild(node61);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj5 = node3.getProp(43);
        boolean boolean6 = node3.isCall();
        int int7 = node3.getSourcePosition();
        java.lang.String str11 = node3.toString(false, true, false);
        boolean boolean12 = node3.isNot();
        boolean boolean13 = node3.isString();
        int int14 = node3.getCharno();
        boolean boolean15 = node3.isOptionalArg();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj22 = node20.getProp(43);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        boolean boolean27 = node26.isIf();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj33 = node31.getProp(43);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int38 = node37.getSourceOffset();
        com.google.javascript.rhino.Node node39 = node31.useSourceInfoIfMissingFromForTree(node37);
        boolean boolean40 = node39.isAssignAdd();
        boolean boolean41 = node39.isEmpty();
        node39.setSourceEncodedPosition(40);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean48 = node47.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray54 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet55 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet55, strArray54);
        node52.setDirectives((java.util.Set<java.lang.String>) strSet55);
        java.lang.Object obj59 = node52.getProp((int) (byte) 1);
        com.google.javascript.rhino.Node node60 = node47.copyInformationFrom(node52);
        boolean boolean61 = node47.isOr();
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node(1, node20, node26, node39, node47, 176180, 1);
        boolean boolean65 = node26.isInstanceOf();
        boolean boolean66 = node26.isHook();
        com.google.javascript.rhino.Node node67 = node3.copyInformationFromForTree(node26);
        node3.setString("Node tree inequality:\nTree1:\nSTRING \n\n\nTree2:\nNUMBER 0.0 43 [directives: []]\n\n\nSubtree1: STRING \n\n\nSubtree2: NUMBER 0.0 43 [directives: []]\n");
        node3.setLineno(53);
        boolean boolean72 = node3.isHook();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node74 = node3.getChildAtIndex((int) (short) 10);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 12);
        boolean boolean3 = node1.getBooleanProp(51);
        boolean boolean4 = node1.isSwitch();
        node1.putBooleanProp(100, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node9 = node1.getChildAtIndex(30);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean2 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean3 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder5 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean6 = jSDocInfoBuilder5.isInterfaceRecorded();
        boolean boolean8 = jSDocInfoBuilder5.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj14 = node12.getProp(43);
        boolean boolean15 = node12.isCall();
        boolean boolean16 = node12.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression18 = new com.google.javascript.rhino.JSTypeExpression(node12, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder19 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray21 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray22 = (java.util.ArrayList<java.lang.String>[]) arrayListArray21;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder23 = strListBuilder19.add((java.util.ArrayList<java.lang.String>[]) arrayListArray21);
        boolean boolean24 = jSTypeExpression18.equals((java.lang.Object) arrayListArray21);
        boolean boolean25 = jSDocInfoBuilder5.recordDefineType(jSTypeExpression18);
        boolean boolean26 = jSTypeExpression18.isVarArgs();
        java.lang.Object obj27 = null;
        boolean boolean28 = jSTypeExpression18.equals(obj27);
        boolean boolean29 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression18);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean34 = node33.isVar();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node39 = node33.copyInformationFromForTree(node38);
        com.google.javascript.rhino.Node node40 = node33.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression42 = new com.google.javascript.rhino.JSTypeExpression(node40, "STRING  43");
        boolean boolean43 = jSDocInfoBuilder1.recordExtendedInterface(jSTypeExpression42);
        boolean boolean44 = jSDocInfoBuilder1.isConstructorRecorded();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression18 and jSTypeExpression42", jSTypeExpression18.equals(jSTypeExpression42) ? jSTypeExpression18.hashCode() == jSTypeExpression42.hashCode() : true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj5 = node3.getProp(43);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int10 = node9.getSourceOffset();
        com.google.javascript.rhino.Node node11 = node3.useSourceInfoIfMissingFromForTree(node9);
        boolean boolean12 = node11.isSyntheticBlock();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile13 = node11.getStaticSourceFile();
        boolean boolean14 = node11.isStringKey();
        boolean boolean15 = node11.isThis();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString((int) (short) 10, "STRING  43");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node19 = node11.getChildBefore(node18);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node3.addChildrenToFront(node7);
        boolean boolean9 = node7.isLabelName();
        boolean boolean10 = node7.hasMoreThanOneChild();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition11 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean12 = typePosition11.hasBrackets();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean17 = node16.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        node21.setDirectives((java.util.Set<java.lang.String>) strSet24);
        java.lang.Object obj28 = node21.getProp((int) (byte) 1);
        com.google.javascript.rhino.Node node29 = node16.copyInformationFrom(node21);
        typePosition11.setItem(node29);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj36 = node34.getProp(43);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int41 = node40.getSourceOffset();
        com.google.javascript.rhino.Node node42 = node34.useSourceInfoIfMissingFromForTree(node40);
        boolean boolean43 = node42.isAssignAdd();
        boolean boolean44 = node42.isFromExterns();
        com.google.javascript.rhino.Node node45 = node29.copyInformationFromForTree(node42);
        node45.setWasEmptyNode(false);
        boolean boolean48 = node45.isTypeOf();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node49 = node7.getChildBefore(node45);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean2 = jSDocInfoBuilder1.recordNoTypeCheck();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordThisType(jSTypeExpression3);
        boolean boolean5 = jSDocInfoBuilder1.recordOverride();
        boolean boolean6 = jSDocInfoBuilder1.recordExpose();
        boolean boolean7 = jSDocInfoBuilder1.recordIdGenerator();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder9 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean10 = jSDocInfoBuilder9.isInterfaceRecorded();
        boolean boolean11 = jSDocInfoBuilder9.isConstructorRecorded();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder13 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean14 = jSDocInfoBuilder13.isInterfaceRecorded();
        boolean boolean16 = jSDocInfoBuilder13.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj22 = node20.getProp(43);
        boolean boolean23 = node20.isCall();
        boolean boolean24 = node20.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression26 = new com.google.javascript.rhino.JSTypeExpression(node20, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder27 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray29 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray30 = (java.util.ArrayList<java.lang.String>[]) arrayListArray29;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder31 = strListBuilder27.add((java.util.ArrayList<java.lang.String>[]) arrayListArray29);
        boolean boolean32 = jSTypeExpression26.equals((java.lang.Object) arrayListArray29);
        boolean boolean33 = jSDocInfoBuilder13.recordDefineType(jSTypeExpression26);
        com.google.javascript.rhino.Node node34 = jSTypeExpression26.getRoot();
        boolean boolean36 = jSDocInfoBuilder9.recordThrowDescription(jSTypeExpression26, "Node tree inequality:\nTree1:\nSTRING  43\n\n\nTree2:\nTYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n\n\nSubtree1: STRING  43\n\n\nSubtree2: TYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder38 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean39 = jSDocInfoBuilder38.isInterfaceRecorded();
        boolean boolean41 = jSDocInfoBuilder38.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj47 = node45.getProp(43);
        boolean boolean48 = node45.isCall();
        boolean boolean49 = node45.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression51 = new com.google.javascript.rhino.JSTypeExpression(node45, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder52 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray54 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray55 = (java.util.ArrayList<java.lang.String>[]) arrayListArray54;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder56 = strListBuilder52.add((java.util.ArrayList<java.lang.String>[]) arrayListArray54);
        boolean boolean57 = jSTypeExpression51.equals((java.lang.Object) arrayListArray54);
        boolean boolean58 = jSDocInfoBuilder38.recordDefineType(jSTypeExpression51);
        boolean boolean59 = jSDocInfoBuilder9.recordEnumParameterType(jSTypeExpression51);
        boolean boolean60 = jSDocInfoBuilder9.recordNoShadow();
        boolean boolean62 = jSDocInfoBuilder9.recordDeprecationReason("TYPEOF");
        boolean boolean64 = jSDocInfoBuilder9.recordDescription("JSDocInfo");
        boolean boolean65 = jSDocInfoBuilder9.recordInterface();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder67 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean68 = jSDocInfoBuilder67.recordNoTypeCheck();
        boolean boolean69 = jSDocInfoBuilder67.isInterfaceRecorded();
        jSDocInfoBuilder67.markAnnotation("[, hi!, , , hi!, , hi!, ]", (int) (short) 0, 2);
        boolean boolean74 = jSDocInfoBuilder67.recordIdGenerator();
        boolean boolean75 = jSDocInfoBuilder67.recordInterface();
        com.google.javascript.rhino.Node node79 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean80 = node79.isVar();
        com.google.javascript.rhino.Node node84 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node85 = node79.copyInformationFromForTree(node84);
        com.google.javascript.rhino.Node node86 = node79.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression88 = new com.google.javascript.rhino.JSTypeExpression(node86, "STRING  43");
        boolean boolean89 = jSTypeExpression88.isVarArgs();
        boolean boolean90 = jSDocInfoBuilder67.recordDefineType(jSTypeExpression88);
        boolean boolean91 = jSDocInfoBuilder9.recordEnumParameterType(jSTypeExpression88);
        boolean boolean93 = jSDocInfoBuilder1.recordThrowDescription(jSTypeExpression88, "GETELEM");
        boolean boolean94 = jSDocInfoBuilder1.recordConsistentIdGenerator();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression26 and jSTypeExpression88", jSTypeExpression26.equals(jSTypeExpression88) ? jSTypeExpression26.hashCode() == jSTypeExpression88.hashCode() : true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean4 = node3.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        node8.setDirectives((java.util.Set<java.lang.String>) strSet11);
        java.lang.Object obj15 = node8.getProp((int) (byte) 1);
        com.google.javascript.rhino.Node node16 = node3.copyInformationFrom(node8);
        boolean boolean17 = node8.isDefaultCase();
        boolean boolean18 = node8.isWhile();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj24 = node22.getProp(43);
        int int25 = node22.getType();
        boolean boolean26 = node22.isGetterDef();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) 12);
        com.google.javascript.rhino.Node node29 = node28.removeChildren();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable30 = node28.getAncestors();
        com.google.javascript.rhino.Node node31 = node22.srcref(node28);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean36 = node35.isOptionalArg();
        boolean boolean37 = node35.isSwitch();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node42.addChildrenToFront(node46);
        boolean boolean48 = node42.isGetterDef();
        boolean boolean49 = node42.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj55 = node53.getProp(43);
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int60 = node59.getSourceOffset();
        com.google.javascript.rhino.Node node61 = node53.useSourceInfoIfMissingFromForTree(node59);
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray67 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet68 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet68, strArray67);
        node65.setDirectives((java.util.Set<java.lang.String>) strSet68);
        com.google.javascript.rhino.Node node71 = node59.useSourceInfoIfMissingFromForTree(node65);
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node(32, node42, node59);
        boolean boolean73 = node72.isExprResult();
        boolean boolean74 = node72.isFunction();
        com.google.javascript.rhino.Node node75 = node35.srcrefTree(node72);
        com.google.javascript.rhino.Node node76 = node22.copyInformationFrom(node35);
        boolean boolean77 = node35.isBlock();
        boolean boolean78 = node35.isArrayLit();
        boolean boolean79 = node35.isOnlyModifiesThisCall();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile80 = node35.getStaticSourceFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node8.removeChild(node35);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean2 = jSDocInfoBuilder1.isInterfaceRecorded();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = null;
        boolean boolean5 = jSDocInfoBuilder1.recordParameter("", jSTypeExpression4);
        boolean boolean6 = jSDocInfoBuilder1.recordExterns();
        boolean boolean7 = jSDocInfoBuilder1.recordPreserveTry();
        boolean boolean8 = jSDocInfoBuilder1.recordNoCompile();
        boolean boolean10 = jSDocInfoBuilder1.recordLends("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = null;
        boolean boolean12 = jSDocInfoBuilder1.recordType(jSTypeExpression11);
        boolean boolean13 = jSDocInfoBuilder1.recordNoCompile();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder16 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean17 = jSDocInfoBuilder16.isInterfaceRecorded();
        boolean boolean18 = jSDocInfoBuilder16.isConstructorRecorded();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder20 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean21 = jSDocInfoBuilder20.isInterfaceRecorded();
        boolean boolean23 = jSDocInfoBuilder20.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj29 = node27.getProp(43);
        boolean boolean30 = node27.isCall();
        boolean boolean31 = node27.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression33 = new com.google.javascript.rhino.JSTypeExpression(node27, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder34 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray36 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray37 = (java.util.ArrayList<java.lang.String>[]) arrayListArray36;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder38 = strListBuilder34.add((java.util.ArrayList<java.lang.String>[]) arrayListArray36);
        boolean boolean39 = jSTypeExpression33.equals((java.lang.Object) arrayListArray36);
        boolean boolean40 = jSDocInfoBuilder20.recordDefineType(jSTypeExpression33);
        com.google.javascript.rhino.Node node41 = jSTypeExpression33.getRoot();
        boolean boolean43 = jSDocInfoBuilder16.recordThrowDescription(jSTypeExpression33, "Node tree inequality:\nTree1:\nSTRING  43\n\n\nTree2:\nTYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n\n\nSubtree1: STRING  43\n\n\nSubtree2: TYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder45 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean46 = jSDocInfoBuilder45.isInterfaceRecorded();
        boolean boolean48 = jSDocInfoBuilder45.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj54 = node52.getProp(43);
        boolean boolean55 = node52.isCall();
        boolean boolean56 = node52.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression58 = new com.google.javascript.rhino.JSTypeExpression(node52, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder59 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray61 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray62 = (java.util.ArrayList<java.lang.String>[]) arrayListArray61;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder63 = strListBuilder59.add((java.util.ArrayList<java.lang.String>[]) arrayListArray61);
        boolean boolean64 = jSTypeExpression58.equals((java.lang.Object) arrayListArray61);
        boolean boolean65 = jSDocInfoBuilder45.recordDefineType(jSTypeExpression58);
        boolean boolean66 = jSDocInfoBuilder16.recordEnumParameterType(jSTypeExpression58);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder68 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean69 = jSDocInfoBuilder68.recordNoTypeCheck();
        boolean boolean70 = jSDocInfoBuilder68.isInterfaceRecorded();
        jSDocInfoBuilder68.markAnnotation("[, hi!, , , hi!, , hi!, ]", (int) (short) 0, 2);
        boolean boolean75 = jSDocInfoBuilder68.recordIdGenerator();
        boolean boolean76 = jSDocInfoBuilder68.recordInterface();
        com.google.javascript.rhino.Node node80 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean81 = node80.isVar();
        com.google.javascript.rhino.Node node85 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node86 = node80.copyInformationFromForTree(node85);
        com.google.javascript.rhino.Node node87 = node80.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression89 = new com.google.javascript.rhino.JSTypeExpression(node87, "STRING  43");
        boolean boolean90 = jSTypeExpression89.isVarArgs();
        boolean boolean91 = jSDocInfoBuilder68.recordDefineType(jSTypeExpression89);
        boolean boolean92 = jSDocInfoBuilder16.recordBaseType(jSTypeExpression89);
        boolean boolean93 = jSDocInfoBuilder1.recordParameter("STRING  43\n    NUMBER 0.0 43\n        STRING  43\n", jSTypeExpression89);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression94 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression89);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression95 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression94);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression33 and jSTypeExpression89", jSTypeExpression33.equals(jSTypeExpression89) ? jSTypeExpression33.hashCode() == jSTypeExpression89.hashCode() : true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean2 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean3 = jSDocInfoBuilder1.recordConstructor();
        boolean boolean4 = jSDocInfoBuilder1.shouldParseDocumentation();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder6 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean7 = jSDocInfoBuilder6.recordNoTypeCheck();
        jSDocInfoBuilder6.recordOriginalCommentString("");
        boolean boolean10 = jSDocInfoBuilder6.isJavaDispatch();
        boolean boolean11 = jSDocInfoBuilder6.isPopulatedWithFileOverview();
        boolean boolean12 = jSDocInfoBuilder6.recordOverride();
        boolean boolean14 = jSDocInfoBuilder6.addReference("Node tree inequality:\nTree1:\nSTRING  43\n\n\nTree2:\nTYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n\n\nSubtree1: STRING  43\n\n\nSubtree2: TYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n");
        boolean boolean16 = jSDocInfoBuilder6.addAuthor("STRING \n");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder18 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean19 = jSDocInfoBuilder18.isInterfaceRecorded();
        boolean boolean20 = jSDocInfoBuilder18.isConstructorRecorded();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder22 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean23 = jSDocInfoBuilder22.isInterfaceRecorded();
        boolean boolean25 = jSDocInfoBuilder22.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj31 = node29.getProp(43);
        boolean boolean32 = node29.isCall();
        boolean boolean33 = node29.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression35 = new com.google.javascript.rhino.JSTypeExpression(node29, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder36 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray38 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray39 = (java.util.ArrayList<java.lang.String>[]) arrayListArray38;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder40 = strListBuilder36.add((java.util.ArrayList<java.lang.String>[]) arrayListArray38);
        boolean boolean41 = jSTypeExpression35.equals((java.lang.Object) arrayListArray38);
        boolean boolean42 = jSDocInfoBuilder22.recordDefineType(jSTypeExpression35);
        com.google.javascript.rhino.Node node43 = jSTypeExpression35.getRoot();
        boolean boolean45 = jSDocInfoBuilder18.recordThrowDescription(jSTypeExpression35, "Node tree inequality:\nTree1:\nSTRING  43\n\n\nTree2:\nTYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n\n\nSubtree1: STRING  43\n\n\nSubtree2: TYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder47 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean48 = jSDocInfoBuilder47.isInterfaceRecorded();
        boolean boolean50 = jSDocInfoBuilder47.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj56 = node54.getProp(43);
        boolean boolean57 = node54.isCall();
        boolean boolean58 = node54.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression60 = new com.google.javascript.rhino.JSTypeExpression(node54, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder61 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray63 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray64 = (java.util.ArrayList<java.lang.String>[]) arrayListArray63;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder65 = strListBuilder61.add((java.util.ArrayList<java.lang.String>[]) arrayListArray63);
        boolean boolean66 = jSTypeExpression60.equals((java.lang.Object) arrayListArray63);
        boolean boolean67 = jSDocInfoBuilder47.recordDefineType(jSTypeExpression60);
        boolean boolean68 = jSDocInfoBuilder18.recordEnumParameterType(jSTypeExpression60);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder70 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean71 = jSDocInfoBuilder70.recordNoTypeCheck();
        boolean boolean72 = jSDocInfoBuilder70.isInterfaceRecorded();
        jSDocInfoBuilder70.markAnnotation("[, hi!, , , hi!, , hi!, ]", (int) (short) 0, 2);
        boolean boolean77 = jSDocInfoBuilder70.recordIdGenerator();
        boolean boolean78 = jSDocInfoBuilder70.recordInterface();
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean83 = node82.isVar();
        com.google.javascript.rhino.Node node87 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node88 = node82.copyInformationFromForTree(node87);
        com.google.javascript.rhino.Node node89 = node82.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression91 = new com.google.javascript.rhino.JSTypeExpression(node89, "STRING  43");
        boolean boolean92 = jSTypeExpression91.isVarArgs();
        boolean boolean93 = jSDocInfoBuilder70.recordDefineType(jSTypeExpression91);
        boolean boolean94 = jSDocInfoBuilder18.recordBaseType(jSTypeExpression91);
        boolean boolean95 = jSDocInfoBuilder6.recordEnumParameterType(jSTypeExpression91);
        boolean boolean96 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression91);
        boolean boolean97 = jSDocInfoBuilder1.recordNoTypeCheck();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression35 and jSTypeExpression91", jSTypeExpression35.equals(jSTypeExpression91) ? jSTypeExpression35.hashCode() == jSTypeExpression91.hashCode() : true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("[, hi!, , , hi!, , hi!, ]", 35, 26);
        com.google.javascript.rhino.Node node4 = node3.removeFirstChild();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean9 = node8.isVar();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node14 = node8.copyInformationFromForTree(node13);
        boolean boolean15 = node14.hasMoreThanOneChild();
        boolean boolean16 = node14.isQuotedString();
        int int17 = node14.getSourcePosition();
        boolean boolean18 = node14.isComma();
        boolean boolean19 = node14.isGetProp();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression21 = new com.google.javascript.rhino.JSTypeExpression(node14, "Node tree inequality:\nTree1:\nTYPEOF [jsdoc_info: JSDocInfo]\n    NUMBER 0.0 43\n        STRING  43\n    NUMBER 0.0 43\n\n\nTree2:\nOR 0\n\n\nSubtree1: TYPEOF [jsdoc_info: JSDocInfo]\n    NUMBER 0.0 43\n        STRING  43\n    NUMBER 0.0 43\n\n\nSubtree2: OR 0\n");
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj27 = node25.getProp(43);
        boolean boolean28 = node25.isCall();
        boolean boolean29 = node25.isEmpty();
        boolean boolean30 = node25.isInstanceOf();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.replaceChild(node14, node25);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean2 = jSDocInfoBuilder1.recordNoTypeCheck();
        jSDocInfoBuilder1.recordOriginalCommentString("");
        boolean boolean5 = jSDocInfoBuilder1.isJavaDispatch();
        boolean boolean6 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        boolean boolean7 = jSDocInfoBuilder1.recordOverride();
        boolean boolean9 = jSDocInfoBuilder1.addReference("Node tree inequality:\nTree1:\nSTRING  43\n\n\nTree2:\nTYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n\n\nSubtree1: STRING  43\n\n\nSubtree2: TYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n");
        boolean boolean11 = jSDocInfoBuilder1.addAuthor("STRING \n");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder13 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean14 = jSDocInfoBuilder13.isInterfaceRecorded();
        boolean boolean15 = jSDocInfoBuilder13.isConstructorRecorded();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder17 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean18 = jSDocInfoBuilder17.isInterfaceRecorded();
        boolean boolean20 = jSDocInfoBuilder17.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj26 = node24.getProp(43);
        boolean boolean27 = node24.isCall();
        boolean boolean28 = node24.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression30 = new com.google.javascript.rhino.JSTypeExpression(node24, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder31 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray33 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray34 = (java.util.ArrayList<java.lang.String>[]) arrayListArray33;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder35 = strListBuilder31.add((java.util.ArrayList<java.lang.String>[]) arrayListArray33);
        boolean boolean36 = jSTypeExpression30.equals((java.lang.Object) arrayListArray33);
        boolean boolean37 = jSDocInfoBuilder17.recordDefineType(jSTypeExpression30);
        com.google.javascript.rhino.Node node38 = jSTypeExpression30.getRoot();
        boolean boolean40 = jSDocInfoBuilder13.recordThrowDescription(jSTypeExpression30, "Node tree inequality:\nTree1:\nSTRING  43\n\n\nTree2:\nTYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n\n\nSubtree1: STRING  43\n\n\nSubtree2: TYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder42 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean43 = jSDocInfoBuilder42.isInterfaceRecorded();
        boolean boolean45 = jSDocInfoBuilder42.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj51 = node49.getProp(43);
        boolean boolean52 = node49.isCall();
        boolean boolean53 = node49.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression55 = new com.google.javascript.rhino.JSTypeExpression(node49, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder56 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray58 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray59 = (java.util.ArrayList<java.lang.String>[]) arrayListArray58;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder60 = strListBuilder56.add((java.util.ArrayList<java.lang.String>[]) arrayListArray58);
        boolean boolean61 = jSTypeExpression55.equals((java.lang.Object) arrayListArray58);
        boolean boolean62 = jSDocInfoBuilder42.recordDefineType(jSTypeExpression55);
        boolean boolean63 = jSDocInfoBuilder13.recordEnumParameterType(jSTypeExpression55);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder65 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean66 = jSDocInfoBuilder65.recordNoTypeCheck();
        boolean boolean67 = jSDocInfoBuilder65.isInterfaceRecorded();
        jSDocInfoBuilder65.markAnnotation("[, hi!, , , hi!, , hi!, ]", (int) (short) 0, 2);
        boolean boolean72 = jSDocInfoBuilder65.recordIdGenerator();
        boolean boolean73 = jSDocInfoBuilder65.recordInterface();
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean78 = node77.isVar();
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node83 = node77.copyInformationFromForTree(node82);
        com.google.javascript.rhino.Node node84 = node77.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression86 = new com.google.javascript.rhino.JSTypeExpression(node84, "STRING  43");
        boolean boolean87 = jSTypeExpression86.isVarArgs();
        boolean boolean88 = jSDocInfoBuilder65.recordDefineType(jSTypeExpression86);
        boolean boolean89 = jSDocInfoBuilder13.recordBaseType(jSTypeExpression86);
        boolean boolean90 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression86);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile92 = null;
        jSDocInfoBuilder1.markName("FALSE 43", staticSourceFile92, 16, 5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression30 and jSTypeExpression86", jSTypeExpression30.equals(jSTypeExpression86) ? jSTypeExpression30.hashCode() == jSTypeExpression86.hashCode() : true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean5 = node4.isVar();
        node4.putBooleanProp(30, false);
        boolean boolean9 = node4.isSwitch();
        boolean boolean10 = node4.isIn();
        node4.setWasEmptyNode(true);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) 'a', node4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node15 = node4.getChildAtIndex(15);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj5 = node3.getProp(43);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int10 = node9.getSourceOffset();
        com.google.javascript.rhino.Node node11 = node3.useSourceInfoIfMissingFromForTree(node9);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        node15.setDirectives((java.util.Set<java.lang.String>) strSet18);
        com.google.javascript.rhino.Node node21 = node9.useSourceInfoIfMissingFromForTree(node15);
        boolean boolean22 = node15.isThrow();
        boolean boolean23 = node15.isNot();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean28 = node27.isVar();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node33 = node27.copyInformationFromForTree(node32);
        java.lang.String str34 = node15.checkTreeEquals(node33);
        boolean boolean36 = node33.getBooleanProp(43);
        boolean boolean37 = node33.isIn();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj43 = node41.getProp(43);
        int int44 = node41.getType();
        boolean boolean45 = node41.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node46 = node33.clonePropsFrom(node41);
        com.google.javascript.rhino.InputId inputId47 = node46.getInputId();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj53 = node51.getProp(43);
        boolean boolean54 = node51.isCall();
        int int55 = node51.getSourcePosition();
        java.lang.String str59 = node51.toString(false, true, false);
        boolean boolean60 = node51.isExprResult();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder61 = node51.getJsDocBuilderForNode();
        boolean boolean62 = node51.isSwitch();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable63 = node51.getAncestors();
        java.lang.String str64 = node51.getQualifiedName();
        java.lang.String str65 = node46.checkTreeEquals(node51);
        com.google.javascript.rhino.Node[] nodeArray70 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node(42, nodeArray70, (int) (byte) 1, 43);
        com.google.javascript.rhino.Node node74 = new com.google.javascript.rhino.Node((int) (short) 1, nodeArray70);
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node(36, nodeArray70, 40, 4);
        com.google.javascript.rhino.Node node80 = new com.google.javascript.rhino.Node(12, nodeArray70, 18, 18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node81 = node51.getChildBefore(node80);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean2 = jSDocInfoBuilder1.recordNoTypeCheck();
        jSDocInfoBuilder1.recordOriginalCommentString("");
        boolean boolean5 = jSDocInfoBuilder1.isJavaDispatch();
        boolean boolean6 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        boolean boolean7 = jSDocInfoBuilder1.recordOverride();
        boolean boolean9 = jSDocInfoBuilder1.addReference("Node tree inequality:\nTree1:\nSTRING  43\n\n\nTree2:\nTYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n\n\nSubtree1: STRING  43\n\n\nSubtree2: TYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n");
        boolean boolean11 = jSDocInfoBuilder1.addAuthor("STRING \n");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder13 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean14 = jSDocInfoBuilder13.isInterfaceRecorded();
        boolean boolean15 = jSDocInfoBuilder13.isConstructorRecorded();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder17 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean18 = jSDocInfoBuilder17.isInterfaceRecorded();
        boolean boolean20 = jSDocInfoBuilder17.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj26 = node24.getProp(43);
        boolean boolean27 = node24.isCall();
        boolean boolean28 = node24.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression30 = new com.google.javascript.rhino.JSTypeExpression(node24, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder31 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray33 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray34 = (java.util.ArrayList<java.lang.String>[]) arrayListArray33;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder35 = strListBuilder31.add((java.util.ArrayList<java.lang.String>[]) arrayListArray33);
        boolean boolean36 = jSTypeExpression30.equals((java.lang.Object) arrayListArray33);
        boolean boolean37 = jSDocInfoBuilder17.recordDefineType(jSTypeExpression30);
        com.google.javascript.rhino.Node node38 = jSTypeExpression30.getRoot();
        boolean boolean40 = jSDocInfoBuilder13.recordThrowDescription(jSTypeExpression30, "Node tree inequality:\nTree1:\nSTRING  43\n\n\nTree2:\nTYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n\n\nSubtree1: STRING  43\n\n\nSubtree2: TYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder42 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean43 = jSDocInfoBuilder42.isInterfaceRecorded();
        boolean boolean45 = jSDocInfoBuilder42.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj51 = node49.getProp(43);
        boolean boolean52 = node49.isCall();
        boolean boolean53 = node49.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression55 = new com.google.javascript.rhino.JSTypeExpression(node49, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder56 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray58 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray59 = (java.util.ArrayList<java.lang.String>[]) arrayListArray58;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder60 = strListBuilder56.add((java.util.ArrayList<java.lang.String>[]) arrayListArray58);
        boolean boolean61 = jSTypeExpression55.equals((java.lang.Object) arrayListArray58);
        boolean boolean62 = jSDocInfoBuilder42.recordDefineType(jSTypeExpression55);
        boolean boolean63 = jSDocInfoBuilder13.recordEnumParameterType(jSTypeExpression55);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder65 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean66 = jSDocInfoBuilder65.recordNoTypeCheck();
        boolean boolean67 = jSDocInfoBuilder65.isInterfaceRecorded();
        jSDocInfoBuilder65.markAnnotation("[, hi!, , , hi!, , hi!, ]", (int) (short) 0, 2);
        boolean boolean72 = jSDocInfoBuilder65.recordIdGenerator();
        boolean boolean73 = jSDocInfoBuilder65.recordInterface();
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean78 = node77.isVar();
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node83 = node77.copyInformationFromForTree(node82);
        com.google.javascript.rhino.Node node84 = node77.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression86 = new com.google.javascript.rhino.JSTypeExpression(node84, "STRING  43");
        boolean boolean87 = jSTypeExpression86.isVarArgs();
        boolean boolean88 = jSDocInfoBuilder65.recordDefineType(jSTypeExpression86);
        boolean boolean89 = jSDocInfoBuilder13.recordBaseType(jSTypeExpression86);
        boolean boolean90 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression86);
        boolean boolean91 = jSTypeExpression86.isOptionalArg();
        com.google.javascript.rhino.Node node92 = jSTypeExpression86.getRoot();
        boolean boolean93 = node92.isStringKey();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression30 and jSTypeExpression86", jSTypeExpression30.equals(jSTypeExpression86) ? jSTypeExpression30.hashCode() == jSTypeExpression86.hashCode() : true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj6 = node4.getProp(43);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int11 = node10.getSourceOffset();
        com.google.javascript.rhino.Node node12 = node4.useSourceInfoIfMissingFromForTree(node10);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        node16.setDirectives((java.util.Set<java.lang.String>) strSet19);
        com.google.javascript.rhino.Node node22 = node10.useSourceInfoIfMissingFromForTree(node16);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj28 = node26.getProp(43);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int33 = node32.getSourceOffset();
        com.google.javascript.rhino.Node node34 = node26.useSourceInfoIfMissingFromForTree(node32);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray40 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet41 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet41, strArray40);
        node38.setDirectives((java.util.Set<java.lang.String>) strSet41);
        com.google.javascript.rhino.Node node44 = node32.useSourceInfoIfMissingFromForTree(node38);
        boolean boolean45 = node44.isContinue();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj51 = node49.getProp(43);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int56 = node55.getSourceOffset();
        com.google.javascript.rhino.Node node57 = node49.useSourceInfoIfMissingFromForTree(node55);
        boolean boolean58 = node57.isAssignAdd();
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean63 = node62.isVar();
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node((int) ' ', node16, node44, node57, node62, 1, 100);
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node70.addChildrenToFront(node74);
        com.google.javascript.rhino.Node node77 = node70.getChildAtIndex(0);
        java.lang.String str78 = node77.toString();
        boolean boolean79 = node77.isExprResult();
        boolean boolean80 = node77.isCall();
        com.google.javascript.rhino.Node node81 = node62.srcrefTree(node77);
        boolean boolean82 = node77.isIn();
        boolean boolean83 = node77.isQualifiedName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node85 = node77.getChildAtIndex((int) '#');
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean2 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean3 = jSDocInfoBuilder1.recordNoCompile();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj10 = node8.getProp(43);
        boolean boolean11 = node8.isCall();
        boolean boolean12 = node8.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression14 = new com.google.javascript.rhino.JSTypeExpression(node8, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder15 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray17 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray18 = (java.util.ArrayList<java.lang.String>[]) arrayListArray17;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder19 = strListBuilder15.add((java.util.ArrayList<java.lang.String>[]) arrayListArray17);
        boolean boolean20 = jSTypeExpression14.equals((java.lang.Object) arrayListArray17);
        boolean boolean21 = jSDocInfoBuilder1.recordParameter("", jSTypeExpression14);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder23 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean24 = jSDocInfoBuilder23.isInterfaceRecorded();
        boolean boolean26 = jSDocInfoBuilder23.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj32 = node30.getProp(43);
        boolean boolean33 = node30.isCall();
        boolean boolean34 = node30.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression36 = new com.google.javascript.rhino.JSTypeExpression(node30, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder37 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray39 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray40 = (java.util.ArrayList<java.lang.String>[]) arrayListArray39;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder41 = strListBuilder37.add((java.util.ArrayList<java.lang.String>[]) arrayListArray39);
        boolean boolean42 = jSTypeExpression36.equals((java.lang.Object) arrayListArray39);
        boolean boolean43 = jSDocInfoBuilder23.recordDefineType(jSTypeExpression36);
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition44 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int45 = namePosition44.getEndLine();
        int int46 = namePosition44.getStartLine();
        com.google.javascript.rhino.Node node47 = namePosition44.getItem();
        boolean boolean48 = jSTypeExpression36.equals((java.lang.Object) node47);
        boolean boolean49 = jSTypeExpression36.isOptionalArg();
        boolean boolean50 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression36);
        boolean boolean51 = jSTypeExpression36.isOptionalArg();
        com.google.javascript.rhino.Node node52 = jSTypeExpression36.getRoot();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder55 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean56 = jSDocInfoBuilder55.recordNoTypeCheck();
        boolean boolean58 = jSDocInfoBuilder55.addAuthor("");
        boolean boolean59 = jSDocInfoBuilder55.recordExpose();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean64 = node63.isVar();
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node69 = node63.copyInformationFromForTree(node68);
        boolean boolean70 = node69.isVarArgs();
        com.google.javascript.rhino.JSDocInfo jSDocInfo71 = jSDocInfoBuilder55.build(node69);
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node(30, node69);
        com.google.javascript.rhino.Node node73 = node52.srcrefTree(node72);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression14 and jSTypeExpression36", jSTypeExpression14.equals(jSTypeExpression36) ? jSTypeExpression14.hashCode() == jSTypeExpression36.hashCode() : true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean2 = jSDocInfoBuilder1.recordNoTypeCheck();
        jSDocInfoBuilder1.recordOriginalCommentString("");
        boolean boolean5 = jSDocInfoBuilder1.isJavaDispatch();
        boolean boolean6 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        boolean boolean7 = jSDocInfoBuilder1.recordOverride();
        boolean boolean9 = jSDocInfoBuilder1.addReference("Node tree inequality:\nTree1:\nSTRING  43\n\n\nTree2:\nTYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n\n\nSubtree1: STRING  43\n\n\nSubtree2: TYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n");
        boolean boolean11 = jSDocInfoBuilder1.addAuthor("STRING \n");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder13 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean14 = jSDocInfoBuilder13.isInterfaceRecorded();
        boolean boolean15 = jSDocInfoBuilder13.isConstructorRecorded();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder17 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean18 = jSDocInfoBuilder17.isInterfaceRecorded();
        boolean boolean20 = jSDocInfoBuilder17.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj26 = node24.getProp(43);
        boolean boolean27 = node24.isCall();
        boolean boolean28 = node24.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression30 = new com.google.javascript.rhino.JSTypeExpression(node24, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder31 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray33 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray34 = (java.util.ArrayList<java.lang.String>[]) arrayListArray33;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder35 = strListBuilder31.add((java.util.ArrayList<java.lang.String>[]) arrayListArray33);
        boolean boolean36 = jSTypeExpression30.equals((java.lang.Object) arrayListArray33);
        boolean boolean37 = jSDocInfoBuilder17.recordDefineType(jSTypeExpression30);
        com.google.javascript.rhino.Node node38 = jSTypeExpression30.getRoot();
        boolean boolean40 = jSDocInfoBuilder13.recordThrowDescription(jSTypeExpression30, "Node tree inequality:\nTree1:\nSTRING  43\n\n\nTree2:\nTYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n\n\nSubtree1: STRING  43\n\n\nSubtree2: TYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder42 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean43 = jSDocInfoBuilder42.isInterfaceRecorded();
        boolean boolean45 = jSDocInfoBuilder42.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj51 = node49.getProp(43);
        boolean boolean52 = node49.isCall();
        boolean boolean53 = node49.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression55 = new com.google.javascript.rhino.JSTypeExpression(node49, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder56 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray58 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray59 = (java.util.ArrayList<java.lang.String>[]) arrayListArray58;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder60 = strListBuilder56.add((java.util.ArrayList<java.lang.String>[]) arrayListArray58);
        boolean boolean61 = jSTypeExpression55.equals((java.lang.Object) arrayListArray58);
        boolean boolean62 = jSDocInfoBuilder42.recordDefineType(jSTypeExpression55);
        boolean boolean63 = jSDocInfoBuilder13.recordEnumParameterType(jSTypeExpression55);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder65 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean66 = jSDocInfoBuilder65.recordNoTypeCheck();
        boolean boolean67 = jSDocInfoBuilder65.isInterfaceRecorded();
        jSDocInfoBuilder65.markAnnotation("[, hi!, , , hi!, , hi!, ]", (int) (short) 0, 2);
        boolean boolean72 = jSDocInfoBuilder65.recordIdGenerator();
        boolean boolean73 = jSDocInfoBuilder65.recordInterface();
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean78 = node77.isVar();
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node83 = node77.copyInformationFromForTree(node82);
        com.google.javascript.rhino.Node node84 = node77.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression86 = new com.google.javascript.rhino.JSTypeExpression(node84, "STRING  43");
        boolean boolean87 = jSTypeExpression86.isVarArgs();
        boolean boolean88 = jSDocInfoBuilder65.recordDefineType(jSTypeExpression86);
        boolean boolean89 = jSDocInfoBuilder13.recordBaseType(jSTypeExpression86);
        boolean boolean90 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression86);
        boolean boolean91 = jSTypeExpression86.isOptionalArg();
        com.google.javascript.rhino.Node node92 = jSTypeExpression86.getRoot();
        boolean boolean93 = node92.isInc();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression30 and jSTypeExpression86", jSTypeExpression30.equals(jSTypeExpression86) ? jSTypeExpression30.hashCode() == jSTypeExpression86.hashCode() : true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean2 = jSDocInfoBuilder1.isInterfaceRecorded();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder4 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean5 = jSDocInfoBuilder4.isInterfaceRecorded();
        boolean boolean7 = jSDocInfoBuilder4.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj13 = node11.getProp(43);
        boolean boolean14 = node11.isCall();
        boolean boolean15 = node11.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression17 = new com.google.javascript.rhino.JSTypeExpression(node11, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder18 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray20 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray21 = (java.util.ArrayList<java.lang.String>[]) arrayListArray20;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder22 = strListBuilder18.add((java.util.ArrayList<java.lang.String>[]) arrayListArray20);
        boolean boolean23 = jSTypeExpression17.equals((java.lang.Object) arrayListArray20);
        boolean boolean24 = jSDocInfoBuilder4.recordDefineType(jSTypeExpression17);
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition25 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int26 = namePosition25.getEndLine();
        int int27 = namePosition25.getStartLine();
        com.google.javascript.rhino.Node node28 = namePosition25.getItem();
        boolean boolean29 = jSTypeExpression17.equals((java.lang.Object) node28);
        boolean boolean30 = jSDocInfoBuilder1.recordExtendedInterface(jSTypeExpression17);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder32 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean34 = jSDocInfoBuilder32.recordVersion("");
        boolean boolean35 = jSDocInfoBuilder32.recordExpose();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean40 = node39.isVar();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node45 = node39.copyInformationFromForTree(node44);
        com.google.javascript.rhino.Node node46 = node39.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression48 = new com.google.javascript.rhino.JSTypeExpression(node46, "STRING  43");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression49 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression48);
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray55 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet56 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet56, strArray55);
        node53.setDirectives((java.util.Set<java.lang.String>) strSet56);
        java.lang.Object[] objArray59 = strSet56.toArray();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray65 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet66 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet66, strArray65);
        node63.setDirectives((java.util.Set<java.lang.String>) strSet66);
        java.lang.Object[] objArray69 = strSet66.toArray();
        boolean boolean70 = strSet56.retainAll((java.util.Collection<java.lang.String>) strSet66);
        int int71 = strSet66.size();
        boolean boolean73 = strSet66.add("");
        boolean boolean74 = jSTypeExpression49.equals((java.lang.Object) strSet66);
        boolean boolean75 = jSDocInfoBuilder32.recordDefineType(jSTypeExpression49);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression76 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression49);
        com.google.javascript.rhino.Node node77 = jSTypeExpression49.getRoot();
        boolean boolean78 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression17 and jSTypeExpression48", jSTypeExpression17.equals(jSTypeExpression48) ? jSTypeExpression17.hashCode() == jSTypeExpression48.hashCode() : true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj5 = node3.getProp(43);
        boolean boolean6 = node3.isCall();
        int int7 = node3.getSourcePosition();
        java.lang.String str11 = node3.toString(false, true, false);
        boolean boolean12 = node3.isVarArgs();
        boolean boolean13 = node3.hasOneChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node15 = node3.getChildAtIndex((int) (byte) 10);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition1 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition2 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition3 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition4 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition5 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean6 = typePosition5.hasBrackets();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.TypePosition> typePositionList7 = com.google.common.collect.ImmutableList.of(typePosition0, typePosition1, typePosition2, typePosition3, typePosition4, typePosition5);
        int int8 = typePosition2.getEndLine();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        boolean boolean13 = node12.isNull();
        boolean boolean14 = node12.isSyntheticBlock();
        boolean boolean15 = node12.hasMoreThanOneChild();
        typePosition2.setItem(node12);
        com.google.javascript.rhino.Node node17 = node12.getParent();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable18 = node12.children();
        boolean boolean19 = node12.isLabelName();
        java.lang.Object obj21 = node12.getProp(48);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node25.setIsSyntheticBlock(true);
        boolean boolean28 = node25.isReturn();
        boolean boolean29 = node25.isCatch();
        com.google.javascript.rhino.JSDocInfo jSDocInfo30 = node25.getJSDocInfo();
        boolean boolean31 = node25.hasMoreThanOneChild();
        boolean boolean32 = node12.isEquivalentToTyped(node25);
        boolean boolean33 = node12.isParamList();
        boolean boolean34 = node12.isContinue();
        int int36 = node12.getIntProp(147494);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node38 = node12.getChildAtIndex((int) (byte) 100);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(53, 176129, 48);
        boolean boolean4 = node3.hasMoreThanOneChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node6 = node3.getChildAtIndex(100);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean4 = node3.isOptionalArg();
        boolean boolean5 = node3.isSwitch();
        boolean boolean6 = node3.isOr();
        java.lang.String str7 = node3.toStringTree();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node9 = node3.getChildAtIndex(3);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj6 = node4.getProp(43);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        boolean boolean11 = node10.isIf();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj17 = node15.getProp(43);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int22 = node21.getSourceOffset();
        com.google.javascript.rhino.Node node23 = node15.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean24 = node23.isAssignAdd();
        boolean boolean25 = node23.isEmpty();
        node23.setSourceEncodedPosition(40);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean32 = node31.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        node36.setDirectives((java.util.Set<java.lang.String>) strSet39);
        java.lang.Object obj43 = node36.getProp((int) (byte) 1);
        com.google.javascript.rhino.Node node44 = node31.copyInformationFrom(node36);
        boolean boolean45 = node31.isOr();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(1, node4, node10, node23, node31, 176180, 1);
        com.google.javascript.rhino.Node node49 = node4.detachFromParent();
        node4.setSourceFileForTesting("NUMBER 0.0 [directives: []]");
        java.lang.String str52 = node4.toStringTree();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj58 = node56.getProp(43);
        boolean boolean59 = node56.isCall();
        int int60 = node56.getSourcePosition();
        com.google.javascript.rhino.Node node61 = node56.getParent();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable62 = node56.children();
        node56.setString("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.removeChild(node56);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj5 = node3.getProp(43);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int10 = node9.getSourceOffset();
        com.google.javascript.rhino.Node node11 = node3.useSourceInfoIfMissingFromForTree(node9);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        node15.setDirectives((java.util.Set<java.lang.String>) strSet18);
        com.google.javascript.rhino.Node node21 = node9.useSourceInfoIfMissingFromForTree(node15);
        boolean boolean22 = node21.isContinue();
        com.google.javascript.rhino.InputId inputId23 = node21.getInputId();
        boolean boolean24 = node21.isDelProp();
        boolean boolean25 = node21.isNumber();
        boolean boolean26 = node21.isVar();
        node21.removeProp(147494);
        boolean boolean29 = node21.isDelProp();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition30 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean31 = typePosition30.hasBrackets();
        int int32 = typePosition30.getEndLine();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node36.addChildrenToFront(node40);
        boolean boolean42 = node36.isGetterDef();
        boolean boolean43 = node36.isEmpty();
        typePosition30.setItem(node36);
        int int45 = typePosition30.getPositionOnStartLine();
        com.google.javascript.rhino.Node node46 = typePosition30.getItem();
        boolean boolean47 = node46.isFor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node21.removeChild(node46);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj5 = node3.getProp(43);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int10 = node9.getSourceOffset();
        com.google.javascript.rhino.Node node11 = node3.useSourceInfoIfMissingFromForTree(node9);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        node15.setDirectives((java.util.Set<java.lang.String>) strSet18);
        com.google.javascript.rhino.Node node21 = node9.useSourceInfoIfMissingFromForTree(node15);
        boolean boolean22 = node15.isThrow();
        boolean boolean23 = node15.isNot();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean28 = node27.isVar();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node33 = node27.copyInformationFromForTree(node32);
        java.lang.String str34 = node15.checkTreeEquals(node33);
        boolean boolean35 = node33.isOptionalArg();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node37 = node33.getChildAtIndex(24);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node3.addChildrenToFront(node7);
        com.google.javascript.rhino.Node node10 = node3.getChildAtIndex(0);
        java.lang.String str11 = node10.toString();
        node10.setSourceEncodedPositionForTree((int) (byte) -1);
        node10.setOptionalArg(false);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj21 = node19.getProp(43);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int26 = node25.getSourceOffset();
        com.google.javascript.rhino.Node node27 = node19.useSourceInfoIfMissingFromForTree(node25);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean32 = node31.isVar();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node37 = node31.copyInformationFromForTree(node36);
        com.google.javascript.rhino.Node node38 = node19.copyInformationFromForTree(node37);
        boolean boolean39 = node10.isEquivalentToTyped(node19);
        com.google.javascript.rhino.Node[] nodeArray46 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(42, nodeArray46, (int) (byte) 1, 43);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(49, nodeArray46, 53, 43);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node(37, nodeArray46, 47, 176129);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(32, nodeArray46);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(43, nodeArray46, 176129, 36);
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node(45055, nodeArray46, (int) (short) 0, 2);
        com.google.javascript.rhino.Node node63 = node10.useSourceInfoFrom(node62);
        com.google.javascript.rhino.Node node67 = new com.google.javascript.rhino.Node(2, 0, 176129);
        node10.addChildrenToBack(node67);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node70 = node10.getChildAtIndex(52);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean2 = jSDocInfoBuilder1.isInterfaceRecorded();
        jSDocInfoBuilder1.recordOriginalCommentString("");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder7 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean8 = jSDocInfoBuilder7.isInterfaceRecorded();
        boolean boolean10 = jSDocInfoBuilder7.recordBlockDescription("hi!");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder12 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean13 = jSDocInfoBuilder12.isInterfaceRecorded();
        boolean boolean15 = jSDocInfoBuilder12.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj21 = node19.getProp(43);
        boolean boolean22 = node19.isCall();
        boolean boolean23 = node19.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression25 = new com.google.javascript.rhino.JSTypeExpression(node19, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder26 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray28 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray29 = (java.util.ArrayList<java.lang.String>[]) arrayListArray28;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder30 = strListBuilder26.add((java.util.ArrayList<java.lang.String>[]) arrayListArray28);
        boolean boolean31 = jSTypeExpression25.equals((java.lang.Object) arrayListArray28);
        boolean boolean32 = jSDocInfoBuilder12.recordDefineType(jSTypeExpression25);
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition33 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int34 = namePosition33.getEndLine();
        int int35 = namePosition33.getStartLine();
        com.google.javascript.rhino.Node node36 = namePosition33.getItem();
        boolean boolean37 = jSTypeExpression25.equals((java.lang.Object) node36);
        boolean boolean38 = jSDocInfoBuilder7.recordTypedef(jSTypeExpression25);
        boolean boolean39 = jSDocInfoBuilder1.recordParameter("Node tree inequality:\nTree1:\nNUMBER 0.0 43 [directives: []]\n\n\nTree2:\nSTRING \n\n\nSubtree1: NUMBER 0.0 43 [directives: []]\n\n\nSubtree2: STRING \n", jSTypeExpression25);
        boolean boolean40 = jSDocInfoBuilder1.isJavaDispatch();
        boolean boolean41 = jSDocInfoBuilder1.recordNoTypeCheck();
        boolean boolean42 = jSDocInfoBuilder1.recordHiddenness();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder44 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean45 = jSDocInfoBuilder44.recordNoTypeCheck();
        jSDocInfoBuilder44.recordOriginalCommentString("");
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean52 = node51.isVar();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node57 = node51.copyInformationFromForTree(node56);
        com.google.javascript.rhino.Node node58 = node51.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression60 = new com.google.javascript.rhino.JSTypeExpression(node58, "STRING  43");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression61 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression60);
        boolean boolean62 = jSDocInfoBuilder44.recordReturnType(jSTypeExpression60);
        boolean boolean63 = jSTypeExpression60.isOptionalArg();
        boolean boolean64 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression60);
        java.lang.String[] strArray67 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet68 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet68, strArray67);
        boolean boolean71 = strSet68.equals((java.lang.Object) (-1));
        java.lang.Object[] objArray72 = strSet68.toArray();
        java.util.Iterator<java.lang.String> strItor73 = strSet68.iterator();
        boolean boolean74 = jSDocInfoBuilder1.recordSuppressions((java.util.Set<java.lang.String>) strSet68);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression25 and jSTypeExpression60", jSTypeExpression25.equals(jSTypeExpression60) ? jSTypeExpression25.hashCode() == jSTypeExpression60.hashCode() : true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean2 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean3 = jSDocInfoBuilder1.recordNoCompile();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj10 = node8.getProp(43);
        boolean boolean11 = node8.isCall();
        boolean boolean12 = node8.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression14 = new com.google.javascript.rhino.JSTypeExpression(node8, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder15 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray17 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray18 = (java.util.ArrayList<java.lang.String>[]) arrayListArray17;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder19 = strListBuilder15.add((java.util.ArrayList<java.lang.String>[]) arrayListArray17);
        boolean boolean20 = jSTypeExpression14.equals((java.lang.Object) arrayListArray17);
        boolean boolean21 = jSDocInfoBuilder1.recordParameter("", jSTypeExpression14);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder23 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean24 = jSDocInfoBuilder23.isInterfaceRecorded();
        boolean boolean26 = jSDocInfoBuilder23.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj32 = node30.getProp(43);
        boolean boolean33 = node30.isCall();
        boolean boolean34 = node30.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression36 = new com.google.javascript.rhino.JSTypeExpression(node30, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder37 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray39 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray40 = (java.util.ArrayList<java.lang.String>[]) arrayListArray39;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder41 = strListBuilder37.add((java.util.ArrayList<java.lang.String>[]) arrayListArray39);
        boolean boolean42 = jSTypeExpression36.equals((java.lang.Object) arrayListArray39);
        boolean boolean43 = jSDocInfoBuilder23.recordDefineType(jSTypeExpression36);
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition44 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int45 = namePosition44.getEndLine();
        int int46 = namePosition44.getStartLine();
        com.google.javascript.rhino.Node node47 = namePosition44.getItem();
        boolean boolean48 = jSTypeExpression36.equals((java.lang.Object) node47);
        boolean boolean49 = jSTypeExpression36.isOptionalArg();
        boolean boolean50 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression36);
        boolean boolean51 = jSDocInfoBuilder1.recordNoCompile();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder53 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean54 = jSDocInfoBuilder53.isInterfaceRecorded();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression56 = null;
        boolean boolean57 = jSDocInfoBuilder53.recordParameter("", jSTypeExpression56);
        boolean boolean58 = jSDocInfoBuilder53.isJavaDispatch();
        boolean boolean59 = jSDocInfoBuilder53.recordNoSideEffects();
        boolean boolean60 = jSDocInfoBuilder53.recordPreserveTry();
        boolean boolean61 = jSDocInfoBuilder53.recordNoCompile();
        boolean boolean63 = jSDocInfoBuilder53.recordReturnDescription("Node tree inequality:\nTree1:\nNUMBER 0.0 43\n    STRING  43\n\n\nTree2:\nNUMBER 0.0 43\n\n\nSubtree1: NUMBER 0.0 43\n    STRING  43\n\n\nSubtree2: NUMBER 0.0 43\n");
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean68 = node67.isVar();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node73 = node67.copyInformationFromForTree(node72);
        com.google.javascript.rhino.Node node74 = node67.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression76 = new com.google.javascript.rhino.JSTypeExpression(node74, "STRING  43");
        boolean boolean77 = jSDocInfoBuilder53.recordThisType(jSTypeExpression76);
        boolean boolean78 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression76);
        boolean boolean79 = jSDocInfoBuilder1.recordConsistentIdGenerator();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression14 and jSTypeExpression76", jSTypeExpression14.equals(jSTypeExpression76) ? jSTypeExpression14.hashCode() == jSTypeExpression76.hashCode() : true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition1 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean2 = typePosition1.hasBrackets();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean7 = node6.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        node11.setDirectives((java.util.Set<java.lang.String>) strSet14);
        java.lang.Object obj18 = node11.getProp((int) (byte) 1);
        com.google.javascript.rhino.Node node19 = node6.copyInformationFrom(node11);
        typePosition1.setItem(node19);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj26 = node24.getProp(43);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int31 = node30.getSourceOffset();
        com.google.javascript.rhino.Node node32 = node24.useSourceInfoIfMissingFromForTree(node30);
        boolean boolean33 = node32.isAssignAdd();
        boolean boolean34 = node32.isFromExterns();
        com.google.javascript.rhino.Node node35 = node19.copyInformationFromForTree(node32);
        boolean boolean36 = node19.isDelProp();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int41 = node40.getSourceOffset();
        boolean boolean42 = node40.isFor();
        java.lang.Object obj44 = node40.getProp(49);
        java.util.Set<java.lang.String> strSet45 = node40.getDirectives();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder47 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean48 = jSDocInfoBuilder47.recordNoTypeCheck();
        boolean boolean49 = jSDocInfoBuilder47.isInterfaceRecorded();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj55 = node53.getProp(43);
        int int56 = node53.getType();
        boolean boolean57 = node53.isGetterDef();
        node53.setSourceEncodedPositionForTree(54);
        com.google.javascript.rhino.JSDocInfo jSDocInfo60 = jSDocInfoBuilder47.build(node53);
        boolean boolean61 = jSDocInfo60.isNoSideEffects();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber((double) 12);
        jSDocInfo60.setAssociatedNode(node63);
        com.google.javascript.rhino.Node node67 = new com.google.javascript.rhino.Node(49, node19, node40, node63, (int) (short) 0, 36);
        node19.addSuppression("NAME\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node71 = node19.getChildAtIndex(26);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node3.addChildrenToFront(node7);
        node7.setQuotedString();
        boolean boolean10 = node7.isHook();
        boolean boolean11 = node7.isUnscopedQualifiedName();
        boolean boolean12 = node7.isSyntheticBlock();
        java.lang.String str16 = node7.toString(true, false, false);
        java.lang.String str17 = node7.getQualifiedName();
        com.google.javascript.rhino.Node node18 = node7.cloneNode();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj24 = node22.getProp(43);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int29 = node28.getSourceOffset();
        com.google.javascript.rhino.Node node30 = node22.useSourceInfoIfMissingFromForTree(node28);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        node34.setDirectives((java.util.Set<java.lang.String>) strSet37);
        com.google.javascript.rhino.Node node40 = node28.useSourceInfoIfMissingFromForTree(node34);
        boolean boolean41 = node40.isLabel();
        node40.removeProp((int) (short) 0);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj49 = node47.getProp(43);
        int int50 = node47.getType();
        boolean boolean51 = node47.isThrow();
        boolean boolean52 = node40.isEquivalentTo(node47);
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean57 = node56.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node58 = node56.cloneNode();
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj64 = node62.getProp(43);
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int69 = node68.getSourceOffset();
        com.google.javascript.rhino.Node node70 = node62.useSourceInfoIfMissingFromForTree(node68);
        boolean boolean71 = node70.isIf();
        boolean boolean72 = node70.isAnd();
        node70.detachChildren();
        com.google.javascript.rhino.Node node74 = node58.useSourceInfoIfMissingFromForTree(node70);
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj80 = node78.getProp(43);
        com.google.javascript.rhino.Node node84 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int85 = node84.getSourceOffset();
        com.google.javascript.rhino.Node node86 = node78.useSourceInfoIfMissingFromForTree(node84);
        boolean boolean87 = node86.isAssignAdd();
        boolean boolean88 = node86.isEmpty();
        java.lang.Object obj90 = node86.getProp((int) '#');
        com.google.javascript.rhino.Node node91 = node58.useSourceInfoIfMissingFrom(node86);
        node40.addChildrenToFront(node91);
        boolean boolean93 = node91.isOr();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node7.removeChild(node91);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean1 = typePosition0.hasBrackets();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean6 = node5.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        node10.setDirectives((java.util.Set<java.lang.String>) strSet13);
        java.lang.Object obj17 = node10.getProp((int) (byte) 1);
        com.google.javascript.rhino.Node node18 = node5.copyInformationFrom(node10);
        typePosition0.setItem(node18);
        boolean boolean20 = node18.isVarArgs();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int25 = node24.getSourceOffset();
        com.google.javascript.rhino.jstype.JSType jSType26 = node24.getJSType();
        boolean boolean27 = node24.isWith();
        int int28 = node24.getCharno();
        node24.setSourceEncodedPosition(36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node18.removeChild(node24);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean5 = node4.isVar();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj11 = node9.getProp(43);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int16 = node15.getSourceOffset();
        com.google.javascript.rhino.Node node17 = node9.useSourceInfoIfMissingFromForTree(node15);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        node21.setDirectives((java.util.Set<java.lang.String>) strSet24);
        com.google.javascript.rhino.Node node27 = node15.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean28 = node21.isThrow();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(35, node4, node21);
        int int30 = node4.getSourcePosition();
        boolean boolean31 = node4.isComma();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder32 = node4.getJsDocBuilderForNode();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile33 = node4.getStaticSourceFile();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node37.addChildrenToFront(node41);
        com.google.javascript.rhino.Node node44 = node37.getChildAtIndex(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.removeChild(node37);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node3.addChildrenToFront(node7);
        node7.setQuotedString();
        com.google.javascript.rhino.Node node10 = node7.removeFirstChild();
        boolean boolean11 = node7.isFalse();
        node7.removeProp(39);
        java.util.Set<java.lang.String> strSet14 = node7.getDirectives();
        java.lang.String str15 = node7.getQualifiedName();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (short) 100, 43, (-1));
        node19.detachChildren();
        boolean boolean21 = node19.isWith();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj27 = node25.getProp(43);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int32 = node31.getSourceOffset();
        com.google.javascript.rhino.Node node33 = node25.useSourceInfoIfMissingFromForTree(node31);
        boolean boolean34 = node33.isIf();
        boolean boolean35 = node33.isAnd();
        boolean boolean36 = node33.isVar();
        boolean boolean37 = node33.isTypeOf();
        boolean boolean38 = node33.isParamList();
        boolean boolean39 = node33.isDo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node7.replaceChild(node19, node33);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node2 = node1.cloneNode();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int7 = node6.getSourceOffset();
        boolean boolean8 = node6.hasChildren();
        node6.setVarArgs(false);
        node6.setVarArgs(true);
        com.google.common.collect.ImmutableList<java.lang.String> strList21 = com.google.common.collect.ImmutableList.of("", "hi!", "", "", "hi!", "", "hi!", "");
        int int23 = strList21.indexOf((java.lang.Object) 'a');
        com.google.common.collect.ImmutableList<java.lang.String> strList32 = com.google.common.collect.ImmutableList.of("", "hi!", "", "", "hi!", "", "hi!", "");
        int int34 = strList32.indexOf((java.lang.Object) 'a');
        com.google.common.collect.ImmutableList<java.lang.String> strList43 = com.google.common.collect.ImmutableList.of("", "hi!", "", "", "hi!", "", "hi!", "");
        com.google.common.collect.ImmutableList<java.lang.String> strList52 = com.google.common.collect.ImmutableList.of("", "hi!", "", "", "hi!", "", "hi!", "");
        com.google.common.collect.ImmutableList<java.lang.Iterable<java.lang.String>> strIterableList53 = com.google.common.collect.ImmutableList.of((java.lang.Iterable<java.lang.String>) strList21, (java.lang.Iterable<java.lang.String>) strList32, (java.lang.Iterable<java.lang.String>) strList43, (java.lang.Iterable<java.lang.String>) strList52);
        com.google.common.collect.ImmutableList<java.lang.String> strList62 = com.google.common.collect.ImmutableList.of("", "hi!", "", "", "hi!", "", "hi!", "");
        int int64 = strList62.indexOf((java.lang.Object) 'a');
        java.util.Spliterator<java.lang.String> strSpliterator65 = strList62.spliterator();
        boolean boolean66 = strList32.equals((java.lang.Object) strList62);
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean71 = node70.isVar();
        boolean boolean72 = strList62.contains((java.lang.Object) node70);
        boolean boolean73 = node70.isThis();
        boolean boolean74 = node70.isGetProp();
        boolean boolean75 = node70.isThis();
        boolean boolean76 = node70.isFunction();
        int int77 = node70.getSideEffectFlags();
        boolean boolean78 = node6.isEquivalentToTyped(node70);
        boolean boolean79 = node6.isAssign();
        boolean boolean80 = node6.isFunction();
        boolean boolean81 = node6.isGetElem();
        node6.setSourceEncodedPosition(49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node6);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 12);
        com.google.javascript.rhino.Node node2 = node1.cloneTree();
        com.google.javascript.rhino.Node node3 = node2.cloneNode();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj10 = node8.getProp(43);
        boolean boolean11 = node8.isCall();
        boolean boolean12 = node8.isQuotedString();
        boolean boolean13 = node8.isObjectLit();
        boolean boolean14 = node8.isOr();
        boolean boolean15 = node8.isNull();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int20 = node19.getSourceOffset();
        com.google.javascript.rhino.jstype.JSType jSType21 = node19.getJSType();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder22 = node19.getJsDocBuilderForNode();
        node19.putBooleanProp(30, false);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder26 = node19.getJsDocBuilderForNode();
        java.lang.String str27 = node8.checkTreeEquals(node19);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) '#', node19);
        com.google.javascript.rhino.Node node29 = node3.useSourceInfoIfMissingFromForTree(node28);
        boolean boolean30 = node3.isRegExp();
        boolean boolean31 = node3.isAssignAdd();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder33 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean34 = jSDocInfoBuilder33.isInterfaceRecorded();
        boolean boolean36 = jSDocInfoBuilder33.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj42 = node40.getProp(43);
        boolean boolean43 = node40.isCall();
        boolean boolean44 = node40.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression46 = new com.google.javascript.rhino.JSTypeExpression(node40, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder47 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray49 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray50 = (java.util.ArrayList<java.lang.String>[]) arrayListArray49;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder51 = strListBuilder47.add((java.util.ArrayList<java.lang.String>[]) arrayListArray49);
        boolean boolean52 = jSTypeExpression46.equals((java.lang.Object) arrayListArray49);
        boolean boolean53 = jSDocInfoBuilder33.recordDefineType(jSTypeExpression46);
        com.google.javascript.rhino.Node node54 = jSTypeExpression46.getRoot();
        boolean boolean55 = node54.isLabel();
        boolean boolean56 = node54.isNot();
        node54.setQuotedString();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber((double) 12);
        com.google.javascript.rhino.Node node60 = node59.cloneTree();
        com.google.javascript.rhino.Node node61 = node60.cloneNode();
        boolean boolean62 = node60.isVarArgs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.replaceChild(node54, node60);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean2 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean3 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder5 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean6 = jSDocInfoBuilder5.isInterfaceRecorded();
        boolean boolean8 = jSDocInfoBuilder5.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj14 = node12.getProp(43);
        boolean boolean15 = node12.isCall();
        boolean boolean16 = node12.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression18 = new com.google.javascript.rhino.JSTypeExpression(node12, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder19 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray21 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray22 = (java.util.ArrayList<java.lang.String>[]) arrayListArray21;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder23 = strListBuilder19.add((java.util.ArrayList<java.lang.String>[]) arrayListArray21);
        boolean boolean24 = jSTypeExpression18.equals((java.lang.Object) arrayListArray21);
        boolean boolean25 = jSDocInfoBuilder5.recordDefineType(jSTypeExpression18);
        boolean boolean26 = jSTypeExpression18.isVarArgs();
        java.lang.Object obj27 = null;
        boolean boolean28 = jSTypeExpression18.equals(obj27);
        boolean boolean29 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression18);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean34 = node33.isVar();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node39 = node33.copyInformationFromForTree(node38);
        com.google.javascript.rhino.Node node40 = node33.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression42 = new com.google.javascript.rhino.JSTypeExpression(node40, "STRING  43");
        boolean boolean43 = jSDocInfoBuilder1.recordExtendedInterface(jSTypeExpression42);
        boolean boolean45 = jSDocInfoBuilder1.recordFileOverview("NUMBER 16.0 35\n");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression18 and jSTypeExpression42", jSTypeExpression18.equals(jSTypeExpression42) ? jSTypeExpression18.hashCode() == jSTypeExpression42.hashCode() : true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean2 = jSDocInfoBuilder1.recordNoTypeCheck();
        jSDocInfoBuilder1.recordOriginalCommentString("");
        boolean boolean5 = jSDocInfoBuilder1.isJavaDispatch();
        boolean boolean6 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        boolean boolean7 = jSDocInfoBuilder1.recordOverride();
        boolean boolean9 = jSDocInfoBuilder1.addReference("Node tree inequality:\nTree1:\nSTRING  43\n\n\nTree2:\nTYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n\n\nSubtree1: STRING  43\n\n\nSubtree2: TYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n");
        boolean boolean11 = jSDocInfoBuilder1.addAuthor("STRING \n");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder13 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean14 = jSDocInfoBuilder13.isInterfaceRecorded();
        boolean boolean15 = jSDocInfoBuilder13.isConstructorRecorded();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder17 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean18 = jSDocInfoBuilder17.isInterfaceRecorded();
        boolean boolean20 = jSDocInfoBuilder17.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj26 = node24.getProp(43);
        boolean boolean27 = node24.isCall();
        boolean boolean28 = node24.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression30 = new com.google.javascript.rhino.JSTypeExpression(node24, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder31 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray33 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray34 = (java.util.ArrayList<java.lang.String>[]) arrayListArray33;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder35 = strListBuilder31.add((java.util.ArrayList<java.lang.String>[]) arrayListArray33);
        boolean boolean36 = jSTypeExpression30.equals((java.lang.Object) arrayListArray33);
        boolean boolean37 = jSDocInfoBuilder17.recordDefineType(jSTypeExpression30);
        com.google.javascript.rhino.Node node38 = jSTypeExpression30.getRoot();
        boolean boolean40 = jSDocInfoBuilder13.recordThrowDescription(jSTypeExpression30, "Node tree inequality:\nTree1:\nSTRING  43\n\n\nTree2:\nTYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n\n\nSubtree1: STRING  43\n\n\nSubtree2: TYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder42 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean43 = jSDocInfoBuilder42.isInterfaceRecorded();
        boolean boolean45 = jSDocInfoBuilder42.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj51 = node49.getProp(43);
        boolean boolean52 = node49.isCall();
        boolean boolean53 = node49.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression55 = new com.google.javascript.rhino.JSTypeExpression(node49, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder56 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray58 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray59 = (java.util.ArrayList<java.lang.String>[]) arrayListArray58;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder60 = strListBuilder56.add((java.util.ArrayList<java.lang.String>[]) arrayListArray58);
        boolean boolean61 = jSTypeExpression55.equals((java.lang.Object) arrayListArray58);
        boolean boolean62 = jSDocInfoBuilder42.recordDefineType(jSTypeExpression55);
        boolean boolean63 = jSDocInfoBuilder13.recordEnumParameterType(jSTypeExpression55);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder65 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean66 = jSDocInfoBuilder65.recordNoTypeCheck();
        boolean boolean67 = jSDocInfoBuilder65.isInterfaceRecorded();
        jSDocInfoBuilder65.markAnnotation("[, hi!, , , hi!, , hi!, ]", (int) (short) 0, 2);
        boolean boolean72 = jSDocInfoBuilder65.recordIdGenerator();
        boolean boolean73 = jSDocInfoBuilder65.recordInterface();
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean78 = node77.isVar();
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node83 = node77.copyInformationFromForTree(node82);
        com.google.javascript.rhino.Node node84 = node77.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression86 = new com.google.javascript.rhino.JSTypeExpression(node84, "STRING  43");
        boolean boolean87 = jSTypeExpression86.isVarArgs();
        boolean boolean88 = jSDocInfoBuilder65.recordDefineType(jSTypeExpression86);
        boolean boolean89 = jSDocInfoBuilder13.recordBaseType(jSTypeExpression86);
        boolean boolean90 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression86);
        boolean boolean91 = jSDocInfoBuilder1.recordConsistentIdGenerator();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression30 and jSTypeExpression86", jSTypeExpression30.equals(jSTypeExpression86) ? jSTypeExpression30.hashCode() == jSTypeExpression86.hashCode() : true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 40);
        com.google.javascript.rhino.Node node2 = node1.cloneNode();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean7 = node6.isVar();
        node6.putBooleanProp(30, false);
        boolean boolean11 = node6.isSwitch();
        boolean boolean12 = node6.isUnscopedQualifiedName();
        boolean boolean13 = node6.hasChildren();
        node6.setCharno(52);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj23 = node21.getProp(43);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int28 = node27.getSourceOffset();
        com.google.javascript.rhino.Node node29 = node21.useSourceInfoIfMissingFromForTree(node27);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray35 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        node33.setDirectives((java.util.Set<java.lang.String>) strSet36);
        com.google.javascript.rhino.Node node39 = node27.useSourceInfoIfMissingFromForTree(node33);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj45 = node43.getProp(43);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int50 = node49.getSourceOffset();
        com.google.javascript.rhino.Node node51 = node43.useSourceInfoIfMissingFromForTree(node49);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray57 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet58 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet58, strArray57);
        node55.setDirectives((java.util.Set<java.lang.String>) strSet58);
        com.google.javascript.rhino.Node node61 = node49.useSourceInfoIfMissingFromForTree(node55);
        boolean boolean62 = node61.isContinue();
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj68 = node66.getProp(43);
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int73 = node72.getSourceOffset();
        com.google.javascript.rhino.Node node74 = node66.useSourceInfoIfMissingFromForTree(node72);
        boolean boolean75 = node74.isAssignAdd();
        com.google.javascript.rhino.Node node79 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean80 = node79.isVar();
        com.google.javascript.rhino.Node node83 = new com.google.javascript.rhino.Node((int) ' ', node33, node61, node74, node79, 1, 100);
        boolean boolean84 = node61.isHook();
        node61.setSourceEncodedPositionForTree(12);
        boolean boolean87 = node61.isQualifiedName();
        node6.putProp((int) '4', (java.lang.Object) node61);
        boolean boolean89 = node6.isDec();
        node2.addChildrenToBack(node6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node92 = node2.getChildAtIndex(4);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean3 = jSDocInfoBuilder1.recordVersion("");
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile5 = null;
        jSDocInfoBuilder1.markName("hi!", staticSourceFile5, (int) (short) 0, (int) (short) 100);
        boolean boolean9 = jSDocInfoBuilder1.recordNoTypeCheck();
        boolean boolean10 = jSDocInfoBuilder1.recordExpose();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node14.addChildrenToFront(node18);
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = jSDocInfoBuilder1.build(node18);
        boolean boolean21 = jSDocInfoBuilder1.shouldParseDocumentation();
        boolean boolean23 = jSDocInfoBuilder1.recordDeprecationReason("Node tree inequality:\nTree1:\nNUMBER 0.0 43 [directives: []]\n\n\nTree2:\nSTRING \n\n\nSubtree1: NUMBER 0.0 43 [directives: []]\n\n\nSubtree2: STRING \n");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder25 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean27 = jSDocInfoBuilder25.recordVersion("");
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile29 = null;
        jSDocInfoBuilder25.markName("hi!", staticSourceFile29, (int) (short) 0, (int) (short) 100);
        boolean boolean33 = jSDocInfoBuilder25.recordNoTypeCheck();
        boolean boolean34 = jSDocInfoBuilder25.recordExpose();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node38.addChildrenToFront(node42);
        com.google.javascript.rhino.JSDocInfo jSDocInfo44 = jSDocInfoBuilder25.build(node42);
        boolean boolean45 = jSDocInfoBuilder25.shouldParseDocumentation();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean50 = node49.isVar();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node55 = node49.copyInformationFromForTree(node54);
        com.google.javascript.rhino.Node node56 = node49.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression58 = new com.google.javascript.rhino.JSTypeExpression(node56, "STRING  43");
        boolean boolean59 = jSTypeExpression58.isVarArgs();
        boolean boolean60 = jSDocInfoBuilder25.recordBaseType(jSTypeExpression58);
        boolean boolean61 = jSTypeExpression58.isOptionalArg();
        boolean boolean62 = jSDocInfoBuilder1.recordBaseType(jSTypeExpression58);
        boolean boolean63 = jSDocInfoBuilder1.isDescriptionRecorded();
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj69 = node67.getProp(43);
        boolean boolean70 = node67.isCall();
        boolean boolean71 = node67.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression73 = new com.google.javascript.rhino.JSTypeExpression(node67, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder74 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray76 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray77 = (java.util.ArrayList<java.lang.String>[]) arrayListArray76;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder78 = strListBuilder74.add((java.util.ArrayList<java.lang.String>[]) arrayListArray76);
        boolean boolean79 = jSTypeExpression73.equals((java.lang.Object) arrayListArray76);
        boolean boolean81 = jSDocInfoBuilder1.recordThrowDescription(jSTypeExpression73, "hi!");
        boolean boolean82 = jSDocInfoBuilder1.recordConstancy();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression58 and jSTypeExpression73", jSTypeExpression58.equals(jSTypeExpression73) ? jSTypeExpression58.hashCode() == jSTypeExpression73.hashCode() : true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(32, 36, 51);
        boolean boolean4 = node3.isUnscopedQualifiedName();
        boolean boolean5 = node3.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node7 = node3.getChildAtIndex((int) (short) 1);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean4 = node3.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        node8.setDirectives((java.util.Set<java.lang.String>) strSet11);
        java.lang.Object obj15 = node8.getProp((int) (byte) 1);
        com.google.javascript.rhino.Node node16 = node3.copyInformationFrom(node8);
        boolean boolean17 = node3.isOr();
        int int19 = node3.getIntProp(53);
        com.google.javascript.rhino.Node node20 = node3.cloneNode();
        boolean boolean21 = node20.wasEmptyNode();
        node20.removeProp(36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node25 = node20.getChildAtIndex(17);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean2 = jSDocInfoBuilder1.recordJavaDispatch();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordBaseType(jSTypeExpression3);
        boolean boolean6 = jSDocInfoBuilder1.recordVersion("NUMBER 0.0 43");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder8 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean9 = jSDocInfoBuilder8.isInterfaceRecorded();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = null;
        boolean boolean12 = jSDocInfoBuilder8.recordParameter("", jSTypeExpression11);
        boolean boolean13 = jSDocInfoBuilder8.recordExterns();
        boolean boolean14 = jSDocInfoBuilder8.recordPreserveTry();
        boolean boolean15 = jSDocInfoBuilder8.recordNoCompile();
        boolean boolean17 = jSDocInfoBuilder8.recordLends("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression18 = null;
        boolean boolean19 = jSDocInfoBuilder8.recordType(jSTypeExpression18);
        boolean boolean20 = jSDocInfoBuilder8.recordOverride();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder22 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean23 = jSDocInfoBuilder22.isInterfaceRecorded();
        boolean boolean25 = jSDocInfoBuilder22.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj31 = node29.getProp(43);
        boolean boolean32 = node29.isCall();
        boolean boolean33 = node29.isEmpty();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression35 = new com.google.javascript.rhino.JSTypeExpression(node29, "STRING ");
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder36 = com.google.common.collect.ImmutableList.builder();
        java.util.ArrayList[] arrayListArray38 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.String>[] strListArray39 = (java.util.ArrayList<java.lang.String>[]) arrayListArray38;
        com.google.common.collect.ImmutableList.Builder<java.util.ArrayList<java.lang.String>> strListBuilder40 = strListBuilder36.add((java.util.ArrayList<java.lang.String>[]) arrayListArray38);
        boolean boolean41 = jSTypeExpression35.equals((java.lang.Object) arrayListArray38);
        boolean boolean42 = jSDocInfoBuilder22.recordDefineType(jSTypeExpression35);
        boolean boolean43 = jSDocInfoBuilder8.recordBaseType(jSTypeExpression35);
        boolean boolean44 = jSDocInfoBuilder1.recordThrowType(jSTypeExpression35);
        boolean boolean45 = jSDocInfoBuilder1.recordInterface();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder47 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean48 = jSDocInfoBuilder47.recordNoTypeCheck();
        jSDocInfoBuilder47.recordOriginalCommentString("");
        boolean boolean51 = jSDocInfoBuilder47.recordNoTypeCheck();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean57 = node56.isVar();
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node62 = node56.copyInformationFromForTree(node61);
        com.google.javascript.rhino.Node node63 = node56.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression65 = new com.google.javascript.rhino.JSTypeExpression(node63, "STRING  43");
        boolean boolean66 = jSDocInfoBuilder47.recordParameter("Node tree inequality:\nTree1:\nSTRING  43\n\n\nTree2:\nTYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n\n\nSubtree1: STRING  43\n\n\nSubtree2: TYPEOF 43\n    NUMBER 0.0 43 [directives: []]\n    NUMBER 0.0 43\n    STRING  43\n    STRING  43\n", jSTypeExpression65);
        boolean boolean67 = jSDocInfoBuilder1.recordType(jSTypeExpression65);
        boolean boolean69 = jSDocInfoBuilder1.recordFileOverview("Node tree inequality:\nTree1:\nSTRING  43 [quoted: 1]\n\n\nTree2:\nSTRING hi!\n\n\nSubtree1: STRING  43 [quoted: 1]\n\n\nSubtree2: STRING hi!\n");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression35 and jSTypeExpression65", jSTypeExpression35.equals(jSTypeExpression65) ? jSTypeExpression35.hashCode() == jSTypeExpression65.hashCode() : true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(100, 24, (int) (byte) 0);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node8.addChildrenToFront(node12);
        boolean boolean14 = node8.isGetterDef();
        boolean boolean15 = node8.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj21 = node19.getProp(43);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int26 = node25.getSourceOffset();
        com.google.javascript.rhino.Node node27 = node19.useSourceInfoIfMissingFromForTree(node25);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        node31.setDirectives((java.util.Set<java.lang.String>) strSet34);
        com.google.javascript.rhino.Node node37 = node25.useSourceInfoIfMissingFromForTree(node31);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(32, node8, node25);
        boolean boolean39 = node38.isExprResult();
        boolean boolean40 = node38.isFunction();
        boolean boolean41 = node38.isDec();
        boolean boolean42 = node38.isLabelName();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean47 = node46.isVar();
        com.google.javascript.rhino.Node node48 = node38.useSourceInfoFromForTree(node46);
        node3.addChildToFront(node48);
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean54 = node53.isVar();
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node59 = node53.copyInformationFromForTree(node58);
        boolean boolean60 = node59.hasMoreThanOneChild();
        boolean boolean61 = node59.isQuotedString();
        node59.setIsSyntheticBlock(true);
        node48.addChildToFront(node59);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node66 = node59.getChildAtIndex(29);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = com.google.common.collect.ImmutableList.of("", "hi!", "", "", "hi!", "", "hi!", "");
        int int10 = strList8.indexOf((java.lang.Object) 'a');
        java.util.Spliterator<java.lang.String> strSpliterator11 = strList8.spliterator();
        com.google.common.collect.ImmutableList<java.lang.String> strList20 = com.google.common.collect.ImmutableList.of("", "hi!", "", "", "hi!", "", "hi!", "");
        int int22 = strList20.indexOf((java.lang.Object) 'a');
        int int23 = strList20.size();
        boolean boolean24 = strList8.containsAll((java.util.Collection<java.lang.String>) strList20);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node28.addChildrenToFront(node32);
        node32.setQuotedString();
        boolean boolean35 = node32.isHook();
        boolean boolean36 = strList20.equals((java.lang.Object) node32);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node41.addChildrenToFront(node45);
        boolean boolean48 = node41.getBooleanProp(8);
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj54 = node52.getProp(43);
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int59 = node58.getSourceOffset();
        com.google.javascript.rhino.Node node60 = node52.useSourceInfoIfMissingFromForTree(node58);
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray66 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet67 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet67, strArray66);
        node64.setDirectives((java.util.Set<java.lang.String>) strSet67);
        com.google.javascript.rhino.Node node70 = node58.useSourceInfoIfMissingFromForTree(node64);
        boolean boolean71 = node70.isContinue();
        boolean boolean72 = node70.isVoid();
        double double73 = node70.getDouble();
        java.lang.String str74 = node41.checkTreeEquals(node70);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable75 = node41.children();
        com.google.javascript.rhino.Node node79 = com.google.javascript.rhino.Node.newNumber((double) 53, 42, 4);
        boolean boolean80 = node79.isFunction();
        com.google.javascript.rhino.Node node81 = node79.cloneTree();
        java.lang.String str82 = node79.getQualifiedName();
        com.google.javascript.rhino.Node node84 = com.google.javascript.rhino.Node.newNumber((double) 35);
        node84.setSourceFileForTesting("TYPEOF");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable87 = node84.siblings();
        boolean boolean88 = node84.isInstanceOf();
        com.google.javascript.rhino.Node node91 = new com.google.javascript.rhino.Node(32, node41, node79, node84, 52, 42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node92 = node32.getChildBefore(node91);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean4 = node3.isVar();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 40, (int) (short) 10, (-1));
        com.google.javascript.rhino.Node node9 = node3.copyInformationFromForTree(node8);
        com.google.javascript.rhino.Node node10 = node3.cloneTree();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = new com.google.javascript.rhino.JSTypeExpression(node10, "STRING  43");
        boolean boolean13 = jSTypeExpression12.isOptionalArg();
        com.google.javascript.rhino.Node node14 = jSTypeExpression12.getRoot();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        boolean boolean19 = node18.isOptionalArg();
        boolean boolean20 = node18.isSwitch();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        node25.addChildrenToFront(node29);
        boolean boolean31 = node25.isGetterDef();
        boolean boolean32 = node25.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString("", 43, (int) '4');
        java.lang.Object obj38 = node36.getProp(43);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        int int43 = node42.getSourceOffset();
        com.google.javascript.rhino.Node node44 = node36.useSourceInfoIfMissingFromForTree(node42);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber(0.0d, 43, 1);
        java.lang.String[] strArray50 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet51 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet51, strArray50);
        node48.setDirectives((java.util.Set<java.lang.String>) strSet51);
        com.google.javascript.rhino.Node node54 = node42.useSourceInfoIfMissingFromForTree(node48);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node(32, node25, node42);
        boolean boolean56 = node55.isExprResult();
        boolean boolean57 = node55.isFunction();
        com.google.javascript.rhino.Node node58 = node18.srcrefTree(node55);
        java.lang.Object obj60 = node18.getProp((int) (byte) -1);
        boolean boolean61 = node18.isStringKey();
        boolean boolean62 = node18.isCall();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node14.removeChild(node18);
    }
}


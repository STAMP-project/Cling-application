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
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean4 = node3.isLabelName();
        boolean boolean5 = node3.isDec();
        boolean boolean6 = node3.isNoSideEffectsCall();
        boolean boolean7 = node3.isLocalResultCall();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("Unknown class name");
        com.google.javascript.rhino.Node node10 = node9.getLastSibling();
        boolean boolean11 = node9.isNE();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node12 = node3.getChildBefore(node9);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        java.io.Serializable[] serializableArray16 = new java.io.Serializable[] { 0.0d, (short) -1, 100.0d, 30 };
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList17 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 0.0d, (java.io.Serializable) 10.0f, (java.io.Serializable) (short) 100, (java.io.Serializable) "hi!", (java.io.Serializable) 1.0d, (java.io.Serializable) 0.0d, (java.io.Serializable) 0, (java.io.Serializable) 'a', (java.io.Serializable) (byte) 0, (java.io.Serializable) 1L, (java.io.Serializable) 1.0d, (java.io.Serializable) (byte) 100, serializableArray16);
        boolean boolean18 = serializableList17.isEmpty();
        boolean boolean20 = serializableList17.contains((java.lang.Object) 52);
        int int22 = serializableList17.indexOf((java.lang.Object) (-1L));
        java.util.Iterator<java.io.Serializable> serializableItor23 = serializableList17.iterator();
        java.util.stream.Stream<java.io.Serializable> serializableStream24 = serializableList17.parallelStream();
        java.util.ListIterator<java.io.Serializable> serializableItor26 = serializableList17.listIterator(0);
        com.google.common.collect.UnmodifiableIterator<java.io.Serializable> serializableItor27 = serializableList17.iterator();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("hi!", (int) '4', 52);
        boolean boolean32 = node31.isContinue();
        int int33 = serializableList17.lastIndexOf((java.lang.Object) node31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node35 = node31.getChildAtIndex(49);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean4 = node3.isInstanceOf();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node6 = node3.getChildAtIndex((int) (byte) 100);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(54, "false");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node4 = node2.getChildAtIndex(39);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(0, 10, 0);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean8 = node7.isContinue();
        boolean boolean9 = node7.isString();
        boolean boolean10 = node7.isStringKey();
        com.google.javascript.rhino.Node node11 = node3.useSourceInfoFromForTree(node7);
        boolean boolean12 = node7.isDec();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean17 = node16.isQualifiedName();
        boolean boolean18 = node16.isHook();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression20 = new com.google.javascript.rhino.JSTypeExpression(node16, "[0.0, 10.0, 100, hi!, 1.0, 0.0, 0, a, 0, 1, 1.0, 100, 0.0, -1, 100.0, 30]");
        com.google.javascript.rhino.Node node21 = jSTypeExpression20.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node7.removeChild(node21);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean4 = node3.isQualifiedName();
        boolean boolean5 = node3.isIn();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node7 = node3.getChildAtIndex(16);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 52, (int) (byte) 100, 4);
        boolean boolean4 = node3.isAnd();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node6 = node3.getChildAtIndex(3);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.google.javascript.rhino.Node[] nodeArray4 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(51, nodeArray4, 48, 32);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(42, nodeArray4, 32, 12);
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(36, nodeArray4);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(41, nodeArray4, 0, 53);
        com.google.javascript.rhino.InputId inputId16 = new com.google.javascript.rhino.InputId("true");
        com.google.javascript.rhino.InputId inputId18 = new com.google.javascript.rhino.InputId("true");
        com.google.javascript.rhino.InputId inputId20 = new com.google.javascript.rhino.InputId("true");
        com.google.javascript.rhino.InputId inputId22 = new com.google.javascript.rhino.InputId("true");
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.InputId> inputIdList23 = com.google.common.collect.ImmutableList.of(inputId16, inputId18, inputId20, inputId22);
        com.google.javascript.rhino.InputId inputId25 = new com.google.javascript.rhino.InputId("true");
        com.google.javascript.rhino.InputId inputId27 = new com.google.javascript.rhino.InputId("true");
        com.google.javascript.rhino.InputId inputId29 = new com.google.javascript.rhino.InputId("true");
        com.google.javascript.rhino.InputId inputId31 = new com.google.javascript.rhino.InputId("true");
        com.google.javascript.rhino.InputId inputId33 = new com.google.javascript.rhino.InputId("true");
        com.google.javascript.rhino.InputId inputId35 = new com.google.javascript.rhino.InputId("true");
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.InputId> inputIdList36 = com.google.common.collect.ImmutableList.of(inputId29, inputId31, inputId33, inputId35);
        com.google.javascript.rhino.InputId inputId38 = new com.google.javascript.rhino.InputId("true");
        com.google.javascript.rhino.InputId inputId40 = new com.google.javascript.rhino.InputId("true");
        com.google.javascript.rhino.InputId inputId42 = new com.google.javascript.rhino.InputId("true");
        com.google.javascript.rhino.InputId inputId44 = new com.google.javascript.rhino.InputId("true");
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.InputId> inputIdList45 = com.google.common.collect.ImmutableList.of(inputId38, inputId40, inputId42, inputId44);
        com.google.javascript.rhino.InputId inputId47 = new com.google.javascript.rhino.InputId("true");
        com.google.javascript.rhino.InputId inputId49 = new com.google.javascript.rhino.InputId("true");
        com.google.javascript.rhino.InputId inputId51 = new com.google.javascript.rhino.InputId("true");
        com.google.javascript.rhino.InputId inputId53 = new com.google.javascript.rhino.InputId("true");
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.InputId> inputIdList54 = com.google.common.collect.ImmutableList.of(inputId47, inputId49, inputId51, inputId53);
        com.google.javascript.rhino.InputId inputId56 = new com.google.javascript.rhino.InputId("true");
        com.google.javascript.rhino.InputId inputId58 = new com.google.javascript.rhino.InputId("true");
        com.google.javascript.rhino.InputId inputId60 = new com.google.javascript.rhino.InputId("true");
        com.google.javascript.rhino.InputId inputId62 = new com.google.javascript.rhino.InputId("true");
        com.google.javascript.rhino.InputId inputId64 = new com.google.javascript.rhino.InputId("true");
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.InputId> inputIdList65 = com.google.common.collect.ImmutableList.of(inputId58, inputId60, inputId62, inputId64);
        com.google.javascript.rhino.InputId inputId67 = new com.google.javascript.rhino.InputId("true");
        com.google.javascript.rhino.InputId inputId69 = new com.google.javascript.rhino.InputId("true");
        com.google.javascript.rhino.InputId inputId71 = new com.google.javascript.rhino.InputId("true");
        com.google.javascript.rhino.InputId inputId73 = new com.google.javascript.rhino.InputId("true");
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.InputId> inputIdList74 = com.google.common.collect.ImmutableList.of(inputId67, inputId69, inputId71, inputId73);
        com.google.javascript.rhino.InputId inputId76 = new com.google.javascript.rhino.InputId("true");
        com.google.javascript.rhino.InputId inputId78 = new com.google.javascript.rhino.InputId("true");
        com.google.javascript.rhino.InputId inputId80 = new com.google.javascript.rhino.InputId("true");
        com.google.javascript.rhino.InputId inputId82 = new com.google.javascript.rhino.InputId("true");
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.InputId> inputIdList83 = com.google.common.collect.ImmutableList.of(inputId76, inputId78, inputId80, inputId82);
        java.lang.String str84 = inputId80.getIdName();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.InputId> inputIdList85 = com.google.common.collect.ImmutableList.of(inputId16, inputId25, inputId27, inputId29, inputId38, inputId49, inputId56, inputId58, inputId69, inputId80);
        node14.setInputId(inputId38);
        boolean boolean87 = node14.isFromExterns();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node89 = node14.getChildAtIndex(37);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        java.io.Serializable[] serializableArray16 = new java.io.Serializable[] { 0.0d, (short) -1, 100.0d, 30 };
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList17 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 0.0d, (java.io.Serializable) 10.0f, (java.io.Serializable) (short) 100, (java.io.Serializable) "hi!", (java.io.Serializable) 1.0d, (java.io.Serializable) 0.0d, (java.io.Serializable) 0, (java.io.Serializable) 'a', (java.io.Serializable) (byte) 0, (java.io.Serializable) 1L, (java.io.Serializable) 1.0d, (java.io.Serializable) (byte) 100, serializableArray16);
        boolean boolean18 = serializableList17.isEmpty();
        boolean boolean20 = serializableList17.contains((java.lang.Object) 52);
        int int22 = serializableList17.indexOf((java.lang.Object) (-1L));
        java.util.Iterator<java.io.Serializable> serializableItor23 = serializableList17.iterator();
        java.util.stream.Stream<java.io.Serializable> serializableStream24 = serializableList17.parallelStream();
        java.util.ListIterator<java.io.Serializable> serializableItor26 = serializableList17.listIterator(0);
        com.google.common.collect.UnmodifiableIterator<java.io.Serializable> serializableItor27 = serializableList17.iterator();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("hi!", (int) '4', 52);
        boolean boolean32 = node31.isContinue();
        int int33 = serializableList17.lastIndexOf((java.lang.Object) node31);
        boolean boolean34 = node31.isThrow();
        boolean boolean35 = node31.isSyntheticBlock();
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean40 = node39.isLabelName();
        boolean boolean41 = node39.isTrue();
        boolean boolean42 = node39.isNoSideEffectsCall();
        boolean boolean43 = node39.isCase();
        boolean boolean44 = node39.isVar();
        int int45 = node39.getSourcePosition();
        boolean boolean46 = node39.isAnd();
        com.google.javascript.rhino.Node node47 = node39.cloneNode();
        boolean boolean48 = node47.isVoid();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node31.removeChild(node47);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean4 = node3.isLabelName();
        boolean boolean5 = node3.isDec();
        boolean boolean6 = node3.isAssign();
        int int7 = node3.getCharno();
        boolean boolean8 = node3.isSetterDef();
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = node3.getJSDocInfo();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(50);
        node11.putIntProp(2, 32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node11);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(50);
        node1.putIntProp(2, 32);
        boolean boolean5 = node1.isWith();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node7 = node1.getChildAtIndex(44);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node3 = node1.getChildAtIndex(16);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean4 = node3.isContinue();
        boolean boolean5 = node3.isNull();
        int int6 = node3.getSideEffectFlags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node8 = node3.getChildAtIndex(38);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("false", (int) ' ', (int) (byte) 100);
        boolean boolean4 = node3.isNumber();
        boolean boolean5 = node3.isNew();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node7 = node3.getChildAtIndex((int) 'a');
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean4 = node3.isQuotedString();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString("Unknown class name");
        com.google.javascript.rhino.Node node7 = node6.getLastSibling();
        int int8 = node6.getSourcePosition();
        com.google.javascript.rhino.Node node9 = node3.srcrefTree(node6);
        boolean boolean10 = node3.isVarArgs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node12 = node3.getChildAtIndex(4095);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("Unknown class name");
        com.google.javascript.rhino.Node node2 = node1.getLastSibling();
        int int3 = node1.getSourcePosition();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder4 = node1.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean9 = node8.isContinue();
        boolean boolean10 = node8.isDo();
        node8.setSourceEncodedPosition(2);
        int int13 = node8.getSideEffectFlags();
        node1.addChildToFront(node8);
        node1.setType((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node18 = node1.getChildAtIndex(12);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("Unknown class name");
        com.google.javascript.rhino.Node node2 = node1.getLastSibling();
        com.google.javascript.rhino.Node node3 = node2.cloneNode();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean9 = node8.isLabelName();
        boolean boolean10 = node8.isDec();
        boolean boolean11 = node8.isNoSideEffectsCall();
        boolean boolean12 = node8.isIf();
        com.google.javascript.rhino.Node node13 = node8.getLastSibling();
        node13.setLineno(45);
        java.lang.String str16 = node13.getQualifiedName();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(32, node13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node13);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("(InputId: true)", 12, 38);
        int int4 = node3.getCharno();
        boolean boolean5 = node3.isInstanceOf();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node7 = node3.getChildAtIndex((int) 'a');
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", (int) '4', 52);
        boolean boolean4 = node3.isContinue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node6 = node3.getChildAtIndex(48);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", (int) '4', 52);
        boolean boolean4 = node3.isArrayLit();
        int int5 = node3.getLineno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node7 = node3.getChildAtIndex(131172);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        com.google.javascript.rhino.Node[] nodeArray6 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(51, nodeArray6, 48, 32);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(42, nodeArray6, 32, 12);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(36, nodeArray6);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(41, nodeArray6, 0, 53);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(39, nodeArray6);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(54, nodeArray6, (int) (short) 0, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node22 = node20.getChildAtIndex(30);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(51, nodeArray8, 48, 32);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (byte) 1, nodeArray8);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(45, nodeArray8);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(40, nodeArray8, 40, (int) (byte) -1);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node(3, nodeArray8, (int) (byte) 10, 51);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (short) 10, nodeArray8, 54, 3);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (byte) 0, nodeArray8, (int) ' ', 4);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(221184, nodeArray8);
        java.io.Serializable[] serializableArray43 = new java.io.Serializable[] { 0.0d, (short) -1, 100.0d, 30 };
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList44 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 0.0d, (java.io.Serializable) 10.0f, (java.io.Serializable) (short) 100, (java.io.Serializable) "hi!", (java.io.Serializable) 1.0d, (java.io.Serializable) 0.0d, (java.io.Serializable) 0, (java.io.Serializable) 'a', (java.io.Serializable) (byte) 0, (java.io.Serializable) 1L, (java.io.Serializable) 1.0d, (java.io.Serializable) (byte) 100, serializableArray43);
        boolean boolean45 = serializableList44.isEmpty();
        boolean boolean47 = serializableList44.contains((java.lang.Object) 52);
        int int49 = serializableList44.indexOf((java.lang.Object) (-1L));
        java.util.Iterator<java.io.Serializable> serializableItor50 = serializableList44.iterator();
        java.util.stream.Stream<java.io.Serializable> serializableStream51 = serializableList44.parallelStream();
        java.util.ListIterator<java.io.Serializable> serializableItor53 = serializableList44.listIterator(0);
        com.google.common.collect.UnmodifiableIterator<java.io.Serializable> serializableItor54 = serializableList44.iterator();
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString("hi!", (int) '4', 52);
        boolean boolean59 = node58.isContinue();
        int int60 = serializableList44.lastIndexOf((java.lang.Object) node58);
        boolean boolean61 = node58.isThrow();
        boolean boolean62 = node58.hasOneChild();
        boolean boolean63 = node58.isArrayLit();
        boolean boolean64 = node58.hasOneChild();
        boolean boolean65 = node58.isContinue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node66 = node26.getChildBefore(node58);
    }
}


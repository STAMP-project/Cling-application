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
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        boolean boolean10 = node4.isDo();
        boolean boolean11 = node4.isDefaultCase();
        node4.setQuotedString();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node19 = node17.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (byte) -1, node17, (int) (byte) 1, (int) '#');
        boolean boolean23 = node17.isScript();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node27.setCharno(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.replaceChild(node17, node27);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean4 = node3.isThrow();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node15 = node13.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (byte) -1, node13, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node25 = node23.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (byte) -1, node23, (int) (byte) 1, (int) '#');
        boolean boolean29 = node18.hasChild(node28);
        int int30 = node18.getCharno();
        com.google.javascript.rhino.Node node31 = node8.useSourceInfoIfMissingFrom(node18);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile32 = node8.getStaticSourceFile();
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = node8.getJSDocInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node8);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node3.setCharno(1);
        boolean boolean6 = node3.isRegExp();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node13 = node11.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (byte) -1, node11, (int) (byte) 1, (int) '#');
        boolean boolean17 = node11.isDo();
        boolean boolean18 = node11.isDefaultCase();
        node11.setQuotedString();
        com.google.javascript.rhino.Node node20 = node3.useSourceInfoFromForTree(node11);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder21 = node20.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean26 = node25.isThrow();
        java.lang.String str30 = node25.toString(true, false, true);
        boolean boolean31 = node25.isOptionalArg();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 4095, 100, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node20.replaceChild(node25, node35);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node3.setCharno(1);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node9.setCharno(1);
        boolean boolean12 = node9.isRegExp();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node19 = node17.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (byte) -1, node17, (int) (byte) 1, (int) '#');
        boolean boolean23 = node17.isDo();
        boolean boolean24 = node17.isDefaultCase();
        node17.setQuotedString();
        com.google.javascript.rhino.Node node26 = node9.useSourceInfoFromForTree(node17);
        node17.putIntProp((int) (byte) 100, (int) (byte) 0);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node36 = node34.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((int) (byte) -1, node34, (int) (byte) 1, (int) '#');
        boolean boolean40 = node34.isScript();
        com.google.javascript.rhino.InputId inputId41 = node34.getInputId();
        com.google.javascript.rhino.Node node42 = node17.useSourceInfoFrom(node34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node34);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        boolean boolean10 = node4.isDo();
        boolean boolean11 = node4.isDefaultCase();
        node4.setQuotedString();
        boolean boolean13 = node4.isDec();
        boolean boolean14 = node4.isLabel();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable15 = node4.siblings();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(51);
        java.lang.String str18 = node4.checkTreeEquals(node17);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node33 = node31.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (byte) -1, node31, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node43 = node41.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((int) (byte) -1, node41, (int) (byte) 1, (int) '#');
        boolean boolean47 = node36.hasChild(node46);
        int int48 = node36.getCharno();
        com.google.javascript.rhino.Node node49 = node26.useSourceInfoIfMissingFrom(node36);
        node49.setLength((int) ' ');
        node22.addChildrenToBack(node49);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable53 = node22.children();
        com.google.javascript.rhino.Node node54 = node22.getLastSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node55 = node4.getChildBefore(node54);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(8, "STRING  0 [quoted: 1]\n");
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node9 = node7.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (byte) -1, node7, (int) (byte) 1, (int) '#');
        boolean boolean13 = node7.isDo();
        boolean boolean14 = node7.isDefaultCase();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node25 = node23.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (byte) -1, node23, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node35 = node33.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((int) (byte) -1, node33, (int) (byte) 1, (int) '#');
        boolean boolean39 = node28.hasChild(node38);
        int int40 = node28.getCharno();
        com.google.javascript.rhino.Node node41 = node18.useSourceInfoIfMissingFrom(node28);
        int int42 = node18.getSourcePosition();
        java.lang.String str43 = node18.toString();
        int int44 = node7.getIndexOfChild(node18);
        int int45 = node2.getIndexOfChild(node18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node47 = node2.getChildAtIndex(15);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 4095, 100, (int) (short) 1);
        double double4 = node3.getDouble();
        boolean boolean5 = node3.isAdd();
        com.google.javascript.rhino.Node node6 = node3.cloneNode();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node10.setCharno(1);
        java.util.Set<java.lang.String> strSet13 = node10.getDirectives();
        node10.setLength(0);
        com.google.javascript.rhino.Node node16 = node3.useSourceInfoIfMissingFrom(node10);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node23 = node21.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (byte) -1, node21, (int) (byte) 1, (int) '#');
        boolean boolean27 = node21.isScript();
        com.google.javascript.rhino.InputId inputId28 = node21.getInputId();
        boolean boolean29 = node21.isDelProp();
        boolean boolean30 = node21.isLocalResultCall();
        java.lang.String str31 = node10.checkTreeEquals(node21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node33 = node21.getChildAtIndex((int) (short) 1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node20 = node18.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (byte) -1, node18, (int) (byte) 1, (int) '#');
        boolean boolean24 = node13.hasChild(node23);
        int int25 = node13.getCharno();
        com.google.javascript.rhino.Node node26 = node3.useSourceInfoIfMissingFrom(node13);
        boolean boolean27 = node3.isSwitch();
        boolean boolean28 = node3.isCall();
        boolean boolean29 = node3.isTypeOf();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node31 = node3.getChildAtIndex(44);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node4.setCharno(1);
        boolean boolean7 = node4.isRegExp();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node14 = node12.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (byte) -1, node12, (int) (byte) 1, (int) '#');
        boolean boolean18 = node12.isDo();
        boolean boolean19 = node12.isDefaultCase();
        node12.setQuotedString();
        com.google.javascript.rhino.Node node21 = node4.useSourceInfoFromForTree(node12);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node25.setCharno(1);
        java.util.Set<java.lang.String> strSet28 = node25.getDirectives();
        node25.setLength(0);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node37 = node35.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (byte) -1, node35, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(0, node21, node25, node40, (int) 'a', (int) (short) 0);
        boolean boolean44 = node21.isString();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node51 = node49.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node((int) (byte) -1, node49, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node61 = node59.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node((int) (byte) -1, node59, (int) (byte) 1, (int) '#');
        boolean boolean65 = node54.hasChild(node64);
        boolean boolean66 = node64.isVar();
        boolean boolean67 = node64.isTypeOf();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable68 = node64.children();
        com.google.javascript.rhino.Node node69 = node21.srcref(node64);
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node76 = node74.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node79 = new com.google.javascript.rhino.Node((int) (byte) -1, node74, (int) (byte) 1, (int) '#');
        boolean boolean80 = node74.isDo();
        boolean boolean81 = node74.isExprResult();
        boolean boolean82 = node74.isTypeOf();
        com.google.javascript.rhino.Node node83 = node21.useSourceInfoFrom(node74);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node85 = node83.getChildAtIndex((int) ' ');
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean4 = node3.isThrow();
        java.lang.String str8 = node3.toString(true, false, true);
        java.lang.String str9 = node3.getQualifiedName();
        boolean boolean10 = node3.isIn();
        com.google.javascript.rhino.Node node11 = node3.cloneTree();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node15.setCharno(1);
        java.util.Set<java.lang.String> strSet18 = node15.getDirectives();
        boolean boolean19 = node15.isHook();
        node11.addChildToFront(node15);
        com.google.javascript.rhino.Node node21 = node15.getLastSibling();
        java.lang.Object obj23 = node21.getProp(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node25 = node21.getChildAtIndex(36);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("STRING  0\n");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node8 = node6.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node((int) (byte) -1, node6, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node18 = node16.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) (byte) -1, node16, (int) (byte) 1, (int) '#');
        boolean boolean22 = node11.hasChild(node21);
        com.google.javascript.rhino.JSDocInfo jSDocInfo23 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str24 = jSDocInfo23.getVersion();
        boolean boolean25 = jSDocInfo23.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet26 = jSDocInfo23.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList27 = jSDocInfo23.getImplementedInterfaces();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean32 = node31.isThrow();
        java.lang.String str36 = node31.toString(true, false, true);
        jSDocInfo23.setAssociatedNode(node31);
        com.google.javascript.rhino.Node node38 = node31.removeFirstChild();
        boolean boolean39 = node31.isNumber();
        boolean boolean40 = node31.isVar();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.replaceChild(node11, node31);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean5 = node4.isThrow();
        java.lang.String str9 = node4.toString(true, false, true);
        java.lang.String str10 = node4.getQualifiedName();
        boolean boolean11 = node4.isIn();
        com.google.javascript.rhino.Node node12 = node4.cloneTree();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node19 = node17.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (byte) -1, node17, (int) (byte) 1, (int) '#');
        boolean boolean23 = node17.isScript();
        com.google.javascript.rhino.Node node24 = node17.detachFromParent();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node28.setCharno(1);
        java.util.Set<java.lang.String> strSet31 = node28.getDirectives();
        boolean boolean32 = node28.isHook();
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node43 = node41.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((int) (byte) -1, node41, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node53 = node51.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((int) (byte) -1, node51, (int) (byte) 1, (int) '#');
        boolean boolean57 = node46.hasChild(node56);
        int int58 = node46.getCharno();
        com.google.javascript.rhino.Node node59 = node36.useSourceInfoIfMissingFrom(node46);
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node64 = node36.srcref(node63);
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node(4095, node12, node24, node28, node36);
        java.lang.String str69 = node36.toString(true, false, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node71 = node36.getChildAtIndex((int) '#');
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        boolean boolean10 = node4.isDo();
        boolean boolean11 = node4.isDefaultCase();
        node4.setQuotedString();
        boolean boolean13 = node4.isDec();
        boolean boolean14 = node4.isLabel();
        int int15 = node4.getType();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node27 = node25.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (byte) -1, node25, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node37 = node35.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (byte) -1, node35, (int) (byte) 1, (int) '#');
        boolean boolean41 = node30.hasChild(node40);
        int int42 = node30.getCharno();
        com.google.javascript.rhino.Node node43 = node20.useSourceInfoIfMissingFrom(node30);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node50 = node48.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node((int) (byte) -1, node48, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node60 = node58.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node((int) (byte) -1, node58, (int) (byte) 1, (int) '#');
        boolean boolean64 = node53.hasChild(node63);
        boolean boolean65 = node63.isVar();
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node((-1), node30, node63);
        boolean boolean67 = node30.isAssignAdd();
        com.google.javascript.rhino.Node node68 = node30.removeFirstChild();
        node68.setVarArgs(true);
        node68.detachChildren();
        java.util.Set<java.lang.String> strSet72 = node68.getDirectives();
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean77 = node76.isThrow();
        java.lang.String str81 = node76.toString(true, false, true);
        java.lang.String str82 = node76.getQualifiedName();
        boolean boolean83 = node76.isIn();
        com.google.javascript.rhino.Node node84 = node76.cloneTree();
        com.google.javascript.rhino.Node node88 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node88.setCharno(1);
        java.util.Set<java.lang.String> strSet91 = node88.getDirectives();
        boolean boolean92 = node88.isHook();
        node84.addChildToFront(node88);
        boolean boolean94 = node84.isNE();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable95 = node84.siblings();
        com.google.javascript.rhino.Node node96 = node68.useSourceInfoFrom(node84);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.removeChild(node84);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(51);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node8 = node6.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node((int) (byte) -1, node6, (int) (byte) 1, (int) '#');
        boolean boolean12 = node6.isDo();
        boolean boolean13 = node6.isDefaultCase();
        node6.setQuotedString();
        com.google.javascript.rhino.Node node15 = node1.copyInformationFrom(node6);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(51);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node24 = node22.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((int) (byte) -1, node22, (int) (byte) 1, (int) '#');
        boolean boolean28 = node22.isDo();
        boolean boolean29 = node22.isDefaultCase();
        node22.setQuotedString();
        com.google.javascript.rhino.Node node31 = node17.copyInformationFrom(node22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node6.removeChild(node31);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean5 = node4.isThrow();
        java.lang.String str9 = node4.toString(true, false, true);
        java.lang.String str10 = node4.getQualifiedName();
        boolean boolean11 = node4.isIn();
        com.google.javascript.rhino.Node node12 = node4.cloneTree();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node19 = node17.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (byte) -1, node17, (int) (byte) 1, (int) '#');
        boolean boolean23 = node17.isScript();
        com.google.javascript.rhino.Node node24 = node17.detachFromParent();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node28.setCharno(1);
        java.util.Set<java.lang.String> strSet31 = node28.getDirectives();
        boolean boolean32 = node28.isHook();
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node43 = node41.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((int) (byte) -1, node41, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node53 = node51.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((int) (byte) -1, node51, (int) (byte) 1, (int) '#');
        boolean boolean57 = node46.hasChild(node56);
        int int58 = node46.getCharno();
        com.google.javascript.rhino.Node node59 = node36.useSourceInfoIfMissingFrom(node46);
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node64 = node36.srcref(node63);
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node(4095, node12, node24, node28, node36);
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node76 = node74.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node79 = new com.google.javascript.rhino.Node((int) (byte) -1, node74, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node84 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node86 = node84.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node89 = new com.google.javascript.rhino.Node((int) (byte) -1, node84, (int) (byte) 1, (int) '#');
        boolean boolean90 = node79.hasChild(node89);
        int int91 = node79.getCharno();
        com.google.javascript.rhino.Node node92 = node69.useSourceInfoIfMissingFrom(node79);
        int int93 = node69.getSourcePosition();
        java.lang.String str94 = node69.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node36.removeChild(node69);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node3.setCharno(1);
        boolean boolean6 = node3.isRegExp();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node13 = node11.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (byte) -1, node11, (int) (byte) 1, (int) '#');
        boolean boolean17 = node11.isDo();
        boolean boolean18 = node11.isDefaultCase();
        node11.setQuotedString();
        com.google.javascript.rhino.Node node20 = node3.useSourceInfoFromForTree(node11);
        boolean boolean21 = node3.isInc();
        java.lang.String str25 = node3.toString(true, false, true);
        boolean boolean26 = node3.isDebugger();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node28 = node3.getChildAtIndex(8);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node4.setCharno(1);
        boolean boolean7 = node4.isRegExp();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node14 = node12.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (byte) -1, node12, (int) (byte) 1, (int) '#');
        boolean boolean18 = node12.isDo();
        boolean boolean19 = node12.isDefaultCase();
        node12.setQuotedString();
        com.google.javascript.rhino.Node node21 = node4.useSourceInfoFromForTree(node12);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node25.setCharno(1);
        java.util.Set<java.lang.String> strSet28 = node25.getDirectives();
        node25.setLength(0);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node37 = node35.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (byte) -1, node35, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(0, node21, node25, node40, (int) 'a', (int) (short) 0);
        boolean boolean44 = node21.isString();
        boolean boolean45 = node21.isNew();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node52 = node50.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((int) (byte) -1, node50, (int) (byte) 1, (int) '#');
        java.lang.String str56 = node50.toStringTree();
        boolean boolean57 = node50.isStringKey();
        boolean boolean58 = node50.isDelProp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node59 = node21.getChildBefore(node50);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node4.setCharno(1);
        boolean boolean7 = node4.isRegExp();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node14 = node12.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (byte) -1, node12, (int) (byte) 1, (int) '#');
        boolean boolean18 = node12.isDo();
        boolean boolean19 = node12.isDefaultCase();
        node12.setQuotedString();
        com.google.javascript.rhino.Node node21 = node4.useSourceInfoFromForTree(node12);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node25.setCharno(1);
        java.util.Set<java.lang.String> strSet28 = node25.getDirectives();
        node25.setLength(0);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node37 = node35.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (byte) -1, node35, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(0, node21, node25, node40, (int) 'a', (int) (short) 0);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node50 = node48.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node((int) (byte) -1, node48, (int) (byte) 1, (int) '#');
        boolean boolean54 = node48.isDo();
        boolean boolean55 = node48.isDefaultCase();
        node48.setQuotedString();
        boolean boolean57 = node48.isDec();
        boolean boolean58 = node48.isLabel();
        com.google.javascript.rhino.Node node59 = node25.useSourceInfoFrom(node48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node61 = node48.getChildAtIndex(44);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node20 = node18.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (byte) -1, node18, (int) (byte) 1, (int) '#');
        boolean boolean24 = node13.hasChild(node23);
        int int25 = node13.getCharno();
        com.google.javascript.rhino.Node node26 = node3.useSourceInfoIfMissingFrom(node13);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node31 = node3.srcref(node30);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean36 = node35.isFromExterns();
        boolean boolean37 = node31.hasChild(node35);
        boolean boolean38 = node35.isOr();
        boolean boolean39 = node35.wasEmptyNode();
        com.google.javascript.rhino.JSDocInfo jSDocInfo40 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str41 = jSDocInfo40.getVersion();
        boolean boolean42 = jSDocInfo40.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet43 = jSDocInfo40.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList44 = jSDocInfo40.getImplementedInterfaces();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean49 = node48.isThrow();
        java.lang.String str53 = node48.toString(true, false, true);
        jSDocInfo40.setAssociatedNode(node48);
        int int56 = node48.getIntProp((int) (byte) 10);
        node48.setSourceEncodedPositionForTree(15);
        node48.setLineno(1);
        boolean boolean61 = node35.isEquivalentTo(node48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node63 = node48.getChildAtIndex(32);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 0, 46);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node8.setCharno(1);
        boolean boolean11 = node8.isRegExp();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node18 = node16.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) (byte) -1, node16, (int) (byte) 1, (int) '#');
        boolean boolean22 = node16.isDo();
        boolean boolean23 = node16.isDefaultCase();
        node16.setQuotedString();
        com.google.javascript.rhino.Node node25 = node8.useSourceInfoFromForTree(node16);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node29.setCharno(1);
        java.util.Set<java.lang.String> strSet32 = node29.getDirectives();
        node29.setLength(0);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node41 = node39.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node((int) (byte) -1, node39, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(0, node25, node29, node44, (int) 'a', (int) (short) 0);
        boolean boolean48 = node25.isNull();
        java.lang.String[] strArray51 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet52 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet52, strArray51);
        java.lang.String[] strArray56 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        boolean boolean59 = strSet52.addAll((java.util.Collection<java.lang.String>) strList57);
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node66 = node64.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node((int) (byte) -1, node64, (int) (byte) 1, (int) '#');
        boolean boolean70 = node64.isScript();
        node64.setQuotedString();
        boolean boolean72 = strSet52.equals((java.lang.Object) node64);
        com.google.javascript.rhino.Node node73 = node25.copyInformationFrom(node64);
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node80 = node78.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node83 = new com.google.javascript.rhino.Node((int) (byte) -1, node78, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node84 = node25.useSourceInfoFrom(node83);
        com.google.javascript.rhino.Node node85 = node3.useSourceInfoFrom(node25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node87 = node25.getChildAtIndex(29);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        boolean boolean14 = node8.isScript();
        node8.setQuotedString();
        com.google.javascript.rhino.Node node16 = node3.srcrefTree(node8);
        boolean boolean17 = node16.isIf();
        com.google.javascript.rhino.Node node18 = node16.getParent();
        node16.removeProp((int) 'a');
        int int21 = node16.getLineno();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node32 = node30.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) (byte) -1, node30, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node42 = node40.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((int) (byte) -1, node40, (int) (byte) 1, (int) '#');
        boolean boolean46 = node35.hasChild(node45);
        int int47 = node35.getCharno();
        com.google.javascript.rhino.Node node48 = node25.useSourceInfoIfMissingFrom(node35);
        boolean boolean49 = node25.isSwitch();
        java.lang.String str50 = node25.toString();
        boolean boolean51 = node25.wasEmptyNode();
        boolean boolean52 = node25.isTrue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node53 = node16.getChildBefore(node25);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str2 = jSDocInfo1.getVersion();
        boolean boolean3 = jSDocInfo1.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet4 = jSDocInfo1.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList5 = jSDocInfo1.getImplementedInterfaces();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList6 = jSDocInfo1.getThrownTypes();
        java.util.Set<java.lang.String> strSet7 = jSDocInfo1.getParameterNames();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo1.getEnumParameterType();
        java.util.Set<java.lang.String> strSet9 = jSDocInfo1.getSuppressions();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        int int15 = node14.getSourcePosition();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node26 = node24.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (byte) -1, node24, (int) (byte) 1, (int) '#');
        boolean boolean30 = node24.isScript();
        node24.setQuotedString();
        com.google.javascript.rhino.Node node32 = node19.srcrefTree(node24);
        boolean boolean33 = node32.isIf();
        com.google.javascript.rhino.Node node34 = node32.getParent();
        node32.removeProp((int) 'a');
        int int37 = node32.getLineno();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(35, "OR 1", (int) (short) 0, 45);
        com.google.javascript.rhino.Node node43 = node42.removeFirstChild();
        com.google.javascript.rhino.Node[] nodeArray44 = new com.google.javascript.rhino.Node[] { node14, node32, node42 };
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(50, nodeArray44, 4095, (int) (short) 0);
        com.google.javascript.rhino.Node[] nodeArray48 = strSet9.toArray(nodeArray44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(12, nodeArray48);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node20 = node18.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (byte) -1, node18, (int) (byte) 1, (int) '#');
        boolean boolean24 = node13.hasChild(node23);
        int int25 = node13.getCharno();
        com.google.javascript.rhino.Node node26 = node3.useSourceInfoIfMissingFrom(node13);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile27 = node3.getStaticSourceFile();
        node3.setVarArgs(true);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node33.setCharno(1);
        java.util.Set<java.lang.String> strSet36 = node33.getDirectives();
        boolean boolean37 = node33.isHook();
        int int38 = node33.getSourceOffset();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) 4095, 100, (int) (short) 1);
        double double43 = node42.getDouble();
        boolean boolean44 = node42.isAdd();
        com.google.javascript.rhino.Node node45 = node42.cloneNode();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node49.setCharno(1);
        java.util.Set<java.lang.String> strSet52 = node49.getDirectives();
        node49.setLength(0);
        com.google.javascript.rhino.Node node55 = node42.useSourceInfoIfMissingFrom(node49);
        boolean boolean56 = node49.isVarArgs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.replaceChild(node33, node49);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(38, "STRING  0");
        int int3 = node2.getLineno();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 10.0f, 41, 32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.removeChild(node7);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node11 = node9.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (byte) -1, node9, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node21 = node19.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (byte) -1, node19, (int) (byte) 1, (int) '#');
        boolean boolean25 = node14.hasChild(node24);
        int int26 = node14.getCharno();
        com.google.javascript.rhino.Node node27 = node4.useSourceInfoIfMissingFrom(node14);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node34 = node32.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) -1, node32, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node44 = node42.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((int) (byte) -1, node42, (int) (byte) 1, (int) '#');
        boolean boolean48 = node37.hasChild(node47);
        boolean boolean49 = node47.isVar();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node((-1), node14, node47);
        boolean boolean51 = node14.isFor();
        boolean boolean52 = node14.isGetterDef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node54 = node14.getChildAtIndex(3);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean4 = node3.isThrow();
        java.lang.String str8 = node3.toString(true, false, true);
        node3.setIsSyntheticBlock(true);
        int int11 = node3.getLength();
        boolean boolean12 = node3.isNumber();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node14 = node3.getChildAtIndex((int) (short) 1);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node16 = node14.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) -1, node14, (int) (byte) 1, (int) '#');
        boolean boolean20 = node9.hasChild(node19);
        boolean boolean21 = node19.isVar();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(12, "STRING  0 [synthetic: 1]\n");
        com.google.javascript.rhino.Node node25 = node19.useSourceInfoFromForTree(node24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node27 = node25.getChildAtIndex(38);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        boolean boolean10 = node4.isScript();
        node4.setQuotedString();
        java.lang.String str12 = node4.getString();
        boolean boolean13 = node4.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node16 = node4.getChildBefore(node15);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str2 = jSDocInfo1.getVersion();
        boolean boolean3 = jSDocInfo1.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet4 = jSDocInfo1.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList5 = jSDocInfo1.getImplementedInterfaces();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList6 = jSDocInfo1.getThrownTypes();
        java.util.Set<java.lang.String> strSet7 = jSDocInfo1.getParameterNames();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo1.getEnumParameterType();
        java.util.Set<java.lang.String> strSet9 = jSDocInfo1.getSuppressions();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        int int15 = node14.getSourcePosition();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node26 = node24.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (byte) -1, node24, (int) (byte) 1, (int) '#');
        boolean boolean30 = node24.isScript();
        node24.setQuotedString();
        com.google.javascript.rhino.Node node32 = node19.srcrefTree(node24);
        boolean boolean33 = node32.isIf();
        com.google.javascript.rhino.Node node34 = node32.getParent();
        node32.removeProp((int) 'a');
        int int37 = node32.getLineno();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(35, "OR 1", (int) (short) 0, 45);
        com.google.javascript.rhino.Node node43 = node42.removeFirstChild();
        com.google.javascript.rhino.Node[] nodeArray44 = new com.google.javascript.rhino.Node[] { node14, node32, node42 };
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(50, nodeArray44, 4095, (int) (short) 0);
        com.google.javascript.rhino.Node[] nodeArray48 = strSet9.toArray(nodeArray44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node((int) (byte) 1, nodeArray44, 51, 100);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        boolean boolean10 = node4.isScript();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node14.setCharno(1);
        java.util.Set<java.lang.String> strSet17 = node14.getDirectives();
        java.lang.String str18 = node4.checkTreeEquals(node14);
        com.google.javascript.rhino.Node node19 = node14.getFirstChild();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node26 = node24.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (byte) -1, node24, (int) (byte) 1, (int) '#');
        boolean boolean30 = node24.isScript();
        node24.setQuotedString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node32 = node14.getChildBefore(node24);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean4 = node3.isThrow();
        java.lang.String str8 = node3.toString(true, false, true);
        java.lang.String str9 = node3.getQualifiedName();
        boolean boolean10 = node3.isThis();
        java.lang.String[] strArray13 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = strSet14.addAll((java.util.Collection<java.lang.String>) strList19);
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str23 = jSDocInfo22.getVersion();
        java.lang.String str24 = jSDocInfo22.getFileOverview();
        boolean boolean25 = jSDocInfo22.shouldPreserveTry();
        java.util.Set<java.lang.String> strSet26 = jSDocInfo22.getParameterNames();
        boolean boolean27 = strSet14.retainAll((java.util.Collection<java.lang.String>) strSet26);
        java.util.stream.Stream<java.lang.String> strStream28 = strSet14.stream();
        node3.setDirectives((java.util.Set<java.lang.String>) strSet14);
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node40 = node38.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((int) (byte) -1, node38, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node50 = node48.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node((int) (byte) -1, node48, (int) (byte) 1, (int) '#');
        boolean boolean54 = node43.hasChild(node53);
        int int55 = node43.getCharno();
        com.google.javascript.rhino.Node node56 = node33.useSourceInfoIfMissingFrom(node43);
        node56.setLength((int) ' ');
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node69 = node67.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node((int) (byte) -1, node67, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node79 = node77.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node82 = new com.google.javascript.rhino.Node((int) (byte) -1, node77, (int) (byte) 1, (int) '#');
        boolean boolean83 = node72.hasChild(node82);
        int int84 = node72.getCharno();
        com.google.javascript.rhino.Node node85 = node62.useSourceInfoIfMissingFrom(node72);
        com.google.javascript.rhino.Node node89 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node90 = node62.srcref(node89);
        boolean boolean91 = node56.isEquivalentToTyped(node62);
        boolean boolean92 = node62.isOr();
        boolean boolean93 = node62.isDelProp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node62);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("(Not declared as a type name)");
        com.google.javascript.rhino.Node node2 = node1.cloneTree();
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node5 = node2.getChildBefore(node4);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node16 = node14.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) -1, node14, (int) (byte) 1, (int) '#');
        boolean boolean20 = node9.hasChild(node19);
        boolean boolean21 = node19.isVar();
        boolean boolean22 = node19.isTypeOf();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node19.children();
        boolean boolean24 = node19.isTrue();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node29.setCharno(1);
        boolean boolean32 = node29.isRegExp();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node39 = node37.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((int) (byte) -1, node37, (int) (byte) 1, (int) '#');
        boolean boolean43 = node37.isDo();
        boolean boolean44 = node37.isDefaultCase();
        node37.setQuotedString();
        com.google.javascript.rhino.Node node46 = node29.useSourceInfoFromForTree(node37);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node50.setCharno(1);
        java.util.Set<java.lang.String> strSet53 = node50.getDirectives();
        node50.setLength(0);
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node62 = node60.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node((int) (byte) -1, node60, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node(0, node46, node50, node65, (int) 'a', (int) (short) 0);
        boolean boolean69 = node46.isNull();
        java.lang.String[] strArray72 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet73 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet73, strArray72);
        java.lang.String[] strArray77 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList78 = new java.util.ArrayList<java.lang.String>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList78, strArray77);
        boolean boolean80 = strSet73.addAll((java.util.Collection<java.lang.String>) strList78);
        com.google.javascript.rhino.Node node85 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node87 = node85.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node90 = new com.google.javascript.rhino.Node((int) (byte) -1, node85, (int) (byte) 1, (int) '#');
        boolean boolean91 = node85.isScript();
        node85.setQuotedString();
        boolean boolean93 = strSet73.equals((java.lang.Object) node85);
        com.google.javascript.rhino.Node node94 = node46.copyInformationFrom(node85);
        com.google.javascript.rhino.Node node95 = node19.useSourceInfoIfMissingFrom(node94);
        boolean boolean96 = node19.isSwitch();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node98 = node19.getChildAtIndex(5);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node3.setCharno(1);
        boolean boolean6 = node3.isRegExp();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node13 = node11.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (byte) -1, node11, (int) (byte) 1, (int) '#');
        boolean boolean17 = node11.isDo();
        boolean boolean18 = node11.isDefaultCase();
        node11.setQuotedString();
        com.google.javascript.rhino.Node node20 = node3.useSourceInfoFromForTree(node11);
        node11.putIntProp((int) (byte) 100, (int) (byte) 0);
        node11.setCharno((int) (short) 1);
        java.lang.String str26 = node11.getString();
        boolean boolean27 = node11.isThis();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable28 = node11.getAncestors();
        com.google.javascript.rhino.jstype.JSType jSType29 = node11.getJSType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node31 = node11.getChildAtIndex((int) (short) 100);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node5 = node3.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node9.setCharno(1);
        boolean boolean12 = node9.isRegExp();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node19 = node17.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (byte) -1, node17, (int) (byte) 1, (int) '#');
        boolean boolean23 = node17.isDo();
        boolean boolean24 = node17.isDefaultCase();
        node17.setQuotedString();
        com.google.javascript.rhino.Node node26 = node9.useSourceInfoFromForTree(node17);
        node17.putIntProp((int) (byte) 100, (int) (byte) 0);
        node17.putProp((int) 'a', (java.lang.Object) "JSDocInfo");
        boolean boolean33 = node17.isGetterDef();
        boolean boolean34 = node17.isDo();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile35 = node17.getStaticSourceFile();
        int int36 = node3.getIndexOfChild(node17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node38 = node3.getChildAtIndex(49);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str2 = jSDocInfo1.getVersion();
        boolean boolean3 = jSDocInfo1.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet4 = jSDocInfo1.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList5 = jSDocInfo1.getImplementedInterfaces();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList6 = jSDocInfo1.getThrownTypes();
        java.util.Set<java.lang.String> strSet7 = jSDocInfo1.getParameterNames();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo1.getEnumParameterType();
        java.util.Set<java.lang.String> strSet9 = jSDocInfo1.getSuppressions();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        int int15 = node14.getSourcePosition();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node26 = node24.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (byte) -1, node24, (int) (byte) 1, (int) '#');
        boolean boolean30 = node24.isScript();
        node24.setQuotedString();
        com.google.javascript.rhino.Node node32 = node19.srcrefTree(node24);
        boolean boolean33 = node32.isIf();
        com.google.javascript.rhino.Node node34 = node32.getParent();
        node32.removeProp((int) 'a');
        int int37 = node32.getLineno();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(35, "OR 1", (int) (short) 0, 45);
        com.google.javascript.rhino.Node node43 = node42.removeFirstChild();
        com.google.javascript.rhino.Node[] nodeArray44 = new com.google.javascript.rhino.Node[] { node14, node32, node42 };
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(50, nodeArray44, 4095, (int) (short) 0);
        com.google.javascript.rhino.Node[] nodeArray48 = strSet9.toArray(nodeArray44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((int) (short) 10, nodeArray48);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node3.setCharno(1);
        boolean boolean6 = node3.isRegExp();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node13 = node11.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (byte) -1, node11, (int) (byte) 1, (int) '#');
        boolean boolean17 = node11.isDo();
        boolean boolean18 = node11.isDefaultCase();
        node11.setQuotedString();
        com.google.javascript.rhino.Node node20 = node3.useSourceInfoFromForTree(node11);
        node11.putIntProp((int) (byte) 100, (int) (byte) 0);
        node11.putProp((int) 'a', (java.lang.Object) "JSDocInfo");
        boolean boolean27 = node11.isInc();
        node11.setQuotedString();
        java.lang.String str29 = node11.getSourceFileName();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber((double) 4095, 100, (int) (short) 1);
        double double34 = node33.getDouble();
        int int35 = node33.getSourcePosition();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node39.setCharno(1);
        boolean boolean42 = node39.isRegExp();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node49 = node47.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node((int) (byte) -1, node47, (int) (byte) 1, (int) '#');
        boolean boolean53 = node47.isDo();
        boolean boolean54 = node47.isDefaultCase();
        node47.setQuotedString();
        com.google.javascript.rhino.Node node56 = node39.useSourceInfoFromForTree(node47);
        node47.putIntProp((int) (byte) 100, (int) (byte) 0);
        node47.putProp((int) 'a', (java.lang.Object) "JSDocInfo");
        boolean boolean63 = node47.isInc();
        node47.setQuotedString();
        java.lang.String str65 = node47.getSourceFileName();
        com.google.javascript.rhino.Node node66 = node33.copyInformationFrom(node47);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable67 = node33.getAncestors();
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newNumber((double) 4095, 100, (int) (short) 1);
        double double72 = node71.getDouble();
        boolean boolean73 = node71.isAdd();
        com.google.javascript.rhino.Node node74 = node71.cloneNode();
        com.google.javascript.rhino.jstype.JSType jSType75 = node74.getJSType();
        java.lang.String str76 = node74.toStringTree();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node11.replaceChild(node33, node74);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 4095, 100, (int) (short) 1);
        boolean boolean4 = node3.isThis();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node6 = node3.getChildAtIndex(39);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList4 = jSDocInfo0.getImplementedInterfaces();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean9 = node8.isThrow();
        java.lang.String str13 = node8.toString(true, false, true);
        jSDocInfo0.setAssociatedNode(node8);
        int int16 = node8.getIntProp((int) (byte) 10);
        node8.setSourceEncodedPositionForTree(15);
        boolean boolean19 = node8.isNull();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(52, 0, 43);
        boolean boolean24 = node23.isString();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node35 = node33.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((int) (byte) -1, node33, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node45 = node43.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node((int) (byte) -1, node43, (int) (byte) 1, (int) '#');
        boolean boolean49 = node38.hasChild(node48);
        int int50 = node38.getCharno();
        com.google.javascript.rhino.Node node51 = node28.useSourceInfoIfMissingFrom(node38);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile52 = node28.getStaticSourceFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node8.replaceChild(node23, node28);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        boolean boolean14 = node8.isScript();
        node8.setQuotedString();
        com.google.javascript.rhino.Node node16 = node3.srcrefTree(node8);
        boolean boolean17 = node16.isIf();
        com.google.javascript.rhino.Node node18 = node16.getParent();
        node16.removeProp((int) 'a');
        boolean boolean22 = node16.getBooleanProp(32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node24 = node16.getChildAtIndex(151562);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 4095, 100, (int) (short) 1);
        double double4 = node3.getDouble();
        int int5 = node3.getSourcePosition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node7 = node3.getChildAtIndex(2);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        boolean boolean10 = node4.isDo();
        boolean boolean11 = node4.isDefaultCase();
        node4.setQuotedString();
        boolean boolean13 = node4.isDec();
        boolean boolean14 = node4.isLabel();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable15 = node4.siblings();
        com.google.javascript.rhino.Node node16 = node4.detachFromParent();
        node16.setLength(51);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(51);
        boolean boolean21 = node20.isHook();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node22 = node16.getChildBefore(node20);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str2 = jSDocInfo1.getVersion();
        boolean boolean3 = jSDocInfo1.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet4 = jSDocInfo1.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList5 = jSDocInfo1.getImplementedInterfaces();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList6 = jSDocInfo1.getThrownTypes();
        java.util.Set<java.lang.String> strSet7 = jSDocInfo1.getParameterNames();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo1.getEnumParameterType();
        java.util.Set<java.lang.String> strSet9 = jSDocInfo1.getSuppressions();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        int int15 = node14.getSourcePosition();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node26 = node24.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (byte) -1, node24, (int) (byte) 1, (int) '#');
        boolean boolean30 = node24.isScript();
        node24.setQuotedString();
        com.google.javascript.rhino.Node node32 = node19.srcrefTree(node24);
        boolean boolean33 = node32.isIf();
        com.google.javascript.rhino.Node node34 = node32.getParent();
        node32.removeProp((int) 'a');
        int int37 = node32.getLineno();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(35, "OR 1", (int) (short) 0, 45);
        com.google.javascript.rhino.Node node43 = node42.removeFirstChild();
        com.google.javascript.rhino.Node[] nodeArray44 = new com.google.javascript.rhino.Node[] { node14, node32, node42 };
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(50, nodeArray44, 4095, (int) (short) 0);
        com.google.javascript.rhino.Node[] nodeArray48 = strSet9.toArray(nodeArray44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((-1), nodeArray44);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node3.setCharno(1);
        boolean boolean6 = node3.isRegExp();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node13 = node11.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (byte) -1, node11, (int) (byte) 1, (int) '#');
        boolean boolean17 = node11.isDo();
        boolean boolean18 = node11.isDefaultCase();
        node11.setQuotedString();
        com.google.javascript.rhino.Node node20 = node3.useSourceInfoFromForTree(node11);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder21 = node20.new FileLevelJsDocBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node23 = node20.getChildAtIndex((int) (byte) 1);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean5 = node4.isThrow();
        java.lang.String str9 = node4.toString(true, false, true);
        java.lang.String str10 = node4.getQualifiedName();
        boolean boolean11 = node4.isIn();
        com.google.javascript.rhino.Node node12 = node4.cloneTree();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node19 = node17.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (byte) -1, node17, (int) (byte) 1, (int) '#');
        boolean boolean23 = node17.isScript();
        com.google.javascript.rhino.Node node24 = node17.detachFromParent();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node28.setCharno(1);
        java.util.Set<java.lang.String> strSet31 = node28.getDirectives();
        boolean boolean32 = node28.isHook();
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node43 = node41.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((int) (byte) -1, node41, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node53 = node51.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((int) (byte) -1, node51, (int) (byte) 1, (int) '#');
        boolean boolean57 = node46.hasChild(node56);
        int int58 = node46.getCharno();
        com.google.javascript.rhino.Node node59 = node36.useSourceInfoIfMissingFrom(node46);
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node64 = node36.srcref(node63);
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node(4095, node12, node24, node28, node36);
        boolean boolean66 = node12.isDec();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node68 = node12.getChildAtIndex(48);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node12 = node10.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((int) (byte) -1, node10, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node22 = node20.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (byte) -1, node20, (int) (byte) 1, (int) '#');
        boolean boolean26 = node15.hasChild(node25);
        int int27 = node15.getCharno();
        com.google.javascript.rhino.Node node28 = node5.useSourceInfoIfMissingFrom(node15);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node35 = node33.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((int) (byte) -1, node33, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node45 = node43.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node((int) (byte) -1, node43, (int) (byte) 1, (int) '#');
        boolean boolean49 = node38.hasChild(node48);
        boolean boolean50 = node48.isVar();
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node((-1), node15, node48);
        com.google.javascript.rhino.Node node52 = node51.getParent();
        boolean boolean53 = node51.isSetterDef();
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node((-1), node51);
        int int55 = node54.getSideEffectFlags();
        com.google.javascript.rhino.Node node56 = node54.removeChildren();
        boolean boolean57 = node54.isNoSideEffectsCall();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node59 = node54.getChildAtIndex(44);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str2 = jSDocInfo1.getVersion();
        boolean boolean3 = jSDocInfo1.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet4 = jSDocInfo1.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList5 = jSDocInfo1.getImplementedInterfaces();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList6 = jSDocInfo1.getThrownTypes();
        java.util.Set<java.lang.String> strSet7 = jSDocInfo1.getParameterNames();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo1.getEnumParameterType();
        java.util.Set<java.lang.String> strSet9 = jSDocInfo1.getSuppressions();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        int int15 = node14.getSourcePosition();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node26 = node24.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (byte) -1, node24, (int) (byte) 1, (int) '#');
        boolean boolean30 = node24.isScript();
        node24.setQuotedString();
        com.google.javascript.rhino.Node node32 = node19.srcrefTree(node24);
        boolean boolean33 = node32.isIf();
        com.google.javascript.rhino.Node node34 = node32.getParent();
        node32.removeProp((int) 'a');
        int int37 = node32.getLineno();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(35, "OR 1", (int) (short) 0, 45);
        com.google.javascript.rhino.Node node43 = node42.removeFirstChild();
        com.google.javascript.rhino.Node[] nodeArray44 = new com.google.javascript.rhino.Node[] { node14, node32, node42 };
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(50, nodeArray44, 4095, (int) (short) 0);
        com.google.javascript.rhino.Node[] nodeArray48 = strSet9.toArray(nodeArray44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((int) '4', nodeArray48);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        boolean boolean10 = node4.isDo();
        boolean boolean11 = node4.isDefaultCase();
        node4.setQuotedString();
        boolean boolean13 = node4.isDec();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean18 = node17.isThrow();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean23 = node22.isThrow();
        java.lang.String str27 = node22.toString(true, false, true);
        java.lang.String str28 = node22.getQualifiedName();
        boolean boolean29 = node22.isIn();
        com.google.javascript.rhino.Node node30 = node22.cloneTree();
        boolean boolean31 = node30.isRegExp();
        boolean boolean32 = node30.isDebugger();
        node17.addChildToBack(node30);
        node30.setIsSyntheticBlock(true);
        boolean boolean36 = node4.hasChild(node30);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean41 = node40.isThrow();
        java.lang.String str45 = node40.toString(true, false, true);
        boolean boolean46 = node40.isGetterDef();
        com.google.javascript.rhino.JSDocInfo jSDocInfo47 = node40.getJSDocInfo();
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node58 = node56.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node((int) (byte) -1, node56, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node68 = node66.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node((int) (byte) -1, node66, (int) (byte) 1, (int) '#');
        boolean boolean72 = node61.hasChild(node71);
        int int73 = node61.getCharno();
        com.google.javascript.rhino.Node node74 = node51.useSourceInfoIfMissingFrom(node61);
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node79 = node51.srcref(node78);
        boolean boolean80 = node79.isAssignAdd();
        boolean boolean81 = node40.isEquivalentToTyped(node79);
        boolean boolean83 = node40.getBooleanProp(48);
        com.google.javascript.rhino.Node node84 = node4.useSourceInfoIfMissingFrom(node40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node86 = node40.getChildAtIndex(40);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str2 = jSDocInfo1.getVersion();
        boolean boolean3 = jSDocInfo1.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet4 = jSDocInfo1.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList5 = jSDocInfo1.getImplementedInterfaces();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList6 = jSDocInfo1.getThrownTypes();
        java.util.Set<java.lang.String> strSet7 = jSDocInfo1.getParameterNames();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo1.getEnumParameterType();
        java.util.Set<java.lang.String> strSet9 = jSDocInfo1.getSuppressions();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        int int15 = node14.getSourcePosition();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node26 = node24.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (byte) -1, node24, (int) (byte) 1, (int) '#');
        boolean boolean30 = node24.isScript();
        node24.setQuotedString();
        com.google.javascript.rhino.Node node32 = node19.srcrefTree(node24);
        boolean boolean33 = node32.isIf();
        com.google.javascript.rhino.Node node34 = node32.getParent();
        node32.removeProp((int) 'a');
        int int37 = node32.getLineno();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(35, "OR 1", (int) (short) 0, 45);
        com.google.javascript.rhino.Node node43 = node42.removeFirstChild();
        com.google.javascript.rhino.Node[] nodeArray44 = new com.google.javascript.rhino.Node[] { node14, node32, node42 };
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(50, nodeArray44, 4095, (int) (short) 0);
        com.google.javascript.rhino.Node[] nodeArray48 = strSet9.toArray(nodeArray44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((int) ' ', nodeArray48);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        int int4 = node3.getType();
        com.google.javascript.rhino.Node node5 = node3.cloneNode();
        node3.removeProp(35);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString((int) (byte) -1, "true", 0, 54);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(12, "STRING  0 [synthetic: 1]\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.replaceChild(node12, node15);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node3.setCharno(1);
        node3.setSourceEncodedPositionForTree((int) (short) 1);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) (short) -1);
        int int10 = node9.getChildCount();
        boolean boolean11 = node9.isThrow();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node22 = node20.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (byte) -1, node20, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node32 = node30.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) (byte) -1, node30, (int) (byte) 1, (int) '#');
        boolean boolean36 = node25.hasChild(node35);
        int int37 = node25.getCharno();
        com.google.javascript.rhino.Node node38 = node15.useSourceInfoIfMissingFrom(node25);
        int int39 = node15.getSourcePosition();
        java.lang.String str40 = node15.toString();
        java.lang.String str41 = node15.toStringTree();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.replaceChild(node9, node15);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str2 = jSDocInfo1.getVersion();
        boolean boolean3 = jSDocInfo1.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet4 = jSDocInfo1.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList5 = jSDocInfo1.getImplementedInterfaces();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList6 = jSDocInfo1.getThrownTypes();
        java.util.Set<java.lang.String> strSet7 = jSDocInfo1.getParameterNames();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo1.getEnumParameterType();
        java.util.Set<java.lang.String> strSet9 = jSDocInfo1.getSuppressions();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        int int15 = node14.getSourcePosition();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node26 = node24.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (byte) -1, node24, (int) (byte) 1, (int) '#');
        boolean boolean30 = node24.isScript();
        node24.setQuotedString();
        com.google.javascript.rhino.Node node32 = node19.srcrefTree(node24);
        boolean boolean33 = node32.isIf();
        com.google.javascript.rhino.Node node34 = node32.getParent();
        node32.removeProp((int) 'a');
        int int37 = node32.getLineno();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(35, "OR 1", (int) (short) 0, 45);
        com.google.javascript.rhino.Node node43 = node42.removeFirstChild();
        com.google.javascript.rhino.Node[] nodeArray44 = new com.google.javascript.rhino.Node[] { node14, node32, node42 };
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(50, nodeArray44, 4095, (int) (short) 0);
        com.google.javascript.rhino.Node[] nodeArray48 = strSet9.toArray(nodeArray44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node(36, nodeArray44, 31, 4131);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        boolean boolean14 = node8.isScript();
        node8.setQuotedString();
        com.google.javascript.rhino.Node node16 = node3.srcrefTree(node8);
        boolean boolean17 = node3.isVar();
        boolean boolean18 = node3.isCase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node20 = node3.getChildAtIndex(30);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node11 = node9.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (byte) -1, node9, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node21 = node19.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (byte) -1, node19, (int) (byte) 1, (int) '#');
        boolean boolean25 = node14.hasChild(node24);
        int int26 = node14.getCharno();
        com.google.javascript.rhino.Node node27 = node4.useSourceInfoIfMissingFrom(node14);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node34 = node32.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) -1, node32, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node44 = node42.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((int) (byte) -1, node42, (int) (byte) 1, (int) '#');
        boolean boolean48 = node37.hasChild(node47);
        boolean boolean49 = node47.isVar();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node((-1), node14, node47);
        boolean boolean51 = node14.isAssignAdd();
        com.google.javascript.rhino.Node node52 = node14.removeFirstChild();
        boolean boolean53 = node52.isNumber();
        boolean boolean54 = node52.isArrayLit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node56 = node52.getChildAtIndex((int) '#');
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("STRING  0 [quoted: 1]\n");
        boolean boolean2 = node1.isFor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node4 = node1.getChildAtIndex(15);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        java.lang.String str10 = node4.toStringTree();
        boolean boolean11 = node4.isStringKey();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node18 = node16.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) (byte) -1, node16, (int) (byte) 1, (int) '#');
        boolean boolean22 = node16.isDo();
        com.google.javascript.rhino.Node node23 = node16.getLastSibling();
        boolean boolean24 = node16.isAssignAdd();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.removeChild(node16);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str2 = jSDocInfo1.getVersion();
        boolean boolean3 = jSDocInfo1.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet4 = jSDocInfo1.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList5 = jSDocInfo1.getImplementedInterfaces();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList6 = jSDocInfo1.getThrownTypes();
        java.util.Set<java.lang.String> strSet7 = jSDocInfo1.getParameterNames();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo1.getEnumParameterType();
        java.util.Set<java.lang.String> strSet9 = jSDocInfo1.getSuppressions();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        int int15 = node14.getSourcePosition();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node26 = node24.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (byte) -1, node24, (int) (byte) 1, (int) '#');
        boolean boolean30 = node24.isScript();
        node24.setQuotedString();
        com.google.javascript.rhino.Node node32 = node19.srcrefTree(node24);
        boolean boolean33 = node32.isIf();
        com.google.javascript.rhino.Node node34 = node32.getParent();
        node32.removeProp((int) 'a');
        int int37 = node32.getLineno();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(35, "OR 1", (int) (short) 0, 45);
        com.google.javascript.rhino.Node node43 = node42.removeFirstChild();
        com.google.javascript.rhino.Node[] nodeArray44 = new com.google.javascript.rhino.Node[] { node14, node32, node42 };
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(50, nodeArray44, 4095, (int) (short) 0);
        com.google.javascript.rhino.Node[] nodeArray48 = strSet9.toArray(nodeArray44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node(46, nodeArray48, (int) ' ', 4);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        java.lang.String[] strArray3 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet4 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet4, strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        boolean boolean11 = strSet4.addAll((java.util.Collection<java.lang.String>) strList9);
        boolean boolean13 = strSet4.remove((java.lang.Object) 1L);
        java.lang.String[] strArray16 = new java.lang.String[] { "STRING  0", "STRING  0" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        boolean boolean20 = strSet17.add("STRING  0");
        java.lang.String[] strArray23 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        boolean boolean31 = strSet24.addAll((java.util.Collection<java.lang.String>) strList29);
        boolean boolean32 = strSet17.containsAll((java.util.Collection<java.lang.String>) strList29);
        boolean boolean33 = strSet4.addAll((java.util.Collection<java.lang.String>) strSet17);
        java.util.stream.Stream<java.lang.String> strStream34 = strSet17.stream();
        strSet17.clear();
        java.lang.CharSequence[] charSequenceArray38 = new java.lang.CharSequence[] { "(Node tree inequality:\nTree1:\nSTRING  0 [quoted: 1]\n\n\nTree2:\nIN\n\n\nSubtree1: STRING  0 [quoted: 1]\n\n\nSubtree2: IN\n)", "STRING  0\n" };
        java.lang.CharSequence[] charSequenceArray39 = strSet17.toArray(charSequenceArray38);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        int int45 = node44.getSourcePosition();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node56 = node54.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node((int) (byte) -1, node54, (int) (byte) 1, (int) '#');
        boolean boolean60 = node54.isScript();
        node54.setQuotedString();
        com.google.javascript.rhino.Node node62 = node49.srcrefTree(node54);
        boolean boolean63 = node62.isIf();
        com.google.javascript.rhino.Node node64 = node62.getParent();
        node62.removeProp((int) 'a');
        int int67 = node62.getLineno();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString(35, "OR 1", (int) (short) 0, 45);
        com.google.javascript.rhino.Node node73 = node72.removeFirstChild();
        com.google.javascript.rhino.Node[] nodeArray74 = new com.google.javascript.rhino.Node[] { node44, node62, node72 };
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node(50, nodeArray74, 4095, (int) (short) 0);
        com.google.javascript.rhino.Node[] nodeArray78 = strSet17.toArray(nodeArray74);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node79 = new com.google.javascript.rhino.Node(53, nodeArray78);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        java.lang.String[] strArray3 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet4 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet4, strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        boolean boolean11 = strSet4.addAll((java.util.Collection<java.lang.String>) strList9);
        boolean boolean13 = strSet4.remove((java.lang.Object) 1L);
        java.lang.String[] strArray16 = new java.lang.String[] { "STRING  0", "STRING  0" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        boolean boolean20 = strSet17.add("STRING  0");
        java.lang.String[] strArray23 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        boolean boolean31 = strSet24.addAll((java.util.Collection<java.lang.String>) strList29);
        boolean boolean32 = strSet17.containsAll((java.util.Collection<java.lang.String>) strList29);
        boolean boolean33 = strSet4.addAll((java.util.Collection<java.lang.String>) strSet17);
        java.util.stream.Stream<java.lang.String> strStream34 = strSet17.stream();
        strSet17.clear();
        java.lang.CharSequence[] charSequenceArray38 = new java.lang.CharSequence[] { "(Node tree inequality:\nTree1:\nSTRING  0 [quoted: 1]\n\n\nTree2:\nIN\n\n\nSubtree1: STRING  0 [quoted: 1]\n\n\nSubtree2: IN\n)", "STRING  0\n" };
        java.lang.CharSequence[] charSequenceArray39 = strSet17.toArray(charSequenceArray38);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        int int45 = node44.getSourcePosition();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node56 = node54.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node((int) (byte) -1, node54, (int) (byte) 1, (int) '#');
        boolean boolean60 = node54.isScript();
        node54.setQuotedString();
        com.google.javascript.rhino.Node node62 = node49.srcrefTree(node54);
        boolean boolean63 = node62.isIf();
        com.google.javascript.rhino.Node node64 = node62.getParent();
        node62.removeProp((int) 'a');
        int int67 = node62.getLineno();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString(35, "OR 1", (int) (short) 0, 45);
        com.google.javascript.rhino.Node node73 = node72.removeFirstChild();
        com.google.javascript.rhino.Node[] nodeArray74 = new com.google.javascript.rhino.Node[] { node44, node62, node72 };
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node(50, nodeArray74, 4095, (int) (short) 0);
        com.google.javascript.rhino.Node[] nodeArray78 = strSet17.toArray(nodeArray74);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node81 = new com.google.javascript.rhino.Node((-1), nodeArray78, 38, 52);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node20 = node18.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (byte) -1, node18, (int) (byte) 1, (int) '#');
        boolean boolean24 = node13.hasChild(node23);
        int int25 = node13.getCharno();
        com.google.javascript.rhino.Node node26 = node3.useSourceInfoIfMissingFrom(node13);
        node26.setLength((int) ' ');
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node39 = node37.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((int) (byte) -1, node37, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node49 = node47.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node((int) (byte) -1, node47, (int) (byte) 1, (int) '#');
        boolean boolean53 = node42.hasChild(node52);
        int int54 = node42.getCharno();
        com.google.javascript.rhino.Node node55 = node32.useSourceInfoIfMissingFrom(node42);
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node60 = node32.srcref(node59);
        boolean boolean61 = node26.isEquivalentToTyped(node32);
        com.google.javascript.rhino.Node node62 = node32.getNext();
        boolean boolean63 = node32.isQuotedString();
        com.google.javascript.rhino.Node node64 = node32.cloneTree();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node66 = node32.getChildAtIndex(39);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(47);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node8 = node6.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node((int) (byte) -1, node6, (int) (byte) 1, (int) '#');
        boolean boolean12 = node6.isDo();
        boolean boolean13 = node6.isDefaultCase();
        node6.setQuotedString();
        boolean boolean15 = node6.isDec();
        boolean boolean16 = node6.isLabel();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable17 = node6.siblings();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node32 = node30.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) (byte) -1, node30, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node42 = node40.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((int) (byte) -1, node40, (int) (byte) 1, (int) '#');
        boolean boolean46 = node35.hasChild(node45);
        int int47 = node35.getCharno();
        com.google.javascript.rhino.Node node48 = node25.useSourceInfoIfMissingFrom(node35);
        node48.setLength((int) ' ');
        node21.addChildrenToBack(node48);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable52 = node21.children();
        boolean boolean53 = node21.isHook();
        int int54 = node6.getIndexOfChild(node21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node55 = node1.getChildBefore(node21);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str2 = jSDocInfo1.getVersion();
        boolean boolean3 = jSDocInfo1.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet4 = jSDocInfo1.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList5 = jSDocInfo1.getImplementedInterfaces();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList6 = jSDocInfo1.getThrownTypes();
        java.util.Set<java.lang.String> strSet7 = jSDocInfo1.getParameterNames();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo1.getEnumParameterType();
        java.util.Set<java.lang.String> strSet9 = jSDocInfo1.getSuppressions();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        int int15 = node14.getSourcePosition();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node26 = node24.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (byte) -1, node24, (int) (byte) 1, (int) '#');
        boolean boolean30 = node24.isScript();
        node24.setQuotedString();
        com.google.javascript.rhino.Node node32 = node19.srcrefTree(node24);
        boolean boolean33 = node32.isIf();
        com.google.javascript.rhino.Node node34 = node32.getParent();
        node32.removeProp((int) 'a');
        int int37 = node32.getLineno();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(35, "OR 1", (int) (short) 0, 45);
        com.google.javascript.rhino.Node node43 = node42.removeFirstChild();
        com.google.javascript.rhino.Node[] nodeArray44 = new com.google.javascript.rhino.Node[] { node14, node32, node42 };
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(50, nodeArray44, 4095, (int) (short) 0);
        com.google.javascript.rhino.Node[] nodeArray48 = strSet9.toArray(nodeArray44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node(53, nodeArray44, 32, 32);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node20 = node18.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (byte) -1, node18, (int) (byte) 1, (int) '#');
        boolean boolean24 = node13.hasChild(node23);
        int int25 = node13.getCharno();
        com.google.javascript.rhino.Node node26 = node3.useSourceInfoIfMissingFrom(node13);
        boolean boolean27 = node3.isSwitch();
        java.lang.String str28 = node3.toString();
        boolean boolean29 = node3.isOptionalArg();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node36 = node34.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((int) (byte) -1, node34, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node46 = node44.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((int) (byte) -1, node44, (int) (byte) 1, (int) '#');
        boolean boolean50 = node39.hasChild(node49);
        boolean boolean51 = node49.isVar();
        boolean boolean52 = node49.isTypeOf();
        boolean boolean53 = node49.isAssignAdd();
        java.lang.String str54 = node49.getQualifiedName();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node61 = node59.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node((int) (byte) -1, node59, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node71 = node69.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node74 = new com.google.javascript.rhino.Node((int) (byte) -1, node69, (int) (byte) 1, (int) '#');
        boolean boolean75 = node64.hasChild(node74);
        boolean boolean76 = node74.isVar();
        boolean boolean77 = node74.isCase();
        boolean boolean78 = node49.hasChild(node74);
        node49.setOptionalArg(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node81 = node3.getChildBefore(node49);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean4 = node3.isThrow();
        java.lang.String str8 = node3.toString(true, false, true);
        java.lang.String str9 = node3.getQualifiedName();
        boolean boolean10 = node3.isIn();
        com.google.javascript.rhino.Node node11 = node3.cloneTree();
        boolean boolean12 = node11.isRegExp();
        boolean boolean13 = node11.isExprResult();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node15 = node11.getChildAtIndex(6);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node11 = node9.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (byte) -1, node9, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node21 = node19.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (byte) -1, node19, (int) (byte) 1, (int) '#');
        boolean boolean25 = node14.hasChild(node24);
        int int26 = node14.getCharno();
        com.google.javascript.rhino.Node node27 = node4.useSourceInfoIfMissingFrom(node14);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node32 = node4.srcref(node31);
        node4.setType(38);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString("STRING  0 [synthetic: 1]\n", (int) ' ', (int) (byte) -1);
        node38.setSourceFileForTesting("Not declared as a type name");
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node52 = node50.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((int) (byte) -1, node50, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node62 = node60.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node((int) (byte) -1, node60, (int) (byte) 1, (int) '#');
        boolean boolean66 = node55.hasChild(node65);
        int int67 = node55.getCharno();
        com.google.javascript.rhino.Node node68 = node45.useSourceInfoIfMissingFrom(node55);
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node75 = node73.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node78 = new com.google.javascript.rhino.Node((int) (byte) -1, node73, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node83 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node85 = node83.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node88 = new com.google.javascript.rhino.Node((int) (byte) -1, node83, (int) (byte) 1, (int) '#');
        boolean boolean89 = node78.hasChild(node88);
        boolean boolean90 = node88.isVar();
        com.google.javascript.rhino.Node node91 = new com.google.javascript.rhino.Node((-1), node55, node88);
        com.google.javascript.rhino.Node node92 = node91.getParent();
        com.google.javascript.rhino.Node node93 = new com.google.javascript.rhino.Node((int) ' ', node4, node38, node91);
        boolean boolean94 = node91.isFunction();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node96 = node91.getChildAtIndex(50);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node4.setCharno(1);
        boolean boolean7 = node4.isRegExp();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node14 = node12.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (byte) -1, node12, (int) (byte) 1, (int) '#');
        boolean boolean18 = node12.isDo();
        boolean boolean19 = node12.isDefaultCase();
        node12.setQuotedString();
        com.google.javascript.rhino.Node node21 = node4.useSourceInfoFromForTree(node12);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node25.setCharno(1);
        java.util.Set<java.lang.String> strSet28 = node25.getDirectives();
        node25.setLength(0);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node37 = node35.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (byte) -1, node35, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(0, node21, node25, node40, (int) 'a', (int) (short) 0);
        boolean boolean44 = node21.isNull();
        java.lang.String[] strArray47 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        java.lang.String[] strArray52 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        boolean boolean55 = strSet48.addAll((java.util.Collection<java.lang.String>) strList53);
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node62 = node60.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node((int) (byte) -1, node60, (int) (byte) 1, (int) '#');
        boolean boolean66 = node60.isScript();
        node60.setQuotedString();
        boolean boolean68 = strSet48.equals((java.lang.Object) node60);
        com.google.javascript.rhino.Node node69 = node21.copyInformationFrom(node60);
        int int70 = node21.getSourceOffset();
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node77 = node75.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node80 = new com.google.javascript.rhino.Node((int) (byte) -1, node75, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node85 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node87 = node85.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node90 = new com.google.javascript.rhino.Node((int) (byte) -1, node85, (int) (byte) 1, (int) '#');
        boolean boolean91 = node80.hasChild(node90);
        boolean boolean92 = node90.isVar();
        boolean boolean93 = node90.isBlock();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder94 = node90.new FileLevelJsDocBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node21.removeChild(node90);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        boolean boolean14 = node8.isScript();
        com.google.javascript.rhino.Node node15 = node8.detachFromParent();
        node15.setOptionalArg(false);
        boolean boolean19 = node15.getBooleanProp(31);
        com.google.javascript.rhino.Node node20 = node3.copyInformationFrom(node15);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString((int) (byte) 0, "STRING  0\n");
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable24 = node23.getAncestors();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node23);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        int int4 = node3.getType();
        com.google.javascript.rhino.Node node5 = node3.cloneNode();
        boolean boolean6 = node3.isTypeOf();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node8 = node3.getChildAtIndex(6);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        boolean boolean10 = node4.isDo();
        boolean boolean11 = node4.isDefaultCase();
        node4.setQuotedString();
        boolean boolean13 = node4.isDec();
        boolean boolean14 = node4.hasMoreThanOneChild();
        boolean boolean15 = node4.isTrue();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("", 0, 10);
        int int20 = node19.getType();
        boolean boolean21 = node19.isArrayLit();
        boolean boolean22 = node19.isComma();
        boolean boolean23 = node19.isGetProp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node24 = node4.getChildBefore(node19);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str2 = jSDocInfo1.getVersion();
        boolean boolean3 = jSDocInfo1.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet4 = jSDocInfo1.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList5 = jSDocInfo1.getImplementedInterfaces();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList6 = jSDocInfo1.getThrownTypes();
        java.util.Set<java.lang.String> strSet7 = jSDocInfo1.getParameterNames();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo1.getEnumParameterType();
        java.util.Set<java.lang.String> strSet9 = jSDocInfo1.getSuppressions();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        int int15 = node14.getSourcePosition();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node26 = node24.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (byte) -1, node24, (int) (byte) 1, (int) '#');
        boolean boolean30 = node24.isScript();
        node24.setQuotedString();
        com.google.javascript.rhino.Node node32 = node19.srcrefTree(node24);
        boolean boolean33 = node32.isIf();
        com.google.javascript.rhino.Node node34 = node32.getParent();
        node32.removeProp((int) 'a');
        int int37 = node32.getLineno();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(35, "OR 1", (int) (short) 0, 45);
        com.google.javascript.rhino.Node node43 = node42.removeFirstChild();
        com.google.javascript.rhino.Node[] nodeArray44 = new com.google.javascript.rhino.Node[] { node14, node32, node42 };
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(50, nodeArray44, 4095, (int) (short) 0);
        com.google.javascript.rhino.Node[] nodeArray48 = strSet9.toArray(nodeArray44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node(51, nodeArray48, 35, 16773120);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node20 = node18.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (byte) -1, node18, (int) (byte) 1, (int) '#');
        boolean boolean24 = node13.hasChild(node23);
        int int25 = node13.getCharno();
        com.google.javascript.rhino.Node node26 = node3.useSourceInfoIfMissingFrom(node13);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node31 = node3.srcref(node30);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean36 = node35.isFromExterns();
        boolean boolean37 = node31.hasChild(node35);
        boolean boolean38 = node35.isOr();
        boolean boolean39 = node35.isReturn();
        java.lang.String str40 = node35.toStringTree();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node42 = node35.getChildAtIndex(10);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        java.lang.String[] strArray3 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet4 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet4, strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        boolean boolean11 = strSet4.addAll((java.util.Collection<java.lang.String>) strList9);
        boolean boolean13 = strSet4.remove((java.lang.Object) 1L);
        java.lang.String[] strArray16 = new java.lang.String[] { "STRING  0", "STRING  0" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        boolean boolean20 = strSet17.add("STRING  0");
        java.lang.String[] strArray23 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        boolean boolean31 = strSet24.addAll((java.util.Collection<java.lang.String>) strList29);
        boolean boolean32 = strSet17.containsAll((java.util.Collection<java.lang.String>) strList29);
        boolean boolean33 = strSet4.addAll((java.util.Collection<java.lang.String>) strSet17);
        java.util.stream.Stream<java.lang.String> strStream34 = strSet17.stream();
        strSet17.clear();
        java.lang.CharSequence[] charSequenceArray38 = new java.lang.CharSequence[] { "(Node tree inequality:\nTree1:\nSTRING  0 [quoted: 1]\n\n\nTree2:\nIN\n\n\nSubtree1: STRING  0 [quoted: 1]\n\n\nSubtree2: IN\n)", "STRING  0\n" };
        java.lang.CharSequence[] charSequenceArray39 = strSet17.toArray(charSequenceArray38);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        int int45 = node44.getSourcePosition();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node56 = node54.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node((int) (byte) -1, node54, (int) (byte) 1, (int) '#');
        boolean boolean60 = node54.isScript();
        node54.setQuotedString();
        com.google.javascript.rhino.Node node62 = node49.srcrefTree(node54);
        boolean boolean63 = node62.isIf();
        com.google.javascript.rhino.Node node64 = node62.getParent();
        node62.removeProp((int) 'a');
        int int67 = node62.getLineno();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString(35, "OR 1", (int) (short) 0, 45);
        com.google.javascript.rhino.Node node73 = node72.removeFirstChild();
        com.google.javascript.rhino.Node[] nodeArray74 = new com.google.javascript.rhino.Node[] { node44, node62, node72 };
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node(50, nodeArray74, 4095, (int) (short) 0);
        com.google.javascript.rhino.Node[] nodeArray78 = strSet17.toArray(nodeArray74);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node79 = new com.google.javascript.rhino.Node(29, nodeArray74);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        java.lang.String[] strArray3 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet4 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet4, strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        boolean boolean11 = strSet4.addAll((java.util.Collection<java.lang.String>) strList9);
        boolean boolean13 = strSet4.remove((java.lang.Object) 1L);
        java.lang.String[] strArray16 = new java.lang.String[] { "STRING  0", "STRING  0" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        boolean boolean20 = strSet17.add("STRING  0");
        java.lang.String[] strArray23 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        boolean boolean31 = strSet24.addAll((java.util.Collection<java.lang.String>) strList29);
        boolean boolean32 = strSet17.containsAll((java.util.Collection<java.lang.String>) strList29);
        boolean boolean33 = strSet4.addAll((java.util.Collection<java.lang.String>) strSet17);
        java.util.stream.Stream<java.lang.String> strStream34 = strSet17.stream();
        strSet17.clear();
        java.lang.CharSequence[] charSequenceArray38 = new java.lang.CharSequence[] { "(Node tree inequality:\nTree1:\nSTRING  0 [quoted: 1]\n\n\nTree2:\nIN\n\n\nSubtree1: STRING  0 [quoted: 1]\n\n\nSubtree2: IN\n)", "STRING  0\n" };
        java.lang.CharSequence[] charSequenceArray39 = strSet17.toArray(charSequenceArray38);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        int int45 = node44.getSourcePosition();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node56 = node54.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node((int) (byte) -1, node54, (int) (byte) 1, (int) '#');
        boolean boolean60 = node54.isScript();
        node54.setQuotedString();
        com.google.javascript.rhino.Node node62 = node49.srcrefTree(node54);
        boolean boolean63 = node62.isIf();
        com.google.javascript.rhino.Node node64 = node62.getParent();
        node62.removeProp((int) 'a');
        int int67 = node62.getLineno();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString(35, "OR 1", (int) (short) 0, 45);
        com.google.javascript.rhino.Node node73 = node72.removeFirstChild();
        com.google.javascript.rhino.Node[] nodeArray74 = new com.google.javascript.rhino.Node[] { node44, node62, node72 };
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node(50, nodeArray74, 4095, (int) (short) 0);
        com.google.javascript.rhino.Node[] nodeArray78 = strSet17.toArray(nodeArray74);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node79 = new com.google.javascript.rhino.Node((int) (byte) 0, nodeArray74);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        boolean boolean10 = node4.isDo();
        boolean boolean11 = node4.isDefaultCase();
        node4.setQuotedString();
        boolean boolean13 = node4.isDec();
        boolean boolean14 = node4.isLabel();
        boolean boolean15 = node4.isSetterDef();
        boolean boolean16 = node4.isRegExp();
        boolean boolean17 = node4.isName();
        boolean boolean18 = node4.isVoid();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node25 = node23.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (byte) -1, node23, (int) (byte) 1, (int) '#');
        boolean boolean29 = node23.isDo();
        com.google.javascript.rhino.Node node30 = node4.useSourceInfoIfMissingFrom(node23);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node37 = node35.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (byte) -1, node35, (int) (byte) 1, (int) '#');
        int int41 = node40.getType();
        boolean boolean42 = node40.isFor();
        node23.addChildToFront(node40);
        boolean boolean44 = node23.isTry();
        node23.setOptionalArg(true);
        node23.setString("Node tree inequality:\nTree1:\nNUMBER 4095.0 100\n\n\nTree2:\nNUMBER 4095.0 100\n    INSTANCEOF\n        STRING  0\n\n\nSubtree1: NUMBER 4095.0 100\n\n\nSubtree2: NUMBER 4095.0 100\n    INSTANCEOF\n        STRING  0\n");
        boolean boolean49 = node23.isVar();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node51 = node23.getChildAtIndex(21);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node11 = node9.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (byte) -1, node9, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node21 = node19.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (byte) -1, node19, (int) (byte) 1, (int) '#');
        boolean boolean25 = node14.hasChild(node24);
        int int26 = node14.getCharno();
        com.google.javascript.rhino.Node node27 = node4.useSourceInfoIfMissingFrom(node14);
        boolean boolean28 = node4.isSwitch();
        java.lang.String str29 = node4.toString();
        boolean boolean30 = node4.wasEmptyNode();
        boolean boolean31 = node4.isTrue();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(31, node4);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) 4095, 100, (int) (short) 1);
        double double37 = node36.getDouble();
        boolean boolean38 = node36.isAdd();
        com.google.javascript.rhino.Node node39 = node36.cloneNode();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node43.setCharno(1);
        java.util.Set<java.lang.String> strSet46 = node43.getDirectives();
        node43.setLength(0);
        com.google.javascript.rhino.Node node49 = node36.useSourceInfoIfMissingFrom(node43);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node56 = node54.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node((int) (byte) -1, node54, (int) (byte) 1, (int) '#');
        boolean boolean60 = node54.isScript();
        com.google.javascript.rhino.InputId inputId61 = node54.getInputId();
        boolean boolean62 = node54.isDelProp();
        boolean boolean63 = node54.isLocalResultCall();
        java.lang.String str64 = node43.checkTreeEquals(node54);
        boolean boolean65 = node54.isReturn();
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newNumber((double) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.replaceChild(node54, node67);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean5 = node4.isThrow();
        java.lang.String str9 = node4.toString(true, false, true);
        java.lang.String str10 = node4.getQualifiedName();
        boolean boolean11 = node4.isIn();
        com.google.javascript.rhino.Node node12 = node4.cloneTree();
        boolean boolean13 = node12.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(40, node12);
        node12.setCharno(50);
        com.google.javascript.rhino.Node node17 = node12.removeChildren();
        com.google.javascript.rhino.Node[] nodeArray20 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) (short) 10, nodeArray20);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(41, nodeArray20, (int) (byte) 100, 4131);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node25 = node12.getChildBefore(node24);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str2 = jSDocInfo1.getVersion();
        boolean boolean3 = jSDocInfo1.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet4 = jSDocInfo1.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList5 = jSDocInfo1.getImplementedInterfaces();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList6 = jSDocInfo1.getThrownTypes();
        java.util.Set<java.lang.String> strSet7 = jSDocInfo1.getParameterNames();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo1.getEnumParameterType();
        java.util.Set<java.lang.String> strSet9 = jSDocInfo1.getSuppressions();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        int int15 = node14.getSourcePosition();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node26 = node24.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (byte) -1, node24, (int) (byte) 1, (int) '#');
        boolean boolean30 = node24.isScript();
        node24.setQuotedString();
        com.google.javascript.rhino.Node node32 = node19.srcrefTree(node24);
        boolean boolean33 = node32.isIf();
        com.google.javascript.rhino.Node node34 = node32.getParent();
        node32.removeProp((int) 'a');
        int int37 = node32.getLineno();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(35, "OR 1", (int) (short) 0, 45);
        com.google.javascript.rhino.Node node43 = node42.removeFirstChild();
        com.google.javascript.rhino.Node[] nodeArray44 = new com.google.javascript.rhino.Node[] { node14, node32, node42 };
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(50, nodeArray44, 4095, (int) (short) 0);
        com.google.javascript.rhino.Node[] nodeArray48 = strSet9.toArray(nodeArray44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(4, nodeArray44);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node20 = node18.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (byte) -1, node18, (int) (byte) 1, (int) '#');
        boolean boolean24 = node13.hasChild(node23);
        int int25 = node13.getCharno();
        com.google.javascript.rhino.Node node26 = node3.useSourceInfoIfMissingFrom(node13);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node31 = node3.srcref(node30);
        boolean boolean32 = node31.isAssignAdd();
        boolean boolean33 = node31.hasChildren();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber((double) 4095, 100, (int) (short) 1);
        double double38 = node37.getDouble();
        boolean boolean39 = node37.isAdd();
        boolean boolean40 = node37.isDelProp();
        boolean boolean41 = node37.isLabelName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node31.removeChild(node37);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        java.lang.String[] strArray3 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet4 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet4, strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        boolean boolean11 = strSet4.addAll((java.util.Collection<java.lang.String>) strList9);
        boolean boolean13 = strSet4.remove((java.lang.Object) 1L);
        java.lang.String[] strArray16 = new java.lang.String[] { "STRING  0", "STRING  0" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        boolean boolean20 = strSet17.add("STRING  0");
        java.lang.String[] strArray23 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        boolean boolean31 = strSet24.addAll((java.util.Collection<java.lang.String>) strList29);
        boolean boolean32 = strSet17.containsAll((java.util.Collection<java.lang.String>) strList29);
        boolean boolean33 = strSet4.addAll((java.util.Collection<java.lang.String>) strSet17);
        java.util.stream.Stream<java.lang.String> strStream34 = strSet17.stream();
        strSet17.clear();
        java.lang.CharSequence[] charSequenceArray38 = new java.lang.CharSequence[] { "(Node tree inequality:\nTree1:\nSTRING  0 [quoted: 1]\n\n\nTree2:\nIN\n\n\nSubtree1: STRING  0 [quoted: 1]\n\n\nSubtree2: IN\n)", "STRING  0\n" };
        java.lang.CharSequence[] charSequenceArray39 = strSet17.toArray(charSequenceArray38);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        int int45 = node44.getSourcePosition();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node56 = node54.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node((int) (byte) -1, node54, (int) (byte) 1, (int) '#');
        boolean boolean60 = node54.isScript();
        node54.setQuotedString();
        com.google.javascript.rhino.Node node62 = node49.srcrefTree(node54);
        boolean boolean63 = node62.isIf();
        com.google.javascript.rhino.Node node64 = node62.getParent();
        node62.removeProp((int) 'a');
        int int67 = node62.getLineno();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString(35, "OR 1", (int) (short) 0, 45);
        com.google.javascript.rhino.Node node73 = node72.removeFirstChild();
        com.google.javascript.rhino.Node[] nodeArray74 = new com.google.javascript.rhino.Node[] { node44, node62, node72 };
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node(50, nodeArray74, 4095, (int) (short) 0);
        com.google.javascript.rhino.Node[] nodeArray78 = strSet17.toArray(nodeArray74);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node79 = new com.google.javascript.rhino.Node(15, nodeArray78);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean4 = node3.isThrow();
        boolean boolean5 = node3.isSwitch();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node12 = node10.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((int) (byte) -1, node10, (int) (byte) 1, (int) '#');
        boolean boolean16 = node10.isDo();
        boolean boolean17 = node10.isDefaultCase();
        node10.setQuotedString();
        boolean boolean19 = node10.isDec();
        boolean boolean20 = node10.isLabel();
        boolean boolean21 = node10.isSetterDef();
        boolean boolean22 = node10.isRegExp();
        boolean boolean23 = node10.isName();
        boolean boolean24 = node10.isVoid();
        com.google.javascript.rhino.Node node25 = node10.cloneNode();
        com.google.javascript.rhino.Node node26 = node3.useSourceInfoIfMissingFrom(node25);
        boolean boolean27 = node26.isRegExp();
        boolean boolean28 = node26.isAdd();
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node40 = node38.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((int) (byte) -1, node38, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node50 = node48.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node((int) (byte) -1, node48, (int) (byte) 1, (int) '#');
        boolean boolean54 = node43.hasChild(node53);
        int int55 = node43.getCharno();
        com.google.javascript.rhino.Node node56 = node33.useSourceInfoIfMissingFrom(node43);
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node61 = node33.srcref(node60);
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean66 = node65.isFromExterns();
        boolean boolean67 = node61.hasChild(node65);
        node26.putProp(97, (java.lang.Object) node61);
        com.google.javascript.rhino.Node node69 = node61.getLastSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node71 = node69.getChildAtIndex(4095);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean4 = node3.isThrow();
        java.lang.String str8 = node3.toString(true, false, true);
        node3.setIsSyntheticBlock(true);
        int int11 = node3.getLength();
        boolean boolean12 = node3.isNumber();
        node3.setSourceEncodedPositionForTree(40);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable15 = node3.getAncestors();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node17 = node3.getChildAtIndex(1);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node11 = node9.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (byte) -1, node9, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node21 = node19.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (byte) -1, node19, (int) (byte) 1, (int) '#');
        boolean boolean25 = node14.hasChild(node24);
        int int26 = node14.getCharno();
        com.google.javascript.rhino.Node node27 = node4.useSourceInfoIfMissingFrom(node14);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node32 = node4.srcref(node31);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean37 = node36.isFromExterns();
        boolean boolean38 = node32.hasChild(node36);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(52, node36);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node43.setCharno(1);
        java.util.Set<java.lang.String> strSet46 = node43.getDirectives();
        node43.setCharno((int) (short) -1);
        boolean boolean49 = node43.isRegExp();
        node36.addChildrenToFront(node43);
        com.google.javascript.rhino.JSDocInfo jSDocInfo51 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str52 = jSDocInfo51.getVersion();
        boolean boolean53 = jSDocInfo51.hasEnumParameterType();
        boolean boolean54 = jSDocInfo51.isNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression55 = jSDocInfo51.getTypedefType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility56 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo51.setVisibility(visibility56);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection58 = jSDocInfo51.getTypeNodes();
        jSDocInfo51.setDeprecated(false);
        boolean boolean61 = jSDocInfo51.isNoSideEffects();
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString("", 0, 10);
        int int66 = node65.getType();
        boolean boolean67 = node65.isArrayLit();
        jSDocInfo51.setAssociatedNode(node65);
        com.google.javascript.rhino.Node node69 = node43.useSourceInfoFrom(node65);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node71 = node65.getChildAtIndex(38);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean4 = node3.isThrow();
        java.lang.String str8 = node3.toString(true, false, true);
        java.lang.String str9 = node3.getQualifiedName();
        boolean boolean10 = node3.isIn();
        com.google.javascript.rhino.Node node11 = node3.cloneTree();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node15.setCharno(1);
        java.util.Set<java.lang.String> strSet18 = node15.getDirectives();
        boolean boolean19 = node15.isHook();
        node11.addChildToFront(node15);
        boolean boolean21 = node11.isNE();
        boolean boolean22 = node11.isArrayLit();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node29 = node27.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (byte) -1, node27, (int) (byte) 1, (int) '#');
        boolean boolean33 = node27.isDo();
        boolean boolean34 = node27.isDefaultCase();
        node27.setQuotedString();
        boolean boolean36 = node27.isDec();
        boolean boolean37 = node27.isTypeOf();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean42 = node41.isThrow();
        java.lang.String str46 = node41.toString(true, false, true);
        java.lang.String str47 = node41.getQualifiedName();
        boolean boolean48 = node41.isIn();
        com.google.javascript.rhino.Node node49 = node41.cloneTree();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node53.setCharno(1);
        java.util.Set<java.lang.String> strSet56 = node53.getDirectives();
        boolean boolean57 = node53.isHook();
        node49.addChildToFront(node53);
        com.google.javascript.rhino.Node node59 = node53.getLastSibling();
        java.lang.Object obj61 = node59.getProp(2);
        com.google.javascript.rhino.Node node62 = node27.useSourceInfoFrom(node59);
        node62.setVarArgs(true);
        boolean boolean65 = node62.isDec();
        com.google.javascript.rhino.Node node66 = node11.copyInformationFromForTree(node62);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node68 = node11.getChildAtIndex((int) '4');
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        boolean boolean10 = node4.isDo();
        boolean boolean11 = node4.isDefaultCase();
        node4.setQuotedString();
        boolean boolean13 = node4.isDec();
        boolean boolean14 = node4.hasMoreThanOneChild();
        int int15 = node4.getChildCount();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node22 = node20.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (byte) -1, node20, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node32 = node30.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) (byte) -1, node30, (int) (byte) 1, (int) '#');
        boolean boolean36 = node25.hasChild(node35);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString(49, "STRING  0\n");
        com.google.javascript.rhino.Node node40 = node25.clonePropsFrom(node39);
        node40.putIntProp(38, 32);
        boolean boolean44 = node40.isScript();
        boolean boolean45 = node40.isLabel();
        boolean boolean46 = node40.isRegExp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node47 = node4.getChildBefore(node40);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node20 = node18.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (byte) -1, node18, (int) (byte) 1, (int) '#');
        boolean boolean24 = node13.hasChild(node23);
        int int25 = node13.getCharno();
        com.google.javascript.rhino.Node node26 = node3.useSourceInfoIfMissingFrom(node13);
        node26.setLength((int) ' ');
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node39 = node37.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((int) (byte) -1, node37, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node49 = node47.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node((int) (byte) -1, node47, (int) (byte) 1, (int) '#');
        boolean boolean53 = node42.hasChild(node52);
        int int54 = node42.getCharno();
        com.google.javascript.rhino.Node node55 = node32.useSourceInfoIfMissingFrom(node42);
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node60 = node32.srcref(node59);
        boolean boolean61 = node26.isEquivalentToTyped(node32);
        com.google.javascript.rhino.Node node62 = node32.getNext();
        boolean boolean63 = node32.isQuotedString();
        node32.setType(151562);
        boolean boolean66 = node32.isThis();
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean71 = node70.isThrow();
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean76 = node75.isThrow();
        java.lang.String str80 = node75.toString(true, false, true);
        java.lang.String str81 = node75.getQualifiedName();
        boolean boolean82 = node75.isIn();
        com.google.javascript.rhino.Node node83 = node75.cloneTree();
        boolean boolean84 = node83.isRegExp();
        boolean boolean85 = node83.isDebugger();
        node70.addChildToBack(node83);
        node83.setString("");
        node83.setWasEmptyNode(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node32.removeChild(node83);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node11 = node9.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (byte) -1, node9, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node21 = node19.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (byte) -1, node19, (int) (byte) 1, (int) '#');
        boolean boolean25 = node14.hasChild(node24);
        int int26 = node14.getCharno();
        com.google.javascript.rhino.Node node27 = node4.useSourceInfoIfMissingFrom(node14);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node34 = node32.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) -1, node32, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node44 = node42.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((int) (byte) -1, node42, (int) (byte) 1, (int) '#');
        boolean boolean48 = node37.hasChild(node47);
        boolean boolean49 = node47.isVar();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node((-1), node14, node47);
        boolean boolean51 = node14.isAssignAdd();
        com.google.javascript.rhino.Node node52 = node14.removeFirstChild();
        node52.setVarArgs(true);
        node52.detachChildren();
        java.lang.String str56 = node52.toString();
        boolean boolean57 = node52.isAssignAdd();
        node52.setIsSyntheticBlock(false);
        boolean boolean60 = node52.isLabel();
        com.google.javascript.rhino.Node node61 = node52.getLastChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node63 = node52.getChildAtIndex(15);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean4 = node3.isThrow();
        boolean boolean5 = node3.isSwitch();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node12 = node10.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((int) (byte) -1, node10, (int) (byte) 1, (int) '#');
        boolean boolean16 = node10.isDo();
        boolean boolean17 = node10.isDefaultCase();
        node10.setQuotedString();
        boolean boolean19 = node10.isDec();
        boolean boolean20 = node10.isLabel();
        boolean boolean21 = node10.isSetterDef();
        boolean boolean22 = node10.isRegExp();
        boolean boolean23 = node10.isName();
        boolean boolean24 = node10.isVoid();
        com.google.javascript.rhino.Node node25 = node10.cloneNode();
        com.google.javascript.rhino.Node node26 = node3.useSourceInfoIfMissingFrom(node25);
        boolean boolean27 = node26.isRegExp();
        boolean boolean28 = node26.isAdd();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node30 = node26.getChildAtIndex(15);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node3.setCharno(1);
        boolean boolean6 = node3.isRegExp();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node13 = node11.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (byte) -1, node11, (int) (byte) 1, (int) '#');
        boolean boolean17 = node11.isDo();
        boolean boolean18 = node11.isDefaultCase();
        node11.setQuotedString();
        com.google.javascript.rhino.Node node20 = node3.useSourceInfoFromForTree(node11);
        node20.setSourceFileForTesting("STRING  0\n");
        node20.setSourceFileForTesting("Named type with empty name component");
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node32 = node30.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) (byte) -1, node30, (int) (byte) 1, (int) '#');
        boolean boolean36 = node30.isScript();
        com.google.javascript.rhino.Node node37 = node30.detachFromParent();
        boolean boolean38 = node30.isAssignAdd();
        node20.putProp(15, (java.lang.Object) boolean38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node41 = node20.getChildAtIndex(37);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node3.setCharno(1);
        java.util.Set<java.lang.String> strSet6 = node3.getDirectives();
        node3.setCharno((int) (short) -1);
        boolean boolean9 = node3.isRegExp();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean15 = node14.isFromExterns();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(39, node14, (int) '4', 51);
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = node14.getJSDocInfo();
        node14.setCharno(36);
        node14.setCharno(54);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node24 = node3.getChildBefore(node14);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        boolean boolean14 = node8.isScript();
        node8.setQuotedString();
        com.google.javascript.rhino.Node node16 = node3.srcrefTree(node8);
        boolean boolean17 = node8.isBreak();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node24 = node22.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((int) (byte) -1, node22, (int) (byte) 1, (int) '#');
        boolean boolean28 = node22.isDo();
        boolean boolean29 = node22.isDefaultCase();
        node22.setQuotedString();
        boolean boolean31 = node22.isDec();
        boolean boolean32 = node22.isLabel();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable33 = node22.siblings();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(51);
        java.lang.String str36 = node22.checkTreeEquals(node35);
        boolean boolean37 = node22.isOr();
        com.google.javascript.rhino.JSDocInfo jSDocInfo38 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str39 = jSDocInfo38.getVersion();
        boolean boolean40 = jSDocInfo38.hasEnumParameterType();
        java.lang.String str42 = jSDocInfo38.getDescriptionForParameter("STRING  0\n");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList43 = jSDocInfo38.getExtendedInterfaces();
        node22.setJSDocInfo(jSDocInfo38);
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node55 = node53.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node((int) (byte) -1, node53, (int) (byte) 1, (int) '#');
        boolean boolean59 = node53.isScript();
        node53.setQuotedString();
        com.google.javascript.rhino.Node node61 = node48.srcrefTree(node53);
        boolean boolean62 = node53.isBreak();
        boolean boolean63 = node22.hasChild(node53);
        java.lang.String str64 = node8.checkTreeEquals(node53);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable65 = node8.siblings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node67 = node8.getChildAtIndex(47);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node3.setCharno(1);
        boolean boolean6 = node3.isRegExp();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node13 = node11.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (byte) -1, node11, (int) (byte) 1, (int) '#');
        boolean boolean17 = node11.isDo();
        boolean boolean18 = node11.isDefaultCase();
        node11.setQuotedString();
        com.google.javascript.rhino.Node node20 = node3.useSourceInfoFromForTree(node11);
        node11.putIntProp((int) (byte) 100, (int) (byte) 0);
        boolean boolean24 = node11.isVarArgs();
        boolean boolean25 = node11.isGetProp();
        node11.putBooleanProp((int) 'a', true);
        com.google.javascript.rhino.InputId inputId29 = node11.getInputId();
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node40 = node38.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((int) (byte) -1, node38, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node50 = node48.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node((int) (byte) -1, node48, (int) (byte) 1, (int) '#');
        boolean boolean54 = node43.hasChild(node53);
        int int55 = node43.getCharno();
        com.google.javascript.rhino.Node node56 = node33.useSourceInfoIfMissingFrom(node43);
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node61 = node33.srcref(node60);
        boolean boolean62 = node61.isDec();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node63 = node11.getChildBefore(node61);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node3.setCharno(1);
        boolean boolean6 = node3.isRegExp();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node13 = node11.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (byte) -1, node11, (int) (byte) 1, (int) '#');
        boolean boolean17 = node11.isDo();
        boolean boolean18 = node11.isDefaultCase();
        node11.setQuotedString();
        com.google.javascript.rhino.Node node20 = node3.useSourceInfoFromForTree(node11);
        node11.putIntProp((int) (byte) 100, (int) (byte) 0);
        boolean boolean24 = node11.isVarArgs();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean29 = node28.isThrow();
        java.lang.String str33 = node28.toString(true, false, true);
        node28.setIsSyntheticBlock(true);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString(53, "OR 51");
        boolean boolean39 = node38.isLabel();
        java.util.Set<java.lang.String> strSet40 = node38.getDirectives();
        java.lang.Object obj42 = node38.getProp(44);
        node38.setSourceEncodedPosition(8);
        node28.addChildrenToBack(node38);
        boolean boolean46 = node11.isEquivalentTo(node38);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 2, 8, 50);
        boolean boolean51 = node38.isEquivalentToTyped(node50);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean56 = node55.isThrow();
        java.lang.String str60 = node55.toString(true, false, true);
        java.lang.String str61 = node55.getQualifiedName();
        boolean boolean62 = node55.isIn();
        com.google.javascript.rhino.Node node63 = node55.cloneTree();
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node67.setCharno(1);
        java.util.Set<java.lang.String> strSet70 = node67.getDirectives();
        boolean boolean71 = node67.isHook();
        node63.addChildToFront(node67);
        boolean boolean73 = node63.isNE();
        com.google.javascript.rhino.JSDocInfo jSDocInfo74 = node63.getJSDocInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node75 = node50.getChildBefore(node63);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        boolean boolean10 = node4.isScript();
        com.google.javascript.rhino.InputId inputId11 = node4.getInputId();
        java.lang.Object obj13 = node4.getProp(42);
        node4.setSourceEncodedPositionForTree(48);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node26 = node24.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (byte) -1, node24, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node36 = node34.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((int) (byte) -1, node34, (int) (byte) 1, (int) '#');
        boolean boolean40 = node29.hasChild(node39);
        int int41 = node29.getCharno();
        com.google.javascript.rhino.Node node42 = node19.useSourceInfoIfMissingFrom(node29);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node47 = node19.srcref(node46);
        boolean boolean48 = node46.isVarArgs();
        node4.addChildToFront(node46);
        boolean boolean51 = node46.getBooleanProp(51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node53 = node46.getChildAtIndex(6);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str2 = jSDocInfo1.getVersion();
        boolean boolean3 = jSDocInfo1.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet4 = jSDocInfo1.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList5 = jSDocInfo1.getImplementedInterfaces();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList6 = jSDocInfo1.getThrownTypes();
        java.util.Set<java.lang.String> strSet7 = jSDocInfo1.getParameterNames();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo1.getEnumParameterType();
        java.util.Set<java.lang.String> strSet9 = jSDocInfo1.getSuppressions();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        int int15 = node14.getSourcePosition();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node26 = node24.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (byte) -1, node24, (int) (byte) 1, (int) '#');
        boolean boolean30 = node24.isScript();
        node24.setQuotedString();
        com.google.javascript.rhino.Node node32 = node19.srcrefTree(node24);
        boolean boolean33 = node32.isIf();
        com.google.javascript.rhino.Node node34 = node32.getParent();
        node32.removeProp((int) 'a');
        int int37 = node32.getLineno();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(35, "OR 1", (int) (short) 0, 45);
        com.google.javascript.rhino.Node node43 = node42.removeFirstChild();
        com.google.javascript.rhino.Node[] nodeArray44 = new com.google.javascript.rhino.Node[] { node14, node32, node42 };
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(50, nodeArray44, 4095, (int) (short) 0);
        com.google.javascript.rhino.Node[] nodeArray48 = strSet9.toArray(nodeArray44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node(16773120, nodeArray44, 0, (int) (short) 1);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(16773120, "(STRING  0\n)");
        boolean boolean3 = node2.isAnd();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        boolean boolean14 = node8.isDo();
        boolean boolean15 = node8.isDefaultCase();
        node8.setQuotedString();
        boolean boolean17 = node8.isDec();
        boolean boolean18 = node8.isLabel();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable19 = node8.siblings();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node34 = node32.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) -1, node32, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node44 = node42.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((int) (byte) -1, node42, (int) (byte) 1, (int) '#');
        boolean boolean48 = node37.hasChild(node47);
        int int49 = node37.getCharno();
        com.google.javascript.rhino.Node node50 = node27.useSourceInfoIfMissingFrom(node37);
        node50.setLength((int) ' ');
        node23.addChildrenToBack(node50);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable54 = node23.children();
        boolean boolean55 = node23.isHook();
        int int56 = node8.getIndexOfChild(node23);
        int int57 = node8.getLineno();
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean62 = node61.isThrow();
        boolean boolean63 = node61.isSwitch();
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node70 = node68.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node((int) (byte) -1, node68, (int) (byte) 1, (int) '#');
        boolean boolean74 = node68.isDo();
        boolean boolean75 = node68.isDefaultCase();
        node68.setQuotedString();
        boolean boolean77 = node68.isDec();
        boolean boolean78 = node68.isLabel();
        boolean boolean79 = node68.isSetterDef();
        boolean boolean80 = node68.isRegExp();
        boolean boolean81 = node68.isName();
        boolean boolean82 = node68.isVoid();
        com.google.javascript.rhino.Node node83 = node68.cloneNode();
        com.google.javascript.rhino.Node node84 = node61.useSourceInfoIfMissingFrom(node83);
        boolean boolean85 = node83.isDefaultCase();
        boolean boolean86 = node83.isSyntheticBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.replaceChild(node8, node83);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        boolean boolean10 = node4.isScript();
        com.google.javascript.rhino.InputId inputId11 = node4.getInputId();
        boolean boolean12 = node4.isDelProp();
        boolean boolean13 = node4.isBlock();
        boolean boolean14 = node4.isStringKey();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 0, 10);
        int int19 = node18.getType();
        com.google.javascript.rhino.Node node20 = node18.cloneNode();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder21 = node18.new FileLevelJsDocBuilder();
        boolean boolean22 = node18.isFunction();
        int int23 = node18.getLength();
        int int24 = node18.getLength();
        com.google.javascript.rhino.Node node25 = node4.copyInformationFromForTree(node18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node27 = node25.getChildAtIndex(35);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node11 = node9.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (byte) -1, node9, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node21 = node19.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (byte) -1, node19, (int) (byte) 1, (int) '#');
        boolean boolean25 = node14.hasChild(node24);
        int int26 = node14.getCharno();
        com.google.javascript.rhino.Node node27 = node4.useSourceInfoIfMissingFrom(node14);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node34 = node32.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) -1, node32, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node44 = node42.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((int) (byte) -1, node42, (int) (byte) 1, (int) '#');
        boolean boolean48 = node37.hasChild(node47);
        boolean boolean49 = node47.isVar();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node((-1), node14, node47);
        com.google.javascript.rhino.Node node51 = node47.getLastChild();
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node63 = node61.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node((int) (byte) -1, node61, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node73 = node71.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node76 = new com.google.javascript.rhino.Node((int) (byte) -1, node71, (int) (byte) 1, (int) '#');
        boolean boolean77 = node66.hasChild(node76);
        int int78 = node66.getCharno();
        com.google.javascript.rhino.Node node79 = node56.useSourceInfoIfMissingFrom(node66);
        com.google.javascript.rhino.Node node83 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node84 = node56.srcref(node83);
        com.google.javascript.rhino.Node node88 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean89 = node88.isFromExterns();
        boolean boolean90 = node84.hasChild(node88);
        com.google.javascript.rhino.Node node91 = new com.google.javascript.rhino.Node(52, node88);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node92 = node51.getChildBefore(node91);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        boolean boolean10 = node4.isScript();
        com.google.javascript.rhino.InputId inputId11 = node4.getInputId();
        boolean boolean12 = node4.isDelProp();
        boolean boolean13 = node4.isBlock();
        com.google.javascript.rhino.JSDocInfo jSDocInfo14 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str15 = jSDocInfo14.getVersion();
        boolean boolean16 = jSDocInfo14.hasEnumParameterType();
        java.lang.String str18 = jSDocInfo14.getDescriptionForParameter("STRING  0\n");
        java.lang.String str19 = jSDocInfo14.getDescription();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node30 = node28.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((int) (byte) -1, node28, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node40 = node38.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((int) (byte) -1, node38, (int) (byte) 1, (int) '#');
        boolean boolean44 = node33.hasChild(node43);
        int int45 = node33.getCharno();
        com.google.javascript.rhino.Node node46 = node23.useSourceInfoIfMissingFrom(node33);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node51 = node23.srcref(node50);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean56 = node55.isFromExterns();
        boolean boolean57 = node51.hasChild(node55);
        jSDocInfo14.setAssociatedNode(node51);
        com.google.javascript.rhino.Node node59 = node51.getLastChild();
        com.google.javascript.rhino.Node node60 = node4.copyInformationFromForTree(node51);
        com.google.javascript.rhino.JSDocInfo jSDocInfo62 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str63 = jSDocInfo62.toString();
        java.lang.String str64 = jSDocInfo62.getLicense();
        boolean boolean65 = jSDocInfo62.isConstructor();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection66 = jSDocInfo62.getMarkers();
        boolean boolean67 = jSDocInfo62.isExterns();
        boolean boolean68 = jSDocInfo62.hasType();
        node60.putProp(37, (java.lang.Object) jSDocInfo62);
        node60.setLength(30);
        com.google.javascript.rhino.JSDocInfo jSDocInfo72 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str73 = jSDocInfo72.getVersion();
        boolean boolean74 = jSDocInfo72.hasEnumParameterType();
        boolean boolean75 = jSDocInfo72.isNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression76 = jSDocInfo72.getTypedefType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility77 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo72.setVisibility(visibility77);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection79 = jSDocInfo72.getTypeNodes();
        jSDocInfo72.setDeprecated(false);
        boolean boolean82 = jSDocInfo72.isNoSideEffects();
        com.google.javascript.rhino.Node node86 = com.google.javascript.rhino.Node.newString("", 0, 10);
        int int87 = node86.getType();
        boolean boolean88 = node86.isArrayLit();
        jSDocInfo72.setAssociatedNode(node86);
        boolean boolean90 = node86.isIn();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node91 = node60.getChildBefore(node86);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 0, 46);
        node3.setSourceEncodedPosition(36);
        boolean boolean6 = node3.isNumber();
        int int7 = node3.getSourcePosition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node9 = node3.getChildAtIndex((int) '#');
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node14 = node12.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (byte) -1, node12, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node24 = node22.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((int) (byte) -1, node22, (int) (byte) 1, (int) '#');
        boolean boolean28 = node17.hasChild(node27);
        int int29 = node17.getCharno();
        com.google.javascript.rhino.Node node30 = node7.useSourceInfoIfMissingFrom(node17);
        node30.setLength((int) ' ');
        node3.addChildrenToBack(node30);
        com.google.javascript.rhino.JSDocInfo jSDocInfo34 = node30.getJSDocInfo();
        boolean boolean35 = node30.isAssign();
        java.lang.String str36 = node30.getSourceFileName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node38 = node30.getChildAtIndex(46);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 49, 35, 52);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node8.setCharno(1);
        boolean boolean11 = node8.isRegExp();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node18 = node16.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) (byte) -1, node16, (int) (byte) 1, (int) '#');
        boolean boolean22 = node16.isDo();
        boolean boolean23 = node16.isDefaultCase();
        node16.setQuotedString();
        com.google.javascript.rhino.Node node25 = node8.useSourceInfoFromForTree(node16);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node29.setCharno(1);
        java.util.Set<java.lang.String> strSet32 = node29.getDirectives();
        node29.setLength(0);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node41 = node39.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node((int) (byte) -1, node39, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(0, node25, node29, node44, (int) 'a', (int) (short) 0);
        boolean boolean48 = node25.isString();
        boolean boolean49 = node25.isNew();
        boolean boolean50 = node25.isDo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node51 = node3.getChildBefore(node25);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        java.lang.String[] strArray3 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet4 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet4, strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        boolean boolean11 = strSet4.addAll((java.util.Collection<java.lang.String>) strList9);
        boolean boolean13 = strSet4.remove((java.lang.Object) 1L);
        java.lang.String[] strArray16 = new java.lang.String[] { "STRING  0", "STRING  0" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        boolean boolean20 = strSet17.add("STRING  0");
        java.lang.String[] strArray23 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        boolean boolean31 = strSet24.addAll((java.util.Collection<java.lang.String>) strList29);
        boolean boolean32 = strSet17.containsAll((java.util.Collection<java.lang.String>) strList29);
        boolean boolean33 = strSet4.addAll((java.util.Collection<java.lang.String>) strSet17);
        java.util.stream.Stream<java.lang.String> strStream34 = strSet17.stream();
        strSet17.clear();
        java.lang.CharSequence[] charSequenceArray38 = new java.lang.CharSequence[] { "(Node tree inequality:\nTree1:\nSTRING  0 [quoted: 1]\n\n\nTree2:\nIN\n\n\nSubtree1: STRING  0 [quoted: 1]\n\n\nSubtree2: IN\n)", "STRING  0\n" };
        java.lang.CharSequence[] charSequenceArray39 = strSet17.toArray(charSequenceArray38);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        int int45 = node44.getSourcePosition();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node56 = node54.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node((int) (byte) -1, node54, (int) (byte) 1, (int) '#');
        boolean boolean60 = node54.isScript();
        node54.setQuotedString();
        com.google.javascript.rhino.Node node62 = node49.srcrefTree(node54);
        boolean boolean63 = node62.isIf();
        com.google.javascript.rhino.Node node64 = node62.getParent();
        node62.removeProp((int) 'a');
        int int67 = node62.getLineno();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString(35, "OR 1", (int) (short) 0, 45);
        com.google.javascript.rhino.Node node73 = node72.removeFirstChild();
        com.google.javascript.rhino.Node[] nodeArray74 = new com.google.javascript.rhino.Node[] { node44, node62, node72 };
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node(50, nodeArray74, 4095, (int) (short) 0);
        com.google.javascript.rhino.Node[] nodeArray78 = strSet17.toArray(nodeArray74);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node79 = new com.google.javascript.rhino.Node(23, nodeArray74);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString((int) (short) 10, "", (-1), 36);
        boolean boolean5 = node4.isIf();
        java.lang.String str9 = node4.toString(false, false, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node11 = node4.getChildAtIndex(23);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        boolean boolean14 = node8.isScript();
        node8.setQuotedString();
        com.google.javascript.rhino.Node node16 = node3.srcrefTree(node8);
        boolean boolean17 = node16.isIf();
        com.google.javascript.rhino.Node node18 = node16.getParent();
        boolean boolean19 = node16.isWith();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) 4095, 100, (int) (short) 1);
        double double24 = node23.getDouble();
        boolean boolean25 = node23.isContinue();
        java.lang.String str26 = node16.checkTreeEquals(node23);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(39, (int) (byte) 10, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node23.removeChild(node30);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(5, "STRING  0");
        boolean boolean3 = node2.hasOneChild();
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, nodeArray8);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(0, nodeArray8);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) 'a', nodeArray8, 4131, 1);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(29, nodeArray8);
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str16 = jSDocInfo15.getVersion();
        java.lang.String str17 = jSDocInfo15.getFileOverview();
        jSDocInfo15.addSuppression("STRING  0");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression20 = jSDocInfo15.getBaseType();
        boolean boolean21 = jSDocInfo15.shouldPreserveTry();
        java.util.Set<java.lang.String> strSet22 = jSDocInfo15.getSuppressions();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("", 0, 10);
        int int27 = node26.getType();
        int int28 = node26.getCharno();
        boolean boolean29 = strSet22.equals((java.lang.Object) node26);
        boolean boolean30 = node26.isOptionalArg();
        node26.setQuotedString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.replaceChild(node14, node26);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node12 = node10.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((int) (byte) -1, node10, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node22 = node20.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (byte) -1, node20, (int) (byte) 1, (int) '#');
        boolean boolean26 = node15.hasChild(node25);
        int int27 = node15.getCharno();
        com.google.javascript.rhino.Node node28 = node5.useSourceInfoIfMissingFrom(node15);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node35 = node33.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((int) (byte) -1, node33, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node45 = node43.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node((int) (byte) -1, node43, (int) (byte) 1, (int) '#');
        boolean boolean49 = node38.hasChild(node48);
        boolean boolean50 = node48.isVar();
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node((-1), node15, node48);
        com.google.javascript.rhino.Node node52 = node51.getParent();
        boolean boolean53 = node51.isSetterDef();
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node((-1), node51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node56 = node51.getChildAtIndex(32);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        boolean boolean14 = node8.isScript();
        node8.setQuotedString();
        com.google.javascript.rhino.Node node16 = node3.srcrefTree(node8);
        boolean boolean17 = node8.isBreak();
        java.lang.String str18 = node8.toStringTree();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) (short) -1, 97, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node23 = node8.getChildBefore(node22);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node14 = node12.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (byte) -1, node12, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node24 = node22.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((int) (byte) -1, node22, (int) (byte) 1, (int) '#');
        boolean boolean28 = node17.hasChild(node27);
        int int29 = node17.getCharno();
        com.google.javascript.rhino.Node node30 = node7.useSourceInfoIfMissingFrom(node17);
        node30.setLength((int) ' ');
        node3.addChildrenToBack(node30);
        com.google.javascript.rhino.JSDocInfo jSDocInfo34 = node30.getJSDocInfo();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable35 = node30.children();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(49);
        boolean boolean38 = node37.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node30.removeChild(node37);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(48);
        boolean boolean2 = node1.hasMoreThanOneChild();
        node1.setWasEmptyNode(true);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node16 = node14.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) -1, node14, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node26 = node24.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (byte) -1, node24, (int) (byte) 1, (int) '#');
        boolean boolean30 = node19.hasChild(node29);
        int int31 = node19.getCharno();
        com.google.javascript.rhino.Node node32 = node9.useSourceInfoIfMissingFrom(node19);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node39 = node37.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((int) (byte) -1, node37, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node49 = node47.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node((int) (byte) -1, node47, (int) (byte) 1, (int) '#');
        boolean boolean53 = node42.hasChild(node52);
        boolean boolean54 = node52.isVar();
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((-1), node19, node52);
        boolean boolean56 = node19.isAssignAdd();
        com.google.javascript.rhino.Node node57 = node19.removeFirstChild();
        boolean boolean58 = node57.hasOneChild();
        boolean boolean59 = node57.isFor();
        boolean boolean60 = node57.isLabel();
        boolean boolean61 = node57.isGetElem();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder62 = node57.getJsDocBuilderForNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node63 = node1.getChildBefore(node57);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node16 = node14.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) -1, node14, (int) (byte) 1, (int) '#');
        boolean boolean20 = node9.hasChild(node19);
        boolean boolean21 = node19.isVar();
        boolean boolean22 = node19.isTypeOf();
        boolean boolean23 = node19.isAssignAdd();
        java.lang.String str24 = node19.getQualifiedName();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node31 = node29.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((int) (byte) -1, node29, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node41 = node39.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node((int) (byte) -1, node39, (int) (byte) 1, (int) '#');
        boolean boolean45 = node34.hasChild(node44);
        boolean boolean46 = node44.isVar();
        boolean boolean47 = node44.isCase();
        boolean boolean48 = node19.hasChild(node44);
        node19.setOptionalArg(false);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node57 = node55.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((int) (byte) -1, node55, (int) (byte) 1, (int) '#');
        boolean boolean61 = node55.isDo();
        boolean boolean62 = node55.isDefaultCase();
        node55.setQuotedString();
        boolean boolean64 = node55.isDec();
        boolean boolean65 = node55.isLabel();
        boolean boolean66 = node55.isSetterDef();
        boolean boolean67 = node55.isRegExp();
        boolean boolean68 = node55.isName();
        boolean boolean69 = node55.isVoid();
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node76 = node74.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node79 = new com.google.javascript.rhino.Node((int) (byte) -1, node74, (int) (byte) 1, (int) '#');
        boolean boolean80 = node74.isDo();
        com.google.javascript.rhino.Node node81 = node55.useSourceInfoIfMissingFrom(node74);
        com.google.javascript.rhino.Node node86 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node88 = node86.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node91 = new com.google.javascript.rhino.Node((int) (byte) -1, node86, (int) (byte) 1, (int) '#');
        int int92 = node91.getType();
        boolean boolean93 = node91.isFor();
        node74.addChildToFront(node91);
        java.lang.String str95 = node74.getQualifiedName();
        com.google.javascript.rhino.Node node96 = node74.cloneTree();
        com.google.javascript.rhino.Node node97 = node19.copyInformationFrom(node96);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node99 = node97.getChildAtIndex(10);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str2 = jSDocInfo1.getVersion();
        boolean boolean3 = jSDocInfo1.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet4 = jSDocInfo1.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList5 = jSDocInfo1.getImplementedInterfaces();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList6 = jSDocInfo1.getThrownTypes();
        java.util.Set<java.lang.String> strSet7 = jSDocInfo1.getParameterNames();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo1.getEnumParameterType();
        java.util.Set<java.lang.String> strSet9 = jSDocInfo1.getSuppressions();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        int int15 = node14.getSourcePosition();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node26 = node24.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (byte) -1, node24, (int) (byte) 1, (int) '#');
        boolean boolean30 = node24.isScript();
        node24.setQuotedString();
        com.google.javascript.rhino.Node node32 = node19.srcrefTree(node24);
        boolean boolean33 = node32.isIf();
        com.google.javascript.rhino.Node node34 = node32.getParent();
        node32.removeProp((int) 'a');
        int int37 = node32.getLineno();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(35, "OR 1", (int) (short) 0, 45);
        com.google.javascript.rhino.Node node43 = node42.removeFirstChild();
        com.google.javascript.rhino.Node[] nodeArray44 = new com.google.javascript.rhino.Node[] { node14, node32, node42 };
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(50, nodeArray44, 4095, (int) (short) 0);
        com.google.javascript.rhino.Node[] nodeArray48 = strSet9.toArray(nodeArray44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(6, nodeArray48);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        java.lang.String[] strArray2 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        boolean boolean10 = strSet3.addAll((java.util.Collection<java.lang.String>) strList8);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node17 = node15.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (byte) -1, node15, (int) (byte) 1, (int) '#');
        boolean boolean21 = node15.isScript();
        node15.setQuotedString();
        boolean boolean23 = strSet3.equals((java.lang.Object) node15);
        int int24 = node15.getChildCount();
        node15.setType((int) (short) 1);
        int int28 = node15.getIntProp((int) (short) 0);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node35 = node33.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((int) (byte) -1, node33, (int) (byte) 1, (int) '#');
        boolean boolean39 = node33.isDo();
        boolean boolean40 = node33.isDefaultCase();
        node33.setQuotedString();
        boolean boolean42 = node33.isDec();
        boolean boolean43 = node33.hasMoreThanOneChild();
        boolean boolean44 = node33.isUnscopedQualifiedName();
        com.google.javascript.rhino.JSDocInfo jSDocInfo45 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str46 = jSDocInfo45.getVersion();
        boolean boolean47 = jSDocInfo45.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet48 = jSDocInfo45.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList49 = jSDocInfo45.getImplementedInterfaces();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean54 = node53.isThrow();
        java.lang.String str58 = node53.toString(true, false, true);
        jSDocInfo45.setAssociatedNode(node53);
        int int61 = node53.getIntProp((int) (byte) 10);
        node53.setSourceEncodedPositionForTree(15);
        node53.setLineno(1);
        com.google.javascript.rhino.Node node66 = node33.copyInformationFromForTree(node53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node15.removeChild(node33);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        boolean boolean14 = node8.isScript();
        com.google.javascript.rhino.Node node15 = node8.detachFromParent();
        node15.setOptionalArg(false);
        boolean boolean19 = node15.getBooleanProp(31);
        com.google.javascript.rhino.Node node20 = node3.copyInformationFrom(node15);
        boolean boolean21 = node20.isLabel();
        com.google.javascript.rhino.InputId inputId22 = node20.getInputId();
        java.lang.String str23 = node20.getString();
        com.google.javascript.rhino.jstype.JSType jSType24 = node20.getJSType();
        boolean boolean25 = node20.isWhile();
        boolean boolean26 = node20.isNull();
        node20.setSourceFileForTesting("ERROR 1\n    STRING  0\n");
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean34 = node33.isThrow();
        java.lang.String str38 = node33.toString(true, false, true);
        java.lang.String str39 = node33.getQualifiedName();
        boolean boolean40 = node33.isIn();
        com.google.javascript.rhino.Node node41 = node33.cloneTree();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node48 = node46.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node((int) (byte) -1, node46, (int) (byte) 1, (int) '#');
        boolean boolean52 = node46.isScript();
        com.google.javascript.rhino.Node node53 = node46.detachFromParent();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node57.setCharno(1);
        java.util.Set<java.lang.String> strSet60 = node57.getDirectives();
        boolean boolean61 = node57.isHook();
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node72 = node70.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node((int) (byte) -1, node70, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node80 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node82 = node80.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node85 = new com.google.javascript.rhino.Node((int) (byte) -1, node80, (int) (byte) 1, (int) '#');
        boolean boolean86 = node75.hasChild(node85);
        int int87 = node75.getCharno();
        com.google.javascript.rhino.Node node88 = node65.useSourceInfoIfMissingFrom(node75);
        com.google.javascript.rhino.Node node92 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node93 = node65.srcref(node92);
        com.google.javascript.rhino.Node node94 = new com.google.javascript.rhino.Node(4095, node41, node53, node57, node65);
        node57.setType(16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node97 = node20.getChildBefore(node57);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node3.setCharno(1);
        boolean boolean6 = node3.isRegExp();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node13 = node11.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (byte) -1, node11, (int) (byte) 1, (int) '#');
        boolean boolean17 = node11.isDo();
        boolean boolean18 = node11.isDefaultCase();
        node11.setQuotedString();
        com.google.javascript.rhino.Node node20 = node3.useSourceInfoFromForTree(node11);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder21 = node20.new FileLevelJsDocBuilder();
        boolean boolean22 = node20.isFalse();
        boolean boolean23 = node20.isName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node25 = node20.getChildAtIndex(151562);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getFileOverview();
        jSDocInfo0.addSuppression("STRING  0");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getBaseType();
        boolean boolean6 = jSDocInfo0.shouldPreserveTry();
        java.util.Set<java.lang.String> strSet7 = jSDocInfo0.getSuppressions();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 0, 10);
        int int12 = node11.getType();
        int int13 = node11.getCharno();
        boolean boolean14 = strSet7.equals((java.lang.Object) node11);
        boolean boolean15 = node11.isOptionalArg();
        node11.setQuotedString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node18 = node11.getChildAtIndex((int) (short) 10);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) (byte) 1, 8, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node5 = node3.getChildAtIndex(2);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node16 = node14.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) -1, node14, (int) (byte) 1, (int) '#');
        boolean boolean20 = node9.hasChild(node19);
        boolean boolean21 = node9.isReturn();
        boolean boolean22 = node9.isGetterDef();
        com.google.javascript.rhino.JSDocInfo jSDocInfo23 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str24 = jSDocInfo23.getVersion();
        boolean boolean25 = jSDocInfo23.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet26 = jSDocInfo23.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList27 = jSDocInfo23.getImplementedInterfaces();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean32 = node31.isThrow();
        java.lang.String str36 = node31.toString(true, false, true);
        jSDocInfo23.setAssociatedNode(node31);
        com.google.javascript.rhino.Node node38 = node31.removeFirstChild();
        boolean boolean39 = node31.isNumber();
        node9.addChildToBack(node31);
        boolean boolean41 = node31.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean46 = node45.isThrow();
        java.lang.String str50 = node45.toString(true, false, true);
        java.lang.String str51 = node45.getQualifiedName();
        boolean boolean52 = node45.isIn();
        com.google.javascript.rhino.Node node53 = node45.cloneTree();
        boolean boolean54 = node53.isRegExp();
        int int55 = node53.getSourcePosition();
        node31.addChildrenToBack(node53);
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean61 = node60.isThrow();
        boolean boolean62 = node60.isSwitch();
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node69 = node67.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node((int) (byte) -1, node67, (int) (byte) 1, (int) '#');
        boolean boolean73 = node67.isDo();
        boolean boolean74 = node67.isDefaultCase();
        node67.setQuotedString();
        boolean boolean76 = node67.isDec();
        boolean boolean77 = node67.isLabel();
        boolean boolean78 = node67.isSetterDef();
        boolean boolean79 = node67.isRegExp();
        boolean boolean80 = node67.isName();
        boolean boolean81 = node67.isVoid();
        com.google.javascript.rhino.Node node82 = node67.cloneNode();
        com.google.javascript.rhino.Node node83 = node60.useSourceInfoIfMissingFrom(node82);
        boolean boolean84 = node83.isRegExp();
        boolean boolean85 = node83.isVarArgs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node86 = node53.getChildBefore(node83);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        java.lang.String[] strArray3 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet4 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet4, strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        boolean boolean11 = strSet4.addAll((java.util.Collection<java.lang.String>) strList9);
        boolean boolean13 = strSet4.remove((java.lang.Object) 1L);
        java.lang.String[] strArray16 = new java.lang.String[] { "STRING  0", "STRING  0" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        boolean boolean20 = strSet17.add("STRING  0");
        java.lang.String[] strArray23 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        boolean boolean31 = strSet24.addAll((java.util.Collection<java.lang.String>) strList29);
        boolean boolean32 = strSet17.containsAll((java.util.Collection<java.lang.String>) strList29);
        boolean boolean33 = strSet4.addAll((java.util.Collection<java.lang.String>) strSet17);
        java.util.stream.Stream<java.lang.String> strStream34 = strSet17.stream();
        strSet17.clear();
        java.lang.CharSequence[] charSequenceArray38 = new java.lang.CharSequence[] { "(Node tree inequality:\nTree1:\nSTRING  0 [quoted: 1]\n\n\nTree2:\nIN\n\n\nSubtree1: STRING  0 [quoted: 1]\n\n\nSubtree2: IN\n)", "STRING  0\n" };
        java.lang.CharSequence[] charSequenceArray39 = strSet17.toArray(charSequenceArray38);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        int int45 = node44.getSourcePosition();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node56 = node54.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node((int) (byte) -1, node54, (int) (byte) 1, (int) '#');
        boolean boolean60 = node54.isScript();
        node54.setQuotedString();
        com.google.javascript.rhino.Node node62 = node49.srcrefTree(node54);
        boolean boolean63 = node62.isIf();
        com.google.javascript.rhino.Node node64 = node62.getParent();
        node62.removeProp((int) 'a');
        int int67 = node62.getLineno();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString(35, "OR 1", (int) (short) 0, 45);
        com.google.javascript.rhino.Node node73 = node72.removeFirstChild();
        com.google.javascript.rhino.Node[] nodeArray74 = new com.google.javascript.rhino.Node[] { node44, node62, node72 };
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node(50, nodeArray74, 4095, (int) (short) 0);
        com.google.javascript.rhino.Node[] nodeArray78 = strSet17.toArray(nodeArray74);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node81 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray74, 45, 30);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean4 = node3.isThrow();
        java.lang.String str8 = node3.toString(true, false, true);
        java.lang.String str9 = node3.getQualifiedName();
        boolean boolean10 = node3.isIn();
        com.google.javascript.rhino.Node node11 = node3.cloneTree();
        boolean boolean12 = node11.isUnscopedQualifiedName();
        boolean boolean13 = node11.isDec();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node18.setCharno(1);
        boolean boolean21 = node18.isRegExp();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node28 = node26.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) (byte) -1, node26, (int) (byte) 1, (int) '#');
        boolean boolean32 = node26.isDo();
        boolean boolean33 = node26.isDefaultCase();
        node26.setQuotedString();
        com.google.javascript.rhino.Node node35 = node18.useSourceInfoFromForTree(node26);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node39.setCharno(1);
        java.util.Set<java.lang.String> strSet42 = node39.getDirectives();
        node39.setLength(0);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node51 = node49.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node((int) (byte) -1, node49, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node(0, node35, node39, node54, (int) 'a', (int) (short) 0);
        boolean boolean58 = node35.isString();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node65 = node63.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node((int) (byte) -1, node63, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node75 = node73.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node78 = new com.google.javascript.rhino.Node((int) (byte) -1, node73, (int) (byte) 1, (int) '#');
        boolean boolean79 = node68.hasChild(node78);
        boolean boolean80 = node78.isVar();
        boolean boolean81 = node78.isTypeOf();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable82 = node78.children();
        com.google.javascript.rhino.Node node83 = node35.srcref(node78);
        com.google.javascript.rhino.Node node84 = node11.srcrefTree(node83);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node86 = node84.getChildAtIndex(40);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        boolean boolean14 = node8.isScript();
        com.google.javascript.rhino.Node node15 = node8.detachFromParent();
        node15.setOptionalArg(false);
        boolean boolean19 = node15.getBooleanProp(31);
        com.google.javascript.rhino.Node node20 = node3.copyInformationFrom(node15);
        boolean boolean21 = node20.isLabel();
        boolean boolean22 = node20.isWhile();
        boolean boolean23 = node20.isFor();
        boolean boolean24 = node20.isDelProp();
        java.lang.Object obj26 = node20.getProp((int) '4');
        com.google.javascript.rhino.Node node27 = node20.cloneTree();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) 4095, 100, (int) (short) 1);
        double double32 = node31.getDouble();
        boolean boolean33 = node31.isAdd();
        com.google.javascript.rhino.Node node34 = node31.cloneNode();
        boolean boolean35 = node31.isFunction();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node27.removeChild(node31);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node3.setCharno(1);
        com.google.javascript.rhino.Node node6 = node3.cloneNode();
        boolean boolean7 = node3.isHook();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("Node tree inequality:\nTree1:\nSTRING  0 [quoted: 1]\n\n\nTree2:\nSTRING Not declared as a constructor 0\n\n\nSubtree1: STRING  0 [quoted: 1]\n\n\nSubtree2: STRING Not declared as a constructor 0\n");
        boolean boolean10 = node9.isReturn();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node11 = node3.getChildBefore(node9);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node3.setCharno(1);
        java.util.Set<java.lang.String> strSet6 = node3.getDirectives();
        node3.setCharno((int) (short) -1);
        boolean boolean9 = node3.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString("", 0, 10);
        int int14 = node13.getType();
        com.google.javascript.rhino.Node node15 = node13.cloneNode();
        boolean boolean16 = node13.isRegExp();
        boolean boolean17 = node13.isNew();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node24 = node22.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((int) (byte) -1, node22, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node34 = node32.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) -1, node32, (int) (byte) 1, (int) '#');
        boolean boolean38 = node27.hasChild(node37);
        boolean boolean39 = node37.isVar();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node43.setCharno(1);
        boolean boolean46 = node43.isRegExp();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node53 = node51.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((int) (byte) -1, node51, (int) (byte) 1, (int) '#');
        boolean boolean57 = node51.isDo();
        boolean boolean58 = node51.isDefaultCase();
        node51.setQuotedString();
        com.google.javascript.rhino.Node node60 = node43.useSourceInfoFromForTree(node51);
        boolean boolean61 = node60.isVarArgs();
        com.google.javascript.rhino.Node node62 = node37.useSourceInfoIfMissingFrom(node60);
        boolean boolean63 = node37.isGetProp();
        boolean boolean64 = node37.isFromExterns();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.replaceChild(node13, node37);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node20 = node18.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (byte) -1, node18, (int) (byte) 1, (int) '#');
        boolean boolean24 = node13.hasChild(node23);
        int int25 = node13.getCharno();
        com.google.javascript.rhino.Node node26 = node3.useSourceInfoIfMissingFrom(node13);
        node26.setLength((int) ' ');
        boolean boolean29 = node26.isReturn();
        boolean boolean30 = node26.isHook();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable31 = node26.children();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node42 = node40.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((int) (byte) -1, node40, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node52 = node50.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((int) (byte) -1, node50, (int) (byte) 1, (int) '#');
        boolean boolean56 = node45.hasChild(node55);
        int int57 = node45.getCharno();
        com.google.javascript.rhino.Node node58 = node35.useSourceInfoIfMissingFrom(node45);
        boolean boolean59 = node45.isAssignAdd();
        boolean boolean60 = node45.isUnscopedQualifiedName();
        int int61 = node45.getLineno();
        boolean boolean62 = node45.isTrue();
        com.google.javascript.rhino.Node node63 = node45.cloneTree();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node64 = node26.getChildBefore(node63);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 4095, 100, (int) (short) 1);
        double double4 = node3.getDouble();
        boolean boolean5 = node3.isAdd();
        com.google.javascript.rhino.Node node6 = node3.cloneNode();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node10.setCharno(1);
        java.util.Set<java.lang.String> strSet13 = node10.getDirectives();
        node10.setLength(0);
        com.google.javascript.rhino.Node node16 = node3.useSourceInfoIfMissingFrom(node10);
        boolean boolean17 = node10.isVarArgs();
        boolean boolean18 = node10.isNoSideEffectsCall();
        boolean boolean19 = node10.isString();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(38, "STRING  0");
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) ' ', node23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node25 = node10.getChildBefore(node23);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean4 = node3.isThrow();
        boolean boolean5 = node3.isSwitch();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node12 = node10.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((int) (byte) -1, node10, (int) (byte) 1, (int) '#');
        boolean boolean16 = node10.isDo();
        boolean boolean17 = node10.isDefaultCase();
        node10.setQuotedString();
        boolean boolean19 = node10.isDec();
        boolean boolean20 = node10.isLabel();
        boolean boolean21 = node10.isSetterDef();
        boolean boolean22 = node10.isRegExp();
        boolean boolean23 = node10.isName();
        boolean boolean24 = node10.isVoid();
        com.google.javascript.rhino.Node node25 = node10.cloneNode();
        com.google.javascript.rhino.Node node26 = node3.useSourceInfoIfMissingFrom(node25);
        boolean boolean27 = node26.isRegExp();
        node26.setSourceEncodedPositionForTree(2);
        int int30 = node26.getSourcePosition();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("", 0, 10);
        int int35 = node34.getType();
        com.google.javascript.rhino.Node node36 = node34.cloneNode();
        boolean boolean37 = node34.isInc();
        boolean boolean38 = node34.isAnd();
        com.google.javascript.rhino.Node node39 = node26.copyInformationFrom(node34);
        boolean boolean40 = node39.isQuotedString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node42 = node39.getChildAtIndex(42);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node3.setCharno(1);
        java.util.Set<java.lang.String> strSet6 = node3.getDirectives();
        boolean boolean7 = node3.isHook();
        int int8 = node3.getSourceOffset();
        boolean boolean9 = node3.isSyntheticBlock();
        boolean boolean10 = node3.isThis();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node12 = node3.getChildAtIndex((int) (byte) 1);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        java.lang.String[] strArray3 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet4 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet4, strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        boolean boolean11 = strSet4.addAll((java.util.Collection<java.lang.String>) strList9);
        boolean boolean13 = strSet4.remove((java.lang.Object) 1L);
        java.lang.String[] strArray16 = new java.lang.String[] { "STRING  0", "STRING  0" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        boolean boolean20 = strSet17.add("STRING  0");
        java.lang.String[] strArray23 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        boolean boolean31 = strSet24.addAll((java.util.Collection<java.lang.String>) strList29);
        boolean boolean32 = strSet17.containsAll((java.util.Collection<java.lang.String>) strList29);
        boolean boolean33 = strSet4.addAll((java.util.Collection<java.lang.String>) strSet17);
        java.util.stream.Stream<java.lang.String> strStream34 = strSet17.stream();
        strSet17.clear();
        java.lang.CharSequence[] charSequenceArray38 = new java.lang.CharSequence[] { "(Node tree inequality:\nTree1:\nSTRING  0 [quoted: 1]\n\n\nTree2:\nIN\n\n\nSubtree1: STRING  0 [quoted: 1]\n\n\nSubtree2: IN\n)", "STRING  0\n" };
        java.lang.CharSequence[] charSequenceArray39 = strSet17.toArray(charSequenceArray38);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        int int45 = node44.getSourcePosition();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node56 = node54.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node((int) (byte) -1, node54, (int) (byte) 1, (int) '#');
        boolean boolean60 = node54.isScript();
        node54.setQuotedString();
        com.google.javascript.rhino.Node node62 = node49.srcrefTree(node54);
        boolean boolean63 = node62.isIf();
        com.google.javascript.rhino.Node node64 = node62.getParent();
        node62.removeProp((int) 'a');
        int int67 = node62.getLineno();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString(35, "OR 1", (int) (short) 0, 45);
        com.google.javascript.rhino.Node node73 = node72.removeFirstChild();
        com.google.javascript.rhino.Node[] nodeArray74 = new com.google.javascript.rhino.Node[] { node44, node62, node72 };
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node(50, nodeArray74, 4095, (int) (short) 0);
        com.google.javascript.rhino.Node[] nodeArray78 = strSet17.toArray(nodeArray74);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node79 = new com.google.javascript.rhino.Node(50, nodeArray78);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition1 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int2 = typePosition1.getPositionOnEndLine();
        boolean boolean3 = typePosition1.hasBrackets();
        int int4 = typePosition1.getEndLine();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node19 = node17.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (byte) -1, node17, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node29 = node27.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (byte) -1, node27, (int) (byte) 1, (int) '#');
        boolean boolean33 = node22.hasChild(node32);
        int int34 = node22.getCharno();
        com.google.javascript.rhino.Node node35 = node12.useSourceInfoIfMissingFrom(node22);
        node35.setLength((int) ' ');
        node8.addChildrenToBack(node35);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable39 = node8.children();
        boolean boolean40 = node8.isHook();
        int int41 = node8.getSideEffectFlags();
        typePosition1.setItem(node8);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        int int47 = node46.getSourcePosition();
        int int48 = node46.getType();
        boolean boolean49 = node46.isLabel();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node((int) ' ', node8, node46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node52 = node46.getChildAtIndex(4095);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(5, "STRING  0");
        boolean boolean3 = node2.isReturn();
        boolean boolean4 = node2.isNull();
        node2.setCharno((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node8 = node2.getChildAtIndex((int) (byte) 1);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        boolean boolean10 = node4.isScript();
        com.google.javascript.rhino.InputId inputId11 = node4.getInputId();
        boolean boolean12 = node4.isDelProp();
        boolean boolean13 = node4.isBlock();
        boolean boolean14 = node4.isStringKey();
        node4.detachChildren();
        com.google.javascript.rhino.Node node16 = node4.getParent();
        boolean boolean17 = node4.isOptionalArg();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(49, (int) (byte) 0, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.removeChild(node21);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(53, "OR 51");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        int int7 = node6.getSourcePosition();
        int int8 = node6.getType();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node19 = node17.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (byte) -1, node17, (int) (byte) 1, (int) '#');
        boolean boolean23 = node17.isScript();
        node17.setQuotedString();
        com.google.javascript.rhino.Node node25 = node12.srcrefTree(node17);
        boolean boolean26 = node12.isVar();
        node6.addChildrenToBack(node12);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("hi!", 0, 46);
        node31.setSourceEncodedPosition(36);
        node31.setType(52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.replaceChild(node12, node31);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node11 = node9.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (byte) -1, node9, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node21 = node19.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (byte) -1, node19, (int) (byte) 1, (int) '#');
        boolean boolean25 = node14.hasChild(node24);
        int int26 = node14.getCharno();
        com.google.javascript.rhino.Node node27 = node4.useSourceInfoIfMissingFrom(node14);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node34 = node32.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) -1, node32, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node44 = node42.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((int) (byte) -1, node42, (int) (byte) 1, (int) '#');
        boolean boolean48 = node37.hasChild(node47);
        boolean boolean49 = node47.isVar();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node((-1), node14, node47);
        boolean boolean51 = node47.isScript();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node53 = node47.getChildAtIndex(97);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        boolean boolean14 = node8.isScript();
        node8.setQuotedString();
        com.google.javascript.rhino.Node node16 = node3.srcrefTree(node8);
        com.google.javascript.rhino.Node node17 = node16.cloneNode();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean22 = node21.isThrow();
        java.lang.String str26 = node21.toString(true, false, true);
        java.lang.String str27 = node21.getQualifiedName();
        boolean boolean28 = node21.isIn();
        boolean boolean29 = node17.isEquivalentToTyped(node21);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable30 = node21.children();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node42 = node40.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((int) (byte) -1, node40, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node52 = node50.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((int) (byte) -1, node50, (int) (byte) 1, (int) '#');
        boolean boolean56 = node45.hasChild(node55);
        int int57 = node45.getCharno();
        com.google.javascript.rhino.Node node58 = node35.useSourceInfoIfMissingFrom(node45);
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node65 = node63.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node((int) (byte) -1, node63, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node75 = node73.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node78 = new com.google.javascript.rhino.Node((int) (byte) -1, node73, (int) (byte) 1, (int) '#');
        boolean boolean79 = node68.hasChild(node78);
        boolean boolean80 = node78.isVar();
        com.google.javascript.rhino.Node node81 = new com.google.javascript.rhino.Node((-1), node45, node78);
        com.google.javascript.rhino.Node node82 = node78.getLastChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node83 = node21.getChildBefore(node78);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        int int5 = node4.getType();
        com.google.javascript.rhino.Node node6 = node4.cloneNode();
        boolean boolean7 = node4.isInc();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean12 = node11.isThrow();
        java.lang.String str16 = node11.toString(true, false, true);
        java.lang.String str17 = node11.getQualifiedName();
        boolean boolean18 = node11.isThis();
        java.lang.String[] strArray21 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        boolean boolean29 = strSet22.addAll((java.util.Collection<java.lang.String>) strList27);
        com.google.javascript.rhino.JSDocInfo jSDocInfo30 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str31 = jSDocInfo30.getVersion();
        java.lang.String str32 = jSDocInfo30.getFileOverview();
        boolean boolean33 = jSDocInfo30.shouldPreserveTry();
        java.util.Set<java.lang.String> strSet34 = jSDocInfo30.getParameterNames();
        boolean boolean35 = strSet22.retainAll((java.util.Collection<java.lang.String>) strSet34);
        java.util.stream.Stream<java.lang.String> strStream36 = strSet22.stream();
        node11.setDirectives((java.util.Set<java.lang.String>) strSet22);
        boolean boolean38 = node11.isFor();
        com.google.javascript.rhino.Node node39 = node4.srcref(node11);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.JSDocInfo jSDocInfo44 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str45 = jSDocInfo44.getVersion();
        boolean boolean46 = jSDocInfo44.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet47 = jSDocInfo44.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList48 = jSDocInfo44.getImplementedInterfaces();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList49 = jSDocInfo44.getThrownTypes();
        java.util.Set<java.lang.String> strSet50 = jSDocInfo44.getParameterNames();
        node43.setDirectives(strSet50);
        boolean boolean52 = node43.isCase();
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node(43, node11, node43, 0, 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node57 = node55.getChildAtIndex(53);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean4 = node3.isThrow();
        java.lang.String str8 = node3.toString(true, false, true);
        node3.setIsSyntheticBlock(true);
        int int11 = node3.getLength();
        boolean boolean12 = node3.isNumber();
        node3.setSourceEncodedPositionForTree(40);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable15 = node3.getAncestors();
        node3.setCharno(3);
        boolean boolean18 = node3.isAssign();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node20 = node3.getChildAtIndex((int) 'a');
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("(Not declared as a type name)");
        com.google.javascript.rhino.Node node3 = node2.cloneTree();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 4095, 100, (int) (short) 1);
        double double8 = node7.getDouble();
        boolean boolean9 = node7.isAdd();
        com.google.javascript.rhino.Node node10 = node7.cloneNode();
        com.google.javascript.rhino.jstype.JSType jSType11 = node10.getJSType();
        java.lang.String str12 = node10.toStringTree();
        com.google.javascript.rhino.Node node13 = node10.getLastSibling();
        boolean boolean14 = node13.isNE();
        boolean boolean15 = node13.isExprResult();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) ' ', node2, node13);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node27 = node25.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (byte) -1, node25, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node37 = node35.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (byte) -1, node35, (int) (byte) 1, (int) '#');
        boolean boolean41 = node30.hasChild(node40);
        int int42 = node30.getCharno();
        com.google.javascript.rhino.Node node43 = node20.useSourceInfoIfMissingFrom(node30);
        int int44 = node20.getSourcePosition();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean49 = node48.isThrow();
        java.lang.String str53 = node48.toString(true, false, true);
        int int55 = node48.getIntProp(51);
        node48.addSuppression("STRING  0 [quoted: 1]\n");
        node20.addChildrenToBack(node48);
        boolean boolean59 = node48.isIn();
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node70 = node68.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node((int) (byte) -1, node68, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node80 = node78.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node83 = new com.google.javascript.rhino.Node((int) (byte) -1, node78, (int) (byte) 1, (int) '#');
        boolean boolean84 = node73.hasChild(node83);
        int int85 = node73.getCharno();
        com.google.javascript.rhino.Node node86 = node63.useSourceInfoIfMissingFrom(node73);
        boolean boolean87 = node73.isContinue();
        boolean boolean88 = node73.wasEmptyNode();
        com.google.javascript.rhino.Node node89 = node48.copyInformationFromForTree(node73);
        com.google.javascript.rhino.Node node93 = com.google.javascript.rhino.Node.newNumber((double) 100.0f, 0, 44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.replaceChild(node89, node93);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        int int4 = node3.getType();
        com.google.javascript.rhino.Node node5 = node3.cloneNode();
        boolean boolean6 = node3.isRegExp();
        com.google.javascript.rhino.Node node7 = node3.cloneNode();
        com.google.javascript.rhino.Node[] nodeArray14 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((int) (short) 10, nodeArray14);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(29, nodeArray14);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (short) 1, nodeArray14);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(38, nodeArray14, 23, (int) (byte) 100);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(30, nodeArray14);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(2, nodeArray14, (int) (short) 100, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node7.removeChild(node24);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (byte) 10, "Named type with empty name component");
        boolean boolean4 = node3.isObjectLit();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node15 = node13.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (byte) -1, node13, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node25 = node23.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (byte) -1, node23, (int) (byte) 1, (int) '#');
        boolean boolean29 = node18.hasChild(node28);
        int int30 = node18.getCharno();
        com.google.javascript.rhino.Node node31 = node8.useSourceInfoIfMissingFrom(node18);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node36 = node8.srcref(node35);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean41 = node40.isFromExterns();
        boolean boolean42 = node36.hasChild(node40);
        boolean boolean43 = node40.isOr();
        boolean boolean44 = node40.isReturn();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber((double) 4095, 100, (int) (short) 1);
        boolean boolean49 = node48.isLabelName();
        boolean boolean50 = node48.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("", 0, 10);
        int int55 = node54.getType();
        boolean boolean56 = node54.isArrayLit();
        boolean boolean57 = node54.isComma();
        int int58 = node48.getIndexOfChild(node54);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(52, node3, node40, node54);
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node66 = node64.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node((int) (byte) -1, node64, (int) (byte) 1, (int) '#');
        boolean boolean70 = node64.isDo();
        boolean boolean71 = node64.isDefaultCase();
        node64.setQuotedString();
        boolean boolean73 = node64.isDec();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder74 = node64.getJsDocBuilderForNode();
        node64.setVarArgs(false);
        com.google.javascript.rhino.Node node77 = node3.clonePropsFrom(node64);
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node84 = node82.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node87 = new com.google.javascript.rhino.Node((int) (byte) -1, node82, (int) (byte) 1, (int) '#');
        java.lang.String str88 = node82.toStringTree();
        boolean boolean89 = node82.isStringKey();
        com.google.javascript.rhino.Node node90 = node82.getParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node91 = node3.getChildBefore(node82);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node3.setCharno(1);
        boolean boolean6 = node3.isRegExp();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node13 = node11.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (byte) -1, node11, (int) (byte) 1, (int) '#');
        boolean boolean17 = node11.isDo();
        boolean boolean18 = node11.isDefaultCase();
        node11.setQuotedString();
        com.google.javascript.rhino.Node node20 = node3.useSourceInfoFromForTree(node11);
        node11.putIntProp((int) (byte) 100, (int) (byte) 0);
        node11.setCharno((int) (short) 1);
        java.lang.String str26 = node11.getString();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node33 = node31.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (byte) -1, node31, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node43 = node41.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((int) (byte) -1, node41, (int) (byte) 1, (int) '#');
        boolean boolean47 = node36.hasChild(node46);
        boolean boolean48 = node36.isReturn();
        java.lang.Object obj50 = node36.getProp(0);
        boolean boolean51 = node36.isInc();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString(38, "STRING  0");
        int int55 = node54.getLineno();
        com.google.javascript.rhino.Node node56 = node54.getLastChild();
        boolean boolean57 = node54.isVar();
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node64 = node62.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node67 = new com.google.javascript.rhino.Node((int) (byte) -1, node62, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node74 = node72.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node((int) (byte) -1, node72, (int) (byte) 1, (int) '#');
        boolean boolean78 = node67.hasChild(node77);
        boolean boolean79 = node77.isVar();
        boolean boolean80 = node77.isTypeOf();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable81 = node77.children();
        boolean boolean82 = node77.isTrue();
        node77.setWasEmptyNode(false);
        boolean boolean85 = node77.isSyntheticBlock();
        com.google.javascript.rhino.Node node86 = node54.srcref(node77);
        com.google.javascript.rhino.Node node87 = node86.cloneTree();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node11.replaceChild(node36, node86);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean4 = node3.isThrow();
        java.lang.String str8 = node3.toString(true, false, true);
        java.lang.String str9 = node3.getQualifiedName();
        boolean boolean10 = node3.isIn();
        com.google.javascript.rhino.Node node11 = node3.cloneTree();
        boolean boolean12 = node11.isRegExp();
        boolean boolean13 = node11.isTry();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node15 = node11.getChildAtIndex(9);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("STRING  0", (int) '#', 6);
        boolean boolean4 = node3.isDec();
        boolean boolean5 = node3.hasOneChild();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node12 = node10.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((int) (byte) -1, node10, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node22 = node20.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (byte) -1, node20, (int) (byte) 1, (int) '#');
        boolean boolean26 = node15.hasChild(node25);
        boolean boolean27 = node25.isVar();
        boolean boolean28 = node25.isTypeOf();
        boolean boolean29 = node25.isAssignAdd();
        com.google.javascript.rhino.Node node30 = node25.removeFirstChild();
        boolean boolean31 = node30.isSwitch();
        boolean boolean32 = node30.isFalse();
        com.google.javascript.rhino.Node node33 = node30.cloneTree();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node30);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node3.setCharno(1);
        com.google.javascript.rhino.Node node6 = node3.cloneNode();
        int int7 = node3.getChildCount();
        boolean boolean8 = node3.isContinue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node10 = node3.getChildAtIndex(1);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node7 = node5.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (byte) -1, node5, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node17 = node15.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (byte) -1, node15, (int) (byte) 1, (int) '#');
        boolean boolean21 = node10.hasChild(node20);
        boolean boolean22 = node20.isVar();
        boolean boolean23 = node20.isTypeOf();
        boolean boolean24 = node20.isAssignAdd();
        boolean boolean25 = node20.isStringKey();
        node20.setOptionalArg(true);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean32 = node31.isThrow();
        java.lang.String str36 = node31.toString(true, false, true);
        boolean boolean37 = node31.isWith();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean42 = node41.isThrow();
        boolean boolean43 = node41.isSwitch();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node50 = node48.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node((int) (byte) -1, node48, (int) (byte) 1, (int) '#');
        boolean boolean54 = node48.isDo();
        boolean boolean55 = node48.isDefaultCase();
        node48.setQuotedString();
        boolean boolean57 = node48.isDec();
        boolean boolean58 = node48.isLabel();
        boolean boolean59 = node48.isSetterDef();
        boolean boolean60 = node48.isRegExp();
        boolean boolean61 = node48.isName();
        boolean boolean62 = node48.isVoid();
        com.google.javascript.rhino.Node node63 = node48.cloneNode();
        com.google.javascript.rhino.Node node64 = node41.useSourceInfoIfMissingFrom(node63);
        boolean boolean65 = node64.isFor();
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node(53, node20, node31, node64);
        boolean boolean67 = node20.hasChildren();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node69 = node20.getChildAtIndex(12);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean4 = node3.isThrow();
        java.lang.String str8 = node3.toString(true, false, true);
        node3.setIsSyntheticBlock(true);
        int int11 = node3.getLength();
        boolean boolean13 = node3.getBooleanProp(54);
        boolean boolean14 = node3.isNoSideEffectsCall();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node16 = node3.getChildAtIndex(43);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node3.setCharno(1);
        boolean boolean6 = node3.isRegExp();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node13 = node11.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (byte) -1, node11, (int) (byte) 1, (int) '#');
        boolean boolean17 = node11.isDo();
        boolean boolean18 = node11.isDefaultCase();
        node11.setQuotedString();
        com.google.javascript.rhino.Node node20 = node3.useSourceInfoFromForTree(node11);
        node11.putIntProp((int) (byte) 100, (int) (byte) 0);
        node11.putProp((int) 'a', (java.lang.Object) "JSDocInfo");
        boolean boolean27 = node11.isGetterDef();
        boolean boolean28 = node11.isDo();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile29 = node11.getStaticSourceFile();
        int int30 = node11.getLineno();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder31 = node11.getJsDocBuilderForNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node33 = node11.getChildAtIndex((int) (short) 100);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        boolean boolean14 = node8.isScript();
        node8.setQuotedString();
        com.google.javascript.rhino.Node node16 = node3.srcrefTree(node8);
        boolean boolean17 = node16.isNull();
        boolean boolean18 = node16.isScript();
        boolean boolean19 = node16.isLocalResultCall();
        com.google.javascript.rhino.Node node20 = node16.getParent();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 54, 52, (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node25 = node16.getChildBefore(node24);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 4095, 100, (int) (short) 1);
        double double4 = node3.getDouble();
        boolean boolean5 = node3.isAdd();
        com.google.javascript.rhino.Node node6 = node3.cloneNode();
        boolean boolean7 = node3.isExprResult();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node18 = node16.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) (byte) -1, node16, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node28 = node26.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) (byte) -1, node26, (int) (byte) 1, (int) '#');
        boolean boolean32 = node21.hasChild(node31);
        int int33 = node21.getCharno();
        com.google.javascript.rhino.Node node34 = node11.useSourceInfoIfMissingFrom(node21);
        boolean boolean35 = node34.isArrayLit();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node42 = node40.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((int) (byte) -1, node40, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node52 = node50.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((int) (byte) -1, node50, (int) (byte) 1, (int) '#');
        boolean boolean56 = node45.hasChild(node55);
        node34.addChildrenToFront(node45);
        java.lang.Object obj59 = node34.getProp(40);
        boolean boolean60 = node34.isNull();
        int int61 = node34.getChildCount();
        boolean boolean62 = node3.isEquivalentTo(node34);
        node3.setLength(97);
        boolean boolean65 = node3.isSwitch();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node67 = node3.getChildAtIndex((int) 'a');
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        boolean boolean14 = node8.isScript();
        com.google.javascript.rhino.Node node15 = node8.detachFromParent();
        node15.setOptionalArg(false);
        boolean boolean19 = node15.getBooleanProp(31);
        com.google.javascript.rhino.Node node20 = node3.copyInformationFrom(node15);
        boolean boolean21 = node20.isLabel();
        com.google.javascript.rhino.InputId inputId22 = node20.getInputId();
        java.lang.String str23 = node20.getString();
        com.google.javascript.rhino.jstype.JSType jSType24 = node20.getJSType();
        boolean boolean25 = node20.isWhile();
        boolean boolean26 = node20.isNull();
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node37 = node35.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (byte) -1, node35, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node47 = node45.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node((int) (byte) -1, node45, (int) (byte) 1, (int) '#');
        boolean boolean51 = node40.hasChild(node50);
        int int52 = node40.getCharno();
        com.google.javascript.rhino.Node node53 = node30.useSourceInfoIfMissingFrom(node40);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile54 = node30.getStaticSourceFile();
        com.google.javascript.rhino.JSDocInfo jSDocInfo55 = node30.getJSDocInfo();
        com.google.javascript.rhino.Node node56 = node30.cloneTree();
        boolean boolean57 = node30.isRegExp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node58 = node20.getChildBefore(node30);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node3.setCharno(1);
        com.google.javascript.rhino.Node node6 = node3.getLastSibling();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (byte) 100, 43, 4095);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node11 = node6.getChildBefore(node10);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 0, 46);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node7.setCharno(1);
        boolean boolean10 = node7.isRegExp();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node17 = node15.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (byte) -1, node15, (int) (byte) 1, (int) '#');
        boolean boolean21 = node15.isDo();
        boolean boolean22 = node15.isDefaultCase();
        node15.setQuotedString();
        com.google.javascript.rhino.Node node24 = node7.useSourceInfoFromForTree(node15);
        node15.putIntProp((int) (byte) 100, (int) (byte) 0);
        node15.putProp((int) 'a', (java.lang.Object) "JSDocInfo");
        boolean boolean31 = node15.isInc();
        boolean boolean32 = node15.isDefaultCase();
        boolean boolean33 = node15.isVarArgs();
        com.google.javascript.rhino.Node node35 = node15.getAncestor((int) (short) 100);
        boolean boolean36 = node15.isHook();
        node15.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node39 = node15.cloneTree();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node40 = node3.getChildBefore(node39);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean4 = node3.isFromExterns();
        boolean boolean5 = node3.isNot();
        boolean boolean6 = node3.wasEmptyNode();
        boolean boolean7 = node3.isTrue();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable8 = node3.siblings();
        com.google.javascript.rhino.Node node10 = node3.getAncestor(409601);
        boolean boolean11 = node3.isSetterDef();
        boolean boolean12 = node3.isFalse();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node14 = node3.getChildAtIndex(32);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        int int4 = node3.getType();
        com.google.javascript.rhino.Node node5 = node3.cloneNode();
        boolean boolean6 = node5.isComma();
        boolean boolean7 = node5.isNumber();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 0, 10);
        int int12 = node11.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node5.removeChild(node11);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node3.setCharno(1);
        boolean boolean6 = node3.isRegExp();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node13 = node11.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (byte) -1, node11, (int) (byte) 1, (int) '#');
        boolean boolean17 = node11.isDo();
        boolean boolean18 = node11.isDefaultCase();
        node11.setQuotedString();
        com.google.javascript.rhino.Node node20 = node3.useSourceInfoFromForTree(node11);
        node11.putIntProp((int) (byte) 100, (int) (byte) 0);
        node11.putProp((int) 'a', (java.lang.Object) "JSDocInfo");
        boolean boolean27 = node11.isInc();
        com.google.javascript.rhino.Node node28 = node11.getLastSibling();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean33 = node32.isThrow();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean38 = node37.isThrow();
        java.lang.String str42 = node37.toString(true, false, true);
        java.lang.String str43 = node37.getQualifiedName();
        boolean boolean44 = node37.isIn();
        com.google.javascript.rhino.Node node45 = node37.cloneTree();
        boolean boolean46 = node45.isRegExp();
        boolean boolean47 = node45.isDebugger();
        node32.addChildToBack(node45);
        com.google.javascript.rhino.Node node49 = node28.srcref(node45);
        int int50 = node49.getLength();
        com.google.javascript.rhino.Node node51 = node49.detachFromParent();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber((double) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node49.removeChild(node53);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node3.setCharno(1);
        boolean boolean6 = node3.isRegExp();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node13 = node11.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (byte) -1, node11, (int) (byte) 1, (int) '#');
        boolean boolean17 = node11.isDo();
        boolean boolean18 = node11.isDefaultCase();
        node11.setQuotedString();
        com.google.javascript.rhino.Node node20 = node3.useSourceInfoFromForTree(node11);
        node11.putIntProp((int) (byte) 100, (int) (byte) 0);
        node11.putProp((int) 'a', (java.lang.Object) "JSDocInfo");
        boolean boolean27 = node11.isInc();
        node11.setQuotedString();
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str30 = jSDocInfo29.getVersion();
        boolean boolean31 = jSDocInfo29.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet32 = jSDocInfo29.getParameterNames();
        jSDocInfo29.addSuppression("");
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection35 = jSDocInfo29.getTypeNodes();
        java.lang.String str36 = jSDocInfo29.getDescription();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node40.setCharno(1);
        boolean boolean43 = node40.isRegExp();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node50 = node48.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node((int) (byte) -1, node48, (int) (byte) 1, (int) '#');
        boolean boolean54 = node48.isDo();
        boolean boolean55 = node48.isDefaultCase();
        node48.setQuotedString();
        com.google.javascript.rhino.Node node57 = node40.useSourceInfoFromForTree(node48);
        node48.putIntProp((int) (byte) 100, (int) (byte) 0);
        boolean boolean61 = node48.isVarArgs();
        jSDocInfo29.setAssociatedNode(node48);
        com.google.javascript.rhino.Node node63 = node11.useSourceInfoFromForTree(node48);
        boolean boolean64 = node63.isVarArgs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node66 = node63.getChildAtIndex(4095);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node3.setCharno(1);
        boolean boolean6 = node3.isRegExp();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node13 = node11.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (byte) -1, node11, (int) (byte) 1, (int) '#');
        boolean boolean17 = node11.isDo();
        boolean boolean18 = node11.isDefaultCase();
        node11.setQuotedString();
        com.google.javascript.rhino.Node node20 = node3.useSourceInfoFromForTree(node11);
        node11.putIntProp((int) (byte) 100, (int) (byte) 0);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node30 = node28.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((int) (byte) -1, node28, (int) (byte) 1, (int) '#');
        boolean boolean34 = node28.isScript();
        com.google.javascript.rhino.InputId inputId35 = node28.getInputId();
        com.google.javascript.rhino.Node node36 = node11.useSourceInfoFrom(node28);
        boolean boolean37 = node11.isTrue();
        boolean boolean38 = node11.isSetterDef();
        boolean boolean39 = node11.isComma();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition40 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean41 = typePosition40.hasBrackets();
        int int42 = typePosition40.getPositionOnStartLine();
        int int43 = typePosition40.getPositionOnEndLine();
        typePosition40.setPositionInformation(30, 36, 40, (int) (short) 10);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 6);
        typePosition40.setItem(node50);
        int int52 = node11.getIndexOfChild(node50);
        boolean boolean53 = node50.isExprResult();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node55 = node50.getChildAtIndex(409601);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        java.lang.String str10 = node4.toStringTree();
        boolean boolean11 = node4.isStringKey();
        boolean boolean12 = node4.isAnd();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile13 = node4.getStaticSourceFile();
        boolean boolean14 = node4.isLabel();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable15 = node4.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node17 = node4.getChildAtIndex(12);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 10);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node8 = node6.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node((int) (byte) -1, node6, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node18 = node16.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) (byte) -1, node16, (int) (byte) 1, (int) '#');
        boolean boolean22 = node11.hasChild(node21);
        boolean boolean23 = node21.isVar();
        boolean boolean24 = node21.isTypeOf();
        boolean boolean25 = node21.isAssignAdd();
        boolean boolean26 = node21.isStringKey();
        boolean boolean27 = node21.isVoid();
        int int28 = node21.getLength();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node21);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node3 = node1.getChildAtIndex((int) '#');
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node20 = node18.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (byte) -1, node18, (int) (byte) 1, (int) '#');
        boolean boolean24 = node13.hasChild(node23);
        int int25 = node13.getCharno();
        com.google.javascript.rhino.Node node26 = node3.useSourceInfoIfMissingFrom(node13);
        node26.setLength((int) ' ');
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node39 = node37.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((int) (byte) -1, node37, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node49 = node47.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node((int) (byte) -1, node47, (int) (byte) 1, (int) '#');
        boolean boolean53 = node42.hasChild(node52);
        int int54 = node42.getCharno();
        com.google.javascript.rhino.Node node55 = node32.useSourceInfoIfMissingFrom(node42);
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node60 = node32.srcref(node59);
        boolean boolean61 = node26.isEquivalentToTyped(node32);
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node68 = node66.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node((int) (byte) -1, node66, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node78 = node76.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node81 = new com.google.javascript.rhino.Node((int) (byte) -1, node76, (int) (byte) 1, (int) '#');
        boolean boolean82 = node71.hasChild(node81);
        boolean boolean83 = node81.isVar();
        boolean boolean84 = node81.isCase();
        boolean boolean85 = node32.hasChild(node81);
        node32.setWasEmptyNode(true);
        boolean boolean88 = node32.isObjectLit();
        boolean boolean89 = node32.isString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node91 = node32.getChildAtIndex(131104);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 10, "Named type with empty name component");
        boolean boolean3 = node2.isObjectLit();
        boolean boolean4 = node2.hasMoreThanOneChild();
        boolean boolean5 = node2.isOnlyModifiesThisCall();
        boolean boolean6 = node2.isReturn();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node8 = node2.getChildAtIndex(36);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("STRING  0 [synthetic: 1]\n", (int) ' ', (int) (byte) -1);
        boolean boolean4 = node3.isCase();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(52, "", 52, 10);
        boolean boolean10 = node9.isUnscopedQualifiedName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node9);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 16773120, 48, 21);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 23, (int) (short) 0, 4095);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node8 = node3.getChildBefore(node7);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean5 = node4.isThrow();
        java.lang.String str9 = node4.toString(true, false, true);
        java.lang.String str10 = node4.getQualifiedName();
        boolean boolean11 = node4.isIn();
        com.google.javascript.rhino.Node node12 = node4.cloneTree();
        boolean boolean13 = node12.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(40, node12);
        boolean boolean15 = node12.isAnd();
        com.google.javascript.rhino.Node node16 = node12.getLastChild();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 49, (int) (byte) 10, 45);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(10);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node34 = node32.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) -1, node32, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node44 = node42.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((int) (byte) -1, node42, (int) (byte) 1, (int) '#');
        boolean boolean48 = node37.hasChild(node47);
        int int49 = node37.getCharno();
        com.google.javascript.rhino.Node node50 = node27.useSourceInfoIfMissingFrom(node37);
        node50.setLength((int) ' ');
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node63 = node61.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node((int) (byte) -1, node61, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node73 = node71.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node76 = new com.google.javascript.rhino.Node((int) (byte) -1, node71, (int) (byte) 1, (int) '#');
        boolean boolean77 = node66.hasChild(node76);
        int int78 = node66.getCharno();
        com.google.javascript.rhino.Node node79 = node56.useSourceInfoIfMissingFrom(node66);
        com.google.javascript.rhino.Node node83 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node84 = node56.srcref(node83);
        boolean boolean85 = node50.isEquivalentToTyped(node56);
        node56.addSuppression("STRING  0 [synthetic: 1]\n");
        node23.addChildToBack(node56);
        java.lang.String str92 = node23.toString(false, true, true);
        boolean boolean93 = node23.isGetterDef();
        com.google.javascript.rhino.Node node96 = new com.google.javascript.rhino.Node(36, node21, node23, 42, 23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node12.removeChild(node23);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        boolean boolean14 = node8.isScript();
        node8.setQuotedString();
        com.google.javascript.rhino.Node node16 = node3.srcrefTree(node8);
        boolean boolean17 = node16.isNull();
        node16.setOptionalArg(false);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node26 = node24.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (byte) -1, node24, (int) (byte) 1, (int) '#');
        boolean boolean30 = node24.isDo();
        boolean boolean31 = node24.isDefaultCase();
        node24.setQuotedString();
        boolean boolean33 = node24.isDec();
        boolean boolean34 = node24.isLabel();
        boolean boolean35 = node24.isSetterDef();
        boolean boolean36 = node24.isRegExp();
        boolean boolean37 = node24.isName();
        boolean boolean38 = node24.isAssignAdd();
        boolean boolean39 = node24.isFor();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean44 = node43.isThrow();
        java.lang.String str48 = node43.toString(true, false, true);
        int int50 = node43.getIntProp(51);
        com.google.javascript.rhino.Node node51 = node43.cloneTree();
        boolean boolean52 = node51.isCatch();
        boolean boolean53 = node51.isExprResult();
        boolean boolean54 = node51.isNot();
        boolean boolean55 = node51.isNew();
        boolean boolean56 = node51.isStringKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node16.replaceChild(node24, node51);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(38, "STRING  0");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) ' ', node3);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node11 = node9.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (byte) -1, node9, (int) (byte) 1, (int) '#');
        boolean boolean15 = node9.isScript();
        com.google.javascript.rhino.InputId inputId16 = node9.getInputId();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node20.setCharno(1);
        boolean boolean23 = node20.isRegExp();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node30 = node28.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((int) (byte) -1, node28, (int) (byte) 1, (int) '#');
        boolean boolean34 = node28.isDo();
        boolean boolean35 = node28.isDefaultCase();
        node28.setQuotedString();
        com.google.javascript.rhino.Node node37 = node20.useSourceInfoFromForTree(node28);
        node28.putIntProp((int) (byte) 100, (int) (byte) 0);
        node28.putProp((int) 'a', (java.lang.Object) "JSDocInfo");
        node28.detachChildren();
        com.google.javascript.rhino.Node node45 = node9.useSourceInfoIfMissingFromForTree(node28);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean50 = node49.isThrow();
        java.lang.String str54 = node49.toString(true, false, true);
        node49.setIsSyntheticBlock(true);
        boolean boolean57 = node49.isTry();
        java.lang.String str58 = node49.toStringTree();
        com.google.javascript.rhino.Node node59 = node9.copyInformationFrom(node49);
        com.google.javascript.rhino.Node node60 = node59.getParent();
        boolean boolean61 = node60.isDo();
        boolean boolean62 = node60.isLabelName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node60);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        int int10 = node9.getType();
        boolean boolean11 = node9.isDelProp();
        boolean boolean12 = node9.wasEmptyNode();
        com.google.javascript.rhino.Node node13 = node9.removeChildren();
        boolean boolean14 = node9.wasEmptyNode();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder15 = node9.new FileLevelJsDocBuilder();
        boolean boolean16 = node9.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node20.setCharno(1);
        java.util.Set<java.lang.String> strSet23 = node20.getDirectives();
        node20.setCharno((int) (short) -1);
        boolean boolean26 = node20.isRegExp();
        boolean boolean27 = node20.isDefaultCase();
        boolean boolean28 = node20.isBlock();
        boolean boolean29 = node20.isTrue();
        boolean boolean30 = node9.isEquivalentTo(node20);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean36 = node35.isThrow();
        java.lang.String str40 = node35.toString(true, false, true);
        java.lang.String str41 = node35.getQualifiedName();
        boolean boolean42 = node35.isIn();
        com.google.javascript.rhino.Node node43 = node35.cloneTree();
        boolean boolean44 = node43.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(40, node43);
        int int46 = node45.getType();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile47 = node45.getStaticSourceFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node9.removeChild(node45);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(51);
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean6 = node5.isThrow();
        java.lang.String str10 = node5.toString(true, false, true);
        node5.setIsSyntheticBlock(true);
        boolean boolean13 = node5.isTry();
        java.lang.String str14 = node5.toStringTree();
        com.google.javascript.rhino.Node node15 = node1.useSourceInfoFromForTree(node5);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node22 = node20.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (byte) -1, node20, (int) (byte) 1, (int) '#');
        boolean boolean26 = node20.isDo();
        com.google.javascript.rhino.Node node27 = node20.getLastSibling();
        boolean boolean28 = node20.isAssignAdd();
        node20.setVarArgs(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node31 = node15.getChildBefore(node20);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("Not declared as a type name", 47, (int) (short) 0);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        boolean boolean14 = node8.isDo();
        boolean boolean15 = node8.isDefaultCase();
        node8.setQuotedString();
        boolean boolean17 = node8.isDec();
        boolean boolean18 = node8.isTypeOf();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean23 = node22.isThrow();
        java.lang.String str27 = node22.toString(true, false, true);
        java.lang.String str28 = node22.getQualifiedName();
        boolean boolean29 = node22.isIn();
        com.google.javascript.rhino.Node node30 = node22.cloneTree();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node34.setCharno(1);
        java.util.Set<java.lang.String> strSet37 = node34.getDirectives();
        boolean boolean38 = node34.isHook();
        node30.addChildToFront(node34);
        com.google.javascript.rhino.Node node40 = node34.getLastSibling();
        java.lang.Object obj42 = node40.getProp(2);
        com.google.javascript.rhino.Node node43 = node8.useSourceInfoFrom(node40);
        node8.removeProp(10);
        com.google.javascript.rhino.Node node46 = node3.copyInformationFrom(node8);
        boolean boolean47 = node8.isSyntheticBlock();
        boolean boolean48 = node8.isTrue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node50 = node8.getChildAtIndex(208993);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        boolean boolean14 = node8.isScript();
        node8.setQuotedString();
        com.google.javascript.rhino.Node node16 = node3.srcrefTree(node8);
        boolean boolean17 = node16.isIf();
        com.google.javascript.rhino.Node node18 = node16.getParent();
        boolean boolean19 = node16.isWith();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) 4095, 100, (int) (short) 1);
        double double24 = node23.getDouble();
        boolean boolean25 = node23.isContinue();
        java.lang.String str26 = node16.checkTreeEquals(node23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node28 = node16.getChildAtIndex(15);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(54);
        boolean boolean2 = node1.isLabelName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node4 = node1.getChildAtIndex(3);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        java.lang.String[] strArray3 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet4 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet4, strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        boolean boolean11 = strSet4.addAll((java.util.Collection<java.lang.String>) strList9);
        boolean boolean13 = strSet4.remove((java.lang.Object) 1L);
        java.lang.String[] strArray16 = new java.lang.String[] { "STRING  0", "STRING  0" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        boolean boolean20 = strSet17.add("STRING  0");
        java.lang.String[] strArray23 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        boolean boolean31 = strSet24.addAll((java.util.Collection<java.lang.String>) strList29);
        boolean boolean32 = strSet17.containsAll((java.util.Collection<java.lang.String>) strList29);
        boolean boolean33 = strSet4.addAll((java.util.Collection<java.lang.String>) strSet17);
        java.util.stream.Stream<java.lang.String> strStream34 = strSet17.stream();
        strSet17.clear();
        java.lang.CharSequence[] charSequenceArray38 = new java.lang.CharSequence[] { "(Node tree inequality:\nTree1:\nSTRING  0 [quoted: 1]\n\n\nTree2:\nIN\n\n\nSubtree1: STRING  0 [quoted: 1]\n\n\nSubtree2: IN\n)", "STRING  0\n" };
        java.lang.CharSequence[] charSequenceArray39 = strSet17.toArray(charSequenceArray38);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        int int45 = node44.getSourcePosition();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node56 = node54.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node((int) (byte) -1, node54, (int) (byte) 1, (int) '#');
        boolean boolean60 = node54.isScript();
        node54.setQuotedString();
        com.google.javascript.rhino.Node node62 = node49.srcrefTree(node54);
        boolean boolean63 = node62.isIf();
        com.google.javascript.rhino.Node node64 = node62.getParent();
        node62.removeProp((int) 'a');
        int int67 = node62.getLineno();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString(35, "OR 1", (int) (short) 0, 45);
        com.google.javascript.rhino.Node node73 = node72.removeFirstChild();
        com.google.javascript.rhino.Node[] nodeArray74 = new com.google.javascript.rhino.Node[] { node44, node62, node72 };
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node(50, nodeArray74, 4095, (int) (short) 0);
        com.google.javascript.rhino.Node[] nodeArray78 = strSet17.toArray(nodeArray74);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node79 = new com.google.javascript.rhino.Node(44, nodeArray74);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node20 = node18.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (byte) -1, node18, (int) (byte) 1, (int) '#');
        boolean boolean24 = node13.hasChild(node23);
        int int25 = node13.getCharno();
        com.google.javascript.rhino.Node node26 = node3.useSourceInfoIfMissingFrom(node13);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node31 = node3.srcref(node30);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean36 = node35.isFromExterns();
        boolean boolean37 = node31.hasChild(node35);
        boolean boolean38 = node35.isOr();
        node35.putIntProp(35, 38);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean47 = node46.isFromExterns();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node(39, node46, (int) '4', 51);
        com.google.javascript.rhino.JSDocInfo jSDocInfo51 = node46.getJSDocInfo();
        boolean boolean52 = node46.isFalse();
        int int53 = node35.getIndexOfChild(node46);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile54 = node35.getStaticSourceFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node56 = node35.getChildAtIndex(4131);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 4095, 100, (int) (short) 1);
        double double4 = node3.getDouble();
        boolean boolean5 = node3.isAdd();
        boolean boolean6 = node3.isDelProp();
        boolean boolean7 = node3.isGetElem();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean12 = node11.isThrow();
        java.lang.String str16 = node11.toString(true, false, true);
        java.lang.String str17 = node11.getQualifiedName();
        boolean boolean18 = node11.isIn();
        com.google.javascript.rhino.Node node19 = node11.cloneTree();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node23.setCharno(1);
        java.util.Set<java.lang.String> strSet26 = node23.getDirectives();
        boolean boolean27 = node23.isHook();
        node19.addChildToFront(node23);
        com.google.javascript.rhino.Node node29 = node23.getLastSibling();
        java.lang.String[] strArray32 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet33 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet33, strArray32);
        java.lang.String[] strArray37 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        boolean boolean40 = strSet33.addAll((java.util.Collection<java.lang.String>) strList38);
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str42 = jSDocInfo41.getVersion();
        java.lang.String str43 = jSDocInfo41.getFileOverview();
        boolean boolean44 = jSDocInfo41.shouldPreserveTry();
        java.util.Set<java.lang.String> strSet45 = jSDocInfo41.getParameterNames();
        boolean boolean46 = strSet33.retainAll((java.util.Collection<java.lang.String>) strSet45);
        java.lang.String[] strArray49 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet50 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet50, strArray49);
        java.lang.String[] strArray54 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        boolean boolean57 = strSet50.addAll((java.util.Collection<java.lang.String>) strList55);
        boolean boolean58 = strSet33.containsAll((java.util.Collection<java.lang.String>) strSet50);
        java.lang.Object[] objArray59 = strSet50.toArray();
        node23.setDirectives((java.util.Set<java.lang.String>) strSet50);
        node23.detachChildren();
        boolean boolean62 = node23.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node23);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node16 = node14.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) -1, node14, (int) (byte) 1, (int) '#');
        boolean boolean20 = node9.hasChild(node19);
        boolean boolean21 = node19.isVar();
        boolean boolean22 = node19.isTypeOf();
        boolean boolean23 = node19.isAssignAdd();
        com.google.javascript.rhino.Node node24 = node19.removeFirstChild();
        boolean boolean25 = node24.isSwitch();
        boolean boolean26 = node24.hasMoreThanOneChild();
        int int28 = node24.getIntProp(49);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean33 = node32.isThrow();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean38 = node37.isThrow();
        java.lang.String str42 = node37.toString(true, false, true);
        java.lang.String str43 = node37.getQualifiedName();
        boolean boolean44 = node37.isIn();
        com.google.javascript.rhino.Node node45 = node37.cloneTree();
        boolean boolean46 = node45.isRegExp();
        boolean boolean47 = node45.isDebugger();
        node32.addChildToBack(node45);
        boolean boolean49 = node45.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node50 = node24.srcrefTree(node45);
        node45.setSourceFileForTesting("(STRING  0\n)");
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString(5, "(STRING  0\n)", 30, 35);
        boolean boolean59 = node58.isFromExterns();
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node(41, node58, 35, 15);
        int int63 = node45.getIndexOfChild(node58);
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node70 = node68.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node((int) (byte) -1, node68, (int) (byte) 1, (int) '#');
        java.lang.String str74 = node68.toStringTree();
        boolean boolean75 = node68.isStringKey();
        boolean boolean76 = node68.isQuotedString();
        boolean boolean77 = node68.isFor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node58.removeChild(node68);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        int int4 = node3.getType();
        com.google.javascript.rhino.Node node5 = node3.cloneNode();
        node3.removeProp(35);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) 4095, 100, (int) (short) 1);
        boolean boolean12 = node11.isLabelName();
        boolean boolean13 = node11.isVarArgs();
        boolean boolean14 = node11.isSetterDef();
        boolean boolean15 = node11.isQualifiedName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node16 = node3.getChildBefore(node11);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(1, "Node tree inequality:\nTree1:\nNUMBER 4095.0 100\n\n\nTree2:\nNUMBER 4095.0 100\n    INSTANCEOF\n        STRING  0\n\n\nSubtree1: NUMBER 4095.0 100\n\n\nSubtree2: NUMBER 4095.0 100\n    INSTANCEOF\n        STRING  0\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node4 = node2.getChildAtIndex((int) ' ');
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        int int10 = node9.getType();
        boolean boolean11 = node9.isDelProp();
        boolean boolean12 = node9.wasEmptyNode();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node19 = node17.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (byte) -1, node17, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node23 = node9.copyInformationFromForTree(node17);
        com.google.javascript.rhino.jstype.JSType jSType24 = node23.getJSType();
        boolean boolean25 = node23.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(53, "OR 51");
        boolean boolean29 = node28.isLabel();
        java.util.Set<java.lang.String> strSet30 = node28.getDirectives();
        java.lang.Object obj32 = node28.getProp(44);
        boolean boolean33 = node28.isQualifiedName();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node40 = node38.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((int) (byte) -1, node38, (int) (byte) 1, (int) '#');
        java.lang.String str44 = node38.toStringTree();
        boolean boolean45 = node38.isStringKey();
        boolean boolean46 = node38.isAnd();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile47 = node38.getStaticSourceFile();
        boolean boolean48 = node38.isLabel();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable49 = node38.children();
        com.google.javascript.rhino.Node node50 = node28.clonePropsFrom(node38);
        com.google.javascript.rhino.Node node51 = node23.useSourceInfoFromForTree(node38);
        boolean boolean52 = node38.isGetElem();
        java.lang.String str53 = node38.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node55 = node38.getChildAtIndex(9);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        boolean boolean14 = node8.isScript();
        node8.setQuotedString();
        com.google.javascript.rhino.Node node16 = node3.srcrefTree(node8);
        boolean boolean17 = node8.isBreak();
        boolean boolean19 = node8.getBooleanProp(100);
        boolean boolean20 = node8.isRegExp();
        boolean boolean21 = node8.isExprResult();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node23 = node8.getChildAtIndex(4095);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        com.google.javascript.rhino.Node[] nodeArray2 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, nodeArray2);
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(29, nodeArray2);
        node4.setSourceFileForTesting("NUMBER 4095.0 1\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node8 = node4.getChildAtIndex(49);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getFileOverview();
        jSDocInfo0.addSuppression("STRING  0");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getBaseType();
        boolean boolean6 = jSDocInfo0.shouldPreserveTry();
        java.util.Set<java.lang.String> strSet7 = jSDocInfo0.getSuppressions();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 0, 10);
        int int12 = node11.getType();
        int int13 = node11.getCharno();
        boolean boolean14 = strSet7.equals((java.lang.Object) node11);
        boolean boolean15 = node11.isOptionalArg();
        node11.setQuotedString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node18 = node11.getChildAtIndex(30);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node16 = node14.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) -1, node14, (int) (byte) 1, (int) '#');
        boolean boolean20 = node9.hasChild(node19);
        boolean boolean21 = node9.isReturn();
        boolean boolean22 = node9.isAnd();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(38);
        com.google.javascript.rhino.Node node25 = node9.copyInformationFrom(node24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node27 = node25.getChildAtIndex(37);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node4.setCharno(1);
        boolean boolean7 = node4.isRegExp();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node14 = node12.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (byte) -1, node12, (int) (byte) 1, (int) '#');
        boolean boolean18 = node12.isDo();
        boolean boolean19 = node12.isDefaultCase();
        node12.setQuotedString();
        com.google.javascript.rhino.Node node21 = node4.useSourceInfoFromForTree(node12);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node25.setCharno(1);
        java.util.Set<java.lang.String> strSet28 = node25.getDirectives();
        node25.setLength(0);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node37 = node35.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (byte) -1, node35, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(0, node21, node25, node40, (int) 'a', (int) (short) 0);
        boolean boolean44 = node21.isNull();
        com.google.javascript.rhino.jstype.JSType jSType45 = node21.getJSType();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node52 = node50.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((int) (byte) -1, node50, (int) (byte) 1, (int) '#');
        boolean boolean56 = node50.isScript();
        com.google.javascript.rhino.InputId inputId57 = node50.getInputId();
        boolean boolean58 = node50.isDelProp();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder59 = node50.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node60 = node21.srcref(node50);
        boolean boolean61 = node60.isNumber();
        int int62 = node60.getChildCount();
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node((int) (short) 100);
        com.google.javascript.rhino.Node node65 = node60.useSourceInfoIfMissingFrom(node64);
        com.google.javascript.rhino.Node node66 = node64.getLastSibling();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile67 = node66.getStaticSourceFile();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node74 = node72.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node((int) (byte) -1, node72, (int) (byte) 1, (int) '#');
        int int78 = node77.getType();
        boolean boolean79 = node77.isDelProp();
        boolean boolean80 = node77.isLabel();
        boolean boolean81 = node77.isSyntheticBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node82 = node66.getChildBefore(node77);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(6, "Node tree inequality:\nTree1:\nMUL ERROR 1\n    STRING  0\n\n\n\nTree2:\nERROR\n    STRING  0\n\n\nSubtree1: MUL ERROR 1\n    STRING  0\n\n\n\nSubtree2: ERROR\n    STRING  0\n", 53, 51);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.removeChild(node6);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(49, (int) (byte) 0, (int) (short) 0);
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(40, node4);
        com.google.javascript.rhino.Node node6 = node4.cloneTree();
        com.google.javascript.rhino.JSDocInfo jSDocInfo7 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str8 = jSDocInfo7.getVersion();
        boolean boolean9 = jSDocInfo7.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet10 = jSDocInfo7.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList11 = jSDocInfo7.getImplementedInterfaces();
        boolean boolean12 = jSDocInfo7.hasReturnType();
        boolean boolean13 = jSDocInfo7.hasBaseType();
        boolean boolean14 = jSDocInfo7.isNoCompile();
        java.lang.String str15 = jSDocInfo7.getOriginalCommentString();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node22 = node20.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (byte) -1, node20, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node32 = node30.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) (byte) -1, node30, (int) (byte) 1, (int) '#');
        boolean boolean36 = node25.hasChild(node35);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString(49, "STRING  0\n");
        com.google.javascript.rhino.Node node40 = node25.clonePropsFrom(node39);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node51 = node49.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node((int) (byte) -1, node49, (int) (byte) 1, (int) '#');
        boolean boolean55 = node49.isScript();
        com.google.javascript.rhino.Node node56 = node49.detachFromParent();
        node56.setOptionalArg(false);
        boolean boolean60 = node56.getBooleanProp(31);
        com.google.javascript.rhino.Node node61 = node44.copyInformationFrom(node56);
        boolean boolean62 = node61.isLabel();
        com.google.javascript.rhino.Node node63 = node39.useSourceInfoIfMissingFrom(node61);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder64 = node39.new FileLevelJsDocBuilder();
        boolean boolean65 = node39.isNE();
        jSDocInfo7.setAssociatedNode(node39);
        com.google.javascript.rhino.Node node67 = jSDocInfo7.getAssociatedNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node68 = node4.getChildBefore(node67);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(35, "OR 1", (int) (short) 0, 45);
        boolean boolean5 = node4.isOnlyModifiesThisCall();
        boolean boolean6 = node4.isNull();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) 4095, 100, (int) (short) 1);
        double double11 = node10.getDouble();
        int int12 = node10.getSourcePosition();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean18 = node17.isThrow();
        java.lang.String str22 = node17.toString(true, false, true);
        java.lang.String str23 = node17.getQualifiedName();
        boolean boolean24 = node17.isIn();
        com.google.javascript.rhino.Node node25 = node17.cloneTree();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node32 = node30.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) (byte) -1, node30, (int) (byte) 1, (int) '#');
        boolean boolean36 = node30.isScript();
        com.google.javascript.rhino.Node node37 = node30.detachFromParent();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node41.setCharno(1);
        java.util.Set<java.lang.String> strSet44 = node41.getDirectives();
        boolean boolean45 = node41.isHook();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node56 = node54.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node((int) (byte) -1, node54, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node66 = node64.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node((int) (byte) -1, node64, (int) (byte) 1, (int) '#');
        boolean boolean70 = node59.hasChild(node69);
        int int71 = node59.getCharno();
        com.google.javascript.rhino.Node node72 = node49.useSourceInfoIfMissingFrom(node59);
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node77 = node49.srcref(node76);
        com.google.javascript.rhino.Node node78 = new com.google.javascript.rhino.Node(4095, node25, node37, node41, node49);
        boolean boolean79 = node78.isHook();
        boolean boolean80 = node78.isTrue();
        boolean boolean81 = node78.isIf();
        com.google.javascript.rhino.Node node83 = node78.getChildAtIndex((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.replaceChild(node10, node78);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        boolean boolean10 = node4.isScript();
        com.google.javascript.rhino.InputId inputId11 = node4.getInputId();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node15.setCharno(1);
        boolean boolean18 = node15.isRegExp();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node25 = node23.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (byte) -1, node23, (int) (byte) 1, (int) '#');
        boolean boolean29 = node23.isDo();
        boolean boolean30 = node23.isDefaultCase();
        node23.setQuotedString();
        com.google.javascript.rhino.Node node32 = node15.useSourceInfoFromForTree(node23);
        node23.putIntProp((int) (byte) 100, (int) (byte) 0);
        node23.putProp((int) 'a', (java.lang.Object) "JSDocInfo");
        node23.detachChildren();
        com.google.javascript.rhino.Node node40 = node4.useSourceInfoIfMissingFromForTree(node23);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean45 = node44.isThrow();
        java.lang.String str49 = node44.toString(true, false, true);
        node44.setIsSyntheticBlock(true);
        boolean boolean52 = node44.isTry();
        java.lang.String str53 = node44.toStringTree();
        com.google.javascript.rhino.Node node54 = node4.copyInformationFrom(node44);
        boolean boolean55 = node54.isLabelName();
        com.google.javascript.rhino.Node node56 = node54.getLastSibling();
        com.google.javascript.rhino.Node node57 = node54.getLastSibling();
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node61.setCharno(1);
        boolean boolean64 = node61.isRegExp();
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node71 = node69.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node74 = new com.google.javascript.rhino.Node((int) (byte) -1, node69, (int) (byte) 1, (int) '#');
        boolean boolean75 = node69.isDo();
        boolean boolean76 = node69.isDefaultCase();
        node69.setQuotedString();
        com.google.javascript.rhino.Node node78 = node61.useSourceInfoFromForTree(node69);
        int int79 = node61.getCharno();
        boolean boolean80 = node61.isCall();
        int int81 = node61.getLength();
        node54.addChildrenToFront(node61);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node84 = node54.getChildAtIndex(131104);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(16773120, "hi!");
        java.lang.String str3 = node2.getString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node5 = node2.getChildAtIndex(1044480);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 46, 21, 0);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node11 = node9.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (byte) -1, node9, (int) (byte) 1, (int) '#');
        boolean boolean15 = node9.isDo();
        boolean boolean16 = node9.isDefaultCase();
        node9.setQuotedString();
        boolean boolean18 = node9.isDec();
        boolean boolean19 = node9.isLabel();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node9.siblings();
        boolean boolean21 = node9.isEmpty();
        com.google.javascript.rhino.Node node22 = node9.getParent();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(41, node22, (int) 'a', 40);
        boolean boolean26 = node22.isObjectLit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node22);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        int int4 = node3.getType();
        com.google.javascript.rhino.Node node5 = node3.cloneNode();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder6 = node3.new FileLevelJsDocBuilder();
        boolean boolean7 = node3.isFunction();
        boolean boolean8 = node3.isWith();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node19 = node17.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (byte) -1, node17, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node29 = node27.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (byte) -1, node27, (int) (byte) 1, (int) '#');
        boolean boolean33 = node22.hasChild(node32);
        int int34 = node22.getCharno();
        com.google.javascript.rhino.Node node35 = node12.useSourceInfoIfMissingFrom(node22);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node40 = node12.srcref(node39);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean45 = node44.isFromExterns();
        boolean boolean46 = node40.hasChild(node44);
        boolean boolean47 = node44.isOr();
        boolean boolean48 = node44.wasEmptyNode();
        com.google.javascript.rhino.Node node49 = node44.removeChildren();
        boolean boolean50 = node44.isLabel();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node44);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node3.setCharno(1);
        boolean boolean6 = node3.isRegExp();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node13 = node11.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (byte) -1, node11, (int) (byte) 1, (int) '#');
        boolean boolean17 = node11.isDo();
        boolean boolean18 = node11.isDefaultCase();
        node11.setQuotedString();
        com.google.javascript.rhino.Node node20 = node3.useSourceInfoFromForTree(node11);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder21 = node20.new FileLevelJsDocBuilder();
        boolean boolean22 = node20.isFromExterns();
        boolean boolean23 = node20.hasChildren();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(0, "(ERROR 1)", 6, 23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node29 = node20.getChildBefore(node28);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node16 = node14.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) -1, node14, (int) (byte) 1, (int) '#');
        boolean boolean20 = node9.hasChild(node19);
        boolean boolean21 = node19.isVar();
        boolean boolean22 = node19.isTypeOf();
        boolean boolean23 = node19.isAssignAdd();
        boolean boolean24 = node19.isSyntheticBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node26 = node19.getChildAtIndex(40);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 4095, 100, (int) (short) 1);
        double double4 = node3.getDouble();
        boolean boolean5 = node3.isAdd();
        com.google.javascript.rhino.Node node6 = node3.cloneNode();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node10.setCharno(1);
        java.util.Set<java.lang.String> strSet13 = node10.getDirectives();
        node10.setLength(0);
        com.google.javascript.rhino.Node node16 = node3.useSourceInfoIfMissingFrom(node10);
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = node10.getJSDocInfo();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node24 = node22.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((int) (byte) -1, node22, (int) (byte) 1, (int) '#');
        boolean boolean28 = node22.isScript();
        boolean boolean29 = node22.isTrue();
        boolean boolean30 = node22.isContinue();
        com.google.javascript.rhino.Node node31 = node10.useSourceInfoIfMissingFromForTree(node22);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node35.setCharno(1);
        boolean boolean38 = node35.isRegExp();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node45 = node43.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node((int) (byte) -1, node43, (int) (byte) 1, (int) '#');
        boolean boolean49 = node43.isDo();
        boolean boolean50 = node43.isDefaultCase();
        node43.setQuotedString();
        com.google.javascript.rhino.Node node52 = node35.useSourceInfoFromForTree(node43);
        node43.putIntProp((int) (byte) 100, (int) (byte) 0);
        node43.putProp((int) 'a', (java.lang.Object) "JSDocInfo");
        boolean boolean59 = node43.isInc();
        boolean boolean60 = node43.isDefaultCase();
        boolean boolean61 = node43.isVarArgs();
        com.google.javascript.rhino.Node node63 = node43.getAncestor((int) (short) 100);
        boolean boolean64 = node43.isHook();
        node43.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node67 = node43.cloneTree();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node68 = node31.getChildBefore(node67);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node20 = node18.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (byte) -1, node18, (int) (byte) 1, (int) '#');
        boolean boolean24 = node13.hasChild(node23);
        int int25 = node13.getCharno();
        com.google.javascript.rhino.Node node26 = node3.useSourceInfoIfMissingFrom(node13);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node37 = node35.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (byte) -1, node35, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node47 = node45.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node((int) (byte) -1, node45, (int) (byte) 1, (int) '#');
        boolean boolean51 = node40.hasChild(node50);
        int int52 = node40.getCharno();
        com.google.javascript.rhino.Node node53 = node30.useSourceInfoIfMissingFrom(node40);
        int int54 = node30.getSourcePosition();
        java.lang.String str55 = node30.toString();
        com.google.javascript.rhino.Node node56 = node3.srcref(node30);
        boolean boolean57 = node56.wasEmptyNode();
        boolean boolean58 = node56.isWhile();
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString("", 0, 10);
        int int63 = node62.getType();
        boolean boolean64 = node62.isArrayLit();
        boolean boolean65 = node62.isComma();
        boolean boolean66 = node62.isGetProp();
        boolean boolean67 = node62.isCatch();
        boolean boolean68 = node62.isVar();
        boolean boolean69 = node62.isReturn();
        com.google.javascript.rhino.JSDocInfo jSDocInfo70 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str71 = jSDocInfo70.getVersion();
        boolean boolean72 = jSDocInfo70.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet73 = jSDocInfo70.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList74 = jSDocInfo70.getImplementedInterfaces();
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean79 = node78.isThrow();
        java.lang.String str83 = node78.toString(true, false, true);
        jSDocInfo70.setAssociatedNode(node78);
        boolean boolean85 = node78.isVar();
        java.lang.String str86 = node62.checkTreeEquals(node78);
        boolean boolean87 = node78.hasOneChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node88 = node56.getChildBefore(node78);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node3.setCharno(1);
        boolean boolean6 = node3.isRegExp();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node13 = node11.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (byte) -1, node11, (int) (byte) 1, (int) '#');
        boolean boolean17 = node11.isDo();
        boolean boolean18 = node11.isDefaultCase();
        node11.setQuotedString();
        com.google.javascript.rhino.Node node20 = node3.useSourceInfoFromForTree(node11);
        node11.putIntProp((int) (byte) 100, (int) (byte) 0);
        boolean boolean24 = node11.isVarArgs();
        boolean boolean25 = node11.isName();
        com.google.javascript.rhino.JSDocInfo jSDocInfo26 = node11.getJSDocInfo();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder27 = node11.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 100.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node11.removeChild(node29);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        java.lang.String[] strArray18 = new java.lang.String[] { "OR 1\n", "STRING  0\n", "", "OR 51", "Not declared as a constructor", "false", "Not declared as a constructor", "STRING  0 [synthetic: 1]\n", "JSDocInfo", "false", "STRING  0 [quoted: 1]\n", "true", "STRING  0 [quoted: 1]\n", "OR 1\n", "IN\n", "Named type with empty name component", "STRING  0 [quoted: 1]\n", "(OR 1)" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node24.setCharno(1);
        boolean boolean27 = node24.isRegExp();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node34 = node32.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) -1, node32, (int) (byte) 1, (int) '#');
        boolean boolean38 = node32.isDo();
        boolean boolean39 = node32.isDefaultCase();
        node32.setQuotedString();
        com.google.javascript.rhino.Node node41 = node24.useSourceInfoFromForTree(node32);
        node32.putIntProp((int) (byte) 100, (int) (byte) 0);
        node32.setCharno((int) (short) 1);
        java.lang.String str47 = node32.getString();
        boolean boolean48 = strSet19.contains((java.lang.Object) node32);
        node32.setVarArgs(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node52 = node32.getChildAtIndex(51);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        com.google.javascript.rhino.Node[] nodeArray4 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node((int) (short) 10, nodeArray4);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(29, nodeArray4);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((int) (short) 1, nodeArray4);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(0, nodeArray4, (int) (byte) 100, 30);
        java.lang.String[] strArray13 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = strSet14.addAll((java.util.Collection<java.lang.String>) strList19);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node28 = node26.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) (byte) -1, node26, (int) (byte) 1, (int) '#');
        boolean boolean32 = node26.isScript();
        node26.setQuotedString();
        boolean boolean34 = strSet14.equals((java.lang.Object) node26);
        int int35 = node26.getChildCount();
        boolean boolean36 = node26.isQuotedString();
        boolean boolean37 = node26.isObjectLit();
        com.google.javascript.rhino.Node node38 = node26.getParent();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node45 = node43.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node((int) (byte) -1, node43, (int) (byte) 1, (int) '#');
        boolean boolean49 = node43.isDo();
        com.google.javascript.rhino.Node node50 = node43.getLastSibling();
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node(46, (int) (byte) -1, 29);
        com.google.javascript.rhino.Node node55 = node50.srcrefTree(node54);
        boolean boolean56 = node50.isGetElem();
        com.google.javascript.rhino.Node node57 = node38.srcrefTree(node50);
        boolean boolean58 = node38.isScript();
        boolean boolean59 = node38.isParamList();
        com.google.javascript.rhino.Node node60 = node38.removeFirstChild();
        boolean boolean61 = node38.isNE();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node10.removeChild(node38);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node7 = node5.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (byte) -1, node5, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node17 = node15.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (byte) -1, node15, (int) (byte) 1, (int) '#');
        boolean boolean21 = node10.hasChild(node20);
        int int22 = node10.getCharno();
        boolean boolean23 = node10.isTry();
        boolean boolean24 = node10.isDec();
        boolean boolean25 = node10.isLocalResultCall();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node29.setCharno(1);
        java.util.Set<java.lang.String> strSet32 = node29.getDirectives();
        node29.setCharno((int) (short) -1);
        boolean boolean35 = node29.isRegExp();
        com.google.javascript.rhino.Node node36 = node29.getLastChild();
        boolean boolean37 = node29.isDec();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node44 = node42.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((int) (byte) -1, node42, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node54 = node52.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node((int) (byte) -1, node52, (int) (byte) 1, (int) '#');
        boolean boolean58 = node47.hasChild(node57);
        boolean boolean59 = node57.isVar();
        boolean boolean60 = node57.isTypeOf();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable61 = node57.children();
        boolean boolean62 = node57.isTrue();
        com.google.javascript.rhino.JSDocInfo jSDocInfo63 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str64 = jSDocInfo63.getVersion();
        java.lang.String str65 = jSDocInfo63.getFileOverview();
        boolean boolean66 = jSDocInfo63.shouldPreserveTry();
        java.util.Set<java.lang.String> strSet67 = jSDocInfo63.getParameterNames();
        boolean boolean68 = jSDocInfo63.isExpose();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node72.setCharno(1);
        boolean boolean75 = node72.isRegExp();
        com.google.javascript.rhino.Node node80 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node82 = node80.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node85 = new com.google.javascript.rhino.Node((int) (byte) -1, node80, (int) (byte) 1, (int) '#');
        boolean boolean86 = node80.isDo();
        boolean boolean87 = node80.isDefaultCase();
        node80.setQuotedString();
        com.google.javascript.rhino.Node node89 = node72.useSourceInfoFromForTree(node80);
        jSDocInfo63.setAssociatedNode(node72);
        com.google.javascript.rhino.Node node91 = new com.google.javascript.rhino.Node(32, node10, node29, node57, node72);
        node10.setSourceEncodedPositionForTree(31);
        node10.addSuppression("(ERROR 1)");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node97 = node10.getChildAtIndex(19);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        com.google.javascript.rhino.Node[] nodeArray5 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((int) (short) 10, nodeArray5);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(29, nodeArray5);
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((int) (short) 1, nodeArray5);
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(38, nodeArray5, 23, (int) (byte) 100);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) '4', nodeArray5);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node24 = node22.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((int) (byte) -1, node22, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node34 = node32.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) -1, node32, (int) (byte) 1, (int) '#');
        boolean boolean38 = node27.hasChild(node37);
        int int39 = node27.getCharno();
        com.google.javascript.rhino.Node node40 = node17.useSourceInfoIfMissingFrom(node27);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node47 = node45.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node((int) (byte) -1, node45, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node57 = node55.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((int) (byte) -1, node55, (int) (byte) 1, (int) '#');
        boolean boolean61 = node50.hasChild(node60);
        boolean boolean62 = node60.isVar();
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node((-1), node27, node60);
        boolean boolean64 = node60.isCase();
        node60.setIsSyntheticBlock(true);
        boolean boolean67 = node60.isCall();
        boolean boolean68 = node60.isVar();
        boolean boolean69 = node60.isOr();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node12.removeChild(node60);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node3.setCharno(1);
        java.util.Set<java.lang.String> strSet6 = node3.getDirectives();
        node3.setCharno((int) (short) -1);
        boolean boolean9 = node3.isRegExp();
        com.google.javascript.rhino.Node node10 = node3.getLastChild();
        boolean boolean11 = node3.isSetterDef();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node15.setCharno(1);
        boolean boolean18 = node15.isRegExp();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node25 = node23.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (byte) -1, node23, (int) (byte) 1, (int) '#');
        boolean boolean29 = node23.isDo();
        boolean boolean30 = node23.isDefaultCase();
        node23.setQuotedString();
        com.google.javascript.rhino.Node node32 = node15.useSourceInfoFromForTree(node23);
        node23.putIntProp((int) (byte) 100, (int) (byte) 0);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node42 = node40.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((int) (byte) -1, node40, (int) (byte) 1, (int) '#');
        boolean boolean46 = node40.isScript();
        com.google.javascript.rhino.InputId inputId47 = node40.getInputId();
        com.google.javascript.rhino.Node node48 = node23.useSourceInfoFrom(node40);
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node55 = node53.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node((int) (byte) -1, node53, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node65 = node63.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node((int) (byte) -1, node63, (int) (byte) 1, (int) '#');
        boolean boolean69 = node58.hasChild(node68);
        boolean boolean70 = node68.isVar();
        boolean boolean71 = node68.isTypeOf();
        boolean boolean72 = node68.isAssignAdd();
        node68.setWasEmptyNode(false);
        com.google.javascript.rhino.Node node75 = node23.copyInformationFrom(node68);
        boolean boolean76 = node68.isOptionalArg();
        boolean boolean77 = node68.isAdd();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node68);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("Node tree inequality:\nTree1:\nOR 0\n\n\nTree2:\nNUMBER 4095.0 100\n\n\nSubtree1: OR 0\n\n\nSubtree2: NUMBER 4095.0 100\n", 4, 45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node5 = node3.getChildAtIndex(52);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node7 = node5.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (byte) -1, node5, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node17 = node15.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (byte) -1, node15, (int) (byte) 1, (int) '#');
        boolean boolean21 = node10.hasChild(node20);
        int int22 = node10.getCharno();
        boolean boolean23 = node10.isTry();
        boolean boolean24 = node10.isDec();
        boolean boolean25 = node10.isLocalResultCall();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node29.setCharno(1);
        java.util.Set<java.lang.String> strSet32 = node29.getDirectives();
        node29.setCharno((int) (short) -1);
        boolean boolean35 = node29.isRegExp();
        com.google.javascript.rhino.Node node36 = node29.getLastChild();
        boolean boolean37 = node29.isDec();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node44 = node42.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((int) (byte) -1, node42, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node54 = node52.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node((int) (byte) -1, node52, (int) (byte) 1, (int) '#');
        boolean boolean58 = node47.hasChild(node57);
        boolean boolean59 = node57.isVar();
        boolean boolean60 = node57.isTypeOf();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable61 = node57.children();
        boolean boolean62 = node57.isTrue();
        com.google.javascript.rhino.JSDocInfo jSDocInfo63 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str64 = jSDocInfo63.getVersion();
        java.lang.String str65 = jSDocInfo63.getFileOverview();
        boolean boolean66 = jSDocInfo63.shouldPreserveTry();
        java.util.Set<java.lang.String> strSet67 = jSDocInfo63.getParameterNames();
        boolean boolean68 = jSDocInfo63.isExpose();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node72.setCharno(1);
        boolean boolean75 = node72.isRegExp();
        com.google.javascript.rhino.Node node80 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node82 = node80.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node85 = new com.google.javascript.rhino.Node((int) (byte) -1, node80, (int) (byte) 1, (int) '#');
        boolean boolean86 = node80.isDo();
        boolean boolean87 = node80.isDefaultCase();
        node80.setQuotedString();
        com.google.javascript.rhino.Node node89 = node72.useSourceInfoFromForTree(node80);
        jSDocInfo63.setAssociatedNode(node72);
        com.google.javascript.rhino.Node node91 = new com.google.javascript.rhino.Node(32, node10, node29, node57, node72);
        com.google.javascript.rhino.Node node92 = node91.getLastSibling();
        boolean boolean93 = node92.isNot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node95 = node92.getChildAtIndex(45);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node3.setCharno(1);
        boolean boolean6 = node3.isRegExp();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node13 = node11.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (byte) -1, node11, (int) (byte) 1, (int) '#');
        boolean boolean17 = node11.isDo();
        boolean boolean18 = node11.isDefaultCase();
        node11.setQuotedString();
        com.google.javascript.rhino.Node node20 = node3.useSourceInfoFromForTree(node11);
        node11.putIntProp((int) (byte) 100, (int) (byte) 0);
        boolean boolean24 = node11.isVarArgs();
        node11.setLineno(37);
        boolean boolean27 = node11.isInstanceOf();
        boolean boolean28 = node11.isAdd();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder29 = node11.new FileLevelJsDocBuilder();
        java.lang.String[] strArray32 = new java.lang.String[] { "STRING  0", "STRING  0" };
        java.util.LinkedHashSet<java.lang.String> strSet33 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet33, strArray32);
        boolean boolean36 = strSet33.add("STRING  0");
        java.lang.String[] strArray39 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        java.lang.String[] strArray44 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        boolean boolean47 = strSet40.addAll((java.util.Collection<java.lang.String>) strList45);
        boolean boolean48 = strSet33.containsAll((java.util.Collection<java.lang.String>) strList45);
        java.lang.String[] strArray51 = new java.lang.String[] { "STRING  0", "STRING  0" };
        java.util.LinkedHashSet<java.lang.String> strSet52 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet52, strArray51);
        boolean boolean55 = strSet52.add("STRING  0");
        java.lang.String[] strArray58 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet59 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet59, strArray58);
        java.lang.String[] strArray63 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        boolean boolean66 = strSet59.addAll((java.util.Collection<java.lang.String>) strList64);
        boolean boolean67 = strSet52.containsAll((java.util.Collection<java.lang.String>) strList64);
        boolean boolean68 = strSet33.containsAll((java.util.Collection<java.lang.String>) strSet52);
        strSet33.clear();
        node11.setDirectives((java.util.Set<java.lang.String>) strSet33);
        boolean boolean72 = node11.getBooleanProp(2);
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.Node.newString("((OR 51))");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node11.removeChild(node74);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node20 = node18.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (byte) -1, node18, (int) (byte) 1, (int) '#');
        boolean boolean24 = node13.hasChild(node23);
        int int25 = node13.getCharno();
        com.google.javascript.rhino.Node node26 = node3.useSourceInfoIfMissingFrom(node13);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node31 = node3.srcref(node30);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean36 = node35.isFromExterns();
        boolean boolean37 = node31.hasChild(node35);
        node31.setLineno((-1));
        node31.setSourceEncodedPosition(37);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString("", 0, 10);
        int int46 = node45.getType();
        com.google.javascript.rhino.Node node47 = node45.cloneNode();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean52 = node51.isThrow();
        java.lang.String str56 = node51.toString(true, false, true);
        int int58 = node51.getIntProp(51);
        node51.addSuppression("STRING  0 [quoted: 1]\n");
        com.google.javascript.rhino.Node node61 = node47.useSourceInfoFrom(node51);
        boolean boolean62 = node47.wasEmptyNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node63 = node31.getChildBefore(node47);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node3.setCharno(1);
        boolean boolean6 = node3.isRegExp();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node13 = node11.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (byte) -1, node11, (int) (byte) 1, (int) '#');
        boolean boolean17 = node11.isDo();
        boolean boolean18 = node11.isDefaultCase();
        node11.setQuotedString();
        com.google.javascript.rhino.Node node20 = node3.useSourceInfoFromForTree(node11);
        node11.putIntProp((int) (byte) 100, (int) (byte) 0);
        node11.putProp((int) 'a', (java.lang.Object) "JSDocInfo");
        boolean boolean27 = node11.isInc();
        com.google.javascript.rhino.Node node28 = node11.getLastSibling();
        boolean boolean30 = node28.getBooleanProp(15);
        boolean boolean31 = node28.isQualifiedName();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 17, 1, 19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node28.removeChild(node35);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        java.lang.String[] strArray2 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        boolean boolean10 = strSet3.addAll((java.util.Collection<java.lang.String>) strList8);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node17 = node15.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (byte) -1, node15, (int) (byte) 1, (int) '#');
        boolean boolean21 = node15.isScript();
        node15.setQuotedString();
        boolean boolean23 = strSet3.equals((java.lang.Object) node15);
        boolean boolean24 = node15.isVar();
        boolean boolean25 = node15.isGetterDef();
        boolean boolean26 = node15.isBreak();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        int int31 = node30.getSourcePosition();
        int int32 = node30.getType();
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node43 = node41.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((int) (byte) -1, node41, (int) (byte) 1, (int) '#');
        boolean boolean47 = node41.isScript();
        node41.setQuotedString();
        com.google.javascript.rhino.Node node49 = node36.srcrefTree(node41);
        boolean boolean50 = node36.isVar();
        node30.addChildrenToBack(node36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node52 = node15.getChildBefore(node36);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList4 = jSDocInfo0.getImplementedInterfaces();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean9 = node8.isThrow();
        java.lang.String str13 = node8.toString(true, false, true);
        jSDocInfo0.setAssociatedNode(node8);
        com.google.javascript.rhino.Node node15 = node8.removeFirstChild();
        boolean boolean16 = node8.isNumber();
        boolean boolean17 = node8.isVar();
        boolean boolean18 = node8.isExprResult();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean23 = node22.isThrow();
        boolean boolean24 = node22.isSwitch();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node31 = node29.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((int) (byte) -1, node29, (int) (byte) 1, (int) '#');
        boolean boolean35 = node29.isDo();
        boolean boolean36 = node29.isDefaultCase();
        node29.setQuotedString();
        boolean boolean38 = node29.isDec();
        boolean boolean39 = node29.isLabel();
        boolean boolean40 = node29.isSetterDef();
        boolean boolean41 = node29.isRegExp();
        boolean boolean42 = node29.isName();
        boolean boolean43 = node29.isVoid();
        com.google.javascript.rhino.Node node44 = node29.cloneNode();
        com.google.javascript.rhino.Node node45 = node22.useSourceInfoIfMissingFrom(node44);
        java.lang.String str46 = node44.getString();
        boolean boolean47 = node44.isVar();
        boolean boolean48 = node44.isObjectLit();
        int int49 = node44.getSourcePosition();
        com.google.javascript.rhino.Node node50 = node8.useSourceInfoFrom(node44);
        boolean boolean52 = node8.getBooleanProp(37);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node54 = node8.getChildAtIndex(32);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        boolean boolean10 = node4.hasOneChild();
        java.lang.String str11 = node4.getQualifiedName();
        boolean boolean12 = node4.isGetElem();
        node4.setIsSyntheticBlock(false);
        boolean boolean15 = node4.hasOneChild();
        com.google.javascript.rhino.Node[] nodeArray21 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (short) 10, nodeArray21);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(0, nodeArray21);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(2, nodeArray21);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((-1), nodeArray21);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (byte) 100, nodeArray21, 48, 43);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node33.setCharno(1);
        boolean boolean36 = node33.isRegExp();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node43 = node41.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((int) (byte) -1, node41, (int) (byte) 1, (int) '#');
        boolean boolean47 = node41.isDo();
        boolean boolean48 = node41.isDefaultCase();
        node41.setQuotedString();
        com.google.javascript.rhino.Node node50 = node33.useSourceInfoFromForTree(node41);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node54.setCharno(1);
        java.util.Set<java.lang.String> strSet57 = node54.getDirectives();
        node54.setLength(0);
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node66 = node64.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node((int) (byte) -1, node64, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node(0, node50, node54, node69, (int) 'a', (int) (short) 0);
        boolean boolean73 = node72.isLocalResultCall();
        node72.setSourceEncodedPosition(47);
        boolean boolean76 = node72.isVoid();
        boolean boolean77 = node72.isQualifiedName();
        boolean boolean78 = node72.isQuotedString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.replaceChild(node28, node72);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node4.setCharno(1);
        boolean boolean7 = node4.isRegExp();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node14 = node12.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (byte) -1, node12, (int) (byte) 1, (int) '#');
        boolean boolean18 = node12.isDo();
        boolean boolean19 = node12.isDefaultCase();
        node12.setQuotedString();
        com.google.javascript.rhino.Node node21 = node4.useSourceInfoFromForTree(node12);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node25.setCharno(1);
        java.util.Set<java.lang.String> strSet28 = node25.getDirectives();
        node25.setLength(0);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node37 = node35.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (byte) -1, node35, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(0, node21, node25, node40, (int) 'a', (int) (short) 0);
        node21.removeProp(53);
        int int46 = node21.getLineno();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString(8, "STRING  0 [quoted: 1]\n");
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node56 = node54.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node((int) (byte) -1, node54, (int) (byte) 1, (int) '#');
        boolean boolean60 = node54.isDo();
        boolean boolean61 = node54.isDefaultCase();
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node72 = node70.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node((int) (byte) -1, node70, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node80 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node82 = node80.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node85 = new com.google.javascript.rhino.Node((int) (byte) -1, node80, (int) (byte) 1, (int) '#');
        boolean boolean86 = node75.hasChild(node85);
        int int87 = node75.getCharno();
        com.google.javascript.rhino.Node node88 = node65.useSourceInfoIfMissingFrom(node75);
        int int89 = node65.getSourcePosition();
        java.lang.String str90 = node65.toString();
        int int91 = node54.getIndexOfChild(node65);
        int int92 = node49.getIndexOfChild(node65);
        boolean boolean93 = node65.isReturn();
        boolean boolean94 = node65.isHook();
        int int95 = node65.getSourceOffset();
        node65.setSourceEncodedPositionForTree(49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node21.removeChild(node65);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 4095, 100, (int) (short) 1);
        double double5 = node4.getDouble();
        int int6 = node4.getSourcePosition();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node10.setCharno(1);
        boolean boolean13 = node10.isRegExp();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node20 = node18.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (byte) -1, node18, (int) (byte) 1, (int) '#');
        boolean boolean24 = node18.isDo();
        boolean boolean25 = node18.isDefaultCase();
        node18.setQuotedString();
        com.google.javascript.rhino.Node node27 = node10.useSourceInfoFromForTree(node18);
        node18.putIntProp((int) (byte) 100, (int) (byte) 0);
        node18.putProp((int) 'a', (java.lang.Object) "JSDocInfo");
        boolean boolean34 = node18.isInc();
        node18.setQuotedString();
        java.lang.String str36 = node18.getSourceFileName();
        com.google.javascript.rhino.Node node37 = node4.copyInformationFrom(node18);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(10, node4);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node53 = node51.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((int) (byte) -1, node51, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node63 = node61.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node((int) (byte) -1, node61, (int) (byte) 1, (int) '#');
        boolean boolean67 = node56.hasChild(node66);
        int int68 = node56.getCharno();
        com.google.javascript.rhino.Node node69 = node46.useSourceInfoIfMissingFrom(node56);
        node69.setLength((int) ' ');
        node42.addChildrenToBack(node69);
        int int73 = node69.getLength();
        java.lang.String str74 = node69.toStringTree();
        int int75 = node69.getSideEffectFlags();
        boolean boolean76 = node69.isWith();
        boolean boolean77 = node69.isLabel();
        com.google.javascript.rhino.Node node78 = node38.srcref(node69);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node80 = node38.getChildAtIndex(31);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node20 = node18.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (byte) -1, node18, (int) (byte) 1, (int) '#');
        boolean boolean24 = node13.hasChild(node23);
        int int25 = node13.getCharno();
        com.google.javascript.rhino.Node node26 = node3.useSourceInfoIfMissingFrom(node13);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile27 = node3.getStaticSourceFile();
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = node3.getJSDocInfo();
        com.google.javascript.rhino.Node node29 = node3.cloneTree();
        com.google.javascript.rhino.JSDocInfo jSDocInfo30 = node3.getJSDocInfo();
        boolean boolean31 = node3.isThis();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition32 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean33 = typePosition32.hasBrackets();
        typePosition32.setPositionInformation(2, 31, 29, 37);
        int int39 = typePosition32.getPositionOnEndLine();
        com.google.javascript.rhino.Node node40 = typePosition32.getItem();
        boolean boolean41 = typePosition32.hasBrackets();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node45.setCharno(1);
        boolean boolean48 = node45.isRegExp();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node55 = node53.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node((int) (byte) -1, node53, (int) (byte) 1, (int) '#');
        boolean boolean59 = node53.isDo();
        boolean boolean60 = node53.isDefaultCase();
        node53.setQuotedString();
        com.google.javascript.rhino.Node node62 = node45.useSourceInfoFromForTree(node53);
        int int63 = node62.getCharno();
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node70 = node68.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node((int) (byte) -1, node68, (int) (byte) 1, (int) '#');
        boolean boolean74 = node68.isDo();
        boolean boolean75 = node68.isDefaultCase();
        node68.setQuotedString();
        boolean boolean77 = node68.isDec();
        boolean boolean78 = node68.isBlock();
        boolean boolean79 = node68.isBreak();
        boolean boolean80 = node68.hasOneChild();
        boolean boolean81 = node68.isQualifiedName();
        com.google.javascript.rhino.Node node82 = node62.useSourceInfoIfMissingFrom(node68);
        com.google.javascript.rhino.Node node86 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean87 = node86.isThrow();
        java.lang.String str91 = node86.toString(true, false, true);
        int int93 = node86.getIntProp(51);
        node68.addChildrenToFront(node86);
        typePosition32.setItem(node68);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node96 = node3.getChildBefore(node68);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean1 = typePosition0.hasBrackets();
        int int2 = typePosition0.getPositionOnStartLine();
        int int3 = typePosition0.getPositionOnStartLine();
        com.google.javascript.rhino.Node node4 = typePosition0.getItem();
        boolean boolean5 = typePosition0.hasBrackets();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node9.setCharno(1);
        boolean boolean12 = node9.isRegExp();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node19 = node17.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (byte) -1, node17, (int) (byte) 1, (int) '#');
        boolean boolean23 = node17.isDo();
        boolean boolean24 = node17.isDefaultCase();
        node17.setQuotedString();
        com.google.javascript.rhino.Node node26 = node9.useSourceInfoFromForTree(node17);
        node17.putIntProp((int) (byte) 100, (int) (byte) 0);
        node17.putProp((int) 'a', (java.lang.Object) "JSDocInfo");
        boolean boolean33 = node17.isInc();
        node17.setQuotedString();
        com.google.javascript.rhino.JSDocInfo jSDocInfo35 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str36 = jSDocInfo35.getVersion();
        boolean boolean37 = jSDocInfo35.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet38 = jSDocInfo35.getParameterNames();
        jSDocInfo35.addSuppression("");
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection41 = jSDocInfo35.getTypeNodes();
        java.lang.String str42 = jSDocInfo35.getDescription();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node46.setCharno(1);
        boolean boolean49 = node46.isRegExp();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node56 = node54.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node((int) (byte) -1, node54, (int) (byte) 1, (int) '#');
        boolean boolean60 = node54.isDo();
        boolean boolean61 = node54.isDefaultCase();
        node54.setQuotedString();
        com.google.javascript.rhino.Node node63 = node46.useSourceInfoFromForTree(node54);
        node54.putIntProp((int) (byte) 100, (int) (byte) 0);
        boolean boolean67 = node54.isVarArgs();
        jSDocInfo35.setAssociatedNode(node54);
        com.google.javascript.rhino.Node node69 = node17.useSourceInfoFromForTree(node54);
        boolean boolean70 = node17.isHook();
        boolean boolean71 = node17.isReturn();
        typePosition0.setItem(node17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node74 = node17.getChildAtIndex(143361);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        int int4 = node3.getType();
        com.google.javascript.rhino.Node node5 = node3.cloneNode();
        boolean boolean6 = node3.isRegExp();
        com.google.javascript.rhino.JSDocInfo jSDocInfo7 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str8 = jSDocInfo7.getVersion();
        boolean boolean9 = jSDocInfo7.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet10 = jSDocInfo7.getParameterNames();
        jSDocInfo7.addSuppression("");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList13 = jSDocInfo7.getExtendedInterfaces();
        boolean boolean14 = jSDocInfo7.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet15 = jSDocInfo7.getModifies();
        java.lang.Object[] objArray16 = strSet15.toArray();
        java.util.HashSet[] hashSetArray18 = new java.util.HashSet[0];
        @SuppressWarnings("unchecked")
        java.util.HashSet<java.lang.String>[] strSetArray19 = (java.util.HashSet<java.lang.String>[]) hashSetArray18;
        java.util.HashSet<java.lang.String>[] strSetArray20 = strSet15.toArray(strSetArray19);
        node3.setDirectives(strSet15);
        boolean boolean22 = node3.isAnd();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node29 = node27.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (byte) -1, node27, (int) (byte) 1, (int) '#');
        boolean boolean33 = node27.isDo();
        boolean boolean34 = node27.isDefaultCase();
        node27.setQuotedString();
        boolean boolean36 = node27.isDec();
        boolean boolean37 = node27.isLabel();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable38 = node27.siblings();
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(51);
        java.lang.String str41 = node27.checkTreeEquals(node40);
        boolean boolean42 = node27.isOr();
        com.google.javascript.rhino.JSDocInfo jSDocInfo43 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str44 = jSDocInfo43.getVersion();
        boolean boolean45 = jSDocInfo43.hasEnumParameterType();
        java.lang.String str47 = jSDocInfo43.getDescriptionForParameter("STRING  0\n");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList48 = jSDocInfo43.getExtendedInterfaces();
        node27.setJSDocInfo(jSDocInfo43);
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node60 = node58.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node((int) (byte) -1, node58, (int) (byte) 1, (int) '#');
        boolean boolean64 = node58.isScript();
        node58.setQuotedString();
        com.google.javascript.rhino.Node node66 = node53.srcrefTree(node58);
        boolean boolean67 = node58.isBreak();
        boolean boolean68 = node27.hasChild(node58);
        node58.setCharno(51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node71 = node3.getChildBefore(node58);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node16 = node14.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) -1, node14, (int) (byte) 1, (int) '#');
        boolean boolean20 = node9.hasChild(node19);
        boolean boolean21 = node19.isVar();
        boolean boolean22 = node19.isTypeOf();
        boolean boolean23 = node19.isAssignAdd();
        node19.setWasEmptyNode(false);
        boolean boolean26 = node19.isInstanceOf();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node28 = node19.getChildAtIndex(54);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        java.lang.String str10 = node4.toStringTree();
        boolean boolean11 = node4.isStringKey();
        boolean boolean12 = node4.isDelProp();
        java.lang.Object obj14 = node4.getProp(29);
        boolean boolean15 = node4.isFromExterns();
        boolean boolean16 = node4.isSwitch();
        boolean boolean17 = node4.isFunction();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node19 = node4.getChildAtIndex(31);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node16 = node14.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) -1, node14, (int) (byte) 1, (int) '#');
        boolean boolean20 = node9.hasChild(node19);
        boolean boolean21 = node19.isVar();
        boolean boolean22 = node19.isTypeOf();
        boolean boolean23 = node19.isAssignAdd();
        com.google.javascript.rhino.Node node24 = node19.removeFirstChild();
        boolean boolean25 = node24.isSwitch();
        node24.putIntProp(52, 0);
        boolean boolean29 = node24.isFalse();
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node40 = node38.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((int) (byte) -1, node38, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node50 = node48.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node((int) (byte) -1, node48, (int) (byte) 1, (int) '#');
        boolean boolean54 = node43.hasChild(node53);
        int int55 = node43.getCharno();
        com.google.javascript.rhino.Node node56 = node33.useSourceInfoIfMissingFrom(node43);
        node56.setLength((int) ' ');
        boolean boolean59 = node56.isReturn();
        boolean boolean60 = node56.isTypeOf();
        boolean boolean61 = node56.isVar();
        boolean boolean62 = node56.isTrue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node24.removeChild(node56);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.JSType jSType2 = node1.getJSType();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (byte) 10, "Named type with empty name component");
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node18 = node16.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) (byte) -1, node16, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node28 = node26.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) (byte) -1, node26, (int) (byte) 1, (int) '#');
        boolean boolean32 = node21.hasChild(node31);
        int int33 = node21.getCharno();
        com.google.javascript.rhino.Node node34 = node11.useSourceInfoIfMissingFrom(node21);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node41 = node39.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node((int) (byte) -1, node39, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node51 = node49.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node((int) (byte) -1, node49, (int) (byte) 1, (int) '#');
        boolean boolean55 = node44.hasChild(node54);
        boolean boolean56 = node54.isVar();
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node((-1), node21, node54);
        com.google.javascript.rhino.Node node58 = node57.getParent();
        boolean boolean59 = node57.isSetterDef();
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((-1), node57);
        boolean boolean61 = node5.isEquivalentTo(node60);
        com.google.javascript.rhino.Node node62 = node1.srcrefTree(node60);
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newNumber((double) (short) -1);
        int int65 = node64.getChildCount();
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newNumber((double) 4095, 100, (int) (short) 1);
        double double70 = node69.getDouble();
        int int71 = node69.getSourcePosition();
        boolean boolean72 = node69.isExprResult();
        node69.setSourceFileForTesting("ERROR 1\n    STRING  0\n    STRING  0\n");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable75 = node69.children();
        boolean boolean76 = node64.isEquivalentToTyped(node69);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node77 = node62.getChildBefore(node69);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        boolean boolean10 = node4.isDo();
        boolean boolean11 = node4.isDefaultCase();
        boolean boolean12 = node4.isFor();
        boolean boolean13 = node4.isThis();
        boolean boolean14 = node4.isThis();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", 409601, 54);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node25 = node23.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (byte) -1, node23, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node35 = node33.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((int) (byte) -1, node33, (int) (byte) 1, (int) '#');
        boolean boolean39 = node28.hasChild(node38);
        boolean boolean40 = node38.isVar();
        boolean boolean41 = node38.isCase();
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node53 = node51.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((int) (byte) -1, node51, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node63 = node61.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node((int) (byte) -1, node61, (int) (byte) 1, (int) '#');
        boolean boolean67 = node56.hasChild(node66);
        int int68 = node56.getCharno();
        com.google.javascript.rhino.Node node69 = node46.useSourceInfoIfMissingFrom(node56);
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node76 = node74.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node79 = new com.google.javascript.rhino.Node((int) (byte) -1, node74, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node84 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node86 = node84.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node89 = new com.google.javascript.rhino.Node((int) (byte) -1, node84, (int) (byte) 1, (int) '#');
        boolean boolean90 = node79.hasChild(node89);
        boolean boolean91 = node89.isVar();
        com.google.javascript.rhino.Node node92 = new com.google.javascript.rhino.Node((-1), node56, node89);
        boolean boolean93 = node56.isAssignAdd();
        com.google.javascript.rhino.Node node94 = node56.removeFirstChild();
        com.google.javascript.rhino.Node node95 = node38.srcrefTree(node94);
        boolean boolean96 = node94.isVarArgs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.replaceChild(node18, node94);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node3.setCharno(1);
        boolean boolean6 = node3.isRegExp();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node13 = node11.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (byte) -1, node11, (int) (byte) 1, (int) '#');
        boolean boolean17 = node11.isDo();
        boolean boolean18 = node11.isDefaultCase();
        node11.setQuotedString();
        com.google.javascript.rhino.Node node20 = node3.useSourceInfoFromForTree(node11);
        boolean boolean21 = node3.isInc();
        java.lang.String str25 = node3.toString(true, false, true);
        boolean boolean26 = node3.isComma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node28 = node3.getChildAtIndex(1);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getParameterNames();
        jSDocInfo0.addSuppression("");
        java.lang.String str6 = jSDocInfo0.getBlockDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getEnumParameterType();
        boolean boolean8 = jSDocInfo0.hasModifies();
        boolean boolean9 = jSDocInfo0.hasType();
        boolean boolean10 = jSDocInfo0.hasEnumParameterType();
        java.lang.String str11 = jSDocInfo0.getOriginalCommentString();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node22 = node20.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (byte) -1, node20, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node32 = node30.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) (byte) -1, node30, (int) (byte) 1, (int) '#');
        boolean boolean36 = node25.hasChild(node35);
        int int37 = node25.getCharno();
        com.google.javascript.rhino.Node node38 = node15.useSourceInfoIfMissingFrom(node25);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node43 = node15.srcref(node42);
        jSDocInfo0.setAssociatedNode(node43);
        boolean boolean45 = node43.isExprResult();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node56 = node54.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node((int) (byte) -1, node54, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node66 = node64.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node((int) (byte) -1, node64, (int) (byte) 1, (int) '#');
        boolean boolean70 = node59.hasChild(node69);
        int int71 = node59.getCharno();
        com.google.javascript.rhino.Node node72 = node49.useSourceInfoIfMissingFrom(node59);
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node77 = node49.srcref(node76);
        boolean boolean78 = node76.isNoSideEffectsCall();
        boolean boolean79 = node76.isObjectLit();
        boolean boolean80 = node76.isFalse();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node43.removeChild(node76);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node16 = node14.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) -1, node14, (int) (byte) 1, (int) '#');
        boolean boolean20 = node9.hasChild(node19);
        boolean boolean21 = node19.isVar();
        boolean boolean22 = node19.isTypeOf();
        boolean boolean23 = node19.isAssignAdd();
        com.google.javascript.rhino.Node node24 = node19.removeFirstChild();
        com.google.javascript.rhino.Node node25 = node19.getLastSibling();
        boolean boolean26 = node25.isSwitch();
        node25.setOptionalArg(true);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node32.setCharno(1);
        boolean boolean35 = node32.isRegExp();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node42 = node40.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((int) (byte) -1, node40, (int) (byte) 1, (int) '#');
        boolean boolean46 = node40.isDo();
        boolean boolean47 = node40.isDefaultCase();
        node40.setQuotedString();
        com.google.javascript.rhino.Node node49 = node32.useSourceInfoFromForTree(node40);
        node40.putIntProp((int) (byte) 100, (int) (byte) 0);
        boolean boolean53 = node40.isVarArgs();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean58 = node57.isThrow();
        java.lang.String str62 = node57.toString(true, false, true);
        node57.setIsSyntheticBlock(true);
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(53, "OR 51");
        boolean boolean68 = node67.isLabel();
        java.util.Set<java.lang.String> strSet69 = node67.getDirectives();
        java.lang.Object obj71 = node67.getProp(44);
        node67.setSourceEncodedPosition(8);
        node57.addChildrenToBack(node67);
        boolean boolean75 = node40.isEquivalentTo(node67);
        boolean boolean76 = node67.isUnscopedQualifiedName();
        boolean boolean77 = node67.isNE();
        java.lang.String str78 = node67.getSourceFileName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node25.removeChild(node67);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        com.google.javascript.rhino.Node[] nodeArray7 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((int) (short) 10, nodeArray7);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(29, nodeArray7);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (short) 1, nodeArray7);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(38, nodeArray7, 23, (int) (byte) 100);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(30, nodeArray7);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(49, nodeArray7, 151562, 46);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(10, nodeArray7, (int) (byte) 0, 0);
        java.lang.Object obj22 = node20.getProp(1);
        boolean boolean23 = node20.isWith();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node25 = node20.getChildAtIndex(15);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("STRING  0 [quoted: 1]\n");
        node1.setLineno(31);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile4 = node1.getStaticSourceFile();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile5 = node1.getStaticSourceFile();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(0, 2, 48);
        int int10 = node9.getType();
        boolean boolean11 = node9.isLabelName();
        boolean boolean12 = node1.hasChild(node9);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("", 0, 10);
        int int17 = node16.getType();
        int int18 = node16.getCharno();
        boolean boolean19 = node16.isObjectLit();
        boolean boolean20 = node16.isString();
        com.google.javascript.rhino.Node node21 = node1.copyInformationFrom(node16);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(39, "BITXOR");
        node24.setVarArgs(false);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node29 = node24.copyInformationFrom(node28);
        com.google.javascript.rhino.Node node30 = node21.useSourceInfoIfMissingFrom(node24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node32 = node30.getChildAtIndex((int) 'a');
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(6);
        boolean boolean2 = node1.hasMoreThanOneChild();
        boolean boolean3 = node1.isLabelName();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean9 = node8.isThrow();
        boolean boolean10 = node8.isSwitch();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node17 = node15.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (byte) -1, node15, (int) (byte) 1, (int) '#');
        boolean boolean21 = node15.isDo();
        boolean boolean22 = node15.isDefaultCase();
        node15.setQuotedString();
        boolean boolean24 = node15.isDec();
        boolean boolean25 = node15.isLabel();
        boolean boolean26 = node15.isSetterDef();
        boolean boolean27 = node15.isRegExp();
        boolean boolean28 = node15.isName();
        boolean boolean29 = node15.isVoid();
        com.google.javascript.rhino.Node node30 = node15.cloneNode();
        com.google.javascript.rhino.Node node31 = node8.useSourceInfoIfMissingFrom(node30);
        java.lang.String[] strArray34 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        java.lang.String[] strArray39 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        boolean boolean42 = strSet35.addAll((java.util.Collection<java.lang.String>) strList40);
        com.google.javascript.rhino.JSDocInfo jSDocInfo43 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str44 = jSDocInfo43.getVersion();
        java.lang.String str45 = jSDocInfo43.getFileOverview();
        boolean boolean46 = jSDocInfo43.shouldPreserveTry();
        java.util.Set<java.lang.String> strSet47 = jSDocInfo43.getParameterNames();
        boolean boolean48 = strSet35.retainAll((java.util.Collection<java.lang.String>) strSet47);
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node55 = node53.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node((int) (byte) -1, node53, (int) (byte) 1, (int) '#');
        boolean boolean59 = node53.isDo();
        boolean boolean60 = node53.isDefaultCase();
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node71 = node69.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node74 = new com.google.javascript.rhino.Node((int) (byte) -1, node69, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node79 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node81 = node79.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node84 = new com.google.javascript.rhino.Node((int) (byte) -1, node79, (int) (byte) 1, (int) '#');
        boolean boolean85 = node74.hasChild(node84);
        int int86 = node74.getCharno();
        com.google.javascript.rhino.Node node87 = node64.useSourceInfoIfMissingFrom(node74);
        int int88 = node64.getSourcePosition();
        java.lang.String str89 = node64.toString();
        int int90 = node53.getIndexOfChild(node64);
        boolean boolean91 = strSet35.equals((java.lang.Object) node53);
        boolean boolean92 = node53.isCatch();
        com.google.javascript.rhino.Node node93 = node8.useSourceInfoFrom(node53);
        com.google.javascript.rhino.Node node96 = new com.google.javascript.rhino.Node((int) '4', node8, 4131, 30);
        node96.setVarArgs(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node96);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(8, "STRING  0 [quoted: 1]\n");
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node9 = node7.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (byte) -1, node7, (int) (byte) 1, (int) '#');
        boolean boolean13 = node7.isDo();
        boolean boolean14 = node7.isDefaultCase();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node25 = node23.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (byte) -1, node23, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node35 = node33.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((int) (byte) -1, node33, (int) (byte) 1, (int) '#');
        boolean boolean39 = node28.hasChild(node38);
        int int40 = node28.getCharno();
        com.google.javascript.rhino.Node node41 = node18.useSourceInfoIfMissingFrom(node28);
        int int42 = node18.getSourcePosition();
        java.lang.String str43 = node18.toString();
        int int44 = node7.getIndexOfChild(node18);
        int int45 = node2.getIndexOfChild(node18);
        com.google.javascript.rhino.JSDocInfo jSDocInfo46 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str47 = jSDocInfo46.getVersion();
        boolean boolean48 = jSDocInfo46.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet49 = jSDocInfo46.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList50 = jSDocInfo46.getImplementedInterfaces();
        java.lang.String str51 = jSDocInfo46.toString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression53 = jSDocInfo46.getParameterType("STRING  0");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression54 = jSDocInfo46.getTypedefType();
        node2.setJSDocInfo(jSDocInfo46);
        boolean boolean56 = node2.isReturn();
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newNumber((double) 4095, 100, (int) (short) 1);
        double double61 = node60.getDouble();
        boolean boolean62 = node60.isAdd();
        com.google.javascript.rhino.Node node63 = node60.cloneNode();
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node67.setCharno(1);
        java.util.Set<java.lang.String> strSet70 = node67.getDirectives();
        node67.setLength(0);
        com.google.javascript.rhino.Node node73 = node60.useSourceInfoIfMissingFrom(node67);
        boolean boolean74 = node60.wasEmptyNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.removeChild(node60);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node4.setCharno(1);
        boolean boolean7 = node4.isRegExp();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node14 = node12.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (byte) -1, node12, (int) (byte) 1, (int) '#');
        boolean boolean18 = node12.isDo();
        boolean boolean19 = node12.isDefaultCase();
        node12.setQuotedString();
        com.google.javascript.rhino.Node node21 = node4.useSourceInfoFromForTree(node12);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node25.setCharno(1);
        java.util.Set<java.lang.String> strSet28 = node25.getDirectives();
        node25.setLength(0);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node37 = node35.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (byte) -1, node35, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(0, node21, node25, node40, (int) 'a', (int) (short) 0);
        node21.removeProp(53);
        java.lang.String str46 = node21.toStringTree();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder47 = node21.getJsDocBuilderForNode();
        boolean boolean49 = node21.getBooleanProp((int) (byte) 1);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node56 = node54.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node((int) (byte) -1, node54, (int) (byte) 1, (int) '#');
        boolean boolean60 = node54.isDo();
        boolean boolean61 = node54.isDefaultCase();
        node54.setQuotedString();
        boolean boolean63 = node54.isDec();
        boolean boolean64 = node54.isLabel();
        boolean boolean65 = node54.isSetterDef();
        boolean boolean66 = node54.isRegExp();
        boolean boolean67 = node54.isDebugger();
        int int68 = node54.getSourcePosition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node69 = node21.getChildBefore(node54);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        java.lang.String[] strArray3 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet4 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet4, strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        boolean boolean11 = strSet4.addAll((java.util.Collection<java.lang.String>) strList9);
        boolean boolean13 = strSet4.remove((java.lang.Object) 1L);
        java.lang.String[] strArray16 = new java.lang.String[] { "STRING  0", "STRING  0" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        boolean boolean20 = strSet17.add("STRING  0");
        java.lang.String[] strArray23 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        boolean boolean31 = strSet24.addAll((java.util.Collection<java.lang.String>) strList29);
        boolean boolean32 = strSet17.containsAll((java.util.Collection<java.lang.String>) strList29);
        boolean boolean33 = strSet4.addAll((java.util.Collection<java.lang.String>) strSet17);
        java.util.stream.Stream<java.lang.String> strStream34 = strSet17.stream();
        strSet17.clear();
        java.lang.CharSequence[] charSequenceArray38 = new java.lang.CharSequence[] { "(Node tree inequality:\nTree1:\nSTRING  0 [quoted: 1]\n\n\nTree2:\nIN\n\n\nSubtree1: STRING  0 [quoted: 1]\n\n\nSubtree2: IN\n)", "STRING  0\n" };
        java.lang.CharSequence[] charSequenceArray39 = strSet17.toArray(charSequenceArray38);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        int int45 = node44.getSourcePosition();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node56 = node54.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node((int) (byte) -1, node54, (int) (byte) 1, (int) '#');
        boolean boolean60 = node54.isScript();
        node54.setQuotedString();
        com.google.javascript.rhino.Node node62 = node49.srcrefTree(node54);
        boolean boolean63 = node62.isIf();
        com.google.javascript.rhino.Node node64 = node62.getParent();
        node62.removeProp((int) 'a');
        int int67 = node62.getLineno();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString(35, "OR 1", (int) (short) 0, 45);
        com.google.javascript.rhino.Node node73 = node72.removeFirstChild();
        com.google.javascript.rhino.Node[] nodeArray74 = new com.google.javascript.rhino.Node[] { node44, node62, node72 };
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node(50, nodeArray74, 4095, (int) (short) 0);
        com.google.javascript.rhino.Node[] nodeArray78 = strSet17.toArray(nodeArray74);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node81 = new com.google.javascript.rhino.Node(45, nodeArray74, (int) (short) 0, (int) 'a');
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean4 = node3.isThrow();
        java.lang.String str8 = node3.toString(true, false, true);
        java.lang.String str9 = node3.getQualifiedName();
        boolean boolean10 = node3.isNull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node12 = node3.getChildAtIndex(12);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(51);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder2 = node1.new FileLevelJsDocBuilder();
        java.lang.String str3 = node1.toStringTree();
        boolean boolean4 = node1.isQualifiedName();
        node1.setSourceEncodedPosition(12);
        boolean boolean7 = node1.hasOneChild();
        boolean boolean8 = node1.hasChildren();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node19 = node17.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (byte) -1, node17, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node29 = node27.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (byte) -1, node27, (int) (byte) 1, (int) '#');
        boolean boolean33 = node22.hasChild(node32);
        int int34 = node22.getCharno();
        com.google.javascript.rhino.Node node35 = node12.useSourceInfoIfMissingFrom(node22);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node40 = node12.srcref(node39);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean45 = node44.isFromExterns();
        boolean boolean46 = node40.hasChild(node44);
        boolean boolean47 = node44.isOr();
        boolean boolean48 = node44.wasEmptyNode();
        com.google.javascript.rhino.Node node49 = node44.removeChildren();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder50 = node44.getJsDocBuilderForNode();
        boolean boolean51 = node44.isObjectLit();
        boolean boolean52 = node44.isSwitch();
        node44.removeProp(49);
        boolean boolean55 = node44.isSyntheticBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node44);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node20 = node18.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (byte) -1, node18, (int) (byte) 1, (int) '#');
        boolean boolean24 = node13.hasChild(node23);
        int int25 = node13.getCharno();
        com.google.javascript.rhino.Node node26 = node3.useSourceInfoIfMissingFrom(node13);
        boolean boolean27 = node26.isArrayLit();
        node26.setLineno(4131);
        node26.setCharno((int) '4');
        boolean boolean32 = node26.isParamList();
        boolean boolean33 = node26.wasEmptyNode();
        boolean boolean34 = node26.isOnlyModifiesThisCall();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node36 = node26.getChildAtIndex((int) '#');
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        java.lang.String[] strArray3 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet4 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet4, strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        boolean boolean11 = strSet4.addAll((java.util.Collection<java.lang.String>) strList9);
        boolean boolean13 = strSet4.remove((java.lang.Object) 1L);
        java.lang.String[] strArray16 = new java.lang.String[] { "STRING  0", "STRING  0" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        boolean boolean20 = strSet17.add("STRING  0");
        java.lang.String[] strArray23 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        boolean boolean31 = strSet24.addAll((java.util.Collection<java.lang.String>) strList29);
        boolean boolean32 = strSet17.containsAll((java.util.Collection<java.lang.String>) strList29);
        boolean boolean33 = strSet4.addAll((java.util.Collection<java.lang.String>) strSet17);
        java.util.stream.Stream<java.lang.String> strStream34 = strSet17.stream();
        strSet17.clear();
        java.lang.CharSequence[] charSequenceArray38 = new java.lang.CharSequence[] { "(Node tree inequality:\nTree1:\nSTRING  0 [quoted: 1]\n\n\nTree2:\nIN\n\n\nSubtree1: STRING  0 [quoted: 1]\n\n\nSubtree2: IN\n)", "STRING  0\n" };
        java.lang.CharSequence[] charSequenceArray39 = strSet17.toArray(charSequenceArray38);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        int int45 = node44.getSourcePosition();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node56 = node54.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node((int) (byte) -1, node54, (int) (byte) 1, (int) '#');
        boolean boolean60 = node54.isScript();
        node54.setQuotedString();
        com.google.javascript.rhino.Node node62 = node49.srcrefTree(node54);
        boolean boolean63 = node62.isIf();
        com.google.javascript.rhino.Node node64 = node62.getParent();
        node62.removeProp((int) 'a');
        int int67 = node62.getLineno();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString(35, "OR 1", (int) (short) 0, 45);
        com.google.javascript.rhino.Node node73 = node72.removeFirstChild();
        com.google.javascript.rhino.Node[] nodeArray74 = new com.google.javascript.rhino.Node[] { node44, node62, node72 };
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node(50, nodeArray74, 4095, (int) (short) 0);
        com.google.javascript.rhino.Node[] nodeArray78 = strSet17.toArray(nodeArray74);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node81 = new com.google.javascript.rhino.Node(19, nodeArray74, (int) (byte) 10, 42);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (short) -1);
        int int2 = node1.getChildCount();
        boolean boolean3 = node1.isNull();
        boolean boolean4 = node1.isAssign();
        java.lang.String str5 = node1.toStringTree();
        node1.setSourceFileForTesting("Node tree inequality:\nTree1:\nNUMBER 4095.0 100\n\n\nTree2:\nNUMBER 4095.0 100\n    INSTANCEOF\n        STRING  0\n\n\nSubtree1: NUMBER 4095.0 100\n\n\nSubtree2: NUMBER 4095.0 100\n    INSTANCEOF\n        STRING  0\n");
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node18 = node16.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) (byte) -1, node16, (int) (byte) 1, (int) '#');
        boolean boolean22 = node16.isScript();
        com.google.javascript.rhino.Node node23 = node16.detachFromParent();
        node23.setOptionalArg(false);
        boolean boolean27 = node23.getBooleanProp(31);
        com.google.javascript.rhino.Node node28 = node11.copyInformationFrom(node23);
        boolean boolean29 = node28.isLabel();
        com.google.javascript.rhino.InputId inputId30 = node28.getInputId();
        java.lang.String str31 = node28.getString();
        com.google.javascript.rhino.jstype.JSType jSType32 = node28.getJSType();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node39 = node37.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((int) (byte) -1, node37, (int) (byte) 1, (int) '#');
        boolean boolean43 = node37.isScript();
        com.google.javascript.rhino.InputId inputId44 = node37.getInputId();
        boolean boolean45 = node37.isDelProp();
        boolean boolean46 = node37.isBlock();
        boolean boolean47 = node37.isQuotedString();
        boolean boolean48 = node37.isTrue();
        com.google.javascript.rhino.Node node49 = node28.srcref(node37);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node50 = node1.getChildBefore(node28);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        boolean boolean10 = node4.isDo();
        boolean boolean11 = node4.isDefaultCase();
        node4.setQuotedString();
        boolean boolean13 = node4.isDec();
        boolean boolean14 = node4.isLabel();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable15 = node4.siblings();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(51);
        java.lang.String str18 = node4.checkTreeEquals(node17);
        boolean boolean19 = node4.isOr();
        boolean boolean20 = node4.isNull();
        java.util.Set<java.lang.String> strSet21 = node4.getDirectives();
        java.lang.Object obj23 = node4.getProp(52);
        boolean boolean24 = node4.isNew();
        boolean boolean25 = node4.isDec();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node27 = node4.getChildAtIndex(46);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean4 = node3.isThrow();
        java.lang.String str8 = node3.toString(true, false, true);
        java.lang.String str9 = node3.getQualifiedName();
        boolean boolean10 = node3.isIn();
        com.google.javascript.rhino.Node node11 = node3.cloneTree();
        boolean boolean12 = node11.isUnscopedQualifiedName();
        boolean boolean13 = node11.isTry();
        boolean boolean14 = node11.isQuotedString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node16 = node11.getChildAtIndex(53);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean4 = node3.isThrow();
        java.lang.String str8 = node3.toString(true, false, true);
        int int10 = node3.getIntProp(51);
        node3.addSuppression("STRING  0 [quoted: 1]\n");
        node3.setSourceEncodedPositionForTree(3);
        boolean boolean15 = node3.isNoSideEffectsCall();
        int int16 = node3.getType();
        java.lang.String str17 = node3.getQualifiedName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node19 = node3.getChildAtIndex(4131);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(52, 0, 43);
        boolean boolean4 = node3.isNumber();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node15 = node13.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (byte) -1, node13, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node25 = node23.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (byte) -1, node23, (int) (byte) 1, (int) '#');
        boolean boolean29 = node18.hasChild(node28);
        int int30 = node18.getCharno();
        com.google.javascript.rhino.Node node31 = node8.useSourceInfoIfMissingFrom(node18);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node36 = node8.srcref(node35);
        boolean boolean37 = node36.isDefaultCase();
        boolean boolean38 = node36.isCall();
        boolean boolean39 = node36.isObjectLit();
        java.lang.String str40 = node3.checkTreeEquals(node36);
        boolean boolean41 = node3.isNew();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node48 = node46.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node((int) (byte) -1, node46, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node58 = node56.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node((int) (byte) -1, node56, (int) (byte) 1, (int) '#');
        boolean boolean62 = node51.hasChild(node61);
        boolean boolean63 = node61.isVar();
        boolean boolean64 = node61.isTypeOf();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable65 = node61.children();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable66 = node61.siblings();
        node61.putBooleanProp(16, false);
        com.google.javascript.rhino.Node node70 = node3.copyInformationFromForTree(node61);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node72 = node61.getChildAtIndex(41);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node3.setCharno(1);
        boolean boolean6 = node3.isRegExp();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node13 = node11.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (byte) -1, node11, (int) (byte) 1, (int) '#');
        boolean boolean17 = node11.isDo();
        boolean boolean18 = node11.isDefaultCase();
        node11.setQuotedString();
        com.google.javascript.rhino.Node node20 = node3.useSourceInfoFromForTree(node11);
        node11.putIntProp((int) (byte) 100, (int) (byte) 0);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node30 = node28.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((int) (byte) -1, node28, (int) (byte) 1, (int) '#');
        boolean boolean34 = node28.isScript();
        com.google.javascript.rhino.InputId inputId35 = node28.getInputId();
        com.google.javascript.rhino.Node node36 = node11.useSourceInfoFrom(node28);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean41 = node40.isThrow();
        java.lang.String str45 = node40.toString(true, false, true);
        node40.setIsSyntheticBlock(true);
        boolean boolean48 = node40.isTry();
        boolean boolean49 = node11.hasChild(node40);
        boolean boolean50 = node40.isStringKey();
        node40.setType(36);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable53 = node40.children();
        boolean boolean54 = node40.isDefaultCase();
        boolean boolean55 = node40.isUnscopedQualifiedName();
        boolean boolean56 = node40.isQuotedString();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable57 = node40.getAncestors();
        com.google.javascript.rhino.Node node58 = node40.cloneNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node60 = node58.getChildAtIndex(19);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node11 = node9.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (byte) -1, node9, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node21 = node19.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (byte) -1, node19, (int) (byte) 1, (int) '#');
        boolean boolean25 = node14.hasChild(node24);
        int int26 = node14.getCharno();
        com.google.javascript.rhino.Node node27 = node4.useSourceInfoIfMissingFrom(node14);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node34 = node32.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) -1, node32, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node44 = node42.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((int) (byte) -1, node42, (int) (byte) 1, (int) '#');
        boolean boolean48 = node37.hasChild(node47);
        boolean boolean49 = node47.isVar();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node((-1), node14, node47);
        boolean boolean51 = node14.isAssignAdd();
        com.google.javascript.rhino.Node node52 = node14.removeFirstChild();
        node52.setVarArgs(true);
        node52.detachChildren();
        java.util.Set<java.lang.String> strSet56 = node52.getDirectives();
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean61 = node60.isThrow();
        java.lang.String str65 = node60.toString(true, false, true);
        java.lang.String str66 = node60.getQualifiedName();
        boolean boolean67 = node60.isIn();
        com.google.javascript.rhino.Node node68 = node60.cloneTree();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node72.setCharno(1);
        java.util.Set<java.lang.String> strSet75 = node72.getDirectives();
        boolean boolean76 = node72.isHook();
        node68.addChildToFront(node72);
        boolean boolean78 = node68.isNE();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable79 = node68.siblings();
        com.google.javascript.rhino.Node node80 = node52.useSourceInfoFrom(node68);
        boolean boolean81 = node68.isBreak();
        boolean boolean82 = node68.isDelProp();
        com.google.javascript.rhino.Node node86 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node86.setCharno(1);
        java.util.Set<java.lang.String> strSet89 = node86.getDirectives();
        node86.setCharno((int) (short) -1);
        node86.setVarArgs(true);
        boolean boolean94 = node86.isQualifiedName();
        com.google.javascript.rhino.Node node95 = node68.useSourceInfoIfMissingFromForTree(node86);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node97 = node86.getChildAtIndex(48);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(49);
        node1.setWasEmptyNode(true);
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) 5);
        boolean boolean6 = node5.isNew();
        int int7 = node5.getLength();
        int int8 = node5.getLineno();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("Node tree inequality:\nTree1:\nOR 0\n\n\nTree2:\nSTRING  0 [quoted: 1]\n\n\nSubtree1: OR 0\n\n\nSubtree2: STRING  0 [quoted: 1]\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.replaceChild(node5, node10);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node3.setCharno(1);
        com.google.javascript.rhino.Node node6 = node3.cloneNode();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node13 = node11.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (byte) -1, node11, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node23 = node21.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (byte) -1, node21, (int) (byte) 1, (int) '#');
        boolean boolean27 = node16.hasChild(node26);
        boolean boolean28 = node26.isVar();
        boolean boolean29 = node26.isTypeOf();
        boolean boolean30 = node26.isAssignAdd();
        boolean boolean31 = node26.isStringKey();
        node26.setOptionalArg(true);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean39 = node38.isFromExterns();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(39, node38, (int) '4', 51);
        boolean boolean43 = node38.isIn();
        boolean boolean44 = node26.isEquivalentTo(node38);
        boolean boolean45 = node26.isCase();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node56 = node54.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node((int) (byte) -1, node54, (int) (byte) 1, (int) '#');
        boolean boolean60 = node54.isScript();
        node54.setQuotedString();
        com.google.javascript.rhino.Node node62 = node49.srcrefTree(node54);
        boolean boolean63 = node54.isBreak();
        com.google.javascript.rhino.Node node64 = node26.useSourceInfoFrom(node54);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node65 = node3.getChildBefore(node54);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        java.lang.String[] strArray3 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet4 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet4, strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        boolean boolean11 = strSet4.addAll((java.util.Collection<java.lang.String>) strList9);
        boolean boolean13 = strSet4.remove((java.lang.Object) 1L);
        java.lang.String[] strArray16 = new java.lang.String[] { "STRING  0", "STRING  0" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        boolean boolean20 = strSet17.add("STRING  0");
        java.lang.String[] strArray23 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        boolean boolean31 = strSet24.addAll((java.util.Collection<java.lang.String>) strList29);
        boolean boolean32 = strSet17.containsAll((java.util.Collection<java.lang.String>) strList29);
        boolean boolean33 = strSet4.addAll((java.util.Collection<java.lang.String>) strSet17);
        java.util.stream.Stream<java.lang.String> strStream34 = strSet17.stream();
        strSet17.clear();
        java.lang.CharSequence[] charSequenceArray38 = new java.lang.CharSequence[] { "(Node tree inequality:\nTree1:\nSTRING  0 [quoted: 1]\n\n\nTree2:\nIN\n\n\nSubtree1: STRING  0 [quoted: 1]\n\n\nSubtree2: IN\n)", "STRING  0\n" };
        java.lang.CharSequence[] charSequenceArray39 = strSet17.toArray(charSequenceArray38);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        int int45 = node44.getSourcePosition();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node56 = node54.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node((int) (byte) -1, node54, (int) (byte) 1, (int) '#');
        boolean boolean60 = node54.isScript();
        node54.setQuotedString();
        com.google.javascript.rhino.Node node62 = node49.srcrefTree(node54);
        boolean boolean63 = node62.isIf();
        com.google.javascript.rhino.Node node64 = node62.getParent();
        node62.removeProp((int) 'a');
        int int67 = node62.getLineno();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString(35, "OR 1", (int) (short) 0, 45);
        com.google.javascript.rhino.Node node73 = node72.removeFirstChild();
        com.google.javascript.rhino.Node[] nodeArray74 = new com.google.javascript.rhino.Node[] { node44, node62, node72 };
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node(50, nodeArray74, 4095, (int) (short) 0);
        com.google.javascript.rhino.Node[] nodeArray78 = strSet17.toArray(nodeArray74);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node79 = new com.google.javascript.rhino.Node((int) 'a', nodeArray74);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(51);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder2 = node1.new FileLevelJsDocBuilder();
        java.lang.String str3 = node1.toStringTree();
        boolean boolean4 = node1.isQualifiedName();
        node1.setSourceEncodedPosition(12);
        node1.setLineno(5);
        boolean boolean9 = node1.isLabel();
        boolean boolean10 = node1.isNumber();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = node1.getJSDocInfo();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node22 = node20.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (byte) -1, node20, (int) (byte) 1, (int) '#');
        boolean boolean26 = node20.isScript();
        com.google.javascript.rhino.Node node27 = node20.detachFromParent();
        node27.setOptionalArg(false);
        boolean boolean31 = node27.getBooleanProp(31);
        com.google.javascript.rhino.Node node32 = node15.copyInformationFrom(node27);
        boolean boolean33 = node32.isLabel();
        com.google.javascript.rhino.InputId inputId34 = node32.getInputId();
        boolean boolean35 = node32.isFromExterns();
        boolean boolean36 = node32.isHook();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node37 = node1.getChildBefore(node32);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(50, "((Node tree inequality:\nTree1:\nNUMBER 4095.0 100\n\n\nTree2:\nNUMBER 4095.0 100\n    INSTANCEOF\n        STRING  0\n\n\nSubtree1: NUMBER 4095.0 100\n\n\nSubtree2: NUMBER 4095.0 100\n    INSTANCEOF\n        STRING  0\n))", (int) (byte) 0, 48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (short) 100);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        boolean boolean10 = node4.isDo();
        boolean boolean11 = node4.isDefaultCase();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node22 = node20.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (byte) -1, node20, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node32 = node30.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) (byte) -1, node30, (int) (byte) 1, (int) '#');
        boolean boolean36 = node25.hasChild(node35);
        int int37 = node25.getCharno();
        com.google.javascript.rhino.Node node38 = node15.useSourceInfoIfMissingFrom(node25);
        int int39 = node15.getSourcePosition();
        java.lang.String str40 = node15.toString();
        int int41 = node4.getIndexOfChild(node15);
        int int42 = node15.getChildCount();
        boolean boolean43 = node15.isOr();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node45 = node15.getChildAtIndex((int) ' ');
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList4 = jSDocInfo0.getImplementedInterfaces();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean9 = node8.isThrow();
        java.lang.String str13 = node8.toString(true, false, true);
        jSDocInfo0.setAssociatedNode(node8);
        boolean boolean15 = jSDocInfo0.hasTypedefType();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node26 = node24.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (byte) -1, node24, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node36 = node34.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((int) (byte) -1, node34, (int) (byte) 1, (int) '#');
        boolean boolean40 = node29.hasChild(node39);
        int int41 = node29.getCharno();
        com.google.javascript.rhino.Node node42 = node19.useSourceInfoIfMissingFrom(node29);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node47 = node19.srcref(node46);
        jSDocInfo0.setAssociatedNode(node19);
        node19.setLineno(47);
        int int51 = node19.getChildCount();
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node55.setCharno(1);
        java.util.Set<java.lang.String> strSet58 = node55.getDirectives();
        node55.setCharno((int) (short) -1);
        node55.setVarArgs(true);
        com.google.javascript.rhino.Node node63 = node19.useSourceInfoFrom(node55);
        java.lang.String str64 = node63.toString();
        node63.setCharno(36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node68 = node63.getChildAtIndex(17);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(49, (int) (byte) 0, (int) (short) 0);
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(40, node4);
        com.google.javascript.rhino.Node node6 = node5.getFirstChild();
        node6.setSourceEncodedPositionForTree(49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node10 = node6.getChildAtIndex((int) '#');
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        boolean boolean10 = node4.isDo();
        boolean boolean11 = node4.isDefaultCase();
        node4.setQuotedString();
        boolean boolean13 = node4.isDec();
        boolean boolean14 = node4.isLabel();
        boolean boolean15 = node4.isSetterDef();
        boolean boolean16 = node4.isRegExp();
        boolean boolean17 = node4.isName();
        boolean boolean18 = node4.isVoid();
        boolean boolean19 = node4.isStringKey();
        boolean boolean20 = node4.isTypeOf();
        boolean boolean21 = node4.isCall();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node23 = node4.getChildAtIndex(4095);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.JSType jSType2 = node1.getJSType();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node9 = node7.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (byte) -1, node7, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node19 = node17.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (byte) -1, node17, (int) (byte) 1, (int) '#');
        boolean boolean23 = node12.hasChild(node22);
        boolean boolean24 = node22.isVar();
        boolean boolean25 = node22.isCase();
        boolean boolean26 = node22.isNE();
        node22.setVarArgs(false);
        com.google.javascript.rhino.Node node29 = node1.useSourceInfoFrom(node22);
        boolean boolean30 = node1.isLabel();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable31 = node1.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node33 = node1.getChildAtIndex(23);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        com.google.javascript.rhino.Node[] nodeArray7 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((int) (short) 10, nodeArray7);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(0, nodeArray7);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(2, nodeArray7);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(4, nodeArray7, 39, (int) (short) 100);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (short) 100, nodeArray7, 4111, (int) 'a');
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(36, nodeArray7);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(45, nodeArray7, 208993, 100);
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str22 = jSDocInfo21.getVersion();
        boolean boolean23 = jSDocInfo21.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet24 = jSDocInfo21.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList25 = jSDocInfo21.getImplementedInterfaces();
        boolean boolean26 = jSDocInfo21.hasReturnType();
        boolean boolean27 = jSDocInfo21.hasBaseType();
        boolean boolean28 = jSDocInfo21.isNoCompile();
        java.lang.String str29 = jSDocInfo21.getOriginalCommentString();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node36 = node34.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((int) (byte) -1, node34, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node46 = node44.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((int) (byte) -1, node44, (int) (byte) 1, (int) '#');
        boolean boolean50 = node39.hasChild(node49);
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString(49, "STRING  0\n");
        com.google.javascript.rhino.Node node54 = node39.clonePropsFrom(node53);
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node65 = node63.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node((int) (byte) -1, node63, (int) (byte) 1, (int) '#');
        boolean boolean69 = node63.isScript();
        com.google.javascript.rhino.Node node70 = node63.detachFromParent();
        node70.setOptionalArg(false);
        boolean boolean74 = node70.getBooleanProp(31);
        com.google.javascript.rhino.Node node75 = node58.copyInformationFrom(node70);
        boolean boolean76 = node75.isLabel();
        com.google.javascript.rhino.Node node77 = node53.useSourceInfoIfMissingFrom(node75);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder78 = node53.new FileLevelJsDocBuilder();
        boolean boolean79 = node53.isNE();
        jSDocInfo21.setAssociatedNode(node53);
        boolean boolean81 = node53.isNot();
        int int82 = node53.getChildCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node83 = node20.getChildBefore(node53);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node3.setCharno(1);
        boolean boolean6 = node3.isRegExp();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node13 = node11.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (byte) -1, node11, (int) (byte) 1, (int) '#');
        boolean boolean17 = node11.isDo();
        boolean boolean18 = node11.isDefaultCase();
        node11.setQuotedString();
        com.google.javascript.rhino.Node node20 = node3.useSourceInfoFromForTree(node11);
        node11.putIntProp((int) (byte) 100, (int) (byte) 0);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node30 = node28.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((int) (byte) -1, node28, (int) (byte) 1, (int) '#');
        boolean boolean34 = node28.isScript();
        com.google.javascript.rhino.InputId inputId35 = node28.getInputId();
        com.google.javascript.rhino.Node node36 = node11.useSourceInfoFrom(node28);
        int int37 = node36.getLineno();
        boolean boolean38 = node36.hasChildren();
        boolean boolean39 = node36.isScript();
        boolean boolean40 = node36.isStringKey();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) (short) -1);
        boolean boolean43 = node42.isWith();
        node42.setDouble((double) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node46 = node36.getChildBefore(node42);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString((int) (short) 0, "false", 10, 2);
        node4.putBooleanProp(16, true);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) 4095, 100, (int) (short) 1);
        node11.removeProp(47);
        boolean boolean14 = node11.isFromExterns();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 4095, 100, (int) (short) 1);
        double double19 = node18.getDouble();
        boolean boolean20 = node18.isAdd();
        com.google.javascript.rhino.Node node21 = node18.cloneNode();
        boolean boolean22 = node21.isNE();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node34 = node32.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) -1, node32, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node44 = node42.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((int) (byte) -1, node42, (int) (byte) 1, (int) '#');
        boolean boolean48 = node37.hasChild(node47);
        int int49 = node37.getCharno();
        com.google.javascript.rhino.Node node50 = node27.useSourceInfoIfMissingFrom(node37);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node55 = node27.srcref(node54);
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean60 = node59.isFromExterns();
        boolean boolean61 = node55.hasChild(node59);
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node(52, node59);
        node21.addChildToBack(node62);
        java.lang.String str64 = node11.checkTreeEquals(node21);
        boolean boolean65 = node21.isDebugger();
        int int66 = node21.getType();
        boolean boolean68 = node21.getBooleanProp(39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.removeChild(node21);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        boolean boolean10 = node4.isDo();
        boolean boolean11 = node4.isDefaultCase();
        node4.setQuotedString();
        boolean boolean13 = node4.isDec();
        boolean boolean14 = node4.isLabel();
        boolean boolean15 = node4.isSetterDef();
        boolean boolean16 = node4.isRegExp();
        boolean boolean17 = node4.isName();
        boolean boolean18 = node4.isVoid();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node25 = node23.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (byte) -1, node23, (int) (byte) 1, (int) '#');
        boolean boolean29 = node23.isDo();
        com.google.javascript.rhino.Node node30 = node4.useSourceInfoIfMissingFrom(node23);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node37 = node35.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (byte) -1, node35, (int) (byte) 1, (int) '#');
        int int41 = node40.getType();
        boolean boolean42 = node40.isFor();
        node23.addChildToFront(node40);
        java.lang.String str44 = node23.getQualifiedName();
        com.google.javascript.rhino.Node node45 = node23.cloneTree();
        boolean boolean46 = node45.isLabel();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean51 = node50.isThrow();
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean56 = node55.isThrow();
        java.lang.String str60 = node55.toString(true, false, true);
        java.lang.String str61 = node55.getQualifiedName();
        boolean boolean62 = node55.isIn();
        com.google.javascript.rhino.Node node63 = node55.cloneTree();
        boolean boolean64 = node63.isRegExp();
        boolean boolean65 = node63.isDebugger();
        node50.addChildToBack(node63);
        boolean boolean67 = node63.hasMoreThanOneChild();
        boolean boolean68 = node63.isSyntheticBlock();
        java.lang.String str69 = node45.checkTreeEquals(node63);
        boolean boolean70 = node45.isHook();
        boolean boolean71 = node45.wasEmptyNode();
        java.lang.String str72 = node45.getQualifiedName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node74 = node45.getChildAtIndex(213002);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        boolean boolean10 = node4.isDo();
        boolean boolean11 = node4.isDefaultCase();
        node4.setQuotedString();
        boolean boolean13 = node4.isDec();
        boolean boolean14 = node4.isLabel();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable15 = node4.siblings();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable16 = node4.getAncestors();
        boolean boolean17 = node4.isNoSideEffectsCall();
        java.lang.String str18 = node4.toString();
        com.google.javascript.rhino.Node node19 = node4.cloneNode();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(5, "(STRING  0\n)", 30, 35);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node31 = node29.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((int) (byte) -1, node29, (int) (byte) 1, (int) '#');
        boolean boolean35 = node29.isDo();
        boolean boolean36 = node29.isDefaultCase();
        node29.setQuotedString();
        boolean boolean38 = node29.isDec();
        boolean boolean39 = node29.hasMoreThanOneChild();
        boolean boolean40 = node29.isUnscopedQualifiedName();
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str42 = jSDocInfo41.getVersion();
        boolean boolean43 = jSDocInfo41.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet44 = jSDocInfo41.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList45 = jSDocInfo41.getImplementedInterfaces();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean50 = node49.isThrow();
        java.lang.String str54 = node49.toString(true, false, true);
        jSDocInfo41.setAssociatedNode(node49);
        int int57 = node49.getIntProp((int) (byte) 10);
        node49.setSourceEncodedPositionForTree(15);
        node49.setLineno(1);
        com.google.javascript.rhino.Node node62 = node29.copyInformationFromForTree(node49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.replaceChild(node24, node49);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean5 = node4.isThrow();
        java.lang.String str9 = node4.toString(true, false, true);
        java.lang.String str10 = node4.getQualifiedName();
        boolean boolean11 = node4.isIn();
        com.google.javascript.rhino.Node node12 = node4.cloneTree();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node19 = node17.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (byte) -1, node17, (int) (byte) 1, (int) '#');
        boolean boolean23 = node17.isScript();
        com.google.javascript.rhino.Node node24 = node17.detachFromParent();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node28.setCharno(1);
        java.util.Set<java.lang.String> strSet31 = node28.getDirectives();
        boolean boolean32 = node28.isHook();
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node43 = node41.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((int) (byte) -1, node41, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node53 = node51.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((int) (byte) -1, node51, (int) (byte) 1, (int) '#');
        boolean boolean57 = node46.hasChild(node56);
        int int58 = node46.getCharno();
        com.google.javascript.rhino.Node node59 = node36.useSourceInfoIfMissingFrom(node46);
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node64 = node36.srcref(node63);
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node(4095, node12, node24, node28, node36);
        com.google.javascript.rhino.Node node66 = node12.cloneTree();
        node66.setCharno((-1));
        java.lang.Object obj70 = node66.getProp((int) (short) 0);
        boolean boolean71 = node66.isDo();
        boolean boolean72 = node66.isDelProp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node74 = node66.getChildAtIndex(4131);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node20 = node18.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (byte) -1, node18, (int) (byte) 1, (int) '#');
        boolean boolean24 = node13.hasChild(node23);
        int int25 = node13.getCharno();
        com.google.javascript.rhino.Node node26 = node3.useSourceInfoIfMissingFrom(node13);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node31 = node3.srcref(node30);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean36 = node35.isFromExterns();
        boolean boolean37 = node31.hasChild(node35);
        boolean boolean38 = node35.isOr();
        boolean boolean39 = node35.wasEmptyNode();
        com.google.javascript.rhino.Node node40 = node35.removeChildren();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder41 = node35.getJsDocBuilderForNode();
        int int42 = node35.getChildCount();
        boolean boolean43 = node35.isAnd();
        int int45 = node35.getIntProp(42);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("Not declared as a type name", 47, (int) (short) 0);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node56 = node54.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node((int) (byte) -1, node54, (int) (byte) 1, (int) '#');
        boolean boolean60 = node54.isDo();
        boolean boolean61 = node54.isDefaultCase();
        node54.setQuotedString();
        boolean boolean63 = node54.isDec();
        boolean boolean64 = node54.isTypeOf();
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean69 = node68.isThrow();
        java.lang.String str73 = node68.toString(true, false, true);
        java.lang.String str74 = node68.getQualifiedName();
        boolean boolean75 = node68.isIn();
        com.google.javascript.rhino.Node node76 = node68.cloneTree();
        com.google.javascript.rhino.Node node80 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node80.setCharno(1);
        java.util.Set<java.lang.String> strSet83 = node80.getDirectives();
        boolean boolean84 = node80.isHook();
        node76.addChildToFront(node80);
        com.google.javascript.rhino.Node node86 = node80.getLastSibling();
        java.lang.Object obj88 = node86.getProp(2);
        com.google.javascript.rhino.Node node89 = node54.useSourceInfoFrom(node86);
        node54.removeProp(10);
        com.google.javascript.rhino.Node node92 = node49.copyInformationFrom(node54);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node35.removeChild(node49);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 409601, 48, 43);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node11 = node9.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (byte) -1, node9, (int) (byte) 1, (int) '#');
        boolean boolean15 = node9.isDo();
        boolean boolean16 = node9.isDefaultCase();
        node9.setQuotedString();
        boolean boolean18 = node9.isDec();
        boolean boolean19 = node9.isLabel();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node9.siblings();
        com.google.javascript.rhino.Node node21 = node9.detachFromParent();
        node21.setLength(38);
        int int24 = node21.getChildCount();
        boolean boolean25 = node21.isLocalResultCall();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean30 = node29.isThrow();
        java.lang.String str34 = node29.toString(true, false, true);
        node29.setIsSyntheticBlock(true);
        boolean boolean37 = node29.isTry();
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(30, node21, node29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node21);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(47, "NUMBER 4095.0 100 [source_file: ERROR 1\n    STRING  0\n    STRING  0\n]\n", 41, 4131);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node16 = node14.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) -1, node14, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node26 = node24.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (byte) -1, node24, (int) (byte) 1, (int) '#');
        boolean boolean30 = node19.hasChild(node29);
        int int31 = node19.getCharno();
        com.google.javascript.rhino.Node node32 = node9.useSourceInfoIfMissingFrom(node19);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node37 = node9.srcref(node36);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean42 = node41.isFromExterns();
        boolean boolean43 = node37.hasChild(node41);
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node(52, node41);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node48.setCharno(1);
        java.util.Set<java.lang.String> strSet51 = node48.getDirectives();
        node48.setCharno((int) (short) -1);
        boolean boolean54 = node48.isRegExp();
        node41.addChildrenToFront(node48);
        boolean boolean56 = node41.isTry();
        com.google.javascript.rhino.Node node57 = node41.getLastSibling();
        boolean boolean58 = node41.isGetElem();
        boolean boolean59 = node41.isAdd();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.removeChild(node41);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(208993, "", 3, 50);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder5 = node4.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean11 = node10.isFromExterns();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(39, node10, (int) '4', 51);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(45);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node23 = node21.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (byte) -1, node21, (int) (byte) 1, (int) '#');
        boolean boolean27 = node21.isDo();
        boolean boolean28 = node21.isDefaultCase();
        node21.setQuotedString();
        boolean boolean30 = node21.isDec();
        boolean boolean31 = node21.hasMoreThanOneChild();
        boolean boolean32 = node21.isTrue();
        com.google.javascript.rhino.Node node33 = node16.useSourceInfoIfMissingFrom(node21);
        int int34 = node16.getSourceOffset();
        com.google.javascript.rhino.Node node35 = node10.srcrefTree(node16);
        boolean boolean36 = node35.isDo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node37 = node4.getChildBefore(node35);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        java.lang.String[] strArray3 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet4 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet4, strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        boolean boolean11 = strSet4.addAll((java.util.Collection<java.lang.String>) strList9);
        boolean boolean13 = strSet4.remove((java.lang.Object) 1L);
        java.lang.String[] strArray16 = new java.lang.String[] { "STRING  0", "STRING  0" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        boolean boolean20 = strSet17.add("STRING  0");
        java.lang.String[] strArray23 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        boolean boolean31 = strSet24.addAll((java.util.Collection<java.lang.String>) strList29);
        boolean boolean32 = strSet17.containsAll((java.util.Collection<java.lang.String>) strList29);
        boolean boolean33 = strSet4.addAll((java.util.Collection<java.lang.String>) strSet17);
        java.util.stream.Stream<java.lang.String> strStream34 = strSet17.stream();
        strSet17.clear();
        java.lang.CharSequence[] charSequenceArray38 = new java.lang.CharSequence[] { "(Node tree inequality:\nTree1:\nSTRING  0 [quoted: 1]\n\n\nTree2:\nIN\n\n\nSubtree1: STRING  0 [quoted: 1]\n\n\nSubtree2: IN\n)", "STRING  0\n" };
        java.lang.CharSequence[] charSequenceArray39 = strSet17.toArray(charSequenceArray38);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        int int45 = node44.getSourcePosition();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node56 = node54.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node((int) (byte) -1, node54, (int) (byte) 1, (int) '#');
        boolean boolean60 = node54.isScript();
        node54.setQuotedString();
        com.google.javascript.rhino.Node node62 = node49.srcrefTree(node54);
        boolean boolean63 = node62.isIf();
        com.google.javascript.rhino.Node node64 = node62.getParent();
        node62.removeProp((int) 'a');
        int int67 = node62.getLineno();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString(35, "OR 1", (int) (short) 0, 45);
        com.google.javascript.rhino.Node node73 = node72.removeFirstChild();
        com.google.javascript.rhino.Node[] nodeArray74 = new com.google.javascript.rhino.Node[] { node44, node62, node72 };
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node(50, nodeArray74, 4095, (int) (short) 0);
        com.google.javascript.rhino.Node[] nodeArray78 = strSet17.toArray(nodeArray74);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node81 = new com.google.javascript.rhino.Node(27, nodeArray78, 0, 27);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node11 = node9.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (byte) -1, node9, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node21 = node19.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (byte) -1, node19, (int) (byte) 1, (int) '#');
        boolean boolean25 = node14.hasChild(node24);
        int int26 = node14.getCharno();
        com.google.javascript.rhino.Node node27 = node4.useSourceInfoIfMissingFrom(node14);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node34 = node32.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) -1, node32, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node44 = node42.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((int) (byte) -1, node42, (int) (byte) 1, (int) '#');
        boolean boolean48 = node37.hasChild(node47);
        boolean boolean49 = node47.isVar();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node((-1), node14, node47);
        com.google.javascript.rhino.Node node51 = node50.getParent();
        boolean boolean52 = node50.isContinue();
        boolean boolean53 = node50.isDefaultCase();
        com.google.javascript.rhino.Node node54 = node50.cloneNode();
        int int55 = node50.getSourcePosition();
        boolean boolean56 = node50.isLabelName();
        java.util.Set<java.lang.String> strSet57 = node50.getDirectives();
        node50.setWasEmptyNode(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node61 = node50.getChildAtIndex(35);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node7 = node5.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (byte) -1, node5, (int) (byte) 1, (int) '#');
        boolean boolean11 = node5.isScript();
        com.google.javascript.rhino.Node node12 = node5.detachFromParent();
        boolean boolean13 = node5.isAssignAdd();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node28 = node26.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) (byte) -1, node26, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node38 = node36.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((int) (byte) -1, node36, (int) (byte) 1, (int) '#');
        boolean boolean42 = node31.hasChild(node41);
        int int43 = node31.getCharno();
        com.google.javascript.rhino.Node node44 = node21.useSourceInfoIfMissingFrom(node31);
        node44.setLength((int) ' ');
        node17.addChildrenToBack(node44);
        node17.setWasEmptyNode(false);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) 32);
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node58 = node56.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node((int) (byte) -1, node56, (int) (byte) 1, (int) '#');
        int int62 = node61.getType();
        boolean boolean63 = node61.isFor();
        java.lang.String str64 = node61.getQualifiedName();
        com.google.javascript.rhino.Node node67 = new com.google.javascript.rhino.Node(5, node5, node17, node51, node61, (int) (byte) 10, 39);
        boolean boolean68 = node5.isDefaultCase();
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node75 = node73.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node78 = new com.google.javascript.rhino.Node((int) (byte) -1, node73, (int) (byte) 1, (int) '#');
        boolean boolean79 = node73.isScript();
        com.google.javascript.rhino.Node node83 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node83.setCharno(1);
        java.util.Set<java.lang.String> strSet86 = node83.getDirectives();
        java.lang.String str87 = node73.checkTreeEquals(node83);
        boolean boolean88 = node73.isQualifiedName();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable89 = node73.siblings();
        boolean boolean90 = node73.isWith();
        boolean boolean91 = node73.isGetterDef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node5.removeChild(node73);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        int int10 = node9.getType();
        boolean boolean11 = node9.isDelProp();
        boolean boolean12 = node9.wasEmptyNode();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node19 = node17.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (byte) -1, node17, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node23 = node9.copyInformationFromForTree(node17);
        com.google.javascript.rhino.jstype.JSType jSType24 = node23.getJSType();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node35 = node33.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((int) (byte) -1, node33, (int) (byte) 1, (int) '#');
        boolean boolean39 = node33.isScript();
        node33.setQuotedString();
        com.google.javascript.rhino.Node node41 = node28.srcrefTree(node33);
        boolean boolean42 = node41.isNull();
        node41.setOptionalArg(false);
        com.google.javascript.rhino.Node node45 = node23.useSourceInfoFrom(node41);
        boolean boolean46 = node41.isSyntheticBlock();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node51.setCharno(1);
        boolean boolean54 = node51.isRegExp();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node61 = node59.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node((int) (byte) -1, node59, (int) (byte) 1, (int) '#');
        boolean boolean65 = node59.isDo();
        boolean boolean66 = node59.isDefaultCase();
        node59.setQuotedString();
        com.google.javascript.rhino.Node node68 = node51.useSourceInfoFromForTree(node59);
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node72.setCharno(1);
        java.util.Set<java.lang.String> strSet75 = node72.getDirectives();
        node72.setLength(0);
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node84 = node82.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node87 = new com.google.javascript.rhino.Node((int) (byte) -1, node82, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node90 = new com.google.javascript.rhino.Node(0, node68, node72, node87, (int) 'a', (int) (short) 0);
        int int91 = node68.getLineno();
        boolean boolean92 = node68.isDefaultCase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node41.removeChild(node68);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node16 = node14.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) -1, node14, (int) (byte) 1, (int) '#');
        boolean boolean20 = node9.hasChild(node19);
        boolean boolean21 = node19.isVar();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node25.setCharno(1);
        boolean boolean28 = node25.isRegExp();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node35 = node33.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((int) (byte) -1, node33, (int) (byte) 1, (int) '#');
        boolean boolean39 = node33.isDo();
        boolean boolean40 = node33.isDefaultCase();
        node33.setQuotedString();
        com.google.javascript.rhino.Node node42 = node25.useSourceInfoFromForTree(node33);
        boolean boolean43 = node42.isVarArgs();
        com.google.javascript.rhino.Node node44 = node19.useSourceInfoIfMissingFrom(node42);
        boolean boolean45 = node19.isGetProp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node47 = node19.getChildAtIndex(9);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean4 = node3.isThrow();
        java.lang.String str8 = node3.toString(true, false, true);
        boolean boolean9 = node3.isOptionalArg();
        boolean boolean10 = node3.isThrow();
        com.google.javascript.rhino.Node node11 = node3.getLastSibling();
        boolean boolean12 = node11.isTrue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node14 = node11.getChildAtIndex(48);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        java.lang.String str10 = node4.toStringTree();
        boolean boolean11 = node4.isStringKey();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node15.setCharno(1);
        java.util.Set<java.lang.String> strSet18 = node15.getDirectives();
        node15.setCharno((int) (short) -1);
        boolean boolean21 = node15.isRegExp();
        boolean boolean22 = node15.isDefaultCase();
        boolean boolean23 = node15.isBlock();
        java.lang.String str24 = node15.getString();
        com.google.javascript.rhino.Node node25 = node4.useSourceInfoFromForTree(node15);
        java.lang.Object obj27 = node25.getProp(4095);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("", 0, 10);
        int int32 = node31.getType();
        com.google.javascript.rhino.Node node33 = node31.cloneNode();
        boolean boolean34 = node31.isRegExp();
        boolean boolean35 = node31.isNew();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder36 = node31.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node37 = node31.getLastSibling();
        com.google.javascript.rhino.Node node38 = node31.cloneTree();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node39 = node25.getChildBefore(node31);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        java.lang.String[] strArray2 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        boolean boolean10 = strSet3.addAll((java.util.Collection<java.lang.String>) strList8);
        strSet3.clear();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node15.setCharno(1);
        boolean boolean18 = node15.isRegExp();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node25 = node23.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (byte) -1, node23, (int) (byte) 1, (int) '#');
        boolean boolean29 = node23.isDo();
        boolean boolean30 = node23.isDefaultCase();
        node23.setQuotedString();
        com.google.javascript.rhino.Node node32 = node15.useSourceInfoFromForTree(node23);
        node23.putIntProp((int) (byte) 100, (int) (byte) 0);
        node23.putProp((int) 'a', (java.lang.Object) "JSDocInfo");
        boolean boolean39 = node23.isInc();
        boolean boolean40 = strSet3.equals((java.lang.Object) node23);
        com.google.javascript.rhino.Node node41 = node23.cloneTree();
        boolean boolean42 = node41.isDo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node44 = node41.getChildAtIndex(4095);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(38, "true", 4095, 46);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("false", 49, (int) 'a');
        boolean boolean9 = node8.hasMoreThanOneChild();
        java.lang.String str10 = node8.getString();
        boolean boolean11 = node8.isDelProp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.removeChild(node8);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("((ERROR 1))", 35, 44);
        node3.putBooleanProp(35, true);
        java.lang.String[] strArray9 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        boolean boolean17 = strSet10.addAll((java.util.Collection<java.lang.String>) strList15);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node24 = node22.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((int) (byte) -1, node22, (int) (byte) 1, (int) '#');
        boolean boolean28 = node22.isScript();
        node22.setQuotedString();
        boolean boolean30 = strSet10.equals((java.lang.Object) node22);
        java.lang.String str31 = node22.getString();
        boolean boolean32 = node22.isOr();
        node22.putIntProp((int) '4', 45);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable36 = node22.siblings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node22);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        boolean boolean10 = node4.isScript();
        com.google.javascript.rhino.InputId inputId11 = node4.getInputId();
        boolean boolean12 = node4.isDelProp();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder13 = node4.getJsDocBuilderForNode();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str16 = jSDocInfo15.getVersion();
        boolean boolean17 = jSDocInfo15.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet18 = jSDocInfo15.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList19 = jSDocInfo15.getImplementedInterfaces();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList20 = jSDocInfo15.getThrownTypes();
        java.util.Set<java.lang.String> strSet21 = jSDocInfo15.getParameterNames();
        node4.putProp((-1), (java.lang.Object) jSDocInfo15);
        int int23 = jSDocInfo15.getParameterCount();
        java.lang.String str24 = jSDocInfo15.getDeprecationReason();
        boolean boolean26 = jSDocInfo15.hasDescriptionForParameter("");
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 4095, 100, (int) (short) 1);
        boolean boolean31 = node30.isLabelName();
        com.google.javascript.rhino.Node node32 = node30.getLastChild();
        boolean boolean33 = node30.isWhile();
        node30.setSourceFileForTesting("(Not declared as a type name)");
        jSDocInfo15.setAssociatedNode(node30);
        boolean boolean37 = node30.isIf();
        boolean boolean38 = node30.wasEmptyNode();
        java.lang.String str42 = node30.toString(true, false, true);
        boolean boolean43 = node30.isGetterDef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node45 = node30.getChildAtIndex(3);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("STRING  0 [quoted: 1]\n");
        int int2 = node1.getSourceOffset();
        boolean boolean3 = node1.isOr();
        int int4 = node1.getChildCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node6 = node1.getChildAtIndex(43);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(38, "STRING \n");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean7 = node6.isThrow();
        java.lang.String str11 = node6.toString(true, false, true);
        boolean boolean12 = node6.isGetterDef();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = node6.getJSDocInfo();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node24 = node22.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((int) (byte) -1, node22, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node34 = node32.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) -1, node32, (int) (byte) 1, (int) '#');
        boolean boolean38 = node27.hasChild(node37);
        int int39 = node27.getCharno();
        com.google.javascript.rhino.Node node40 = node17.useSourceInfoIfMissingFrom(node27);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node45 = node17.srcref(node44);
        boolean boolean46 = node45.isAssignAdd();
        boolean boolean47 = node6.isEquivalentToTyped(node45);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder48 = node45.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node63 = node61.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node((int) (byte) -1, node61, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node73 = node71.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node76 = new com.google.javascript.rhino.Node((int) (byte) -1, node71, (int) (byte) 1, (int) '#');
        boolean boolean77 = node66.hasChild(node76);
        int int78 = node66.getCharno();
        com.google.javascript.rhino.Node node79 = node56.useSourceInfoIfMissingFrom(node66);
        node79.setLength((int) ' ');
        node52.addChildrenToBack(node79);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable83 = node52.children();
        com.google.javascript.rhino.Node node84 = node52.getLastSibling();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder85 = node52.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.JSDocInfo jSDocInfo86 = node52.getJSDocInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.replaceChild(node45, node52);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        boolean boolean10 = node4.isDo();
        boolean boolean11 = node4.isDefaultCase();
        node4.setQuotedString();
        boolean boolean13 = node4.isDec();
        int int14 = node4.getChildCount();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString((int) (byte) 10, "Named type with empty name component");
        boolean boolean18 = node17.isObjectLit();
        com.google.javascript.rhino.Node node19 = node4.useSourceInfoFrom(node17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node21 = node19.getChildAtIndex(4111);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 4095, 100, (int) (short) 1);
        double double4 = node3.getDouble();
        boolean boolean5 = node3.isAdd();
        com.google.javascript.rhino.Node node6 = node3.cloneNode();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.siblings();
        int int8 = node6.getLineno();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable9 = node6.getAncestors();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(16);
        node12.setLength((int) (short) 10);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(12, node12, 208993, 24);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(35, "OR 1", (int) (short) 0, 45);
        boolean boolean24 = node23.isExprResult();
        boolean boolean25 = node23.isInc();
        boolean boolean26 = node23.isLabelName();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(409601, node23);
        boolean boolean28 = node27.hasMoreThanOneChild();
        boolean boolean29 = node27.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node6.replaceChild(node17, node27);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node16 = node14.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) -1, node14, (int) (byte) 1, (int) '#');
        boolean boolean20 = node9.hasChild(node19);
        boolean boolean21 = node19.isVar();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(12, "STRING  0 [synthetic: 1]\n");
        com.google.javascript.rhino.Node node25 = node19.useSourceInfoFromForTree(node24);
        boolean boolean26 = node25.isParamList();
        boolean boolean27 = node25.isNumber();
        boolean boolean28 = node25.isDefaultCase();
        boolean boolean29 = node25.hasOneChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node31 = node25.getChildAtIndex(13);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(3, "unknown", 45, 30);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node11 = node9.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (byte) -1, node9, (int) (byte) 1, (int) '#');
        boolean boolean15 = node9.isDo();
        boolean boolean16 = node9.isDefaultCase();
        node9.setQuotedString();
        boolean boolean18 = node9.isDec();
        boolean boolean19 = node9.isLabel();
        boolean boolean20 = node9.isSetterDef();
        boolean boolean21 = node9.isRegExp();
        boolean boolean22 = node9.isName();
        boolean boolean23 = node9.isVoid();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node30 = node28.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((int) (byte) -1, node28, (int) (byte) 1, (int) '#');
        boolean boolean34 = node28.isDo();
        com.google.javascript.rhino.Node node35 = node9.useSourceInfoIfMissingFrom(node28);
        com.google.javascript.rhino.Node node36 = node4.useSourceInfoIfMissingFromForTree(node9);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node40.setCharno(1);
        boolean boolean43 = node40.isRegExp();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node50 = node48.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node((int) (byte) -1, node48, (int) (byte) 1, (int) '#');
        boolean boolean54 = node48.isDo();
        boolean boolean55 = node48.isDefaultCase();
        node48.setQuotedString();
        com.google.javascript.rhino.Node node57 = node40.useSourceInfoFromForTree(node48);
        node48.putIntProp((int) (byte) 100, (int) (byte) 0);
        node48.putProp((int) 'a', (java.lang.Object) "JSDocInfo");
        boolean boolean64 = node48.isInc();
        node48.setString("");
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newString((-1), "(Not declared as a constructor)", 9, (int) '4');
        boolean boolean72 = node48.hasChild(node71);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node36.removeChild(node71);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        boolean boolean14 = node8.isScript();
        com.google.javascript.rhino.Node node15 = node8.detachFromParent();
        node15.setOptionalArg(false);
        boolean boolean19 = node15.getBooleanProp(31);
        com.google.javascript.rhino.Node node20 = node3.copyInformationFrom(node15);
        boolean boolean21 = node20.isLabel();
        boolean boolean22 = node20.isWhile();
        boolean boolean23 = node20.isFor();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable24 = node20.children();
        node20.setWasEmptyNode(false);
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = node20.getJSDocInfo();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = node20.getStaticSourceFile();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node35 = node33.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((int) (byte) -1, node33, (int) (byte) 1, (int) '#');
        boolean boolean39 = node33.isDo();
        boolean boolean40 = node33.isDefaultCase();
        node33.setQuotedString();
        boolean boolean42 = node33.isDec();
        boolean boolean43 = node33.isLabel();
        boolean boolean44 = node33.isSetterDef();
        boolean boolean45 = node33.isRegExp();
        boolean boolean46 = node33.isName();
        boolean boolean47 = node33.isAssignAdd();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node48 = node20.getChildBefore(node33);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 32);
        boolean boolean2 = node1.isQualifiedName();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        int int7 = node6.getSourcePosition();
        int int8 = node6.getType();
        boolean boolean9 = node6.isLabel();
        com.google.javascript.rhino.Node node10 = node1.srcrefTree(node6);
        node6.setLineno(208993);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node19 = node17.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (byte) -1, node17, (int) (byte) 1, (int) '#');
        boolean boolean23 = node17.isDo();
        boolean boolean24 = node17.isDefaultCase();
        node17.setQuotedString();
        boolean boolean26 = node17.isDec();
        boolean boolean27 = node17.isLabel();
        boolean boolean28 = node17.isSetterDef();
        com.google.javascript.rhino.Node node29 = node17.getLastSibling();
        boolean boolean30 = node29.isOnlyModifiesThisCall();
        boolean boolean31 = node29.isExprResult();
        boolean boolean32 = node29.isTrue();
        boolean boolean33 = node29.isReturn();
        java.lang.String str34 = node29.getString();
        boolean boolean35 = node29.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node39.setCharno(1);
        boolean boolean42 = node39.isRegExp();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node49 = node47.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node((int) (byte) -1, node47, (int) (byte) 1, (int) '#');
        boolean boolean53 = node47.isDo();
        boolean boolean54 = node47.isDefaultCase();
        node47.setQuotedString();
        com.google.javascript.rhino.Node node56 = node39.useSourceInfoFromForTree(node47);
        node47.putIntProp((int) (byte) 100, (int) (byte) 0);
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node66 = node64.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node((int) (byte) -1, node64, (int) (byte) 1, (int) '#');
        boolean boolean70 = node64.isScript();
        com.google.javascript.rhino.InputId inputId71 = node64.getInputId();
        com.google.javascript.rhino.Node node72 = node47.useSourceInfoFrom(node64);
        boolean boolean73 = node47.isTrue();
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean78 = node77.isThrow();
        java.lang.String str82 = node77.toString(true, false, true);
        node47.addChildToFront(node77);
        com.google.javascript.rhino.Node node84 = node29.useSourceInfoFrom(node47);
        node84.setSourceEncodedPosition((int) (byte) 1);
        node84.setString("(NUMBER 40.0 51)");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node89 = node6.getChildBefore(node84);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        int int4 = node3.getType();
        com.google.javascript.rhino.Node node5 = node3.cloneNode();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean10 = node9.isThrow();
        java.lang.String str14 = node9.toString(true, false, true);
        int int16 = node9.getIntProp(51);
        node9.addSuppression("STRING  0 [quoted: 1]\n");
        com.google.javascript.rhino.Node node19 = node5.useSourceInfoFrom(node9);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean24 = node23.isThrow();
        java.lang.String str28 = node23.toString(true, false, true);
        int int30 = node23.getIntProp(51);
        com.google.javascript.rhino.Node node31 = node23.cloneTree();
        boolean boolean32 = node31.isCatch();
        java.lang.String str33 = node31.getSourceFileName();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node40 = node38.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((int) (byte) -1, node38, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node50 = node48.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node((int) (byte) -1, node48, (int) (byte) 1, (int) '#');
        boolean boolean54 = node43.hasChild(node53);
        boolean boolean55 = node53.isVar();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node59.setCharno(1);
        boolean boolean62 = node59.isRegExp();
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node69 = node67.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node((int) (byte) -1, node67, (int) (byte) 1, (int) '#');
        boolean boolean73 = node67.isDo();
        boolean boolean74 = node67.isDefaultCase();
        node67.setQuotedString();
        com.google.javascript.rhino.Node node76 = node59.useSourceInfoFromForTree(node67);
        boolean boolean77 = node76.isVarArgs();
        com.google.javascript.rhino.Node node78 = node53.useSourceInfoIfMissingFrom(node76);
        boolean boolean79 = node53.isGetProp();
        boolean boolean80 = node53.isFromExterns();
        com.google.javascript.rhino.Node node81 = node31.useSourceInfoFromForTree(node53);
        boolean boolean82 = node53.isGetProp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node19.removeChild(node53);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(45, "Node tree inequality:\nTree1:\nSTRING  0 [quoted: 1]\n\n\nTree2:\nSTRING Not declared as a constructor 0\n\n\nSubtree1: STRING  0 [quoted: 1]\n\n\nSubtree2: STRING Not declared as a constructor 0\n");
        boolean boolean3 = node2.isStringKey();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node7.setCharno(1);
        boolean boolean10 = node7.isRegExp();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node17 = node15.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (byte) -1, node15, (int) (byte) 1, (int) '#');
        boolean boolean21 = node15.isDo();
        boolean boolean22 = node15.isDefaultCase();
        node15.setQuotedString();
        com.google.javascript.rhino.Node node24 = node7.useSourceInfoFromForTree(node15);
        boolean boolean25 = node7.isInc();
        java.lang.String str29 = node7.toString(true, false, true);
        boolean boolean30 = node7.isHook();
        com.google.javascript.rhino.jstype.JSType jSType31 = node7.getJSType();
        node7.setVarArgs(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.removeChild(node7);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        java.lang.String[] strArray3 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet4 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet4, strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        boolean boolean11 = strSet4.addAll((java.util.Collection<java.lang.String>) strList9);
        boolean boolean13 = strSet4.remove((java.lang.Object) 1L);
        java.lang.String[] strArray16 = new java.lang.String[] { "STRING  0", "STRING  0" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        boolean boolean20 = strSet17.add("STRING  0");
        java.lang.String[] strArray23 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        boolean boolean31 = strSet24.addAll((java.util.Collection<java.lang.String>) strList29);
        boolean boolean32 = strSet17.containsAll((java.util.Collection<java.lang.String>) strList29);
        boolean boolean33 = strSet4.addAll((java.util.Collection<java.lang.String>) strSet17);
        java.util.stream.Stream<java.lang.String> strStream34 = strSet17.stream();
        strSet17.clear();
        java.lang.CharSequence[] charSequenceArray38 = new java.lang.CharSequence[] { "(Node tree inequality:\nTree1:\nSTRING  0 [quoted: 1]\n\n\nTree2:\nIN\n\n\nSubtree1: STRING  0 [quoted: 1]\n\n\nSubtree2: IN\n)", "STRING  0\n" };
        java.lang.CharSequence[] charSequenceArray39 = strSet17.toArray(charSequenceArray38);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        int int45 = node44.getSourcePosition();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node56 = node54.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node((int) (byte) -1, node54, (int) (byte) 1, (int) '#');
        boolean boolean60 = node54.isScript();
        node54.setQuotedString();
        com.google.javascript.rhino.Node node62 = node49.srcrefTree(node54);
        boolean boolean63 = node62.isIf();
        com.google.javascript.rhino.Node node64 = node62.getParent();
        node62.removeProp((int) 'a');
        int int67 = node62.getLineno();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString(35, "OR 1", (int) (short) 0, 45);
        com.google.javascript.rhino.Node node73 = node72.removeFirstChild();
        com.google.javascript.rhino.Node[] nodeArray74 = new com.google.javascript.rhino.Node[] { node44, node62, node72 };
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node(50, nodeArray74, 4095, (int) (short) 0);
        com.google.javascript.rhino.Node[] nodeArray78 = strSet17.toArray(nodeArray74);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node79 = new com.google.javascript.rhino.Node(4095, nodeArray78);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node7 = node5.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (byte) -1, node5, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node17 = node15.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (byte) -1, node15, (int) (byte) 1, (int) '#');
        boolean boolean21 = node10.hasChild(node20);
        boolean boolean22 = node20.isVar();
        boolean boolean23 = node20.isTypeOf();
        boolean boolean24 = node20.isAssignAdd();
        boolean boolean25 = node20.isStringKey();
        node20.setOptionalArg(true);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean32 = node31.isThrow();
        java.lang.String str36 = node31.toString(true, false, true);
        boolean boolean37 = node31.isWith();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean42 = node41.isThrow();
        boolean boolean43 = node41.isSwitch();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node50 = node48.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node((int) (byte) -1, node48, (int) (byte) 1, (int) '#');
        boolean boolean54 = node48.isDo();
        boolean boolean55 = node48.isDefaultCase();
        node48.setQuotedString();
        boolean boolean57 = node48.isDec();
        boolean boolean58 = node48.isLabel();
        boolean boolean59 = node48.isSetterDef();
        boolean boolean60 = node48.isRegExp();
        boolean boolean61 = node48.isName();
        boolean boolean62 = node48.isVoid();
        com.google.javascript.rhino.Node node63 = node48.cloneNode();
        com.google.javascript.rhino.Node node64 = node41.useSourceInfoIfMissingFrom(node63);
        boolean boolean65 = node64.isFor();
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node(53, node20, node31, node64);
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString("Named type with empty name component");
        node31.addChildToFront(node68);
        boolean boolean70 = node31.isTypeOf();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node72 = node31.getChildAtIndex(30);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString((int) (byte) 100, "Node tree inequality:\nTree1:\nSTRING  0 [quoted: 1]\n\n\nTree2:\nSTRING Not declared as a constructor 0\n\n\nSubtree1: STRING  0 [quoted: 1]\n\n\nSubtree2: STRING Not declared as a constructor 0\n", 52, 36);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node11 = node9.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (byte) -1, node9, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node21 = node19.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (byte) -1, node19, (int) (byte) 1, (int) '#');
        boolean boolean25 = node14.hasChild(node24);
        boolean boolean26 = node24.isVar();
        boolean boolean27 = node24.isTypeOf();
        boolean boolean28 = node24.isAssignAdd();
        com.google.javascript.rhino.Node node29 = node24.removeFirstChild();
        node24.putBooleanProp(0, false);
        boolean boolean33 = node24.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.JSType jSType36 = node35.getJSType();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString((int) (byte) 10, "Named type with empty name component");
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node52 = node50.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((int) (byte) -1, node50, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node62 = node60.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node((int) (byte) -1, node60, (int) (byte) 1, (int) '#');
        boolean boolean66 = node55.hasChild(node65);
        int int67 = node55.getCharno();
        com.google.javascript.rhino.Node node68 = node45.useSourceInfoIfMissingFrom(node55);
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node75 = node73.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node78 = new com.google.javascript.rhino.Node((int) (byte) -1, node73, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node83 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node85 = node83.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node88 = new com.google.javascript.rhino.Node((int) (byte) -1, node83, (int) (byte) 1, (int) '#');
        boolean boolean89 = node78.hasChild(node88);
        boolean boolean90 = node88.isVar();
        com.google.javascript.rhino.Node node91 = new com.google.javascript.rhino.Node((-1), node55, node88);
        com.google.javascript.rhino.Node node92 = node91.getParent();
        boolean boolean93 = node91.isSetterDef();
        com.google.javascript.rhino.Node node94 = new com.google.javascript.rhino.Node((-1), node91);
        boolean boolean95 = node39.isEquivalentTo(node94);
        com.google.javascript.rhino.Node node96 = node35.srcrefTree(node94);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.replaceChild(node24, node35);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (short) -1);
        boolean boolean2 = node1.isWith();
        node1.setDouble((double) 1);
        java.lang.String[] strArray7 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        boolean boolean15 = strSet8.addAll((java.util.Collection<java.lang.String>) strList13);
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str17 = jSDocInfo16.getVersion();
        java.lang.String str18 = jSDocInfo16.getFileOverview();
        boolean boolean19 = jSDocInfo16.shouldPreserveTry();
        java.util.Set<java.lang.String> strSet20 = jSDocInfo16.getParameterNames();
        boolean boolean21 = strSet8.retainAll((java.util.Collection<java.lang.String>) strSet20);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node28 = node26.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) (byte) -1, node26, (int) (byte) 1, (int) '#');
        boolean boolean32 = node26.isDo();
        boolean boolean33 = node26.isDefaultCase();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node44 = node42.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((int) (byte) -1, node42, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node54 = node52.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node((int) (byte) -1, node52, (int) (byte) 1, (int) '#');
        boolean boolean58 = node47.hasChild(node57);
        int int59 = node47.getCharno();
        com.google.javascript.rhino.Node node60 = node37.useSourceInfoIfMissingFrom(node47);
        int int61 = node37.getSourcePosition();
        java.lang.String str62 = node37.toString();
        int int63 = node26.getIndexOfChild(node37);
        boolean boolean64 = strSet8.equals((java.lang.Object) node26);
        boolean boolean65 = node26.isDec();
        com.google.javascript.rhino.Node node66 = node1.useSourceInfoIfMissingFrom(node26);
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node73 = node71.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node76 = new com.google.javascript.rhino.Node((int) (byte) -1, node71, (int) (byte) 1, (int) '#');
        boolean boolean77 = node71.isScript();
        com.google.javascript.rhino.Node node78 = node71.detachFromParent();
        boolean boolean79 = node71.isAssignAdd();
        boolean boolean80 = node71.isArrayLit();
        boolean boolean81 = node71.isLocalResultCall();
        boolean boolean82 = node71.isIf();
        com.google.javascript.rhino.Node node83 = node66.srcref(node71);
        boolean boolean84 = node71.isAnd();
        com.google.javascript.rhino.Node node87 = com.google.javascript.rhino.Node.newString(41, "STRING  8");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node88 = node71.getChildBefore(node87);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(46, "OR", 0, 53);
        com.google.javascript.rhino.jstype.JSType jSType5 = node4.getJSType();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable6 = node4.children();
        boolean boolean7 = node4.hasChildren();
        com.google.javascript.rhino.Node[] nodeArray15 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (short) 10, nodeArray15);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(29, nodeArray15);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(30, nodeArray15);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node(29, nodeArray15);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (byte) -1, nodeArray15, 409601, (int) (short) 1);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) '#', nodeArray15);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (byte) 0, nodeArray15, 48, 409601);
        int int27 = node26.getChildCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node28 = node4.getChildBefore(node26);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean4 = node3.isFromExterns();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        int int9 = node8.getType();
        boolean boolean10 = node8.isSyntheticBlock();
        boolean boolean11 = node8.isStringKey();
        com.google.javascript.rhino.Node node12 = node3.srcrefTree(node8);
        boolean boolean13 = node12.isFunction();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node15 = node12.getChildAtIndex(36);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 10, "Named type with empty name component");
        boolean boolean3 = node2.isIf();
        boolean boolean4 = node2.isStringKey();
        boolean boolean5 = node2.isOr();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean10 = node9.isThrow();
        java.lang.String str14 = node9.toString(true, false, true);
        node9.setIsSyntheticBlock(true);
        boolean boolean17 = node9.isAdd();
        com.google.javascript.rhino.Node node18 = node9.removeChildren();
        boolean boolean19 = node9.isAdd();
        com.google.javascript.rhino.Node node20 = node9.removeChildren();
        int int21 = node9.getSourceOffset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.removeChild(node9);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean4 = node3.isThrow();
        java.lang.String str8 = node3.toString(true, false, true);
        java.lang.String str9 = node3.getQualifiedName();
        boolean boolean10 = node3.isNull();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder11 = node3.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        boolean boolean16 = node15.isAnd();
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str18 = jSDocInfo17.getVersion();
        java.lang.String str19 = jSDocInfo17.getFileOverview();
        jSDocInfo17.addSuppression("STRING  0");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList22 = jSDocInfo17.getExtendedInterfaces();
        boolean boolean23 = jSDocInfo17.isConstructor();
        node15.setJSDocInfo(jSDocInfo17);
        boolean boolean25 = node15.isIn();
        int int26 = node15.getLineno();
        node15.setVarArgs(false);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) 49, (int) (byte) 100, 10);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node39 = node37.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((int) (byte) -1, node37, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node49 = node47.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node((int) (byte) -1, node47, (int) (byte) 1, (int) '#');
        boolean boolean53 = node42.hasChild(node52);
        boolean boolean54 = node52.isVar();
        boolean boolean55 = node52.isTypeOf();
        boolean boolean57 = node52.getBooleanProp((int) (byte) 10);
        boolean boolean58 = node52.isTrue();
        node52.setLineno(4);
        node52.setLength(16773120);
        com.google.javascript.rhino.Node node63 = node32.useSourceInfoFromForTree(node52);
        boolean boolean64 = node32.isQuotedString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.replaceChild(node15, node32);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 49, (int) (byte) 10, 45);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node11 = node9.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (byte) -1, node9, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node21 = node19.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (byte) -1, node19, (int) (byte) 1, (int) '#');
        boolean boolean25 = node14.hasChild(node24);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(49, "STRING  0\n");
        com.google.javascript.rhino.Node node29 = node14.clonePropsFrom(node28);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node40 = node38.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((int) (byte) -1, node38, (int) (byte) 1, (int) '#');
        boolean boolean44 = node38.isScript();
        com.google.javascript.rhino.Node node45 = node38.detachFromParent();
        node45.setOptionalArg(false);
        boolean boolean49 = node45.getBooleanProp(31);
        com.google.javascript.rhino.Node node50 = node33.copyInformationFrom(node45);
        boolean boolean51 = node50.isLabel();
        com.google.javascript.rhino.Node node52 = node28.useSourceInfoIfMissingFrom(node50);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node(32, node52, 16, 97);
        boolean boolean56 = node55.isParamList();
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean61 = node60.isThrow();
        java.lang.String str65 = node60.toString(true, false, true);
        node60.setIsSyntheticBlock(true);
        boolean boolean68 = node60.isTry();
        java.lang.String str69 = node60.toStringTree();
        boolean boolean70 = node60.isRegExp();
        node60.setSourceFileForTesting("hi!");
        java.lang.String str76 = node60.toString(false, true, false);
        node60.setSourceEncodedPosition(45);
        com.google.javascript.rhino.Node node79 = node55.useSourceInfoFrom(node60);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node55);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (short) -1);
        int int2 = node1.getChildCount();
        boolean boolean3 = node1.isNull();
        boolean boolean4 = node1.isAssign();
        java.lang.String str5 = node1.toStringTree();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean11 = node10.isThrow();
        java.lang.String str15 = node10.toString(true, false, true);
        java.lang.String str16 = node10.getQualifiedName();
        boolean boolean17 = node10.isIn();
        com.google.javascript.rhino.Node node18 = node10.cloneTree();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node25 = node23.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (byte) -1, node23, (int) (byte) 1, (int) '#');
        boolean boolean29 = node23.isScript();
        com.google.javascript.rhino.Node node30 = node23.detachFromParent();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node34.setCharno(1);
        java.util.Set<java.lang.String> strSet37 = node34.getDirectives();
        boolean boolean38 = node34.isHook();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node49 = node47.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node((int) (byte) -1, node47, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node59 = node57.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node((int) (byte) -1, node57, (int) (byte) 1, (int) '#');
        boolean boolean63 = node52.hasChild(node62);
        int int64 = node52.getCharno();
        com.google.javascript.rhino.Node node65 = node42.useSourceInfoIfMissingFrom(node52);
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node70 = node42.srcref(node69);
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(4095, node18, node30, node34, node42);
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node78 = node76.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node81 = new com.google.javascript.rhino.Node((int) (byte) -1, node76, (int) (byte) 1, (int) '#');
        int int82 = node81.getType();
        boolean boolean83 = node34.isEquivalentTo(node81);
        int int84 = node34.getSideEffectFlags();
        com.google.javascript.rhino.InputId inputId85 = node34.getInputId();
        boolean boolean86 = node34.hasChildren();
        boolean boolean87 = node34.isIn();
        java.lang.String str91 = node34.toString(true, false, true);
        boolean boolean92 = node1.hasChild(node34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node94 = node1.getChildAtIndex(100);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(16);
        node1.setLength((int) (short) 10);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        boolean boolean14 = node8.isScript();
        com.google.javascript.rhino.InputId inputId15 = node8.getInputId();
        boolean boolean16 = node8.isDelProp();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder17 = node8.getJsDocBuilderForNode();
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str20 = jSDocInfo19.getVersion();
        boolean boolean21 = jSDocInfo19.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet22 = jSDocInfo19.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList23 = jSDocInfo19.getImplementedInterfaces();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList24 = jSDocInfo19.getThrownTypes();
        java.util.Set<java.lang.String> strSet25 = jSDocInfo19.getParameterNames();
        node8.putProp((-1), (java.lang.Object) jSDocInfo19);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node33 = node31.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (byte) -1, node31, (int) (byte) 1, (int) '#');
        boolean boolean37 = node31.isDo();
        boolean boolean38 = node31.isDefaultCase();
        boolean boolean39 = node31.isFor();
        boolean boolean40 = node31.isThis();
        node31.setLineno(8);
        boolean boolean43 = node31.isBlock();
        com.google.javascript.rhino.Node node44 = node8.copyInformationFrom(node31);
        int int45 = node31.getSourceOffset();
        node31.putBooleanProp(97, true);
        boolean boolean49 = node31.isIn();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node31);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        int int4 = node3.getType();
        com.google.javascript.rhino.Node node5 = node3.cloneNode();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean10 = node9.isThrow();
        java.lang.String str14 = node9.toString(true, false, true);
        int int16 = node9.getIntProp(51);
        node9.addSuppression("STRING  0 [quoted: 1]\n");
        com.google.javascript.rhino.Node node19 = node5.useSourceInfoFrom(node9);
        boolean boolean21 = node9.getBooleanProp(37);
        boolean boolean22 = node9.isAnd();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node24 = node9.getChildAtIndex(30);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        java.lang.String[] strArray2 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        boolean boolean10 = strSet3.addAll((java.util.Collection<java.lang.String>) strList8);
        strSet3.clear();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node15.setCharno(1);
        boolean boolean18 = node15.isRegExp();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node25 = node23.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (byte) -1, node23, (int) (byte) 1, (int) '#');
        boolean boolean29 = node23.isDo();
        boolean boolean30 = node23.isDefaultCase();
        node23.setQuotedString();
        com.google.javascript.rhino.Node node32 = node15.useSourceInfoFromForTree(node23);
        node23.putIntProp((int) (byte) 100, (int) (byte) 0);
        node23.putProp((int) 'a', (java.lang.Object) "JSDocInfo");
        boolean boolean39 = node23.isInc();
        boolean boolean40 = strSet3.equals((java.lang.Object) node23);
        com.google.javascript.rhino.Node node41 = node23.cloneTree();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node43 = node23.getChildAtIndex((int) ' ');
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node20 = node18.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (byte) -1, node18, (int) (byte) 1, (int) '#');
        boolean boolean24 = node13.hasChild(node23);
        int int25 = node13.getCharno();
        com.google.javascript.rhino.Node node26 = node3.useSourceInfoIfMissingFrom(node13);
        node26.setLength((int) ' ');
        boolean boolean29 = node26.isReturn();
        boolean boolean30 = node26.isNumber();
        boolean boolean31 = node26.isFunction();
        boolean boolean32 = node26.isFalse();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node34 = node26.getChildAtIndex(204810);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node16 = node14.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) -1, node14, (int) (byte) 1, (int) '#');
        boolean boolean20 = node9.hasChild(node19);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(49, "STRING  0\n");
        com.google.javascript.rhino.Node node24 = node9.clonePropsFrom(node23);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node35 = node33.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((int) (byte) -1, node33, (int) (byte) 1, (int) '#');
        boolean boolean39 = node33.isScript();
        com.google.javascript.rhino.Node node40 = node33.detachFromParent();
        node40.setOptionalArg(false);
        boolean boolean44 = node40.getBooleanProp(31);
        com.google.javascript.rhino.Node node45 = node28.copyInformationFrom(node40);
        boolean boolean46 = node45.isLabel();
        com.google.javascript.rhino.Node node47 = node23.useSourceInfoIfMissingFrom(node45);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder48 = node23.new FileLevelJsDocBuilder();
        boolean boolean49 = node23.isInstanceOf();
        node23.putBooleanProp(37, true);
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node((int) (short) 100);
        boolean boolean55 = node54.isGetProp();
        com.google.javascript.rhino.Node node56 = node23.useSourceInfoIfMissingFrom(node54);
        boolean boolean57 = node23.isCatch();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node59 = node23.getChildAtIndex(43);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node3.setCharno(1);
        boolean boolean6 = node3.isRegExp();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node13 = node11.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (byte) -1, node11, (int) (byte) 1, (int) '#');
        boolean boolean17 = node11.isDo();
        boolean boolean18 = node11.isDefaultCase();
        node11.setQuotedString();
        com.google.javascript.rhino.Node node20 = node3.useSourceInfoFromForTree(node11);
        node11.putIntProp((int) (byte) 100, (int) (byte) 0);
        node11.putProp((int) 'a', (java.lang.Object) "JSDocInfo");
        boolean boolean27 = node11.isInc();
        node11.setQuotedString();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        int int33 = node32.getSourcePosition();
        int int34 = node32.getType();
        boolean boolean35 = node32.isLabel();
        node32.setSourceFileForTesting("STRING  0 [quoted: 1]\n");
        boolean boolean38 = node11.isEquivalentToTyped(node32);
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node49 = node47.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node((int) (byte) -1, node47, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node59 = node57.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node((int) (byte) -1, node57, (int) (byte) 1, (int) '#');
        boolean boolean63 = node52.hasChild(node62);
        int int64 = node52.getCharno();
        com.google.javascript.rhino.Node node65 = node42.useSourceInfoIfMissingFrom(node52);
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node70 = node42.srcref(node69);
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean75 = node74.isFromExterns();
        boolean boolean76 = node70.hasChild(node74);
        node70.setLineno((-1));
        com.google.javascript.rhino.Node node79 = node32.useSourceInfoFrom(node70);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node81 = node79.getChildAtIndex(40);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(35, "NUMBER -1.0\n", (int) (byte) 10, 45);
        com.google.javascript.rhino.Node node5 = node4.cloneTree();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node12 = node10.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((int) (byte) -1, node10, (int) (byte) 1, (int) '#');
        java.lang.String str16 = node10.toStringTree();
        boolean boolean17 = node10.isDebugger();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder18 = node10.getJsDocBuilderForNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.removeChild(node10);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("STRING ", 16419, 409601);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(38, 41, 43);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable8 = node7.children();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean13 = node12.isThrow();
        java.lang.String str17 = node12.toString(true, false, true);
        boolean boolean18 = node12.isOptionalArg();
        boolean boolean19 = node12.isThrow();
        boolean boolean20 = node12.isAnd();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.replaceChild(node7, node12);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(3, "Not declared as a type name");
        boolean boolean3 = node2.isDefaultCase();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        boolean boolean14 = node8.isDo();
        boolean boolean15 = node8.isDefaultCase();
        node8.setQuotedString();
        boolean boolean18 = node8.getBooleanProp(52);
        boolean boolean19 = node8.isThis();
        java.lang.Object obj21 = node8.getProp(8);
        com.google.javascript.rhino.Node node22 = node8.getFirstChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node23 = node2.getChildBefore(node8);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        boolean boolean10 = node4.isScript();
        com.google.javascript.rhino.InputId inputId11 = node4.getInputId();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node15.setCharno(1);
        boolean boolean18 = node15.isRegExp();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node25 = node23.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (byte) -1, node23, (int) (byte) 1, (int) '#');
        boolean boolean29 = node23.isDo();
        boolean boolean30 = node23.isDefaultCase();
        node23.setQuotedString();
        com.google.javascript.rhino.Node node32 = node15.useSourceInfoFromForTree(node23);
        node23.putIntProp((int) (byte) 100, (int) (byte) 0);
        node23.putProp((int) 'a', (java.lang.Object) "JSDocInfo");
        node23.detachChildren();
        com.google.javascript.rhino.Node node40 = node4.useSourceInfoIfMissingFromForTree(node23);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean45 = node44.isThrow();
        java.lang.String str49 = node44.toString(true, false, true);
        node44.setIsSyntheticBlock(true);
        boolean boolean52 = node44.isTry();
        java.lang.String str53 = node44.toStringTree();
        com.google.javascript.rhino.Node node54 = node4.copyInformationFrom(node44);
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node61 = node59.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node((int) (byte) -1, node59, (int) (byte) 1, (int) '#');
        boolean boolean65 = node59.isDo();
        boolean boolean66 = node59.isDefaultCase();
        node59.setQuotedString();
        boolean boolean68 = node59.isDec();
        boolean boolean69 = node59.isLabel();
        boolean boolean70 = node59.isSetterDef();
        com.google.javascript.rhino.Node node71 = node59.getLastSibling();
        boolean boolean72 = node59.isDo();
        java.lang.String str73 = node59.toString();
        com.google.javascript.rhino.Node node74 = node4.useSourceInfoIfMissingFrom(node59);
        com.google.javascript.rhino.Node node79 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node81 = node79.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node84 = new com.google.javascript.rhino.Node((int) (byte) -1, node79, (int) (byte) 1, (int) '#');
        boolean boolean85 = node79.isDo();
        boolean boolean86 = node79.isExprResult();
        boolean boolean87 = node79.isTypeOf();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node88 = node74.getChildBefore(node79);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(41, "(Node tree inequality:\nTree1:\nSTRING  0 [quoted: 1]\n\n\nTree2:\nIN\n\n\nSubtree1: STRING  0 [quoted: 1]\n\n\nSubtree2: IN\n)");
        node2.setCharno(4131);
        boolean boolean5 = node2.isQualifiedName();
        java.lang.String str6 = node2.getQualifiedName();
        node2.setVarArgs(false);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node15 = node13.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (byte) -1, node13, (int) (byte) 1, (int) '#');
        boolean boolean19 = node13.isDo();
        boolean boolean20 = node13.isDefaultCase();
        node13.setQuotedString();
        boolean boolean22 = node13.isDec();
        boolean boolean23 = node13.isLabel();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable24 = node13.siblings();
        com.google.javascript.rhino.Node node25 = node13.detachFromParent();
        boolean boolean26 = node13.isAssignAdd();
        boolean boolean27 = node13.isString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.removeChild(node13);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        boolean boolean10 = node4.isDo();
        com.google.javascript.rhino.Node node11 = node4.getLastSibling();
        boolean boolean12 = node4.isAssignAdd();
        node4.setVarArgs(true);
        com.google.javascript.rhino.Node node15 = node4.cloneTree();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node17 = node4.getChildAtIndex(208993);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node20 = node18.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (byte) -1, node18, (int) (byte) 1, (int) '#');
        boolean boolean24 = node13.hasChild(node23);
        int int25 = node13.getCharno();
        com.google.javascript.rhino.Node node26 = node3.useSourceInfoIfMissingFrom(node13);
        boolean boolean27 = node13.isAssignAdd();
        boolean boolean28 = node13.isUnscopedQualifiedName();
        int int29 = node13.getLineno();
        com.google.javascript.rhino.Node node31 = node13.getAncestor(4);
        boolean boolean32 = node13.isInstanceOf();
        boolean boolean33 = node13.isVar();
        int int34 = node13.getLineno();
        boolean boolean35 = node13.isSyntheticBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node37 = node13.getChildAtIndex(4095);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node20 = node18.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (byte) -1, node18, (int) (byte) 1, (int) '#');
        boolean boolean24 = node13.hasChild(node23);
        int int25 = node13.getCharno();
        com.google.javascript.rhino.Node node26 = node3.useSourceInfoIfMissingFrom(node13);
        node26.setLength((int) ' ');
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node39 = node37.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((int) (byte) -1, node37, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node49 = node47.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node((int) (byte) -1, node47, (int) (byte) 1, (int) '#');
        boolean boolean53 = node42.hasChild(node52);
        int int54 = node42.getCharno();
        com.google.javascript.rhino.Node node55 = node32.useSourceInfoIfMissingFrom(node42);
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node60 = node32.srcref(node59);
        boolean boolean61 = node26.isEquivalentToTyped(node32);
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node68 = node66.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node((int) (byte) -1, node66, (int) (byte) 1, (int) '#');
        java.lang.String str72 = node66.toStringTree();
        boolean boolean73 = node66.isStringKey();
        boolean boolean74 = node66.isAnd();
        com.google.javascript.rhino.Node node75 = node32.useSourceInfoIfMissingFromForTree(node66);
        node32.removeProp(35);
        boolean boolean78 = node32.isName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node80 = node32.getChildAtIndex(50);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean4 = node3.isThrow();
        java.lang.String str8 = node3.toString(true, false, true);
        node3.setIsSyntheticBlock(true);
        int int11 = node3.getLength();
        boolean boolean12 = node3.isNumber();
        node3.setSourceEncodedPositionForTree(40);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable15 = node3.getAncestors();
        node3.setCharno(3);
        boolean boolean18 = node3.isAssign();
        boolean boolean19 = node3.isGetterDef();
        com.google.javascript.rhino.Node[] nodeArray25 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (short) 10, nodeArray25);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(0, nodeArray25);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(2, nodeArray25);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(4, nodeArray25, 39, (int) (short) 100);
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node(8, nodeArray25, 29, 31);
        node34.setOptionalArg(true);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((-1), 36, 0);
        boolean boolean41 = node40.isHook();
        node40.addSuppression("STRING  0\n");
        boolean boolean44 = node40.isVoid();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.replaceChild(node34, node40);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node20 = node18.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (byte) -1, node18, (int) (byte) 1, (int) '#');
        boolean boolean24 = node13.hasChild(node23);
        int int25 = node13.getCharno();
        com.google.javascript.rhino.Node node26 = node3.useSourceInfoIfMissingFrom(node13);
        boolean boolean27 = node26.isArrayLit();
        node26.setLineno(4131);
        node26.setCharno((int) '4');
        boolean boolean32 = node26.isNew();
        boolean boolean33 = node26.isCatch();
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(49, (int) (byte) 0, (int) (short) 0);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(40, node38);
        com.google.javascript.rhino.Node node40 = node39.getFirstChild();
        boolean boolean41 = node40.isQuotedString();
        boolean boolean42 = node40.isLabel();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node26.removeChild(node40);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        boolean boolean14 = node8.isScript();
        node8.setQuotedString();
        com.google.javascript.rhino.Node node16 = node3.srcrefTree(node8);
        boolean boolean17 = node16.isIf();
        com.google.javascript.rhino.Node node18 = node16.getParent();
        node16.removeProp((int) 'a');
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean25 = node24.isThrow();
        java.lang.String str29 = node24.toString(true, false, true);
        node24.setQuotedString();
        com.google.javascript.rhino.JSDocInfo jSDocInfo31 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str32 = jSDocInfo31.getVersion();
        boolean boolean33 = jSDocInfo31.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet34 = jSDocInfo31.getParameterNames();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility35 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo31.setVisibility(visibility35);
        node24.setJSDocInfo(jSDocInfo31);
        com.google.javascript.rhino.Node node38 = node16.clonePropsFrom(node24);
        int int39 = node38.getChildCount();
        boolean boolean40 = node38.isName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node42 = node38.getChildAtIndex(45);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (byte) 10, "Named type with empty name component");
        boolean boolean4 = node3.isObjectLit();
        boolean boolean5 = node3.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(50, node3, (int) (byte) 10, (int) (byte) 1);
        boolean boolean9 = node8.isString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node11 = node8.getChildAtIndex(42);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        boolean boolean10 = node4.isDo();
        boolean boolean11 = node4.isDefaultCase();
        node4.setQuotedString();
        boolean boolean14 = node4.getBooleanProp(52);
        node4.setLineno((int) (byte) -1);
        com.google.javascript.rhino.Node node17 = node4.getParent();
        int int18 = node4.getCharno();
        boolean boolean19 = node4.isDefaultCase();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean24 = node23.isThrow();
        java.lang.String str28 = node23.toString(true, false, true);
        java.lang.String str29 = node23.getQualifiedName();
        boolean boolean30 = node23.isIn();
        com.google.javascript.rhino.Node node31 = node23.cloneTree();
        boolean boolean32 = node31.isUnscopedQualifiedName();
        boolean boolean33 = node31.isGetElem();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        boolean boolean38 = node37.isAnd();
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str40 = jSDocInfo39.getVersion();
        java.lang.String str41 = jSDocInfo39.getFileOverview();
        jSDocInfo39.addSuppression("STRING  0");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList44 = jSDocInfo39.getExtendedInterfaces();
        boolean boolean45 = jSDocInfo39.isConstructor();
        node37.setJSDocInfo(jSDocInfo39);
        boolean boolean47 = node37.isIn();
        int int48 = node37.getLineno();
        com.google.javascript.rhino.Node node49 = node31.clonePropsFrom(node37);
        boolean boolean50 = node31.isCall();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node51 = node4.getChildBefore(node31);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean1 = typePosition0.hasBrackets();
        boolean boolean2 = typePosition0.hasBrackets();
        com.google.javascript.rhino.Node node3 = typePosition0.getItem();
        com.google.javascript.rhino.JSDocInfo jSDocInfo4 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str5 = jSDocInfo4.getVersion();
        boolean boolean6 = jSDocInfo4.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet7 = jSDocInfo4.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList8 = jSDocInfo4.getImplementedInterfaces();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean13 = node12.isThrow();
        java.lang.String str17 = node12.toString(true, false, true);
        jSDocInfo4.setAssociatedNode(node12);
        boolean boolean19 = jSDocInfo4.hasTypedefType();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node30 = node28.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((int) (byte) -1, node28, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node40 = node38.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((int) (byte) -1, node38, (int) (byte) 1, (int) '#');
        boolean boolean44 = node33.hasChild(node43);
        int int45 = node33.getCharno();
        com.google.javascript.rhino.Node node46 = node23.useSourceInfoIfMissingFrom(node33);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node51 = node23.srcref(node50);
        jSDocInfo4.setAssociatedNode(node23);
        node23.setLineno(47);
        com.google.javascript.rhino.JSDocInfo jSDocInfo55 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str56 = jSDocInfo55.getVersion();
        boolean boolean57 = jSDocInfo55.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet58 = jSDocInfo55.getParameterNames();
        jSDocInfo55.addSuppression("");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList61 = jSDocInfo55.getExtendedInterfaces();
        node23.setJSDocInfo(jSDocInfo55);
        typePosition0.setItem(node23);
        com.google.javascript.rhino.Node node64 = node23.removeChildren();
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node75 = node73.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node78 = new com.google.javascript.rhino.Node((int) (byte) -1, node73, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node83 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node85 = node83.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node88 = new com.google.javascript.rhino.Node((int) (byte) -1, node83, (int) (byte) 1, (int) '#');
        boolean boolean89 = node78.hasChild(node88);
        int int90 = node78.getCharno();
        com.google.javascript.rhino.Node node91 = node68.useSourceInfoIfMissingFrom(node78);
        boolean boolean92 = node78.isAssignAdd();
        boolean boolean93 = node78.isUnscopedQualifiedName();
        int int94 = node78.getLineno();
        boolean boolean95 = node78.isTrue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node23.removeChild(node78);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 49, (int) (byte) 10, 45);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(10);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node17 = node15.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (byte) -1, node15, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node27 = node25.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (byte) -1, node25, (int) (byte) 1, (int) '#');
        boolean boolean31 = node20.hasChild(node30);
        int int32 = node20.getCharno();
        com.google.javascript.rhino.Node node33 = node10.useSourceInfoIfMissingFrom(node20);
        node33.setLength((int) ' ');
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node46 = node44.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((int) (byte) -1, node44, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node56 = node54.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node((int) (byte) -1, node54, (int) (byte) 1, (int) '#');
        boolean boolean60 = node49.hasChild(node59);
        int int61 = node49.getCharno();
        com.google.javascript.rhino.Node node62 = node39.useSourceInfoIfMissingFrom(node49);
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node67 = node39.srcref(node66);
        boolean boolean68 = node33.isEquivalentToTyped(node39);
        node39.addSuppression("STRING  0 [synthetic: 1]\n");
        node6.addChildToBack(node39);
        java.lang.String str75 = node6.toString(false, true, true);
        boolean boolean76 = node6.isGetterDef();
        com.google.javascript.rhino.Node node79 = new com.google.javascript.rhino.Node(36, node4, node6, 42, 23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node81 = node4.getChildAtIndex(213002);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean4 = node3.isThrow();
        boolean boolean5 = node3.isSwitch();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node12 = node10.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((int) (byte) -1, node10, (int) (byte) 1, (int) '#');
        boolean boolean16 = node10.isDo();
        boolean boolean17 = node10.isDefaultCase();
        node10.setQuotedString();
        boolean boolean19 = node10.isDec();
        boolean boolean20 = node10.isLabel();
        boolean boolean21 = node10.isSetterDef();
        boolean boolean22 = node10.isRegExp();
        boolean boolean23 = node10.isName();
        boolean boolean24 = node10.isVoid();
        com.google.javascript.rhino.Node node25 = node10.cloneNode();
        com.google.javascript.rhino.Node node26 = node3.useSourceInfoIfMissingFrom(node25);
        boolean boolean27 = node26.isRegExp();
        boolean boolean28 = node26.isVar();
        boolean boolean29 = node26.isVarArgs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node31 = node26.getChildAtIndex(151560);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("(STRING  0 [var_args_name: 1])");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(131104, "(NUMBER 40.0 51)", 131104, 5);
        boolean boolean7 = node6.isOnlyModifiesThisCall();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node6);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node20 = node18.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (byte) -1, node18, (int) (byte) 1, (int) '#');
        boolean boolean24 = node13.hasChild(node23);
        int int25 = node13.getCharno();
        com.google.javascript.rhino.Node node26 = node3.useSourceInfoIfMissingFrom(node13);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node31 = node3.srcref(node30);
        boolean boolean32 = node31.isDec();
        boolean boolean33 = node31.isIf();
        boolean boolean34 = node31.isSyntheticBlock();
        boolean boolean35 = node31.hasOneChild();
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node46 = node44.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((int) (byte) -1, node44, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node56 = node54.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node((int) (byte) -1, node54, (int) (byte) 1, (int) '#');
        boolean boolean60 = node49.hasChild(node59);
        int int61 = node49.getCharno();
        com.google.javascript.rhino.Node node62 = node39.useSourceInfoIfMissingFrom(node49);
        boolean boolean63 = node49.isThis();
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node70 = node68.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node((int) (byte) -1, node68, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node80 = node78.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node83 = new com.google.javascript.rhino.Node((int) (byte) -1, node78, (int) (byte) 1, (int) '#');
        boolean boolean84 = node73.hasChild(node83);
        boolean boolean85 = node83.isVar();
        boolean boolean86 = node83.isTypeOf();
        boolean boolean88 = node83.getBooleanProp((int) (byte) 10);
        boolean boolean89 = node83.isTrue();
        com.google.javascript.rhino.Node node90 = node49.useSourceInfoIfMissingFromForTree(node83);
        boolean boolean91 = node49.isFor();
        com.google.javascript.rhino.Node node92 = node49.cloneTree();
        boolean boolean93 = node92.isCase();
        boolean boolean94 = node92.isNull();
        boolean boolean95 = node92.hasChildren();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node96 = node31.getChildBefore(node92);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node16 = node14.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) -1, node14, (int) (byte) 1, (int) '#');
        boolean boolean20 = node9.hasChild(node19);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(49, "STRING  0\n");
        com.google.javascript.rhino.Node node24 = node9.clonePropsFrom(node23);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("", 0, 10);
        int int29 = node28.getType();
        com.google.javascript.rhino.Node node30 = node28.cloneNode();
        com.google.javascript.rhino.Node node31 = node24.useSourceInfoFrom(node28);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("Named type with empty name component");
        boolean boolean34 = node33.isLabelName();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean40 = node39.isThrow();
        java.lang.String str44 = node39.toString(true, false, true);
        boolean boolean45 = node39.isGetterDef();
        com.google.javascript.rhino.JSDocInfo jSDocInfo46 = node39.getJSDocInfo();
        boolean boolean47 = node39.isBreak();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node52.setCharno(1);
        boolean boolean55 = node52.isRegExp();
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node62 = node60.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node((int) (byte) -1, node60, (int) (byte) 1, (int) '#');
        boolean boolean66 = node60.isDo();
        boolean boolean67 = node60.isDefaultCase();
        node60.setQuotedString();
        com.google.javascript.rhino.Node node69 = node52.useSourceInfoFromForTree(node60);
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node73.setCharno(1);
        java.util.Set<java.lang.String> strSet76 = node73.getDirectives();
        node73.setLength(0);
        com.google.javascript.rhino.Node node83 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node85 = node83.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node88 = new com.google.javascript.rhino.Node((int) (byte) -1, node83, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node91 = new com.google.javascript.rhino.Node(0, node69, node73, node88, (int) 'a', (int) (short) 0);
        int int92 = node69.getLineno();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable93 = node69.getAncestors();
        int int94 = node39.getIndexOfChild(node69);
        node33.putProp(40, (java.lang.Object) node39);
        java.lang.String str96 = node28.checkTreeEquals(node39);
        int int97 = node28.getLineno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node99 = node28.getChildAtIndex(143361);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node3.setCharno(1);
        boolean boolean6 = node3.isRegExp();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node13 = node11.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (byte) -1, node11, (int) (byte) 1, (int) '#');
        boolean boolean17 = node11.isDo();
        boolean boolean18 = node11.isDefaultCase();
        node11.setQuotedString();
        com.google.javascript.rhino.Node node20 = node3.useSourceInfoFromForTree(node11);
        node11.putIntProp((int) (byte) 100, (int) (byte) 0);
        node11.setCharno((int) (short) 1);
        java.lang.String str26 = node11.getString();
        com.google.javascript.rhino.Node node27 = node11.getParent();
        boolean boolean28 = node11.isNE();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node32.setCharno(1);
        boolean boolean35 = node32.isRegExp();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node42 = node40.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((int) (byte) -1, node40, (int) (byte) 1, (int) '#');
        boolean boolean46 = node40.isDo();
        boolean boolean47 = node40.isDefaultCase();
        node40.setQuotedString();
        com.google.javascript.rhino.Node node49 = node32.useSourceInfoFromForTree(node40);
        boolean boolean50 = node32.isInc();
        java.lang.String str54 = node32.toString(true, false, true);
        boolean boolean55 = node32.isDebugger();
        node32.setSourceEncodedPosition(44);
        com.google.javascript.rhino.Node node58 = node11.srcrefTree(node32);
        boolean boolean59 = node32.isTry();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        boolean boolean64 = node63.isAnd();
        com.google.javascript.rhino.JSDocInfo jSDocInfo65 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str66 = jSDocInfo65.getVersion();
        java.lang.String str67 = jSDocInfo65.getFileOverview();
        jSDocInfo65.addSuppression("STRING  0");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList70 = jSDocInfo65.getExtendedInterfaces();
        boolean boolean71 = jSDocInfo65.isConstructor();
        node63.setJSDocInfo(jSDocInfo65);
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.Node.newString(35, "OR 1", (int) (short) 0, 45);
        boolean boolean78 = node77.isExprResult();
        boolean boolean79 = node63.isEquivalentTo(node77);
        java.lang.String str80 = node77.toString();
        boolean boolean81 = node77.isQualifiedName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node32.removeChild(node77);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        int int4 = node3.getSourcePosition();
        int int5 = node3.getType();
        boolean boolean6 = node3.isLabel();
        node3.setWasEmptyNode(false);
        java.lang.String str9 = node3.getQualifiedName();
        node3.setQuotedString();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 4095, 100, (int) (short) 1);
        node14.removeProp(47);
        boolean boolean17 = node14.isFromExterns();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 4095, 100, (int) (short) 1);
        double double22 = node21.getDouble();
        boolean boolean23 = node21.isAdd();
        com.google.javascript.rhino.Node node24 = node21.cloneNode();
        boolean boolean25 = node24.isNE();
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node37 = node35.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (byte) -1, node35, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node47 = node45.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node((int) (byte) -1, node45, (int) (byte) 1, (int) '#');
        boolean boolean51 = node40.hasChild(node50);
        int int52 = node40.getCharno();
        com.google.javascript.rhino.Node node53 = node30.useSourceInfoIfMissingFrom(node40);
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node58 = node30.srcref(node57);
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean63 = node62.isFromExterns();
        boolean boolean64 = node58.hasChild(node62);
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node(52, node62);
        node24.addChildToBack(node65);
        java.lang.String str67 = node14.checkTreeEquals(node24);
        com.google.javascript.rhino.JSDocInfo jSDocInfo68 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str69 = jSDocInfo68.getVersion();
        boolean boolean70 = jSDocInfo68.hasEnumParameterType();
        boolean boolean71 = jSDocInfo68.isNoAlias();
        java.lang.String str73 = jSDocInfo68.getDescriptionForParameter("JSDocInfo");
        boolean boolean74 = jSDocInfo68.hasEnumParameterType();
        boolean boolean75 = jSDocInfo68.isIdGenerator();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression76 = jSDocInfo68.getThisType();
        boolean boolean77 = jSDocInfo68.isJavaDispatch();
        node24.setJSDocInfo(jSDocInfo68);
        boolean boolean79 = node24.isTrue();
        boolean boolean81 = node24.getBooleanProp((int) (short) 100);
        boolean boolean82 = node24.isSyntheticBlock();
        boolean boolean83 = node3.isEquivalentTo(node24);
        boolean boolean84 = node3.isDelProp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node86 = node3.getChildAtIndex(30);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean4 = node3.isThrow();
        java.lang.String str8 = node3.toString(true, false, true);
        node3.setIsSyntheticBlock(true);
        int int11 = node3.getLength();
        boolean boolean12 = node3.isNumber();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node19 = node17.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (byte) -1, node17, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node29 = node27.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (byte) -1, node27, (int) (byte) 1, (int) '#');
        boolean boolean33 = node22.hasChild(node32);
        boolean boolean34 = node32.isVar();
        boolean boolean35 = node32.isBlock();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder36 = node32.new FileLevelJsDocBuilder();
        boolean boolean37 = node32.isOr();
        com.google.javascript.rhino.Node node38 = node32.removeChildren();
        com.google.javascript.rhino.Node node39 = node3.copyInformationFromForTree(node38);
        com.google.javascript.rhino.JSDocInfo jSDocInfo40 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str41 = jSDocInfo40.getVersion();
        java.lang.String str42 = jSDocInfo40.getFileOverview();
        jSDocInfo40.addSuppression("STRING  0");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression45 = jSDocInfo40.getBaseType();
        boolean boolean46 = jSDocInfo40.shouldPreserveTry();
        java.util.Set<java.lang.String> strSet47 = jSDocInfo40.getSuppressions();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString("", 0, 10);
        int int52 = node51.getType();
        int int53 = node51.getCharno();
        boolean boolean54 = strSet47.equals((java.lang.Object) node51);
        boolean boolean55 = node51.isOptionalArg();
        node51.setQuotedString();
        boolean boolean57 = node51.isNE();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node39.removeChild(node51);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("STRING  0 [synthetic: 1]\n", (int) ' ', (int) (byte) -1);
        int int4 = node3.getSourcePosition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node6 = node3.getChildAtIndex(7);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean4 = node3.isThrow();
        java.lang.String str8 = node3.toString(true, false, true);
        int int10 = node3.getIntProp(51);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("", 0, 10);
        int int15 = node14.getType();
        com.google.javascript.rhino.Node node16 = node14.cloneNode();
        boolean boolean17 = node14.isInc();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean22 = node21.isThrow();
        java.lang.String str26 = node21.toString(true, false, true);
        java.lang.String str27 = node21.getQualifiedName();
        boolean boolean28 = node21.isThis();
        java.lang.String[] strArray31 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        boolean boolean39 = strSet32.addAll((java.util.Collection<java.lang.String>) strList37);
        com.google.javascript.rhino.JSDocInfo jSDocInfo40 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str41 = jSDocInfo40.getVersion();
        java.lang.String str42 = jSDocInfo40.getFileOverview();
        boolean boolean43 = jSDocInfo40.shouldPreserveTry();
        java.util.Set<java.lang.String> strSet44 = jSDocInfo40.getParameterNames();
        boolean boolean45 = strSet32.retainAll((java.util.Collection<java.lang.String>) strSet44);
        java.util.stream.Stream<java.lang.String> strStream46 = strSet32.stream();
        node21.setDirectives((java.util.Set<java.lang.String>) strSet32);
        boolean boolean48 = node21.isFor();
        com.google.javascript.rhino.Node node49 = node14.srcref(node21);
        int int50 = node3.getIndexOfChild(node49);
        boolean boolean51 = node3.isVar();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node53 = node3.getChildAtIndex(4);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("Not declared as a type name", 47, (int) (short) 0);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        boolean boolean14 = node8.isDo();
        boolean boolean15 = node8.isDefaultCase();
        node8.setQuotedString();
        boolean boolean17 = node8.isDec();
        boolean boolean18 = node8.isTypeOf();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean23 = node22.isThrow();
        java.lang.String str27 = node22.toString(true, false, true);
        java.lang.String str28 = node22.getQualifiedName();
        boolean boolean29 = node22.isIn();
        com.google.javascript.rhino.Node node30 = node22.cloneTree();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node34.setCharno(1);
        java.util.Set<java.lang.String> strSet37 = node34.getDirectives();
        boolean boolean38 = node34.isHook();
        node30.addChildToFront(node34);
        com.google.javascript.rhino.Node node40 = node34.getLastSibling();
        java.lang.Object obj42 = node40.getProp(2);
        com.google.javascript.rhino.Node node43 = node8.useSourceInfoFrom(node40);
        node8.removeProp(10);
        com.google.javascript.rhino.Node node46 = node3.copyInformationFrom(node8);
        boolean boolean47 = node8.isSyntheticBlock();
        boolean boolean48 = node8.isTrue();
        node8.removeProp(97);
        boolean boolean51 = node8.isExprResult();
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node55.setCharno(1);
        java.util.Set<java.lang.String> strSet58 = node55.getDirectives();
        node55.setCharno((int) (short) -1);
        node55.setVarArgs(true);
        boolean boolean63 = node55.isLabel();
        boolean boolean64 = node55.isReturn();
        boolean boolean65 = node55.isComma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node8.removeChild(node55);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (byte) 10, "Named type with empty name component");
        boolean boolean4 = node3.isObjectLit();
        boolean boolean5 = node3.isTrue();
        int int6 = node3.getType();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node18 = node16.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) (byte) -1, node16, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node28 = node26.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) (byte) -1, node26, (int) (byte) 1, (int) '#');
        boolean boolean32 = node21.hasChild(node31);
        int int33 = node21.getCharno();
        com.google.javascript.rhino.Node node34 = node11.useSourceInfoIfMissingFrom(node21);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node41 = node39.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node((int) (byte) -1, node39, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node51 = node49.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node((int) (byte) -1, node49, (int) (byte) 1, (int) '#');
        boolean boolean55 = node44.hasChild(node54);
        boolean boolean56 = node54.isVar();
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node((-1), node21, node54);
        boolean boolean58 = node21.isAssignAdd();
        com.google.javascript.rhino.Node node59 = node21.removeFirstChild();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean64 = node63.isThrow();
        java.lang.String str68 = node63.toString(true, false, true);
        java.lang.String str69 = node63.getQualifiedName();
        node63.addSuppression("STRING  0");
        boolean boolean72 = node63.isNull();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder73 = node63.new FileLevelJsDocBuilder();
        node21.addChildrenToBack(node63);
        boolean boolean75 = node21.isThis();
        int int76 = node21.getCharno();
        boolean boolean77 = node3.isEquivalentTo(node21);
        com.google.javascript.rhino.Node node78 = new com.google.javascript.rhino.Node(52, node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node80 = node3.getChildAtIndex((int) (byte) 1);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node16 = node14.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) -1, node14, (int) (byte) 1, (int) '#');
        boolean boolean20 = node9.hasChild(node19);
        boolean boolean21 = node19.isVar();
        boolean boolean22 = node19.isTypeOf();
        boolean boolean23 = node19.isAssignAdd();
        boolean boolean24 = node19.isStringKey();
        node19.setOptionalArg(true);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean32 = node31.isFromExterns();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(39, node31, (int) '4', 51);
        boolean boolean36 = node31.isIn();
        boolean boolean37 = node19.isEquivalentTo(node31);
        boolean boolean38 = node19.isCase();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node49 = node47.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node((int) (byte) -1, node47, (int) (byte) 1, (int) '#');
        boolean boolean53 = node47.isScript();
        node47.setQuotedString();
        com.google.javascript.rhino.Node node55 = node42.srcrefTree(node47);
        boolean boolean56 = node47.isBreak();
        com.google.javascript.rhino.Node node57 = node19.useSourceInfoFrom(node47);
        boolean boolean58 = node57.isComma();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node60 = node57.getChildAtIndex(8224);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str2 = jSDocInfo1.getVersion();
        boolean boolean3 = jSDocInfo1.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet4 = jSDocInfo1.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList5 = jSDocInfo1.getImplementedInterfaces();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean10 = node9.isThrow();
        java.lang.String str14 = node9.toString(true, false, true);
        jSDocInfo1.setAssociatedNode(node9);
        com.google.javascript.rhino.Node node16 = node9.removeFirstChild();
        boolean boolean17 = node9.isNumber();
        boolean boolean18 = node9.isVar();
        boolean boolean19 = node9.isExprResult();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) (byte) 100);
        boolean boolean23 = node21.getBooleanProp(35);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node27.setCharno(1);
        java.util.Set<java.lang.String> strSet30 = node27.getDirectives();
        node27.setCharno((int) (short) -1);
        boolean boolean33 = node27.isRegExp();
        boolean boolean34 = node27.isDefaultCase();
        com.google.javascript.rhino.Node node35 = node27.removeChildren();
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(47, node9, node21, node27, (int) (byte) -1, 151562);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString("STRING  [quoted: 1]");
        com.google.javascript.rhino.Node node41 = node40.getFirstChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node21.removeChild(node40);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node3.setCharno(1);
        com.google.javascript.rhino.Node node6 = node3.cloneNode();
        int int7 = node3.getChildCount();
        int int8 = node3.getSideEffectFlags();
        boolean boolean9 = node3.isFor();
        boolean boolean10 = node3.isQuotedString();
        boolean boolean11 = node3.isCatch();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) 10);
        boolean boolean14 = node13.hasChildren();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node18.setCharno(1);
        java.util.Set<java.lang.String> strSet21 = node18.getDirectives();
        node18.setCharno((int) (short) -1);
        boolean boolean24 = node18.isRegExp();
        com.google.javascript.rhino.Node node25 = node18.getLastChild();
        boolean boolean26 = node18.isDec();
        node18.setLineno((int) (byte) 10);
        node18.putBooleanProp((int) (short) 10, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.replaceChild(node13, node18);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        boolean boolean10 = node4.isScript();
        node4.setQuotedString();
        java.lang.String str12 = node4.getString();
        boolean boolean13 = node4.isNoSideEffectsCall();
        boolean boolean14 = node4.isContinue();
        node4.addSuppression("STRING  [quoted: 1]");
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node27 = node25.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (byte) -1, node25, (int) (byte) 1, (int) '#');
        boolean boolean31 = node25.isScript();
        node25.setQuotedString();
        com.google.javascript.rhino.Node node33 = node20.srcrefTree(node25);
        com.google.javascript.rhino.Node node34 = node33.cloneNode();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean39 = node38.isThrow();
        java.lang.String str43 = node38.toString(true, false, true);
        java.lang.String str44 = node38.getQualifiedName();
        boolean boolean45 = node38.isIn();
        boolean boolean46 = node34.isEquivalentToTyped(node38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.removeChild(node38);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean4 = node3.isThrow();
        java.lang.String str8 = node3.toString(true, false, true);
        node3.setIsSyntheticBlock(true);
        int int11 = node3.getLength();
        boolean boolean12 = node3.isNumber();
        node3.setSourceEncodedPositionForTree(40);
        boolean boolean15 = node3.isCase();
        boolean boolean16 = node3.isNot();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(0, 2, 32);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean26 = node25.isThrow();
        java.lang.String str30 = node25.toString(true, false, true);
        node25.setIsSyntheticBlock(true);
        boolean boolean33 = node25.isTry();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean38 = node37.isThrow();
        java.lang.String str42 = node37.toString(true, false, true);
        java.lang.String str43 = node37.getQualifiedName();
        boolean boolean44 = node37.isThis();
        java.lang.String[] strArray47 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        java.lang.String[] strArray52 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        boolean boolean55 = strSet48.addAll((java.util.Collection<java.lang.String>) strList53);
        com.google.javascript.rhino.JSDocInfo jSDocInfo56 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str57 = jSDocInfo56.getVersion();
        java.lang.String str58 = jSDocInfo56.getFileOverview();
        boolean boolean59 = jSDocInfo56.shouldPreserveTry();
        java.util.Set<java.lang.String> strSet60 = jSDocInfo56.getParameterNames();
        boolean boolean61 = strSet48.retainAll((java.util.Collection<java.lang.String>) strSet60);
        java.util.stream.Stream<java.lang.String> strStream62 = strSet48.stream();
        node37.setDirectives((java.util.Set<java.lang.String>) strSet48);
        com.google.javascript.rhino.Node node64 = node25.srcref(node37);
        com.google.javascript.rhino.Node node65 = node21.clonePropsFrom(node37);
        boolean boolean66 = node21.isInc();
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node(49);
        boolean boolean69 = node68.isBlock();
        boolean boolean70 = node68.isAdd();
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node(4111, node21, node68, 50, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node74 = node3.getChildBefore(node73);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node11 = node9.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (byte) -1, node9, (int) (byte) 1, (int) '#');
        boolean boolean15 = node9.isScript();
        com.google.javascript.rhino.Node node16 = node9.detachFromParent();
        node16.setOptionalArg(false);
        boolean boolean20 = node16.getBooleanProp(31);
        com.google.javascript.rhino.Node node21 = node4.copyInformationFrom(node16);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean26 = node25.isThrow();
        boolean boolean27 = node25.isSwitch();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node34 = node32.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) -1, node32, (int) (byte) 1, (int) '#');
        boolean boolean38 = node32.isDo();
        boolean boolean39 = node32.isDefaultCase();
        node32.setQuotedString();
        boolean boolean41 = node32.isDec();
        boolean boolean42 = node32.isLabel();
        boolean boolean43 = node32.isSetterDef();
        boolean boolean44 = node32.isRegExp();
        boolean boolean45 = node32.isName();
        boolean boolean46 = node32.isVoid();
        com.google.javascript.rhino.Node node47 = node32.cloneNode();
        com.google.javascript.rhino.Node node48 = node25.useSourceInfoIfMissingFrom(node47);
        boolean boolean49 = node48.isRegExp();
        com.google.javascript.rhino.Node node50 = node21.clonePropsFrom(node48);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean55 = node54.isFromExterns();
        boolean boolean56 = node54.isAssignAdd();
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node(97, node50, node54);
        boolean boolean58 = node50.isBreak();
        node50.putIntProp((int) (short) 1, (int) (byte) 10);
        boolean boolean62 = node50.hasChildren();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition63 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int64 = namePosition63.getEndLine();
        int int65 = namePosition63.getStartLine();
        int int66 = namePosition63.getEndLine();
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString("OR 1 [length: 32]");
        namePosition63.setItem(node68);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node70 = node50.getChildBefore(node68);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean4 = node3.isThrow();
        java.lang.String str8 = node3.toString(true, false, true);
        java.lang.String str9 = node3.getQualifiedName();
        boolean boolean10 = node3.isIn();
        com.google.javascript.rhino.Node node11 = node3.cloneTree();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node15.setCharno(1);
        java.util.Set<java.lang.String> strSet18 = node15.getDirectives();
        boolean boolean19 = node15.isHook();
        node11.addChildToFront(node15);
        boolean boolean21 = node11.isNE();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = node11.getJSDocInfo();
        java.lang.String str23 = node11.getSourceFileName();
        boolean boolean24 = node11.isVoid();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable25 = node11.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node27 = node11.getChildAtIndex(208993);
    }
}

